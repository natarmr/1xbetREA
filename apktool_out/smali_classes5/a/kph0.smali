.class public final synthetic La/kph0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oph0;


# direct methods
.method public synthetic constructor <init>(La/oph0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kph0;->a:B

    iput-object p1, p0, La/kph0;->b:La/oph0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kph0;->a:B

    .line 4
    .line 5
    const-string v2, "acc_safety"

    .line 6
    .line 7
    const-wide/16 v3, 0xc9f

    .line 8
    .line 9
    const/16 v5, 0x15

    .line 10
    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x1

    .line 15
    const/4 v10, 0x0

    .line 16
    iget-object v11, v0, La/kph0;->b:La/oph0;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 22
    .line 23
    new-instance v0, La/xnh0;

    .line 24
    .line 25
    new-instance v1, La/gwg0;

    .line 26
    .line 27
    const/16 v2, 0xf

    .line 28
    .line 29
    invoke-direct {v1, v11, v2}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v3, La/ek5;->h:La/ek5;

    .line 33
    .line 34
    invoke-direct {v0, v3}, La/qv5;-><init>(La/dtb;)V

    .line 35
    .line 36
    .line 37
    new-instance v3, La/x0h0;

    .line 38
    .line 39
    const/16 v4, 0x12

    .line 40
    .line 41
    invoke-direct {v3, v4}, La/x0h0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    new-instance v4, La/eoh0;

    .line 45
    .line 46
    invoke-direct {v4, v8}, La/eoh0;-><init>(B)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/o5c0;

    .line 50
    .line 51
    const/16 v11, 0x1b

    .line 52
    .line 53
    const/4 v12, 0x3

    .line 54
    invoke-direct {v7, v12, v11}, La/o5c0;-><init>(IB)V

    .line 55
    .line 56
    .line 57
    sget-object v11, La/ynh0;->d:La/ynh0;

    .line 58
    .line 59
    new-instance v13, La/gbn;

    .line 60
    .line 61
    invoke-direct {v13, v3, v7, v4, v11}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 62
    .line 63
    .line 64
    iget-object v3, v0, La/zz3;->d:La/dp;

    .line 65
    .line 66
    invoke-virtual {v3, v13}, La/dp;->b(La/gbn;)V

    .line 67
    .line 68
    .line 69
    new-instance v4, La/x0h0;

    .line 70
    .line 71
    const/16 v7, 0x13

    .line 72
    .line 73
    invoke-direct {v4, v7}, La/x0h0;-><init>(B)V

    .line 74
    .line 75
    .line 76
    new-instance v7, La/eoh0;

    .line 77
    .line 78
    invoke-direct {v7, v12}, La/eoh0;-><init>(B)V

    .line 79
    .line 80
    .line 81
    new-instance v11, La/o5c0;

    .line 82
    .line 83
    const/16 v13, 0x1c

    .line 84
    .line 85
    invoke-direct {v11, v12, v13}, La/o5c0;-><init>(IB)V

    .line 86
    .line 87
    .line 88
    sget-object v13, La/ynh0;->e:La/ynh0;

    .line 89
    .line 90
    new-instance v14, La/gbn;

    .line 91
    .line 92
    invoke-direct {v14, v4, v11, v7, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v14}, La/dp;->b(La/gbn;)V

    .line 96
    .line 97
    .line 98
    new-instance v4, La/x0h0;

    .line 99
    .line 100
    const/16 v7, 0x17

    .line 101
    .line 102
    invoke-direct {v4, v7}, La/x0h0;-><init>(B)V

    .line 103
    .line 104
    .line 105
    new-instance v7, La/lth0;

    .line 106
    .line 107
    invoke-direct {v7, v1, v10}, La/lth0;-><init>(La/gwg0;B)V

    .line 108
    .line 109
    .line 110
    new-instance v11, La/gsh0;

    .line 111
    .line 112
    invoke-direct {v11, v12, v8}, La/gsh0;-><init>(IB)V

    .line 113
    .line 114
    .line 115
    sget-object v8, La/ynh0;->i:La/ynh0;

    .line 116
    .line 117
    new-instance v13, La/gbn;

    .line 118
    .line 119
    invoke-direct {v13, v4, v11, v7, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v13}, La/dp;->b(La/gbn;)V

    .line 123
    .line 124
    .line 125
    new-instance v4, La/x0h0;

    .line 126
    .line 127
    const/16 v7, 0x18

    .line 128
    .line 129
    invoke-direct {v4, v7}, La/x0h0;-><init>(B)V

    .line 130
    .line 131
    .line 132
    new-instance v7, La/lth0;

    .line 133
    .line 134
    invoke-direct {v7, v1, v9}, La/lth0;-><init>(La/gwg0;B)V

    .line 135
    .line 136
    .line 137
    new-instance v1, La/gsh0;

    .line 138
    .line 139
    invoke-direct {v1, v12, v12}, La/gsh0;-><init>(IB)V

    .line 140
    .line 141
    .line 142
    sget-object v8, La/ynh0;->j:La/ynh0;

    .line 143
    .line 144
    new-instance v11, La/gbn;

    .line 145
    .line 146
    invoke-direct {v11, v4, v1, v7, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v11}, La/dp;->b(La/gbn;)V

    .line 150
    .line 151
    .line 152
    new-instance v1, La/x0h0;

    .line 153
    .line 154
    const/16 v4, 0x16

    .line 155
    .line 156
    invoke-direct {v1, v4}, La/x0h0;-><init>(B)V

    .line 157
    .line 158
    .line 159
    new-instance v4, La/eoh0;

    .line 160
    .line 161
    const/4 v7, 0x6

    .line 162
    invoke-direct {v4, v7}, La/eoh0;-><init>(B)V

    .line 163
    .line 164
    .line 165
    new-instance v7, La/gsh0;

    .line 166
    .line 167
    invoke-direct {v7, v12, v9}, La/gsh0;-><init>(IB)V

    .line 168
    .line 169
    .line 170
    sget-object v8, La/ynh0;->h:La/ynh0;

    .line 171
    .line 172
    new-instance v11, La/gbn;

    .line 173
    .line 174
    invoke-direct {v11, v1, v7, v4, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v11}, La/dp;->b(La/gbn;)V

    .line 178
    .line 179
    .line 180
    new-instance v1, La/x0h0;

    .line 181
    .line 182
    const/16 v4, 0x14

    .line 183
    .line 184
    invoke-direct {v1, v4}, La/x0h0;-><init>(B)V

    .line 185
    .line 186
    .line 187
    new-instance v4, La/eoh0;

    .line 188
    .line 189
    invoke-direct {v4, v6}, La/eoh0;-><init>(B)V

    .line 190
    .line 191
    .line 192
    new-instance v6, La/o5c0;

    .line 193
    .line 194
    const/16 v7, 0x1d

    .line 195
    .line 196
    invoke-direct {v6, v12, v7}, La/o5c0;-><init>(IB)V

    .line 197
    .line 198
    .line 199
    sget-object v8, La/ynh0;->f:La/ynh0;

    .line 200
    .line 201
    new-instance v11, La/gbn;

    .line 202
    .line 203
    invoke-direct {v11, v1, v6, v4, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v11}, La/dp;->b(La/gbn;)V

    .line 207
    .line 208
    .line 209
    new-instance v1, La/x0h0;

    .line 210
    .line 211
    const/16 v4, 0x11

    .line 212
    .line 213
    invoke-direct {v1, v4}, La/x0h0;-><init>(B)V

    .line 214
    .line 215
    .line 216
    new-instance v4, La/eoh0;

    .line 217
    .line 218
    invoke-direct {v4, v9}, La/eoh0;-><init>(B)V

    .line 219
    .line 220
    .line 221
    new-instance v6, La/o5c0;

    .line 222
    .line 223
    const/16 v8, 0x1a

    .line 224
    .line 225
    invoke-direct {v6, v12, v8}, La/o5c0;-><init>(IB)V

    .line 226
    .line 227
    .line 228
    sget-object v8, La/ynh0;->c:La/ynh0;

    .line 229
    .line 230
    new-instance v9, La/gbn;

    .line 231
    .line 232
    invoke-direct {v9, v1, v6, v4, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, v9}, La/dp;->b(La/gbn;)V

    .line 236
    .line 237
    .line 238
    new-instance v1, La/x0h0;

    .line 239
    .line 240
    invoke-direct {v1, v2}, La/x0h0;-><init>(B)V

    .line 241
    .line 242
    .line 243
    new-instance v2, La/w0h0;

    .line 244
    .line 245
    invoke-direct {v2, v7}, La/w0h0;-><init>(B)V

    .line 246
    .line 247
    .line 248
    new-instance v4, La/o5c0;

    .line 249
    .line 250
    const/16 v6, 0x19

    .line 251
    .line 252
    invoke-direct {v4, v12, v6}, La/o5c0;-><init>(IB)V

    .line 253
    .line 254
    .line 255
    sget-object v6, La/ynh0;->b:La/ynh0;

    .line 256
    .line 257
    new-instance v7, La/gbn;

    .line 258
    .line 259
    invoke-direct {v7, v1, v4, v2, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, v7}, La/dp;->b(La/gbn;)V

    .line 263
    .line 264
    .line 265
    new-instance v1, La/x0h0;

    .line 266
    .line 267
    invoke-direct {v1, v5}, La/x0h0;-><init>(B)V

    .line 268
    .line 269
    .line 270
    new-instance v2, La/eoh0;

    .line 271
    .line 272
    const/4 v4, 0x5

    .line 273
    invoke-direct {v2, v4}, La/eoh0;-><init>(B)V

    .line 274
    .line 275
    .line 276
    new-instance v4, La/gsh0;

    .line 277
    .line 278
    invoke-direct {v4, v12, v10}, La/gsh0;-><init>(IB)V

    .line 279
    .line 280
    .line 281
    sget-object v5, La/ynh0;->g:La/ynh0;

    .line 282
    .line 283
    new-instance v6, La/gbn;

    .line 284
    .line 285
    invoke-direct {v6, v1, v4, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v6}, La/dp;->b(La/gbn;)V

    .line 289
    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_0
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 293
    .line 294
    invoke-virtual {v11}, La/oph0;->G0()La/zsi;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iget-object v0, v0, La/zsi;->k:La/n5d0;

    .line 299
    .line 300
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    check-cast v0, La/xsi;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_1
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 308
    .line 309
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    instance-of v1, v0, La/af3;

    .line 321
    .line 322
    if-eqz v1, :cond_0

    .line 323
    .line 324
    check-cast v0, La/af3;

    .line 325
    .line 326
    goto :goto_0

    .line 327
    :cond_0
    move-object v0, v7

    .line 328
    :goto_0
    const-class v1, La/pph0;

    .line 329
    .line 330
    if-eqz v0, :cond_3

    .line 331
    .line 332
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v0, La/o5d0;

    .line 341
    .line 342
    if-eqz v0, :cond_1

    .line 343
    .line 344
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    check-cast v0, La/ze3;

    .line 349
    .line 350
    goto :goto_1

    .line 351
    :cond_1
    move-object v0, v7

    .line 352
    :goto_1
    instance-of v2, v0, La/pph0;

    .line 353
    .line 354
    if-nez v2, :cond_2

    .line 355
    .line 356
    move-object v0, v7

    .line 357
    :cond_2
    check-cast v0, La/pph0;

    .line 358
    .line 359
    if-eqz v0, :cond_3

    .line 360
    .line 361
    invoke-static {v11}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v0, v1}, La/pph0;->a(La/i1w0;)La/zsi;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    goto :goto_2

    .line 370
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 371
    .line 372
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :goto_2
    return-object v7

    .line 380
    :pswitch_2
    sget-object v1, La/oph0;->Q1:La/gle0;

    .line 381
    .line 382
    iget-object v2, v0, La/kph0;->b:La/oph0;

    .line 383
    .line 384
    invoke-virtual {v2}, La/oph0;->I0()La/zuh0;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    iget-object v1, v0, La/zuh0;->b:La/qu;

    .line 389
    .line 390
    sget-object v3, La/pu;->b:La/pu;

    .line 391
    .line 392
    invoke-virtual {v1, v3}, La/qu;->e(La/pu;)V

    .line 393
    .line 394
    .line 395
    iget-object v0, v0, La/zuh0;->B:La/ik4;

    .line 396
    .line 397
    sget-object v1, La/r54;->b:La/r54;

    .line 398
    .line 399
    invoke-virtual {v0, v1}, La/ik4;->b(La/r54;)V

    .line 400
    .line 401
    .line 402
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 403
    .line 404
    if-eqz v0, :cond_5

    .line 405
    .line 406
    const-string v1, "RESET_AUTHENTICATOR_SECRET_HASH_KEY"

    .line 407
    .line 408
    const-string v3, ""

    .line 409
    .line 410
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    if-nez v4, :cond_4

    .line 415
    .line 416
    goto :goto_3

    .line 417
    :cond_4
    invoke-virtual {v2}, La/oph0;->G0()La/zsi;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {v0}, La/zsi;->b()La/wdk0;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    const v0, 0x7f13157c

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    const v0, 0x7f080467

    .line 436
    .line 437
    .line 438
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v8

    .line 442
    invoke-virtual {v2}, La/oph0;->H0()La/n4r;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    iget-object v9, v0, La/n4r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 447
    .line 448
    const/16 v10, 0x10

    .line 449
    .line 450
    const/4 v7, 0x0

    .line 451
    move-object v5, v4

    .line 452
    invoke-static/range {v2 .. v10}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 453
    .line 454
    .line 455
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    goto :goto_4

    .line 458
    :cond_5
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    :goto_4
    return-object v0

    .line 461
    :pswitch_3
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 462
    .line 463
    invoke-virtual {v11}, La/oph0;->I0()La/zuh0;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    iget-object v1, v0, La/zuh0;->b:La/qu;

    .line 468
    .line 469
    sget-object v2, La/pu;->c:La/pu;

    .line 470
    .line 471
    invoke-virtual {v1, v2}, La/qu;->e(La/pu;)V

    .line 472
    .line 473
    .line 474
    iget-object v0, v0, La/zuh0;->B:La/ik4;

    .line 475
    .line 476
    sget-object v1, La/r54;->c:La/r54;

    .line 477
    .line 478
    invoke-virtual {v0, v1}, La/ik4;->b(La/r54;)V

    .line 479
    .line 480
    .line 481
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_4
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 485
    .line 486
    invoke-virtual {v11}, La/oph0;->I0()La/zuh0;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    iget-object v1, v0, La/zuh0;->m:La/vd1;

    .line 491
    .line 492
    invoke-virtual {v1}, La/vd1;->c()V

    .line 493
    .line 494
    .line 495
    iget-object v1, v0, La/zuh0;->D:La/ik4;

    .line 496
    .line 497
    iget-object v1, v1, La/ik4;->a:La/s1p;

    .line 498
    .line 499
    new-instance v5, La/j1p;

    .line 500
    .line 501
    invoke-direct {v5, v2, v10}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 502
    .line 503
    .line 504
    new-instance v2, La/j1p;

    .line 505
    .line 506
    const-string v6, "allert_add_phone"

    .line 507
    .line 508
    invoke-direct {v2, v6, v9}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 509
    .line 510
    .line 511
    new-array v6, v8, [La/k1p;

    .line 512
    .line 513
    aput-object v5, v6, v10

    .line 514
    .line 515
    aput-object v2, v6, v9

    .line 516
    .line 517
    invoke-static {v6}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v1, v2, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 522
    .line 523
    .line 524
    iget-object v1, v0, La/zuh0;->z:La/i1w0;

    .line 525
    .line 526
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    iget-object v0, v0, La/zuh0;->y:La/qgd;

    .line 531
    .line 532
    invoke-virtual {v0}, La/qgd;->g()Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 537
    .line 538
    if-eqz v3, :cond_6

    .line 539
    .line 540
    new-instance v3, La/e1w0;

    .line 541
    .line 542
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 543
    .line 544
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 545
    .line 546
    .line 547
    new-instance v0, La/c8d;

    .line 548
    .line 549
    sget-object v4, La/y7d;->a:La/v7d;

    .line 550
    .line 551
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    goto :goto_5

    .line 558
    :cond_6
    new-instance v3, La/w0w0;

    .line 559
    .line 560
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 561
    .line 562
    .line 563
    new-instance v0, La/c8d;

    .line 564
    .line 565
    sget-object v4, La/y7d;->a:La/v7d;

    .line 566
    .line 567
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    :goto_5
    invoke-static {v1, v2, v10}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    :goto_6
    move-object v2, v0

    .line 578
    check-cast v2, La/paw;

    .line 579
    .line 580
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    if-eqz v3, :cond_7

    .line 585
    .line 586
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    check-cast v2, La/oe50;

    .line 591
    .line 592
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 593
    .line 594
    .line 595
    goto :goto_6

    .line 596
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_5
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 600
    .line 601
    invoke-virtual {v11}, La/oph0;->I0()La/zuh0;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    iget-object v1, v0, La/zuh0;->z:La/i1w0;

    .line 606
    .line 607
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    iget-object v0, v0, La/zuh0;->v:La/jh70;

    .line 612
    .line 613
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    new-instance v0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoListScreen$1;

    .line 617
    .line 618
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 622
    .line 623
    .line 624
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 625
    .line 626
    invoke-static {v1, v0, v10}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    :goto_7
    move-object v2, v0

    .line 631
    check-cast v2, La/paw;

    .line 632
    .line 633
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    if-eqz v3, :cond_8

    .line 638
    .line 639
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    check-cast v2, La/oe50;

    .line 644
    .line 645
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 646
    .line 647
    .line 648
    goto :goto_7

    .line 649
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 650
    .line 651
    return-object v0

    .line 652
    :pswitch_6
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 653
    .line 654
    invoke-virtual {v11}, La/oph0;->I0()La/zuh0;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v0}, La/zuh0;->y()V

    .line 659
    .line 660
    .line 661
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 662
    .line 663
    return-object v0

    .line 664
    :pswitch_7
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 665
    .line 666
    invoke-virtual {v11}, La/oph0;->I0()La/zuh0;

    .line 667
    .line 668
    .line 669
    move-result-object v14

    .line 670
    iget-object v0, v14, La/zuh0;->L:La/bby;

    .line 671
    .line 672
    if-eqz v0, :cond_9

    .line 673
    .line 674
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    if-ne v0, v9, :cond_9

    .line 679
    .line 680
    goto :goto_8

    .line 681
    :cond_9
    iget-object v0, v14, La/zuh0;->F:La/p7m0;

    .line 682
    .line 683
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    new-instance v9, La/jjh0;

    .line 696
    .line 697
    const/16 v18, 0x0

    .line 698
    .line 699
    const/16 v19, 0x1b

    .line 700
    .line 701
    const/4 v13, 0x1

    .line 702
    const-class v15, La/zuh0;

    .line 703
    .line 704
    const-string v16, "onError"

    .line 705
    .line 706
    const-string v17, "onError(Ljava/lang/Throwable;)V"

    .line 707
    .line 708
    move-object v12, v9

    .line 709
    invoke-direct/range {v12 .. v19}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 710
    .line 711
    .line 712
    iget-object v0, v14, La/zuh0;->q:La/mne;

    .line 713
    .line 714
    iget-object v11, v0, La/mne;->a:La/rwj;

    .line 715
    .line 716
    new-instance v12, La/xuh0;

    .line 717
    .line 718
    invoke-direct {v12, v14, v7, v6}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 719
    .line 720
    .line 721
    const/16 v13, 0xa

    .line 722
    .line 723
    const/4 v10, 0x0

    .line 724
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    iput-object v0, v14, La/zuh0;->L:La/bby;

    .line 729
    .line 730
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_8
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 734
    .line 735
    invoke-virtual {v11}, La/oph0;->I0()La/zuh0;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    iget-object v0, v0, La/zuh0;->z:La/i1w0;

    .line 740
    .line 741
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    new-instance v2, La/c8d;

    .line 746
    .line 747
    sget-object v3, La/y7d;->a:La/v7d;

    .line 748
    .line 749
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 750
    .line 751
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 752
    .line 753
    .line 754
    invoke-static {v1, v2, v0, v1, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    :goto_9
    move-object v2, v1

    .line 759
    check-cast v2, La/paw;

    .line 760
    .line 761
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 762
    .line 763
    .line 764
    move-result v3

    .line 765
    if-eqz v3, :cond_a

    .line 766
    .line 767
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    check-cast v2, La/oe50;

    .line 772
    .line 773
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 774
    .line 775
    .line 776
    goto :goto_9

    .line 777
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 778
    .line 779
    return-object v0

    .line 780
    :pswitch_9
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 781
    .line 782
    invoke-virtual {v11}, La/oph0;->I0()La/zuh0;

    .line 783
    .line 784
    .line 785
    move-result-object v14

    .line 786
    iget-object v0, v14, La/zuh0;->m:La/vd1;

    .line 787
    .line 788
    iget-object v0, v0, La/vd1;->a:La/kt2;

    .line 789
    .line 790
    new-instance v1, Lkotlin/Pair;

    .line 791
    .line 792
    const-string v5, "screen"

    .line 793
    .line 794
    invoke-direct {v1, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    new-instance v5, Lkotlin/Pair;

    .line 798
    .line 799
    const-string v6, "element"

    .line 800
    .line 801
    const-string v11, "allert_activate_phone"

    .line 802
    .line 803
    invoke-direct {v5, v6, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    filled-new-array {v1, v5}, [Lkotlin/Pair;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    invoke-static {v1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    const-string v5, "acc_add_phone_call"

    .line 815
    .line 816
    invoke-interface {v0, v5, v1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 817
    .line 818
    .line 819
    iget-object v0, v14, La/zuh0;->D:La/ik4;

    .line 820
    .line 821
    iget-object v0, v0, La/ik4;->a:La/s1p;

    .line 822
    .line 823
    new-instance v1, La/j1p;

    .line 824
    .line 825
    invoke-direct {v1, v2, v10}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 826
    .line 827
    .line 828
    new-instance v2, La/j1p;

    .line 829
    .line 830
    invoke-direct {v2, v11, v9}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 831
    .line 832
    .line 833
    new-array v5, v8, [La/k1p;

    .line 834
    .line 835
    aput-object v1, v5, v10

    .line 836
    .line 837
    aput-object v2, v5, v9

    .line 838
    .line 839
    invoke-static {v5}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    invoke-virtual {v0, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 844
    .line 845
    .line 846
    iget-object v0, v14, La/zuh0;->F:La/p7m0;

    .line 847
    .line 848
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 849
    .line 850
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    iget-object v1, v14, La/zuh0;->q:La/mne;

    .line 861
    .line 862
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 863
    .line 864
    new-instance v16, La/jjh0;

    .line 865
    .line 866
    const/16 v18, 0x0

    .line 867
    .line 868
    const/16 v19, 0x18

    .line 869
    .line 870
    const/4 v13, 0x1

    .line 871
    const-class v15, La/zuh0;

    .line 872
    .line 873
    move-object/from16 v12, v16

    .line 874
    .line 875
    const-string v16, "onError"

    .line 876
    .line 877
    const-string v17, "onError(Ljava/lang/Throwable;)V"

    .line 878
    .line 879
    invoke-direct/range {v12 .. v19}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 880
    .line 881
    .line 882
    new-instance v2, La/xuh0;

    .line 883
    .line 884
    invoke-direct {v2, v14, v7, v9}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 885
    .line 886
    .line 887
    const/16 v20, 0xa

    .line 888
    .line 889
    const/16 v17, 0x0

    .line 890
    .line 891
    move-object v15, v0

    .line 892
    move-object/from16 v18, v1

    .line 893
    .line 894
    move-object/from16 v19, v2

    .line 895
    .line 896
    move-object/from16 v16, v12

    .line 897
    .line 898
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 899
    .line 900
    .line 901
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 902
    .line 903
    return-object v0

    .line 904
    :pswitch_a
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 905
    .line 906
    invoke-virtual {v11}, La/oph0;->I0()La/zuh0;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    new-instance v1, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 911
    .line 912
    sget-object v2, Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;->a:Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;

    .line 913
    .line 914
    invoke-direct {v1, v2, v10, v5}, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;-><init>(Lorg/xplatform/security/api/navigation/EndFlowNavigation;ZI)V

    .line 915
    .line 916
    .line 917
    iget-object v2, v0, La/zuh0;->z:La/i1w0;

    .line 918
    .line 919
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 920
    .line 921
    .line 922
    move-result-object v3

    .line 923
    iget-object v0, v0, La/zuh0;->A:La/sek;

    .line 924
    .line 925
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 926
    .line 927
    .line 928
    new-instance v0, Lorg/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1;

    .line 929
    .line 930
    invoke-direct {v0, v1}, Lorg/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1;-><init>(Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;)V

    .line 931
    .line 932
    .line 933
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 934
    .line 935
    if-eqz v1, :cond_b

    .line 936
    .line 937
    new-instance v1, La/e1w0;

    .line 938
    .line 939
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 940
    .line 941
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 942
    .line 943
    .line 944
    new-instance v0, La/c8d;

    .line 945
    .line 946
    sget-object v4, La/y7d;->a:La/v7d;

    .line 947
    .line 948
    invoke-direct {v0, v4, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    goto :goto_a

    .line 955
    :cond_b
    new-instance v1, La/w0w0;

    .line 956
    .line 957
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 958
    .line 959
    .line 960
    new-instance v0, La/c8d;

    .line 961
    .line 962
    sget-object v4, La/y7d;->a:La/v7d;

    .line 963
    .line 964
    invoke-direct {v0, v4, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    :goto_a
    invoke-static {v2, v3, v10}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    :goto_b
    move-object v1, v0

    .line 975
    check-cast v1, La/paw;

    .line 976
    .line 977
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 978
    .line 979
    .line 980
    move-result v3

    .line 981
    if-eqz v3, :cond_c

    .line 982
    .line 983
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    check-cast v1, La/oe50;

    .line 988
    .line 989
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 990
    .line 991
    .line 992
    goto :goto_b

    .line 993
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 994
    .line 995
    return-object v0

    .line 996
    nop

    .line 997
    :pswitch_data_0
    .packed-switch 0x0
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
