.class public final La/m160;
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
    iput-byte p3, p0, La/m160;->a:B

    iput-object p1, p0, La/m160;->c:Ljava/lang/Object;

    iput-object p2, p0, La/m160;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/m160;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/m160;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/m160;->c:Ljava/lang/Object;

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
    check-cast p0, La/so90;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, v0, p1}, La/so90;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    check-cast p0, La/ch90;

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v1, La/a4x;

    .line 46
    .line 47
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, v0, p1}, La/ch90;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    check-cast p0, La/ht80;

    .line 63
    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v1, Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, v0, p1}, La/ht80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    check-cast p0, La/ht80;

    .line 86
    .line 87
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v1, Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, v0, p1}, La/ht80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    check-cast p0, La/ht80;

    .line 109
    .line 110
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v1, Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p0, v0, p1}, La/ht80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    check-cast p0, La/ht80;

    .line 132
    .line 133
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v1, Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0, v0, p1}, La/ht80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    check-cast p0, La/ht80;

    .line 155
    .line 156
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v1, Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p0, v0, p1}, La/ht80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    check-cast p0, La/ht80;

    .line 178
    .line 179
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v1, Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p0, v0, p1}, La/ht80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    return-object p0

    .line 194
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    check-cast p0, La/ev80;

    .line 201
    .line 202
    check-cast v1, La/a4x;

    .line 203
    .line 204
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p0, p1}, La/ev80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    check-cast p0, La/ev80;

    .line 220
    .line 221
    check-cast v1, La/a4x;

    .line 222
    .line 223
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-virtual {p0, p1}, La/ev80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0

    .line 232
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    check-cast p0, La/ev80;

    .line 239
    .line 240
    check-cast v1, Ljava/util/List;

    .line 241
    .line 242
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-virtual {p0, p1}, La/ev80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    return-object p0

    .line 251
    :pswitch_a
    check-cast p1, La/mp9;

    .line 252
    .line 253
    check-cast p0, La/g8x;

    .line 254
    .line 255
    check-cast v1, La/mp9;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, v1, p1}, La/g8x;->y(La/mp9;La/mp9;)V

    .line 261
    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    check-cast p0, La/zc70;

    .line 273
    .line 274
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v1, Ljava/util/List;

    .line 279
    .line 280
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-virtual {p0, v0, p1}, La/zc70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    return-object p0

    .line 289
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    check-cast p0, La/zc70;

    .line 296
    .line 297
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    check-cast v1, Ljava/util/List;

    .line 302
    .line 303
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {p0, v0, p1}, La/zc70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0

    .line 312
    :pswitch_d
    check-cast p1, Ljava/lang/Number;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    check-cast p0, La/zc70;

    .line 319
    .line 320
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v1, Ljava/util/List;

    .line 325
    .line 326
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-virtual {p0, v0, p1}, La/zc70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    return-object p0

    .line 335
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    check-cast p0, La/zc70;

    .line 342
    .line 343
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v1, Ljava/util/List;

    .line 348
    .line 349
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-virtual {p0, v0, p1}, La/zc70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    return-object p0

    .line 358
    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    .line 359
    .line 360
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result p1

    .line 364
    check-cast p0, La/r580;

    .line 365
    .line 366
    check-cast v1, Ljava/util/List;

    .line 367
    .line 368
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-virtual {p0, p1}, La/r580;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    return-object p0

    .line 377
    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    check-cast p0, La/wk60;

    .line 384
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
    invoke-virtual {p0, p1}, La/wk60;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    return-object p0

    .line 396
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 397
    .line 398
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result p1

    .line 402
    check-cast p0, La/zc70;

    .line 403
    .line 404
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    check-cast v1, La/a4x;

    .line 409
    .line 410
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-virtual {p0, v0, p1}, La/zc70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    return-object p0

    .line 419
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    check-cast p0, La/mb50;

    .line 426
    .line 427
    check-cast v1, La/a4x;

    .line 428
    .line 429
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    invoke-virtual {p0, p1}, La/mb50;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    return-object p0

    .line 438
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 439
    .line 440
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 441
    .line 442
    .line 443
    move-result p1

    .line 444
    check-cast p0, La/mb50;

    .line 445
    .line 446
    check-cast v1, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {p0, p1}, La/mb50;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    return-object p0

    .line 457
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 458
    .line 459
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 460
    .line 461
    .line 462
    move-result p1

    .line 463
    check-cast p0, Ljava/util/ArrayList;

    .line 464
    .line 465
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    check-cast p0, La/o8w;

    .line 470
    .line 471
    const/4 v0, 0x1

    .line 472
    if-ne p1, v0, :cond_0

    .line 473
    .line 474
    check-cast v1, La/qgv0;

    .line 475
    .line 476
    if-eqz v1, :cond_0

    .line 477
    .line 478
    goto :goto_0

    .line 479
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    sget-object p1, La/sre0;->a:La/tre0;

    .line 484
    .line 485
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    :goto_0
    return-object v1

    .line 490
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 491
    .line 492
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result p1

    .line 496
    check-cast p0, La/rj50;

    .line 497
    .line 498
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    check-cast v1, Ljava/util/ArrayList;

    .line 503
    .line 504
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    invoke-virtual {p0, v0, p1}, La/rj50;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    return-object p0

    .line 513
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 514
    .line 515
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 516
    .line 517
    .line 518
    move-result p1

    .line 519
    check-cast p0, La/mb50;

    .line 520
    .line 521
    check-cast v1, Ljava/util/List;

    .line 522
    .line 523
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    invoke-virtual {p0, p1}, La/mb50;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    return-object p0

    .line 532
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 533
    .line 534
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 535
    .line 536
    new-instance v0, La/bz50;

    .line 537
    .line 538
    check-cast v1, La/tdp;

    .line 539
    .line 540
    invoke-direct {v0, v1, p1}, La/bz50;-><init>(La/tdp;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
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
    check-cast p0, La/mb50;

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
    invoke-virtual {p0, p1}, La/mb50;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p0, La/mb50;

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
    invoke-virtual {p0, p1}, La/mb50;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p0, La/rj50;

    .line 594
    .line 595
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v1, Ljava/util/List;

    .line 600
    .line 601
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object p1

    .line 605
    invoke-virtual {p0, v0, p1}, La/rj50;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p0, La/mb50;

    .line 617
    .line 618
    check-cast v1, Ljava/util/List;

    .line 619
    .line 620
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    invoke-virtual {p0, p1}, La/mb50;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object p0

    .line 628
    return-object p0

    .line 629
    :pswitch_1c
    check-cast p1, Ljava/lang/Number;

    .line 630
    .line 631
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 632
    .line 633
    .line 634
    move-result p1

    .line 635
    check-cast p0, La/rj50;

    .line 636
    .line 637
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    check-cast v1, Ljava/util/List;

    .line 642
    .line 643
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    invoke-virtual {p0, v0, p1}, La/rj50;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object p0

    .line 651
    return-object p0

    .line 652
    nop

    .line 653
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
