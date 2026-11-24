.class public final synthetic La/gho0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jho0;


# direct methods
.method public synthetic constructor <init>(La/jho0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gho0;->a:B

    iput-object p1, p0, La/gho0;->b:La/jho0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gho0;->a:B

    .line 4
    .line 5
    const-string v2, "menu_games"

    .line 6
    .line 7
    const-string v3, "menu_1xgames"

    .line 8
    .line 9
    const-string v4, "screen"

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x3

    .line 13
    const-string v8, "menu_top"

    .line 14
    .line 15
    const-string v9, "menu_other"

    .line 16
    .line 17
    const-string v10, "menu_sport"

    .line 18
    .line 19
    const-string v11, "menu_aggregator"

    .line 20
    .line 21
    const/4 v12, 0x1

    .line 22
    iget-object v0, v0, La/gho0;->b:La/jho0;

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    sget-object v1, La/jho0;->R1:La/y2m0;

    .line 28
    .line 29
    iget-object v0, v0, La/jho0;->M1:La/a8z;

    .line 30
    .line 31
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/cwi;

    .line 36
    .line 37
    iget-object v0, v0, La/cwi;->A:La/n5d0;

    .line 38
    .line 39
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/awi;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_0
    sget-object v1, La/jho0;->R1:La/y2m0;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    instance-of v2, v1, La/af3;

    .line 60
    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    check-cast v1, La/af3;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v1, 0x0

    .line 67
    :goto_0
    const-class v2, La/kho0;

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, La/o5d0;

    .line 80
    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, La/ze3;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    const/4 v1, 0x0

    .line 91
    :goto_1
    instance-of v3, v1, La/kho0;

    .line 92
    .line 93
    if-nez v3, :cond_2

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    :cond_2
    check-cast v1, La/kho0;

    .line 97
    .line 98
    if-eqz v1, :cond_3

    .line 99
    .line 100
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v3, v0, La/jho0;->O1:La/yzn0;

    .line 105
    .line 106
    sget-object v4, La/jho0;->S1:[La/iiy;

    .line 107
    .line 108
    aget-object v4, v4, v12

    .line 109
    .line 110
    invoke-virtual {v3, v0, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/r040;

    .line 115
    .line 116
    invoke-virtual {v1, v2, v0}, La/kho0;->a(La/i1w0;La/r040;)La/cwi;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    goto :goto_2

    .line 121
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 122
    .line 123
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    :goto_2
    return-object v13

    .line 132
    :pswitch_1
    sget-object v1, La/jho0;->R1:La/y2m0;

    .line 133
    .line 134
    invoke-virtual {v0}, La/jho0;->H0()La/rio0;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-object v1, v0, La/rio0;->W:La/tzi;

    .line 139
    .line 140
    invoke-virtual {v0}, La/rio0;->z()La/r040;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v0}, La/cww;->O(La/r040;)La/wv10;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v1, v0}, La/tzi;->t(La/wv10;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_2
    sget-object v1, La/jho0;->R1:La/y2m0;

    .line 155
    .line 156
    invoke-virtual {v0}, La/jho0;->H0()La/rio0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-object v1, v0, La/rio0;->W:La/tzi;

    .line 161
    .line 162
    invoke-virtual {v0}, La/rio0;->z()La/r040;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    invoke-static {v14}, La/cww;->O(La/r040;)La/wv10;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    iget-object v0, v0, La/rio0;->V:La/cmt;

    .line 171
    .line 172
    invoke-virtual {v0}, La/cmt;->g()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v15, v1, La/tzi;->i:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v15, La/ih5;

    .line 182
    .line 183
    iget-object v15, v15, La/ih5;->a:La/kt2;

    .line 184
    .line 185
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    const-string v7, "deposit_call"

    .line 190
    .line 191
    if-eqz v13, :cond_9

    .line 192
    .line 193
    if-eq v13, v12, :cond_4

    .line 194
    .line 195
    if-eq v13, v5, :cond_8

    .line 196
    .line 197
    if-eq v13, v6, :cond_7

    .line 198
    .line 199
    const/4 v3, 0x4

    .line 200
    if-eq v13, v3, :cond_6

    .line 201
    .line 202
    const/4 v3, 0x5

    .line 203
    if-ne v13, v3, :cond_5

    .line 204
    .line 205
    :cond_4
    invoke-static {v4, v11, v15, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 210
    .line 211
    .line 212
    :goto_3
    const/4 v13, 0x0

    .line 213
    goto :goto_6

    .line 214
    :cond_6
    invoke-static {v4, v8, v15, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_7
    invoke-static {v4, v9, v15, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_8
    invoke-static {v4, v3, v15, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_9
    invoke-static {v4, v10, v15, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :goto_4
    iget-object v1, v1, La/tzi;->f:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, La/l7k;

    .line 232
    .line 233
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-eqz v3, :cond_f

    .line 238
    .line 239
    if-eq v3, v12, :cond_e

    .line 240
    .line 241
    if-eq v3, v5, :cond_d

    .line 242
    .line 243
    if-eq v3, v6, :cond_c

    .line 244
    .line 245
    const/4 v2, 0x4

    .line 246
    if-eq v3, v2, :cond_b

    .line 247
    .line 248
    const/4 v2, 0x5

    .line 249
    if-ne v3, v2, :cond_a

    .line 250
    .line 251
    const-string v2, ""

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_b
    sget-object v2, La/y1p;->b:La/y1p;

    .line 259
    .line 260
    move-object v2, v8

    .line 261
    goto :goto_5

    .line 262
    :cond_c
    sget-object v2, La/y1p;->b:La/y1p;

    .line 263
    .line 264
    move-object v2, v9

    .line 265
    goto :goto_5

    .line 266
    :cond_d
    sget-object v3, La/y1p;->b:La/y1p;

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_e
    sget-object v2, La/y1p;->b:La/y1p;

    .line 270
    .line 271
    move-object v2, v11

    .line 272
    goto :goto_5

    .line 273
    :cond_f
    sget-object v2, La/y1p;->b:La/y1p;

    .line 274
    .line 275
    move-object v2, v10

    .line 276
    :goto_5
    invoke-virtual {v1, v2, v0}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    :goto_6
    return-object v13

    .line 282
    :pswitch_3
    sget-object v1, La/jho0;->R1:La/y2m0;

    .line 283
    .line 284
    invoke-virtual {v0}, La/jho0;->H0()La/rio0;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget-object v1, v0, La/rio0;->W:La/tzi;

    .line 289
    .line 290
    invoke-virtual {v0}, La/rio0;->z()La/r040;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {v0}, La/cww;->O(La/r040;)La/wv10;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget-object v7, v1, La/tzi;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v7, La/s64;

    .line 304
    .line 305
    iget-object v1, v1, La/tzi;->h:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v1, La/ag3;

    .line 308
    .line 309
    iget-object v1, v1, La/ag3;->a:La/kt2;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    const-string v13, "login_page_call"

    .line 316
    .line 317
    if-eqz v0, :cond_14

    .line 318
    .line 319
    if-eq v0, v12, :cond_13

    .line 320
    .line 321
    if-eq v0, v5, :cond_12

    .line 322
    .line 323
    if-eq v0, v6, :cond_11

    .line 324
    .line 325
    const/4 v2, 0x4

    .line 326
    if-eq v0, v2, :cond_10

    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_10
    invoke-static {v4, v8, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    sget-object v0, La/y1p;->b:La/y1p;

    .line 333
    .line 334
    invoke-virtual {v7, v8}, La/s64;->c(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_11
    invoke-static {v4, v9, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, La/y1p;->b:La/y1p;

    .line 342
    .line 343
    invoke-virtual {v7, v9}, La/s64;->c(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_12
    invoke-static {v4, v3, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    sget-object v0, La/y1p;->b:La/y1p;

    .line 351
    .line 352
    invoke-virtual {v7, v2}, La/s64;->c(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_13
    invoke-static {v4, v11, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    sget-object v0, La/y1p;->b:La/y1p;

    .line 360
    .line 361
    invoke-virtual {v7, v11}, La/s64;->c(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_7

    .line 365
    :cond_14
    invoke-static {v4, v10, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    sget-object v0, La/y1p;->b:La/y1p;

    .line 369
    .line 370
    invoke-virtual {v7, v10}, La/s64;->c(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object v0

    .line 376
    :pswitch_4
    sget-object v1, La/jho0;->R1:La/y2m0;

    .line 377
    .line 378
    invoke-virtual {v0}, La/jho0;->H0()La/rio0;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    iget-object v1, v0, La/rio0;->W:La/tzi;

    .line 383
    .line 384
    invoke-virtual {v0}, La/rio0;->z()La/r040;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-static {v2}, La/cww;->O(La/r040;)La/wv10;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    iget-object v0, v0, La/rio0;->V:La/cmt;

    .line 393
    .line 394
    invoke-virtual {v0}, La/cmt;->g()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    iget-object v7, v1, La/tzi;->b:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v7, La/s64;

    .line 404
    .line 405
    iget-object v1, v1, La/tzi;->h:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v1, La/ag3;

    .line 408
    .line 409
    iget-object v1, v1, La/ag3;->a:La/kt2;

    .line 410
    .line 411
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    const-string v13, "reg_page_call"

    .line 416
    .line 417
    if-eqz v2, :cond_19

    .line 418
    .line 419
    if-eq v2, v12, :cond_18

    .line 420
    .line 421
    if-eq v2, v5, :cond_17

    .line 422
    .line 423
    if-eq v2, v6, :cond_16

    .line 424
    .line 425
    const/4 v3, 0x4

    .line 426
    if-eq v2, v3, :cond_15

    .line 427
    .line 428
    goto :goto_8

    .line 429
    :cond_15
    invoke-static {v4, v8, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    sget-object v1, La/y1p;->w:La/y1p;

    .line 433
    .line 434
    invoke-virtual {v7, v1, v0}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_16
    invoke-static {v4, v9, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    sget-object v1, La/y1p;->z:La/y1p;

    .line 442
    .line 443
    invoke-virtual {v7, v1, v0}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    goto :goto_8

    .line 447
    :cond_17
    invoke-static {v4, v3, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    sget-object v1, La/y1p;->d:La/y1p;

    .line 451
    .line 452
    invoke-virtual {v7, v1, v0}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    goto :goto_8

    .line 456
    :cond_18
    invoke-static {v4, v11, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    sget-object v1, La/y1p;->y:La/y1p;

    .line 460
    .line 461
    invoke-virtual {v7, v1, v0}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    goto :goto_8

    .line 465
    :cond_19
    invoke-static {v4, v10, v1, v13}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    sget-object v1, La/y1p;->x:La/y1p;

    .line 469
    .line 470
    invoke-virtual {v7, v1, v0}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_5
    sget-object v1, La/jho0;->R1:La/y2m0;

    .line 477
    .line 478
    invoke-virtual {v0}, La/jho0;->H0()La/rio0;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v0}, La/rio0;->B()V

    .line 483
    .line 484
    .line 485
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 486
    .line 487
    return-object v0

    .line 488
    nop

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
