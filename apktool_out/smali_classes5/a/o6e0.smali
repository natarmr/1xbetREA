.class public final synthetic La/o6e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/o6e0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/o6e0;->a:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, La/zw3;

    .line 12
    .line 13
    sget-object v1, La/g1f0;->a:La/g1f0;

    .line 14
    .line 15
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/zw3;

    .line 20
    .line 21
    sget-object v1, La/r0f0;->a:La/r0f0;

    .line 22
    .line 23
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_1
    invoke-static {}, La/w0f0;->values()[La/w0f0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v36, "PassportDateExpire"

    .line 32
    .line 33
    const-string v37, "MediaSourceId"

    .line 34
    .line 35
    const-string v1, "Surname"

    .line 36
    .line 37
    const-string v2, "SurnameTwo"

    .line 38
    .line 39
    const-string v3, "Name"

    .line 40
    .line 41
    const-string v4, "CountryId"

    .line 42
    .line 43
    const-string v5, "RegionId"

    .line 44
    .line 45
    const-string v6, "CityId"

    .line 46
    .line 47
    const-string v7, "Birthday"

    .line 48
    .line 49
    const-string v8, "Phone"

    .line 50
    .line 51
    const-string v9, "CurrencyId"

    .line 52
    .line 53
    const-string v10, "SocialNetId"

    .line 54
    .line 55
    const-string v11, "Email"

    .line 56
    .line 57
    const-string v12, "Password"

    .line 58
    .line 59
    const-string v13, "RepeatPassword"

    .line 60
    .line 61
    const-string v14, "Nationality"

    .line 62
    .line 63
    const-string v15, "VidDoc"

    .line 64
    .line 65
    const-string v16, "PassportNumber"

    .line 66
    .line 67
    const-string v17, "Sex"

    .line 68
    .line 69
    const-string v18, "Address"

    .line 70
    .line 71
    const-string v19, "Postcode"

    .line 72
    .line 73
    const-string v20, "PromoCode"

    .line 74
    .line 75
    const-string v21, "FirstBonusChoice"

    .line 76
    .line 77
    const-string v22, "SendEmailEvents"

    .line 78
    .line 79
    const-string v23, "SendEmailBet"

    .line 80
    .line 81
    const-string v24, "SendSmsEvents"

    .line 82
    .line 83
    const-string v25, "SendSmsBet"

    .line 84
    .line 85
    const-string v26, "NotifyNewsCall"

    .line 86
    .line 87
    const-string v27, "CommercialCommunicationSettings"

    .line 88
    .line 89
    const-string v28, "SharePersonalDataConfirmation"

    .line 90
    .line 91
    const-string v29, "RulesConfirmation"

    .line 92
    .line 93
    const-string v30, "RulesConfirmationAll"

    .line 94
    .line 95
    const-string v31, "FiscalAuthority"

    .line 96
    .line 97
    const-string v32, "MiddleName"

    .line 98
    .line 99
    const-string v33, "IsPoliticallyExposedPerson"

    .line 100
    .line 101
    const-string v34, "AppsflyerId"

    .line 102
    .line 103
    const-string v35, "PassportDt"

    .line 104
    .line 105
    filled-new-array/range {v1 .. v37}, [Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const/16 v37, 0x0

    .line 110
    .line 111
    const/16 v38, 0x0

    .line 112
    .line 113
    const/4 v2, 0x0

    .line 114
    const/4 v3, 0x0

    .line 115
    const/4 v4, 0x0

    .line 116
    const/4 v5, 0x0

    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v9, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    const/4 v11, 0x0

    .line 123
    const/4 v12, 0x0

    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    const/16 v18, 0x0

    .line 132
    .line 133
    const/16 v19, 0x0

    .line 134
    .line 135
    const/16 v20, 0x0

    .line 136
    .line 137
    const/16 v21, 0x0

    .line 138
    .line 139
    const/16 v22, 0x0

    .line 140
    .line 141
    const/16 v23, 0x0

    .line 142
    .line 143
    const/16 v24, 0x0

    .line 144
    .line 145
    const/16 v25, 0x0

    .line 146
    .line 147
    const/16 v26, 0x0

    .line 148
    .line 149
    const/16 v27, 0x0

    .line 150
    .line 151
    const/16 v28, 0x0

    .line 152
    .line 153
    const/16 v29, 0x0

    .line 154
    .line 155
    const/16 v30, 0x0

    .line 156
    .line 157
    const/16 v31, 0x0

    .line 158
    .line 159
    const/16 v32, 0x0

    .line 160
    .line 161
    const/16 v33, 0x0

    .line 162
    .line 163
    const/16 v34, 0x0

    .line 164
    .line 165
    const/16 v35, 0x0

    .line 166
    .line 167
    const/16 v36, 0x0

    .line 168
    .line 169
    filled-new-array/range {v2 .. v38}, [[Ljava/lang/annotation/Annotation;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const-string v3, "org.xplatform.registration.core.data.models.RegistrationFieldTypeResponse"

    .line 174
    .line 175
    invoke-static {v3, v0, v1, v2}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0

    .line 180
    :pswitch_2
    sget-object v0, La/w0f0;->Companion:La/v0f0;

    .line 181
    .line 182
    invoke-virtual {v0}, La/v0f0;->serializer()La/jiy;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0

    .line 187
    :pswitch_3
    invoke-static {}, La/uue0;->values()[La/uue0;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v1, La/g0o;

    .line 195
    .line 196
    const-string v2, "org.xplatform.onexuser.domain.registration.RegistrationChoiceType"

    .line 197
    .line 198
    invoke-direct {v1, v2, v0}, La/g0o;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 199
    .line 200
    .line 201
    return-object v1

    .line 202
    :pswitch_4
    sget-object v0, La/uue0;->Companion:La/tue0;

    .line 203
    .line 204
    invoke-virtual {v0}, La/tue0;->serializer()La/jiy;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    return-object v0

    .line 209
    :pswitch_5
    new-instance v0, La/zw3;

    .line 210
    .line 211
    sget-object v1, La/tse0;->a:La/tse0;

    .line 212
    .line 213
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 214
    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_6
    new-instance v0, La/zw3;

    .line 218
    .line 219
    sget-object v1, La/ape0;->a:La/ape0;

    .line 220
    .line 221
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 222
    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_7
    new-instance v0, La/qme0;

    .line 226
    .line 227
    sget-object v1, La/iun;->a:La/iun;

    .line 228
    .line 229
    invoke-direct {v0, v1}, La/qme0;-><init>(Ljava/util/List;)V

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_8
    new-instance v0, La/yle0;

    .line 234
    .line 235
    invoke-direct {v0, v2, v3, v3, v1}, La/yle0;-><init>(ZZZLa/rle0;)V

    .line 236
    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_a
    new-instance v0, La/zw3;

    .line 243
    .line 244
    sget-object v1, La/ole0;->a:La/ole0;

    .line 245
    .line 246
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :pswitch_b
    new-instance v0, La/zw3;

    .line 251
    .line 252
    sget-object v1, La/o9a0;->a:La/o9a0;

    .line 253
    .line 254
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 255
    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_c
    new-instance v0, La/ike0;

    .line 259
    .line 260
    invoke-direct {v0, v2, v3, v1}, La/ike0;-><init>(ZZLa/qje0;)V

    .line 261
    .line 262
    .line 263
    return-object v0

    .line 264
    :pswitch_d
    new-instance v0, La/zw3;

    .line 265
    .line 266
    sget-object v1, La/nje0;->a:La/nje0;

    .line 267
    .line 268
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 269
    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_e
    new-instance v0, La/zw3;

    .line 273
    .line 274
    sget-object v1, La/o9a0;->a:La/o9a0;

    .line 275
    .line 276
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 277
    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_f
    new-instance v0, La/zw3;

    .line 281
    .line 282
    sget-object v1, La/whp0;->a:La/whp0;

    .line 283
    .line 284
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 285
    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_10
    new-instance v0, La/dje0;

    .line 289
    .line 290
    sget-object v1, La/iun;->a:La/iun;

    .line 291
    .line 292
    invoke-direct {v0, v1, v2, v3}, La/dje0;-><init>(Ljava/util/List;ZZ)V

    .line 293
    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_11
    new-instance v0, La/zw3;

    .line 297
    .line 298
    sget-object v1, La/vhp0;->a:La/vhp0;

    .line 299
    .line 300
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 301
    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_12
    new-instance v0, La/zw3;

    .line 305
    .line 306
    sget-object v1, La/kip0;->a:La/kip0;

    .line 307
    .line 308
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 309
    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_13
    new-instance v0, La/zw3;

    .line 313
    .line 314
    sget-object v1, La/n9a0;->a:La/n9a0;

    .line 315
    .line 316
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 317
    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_14
    sget-object v0, La/wfe0;->L:Ljava/lang/String;

    .line 321
    .line 322
    sget-object v0, La/ab0;->a:La/ab0;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_15
    sget-object v0, La/iii0;->b:La/n0o0;

    .line 326
    .line 327
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    check-cast v0, Ljava/util/List;

    .line 332
    .line 333
    new-instance v1, La/lk30;

    .line 334
    .line 335
    const/16 v2, 0x19

    .line 336
    .line 337
    invoke-direct {v1, v2}, La/lk30;-><init>(B)V

    .line 338
    .line 339
    .line 340
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    new-instance v1, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    :goto_0
    if-ge v3, v2, :cond_0

    .line 354
    .line 355
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    check-cast v4, La/nnn0;

    .line 360
    .line 361
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    new-instance v4, La/q8m0;

    .line 365
    .line 366
    invoke-direct {v4}, La/q8m0;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    add-int/lit8 v3, v3, 0x1

    .line 373
    .line 374
    goto :goto_0

    .line 375
    :cond_0
    return-object v1

    .line 376
    :pswitch_16
    sget-object v0, La/iii0;->a:La/n0o0;

    .line 377
    .line 378
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Ljava/util/List;

    .line 383
    .line 384
    new-instance v1, La/lk30;

    .line 385
    .line 386
    const/16 v2, 0x18

    .line 387
    .line 388
    invoke-direct {v1, v2}, La/lk30;-><init>(B)V

    .line 389
    .line 390
    .line 391
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    new-instance v1, Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    :goto_1
    if-ge v3, v2, :cond_1

    .line 405
    .line 406
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    check-cast v4, La/lf60;

    .line 411
    .line 412
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    new-instance v4, La/uk50;

    .line 416
    .line 417
    new-instance v5, La/th50;

    .line 418
    .line 419
    const/16 v6, 0x14

    .line 420
    .line 421
    invoke-direct {v5, v6}, La/th50;-><init>(B)V

    .line 422
    .line 423
    .line 424
    invoke-direct {v4, v5}, La/uk50;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 425
    .line 426
    .line 427
    const-class v5, La/aot0;

    .line 428
    .line 429
    sget-object v6, La/sre0;->a:La/tre0;

    .line 430
    .line 431
    invoke-virtual {v6, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    new-instance v6, Lkotlin/Pair;

    .line 436
    .line 437
    invoke-direct {v6, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    add-int/lit8 v3, v3, 0x1

    .line 444
    .line 445
    goto :goto_1

    .line 446
    :cond_1
    return-object v1

    .line 447
    :pswitch_17
    new-instance v0, La/zw3;

    .line 448
    .line 449
    new-instance v1, La/zw3;

    .line 450
    .line 451
    sget-object v2, La/p6e0;->a:La/p6e0;

    .line 452
    .line 453
    invoke-direct {v1, v2, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 454
    .line 455
    .line 456
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 457
    .line 458
    .line 459
    return-object v0

    .line 460
    :pswitch_18
    new-instance v0, La/zw3;

    .line 461
    .line 462
    sget-object v1, La/m8e0;->a:La/m8e0;

    .line 463
    .line 464
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 465
    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_19
    new-instance v0, La/zw3;

    .line 469
    .line 470
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 471
    .line 472
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 473
    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_1a
    new-instance v0, La/zw3;

    .line 477
    .line 478
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 479
    .line 480
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 481
    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_1b
    new-instance v0, La/zw3;

    .line 485
    .line 486
    sget-object v1, La/y8e0;->a:La/y8e0;

    .line 487
    .line 488
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 489
    .line 490
    .line 491
    return-object v0

    .line 492
    :pswitch_1c
    new-instance v0, La/zw3;

    .line 493
    .line 494
    sget-object v1, La/m9e0;->a:La/m9e0;

    .line 495
    .line 496
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 497
    .line 498
    .line 499
    return-object v0

    .line 500
    nop

    .line 501
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
