.class public final La/o3l0;
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
    iput-byte p3, p0, La/o3l0;->a:B

    iput-object p1, p0, La/o3l0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/o3l0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/o3l0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/o3l0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/o3l0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    check-cast p0, La/f8l0;

    .line 17
    .line 18
    check-cast v1, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, La/f8l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    check-cast p0, La/acm0;

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v1, La/a4x;

    .line 42
    .line 43
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, v0, p1}, La/acm0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    check-cast p0, La/acm0;

    .line 59
    .line 60
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v1, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0, v0, p1}, La/acm0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    check-cast p0, La/f8l0;

    .line 82
    .line 83
    check-cast v1, Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p0, p1}, La/f8l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    check-cast p0, La/f8l0;

    .line 101
    .line 102
    check-cast v1, Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0, p1}, La/f8l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :pswitch_4
    check-cast p1, La/bem;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    instance-of p1, p1, La/wdm;

    .line 119
    .line 120
    if-eqz p1, :cond_0

    .line 121
    .line 122
    check-cast p0, La/i3t0;

    .line 123
    .line 124
    new-instance p1, La/yzl0;

    .line 125
    .line 126
    check-cast v1, La/dyl0;

    .line 127
    .line 128
    invoke-direct {p1, v1}, La/yzl0;-><init>(La/dyl0;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_5
    check-cast p1, La/wwv0;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    check-cast p0, La/gcl0;

    .line 143
    .line 144
    check-cast v1, La/lwv0;

    .line 145
    .line 146
    invoke-virtual {p0, p1, v1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    check-cast p0, La/gcl0;

    .line 159
    .line 160
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v1, Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    check-cast p0, La/gcl0;

    .line 182
    .line 183
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v1, Ljava/util/List;

    .line 188
    .line 189
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    check-cast p0, La/gcl0;

    .line 205
    .line 206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v1, Ljava/util/List;

    .line 211
    .line 212
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    return-object p0

    .line 221
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    check-cast p0, La/gcl0;

    .line 228
    .line 229
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v1, Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_a
    check-cast p1, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    check-cast p0, La/gcl0;

    .line 251
    .line 252
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v1, Ljava/util/List;

    .line 257
    .line 258
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    return-object p0

    .line 267
    :pswitch_b
    check-cast p1, La/h2l0;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    sget-object v0, La/csl0;->a:[I

    .line 273
    .line 274
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    aget p1, v0, p1

    .line 279
    .line 280
    const/4 v0, 0x1

    .line 281
    if-ne p1, v0, :cond_1

    .line 282
    .line 283
    check-cast v1, La/pz40;

    .line 284
    .line 285
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 290
    .line 291
    new-instance v0, La/prl0;

    .line 292
    .line 293
    check-cast p0, La/msl0;

    .line 294
    .line 295
    invoke-direct {v0, p0}, La/prl0;-><init>(La/msl0;)V

    .line 296
    .line 297
    .line 298
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    check-cast p0, La/gcl0;

    .line 311
    .line 312
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v1, Ljava/util/List;

    .line 317
    .line 318
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    return-object p0

    .line 327
    :pswitch_d
    check-cast p1, Ljava/lang/Number;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    check-cast p0, La/gcl0;

    .line 334
    .line 335
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    check-cast v1, Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    return-object p0

    .line 350
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result p1

    .line 356
    check-cast p0, La/gcl0;

    .line 357
    .line 358
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v1, Ljava/util/List;

    .line 363
    .line 364
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    return-object p0

    .line 373
    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    .line 374
    .line 375
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    check-cast p0, La/gcl0;

    .line 380
    .line 381
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    check-cast v1, Ljava/util/List;

    .line 386
    .line 387
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    return-object p0

    .line 396
    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    .line 397
    .line 398
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result p1

    .line 402
    check-cast p0, La/gcl0;

    .line 403
    .line 404
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    check-cast v1, Ljava/util/List;

    .line 409
    .line 410
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    return-object p0

    .line 419
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    check-cast p0, La/gcl0;

    .line 426
    .line 427
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    check-cast v1, Ljava/util/List;

    .line 432
    .line 433
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    return-object p0

    .line 442
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 443
    .line 444
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result p1

    .line 448
    check-cast p0, La/gcl0;

    .line 449
    .line 450
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v1, Ljava/util/List;

    .line 455
    .line 456
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    return-object p0

    .line 465
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 466
    .line 467
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    check-cast p0, La/gcl0;

    .line 472
    .line 473
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    check-cast v1, Ljava/util/List;

    .line 478
    .line 479
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    invoke-virtual {p0, v0, p1}, La/gcl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    return-object p0

    .line 488
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 489
    .line 490
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 491
    .line 492
    .line 493
    move-result p1

    .line 494
    check-cast p0, La/jak0;

    .line 495
    .line 496
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    check-cast v1, Ljava/util/List;

    .line 501
    .line 502
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    invoke-virtual {p0, v0, p1}, La/jak0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    return-object p0

    .line 511
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 512
    .line 513
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 514
    .line 515
    .line 516
    move-result p1

    .line 517
    check-cast p0, La/jak0;

    .line 518
    .line 519
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    check-cast v1, Ljava/util/List;

    .line 524
    .line 525
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    invoke-virtual {p0, v0, p1}, La/jak0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object p0

    .line 533
    return-object p0

    .line 534
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result p1

    .line 540
    check-cast p0, La/jak0;

    .line 541
    .line 542
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v1, Ljava/util/List;

    .line 547
    .line 548
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    invoke-virtual {p0, v0, p1}, La/jak0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    return-object p0

    .line 557
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 558
    .line 559
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 560
    .line 561
    .line 562
    move-result p1

    .line 563
    check-cast p0, La/jak0;

    .line 564
    .line 565
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v1, Ljava/util/List;

    .line 570
    .line 571
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    invoke-virtual {p0, v0, p1}, La/jak0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    return-object p0

    .line 580
    :pswitch_18
    check-cast p1, Ljava/lang/Number;

    .line 581
    .line 582
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result p1

    .line 586
    check-cast p0, La/jak0;

    .line 587
    .line 588
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    check-cast v1, Ljava/util/List;

    .line 593
    .line 594
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object p1

    .line 598
    invoke-virtual {p0, v0, p1}, La/jak0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object p0

    .line 602
    return-object p0

    .line 603
    :pswitch_19
    check-cast p1, Ljava/lang/Number;

    .line 604
    .line 605
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 606
    .line 607
    .line 608
    move-result p1

    .line 609
    check-cast p0, La/jak0;

    .line 610
    .line 611
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    check-cast v1, Ljava/util/List;

    .line 616
    .line 617
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    invoke-virtual {p0, v0, p1}, La/jak0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object p0

    .line 625
    return-object p0

    .line 626
    :pswitch_1a
    check-cast p1, Ljava/lang/Number;

    .line 627
    .line 628
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 629
    .line 630
    .line 631
    move-result p1

    .line 632
    check-cast p0, La/jak0;

    .line 633
    .line 634
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    check-cast v1, Ljava/util/List;

    .line 639
    .line 640
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    invoke-virtual {p0, v0, p1}, La/jak0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object p0

    .line 648
    return-object p0

    .line 649
    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    .line 650
    .line 651
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 652
    .line 653
    .line 654
    move-result p1

    .line 655
    check-cast p0, La/jak0;

    .line 656
    .line 657
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    check-cast v1, Ljava/util/List;

    .line 662
    .line 663
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object p1

    .line 667
    invoke-virtual {p0, v0, p1}, La/jak0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object p0

    .line 671
    return-object p0

    .line 672
    :pswitch_1c
    check-cast p1, Ljava/lang/Number;

    .line 673
    .line 674
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 675
    .line 676
    .line 677
    move-result p1

    .line 678
    check-cast p0, La/ejk0;

    .line 679
    .line 680
    check-cast v1, Ljava/util/List;

    .line 681
    .line 682
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object p1

    .line 686
    invoke-virtual {p0, p1}, La/ejk0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    return-object p0

    .line 691
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
