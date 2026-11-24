.class public final La/v6a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v6a0;->a:B

    iput-object p1, p0, La/v6a0;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/v6a0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/v6a0;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/v2n;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, La/v2n;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    new-instance p1, La/agl0;

    .line 26
    .line 27
    invoke-direct {p1, v0, v1}, La/agl0;-><init>(J)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, La/v2n;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, La/v2n;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    new-instance p1, La/agl0;

    .line 54
    .line 55
    invoke-direct {p1, v0, v1}, La/agl0;-><init>(J)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_1
    check-cast p1, La/v2n;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object p1, p1, La/v2n;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    new-instance p1, La/agl0;

    .line 82
    .line 83
    invoke-direct {p1, v0, v1}, La/agl0;-><init>(J)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_2
    check-cast p1, La/v2n;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object p1, p1, La/v2n;->a:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {p1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_3

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    new-instance p1, La/agl0;

    .line 110
    .line 111
    invoke-direct {p1, v0, v1}, La/agl0;-><init>(J)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_3
    check-cast p1, La/bem;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance v0, La/mxq0;

    .line 126
    .line 127
    invoke-direct {v0, p1}, La/mxq0;-><init>(La/bem;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_4
    check-cast p1, La/bem;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v0, La/mxq0;

    .line 142
    .line 143
    invoke-direct {v0, p1}, La/mxq0;-><init>(La/bem;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_5
    check-cast p1, La/bem;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance v0, La/mxq0;

    .line 158
    .line 159
    invoke-direct {v0, p1}, La/mxq0;-><init>(La/bem;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_6
    check-cast p1, La/bem;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance v0, La/mxq0;

    .line 174
    .line 175
    invoke-direct {v0, p1}, La/mxq0;-><init>(La/bem;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_7
    check-cast p1, La/lbj0;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    sget-object p1, La/abj0;->a:La/abj0;

    .line 190
    .line 191
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide v0

    .line 203
    new-instance p1, La/azh0;

    .line 204
    .line 205
    invoke-direct {p1, v0, v1}, La/azh0;-><init>(J)V

    .line 206
    .line 207
    .line 208
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 217
    .line 218
    .line 219
    move-result-wide v0

    .line 220
    new-instance p1, La/zyh0;

    .line 221
    .line 222
    invoke-direct {p1, v0, v1}, La/zyh0;-><init>(J)V

    .line 223
    .line 224
    .line 225
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_a
    check-cast p1, La/bem;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance v0, La/reh0;

    .line 237
    .line 238
    invoke-direct {v0, p1}, La/reh0;-><init>(La/bem;)V

    .line 239
    .line 240
    .line 241
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_b
    check-cast p1, La/o37;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    instance-of v0, p1, La/e27;

    .line 253
    .line 254
    if-eqz v0, :cond_4

    .line 255
    .line 256
    check-cast p1, La/e27;

    .line 257
    .line 258
    iget-object p1, p1, La/e27;->a:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    new-instance v0, La/ui7;

    .line 264
    .line 265
    invoke-direct {v0, p1}, La/ui7;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    goto :goto_0

    .line 272
    :cond_4
    instance-of v0, p1, La/f27;

    .line 273
    .line 274
    if-eqz v0, :cond_5

    .line 275
    .line 276
    check-cast p1, La/f27;

    .line 277
    .line 278
    iget-object p1, p1, La/f27;->a:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    new-instance v0, La/yi7;

    .line 284
    .line 285
    invoke-direct {v0, p1}, La/yi7;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    goto :goto_0

    .line 292
    :cond_5
    instance-of v0, p1, La/h27;

    .line 293
    .line 294
    if-eqz v0, :cond_6

    .line 295
    .line 296
    check-cast p1, La/h27;

    .line 297
    .line 298
    iget-object p1, p1, La/h27;->a:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    new-instance v0, La/zi7;

    .line 304
    .line 305
    invoke-direct {v0, p1}, La/zi7;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    goto :goto_0

    .line 312
    :cond_6
    instance-of v0, p1, La/g27;

    .line 313
    .line 314
    if-eqz v0, :cond_7

    .line 315
    .line 316
    check-cast p1, La/g27;

    .line 317
    .line 318
    iget-object p1, p1, La/g27;->a:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    new-instance v0, La/hj7;

    .line 324
    .line 325
    invoke-direct {v0, p1}, La/hj7;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    goto :goto_0

    .line 332
    :cond_7
    instance-of v0, p1, La/r27;

    .line 333
    .line 334
    if-eqz v0, :cond_8

    .line 335
    .line 336
    sget-object p1, La/ri7;->a:La/ri7;

    .line 337
    .line 338
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    goto :goto_0

    .line 342
    :cond_8
    instance-of v0, p1, La/t27;

    .line 343
    .line 344
    if-eqz v0, :cond_9

    .line 345
    .line 346
    new-instance v0, La/vi7;

    .line 347
    .line 348
    check-cast p1, La/t27;

    .line 349
    .line 350
    iget-object v1, p1, La/t27;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 351
    .line 352
    iget-object p1, p1, La/t27;->b:Ljava/lang/String;

    .line 353
    .line 354
    invoke-direct {v0, v1, p1}, La/vi7;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    :cond_9
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object p0

    .line 363
    :pswitch_c
    check-cast p1, La/bem;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    new-instance v0, La/p3g0;

    .line 369
    .line 370
    invoke-direct {v0, p1}, La/p3g0;-><init>(La/bem;)V

    .line 371
    .line 372
    .line 373
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    return-object p0

    .line 379
    :pswitch_d
    check-cast p1, La/bem;

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    new-instance v0, La/vdf0;

    .line 385
    .line 386
    invoke-direct {v0, p1}, La/vdf0;-><init>(La/bem;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object p0

    .line 395
    :pswitch_e
    check-cast p1, La/bem;

    .line 396
    .line 397
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    new-instance v0, La/vdf0;

    .line 401
    .line 402
    invoke-direct {v0, p1}, La/vdf0;-><init>(La/bem;)V

    .line 403
    .line 404
    .line 405
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object p0

    .line 411
    :pswitch_f
    check-cast p1, La/ng8;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    new-instance v0, La/jg8;

    .line 417
    .line 418
    iget v1, p1, La/ng8;->a:I

    .line 419
    .line 420
    iget-object p1, p1, La/ng8;->b:Ljava/lang/String;

    .line 421
    .line 422
    invoke-direct {v0, v1, p1}, La/jg8;-><init>(ILjava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object p0

    .line 431
    :pswitch_10
    check-cast p1, La/hh8;

    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    new-instance v0, La/sg8;

    .line 437
    .line 438
    iget p1, p1, La/hh8;->a:I

    .line 439
    .line 440
    invoke-direct {v0, p1}, La/sg8;-><init>(I)V

    .line 441
    .line 442
    .line 443
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 447
    .line 448
    return-object p0

    .line 449
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 450
    .line 451
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 452
    .line 453
    .line 454
    move-result-wide v0

    .line 455
    new-instance p1, La/xoc0;

    .line 456
    .line 457
    invoke-direct {p1, v0, v1}, La/xoc0;-><init>(J)V

    .line 458
    .line 459
    .line 460
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object p0

    .line 466
    :pswitch_12
    check-cast p1, La/yrc0;

    .line 467
    .line 468
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    new-instance v0, La/pdc0;

    .line 472
    .line 473
    invoke-direct {v0, p1}, La/pdc0;-><init>(La/yrc0;)V

    .line 474
    .line 475
    .line 476
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 480
    .line 481
    return-object p0

    .line 482
    :pswitch_13
    check-cast p1, La/aec0;

    .line 483
    .line 484
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    new-instance v0, La/ndc0;

    .line 488
    .line 489
    invoke-direct {v0, p1}, La/ndc0;-><init>(La/aec0;)V

    .line 490
    .line 491
    .line 492
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 496
    .line 497
    return-object p0

    .line 498
    :pswitch_14
    check-cast p1, La/bem;

    .line 499
    .line 500
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    new-instance v0, La/r5b0;

    .line 504
    .line 505
    invoke-direct {v0, p1}, La/r5b0;-><init>(La/bem;)V

    .line 506
    .line 507
    .line 508
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    return-object p0

    .line 514
    :pswitch_15
    check-cast p1, La/bem;

    .line 515
    .line 516
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    new-instance v0, La/r5b0;

    .line 520
    .line 521
    invoke-direct {v0, p1}, La/r5b0;-><init>(La/bem;)V

    .line 522
    .line 523
    .line 524
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object p0

    .line 530
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 531
    .line 532
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 533
    .line 534
    .line 535
    move-result-wide v0

    .line 536
    new-instance p1, La/o2b0;

    .line 537
    .line 538
    const/4 v2, 0x1

    .line 539
    invoke-direct {p1, v2, v0, v1, p0}, La/o2b0;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 540
    .line 541
    .line 542
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 543
    .line 544
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    invoke-virtual {p0}, La/bjj;->a()V

    .line 549
    .line 550
    .line 551
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    return-object p0

    .line 554
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 555
    .line 556
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 557
    .line 558
    .line 559
    move-result-wide v0

    .line 560
    new-instance p1, La/o2b0;

    .line 561
    .line 562
    const/4 v2, 0x0

    .line 563
    invoke-direct {p1, v2, v0, v1, p0}, La/o2b0;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 564
    .line 565
    .line 566
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 567
    .line 568
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    invoke-virtual {p0}, La/bjj;->a()V

    .line 573
    .line 574
    .line 575
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 576
    .line 577
    return-object p0

    .line 578
    :pswitch_18
    check-cast p1, La/cvl;

    .line 579
    .line 580
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    new-instance v0, La/ha30;

    .line 584
    .line 585
    const/16 v1, 0x16

    .line 586
    .line 587
    invoke-direct {v0, p0, p1, v1}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 588
    .line 589
    .line 590
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 591
    .line 592
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    invoke-virtual {p0}, La/bjj;->a()V

    .line 597
    .line 598
    .line 599
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object p0

    .line 602
    :pswitch_19
    check-cast p1, La/bem;

    .line 603
    .line 604
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    new-instance v0, La/sra0;

    .line 608
    .line 609
    invoke-direct {v0, p1}, La/sra0;-><init>(La/bem;)V

    .line 610
    .line 611
    .line 612
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 616
    .line 617
    return-object p0

    .line 618
    :pswitch_1a
    check-cast p1, La/bem;

    .line 619
    .line 620
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    new-instance v0, La/sra0;

    .line 624
    .line 625
    invoke-direct {v0, p1}, La/sra0;-><init>(La/bem;)V

    .line 626
    .line 627
    .line 628
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    return-object p0

    .line 634
    :pswitch_1b
    check-cast p1, Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    new-instance v0, La/xga0;

    .line 640
    .line 641
    invoke-direct {v0, p1}, La/xga0;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 648
    .line 649
    return-object p0

    .line 650
    :pswitch_1c
    check-cast p1, La/xgl0;

    .line 651
    .line 652
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    new-instance v0, La/l6a0;

    .line 656
    .line 657
    new-instance v1, La/z030;

    .line 658
    .line 659
    invoke-direct {v1, p1}, La/z030;-><init>(La/xgl0;)V

    .line 660
    .line 661
    .line 662
    invoke-direct {v0, v1}, La/l6a0;-><init>(La/g130;)V

    .line 663
    .line 664
    .line 665
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 669
    .line 670
    return-object p0

    .line 671
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
