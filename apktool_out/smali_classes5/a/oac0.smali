.class public final synthetic La/oac0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oac0;->a:B

    iput-object p1, p0, La/oac0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/oac0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/oac0;->a:B

    .line 6
    .line 7
    const/16 v3, 0x11

    .line 8
    .line 9
    const v4, 0x799532c4

    .line 10
    .line 11
    .line 12
    const/16 v5, 0x14

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    const/16 v7, 0xa

    .line 16
    .line 17
    const v8, 0x2fd4df92

    .line 18
    .line 19
    .line 20
    const/4 v9, 0x3

    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v12, 0x1

    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, La/jkc;

    .line 30
    .line 31
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, La/dq00;

    .line 34
    .line 35
    check-cast v1, La/aye0;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v13, v1, La/aye0;->h:La/q1f0;

    .line 41
    .line 42
    new-instance v3, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;

    .line 43
    .line 44
    iget v4, v2, La/jkc;->a:I

    .line 45
    .line 46
    iget-object v2, v2, La/jkc;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {v3, v2, v4, v12}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 49
    .line 50
    .line 51
    const/16 v53, -0x4001

    .line 52
    .line 53
    const/16 v54, 0x7f

    .line 54
    .line 55
    const/4 v14, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    const/16 v18, 0x0

    .line 62
    .line 63
    const/16 v19, 0x0

    .line 64
    .line 65
    const/16 v20, 0x0

    .line 66
    .line 67
    const/16 v21, 0x0

    .line 68
    .line 69
    const/16 v22, 0x0

    .line 70
    .line 71
    const/16 v23, 0x0

    .line 72
    .line 73
    const/16 v24, 0x0

    .line 74
    .line 75
    const/16 v25, 0x0

    .line 76
    .line 77
    const/16 v26, 0x0

    .line 78
    .line 79
    const/16 v27, 0x0

    .line 80
    .line 81
    const/16 v29, 0x0

    .line 82
    .line 83
    const/16 v30, 0x0

    .line 84
    .line 85
    const/16 v31, 0x0

    .line 86
    .line 87
    const/16 v32, 0x0

    .line 88
    .line 89
    const/16 v33, 0x0

    .line 90
    .line 91
    const/16 v34, 0x0

    .line 92
    .line 93
    const/16 v35, 0x0

    .line 94
    .line 95
    const/16 v36, 0x0

    .line 96
    .line 97
    const/16 v37, 0x0

    .line 98
    .line 99
    const/16 v38, 0x0

    .line 100
    .line 101
    const/16 v39, 0x0

    .line 102
    .line 103
    const/16 v40, 0x0

    .line 104
    .line 105
    const/16 v41, 0x0

    .line 106
    .line 107
    const/16 v42, 0x0

    .line 108
    .line 109
    const/16 v43, 0x0

    .line 110
    .line 111
    const/16 v44, 0x0

    .line 112
    .line 113
    const/16 v45, 0x0

    .line 114
    .line 115
    const/16 v46, 0x0

    .line 116
    .line 117
    const/16 v47, 0x0

    .line 118
    .line 119
    const/16 v48, 0x0

    .line 120
    .line 121
    const/16 v49, 0x0

    .line 122
    .line 123
    const/16 v50, 0x0

    .line 124
    .line 125
    const/16 v51, 0x0

    .line 126
    .line 127
    const/16 v52, 0x0

    .line 128
    .line 129
    move-object/from16 v28, v3

    .line 130
    .line 131
    invoke-static/range {v13 .. v54}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    sget-object v3, La/u0f0;->o:La/u0f0;

    .line 136
    .line 137
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v3}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v0, v0, La/dq00;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, La/vzg0;

    .line 151
    .line 152
    const-string v3, "CITIZENSHIP"

    .line 153
    .line 154
    iget-object v4, v2, La/q1f0;->o:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;

    .line 155
    .line 156
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance v0, Lkotlin/Pair;

    .line 160
    .line 161
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_0
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 166
    .line 167
    move-object/from16 v34, v2

    .line 168
    .line 169
    check-cast v34, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;

    .line 170
    .line 171
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, La/dq00;

    .line 174
    .line 175
    check-cast v1, La/aye0;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    iget-object v3, v1, La/aye0;->h:La/q1f0;

    .line 181
    .line 182
    const v43, -0x40000001    # -1.9999999f

    .line 183
    .line 184
    .line 185
    const/16 v44, 0x7f

    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    const/4 v5, 0x0

    .line 189
    const/4 v6, 0x0

    .line 190
    const/4 v7, 0x0

    .line 191
    const/4 v8, 0x0

    .line 192
    const/4 v9, 0x0

    .line 193
    const/4 v10, 0x0

    .line 194
    const/4 v11, 0x0

    .line 195
    const/4 v12, 0x0

    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    const/4 v15, 0x0

    .line 199
    const/16 v16, 0x0

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    const/16 v18, 0x0

    .line 204
    .line 205
    const/16 v19, 0x0

    .line 206
    .line 207
    const/16 v20, 0x0

    .line 208
    .line 209
    const/16 v21, 0x0

    .line 210
    .line 211
    const/16 v22, 0x0

    .line 212
    .line 213
    const/16 v23, 0x0

    .line 214
    .line 215
    const/16 v24, 0x0

    .line 216
    .line 217
    const/16 v25, 0x0

    .line 218
    .line 219
    const/16 v26, 0x0

    .line 220
    .line 221
    const/16 v27, 0x0

    .line 222
    .line 223
    const/16 v28, 0x0

    .line 224
    .line 225
    const/16 v29, 0x0

    .line 226
    .line 227
    const/16 v30, 0x0

    .line 228
    .line 229
    const/16 v31, 0x0

    .line 230
    .line 231
    const/16 v32, 0x0

    .line 232
    .line 233
    const/16 v33, 0x0

    .line 234
    .line 235
    const/16 v35, 0x0

    .line 236
    .line 237
    const/16 v36, 0x0

    .line 238
    .line 239
    const/16 v37, 0x0

    .line 240
    .line 241
    const/16 v38, 0x0

    .line 242
    .line 243
    const/16 v39, 0x0

    .line 244
    .line 245
    const/16 v40, 0x0

    .line 246
    .line 247
    const/16 v41, 0x0

    .line 248
    .line 249
    const/16 v42, 0x0

    .line 250
    .line 251
    invoke-static/range {v3 .. v44}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    sget-object v3, La/u0f0;->j:La/u0f0;

    .line 256
    .line 257
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {v1, v3}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget-object v0, v0, La/dq00;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, La/vzg0;

    .line 271
    .line 272
    const-string v3, "SOCIAL"

    .line 273
    .line 274
    iget-object v4, v2, La/q1f0;->E:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;

    .line 275
    .line 276
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    new-instance v0, Lkotlin/Pair;

    .line 280
    .line 281
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_1
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v2, La/nq90;

    .line 288
    .line 289
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 290
    .line 291
    move-object v3, v0

    .line 292
    check-cast v3, La/dq00;

    .line 293
    .line 294
    iget-object v0, v3, La/dq00;->b:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, La/vzg0;

    .line 297
    .line 298
    move-object v4, v1

    .line 299
    check-cast v4, La/aye0;

    .line 300
    .line 301
    const-string v1, "CITY"

    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    iget-object v12, v4, La/aye0;->h:La/q1f0;

    .line 307
    .line 308
    instance-of v5, v2, La/eq90;

    .line 309
    .line 310
    if-eqz v5, :cond_0

    .line 311
    .line 312
    check-cast v2, La/eq90;

    .line 313
    .line 314
    new-instance v1, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;

    .line 315
    .line 316
    iget v3, v2, La/eq90;->a:I

    .line 317
    .line 318
    iget-object v2, v2, La/eq90;->b:Ljava/lang/String;

    .line 319
    .line 320
    invoke-direct {v1, v2, v3, v11}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 321
    .line 322
    .line 323
    const/16 v52, -0x4201

    .line 324
    .line 325
    const/16 v53, 0x7f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const/4 v14, 0x0

    .line 329
    const/4 v15, 0x0

    .line 330
    const/16 v16, 0x0

    .line 331
    .line 332
    const/16 v17, 0x0

    .line 333
    .line 334
    const/16 v18, 0x0

    .line 335
    .line 336
    const/16 v19, 0x0

    .line 337
    .line 338
    const/16 v20, 0x0

    .line 339
    .line 340
    const/16 v21, 0x0

    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const/16 v23, 0x0

    .line 345
    .line 346
    const/16 v24, 0x0

    .line 347
    .line 348
    const/16 v25, 0x0

    .line 349
    .line 350
    const/16 v26, 0x0

    .line 351
    .line 352
    const/16 v28, 0x0

    .line 353
    .line 354
    const/16 v29, 0x0

    .line 355
    .line 356
    const/16 v30, 0x0

    .line 357
    .line 358
    const/16 v31, 0x0

    .line 359
    .line 360
    const/16 v32, 0x0

    .line 361
    .line 362
    const/16 v33, 0x0

    .line 363
    .line 364
    const/16 v34, 0x0

    .line 365
    .line 366
    const/16 v35, 0x0

    .line 367
    .line 368
    const/16 v36, 0x0

    .line 369
    .line 370
    const/16 v37, 0x0

    .line 371
    .line 372
    const/16 v38, 0x0

    .line 373
    .line 374
    const/16 v39, 0x0

    .line 375
    .line 376
    const/16 v40, 0x0

    .line 377
    .line 378
    const/16 v41, 0x0

    .line 379
    .line 380
    const/16 v42, 0x0

    .line 381
    .line 382
    const/16 v43, 0x0

    .line 383
    .line 384
    const/16 v44, 0x0

    .line 385
    .line 386
    const/16 v45, 0x0

    .line 387
    .line 388
    const/16 v46, 0x0

    .line 389
    .line 390
    const/16 v47, 0x0

    .line 391
    .line 392
    const/16 v48, 0x0

    .line 393
    .line 394
    const/16 v49, 0x0

    .line 395
    .line 396
    const/16 v50, 0x0

    .line 397
    .line 398
    const/16 v51, 0x0

    .line 399
    .line 400
    move-object/from16 v27, v1

    .line 401
    .line 402
    invoke-static/range {v12 .. v53}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    sget-object v2, La/u0f0;->o:La/u0f0;

    .line 407
    .line 408
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-static {v4, v2}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    const-string v3, "CITIZENSHIP"

    .line 417
    .line 418
    iget-object v4, v1, La/q1f0;->o:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;

    .line 419
    .line 420
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    new-instance v0, Lkotlin/Pair;

    .line 424
    .line 425
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_0

    .line 429
    .line 430
    :cond_0
    instance-of v5, v2, La/fq90;

    .line 431
    .line 432
    if-eqz v5, :cond_1

    .line 433
    .line 434
    check-cast v2, La/fq90;

    .line 435
    .line 436
    new-instance v3, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;

    .line 437
    .line 438
    iget v5, v2, La/fq90;->a:I

    .line 439
    .line 440
    iget-object v2, v2, La/fq90;->c:Ljava/lang/String;

    .line 441
    .line 442
    invoke-direct {v3, v5, v2}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;-><init>(ILjava/lang/String;)V

    .line 443
    .line 444
    .line 445
    const/16 v52, -0x9

    .line 446
    .line 447
    const/16 v53, 0x7f

    .line 448
    .line 449
    const/4 v13, 0x0

    .line 450
    const/4 v14, 0x0

    .line 451
    const/4 v15, 0x0

    .line 452
    const/16 v17, 0x0

    .line 453
    .line 454
    const/16 v18, 0x0

    .line 455
    .line 456
    const/16 v19, 0x0

    .line 457
    .line 458
    const/16 v20, 0x0

    .line 459
    .line 460
    const/16 v21, 0x0

    .line 461
    .line 462
    const/16 v22, 0x0

    .line 463
    .line 464
    const/16 v23, 0x0

    .line 465
    .line 466
    const/16 v24, 0x0

    .line 467
    .line 468
    const/16 v25, 0x0

    .line 469
    .line 470
    const/16 v26, 0x0

    .line 471
    .line 472
    const/16 v27, 0x0

    .line 473
    .line 474
    const/16 v28, 0x0

    .line 475
    .line 476
    const/16 v29, 0x0

    .line 477
    .line 478
    const/16 v30, 0x0

    .line 479
    .line 480
    const/16 v31, 0x0

    .line 481
    .line 482
    const/16 v32, 0x0

    .line 483
    .line 484
    const/16 v33, 0x0

    .line 485
    .line 486
    const/16 v34, 0x0

    .line 487
    .line 488
    const/16 v35, 0x0

    .line 489
    .line 490
    const/16 v36, 0x0

    .line 491
    .line 492
    const/16 v37, 0x0

    .line 493
    .line 494
    const/16 v38, 0x0

    .line 495
    .line 496
    const/16 v39, 0x0

    .line 497
    .line 498
    const/16 v40, 0x0

    .line 499
    .line 500
    const/16 v41, 0x0

    .line 501
    .line 502
    const/16 v42, 0x0

    .line 503
    .line 504
    const/16 v43, 0x0

    .line 505
    .line 506
    const/16 v44, 0x0

    .line 507
    .line 508
    const/16 v45, 0x0

    .line 509
    .line 510
    const/16 v46, 0x0

    .line 511
    .line 512
    const/16 v47, 0x0

    .line 513
    .line 514
    const/16 v48, 0x0

    .line 515
    .line 516
    const/16 v49, 0x0

    .line 517
    .line 518
    const/16 v50, 0x0

    .line 519
    .line 520
    const/16 v51, 0x0

    .line 521
    .line 522
    move-object/from16 v16, v3

    .line 523
    .line 524
    invoke-static/range {v12 .. v53}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    sget-object v3, La/u0f0;->f:La/u0f0;

    .line 529
    .line 530
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    invoke-static {v4, v3}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    iget-object v4, v2, La/q1f0;->d:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;

    .line 539
    .line 540
    invoke-virtual {v0, v1, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    new-instance v0, Lkotlin/Pair;

    .line 544
    .line 545
    invoke-direct {v0, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    goto/16 :goto_0

    .line 549
    .line 550
    :cond_1
    instance-of v5, v2, La/gq90;

    .line 551
    .line 552
    if-eqz v5, :cond_2

    .line 553
    .line 554
    check-cast v2, La/gq90;

    .line 555
    .line 556
    new-instance v5, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 557
    .line 558
    iget v6, v2, La/gq90;->a:I

    .line 559
    .line 560
    iget-object v9, v2, La/gq90;->c:Ljava/lang/String;

    .line 561
    .line 562
    iget-object v10, v2, La/gq90;->e:Ljava/lang/String;

    .line 563
    .line 564
    iget-wide v7, v2, La/gq90;->d:J

    .line 565
    .line 566
    iget-object v11, v2, La/gq90;->h:Ljava/lang/String;

    .line 567
    .line 568
    invoke-direct/range {v5 .. v11}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    iget-object v6, v2, La/gq90;->f:Ljava/lang/String;

    .line 572
    .line 573
    iget-object v0, v2, La/gq90;->g:La/cm90;

    .line 574
    .line 575
    iget-object v7, v0, La/cm90;->d:Ljava/lang/String;

    .line 576
    .line 577
    iget v0, v0, La/cm90;->c:I

    .line 578
    .line 579
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object v8

    .line 583
    sget-object v0, La/u0f0;->d:La/u0f0;

    .line 584
    .line 585
    sget-object v1, La/u0f0;->h:La/u0f0;

    .line 586
    .line 587
    filled-new-array {v0, v1}, [La/u0f0;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v9

    .line 595
    invoke-virtual/range {v3 .. v9}, La/dq00;->c(La/aye0;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lkotlin/Pair;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    goto/16 :goto_0

    .line 600
    .line 601
    :cond_2
    instance-of v5, v2, La/hq90;

    .line 602
    .line 603
    if-eqz v5, :cond_3

    .line 604
    .line 605
    check-cast v2, La/hq90;

    .line 606
    .line 607
    new-instance v1, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;

    .line 608
    .line 609
    iget v3, v2, La/hq90;->a:I

    .line 610
    .line 611
    iget-object v5, v2, La/hq90;->c:Ljava/lang/String;

    .line 612
    .line 613
    iget-object v2, v2, La/hq90;->d:Ljava/lang/String;

    .line 614
    .line 615
    invoke-direct {v1, v3, v5, v2}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    const/16 v52, -0x81

    .line 619
    .line 620
    const/16 v53, 0x7f

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const/4 v14, 0x0

    .line 624
    const/4 v15, 0x0

    .line 625
    const/16 v16, 0x0

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    const/16 v18, 0x0

    .line 630
    .line 631
    const/16 v19, 0x0

    .line 632
    .line 633
    const/16 v21, 0x0

    .line 634
    .line 635
    const/16 v22, 0x0

    .line 636
    .line 637
    const/16 v23, 0x0

    .line 638
    .line 639
    const/16 v24, 0x0

    .line 640
    .line 641
    const/16 v25, 0x0

    .line 642
    .line 643
    const/16 v26, 0x0

    .line 644
    .line 645
    const/16 v27, 0x0

    .line 646
    .line 647
    const/16 v28, 0x0

    .line 648
    .line 649
    const/16 v29, 0x0

    .line 650
    .line 651
    const/16 v30, 0x0

    .line 652
    .line 653
    const/16 v31, 0x0

    .line 654
    .line 655
    const/16 v32, 0x0

    .line 656
    .line 657
    const/16 v33, 0x0

    .line 658
    .line 659
    const/16 v34, 0x0

    .line 660
    .line 661
    const/16 v35, 0x0

    .line 662
    .line 663
    const/16 v36, 0x0

    .line 664
    .line 665
    const/16 v37, 0x0

    .line 666
    .line 667
    const/16 v38, 0x0

    .line 668
    .line 669
    const/16 v39, 0x0

    .line 670
    .line 671
    const/16 v40, 0x0

    .line 672
    .line 673
    const/16 v41, 0x0

    .line 674
    .line 675
    const/16 v42, 0x0

    .line 676
    .line 677
    const/16 v43, 0x0

    .line 678
    .line 679
    const/16 v44, 0x0

    .line 680
    .line 681
    const/16 v45, 0x0

    .line 682
    .line 683
    const/16 v46, 0x0

    .line 684
    .line 685
    const/16 v47, 0x0

    .line 686
    .line 687
    const/16 v48, 0x0

    .line 688
    .line 689
    const/16 v49, 0x0

    .line 690
    .line 691
    const/16 v50, 0x0

    .line 692
    .line 693
    const/16 v51, 0x0

    .line 694
    .line 695
    move-object/from16 v20, v1

    .line 696
    .line 697
    invoke-static/range {v12 .. v53}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    sget-object v2, La/u0f0;->i:La/u0f0;

    .line 702
    .line 703
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    invoke-static {v4, v2}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    const-string v3, "CURRENCY"

    .line 712
    .line 713
    iget-object v4, v1, La/q1f0;->h:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;

    .line 714
    .line 715
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    new-instance v0, Lkotlin/Pair;

    .line 719
    .line 720
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_0

    .line 724
    .line 725
    :cond_3
    instance-of v5, v2, La/iq90;

    .line 726
    .line 727
    if-eqz v5, :cond_4

    .line 728
    .line 729
    check-cast v2, La/iq90;

    .line 730
    .line 731
    new-instance v1, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;

    .line 732
    .line 733
    iget v3, v2, La/iq90;->a:I

    .line 734
    .line 735
    iget-object v2, v2, La/iq90;->b:Ljava/lang/String;

    .line 736
    .line 737
    invoke-direct {v1, v3, v2}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;-><init>(ILjava/lang/String;)V

    .line 738
    .line 739
    .line 740
    const/16 v52, -0x201

    .line 741
    .line 742
    const/16 v53, 0x7f

    .line 743
    .line 744
    const/4 v13, 0x0

    .line 745
    const/4 v14, 0x0

    .line 746
    const/4 v15, 0x0

    .line 747
    const/16 v16, 0x0

    .line 748
    .line 749
    const/16 v17, 0x0

    .line 750
    .line 751
    const/16 v18, 0x0

    .line 752
    .line 753
    const/16 v19, 0x0

    .line 754
    .line 755
    const/16 v20, 0x0

    .line 756
    .line 757
    const/16 v21, 0x0

    .line 758
    .line 759
    const/16 v23, 0x0

    .line 760
    .line 761
    const/16 v24, 0x0

    .line 762
    .line 763
    const/16 v25, 0x0

    .line 764
    .line 765
    const/16 v26, 0x0

    .line 766
    .line 767
    const/16 v27, 0x0

    .line 768
    .line 769
    const/16 v28, 0x0

    .line 770
    .line 771
    const/16 v29, 0x0

    .line 772
    .line 773
    const/16 v30, 0x0

    .line 774
    .line 775
    const/16 v31, 0x0

    .line 776
    .line 777
    const/16 v32, 0x0

    .line 778
    .line 779
    const/16 v33, 0x0

    .line 780
    .line 781
    const/16 v34, 0x0

    .line 782
    .line 783
    const/16 v35, 0x0

    .line 784
    .line 785
    const/16 v36, 0x0

    .line 786
    .line 787
    const/16 v37, 0x0

    .line 788
    .line 789
    const/16 v38, 0x0

    .line 790
    .line 791
    const/16 v39, 0x0

    .line 792
    .line 793
    const/16 v40, 0x0

    .line 794
    .line 795
    const/16 v41, 0x0

    .line 796
    .line 797
    const/16 v42, 0x0

    .line 798
    .line 799
    const/16 v43, 0x0

    .line 800
    .line 801
    const/16 v44, 0x0

    .line 802
    .line 803
    const/16 v45, 0x0

    .line 804
    .line 805
    const/16 v46, 0x0

    .line 806
    .line 807
    const/16 v47, 0x0

    .line 808
    .line 809
    const/16 v48, 0x0

    .line 810
    .line 811
    const/16 v49, 0x0

    .line 812
    .line 813
    const/16 v50, 0x0

    .line 814
    .line 815
    const/16 v51, 0x0

    .line 816
    .line 817
    move-object/from16 v22, v1

    .line 818
    .line 819
    invoke-static/range {v12 .. v53}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    sget-object v2, La/u0f0;->p:La/u0f0;

    .line 824
    .line 825
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    invoke-static {v4, v2}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    const-string v3, "DOCUMENT_TYPE"

    .line 834
    .line 835
    iget-object v4, v1, La/q1f0;->j:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;

    .line 836
    .line 837
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    new-instance v0, Lkotlin/Pair;

    .line 841
    .line 842
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    goto/16 :goto_0

    .line 846
    .line 847
    :cond_4
    instance-of v5, v2, La/kq90;

    .line 848
    .line 849
    if-eqz v5, :cond_5

    .line 850
    .line 851
    check-cast v2, La/kq90;

    .line 852
    .line 853
    new-instance v5, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 854
    .line 855
    iget v6, v2, La/kq90;->a:I

    .line 856
    .line 857
    iget-object v9, v2, La/kq90;->d:Ljava/lang/String;

    .line 858
    .line 859
    iget-object v10, v2, La/kq90;->f:Ljava/lang/String;

    .line 860
    .line 861
    iget-wide v7, v2, La/kq90;->e:J

    .line 862
    .line 863
    iget-object v11, v2, La/kq90;->i:Ljava/lang/String;

    .line 864
    .line 865
    invoke-direct/range {v5 .. v11}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    iget-object v6, v2, La/kq90;->g:Ljava/lang/String;

    .line 869
    .line 870
    iget-object v0, v2, La/kq90;->h:La/cm90;

    .line 871
    .line 872
    iget-object v7, v0, La/cm90;->d:Ljava/lang/String;

    .line 873
    .line 874
    iget v0, v0, La/cm90;->c:I

    .line 875
    .line 876
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 877
    .line 878
    .line 879
    move-result-object v8

    .line 880
    sget-object v0, La/u0f0;->h:La/u0f0;

    .line 881
    .line 882
    sget-object v1, La/u0f0;->d:La/u0f0;

    .line 883
    .line 884
    filled-new-array {v0, v1}, [La/u0f0;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 889
    .line 890
    .line 891
    move-result-object v9

    .line 892
    invoke-virtual/range {v3 .. v9}, La/dq00;->c(La/aye0;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lkotlin/Pair;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    goto/16 :goto_0

    .line 897
    .line 898
    :cond_5
    instance-of v3, v2, La/lq90;

    .line 899
    .line 900
    if-eqz v3, :cond_6

    .line 901
    .line 902
    check-cast v2, La/lq90;

    .line 903
    .line 904
    new-instance v3, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;

    .line 905
    .line 906
    iget v5, v2, La/lq90;->a:I

    .line 907
    .line 908
    iget-object v2, v2, La/lq90;->c:Ljava/lang/String;

    .line 909
    .line 910
    invoke-direct {v3, v5, v2}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;-><init>(ILjava/lang/String;)V

    .line 911
    .line 912
    .line 913
    const v52, -0x200009

    .line 914
    .line 915
    .line 916
    const/16 v53, 0x7f

    .line 917
    .line 918
    const/4 v13, 0x0

    .line 919
    const/4 v14, 0x0

    .line 920
    const/4 v15, 0x0

    .line 921
    const/16 v16, 0x0

    .line 922
    .line 923
    const/16 v17, 0x0

    .line 924
    .line 925
    const/16 v18, 0x0

    .line 926
    .line 927
    const/16 v19, 0x0

    .line 928
    .line 929
    const/16 v20, 0x0

    .line 930
    .line 931
    const/16 v21, 0x0

    .line 932
    .line 933
    const/16 v22, 0x0

    .line 934
    .line 935
    const/16 v23, 0x0

    .line 936
    .line 937
    const/16 v24, 0x0

    .line 938
    .line 939
    const/16 v25, 0x0

    .line 940
    .line 941
    const/16 v26, 0x0

    .line 942
    .line 943
    const/16 v27, 0x0

    .line 944
    .line 945
    const/16 v28, 0x0

    .line 946
    .line 947
    const/16 v29, 0x0

    .line 948
    .line 949
    const/16 v30, 0x0

    .line 950
    .line 951
    const/16 v31, 0x0

    .line 952
    .line 953
    const/16 v32, 0x0

    .line 954
    .line 955
    const/16 v33, 0x0

    .line 956
    .line 957
    const/16 v35, 0x0

    .line 958
    .line 959
    const/16 v36, 0x0

    .line 960
    .line 961
    const/16 v37, 0x0

    .line 962
    .line 963
    const/16 v38, 0x0

    .line 964
    .line 965
    const/16 v39, 0x0

    .line 966
    .line 967
    const/16 v40, 0x0

    .line 968
    .line 969
    const/16 v41, 0x0

    .line 970
    .line 971
    const/16 v42, 0x0

    .line 972
    .line 973
    const/16 v43, 0x0

    .line 974
    .line 975
    const/16 v44, 0x0

    .line 976
    .line 977
    const/16 v45, 0x0

    .line 978
    .line 979
    const/16 v46, 0x0

    .line 980
    .line 981
    const/16 v47, 0x0

    .line 982
    .line 983
    const/16 v48, 0x0

    .line 984
    .line 985
    const/16 v49, 0x0

    .line 986
    .line 987
    const/16 v50, 0x0

    .line 988
    .line 989
    const/16 v51, 0x0

    .line 990
    .line 991
    move-object/from16 v34, v3

    .line 992
    .line 993
    invoke-static/range {v12 .. v53}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 994
    .line 995
    .line 996
    move-result-object v2

    .line 997
    sget-object v3, La/u0f0;->e:La/u0f0;

    .line 998
    .line 999
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    invoke-static {v4, v3}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v3

    .line 1007
    const-string v4, "REGION"

    .line 1008
    .line 1009
    iget-object v5, v2, La/q1f0;->v:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;

    .line 1010
    .line 1011
    invoke-virtual {v0, v4, v5}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v0, v1, v10}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1015
    .line 1016
    .line 1017
    new-instance v0, Lkotlin/Pair;

    .line 1018
    .line 1019
    invoke-direct {v0, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1020
    .line 1021
    .line 1022
    goto :goto_0

    .line 1023
    :cond_6
    iget-object v0, v4, La/aye0;->f:Ljava/util/Map;

    .line 1024
    .line 1025
    new-instance v1, Lkotlin/Pair;

    .line 1026
    .line 1027
    invoke-direct {v1, v12, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    move-object v0, v1

    .line 1031
    :goto_0
    return-object v0

    .line 1032
    :pswitch_2
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v2, La/tme0;

    .line 1035
    .line 1036
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1039
    .line 1040
    check-cast v1, La/hcz;

    .line 1041
    .line 1042
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    check-cast v2, La/rme0;

    .line 1046
    .line 1047
    iget-object v2, v2, La/rme0;->b:La/a4x;

    .line 1048
    .line 1049
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1050
    .line 1051
    .line 1052
    move-result v3

    .line 1053
    new-instance v4, La/ubn;

    .line 1054
    .line 1055
    const/16 v5, 0x16

    .line 1056
    .line 1057
    invoke-direct {v4, v2, v5}, La/ubn;-><init>(La/a4x;B)V

    .line 1058
    .line 1059
    .line 1060
    new-instance v5, La/ws1;

    .line 1061
    .line 1062
    const/16 v6, 0x15

    .line 1063
    .line 1064
    invoke-direct {v5, v2, v0, v6}, La/ws1;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 1065
    .line 1066
    .line 1067
    new-instance v0, La/ugd;

    .line 1068
    .line 1069
    invoke-direct {v0, v8, v12, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v1, v3, v10, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1073
    .line 1074
    .line 1075
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1076
    .line 1077
    return-object v0

    .line 1078
    :pswitch_3
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v2, La/v70;

    .line 1081
    .line 1082
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1083
    .line 1084
    check-cast v0, La/ykg0;

    .line 1085
    .line 1086
    check-cast v1, Landroid/view/View;

    .line 1087
    .line 1088
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    iget-object v1, v2, La/v70;->v:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v1, La/dke0;

    .line 1094
    .line 1095
    iget-object v0, v0, La/ykg0;->c:La/ysw;

    .line 1096
    .line 1097
    iget-object v2, v0, La/ysw;->b:Ljava/lang/String;

    .line 1098
    .line 1099
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1100
    .line 1101
    .line 1102
    move-result v3

    .line 1103
    if-nez v3, :cond_7

    .line 1104
    .line 1105
    iget-object v2, v0, La/ysw;->a:Ljava/lang/String;

    .line 1106
    .line 1107
    :cond_7
    iget-object v0, v0, La/ysw;->b:Ljava/lang/String;

    .line 1108
    .line 1109
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1110
    .line 1111
    .line 1112
    move-result v0

    .line 1113
    if-lez v0, :cond_8

    .line 1114
    .line 1115
    move v11, v12

    .line 1116
    :cond_8
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    invoke-virtual {v1, v2, v0}, La/dke0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1124
    .line 1125
    return-object v0

    .line 1126
    :pswitch_4
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1127
    .line 1128
    check-cast v2, La/fge0;

    .line 1129
    .line 1130
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1131
    .line 1132
    check-cast v0, Ljava/lang/Throwable;

    .line 1133
    .line 1134
    check-cast v1, Ljava/lang/Throwable;

    .line 1135
    .line 1136
    iget-object v3, v2, La/fge0;->c:Ljava/lang/Object;

    .line 1137
    .line 1138
    monitor-enter v3

    .line 1139
    if-eqz v0, :cond_a

    .line 1140
    .line 1141
    if-eqz v1, :cond_b

    .line 1142
    .line 1143
    :try_start_0
    instance-of v4, v1, Ljava/util/concurrent/CancellationException;

    .line 1144
    .line 1145
    if-nez v4, :cond_9

    .line 1146
    .line 1147
    goto :goto_1

    .line 1148
    :cond_9
    move-object v1, v10

    .line 1149
    :goto_1
    if-eqz v1, :cond_b

    .line 1150
    .line 1151
    invoke-static {v0, v1}, La/tjo;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 1152
    .line 1153
    .line 1154
    goto :goto_2

    .line 1155
    :catchall_0
    move-exception v0

    .line 1156
    goto :goto_3

    .line 1157
    :cond_a
    move-object v0, v10

    .line 1158
    :cond_b
    :goto_2
    iput-object v0, v2, La/fge0;->e:Ljava/lang/Throwable;

    .line 1159
    .line 1160
    iget-object v0, v2, La/fge0;->u:La/p7m0;

    .line 1161
    .line 1162
    sget-object v1, La/dge0;->a:La/dge0;

    .line 1163
    .line 1164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v0, v10, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1168
    .line 1169
    .line 1170
    monitor-exit v3

    .line 1171
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1172
    .line 1173
    return-object v0

    .line 1174
    :goto_3
    monitor-exit v3

    .line 1175
    throw v0

    .line 1176
    :pswitch_5
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v2, La/tld;

    .line 1179
    .line 1180
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v0, La/iz40;

    .line 1183
    .line 1184
    invoke-virtual {v2, v1}, La/tld;->C(Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    if-eqz v0, :cond_c

    .line 1188
    .line 1189
    invoke-virtual {v0, v1}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 1190
    .line 1191
    .line 1192
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1193
    .line 1194
    return-object v0

    .line 1195
    :pswitch_6
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v2, La/u9e0;

    .line 1198
    .line 1199
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1200
    .line 1201
    check-cast v0, La/e3e0;

    .line 1202
    .line 1203
    check-cast v1, La/k0w0;

    .line 1204
    .line 1205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1206
    .line 1207
    .line 1208
    iget-object v3, v2, La/u9e0;->r:La/uxs0;

    .line 1209
    .line 1210
    new-instance v4, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 1211
    .line 1212
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v2

    .line 1216
    check-cast v2, La/o7e0;

    .line 1217
    .line 1218
    iget-object v2, v2, La/o7e0;->c:La/kgz;

    .line 1219
    .line 1220
    iget-object v0, v0, La/e3e0;->a:La/f7v0;

    .line 1221
    .line 1222
    invoke-direct {v4, v2, v0}, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;-><init>(La/kgz;La/f7v0;)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    new-instance v0, Lorg/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1;

    .line 1229
    .line 1230
    invoke-direct {v0, v4}, Lorg/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1;-><init>(Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1234
    .line 1235
    .line 1236
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1237
    .line 1238
    return-object v0

    .line 1239
    :pswitch_7
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1240
    .line 1241
    check-cast v2, La/l8d0;

    .line 1242
    .line 1243
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v0, La/l8e0;

    .line 1246
    .line 1247
    check-cast v1, La/zdm0;

    .line 1248
    .line 1249
    iget-object v2, v2, La/l8d0;->e:La/n0o0;

    .line 1250
    .line 1251
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v2

    .line 1255
    check-cast v2, La/fee;

    .line 1256
    .line 1257
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v2

    .line 1261
    check-cast v2, La/nc5;

    .line 1262
    .line 1263
    invoke-static {v2}, La/ydx;->c0(La/nc5;)La/j9m0;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    if-nez v1, :cond_d

    .line 1268
    .line 1269
    new-instance v1, La/wdm0;

    .line 1270
    .line 1271
    iget-object v0, v0, La/l8e0;->e:La/eme;

    .line 1272
    .line 1273
    invoke-direct {v1, v0}, La/wdm0;-><init>(La/eme;)V

    .line 1274
    .line 1275
    .line 1276
    :cond_d
    new-instance v0, La/g8e0;

    .line 1277
    .line 1278
    invoke-direct {v0, v2, v1}, La/g8e0;-><init>(La/j9m0;La/zdm0;)V

    .line 1279
    .line 1280
    .line 1281
    return-object v0

    .line 1282
    :pswitch_8
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1283
    .line 1284
    check-cast v2, La/p8e0;

    .line 1285
    .line 1286
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1287
    .line 1288
    check-cast v0, La/pz40;

    .line 1289
    .line 1290
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 1291
    .line 1292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1293
    .line 1294
    .line 1295
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    check-cast v0, La/v8e0;

    .line 1300
    .line 1301
    if-eqz v0, :cond_e

    .line 1302
    .line 1303
    iget-object v1, v2, La/p8e0;->d:Ljava/util/ArrayList;

    .line 1304
    .line 1305
    iget-object v3, v2, La/p8e0;->c:Ljava/util/ArrayList;

    .line 1306
    .line 1307
    iget-object v4, v2, La/p8e0;->b:Ljava/util/ArrayList;

    .line 1308
    .line 1309
    iget-object v2, v2, La/p8e0;->a:La/rhq;

    .line 1310
    .line 1311
    invoke-virtual {v0, v1, v3, v4, v2}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 1312
    .line 1313
    .line 1314
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1315
    .line 1316
    return-object v0

    .line 1317
    :pswitch_9
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1318
    .line 1319
    check-cast v2, La/y5e0;

    .line 1320
    .line 1321
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1322
    .line 1323
    check-cast v0, La/pz40;

    .line 1324
    .line 1325
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 1326
    .line 1327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1328
    .line 1329
    .line 1330
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v0

    .line 1334
    check-cast v0, La/q5e0;

    .line 1335
    .line 1336
    if-eqz v0, :cond_f

    .line 1337
    .line 1338
    iget-object v1, v2, La/y5e0;->b:La/b6e0;

    .line 1339
    .line 1340
    iget-object v2, v1, La/b6e0;->a:Ljava/util/ArrayList;

    .line 1341
    .line 1342
    iget-object v3, v1, La/b6e0;->b:Ljava/util/ArrayList;

    .line 1343
    .line 1344
    iget-object v4, v1, La/b6e0;->c:Ljava/util/List;

    .line 1345
    .line 1346
    iget-object v1, v1, La/b6e0;->d:La/w8b;

    .line 1347
    .line 1348
    invoke-virtual {v0, v2, v3, v4, v1}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 1349
    .line 1350
    .line 1351
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1352
    .line 1353
    return-object v0

    .line 1354
    :pswitch_a
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1355
    .line 1356
    check-cast v2, Landroid/content/Context;

    .line 1357
    .line 1358
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1359
    .line 1360
    move-object v3, v0

    .line 1361
    check-cast v3, La/k3t0;

    .line 1362
    .line 1363
    move-object v0, v1

    .line 1364
    check-cast v0, La/s2e0;

    .line 1365
    .line 1366
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    iget-object v0, v0, La/s2e0;->a:Ljava/lang/String;

    .line 1370
    .line 1371
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    :try_start_1
    new-instance v1, Landroid/content/Intent;

    .line 1376
    .line 1377
    const-string v4, "android.intent.action.VIEW"

    .line 1378
    .line 1379
    invoke-direct {v1, v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1383
    .line 1384
    .line 1385
    goto :goto_4

    .line 1386
    :catch_0
    move-exception v0

    .line 1387
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1388
    .line 1389
    .line 1390
    :goto_4
    sget-object v0, La/h2e0;->a:La/h2e0;

    .line 1391
    .line 1392
    invoke-virtual {v3, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1393
    .line 1394
    .line 1395
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1396
    .line 1397
    return-object v0

    .line 1398
    :pswitch_b
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v2, La/d1e0;

    .line 1401
    .line 1402
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1403
    .line 1404
    move-object v15, v0

    .line 1405
    check-cast v15, Ljava/lang/String;

    .line 1406
    .line 1407
    move-object v0, v1

    .line 1408
    check-cast v0, La/k0w0;

    .line 1409
    .line 1410
    iget-object v1, v2, La/d1e0;->N:La/qgh;

    .line 1411
    .line 1412
    sget-object v3, La/sip;->a:La/bek;

    .line 1413
    .line 1414
    iget-object v4, v2, La/d1e0;->r:Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;

    .line 1415
    .line 1416
    iget-boolean v5, v4, Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;->b:Z

    .line 1417
    .line 1418
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    .line 1420
    .line 1421
    invoke-static {v5}, La/bek;->f(Z)La/sip;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v9

    .line 1425
    iget-wide v13, v4, Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;->d:J

    .line 1426
    .line 1427
    sget-object v3, La/ryd0;->c:La/c0o;

    .line 1428
    .line 1429
    new-instance v4, Ljava/util/ArrayList;

    .line 1430
    .line 1431
    invoke-static {v3, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1432
    .line 1433
    .line 1434
    move-result v5

    .line 1435
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v3}, La/b3;->iterator()Ljava/util/Iterator;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v3

    .line 1442
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1443
    .line 1444
    .line 1445
    move-result v5

    .line 1446
    if-eqz v5, :cond_10

    .line 1447
    .line 1448
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v5

    .line 1452
    check-cast v5, La/ryd0;

    .line 1453
    .line 1454
    iget-object v5, v5, La/ryd0;->a:La/t9m0;

    .line 1455
    .line 1456
    iget-short v5, v5, La/t9m0;->a:S

    .line 1457
    .line 1458
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v5

    .line 1462
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1463
    .line 1464
    .line 1465
    goto :goto_5

    .line 1466
    :cond_10
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v3

    .line 1470
    check-cast v3, La/qyd0;

    .line 1471
    .line 1472
    iget-object v3, v3, La/qyd0;->d:La/vvd0;

    .line 1473
    .line 1474
    if-eqz v3, :cond_12

    .line 1475
    .line 1476
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v5

    .line 1480
    check-cast v5, La/qyd0;

    .line 1481
    .line 1482
    iget-object v5, v5, La/qyd0;->n:Ljava/util/List;

    .line 1483
    .line 1484
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v2

    .line 1488
    check-cast v2, La/qyd0;

    .line 1489
    .line 1490
    iget-object v2, v2, La/qyd0;->c:La/jlr;

    .line 1491
    .line 1492
    invoke-static {v2}, La/d5c;->C(La/jlr;)La/m9s;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v2

    .line 1496
    invoke-static {v5, v3, v2}, La/azw;->C(Ljava/util/List;La/vvd0;La/m9s;)La/lc00;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v2

    .line 1500
    if-nez v2, :cond_11

    .line 1501
    .line 1502
    goto :goto_7

    .line 1503
    :cond_11
    :goto_6
    move-object/from16 v17, v2

    .line 1504
    .line 1505
    goto :goto_8

    .line 1506
    :cond_12
    :goto_7
    sget-object v2, La/iun;->a:La/iun;

    .line 1507
    .line 1508
    goto :goto_6

    .line 1509
    :goto_8
    sget-object v10, La/dam0;->a:La/dam0;

    .line 1510
    .line 1511
    new-instance v8, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 1512
    .line 1513
    const-wide/16 v11, 0x28

    .line 1514
    .line 1515
    move-object/from16 v16, v4

    .line 1516
    .line 1517
    invoke-direct/range {v8 .. v17}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1521
    .line 1522
    .line 1523
    new-instance v1, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 1524
    .line 1525
    invoke-direct {v1, v8}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1529
    .line 1530
    .line 1531
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1532
    .line 1533
    return-object v0

    .line 1534
    :pswitch_c
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1535
    .line 1536
    check-cast v2, La/hxd0;

    .line 1537
    .line 1538
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1539
    .line 1540
    move-object v15, v0

    .line 1541
    check-cast v15, Ljava/lang/String;

    .line 1542
    .line 1543
    move-object v0, v1

    .line 1544
    check-cast v0, La/k0w0;

    .line 1545
    .line 1546
    iget-object v1, v2, La/hxd0;->s:La/qgh;

    .line 1547
    .line 1548
    sget-object v3, La/sip;->a:La/bek;

    .line 1549
    .line 1550
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1551
    .line 1552
    .line 1553
    sget-object v9, La/sip;->b:La/sip;

    .line 1554
    .line 1555
    iget-object v3, v2, La/hxd0;->G:Ljava/util/ArrayList;

    .line 1556
    .line 1557
    new-instance v4, Ljava/util/ArrayList;

    .line 1558
    .line 1559
    invoke-static {v3, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1560
    .line 1561
    .line 1562
    move-result v5

    .line 1563
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1564
    .line 1565
    .line 1566
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v3

    .line 1570
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1571
    .line 1572
    .line 1573
    move-result v5

    .line 1574
    if-eqz v5, :cond_13

    .line 1575
    .line 1576
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v5

    .line 1580
    check-cast v5, La/t9m0;

    .line 1581
    .line 1582
    iget-short v5, v5, La/t9m0;->a:S

    .line 1583
    .line 1584
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v5

    .line 1588
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1589
    .line 1590
    .line 1591
    goto :goto_9

    .line 1592
    :cond_13
    iget-object v2, v2, La/hxd0;->M:Ljava/util/List;

    .line 1593
    .line 1594
    sget-object v10, La/dam0;->b:La/dam0;

    .line 1595
    .line 1596
    new-instance v8, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 1597
    .line 1598
    const-wide/16 v11, 0x28

    .line 1599
    .line 1600
    const-wide/16 v13, 0xf

    .line 1601
    .line 1602
    move-object/from16 v17, v2

    .line 1603
    .line 1604
    move-object/from16 v16, v4

    .line 1605
    .line 1606
    invoke-direct/range {v8 .. v17}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1610
    .line 1611
    .line 1612
    new-instance v1, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 1613
    .line 1614
    invoke-direct {v1, v8}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1618
    .line 1619
    .line 1620
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1621
    .line 1622
    return-object v0

    .line 1623
    :pswitch_d
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1624
    .line 1625
    check-cast v2, Landroid/content/res/Configuration;

    .line 1626
    .line 1627
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1628
    .line 1629
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1630
    .line 1631
    check-cast v1, La/ox;

    .line 1632
    .line 1633
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1634
    .line 1635
    .line 1636
    iget v2, v2, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 1637
    .line 1638
    invoke-static {v2}, La/sj3;->X(I)I

    .line 1639
    .line 1640
    .line 1641
    move-result v2

    .line 1642
    new-instance v3, La/wtd0;

    .line 1643
    .line 1644
    invoke-direct {v3, v1, v2}, La/wtd0;-><init>(La/ox;I)V

    .line 1645
    .line 1646
    .line 1647
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1651
    .line 1652
    return-object v0

    .line 1653
    :pswitch_e
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1654
    .line 1655
    check-cast v2, La/qzd0;

    .line 1656
    .line 1657
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1658
    .line 1659
    check-cast v0, La/g0e0;

    .line 1660
    .line 1661
    check-cast v1, Ljava/lang/Long;

    .line 1662
    .line 1663
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1664
    .line 1665
    .line 1666
    move-result-wide v3

    .line 1667
    sget-object v1, La/u0e0;->a:[La/u0e0;

    .line 1668
    .line 1669
    const-wide/16 v5, 0x5

    .line 1670
    .line 1671
    cmp-long v1, v3, v5

    .line 1672
    .line 1673
    if-nez v1, :cond_14

    .line 1674
    .line 1675
    iget-object v0, v2, La/qzd0;->e:Ljava/util/List;

    .line 1676
    .line 1677
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1678
    .line 1679
    .line 1680
    move-result v0

    .line 1681
    if-nez v0, :cond_15

    .line 1682
    .line 1683
    :goto_a
    move v11, v12

    .line 1684
    goto :goto_b

    .line 1685
    :cond_14
    const-wide/16 v1, 0x6

    .line 1686
    .line 1687
    cmp-long v1, v3, v1

    .line 1688
    .line 1689
    if-nez v1, :cond_15

    .line 1690
    .line 1691
    iget-object v0, v0, La/g0e0;->h:Ljava/util/List;

    .line 1692
    .line 1693
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1694
    .line 1695
    .line 1696
    move-result v0

    .line 1697
    if-nez v0, :cond_15

    .line 1698
    .line 1699
    goto :goto_a

    .line 1700
    :cond_15
    :goto_b
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v0

    .line 1704
    return-object v0

    .line 1705
    :pswitch_f
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1706
    .line 1707
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1708
    .line 1709
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1710
    .line 1711
    check-cast v0, La/kxc0;

    .line 1712
    .line 1713
    check-cast v1, La/pxc0;

    .line 1714
    .line 1715
    sget-object v3, La/kxc0;->Y1:La/jh70;

    .line 1716
    .line 1717
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1718
    .line 1719
    .line 1720
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v0}, La/kxc0;->J0()La/k3t0;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v0

    .line 1727
    sget-object v1, La/mvc0;->a:La/mvc0;

    .line 1728
    .line 1729
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1730
    .line 1731
    .line 1732
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1733
    .line 1734
    return-object v0

    .line 1735
    :pswitch_10
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1736
    .line 1737
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1738
    .line 1739
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1740
    .line 1741
    check-cast v0, La/qwc0;

    .line 1742
    .line 1743
    check-cast v1, La/wwc0;

    .line 1744
    .line 1745
    sget-object v3, La/qwc0;->Z1:La/rl70;

    .line 1746
    .line 1747
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1748
    .line 1749
    .line 1750
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v0}, La/qwc0;->J0()La/k3t0;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v0

    .line 1757
    sget-object v1, La/awc0;->a:La/awc0;

    .line 1758
    .line 1759
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1760
    .line 1761
    .line 1762
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1763
    .line 1764
    return-object v0

    .line 1765
    :pswitch_11
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1766
    .line 1767
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1768
    .line 1769
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1770
    .line 1771
    move-object v9, v0

    .line 1772
    check-cast v9, Ljava/lang/String;

    .line 1773
    .line 1774
    move-object v8, v1

    .line 1775
    check-cast v8, La/cp;

    .line 1776
    .line 1777
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1778
    .line 1779
    .line 1780
    iget-object v0, v8, La/cp;->u:La/yfu0;

    .line 1781
    .line 1782
    check-cast v0, La/x2k;

    .line 1783
    .line 1784
    iget-object v1, v0, La/x2k;->e:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 1785
    .line 1786
    new-instance v3, La/o7x;

    .line 1787
    .line 1788
    const/4 v4, 0x7

    .line 1789
    invoke-direct {v3, v2, v8, v4}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 1790
    .line 1791
    .line 1792
    invoke-static {v1, v3}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 1793
    .line 1794
    .line 1795
    iget-object v0, v0, La/x2k;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1796
    .line 1797
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLines(I)V

    .line 1798
    .line 1799
    .line 1800
    new-instance v7, La/if6;

    .line 1801
    .line 1802
    const/16 v12, 0x8

    .line 1803
    .line 1804
    move-object v10, v8

    .line 1805
    move-object v11, v9

    .line 1806
    invoke-direct/range {v7 .. v12}, La/if6;-><init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v8, v7}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1810
    .line 1811
    .line 1812
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1813
    .line 1814
    return-object v0

    .line 1815
    :pswitch_12
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1816
    .line 1817
    check-cast v2, La/dtc0;

    .line 1818
    .line 1819
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1820
    .line 1821
    check-cast v0, La/vrc0;

    .line 1822
    .line 1823
    check-cast v1, La/k0w0;

    .line 1824
    .line 1825
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1826
    .line 1827
    .line 1828
    iget-object v2, v2, La/dtc0;->o:La/rl70;

    .line 1829
    .line 1830
    const-string v3, "codes_check"

    .line 1831
    .line 1832
    invoke-interface {v0, v3}, La/vrc0;->g0(Ljava/lang/String;)La/vrc0;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v0

    .line 1836
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1837
    .line 1838
    .line 1839
    new-instance v2, Lorg/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoShopDetailScreen$1;

    .line 1840
    .line 1841
    invoke-direct {v2, v0}, Lorg/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoShopDetailScreen$1;-><init>(La/vrc0;)V

    .line 1842
    .line 1843
    .line 1844
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1845
    .line 1846
    .line 1847
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1848
    .line 1849
    return-object v0

    .line 1850
    :pswitch_13
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1851
    .line 1852
    check-cast v2, La/dtc0;

    .line 1853
    .line 1854
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1855
    .line 1856
    check-cast v0, La/ssc0;

    .line 1857
    .line 1858
    check-cast v1, La/k0w0;

    .line 1859
    .line 1860
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    iget-object v2, v2, La/dtc0;->o:La/rl70;

    .line 1864
    .line 1865
    iget-wide v3, v0, La/ssc0;->a:J

    .line 1866
    .line 1867
    iget-object v0, v0, La/ssc0;->b:Ljava/lang/String;

    .line 1868
    .line 1869
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1870
    .line 1871
    .line 1872
    new-instance v2, Lorg/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoCategoryScreen$1;

    .line 1873
    .line 1874
    invoke-direct {v2, v3, v4, v0}, Lorg/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoCategoryScreen$1;-><init>(JLjava/lang/String;)V

    .line 1875
    .line 1876
    .line 1877
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1878
    .line 1879
    .line 1880
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1881
    .line 1882
    return-object v0

    .line 1883
    :pswitch_14
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1884
    .line 1885
    check-cast v2, La/tsc0;

    .line 1886
    .line 1887
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1888
    .line 1889
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1890
    .line 1891
    check-cast v1, La/hcz;

    .line 1892
    .line 1893
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1894
    .line 1895
    .line 1896
    iget-boolean v6, v2, La/tsc0;->d:Z

    .line 1897
    .line 1898
    if-eqz v6, :cond_16

    .line 1899
    .line 1900
    new-instance v6, La/in80;

    .line 1901
    .line 1902
    const/16 v7, 0x9

    .line 1903
    .line 1904
    invoke-direct {v6, v2, v0, v7}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1905
    .line 1906
    .line 1907
    new-instance v7, La/ugd;

    .line 1908
    .line 1909
    const v8, 0x1530cb0

    .line 1910
    .line 1911
    .line 1912
    invoke-direct {v7, v8, v12, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1913
    .line 1914
    .line 1915
    invoke-static {v1, v10, v10, v7, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1916
    .line 1917
    .line 1918
    :cond_16
    iget-object v6, v2, La/tsc0;->a:La/a4x;

    .line 1919
    .line 1920
    new-instance v7, La/ksc0;

    .line 1921
    .line 1922
    invoke-direct {v7, v12}, La/ksc0;-><init>(B)V

    .line 1923
    .line 1924
    .line 1925
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1926
    .line 1927
    .line 1928
    move-result v8

    .line 1929
    new-instance v9, La/zu90;

    .line 1930
    .line 1931
    invoke-direct {v9, v5, v7, v6}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1932
    .line 1933
    .line 1934
    new-instance v5, La/d1c0;

    .line 1935
    .line 1936
    const/4 v7, 0x4

    .line 1937
    invoke-direct {v5, v6, v7}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 1938
    .line 1939
    .line 1940
    new-instance v7, La/h8w;

    .line 1941
    .line 1942
    invoke-direct {v7, v6, v2, v0, v3}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1943
    .line 1944
    .line 1945
    new-instance v0, La/ugd;

    .line 1946
    .line 1947
    invoke-direct {v0, v4, v12, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1948
    .line 1949
    .line 1950
    invoke-virtual {v1, v8, v9, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1951
    .line 1952
    .line 1953
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1954
    .line 1955
    return-object v0

    .line 1956
    :pswitch_15
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1957
    .line 1958
    check-cast v2, La/qrc0;

    .line 1959
    .line 1960
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1961
    .line 1962
    check-cast v0, La/vrc0;

    .line 1963
    .line 1964
    check-cast v1, La/k0w0;

    .line 1965
    .line 1966
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1967
    .line 1968
    .line 1969
    iget-object v2, v2, La/qrc0;->p:La/rl70;

    .line 1970
    .line 1971
    const-string v3, ""

    .line 1972
    .line 1973
    invoke-interface {v0, v3}, La/vrc0;->g0(Ljava/lang/String;)La/vrc0;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v0

    .line 1977
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1978
    .line 1979
    .line 1980
    new-instance v2, Lorg/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoShopDetailScreen$1;

    .line 1981
    .line 1982
    invoke-direct {v2, v0}, Lorg/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoShopDetailScreen$1;-><init>(La/vrc0;)V

    .line 1983
    .line 1984
    .line 1985
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1986
    .line 1987
    .line 1988
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1989
    .line 1990
    return-object v0

    .line 1991
    :pswitch_16
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 1992
    .line 1993
    check-cast v2, La/wmc0;

    .line 1994
    .line 1995
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 1996
    .line 1997
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1998
    .line 1999
    check-cast v1, La/hcz;

    .line 2000
    .line 2001
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2002
    .line 2003
    .line 2004
    sget-object v3, La/jiq0;->k:La/ugd;

    .line 2005
    .line 2006
    invoke-static {v1, v10, v10, v3, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2007
    .line 2008
    .line 2009
    new-instance v3, La/nmc0;

    .line 2010
    .line 2011
    invoke-direct {v3, v2, v0, v12}, La/nmc0;-><init>(La/wmc0;Lkotlin/jvm/functions/Function1;B)V

    .line 2012
    .line 2013
    .line 2014
    new-instance v4, La/ugd;

    .line 2015
    .line 2016
    const v5, 0x4c190039    # 4.010826E7f

    .line 2017
    .line 2018
    .line 2019
    invoke-direct {v4, v5, v12, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2020
    .line 2021
    .line 2022
    invoke-static {v1, v10, v10, v4, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2023
    .line 2024
    .line 2025
    new-instance v3, La/nmc0;

    .line 2026
    .line 2027
    invoke-direct {v3, v2, v0, v11}, La/nmc0;-><init>(La/wmc0;Lkotlin/jvm/functions/Function1;B)V

    .line 2028
    .line 2029
    .line 2030
    new-instance v4, La/ugd;

    .line 2031
    .line 2032
    const v5, -0x6e17c5e8

    .line 2033
    .line 2034
    .line 2035
    invoke-direct {v4, v5, v12, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2036
    .line 2037
    .line 2038
    invoke-static {v1, v10, v10, v4, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2039
    .line 2040
    .line 2041
    new-instance v3, La/p0z;

    .line 2042
    .line 2043
    const/16 v4, 0x1d

    .line 2044
    .line 2045
    invoke-direct {v3, v2, v4}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 2046
    .line 2047
    .line 2048
    new-instance v4, La/ugd;

    .line 2049
    .line 2050
    const v5, -0x28488c09

    .line 2051
    .line 2052
    .line 2053
    invoke-direct {v4, v5, v12, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2054
    .line 2055
    .line 2056
    invoke-static {v1, v10, v10, v4, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2057
    .line 2058
    .line 2059
    iget-object v2, v2, La/wmc0;->d:La/anc0;

    .line 2060
    .line 2061
    iget-object v2, v2, La/anc0;->b:La/a4x;

    .line 2062
    .line 2063
    new-instance v3, La/ljc0;

    .line 2064
    .line 2065
    const/4 v4, 0x5

    .line 2066
    invoke-direct {v3, v4}, La/ljc0;-><init>(B)V

    .line 2067
    .line 2068
    .line 2069
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2070
    .line 2071
    .line 2072
    move-result v4

    .line 2073
    new-instance v5, La/zu90;

    .line 2074
    .line 2075
    const/16 v6, 0x13

    .line 2076
    .line 2077
    invoke-direct {v5, v6, v3, v2}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 2078
    .line 2079
    .line 2080
    new-instance v3, La/d1c0;

    .line 2081
    .line 2082
    invoke-direct {v3, v2, v9}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 2083
    .line 2084
    .line 2085
    new-instance v6, La/a100;

    .line 2086
    .line 2087
    const/16 v7, 0x19

    .line 2088
    .line 2089
    invoke-direct {v6, v2, v0, v7}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 2090
    .line 2091
    .line 2092
    new-instance v0, La/ugd;

    .line 2093
    .line 2094
    invoke-direct {v0, v8, v12, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2095
    .line 2096
    .line 2097
    invoke-virtual {v1, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2098
    .line 2099
    .line 2100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2101
    .line 2102
    return-object v0

    .line 2103
    :pswitch_17
    const-string v2, "snackbarManager"

    .line 2104
    .line 2105
    iget-object v3, v0, La/oac0;->b:Ljava/lang/Object;

    .line 2106
    .line 2107
    move-object v13, v3

    .line 2108
    check-cast v13, La/lmc0;

    .line 2109
    .line 2110
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 2111
    .line 2112
    check-cast v0, La/a8z;

    .line 2113
    .line 2114
    check-cast v1, La/smc0;

    .line 2115
    .line 2116
    sget-object v3, La/lmc0;->Q1:La/mi70;

    .line 2117
    .line 2118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2119
    .line 2120
    .line 2121
    sget-object v15, La/rek0;->b:La/rek0;

    .line 2122
    .line 2123
    instance-of v3, v1, La/qmc0;

    .line 2124
    .line 2125
    if-eqz v3, :cond_18

    .line 2126
    .line 2127
    iget-object v2, v13, La/lmc0;->P1:La/ii;

    .line 2128
    .line 2129
    if-eqz v2, :cond_17

    .line 2130
    .line 2131
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2132
    .line 2133
    check-cast v1, La/qmc0;

    .line 2134
    .line 2135
    iget-object v15, v1, La/qmc0;->a:Ljava/lang/String;

    .line 2136
    .line 2137
    const v1, 0x7f130e5c

    .line 2138
    .line 2139
    .line 2140
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v17

    .line 2144
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2145
    .line 2146
    .line 2147
    sget-object v23, La/n12;->a:La/n12;

    .line 2148
    .line 2149
    const/16 v24, 0x0

    .line 2150
    .line 2151
    const/16 v25, 0x5f8

    .line 2152
    .line 2153
    const/16 v16, 0x0

    .line 2154
    .line 2155
    const/16 v18, 0x0

    .line 2156
    .line 2157
    const/16 v19, 0x0

    .line 2158
    .line 2159
    const/16 v20, 0x0

    .line 2160
    .line 2161
    const/16 v21, 0x0

    .line 2162
    .line 2163
    const/16 v22, 0x0

    .line 2164
    .line 2165
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2166
    .line 2167
    .line 2168
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v1

    .line 2172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2173
    .line 2174
    .line 2175
    invoke-virtual {v2, v14, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2176
    .line 2177
    .line 2178
    goto :goto_c

    .line 2179
    :cond_17
    const-string v0, "actionDialogManager"

    .line 2180
    .line 2181
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2182
    .line 2183
    .line 2184
    throw v10

    .line 2185
    :cond_18
    sget-object v3, La/rmc0;->a:La/rmc0;

    .line 2186
    .line 2187
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2188
    .line 2189
    .line 2190
    move-result v3

    .line 2191
    const v4, 0x7f13002c

    .line 2192
    .line 2193
    .line 2194
    if-eqz v3, :cond_1a

    .line 2195
    .line 2196
    iget-object v11, v13, La/lmc0;->O1:La/wdk0;

    .line 2197
    .line 2198
    if-eqz v11, :cond_19

    .line 2199
    .line 2200
    new-instance v14, La/xdk0;

    .line 2201
    .line 2202
    invoke-virtual {v13, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v16

    .line 2206
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2207
    .line 2208
    .line 2209
    const/16 v20, 0x0

    .line 2210
    .line 2211
    const/16 v21, 0x7c

    .line 2212
    .line 2213
    const/16 v17, 0x0

    .line 2214
    .line 2215
    const/16 v18, 0x0

    .line 2216
    .line 2217
    const/16 v19, 0x0

    .line 2218
    .line 2219
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2220
    .line 2221
    .line 2222
    const/16 v18, 0x3fc

    .line 2223
    .line 2224
    move-object v12, v14

    .line 2225
    const/4 v14, 0x0

    .line 2226
    const/4 v15, 0x0

    .line 2227
    const/16 v16, 0x0

    .line 2228
    .line 2229
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2230
    .line 2231
    .line 2232
    goto :goto_c

    .line 2233
    :cond_19
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2234
    .line 2235
    .line 2236
    throw v10

    .line 2237
    :cond_1a
    sget-object v3, La/pmc0;->a:La/pmc0;

    .line 2238
    .line 2239
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2240
    .line 2241
    .line 2242
    move-result v1

    .line 2243
    if-eqz v1, :cond_1c

    .line 2244
    .line 2245
    iget-object v11, v13, La/lmc0;->O1:La/wdk0;

    .line 2246
    .line 2247
    if-eqz v11, :cond_1b

    .line 2248
    .line 2249
    new-instance v14, La/xdk0;

    .line 2250
    .line 2251
    invoke-virtual {v13, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v16

    .line 2255
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2256
    .line 2257
    .line 2258
    const/16 v20, 0x0

    .line 2259
    .line 2260
    const/16 v21, 0x7c

    .line 2261
    .line 2262
    const/16 v17, 0x0

    .line 2263
    .line 2264
    const/16 v18, 0x0

    .line 2265
    .line 2266
    const/16 v19, 0x0

    .line 2267
    .line 2268
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2269
    .line 2270
    .line 2271
    const/16 v18, 0x3fc

    .line 2272
    .line 2273
    move-object v12, v14

    .line 2274
    const/4 v14, 0x0

    .line 2275
    const/4 v15, 0x0

    .line 2276
    const/16 v16, 0x0

    .line 2277
    .line 2278
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2279
    .line 2280
    .line 2281
    :goto_c
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v0

    .line 2285
    check-cast v0, La/k3t0;

    .line 2286
    .line 2287
    sget-object v1, La/ulc0;->a:La/ulc0;

    .line 2288
    .line 2289
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2290
    .line 2291
    .line 2292
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2293
    .line 2294
    goto :goto_d

    .line 2295
    :cond_1b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2296
    .line 2297
    .line 2298
    throw v10

    .line 2299
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 2300
    .line 2301
    .line 2302
    :goto_d
    return-object v10

    .line 2303
    :pswitch_18
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 2304
    .line 2305
    check-cast v2, La/clc0;

    .line 2306
    .line 2307
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 2308
    .line 2309
    check-cast v0, Ljava/lang/String;

    .line 2310
    .line 2311
    check-cast v1, La/k0w0;

    .line 2312
    .line 2313
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2314
    .line 2315
    .line 2316
    iget-object v3, v2, La/clc0;->d:La/uf3;

    .line 2317
    .line 2318
    iget-object v2, v2, La/clc0;->r:Ljava/util/Map;

    .line 2319
    .line 2320
    if-nez v2, :cond_1d

    .line 2321
    .line 2322
    sget-object v2, La/lun;->a:La/lun;

    .line 2323
    .line 2324
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2325
    .line 2326
    .line 2327
    :cond_1d
    const/16 v4, 0x30

    .line 2328
    .line 2329
    invoke-static {v3, v0, v2, v4}, La/tf3;->a(La/uf3;Ljava/lang/String;Ljava/util/Map;I)Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v0

    .line 2333
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2334
    .line 2335
    .line 2336
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2337
    .line 2338
    return-object v0

    .line 2339
    :pswitch_19
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 2340
    .line 2341
    check-cast v2, La/l8c0;

    .line 2342
    .line 2343
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 2344
    .line 2345
    check-cast v0, La/cp;

    .line 2346
    .line 2347
    check-cast v1, Landroid/view/View;

    .line 2348
    .line 2349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2350
    .line 2351
    .line 2352
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v0

    .line 2356
    check-cast v0, La/sfc0;

    .line 2357
    .line 2358
    iget-object v0, v0, La/sfc0;->a:Ljava/lang/String;

    .line 2359
    .line 2360
    invoke-virtual {v2, v0}, La/l8c0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2361
    .line 2362
    .line 2363
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2364
    .line 2365
    return-object v0

    .line 2366
    :pswitch_1a
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 2367
    .line 2368
    check-cast v2, La/sec0;

    .line 2369
    .line 2370
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 2371
    .line 2372
    check-cast v0, La/vrc0;

    .line 2373
    .line 2374
    check-cast v1, La/k0w0;

    .line 2375
    .line 2376
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2377
    .line 2378
    .line 2379
    iget-object v2, v2, La/sec0;->r:La/rl70;

    .line 2380
    .line 2381
    const-string v3, "codes_check"

    .line 2382
    .line 2383
    invoke-interface {v0, v3}, La/vrc0;->g0(Ljava/lang/String;)La/vrc0;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v0

    .line 2387
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2388
    .line 2389
    .line 2390
    new-instance v2, Lorg/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoShopDetailScreen$1;

    .line 2391
    .line 2392
    invoke-direct {v2, v0}, Lorg/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoShopDetailScreen$1;-><init>(La/vrc0;)V

    .line 2393
    .line 2394
    .line 2395
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2396
    .line 2397
    .line 2398
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2399
    .line 2400
    return-object v0

    .line 2401
    :pswitch_1b
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 2402
    .line 2403
    check-cast v2, La/kec0;

    .line 2404
    .line 2405
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 2406
    .line 2407
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 2408
    .line 2409
    check-cast v1, La/hcz;

    .line 2410
    .line 2411
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2412
    .line 2413
    .line 2414
    iget-object v2, v2, La/kec0;->c:La/a4x;

    .line 2415
    .line 2416
    new-instance v5, La/t4c0;

    .line 2417
    .line 2418
    const/16 v6, 0xf

    .line 2419
    .line 2420
    invoke-direct {v5, v6}, La/t4c0;-><init>(B)V

    .line 2421
    .line 2422
    .line 2423
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2424
    .line 2425
    .line 2426
    move-result v6

    .line 2427
    new-instance v7, La/zu90;

    .line 2428
    .line 2429
    invoke-direct {v7, v3, v5, v2}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 2430
    .line 2431
    .line 2432
    new-instance v3, La/d1c0;

    .line 2433
    .line 2434
    invoke-direct {v3, v2, v12}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 2435
    .line 2436
    .line 2437
    new-instance v5, La/a100;

    .line 2438
    .line 2439
    const/16 v8, 0x18

    .line 2440
    .line 2441
    invoke-direct {v5, v2, v0, v8}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 2442
    .line 2443
    .line 2444
    new-instance v0, La/ugd;

    .line 2445
    .line 2446
    invoke-direct {v0, v4, v12, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2447
    .line 2448
    .line 2449
    invoke-virtual {v1, v6, v7, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2450
    .line 2451
    .line 2452
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2453
    .line 2454
    return-object v0

    .line 2455
    :pswitch_1c
    iget-object v2, v0, La/oac0;->b:Ljava/lang/Object;

    .line 2456
    .line 2457
    check-cast v2, La/pac0;

    .line 2458
    .line 2459
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 2460
    .line 2461
    iget-object v0, v0, La/oac0;->c:Ljava/lang/Object;

    .line 2462
    .line 2463
    check-cast v0, Ljava/lang/String;

    .line 2464
    .line 2465
    check-cast v1, Ljava/lang/Throwable;

    .line 2466
    .line 2467
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2468
    .line 2469
    .line 2470
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 2471
    .line 2472
    .line 2473
    iget-object v4, v2, La/pac0;->q:La/b4j;

    .line 2474
    .line 2475
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2476
    .line 2477
    .line 2478
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2479
    .line 2480
    .line 2481
    iget-object v7, v4, La/b4j;->a:La/kt2;

    .line 2482
    .line 2483
    const-string v8, "promo_code_check_call"

    .line 2484
    .line 2485
    const-string v9, "promocode"

    .line 2486
    .line 2487
    new-instance v13, Lkotlin/Pair;

    .line 2488
    .line 2489
    invoke-direct {v13, v9, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2490
    .line 2491
    .line 2492
    const-string v14, "option"

    .line 2493
    .line 2494
    const-string v15, "error"

    .line 2495
    .line 2496
    new-instance v10, Lkotlin/Pair;

    .line 2497
    .line 2498
    invoke-direct {v10, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2499
    .line 2500
    .line 2501
    filled-new-array {v13, v10}, [Lkotlin/Pair;

    .line 2502
    .line 2503
    .line 2504
    move-result-object v10

    .line 2505
    invoke-static {v10}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 2506
    .line 2507
    .line 2508
    move-result-object v10

    .line 2509
    invoke-interface {v7, v8, v10}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 2510
    .line 2511
    .line 2512
    iget-object v7, v2, La/pac0;->t:La/x20;

    .line 2513
    .line 2514
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2515
    .line 2516
    .line 2517
    iget-object v7, v7, La/x20;->a:La/s1p;

    .line 2518
    .line 2519
    new-instance v8, La/j1p;

    .line 2520
    .line 2521
    invoke-direct {v8, v0, v11}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 2522
    .line 2523
    .line 2524
    new-instance v10, La/j1p;

    .line 2525
    .line 2526
    const-string v13, ""

    .line 2527
    .line 2528
    invoke-direct {v10, v13, v12}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 2529
    .line 2530
    .line 2531
    new-array v6, v6, [La/k1p;

    .line 2532
    .line 2533
    aput-object v8, v6, v11

    .line 2534
    .line 2535
    aput-object v10, v6, v12

    .line 2536
    .line 2537
    invoke-static {v6}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 2538
    .line 2539
    .line 2540
    move-result-object v6

    .line 2541
    const-wide/16 v12, 0xc0e

    .line 2542
    .line 2543
    invoke-virtual {v7, v6, v12, v13}, La/s1p;->a(Ljava/util/Set;J)V

    .line 2544
    .line 2545
    .line 2546
    iget-object v6, v2, La/i3t0;->i:La/ocj;

    .line 2547
    .line 2548
    iget-object v8, v6, La/ocj;->a:La/p7m0;

    .line 2549
    .line 2550
    :cond_1e
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2551
    .line 2552
    .line 2553
    move-result-object v10

    .line 2554
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2555
    .line 2556
    .line 2557
    move-object/from16 v17, v10

    .line 2558
    .line 2559
    check-cast v17, La/jac0;

    .line 2560
    .line 2561
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2562
    .line 2563
    .line 2564
    const/16 v22, 0x0

    .line 2565
    .line 2566
    const/16 v23, 0x1e

    .line 2567
    .line 2568
    const/16 v18, 0x0

    .line 2569
    .line 2570
    const/16 v19, 0x0

    .line 2571
    .line 2572
    const/16 v20, 0x0

    .line 2573
    .line 2574
    const/16 v21, 0x0

    .line 2575
    .line 2576
    invoke-static/range {v17 .. v23}, La/jac0;->a(La/jac0;ZZZLjava/lang/String;La/zec0;I)La/jac0;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v12

    .line 2580
    invoke-virtual {v8, v10, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2581
    .line 2582
    .line 2583
    move-result v10

    .line 2584
    if-eqz v10, :cond_1e

    .line 2585
    .line 2586
    instance-of v8, v1, La/bfc0;

    .line 2587
    .line 2588
    if-eqz v8, :cond_20

    .line 2589
    .line 2590
    iget-object v6, v6, La/ocj;->a:La/p7m0;

    .line 2591
    .line 2592
    :cond_1f
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2593
    .line 2594
    .line 2595
    move-result-object v0

    .line 2596
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2597
    .line 2598
    .line 2599
    move-object v7, v0

    .line 2600
    check-cast v7, La/jac0;

    .line 2601
    .line 2602
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2603
    .line 2604
    .line 2605
    const/4 v12, 0x0

    .line 2606
    const/16 v13, 0x1b

    .line 2607
    .line 2608
    const/4 v8, 0x0

    .line 2609
    const/4 v9, 0x0

    .line 2610
    const/4 v10, 0x1

    .line 2611
    const/4 v11, 0x0

    .line 2612
    invoke-static/range {v7 .. v13}, La/jac0;->a(La/jac0;ZZZLjava/lang/String;La/zec0;I)La/jac0;

    .line 2613
    .line 2614
    .line 2615
    move-result-object v1

    .line 2616
    invoke-virtual {v6, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2617
    .line 2618
    .line 2619
    move-result v0

    .line 2620
    if-eqz v0, :cond_1f

    .line 2621
    .line 2622
    goto/16 :goto_13

    .line 2623
    .line 2624
    :cond_20
    instance-of v3, v1, La/zhi0;

    .line 2625
    .line 2626
    if-eqz v3, :cond_21

    .line 2627
    .line 2628
    move-object v6, v1

    .line 2629
    check-cast v6, La/zhi0;

    .line 2630
    .line 2631
    goto :goto_e

    .line 2632
    :cond_21
    const/4 v6, 0x0

    .line 2633
    :goto_e
    if-eqz v6, :cond_22

    .line 2634
    .line 2635
    iget-object v6, v6, La/zhi0;->c:La/kuw;

    .line 2636
    .line 2637
    goto :goto_f

    .line 2638
    :cond_22
    const/4 v6, 0x0

    .line 2639
    :goto_f
    sget-object v8, La/i2o;->y2:La/i2o;

    .line 2640
    .line 2641
    const-wide/16 v12, 0xc10

    .line 2642
    .line 2643
    if-ne v6, v8, :cond_23

    .line 2644
    .line 2645
    new-instance v3, La/j1p;

    .line 2646
    .line 2647
    invoke-direct {v3, v0, v11}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 2648
    .line 2649
    .line 2650
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 2651
    .line 2652
    .line 2653
    move-result-object v3

    .line 2654
    invoke-virtual {v7, v3, v12, v13}, La/s1p;->a(Ljava/util/Set;J)V

    .line 2655
    .line 2656
    .line 2657
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2658
    .line 2659
    .line 2660
    iget-object v3, v4, La/b4j;->a:La/kt2;

    .line 2661
    .line 2662
    const-string v4, "promo_code_check_block"

    .line 2663
    .line 2664
    new-instance v5, Lkotlin/Pair;

    .line 2665
    .line 2666
    invoke-direct {v5, v9, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2667
    .line 2668
    .line 2669
    invoke-static {v5}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 2670
    .line 2671
    .line 2672
    move-result-object v0

    .line 2673
    invoke-interface {v3, v4, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 2674
    .line 2675
    .line 2676
    new-instance v0, La/fac0;

    .line 2677
    .line 2678
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2679
    .line 2680
    .line 2681
    move-result-object v1

    .line 2682
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v1

    .line 2686
    invoke-direct {v0, v1}, La/fac0;-><init>(Ljava/lang/String;)V

    .line 2687
    .line 2688
    .line 2689
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 2690
    .line 2691
    .line 2692
    goto :goto_13

    .line 2693
    :cond_23
    if-eqz v3, :cond_24

    .line 2694
    .line 2695
    move-object v3, v1

    .line 2696
    check-cast v3, La/zhi0;

    .line 2697
    .line 2698
    goto :goto_10

    .line 2699
    :cond_24
    const/4 v3, 0x0

    .line 2700
    :goto_10
    if-eqz v3, :cond_25

    .line 2701
    .line 2702
    iget-object v10, v3, La/zhi0;->c:La/kuw;

    .line 2703
    .line 2704
    goto :goto_11

    .line 2705
    :cond_25
    const/4 v10, 0x0

    .line 2706
    :goto_11
    sget-object v3, La/i2o;->d:La/i2o;

    .line 2707
    .line 2708
    if-ne v10, v3, :cond_26

    .line 2709
    .line 2710
    new-instance v3, La/j1p;

    .line 2711
    .line 2712
    invoke-direct {v3, v0, v11}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 2713
    .line 2714
    .line 2715
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 2716
    .line 2717
    .line 2718
    move-result-object v0

    .line 2719
    invoke-virtual {v7, v0, v12, v13}, La/s1p;->a(Ljava/util/Set;J)V

    .line 2720
    .line 2721
    .line 2722
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2723
    .line 2724
    .line 2725
    move-result-object v0

    .line 2726
    if-eqz v0, :cond_28

    .line 2727
    .line 2728
    new-instance v1, La/fac0;

    .line 2729
    .line 2730
    invoke-direct {v1, v0}, La/fac0;-><init>(Ljava/lang/String;)V

    .line 2731
    .line 2732
    .line 2733
    invoke-virtual {v2, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 2734
    .line 2735
    .line 2736
    goto :goto_13

    .line 2737
    :cond_26
    iget-object v0, v2, La/pac0;->p:La/duj;

    .line 2738
    .line 2739
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v3

    .line 2743
    if-nez v3, :cond_27

    .line 2744
    .line 2745
    goto :goto_12

    .line 2746
    :cond_27
    move-object v1, v3

    .line 2747
    :goto_12
    new-instance v3, La/lma0;

    .line 2748
    .line 2749
    invoke-direct {v3, v2, v5}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 2750
    .line 2751
    .line 2752
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2753
    .line 2754
    .line 2755
    :cond_28
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2756
    .line 2757
    return-object v0

    .line 2758
    nop

    .line 2759
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
