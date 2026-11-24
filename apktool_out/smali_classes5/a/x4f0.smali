.class public final synthetic La/x4f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:La/f7u;

.field public final synthetic d:La/n4u;

.field public final synthetic e:La/vzg0;

.field public final synthetic f:La/lbu;

.field public final synthetic g:La/bzt;


# direct methods
.method public synthetic constructor <init>(La/pru;La/f7u;La/n4u;La/vzg0;La/rqt;La/lbu;La/bzt;B)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/x4f0;->a:B

    iput-object p1, p0, La/x4f0;->b:La/pru;

    iput-object p2, p0, La/x4f0;->c:La/f7u;

    iput-object p3, p0, La/x4f0;->d:La/n4u;

    iput-object p4, p0, La/x4f0;->e:La/vzg0;

    iput-object p6, p0, La/x4f0;->f:La/lbu;

    iput-object p7, p0, La/x4f0;->g:La/bzt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 76

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x4f0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/x4f0;->g:La/bzt;

    .line 6
    .line 7
    iget-object v3, v0, La/x4f0;->f:La/lbu;

    .line 8
    .line 9
    iget-object v4, v0, La/x4f0;->e:La/vzg0;

    .line 10
    .line 11
    iget-object v5, v0, La/x4f0;->d:La/n4u;

    .line 12
    .line 13
    iget-object v6, v0, La/x4f0;->c:La/f7u;

    .line 14
    .line 15
    iget-object v0, v0, La/x4f0;->b:La/pru;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v6}, La/f7u;->p()La/cne0;

    .line 25
    .line 26
    .line 27
    move-result-object v34

    .line 28
    invoke-virtual {v5}, La/n4u;->e()V

    .line 29
    .line 30
    .line 31
    sget-object v10, La/iun;->a:La/iun;

    .line 32
    .line 33
    sget-object v12, La/lun;->a:La/lun;

    .line 34
    .line 35
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v4}, La/idx;->Q(La/vzg0;)La/p1f0;

    .line 39
    .line 40
    .line 41
    move-result-object v14

    .line 42
    invoke-static {v4}, La/idx;->Q(La/vzg0;)La/p1f0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v1, v1, La/p1f0;->M:La/q7f0;

    .line 47
    .line 48
    iget-object v5, v0, La/sff0;->k:La/f3c0;

    .line 49
    .line 50
    invoke-static {v5}, La/rqt;->f(La/f3c0;)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v18

    .line 54
    invoke-virtual {v3}, La/lbu;->j()Z

    .line 55
    .line 56
    .line 57
    move-result v24

    .line 58
    iget-object v2, v2, La/bzt;->a:La/fsd;

    .line 59
    .line 60
    invoke-virtual {v2}, La/fsd;->a()La/v8d;

    .line 61
    .line 62
    .line 63
    move-result-object v25

    .line 64
    invoke-static {v4}, La/idx;->Q(La/vzg0;)La/p1f0;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-boolean v2, v2, La/p1f0;->f:Z

    .line 69
    .line 70
    new-instance v7, La/mbf0;

    .line 71
    .line 72
    const/16 v32, 0x0

    .line 73
    .line 74
    const/16 v33, 0x0

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v9, 0x1

    .line 78
    const/16 v21, 0x0

    .line 79
    .line 80
    const/16 v23, 0x0

    .line 81
    .line 82
    const/16 v26, 0x0

    .line 83
    .line 84
    const/16 v27, 0x0

    .line 85
    .line 86
    const/16 v28, 0x0

    .line 87
    .line 88
    const/16 v29, 0x0

    .line 89
    .line 90
    const/16 v30, 0x0

    .line 91
    .line 92
    const/16 v31, 0x0

    .line 93
    .line 94
    move-object v11, v10

    .line 95
    move-object v13, v10

    .line 96
    move-object v15, v12

    .line 97
    move-object/from16 v16, v12

    .line 98
    .line 99
    move-object/from16 v19, v10

    .line 100
    .line 101
    move-object/from16 v22, v10

    .line 102
    .line 103
    move-object/from16 v20, v0

    .line 104
    .line 105
    move-object/from16 v17, v1

    .line 106
    .line 107
    move/from16 v35, v2

    .line 108
    .line 109
    invoke-direct/range {v7 .. v35}, La/mbf0;-><init>(ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;La/p1f0;Ljava/util/Map;Ljava/util/Map;La/q7f0;Ljava/lang/Integer;Ljava/util/List;La/sff0;La/u0f0;Ljava/util/List;ZZLa/v8d;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;La/cne0;Z)V

    .line 110
    .line 111
    .line 112
    return-object v7

    .line 113
    :pswitch_0
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v6}, La/f7u;->p()La/cne0;

    .line 118
    .line 119
    .line 120
    move-result-object v35

    .line 121
    invoke-virtual {v5}, La/n4u;->e()V

    .line 122
    .line 123
    .line 124
    const-string v1, "ADDRESS"

    .line 125
    .line 126
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Ljava/lang/String;

    .line 131
    .line 132
    const-string v5, ""

    .line 133
    .line 134
    if-nez v1, :cond_0

    .line 135
    .line 136
    move-object/from16 v37, v5

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_0
    move-object/from16 v37, v1

    .line 140
    .line 141
    :goto_0
    const-string v1, "AGE_CONFIRMATION_CHECKBOX"

    .line 142
    .line 143
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Ljava/lang/Boolean;

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    if-eqz v1, :cond_1

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    move/from16 v38, v1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_1
    move/from16 v38, v6

    .line 160
    .line 161
    :goto_1
    const-string v1, "BONUS"

    .line 162
    .line 163
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    move-object/from16 v39, v1

    .line 168
    .line 169
    check-cast v39, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;

    .line 170
    .line 171
    const-string v1, "CITY"

    .line 172
    .line 173
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    move-object/from16 v40, v1

    .line 178
    .line 179
    check-cast v40, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;

    .line 180
    .line 181
    const-string v1, "COMMERCIAL_COMMUNICATION_CHECKBOX"

    .line 182
    .line 183
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Ljava/lang/Boolean;

    .line 188
    .line 189
    if-eqz v1, :cond_2

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    move/from16 v41, v1

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_2
    move/from16 v41, v6

    .line 199
    .line 200
    :goto_2
    const-string v1, "COUNTRY"

    .line 201
    .line 202
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    move-object/from16 v43, v1

    .line 207
    .line 208
    check-cast v43, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 209
    .line 210
    const-string v1, "CURRENCY"

    .line 211
    .line 212
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    move-object/from16 v44, v1

    .line 217
    .line 218
    check-cast v44, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 219
    .line 220
    const-string v1, "DATE"

    .line 221
    .line 222
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    move-object/from16 v45, v1

    .line 227
    .line 228
    check-cast v45, Ljava/lang/Long;

    .line 229
    .line 230
    const-string v1, "DOCUMENT_TYPE"

    .line 231
    .line 232
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    move-object/from16 v46, v1

    .line 237
    .line 238
    check-cast v46, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;

    .line 239
    .line 240
    const-string v1, "EMAIL"

    .line 241
    .line 242
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    check-cast v1, Ljava/lang/String;

    .line 247
    .line 248
    if-nez v1, :cond_3

    .line 249
    .line 250
    move-object/from16 v47, v5

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_3
    move-object/from16 v47, v1

    .line 254
    .line 255
    :goto_3
    const-string v1, "FIRST_NAME"

    .line 256
    .line 257
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, Ljava/lang/String;

    .line 262
    .line 263
    if-nez v1, :cond_4

    .line 264
    .line 265
    move-object/from16 v48, v5

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_4
    move-object/from16 v48, v1

    .line 269
    .line 270
    :goto_4
    const-string v1, "LAST_NAME"

    .line 271
    .line 272
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Ljava/lang/String;

    .line 277
    .line 278
    if-nez v1, :cond_5

    .line 279
    .line 280
    move-object/from16 v49, v5

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_5
    move-object/from16 v49, v1

    .line 284
    .line 285
    :goto_5
    const-string v1, "MIDDLE_NAME"

    .line 286
    .line 287
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, Ljava/lang/String;

    .line 292
    .line 293
    if-nez v1, :cond_6

    .line 294
    .line 295
    move-object/from16 v50, v5

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_6
    move-object/from16 v50, v1

    .line 299
    .line 300
    :goto_6
    const-string v1, "CITIZENSHIP"

    .line 301
    .line 302
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    move-object/from16 v51, v1

    .line 307
    .line 308
    check-cast v51, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 309
    .line 310
    const-string v1, "PASSPORT_NUMBER"

    .line 311
    .line 312
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Ljava/lang/String;

    .line 317
    .line 318
    if-nez v1, :cond_7

    .line 319
    .line 320
    move-object/from16 v52, v5

    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_7
    move-object/from16 v52, v1

    .line 324
    .line 325
    :goto_7
    const-string v1, "PASSWORD"

    .line 326
    .line 327
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    check-cast v1, Ljava/lang/String;

    .line 332
    .line 333
    if-nez v1, :cond_8

    .line 334
    .line 335
    move-object/from16 v53, v5

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_8
    move-object/from16 v53, v1

    .line 339
    .line 340
    :goto_8
    const-string v1, "PHONE"

    .line 341
    .line 342
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    move-object/from16 v54, v1

    .line 347
    .line 348
    check-cast v54, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;

    .line 349
    .line 350
    const-string v1, "POLITICALLY_EXPOSED_PERSON"

    .line 351
    .line 352
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    move-object/from16 v55, v1

    .line 357
    .line 358
    check-cast v55, Ljava/lang/Boolean;

    .line 359
    .line 360
    const-string v1, "POST_CODE"

    .line 361
    .line 362
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    check-cast v1, Ljava/lang/String;

    .line 367
    .line 368
    if-nez v1, :cond_9

    .line 369
    .line 370
    move-object/from16 v56, v5

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_9
    move-object/from16 v56, v1

    .line 374
    .line 375
    :goto_9
    const-string v1, "PROMO_CODE"

    .line 376
    .line 377
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    check-cast v1, Ljava/lang/String;

    .line 382
    .line 383
    if-nez v1, :cond_a

    .line 384
    .line 385
    move-object/from16 v57, v5

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :cond_a
    move-object/from16 v57, v1

    .line 389
    .line 390
    :goto_a
    const-string v1, "REGION"

    .line 391
    .line 392
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    move-object/from16 v58, v1

    .line 397
    .line 398
    check-cast v58, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;

    .line 399
    .line 400
    const-string v1, "REPEAT_PASSWORD"

    .line 401
    .line 402
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    check-cast v1, Ljava/lang/String;

    .line 407
    .line 408
    if-nez v1, :cond_b

    .line 409
    .line 410
    move-object/from16 v59, v5

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_b
    move-object/from16 v59, v1

    .line 414
    .line 415
    :goto_b
    const-string v1, "RULES_CONFIRMATION"

    .line 416
    .line 417
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    check-cast v1, Ljava/lang/Boolean;

    .line 422
    .line 423
    if-eqz v1, :cond_c

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    move/from16 v60, v1

    .line 430
    .line 431
    goto :goto_c

    .line 432
    :cond_c
    move/from16 v60, v6

    .line 433
    .line 434
    :goto_c
    const-string v1, "RULES_CONFIRMATION_ALL"

    .line 435
    .line 436
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    check-cast v1, Ljava/lang/Boolean;

    .line 441
    .line 442
    if-eqz v1, :cond_d

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    move/from16 v61, v1

    .line 449
    .line 450
    goto :goto_d

    .line 451
    :cond_d
    move/from16 v61, v6

    .line 452
    .line 453
    :goto_d
    const-string v1, "SECOND_LAST_NAME"

    .line 454
    .line 455
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    check-cast v1, Ljava/lang/String;

    .line 460
    .line 461
    if-nez v1, :cond_e

    .line 462
    .line 463
    move-object/from16 v62, v5

    .line 464
    .line 465
    goto :goto_e

    .line 466
    :cond_e
    move-object/from16 v62, v1

    .line 467
    .line 468
    :goto_e
    const-string v1, "EMAIL_BETS_CHECKBOX"

    .line 469
    .line 470
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    check-cast v1, Ljava/lang/Boolean;

    .line 475
    .line 476
    if-eqz v1, :cond_f

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    move/from16 v63, v1

    .line 483
    .line 484
    goto :goto_f

    .line 485
    :cond_f
    move/from16 v63, v6

    .line 486
    .line 487
    :goto_f
    const-string v1, "EMAIL_NEWS_CHECKBOX"

    .line 488
    .line 489
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    check-cast v1, Ljava/lang/Boolean;

    .line 494
    .line 495
    if-eqz v1, :cond_10

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    move/from16 v64, v1

    .line 502
    .line 503
    goto :goto_10

    .line 504
    :cond_10
    move/from16 v64, v6

    .line 505
    .line 506
    :goto_10
    const-string v1, "SHARE_PERSONAL_DATA_CONFIRMATION"

    .line 507
    .line 508
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    check-cast v1, Ljava/lang/Boolean;

    .line 513
    .line 514
    if-eqz v1, :cond_11

    .line 515
    .line 516
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    move/from16 v65, v1

    .line 521
    .line 522
    goto :goto_11

    .line 523
    :cond_11
    move/from16 v65, v6

    .line 524
    .line 525
    :goto_11
    const-string v1, "SOCIAL_TYPE_SELECTED"

    .line 526
    .line 527
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    move-object/from16 v66, v1

    .line 532
    .line 533
    check-cast v66, Ljava/lang/Integer;

    .line 534
    .line 535
    const-string v1, "SOCIAL"

    .line 536
    .line 537
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    move-object/from16 v67, v1

    .line 542
    .line 543
    check-cast v67, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;

    .line 544
    .line 545
    const-string v1, "PASSWORD_REQUIREMENTS_EXPANDED"

    .line 546
    .line 547
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    check-cast v1, Ljava/lang/Boolean;

    .line 552
    .line 553
    if-eqz v1, :cond_12

    .line 554
    .line 555
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    move/from16 v69, v1

    .line 560
    .line 561
    goto :goto_12

    .line 562
    :cond_12
    move/from16 v69, v6

    .line 563
    .line 564
    :goto_12
    const-string v1, "GENDER"

    .line 565
    .line 566
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    move-object/from16 v68, v1

    .line 571
    .line 572
    check-cast v68, Ljava/lang/Integer;

    .line 573
    .line 574
    const-string v1, "PASSPORT_DATE_ISSUE"

    .line 575
    .line 576
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    move-object/from16 v72, v1

    .line 581
    .line 582
    check-cast v72, Ljava/lang/Long;

    .line 583
    .line 584
    const-string v1, "PASSPORT_DATE_EXPIRE"

    .line 585
    .line 586
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    move-object/from16 v71, v1

    .line 591
    .line 592
    check-cast v71, Ljava/lang/Long;

    .line 593
    .line 594
    const-string v1, "NOTIFY_NEWS_CALL_SETTINGS"

    .line 595
    .line 596
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    check-cast v1, Ljava/lang/Boolean;

    .line 601
    .line 602
    if-eqz v1, :cond_13

    .line 603
    .line 604
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    :goto_13
    move/from16 v36, v1

    .line 609
    .line 610
    goto :goto_14

    .line 611
    :cond_13
    const/4 v1, 0x1

    .line 612
    goto :goto_13

    .line 613
    :goto_14
    const-string v1, "SOCIAL_BLOCK_EXPAND"

    .line 614
    .line 615
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    check-cast v1, Ljava/lang/Boolean;

    .line 620
    .line 621
    if-eqz v1, :cond_14

    .line 622
    .line 623
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    move/from16 v73, v1

    .line 628
    .line 629
    goto :goto_15

    .line 630
    :cond_14
    move/from16 v73, v6

    .line 631
    .line 632
    :goto_15
    const-string v1, "SEND_SMS_EVENTS"

    .line 633
    .line 634
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    check-cast v1, Ljava/lang/Boolean;

    .line 639
    .line 640
    if-eqz v1, :cond_15

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 643
    .line 644
    .line 645
    move-result v6

    .line 646
    :cond_15
    move/from16 v74, v6

    .line 647
    .line 648
    const-string v1, "REGISTRATION_TYPE"

    .line 649
    .line 650
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    move-object/from16 v18, v1

    .line 655
    .line 656
    check-cast v18, La/q7f0;

    .line 657
    .line 658
    const-string v1, "BONUS_LIST"

    .line 659
    .line 660
    invoke-virtual {v4, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    check-cast v1, Ljava/util/List;

    .line 665
    .line 666
    if-nez v1, :cond_16

    .line 667
    .line 668
    sget-object v1, La/iun;->a:La/iun;

    .line 669
    .line 670
    :cond_16
    move-object/from16 v70, v1

    .line 671
    .line 672
    new-instance v15, La/r1f0;

    .line 673
    .line 674
    move-object/from16 v75, v18

    .line 675
    .line 676
    move/from16 v42, v36

    .line 677
    .line 678
    move-object/from16 v36, v15

    .line 679
    .line 680
    invoke-direct/range {v36 .. v75}, La/r1f0;-><init>(Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;)V

    .line 681
    .line 682
    .line 683
    move/from16 v36, v42

    .line 684
    .line 685
    sget-object v11, La/iun;->a:La/iun;

    .line 686
    .line 687
    sget-object v13, La/lun;->a:La/lun;

    .line 688
    .line 689
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    iget-object v1, v0, La/sff0;->k:La/f3c0;

    .line 693
    .line 694
    invoke-static {v1}, La/rqt;->f(La/f3c0;)Ljava/lang/Integer;

    .line 695
    .line 696
    .line 697
    move-result-object v19

    .line 698
    invoke-virtual {v3}, La/lbu;->j()Z

    .line 699
    .line 700
    .line 701
    move-result v25

    .line 702
    iget-object v1, v2, La/bzt;->a:La/fsd;

    .line 703
    .line 704
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 705
    .line 706
    .line 707
    move-result-object v26

    .line 708
    new-instance v8, La/u4f0;

    .line 709
    .line 710
    const/16 v33, 0x0

    .line 711
    .line 712
    const/16 v34, 0x0

    .line 713
    .line 714
    const/4 v9, 0x0

    .line 715
    const/4 v10, 0x1

    .line 716
    const/16 v22, 0x1

    .line 717
    .line 718
    const/16 v24, 0x0

    .line 719
    .line 720
    const/16 v27, 0x0

    .line 721
    .line 722
    const/16 v28, 0x0

    .line 723
    .line 724
    const/16 v29, 0x0

    .line 725
    .line 726
    const/16 v30, 0x0

    .line 727
    .line 728
    const/16 v31, 0x0

    .line 729
    .line 730
    const/16 v32, 0x0

    .line 731
    .line 732
    move-object v12, v11

    .line 733
    move-object v14, v11

    .line 734
    move-object/from16 v16, v13

    .line 735
    .line 736
    move-object/from16 v17, v13

    .line 737
    .line 738
    move-object/from16 v20, v11

    .line 739
    .line 740
    move-object/from16 v23, v11

    .line 741
    .line 742
    move-object/from16 v21, v0

    .line 743
    .line 744
    invoke-direct/range {v8 .. v36}, La/u4f0;-><init>(ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;La/r1f0;Ljava/util/Map;Ljava/util/Map;La/q7f0;Ljava/lang/Integer;Ljava/util/List;La/sff0;ZLjava/util/List;ZZLa/v8d;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;La/cne0;Z)V

    .line 745
    .line 746
    .line 747
    return-object v8

    .line 748
    nop

    .line 749
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
