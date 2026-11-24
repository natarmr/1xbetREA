.class public final synthetic La/bb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cb1;


# direct methods
.method public synthetic constructor <init>(La/cb1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bb1;->a:B

    iput-object p1, p0, La/bb1;->b:La/cb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-byte v0, p0, La/bb1;->a:B

    .line 2
    .line 3
    const-string v1, "RESULT_ON_DISMISS_KEY"

    .line 4
    .line 5
    const-string v2, "RESULT_ON_ADD_ACCOUNT_OPENED_KEY"

    .line 6
    .line 7
    const-string v3, "RESULT_ON_PAYMENT_OPENED_KEY"

    .line 8
    .line 9
    const-string v4, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 10
    .line 11
    const/16 v5, 0x21

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    sget-object v7, La/sa1;->a:La/sa1;

    .line 15
    .line 16
    iget-object p0, p0, La/bb1;->b:La/cb1;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget-object v0, La/cb1;->e2:La/rek0;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string v0, "GAME_CURRENCY_CONVERSATION_REQUEST_KEY"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p2, "GAME_CURRENCY_CONVERSATION_RESULT_KEY_CONTINUE"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance p2, La/qa1;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    invoke-direct {p2, p1, v0}, La/qa1;-><init>(ZZ)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const-string p2, "GAME_CURRENCY_CONVERSATION_RESULT_KEY_EXIT"

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance p2, La/qa1;

    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    invoke-direct {p2, p1, v0}, La/qa1;-><init>(ZZ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_0
    return-void

    .line 87
    :pswitch_0
    sget-object v0, La/cb1;->e2:La/rek0;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const-string v0, "GAME_NICKNAME_REQUEST_KEY"

    .line 93
    .line 94
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-nez p2, :cond_3

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    const-string p2, "RESULT_GAME_NICKNAME_LISTENER_KEY"

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    if-lt v1, v5, :cond_4

    .line 112
    .line 113
    invoke-static {p1}, La/c7;->x(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    goto :goto_1

    .line 118
    :cond_4
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    instance-of p2, p1, Ljava/lang/String;

    .line 123
    .line 124
    if-nez p2, :cond_5

    .line 125
    .line 126
    move-object p1, v6

    .line 127
    :cond_5
    check-cast p1, Ljava/lang/String;

    .line 128
    .line 129
    :goto_1
    instance-of p2, p1, Ljava/lang/String;

    .line 130
    .line 131
    if-eqz p2, :cond_6

    .line 132
    .line 133
    move-object v6, p1

    .line 134
    check-cast v6, Ljava/lang/String;

    .line 135
    .line 136
    :cond_6
    if-eqz v6, :cond_7

    .line 137
    .line 138
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance p2, La/wa1;

    .line 143
    .line 144
    invoke-direct {p2, v6}, La/wa1;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_8
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p1, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :goto_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :goto_3
    return-void

    .line 174
    :pswitch_1
    sget-object v0, La/cb1;->e2:La/rek0;

    .line 175
    .line 176
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    const-string v0, "SELECT_GAME_MODE_REQUEST_KEY"

    .line 180
    .line 181
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-nez p2, :cond_9

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    const-string p2, "RESULT_GAME_MODE_LISTENER_KEY"

    .line 189
    .line 190
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_e

    .line 195
    .line 196
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 197
    .line 198
    if-lt v1, v5, :cond_a

    .line 199
    .line 200
    invoke-static {p1}, La/c7;->y(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    goto :goto_4

    .line 205
    :cond_a
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    instance-of p2, p1, La/av0;

    .line 210
    .line 211
    if-nez p2, :cond_b

    .line 212
    .line 213
    move-object p1, v6

    .line 214
    :cond_b
    check-cast p1, La/av0;

    .line 215
    .line 216
    :goto_4
    instance-of p2, p1, La/av0;

    .line 217
    .line 218
    if-eqz p2, :cond_c

    .line 219
    .line 220
    move-object v6, p1

    .line 221
    check-cast v6, La/av0;

    .line 222
    .line 223
    :cond_c
    if-eqz v6, :cond_d

    .line 224
    .line 225
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    new-instance p2, La/xa1;

    .line 230
    .line 231
    invoke-direct {p2, v6}, La/xa1;-><init>(La/av0;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_d
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {p1, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_e
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :goto_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :goto_6
    return-void

    .line 261
    :pswitch_2
    sget-object v0, La/cb1;->e2:La/rek0;

    .line 262
    .line 263
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    const-string v0, "SELECT_BALANCE_REQUEST_KEY"

    .line 267
    .line 268
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    if-nez p2, :cond_f

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_f
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result p2

    .line 279
    if-eqz p2, :cond_14

    .line 280
    .line 281
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 282
    .line 283
    if-lt p2, v5, :cond_10

    .line 284
    .line 285
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    goto :goto_7

    .line 290
    :cond_10
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    instance-of p2, p1, La/ql5;

    .line 295
    .line 296
    if-nez p2, :cond_11

    .line 297
    .line 298
    move-object p1, v6

    .line 299
    :cond_11
    check-cast p1, La/ql5;

    .line 300
    .line 301
    :goto_7
    instance-of p2, p1, La/ql5;

    .line 302
    .line 303
    if-eqz p2, :cond_12

    .line 304
    .line 305
    move-object v6, p1

    .line 306
    check-cast v6, La/ql5;

    .line 307
    .line 308
    :cond_12
    if-eqz v6, :cond_13

    .line 309
    .line 310
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    new-instance p2, La/ma1;

    .line 315
    .line 316
    invoke-direct {p2, v6}, La/ma1;-><init>(La/ql5;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_13
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {p1, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_14
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 332
    .line 333
    .line 334
    move-result p2

    .line 335
    if-nez p2, :cond_16

    .line 336
    .line 337
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 338
    .line 339
    .line 340
    move-result p2

    .line 341
    if-eqz p2, :cond_15

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_15
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    if-eqz p1, :cond_16

    .line 349
    .line 350
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-virtual {p1, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :cond_16
    :goto_8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    :goto_9
    return-void

    .line 365
    :pswitch_3
    sget-object v0, La/cb1;->e2:La/rek0;

    .line 366
    .line 367
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    const-string v0, "CHANGE_BALANCE_REQUEST_KEY"

    .line 371
    .line 372
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result p2

    .line 376
    if-nez p2, :cond_17

    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_17
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 380
    .line 381
    .line 382
    move-result p2

    .line 383
    if-eqz p2, :cond_1c

    .line 384
    .line 385
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 386
    .line 387
    if-lt p2, v5, :cond_18

    .line 388
    .line 389
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    goto :goto_a

    .line 394
    :cond_18
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    instance-of p2, p1, La/ql5;

    .line 399
    .line 400
    if-nez p2, :cond_19

    .line 401
    .line 402
    move-object p1, v6

    .line 403
    :cond_19
    check-cast p1, La/ql5;

    .line 404
    .line 405
    :goto_a
    instance-of p2, p1, La/ql5;

    .line 406
    .line 407
    if-eqz p2, :cond_1a

    .line 408
    .line 409
    move-object v6, p1

    .line 410
    check-cast v6, La/ql5;

    .line 411
    .line 412
    :cond_1a
    if-eqz v6, :cond_1b

    .line 413
    .line 414
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    new-instance p2, La/la1;

    .line 419
    .line 420
    invoke-direct {p2, v6}, La/la1;-><init>(La/ql5;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_1b
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-virtual {p1, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    goto :goto_b

    .line 435
    :cond_1c
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 436
    .line 437
    .line 438
    move-result p2

    .line 439
    if-nez p2, :cond_1e

    .line 440
    .line 441
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 442
    .line 443
    .line 444
    move-result p2

    .line 445
    if-eqz p2, :cond_1d

    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_1d
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 449
    .line 450
    .line 451
    move-result p1

    .line 452
    if-eqz p1, :cond_1e

    .line 453
    .line 454
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-virtual {p1, v7}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    :cond_1e
    :goto_b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    :goto_c
    return-void

    .line 469
    :pswitch_4
    sget-object p1, La/cb1;->e2:La/rek0;

    .line 470
    .line 471
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {p0}, La/cb1;->H0()La/k3t0;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    sget-object p1, La/ra1;->a:La/ra1;

    .line 479
    .line 480
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    return-void

    .line 484
    nop

    .line 485
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
