.class public final synthetic La/xwe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/dq00;La/u0f0;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/xwe0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xwe0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/xwe0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/xwe0;->a:B

    iput-object p1, p0, La/xwe0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/xwe0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/g090;

    .line 6
    .line 7
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/u0f0;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, La/u4f0;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v2, La/u4f0;->g:La/r1f0;

    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v4}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v1, v1, La/g090;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, La/vzg0;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/16 v6, 0x1d

    .line 40
    .line 41
    if-eq v5, v6, :cond_3

    .line 42
    .line 43
    const/16 v6, 0x1e

    .line 44
    .line 45
    if-eq v5, v6, :cond_2

    .line 46
    .line 47
    const/16 v6, 0x26

    .line 48
    .line 49
    if-eq v5, v6, :cond_1

    .line 50
    .line 51
    const/16 v6, 0x27

    .line 52
    .line 53
    if-eq v5, v6, :cond_0

    .line 54
    .line 55
    packed-switch v5, :pswitch_data_0

    .line 56
    .line 57
    .line 58
    iget-object v0, v2, La/u4f0;->e:Ljava/util/Map;

    .line 59
    .line 60
    new-instance v1, Lkotlin/Pair;

    .line 61
    .line 62
    invoke-direct {v1, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :pswitch_0
    iget-boolean v2, v3, La/r1f0;->y:Z

    .line 67
    .line 68
    xor-int/lit8 v28, v2, 0x1

    .line 69
    .line 70
    const v43, -0x1000001

    .line 71
    .line 72
    .line 73
    const/16 v44, 0x7f

    .line 74
    .line 75
    move-object v2, v4

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v11, 0x0

    .line 84
    const/4 v12, 0x0

    .line 85
    const/4 v13, 0x0

    .line 86
    const/4 v14, 0x0

    .line 87
    const/4 v15, 0x0

    .line 88
    const/16 v16, 0x0

    .line 89
    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0x0

    .line 95
    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const/16 v22, 0x0

    .line 101
    .line 102
    const/16 v23, 0x0

    .line 103
    .line 104
    const/16 v24, 0x0

    .line 105
    .line 106
    const/16 v25, 0x0

    .line 107
    .line 108
    const/16 v26, 0x0

    .line 109
    .line 110
    const/16 v27, 0x0

    .line 111
    .line 112
    const/16 v29, 0x0

    .line 113
    .line 114
    const/16 v30, 0x0

    .line 115
    .line 116
    const/16 v31, 0x0

    .line 117
    .line 118
    const/16 v32, 0x0

    .line 119
    .line 120
    const/16 v33, 0x0

    .line 121
    .line 122
    const/16 v34, 0x0

    .line 123
    .line 124
    const/16 v35, 0x0

    .line 125
    .line 126
    const/16 v36, 0x0

    .line 127
    .line 128
    const/16 v37, 0x0

    .line 129
    .line 130
    const/16 v38, 0x0

    .line 131
    .line 132
    const/16 v39, 0x0

    .line 133
    .line 134
    const/16 v40, 0x0

    .line 135
    .line 136
    const/16 v41, 0x0

    .line 137
    .line 138
    const/16 v42, 0x0

    .line 139
    .line 140
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-boolean v4, v3, La/r1f0;->y:Z

    .line 149
    .line 150
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    new-instance v0, Lkotlin/Pair;

    .line 158
    .line 159
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_1
    move-object v2, v4

    .line 164
    iget-boolean v4, v3, La/r1f0;->x:Z

    .line 165
    .line 166
    xor-int/lit8 v27, v4, 0x1

    .line 167
    .line 168
    const v43, -0x800001

    .line 169
    .line 170
    .line 171
    const/16 v44, 0x7f

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v8, 0x0

    .line 178
    const/4 v9, 0x0

    .line 179
    const/4 v10, 0x0

    .line 180
    const/4 v11, 0x0

    .line 181
    const/4 v12, 0x0

    .line 182
    const/4 v13, 0x0

    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const/16 v19, 0x0

    .line 192
    .line 193
    const/16 v20, 0x0

    .line 194
    .line 195
    const/16 v21, 0x0

    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const/16 v23, 0x0

    .line 200
    .line 201
    const/16 v24, 0x0

    .line 202
    .line 203
    const/16 v25, 0x0

    .line 204
    .line 205
    const/16 v26, 0x0

    .line 206
    .line 207
    const/16 v28, 0x0

    .line 208
    .line 209
    const/16 v29, 0x0

    .line 210
    .line 211
    const/16 v30, 0x0

    .line 212
    .line 213
    const/16 v31, 0x0

    .line 214
    .line 215
    const/16 v32, 0x0

    .line 216
    .line 217
    const/16 v33, 0x0

    .line 218
    .line 219
    const/16 v34, 0x0

    .line 220
    .line 221
    const/16 v35, 0x0

    .line 222
    .line 223
    const/16 v36, 0x0

    .line 224
    .line 225
    const/16 v37, 0x0

    .line 226
    .line 227
    const/16 v38, 0x0

    .line 228
    .line 229
    const/16 v39, 0x0

    .line 230
    .line 231
    const/16 v40, 0x0

    .line 232
    .line 233
    const/16 v41, 0x0

    .line 234
    .line 235
    const/16 v42, 0x0

    .line 236
    .line 237
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-boolean v4, v3, La/r1f0;->x:Z

    .line 246
    .line 247
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    new-instance v0, Lkotlin/Pair;

    .line 255
    .line 256
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_2
    move-object v2, v4

    .line 261
    iget-boolean v4, v3, La/r1f0;->C:Z

    .line 262
    .line 263
    xor-int/lit8 v32, v4, 0x1

    .line 264
    .line 265
    const v43, -0x10000001

    .line 266
    .line 267
    .line 268
    const/16 v44, 0x7f

    .line 269
    .line 270
    const/4 v4, 0x0

    .line 271
    const/4 v5, 0x0

    .line 272
    const/4 v6, 0x0

    .line 273
    const/4 v7, 0x0

    .line 274
    const/4 v8, 0x0

    .line 275
    const/4 v9, 0x0

    .line 276
    const/4 v10, 0x0

    .line 277
    const/4 v11, 0x0

    .line 278
    const/4 v12, 0x0

    .line 279
    const/4 v13, 0x0

    .line 280
    const/4 v14, 0x0

    .line 281
    const/4 v15, 0x0

    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    const/16 v19, 0x0

    .line 289
    .line 290
    const/16 v20, 0x0

    .line 291
    .line 292
    const/16 v21, 0x0

    .line 293
    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    const/16 v23, 0x0

    .line 297
    .line 298
    const/16 v24, 0x0

    .line 299
    .line 300
    const/16 v25, 0x0

    .line 301
    .line 302
    const/16 v26, 0x0

    .line 303
    .line 304
    const/16 v27, 0x0

    .line 305
    .line 306
    const/16 v28, 0x0

    .line 307
    .line 308
    const/16 v29, 0x0

    .line 309
    .line 310
    const/16 v30, 0x0

    .line 311
    .line 312
    const/16 v31, 0x0

    .line 313
    .line 314
    const/16 v33, 0x0

    .line 315
    .line 316
    const/16 v34, 0x0

    .line 317
    .line 318
    const/16 v35, 0x0

    .line 319
    .line 320
    const/16 v36, 0x0

    .line 321
    .line 322
    const/16 v37, 0x0

    .line 323
    .line 324
    const/16 v38, 0x0

    .line 325
    .line 326
    const/16 v39, 0x0

    .line 327
    .line 328
    const/16 v40, 0x0

    .line 329
    .line 330
    const/16 v41, 0x0

    .line 331
    .line 332
    const/16 v42, 0x0

    .line 333
    .line 334
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iget-boolean v4, v3, La/r1f0;->C:Z

    .line 343
    .line 344
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    new-instance v0, Lkotlin/Pair;

    .line 352
    .line 353
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    return-object v0

    .line 357
    :pswitch_3
    move-object v2, v4

    .line 358
    iget-boolean v4, v3, La/r1f0;->e:Z

    .line 359
    .line 360
    xor-int/lit8 v8, v4, 0x1

    .line 361
    .line 362
    const/16 v43, -0x11

    .line 363
    .line 364
    const/16 v44, 0x7f

    .line 365
    .line 366
    const/4 v4, 0x0

    .line 367
    const/4 v5, 0x0

    .line 368
    const/4 v6, 0x0

    .line 369
    const/4 v7, 0x0

    .line 370
    const/4 v9, 0x0

    .line 371
    const/4 v10, 0x0

    .line 372
    const/4 v11, 0x0

    .line 373
    const/4 v12, 0x0

    .line 374
    const/4 v13, 0x0

    .line 375
    const/4 v14, 0x0

    .line 376
    const/4 v15, 0x0

    .line 377
    const/16 v16, 0x0

    .line 378
    .line 379
    const/16 v17, 0x0

    .line 380
    .line 381
    const/16 v18, 0x0

    .line 382
    .line 383
    const/16 v19, 0x0

    .line 384
    .line 385
    const/16 v20, 0x0

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    const/16 v23, 0x0

    .line 392
    .line 393
    const/16 v24, 0x0

    .line 394
    .line 395
    const/16 v25, 0x0

    .line 396
    .line 397
    const/16 v26, 0x0

    .line 398
    .line 399
    const/16 v27, 0x0

    .line 400
    .line 401
    const/16 v28, 0x0

    .line 402
    .line 403
    const/16 v29, 0x0

    .line 404
    .line 405
    const/16 v30, 0x0

    .line 406
    .line 407
    const/16 v31, 0x0

    .line 408
    .line 409
    const/16 v32, 0x0

    .line 410
    .line 411
    const/16 v33, 0x0

    .line 412
    .line 413
    const/16 v34, 0x0

    .line 414
    .line 415
    const/16 v35, 0x0

    .line 416
    .line 417
    const/16 v36, 0x0

    .line 418
    .line 419
    const/16 v37, 0x0

    .line 420
    .line 421
    const/16 v38, 0x0

    .line 422
    .line 423
    const/16 v39, 0x0

    .line 424
    .line 425
    const/16 v40, 0x0

    .line 426
    .line 427
    const/16 v41, 0x0

    .line 428
    .line 429
    const/16 v42, 0x0

    .line 430
    .line 431
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    iget-boolean v4, v3, La/r1f0;->e:Z

    .line 440
    .line 441
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    new-instance v0, Lkotlin/Pair;

    .line 449
    .line 450
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_4
    move-object v2, v4

    .line 455
    iget-boolean v4, v3, La/r1f0;->A:Z

    .line 456
    .line 457
    xor-int/lit8 v30, v4, 0x1

    .line 458
    .line 459
    const v43, -0x4000001

    .line 460
    .line 461
    .line 462
    const/16 v44, 0x7f

    .line 463
    .line 464
    const/4 v4, 0x0

    .line 465
    const/4 v5, 0x0

    .line 466
    const/4 v6, 0x0

    .line 467
    const/4 v7, 0x0

    .line 468
    const/4 v8, 0x0

    .line 469
    const/4 v9, 0x0

    .line 470
    const/4 v10, 0x0

    .line 471
    const/4 v11, 0x0

    .line 472
    const/4 v12, 0x0

    .line 473
    const/4 v13, 0x0

    .line 474
    const/4 v14, 0x0

    .line 475
    const/4 v15, 0x0

    .line 476
    const/16 v16, 0x0

    .line 477
    .line 478
    const/16 v17, 0x0

    .line 479
    .line 480
    const/16 v18, 0x0

    .line 481
    .line 482
    const/16 v19, 0x0

    .line 483
    .line 484
    const/16 v20, 0x0

    .line 485
    .line 486
    const/16 v21, 0x0

    .line 487
    .line 488
    const/16 v22, 0x0

    .line 489
    .line 490
    const/16 v23, 0x0

    .line 491
    .line 492
    const/16 v24, 0x0

    .line 493
    .line 494
    const/16 v25, 0x0

    .line 495
    .line 496
    const/16 v26, 0x0

    .line 497
    .line 498
    const/16 v27, 0x0

    .line 499
    .line 500
    const/16 v28, 0x0

    .line 501
    .line 502
    const/16 v29, 0x0

    .line 503
    .line 504
    const/16 v31, 0x0

    .line 505
    .line 506
    const/16 v32, 0x0

    .line 507
    .line 508
    const/16 v33, 0x0

    .line 509
    .line 510
    const/16 v34, 0x0

    .line 511
    .line 512
    const/16 v35, 0x0

    .line 513
    .line 514
    const/16 v36, 0x0

    .line 515
    .line 516
    const/16 v37, 0x0

    .line 517
    .line 518
    const/16 v38, 0x0

    .line 519
    .line 520
    const/16 v39, 0x0

    .line 521
    .line 522
    const/16 v40, 0x0

    .line 523
    .line 524
    const/16 v41, 0x0

    .line 525
    .line 526
    const/16 v42, 0x0

    .line 527
    .line 528
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    iget-boolean v4, v3, La/r1f0;->A:Z

    .line 537
    .line 538
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    new-instance v0, Lkotlin/Pair;

    .line 546
    .line 547
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    return-object v0

    .line 551
    :pswitch_5
    move-object v2, v4

    .line 552
    iget-boolean v4, v3, La/r1f0;->B:Z

    .line 553
    .line 554
    xor-int/lit8 v31, v4, 0x1

    .line 555
    .line 556
    const v43, -0x8000001

    .line 557
    .line 558
    .line 559
    const/16 v44, 0x7f

    .line 560
    .line 561
    const/4 v4, 0x0

    .line 562
    const/4 v5, 0x0

    .line 563
    const/4 v6, 0x0

    .line 564
    const/4 v7, 0x0

    .line 565
    const/4 v8, 0x0

    .line 566
    const/4 v9, 0x0

    .line 567
    const/4 v10, 0x0

    .line 568
    const/4 v11, 0x0

    .line 569
    const/4 v12, 0x0

    .line 570
    const/4 v13, 0x0

    .line 571
    const/4 v14, 0x0

    .line 572
    const/4 v15, 0x0

    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    const/16 v17, 0x0

    .line 576
    .line 577
    const/16 v18, 0x0

    .line 578
    .line 579
    const/16 v19, 0x0

    .line 580
    .line 581
    const/16 v20, 0x0

    .line 582
    .line 583
    const/16 v21, 0x0

    .line 584
    .line 585
    const/16 v22, 0x0

    .line 586
    .line 587
    const/16 v23, 0x0

    .line 588
    .line 589
    const/16 v24, 0x0

    .line 590
    .line 591
    const/16 v25, 0x0

    .line 592
    .line 593
    const/16 v26, 0x0

    .line 594
    .line 595
    const/16 v27, 0x0

    .line 596
    .line 597
    const/16 v28, 0x0

    .line 598
    .line 599
    const/16 v29, 0x0

    .line 600
    .line 601
    const/16 v30, 0x0

    .line 602
    .line 603
    const/16 v32, 0x0

    .line 604
    .line 605
    const/16 v33, 0x0

    .line 606
    .line 607
    const/16 v34, 0x0

    .line 608
    .line 609
    const/16 v35, 0x0

    .line 610
    .line 611
    const/16 v36, 0x0

    .line 612
    .line 613
    const/16 v37, 0x0

    .line 614
    .line 615
    const/16 v38, 0x0

    .line 616
    .line 617
    const/16 v39, 0x0

    .line 618
    .line 619
    const/16 v40, 0x0

    .line 620
    .line 621
    const/16 v41, 0x0

    .line 622
    .line 623
    const/16 v42, 0x0

    .line 624
    .line 625
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    iget-boolean v4, v3, La/r1f0;->B:Z

    .line 634
    .line 635
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    new-instance v0, Lkotlin/Pair;

    .line 643
    .line 644
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    return-object v0

    .line 648
    :cond_0
    move-object v2, v4

    .line 649
    iget-boolean v4, v3, La/r1f0;->L:Z

    .line 650
    .line 651
    xor-int/lit8 v41, v4, 0x1

    .line 652
    .line 653
    const/16 v43, -0x1

    .line 654
    .line 655
    const/16 v44, 0x5f

    .line 656
    .line 657
    const/4 v4, 0x0

    .line 658
    const/4 v5, 0x0

    .line 659
    const/4 v6, 0x0

    .line 660
    const/4 v7, 0x0

    .line 661
    const/4 v8, 0x0

    .line 662
    const/4 v9, 0x0

    .line 663
    const/4 v10, 0x0

    .line 664
    const/4 v11, 0x0

    .line 665
    const/4 v12, 0x0

    .line 666
    const/4 v13, 0x0

    .line 667
    const/4 v14, 0x0

    .line 668
    const/4 v15, 0x0

    .line 669
    const/16 v16, 0x0

    .line 670
    .line 671
    const/16 v17, 0x0

    .line 672
    .line 673
    const/16 v18, 0x0

    .line 674
    .line 675
    const/16 v19, 0x0

    .line 676
    .line 677
    const/16 v20, 0x0

    .line 678
    .line 679
    const/16 v21, 0x0

    .line 680
    .line 681
    const/16 v22, 0x0

    .line 682
    .line 683
    const/16 v23, 0x0

    .line 684
    .line 685
    const/16 v24, 0x0

    .line 686
    .line 687
    const/16 v25, 0x0

    .line 688
    .line 689
    const/16 v26, 0x0

    .line 690
    .line 691
    const/16 v27, 0x0

    .line 692
    .line 693
    const/16 v28, 0x0

    .line 694
    .line 695
    const/16 v29, 0x0

    .line 696
    .line 697
    const/16 v30, 0x0

    .line 698
    .line 699
    const/16 v31, 0x0

    .line 700
    .line 701
    const/16 v32, 0x0

    .line 702
    .line 703
    const/16 v33, 0x0

    .line 704
    .line 705
    const/16 v34, 0x0

    .line 706
    .line 707
    const/16 v35, 0x0

    .line 708
    .line 709
    const/16 v36, 0x0

    .line 710
    .line 711
    const/16 v37, 0x0

    .line 712
    .line 713
    const/16 v38, 0x0

    .line 714
    .line 715
    const/16 v39, 0x0

    .line 716
    .line 717
    const/16 v40, 0x0

    .line 718
    .line 719
    const/16 v42, 0x0

    .line 720
    .line 721
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    iget-boolean v4, v3, La/r1f0;->L:Z

    .line 730
    .line 731
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    new-instance v0, Lkotlin/Pair;

    .line 739
    .line 740
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    return-object v0

    .line 744
    :cond_1
    move-object v2, v4

    .line 745
    iget-boolean v4, v3, La/r1f0;->f:Z

    .line 746
    .line 747
    xor-int/lit8 v9, v4, 0x1

    .line 748
    .line 749
    const/16 v43, -0x21

    .line 750
    .line 751
    const/16 v44, 0x7f

    .line 752
    .line 753
    const/4 v4, 0x0

    .line 754
    const/4 v5, 0x0

    .line 755
    const/4 v6, 0x0

    .line 756
    const/4 v7, 0x0

    .line 757
    const/4 v8, 0x0

    .line 758
    const/4 v10, 0x0

    .line 759
    const/4 v11, 0x0

    .line 760
    const/4 v12, 0x0

    .line 761
    const/4 v13, 0x0

    .line 762
    const/4 v14, 0x0

    .line 763
    const/4 v15, 0x0

    .line 764
    const/16 v16, 0x0

    .line 765
    .line 766
    const/16 v17, 0x0

    .line 767
    .line 768
    const/16 v18, 0x0

    .line 769
    .line 770
    const/16 v19, 0x0

    .line 771
    .line 772
    const/16 v20, 0x0

    .line 773
    .line 774
    const/16 v21, 0x0

    .line 775
    .line 776
    const/16 v22, 0x0

    .line 777
    .line 778
    const/16 v23, 0x0

    .line 779
    .line 780
    const/16 v24, 0x0

    .line 781
    .line 782
    const/16 v25, 0x0

    .line 783
    .line 784
    const/16 v26, 0x0

    .line 785
    .line 786
    const/16 v27, 0x0

    .line 787
    .line 788
    const/16 v28, 0x0

    .line 789
    .line 790
    const/16 v29, 0x0

    .line 791
    .line 792
    const/16 v30, 0x0

    .line 793
    .line 794
    const/16 v31, 0x0

    .line 795
    .line 796
    const/16 v32, 0x0

    .line 797
    .line 798
    const/16 v33, 0x0

    .line 799
    .line 800
    const/16 v34, 0x0

    .line 801
    .line 802
    const/16 v35, 0x0

    .line 803
    .line 804
    const/16 v36, 0x0

    .line 805
    .line 806
    const/16 v37, 0x0

    .line 807
    .line 808
    const/16 v38, 0x0

    .line 809
    .line 810
    const/16 v39, 0x0

    .line 811
    .line 812
    const/16 v40, 0x0

    .line 813
    .line 814
    const/16 v41, 0x0

    .line 815
    .line 816
    const/16 v42, 0x0

    .line 817
    .line 818
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    iget-boolean v4, v3, La/r1f0;->f:Z

    .line 827
    .line 828
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 829
    .line 830
    .line 831
    move-result-object v4

    .line 832
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    new-instance v0, Lkotlin/Pair;

    .line 836
    .line 837
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    return-object v0

    .line 841
    :cond_2
    move-object v2, v4

    .line 842
    iget-boolean v4, v3, La/r1f0;->b:Z

    .line 843
    .line 844
    xor-int/lit8 v5, v4, 0x1

    .line 845
    .line 846
    const/16 v43, -0x3

    .line 847
    .line 848
    const/16 v44, 0x7f

    .line 849
    .line 850
    const/4 v4, 0x0

    .line 851
    const/4 v6, 0x0

    .line 852
    const/4 v7, 0x0

    .line 853
    const/4 v8, 0x0

    .line 854
    const/4 v9, 0x0

    .line 855
    const/4 v10, 0x0

    .line 856
    const/4 v11, 0x0

    .line 857
    const/4 v12, 0x0

    .line 858
    const/4 v13, 0x0

    .line 859
    const/4 v14, 0x0

    .line 860
    const/4 v15, 0x0

    .line 861
    const/16 v16, 0x0

    .line 862
    .line 863
    const/16 v17, 0x0

    .line 864
    .line 865
    const/16 v18, 0x0

    .line 866
    .line 867
    const/16 v19, 0x0

    .line 868
    .line 869
    const/16 v20, 0x0

    .line 870
    .line 871
    const/16 v21, 0x0

    .line 872
    .line 873
    const/16 v22, 0x0

    .line 874
    .line 875
    const/16 v23, 0x0

    .line 876
    .line 877
    const/16 v24, 0x0

    .line 878
    .line 879
    const/16 v25, 0x0

    .line 880
    .line 881
    const/16 v26, 0x0

    .line 882
    .line 883
    const/16 v27, 0x0

    .line 884
    .line 885
    const/16 v28, 0x0

    .line 886
    .line 887
    const/16 v29, 0x0

    .line 888
    .line 889
    const/16 v30, 0x0

    .line 890
    .line 891
    const/16 v31, 0x0

    .line 892
    .line 893
    const/16 v32, 0x0

    .line 894
    .line 895
    const/16 v33, 0x0

    .line 896
    .line 897
    const/16 v34, 0x0

    .line 898
    .line 899
    const/16 v35, 0x0

    .line 900
    .line 901
    const/16 v36, 0x0

    .line 902
    .line 903
    const/16 v37, 0x0

    .line 904
    .line 905
    const/16 v38, 0x0

    .line 906
    .line 907
    const/16 v39, 0x0

    .line 908
    .line 909
    const/16 v40, 0x0

    .line 910
    .line 911
    const/16 v41, 0x0

    .line 912
    .line 913
    const/16 v42, 0x0

    .line 914
    .line 915
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    iget-boolean v4, v3, La/r1f0;->b:Z

    .line 924
    .line 925
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 926
    .line 927
    .line 928
    move-result-object v4

    .line 929
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 930
    .line 931
    .line 932
    new-instance v0, Lkotlin/Pair;

    .line 933
    .line 934
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    return-object v0

    .line 938
    :cond_3
    move-object v2, v4

    .line 939
    iget-object v4, v3, La/r1f0;->s:Ljava/lang/Boolean;

    .line 940
    .line 941
    const v43, -0x40001

    .line 942
    .line 943
    .line 944
    const/16 v44, 0x7f

    .line 945
    .line 946
    move-object/from16 v22, v4

    .line 947
    .line 948
    const/4 v4, 0x0

    .line 949
    const/4 v5, 0x0

    .line 950
    const/4 v6, 0x0

    .line 951
    const/4 v7, 0x0

    .line 952
    const/4 v8, 0x0

    .line 953
    const/4 v9, 0x0

    .line 954
    const/4 v10, 0x0

    .line 955
    const/4 v11, 0x0

    .line 956
    const/4 v12, 0x0

    .line 957
    const/4 v13, 0x0

    .line 958
    const/4 v14, 0x0

    .line 959
    const/4 v15, 0x0

    .line 960
    const/16 v16, 0x0

    .line 961
    .line 962
    const/16 v17, 0x0

    .line 963
    .line 964
    const/16 v18, 0x0

    .line 965
    .line 966
    const/16 v19, 0x0

    .line 967
    .line 968
    const/16 v20, 0x0

    .line 969
    .line 970
    const/16 v21, 0x0

    .line 971
    .line 972
    const/16 v23, 0x0

    .line 973
    .line 974
    const/16 v24, 0x0

    .line 975
    .line 976
    const/16 v25, 0x0

    .line 977
    .line 978
    const/16 v26, 0x0

    .line 979
    .line 980
    const/16 v27, 0x0

    .line 981
    .line 982
    const/16 v28, 0x0

    .line 983
    .line 984
    const/16 v29, 0x0

    .line 985
    .line 986
    const/16 v30, 0x0

    .line 987
    .line 988
    const/16 v31, 0x0

    .line 989
    .line 990
    const/16 v32, 0x0

    .line 991
    .line 992
    const/16 v33, 0x0

    .line 993
    .line 994
    const/16 v34, 0x0

    .line 995
    .line 996
    const/16 v35, 0x0

    .line 997
    .line 998
    const/16 v36, 0x0

    .line 999
    .line 1000
    const/16 v37, 0x0

    .line 1001
    .line 1002
    const/16 v38, 0x0

    .line 1003
    .line 1004
    const/16 v39, 0x0

    .line 1005
    .line 1006
    const/16 v40, 0x0

    .line 1007
    .line 1008
    const/16 v41, 0x0

    .line 1009
    .line 1010
    const/16 v42, 0x0

    .line 1011
    .line 1012
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v3

    .line 1016
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    iget-object v4, v3, La/r1f0;->s:Ljava/lang/Boolean;

    .line 1021
    .line 1022
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v0, Lkotlin/Pair;

    .line 1026
    .line 1027
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    return-object v0

    .line 1031
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object/from16 v41, v1

    .line 6
    .line 7
    check-cast v41, La/q7f0;

    .line 8
    .line 9
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/g090;

    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/u4f0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, La/u4f0;->g:La/r1f0;

    .line 21
    .line 22
    const/16 v42, -0x1

    .line 23
    .line 24
    const/16 v43, 0x3f

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    const/16 v23, 0x0

    .line 54
    .line 55
    const/16 v24, 0x0

    .line 56
    .line 57
    const/16 v25, 0x0

    .line 58
    .line 59
    const/16 v26, 0x0

    .line 60
    .line 61
    const/16 v27, 0x0

    .line 62
    .line 63
    const/16 v28, 0x0

    .line 64
    .line 65
    const/16 v29, 0x0

    .line 66
    .line 67
    const/16 v30, 0x0

    .line 68
    .line 69
    const/16 v31, 0x0

    .line 70
    .line 71
    const/16 v32, 0x0

    .line 72
    .line 73
    const/16 v33, 0x0

    .line 74
    .line 75
    const/16 v34, 0x0

    .line 76
    .line 77
    const/16 v35, 0x0

    .line 78
    .line 79
    const/16 v36, 0x0

    .line 80
    .line 81
    const/16 v37, 0x0

    .line 82
    .line 83
    const/16 v38, 0x0

    .line 84
    .line 85
    const/16 v39, 0x0

    .line 86
    .line 87
    const/16 v40, 0x0

    .line 88
    .line 89
    invoke-static/range {v2 .. v43}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, La/vzg0;

    .line 96
    .line 97
    const-string v3, "REGISTRATION_TYPE"

    .line 98
    .line 99
    iget-object v4, v2, La/r1f0;->M:La/q7f0;

    .line 100
    .line 101
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, v1, La/u4f0;->e:Ljava/util/Map;

    .line 105
    .line 106
    new-instance v1, Lkotlin/Pair;

    .line 107
    .line 108
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-object v1
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/rkt;

    .line 6
    .line 7
    iget-object v2, v1, La/rkt;->h:La/cm90;

    .line 8
    .line 9
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/g090;

    .line 12
    .line 13
    move-object/from16 v3, p1

    .line 14
    .line 15
    check-cast v3, La/u4f0;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v4, v3, La/u4f0;->g:La/r1f0;

    .line 21
    .line 22
    iget-object v5, v4, La/r1f0;->r:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;

    .line 23
    .line 24
    iget-object v6, v1, La/rkt;->c:Ljava/lang/String;

    .line 25
    .line 26
    const-string v7, "+"

    .line 27
    .line 28
    const-string v8, ""

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v7, v6}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v2, v2, La/cm90;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v6, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;

    .line 42
    .line 43
    invoke-direct {v6, v8, v5, v2}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object/from16 v22, v6

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v5, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;

    .line 50
    .line 51
    invoke-static {v7, v6}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iget-object v2, v2, La/cm90;->d:Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {v5, v8, v6, v2}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v22, v5

    .line 61
    .line 62
    :goto_0
    new-instance v5, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 63
    .line 64
    iget v6, v1, La/rkt;->a:I

    .line 65
    .line 66
    iget-object v9, v1, La/rkt;->b:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v10, v1, La/rkt;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-wide v7, v1, La/rkt;->e:J

    .line 71
    .line 72
    iget-object v11, v1, La/rkt;->d:Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct/range {v5 .. v11}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const v44, -0x20041

    .line 78
    .line 79
    .line 80
    const/16 v45, 0x7f

    .line 81
    .line 82
    move-object v11, v5

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v10, 0x0

    .line 89
    const/4 v12, 0x0

    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v14, 0x0

    .line 92
    const/4 v15, 0x0

    .line 93
    const/16 v16, 0x0

    .line 94
    .line 95
    const/16 v17, 0x0

    .line 96
    .line 97
    const/16 v18, 0x0

    .line 98
    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    const/16 v20, 0x0

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const/16 v23, 0x0

    .line 106
    .line 107
    const/16 v24, 0x0

    .line 108
    .line 109
    const/16 v25, 0x0

    .line 110
    .line 111
    const/16 v26, 0x0

    .line 112
    .line 113
    const/16 v27, 0x0

    .line 114
    .line 115
    const/16 v28, 0x0

    .line 116
    .line 117
    const/16 v29, 0x0

    .line 118
    .line 119
    const/16 v30, 0x0

    .line 120
    .line 121
    const/16 v31, 0x0

    .line 122
    .line 123
    const/16 v32, 0x0

    .line 124
    .line 125
    const/16 v33, 0x0

    .line 126
    .line 127
    const/16 v34, 0x0

    .line 128
    .line 129
    const/16 v35, 0x0

    .line 130
    .line 131
    const/16 v36, 0x0

    .line 132
    .line 133
    const/16 v37, 0x0

    .line 134
    .line 135
    const/16 v38, 0x0

    .line 136
    .line 137
    const/16 v39, 0x0

    .line 138
    .line 139
    const/16 v40, 0x0

    .line 140
    .line 141
    const/16 v41, 0x0

    .line 142
    .line 143
    const/16 v42, 0x0

    .line 144
    .line 145
    const/16 v43, 0x0

    .line 146
    .line 147
    invoke-static/range {v4 .. v45}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    sget-object v2, La/u0f0;->d:La/u0f0;

    .line 152
    .line 153
    sget-object v4, La/u0f0;->h:La/u0f0;

    .line 154
    .line 155
    filled-new-array {v2, v4}, [La/u0f0;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v3, v2}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/vzg0;

    .line 173
    .line 174
    const-string v3, "COUNTRY"

    .line 175
    .line 176
    iget-object v4, v1, La/r1f0;->g:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 177
    .line 178
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    const-string v3, "PHONE"

    .line 182
    .line 183
    iget-object v4, v1, La/r1f0;->r:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;

    .line 184
    .line 185
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    new-instance v0, Lkotlin/Pair;

    .line 189
    .line 190
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    return-object v0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/igt;

    .line 6
    .line 7
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/g090;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, La/u4f0;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v2, La/u4f0;->g:La/r1f0;

    .line 19
    .line 20
    iget v1, v1, La/igt;->a:I

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v35

    .line 26
    const v43, 0x7fffffff

    .line 27
    .line 28
    .line 29
    const/16 v44, 0x7f

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x0

    .line 41
    const/4 v14, 0x0

    .line 42
    const/4 v15, 0x0

    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    const/16 v17, 0x0

    .line 46
    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x0

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    const/16 v21, 0x0

    .line 54
    .line 55
    const/16 v22, 0x0

    .line 56
    .line 57
    const/16 v23, 0x0

    .line 58
    .line 59
    const/16 v24, 0x0

    .line 60
    .line 61
    const/16 v25, 0x0

    .line 62
    .line 63
    const/16 v26, 0x0

    .line 64
    .line 65
    const/16 v27, 0x0

    .line 66
    .line 67
    const/16 v28, 0x0

    .line 68
    .line 69
    const/16 v29, 0x0

    .line 70
    .line 71
    const/16 v30, 0x0

    .line 72
    .line 73
    const/16 v31, 0x0

    .line 74
    .line 75
    const/16 v32, 0x0

    .line 76
    .line 77
    const/16 v33, 0x0

    .line 78
    .line 79
    const/16 v34, 0x0

    .line 80
    .line 81
    const/16 v36, 0x0

    .line 82
    .line 83
    const/16 v37, 0x0

    .line 84
    .line 85
    const/16 v38, 0x0

    .line 86
    .line 87
    const/16 v39, 0x0

    .line 88
    .line 89
    const/16 v40, 0x0

    .line 90
    .line 91
    const/16 v41, 0x0

    .line 92
    .line 93
    const/16 v42, 0x0

    .line 94
    .line 95
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    sget-object v3, La/u0f0;->r:La/u0f0;

    .line 100
    .line 101
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v3}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, La/vzg0;

    .line 115
    .line 116
    const-string v3, "GENDER"

    .line 117
    .line 118
    iget-object v4, v1, La/r1f0;->F:Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, Lkotlin/Pair;

    .line 124
    .line 125
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-object v0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object/from16 v33, v1

    .line 6
    .line 7
    check-cast v33, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;

    .line 8
    .line 9
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/g090;

    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/u4f0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, La/u4f0;->g:La/r1f0;

    .line 21
    .line 22
    const v42, -0x40000001    # -1.9999999f

    .line 23
    .line 24
    .line 25
    const/16 v43, 0x7f

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    const/16 v17, 0x0

    .line 43
    .line 44
    const/16 v18, 0x0

    .line 45
    .line 46
    const/16 v19, 0x0

    .line 47
    .line 48
    const/16 v20, 0x0

    .line 49
    .line 50
    const/16 v21, 0x0

    .line 51
    .line 52
    const/16 v22, 0x0

    .line 53
    .line 54
    const/16 v23, 0x0

    .line 55
    .line 56
    const/16 v24, 0x0

    .line 57
    .line 58
    const/16 v25, 0x0

    .line 59
    .line 60
    const/16 v26, 0x0

    .line 61
    .line 62
    const/16 v27, 0x0

    .line 63
    .line 64
    const/16 v28, 0x0

    .line 65
    .line 66
    const/16 v29, 0x0

    .line 67
    .line 68
    const/16 v30, 0x0

    .line 69
    .line 70
    const/16 v31, 0x0

    .line 71
    .line 72
    const/16 v32, 0x0

    .line 73
    .line 74
    const/16 v34, 0x0

    .line 75
    .line 76
    const/16 v35, 0x0

    .line 77
    .line 78
    const/16 v36, 0x0

    .line 79
    .line 80
    const/16 v37, 0x0

    .line 81
    .line 82
    const/16 v38, 0x0

    .line 83
    .line 84
    const/16 v39, 0x0

    .line 85
    .line 86
    const/16 v40, 0x0

    .line 87
    .line 88
    const/16 v41, 0x0

    .line 89
    .line 90
    invoke-static/range {v2 .. v43}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sget-object v3, La/u0f0;->j:La/u0f0;

    .line 95
    .line 96
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v3}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, La/vzg0;

    .line 110
    .line 111
    const-string v3, "SOCIAL"

    .line 112
    .line 113
    iget-object v4, v2, La/r1f0;->E:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;

    .line 114
    .line 115
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lkotlin/Pair;

    .line 119
    .line 120
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/x5f0;

    .line 6
    .line 7
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/qu4;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, La/k0w0;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v1, La/x5f0;->o:La/sek;

    .line 19
    .line 20
    new-instance v4, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;

    .line 21
    .line 22
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, La/u4f0;

    .line 27
    .line 28
    iget-object v5, v5, La/u4f0;->g:La/r1f0;

    .line 29
    .line 30
    iget-object v5, v5, La/r1f0;->k:Ljava/lang/String;

    .line 31
    .line 32
    const-string v6, ""

    .line 33
    .line 34
    if-nez v5, :cond_0

    .line 35
    .line 36
    move-object v8, v6

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v8, v5

    .line 39
    :goto_0
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, La/u4f0;

    .line 44
    .line 45
    iget-object v5, v5, La/u4f0;->g:La/r1f0;

    .line 46
    .line 47
    iget-object v5, v5, La/r1f0;->u:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    move-object v9, v6

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v9, v5

    .line 54
    :goto_1
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, La/u4f0;

    .line 59
    .line 60
    iget-object v5, v5, La/u4f0;->g:La/r1f0;

    .line 61
    .line 62
    iget-object v5, v5, La/r1f0;->M:La/q7f0;

    .line 63
    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    iget-byte v5, v5, La/q7f0;->a:B

    .line 67
    .line 68
    :goto_2
    move v10, v5

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    sget-object v5, La/q7f0;->b:La/gne0;

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    goto :goto_2

    .line 74
    :goto_3
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, La/u4f0;

    .line 79
    .line 80
    iget-object v5, v5, La/u4f0;->g:La/r1f0;

    .line 81
    .line 82
    iget-object v5, v5, La/r1f0;->g:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 83
    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    iget v5, v5, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;->a:I

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_3
    const/4 v5, -0x1

    .line 90
    :goto_4
    int-to-long v14, v5

    .line 91
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, La/u4f0;

    .line 96
    .line 97
    iget-object v5, v5, La/u4f0;->g:La/r1f0;

    .line 98
    .line 99
    iget-object v5, v5, La/r1f0;->g:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    if-eqz v5, :cond_4

    .line 103
    .line 104
    iget-object v5, v5, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;->b:Ljava/lang/String;

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_4
    move-object v5, v7

    .line 108
    :goto_5
    if-nez v5, :cond_5

    .line 109
    .line 110
    move-object v11, v6

    .line 111
    goto :goto_6

    .line 112
    :cond_5
    move-object v11, v5

    .line 113
    :goto_6
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    check-cast v5, La/u4f0;

    .line 118
    .line 119
    iget-object v5, v5, La/u4f0;->g:La/r1f0;

    .line 120
    .line 121
    iget-object v5, v5, La/r1f0;->h:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 122
    .line 123
    if-eqz v5, :cond_6

    .line 124
    .line 125
    iget-object v5, v5, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;->b:Ljava/lang/String;

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_6
    move-object v5, v7

    .line 129
    :goto_7
    if-nez v5, :cond_7

    .line 130
    .line 131
    move-object v12, v6

    .line 132
    goto :goto_8

    .line 133
    :cond_7
    move-object v12, v5

    .line 134
    :goto_8
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, La/u4f0;

    .line 139
    .line 140
    iget-object v5, v5, La/u4f0;->g:La/r1f0;

    .line 141
    .line 142
    iget-object v5, v5, La/r1f0;->c:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;

    .line 143
    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    iget-object v5, v5, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;->b:Ljava/lang/String;

    .line 147
    .line 148
    goto :goto_9

    .line 149
    :cond_8
    move-object v5, v7

    .line 150
    :goto_9
    if-nez v5, :cond_9

    .line 151
    .line 152
    move-object v13, v6

    .line 153
    goto :goto_a

    .line 154
    :cond_9
    move-object v13, v5

    .line 155
    :goto_a
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, La/u4f0;

    .line 160
    .line 161
    iget-object v5, v5, La/u4f0;->g:La/r1f0;

    .line 162
    .line 163
    iget-object v5, v5, La/r1f0;->g:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 164
    .line 165
    if-eqz v5, :cond_a

    .line 166
    .line 167
    iget-object v7, v5, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;->e:Ljava/lang/String;

    .line 168
    .line 169
    :cond_a
    if-nez v7, :cond_b

    .line 170
    .line 171
    move-object/from16 v16, v6

    .line 172
    .line 173
    goto :goto_b

    .line 174
    :cond_b
    move-object/from16 v16, v7

    .line 175
    .line 176
    :goto_b
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, La/u4f0;

    .line 181
    .line 182
    iget-object v5, v5, La/u4f0;->A:La/cne0;

    .line 183
    .line 184
    iget-object v5, v5, La/cne0;->a:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, La/u4f0;

    .line 191
    .line 192
    iget-object v1, v1, La/u4f0;->g:La/r1f0;

    .line 193
    .line 194
    iget-object v1, v1, La/r1f0;->D:Ljava/lang/Integer;

    .line 195
    .line 196
    new-instance v7, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;

    .line 197
    .line 198
    move-object/from16 v18, v1

    .line 199
    .line 200
    move-object/from16 v17, v5

    .line 201
    .line 202
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 203
    .line 204
    .line 205
    new-instance v1, La/swp0;

    .line 206
    .line 207
    iget-object v5, v0, La/qu4;->a:Ljava/lang/String;

    .line 208
    .line 209
    iget-object v0, v0, La/qu4;->b:Ljava/lang/String;

    .line 210
    .line 211
    const/4 v6, 0x0

    .line 212
    invoke-direct {v1, v5, v0, v6}, La/swp0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 213
    .line 214
    .line 215
    invoke-direct {v4, v7, v1}, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;-><init>(Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;La/swp0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v0, Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;

    .line 222
    .line 223
    invoke-direct {v0, v4}, Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;-><init>(Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 227
    .line 228
    .line 229
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La/xwe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/d7f0;

    .line 4
    .line 5
    iget-object p0, p0, La/xwe0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/fn50;

    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/d7f0;->I:La/kwd;

    .line 15
    .line 16
    iget-object v1, p0, La/fn50;->b:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, La/fn50;->f:Ljava/lang/String;

    .line 19
    .line 20
    iget-boolean v3, p0, La/fn50;->d:Z

    .line 21
    .line 22
    const-string v4, "KEY_REQUEST_CONFIRMATION_NEW_PLACE"

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    new-instance v3, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;

    .line 27
    .line 28
    iget-object p0, p0, La/fn50;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {v3, v1, v4, v2, p0}, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-boolean v3, p0, La/fn50;->e:Z

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v3, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;

    .line 39
    .line 40
    sget-object p0, Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras$None;->a:Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras$None;

    .line 41
    .line 42
    invoke-direct {v3, v1, v4, v2, p0}, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v3, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Simple;

    .line 47
    .line 48
    iget-boolean p0, p0, La/fn50;->g:Z

    .line 49
    .line 50
    invoke-direct {v3, v1, v4, v2, p0}, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance p0, Lorg/xplatform/login/new_place/impl/navigation/ConfirmationNewPlaceScreen;

    .line 57
    .line 58
    invoke-direct {p0, v3}, Lorg/xplatform/login/new_place/impl/navigation/ConfirmationNewPlaceScreen;-><init>(Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/xwe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    iget-object p0, p0, La/xwe0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/i3t0;

    .line 8
    .line 9
    check-cast p1, La/x7f0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, La/x7f0;->a:La/x7f0;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, La/x7f0;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p1, La/r7f0;->a:La/r7f0;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/j910;

    .line 6
    .line 7
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/u0f0;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, La/mbf0;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v2, La/mbf0;->g:La/p1f0;

    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v4}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v1, v1, La/j910;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, La/vzg0;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/16 v6, 0x1d

    .line 40
    .line 41
    if-eq v5, v6, :cond_3

    .line 42
    .line 43
    const/16 v6, 0x1e

    .line 44
    .line 45
    if-eq v5, v6, :cond_2

    .line 46
    .line 47
    const/16 v6, 0x26

    .line 48
    .line 49
    if-eq v5, v6, :cond_1

    .line 50
    .line 51
    const/16 v6, 0x27

    .line 52
    .line 53
    if-eq v5, v6, :cond_0

    .line 54
    .line 55
    packed-switch v5, :pswitch_data_0

    .line 56
    .line 57
    .line 58
    iget-object v0, v2, La/mbf0;->e:Ljava/util/Map;

    .line 59
    .line 60
    new-instance v1, Lkotlin/Pair;

    .line 61
    .line 62
    invoke-direct {v1, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :pswitch_0
    iget-boolean v2, v3, La/p1f0;->y:Z

    .line 67
    .line 68
    xor-int/lit8 v28, v2, 0x1

    .line 69
    .line 70
    const v43, -0x1000001

    .line 71
    .line 72
    .line 73
    const/16 v44, 0x7f

    .line 74
    .line 75
    move-object v2, v4

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v11, 0x0

    .line 84
    const/4 v12, 0x0

    .line 85
    const/4 v13, 0x0

    .line 86
    const/4 v14, 0x0

    .line 87
    const/4 v15, 0x0

    .line 88
    const/16 v16, 0x0

    .line 89
    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0x0

    .line 95
    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const/16 v22, 0x0

    .line 101
    .line 102
    const/16 v23, 0x0

    .line 103
    .line 104
    const/16 v24, 0x0

    .line 105
    .line 106
    const/16 v25, 0x0

    .line 107
    .line 108
    const/16 v26, 0x0

    .line 109
    .line 110
    const/16 v27, 0x0

    .line 111
    .line 112
    const/16 v29, 0x0

    .line 113
    .line 114
    const/16 v30, 0x0

    .line 115
    .line 116
    const/16 v31, 0x0

    .line 117
    .line 118
    const/16 v32, 0x0

    .line 119
    .line 120
    const/16 v33, 0x0

    .line 121
    .line 122
    const/16 v34, 0x0

    .line 123
    .line 124
    const/16 v35, 0x0

    .line 125
    .line 126
    const/16 v36, 0x0

    .line 127
    .line 128
    const/16 v37, 0x0

    .line 129
    .line 130
    const/16 v38, 0x0

    .line 131
    .line 132
    const/16 v39, 0x0

    .line 133
    .line 134
    const/16 v40, 0x0

    .line 135
    .line 136
    const/16 v41, 0x0

    .line 137
    .line 138
    const/16 v42, 0x0

    .line 139
    .line 140
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-boolean v4, v3, La/p1f0;->y:Z

    .line 149
    .line 150
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    new-instance v0, Lkotlin/Pair;

    .line 158
    .line 159
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_1
    move-object v2, v4

    .line 164
    iget-boolean v4, v3, La/p1f0;->x:Z

    .line 165
    .line 166
    xor-int/lit8 v27, v4, 0x1

    .line 167
    .line 168
    const v43, -0x800001

    .line 169
    .line 170
    .line 171
    const/16 v44, 0x7f

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v8, 0x0

    .line 178
    const/4 v9, 0x0

    .line 179
    const/4 v10, 0x0

    .line 180
    const/4 v11, 0x0

    .line 181
    const/4 v12, 0x0

    .line 182
    const/4 v13, 0x0

    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const/16 v19, 0x0

    .line 192
    .line 193
    const/16 v20, 0x0

    .line 194
    .line 195
    const/16 v21, 0x0

    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const/16 v23, 0x0

    .line 200
    .line 201
    const/16 v24, 0x0

    .line 202
    .line 203
    const/16 v25, 0x0

    .line 204
    .line 205
    const/16 v26, 0x0

    .line 206
    .line 207
    const/16 v28, 0x0

    .line 208
    .line 209
    const/16 v29, 0x0

    .line 210
    .line 211
    const/16 v30, 0x0

    .line 212
    .line 213
    const/16 v31, 0x0

    .line 214
    .line 215
    const/16 v32, 0x0

    .line 216
    .line 217
    const/16 v33, 0x0

    .line 218
    .line 219
    const/16 v34, 0x0

    .line 220
    .line 221
    const/16 v35, 0x0

    .line 222
    .line 223
    const/16 v36, 0x0

    .line 224
    .line 225
    const/16 v37, 0x0

    .line 226
    .line 227
    const/16 v38, 0x0

    .line 228
    .line 229
    const/16 v39, 0x0

    .line 230
    .line 231
    const/16 v40, 0x0

    .line 232
    .line 233
    const/16 v41, 0x0

    .line 234
    .line 235
    const/16 v42, 0x0

    .line 236
    .line 237
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-boolean v4, v3, La/p1f0;->x:Z

    .line 246
    .line 247
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    new-instance v0, Lkotlin/Pair;

    .line 255
    .line 256
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_2
    move-object v2, v4

    .line 261
    iget-boolean v4, v3, La/p1f0;->C:Z

    .line 262
    .line 263
    xor-int/lit8 v32, v4, 0x1

    .line 264
    .line 265
    const v43, -0x10000001

    .line 266
    .line 267
    .line 268
    const/16 v44, 0x7f

    .line 269
    .line 270
    const/4 v4, 0x0

    .line 271
    const/4 v5, 0x0

    .line 272
    const/4 v6, 0x0

    .line 273
    const/4 v7, 0x0

    .line 274
    const/4 v8, 0x0

    .line 275
    const/4 v9, 0x0

    .line 276
    const/4 v10, 0x0

    .line 277
    const/4 v11, 0x0

    .line 278
    const/4 v12, 0x0

    .line 279
    const/4 v13, 0x0

    .line 280
    const/4 v14, 0x0

    .line 281
    const/4 v15, 0x0

    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    const/16 v19, 0x0

    .line 289
    .line 290
    const/16 v20, 0x0

    .line 291
    .line 292
    const/16 v21, 0x0

    .line 293
    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    const/16 v23, 0x0

    .line 297
    .line 298
    const/16 v24, 0x0

    .line 299
    .line 300
    const/16 v25, 0x0

    .line 301
    .line 302
    const/16 v26, 0x0

    .line 303
    .line 304
    const/16 v27, 0x0

    .line 305
    .line 306
    const/16 v28, 0x0

    .line 307
    .line 308
    const/16 v29, 0x0

    .line 309
    .line 310
    const/16 v30, 0x0

    .line 311
    .line 312
    const/16 v31, 0x0

    .line 313
    .line 314
    const/16 v33, 0x0

    .line 315
    .line 316
    const/16 v34, 0x0

    .line 317
    .line 318
    const/16 v35, 0x0

    .line 319
    .line 320
    const/16 v36, 0x0

    .line 321
    .line 322
    const/16 v37, 0x0

    .line 323
    .line 324
    const/16 v38, 0x0

    .line 325
    .line 326
    const/16 v39, 0x0

    .line 327
    .line 328
    const/16 v40, 0x0

    .line 329
    .line 330
    const/16 v41, 0x0

    .line 331
    .line 332
    const/16 v42, 0x0

    .line 333
    .line 334
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iget-boolean v4, v3, La/p1f0;->C:Z

    .line 343
    .line 344
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    new-instance v0, Lkotlin/Pair;

    .line 352
    .line 353
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    return-object v0

    .line 357
    :pswitch_3
    move-object v2, v4

    .line 358
    iget-boolean v4, v3, La/p1f0;->e:Z

    .line 359
    .line 360
    xor-int/lit8 v8, v4, 0x1

    .line 361
    .line 362
    const/16 v43, -0x11

    .line 363
    .line 364
    const/16 v44, 0x7f

    .line 365
    .line 366
    const/4 v4, 0x0

    .line 367
    const/4 v5, 0x0

    .line 368
    const/4 v6, 0x0

    .line 369
    const/4 v7, 0x0

    .line 370
    const/4 v9, 0x0

    .line 371
    const/4 v10, 0x0

    .line 372
    const/4 v11, 0x0

    .line 373
    const/4 v12, 0x0

    .line 374
    const/4 v13, 0x0

    .line 375
    const/4 v14, 0x0

    .line 376
    const/4 v15, 0x0

    .line 377
    const/16 v16, 0x0

    .line 378
    .line 379
    const/16 v17, 0x0

    .line 380
    .line 381
    const/16 v18, 0x0

    .line 382
    .line 383
    const/16 v19, 0x0

    .line 384
    .line 385
    const/16 v20, 0x0

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    const/16 v23, 0x0

    .line 392
    .line 393
    const/16 v24, 0x0

    .line 394
    .line 395
    const/16 v25, 0x0

    .line 396
    .line 397
    const/16 v26, 0x0

    .line 398
    .line 399
    const/16 v27, 0x0

    .line 400
    .line 401
    const/16 v28, 0x0

    .line 402
    .line 403
    const/16 v29, 0x0

    .line 404
    .line 405
    const/16 v30, 0x0

    .line 406
    .line 407
    const/16 v31, 0x0

    .line 408
    .line 409
    const/16 v32, 0x0

    .line 410
    .line 411
    const/16 v33, 0x0

    .line 412
    .line 413
    const/16 v34, 0x0

    .line 414
    .line 415
    const/16 v35, 0x0

    .line 416
    .line 417
    const/16 v36, 0x0

    .line 418
    .line 419
    const/16 v37, 0x0

    .line 420
    .line 421
    const/16 v38, 0x0

    .line 422
    .line 423
    const/16 v39, 0x0

    .line 424
    .line 425
    const/16 v40, 0x0

    .line 426
    .line 427
    const/16 v41, 0x0

    .line 428
    .line 429
    const/16 v42, 0x0

    .line 430
    .line 431
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    iget-boolean v4, v3, La/p1f0;->e:Z

    .line 440
    .line 441
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    new-instance v0, Lkotlin/Pair;

    .line 449
    .line 450
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_4
    move-object v2, v4

    .line 455
    iget-boolean v4, v3, La/p1f0;->A:Z

    .line 456
    .line 457
    xor-int/lit8 v30, v4, 0x1

    .line 458
    .line 459
    const v43, -0x4000001

    .line 460
    .line 461
    .line 462
    const/16 v44, 0x7f

    .line 463
    .line 464
    const/4 v4, 0x0

    .line 465
    const/4 v5, 0x0

    .line 466
    const/4 v6, 0x0

    .line 467
    const/4 v7, 0x0

    .line 468
    const/4 v8, 0x0

    .line 469
    const/4 v9, 0x0

    .line 470
    const/4 v10, 0x0

    .line 471
    const/4 v11, 0x0

    .line 472
    const/4 v12, 0x0

    .line 473
    const/4 v13, 0x0

    .line 474
    const/4 v14, 0x0

    .line 475
    const/4 v15, 0x0

    .line 476
    const/16 v16, 0x0

    .line 477
    .line 478
    const/16 v17, 0x0

    .line 479
    .line 480
    const/16 v18, 0x0

    .line 481
    .line 482
    const/16 v19, 0x0

    .line 483
    .line 484
    const/16 v20, 0x0

    .line 485
    .line 486
    const/16 v21, 0x0

    .line 487
    .line 488
    const/16 v22, 0x0

    .line 489
    .line 490
    const/16 v23, 0x0

    .line 491
    .line 492
    const/16 v24, 0x0

    .line 493
    .line 494
    const/16 v25, 0x0

    .line 495
    .line 496
    const/16 v26, 0x0

    .line 497
    .line 498
    const/16 v27, 0x0

    .line 499
    .line 500
    const/16 v28, 0x0

    .line 501
    .line 502
    const/16 v29, 0x0

    .line 503
    .line 504
    const/16 v31, 0x0

    .line 505
    .line 506
    const/16 v32, 0x0

    .line 507
    .line 508
    const/16 v33, 0x0

    .line 509
    .line 510
    const/16 v34, 0x0

    .line 511
    .line 512
    const/16 v35, 0x0

    .line 513
    .line 514
    const/16 v36, 0x0

    .line 515
    .line 516
    const/16 v37, 0x0

    .line 517
    .line 518
    const/16 v38, 0x0

    .line 519
    .line 520
    const/16 v39, 0x0

    .line 521
    .line 522
    const/16 v40, 0x0

    .line 523
    .line 524
    const/16 v41, 0x0

    .line 525
    .line 526
    const/16 v42, 0x0

    .line 527
    .line 528
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    iget-boolean v4, v3, La/p1f0;->A:Z

    .line 537
    .line 538
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    new-instance v0, Lkotlin/Pair;

    .line 546
    .line 547
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    return-object v0

    .line 551
    :pswitch_5
    move-object v2, v4

    .line 552
    iget-boolean v4, v3, La/p1f0;->B:Z

    .line 553
    .line 554
    xor-int/lit8 v31, v4, 0x1

    .line 555
    .line 556
    const v43, -0x8000001

    .line 557
    .line 558
    .line 559
    const/16 v44, 0x7f

    .line 560
    .line 561
    const/4 v4, 0x0

    .line 562
    const/4 v5, 0x0

    .line 563
    const/4 v6, 0x0

    .line 564
    const/4 v7, 0x0

    .line 565
    const/4 v8, 0x0

    .line 566
    const/4 v9, 0x0

    .line 567
    const/4 v10, 0x0

    .line 568
    const/4 v11, 0x0

    .line 569
    const/4 v12, 0x0

    .line 570
    const/4 v13, 0x0

    .line 571
    const/4 v14, 0x0

    .line 572
    const/4 v15, 0x0

    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    const/16 v17, 0x0

    .line 576
    .line 577
    const/16 v18, 0x0

    .line 578
    .line 579
    const/16 v19, 0x0

    .line 580
    .line 581
    const/16 v20, 0x0

    .line 582
    .line 583
    const/16 v21, 0x0

    .line 584
    .line 585
    const/16 v22, 0x0

    .line 586
    .line 587
    const/16 v23, 0x0

    .line 588
    .line 589
    const/16 v24, 0x0

    .line 590
    .line 591
    const/16 v25, 0x0

    .line 592
    .line 593
    const/16 v26, 0x0

    .line 594
    .line 595
    const/16 v27, 0x0

    .line 596
    .line 597
    const/16 v28, 0x0

    .line 598
    .line 599
    const/16 v29, 0x0

    .line 600
    .line 601
    const/16 v30, 0x0

    .line 602
    .line 603
    const/16 v32, 0x0

    .line 604
    .line 605
    const/16 v33, 0x0

    .line 606
    .line 607
    const/16 v34, 0x0

    .line 608
    .line 609
    const/16 v35, 0x0

    .line 610
    .line 611
    const/16 v36, 0x0

    .line 612
    .line 613
    const/16 v37, 0x0

    .line 614
    .line 615
    const/16 v38, 0x0

    .line 616
    .line 617
    const/16 v39, 0x0

    .line 618
    .line 619
    const/16 v40, 0x0

    .line 620
    .line 621
    const/16 v41, 0x0

    .line 622
    .line 623
    const/16 v42, 0x0

    .line 624
    .line 625
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    iget-boolean v4, v3, La/p1f0;->B:Z

    .line 634
    .line 635
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    new-instance v0, Lkotlin/Pair;

    .line 643
    .line 644
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    return-object v0

    .line 648
    :cond_0
    move-object v2, v4

    .line 649
    iget-boolean v4, v3, La/p1f0;->L:Z

    .line 650
    .line 651
    xor-int/lit8 v41, v4, 0x1

    .line 652
    .line 653
    const/16 v43, -0x1

    .line 654
    .line 655
    const/16 v44, 0x5f

    .line 656
    .line 657
    const/4 v4, 0x0

    .line 658
    const/4 v5, 0x0

    .line 659
    const/4 v6, 0x0

    .line 660
    const/4 v7, 0x0

    .line 661
    const/4 v8, 0x0

    .line 662
    const/4 v9, 0x0

    .line 663
    const/4 v10, 0x0

    .line 664
    const/4 v11, 0x0

    .line 665
    const/4 v12, 0x0

    .line 666
    const/4 v13, 0x0

    .line 667
    const/4 v14, 0x0

    .line 668
    const/4 v15, 0x0

    .line 669
    const/16 v16, 0x0

    .line 670
    .line 671
    const/16 v17, 0x0

    .line 672
    .line 673
    const/16 v18, 0x0

    .line 674
    .line 675
    const/16 v19, 0x0

    .line 676
    .line 677
    const/16 v20, 0x0

    .line 678
    .line 679
    const/16 v21, 0x0

    .line 680
    .line 681
    const/16 v22, 0x0

    .line 682
    .line 683
    const/16 v23, 0x0

    .line 684
    .line 685
    const/16 v24, 0x0

    .line 686
    .line 687
    const/16 v25, 0x0

    .line 688
    .line 689
    const/16 v26, 0x0

    .line 690
    .line 691
    const/16 v27, 0x0

    .line 692
    .line 693
    const/16 v28, 0x0

    .line 694
    .line 695
    const/16 v29, 0x0

    .line 696
    .line 697
    const/16 v30, 0x0

    .line 698
    .line 699
    const/16 v31, 0x0

    .line 700
    .line 701
    const/16 v32, 0x0

    .line 702
    .line 703
    const/16 v33, 0x0

    .line 704
    .line 705
    const/16 v34, 0x0

    .line 706
    .line 707
    const/16 v35, 0x0

    .line 708
    .line 709
    const/16 v36, 0x0

    .line 710
    .line 711
    const/16 v37, 0x0

    .line 712
    .line 713
    const/16 v38, 0x0

    .line 714
    .line 715
    const/16 v39, 0x0

    .line 716
    .line 717
    const/16 v40, 0x0

    .line 718
    .line 719
    const/16 v42, 0x0

    .line 720
    .line 721
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    iget-boolean v4, v3, La/p1f0;->L:Z

    .line 730
    .line 731
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    new-instance v0, Lkotlin/Pair;

    .line 739
    .line 740
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    return-object v0

    .line 744
    :cond_1
    move-object v2, v4

    .line 745
    iget-boolean v4, v3, La/p1f0;->f:Z

    .line 746
    .line 747
    xor-int/lit8 v9, v4, 0x1

    .line 748
    .line 749
    const/16 v43, -0x21

    .line 750
    .line 751
    const/16 v44, 0x7f

    .line 752
    .line 753
    const/4 v4, 0x0

    .line 754
    const/4 v5, 0x0

    .line 755
    const/4 v6, 0x0

    .line 756
    const/4 v7, 0x0

    .line 757
    const/4 v8, 0x0

    .line 758
    const/4 v10, 0x0

    .line 759
    const/4 v11, 0x0

    .line 760
    const/4 v12, 0x0

    .line 761
    const/4 v13, 0x0

    .line 762
    const/4 v14, 0x0

    .line 763
    const/4 v15, 0x0

    .line 764
    const/16 v16, 0x0

    .line 765
    .line 766
    const/16 v17, 0x0

    .line 767
    .line 768
    const/16 v18, 0x0

    .line 769
    .line 770
    const/16 v19, 0x0

    .line 771
    .line 772
    const/16 v20, 0x0

    .line 773
    .line 774
    const/16 v21, 0x0

    .line 775
    .line 776
    const/16 v22, 0x0

    .line 777
    .line 778
    const/16 v23, 0x0

    .line 779
    .line 780
    const/16 v24, 0x0

    .line 781
    .line 782
    const/16 v25, 0x0

    .line 783
    .line 784
    const/16 v26, 0x0

    .line 785
    .line 786
    const/16 v27, 0x0

    .line 787
    .line 788
    const/16 v28, 0x0

    .line 789
    .line 790
    const/16 v29, 0x0

    .line 791
    .line 792
    const/16 v30, 0x0

    .line 793
    .line 794
    const/16 v31, 0x0

    .line 795
    .line 796
    const/16 v32, 0x0

    .line 797
    .line 798
    const/16 v33, 0x0

    .line 799
    .line 800
    const/16 v34, 0x0

    .line 801
    .line 802
    const/16 v35, 0x0

    .line 803
    .line 804
    const/16 v36, 0x0

    .line 805
    .line 806
    const/16 v37, 0x0

    .line 807
    .line 808
    const/16 v38, 0x0

    .line 809
    .line 810
    const/16 v39, 0x0

    .line 811
    .line 812
    const/16 v40, 0x0

    .line 813
    .line 814
    const/16 v41, 0x0

    .line 815
    .line 816
    const/16 v42, 0x0

    .line 817
    .line 818
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    iget-boolean v4, v3, La/p1f0;->f:Z

    .line 827
    .line 828
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 829
    .line 830
    .line 831
    move-result-object v4

    .line 832
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    new-instance v0, Lkotlin/Pair;

    .line 836
    .line 837
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    return-object v0

    .line 841
    :cond_2
    move-object v2, v4

    .line 842
    iget-boolean v4, v3, La/p1f0;->b:Z

    .line 843
    .line 844
    xor-int/lit8 v5, v4, 0x1

    .line 845
    .line 846
    const/16 v43, -0x3

    .line 847
    .line 848
    const/16 v44, 0x7f

    .line 849
    .line 850
    const/4 v4, 0x0

    .line 851
    const/4 v6, 0x0

    .line 852
    const/4 v7, 0x0

    .line 853
    const/4 v8, 0x0

    .line 854
    const/4 v9, 0x0

    .line 855
    const/4 v10, 0x0

    .line 856
    const/4 v11, 0x0

    .line 857
    const/4 v12, 0x0

    .line 858
    const/4 v13, 0x0

    .line 859
    const/4 v14, 0x0

    .line 860
    const/4 v15, 0x0

    .line 861
    const/16 v16, 0x0

    .line 862
    .line 863
    const/16 v17, 0x0

    .line 864
    .line 865
    const/16 v18, 0x0

    .line 866
    .line 867
    const/16 v19, 0x0

    .line 868
    .line 869
    const/16 v20, 0x0

    .line 870
    .line 871
    const/16 v21, 0x0

    .line 872
    .line 873
    const/16 v22, 0x0

    .line 874
    .line 875
    const/16 v23, 0x0

    .line 876
    .line 877
    const/16 v24, 0x0

    .line 878
    .line 879
    const/16 v25, 0x0

    .line 880
    .line 881
    const/16 v26, 0x0

    .line 882
    .line 883
    const/16 v27, 0x0

    .line 884
    .line 885
    const/16 v28, 0x0

    .line 886
    .line 887
    const/16 v29, 0x0

    .line 888
    .line 889
    const/16 v30, 0x0

    .line 890
    .line 891
    const/16 v31, 0x0

    .line 892
    .line 893
    const/16 v32, 0x0

    .line 894
    .line 895
    const/16 v33, 0x0

    .line 896
    .line 897
    const/16 v34, 0x0

    .line 898
    .line 899
    const/16 v35, 0x0

    .line 900
    .line 901
    const/16 v36, 0x0

    .line 902
    .line 903
    const/16 v37, 0x0

    .line 904
    .line 905
    const/16 v38, 0x0

    .line 906
    .line 907
    const/16 v39, 0x0

    .line 908
    .line 909
    const/16 v40, 0x0

    .line 910
    .line 911
    const/16 v41, 0x0

    .line 912
    .line 913
    const/16 v42, 0x0

    .line 914
    .line 915
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    iget-boolean v4, v3, La/p1f0;->b:Z

    .line 924
    .line 925
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 926
    .line 927
    .line 928
    move-result-object v4

    .line 929
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 930
    .line 931
    .line 932
    new-instance v0, Lkotlin/Pair;

    .line 933
    .line 934
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    return-object v0

    .line 938
    :cond_3
    move-object v2, v4

    .line 939
    iget-object v4, v3, La/p1f0;->s:Ljava/lang/Boolean;

    .line 940
    .line 941
    const v43, -0x40001

    .line 942
    .line 943
    .line 944
    const/16 v44, 0x7f

    .line 945
    .line 946
    move-object/from16 v22, v4

    .line 947
    .line 948
    const/4 v4, 0x0

    .line 949
    const/4 v5, 0x0

    .line 950
    const/4 v6, 0x0

    .line 951
    const/4 v7, 0x0

    .line 952
    const/4 v8, 0x0

    .line 953
    const/4 v9, 0x0

    .line 954
    const/4 v10, 0x0

    .line 955
    const/4 v11, 0x0

    .line 956
    const/4 v12, 0x0

    .line 957
    const/4 v13, 0x0

    .line 958
    const/4 v14, 0x0

    .line 959
    const/4 v15, 0x0

    .line 960
    const/16 v16, 0x0

    .line 961
    .line 962
    const/16 v17, 0x0

    .line 963
    .line 964
    const/16 v18, 0x0

    .line 965
    .line 966
    const/16 v19, 0x0

    .line 967
    .line 968
    const/16 v20, 0x0

    .line 969
    .line 970
    const/16 v21, 0x0

    .line 971
    .line 972
    const/16 v23, 0x0

    .line 973
    .line 974
    const/16 v24, 0x0

    .line 975
    .line 976
    const/16 v25, 0x0

    .line 977
    .line 978
    const/16 v26, 0x0

    .line 979
    .line 980
    const/16 v27, 0x0

    .line 981
    .line 982
    const/16 v28, 0x0

    .line 983
    .line 984
    const/16 v29, 0x0

    .line 985
    .line 986
    const/16 v30, 0x0

    .line 987
    .line 988
    const/16 v31, 0x0

    .line 989
    .line 990
    const/16 v32, 0x0

    .line 991
    .line 992
    const/16 v33, 0x0

    .line 993
    .line 994
    const/16 v34, 0x0

    .line 995
    .line 996
    const/16 v35, 0x0

    .line 997
    .line 998
    const/16 v36, 0x0

    .line 999
    .line 1000
    const/16 v37, 0x0

    .line 1001
    .line 1002
    const/16 v38, 0x0

    .line 1003
    .line 1004
    const/16 v39, 0x0

    .line 1005
    .line 1006
    const/16 v40, 0x0

    .line 1007
    .line 1008
    const/16 v41, 0x0

    .line 1009
    .line 1010
    const/16 v42, 0x0

    .line 1011
    .line 1012
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v3

    .line 1016
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    iget-object v4, v3, La/p1f0;->s:Ljava/lang/Boolean;

    .line 1021
    .line 1022
    invoke-virtual {v1, v0, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v0, Lkotlin/Pair;

    .line 1026
    .line 1027
    invoke-direct {v0, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    return-object v0

    .line 1031
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/ggt;

    .line 6
    .line 7
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/j910;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, La/mbf0;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v2, La/mbf0;->g:La/p1f0;

    .line 19
    .line 20
    iget v1, v1, La/ggt;->a:I

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v35

    .line 26
    const v43, 0x7fffffff

    .line 27
    .line 28
    .line 29
    const/16 v44, 0x7f

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x0

    .line 41
    const/4 v14, 0x0

    .line 42
    const/4 v15, 0x0

    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    const/16 v17, 0x0

    .line 46
    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x0

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    const/16 v21, 0x0

    .line 54
    .line 55
    const/16 v22, 0x0

    .line 56
    .line 57
    const/16 v23, 0x0

    .line 58
    .line 59
    const/16 v24, 0x0

    .line 60
    .line 61
    const/16 v25, 0x0

    .line 62
    .line 63
    const/16 v26, 0x0

    .line 64
    .line 65
    const/16 v27, 0x0

    .line 66
    .line 67
    const/16 v28, 0x0

    .line 68
    .line 69
    const/16 v29, 0x0

    .line 70
    .line 71
    const/16 v30, 0x0

    .line 72
    .line 73
    const/16 v31, 0x0

    .line 74
    .line 75
    const/16 v32, 0x0

    .line 76
    .line 77
    const/16 v33, 0x0

    .line 78
    .line 79
    const/16 v34, 0x0

    .line 80
    .line 81
    const/16 v36, 0x0

    .line 82
    .line 83
    const/16 v37, 0x0

    .line 84
    .line 85
    const/16 v38, 0x0

    .line 86
    .line 87
    const/16 v39, 0x0

    .line 88
    .line 89
    const/16 v40, 0x0

    .line 90
    .line 91
    const/16 v41, 0x0

    .line 92
    .line 93
    const/16 v42, 0x0

    .line 94
    .line 95
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    sget-object v3, La/u0f0;->r:La/u0f0;

    .line 100
    .line 101
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v3}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, La/vzg0;

    .line 115
    .line 116
    const-string v3, "GENDER"

    .line 117
    .line 118
    iget-object v4, v1, La/p1f0;->F:Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, Lkotlin/Pair;

    .line 124
    .line 125
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-object v0
.end method

.method private final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object/from16 v33, v1

    .line 6
    .line 7
    check-cast v33, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;

    .line 8
    .line 9
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/j910;

    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/mbf0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, La/mbf0;->g:La/p1f0;

    .line 21
    .line 22
    const v42, -0x40000001    # -1.9999999f

    .line 23
    .line 24
    .line 25
    const/16 v43, 0x7f

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    const/16 v17, 0x0

    .line 43
    .line 44
    const/16 v18, 0x0

    .line 45
    .line 46
    const/16 v19, 0x0

    .line 47
    .line 48
    const/16 v20, 0x0

    .line 49
    .line 50
    const/16 v21, 0x0

    .line 51
    .line 52
    const/16 v22, 0x0

    .line 53
    .line 54
    const/16 v23, 0x0

    .line 55
    .line 56
    const/16 v24, 0x0

    .line 57
    .line 58
    const/16 v25, 0x0

    .line 59
    .line 60
    const/16 v26, 0x0

    .line 61
    .line 62
    const/16 v27, 0x0

    .line 63
    .line 64
    const/16 v28, 0x0

    .line 65
    .line 66
    const/16 v29, 0x0

    .line 67
    .line 68
    const/16 v30, 0x0

    .line 69
    .line 70
    const/16 v31, 0x0

    .line 71
    .line 72
    const/16 v32, 0x0

    .line 73
    .line 74
    const/16 v34, 0x0

    .line 75
    .line 76
    const/16 v35, 0x0

    .line 77
    .line 78
    const/16 v36, 0x0

    .line 79
    .line 80
    const/16 v37, 0x0

    .line 81
    .line 82
    const/16 v38, 0x0

    .line 83
    .line 84
    const/16 v39, 0x0

    .line 85
    .line 86
    const/16 v40, 0x0

    .line 87
    .line 88
    const/16 v41, 0x0

    .line 89
    .line 90
    invoke-static/range {v2 .. v43}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sget-object v3, La/u0f0;->j:La/u0f0;

    .line 95
    .line 96
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v3}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, La/vzg0;

    .line 110
    .line 111
    const-string v3, "SOCIAL"

    .line 112
    .line 113
    iget-object v4, v2, La/p1f0;->E:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;

    .line 114
    .line 115
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lkotlin/Pair;

    .line 119
    .line 120
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method private final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object/from16 v23, v1

    .line 6
    .line 7
    check-cast v23, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/j910;

    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/mbf0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, La/mbf0;->g:La/p1f0;

    .line 21
    .line 22
    const v42, -0x100001

    .line 23
    .line 24
    .line 25
    const/16 v43, 0x7f

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    const/16 v17, 0x0

    .line 43
    .line 44
    const/16 v18, 0x0

    .line 45
    .line 46
    const/16 v19, 0x0

    .line 47
    .line 48
    const/16 v20, 0x0

    .line 49
    .line 50
    const/16 v21, 0x0

    .line 51
    .line 52
    const/16 v22, 0x0

    .line 53
    .line 54
    const/16 v24, 0x0

    .line 55
    .line 56
    const/16 v25, 0x0

    .line 57
    .line 58
    const/16 v26, 0x0

    .line 59
    .line 60
    const/16 v27, 0x0

    .line 61
    .line 62
    const/16 v28, 0x0

    .line 63
    .line 64
    const/16 v29, 0x0

    .line 65
    .line 66
    const/16 v30, 0x0

    .line 67
    .line 68
    const/16 v31, 0x0

    .line 69
    .line 70
    const/16 v32, 0x0

    .line 71
    .line 72
    const/16 v33, 0x0

    .line 73
    .line 74
    const/16 v34, 0x0

    .line 75
    .line 76
    const/16 v35, 0x0

    .line 77
    .line 78
    const/16 v36, 0x0

    .line 79
    .line 80
    const/16 v37, 0x0

    .line 81
    .line 82
    const/16 v38, 0x0

    .line 83
    .line 84
    const/16 v39, 0x0

    .line 85
    .line 86
    const/16 v40, 0x0

    .line 87
    .line 88
    const/16 v41, 0x0

    .line 89
    .line 90
    invoke-static/range {v2 .. v43}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sget-object v3, La/u0f0;->u:La/u0f0;

    .line 95
    .line 96
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v3}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, La/vzg0;

    .line 110
    .line 111
    const-string v3, "PROMO_CODE"

    .line 112
    .line 113
    iget-object v4, v2, La/p1f0;->u:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lkotlin/Pair;

    .line 119
    .line 120
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method private final t(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/jkc;

    .line 6
    .line 7
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/j910;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, La/mbf0;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v2, La/mbf0;->g:La/p1f0;

    .line 19
    .line 20
    new-instance v4, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 21
    .line 22
    iget v5, v1, La/jkc;->a:I

    .line 23
    .line 24
    iget-object v1, v1, La/jkc;->b:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    invoke-direct {v4, v1, v5, v6}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 28
    .line 29
    .line 30
    const/16 v43, -0x4001

    .line 31
    .line 32
    const/16 v44, 0x7f

    .line 33
    .line 34
    move-object/from16 v18, v4

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x0

    .line 43
    const/4 v11, 0x0

    .line 44
    const/4 v12, 0x0

    .line 45
    const/4 v13, 0x0

    .line 46
    const/4 v14, 0x0

    .line 47
    const/4 v15, 0x0

    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    const/16 v17, 0x0

    .line 51
    .line 52
    const/16 v19, 0x0

    .line 53
    .line 54
    const/16 v20, 0x0

    .line 55
    .line 56
    const/16 v21, 0x0

    .line 57
    .line 58
    const/16 v22, 0x0

    .line 59
    .line 60
    const/16 v23, 0x0

    .line 61
    .line 62
    const/16 v24, 0x0

    .line 63
    .line 64
    const/16 v25, 0x0

    .line 65
    .line 66
    const/16 v26, 0x0

    .line 67
    .line 68
    const/16 v27, 0x0

    .line 69
    .line 70
    const/16 v28, 0x0

    .line 71
    .line 72
    const/16 v29, 0x0

    .line 73
    .line 74
    const/16 v30, 0x0

    .line 75
    .line 76
    const/16 v31, 0x0

    .line 77
    .line 78
    const/16 v32, 0x0

    .line 79
    .line 80
    const/16 v33, 0x0

    .line 81
    .line 82
    const/16 v34, 0x0

    .line 83
    .line 84
    const/16 v35, 0x0

    .line 85
    .line 86
    const/16 v36, 0x0

    .line 87
    .line 88
    const/16 v37, 0x0

    .line 89
    .line 90
    const/16 v38, 0x0

    .line 91
    .line 92
    const/16 v39, 0x0

    .line 93
    .line 94
    const/16 v40, 0x0

    .line 95
    .line 96
    const/16 v41, 0x0

    .line 97
    .line 98
    const/16 v42, 0x0

    .line 99
    .line 100
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v3, La/u0f0;->o:La/u0f0;

    .line 105
    .line 106
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {v2, v3}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, La/vzg0;

    .line 120
    .line 121
    const-string v3, "CITIZENSHIP"

    .line 122
    .line 123
    iget-object v4, v1, La/p1f0;->o:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 124
    .line 125
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    new-instance v0, Lkotlin/Pair;

    .line 129
    .line 130
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object v0
.end method

.method private final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/rkt;

    .line 6
    .line 7
    iget-object v2, v1, La/rkt;->h:La/cm90;

    .line 8
    .line 9
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/j910;

    .line 12
    .line 13
    move-object/from16 v3, p1

    .line 14
    .line 15
    check-cast v3, La/mbf0;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v4, v3, La/mbf0;->g:La/p1f0;

    .line 21
    .line 22
    iget-object v5, v4, La/p1f0;->r:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;

    .line 23
    .line 24
    iget-object v6, v1, La/rkt;->c:Ljava/lang/String;

    .line 25
    .line 26
    const-string v7, "+"

    .line 27
    .line 28
    const-string v8, ""

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v7, v6}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v6, v2, La/cm90;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget v2, v2, La/cm90;->c:I

    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v7, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;

    .line 48
    .line 49
    invoke-direct {v7, v8, v5, v6, v2}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 50
    .line 51
    .line 52
    move-object/from16 v22, v7

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v5, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;

    .line 56
    .line 57
    invoke-static {v7, v6}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object v7, v2, La/cm90;->d:Ljava/lang/String;

    .line 62
    .line 63
    iget v2, v2, La/cm90;->c:I

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-direct {v5, v8, v6, v7, v2}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v22, v5

    .line 73
    .line 74
    :goto_0
    new-instance v5, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 75
    .line 76
    iget v6, v1, La/rkt;->a:I

    .line 77
    .line 78
    iget-object v9, v1, La/rkt;->b:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v10, v1, La/rkt;->f:Ljava/lang/String;

    .line 81
    .line 82
    iget-wide v7, v1, La/rkt;->e:J

    .line 83
    .line 84
    iget-object v11, v1, La/rkt;->d:Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct/range {v5 .. v11}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const v44, -0x20041

    .line 90
    .line 91
    .line 92
    const/16 v45, 0x7f

    .line 93
    .line 94
    move-object v11, v5

    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v9, 0x0

    .line 100
    const/4 v10, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v13, 0x0

    .line 103
    const/4 v14, 0x0

    .line 104
    const/4 v15, 0x0

    .line 105
    const/16 v16, 0x0

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    const/16 v19, 0x0

    .line 112
    .line 113
    const/16 v20, 0x0

    .line 114
    .line 115
    const/16 v21, 0x0

    .line 116
    .line 117
    const/16 v23, 0x0

    .line 118
    .line 119
    const/16 v24, 0x0

    .line 120
    .line 121
    const/16 v25, 0x0

    .line 122
    .line 123
    const/16 v26, 0x0

    .line 124
    .line 125
    const/16 v27, 0x0

    .line 126
    .line 127
    const/16 v28, 0x0

    .line 128
    .line 129
    const/16 v29, 0x0

    .line 130
    .line 131
    const/16 v30, 0x0

    .line 132
    .line 133
    const/16 v31, 0x0

    .line 134
    .line 135
    const/16 v32, 0x0

    .line 136
    .line 137
    const/16 v33, 0x0

    .line 138
    .line 139
    const/16 v34, 0x0

    .line 140
    .line 141
    const/16 v35, 0x0

    .line 142
    .line 143
    const/16 v36, 0x0

    .line 144
    .line 145
    const/16 v37, 0x0

    .line 146
    .line 147
    const/16 v38, 0x0

    .line 148
    .line 149
    const/16 v39, 0x0

    .line 150
    .line 151
    const/16 v40, 0x0

    .line 152
    .line 153
    const/16 v41, 0x0

    .line 154
    .line 155
    const/16 v42, 0x0

    .line 156
    .line 157
    const/16 v43, 0x0

    .line 158
    .line 159
    invoke-static/range {v4 .. v45}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    sget-object v2, La/u0f0;->d:La/u0f0;

    .line 164
    .line 165
    sget-object v4, La/u0f0;->h:La/u0f0;

    .line 166
    .line 167
    filled-new-array {v2, v4}, [La/u0f0;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-static {v3, v2}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, La/vzg0;

    .line 185
    .line 186
    const-string v3, "COUNTRY"

    .line 187
    .line 188
    iget-object v4, v1, La/p1f0;->g:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 189
    .line 190
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    const-string v3, "PHONE"

    .line 194
    .line 195
    iget-object v4, v1, La/p1f0;->r:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;

    .line 196
    .line 197
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    new-instance v0, Lkotlin/Pair;

    .line 201
    .line 202
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    return-object v0
.end method

.method private final v(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/nq90;

    .line 6
    .line 7
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/j910;

    .line 11
    .line 12
    iget-object v0, v2, La/j910;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/vzg0;

    .line 15
    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    check-cast v3, La/mbf0;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v4, v3, La/mbf0;->g:La/p1f0;

    .line 24
    .line 25
    instance-of v5, v1, La/eq90;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    check-cast v1, La/eq90;

    .line 30
    .line 31
    new-instance v2, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 32
    .line 33
    iget v5, v1, La/eq90;->a:I

    .line 34
    .line 35
    iget-object v1, v1, La/eq90;->b:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct {v2, v1, v5, v6}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 39
    .line 40
    .line 41
    const/16 v44, -0x4201

    .line 42
    .line 43
    const/16 v45, 0x7f

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    const/4 v15, 0x0

    .line 55
    const/16 v16, 0x0

    .line 56
    .line 57
    const/16 v17, 0x0

    .line 58
    .line 59
    const/16 v18, 0x0

    .line 60
    .line 61
    const/16 v20, 0x0

    .line 62
    .line 63
    const/16 v21, 0x0

    .line 64
    .line 65
    const/16 v22, 0x0

    .line 66
    .line 67
    const/16 v23, 0x0

    .line 68
    .line 69
    const/16 v24, 0x0

    .line 70
    .line 71
    const/16 v25, 0x0

    .line 72
    .line 73
    const/16 v26, 0x0

    .line 74
    .line 75
    const/16 v27, 0x0

    .line 76
    .line 77
    const/16 v28, 0x0

    .line 78
    .line 79
    const/16 v29, 0x0

    .line 80
    .line 81
    const/16 v30, 0x0

    .line 82
    .line 83
    const/16 v31, 0x0

    .line 84
    .line 85
    const/16 v32, 0x0

    .line 86
    .line 87
    const/16 v33, 0x0

    .line 88
    .line 89
    const/16 v34, 0x0

    .line 90
    .line 91
    const/16 v35, 0x0

    .line 92
    .line 93
    const/16 v36, 0x0

    .line 94
    .line 95
    const/16 v37, 0x0

    .line 96
    .line 97
    const/16 v38, 0x0

    .line 98
    .line 99
    const/16 v39, 0x0

    .line 100
    .line 101
    const/16 v40, 0x0

    .line 102
    .line 103
    const/16 v41, 0x0

    .line 104
    .line 105
    const/16 v42, 0x0

    .line 106
    .line 107
    const/16 v43, 0x0

    .line 108
    .line 109
    move-object/from16 v19, v2

    .line 110
    .line 111
    invoke-static/range {v4 .. v45}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    sget-object v2, La/u0f0;->o:La/u0f0;

    .line 116
    .line 117
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v3, v2}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const-string v3, "CITIZENSHIP"

    .line 126
    .line 127
    iget-object v4, v1, La/p1f0;->o:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 128
    .line 129
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    new-instance v0, Lkotlin/Pair;

    .line 133
    .line 134
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_0
    instance-of v5, v1, La/fq90;

    .line 139
    .line 140
    const-string v6, "CITY"

    .line 141
    .line 142
    if-eqz v5, :cond_1

    .line 143
    .line 144
    check-cast v1, La/fq90;

    .line 145
    .line 146
    new-instance v8, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;

    .line 147
    .line 148
    iget v2, v1, La/fq90;->a:I

    .line 149
    .line 150
    iget-object v1, v1, La/fq90;->c:Ljava/lang/String;

    .line 151
    .line 152
    invoke-direct {v8, v2, v1}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;-><init>(ILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const/16 v44, -0x9

    .line 156
    .line 157
    const/16 v45, 0x7f

    .line 158
    .line 159
    const/4 v5, 0x0

    .line 160
    move-object v1, v6

    .line 161
    const/4 v6, 0x0

    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v9, 0x0

    .line 164
    const/4 v10, 0x0

    .line 165
    const/4 v11, 0x0

    .line 166
    const/4 v12, 0x0

    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x0

    .line 169
    const/4 v15, 0x0

    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/16 v18, 0x0

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    const/16 v20, 0x0

    .line 179
    .line 180
    const/16 v21, 0x0

    .line 181
    .line 182
    const/16 v22, 0x0

    .line 183
    .line 184
    const/16 v23, 0x0

    .line 185
    .line 186
    const/16 v24, 0x0

    .line 187
    .line 188
    const/16 v25, 0x0

    .line 189
    .line 190
    const/16 v26, 0x0

    .line 191
    .line 192
    const/16 v27, 0x0

    .line 193
    .line 194
    const/16 v28, 0x0

    .line 195
    .line 196
    const/16 v29, 0x0

    .line 197
    .line 198
    const/16 v30, 0x0

    .line 199
    .line 200
    const/16 v31, 0x0

    .line 201
    .line 202
    const/16 v32, 0x0

    .line 203
    .line 204
    const/16 v33, 0x0

    .line 205
    .line 206
    const/16 v34, 0x0

    .line 207
    .line 208
    const/16 v35, 0x0

    .line 209
    .line 210
    const/16 v36, 0x0

    .line 211
    .line 212
    const/16 v37, 0x0

    .line 213
    .line 214
    const/16 v38, 0x0

    .line 215
    .line 216
    const/16 v39, 0x0

    .line 217
    .line 218
    const/16 v40, 0x0

    .line 219
    .line 220
    const/16 v41, 0x0

    .line 221
    .line 222
    const/16 v42, 0x0

    .line 223
    .line 224
    const/16 v43, 0x0

    .line 225
    .line 226
    invoke-static/range {v4 .. v45}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    sget-object v4, La/u0f0;->f:La/u0f0;

    .line 231
    .line 232
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-static {v3, v4}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    iget-object v4, v2, La/p1f0;->d:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;

    .line 241
    .line 242
    invoke-virtual {v0, v1, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    new-instance v0, Lkotlin/Pair;

    .line 246
    .line 247
    invoke-direct {v0, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    return-object v0

    .line 251
    :cond_1
    move-object v5, v6

    .line 252
    instance-of v6, v1, La/gq90;

    .line 253
    .line 254
    if-eqz v6, :cond_2

    .line 255
    .line 256
    check-cast v1, La/gq90;

    .line 257
    .line 258
    new-instance v4, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 259
    .line 260
    iget v5, v1, La/gq90;->a:I

    .line 261
    .line 262
    iget-object v8, v1, La/gq90;->c:Ljava/lang/String;

    .line 263
    .line 264
    iget-object v9, v1, La/gq90;->e:Ljava/lang/String;

    .line 265
    .line 266
    iget-wide v6, v1, La/gq90;->d:J

    .line 267
    .line 268
    iget-object v10, v1, La/gq90;->h:Ljava/lang/String;

    .line 269
    .line 270
    invoke-direct/range {v4 .. v10}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object v5, v1, La/gq90;->f:Ljava/lang/String;

    .line 274
    .line 275
    iget-object v0, v1, La/gq90;->g:La/cm90;

    .line 276
    .line 277
    iget-object v6, v0, La/cm90;->d:Ljava/lang/String;

    .line 278
    .line 279
    iget v0, v0, La/cm90;->c:I

    .line 280
    .line 281
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    sget-object v0, La/u0f0;->d:La/u0f0;

    .line 286
    .line 287
    sget-object v1, La/u0f0;->h:La/u0f0;

    .line 288
    .line 289
    filled-new-array {v0, v1}, [La/u0f0;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-virtual/range {v2 .. v8}, La/j910;->d(La/mbf0;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lkotlin/Pair;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    return-object v0

    .line 302
    :cond_2
    instance-of v6, v1, La/hq90;

    .line 303
    .line 304
    if-eqz v6, :cond_3

    .line 305
    .line 306
    check-cast v1, La/hq90;

    .line 307
    .line 308
    new-instance v12, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 309
    .line 310
    iget v2, v1, La/hq90;->a:I

    .line 311
    .line 312
    iget-object v5, v1, La/hq90;->c:Ljava/lang/String;

    .line 313
    .line 314
    iget-object v1, v1, La/hq90;->d:Ljava/lang/String;

    .line 315
    .line 316
    invoke-direct {v12, v2, v5, v1}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    const/16 v44, -0x81

    .line 320
    .line 321
    const/16 v45, 0x7f

    .line 322
    .line 323
    const/4 v5, 0x0

    .line 324
    const/4 v6, 0x0

    .line 325
    const/4 v7, 0x0

    .line 326
    const/4 v8, 0x0

    .line 327
    const/4 v9, 0x0

    .line 328
    const/4 v10, 0x0

    .line 329
    const/4 v11, 0x0

    .line 330
    const/4 v13, 0x0

    .line 331
    const/4 v14, 0x0

    .line 332
    const/4 v15, 0x0

    .line 333
    const/16 v16, 0x0

    .line 334
    .line 335
    const/16 v17, 0x0

    .line 336
    .line 337
    const/16 v18, 0x0

    .line 338
    .line 339
    const/16 v19, 0x0

    .line 340
    .line 341
    const/16 v20, 0x0

    .line 342
    .line 343
    const/16 v21, 0x0

    .line 344
    .line 345
    const/16 v22, 0x0

    .line 346
    .line 347
    const/16 v23, 0x0

    .line 348
    .line 349
    const/16 v24, 0x0

    .line 350
    .line 351
    const/16 v25, 0x0

    .line 352
    .line 353
    const/16 v26, 0x0

    .line 354
    .line 355
    const/16 v27, 0x0

    .line 356
    .line 357
    const/16 v28, 0x0

    .line 358
    .line 359
    const/16 v29, 0x0

    .line 360
    .line 361
    const/16 v30, 0x0

    .line 362
    .line 363
    const/16 v31, 0x0

    .line 364
    .line 365
    const/16 v32, 0x0

    .line 366
    .line 367
    const/16 v33, 0x0

    .line 368
    .line 369
    const/16 v34, 0x0

    .line 370
    .line 371
    const/16 v35, 0x0

    .line 372
    .line 373
    const/16 v36, 0x0

    .line 374
    .line 375
    const/16 v37, 0x0

    .line 376
    .line 377
    const/16 v38, 0x0

    .line 378
    .line 379
    const/16 v39, 0x0

    .line 380
    .line 381
    const/16 v40, 0x0

    .line 382
    .line 383
    const/16 v41, 0x0

    .line 384
    .line 385
    const/16 v42, 0x0

    .line 386
    .line 387
    const/16 v43, 0x0

    .line 388
    .line 389
    invoke-static/range {v4 .. v45}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    sget-object v2, La/u0f0;->i:La/u0f0;

    .line 394
    .line 395
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    invoke-static {v3, v2}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    const-string v3, "CURRENCY"

    .line 404
    .line 405
    iget-object v4, v1, La/p1f0;->h:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 406
    .line 407
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    new-instance v0, Lkotlin/Pair;

    .line 411
    .line 412
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :cond_3
    instance-of v6, v1, La/iq90;

    .line 417
    .line 418
    if-eqz v6, :cond_4

    .line 419
    .line 420
    check-cast v1, La/iq90;

    .line 421
    .line 422
    new-instance v14, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;

    .line 423
    .line 424
    iget v2, v1, La/iq90;->a:I

    .line 425
    .line 426
    iget-object v1, v1, La/iq90;->b:Ljava/lang/String;

    .line 427
    .line 428
    invoke-direct {v14, v2, v1}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;-><init>(ILjava/lang/String;)V

    .line 429
    .line 430
    .line 431
    const/16 v44, -0x201

    .line 432
    .line 433
    const/16 v45, 0x7f

    .line 434
    .line 435
    const/4 v5, 0x0

    .line 436
    const/4 v6, 0x0

    .line 437
    const/4 v7, 0x0

    .line 438
    const/4 v8, 0x0

    .line 439
    const/4 v9, 0x0

    .line 440
    const/4 v10, 0x0

    .line 441
    const/4 v11, 0x0

    .line 442
    const/4 v12, 0x0

    .line 443
    const/4 v13, 0x0

    .line 444
    const/4 v15, 0x0

    .line 445
    const/16 v16, 0x0

    .line 446
    .line 447
    const/16 v17, 0x0

    .line 448
    .line 449
    const/16 v18, 0x0

    .line 450
    .line 451
    const/16 v19, 0x0

    .line 452
    .line 453
    const/16 v20, 0x0

    .line 454
    .line 455
    const/16 v21, 0x0

    .line 456
    .line 457
    const/16 v22, 0x0

    .line 458
    .line 459
    const/16 v23, 0x0

    .line 460
    .line 461
    const/16 v24, 0x0

    .line 462
    .line 463
    const/16 v25, 0x0

    .line 464
    .line 465
    const/16 v26, 0x0

    .line 466
    .line 467
    const/16 v27, 0x0

    .line 468
    .line 469
    const/16 v28, 0x0

    .line 470
    .line 471
    const/16 v29, 0x0

    .line 472
    .line 473
    const/16 v30, 0x0

    .line 474
    .line 475
    const/16 v31, 0x0

    .line 476
    .line 477
    const/16 v32, 0x0

    .line 478
    .line 479
    const/16 v33, 0x0

    .line 480
    .line 481
    const/16 v34, 0x0

    .line 482
    .line 483
    const/16 v35, 0x0

    .line 484
    .line 485
    const/16 v36, 0x0

    .line 486
    .line 487
    const/16 v37, 0x0

    .line 488
    .line 489
    const/16 v38, 0x0

    .line 490
    .line 491
    const/16 v39, 0x0

    .line 492
    .line 493
    const/16 v40, 0x0

    .line 494
    .line 495
    const/16 v41, 0x0

    .line 496
    .line 497
    const/16 v42, 0x0

    .line 498
    .line 499
    const/16 v43, 0x0

    .line 500
    .line 501
    invoke-static/range {v4 .. v45}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    sget-object v2, La/u0f0;->p:La/u0f0;

    .line 506
    .line 507
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-static {v3, v2}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    const-string v3, "DOCUMENT_TYPE"

    .line 516
    .line 517
    iget-object v4, v1, La/p1f0;->j:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;

    .line 518
    .line 519
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    new-instance v0, Lkotlin/Pair;

    .line 523
    .line 524
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    return-object v0

    .line 528
    :cond_4
    instance-of v6, v1, La/kq90;

    .line 529
    .line 530
    if-eqz v6, :cond_5

    .line 531
    .line 532
    check-cast v1, La/kq90;

    .line 533
    .line 534
    new-instance v4, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 535
    .line 536
    iget v5, v1, La/kq90;->a:I

    .line 537
    .line 538
    iget-object v8, v1, La/kq90;->d:Ljava/lang/String;

    .line 539
    .line 540
    iget-object v9, v1, La/kq90;->f:Ljava/lang/String;

    .line 541
    .line 542
    iget-wide v6, v1, La/kq90;->e:J

    .line 543
    .line 544
    iget-object v10, v1, La/kq90;->i:Ljava/lang/String;

    .line 545
    .line 546
    invoke-direct/range {v4 .. v10}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    iget-object v5, v1, La/kq90;->g:Ljava/lang/String;

    .line 550
    .line 551
    iget-object v0, v1, La/kq90;->h:La/cm90;

    .line 552
    .line 553
    iget-object v6, v0, La/cm90;->d:Ljava/lang/String;

    .line 554
    .line 555
    iget v0, v0, La/cm90;->c:I

    .line 556
    .line 557
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 558
    .line 559
    .line 560
    move-result-object v7

    .line 561
    sget-object v0, La/u0f0;->h:La/u0f0;

    .line 562
    .line 563
    sget-object v1, La/u0f0;->d:La/u0f0;

    .line 564
    .line 565
    filled-new-array {v0, v1}, [La/u0f0;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    invoke-virtual/range {v2 .. v8}, La/j910;->d(La/mbf0;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lkotlin/Pair;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    return-object v0

    .line 578
    :cond_5
    instance-of v2, v1, La/lq90;

    .line 579
    .line 580
    if-eqz v2, :cond_6

    .line 581
    .line 582
    check-cast v1, La/lq90;

    .line 583
    .line 584
    new-instance v2, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;

    .line 585
    .line 586
    iget v6, v1, La/lq90;->a:I

    .line 587
    .line 588
    iget-object v1, v1, La/lq90;->c:Ljava/lang/String;

    .line 589
    .line 590
    invoke-direct {v2, v6, v1}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;-><init>(ILjava/lang/String;)V

    .line 591
    .line 592
    .line 593
    const v44, -0x200009

    .line 594
    .line 595
    .line 596
    const/16 v45, 0x7f

    .line 597
    .line 598
    move-object v1, v5

    .line 599
    const/4 v5, 0x0

    .line 600
    const/4 v6, 0x0

    .line 601
    const/4 v7, 0x0

    .line 602
    const/4 v8, 0x0

    .line 603
    const/4 v9, 0x0

    .line 604
    const/4 v10, 0x0

    .line 605
    const/4 v11, 0x0

    .line 606
    const/4 v12, 0x0

    .line 607
    const/4 v13, 0x0

    .line 608
    const/4 v14, 0x0

    .line 609
    const/4 v15, 0x0

    .line 610
    const/16 v16, 0x0

    .line 611
    .line 612
    const/16 v17, 0x0

    .line 613
    .line 614
    const/16 v18, 0x0

    .line 615
    .line 616
    const/16 v19, 0x0

    .line 617
    .line 618
    const/16 v20, 0x0

    .line 619
    .line 620
    const/16 v21, 0x0

    .line 621
    .line 622
    const/16 v22, 0x0

    .line 623
    .line 624
    const/16 v23, 0x0

    .line 625
    .line 626
    const/16 v24, 0x0

    .line 627
    .line 628
    const/16 v25, 0x0

    .line 629
    .line 630
    const/16 v27, 0x0

    .line 631
    .line 632
    const/16 v28, 0x0

    .line 633
    .line 634
    const/16 v29, 0x0

    .line 635
    .line 636
    const/16 v30, 0x0

    .line 637
    .line 638
    const/16 v31, 0x0

    .line 639
    .line 640
    const/16 v32, 0x0

    .line 641
    .line 642
    const/16 v33, 0x0

    .line 643
    .line 644
    const/16 v34, 0x0

    .line 645
    .line 646
    const/16 v35, 0x0

    .line 647
    .line 648
    const/16 v36, 0x0

    .line 649
    .line 650
    const/16 v37, 0x0

    .line 651
    .line 652
    const/16 v38, 0x0

    .line 653
    .line 654
    const/16 v39, 0x0

    .line 655
    .line 656
    const/16 v40, 0x0

    .line 657
    .line 658
    const/16 v41, 0x0

    .line 659
    .line 660
    const/16 v42, 0x0

    .line 661
    .line 662
    const/16 v43, 0x0

    .line 663
    .line 664
    move-object/from16 v26, v2

    .line 665
    .line 666
    invoke-static/range {v4 .. v45}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    sget-object v4, La/u0f0;->e:La/u0f0;

    .line 671
    .line 672
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    invoke-static {v3, v4}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 677
    .line 678
    .line 679
    move-result-object v3

    .line 680
    const-string v4, "REGION"

    .line 681
    .line 682
    iget-object v5, v2, La/p1f0;->v:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;

    .line 683
    .line 684
    invoke-virtual {v0, v4, v5}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    const/4 v4, 0x0

    .line 688
    invoke-virtual {v0, v1, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    new-instance v0, Lkotlin/Pair;

    .line 692
    .line 693
    invoke-direct {v0, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    return-object v0

    .line 697
    :cond_6
    iget-object v0, v3, La/mbf0;->e:Ljava/util/Map;

    .line 698
    .line 699
    new-instance v1, Lkotlin/Pair;

    .line 700
    .line 701
    invoke-direct {v1, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    return-object v1
.end method

.method private final w(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object/from16 v41, v1

    .line 6
    .line 7
    check-cast v41, La/q7f0;

    .line 8
    .line 9
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/j910;

    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/mbf0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, La/mbf0;->g:La/p1f0;

    .line 21
    .line 22
    const/16 v42, -0x1

    .line 23
    .line 24
    const/16 v43, 0x3f

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    const/16 v23, 0x0

    .line 54
    .line 55
    const/16 v24, 0x0

    .line 56
    .line 57
    const/16 v25, 0x0

    .line 58
    .line 59
    const/16 v26, 0x0

    .line 60
    .line 61
    const/16 v27, 0x0

    .line 62
    .line 63
    const/16 v28, 0x0

    .line 64
    .line 65
    const/16 v29, 0x0

    .line 66
    .line 67
    const/16 v30, 0x0

    .line 68
    .line 69
    const/16 v31, 0x0

    .line 70
    .line 71
    const/16 v32, 0x0

    .line 72
    .line 73
    const/16 v33, 0x0

    .line 74
    .line 75
    const/16 v34, 0x0

    .line 76
    .line 77
    const/16 v35, 0x0

    .line 78
    .line 79
    const/16 v36, 0x0

    .line 80
    .line 81
    const/16 v37, 0x0

    .line 82
    .line 83
    const/16 v38, 0x0

    .line 84
    .line 85
    const/16 v39, 0x0

    .line 86
    .line 87
    const/16 v40, 0x0

    .line 88
    .line 89
    invoke-static/range {v2 .. v43}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, La/vzg0;

    .line 96
    .line 97
    const-string v3, "REGISTRATION_TYPE"

    .line 98
    .line 99
    iget-object v4, v2, La/p1f0;->M:La/q7f0;

    .line 100
    .line 101
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, v1, La/mbf0;->e:Ljava/util/Map;

    .line 105
    .line 106
    new-instance v1, Lkotlin/Pair;

    .line 107
    .line 108
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-object v1
.end method

.method private final x(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/ocf0;

    .line 6
    .line 7
    iget-object v0, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/qu4;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, La/k0w0;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v1, La/ocf0;->o:La/sek;

    .line 19
    .line 20
    new-instance v4, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;

    .line 21
    .line 22
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, La/mbf0;

    .line 27
    .line 28
    iget-object v5, v5, La/mbf0;->g:La/p1f0;

    .line 29
    .line 30
    iget-object v5, v5, La/p1f0;->k:Ljava/lang/String;

    .line 31
    .line 32
    const-string v6, ""

    .line 33
    .line 34
    if-nez v5, :cond_0

    .line 35
    .line 36
    move-object v8, v6

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v8, v5

    .line 39
    :goto_0
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, La/mbf0;

    .line 44
    .line 45
    iget-object v5, v5, La/mbf0;->g:La/p1f0;

    .line 46
    .line 47
    iget-object v5, v5, La/p1f0;->u:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    move-object v9, v6

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v9, v5

    .line 54
    :goto_1
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, La/mbf0;

    .line 59
    .line 60
    iget-object v5, v5, La/mbf0;->g:La/p1f0;

    .line 61
    .line 62
    iget-object v5, v5, La/p1f0;->M:La/q7f0;

    .line 63
    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    iget-byte v5, v5, La/q7f0;->a:B

    .line 67
    .line 68
    :goto_2
    move v10, v5

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    sget-object v5, La/q7f0;->b:La/gne0;

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    goto :goto_2

    .line 74
    :goto_3
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, La/mbf0;

    .line 79
    .line 80
    iget-object v5, v5, La/mbf0;->g:La/p1f0;

    .line 81
    .line 82
    iget-object v5, v5, La/p1f0;->g:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 83
    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    iget v5, v5, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;->a:I

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_3
    const/4 v5, -0x1

    .line 90
    :goto_4
    int-to-long v14, v5

    .line 91
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, La/mbf0;

    .line 96
    .line 97
    iget-object v5, v5, La/mbf0;->g:La/p1f0;

    .line 98
    .line 99
    iget-object v5, v5, La/p1f0;->g:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    if-eqz v5, :cond_4

    .line 103
    .line 104
    iget-object v5, v5, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;->b:Ljava/lang/String;

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_4
    move-object v5, v7

    .line 108
    :goto_5
    if-nez v5, :cond_5

    .line 109
    .line 110
    move-object v11, v6

    .line 111
    goto :goto_6

    .line 112
    :cond_5
    move-object v11, v5

    .line 113
    :goto_6
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    check-cast v5, La/mbf0;

    .line 118
    .line 119
    iget-object v5, v5, La/mbf0;->g:La/p1f0;

    .line 120
    .line 121
    iget-object v5, v5, La/p1f0;->h:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 122
    .line 123
    if-eqz v5, :cond_6

    .line 124
    .line 125
    iget-object v5, v5, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;->b:Ljava/lang/String;

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_6
    move-object v5, v7

    .line 129
    :goto_7
    if-nez v5, :cond_7

    .line 130
    .line 131
    move-object v12, v6

    .line 132
    goto :goto_8

    .line 133
    :cond_7
    move-object v12, v5

    .line 134
    :goto_8
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, La/mbf0;

    .line 139
    .line 140
    iget-object v5, v5, La/mbf0;->g:La/p1f0;

    .line 141
    .line 142
    iget-object v5, v5, La/p1f0;->c:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;

    .line 143
    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    iget-object v5, v5, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;->b:Ljava/lang/String;

    .line 147
    .line 148
    goto :goto_9

    .line 149
    :cond_8
    move-object v5, v7

    .line 150
    :goto_9
    if-nez v5, :cond_9

    .line 151
    .line 152
    move-object v13, v6

    .line 153
    goto :goto_a

    .line 154
    :cond_9
    move-object v13, v5

    .line 155
    :goto_a
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, La/mbf0;

    .line 160
    .line 161
    iget-object v5, v5, La/mbf0;->g:La/p1f0;

    .line 162
    .line 163
    iget-object v5, v5, La/p1f0;->g:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 164
    .line 165
    if-eqz v5, :cond_a

    .line 166
    .line 167
    iget-object v7, v5, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;->e:Ljava/lang/String;

    .line 168
    .line 169
    :cond_a
    if-nez v7, :cond_b

    .line 170
    .line 171
    move-object/from16 v16, v6

    .line 172
    .line 173
    goto :goto_b

    .line 174
    :cond_b
    move-object/from16 v16, v7

    .line 175
    .line 176
    :goto_b
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, La/mbf0;

    .line 181
    .line 182
    iget-object v5, v5, La/mbf0;->A:La/cne0;

    .line 183
    .line 184
    iget-object v5, v5, La/cne0;->a:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, La/mbf0;

    .line 191
    .line 192
    iget-object v1, v1, La/mbf0;->g:La/p1f0;

    .line 193
    .line 194
    iget-object v1, v1, La/p1f0;->D:Ljava/lang/Integer;

    .line 195
    .line 196
    new-instance v7, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;

    .line 197
    .line 198
    move-object/from16 v18, v1

    .line 199
    .line 200
    move-object/from16 v17, v5

    .line 201
    .line 202
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 203
    .line 204
    .line 205
    new-instance v1, La/swp0;

    .line 206
    .line 207
    iget-object v5, v0, La/qu4;->a:Ljava/lang/String;

    .line 208
    .line 209
    iget-object v0, v0, La/qu4;->b:Ljava/lang/String;

    .line 210
    .line 211
    const/4 v6, 0x0

    .line 212
    invoke-direct {v1, v5, v0, v6}, La/swp0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 213
    .line 214
    .line 215
    invoke-direct {v4, v7, v1}, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;-><init>(Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;La/swp0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v0, Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;

    .line 222
    .line 223
    invoke-direct {v0, v4}, Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;-><init>(Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 227
    .line 228
    .line 229
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xwe0;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "PROMO_CODE"

    .line 9
    .line 10
    const-string v5, "CITIZENSHIP"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, v0, La/xwe0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v9, v0, La/xwe0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v9, La/bef0;

    .line 22
    .line 23
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, La/i8z;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v1, v9, La/bef0;->a:La/a4x;

    .line 33
    .line 34
    new-instance v2, La/bue0;

    .line 35
    .line 36
    const/16 v3, 0x10

    .line 37
    .line 38
    invoke-direct {v2, v3}, La/bue0;-><init>(B)V

    .line 39
    .line 40
    .line 41
    new-instance v3, La/bue0;

    .line 42
    .line 43
    const/16 v4, 0x11

    .line 44
    .line 45
    invoke-direct {v3, v4}, La/bue0;-><init>(B)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    new-instance v5, La/pwe0;

    .line 53
    .line 54
    const/4 v6, 0x3

    .line 55
    invoke-direct {v5, v2, v1, v6}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    move v2, v4

    .line 59
    new-instance v4, La/pwe0;

    .line 60
    .line 61
    const/4 v6, 0x4

    .line 62
    invoke-direct {v4, v3, v1, v6}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    new-instance v3, La/h8w;

    .line 66
    .line 67
    const/16 v6, 0x12

    .line 68
    .line 69
    invoke-direct {v3, v1, v9, v8, v6}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 70
    .line 71
    .line 72
    move v1, v2

    .line 73
    move-object v2, v5

    .line 74
    new-instance v5, La/ugd;

    .line 75
    .line 76
    const v6, -0x4297e015

    .line 77
    .line 78
    .line 79
    invoke-direct {v5, v6, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-virtual/range {v0 .. v5}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/xwe0;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/xwe0;->w(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/xwe0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/xwe0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0

    .line 109
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/xwe0;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/xwe0;->t(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/xwe0;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/xwe0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :pswitch_8
    invoke-direct/range {p0 .. p1}, La/xwe0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :pswitch_9
    invoke-direct/range {p0 .. p1}, La/xwe0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    return-object v0

    .line 139
    :pswitch_a
    invoke-direct/range {p0 .. p1}, La/xwe0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :pswitch_b
    invoke-direct/range {p0 .. p1}, La/xwe0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    return-object v0

    .line 149
    :pswitch_c
    invoke-direct/range {p0 .. p1}, La/xwe0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :pswitch_d
    invoke-direct/range {p0 .. p1}, La/xwe0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :pswitch_e
    invoke-direct/range {p0 .. p1}, La/xwe0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    return-object v0

    .line 164
    :pswitch_f
    invoke-direct/range {p0 .. p1}, La/xwe0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    return-object v0

    .line 169
    :pswitch_10
    invoke-direct/range {p0 .. p1}, La/xwe0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :pswitch_11
    check-cast v9, La/jkc;

    .line 175
    .line 176
    check-cast v8, La/g090;

    .line 177
    .line 178
    move-object/from16 v0, p1

    .line 179
    .line 180
    check-cast v0, La/u4f0;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v10, v0, La/u4f0;->g:La/r1f0;

    .line 186
    .line 187
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 188
    .line 189
    iget v2, v9, La/jkc;->a:I

    .line 190
    .line 191
    iget-object v3, v9, La/jkc;->b:Ljava/lang/String;

    .line 192
    .line 193
    invoke-direct {v1, v3, v2, v7}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 194
    .line 195
    .line 196
    const/16 v50, -0x4001

    .line 197
    .line 198
    const/16 v51, 0x7f

    .line 199
    .line 200
    const/4 v11, 0x0

    .line 201
    const/4 v12, 0x0

    .line 202
    const/4 v13, 0x0

    .line 203
    const/4 v14, 0x0

    .line 204
    const/4 v15, 0x0

    .line 205
    const/16 v16, 0x0

    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    const/16 v18, 0x0

    .line 210
    .line 211
    const/16 v19, 0x0

    .line 212
    .line 213
    const/16 v20, 0x0

    .line 214
    .line 215
    const/16 v21, 0x0

    .line 216
    .line 217
    const/16 v22, 0x0

    .line 218
    .line 219
    const/16 v23, 0x0

    .line 220
    .line 221
    const/16 v24, 0x0

    .line 222
    .line 223
    const/16 v26, 0x0

    .line 224
    .line 225
    const/16 v27, 0x0

    .line 226
    .line 227
    const/16 v28, 0x0

    .line 228
    .line 229
    const/16 v29, 0x0

    .line 230
    .line 231
    const/16 v30, 0x0

    .line 232
    .line 233
    const/16 v31, 0x0

    .line 234
    .line 235
    const/16 v32, 0x0

    .line 236
    .line 237
    const/16 v33, 0x0

    .line 238
    .line 239
    const/16 v34, 0x0

    .line 240
    .line 241
    const/16 v35, 0x0

    .line 242
    .line 243
    const/16 v36, 0x0

    .line 244
    .line 245
    const/16 v37, 0x0

    .line 246
    .line 247
    const/16 v38, 0x0

    .line 248
    .line 249
    const/16 v39, 0x0

    .line 250
    .line 251
    const/16 v40, 0x0

    .line 252
    .line 253
    const/16 v41, 0x0

    .line 254
    .line 255
    const/16 v42, 0x0

    .line 256
    .line 257
    const/16 v43, 0x0

    .line 258
    .line 259
    const/16 v44, 0x0

    .line 260
    .line 261
    const/16 v45, 0x0

    .line 262
    .line 263
    const/16 v46, 0x0

    .line 264
    .line 265
    const/16 v47, 0x0

    .line 266
    .line 267
    const/16 v48, 0x0

    .line 268
    .line 269
    const/16 v49, 0x0

    .line 270
    .line 271
    move-object/from16 v25, v1

    .line 272
    .line 273
    invoke-static/range {v10 .. v51}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    sget-object v2, La/u0f0;->o:La/u0f0;

    .line 278
    .line 279
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-static {v0, v2}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    iget-object v2, v8, La/g090;->a:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v2, La/vzg0;

    .line 293
    .line 294
    iget-object v3, v1, La/r1f0;->o:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 295
    .line 296
    invoke-virtual {v2, v5, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    new-instance v2, Lkotlin/Pair;

    .line 300
    .line 301
    invoke-direct {v2, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    return-object v2

    .line 305
    :pswitch_12
    move-object/from16 v26, v9

    .line 306
    .line 307
    check-cast v26, Ljava/lang/String;

    .line 308
    .line 309
    move-object v0, v8

    .line 310
    check-cast v0, La/g090;

    .line 311
    .line 312
    move-object/from16 v1, p1

    .line 313
    .line 314
    check-cast v1, La/u4f0;

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iget-object v5, v1, La/u4f0;->g:La/r1f0;

    .line 320
    .line 321
    const v45, -0x100001

    .line 322
    .line 323
    .line 324
    const/16 v46, 0x7f

    .line 325
    .line 326
    const/4 v6, 0x0

    .line 327
    const/4 v7, 0x0

    .line 328
    const/4 v8, 0x0

    .line 329
    const/4 v9, 0x0

    .line 330
    const/4 v10, 0x0

    .line 331
    const/4 v11, 0x0

    .line 332
    const/4 v12, 0x0

    .line 333
    const/4 v13, 0x0

    .line 334
    const/4 v14, 0x0

    .line 335
    const/4 v15, 0x0

    .line 336
    const/16 v16, 0x0

    .line 337
    .line 338
    const/16 v17, 0x0

    .line 339
    .line 340
    const/16 v18, 0x0

    .line 341
    .line 342
    const/16 v19, 0x0

    .line 343
    .line 344
    const/16 v20, 0x0

    .line 345
    .line 346
    const/16 v21, 0x0

    .line 347
    .line 348
    const/16 v22, 0x0

    .line 349
    .line 350
    const/16 v23, 0x0

    .line 351
    .line 352
    const/16 v24, 0x0

    .line 353
    .line 354
    const/16 v25, 0x0

    .line 355
    .line 356
    const/16 v27, 0x0

    .line 357
    .line 358
    const/16 v28, 0x0

    .line 359
    .line 360
    const/16 v29, 0x0

    .line 361
    .line 362
    const/16 v30, 0x0

    .line 363
    .line 364
    const/16 v31, 0x0

    .line 365
    .line 366
    const/16 v32, 0x0

    .line 367
    .line 368
    const/16 v33, 0x0

    .line 369
    .line 370
    const/16 v34, 0x0

    .line 371
    .line 372
    const/16 v35, 0x0

    .line 373
    .line 374
    const/16 v36, 0x0

    .line 375
    .line 376
    const/16 v37, 0x0

    .line 377
    .line 378
    const/16 v38, 0x0

    .line 379
    .line 380
    const/16 v39, 0x0

    .line 381
    .line 382
    const/16 v40, 0x0

    .line 383
    .line 384
    const/16 v41, 0x0

    .line 385
    .line 386
    const/16 v42, 0x0

    .line 387
    .line 388
    const/16 v43, 0x0

    .line 389
    .line 390
    const/16 v44, 0x0

    .line 391
    .line 392
    invoke-static/range {v5 .. v46}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    sget-object v3, La/u0f0;->u:La/u0f0;

    .line 397
    .line 398
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-static {v1, v3}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, La/vzg0;

    .line 412
    .line 413
    iget-object v3, v2, La/r1f0;->u:Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {v0, v4, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    new-instance v0, Lkotlin/Pair;

    .line 419
    .line 420
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    return-object v0

    .line 424
    :pswitch_13
    move-object/from16 v37, v9

    .line 425
    .line 426
    check-cast v37, Ljava/util/List;

    .line 427
    .line 428
    move-object v0, v8

    .line 429
    check-cast v0, La/g090;

    .line 430
    .line 431
    move-object/from16 v1, p1

    .line 432
    .line 433
    check-cast v1, La/u4f0;

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v3, v1, La/u4f0;->g:La/r1f0;

    .line 439
    .line 440
    const/16 v43, -0x1

    .line 441
    .line 442
    const/16 v44, 0x7d

    .line 443
    .line 444
    const/4 v4, 0x0

    .line 445
    const/4 v5, 0x0

    .line 446
    const/4 v6, 0x0

    .line 447
    const/4 v7, 0x0

    .line 448
    const/4 v8, 0x0

    .line 449
    const/4 v9, 0x0

    .line 450
    const/4 v10, 0x0

    .line 451
    const/4 v11, 0x0

    .line 452
    const/4 v12, 0x0

    .line 453
    const/4 v13, 0x0

    .line 454
    const/4 v14, 0x0

    .line 455
    const/4 v15, 0x0

    .line 456
    const/16 v16, 0x0

    .line 457
    .line 458
    const/16 v17, 0x0

    .line 459
    .line 460
    const/16 v18, 0x0

    .line 461
    .line 462
    const/16 v19, 0x0

    .line 463
    .line 464
    const/16 v20, 0x0

    .line 465
    .line 466
    const/16 v21, 0x0

    .line 467
    .line 468
    const/16 v22, 0x0

    .line 469
    .line 470
    const/16 v23, 0x0

    .line 471
    .line 472
    const/16 v24, 0x0

    .line 473
    .line 474
    const/16 v25, 0x0

    .line 475
    .line 476
    const/16 v26, 0x0

    .line 477
    .line 478
    const/16 v27, 0x0

    .line 479
    .line 480
    const/16 v28, 0x0

    .line 481
    .line 482
    const/16 v29, 0x0

    .line 483
    .line 484
    const/16 v30, 0x0

    .line 485
    .line 486
    const/16 v31, 0x0

    .line 487
    .line 488
    const/16 v32, 0x0

    .line 489
    .line 490
    const/16 v33, 0x0

    .line 491
    .line 492
    const/16 v34, 0x0

    .line 493
    .line 494
    const/16 v35, 0x0

    .line 495
    .line 496
    const/16 v36, 0x0

    .line 497
    .line 498
    const/16 v38, 0x0

    .line 499
    .line 500
    const/16 v39, 0x0

    .line 501
    .line 502
    const/16 v40, 0x0

    .line 503
    .line 504
    const/16 v41, 0x0

    .line 505
    .line 506
    const/16 v42, 0x0

    .line 507
    .line 508
    invoke-static/range {v3 .. v44}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v0, La/vzg0;

    .line 515
    .line 516
    const-string v3, "BONUS"

    .line 517
    .line 518
    iget-object v4, v2, La/r1f0;->c:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;

    .line 519
    .line 520
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    iget-object v0, v1, La/u4f0;->e:Ljava/util/Map;

    .line 524
    .line 525
    new-instance v1, Lkotlin/Pair;

    .line 526
    .line 527
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    return-object v1

    .line 531
    :pswitch_14
    check-cast v9, La/nq90;

    .line 532
    .line 533
    move-object v10, v8

    .line 534
    check-cast v10, La/g090;

    .line 535
    .line 536
    iget-object v0, v10, La/g090;->a:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v0, La/vzg0;

    .line 539
    .line 540
    move-object/from16 v11, p1

    .line 541
    .line 542
    check-cast v11, La/u4f0;

    .line 543
    .line 544
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    iget-object v12, v11, La/u4f0;->g:La/r1f0;

    .line 548
    .line 549
    instance-of v1, v9, La/eq90;

    .line 550
    .line 551
    if-eqz v1, :cond_0

    .line 552
    .line 553
    check-cast v9, La/eq90;

    .line 554
    .line 555
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 556
    .line 557
    iget v2, v9, La/eq90;->a:I

    .line 558
    .line 559
    iget-object v4, v9, La/eq90;->b:Ljava/lang/String;

    .line 560
    .line 561
    invoke-direct {v1, v4, v2, v3}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;-><init>(Ljava/lang/String;IZ)V

    .line 562
    .line 563
    .line 564
    const/16 v52, -0x4201

    .line 565
    .line 566
    const/16 v53, 0x7f

    .line 567
    .line 568
    const/4 v13, 0x0

    .line 569
    const/4 v14, 0x0

    .line 570
    const/4 v15, 0x0

    .line 571
    const/16 v16, 0x0

    .line 572
    .line 573
    const/16 v17, 0x0

    .line 574
    .line 575
    const/16 v18, 0x0

    .line 576
    .line 577
    const/16 v19, 0x0

    .line 578
    .line 579
    const/16 v20, 0x0

    .line 580
    .line 581
    const/16 v21, 0x0

    .line 582
    .line 583
    const/16 v22, 0x0

    .line 584
    .line 585
    const/16 v23, 0x0

    .line 586
    .line 587
    const/16 v24, 0x0

    .line 588
    .line 589
    const/16 v25, 0x0

    .line 590
    .line 591
    const/16 v26, 0x0

    .line 592
    .line 593
    const/16 v28, 0x0

    .line 594
    .line 595
    const/16 v29, 0x0

    .line 596
    .line 597
    const/16 v30, 0x0

    .line 598
    .line 599
    const/16 v31, 0x0

    .line 600
    .line 601
    const/16 v32, 0x0

    .line 602
    .line 603
    const/16 v33, 0x0

    .line 604
    .line 605
    const/16 v34, 0x0

    .line 606
    .line 607
    const/16 v35, 0x0

    .line 608
    .line 609
    const/16 v36, 0x0

    .line 610
    .line 611
    const/16 v37, 0x0

    .line 612
    .line 613
    const/16 v38, 0x0

    .line 614
    .line 615
    const/16 v39, 0x0

    .line 616
    .line 617
    const/16 v40, 0x0

    .line 618
    .line 619
    const/16 v41, 0x0

    .line 620
    .line 621
    const/16 v42, 0x0

    .line 622
    .line 623
    const/16 v43, 0x0

    .line 624
    .line 625
    const/16 v44, 0x0

    .line 626
    .line 627
    const/16 v45, 0x0

    .line 628
    .line 629
    const/16 v46, 0x0

    .line 630
    .line 631
    const/16 v47, 0x0

    .line 632
    .line 633
    const/16 v48, 0x0

    .line 634
    .line 635
    const/16 v49, 0x0

    .line 636
    .line 637
    const/16 v50, 0x0

    .line 638
    .line 639
    const/16 v51, 0x0

    .line 640
    .line 641
    move-object/from16 v27, v1

    .line 642
    .line 643
    invoke-static/range {v12 .. v53}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    sget-object v2, La/u0f0;->o:La/u0f0;

    .line 648
    .line 649
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-static {v11, v2}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    iget-object v3, v1, La/r1f0;->o:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;

    .line 658
    .line 659
    invoke-virtual {v0, v5, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    new-instance v0, Lkotlin/Pair;

    .line 663
    .line 664
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    goto/16 :goto_0

    .line 668
    .line 669
    :cond_0
    instance-of v1, v9, La/fq90;

    .line 670
    .line 671
    const-string v2, "CITY"

    .line 672
    .line 673
    if-eqz v1, :cond_1

    .line 674
    .line 675
    check-cast v9, La/fq90;

    .line 676
    .line 677
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;

    .line 678
    .line 679
    iget v3, v9, La/fq90;->a:I

    .line 680
    .line 681
    iget-object v4, v9, La/fq90;->c:Ljava/lang/String;

    .line 682
    .line 683
    invoke-direct {v1, v3, v4}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;-><init>(ILjava/lang/String;)V

    .line 684
    .line 685
    .line 686
    const/16 v52, -0x9

    .line 687
    .line 688
    const/16 v53, 0x7f

    .line 689
    .line 690
    const/4 v13, 0x0

    .line 691
    const/4 v14, 0x0

    .line 692
    const/4 v15, 0x0

    .line 693
    const/16 v17, 0x0

    .line 694
    .line 695
    const/16 v18, 0x0

    .line 696
    .line 697
    const/16 v19, 0x0

    .line 698
    .line 699
    const/16 v20, 0x0

    .line 700
    .line 701
    const/16 v21, 0x0

    .line 702
    .line 703
    const/16 v22, 0x0

    .line 704
    .line 705
    const/16 v23, 0x0

    .line 706
    .line 707
    const/16 v24, 0x0

    .line 708
    .line 709
    const/16 v25, 0x0

    .line 710
    .line 711
    const/16 v26, 0x0

    .line 712
    .line 713
    const/16 v27, 0x0

    .line 714
    .line 715
    const/16 v28, 0x0

    .line 716
    .line 717
    const/16 v29, 0x0

    .line 718
    .line 719
    const/16 v30, 0x0

    .line 720
    .line 721
    const/16 v31, 0x0

    .line 722
    .line 723
    const/16 v32, 0x0

    .line 724
    .line 725
    const/16 v33, 0x0

    .line 726
    .line 727
    const/16 v34, 0x0

    .line 728
    .line 729
    const/16 v35, 0x0

    .line 730
    .line 731
    const/16 v36, 0x0

    .line 732
    .line 733
    const/16 v37, 0x0

    .line 734
    .line 735
    const/16 v38, 0x0

    .line 736
    .line 737
    const/16 v39, 0x0

    .line 738
    .line 739
    const/16 v40, 0x0

    .line 740
    .line 741
    const/16 v41, 0x0

    .line 742
    .line 743
    const/16 v42, 0x0

    .line 744
    .line 745
    const/16 v43, 0x0

    .line 746
    .line 747
    const/16 v44, 0x0

    .line 748
    .line 749
    const/16 v45, 0x0

    .line 750
    .line 751
    const/16 v46, 0x0

    .line 752
    .line 753
    const/16 v47, 0x0

    .line 754
    .line 755
    const/16 v48, 0x0

    .line 756
    .line 757
    const/16 v49, 0x0

    .line 758
    .line 759
    const/16 v50, 0x0

    .line 760
    .line 761
    const/16 v51, 0x0

    .line 762
    .line 763
    move-object/from16 v16, v1

    .line 764
    .line 765
    invoke-static/range {v12 .. v53}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    sget-object v3, La/u0f0;->f:La/u0f0;

    .line 770
    .line 771
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    invoke-static {v11, v3}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    iget-object v4, v1, La/r1f0;->d:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;

    .line 780
    .line 781
    invoke-virtual {v0, v2, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    new-instance v0, Lkotlin/Pair;

    .line 785
    .line 786
    invoke-direct {v0, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    goto/16 :goto_0

    .line 790
    .line 791
    :cond_1
    instance-of v1, v9, La/gq90;

    .line 792
    .line 793
    if-eqz v1, :cond_2

    .line 794
    .line 795
    check-cast v9, La/gq90;

    .line 796
    .line 797
    new-instance v0, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 798
    .line 799
    iget v1, v9, La/gq90;->a:I

    .line 800
    .line 801
    iget-object v4, v9, La/gq90;->c:Ljava/lang/String;

    .line 802
    .line 803
    iget-object v5, v9, La/gq90;->e:Ljava/lang/String;

    .line 804
    .line 805
    iget-wide v2, v9, La/gq90;->d:J

    .line 806
    .line 807
    iget-object v6, v9, La/gq90;->h:Ljava/lang/String;

    .line 808
    .line 809
    invoke-direct/range {v0 .. v6}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    iget-object v13, v9, La/gq90;->f:Ljava/lang/String;

    .line 813
    .line 814
    iget-object v1, v9, La/gq90;->g:La/cm90;

    .line 815
    .line 816
    iget-object v14, v1, La/cm90;->d:Ljava/lang/String;

    .line 817
    .line 818
    sget-object v1, La/u0f0;->d:La/u0f0;

    .line 819
    .line 820
    sget-object v2, La/u0f0;->h:La/u0f0;

    .line 821
    .line 822
    filled-new-array {v1, v2}, [La/u0f0;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 827
    .line 828
    .line 829
    move-result-object v15

    .line 830
    move-object v12, v0

    .line 831
    invoke-virtual/range {v10 .. v15}, La/g090;->c(La/u4f0;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lkotlin/Pair;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    goto/16 :goto_0

    .line 836
    .line 837
    :cond_2
    instance-of v1, v9, La/hq90;

    .line 838
    .line 839
    if-eqz v1, :cond_3

    .line 840
    .line 841
    check-cast v9, La/hq90;

    .line 842
    .line 843
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 844
    .line 845
    iget v2, v9, La/hq90;->a:I

    .line 846
    .line 847
    iget-object v3, v9, La/hq90;->c:Ljava/lang/String;

    .line 848
    .line 849
    iget-object v4, v9, La/hq90;->d:Ljava/lang/String;

    .line 850
    .line 851
    invoke-direct {v1, v2, v3, v4}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    const/16 v52, -0x81

    .line 855
    .line 856
    const/16 v53, 0x7f

    .line 857
    .line 858
    const/4 v13, 0x0

    .line 859
    const/4 v14, 0x0

    .line 860
    const/4 v15, 0x0

    .line 861
    const/16 v16, 0x0

    .line 862
    .line 863
    const/16 v17, 0x0

    .line 864
    .line 865
    const/16 v18, 0x0

    .line 866
    .line 867
    const/16 v19, 0x0

    .line 868
    .line 869
    const/16 v21, 0x0

    .line 870
    .line 871
    const/16 v22, 0x0

    .line 872
    .line 873
    const/16 v23, 0x0

    .line 874
    .line 875
    const/16 v24, 0x0

    .line 876
    .line 877
    const/16 v25, 0x0

    .line 878
    .line 879
    const/16 v26, 0x0

    .line 880
    .line 881
    const/16 v27, 0x0

    .line 882
    .line 883
    const/16 v28, 0x0

    .line 884
    .line 885
    const/16 v29, 0x0

    .line 886
    .line 887
    const/16 v30, 0x0

    .line 888
    .line 889
    const/16 v31, 0x0

    .line 890
    .line 891
    const/16 v32, 0x0

    .line 892
    .line 893
    const/16 v33, 0x0

    .line 894
    .line 895
    const/16 v34, 0x0

    .line 896
    .line 897
    const/16 v35, 0x0

    .line 898
    .line 899
    const/16 v36, 0x0

    .line 900
    .line 901
    const/16 v37, 0x0

    .line 902
    .line 903
    const/16 v38, 0x0

    .line 904
    .line 905
    const/16 v39, 0x0

    .line 906
    .line 907
    const/16 v40, 0x0

    .line 908
    .line 909
    const/16 v41, 0x0

    .line 910
    .line 911
    const/16 v42, 0x0

    .line 912
    .line 913
    const/16 v43, 0x0

    .line 914
    .line 915
    const/16 v44, 0x0

    .line 916
    .line 917
    const/16 v45, 0x0

    .line 918
    .line 919
    const/16 v46, 0x0

    .line 920
    .line 921
    const/16 v47, 0x0

    .line 922
    .line 923
    const/16 v48, 0x0

    .line 924
    .line 925
    const/16 v49, 0x0

    .line 926
    .line 927
    const/16 v50, 0x0

    .line 928
    .line 929
    const/16 v51, 0x0

    .line 930
    .line 931
    move-object/from16 v20, v1

    .line 932
    .line 933
    invoke-static/range {v12 .. v53}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    sget-object v2, La/u0f0;->i:La/u0f0;

    .line 938
    .line 939
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    invoke-static {v11, v2}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    const-string v3, "CURRENCY"

    .line 948
    .line 949
    iget-object v4, v1, La/r1f0;->h:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 950
    .line 951
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 952
    .line 953
    .line 954
    new-instance v0, Lkotlin/Pair;

    .line 955
    .line 956
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_0

    .line 960
    .line 961
    :cond_3
    instance-of v1, v9, La/iq90;

    .line 962
    .line 963
    if-eqz v1, :cond_4

    .line 964
    .line 965
    check-cast v9, La/iq90;

    .line 966
    .line 967
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;

    .line 968
    .line 969
    iget v2, v9, La/iq90;->a:I

    .line 970
    .line 971
    iget-object v3, v9, La/iq90;->b:Ljava/lang/String;

    .line 972
    .line 973
    invoke-direct {v1, v2, v3}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;-><init>(ILjava/lang/String;)V

    .line 974
    .line 975
    .line 976
    const/16 v52, -0x201

    .line 977
    .line 978
    const/16 v53, 0x7f

    .line 979
    .line 980
    const/4 v13, 0x0

    .line 981
    const/4 v14, 0x0

    .line 982
    const/4 v15, 0x0

    .line 983
    const/16 v16, 0x0

    .line 984
    .line 985
    const/16 v17, 0x0

    .line 986
    .line 987
    const/16 v18, 0x0

    .line 988
    .line 989
    const/16 v19, 0x0

    .line 990
    .line 991
    const/16 v20, 0x0

    .line 992
    .line 993
    const/16 v21, 0x0

    .line 994
    .line 995
    const/16 v23, 0x0

    .line 996
    .line 997
    const/16 v24, 0x0

    .line 998
    .line 999
    const/16 v25, 0x0

    .line 1000
    .line 1001
    const/16 v26, 0x0

    .line 1002
    .line 1003
    const/16 v27, 0x0

    .line 1004
    .line 1005
    const/16 v28, 0x0

    .line 1006
    .line 1007
    const/16 v29, 0x0

    .line 1008
    .line 1009
    const/16 v30, 0x0

    .line 1010
    .line 1011
    const/16 v31, 0x0

    .line 1012
    .line 1013
    const/16 v32, 0x0

    .line 1014
    .line 1015
    const/16 v33, 0x0

    .line 1016
    .line 1017
    const/16 v34, 0x0

    .line 1018
    .line 1019
    const/16 v35, 0x0

    .line 1020
    .line 1021
    const/16 v36, 0x0

    .line 1022
    .line 1023
    const/16 v37, 0x0

    .line 1024
    .line 1025
    const/16 v38, 0x0

    .line 1026
    .line 1027
    const/16 v39, 0x0

    .line 1028
    .line 1029
    const/16 v40, 0x0

    .line 1030
    .line 1031
    const/16 v41, 0x0

    .line 1032
    .line 1033
    const/16 v42, 0x0

    .line 1034
    .line 1035
    const/16 v43, 0x0

    .line 1036
    .line 1037
    const/16 v44, 0x0

    .line 1038
    .line 1039
    const/16 v45, 0x0

    .line 1040
    .line 1041
    const/16 v46, 0x0

    .line 1042
    .line 1043
    const/16 v47, 0x0

    .line 1044
    .line 1045
    const/16 v48, 0x0

    .line 1046
    .line 1047
    const/16 v49, 0x0

    .line 1048
    .line 1049
    const/16 v50, 0x0

    .line 1050
    .line 1051
    const/16 v51, 0x0

    .line 1052
    .line 1053
    move-object/from16 v22, v1

    .line 1054
    .line 1055
    invoke-static/range {v12 .. v53}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    sget-object v2, La/u0f0;->p:La/u0f0;

    .line 1060
    .line 1061
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    invoke-static {v11, v2}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v2

    .line 1069
    const-string v3, "DOCUMENT_TYPE"

    .line 1070
    .line 1071
    iget-object v4, v1, La/r1f0;->j:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;

    .line 1072
    .line 1073
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1074
    .line 1075
    .line 1076
    new-instance v0, Lkotlin/Pair;

    .line 1077
    .line 1078
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1079
    .line 1080
    .line 1081
    goto/16 :goto_0

    .line 1082
    .line 1083
    :cond_4
    instance-of v1, v9, La/kq90;

    .line 1084
    .line 1085
    if-eqz v1, :cond_5

    .line 1086
    .line 1087
    check-cast v9, La/kq90;

    .line 1088
    .line 1089
    new-instance v0, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;

    .line 1090
    .line 1091
    iget v1, v9, La/kq90;->a:I

    .line 1092
    .line 1093
    iget-object v4, v9, La/kq90;->d:Ljava/lang/String;

    .line 1094
    .line 1095
    iget-object v5, v9, La/kq90;->f:Ljava/lang/String;

    .line 1096
    .line 1097
    iget-wide v2, v9, La/kq90;->e:J

    .line 1098
    .line 1099
    iget-object v6, v9, La/kq90;->i:Ljava/lang/String;

    .line 1100
    .line 1101
    invoke-direct/range {v0 .. v6}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1102
    .line 1103
    .line 1104
    iget-object v13, v9, La/kq90;->g:Ljava/lang/String;

    .line 1105
    .line 1106
    iget-object v1, v9, La/kq90;->h:La/cm90;

    .line 1107
    .line 1108
    iget-object v14, v1, La/cm90;->d:Ljava/lang/String;

    .line 1109
    .line 1110
    sget-object v1, La/u0f0;->h:La/u0f0;

    .line 1111
    .line 1112
    sget-object v2, La/u0f0;->d:La/u0f0;

    .line 1113
    .line 1114
    filled-new-array {v1, v2}, [La/u0f0;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v1

    .line 1118
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v15

    .line 1122
    move-object v12, v0

    .line 1123
    invoke-virtual/range {v10 .. v15}, La/g090;->c(La/u4f0;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lkotlin/Pair;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    goto/16 :goto_0

    .line 1128
    .line 1129
    :cond_5
    instance-of v1, v9, La/lq90;

    .line 1130
    .line 1131
    if-eqz v1, :cond_6

    .line 1132
    .line 1133
    check-cast v9, La/lq90;

    .line 1134
    .line 1135
    new-instance v1, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;

    .line 1136
    .line 1137
    iget v3, v9, La/lq90;->a:I

    .line 1138
    .line 1139
    iget-object v4, v9, La/lq90;->c:Ljava/lang/String;

    .line 1140
    .line 1141
    invoke-direct {v1, v3, v4}, Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;-><init>(ILjava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    const v52, -0x200009

    .line 1145
    .line 1146
    .line 1147
    const/16 v53, 0x7f

    .line 1148
    .line 1149
    const/4 v13, 0x0

    .line 1150
    const/4 v14, 0x0

    .line 1151
    const/4 v15, 0x0

    .line 1152
    const/16 v16, 0x0

    .line 1153
    .line 1154
    const/16 v17, 0x0

    .line 1155
    .line 1156
    const/16 v18, 0x0

    .line 1157
    .line 1158
    const/16 v19, 0x0

    .line 1159
    .line 1160
    const/16 v20, 0x0

    .line 1161
    .line 1162
    const/16 v21, 0x0

    .line 1163
    .line 1164
    const/16 v22, 0x0

    .line 1165
    .line 1166
    const/16 v23, 0x0

    .line 1167
    .line 1168
    const/16 v24, 0x0

    .line 1169
    .line 1170
    const/16 v25, 0x0

    .line 1171
    .line 1172
    const/16 v26, 0x0

    .line 1173
    .line 1174
    const/16 v27, 0x0

    .line 1175
    .line 1176
    const/16 v28, 0x0

    .line 1177
    .line 1178
    const/16 v29, 0x0

    .line 1179
    .line 1180
    const/16 v30, 0x0

    .line 1181
    .line 1182
    const/16 v31, 0x0

    .line 1183
    .line 1184
    const/16 v32, 0x0

    .line 1185
    .line 1186
    const/16 v33, 0x0

    .line 1187
    .line 1188
    const/16 v35, 0x0

    .line 1189
    .line 1190
    const/16 v36, 0x0

    .line 1191
    .line 1192
    const/16 v37, 0x0

    .line 1193
    .line 1194
    const/16 v38, 0x0

    .line 1195
    .line 1196
    const/16 v39, 0x0

    .line 1197
    .line 1198
    const/16 v40, 0x0

    .line 1199
    .line 1200
    const/16 v41, 0x0

    .line 1201
    .line 1202
    const/16 v42, 0x0

    .line 1203
    .line 1204
    const/16 v43, 0x0

    .line 1205
    .line 1206
    const/16 v44, 0x0

    .line 1207
    .line 1208
    const/16 v45, 0x0

    .line 1209
    .line 1210
    const/16 v46, 0x0

    .line 1211
    .line 1212
    const/16 v47, 0x0

    .line 1213
    .line 1214
    const/16 v48, 0x0

    .line 1215
    .line 1216
    const/16 v49, 0x0

    .line 1217
    .line 1218
    const/16 v50, 0x0

    .line 1219
    .line 1220
    const/16 v51, 0x0

    .line 1221
    .line 1222
    move-object/from16 v34, v1

    .line 1223
    .line 1224
    invoke-static/range {v12 .. v53}, La/r1f0;->a(La/r1f0;Ljava/lang/String;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/r1f0;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v1

    .line 1228
    sget-object v3, La/u0f0;->e:La/u0f0;

    .line 1229
    .line 1230
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v3

    .line 1234
    invoke-static {v11, v3}, La/g090;->f(La/u4f0;Ljava/util/List;)Ljava/util/Map;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    const-string v4, "REGION"

    .line 1239
    .line 1240
    iget-object v5, v1, La/r1f0;->v:Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;

    .line 1241
    .line 1242
    invoke-virtual {v0, v4, v5}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v0, v2, v6}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1246
    .line 1247
    .line 1248
    new-instance v0, Lkotlin/Pair;

    .line 1249
    .line 1250
    invoke-direct {v0, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_0

    .line 1254
    :cond_6
    iget-object v0, v11, La/u4f0;->e:Ljava/util/Map;

    .line 1255
    .line 1256
    new-instance v1, Lkotlin/Pair;

    .line 1257
    .line 1258
    invoke-direct {v1, v12, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1259
    .line 1260
    .line 1261
    move-object v0, v1

    .line 1262
    :goto_0
    return-object v0

    .line 1263
    :pswitch_15
    check-cast v9, La/k1f0;

    .line 1264
    .line 1265
    check-cast v8, La/vne;

    .line 1266
    .line 1267
    move-object/from16 v0, p1

    .line 1268
    .line 1269
    check-cast v0, Ljava/lang/Throwable;

    .line 1270
    .line 1271
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    iget-object v1, v9, La/k1f0;->k:La/p7m0;

    .line 1278
    .line 1279
    sget-object v2, La/i8d;->e:La/i8d;

    .line 1280
    .line 1281
    invoke-virtual {v1, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v9, v0, v8}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 1285
    .line 1286
    .line 1287
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1288
    .line 1289
    return-object v0

    .line 1290
    :pswitch_16
    check-cast v9, La/eze0;

    .line 1291
    .line 1292
    check-cast v8, La/qu4;

    .line 1293
    .line 1294
    move-object/from16 v0, p1

    .line 1295
    .line 1296
    check-cast v0, La/k0w0;

    .line 1297
    .line 1298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1299
    .line 1300
    .line 1301
    iget-object v1, v9, La/eze0;->p:La/sek;

    .line 1302
    .line 1303
    new-instance v4, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;

    .line 1304
    .line 1305
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v5

    .line 1309
    check-cast v5, La/aye0;

    .line 1310
    .line 1311
    iget-object v5, v5, La/aye0;->h:La/q1f0;

    .line 1312
    .line 1313
    iget-object v5, v5, La/q1f0;->k:Ljava/lang/String;

    .line 1314
    .line 1315
    if-nez v5, :cond_7

    .line 1316
    .line 1317
    move-object v11, v2

    .line 1318
    goto :goto_1

    .line 1319
    :cond_7
    move-object v11, v5

    .line 1320
    :goto_1
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v5

    .line 1324
    check-cast v5, La/aye0;

    .line 1325
    .line 1326
    iget-object v5, v5, La/aye0;->h:La/q1f0;

    .line 1327
    .line 1328
    iget-object v5, v5, La/q1f0;->u:Ljava/lang/String;

    .line 1329
    .line 1330
    if-nez v5, :cond_8

    .line 1331
    .line 1332
    move-object v12, v2

    .line 1333
    goto :goto_2

    .line 1334
    :cond_8
    move-object v12, v5

    .line 1335
    :goto_2
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v5

    .line 1339
    check-cast v5, La/aye0;

    .line 1340
    .line 1341
    iget-object v5, v5, La/aye0;->h:La/q1f0;

    .line 1342
    .line 1343
    iget-object v5, v5, La/q1f0;->M:La/q7f0;

    .line 1344
    .line 1345
    if-eqz v5, :cond_9

    .line 1346
    .line 1347
    iget-byte v7, v5, La/q7f0;->a:B

    .line 1348
    .line 1349
    :goto_3
    move v13, v7

    .line 1350
    goto :goto_4

    .line 1351
    :cond_9
    sget-object v5, La/q7f0;->b:La/gne0;

    .line 1352
    .line 1353
    goto :goto_3

    .line 1354
    :goto_4
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v5

    .line 1358
    check-cast v5, La/aye0;

    .line 1359
    .line 1360
    iget-object v5, v5, La/aye0;->h:La/q1f0;

    .line 1361
    .line 1362
    iget-object v5, v5, La/q1f0;->g:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 1363
    .line 1364
    if-eqz v5, :cond_a

    .line 1365
    .line 1366
    iget v5, v5, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;->a:I

    .line 1367
    .line 1368
    goto :goto_5

    .line 1369
    :cond_a
    const/4 v5, -0x1

    .line 1370
    :goto_5
    int-to-long v14, v5

    .line 1371
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v5

    .line 1375
    check-cast v5, La/aye0;

    .line 1376
    .line 1377
    iget-object v5, v5, La/aye0;->h:La/q1f0;

    .line 1378
    .line 1379
    iget-object v5, v5, La/q1f0;->g:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 1380
    .line 1381
    if-eqz v5, :cond_b

    .line 1382
    .line 1383
    iget-object v5, v5, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;->b:Ljava/lang/String;

    .line 1384
    .line 1385
    goto :goto_6

    .line 1386
    :cond_b
    move-object v5, v6

    .line 1387
    :goto_6
    if-nez v5, :cond_c

    .line 1388
    .line 1389
    move-object v5, v2

    .line 1390
    :cond_c
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v7

    .line 1394
    check-cast v7, La/aye0;

    .line 1395
    .line 1396
    iget-object v7, v7, La/aye0;->h:La/q1f0;

    .line 1397
    .line 1398
    iget-object v7, v7, La/q1f0;->h:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;

    .line 1399
    .line 1400
    if-eqz v7, :cond_d

    .line 1401
    .line 1402
    iget-object v7, v7, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;->b:Ljava/lang/String;

    .line 1403
    .line 1404
    goto :goto_7

    .line 1405
    :cond_d
    move-object v7, v6

    .line 1406
    :goto_7
    if-nez v7, :cond_e

    .line 1407
    .line 1408
    move-object v7, v2

    .line 1409
    :cond_e
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v10

    .line 1413
    check-cast v10, La/aye0;

    .line 1414
    .line 1415
    iget-object v10, v10, La/aye0;->h:La/q1f0;

    .line 1416
    .line 1417
    iget-object v10, v10, La/q1f0;->c:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;

    .line 1418
    .line 1419
    if-eqz v10, :cond_f

    .line 1420
    .line 1421
    iget-object v10, v10, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;->b:Ljava/lang/String;

    .line 1422
    .line 1423
    goto :goto_8

    .line 1424
    :cond_f
    move-object v10, v6

    .line 1425
    :goto_8
    if-nez v10, :cond_10

    .line 1426
    .line 1427
    move-object/from16 v16, v2

    .line 1428
    .line 1429
    goto :goto_9

    .line 1430
    :cond_10
    move-object/from16 v16, v10

    .line 1431
    .line 1432
    :goto_9
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v10

    .line 1436
    check-cast v10, La/aye0;

    .line 1437
    .line 1438
    iget-object v10, v10, La/aye0;->h:La/q1f0;

    .line 1439
    .line 1440
    iget-object v10, v10, La/q1f0;->g:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 1441
    .line 1442
    if-eqz v10, :cond_11

    .line 1443
    .line 1444
    iget-object v6, v10, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;->e:Ljava/lang/String;

    .line 1445
    .line 1446
    :cond_11
    if-nez v6, :cond_12

    .line 1447
    .line 1448
    move-object/from16 v19, v2

    .line 1449
    .line 1450
    goto :goto_a

    .line 1451
    :cond_12
    move-object/from16 v19, v6

    .line 1452
    .line 1453
    :goto_a
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v2

    .line 1457
    check-cast v2, La/aye0;

    .line 1458
    .line 1459
    iget-object v2, v2, La/aye0;->A:La/cne0;

    .line 1460
    .line 1461
    iget-object v2, v2, La/cne0;->a:Ljava/lang/String;

    .line 1462
    .line 1463
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v6

    .line 1467
    check-cast v6, La/aye0;

    .line 1468
    .line 1469
    iget-object v6, v6, La/aye0;->h:La/q1f0;

    .line 1470
    .line 1471
    iget-object v6, v6, La/q1f0;->D:Ljava/lang/Integer;

    .line 1472
    .line 1473
    new-instance v10, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;

    .line 1474
    .line 1475
    move-object/from16 v20, v2

    .line 1476
    .line 1477
    move-object/from16 v21, v6

    .line 1478
    .line 1479
    move-wide/from16 v17, v14

    .line 1480
    .line 1481
    move-object v14, v5

    .line 1482
    move-object v15, v7

    .line 1483
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1484
    .line 1485
    .line 1486
    new-instance v2, La/swp0;

    .line 1487
    .line 1488
    iget-object v5, v8, La/qu4;->a:Ljava/lang/String;

    .line 1489
    .line 1490
    iget-object v6, v8, La/qu4;->b:Ljava/lang/String;

    .line 1491
    .line 1492
    invoke-direct {v2, v5, v6, v3}, La/swp0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1493
    .line 1494
    .line 1495
    invoke-direct {v4, v10, v2}, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;-><init>(Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;La/swp0;)V

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1499
    .line 1500
    .line 1501
    new-instance v1, Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;

    .line 1502
    .line 1503
    invoke-direct {v1, v4}, Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;-><init>(Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1507
    .line 1508
    .line 1509
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1510
    .line 1511
    return-object v0

    .line 1512
    :pswitch_17
    check-cast v9, Landroid/view/Window;

    .line 1513
    .line 1514
    check-cast v8, La/iwe0;

    .line 1515
    .line 1516
    move-object/from16 v0, p1

    .line 1517
    .line 1518
    check-cast v0, La/ilz;

    .line 1519
    .line 1520
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1521
    .line 1522
    .line 1523
    if-eqz v9, :cond_14

    .line 1524
    .line 1525
    iget-boolean v0, v8, La/iwe0;->a:Z

    .line 1526
    .line 1527
    if-eqz v0, :cond_13

    .line 1528
    .line 1529
    const v0, 0x7f040ae3

    .line 1530
    .line 1531
    .line 1532
    goto :goto_b

    .line 1533
    :cond_13
    const v0, 0x7f040ae1

    .line 1534
    .line 1535
    .line 1536
    :goto_b
    const/4 v1, 0x6

    .line 1537
    invoke-static {v9, v0, v6, v1}, La/ofm0;->x(Landroid/view/Window;ILandroid/content/Context;I)V

    .line 1538
    .line 1539
    .line 1540
    :cond_14
    new-instance v0, La/pa2;

    .line 1541
    .line 1542
    const/16 v1, 0xd

    .line 1543
    .line 1544
    invoke-direct {v0, v1}, La/pa2;-><init>(B)V

    .line 1545
    .line 1546
    .line 1547
    return-object v0

    .line 1548
    :pswitch_18
    move-object/from16 v41, v9

    .line 1549
    .line 1550
    check-cast v41, La/q7f0;

    .line 1551
    .line 1552
    move-object v0, v8

    .line 1553
    check-cast v0, La/dq00;

    .line 1554
    .line 1555
    move-object/from16 v1, p1

    .line 1556
    .line 1557
    check-cast v1, La/aye0;

    .line 1558
    .line 1559
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1560
    .line 1561
    .line 1562
    iget-object v2, v1, La/aye0;->h:La/q1f0;

    .line 1563
    .line 1564
    const/16 v42, -0x1

    .line 1565
    .line 1566
    const/16 v43, 0x3f

    .line 1567
    .line 1568
    const/4 v3, 0x0

    .line 1569
    const/4 v4, 0x0

    .line 1570
    const/4 v5, 0x0

    .line 1571
    const/4 v6, 0x0

    .line 1572
    const/4 v7, 0x0

    .line 1573
    const/4 v8, 0x0

    .line 1574
    const/4 v9, 0x0

    .line 1575
    const/4 v10, 0x0

    .line 1576
    const/4 v11, 0x0

    .line 1577
    const/4 v12, 0x0

    .line 1578
    const/4 v13, 0x0

    .line 1579
    const/4 v14, 0x0

    .line 1580
    const/4 v15, 0x0

    .line 1581
    const/16 v16, 0x0

    .line 1582
    .line 1583
    const/16 v17, 0x0

    .line 1584
    .line 1585
    const/16 v18, 0x0

    .line 1586
    .line 1587
    const/16 v19, 0x0

    .line 1588
    .line 1589
    const/16 v20, 0x0

    .line 1590
    .line 1591
    const/16 v21, 0x0

    .line 1592
    .line 1593
    const/16 v22, 0x0

    .line 1594
    .line 1595
    const/16 v23, 0x0

    .line 1596
    .line 1597
    const/16 v24, 0x0

    .line 1598
    .line 1599
    const/16 v25, 0x0

    .line 1600
    .line 1601
    const/16 v26, 0x0

    .line 1602
    .line 1603
    const/16 v27, 0x0

    .line 1604
    .line 1605
    const/16 v28, 0x0

    .line 1606
    .line 1607
    const/16 v29, 0x0

    .line 1608
    .line 1609
    const/16 v30, 0x0

    .line 1610
    .line 1611
    const/16 v31, 0x0

    .line 1612
    .line 1613
    const/16 v32, 0x0

    .line 1614
    .line 1615
    const/16 v33, 0x0

    .line 1616
    .line 1617
    const/16 v34, 0x0

    .line 1618
    .line 1619
    const/16 v35, 0x0

    .line 1620
    .line 1621
    const/16 v36, 0x0

    .line 1622
    .line 1623
    const/16 v37, 0x0

    .line 1624
    .line 1625
    const/16 v38, 0x0

    .line 1626
    .line 1627
    const/16 v39, 0x0

    .line 1628
    .line 1629
    const/16 v40, 0x0

    .line 1630
    .line 1631
    invoke-static/range {v2 .. v43}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v2

    .line 1635
    iget-object v0, v0, La/dq00;->b:Ljava/lang/Object;

    .line 1636
    .line 1637
    check-cast v0, La/vzg0;

    .line 1638
    .line 1639
    const-string v3, "REGISTRATION_TYPE"

    .line 1640
    .line 1641
    iget-object v4, v2, La/q1f0;->M:La/q7f0;

    .line 1642
    .line 1643
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1644
    .line 1645
    .line 1646
    iget-object v0, v1, La/aye0;->f:Ljava/util/Map;

    .line 1647
    .line 1648
    new-instance v1, Lkotlin/Pair;

    .line 1649
    .line 1650
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1651
    .line 1652
    .line 1653
    return-object v1

    .line 1654
    :pswitch_19
    check-cast v9, La/hgt;

    .line 1655
    .line 1656
    check-cast v8, La/dq00;

    .line 1657
    .line 1658
    move-object/from16 v0, p1

    .line 1659
    .line 1660
    check-cast v0, La/aye0;

    .line 1661
    .line 1662
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1663
    .line 1664
    .line 1665
    iget-object v10, v0, La/aye0;->h:La/q1f0;

    .line 1666
    .line 1667
    iget v1, v9, La/hgt;->a:I

    .line 1668
    .line 1669
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v42

    .line 1673
    const v50, 0x7fffffff

    .line 1674
    .line 1675
    .line 1676
    const/16 v51, 0x7f

    .line 1677
    .line 1678
    const/4 v11, 0x0

    .line 1679
    const/4 v12, 0x0

    .line 1680
    const/4 v13, 0x0

    .line 1681
    const/4 v14, 0x0

    .line 1682
    const/4 v15, 0x0

    .line 1683
    const/16 v16, 0x0

    .line 1684
    .line 1685
    const/16 v17, 0x0

    .line 1686
    .line 1687
    const/16 v18, 0x0

    .line 1688
    .line 1689
    const/16 v19, 0x0

    .line 1690
    .line 1691
    const/16 v20, 0x0

    .line 1692
    .line 1693
    const/16 v21, 0x0

    .line 1694
    .line 1695
    const/16 v22, 0x0

    .line 1696
    .line 1697
    const/16 v23, 0x0

    .line 1698
    .line 1699
    const/16 v24, 0x0

    .line 1700
    .line 1701
    const/16 v25, 0x0

    .line 1702
    .line 1703
    const/16 v26, 0x0

    .line 1704
    .line 1705
    const/16 v27, 0x0

    .line 1706
    .line 1707
    const/16 v28, 0x0

    .line 1708
    .line 1709
    const/16 v29, 0x0

    .line 1710
    .line 1711
    const/16 v30, 0x0

    .line 1712
    .line 1713
    const/16 v31, 0x0

    .line 1714
    .line 1715
    const/16 v32, 0x0

    .line 1716
    .line 1717
    const/16 v33, 0x0

    .line 1718
    .line 1719
    const/16 v34, 0x0

    .line 1720
    .line 1721
    const/16 v35, 0x0

    .line 1722
    .line 1723
    const/16 v36, 0x0

    .line 1724
    .line 1725
    const/16 v37, 0x0

    .line 1726
    .line 1727
    const/16 v38, 0x0

    .line 1728
    .line 1729
    const/16 v39, 0x0

    .line 1730
    .line 1731
    const/16 v40, 0x0

    .line 1732
    .line 1733
    const/16 v41, 0x0

    .line 1734
    .line 1735
    const/16 v43, 0x0

    .line 1736
    .line 1737
    const/16 v44, 0x0

    .line 1738
    .line 1739
    const/16 v45, 0x0

    .line 1740
    .line 1741
    const/16 v46, 0x0

    .line 1742
    .line 1743
    const/16 v47, 0x0

    .line 1744
    .line 1745
    const/16 v48, 0x0

    .line 1746
    .line 1747
    const/16 v49, 0x0

    .line 1748
    .line 1749
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v1

    .line 1753
    sget-object v2, La/u0f0;->r:La/u0f0;

    .line 1754
    .line 1755
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v2

    .line 1759
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1760
    .line 1761
    .line 1762
    invoke-static {v0, v2}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v0

    .line 1766
    iget-object v2, v8, La/dq00;->b:Ljava/lang/Object;

    .line 1767
    .line 1768
    check-cast v2, La/vzg0;

    .line 1769
    .line 1770
    const-string v3, "GENDER"

    .line 1771
    .line 1772
    iget-object v4, v1, La/q1f0;->F:Ljava/lang/Integer;

    .line 1773
    .line 1774
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1775
    .line 1776
    .line 1777
    new-instance v2, Lkotlin/Pair;

    .line 1778
    .line 1779
    invoke-direct {v2, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1780
    .line 1781
    .line 1782
    return-object v2

    .line 1783
    :pswitch_1a
    check-cast v8, La/dq00;

    .line 1784
    .line 1785
    check-cast v9, La/u0f0;

    .line 1786
    .line 1787
    move-object/from16 v0, p1

    .line 1788
    .line 1789
    check-cast v0, La/aye0;

    .line 1790
    .line 1791
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1792
    .line 1793
    .line 1794
    iget-object v10, v0, La/aye0;->h:La/q1f0;

    .line 1795
    .line 1796
    invoke-static {v9}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v1

    .line 1800
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1801
    .line 1802
    .line 1803
    invoke-static {v0, v1}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v1

    .line 1807
    iget-object v2, v8, La/dq00;->b:Ljava/lang/Object;

    .line 1808
    .line 1809
    check-cast v2, La/vzg0;

    .line 1810
    .line 1811
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 1812
    .line 1813
    .line 1814
    move-result v3

    .line 1815
    const/16 v4, 0x1d

    .line 1816
    .line 1817
    if-eq v3, v4, :cond_18

    .line 1818
    .line 1819
    const/16 v4, 0x1e

    .line 1820
    .line 1821
    if-eq v3, v4, :cond_17

    .line 1822
    .line 1823
    const/16 v4, 0x26

    .line 1824
    .line 1825
    if-eq v3, v4, :cond_16

    .line 1826
    .line 1827
    const/16 v4, 0x27

    .line 1828
    .line 1829
    if-eq v3, v4, :cond_15

    .line 1830
    .line 1831
    packed-switch v3, :pswitch_data_1

    .line 1832
    .line 1833
    .line 1834
    iget-object v0, v0, La/aye0;->f:Ljava/util/Map;

    .line 1835
    .line 1836
    new-instance v1, Lkotlin/Pair;

    .line 1837
    .line 1838
    invoke-direct {v1, v10, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1839
    .line 1840
    .line 1841
    goto/16 :goto_d

    .line 1842
    .line 1843
    :pswitch_1b
    iget-boolean v0, v10, La/q1f0;->y:Z

    .line 1844
    .line 1845
    xor-int/lit8 v35, v0, 0x1

    .line 1846
    .line 1847
    const v50, -0x1000001

    .line 1848
    .line 1849
    .line 1850
    const/16 v51, 0x7f

    .line 1851
    .line 1852
    const/4 v11, 0x0

    .line 1853
    const/4 v12, 0x0

    .line 1854
    const/4 v13, 0x0

    .line 1855
    const/4 v14, 0x0

    .line 1856
    const/4 v15, 0x0

    .line 1857
    const/16 v16, 0x0

    .line 1858
    .line 1859
    const/16 v17, 0x0

    .line 1860
    .line 1861
    const/16 v18, 0x0

    .line 1862
    .line 1863
    const/16 v19, 0x0

    .line 1864
    .line 1865
    const/16 v20, 0x0

    .line 1866
    .line 1867
    const/16 v21, 0x0

    .line 1868
    .line 1869
    const/16 v22, 0x0

    .line 1870
    .line 1871
    const/16 v23, 0x0

    .line 1872
    .line 1873
    const/16 v24, 0x0

    .line 1874
    .line 1875
    const/16 v25, 0x0

    .line 1876
    .line 1877
    const/16 v26, 0x0

    .line 1878
    .line 1879
    const/16 v27, 0x0

    .line 1880
    .line 1881
    const/16 v28, 0x0

    .line 1882
    .line 1883
    const/16 v29, 0x0

    .line 1884
    .line 1885
    const/16 v30, 0x0

    .line 1886
    .line 1887
    const/16 v31, 0x0

    .line 1888
    .line 1889
    const/16 v32, 0x0

    .line 1890
    .line 1891
    const/16 v33, 0x0

    .line 1892
    .line 1893
    const/16 v34, 0x0

    .line 1894
    .line 1895
    const/16 v36, 0x0

    .line 1896
    .line 1897
    const/16 v37, 0x0

    .line 1898
    .line 1899
    const/16 v38, 0x0

    .line 1900
    .line 1901
    const/16 v39, 0x0

    .line 1902
    .line 1903
    const/16 v40, 0x0

    .line 1904
    .line 1905
    const/16 v41, 0x0

    .line 1906
    .line 1907
    const/16 v42, 0x0

    .line 1908
    .line 1909
    const/16 v43, 0x0

    .line 1910
    .line 1911
    const/16 v44, 0x0

    .line 1912
    .line 1913
    const/16 v45, 0x0

    .line 1914
    .line 1915
    const/16 v46, 0x0

    .line 1916
    .line 1917
    const/16 v47, 0x0

    .line 1918
    .line 1919
    const/16 v48, 0x0

    .line 1920
    .line 1921
    const/16 v49, 0x0

    .line 1922
    .line 1923
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0

    .line 1927
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v3

    .line 1931
    iget-boolean v4, v0, La/q1f0;->y:Z

    .line 1932
    .line 1933
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v4

    .line 1937
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1938
    .line 1939
    .line 1940
    new-instance v2, Lkotlin/Pair;

    .line 1941
    .line 1942
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1943
    .line 1944
    .line 1945
    :goto_c
    move-object v1, v2

    .line 1946
    goto/16 :goto_d

    .line 1947
    .line 1948
    :pswitch_1c
    iget-boolean v0, v10, La/q1f0;->x:Z

    .line 1949
    .line 1950
    xor-int/lit8 v34, v0, 0x1

    .line 1951
    .line 1952
    const v50, -0x800001

    .line 1953
    .line 1954
    .line 1955
    const/16 v51, 0x7f

    .line 1956
    .line 1957
    const/4 v11, 0x0

    .line 1958
    const/4 v12, 0x0

    .line 1959
    const/4 v13, 0x0

    .line 1960
    const/4 v14, 0x0

    .line 1961
    const/4 v15, 0x0

    .line 1962
    const/16 v16, 0x0

    .line 1963
    .line 1964
    const/16 v17, 0x0

    .line 1965
    .line 1966
    const/16 v18, 0x0

    .line 1967
    .line 1968
    const/16 v19, 0x0

    .line 1969
    .line 1970
    const/16 v20, 0x0

    .line 1971
    .line 1972
    const/16 v21, 0x0

    .line 1973
    .line 1974
    const/16 v22, 0x0

    .line 1975
    .line 1976
    const/16 v23, 0x0

    .line 1977
    .line 1978
    const/16 v24, 0x0

    .line 1979
    .line 1980
    const/16 v25, 0x0

    .line 1981
    .line 1982
    const/16 v26, 0x0

    .line 1983
    .line 1984
    const/16 v27, 0x0

    .line 1985
    .line 1986
    const/16 v28, 0x0

    .line 1987
    .line 1988
    const/16 v29, 0x0

    .line 1989
    .line 1990
    const/16 v30, 0x0

    .line 1991
    .line 1992
    const/16 v31, 0x0

    .line 1993
    .line 1994
    const/16 v32, 0x0

    .line 1995
    .line 1996
    const/16 v33, 0x0

    .line 1997
    .line 1998
    const/16 v35, 0x0

    .line 1999
    .line 2000
    const/16 v36, 0x0

    .line 2001
    .line 2002
    const/16 v37, 0x0

    .line 2003
    .line 2004
    const/16 v38, 0x0

    .line 2005
    .line 2006
    const/16 v39, 0x0

    .line 2007
    .line 2008
    const/16 v40, 0x0

    .line 2009
    .line 2010
    const/16 v41, 0x0

    .line 2011
    .line 2012
    const/16 v42, 0x0

    .line 2013
    .line 2014
    const/16 v43, 0x0

    .line 2015
    .line 2016
    const/16 v44, 0x0

    .line 2017
    .line 2018
    const/16 v45, 0x0

    .line 2019
    .line 2020
    const/16 v46, 0x0

    .line 2021
    .line 2022
    const/16 v47, 0x0

    .line 2023
    .line 2024
    const/16 v48, 0x0

    .line 2025
    .line 2026
    const/16 v49, 0x0

    .line 2027
    .line 2028
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v0

    .line 2032
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v3

    .line 2036
    iget-boolean v4, v0, La/q1f0;->x:Z

    .line 2037
    .line 2038
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v4

    .line 2042
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2043
    .line 2044
    .line 2045
    new-instance v2, Lkotlin/Pair;

    .line 2046
    .line 2047
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2048
    .line 2049
    .line 2050
    goto :goto_c

    .line 2051
    :pswitch_1d
    iget-boolean v0, v10, La/q1f0;->C:Z

    .line 2052
    .line 2053
    xor-int/lit8 v39, v0, 0x1

    .line 2054
    .line 2055
    const v50, -0x10000001

    .line 2056
    .line 2057
    .line 2058
    const/16 v51, 0x7f

    .line 2059
    .line 2060
    const/4 v11, 0x0

    .line 2061
    const/4 v12, 0x0

    .line 2062
    const/4 v13, 0x0

    .line 2063
    const/4 v14, 0x0

    .line 2064
    const/4 v15, 0x0

    .line 2065
    const/16 v16, 0x0

    .line 2066
    .line 2067
    const/16 v17, 0x0

    .line 2068
    .line 2069
    const/16 v18, 0x0

    .line 2070
    .line 2071
    const/16 v19, 0x0

    .line 2072
    .line 2073
    const/16 v20, 0x0

    .line 2074
    .line 2075
    const/16 v21, 0x0

    .line 2076
    .line 2077
    const/16 v22, 0x0

    .line 2078
    .line 2079
    const/16 v23, 0x0

    .line 2080
    .line 2081
    const/16 v24, 0x0

    .line 2082
    .line 2083
    const/16 v25, 0x0

    .line 2084
    .line 2085
    const/16 v26, 0x0

    .line 2086
    .line 2087
    const/16 v27, 0x0

    .line 2088
    .line 2089
    const/16 v28, 0x0

    .line 2090
    .line 2091
    const/16 v29, 0x0

    .line 2092
    .line 2093
    const/16 v30, 0x0

    .line 2094
    .line 2095
    const/16 v31, 0x0

    .line 2096
    .line 2097
    const/16 v32, 0x0

    .line 2098
    .line 2099
    const/16 v33, 0x0

    .line 2100
    .line 2101
    const/16 v34, 0x0

    .line 2102
    .line 2103
    const/16 v35, 0x0

    .line 2104
    .line 2105
    const/16 v36, 0x0

    .line 2106
    .line 2107
    const/16 v37, 0x0

    .line 2108
    .line 2109
    const/16 v38, 0x0

    .line 2110
    .line 2111
    const/16 v40, 0x0

    .line 2112
    .line 2113
    const/16 v41, 0x0

    .line 2114
    .line 2115
    const/16 v42, 0x0

    .line 2116
    .line 2117
    const/16 v43, 0x0

    .line 2118
    .line 2119
    const/16 v44, 0x0

    .line 2120
    .line 2121
    const/16 v45, 0x0

    .line 2122
    .line 2123
    const/16 v46, 0x0

    .line 2124
    .line 2125
    const/16 v47, 0x0

    .line 2126
    .line 2127
    const/16 v48, 0x0

    .line 2128
    .line 2129
    const/16 v49, 0x0

    .line 2130
    .line 2131
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v0

    .line 2135
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v3

    .line 2139
    iget-boolean v4, v0, La/q1f0;->C:Z

    .line 2140
    .line 2141
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v4

    .line 2145
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2146
    .line 2147
    .line 2148
    new-instance v2, Lkotlin/Pair;

    .line 2149
    .line 2150
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2151
    .line 2152
    .line 2153
    goto/16 :goto_c

    .line 2154
    .line 2155
    :pswitch_1e
    iget-boolean v0, v10, La/q1f0;->e:Z

    .line 2156
    .line 2157
    xor-int/lit8 v15, v0, 0x1

    .line 2158
    .line 2159
    const/16 v50, -0x11

    .line 2160
    .line 2161
    const/16 v51, 0x7f

    .line 2162
    .line 2163
    const/4 v11, 0x0

    .line 2164
    const/4 v12, 0x0

    .line 2165
    const/4 v13, 0x0

    .line 2166
    const/4 v14, 0x0

    .line 2167
    const/16 v16, 0x0

    .line 2168
    .line 2169
    const/16 v17, 0x0

    .line 2170
    .line 2171
    const/16 v18, 0x0

    .line 2172
    .line 2173
    const/16 v19, 0x0

    .line 2174
    .line 2175
    const/16 v20, 0x0

    .line 2176
    .line 2177
    const/16 v21, 0x0

    .line 2178
    .line 2179
    const/16 v22, 0x0

    .line 2180
    .line 2181
    const/16 v23, 0x0

    .line 2182
    .line 2183
    const/16 v24, 0x0

    .line 2184
    .line 2185
    const/16 v25, 0x0

    .line 2186
    .line 2187
    const/16 v26, 0x0

    .line 2188
    .line 2189
    const/16 v27, 0x0

    .line 2190
    .line 2191
    const/16 v28, 0x0

    .line 2192
    .line 2193
    const/16 v29, 0x0

    .line 2194
    .line 2195
    const/16 v30, 0x0

    .line 2196
    .line 2197
    const/16 v31, 0x0

    .line 2198
    .line 2199
    const/16 v32, 0x0

    .line 2200
    .line 2201
    const/16 v33, 0x0

    .line 2202
    .line 2203
    const/16 v34, 0x0

    .line 2204
    .line 2205
    const/16 v35, 0x0

    .line 2206
    .line 2207
    const/16 v36, 0x0

    .line 2208
    .line 2209
    const/16 v37, 0x0

    .line 2210
    .line 2211
    const/16 v38, 0x0

    .line 2212
    .line 2213
    const/16 v39, 0x0

    .line 2214
    .line 2215
    const/16 v40, 0x0

    .line 2216
    .line 2217
    const/16 v41, 0x0

    .line 2218
    .line 2219
    const/16 v42, 0x0

    .line 2220
    .line 2221
    const/16 v43, 0x0

    .line 2222
    .line 2223
    const/16 v44, 0x0

    .line 2224
    .line 2225
    const/16 v45, 0x0

    .line 2226
    .line 2227
    const/16 v46, 0x0

    .line 2228
    .line 2229
    const/16 v47, 0x0

    .line 2230
    .line 2231
    const/16 v48, 0x0

    .line 2232
    .line 2233
    const/16 v49, 0x0

    .line 2234
    .line 2235
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v0

    .line 2239
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v3

    .line 2243
    iget-boolean v4, v0, La/q1f0;->e:Z

    .line 2244
    .line 2245
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v4

    .line 2249
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2250
    .line 2251
    .line 2252
    new-instance v2, Lkotlin/Pair;

    .line 2253
    .line 2254
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2255
    .line 2256
    .line 2257
    goto/16 :goto_c

    .line 2258
    .line 2259
    :pswitch_1f
    iget-boolean v0, v10, La/q1f0;->A:Z

    .line 2260
    .line 2261
    xor-int/lit8 v37, v0, 0x1

    .line 2262
    .line 2263
    const v50, -0x4000001

    .line 2264
    .line 2265
    .line 2266
    const/16 v51, 0x7f

    .line 2267
    .line 2268
    const/4 v11, 0x0

    .line 2269
    const/4 v12, 0x0

    .line 2270
    const/4 v13, 0x0

    .line 2271
    const/4 v14, 0x0

    .line 2272
    const/4 v15, 0x0

    .line 2273
    const/16 v16, 0x0

    .line 2274
    .line 2275
    const/16 v17, 0x0

    .line 2276
    .line 2277
    const/16 v18, 0x0

    .line 2278
    .line 2279
    const/16 v19, 0x0

    .line 2280
    .line 2281
    const/16 v20, 0x0

    .line 2282
    .line 2283
    const/16 v21, 0x0

    .line 2284
    .line 2285
    const/16 v22, 0x0

    .line 2286
    .line 2287
    const/16 v23, 0x0

    .line 2288
    .line 2289
    const/16 v24, 0x0

    .line 2290
    .line 2291
    const/16 v25, 0x0

    .line 2292
    .line 2293
    const/16 v26, 0x0

    .line 2294
    .line 2295
    const/16 v27, 0x0

    .line 2296
    .line 2297
    const/16 v28, 0x0

    .line 2298
    .line 2299
    const/16 v29, 0x0

    .line 2300
    .line 2301
    const/16 v30, 0x0

    .line 2302
    .line 2303
    const/16 v31, 0x0

    .line 2304
    .line 2305
    const/16 v32, 0x0

    .line 2306
    .line 2307
    const/16 v33, 0x0

    .line 2308
    .line 2309
    const/16 v34, 0x0

    .line 2310
    .line 2311
    const/16 v35, 0x0

    .line 2312
    .line 2313
    const/16 v36, 0x0

    .line 2314
    .line 2315
    const/16 v38, 0x0

    .line 2316
    .line 2317
    const/16 v39, 0x0

    .line 2318
    .line 2319
    const/16 v40, 0x0

    .line 2320
    .line 2321
    const/16 v41, 0x0

    .line 2322
    .line 2323
    const/16 v42, 0x0

    .line 2324
    .line 2325
    const/16 v43, 0x0

    .line 2326
    .line 2327
    const/16 v44, 0x0

    .line 2328
    .line 2329
    const/16 v45, 0x0

    .line 2330
    .line 2331
    const/16 v46, 0x0

    .line 2332
    .line 2333
    const/16 v47, 0x0

    .line 2334
    .line 2335
    const/16 v48, 0x0

    .line 2336
    .line 2337
    const/16 v49, 0x0

    .line 2338
    .line 2339
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v0

    .line 2343
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v3

    .line 2347
    iget-boolean v4, v0, La/q1f0;->A:Z

    .line 2348
    .line 2349
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v4

    .line 2353
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2354
    .line 2355
    .line 2356
    new-instance v2, Lkotlin/Pair;

    .line 2357
    .line 2358
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2359
    .line 2360
    .line 2361
    goto/16 :goto_c

    .line 2362
    .line 2363
    :pswitch_20
    iget-boolean v0, v10, La/q1f0;->B:Z

    .line 2364
    .line 2365
    xor-int/lit8 v38, v0, 0x1

    .line 2366
    .line 2367
    const v50, -0x8000001

    .line 2368
    .line 2369
    .line 2370
    const/16 v51, 0x7f

    .line 2371
    .line 2372
    const/4 v11, 0x0

    .line 2373
    const/4 v12, 0x0

    .line 2374
    const/4 v13, 0x0

    .line 2375
    const/4 v14, 0x0

    .line 2376
    const/4 v15, 0x0

    .line 2377
    const/16 v16, 0x0

    .line 2378
    .line 2379
    const/16 v17, 0x0

    .line 2380
    .line 2381
    const/16 v18, 0x0

    .line 2382
    .line 2383
    const/16 v19, 0x0

    .line 2384
    .line 2385
    const/16 v20, 0x0

    .line 2386
    .line 2387
    const/16 v21, 0x0

    .line 2388
    .line 2389
    const/16 v22, 0x0

    .line 2390
    .line 2391
    const/16 v23, 0x0

    .line 2392
    .line 2393
    const/16 v24, 0x0

    .line 2394
    .line 2395
    const/16 v25, 0x0

    .line 2396
    .line 2397
    const/16 v26, 0x0

    .line 2398
    .line 2399
    const/16 v27, 0x0

    .line 2400
    .line 2401
    const/16 v28, 0x0

    .line 2402
    .line 2403
    const/16 v29, 0x0

    .line 2404
    .line 2405
    const/16 v30, 0x0

    .line 2406
    .line 2407
    const/16 v31, 0x0

    .line 2408
    .line 2409
    const/16 v32, 0x0

    .line 2410
    .line 2411
    const/16 v33, 0x0

    .line 2412
    .line 2413
    const/16 v34, 0x0

    .line 2414
    .line 2415
    const/16 v35, 0x0

    .line 2416
    .line 2417
    const/16 v36, 0x0

    .line 2418
    .line 2419
    const/16 v37, 0x0

    .line 2420
    .line 2421
    const/16 v39, 0x0

    .line 2422
    .line 2423
    const/16 v40, 0x0

    .line 2424
    .line 2425
    const/16 v41, 0x0

    .line 2426
    .line 2427
    const/16 v42, 0x0

    .line 2428
    .line 2429
    const/16 v43, 0x0

    .line 2430
    .line 2431
    const/16 v44, 0x0

    .line 2432
    .line 2433
    const/16 v45, 0x0

    .line 2434
    .line 2435
    const/16 v46, 0x0

    .line 2436
    .line 2437
    const/16 v47, 0x0

    .line 2438
    .line 2439
    const/16 v48, 0x0

    .line 2440
    .line 2441
    const/16 v49, 0x0

    .line 2442
    .line 2443
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2444
    .line 2445
    .line 2446
    move-result-object v0

    .line 2447
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2448
    .line 2449
    .line 2450
    move-result-object v3

    .line 2451
    iget-boolean v4, v0, La/q1f0;->B:Z

    .line 2452
    .line 2453
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v4

    .line 2457
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2458
    .line 2459
    .line 2460
    new-instance v2, Lkotlin/Pair;

    .line 2461
    .line 2462
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2463
    .line 2464
    .line 2465
    goto/16 :goto_c

    .line 2466
    .line 2467
    :cond_15
    iget-boolean v0, v10, La/q1f0;->L:Z

    .line 2468
    .line 2469
    xor-int/lit8 v48, v0, 0x1

    .line 2470
    .line 2471
    const/16 v50, -0x1

    .line 2472
    .line 2473
    const/16 v51, 0x5f

    .line 2474
    .line 2475
    const/4 v11, 0x0

    .line 2476
    const/4 v12, 0x0

    .line 2477
    const/4 v13, 0x0

    .line 2478
    const/4 v14, 0x0

    .line 2479
    const/4 v15, 0x0

    .line 2480
    const/16 v16, 0x0

    .line 2481
    .line 2482
    const/16 v17, 0x0

    .line 2483
    .line 2484
    const/16 v18, 0x0

    .line 2485
    .line 2486
    const/16 v19, 0x0

    .line 2487
    .line 2488
    const/16 v20, 0x0

    .line 2489
    .line 2490
    const/16 v21, 0x0

    .line 2491
    .line 2492
    const/16 v22, 0x0

    .line 2493
    .line 2494
    const/16 v23, 0x0

    .line 2495
    .line 2496
    const/16 v24, 0x0

    .line 2497
    .line 2498
    const/16 v25, 0x0

    .line 2499
    .line 2500
    const/16 v26, 0x0

    .line 2501
    .line 2502
    const/16 v27, 0x0

    .line 2503
    .line 2504
    const/16 v28, 0x0

    .line 2505
    .line 2506
    const/16 v29, 0x0

    .line 2507
    .line 2508
    const/16 v30, 0x0

    .line 2509
    .line 2510
    const/16 v31, 0x0

    .line 2511
    .line 2512
    const/16 v32, 0x0

    .line 2513
    .line 2514
    const/16 v33, 0x0

    .line 2515
    .line 2516
    const/16 v34, 0x0

    .line 2517
    .line 2518
    const/16 v35, 0x0

    .line 2519
    .line 2520
    const/16 v36, 0x0

    .line 2521
    .line 2522
    const/16 v37, 0x0

    .line 2523
    .line 2524
    const/16 v38, 0x0

    .line 2525
    .line 2526
    const/16 v39, 0x0

    .line 2527
    .line 2528
    const/16 v40, 0x0

    .line 2529
    .line 2530
    const/16 v41, 0x0

    .line 2531
    .line 2532
    const/16 v42, 0x0

    .line 2533
    .line 2534
    const/16 v43, 0x0

    .line 2535
    .line 2536
    const/16 v44, 0x0

    .line 2537
    .line 2538
    const/16 v45, 0x0

    .line 2539
    .line 2540
    const/16 v46, 0x0

    .line 2541
    .line 2542
    const/16 v47, 0x0

    .line 2543
    .line 2544
    const/16 v49, 0x0

    .line 2545
    .line 2546
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2547
    .line 2548
    .line 2549
    move-result-object v0

    .line 2550
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2551
    .line 2552
    .line 2553
    move-result-object v3

    .line 2554
    iget-boolean v4, v0, La/q1f0;->L:Z

    .line 2555
    .line 2556
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2557
    .line 2558
    .line 2559
    move-result-object v4

    .line 2560
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2561
    .line 2562
    .line 2563
    new-instance v2, Lkotlin/Pair;

    .line 2564
    .line 2565
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2566
    .line 2567
    .line 2568
    goto/16 :goto_c

    .line 2569
    .line 2570
    :cond_16
    iget-boolean v0, v10, La/q1f0;->f:Z

    .line 2571
    .line 2572
    xor-int/lit8 v16, v0, 0x1

    .line 2573
    .line 2574
    const/16 v50, -0x21

    .line 2575
    .line 2576
    const/16 v51, 0x7f

    .line 2577
    .line 2578
    const/4 v11, 0x0

    .line 2579
    const/4 v12, 0x0

    .line 2580
    const/4 v13, 0x0

    .line 2581
    const/4 v14, 0x0

    .line 2582
    const/4 v15, 0x0

    .line 2583
    const/16 v17, 0x0

    .line 2584
    .line 2585
    const/16 v18, 0x0

    .line 2586
    .line 2587
    const/16 v19, 0x0

    .line 2588
    .line 2589
    const/16 v20, 0x0

    .line 2590
    .line 2591
    const/16 v21, 0x0

    .line 2592
    .line 2593
    const/16 v22, 0x0

    .line 2594
    .line 2595
    const/16 v23, 0x0

    .line 2596
    .line 2597
    const/16 v24, 0x0

    .line 2598
    .line 2599
    const/16 v25, 0x0

    .line 2600
    .line 2601
    const/16 v26, 0x0

    .line 2602
    .line 2603
    const/16 v27, 0x0

    .line 2604
    .line 2605
    const/16 v28, 0x0

    .line 2606
    .line 2607
    const/16 v29, 0x0

    .line 2608
    .line 2609
    const/16 v30, 0x0

    .line 2610
    .line 2611
    const/16 v31, 0x0

    .line 2612
    .line 2613
    const/16 v32, 0x0

    .line 2614
    .line 2615
    const/16 v33, 0x0

    .line 2616
    .line 2617
    const/16 v34, 0x0

    .line 2618
    .line 2619
    const/16 v35, 0x0

    .line 2620
    .line 2621
    const/16 v36, 0x0

    .line 2622
    .line 2623
    const/16 v37, 0x0

    .line 2624
    .line 2625
    const/16 v38, 0x0

    .line 2626
    .line 2627
    const/16 v39, 0x0

    .line 2628
    .line 2629
    const/16 v40, 0x0

    .line 2630
    .line 2631
    const/16 v41, 0x0

    .line 2632
    .line 2633
    const/16 v42, 0x0

    .line 2634
    .line 2635
    const/16 v43, 0x0

    .line 2636
    .line 2637
    const/16 v44, 0x0

    .line 2638
    .line 2639
    const/16 v45, 0x0

    .line 2640
    .line 2641
    const/16 v46, 0x0

    .line 2642
    .line 2643
    const/16 v47, 0x0

    .line 2644
    .line 2645
    const/16 v48, 0x0

    .line 2646
    .line 2647
    const/16 v49, 0x0

    .line 2648
    .line 2649
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2650
    .line 2651
    .line 2652
    move-result-object v0

    .line 2653
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v3

    .line 2657
    iget-boolean v4, v0, La/q1f0;->f:Z

    .line 2658
    .line 2659
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2660
    .line 2661
    .line 2662
    move-result-object v4

    .line 2663
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2664
    .line 2665
    .line 2666
    new-instance v2, Lkotlin/Pair;

    .line 2667
    .line 2668
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2669
    .line 2670
    .line 2671
    goto/16 :goto_c

    .line 2672
    .line 2673
    :cond_17
    iget-boolean v0, v10, La/q1f0;->b:Z

    .line 2674
    .line 2675
    xor-int/lit8 v12, v0, 0x1

    .line 2676
    .line 2677
    const/16 v50, -0x3

    .line 2678
    .line 2679
    const/16 v51, 0x7f

    .line 2680
    .line 2681
    const/4 v11, 0x0

    .line 2682
    const/4 v13, 0x0

    .line 2683
    const/4 v14, 0x0

    .line 2684
    const/4 v15, 0x0

    .line 2685
    const/16 v16, 0x0

    .line 2686
    .line 2687
    const/16 v17, 0x0

    .line 2688
    .line 2689
    const/16 v18, 0x0

    .line 2690
    .line 2691
    const/16 v19, 0x0

    .line 2692
    .line 2693
    const/16 v20, 0x0

    .line 2694
    .line 2695
    const/16 v21, 0x0

    .line 2696
    .line 2697
    const/16 v22, 0x0

    .line 2698
    .line 2699
    const/16 v23, 0x0

    .line 2700
    .line 2701
    const/16 v24, 0x0

    .line 2702
    .line 2703
    const/16 v25, 0x0

    .line 2704
    .line 2705
    const/16 v26, 0x0

    .line 2706
    .line 2707
    const/16 v27, 0x0

    .line 2708
    .line 2709
    const/16 v28, 0x0

    .line 2710
    .line 2711
    const/16 v29, 0x0

    .line 2712
    .line 2713
    const/16 v30, 0x0

    .line 2714
    .line 2715
    const/16 v31, 0x0

    .line 2716
    .line 2717
    const/16 v32, 0x0

    .line 2718
    .line 2719
    const/16 v33, 0x0

    .line 2720
    .line 2721
    const/16 v34, 0x0

    .line 2722
    .line 2723
    const/16 v35, 0x0

    .line 2724
    .line 2725
    const/16 v36, 0x0

    .line 2726
    .line 2727
    const/16 v37, 0x0

    .line 2728
    .line 2729
    const/16 v38, 0x0

    .line 2730
    .line 2731
    const/16 v39, 0x0

    .line 2732
    .line 2733
    const/16 v40, 0x0

    .line 2734
    .line 2735
    const/16 v41, 0x0

    .line 2736
    .line 2737
    const/16 v42, 0x0

    .line 2738
    .line 2739
    const/16 v43, 0x0

    .line 2740
    .line 2741
    const/16 v44, 0x0

    .line 2742
    .line 2743
    const/16 v45, 0x0

    .line 2744
    .line 2745
    const/16 v46, 0x0

    .line 2746
    .line 2747
    const/16 v47, 0x0

    .line 2748
    .line 2749
    const/16 v48, 0x0

    .line 2750
    .line 2751
    const/16 v49, 0x0

    .line 2752
    .line 2753
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2754
    .line 2755
    .line 2756
    move-result-object v0

    .line 2757
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2758
    .line 2759
    .line 2760
    move-result-object v3

    .line 2761
    iget-boolean v4, v0, La/q1f0;->b:Z

    .line 2762
    .line 2763
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2764
    .line 2765
    .line 2766
    move-result-object v4

    .line 2767
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2768
    .line 2769
    .line 2770
    new-instance v2, Lkotlin/Pair;

    .line 2771
    .line 2772
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2773
    .line 2774
    .line 2775
    goto/16 :goto_c

    .line 2776
    .line 2777
    :cond_18
    iget-object v0, v10, La/q1f0;->s:Ljava/lang/Boolean;

    .line 2778
    .line 2779
    const v50, -0x40001

    .line 2780
    .line 2781
    .line 2782
    const/16 v51, 0x7f

    .line 2783
    .line 2784
    const/4 v11, 0x0

    .line 2785
    const/4 v12, 0x0

    .line 2786
    const/4 v13, 0x0

    .line 2787
    const/4 v14, 0x0

    .line 2788
    const/4 v15, 0x0

    .line 2789
    const/16 v16, 0x0

    .line 2790
    .line 2791
    const/16 v17, 0x0

    .line 2792
    .line 2793
    const/16 v18, 0x0

    .line 2794
    .line 2795
    const/16 v19, 0x0

    .line 2796
    .line 2797
    const/16 v20, 0x0

    .line 2798
    .line 2799
    const/16 v21, 0x0

    .line 2800
    .line 2801
    const/16 v22, 0x0

    .line 2802
    .line 2803
    const/16 v23, 0x0

    .line 2804
    .line 2805
    const/16 v24, 0x0

    .line 2806
    .line 2807
    const/16 v25, 0x0

    .line 2808
    .line 2809
    const/16 v26, 0x0

    .line 2810
    .line 2811
    const/16 v27, 0x0

    .line 2812
    .line 2813
    const/16 v28, 0x0

    .line 2814
    .line 2815
    const/16 v30, 0x0

    .line 2816
    .line 2817
    const/16 v31, 0x0

    .line 2818
    .line 2819
    const/16 v32, 0x0

    .line 2820
    .line 2821
    const/16 v33, 0x0

    .line 2822
    .line 2823
    const/16 v34, 0x0

    .line 2824
    .line 2825
    const/16 v35, 0x0

    .line 2826
    .line 2827
    const/16 v36, 0x0

    .line 2828
    .line 2829
    const/16 v37, 0x0

    .line 2830
    .line 2831
    const/16 v38, 0x0

    .line 2832
    .line 2833
    const/16 v39, 0x0

    .line 2834
    .line 2835
    const/16 v40, 0x0

    .line 2836
    .line 2837
    const/16 v41, 0x0

    .line 2838
    .line 2839
    const/16 v42, 0x0

    .line 2840
    .line 2841
    const/16 v43, 0x0

    .line 2842
    .line 2843
    const/16 v44, 0x0

    .line 2844
    .line 2845
    const/16 v45, 0x0

    .line 2846
    .line 2847
    const/16 v46, 0x0

    .line 2848
    .line 2849
    const/16 v47, 0x0

    .line 2850
    .line 2851
    const/16 v48, 0x0

    .line 2852
    .line 2853
    const/16 v49, 0x0

    .line 2854
    .line 2855
    move-object/from16 v29, v0

    .line 2856
    .line 2857
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2858
    .line 2859
    .line 2860
    move-result-object v0

    .line 2861
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2862
    .line 2863
    .line 2864
    move-result-object v3

    .line 2865
    iget-object v4, v0, La/q1f0;->s:Ljava/lang/Boolean;

    .line 2866
    .line 2867
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2868
    .line 2869
    .line 2870
    new-instance v2, Lkotlin/Pair;

    .line 2871
    .line 2872
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2873
    .line 2874
    .line 2875
    goto/16 :goto_c

    .line 2876
    .line 2877
    :goto_d
    return-object v1

    .line 2878
    :pswitch_21
    move-object/from16 v26, v9

    .line 2879
    .line 2880
    check-cast v26, Ljava/lang/String;

    .line 2881
    .line 2882
    move-object v0, v8

    .line 2883
    check-cast v0, La/dq00;

    .line 2884
    .line 2885
    move-object/from16 v1, p1

    .line 2886
    .line 2887
    check-cast v1, La/aye0;

    .line 2888
    .line 2889
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2890
    .line 2891
    .line 2892
    iget-object v5, v1, La/aye0;->h:La/q1f0;

    .line 2893
    .line 2894
    const v45, -0x100001

    .line 2895
    .line 2896
    .line 2897
    const/16 v46, 0x7f

    .line 2898
    .line 2899
    const/4 v6, 0x0

    .line 2900
    const/4 v7, 0x0

    .line 2901
    const/4 v8, 0x0

    .line 2902
    const/4 v9, 0x0

    .line 2903
    const/4 v10, 0x0

    .line 2904
    const/4 v11, 0x0

    .line 2905
    const/4 v12, 0x0

    .line 2906
    const/4 v13, 0x0

    .line 2907
    const/4 v14, 0x0

    .line 2908
    const/4 v15, 0x0

    .line 2909
    const/16 v16, 0x0

    .line 2910
    .line 2911
    const/16 v17, 0x0

    .line 2912
    .line 2913
    const/16 v18, 0x0

    .line 2914
    .line 2915
    const/16 v19, 0x0

    .line 2916
    .line 2917
    const/16 v20, 0x0

    .line 2918
    .line 2919
    const/16 v21, 0x0

    .line 2920
    .line 2921
    const/16 v22, 0x0

    .line 2922
    .line 2923
    const/16 v23, 0x0

    .line 2924
    .line 2925
    const/16 v24, 0x0

    .line 2926
    .line 2927
    const/16 v25, 0x0

    .line 2928
    .line 2929
    const/16 v27, 0x0

    .line 2930
    .line 2931
    const/16 v28, 0x0

    .line 2932
    .line 2933
    const/16 v29, 0x0

    .line 2934
    .line 2935
    const/16 v30, 0x0

    .line 2936
    .line 2937
    const/16 v31, 0x0

    .line 2938
    .line 2939
    const/16 v32, 0x0

    .line 2940
    .line 2941
    const/16 v33, 0x0

    .line 2942
    .line 2943
    const/16 v34, 0x0

    .line 2944
    .line 2945
    const/16 v35, 0x0

    .line 2946
    .line 2947
    const/16 v36, 0x0

    .line 2948
    .line 2949
    const/16 v37, 0x0

    .line 2950
    .line 2951
    const/16 v38, 0x0

    .line 2952
    .line 2953
    const/16 v39, 0x0

    .line 2954
    .line 2955
    const/16 v40, 0x0

    .line 2956
    .line 2957
    const/16 v41, 0x0

    .line 2958
    .line 2959
    const/16 v42, 0x0

    .line 2960
    .line 2961
    const/16 v43, 0x0

    .line 2962
    .line 2963
    const/16 v44, 0x0

    .line 2964
    .line 2965
    invoke-static/range {v5 .. v46}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 2966
    .line 2967
    .line 2968
    move-result-object v2

    .line 2969
    sget-object v3, La/u0f0;->u:La/u0f0;

    .line 2970
    .line 2971
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2972
    .line 2973
    .line 2974
    move-result-object v3

    .line 2975
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2976
    .line 2977
    .line 2978
    invoke-static {v1, v3}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 2979
    .line 2980
    .line 2981
    move-result-object v1

    .line 2982
    iget-object v0, v0, La/dq00;->b:Ljava/lang/Object;

    .line 2983
    .line 2984
    check-cast v0, La/vzg0;

    .line 2985
    .line 2986
    iget-object v3, v2, La/q1f0;->u:Ljava/lang/String;

    .line 2987
    .line 2988
    invoke-virtual {v0, v4, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2989
    .line 2990
    .line 2991
    new-instance v0, Lkotlin/Pair;

    .line 2992
    .line 2993
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2994
    .line 2995
    .line 2996
    return-object v0

    .line 2997
    :pswitch_22
    check-cast v9, La/rkt;

    .line 2998
    .line 2999
    iget-object v0, v9, La/rkt;->h:La/cm90;

    .line 3000
    .line 3001
    check-cast v8, La/dq00;

    .line 3002
    .line 3003
    move-object/from16 v1, p1

    .line 3004
    .line 3005
    check-cast v1, La/aye0;

    .line 3006
    .line 3007
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3008
    .line 3009
    .line 3010
    iget-object v10, v1, La/aye0;->h:La/q1f0;

    .line 3011
    .line 3012
    iget-object v3, v10, La/q1f0;->r:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;

    .line 3013
    .line 3014
    iget-object v4, v9, La/rkt;->c:Ljava/lang/String;

    .line 3015
    .line 3016
    const-string v5, "+"

    .line 3017
    .line 3018
    if-eqz v3, :cond_19

    .line 3019
    .line 3020
    invoke-static {v5, v4}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3021
    .line 3022
    .line 3023
    move-result-object v3

    .line 3024
    iget-object v4, v0, La/cm90;->d:Ljava/lang/String;

    .line 3025
    .line 3026
    iget v0, v0, La/cm90;->c:I

    .line 3027
    .line 3028
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3029
    .line 3030
    .line 3031
    move-result-object v0

    .line 3032
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3033
    .line 3034
    .line 3035
    new-instance v5, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;

    .line 3036
    .line 3037
    invoke-direct {v5, v2, v3, v4, v0}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 3038
    .line 3039
    .line 3040
    move-object/from16 v28, v5

    .line 3041
    .line 3042
    goto :goto_e

    .line 3043
    :cond_19
    new-instance v3, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;

    .line 3044
    .line 3045
    invoke-static {v5, v4}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3046
    .line 3047
    .line 3048
    move-result-object v4

    .line 3049
    iget-object v5, v0, La/cm90;->d:Ljava/lang/String;

    .line 3050
    .line 3051
    iget v0, v0, La/cm90;->c:I

    .line 3052
    .line 3053
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3054
    .line 3055
    .line 3056
    move-result-object v0

    .line 3057
    invoke-direct {v3, v2, v4, v5, v0}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 3058
    .line 3059
    .line 3060
    move-object/from16 v28, v3

    .line 3061
    .line 3062
    :goto_e
    new-instance v17, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 3063
    .line 3064
    iget v12, v9, La/rkt;->a:I

    .line 3065
    .line 3066
    iget-object v15, v9, La/rkt;->b:Ljava/lang/String;

    .line 3067
    .line 3068
    iget-object v0, v9, La/rkt;->f:Ljava/lang/String;

    .line 3069
    .line 3070
    iget-wide v13, v9, La/rkt;->e:J

    .line 3071
    .line 3072
    iget-object v2, v9, La/rkt;->d:Ljava/lang/String;

    .line 3073
    .line 3074
    move-object/from16 v16, v0

    .line 3075
    .line 3076
    move-object/from16 v11, v17

    .line 3077
    .line 3078
    move-object/from16 v17, v2

    .line 3079
    .line 3080
    invoke-direct/range {v11 .. v17}, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3081
    .line 3082
    .line 3083
    move-object/from16 v17, v11

    .line 3084
    .line 3085
    const v50, -0x20041

    .line 3086
    .line 3087
    .line 3088
    const/16 v51, 0x7f

    .line 3089
    .line 3090
    const/4 v11, 0x0

    .line 3091
    const/4 v12, 0x0

    .line 3092
    const/4 v13, 0x0

    .line 3093
    const/4 v14, 0x0

    .line 3094
    const/4 v15, 0x0

    .line 3095
    const/16 v16, 0x0

    .line 3096
    .line 3097
    const/16 v18, 0x0

    .line 3098
    .line 3099
    const/16 v19, 0x0

    .line 3100
    .line 3101
    const/16 v20, 0x0

    .line 3102
    .line 3103
    const/16 v21, 0x0

    .line 3104
    .line 3105
    const/16 v22, 0x0

    .line 3106
    .line 3107
    const/16 v23, 0x0

    .line 3108
    .line 3109
    const/16 v24, 0x0

    .line 3110
    .line 3111
    const/16 v25, 0x0

    .line 3112
    .line 3113
    const/16 v26, 0x0

    .line 3114
    .line 3115
    const/16 v27, 0x0

    .line 3116
    .line 3117
    const/16 v29, 0x0

    .line 3118
    .line 3119
    const/16 v30, 0x0

    .line 3120
    .line 3121
    const/16 v31, 0x0

    .line 3122
    .line 3123
    const/16 v32, 0x0

    .line 3124
    .line 3125
    const/16 v33, 0x0

    .line 3126
    .line 3127
    const/16 v34, 0x0

    .line 3128
    .line 3129
    const/16 v35, 0x0

    .line 3130
    .line 3131
    const/16 v36, 0x0

    .line 3132
    .line 3133
    const/16 v37, 0x0

    .line 3134
    .line 3135
    const/16 v38, 0x0

    .line 3136
    .line 3137
    const/16 v39, 0x0

    .line 3138
    .line 3139
    const/16 v40, 0x0

    .line 3140
    .line 3141
    const/16 v41, 0x0

    .line 3142
    .line 3143
    const/16 v42, 0x0

    .line 3144
    .line 3145
    const/16 v43, 0x0

    .line 3146
    .line 3147
    const/16 v44, 0x0

    .line 3148
    .line 3149
    const/16 v45, 0x0

    .line 3150
    .line 3151
    const/16 v46, 0x0

    .line 3152
    .line 3153
    const/16 v47, 0x0

    .line 3154
    .line 3155
    const/16 v48, 0x0

    .line 3156
    .line 3157
    const/16 v49, 0x0

    .line 3158
    .line 3159
    invoke-static/range {v10 .. v51}, La/q1f0;->a(La/q1f0;Ljava/lang/String;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;ZZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/q1f0;

    .line 3160
    .line 3161
    .line 3162
    move-result-object v0

    .line 3163
    sget-object v2, La/u0f0;->d:La/u0f0;

    .line 3164
    .line 3165
    sget-object v3, La/u0f0;->h:La/u0f0;

    .line 3166
    .line 3167
    filled-new-array {v2, v3}, [La/u0f0;

    .line 3168
    .line 3169
    .line 3170
    move-result-object v2

    .line 3171
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 3172
    .line 3173
    .line 3174
    move-result-object v2

    .line 3175
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3176
    .line 3177
    .line 3178
    invoke-static {v1, v2}, La/dq00;->d(La/aye0;Ljava/util/List;)Ljava/util/Map;

    .line 3179
    .line 3180
    .line 3181
    move-result-object v1

    .line 3182
    iget-object v2, v8, La/dq00;->b:Ljava/lang/Object;

    .line 3183
    .line 3184
    check-cast v2, La/vzg0;

    .line 3185
    .line 3186
    const-string v3, "COUNTRY"

    .line 3187
    .line 3188
    iget-object v4, v0, La/q1f0;->g:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 3189
    .line 3190
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3191
    .line 3192
    .line 3193
    const-string v3, "PHONE"

    .line 3194
    .line 3195
    iget-object v4, v0, La/q1f0;->r:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/PhoneStateModel;

    .line 3196
    .line 3197
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3198
    .line 3199
    .line 3200
    new-instance v2, Lkotlin/Pair;

    .line 3201
    .line 3202
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3203
    .line 3204
    .line 3205
    return-object v2

    .line 3206
    nop

    .line 3207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
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

    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    :pswitch_data_1
    .packed-switch 0x16
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch
.end method
