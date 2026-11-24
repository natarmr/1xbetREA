.class public final synthetic La/sl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function0;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x4

    iput-byte v0, p0, La/sl1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/sl1;->b:J

    iput-object p3, p0, La/sl1;->d:Ljava/lang/Object;

    iput-boolean p4, p0, La/sl1;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(La/cyu;JLa/zuc0;Z)V
    .locals 0

    .line 1
    const/16 p1, 0xe

    iput-byte p1, p0, La/sl1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, La/sl1;->b:J

    iput-object p4, p0, La/sl1;->d:Ljava/lang/Object;

    iput-boolean p5, p0, La/sl1;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(La/gr00;JZLjava/lang/String;)V
    .locals 0

    .line 3
    const/4 p1, 0x0

    iput-byte p1, p0, La/sl1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, La/sl1;->b:J

    iput-boolean p4, p0, La/sl1;->c:Z

    iput-object p5, p0, La/sl1;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JZB)V
    .locals 0

    .line 4
    iput-byte p5, p0, La/sl1;->a:B

    iput-object p1, p0, La/sl1;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/sl1;->b:J

    iput-boolean p4, p0, La/sl1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLa/i3t0;JB)V
    .locals 0

    .line 5
    iput-byte p5, p0, La/sl1;->a:B

    iput-boolean p1, p0, La/sl1;->c:Z

    iput-object p2, p0, La/sl1;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/sl1;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>([La/jwo;ZJ)V
    .locals 1

    .line 6
    const/4 v0, 0x7

    iput-byte v0, p0, La/sl1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sl1;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/sl1;->c:Z

    iput-wide p3, p0, La/sl1;->b:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sl1;->a:B

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    iget-boolean v4, v0, La/sl1;->c:Z

    .line 9
    .line 10
    iget-wide v5, v0, La/sl1;->b:J

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    iget-object v8, v0, La/sl1;->d:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v14, v8

    .line 19
    check-cast v14, La/tzt0;

    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, La/k0w0;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v9, La/m92;

    .line 29
    .line 30
    const/4 v13, 0x0

    .line 31
    const/4 v10, 0x6

    .line 32
    iget-wide v11, v0, La/sl1;->b:J

    .line 33
    .line 34
    iget-boolean v15, v0, La/sl1;->c:Z

    .line 35
    .line 36
    invoke-direct/range {v9 .. v15}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 37
    .line 38
    .line 39
    new-instance v0, La/b1w0;

    .line 40
    .line 41
    invoke-direct {v0, v9}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, La/c8d;

    .line 51
    .line 52
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 53
    .line 54
    new-instance v2, La/v7d;

    .line 55
    .line 56
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 57
    .line 58
    .line 59
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_0
    move-object v2, v8

    .line 65
    check-cast v2, La/ncl0;

    .line 66
    .line 67
    move-object/from16 v8, p1

    .line 68
    .line 69
    check-cast v8, La/k0w0;

    .line 70
    .line 71
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v1, La/dor;

    .line 75
    .line 76
    const/4 v6, 0x4

    .line 77
    iget-wide v3, v0, La/sl1;->b:J

    .line 78
    .line 79
    iget-boolean v5, v0, La/sl1;->c:Z

    .line 80
    .line 81
    invoke-direct/range {v1 .. v6}, La/dor;-><init>(La/diu0;JZB)V

    .line 82
    .line 83
    .line 84
    new-instance v0, La/a1w0;

    .line 85
    .line 86
    invoke-direct {v0, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, La/c8d;

    .line 96
    .line 97
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 98
    .line 99
    new-instance v2, La/v7d;

    .line 100
    .line 101
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 102
    .line 103
    .line 104
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 105
    .line 106
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_1
    move-object v13, v8

    .line 110
    check-cast v13, La/hxd0;

    .line 111
    .line 112
    move-object/from16 v1, p1

    .line 113
    .line 114
    check-cast v1, La/k0w0;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v8, La/m92;

    .line 120
    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v9, 0x5

    .line 123
    iget-wide v10, v0, La/sl1;->b:J

    .line 124
    .line 125
    iget-boolean v14, v0, La/sl1;->c:Z

    .line 126
    .line 127
    invoke-direct/range {v8 .. v14}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 128
    .line 129
    .line 130
    new-instance v0, La/b1w0;

    .line 131
    .line 132
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, La/c8d;

    .line 142
    .line 143
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 144
    .line 145
    new-instance v2, La/v7d;

    .line 146
    .line 147
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 148
    .line 149
    .line 150
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 151
    .line 152
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_2
    check-cast v8, La/zuc0;

    .line 156
    .line 157
    move-object/from16 v0, p1

    .line 158
    .line 159
    check-cast v0, La/k0w0;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v1, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 165
    .line 166
    invoke-direct {v1, v8, v5, v6}, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;-><init>(La/zuc0;J)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, La/c8d;

    .line 176
    .line 177
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 178
    .line 179
    new-instance v2, La/nqd;

    .line 180
    .line 181
    invoke-direct {v2, v3}, La/nqd;-><init>(B)V

    .line 182
    .line 183
    .line 184
    iput-boolean v4, v2, La/nqd;->b:Z

    .line 185
    .line 186
    invoke-virtual {v2}, La/nqd;->d()La/bjk;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    new-instance v3, La/v7d;

    .line 191
    .line 192
    invoke-direct {v3, v7, v1, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 193
    .line 194
    .line 195
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 196
    .line 197
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_3
    move-object v13, v8

    .line 201
    check-cast v13, La/wk40;

    .line 202
    .line 203
    move-object/from16 v1, p1

    .line 204
    .line 205
    check-cast v1, La/k0w0;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    new-instance v8, La/m92;

    .line 211
    .line 212
    const/4 v12, 0x0

    .line 213
    const/4 v9, 0x3

    .line 214
    iget-wide v10, v0, La/sl1;->b:J

    .line 215
    .line 216
    iget-boolean v14, v0, La/sl1;->c:Z

    .line 217
    .line 218
    invoke-direct/range {v8 .. v14}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 219
    .line 220
    .line 221
    new-instance v0, La/b1w0;

    .line 222
    .line 223
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, La/c8d;

    .line 233
    .line 234
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 235
    .line 236
    new-instance v2, La/v7d;

    .line 237
    .line 238
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 239
    .line 240
    .line 241
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 242
    .line 243
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_4
    move-object v13, v8

    .line 247
    check-cast v13, La/b310;

    .line 248
    .line 249
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, La/k0w0;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    new-instance v8, La/m92;

    .line 257
    .line 258
    const/4 v12, 0x0

    .line 259
    const/4 v9, 0x2

    .line 260
    iget-wide v10, v0, La/sl1;->b:J

    .line 261
    .line 262
    iget-boolean v14, v0, La/sl1;->c:Z

    .line 263
    .line 264
    invoke-direct/range {v8 .. v14}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 265
    .line 266
    .line 267
    new-instance v0, La/b1w0;

    .line 268
    .line 269
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, La/c8d;

    .line 279
    .line 280
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 281
    .line 282
    new-instance v2, La/v7d;

    .line 283
    .line 284
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 285
    .line 286
    .line 287
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 288
    .line 289
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_5
    move-object v2, v8

    .line 293
    check-cast v2, La/yks;

    .line 294
    .line 295
    move-object/from16 v8, p1

    .line 296
    .line 297
    check-cast v8, La/k0w0;

    .line 298
    .line 299
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance v1, La/dor;

    .line 303
    .line 304
    const/4 v6, 0x3

    .line 305
    iget-wide v3, v0, La/sl1;->b:J

    .line 306
    .line 307
    iget-boolean v5, v0, La/sl1;->c:Z

    .line 308
    .line 309
    invoke-direct/range {v1 .. v6}, La/dor;-><init>(La/diu0;JZB)V

    .line 310
    .line 311
    .line 312
    new-instance v0, La/a1w0;

    .line 313
    .line 314
    invoke-direct {v0, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v8, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, La/c8d;

    .line 324
    .line 325
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 326
    .line 327
    new-instance v2, La/v7d;

    .line 328
    .line 329
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 330
    .line 331
    .line 332
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 333
    .line 334
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_6
    move-object v2, v8

    .line 338
    check-cast v2, La/g9s;

    .line 339
    .line 340
    move-object/from16 v8, p1

    .line 341
    .line 342
    check-cast v8, La/k0w0;

    .line 343
    .line 344
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    new-instance v1, La/dor;

    .line 348
    .line 349
    const/4 v6, 0x2

    .line 350
    iget-wide v3, v0, La/sl1;->b:J

    .line 351
    .line 352
    iget-boolean v5, v0, La/sl1;->c:Z

    .line 353
    .line 354
    invoke-direct/range {v1 .. v6}, La/dor;-><init>(La/diu0;JZB)V

    .line 355
    .line 356
    .line 357
    new-instance v0, La/a1w0;

    .line 358
    .line 359
    invoke-direct {v0, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v8, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, La/c8d;

    .line 369
    .line 370
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 371
    .line 372
    new-instance v2, La/v7d;

    .line 373
    .line 374
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 375
    .line 376
    .line 377
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 378
    .line 379
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 380
    .line 381
    return-object v0

    .line 382
    :pswitch_7
    move-object v2, v8

    .line 383
    check-cast v2, La/k4s;

    .line 384
    .line 385
    move-object/from16 v8, p1

    .line 386
    .line 387
    check-cast v8, La/k0w0;

    .line 388
    .line 389
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    new-instance v1, La/dor;

    .line 393
    .line 394
    const/4 v6, 0x1

    .line 395
    iget-wide v3, v0, La/sl1;->b:J

    .line 396
    .line 397
    iget-boolean v5, v0, La/sl1;->c:Z

    .line 398
    .line 399
    invoke-direct/range {v1 .. v6}, La/dor;-><init>(La/diu0;JZB)V

    .line 400
    .line 401
    .line 402
    new-instance v0, La/a1w0;

    .line 403
    .line 404
    invoke-direct {v0, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v8, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v0, La/c8d;

    .line 414
    .line 415
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 416
    .line 417
    new-instance v2, La/v7d;

    .line 418
    .line 419
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 420
    .line 421
    .line 422
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 423
    .line 424
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_8
    move-object v2, v8

    .line 428
    check-cast v2, La/spr;

    .line 429
    .line 430
    move-object/from16 v8, p1

    .line 431
    .line 432
    check-cast v8, La/k0w0;

    .line 433
    .line 434
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    new-instance v1, La/dor;

    .line 438
    .line 439
    const/4 v6, 0x0

    .line 440
    iget-wide v3, v0, La/sl1;->b:J

    .line 441
    .line 442
    iget-boolean v5, v0, La/sl1;->c:Z

    .line 443
    .line 444
    invoke-direct/range {v1 .. v6}, La/dor;-><init>(La/diu0;JZB)V

    .line 445
    .line 446
    .line 447
    new-instance v0, La/a1w0;

    .line 448
    .line 449
    invoke-direct {v0, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v8, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, La/c8d;

    .line 459
    .line 460
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 461
    .line 462
    new-instance v2, La/v7d;

    .line 463
    .line 464
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 465
    .line 466
    .line 467
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 468
    .line 469
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 470
    .line 471
    return-object v0

    .line 472
    :pswitch_9
    check-cast v8, [La/jwo;

    .line 473
    .line 474
    move-object/from16 v9, p1

    .line 475
    .line 476
    check-cast v9, La/g7z;

    .line 477
    .line 478
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v9}, La/g7z;->a()V

    .line 482
    .line 483
    .line 484
    iget-object v0, v9, La/g7z;->a:La/a6a;

    .line 485
    .line 486
    invoke-static {v8}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    check-cast v1, Ljava/lang/Iterable;

    .line 491
    .line 492
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v8

    .line 500
    if-eqz v8, :cond_4

    .line 501
    .line 502
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v8

    .line 506
    check-cast v8, La/jwo;

    .line 507
    .line 508
    invoke-interface {v0}, La/fhl;->d()J

    .line 509
    .line 510
    .line 511
    move-result-wide v10

    .line 512
    invoke-static {v10, v11, v8}, La/vcc;->L(JLa/jwo;)La/iwo;

    .line 513
    .line 514
    .line 515
    move-result-object v10

    .line 516
    const/4 v11, 0x0

    .line 517
    if-eqz v4, :cond_0

    .line 518
    .line 519
    const/high16 v12, 0x42400000    # 48.0f

    .line 520
    .line 521
    invoke-virtual {v9, v12}, La/g7z;->w0(F)F

    .line 522
    .line 523
    .line 524
    move-result v12

    .line 525
    goto :goto_1

    .line 526
    :cond_0
    move v12, v11

    .line 527
    :goto_1
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 528
    .line 529
    .line 530
    move-result v8

    .line 531
    if-eqz v8, :cond_3

    .line 532
    .line 533
    if-eq v8, v7, :cond_3

    .line 534
    .line 535
    if-eq v8, v3, :cond_2

    .line 536
    .line 537
    const/4 v13, 0x3

    .line 538
    if-ne v8, v13, :cond_1

    .line 539
    .line 540
    goto :goto_2

    .line 541
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 542
    .line 543
    .line 544
    const/4 v0, 0x0

    .line 545
    goto :goto_5

    .line 546
    :cond_2
    :goto_2
    invoke-interface {v0}, La/fhl;->d()J

    .line 547
    .line 548
    .line 549
    move-result-wide v13

    .line 550
    const-wide v15, 0xffffffffL

    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    and-long/2addr v13, v15

    .line 556
    long-to-int v8, v13

    .line 557
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 558
    .line 559
    .line 560
    move-result v8

    .line 561
    :goto_3
    div-float/2addr v12, v8

    .line 562
    goto :goto_4

    .line 563
    :cond_3
    invoke-interface {v0}, La/fhl;->d()J

    .line 564
    .line 565
    .line 566
    move-result-wide v13

    .line 567
    shr-long/2addr v13, v2

    .line 568
    long-to-int v8, v13

    .line 569
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 570
    .line 571
    .line 572
    move-result v8

    .line 573
    goto :goto_3

    .line 574
    :goto_4
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    new-instance v11, La/y3d;

    .line 579
    .line 580
    invoke-direct {v11, v5, v6}, La/y3d;-><init>(J)V

    .line 581
    .line 582
    .line 583
    new-instance v13, Lkotlin/Pair;

    .line 584
    .line 585
    invoke-direct {v13, v8, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 589
    .line 590
    .line 591
    move-result-object v8

    .line 592
    sget-wide v11, La/y3d;->f:J

    .line 593
    .line 594
    new-instance v14, La/y3d;

    .line 595
    .line 596
    invoke-direct {v14, v11, v12}, La/y3d;-><init>(J)V

    .line 597
    .line 598
    .line 599
    new-instance v11, Lkotlin/Pair;

    .line 600
    .line 601
    invoke-direct {v11, v8, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    filled-new-array {v13, v11}, [Lkotlin/Pair;

    .line 605
    .line 606
    .line 607
    move-result-object v15

    .line 608
    iget-wide v11, v10, La/iwo;->a:J

    .line 609
    .line 610
    iget-wide v13, v10, La/iwo;->b:J

    .line 611
    .line 612
    const/16 v20, 0x8

    .line 613
    .line 614
    move-wide/from16 v16, v11

    .line 615
    .line 616
    move-wide/from16 v18, v13

    .line 617
    .line 618
    invoke-static/range {v15 .. v20}, La/yk5;->k([Lkotlin/Pair;JJI)La/e900;

    .line 619
    .line 620
    .line 621
    move-result-object v10

    .line 622
    invoke-interface {v0}, La/fhl;->d()J

    .line 623
    .line 624
    .line 625
    move-result-wide v13

    .line 626
    const/16 v18, 0x0

    .line 627
    .line 628
    const/16 v19, 0x7a

    .line 629
    .line 630
    const-wide/16 v11, 0x0

    .line 631
    .line 632
    const/4 v15, 0x0

    .line 633
    const/16 v16, 0x0

    .line 634
    .line 635
    const/16 v17, 0x0

    .line 636
    .line 637
    invoke-static/range {v9 .. v19}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 638
    .line 639
    .line 640
    goto/16 :goto_0

    .line 641
    .line 642
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 643
    .line 644
    :goto_5
    return-object v0

    .line 645
    :pswitch_a
    check-cast v8, La/gbd0;

    .line 646
    .line 647
    move-object/from16 v0, p1

    .line 648
    .line 649
    check-cast v0, La/n1g;

    .line 650
    .line 651
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    iget-wide v1, v8, La/gbd0;->c:J

    .line 655
    .line 656
    iput-wide v1, v0, La/n1g;->c:J

    .line 657
    .line 658
    new-instance v1, La/jq2;

    .line 659
    .line 660
    invoke-direct {v1, v5, v6}, La/jq2;-><init>(J)V

    .line 661
    .line 662
    .line 663
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 664
    .line 665
    sget-object v1, La/l1g;->b:La/l1g;

    .line 666
    .line 667
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 668
    .line 669
    if-eqz v4, :cond_5

    .line 670
    .line 671
    sget-object v1, La/k1g;->c:La/k1g;

    .line 672
    .line 673
    goto :goto_6

    .line 674
    :cond_5
    sget-object v1, La/k1g;->d:La/k1g;

    .line 675
    .line 676
    :goto_6
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 677
    .line 678
    iput-wide v5, v0, La/n1g;->b:J

    .line 679
    .line 680
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 681
    .line 682
    return-object v0

    .line 683
    :pswitch_b
    move-object v13, v8

    .line 684
    check-cast v13, La/vqg;

    .line 685
    .line 686
    move-object/from16 v1, p1

    .line 687
    .line 688
    check-cast v1, La/k0w0;

    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    new-instance v8, La/m92;

    .line 694
    .line 695
    const/4 v12, 0x0

    .line 696
    const/4 v9, 0x1

    .line 697
    iget-wide v10, v0, La/sl1;->b:J

    .line 698
    .line 699
    iget-boolean v14, v0, La/sl1;->c:Z

    .line 700
    .line 701
    invoke-direct/range {v8 .. v14}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 702
    .line 703
    .line 704
    new-instance v0, La/b1w0;

    .line 705
    .line 706
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, La/c8d;

    .line 716
    .line 717
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 718
    .line 719
    new-instance v2, La/v7d;

    .line 720
    .line 721
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 722
    .line 723
    .line 724
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 725
    .line 726
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 727
    .line 728
    return-object v0

    .line 729
    :pswitch_c
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 730
    .line 731
    move-object/from16 v7, p1

    .line 732
    .line 733
    check-cast v7, La/pi9;

    .line 734
    .line 735
    iget-object v1, v7, La/pi9;->a:La/y99;

    .line 736
    .line 737
    invoke-interface {v1}, La/y99;->d()J

    .line 738
    .line 739
    .line 740
    move-result-wide v3

    .line 741
    shr-long v1, v3, v2

    .line 742
    .line 743
    long-to-int v1, v1

    .line 744
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 745
    .line 746
    .line 747
    move-result v1

    .line 748
    const/high16 v2, 0x40000000    # 2.0f

    .line 749
    .line 750
    div-float/2addr v1, v2

    .line 751
    invoke-static {v7, v1}, La/eeq;->Q(La/pi9;F)La/vz2;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    new-instance v1, La/m78;

    .line 756
    .line 757
    const/4 v2, 0x5

    .line 758
    invoke-direct {v1, v5, v6, v2}, La/m78;-><init>(JI)V

    .line 759
    .line 760
    .line 761
    move-object v5, v1

    .line 762
    new-instance v1, La/t13;

    .line 763
    .line 764
    const/4 v6, 0x0

    .line 765
    iget-boolean v3, v0, La/sl1;->c:Z

    .line 766
    .line 767
    move-object v2, v8

    .line 768
    invoke-direct/range {v1 .. v6}, La/t13;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v7, v1}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    return-object v0

    .line 776
    :pswitch_d
    move-object v13, v8

    .line 777
    check-cast v13, La/fk2;

    .line 778
    .line 779
    move-object/from16 v1, p1

    .line 780
    .line 781
    check-cast v1, La/k0w0;

    .line 782
    .line 783
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    new-instance v8, La/dk2;

    .line 787
    .line 788
    const/4 v12, 0x0

    .line 789
    const/4 v9, 0x0

    .line 790
    iget-wide v10, v0, La/sl1;->b:J

    .line 791
    .line 792
    iget-boolean v14, v0, La/sl1;->c:Z

    .line 793
    .line 794
    invoke-direct/range {v8 .. v14}, La/dk2;-><init>(BJLa/yje;La/i3t0;Z)V

    .line 795
    .line 796
    .line 797
    new-instance v0, La/b1w0;

    .line 798
    .line 799
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v0, La/c8d;

    .line 809
    .line 810
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 811
    .line 812
    new-instance v2, La/v7d;

    .line 813
    .line 814
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 815
    .line 816
    .line 817
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 818
    .line 819
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 820
    .line 821
    return-object v0

    .line 822
    :pswitch_e
    move-object v13, v8

    .line 823
    check-cast v13, La/qi2;

    .line 824
    .line 825
    move-object/from16 v1, p1

    .line 826
    .line 827
    check-cast v1, La/k0w0;

    .line 828
    .line 829
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    new-instance v8, La/dk2;

    .line 833
    .line 834
    const/4 v12, 0x0

    .line 835
    const/4 v9, 0x2

    .line 836
    iget-wide v10, v0, La/sl1;->b:J

    .line 837
    .line 838
    iget-boolean v14, v0, La/sl1;->c:Z

    .line 839
    .line 840
    invoke-direct/range {v8 .. v14}, La/dk2;-><init>(BJLa/yje;La/i3t0;Z)V

    .line 841
    .line 842
    .line 843
    new-instance v0, La/b1w0;

    .line 844
    .line 845
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v0, La/c8d;

    .line 855
    .line 856
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 857
    .line 858
    new-instance v2, La/v7d;

    .line 859
    .line 860
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 861
    .line 862
    .line 863
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 864
    .line 865
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 866
    .line 867
    return-object v0

    .line 868
    :pswitch_f
    move-object v13, v8

    .line 869
    check-cast v13, La/n92;

    .line 870
    .line 871
    move-object/from16 v1, p1

    .line 872
    .line 873
    check-cast v1, La/k0w0;

    .line 874
    .line 875
    new-instance v8, La/m92;

    .line 876
    .line 877
    const/4 v12, 0x0

    .line 878
    const/4 v9, 0x0

    .line 879
    iget-wide v10, v0, La/sl1;->b:J

    .line 880
    .line 881
    iget-boolean v14, v0, La/sl1;->c:Z

    .line 882
    .line 883
    invoke-direct/range {v8 .. v14}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    new-instance v0, La/b1w0;

    .line 890
    .line 891
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v0, La/c8d;

    .line 901
    .line 902
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 903
    .line 904
    new-instance v2, La/v7d;

    .line 905
    .line 906
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 907
    .line 908
    .line 909
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 910
    .line 911
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 912
    .line 913
    return-object v0

    .line 914
    :pswitch_10
    move-object v15, v8

    .line 915
    check-cast v15, Ljava/lang/String;

    .line 916
    .line 917
    move-object/from16 v1, p1

    .line 918
    .line 919
    check-cast v1, La/k0w0;

    .line 920
    .line 921
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    const/4 v14, 0x0

    .line 925
    const/16 v16, 0x1

    .line 926
    .line 927
    move-object v3, v1

    .line 928
    iget-wide v1, v0, La/sl1;->b:J

    .line 929
    .line 930
    move-object v4, v3

    .line 931
    const-string v3, ""

    .line 932
    .line 933
    move-object v6, v4

    .line 934
    const-wide/16 v4, 0x0

    .line 935
    .line 936
    iget-boolean v0, v0, La/sl1;->c:Z

    .line 937
    .line 938
    const-wide/16 v7, 0x0

    .line 939
    .line 940
    const/4 v9, 0x0

    .line 941
    const/4 v10, 0x0

    .line 942
    const/4 v11, 0x0

    .line 943
    const/4 v12, 0x0

    .line 944
    const/4 v13, 0x1

    .line 945
    move-object/from16 v21, v6

    .line 946
    .line 947
    move v6, v0

    .line 948
    move-object/from16 v0, v21

    .line 949
    .line 950
    invoke-static/range {v1 .. v16}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 951
    .line 952
    .line 953
    move-result-object v1

    .line 954
    invoke-virtual {v0, v1}, La/k0w0;->e(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 955
    .line 956
    .line 957
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 958
    .line 959
    return-object v0

    .line 960
    nop

    .line 961
    :pswitch_data_0
    .packed-switch 0x0
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
