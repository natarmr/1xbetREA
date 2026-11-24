.class public final La/w8v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w8v;->a:B

    iput-object p1, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/w8v;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/wgl0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v0, p1, La/vgl0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    new-instance v0, La/l6a0;

    .line 20
    .line 21
    new-instance v1, La/y030;

    .line 22
    .line 23
    check-cast p1, La/vgl0;

    .line 24
    .line 25
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 26
    .line 27
    invoke-direct {v1, p1}, La/y030;-><init>(La/xgl0;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, La/l6a0;-><init>(La/g130;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast p1, La/wy30;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    new-instance v0, La/pu30;

    .line 47
    .line 48
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_1
    check-cast p1, La/wy30;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    new-instance v0, La/pu30;

    .line 65
    .line 66
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_2
    check-cast p1, La/ow80;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 81
    .line 82
    new-instance v0, La/gy80;

    .line 83
    .line 84
    invoke-direct {v0, p1}, La/gy80;-><init>(La/ow80;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 99
    .line 100
    new-instance v0, La/jy80;

    .line 101
    .line 102
    invoke-direct {v0, p1}, La/jy80;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_4
    check-cast p1, La/m9n;

    .line 112
    .line 113
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    instance-of v0, p1, La/k9n;

    .line 119
    .line 120
    if-eqz v0, :cond_1

    .line 121
    .line 122
    new-instance p1, La/sb80;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_1
    instance-of v0, p1, La/l9n;

    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    check-cast p1, La/l9n;

    .line 136
    .line 137
    iget-object v0, p1, La/l9n;->c:La/j9n;

    .line 138
    .line 139
    instance-of v1, v0, La/g9n;

    .line 140
    .line 141
    if-eqz v1, :cond_2

    .line 142
    .line 143
    new-instance v1, La/zm60;

    .line 144
    .line 145
    iget-wide v3, p1, La/l9n;->a:J

    .line 146
    .line 147
    check-cast v0, La/g9n;

    .line 148
    .line 149
    iget-boolean p1, v0, La/g9n;->b:Z

    .line 150
    .line 151
    xor-int/lit8 p1, p1, 0x1

    .line 152
    .line 153
    invoke-direct {v1, v2, v3, v4, p1}, La/zm60;-><init>(IJZ)V

    .line 154
    .line 155
    .line 156
    new-instance p1, La/rb80;

    .line 157
    .line 158
    invoke-direct {p1, v1}, La/rb80;-><init>(La/dn60;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 168
    .line 169
    .line 170
    :goto_1
    return-object v1

    .line 171
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide v0

    .line 177
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 178
    .line 179
    new-instance p1, La/eb80;

    .line 180
    .line 181
    long-to-int v0, v0

    .line 182
    invoke-direct {p1, v0}, La/eb80;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_6
    check-cast p1, La/st0;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 197
    .line 198
    new-instance v0, La/cb80;

    .line 199
    .line 200
    iget-wide v1, p1, La/st0;->a:J

    .line 201
    .line 202
    invoke-direct {v0, v1, v2}, La/cb80;-><init>(J)V

    .line 203
    .line 204
    .line 205
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_7
    check-cast p1, La/st0;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 217
    .line 218
    new-instance v0, La/ob80;

    .line 219
    .line 220
    iget-wide v1, p1, La/st0;->a:J

    .line 221
    .line 222
    invoke-direct {v0, v1, v2}, La/ob80;-><init>(J)V

    .line 223
    .line 224
    .line 225
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_8
    check-cast p1, La/ra0;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 237
    .line 238
    new-instance v0, La/bb80;

    .line 239
    .line 240
    invoke-direct {v0, p1}, La/bb80;-><init>(La/ra0;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 255
    .line 256
    new-instance v0, La/x900;

    .line 257
    .line 258
    invoke-direct {v0, p1}, La/x900;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_a
    check-cast p1, La/o37;

    .line 268
    .line 269
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    instance-of v0, p1, La/e27;

    .line 275
    .line 276
    if-eqz v0, :cond_4

    .line 277
    .line 278
    check-cast p1, La/e27;

    .line 279
    .line 280
    iget-object p1, p1, La/e27;->a:Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    new-instance v0, La/ui7;

    .line 286
    .line 287
    invoke-direct {v0, p1}, La/ui7;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_4
    instance-of v0, p1, La/f27;

    .line 295
    .line 296
    if-eqz v0, :cond_5

    .line 297
    .line 298
    check-cast p1, La/f27;

    .line 299
    .line 300
    iget-object p1, p1, La/f27;->a:Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    new-instance v0, La/yi7;

    .line 306
    .line 307
    invoke-direct {v0, p1}, La/yi7;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_5
    instance-of v0, p1, La/h27;

    .line 315
    .line 316
    if-eqz v0, :cond_6

    .line 317
    .line 318
    check-cast p1, La/h27;

    .line 319
    .line 320
    iget-object p1, p1, La/h27;->a:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance v0, La/zi7;

    .line 326
    .line 327
    invoke-direct {v0, p1}, La/zi7;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    goto :goto_2

    .line 334
    :cond_6
    instance-of v0, p1, La/g27;

    .line 335
    .line 336
    if-eqz v0, :cond_7

    .line 337
    .line 338
    check-cast p1, La/g27;

    .line 339
    .line 340
    iget-object p1, p1, La/g27;->a:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    new-instance v0, La/hj7;

    .line 346
    .line 347
    invoke-direct {v0, p1}, La/hj7;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    goto :goto_2

    .line 354
    :cond_7
    instance-of v0, p1, La/r27;

    .line 355
    .line 356
    if-eqz v0, :cond_8

    .line 357
    .line 358
    sget-object p1, La/ri7;->a:La/ri7;

    .line 359
    .line 360
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    goto :goto_2

    .line 364
    :cond_8
    instance-of v0, p1, La/t27;

    .line 365
    .line 366
    if-eqz v0, :cond_9

    .line 367
    .line 368
    new-instance v0, La/vi7;

    .line 369
    .line 370
    check-cast p1, La/t27;

    .line 371
    .line 372
    iget-object v1, p1, La/t27;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 373
    .line 374
    iget-object p1, p1, La/t27;->b:Ljava/lang/String;

    .line 375
    .line 376
    invoke-direct {v0, v1, p1}, La/vi7;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    :cond_9
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_b
    check-cast p1, La/zia;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 391
    .line 392
    new-instance v0, La/oy50;

    .line 393
    .line 394
    invoke-direct {v0, p1}, La/oy50;-><init>(La/zia;)V

    .line 395
    .line 396
    .line 397
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_c
    check-cast p1, La/st0;

    .line 404
    .line 405
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 409
    .line 410
    new-instance v0, La/zx50;

    .line 411
    .line 412
    iget-wide v1, p1, La/st0;->a:J

    .line 413
    .line 414
    invoke-direct {v0, v1, v2}, La/zx50;-><init>(J)V

    .line 415
    .line 416
    .line 417
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 421
    .line 422
    return-object p0

    .line 423
    :pswitch_d
    check-cast p1, La/st0;

    .line 424
    .line 425
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 429
    .line 430
    new-instance v0, La/ay50;

    .line 431
    .line 432
    iget-wide v1, p1, La/st0;->a:J

    .line 433
    .line 434
    invoke-direct {v0, v1, v2}, La/ay50;-><init>(J)V

    .line 435
    .line 436
    .line 437
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    return-object p0

    .line 443
    :pswitch_e
    check-cast p1, La/ra0;

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 449
    .line 450
    new-instance v0, La/yx50;

    .line 451
    .line 452
    invoke-direct {v0, p1}, La/yx50;-><init>(La/ra0;)V

    .line 453
    .line 454
    .line 455
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    return-object p0

    .line 461
    :pswitch_f
    check-cast p1, La/bem;

    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 467
    .line 468
    new-instance v0, La/yy50;

    .line 469
    .line 470
    invoke-direct {v0, p1}, La/yy50;-><init>(La/bem;)V

    .line 471
    .line 472
    .line 473
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object p0

    .line 479
    :pswitch_10
    check-cast p1, La/m9n;

    .line 480
    .line 481
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 482
    .line 483
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    instance-of v0, p1, La/k9n;

    .line 487
    .line 488
    if-eqz v0, :cond_a

    .line 489
    .line 490
    new-instance p1, La/hz50;

    .line 491
    .line 492
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    goto :goto_3

    .line 499
    :cond_a
    instance-of v0, p1, La/l9n;

    .line 500
    .line 501
    if-eqz v0, :cond_d

    .line 502
    .line 503
    check-cast p1, La/l9n;

    .line 504
    .line 505
    iget-wide v0, p1, La/l9n;->a:J

    .line 506
    .line 507
    iget-object p1, p1, La/l9n;->c:La/j9n;

    .line 508
    .line 509
    instance-of v3, p1, La/g9n;

    .line 510
    .line 511
    if-eqz v3, :cond_b

    .line 512
    .line 513
    new-instance v3, La/zm60;

    .line 514
    .line 515
    check-cast p1, La/g9n;

    .line 516
    .line 517
    iget-boolean p1, p1, La/g9n;->b:Z

    .line 518
    .line 519
    xor-int/lit8 p1, p1, 0x1

    .line 520
    .line 521
    invoke-direct {v3, v2, v0, v1, p1}, La/zm60;-><init>(IJZ)V

    .line 522
    .line 523
    .line 524
    new-instance p1, La/gz50;

    .line 525
    .line 526
    invoke-direct {p1, v3}, La/gz50;-><init>(La/dn60;)V

    .line 527
    .line 528
    .line 529
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    goto :goto_3

    .line 533
    :cond_b
    instance-of p1, p1, La/i9n;

    .line 534
    .line 535
    if-eqz p1, :cond_c

    .line 536
    .line 537
    new-instance p1, La/dz50;

    .line 538
    .line 539
    invoke-direct {p1, v0, v1}, La/dz50;-><init>(J)V

    .line 540
    .line 541
    .line 542
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    :cond_c
    :goto_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    goto :goto_4

    .line 548
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 549
    .line 550
    .line 551
    :goto_4
    return-object v1

    .line 552
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 553
    .line 554
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 555
    .line 556
    .line 557
    move-result-wide v0

    .line 558
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 559
    .line 560
    new-instance p1, La/y350;

    .line 561
    .line 562
    sget-object v2, La/gzr0;->b:La/gzr0;

    .line 563
    .line 564
    invoke-direct {p1, v0, v1, v2}, La/y350;-><init>(JLa/gzr0;)V

    .line 565
    .line 566
    .line 567
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    return-object p0

    .line 573
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 574
    .line 575
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 576
    .line 577
    .line 578
    move-result-wide v0

    .line 579
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 580
    .line 581
    new-instance p1, La/h450;

    .line 582
    .line 583
    invoke-direct {p1, v0, v1}, La/h450;-><init>(J)V

    .line 584
    .line 585
    .line 586
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 590
    .line 591
    return-object p0

    .line 592
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 593
    .line 594
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 595
    .line 596
    .line 597
    move-result-wide v0

    .line 598
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 599
    .line 600
    new-instance p1, La/i450;

    .line 601
    .line 602
    invoke-direct {p1, v0, v1}, La/i450;-><init>(J)V

    .line 603
    .line 604
    .line 605
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 609
    .line 610
    return-object p0

    .line 611
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 612
    .line 613
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 617
    .line 618
    sget-object p1, La/g350;->a:La/g350;

    .line 619
    .line 620
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 624
    .line 625
    return-object p0

    .line 626
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 632
    .line 633
    new-instance v0, La/s350;

    .line 634
    .line 635
    invoke-direct {v0, p1}, La/s350;-><init>(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 642
    .line 643
    return-object p0

    .line 644
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 645
    .line 646
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 647
    .line 648
    .line 649
    move-result-wide v0

    .line 650
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 651
    .line 652
    const-wide/32 v2, 0xf4240

    .line 653
    .line 654
    .line 655
    div-long/2addr v0, v2

    .line 656
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 657
    .line 658
    .line 659
    move-result-object p1

    .line 660
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object p0

    .line 664
    return-object p0

    .line 665
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 666
    .line 667
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 671
    .line 672
    new-instance v0, La/n740;

    .line 673
    .line 674
    invoke-direct {v0, p1}, La/n740;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 681
    .line 682
    return-object p0

    .line 683
    :pswitch_18
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 684
    .line 685
    check-cast p1, La/wsy;

    .line 686
    .line 687
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object p0

    .line 694
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object p0

    .line 698
    return-object p0

    .line 699
    :pswitch_19
    check-cast p1, La/sip;

    .line 700
    .line 701
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 705
    .line 706
    new-instance v0, La/lhw;

    .line 707
    .line 708
    invoke-direct {v0, p1}, La/lhw;-><init>(La/sip;)V

    .line 709
    .line 710
    .line 711
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 715
    .line 716
    return-object p0

    .line 717
    :pswitch_1a
    check-cast p1, La/exf;

    .line 718
    .line 719
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 723
    .line 724
    new-instance v0, La/ygw;

    .line 725
    .line 726
    invoke-direct {v0, p1}, La/ygw;-><init>(La/exf;)V

    .line 727
    .line 728
    .line 729
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 733
    .line 734
    return-object p0

    .line 735
    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    .line 736
    .line 737
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 738
    .line 739
    .line 740
    move-result-wide v0

    .line 741
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 742
    .line 743
    new-instance p1, La/zgw;

    .line 744
    .line 745
    invoke-direct {p1, v0, v1}, La/zgw;-><init>(J)V

    .line 746
    .line 747
    .line 748
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 752
    .line 753
    return-object p0

    .line 754
    :pswitch_1c
    check-cast p1, La/wfk0;

    .line 755
    .line 756
    sget-object v0, La/xfk0;->c:Ljava/lang/Object;

    .line 757
    .line 758
    monitor-enter v0

    .line 759
    :try_start_0
    sget-wide v1, La/xfk0;->e:J

    .line 760
    .line 761
    const-wide/16 v3, 0x1

    .line 762
    .line 763
    add-long/2addr v3, v1

    .line 764
    sput-wide v3, La/xfk0;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 765
    .line 766
    monitor-exit v0

    .line 767
    iget-object p0, p0, La/w8v;->b:Lkotlin/jvm/functions/Function1;

    .line 768
    .line 769
    new-instance v0, La/wae0;

    .line 770
    .line 771
    invoke-direct {v0, v1, v2, p1, p0}, La/wae0;-><init>(JLa/wfk0;Lkotlin/jvm/functions/Function1;)V

    .line 772
    .line 773
    .line 774
    return-object v0

    .line 775
    :catchall_0
    move-exception p0

    .line 776
    monitor-exit v0

    .line 777
    throw p0

    .line 778
    nop

    .line 779
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
