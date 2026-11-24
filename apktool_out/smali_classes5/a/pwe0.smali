.class public final La/pwe0;
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
    iput-byte p3, p0, La/pwe0;->a:B

    iput-object p1, p0, La/pwe0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/pwe0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/pwe0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/pwe0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/pwe0;->b:Ljava/lang/Object;

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
    check-cast p0, La/ejk0;

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
    invoke-virtual {p0, p1}, La/ejk0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, La/h2l0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    new-instance p1, La/vxq0;

    .line 37
    .line 38
    new-instance v0, La/x4l0;

    .line 39
    .line 40
    check-cast v1, La/ger0;

    .line 41
    .line 42
    iget-object v1, v1, La/ger0;->c:La/l1b0;

    .line 43
    .line 44
    iget-wide v1, v1, La/l1b0;->a:J

    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, La/x4l0;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, v0}, La/vxq0;-><init>(La/b5l0;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    check-cast p0, La/ejk0;

    .line 65
    .line 66
    check-cast v1, La/a4x;

    .line 67
    .line 68
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, La/ejk0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    check-cast p0, La/thj0;

    .line 84
    .line 85
    check-cast v1, Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, La/thj0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    check-cast p0, La/thj0;

    .line 103
    .line 104
    check-cast v1, Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, La/thj0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    check-cast p0, La/wvi0;

    .line 122
    .line 123
    check-cast v1, Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, La/wvi0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    check-cast p0, La/eoh0;

    .line 141
    .line 142
    check-cast v1, Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p0, p1}, La/eoh0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    check-cast p0, La/eoh0;

    .line 160
    .line 161
    check-cast v1, Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p0, p1}, La/eoh0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :pswitch_7
    check-cast p1, La/h2l0;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 178
    .line 179
    new-instance p1, La/fec;

    .line 180
    .line 181
    check-cast v1, La/dre;

    .line 182
    .line 183
    iget v0, v1, La/dre;->a:I

    .line 184
    .line 185
    invoke-direct {p1, v0}, La/fec;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    check-cast p0, La/eoh0;

    .line 201
    .line 202
    check-cast v1, Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p0, p1}, La/eoh0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    const-string p0, "cashback_cell"

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    check-cast p0, La/eoh0;

    .line 221
    .line 222
    check-cast v1, Ljava/util/List;

    .line 223
    .line 224
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p0, p1}, La/eoh0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_a
    check-cast p1, Ljava/lang/Number;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    check-cast p0, La/x0h0;

    .line 240
    .line 241
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v1, La/a4x;

    .line 246
    .line 247
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p0, v0, p1}, La/x0h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    return-object p0

    .line 256
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    check-cast p0, La/x0h0;

    .line 263
    .line 264
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v1, Ljava/util/List;

    .line 269
    .line 270
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {p0, v0, p1}, La/x0h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    return-object p0

    .line 279
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    check-cast p0, La/w0h0;

    .line 286
    .line 287
    check-cast v1, Ljava/util/List;

    .line 288
    .line 289
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p0, p1}, La/w0h0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    return-object p0

    .line 298
    :pswitch_d
    check-cast p1, La/iqq;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    check-cast p0, La/pkh0;

    .line 304
    .line 305
    iget-object p0, p0, La/pkh0;->a:La/bmh0;

    .line 306
    .line 307
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    if-eqz p1, :cond_0

    .line 312
    .line 313
    instance-of p1, p0, La/amh0;

    .line 314
    .line 315
    if-eqz p1, :cond_0

    .line 316
    .line 317
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 318
    .line 319
    new-instance p1, La/mkh0;

    .line 320
    .line 321
    check-cast p0, La/amh0;

    .line 322
    .line 323
    invoke-direct {p1, p0}, La/mkh0;-><init>(La/amh0;)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object p0

    .line 332
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    check-cast p0, La/x0h0;

    .line 339
    .line 340
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v1, Ljava/util/List;

    .line 345
    .line 346
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-virtual {p0, v0, p1}, La/x0h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    return-object p0

    .line 355
    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result p1

    .line 361
    check-cast p0, La/w0h0;

    .line 362
    .line 363
    check-cast v1, Ljava/util/List;

    .line 364
    .line 365
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-virtual {p0, p1}, La/w0h0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    return-object p0

    .line 374
    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 377
    .line 378
    .line 379
    move-result p1

    .line 380
    check-cast p0, La/w0h0;

    .line 381
    .line 382
    check-cast v1, Ljava/util/List;

    .line 383
    .line 384
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    invoke-virtual {p0, p1}, La/w0h0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    return-object p0

    .line 393
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 394
    .line 395
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    check-cast p0, La/wtf0;

    .line 400
    .line 401
    check-cast v1, Ljava/util/ArrayList;

    .line 402
    .line 403
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-virtual {p0, p1}, La/wtf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    return-object p0

    .line 412
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    check-cast p0, La/vtf0;

    .line 419
    .line 420
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    check-cast v1, Ljava/util/List;

    .line 425
    .line 426
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    invoke-virtual {p0, v0, p1}, La/vtf0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    return-object p0

    .line 435
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 436
    .line 437
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 438
    .line 439
    .line 440
    move-result p1

    .line 441
    check-cast p0, La/wtf0;

    .line 442
    .line 443
    check-cast v1, La/a4x;

    .line 444
    .line 445
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    invoke-virtual {p0, p1}, La/wtf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    return-object p0

    .line 454
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 455
    .line 456
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result p1

    .line 460
    check-cast p0, La/vtf0;

    .line 461
    .line 462
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    check-cast v1, Ljava/util/List;

    .line 467
    .line 468
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    invoke-virtual {p0, v0, p1}, La/vtf0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object p0

    .line 476
    return-object p0

    .line 477
    :pswitch_15
    check-cast p1, La/bem;

    .line 478
    .line 479
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    instance-of p1, p1, La/wdm;

    .line 483
    .line 484
    if-eqz p1, :cond_1

    .line 485
    .line 486
    check-cast p0, La/n7g0;

    .line 487
    .line 488
    sget-object p1, La/n7g0;->p2:La/cge0;

    .line 489
    .line 490
    iget-object p0, p0, La/n7g0;->o2:La/a8z;

    .line 491
    .line 492
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    check-cast p0, La/k3t0;

    .line 497
    .line 498
    new-instance p1, La/n0g0;

    .line 499
    .line 500
    check-cast v1, La/dyl0;

    .line 501
    .line 502
    invoke-direct {p1, v1}, La/n0g0;-><init>(La/dyl0;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 509
    .line 510
    return-object p0

    .line 511
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 512
    .line 513
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 514
    .line 515
    .line 516
    move-result p1

    .line 517
    check-cast p0, La/wtf0;

    .line 518
    .line 519
    check-cast v1, La/a4x;

    .line 520
    .line 521
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    invoke-virtual {p0, p1}, La/wtf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    return-object p0

    .line 530
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 531
    .line 532
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 533
    .line 534
    .line 535
    move-result p1

    .line 536
    check-cast p0, La/wtf0;

    .line 537
    .line 538
    check-cast v1, La/a4x;

    .line 539
    .line 540
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    invoke-virtual {p0, p1}, La/wtf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    return-object p0

    .line 549
    :pswitch_18
    check-cast p1, Ljava/lang/Number;

    .line 550
    .line 551
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 552
    .line 553
    .line 554
    move-result p1

    .line 555
    check-cast p0, La/bue0;

    .line 556
    .line 557
    check-cast v1, Ljava/util/List;

    .line 558
    .line 559
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    invoke-virtual {p0, p1}, La/bue0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object p0

    .line 567
    return-object p0

    .line 568
    :pswitch_19
    check-cast p1, Ljava/lang/Number;

    .line 569
    .line 570
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 571
    .line 572
    .line 573
    move-result p1

    .line 574
    check-cast p0, La/bue0;

    .line 575
    .line 576
    check-cast v1, Ljava/util/List;

    .line 577
    .line 578
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    invoke-virtual {p0, p1}, La/bue0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    return-object p0

    .line 587
    :pswitch_1a
    check-cast p1, Ljava/lang/Number;

    .line 588
    .line 589
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 590
    .line 591
    .line 592
    move-result p1

    .line 593
    check-cast p0, La/k8e0;

    .line 594
    .line 595
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v1, La/a4x;

    .line 600
    .line 601
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object p1

    .line 605
    invoke-virtual {p0, v0, p1}, La/k8e0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    return-object p0

    .line 610
    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    .line 611
    .line 612
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 613
    .line 614
    .line 615
    move-result p1

    .line 616
    check-cast p0, La/k8e0;

    .line 617
    .line 618
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    check-cast v1, Ljava/util/List;

    .line 623
    .line 624
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    invoke-virtual {p0, v0, p1}, La/k8e0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object p0

    .line 632
    return-object p0

    .line 633
    :pswitch_1c
    check-cast p1, Ljava/lang/Number;

    .line 634
    .line 635
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 636
    .line 637
    .line 638
    move-result p1

    .line 639
    check-cast p0, La/k8e0;

    .line 640
    .line 641
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    check-cast v1, La/a4x;

    .line 646
    .line 647
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    invoke-virtual {p0, v0, p1}, La/k8e0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    return-object p0

    .line 656
    nop

    .line 657
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
