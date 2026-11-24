.class public final synthetic La/nur0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/xk80;II)V
    .locals 0

    .line 1
    const/16 p4, 0x14

    iput-byte p4, p0, La/nur0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nur0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/nur0;->d:Ljava/lang/Object;

    iput p3, p0, La/nur0;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/nur0;->a:B

    iput-object p1, p0, La/nur0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/nur0;->d:Ljava/lang/Object;

    iput p3, p0, La/nur0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/nur0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget v2, p0, La/nur0;->b:I

    .line 5
    .line 6
    iget-object v3, p0, La/nur0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, La/nur0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/mm40;

    .line 14
    .line 15
    check-cast v3, La/fgv0;

    .line 16
    .line 17
    check-cast p1, La/fet;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    or-int/lit8 p2, v2, 0x1

    .line 25
    .line 26
    invoke-static {p2}, La/x8x;->L(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p0, v3, p1, p2}, La/ahy;->W(La/mm40;La/fgv0;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p0, La/mm40;

    .line 37
    .line 38
    check-cast v3, La/xk80;

    .line 39
    .line 40
    check-cast p1, La/fet;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, La/x8x;->L(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-static {p0, v3, v2, p1, p2}, La/j5n0;->b(La/mm40;La/xk80;ILa/fet;I)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_1
    check-cast p0, La/mm40;

    .line 58
    .line 59
    check-cast v3, La/zdv0;

    .line 60
    .line 61
    check-cast p1, La/fet;

    .line 62
    .line 63
    check-cast p2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    or-int/lit8 p2, v2, 0x1

    .line 69
    .line 70
    invoke-static {p2}, La/x8x;->L(I)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-static {p0, v3, p1, p2}, La/u4n0;->c(La/mm40;La/zdv0;La/fet;I)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_2
    check-cast p0, La/mm40;

    .line 81
    .line 82
    check-cast v3, La/d6v0;

    .line 83
    .line 84
    check-cast p1, La/fet;

    .line 85
    .line 86
    check-cast p2, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    or-int/lit8 p2, v2, 0x1

    .line 92
    .line 93
    invoke-static {p2}, La/x8x;->L(I)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    invoke-static {p0, v3, p1, p2}, La/qsm0;->p(La/mm40;La/d6v0;La/fet;I)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_3
    check-cast p0, La/stu0;

    .line 104
    .line 105
    check-cast v3, La/rah0;

    .line 106
    .line 107
    check-cast p1, La/fet;

    .line 108
    .line 109
    check-cast p2, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    or-int/lit8 p2, v2, 0x1

    .line 115
    .line 116
    invoke-static {p2}, La/x8x;->L(I)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    invoke-static {p0, v3, p1, p2}, La/j2e;->B(La/stu0;La/rah0;La/fet;I)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_4
    check-cast p0, La/y9u0;

    .line 127
    .line 128
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 129
    .line 130
    check-cast p1, La/fet;

    .line 131
    .line 132
    check-cast p2, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    or-int/lit8 p2, v2, 0x1

    .line 138
    .line 139
    invoke-static {p2}, La/x8x;->L(I)I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    invoke-static {p0, v3, p1, p2}, La/jd8;->q(La/y9u0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_5
    check-cast p0, La/p4u0;

    .line 150
    .line 151
    check-cast v3, Ljava/util/Map;

    .line 152
    .line 153
    check-cast p1, La/fet;

    .line 154
    .line 155
    check-cast p2, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    or-int/lit8 p2, v2, 0x1

    .line 161
    .line 162
    invoke-static {p2}, La/x8x;->L(I)I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    invoke-static {p0, v3, p1, p2}, La/iom0;->a(La/p4u0;Ljava/util/Map;La/fet;I)V

    .line 167
    .line 168
    .line 169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    :pswitch_6
    check-cast p0, La/mm40;

    .line 173
    .line 174
    check-cast v3, La/o580;

    .line 175
    .line 176
    check-cast p1, La/fet;

    .line 177
    .line 178
    check-cast p2, Ljava/lang/Integer;

    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    or-int/lit8 p2, v2, 0x1

    .line 184
    .line 185
    invoke-static {p2}, La/x8x;->L(I)I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    invoke-static {p0, v3, p1, p2}, La/qim0;->h(La/mm40;La/o580;La/fet;I)V

    .line 190
    .line 191
    .line 192
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p0

    .line 195
    :pswitch_7
    check-cast p0, La/mm40;

    .line 196
    .line 197
    check-cast v3, La/exs0;

    .line 198
    .line 199
    check-cast p1, La/fet;

    .line 200
    .line 201
    check-cast p2, Ljava/lang/Integer;

    .line 202
    .line 203
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    or-int/lit8 p2, v2, 0x1

    .line 207
    .line 208
    invoke-static {p2}, La/x8x;->L(I)I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    invoke-static {p0, v3, p1, p2}, La/ghm0;->c(La/mm40;La/exs0;La/fet;I)V

    .line 213
    .line 214
    .line 215
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_8
    check-cast p0, La/mm40;

    .line 219
    .line 220
    check-cast v3, La/a480;

    .line 221
    .line 222
    check-cast p1, La/fet;

    .line 223
    .line 224
    check-cast p2, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    or-int/lit8 p2, v2, 0x1

    .line 230
    .line 231
    invoke-static {p2}, La/x8x;->L(I)I

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    invoke-static {p0, v3, p1, p2}, La/aem0;->l(La/mm40;La/a480;La/fet;I)V

    .line 236
    .line 237
    .line 238
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_9
    check-cast p0, La/mm40;

    .line 242
    .line 243
    check-cast v3, La/kws0;

    .line 244
    .line 245
    check-cast p1, La/fet;

    .line 246
    .line 247
    check-cast p2, Ljava/lang/Integer;

    .line 248
    .line 249
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    or-int/lit8 p2, v2, 0x1

    .line 253
    .line 254
    invoke-static {p2}, La/x8x;->L(I)I

    .line 255
    .line 256
    .line 257
    move-result p2

    .line 258
    invoke-static {p0, v3, p1, p2}, La/afn0;->b(La/mm40;La/kws0;La/fet;I)V

    .line 259
    .line 260
    .line 261
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_a
    check-cast p0, La/mm40;

    .line 265
    .line 266
    check-cast v3, La/sss0;

    .line 267
    .line 268
    check-cast p1, La/fet;

    .line 269
    .line 270
    check-cast p2, Ljava/lang/Integer;

    .line 271
    .line 272
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    or-int/lit8 p2, v2, 0x1

    .line 276
    .line 277
    invoke-static {p2}, La/x8x;->L(I)I

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    invoke-static {p0, v3, p1, p2}, La/ewm0;->l(La/mm40;La/sss0;La/fet;I)V

    .line 282
    .line 283
    .line 284
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_b
    check-cast p0, La/oms0;

    .line 288
    .line 289
    check-cast p1, La/fet;

    .line 290
    .line 291
    check-cast p2, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    or-int/lit8 p2, v2, 0x1

    .line 297
    .line 298
    invoke-static {p2}, La/x8x;->L(I)I

    .line 299
    .line 300
    .line 301
    move-result p2

    .line 302
    invoke-virtual {p0, v3, p1, p2}, La/oms0;->a(Ljava/lang/Object;La/fet;I)V

    .line 303
    .line 304
    .line 305
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object p0

    .line 308
    :pswitch_c
    check-cast p0, La/mm40;

    .line 309
    .line 310
    check-cast v3, La/rhs0;

    .line 311
    .line 312
    check-cast p1, La/fet;

    .line 313
    .line 314
    check-cast p2, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    or-int/lit8 p2, v2, 0x1

    .line 320
    .line 321
    invoke-static {p2}, La/x8x;->L(I)I

    .line 322
    .line 323
    .line 324
    move-result p2

    .line 325
    invoke-static {p0, v3, p1, p2}, La/jpm0;->a(La/mm40;La/rhs0;La/fet;I)V

    .line 326
    .line 327
    .line 328
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_d
    check-cast p0, La/mm40;

    .line 332
    .line 333
    check-cast v3, La/ths0;

    .line 334
    .line 335
    check-cast p1, La/fet;

    .line 336
    .line 337
    check-cast p2, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    or-int/lit8 p2, v2, 0x1

    .line 343
    .line 344
    invoke-static {p2}, La/x8x;->L(I)I

    .line 345
    .line 346
    .line 347
    move-result p2

    .line 348
    invoke-static {p0, v3, p1, p2}, La/jpm0;->h(La/mm40;La/ths0;La/fet;I)V

    .line 349
    .line 350
    .line 351
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 352
    .line 353
    return-object p0

    .line 354
    :pswitch_e
    check-cast p0, La/g7s0;

    .line 355
    .line 356
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 357
    .line 358
    check-cast p1, La/fet;

    .line 359
    .line 360
    check-cast p2, Ljava/lang/Integer;

    .line 361
    .line 362
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    or-int/lit8 p2, v2, 0x1

    .line 366
    .line 367
    invoke-static {p2}, La/x8x;->L(I)I

    .line 368
    .line 369
    .line 370
    move-result p2

    .line 371
    invoke-static {p0, v3, p1, p2}, La/bsr0;->Q(La/g7s0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 372
    .line 373
    .line 374
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object p0

    .line 377
    :pswitch_f
    check-cast p0, La/g6s0;

    .line 378
    .line 379
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 380
    .line 381
    check-cast p1, La/fet;

    .line 382
    .line 383
    check-cast p2, Ljava/lang/Integer;

    .line 384
    .line 385
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    or-int/lit8 p2, v2, 0x1

    .line 389
    .line 390
    invoke-static {p2}, La/x8x;->L(I)I

    .line 391
    .line 392
    .line 393
    move-result p2

    .line 394
    invoke-static {p0, v3, p1, p2}, La/jiq0;->f0(La/g6s0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 395
    .line 396
    .line 397
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object p0

    .line 400
    :pswitch_10
    check-cast p0, La/d4s0;

    .line 401
    .line 402
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 403
    .line 404
    check-cast p1, La/fet;

    .line 405
    .line 406
    check-cast p2, Ljava/lang/Integer;

    .line 407
    .line 408
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    or-int/lit8 p2, v2, 0x1

    .line 412
    .line 413
    invoke-static {p2}, La/x8x;->L(I)I

    .line 414
    .line 415
    .line 416
    move-result p2

    .line 417
    invoke-static {p0, v3, p1, p2}, La/ccq0;->Q(La/d4s0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 418
    .line 419
    .line 420
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 421
    .line 422
    return-object p0

    .line 423
    :pswitch_11
    check-cast p0, La/byr0;

    .line 424
    .line 425
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 426
    .line 427
    check-cast p1, La/fet;

    .line 428
    .line 429
    check-cast p2, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    or-int/lit8 p2, v2, 0x1

    .line 435
    .line 436
    invoke-static {p2}, La/x8x;->L(I)I

    .line 437
    .line 438
    .line 439
    move-result p2

    .line 440
    invoke-static {p0, v3, p1, p2}, La/rsm0;->e(La/byr0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 441
    .line 442
    .line 443
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object p0

    .line 446
    :pswitch_12
    check-cast p0, La/mm40;

    .line 447
    .line 448
    check-cast v3, La/brq0;

    .line 449
    .line 450
    check-cast p1, La/fet;

    .line 451
    .line 452
    check-cast p2, Ljava/lang/Integer;

    .line 453
    .line 454
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    or-int/lit8 p2, v2, 0x1

    .line 458
    .line 459
    invoke-static {p2}, La/x8x;->L(I)I

    .line 460
    .line 461
    .line 462
    move-result p2

    .line 463
    invoke-static {p0, v3, p1, p2}, La/cem0;->j(La/mm40;La/brq0;La/fet;I)V

    .line 464
    .line 465
    .line 466
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object p0

    .line 469
    :pswitch_13
    check-cast p0, La/mm40;

    .line 470
    .line 471
    check-cast v3, La/aor0;

    .line 472
    .line 473
    check-cast p1, La/fet;

    .line 474
    .line 475
    check-cast p2, Ljava/lang/Integer;

    .line 476
    .line 477
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    or-int/lit8 p2, v2, 0x1

    .line 481
    .line 482
    invoke-static {p2}, La/x8x;->L(I)I

    .line 483
    .line 484
    .line 485
    move-result p2

    .line 486
    invoke-static {p0, v3, p1, p2}, La/aem0;->j(La/mm40;La/aor0;La/fet;I)V

    .line 487
    .line 488
    .line 489
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 490
    .line 491
    return-object p0

    .line 492
    :pswitch_14
    check-cast p0, La/nyq0;

    .line 493
    .line 494
    check-cast v3, La/c5n0;

    .line 495
    .line 496
    check-cast p1, La/fet;

    .line 497
    .line 498
    check-cast p2, Ljava/lang/Integer;

    .line 499
    .line 500
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result p2

    .line 504
    and-int/lit8 v0, p2, 0x3

    .line 505
    .line 506
    const/4 v4, 0x2

    .line 507
    if-eq v0, v4, :cond_0

    .line 508
    .line 509
    move v0, v1

    .line 510
    goto :goto_0

    .line 511
    :cond_0
    const/4 v0, 0x0

    .line 512
    :goto_0
    and-int/2addr p2, v1

    .line 513
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 514
    .line 515
    .line 516
    move-result p2

    .line 517
    if-eqz p2, :cond_1

    .line 518
    .line 519
    new-instance p2, La/nb50;

    .line 520
    .line 521
    const/16 v0, 0x19

    .line 522
    .line 523
    invoke-direct {p2, v3, v2, v0}, La/nb50;-><init>(Ljava/lang/Object;IB)V

    .line 524
    .line 525
    .line 526
    const v0, -0x34974941    # -1.5251135E7f

    .line 527
    .line 528
    .line 529
    invoke-static {v0, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 530
    .line 531
    .line 532
    move-result-object p2

    .line 533
    const/16 v0, 0x180

    .line 534
    .line 535
    const/4 v1, 0x0

    .line 536
    invoke-static {v1, p0, p2, p1, v0}, La/iym0;->g(La/mm40;La/nyq0;La/ugd;La/fet;I)V

    .line 537
    .line 538
    .line 539
    goto :goto_1

    .line 540
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 541
    .line 542
    .line 543
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 544
    .line 545
    return-object p0

    .line 546
    nop

    .line 547
    :pswitch_data_0
    .packed-switch 0x0
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
