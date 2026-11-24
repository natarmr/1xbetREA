.class public final synthetic La/g58;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ee60;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l58;


# direct methods
.method public synthetic constructor <init>(La/l58;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g58;->a:B

    iput-object p1, p0, La/g58;->b:La/l58;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-byte v0, p0, La/g58;->a:B

    .line 2
    .line 3
    const v1, 0x7f130694

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/g58;->b:La/l58;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v2}, La/l58;->x0(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/l58;->y0()V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 29
    .line 30
    iget-object p1, p0, La/t58;->z:La/hy40;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, La/hy40;

    .line 35
    .line 36
    invoke-direct {p1}, La/wh00;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/t58;->z:La/hy40;

    .line 40
    .line 41
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-static {p1, p0}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void

    .line 47
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    const p1, 0x7f1304f8

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const/16 v0, 0x16

    .line 63
    .line 64
    invoke-virtual {p0, v0, p1}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x4

    .line 68
    invoke-virtual {p0, p1}, La/l58;->x0(I)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 72
    .line 73
    iget-object p1, p0, La/t58;->x:La/hy40;

    .line 74
    .line 75
    if-nez p1, :cond_2

    .line 76
    .line 77
    new-instance p1, La/hy40;

    .line 78
    .line 79
    invoke-direct {p1}, La/wh00;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, La/t58;->x:La/hy40;

    .line 83
    .line 84
    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-static {p1, p0}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void

    .line 90
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_9

    .line 97
    .line 98
    invoke-virtual {p0}, La/l58;->A0()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0}, La/l58;->C0()V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 109
    .line 110
    iget-object v0, p1, La/t58;->j:Ljava/lang/String;

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    move-object v4, v0

    .line 115
    goto :goto_0

    .line 116
    :cond_5
    iget-object p1, p1, La/t58;->d:La/yzn0;

    .line 117
    .line 118
    if-eqz p1, :cond_7

    .line 119
    .line 120
    iget-object p1, p1, La/yzn0;->b:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v4, p1

    .line 123
    check-cast v4, Ljava/lang/CharSequence;

    .line 124
    .line 125
    if-eqz v4, :cond_6

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    const-string v4, ""

    .line 129
    .line 130
    :cond_7
    :goto_0
    if-eqz v4, :cond_8

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_8
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :goto_1
    const/16 p1, 0xd

    .line 138
    .line 139
    invoke-virtual {p0, p1, v4}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    const/4 p1, 0x2

    .line 143
    invoke-virtual {p0, p1}, La/l58;->x0(I)V

    .line 144
    .line 145
    .line 146
    :goto_2
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 147
    .line 148
    invoke-virtual {p0, v3}, La/t58;->x(Z)V

    .line 149
    .line 150
    .line 151
    :cond_9
    return-void

    .line 152
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_e

    .line 159
    .line 160
    invoke-virtual {p0}, La/l58;->B0()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_a

    .line 165
    .line 166
    const p1, 0x7f1308d0

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p0, p1}, La/l58;->G0(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    .line 176
    :cond_a
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 177
    .line 178
    iget-boolean v0, p1, La/t58;->m:Z

    .line 179
    .line 180
    if-nez v0, :cond_b

    .line 181
    .line 182
    const-string p1, "BiometricFragment"

    .line 183
    .line 184
    const-string v0, "Failure not sent to client. Client is not awaiting a result."

    .line 185
    .line 186
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_b
    iget-object p1, p1, La/t58;->b:Ljava/util/concurrent/Executor;

    .line 191
    .line 192
    if-eqz p1, :cond_c

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_c
    new-instance p1, La/xz3;

    .line 196
    .line 197
    invoke-direct {p1, v2}, La/xz3;-><init>(B)V

    .line 198
    .line 199
    .line 200
    :goto_3
    new-instance v0, La/e58;

    .line 201
    .line 202
    invoke-direct {v0, p0, v3}, La/e58;-><init>(La/l58;B)V

    .line 203
    .line 204
    .line 205
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 206
    .line 207
    .line 208
    :goto_4
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 209
    .line 210
    iget-object p1, p0, La/t58;->v:La/hy40;

    .line 211
    .line 212
    if-nez p1, :cond_d

    .line 213
    .line 214
    new-instance p1, La/hy40;

    .line 215
    .line 216
    invoke-direct {p1}, La/wh00;-><init>()V

    .line 217
    .line 218
    .line 219
    iput-object p1, p0, La/t58;->v:La/hy40;

    .line 220
    .line 221
    :cond_d
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 222
    .line 223
    invoke-static {p1, p0}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :cond_e
    return-void

    .line 227
    :pswitch_3
    check-cast p1, Ljava/lang/CharSequence;

    .line 228
    .line 229
    if-eqz p1, :cond_11

    .line 230
    .line 231
    invoke-virtual {p0}, La/l58;->B0()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_f

    .line 236
    .line 237
    invoke-virtual {p0, p1}, La/l58;->G0(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    :cond_f
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 241
    .line 242
    iget-object p1, p0, La/t58;->t:La/hy40;

    .line 243
    .line 244
    if-nez p1, :cond_10

    .line 245
    .line 246
    new-instance p1, La/hy40;

    .line 247
    .line 248
    invoke-direct {p1}, La/wh00;-><init>()V

    .line 249
    .line 250
    .line 251
    iput-object p1, p0, La/t58;->t:La/hy40;

    .line 252
    .line 253
    :cond_10
    invoke-static {p1, v4}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_11
    return-void

    .line 257
    :pswitch_4
    check-cast p1, La/d58;

    .line 258
    .line 259
    if-eqz p1, :cond_1e

    .line 260
    .line 261
    iget v0, p1, La/d58;->a:I

    .line 262
    .line 263
    iget-object p1, p1, La/d58;->b:Ljava/lang/CharSequence;

    .line 264
    .line 265
    packed-switch v0, :pswitch_data_1

    .line 266
    .line 267
    .line 268
    :pswitch_5
    const/16 v0, 0x8

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :pswitch_6
    move v0, v2

    .line 272
    :goto_5
    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 277
    .line 278
    const/16 v7, 0x1d

    .line 279
    .line 280
    if-ge v6, v7, :cond_14

    .line 281
    .line 282
    const/4 v6, 0x7

    .line 283
    if-eq v0, v6, :cond_12

    .line 284
    .line 285
    const/16 v6, 0x9

    .line 286
    .line 287
    if-ne v0, v6, :cond_14

    .line 288
    .line 289
    :cond_12
    if-eqz v5, :cond_14

    .line 290
    .line 291
    const-class v6, Landroid/app/KeyguardManager;

    .line 292
    .line 293
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    check-cast v5, Landroid/app/KeyguardManager;

    .line 298
    .line 299
    if-nez v5, :cond_13

    .line 300
    .line 301
    move v5, v3

    .line 302
    goto :goto_6

    .line 303
    :cond_13
    invoke-virtual {v5}, Landroid/app/KeyguardManager;->isDeviceSecure()Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    :goto_6
    if-eqz v5, :cond_14

    .line 308
    .line 309
    iget-object v5, p0, La/l58;->H1:La/t58;

    .line 310
    .line 311
    iget v5, v5, La/t58;->r:I

    .line 312
    .line 313
    invoke-static {v5}, La/hmw0;->Z(I)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-eqz v5, :cond_14

    .line 318
    .line 319
    invoke-virtual {p0}, La/l58;->C0()V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_b

    .line 323
    .line 324
    :cond_14
    invoke-virtual {p0}, La/l58;->B0()Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-eqz v5, :cond_1b

    .line 329
    .line 330
    if-eqz p1, :cond_15

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-static {v0, p1}, La/fxb;->C(ILandroid/content/Context;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    :goto_7
    iget-object v1, p0, La/l58;->H1:La/t58;

    .line 342
    .line 343
    const/4 v5, 0x5

    .line 344
    if-ne v0, v5, :cond_18

    .line 345
    .line 346
    iget-byte v1, v1, La/t58;->k:B

    .line 347
    .line 348
    if-eqz v1, :cond_16

    .line 349
    .line 350
    const/4 v2, 0x3

    .line 351
    if-ne v1, v2, :cond_17

    .line 352
    .line 353
    :cond_16
    invoke-virtual {p0, v0, p1}, La/l58;->E0(ILjava/lang/CharSequence;)V

    .line 354
    .line 355
    .line 356
    :cond_17
    invoke-virtual {p0}, La/l58;->y0()V

    .line 357
    .line 358
    .line 359
    goto :goto_b

    .line 360
    :cond_18
    iget-boolean v1, v1, La/t58;->y:Z

    .line 361
    .line 362
    if-eqz v1, :cond_19

    .line 363
    .line 364
    invoke-virtual {p0, v0, p1}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 365
    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_19
    invoke-virtual {p0, p1}, La/l58;->G0(Ljava/lang/CharSequence;)V

    .line 369
    .line 370
    .line 371
    iget-object v1, p0, La/l58;->I1:Landroid/os/Handler;

    .line 372
    .line 373
    new-instance v5, La/f58;

    .line 374
    .line 375
    invoke-direct {v5, p0, v0, p1, v3}, La/f58;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    if-eqz p1, :cond_1a

    .line 383
    .line 384
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 385
    .line 386
    invoke-static {p1}, La/gkb;->X(Landroid/content/Context;)Z

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    if-eqz p1, :cond_1a

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_1a
    const/16 v3, 0x7d0

    .line 394
    .line 395
    :goto_8
    int-to-long v6, v3

    .line 396
    invoke-virtual {v1, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 397
    .line 398
    .line 399
    :goto_9
    iget-object p1, p0, La/l58;->H1:La/t58;

    .line 400
    .line 401
    iput-boolean v2, p1, La/t58;->y:Z

    .line 402
    .line 403
    goto :goto_b

    .line 404
    :cond_1b
    if-eqz p1, :cond_1c

    .line 405
    .line 406
    goto :goto_a

    .line 407
    :cond_1c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    const-string v1, " "

    .line 420
    .line 421
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    :goto_a
    invoke-virtual {p0, v0, p1}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 432
    .line 433
    .line 434
    :goto_b
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 435
    .line 436
    iget-object p1, p0, La/t58;->t:La/hy40;

    .line 437
    .line 438
    if-nez p1, :cond_1d

    .line 439
    .line 440
    new-instance p1, La/hy40;

    .line 441
    .line 442
    invoke-direct {p1}, La/wh00;-><init>()V

    .line 443
    .line 444
    .line 445
    iput-object p1, p0, La/t58;->t:La/hy40;

    .line 446
    .line 447
    :cond_1d
    invoke-static {p1, v4}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    :cond_1e
    return-void

    .line 451
    :pswitch_8
    check-cast p1, La/p58;

    .line 452
    .line 453
    if-eqz p1, :cond_20

    .line 454
    .line 455
    invoke-virtual {p0, p1}, La/l58;->F0(La/p58;)V

    .line 456
    .line 457
    .line 458
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 459
    .line 460
    iget-object p1, p0, La/t58;->s:La/hy40;

    .line 461
    .line 462
    if-nez p1, :cond_1f

    .line 463
    .line 464
    new-instance p1, La/hy40;

    .line 465
    .line 466
    invoke-direct {p1}, La/wh00;-><init>()V

    .line 467
    .line 468
    .line 469
    iput-object p1, p0, La/t58;->s:La/hy40;

    .line 470
    .line 471
    :cond_1f
    invoke-static {p1, v4}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_20
    return-void

    .line 475
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method
