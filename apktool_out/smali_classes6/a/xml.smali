.class public final synthetic La/xml;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;


# direct methods
.method public synthetic constructor <init>(La/mm40;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xml;->a:B

    sparse-switch p3, :sswitch_data_0

    sget p2, La/m0l0;->a:F

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xml;->b:La/mm40;

    return-void

    :sswitch_0
    sget-object p2, La/aql0;->a:La/aql0;

    goto :goto_0

    :sswitch_1
    sget-object p2, La/q6x;->a:La/q6x;

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x11 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(La/mm40;ZIB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/xml;->a:B

    iput-object p1, p0, La/xml;->b:La/mm40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/xml;->a:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/xml;->b:La/mm40;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-static {p2, p1, p0}, La/wvb;->F(ILa/fet;La/mm40;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, La/fet;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, La/x8x;->L(I)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    invoke-static {p2, p1, p0}, La/wvb;->C(ILa/fet;La/mm40;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    check-cast p1, La/fet;

    .line 45
    .line 46
    check-cast p2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, La/x8x;->L(I)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-static {p2, p1, p0}, La/hkb;->q(ILa/fet;La/mm40;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_2
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
    invoke-static {v2}, La/x8x;->L(I)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p2, p1, p0}, La/ny9;->F(ILa/fet;La/mm40;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_3
    check-cast p1, La/fet;

    .line 79
    .line 80
    check-cast p2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v2}, La/x8x;->L(I)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-static {p2, p1, p0}, La/hmw0;->p(ILa/fet;La/mm40;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_4
    check-cast p1, La/fet;

    .line 96
    .line 97
    check-cast p2, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v2}, La/x8x;->L(I)I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    invoke-static {p2, p1, p0}, La/xbc;->b(ILa/fet;La/mm40;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_5
    check-cast p1, La/fet;

    .line 113
    .line 114
    check-cast p2, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {v2}, La/x8x;->L(I)I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-static {p2, p1, p0}, La/d5c;->z(ILa/fet;La/mm40;)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_6
    sget-object v0, La/aql0;->a:La/aql0;

    .line 130
    .line 131
    check-cast p1, La/fet;

    .line 132
    .line 133
    check-cast p2, Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {v2}, La/x8x;->L(I)I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    invoke-static {p2, p1, p0}, La/ahb;->k(ILa/fet;La/mm40;)V

    .line 143
    .line 144
    .line 145
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_7
    check-cast p1, La/fet;

    .line 149
    .line 150
    check-cast p2, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v2}, La/x8x;->L(I)I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    invoke-static {p2, p1, p0}, La/bfb;->t(ILa/fet;La/mm40;)V

    .line 160
    .line 161
    .line 162
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_8
    check-cast p1, La/fet;

    .line 166
    .line 167
    check-cast p2, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v2}, La/x8x;->L(I)I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {p2, p1, p0}, La/vtb;->a(ILa/fet;La/mm40;)V

    .line 177
    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_9
    check-cast p1, La/fet;

    .line 183
    .line 184
    check-cast p2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v2}, La/x8x;->L(I)I

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    invoke-static {p2, p1, p0}, La/ntb;->b(ILa/fet;La/mm40;)V

    .line 194
    .line 195
    .line 196
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_a
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
    invoke-static {v2}, La/x8x;->L(I)I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    invoke-static {p2, p1, p0}, La/kpb;->a(ILa/fet;La/mm40;)V

    .line 211
    .line 212
    .line 213
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_b
    sget-object v0, La/q6x;->a:La/q6x;

    .line 217
    .line 218
    check-cast p1, La/fet;

    .line 219
    .line 220
    check-cast p2, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-static {v2}, La/x8x;->L(I)I

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    invoke-static {p2, p1, p0}, La/kpb;->o(ILa/fet;La/mm40;)V

    .line 230
    .line 231
    .line 232
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_c
    sget-object v0, La/q6x;->a:La/q6x;

    .line 236
    .line 237
    check-cast p1, La/fet;

    .line 238
    .line 239
    check-cast p2, Ljava/lang/Integer;

    .line 240
    .line 241
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-static {v2}, La/x8x;->L(I)I

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    invoke-static {p2, p1, p0}, La/sj3;->y(ILa/fet;La/mm40;)V

    .line 249
    .line 250
    .line 251
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object p0

    .line 254
    :pswitch_d
    check-cast p1, La/fet;

    .line 255
    .line 256
    check-cast p2, Ljava/lang/Integer;

    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-static {v2}, La/x8x;->L(I)I

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    invoke-static {p2, p1, p0}, La/obb;->s(ILa/fet;La/mm40;)V

    .line 266
    .line 267
    .line 268
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object p0

    .line 271
    :pswitch_e
    sget v0, La/m0l0;->a:F

    .line 272
    .line 273
    check-cast p1, La/fet;

    .line 274
    .line 275
    check-cast p2, Ljava/lang/Integer;

    .line 276
    .line 277
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    const/16 p2, 0x31

    .line 281
    .line 282
    invoke-static {p2}, La/x8x;->L(I)I

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    invoke-static {p2, p1, p0}, La/vfc;->o(ILa/fet;La/mm40;)V

    .line 287
    .line 288
    .line 289
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_f
    check-cast p1, La/fet;

    .line 293
    .line 294
    check-cast p2, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-static {v2}, La/x8x;->L(I)I

    .line 300
    .line 301
    .line 302
    move-result p2

    .line 303
    invoke-static {p2, p1, p0}, La/srm;->a(ILa/fet;La/mm40;)V

    .line 304
    .line 305
    .line 306
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object p0

    .line 309
    :pswitch_10
    check-cast p1, La/fet;

    .line 310
    .line 311
    check-cast p2, Ljava/lang/Integer;

    .line 312
    .line 313
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-static {v2}, La/x8x;->L(I)I

    .line 317
    .line 318
    .line 319
    move-result p2

    .line 320
    invoke-static {p2, p1, p0}, La/vzb;->h(ILa/fet;La/mm40;)V

    .line 321
    .line 322
    .line 323
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object p0

    .line 326
    :pswitch_11
    check-cast p1, La/fet;

    .line 327
    .line 328
    check-cast p2, Ljava/lang/Integer;

    .line 329
    .line 330
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-static {v2}, La/x8x;->L(I)I

    .line 334
    .line 335
    .line 336
    move-result p2

    .line 337
    invoke-static {p2, p1, p0}, La/feb;->r(ILa/fet;La/mm40;)V

    .line 338
    .line 339
    .line 340
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    return-object p0

    .line 343
    :pswitch_12
    check-cast p1, La/fet;

    .line 344
    .line 345
    check-cast p2, Ljava/lang/Integer;

    .line 346
    .line 347
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-static {v2}, La/x8x;->L(I)I

    .line 351
    .line 352
    .line 353
    move-result p2

    .line 354
    invoke-static {p2, p1, p0}, La/ibc;->M(ILa/fet;La/mm40;)V

    .line 355
    .line 356
    .line 357
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    return-object p0

    .line 360
    :pswitch_13
    check-cast p1, La/fet;

    .line 361
    .line 362
    check-cast p2, Ljava/lang/Integer;

    .line 363
    .line 364
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {v2}, La/x8x;->L(I)I

    .line 368
    .line 369
    .line 370
    move-result p2

    .line 371
    invoke-static {p2, p1, p0}, La/v3c;->o(ILa/fet;La/mm40;)V

    .line 372
    .line 373
    .line 374
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object p0

    .line 377
    :pswitch_14
    check-cast p1, La/fet;

    .line 378
    .line 379
    check-cast p2, Ljava/lang/Integer;

    .line 380
    .line 381
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-static {v2}, La/x8x;->L(I)I

    .line 385
    .line 386
    .line 387
    move-result p2

    .line 388
    invoke-static {p2, p1, p0}, La/slb;->u(ILa/fet;La/mm40;)V

    .line 389
    .line 390
    .line 391
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object p0

    .line 394
    :pswitch_15
    check-cast p1, La/fet;

    .line 395
    .line 396
    check-cast p2, Ljava/lang/Integer;

    .line 397
    .line 398
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-static {v2}, La/x8x;->L(I)I

    .line 402
    .line 403
    .line 404
    move-result p2

    .line 405
    invoke-static {p2, p1, p0}, La/acb;->p(ILa/fet;La/mm40;)V

    .line 406
    .line 407
    .line 408
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object p0

    .line 411
    :pswitch_16
    check-cast p1, La/fet;

    .line 412
    .line 413
    check-cast p2, Ljava/lang/Integer;

    .line 414
    .line 415
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-static {v2}, La/x8x;->L(I)I

    .line 419
    .line 420
    .line 421
    move-result p2

    .line 422
    invoke-static {p2, p1, p0}, La/etl;->b(ILa/fet;La/mm40;)V

    .line 423
    .line 424
    .line 425
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    return-object p0

    .line 428
    :pswitch_17
    check-cast p1, La/fet;

    .line 429
    .line 430
    check-cast p2, Ljava/lang/Integer;

    .line 431
    .line 432
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-static {v1}, La/x8x;->L(I)I

    .line 436
    .line 437
    .line 438
    move-result p2

    .line 439
    invoke-static {p2, p1, p0}, La/etl;->f(ILa/fet;La/mm40;)V

    .line 440
    .line 441
    .line 442
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 443
    .line 444
    return-object p0

    .line 445
    :pswitch_18
    check-cast p1, La/fet;

    .line 446
    .line 447
    check-cast p2, Ljava/lang/Integer;

    .line 448
    .line 449
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-static {v2}, La/x8x;->L(I)I

    .line 453
    .line 454
    .line 455
    move-result p2

    .line 456
    invoke-static {p2, p1, p0}, La/qcc;->h(ILa/fet;La/mm40;)V

    .line 457
    .line 458
    .line 459
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object p0

    .line 462
    :pswitch_19
    check-cast p1, La/fet;

    .line 463
    .line 464
    check-cast p2, Ljava/lang/Integer;

    .line 465
    .line 466
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    invoke-static {v2}, La/x8x;->L(I)I

    .line 470
    .line 471
    .line 472
    move-result p2

    .line 473
    invoke-static {p2, p1, p0}, La/mrv;->f(ILa/fet;La/mm40;)V

    .line 474
    .line 475
    .line 476
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object p0

    .line 479
    :pswitch_1a
    check-cast p1, La/fet;

    .line 480
    .line 481
    check-cast p2, Ljava/lang/Integer;

    .line 482
    .line 483
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-static {v2}, La/x8x;->L(I)I

    .line 487
    .line 488
    .line 489
    move-result p2

    .line 490
    invoke-static {p2, p1, p0}, La/ntr;->f(ILa/fet;La/mm40;)V

    .line 491
    .line 492
    .line 493
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 494
    .line 495
    return-object p0

    .line 496
    :pswitch_1b
    check-cast p1, La/fet;

    .line 497
    .line 498
    check-cast p2, Ljava/lang/Integer;

    .line 499
    .line 500
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-static {v2}, La/x8x;->L(I)I

    .line 504
    .line 505
    .line 506
    move-result p2

    .line 507
    invoke-static {p2, p1, p0}, La/xkb;->v(ILa/fet;La/mm40;)V

    .line 508
    .line 509
    .line 510
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 511
    .line 512
    return-object p0

    .line 513
    :pswitch_1c
    check-cast p1, La/fet;

    .line 514
    .line 515
    check-cast p2, Ljava/lang/Integer;

    .line 516
    .line 517
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-static {v2}, La/x8x;->L(I)I

    .line 521
    .line 522
    .line 523
    move-result p2

    .line 524
    invoke-static {p2, p1, p0}, La/eeq;->e(ILa/fet;La/mm40;)V

    .line 525
    .line 526
    .line 527
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object p0

    .line 530
    nop

    .line 531
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
