.class public final La/j210;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a8z;


# direct methods
.method public synthetic constructor <init>(La/a8z;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j210;->a:B

    iput-object p1, p0, La/j210;->b:La/a8z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/j210;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/j210;->b:La/a8z;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/riu0;

    .line 14
    .line 15
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_0
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/riu0;

    .line 25
    .line 26
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_1
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/riu0;

    .line 36
    .line 37
    instance-of v0, p0, La/wmv;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    move-object v1, p0

    .line 42
    check-cast v1, La/wmv;

    .line 43
    .line 44
    :cond_0
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object p0, La/vbf;->b:La/vbf;

    .line 52
    .line 53
    :goto_0
    return-object p0

    .line 54
    :pswitch_2
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/riu0;

    .line 59
    .line 60
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, La/riu0;

    .line 70
    .line 71
    instance-of v0, p0, La/wmv;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    move-object v1, p0

    .line 76
    check-cast v1, La/wmv;

    .line 77
    .line 78
    :cond_2
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    sget-object p0, La/vbf;->b:La/vbf;

    .line 86
    .line 87
    :goto_1
    return-object p0

    .line 88
    :pswitch_4
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/riu0;

    .line 93
    .line 94
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_5
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/riu0;

    .line 104
    .line 105
    instance-of v0, p0, La/wmv;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    move-object v1, p0

    .line 110
    check-cast v1, La/wmv;

    .line 111
    .line 112
    :cond_4
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    sget-object p0, La/vbf;->b:La/vbf;

    .line 120
    .line 121
    :goto_2
    return-object p0

    .line 122
    :pswitch_6
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, La/riu0;

    .line 127
    .line 128
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_7
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, La/riu0;

    .line 138
    .line 139
    instance-of v0, p0, La/wmv;

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    move-object v1, p0

    .line 144
    check-cast v1, La/wmv;

    .line 145
    .line 146
    :cond_6
    if-eqz v1, :cond_7

    .line 147
    .line 148
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    goto :goto_3

    .line 153
    :cond_7
    sget-object p0, La/vbf;->b:La/vbf;

    .line 154
    .line 155
    :goto_3
    return-object p0

    .line 156
    :pswitch_8
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, La/riu0;

    .line 161
    .line 162
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :pswitch_9
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, La/riu0;

    .line 172
    .line 173
    instance-of v0, p0, La/wmv;

    .line 174
    .line 175
    if-eqz v0, :cond_8

    .line 176
    .line 177
    move-object v1, p0

    .line 178
    check-cast v1, La/wmv;

    .line 179
    .line 180
    :cond_8
    if-eqz v1, :cond_9

    .line 181
    .line 182
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    goto :goto_4

    .line 187
    :cond_9
    sget-object p0, La/vbf;->b:La/vbf;

    .line 188
    .line 189
    :goto_4
    return-object p0

    .line 190
    :pswitch_a
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, La/riu0;

    .line 195
    .line 196
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :pswitch_b
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    check-cast p0, La/riu0;

    .line 206
    .line 207
    instance-of v0, p0, La/wmv;

    .line 208
    .line 209
    if-eqz v0, :cond_a

    .line 210
    .line 211
    move-object v1, p0

    .line 212
    check-cast v1, La/wmv;

    .line 213
    .line 214
    :cond_a
    if-eqz v1, :cond_b

    .line 215
    .line 216
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    goto :goto_5

    .line 221
    :cond_b
    sget-object p0, La/vbf;->b:La/vbf;

    .line 222
    .line 223
    :goto_5
    return-object p0

    .line 224
    :pswitch_c
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    check-cast p0, La/riu0;

    .line 229
    .line 230
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :pswitch_d
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    check-cast p0, La/riu0;

    .line 240
    .line 241
    instance-of v0, p0, La/wmv;

    .line 242
    .line 243
    if-eqz v0, :cond_c

    .line 244
    .line 245
    move-object v1, p0

    .line 246
    check-cast v1, La/wmv;

    .line 247
    .line 248
    :cond_c
    if-eqz v1, :cond_d

    .line 249
    .line 250
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    goto :goto_6

    .line 255
    :cond_d
    sget-object p0, La/vbf;->b:La/vbf;

    .line 256
    .line 257
    :goto_6
    return-object p0

    .line 258
    :pswitch_e
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    check-cast p0, La/riu0;

    .line 263
    .line 264
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    return-object p0

    .line 269
    :pswitch_f
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    check-cast p0, La/riu0;

    .line 274
    .line 275
    instance-of v0, p0, La/wmv;

    .line 276
    .line 277
    if-eqz v0, :cond_e

    .line 278
    .line 279
    move-object v1, p0

    .line 280
    check-cast v1, La/wmv;

    .line 281
    .line 282
    :cond_e
    if-eqz v1, :cond_f

    .line 283
    .line 284
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    goto :goto_7

    .line 289
    :cond_f
    sget-object p0, La/vbf;->b:La/vbf;

    .line 290
    .line 291
    :goto_7
    return-object p0

    .line 292
    :pswitch_10
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    check-cast p0, La/riu0;

    .line 297
    .line 298
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    return-object p0

    .line 303
    :pswitch_11
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    check-cast p0, La/riu0;

    .line 308
    .line 309
    instance-of v0, p0, La/wmv;

    .line 310
    .line 311
    if-eqz v0, :cond_10

    .line 312
    .line 313
    move-object v1, p0

    .line 314
    check-cast v1, La/wmv;

    .line 315
    .line 316
    :cond_10
    if-eqz v1, :cond_11

    .line 317
    .line 318
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    goto :goto_8

    .line 323
    :cond_11
    sget-object p0, La/vbf;->b:La/vbf;

    .line 324
    .line 325
    :goto_8
    return-object p0

    .line 326
    :pswitch_12
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    check-cast p0, La/riu0;

    .line 331
    .line 332
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    return-object p0

    .line 337
    :pswitch_13
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    check-cast p0, La/riu0;

    .line 342
    .line 343
    instance-of v0, p0, La/wmv;

    .line 344
    .line 345
    if-eqz v0, :cond_12

    .line 346
    .line 347
    move-object v1, p0

    .line 348
    check-cast v1, La/wmv;

    .line 349
    .line 350
    :cond_12
    if-eqz v1, :cond_13

    .line 351
    .line 352
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    goto :goto_9

    .line 357
    :cond_13
    sget-object p0, La/vbf;->b:La/vbf;

    .line 358
    .line 359
    :goto_9
    return-object p0

    .line 360
    :pswitch_14
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    check-cast p0, La/riu0;

    .line 365
    .line 366
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    return-object p0

    .line 371
    :pswitch_15
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    check-cast p0, La/riu0;

    .line 376
    .line 377
    instance-of v0, p0, La/wmv;

    .line 378
    .line 379
    if-eqz v0, :cond_14

    .line 380
    .line 381
    move-object v1, p0

    .line 382
    check-cast v1, La/wmv;

    .line 383
    .line 384
    :cond_14
    if-eqz v1, :cond_15

    .line 385
    .line 386
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    goto :goto_a

    .line 391
    :cond_15
    sget-object p0, La/vbf;->b:La/vbf;

    .line 392
    .line 393
    :goto_a
    return-object p0

    .line 394
    :pswitch_16
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    check-cast p0, La/riu0;

    .line 399
    .line 400
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    return-object p0

    .line 405
    :pswitch_17
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    check-cast p0, La/riu0;

    .line 410
    .line 411
    instance-of v0, p0, La/wmv;

    .line 412
    .line 413
    if-eqz v0, :cond_16

    .line 414
    .line 415
    move-object v1, p0

    .line 416
    check-cast v1, La/wmv;

    .line 417
    .line 418
    :cond_16
    if-eqz v1, :cond_17

    .line 419
    .line 420
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    goto :goto_b

    .line 425
    :cond_17
    sget-object p0, La/vbf;->b:La/vbf;

    .line 426
    .line 427
    :goto_b
    return-object p0

    .line 428
    :pswitch_18
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    check-cast p0, La/riu0;

    .line 433
    .line 434
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    return-object p0

    .line 439
    :pswitch_19
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    check-cast p0, La/riu0;

    .line 444
    .line 445
    instance-of v0, p0, La/wmv;

    .line 446
    .line 447
    if-eqz v0, :cond_18

    .line 448
    .line 449
    move-object v1, p0

    .line 450
    check-cast v1, La/wmv;

    .line 451
    .line 452
    :cond_18
    if-eqz v1, :cond_19

    .line 453
    .line 454
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    goto :goto_c

    .line 459
    :cond_19
    sget-object p0, La/vbf;->b:La/vbf;

    .line 460
    .line 461
    :goto_c
    return-object p0

    .line 462
    :pswitch_1a
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    check-cast p0, La/riu0;

    .line 467
    .line 468
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    return-object p0

    .line 473
    :pswitch_1b
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    check-cast p0, La/riu0;

    .line 478
    .line 479
    instance-of v0, p0, La/wmv;

    .line 480
    .line 481
    if-eqz v0, :cond_1a

    .line 482
    .line 483
    move-object v1, p0

    .line 484
    check-cast v1, La/wmv;

    .line 485
    .line 486
    :cond_1a
    if-eqz v1, :cond_1b

    .line 487
    .line 488
    invoke-interface {v1}, La/wmv;->o()La/by40;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    goto :goto_d

    .line 493
    :cond_1b
    sget-object p0, La/vbf;->b:La/vbf;

    .line 494
    .line 495
    :goto_d
    return-object p0

    .line 496
    :pswitch_1c
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object p0

    .line 500
    check-cast p0, La/riu0;

    .line 501
    .line 502
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    return-object p0

    .line 507
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
