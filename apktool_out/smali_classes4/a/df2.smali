.class public final synthetic La/df2;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/df2;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/df2;->a:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p2, La/yje;

    .line 13
    .line 14
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    check-cast p2, La/yje;

    .line 25
    .line 26
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    check-cast p2, La/yje;

    .line 37
    .line 38
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_2
    check-cast p2, La/yje;

    .line 49
    .line 50
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_3
    check-cast p1, La/h7d;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, La/ii5;

    .line 67
    .line 68
    sget-object v0, La/ii5;->O1:La/gfk0;

    .line 69
    .line 70
    iget-object v0, p0, La/ii5;->N1:La/n0o0;

    .line 71
    .line 72
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/dm80;

    .line 77
    .line 78
    iget-object v5, p1, La/h7d;->c:La/mva;

    .line 79
    .line 80
    invoke-virtual {v0, v5}, La/q4;->F(La/mva;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p1, La/h7d;->c:La/mva;

    .line 84
    .line 85
    instance-of v5, v0, La/zo00;

    .line 86
    .line 87
    if-eqz v5, :cond_0

    .line 88
    .line 89
    check-cast v0, La/zo00;

    .line 90
    .line 91
    invoke-virtual {p0}, La/ii5;->J0()La/dk5;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    iget-object v0, v0, La/zo00;->b:Ljava/lang/Throwable;

    .line 96
    .line 97
    invoke-virtual {v5, v0}, La/dk5;->I(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    :cond_0
    iget-object p1, p1, La/h7d;->d:La/dp00;

    .line 101
    .line 102
    iget-object p1, p1, La/dp00;->a:La/mva;

    .line 103
    .line 104
    instance-of v0, p1, La/bp00;

    .line 105
    .line 106
    if-eqz v0, :cond_1

    .line 107
    .line 108
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object p1, p1, La/hyq;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 113
    .line 114
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object p1, p1, La/hyq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 122
    .line 123
    invoke-virtual {p1, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, La/ii5;->J0()La/dk5;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    iget-object p1, p0, La/dk5;->f0:La/p7m0;

    .line 131
    .line 132
    new-instance p2, La/rk5;

    .line 133
    .line 134
    iget-boolean p0, p0, La/dk5;->T:Z

    .line 135
    .line 136
    invoke-direct {p2, p0}, La/rk5;-><init>(Z)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v4, p2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    instance-of v0, p1, La/ap00;

    .line 147
    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-object p1, p1, La/hyq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 155
    .line 156
    invoke-virtual {p1, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, La/ii5;->J0()La/dk5;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    iput-boolean v3, p0, La/dk5;->R:Z

    .line 164
    .line 165
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    :goto_1
    move-object v4, p0

    .line 168
    goto :goto_2

    .line 169
    :cond_2
    instance-of v0, p1, La/zo00;

    .line 170
    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iget-object v0, v0, La/hyq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 178
    .line 179
    invoke-virtual {v0, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, La/ii5;->J0()La/dk5;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v1, v0, La/dk5;->f0:La/p7m0;

    .line 187
    .line 188
    new-instance v3, La/rk5;

    .line 189
    .line 190
    iget-boolean v0, v0, La/dk5;->T:Z

    .line 191
    .line 192
    invoke-direct {v3, v0}, La/rk5;-><init>(Z)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v4, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, La/ii5;->J0()La/dk5;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast p1, La/zo00;

    .line 206
    .line 207
    iget-object p1, p1, La/zo00;->b:Ljava/lang/Throwable;

    .line 208
    .line 209
    invoke-virtual {v0, p1}, La/dk5;->J(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, La/ii5;->I0()La/fk5;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    new-instance p1, La/fl80;

    .line 217
    .line 218
    new-instance v0, La/vh80;

    .line 219
    .line 220
    sget-object v1, La/iun;->a:La/iun;

    .line 221
    .line 222
    invoke-direct {v0, v1}, La/vh80;-><init>(Ljava/util/List;)V

    .line 223
    .line 224
    .line 225
    new-instance v1, La/eu4;

    .line 226
    .line 227
    invoke-direct {v1, v0, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 228
    .line 229
    .line 230
    new-instance v0, La/i280;

    .line 231
    .line 232
    invoke-direct {v0, v2}, La/i280;-><init>(B)V

    .line 233
    .line 234
    .line 235
    sget-object v2, La/fl80;->e:La/nh70;

    .line 236
    .line 237
    sget-object v3, La/fl80;->f:La/jh70;

    .line 238
    .line 239
    invoke-direct {p1, v1, v2, v3, v0}, La/fl80;-><init>(La/gmq;La/w6t0;La/zxv;Lkotlin/jvm/functions/Function0;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, p1, p2}, La/gl80;->D(La/fl80;La/yje;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    sget-object p1, La/wne;->a:La/wne;

    .line 247
    .line 248
    if-ne p0, p1, :cond_3

    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :goto_2
    sget-object p0, La/wne;->a:La/wne;

    .line 255
    .line 256
    if-ne v4, p0, :cond_4

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 263
    .line 264
    .line 265
    :goto_3
    return-object v4

    .line 266
    :pswitch_4
    check-cast p1, La/pk5;

    .line 267
    .line 268
    check-cast p2, La/yje;

    .line 269
    .line 270
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p0, La/ii5;

    .line 273
    .line 274
    sget-object v0, La/ii5;->O1:La/gfk0;

    .line 275
    .line 276
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    if-eqz p1, :cond_a

    .line 280
    .line 281
    instance-of v0, p1, La/mk5;

    .line 282
    .line 283
    if-eqz v0, :cond_7

    .line 284
    .line 285
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iget-object v0, v0, La/hyq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 290
    .line 291
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iget-object v0, v0, La/hyq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 299
    .line 300
    check-cast p1, La/mk5;

    .line 301
    .line 302
    iget-boolean v1, p1, La/mk5;->b:Z

    .line 303
    .line 304
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0}, La/ii5;->I0()La/fk5;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    iget-object p1, p1, La/mk5;->c:La/fl80;

    .line 312
    .line 313
    invoke-virtual {p0, p1, p2}, La/gl80;->D(La/fl80;La/yje;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    sget-object p1, La/wne;->a:La/wne;

    .line 318
    .line 319
    if-ne p0, p1, :cond_6

    .line 320
    .line 321
    :goto_4
    move-object v4, p0

    .line 322
    goto :goto_6

    .line 323
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    goto :goto_4

    .line 326
    :cond_7
    instance-of p2, p1, La/nk5;

    .line 327
    .line 328
    if-eqz p2, :cond_8

    .line 329
    .line 330
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    iget-object p2, p2, La/hyq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 335
    .line 336
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    iget-object p0, p0, La/hyq;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 344
    .line 345
    check-cast p1, La/nk5;

    .line 346
    .line 347
    iget-object p1, p1, La/nk5;->a:La/jkm;

    .line 348
    .line 349
    sget p2, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 350
    .line 351
    new-instance p2, La/bmh;

    .line 352
    .line 353
    invoke-direct {p2, v2}, La/bmh;-><init>(B)V

    .line 354
    .line 355
    .line 356
    const-wide/16 v0, 0x2710

    .line 357
    .line 358
    invoke-virtual {p0, p1, v0, v1, p2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 362
    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_8
    instance-of p1, p1, La/ok5;

    .line 366
    .line 367
    if-eqz p1, :cond_a

    .line 368
    .line 369
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    iget-object p1, p1, La/hyq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 374
    .line 375
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0}, La/ii5;->H0()La/hyq;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    iget-object p1, p1, La/hyq;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 383
    .line 384
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0}, La/ii5;->J0()La/dk5;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    iget-object p0, p0, La/dk5;->f0:La/p7m0;

    .line 392
    .line 393
    sget-object p1, La/qk5;->b:La/qk5;

    .line 394
    .line 395
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-virtual {p0, v4, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 402
    .line 403
    goto :goto_4

    .line 404
    :goto_6
    sget-object p0, La/wne;->a:La/wne;

    .line 405
    .line 406
    if-ne v4, p0, :cond_9

    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_9
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 413
    .line 414
    .line 415
    :goto_7
    return-object v4

    .line 416
    :pswitch_5
    check-cast p2, La/yje;

    .line 417
    .line 418
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 421
    .line 422
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    return-object p0

    .line 428
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 429
    .line 430
    check-cast p2, Ljava/lang/Boolean;

    .line 431
    .line 432
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast p0, La/fy4;

    .line 442
    .line 443
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    :try_start_0
    new-instance p2, Ljava/math/BigDecimal;

    .line 447
    .line 448
    invoke-direct {p2, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 449
    .line 450
    .line 451
    :goto_8
    move-object v5, p2

    .line 452
    goto :goto_9

    .line 453
    :catch_0
    new-instance p2, Ljava/math/BigDecimal;

    .line 454
    .line 455
    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    .line 456
    .line 457
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    invoke-direct {p2, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    goto :goto_8

    .line 465
    :goto_9
    iget-object v1, p0, La/fy4;->b0:La/p7m0;

    .line 466
    .line 467
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    move-object v4, p0

    .line 472
    check-cast v4, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 473
    .line 474
    iget-object p1, v4, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->e:Ljava/math/BigDecimal;

    .line 475
    .line 476
    invoke-virtual {v5, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 477
    .line 478
    .line 479
    move-result p1

    .line 480
    const/4 p2, 0x1

    .line 481
    if-lez p1, :cond_c

    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_c
    if-eqz v0, :cond_d

    .line 485
    .line 486
    :goto_a
    move v8, p2

    .line 487
    goto :goto_b

    .line 488
    :cond_d
    move v8, v3

    .line 489
    :goto_b
    iget-object p1, v4, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->d:Ljava/math/BigDecimal;

    .line 490
    .line 491
    invoke-virtual {v5, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 492
    .line 493
    .line 494
    move-result p1

    .line 495
    if-gez p1, :cond_e

    .line 496
    .line 497
    move v9, p2

    .line 498
    goto :goto_c

    .line 499
    :cond_e
    move v9, v3

    .line 500
    :goto_c
    const/4 v10, 0x0

    .line 501
    const/16 v11, 0x11e

    .line 502
    .line 503
    const/4 v6, 0x0

    .line 504
    const/4 v7, 0x1

    .line 505
    invoke-static/range {v4 .. v11}, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    invoke-virtual {v1, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result p0

    .line 513
    if-eqz p0, :cond_b

    .line 514
    .line 515
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 516
    .line 517
    return-object p0

    .line 518
    :pswitch_7
    check-cast p2, La/yje;

    .line 519
    .line 520
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 523
    .line 524
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object p0

    .line 530
    :pswitch_8
    check-cast p2, La/yje;

    .line 531
    .line 532
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 535
    .line 536
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object p0

    .line 542
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 543
    .line 544
    check-cast p2, La/uu4;

    .line 545
    .line 546
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast p0, La/im4;

    .line 555
    .line 556
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    instance-of v0, p1, La/k6a;

    .line 560
    .line 561
    if-eqz v0, :cond_f

    .line 562
    .line 563
    new-instance p1, La/om4;

    .line 564
    .line 565
    invoke-direct {p1, p2}, La/om4;-><init>(La/uu4;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    goto :goto_d

    .line 572
    :cond_f
    new-instance p2, La/nm4;

    .line 573
    .line 574
    invoke-direct {p2, p1}, La/nm4;-><init>(Ljava/lang/Throwable;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    :goto_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 581
    .line 582
    return-object p0

    .line 583
    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    .line 584
    .line 585
    check-cast p2, La/uu4;

    .line 586
    .line 587
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast p0, La/im4;

    .line 596
    .line 597
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    new-instance v0, La/jm4;

    .line 601
    .line 602
    invoke-direct {v0, p1, p2}, La/jm4;-><init>(Ljava/lang/Throwable;La/uu4;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 609
    .line 610
    return-object p0

    .line 611
    :pswitch_b
    check-cast p1, La/m2c0;

    .line 612
    .line 613
    check-cast p2, Ljava/lang/String;

    .line 614
    .line 615
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast p0, La/im4;

    .line 624
    .line 625
    invoke-virtual {p0, p1, p2}, La/im4;->k(La/m2c0;Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 629
    .line 630
    return-object p0

    .line 631
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 632
    .line 633
    check-cast p2, La/uu4;

    .line 634
    .line 635
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast p0, La/im4;

    .line 644
    .line 645
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    new-instance v0, La/jm4;

    .line 649
    .line 650
    invoke-direct {v0, p1, p2}, La/jm4;-><init>(Ljava/lang/Throwable;La/uu4;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 657
    .line 658
    return-object p0

    .line 659
    :pswitch_d
    check-cast p1, La/m2c0;

    .line 660
    .line 661
    check-cast p2, Ljava/lang/String;

    .line 662
    .line 663
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast p0, La/im4;

    .line 672
    .line 673
    invoke-virtual {p0, p1, p2}, La/im4;->k(La/m2c0;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 677
    .line 678
    return-object p0

    .line 679
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 680
    .line 681
    check-cast p2, La/uu4;

    .line 682
    .line 683
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast p0, La/im4;

    .line 692
    .line 693
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    new-instance v0, La/jm4;

    .line 697
    .line 698
    invoke-direct {v0, p1, p2}, La/jm4;-><init>(Ljava/lang/Throwable;La/uu4;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 705
    .line 706
    return-object p0

    .line 707
    :pswitch_f
    check-cast p1, La/m2c0;

    .line 708
    .line 709
    check-cast p2, Ljava/lang/String;

    .line 710
    .line 711
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast p0, La/im4;

    .line 720
    .line 721
    invoke-virtual {p0, p1, p2}, La/im4;->k(La/m2c0;Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 725
    .line 726
    return-object p0

    .line 727
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 728
    .line 729
    check-cast p2, La/uu4;

    .line 730
    .line 731
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast p0, La/im4;

    .line 740
    .line 741
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    new-instance v0, La/rm4;

    .line 745
    .line 746
    invoke-direct {v0, p1, p2}, La/rm4;-><init>(Ljava/lang/Throwable;La/uu4;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 753
    .line 754
    return-object p0

    .line 755
    :pswitch_11
    check-cast p1, Ljava/lang/Throwable;

    .line 756
    .line 757
    check-cast p2, La/uu4;

    .line 758
    .line 759
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast p0, La/im4;

    .line 768
    .line 769
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    new-instance v0, La/rm4;

    .line 773
    .line 774
    invoke-direct {v0, p1, p2}, La/rm4;-><init>(Ljava/lang/Throwable;La/uu4;)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 781
    .line 782
    return-object p0

    .line 783
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 784
    .line 785
    check-cast p2, La/uu4;

    .line 786
    .line 787
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast p0, La/im4;

    .line 796
    .line 797
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    new-instance v0, La/jm4;

    .line 801
    .line 802
    invoke-direct {v0, p1, p2}, La/jm4;-><init>(Ljava/lang/Throwable;La/uu4;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 809
    .line 810
    return-object p0

    .line 811
    :pswitch_13
    check-cast p1, La/m2c0;

    .line 812
    .line 813
    check-cast p2, Ljava/lang/String;

    .line 814
    .line 815
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast p0, La/im4;

    .line 824
    .line 825
    invoke-virtual {p0, p1, p2}, La/im4;->k(La/m2c0;Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 829
    .line 830
    return-object p0

    .line 831
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 832
    .line 833
    check-cast p2, La/uu4;

    .line 834
    .line 835
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast p0, La/im4;

    .line 844
    .line 845
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    instance-of v0, p1, La/k6a;

    .line 849
    .line 850
    if-eqz v0, :cond_10

    .line 851
    .line 852
    new-instance p1, La/om4;

    .line 853
    .line 854
    invoke-direct {p1, p2}, La/om4;-><init>(La/uu4;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    goto :goto_e

    .line 861
    :cond_10
    new-instance p2, La/nm4;

    .line 862
    .line 863
    invoke-direct {p2, p1}, La/nm4;-><init>(Ljava/lang/Throwable;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    :goto_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 870
    .line 871
    return-object p0

    .line 872
    :pswitch_15
    check-cast p2, La/yje;

    .line 873
    .line 874
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 877
    .line 878
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 882
    .line 883
    return-object p0

    .line 884
    :pswitch_16
    check-cast p2, La/yje;

    .line 885
    .line 886
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 889
    .line 890
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 894
    .line 895
    return-object p0

    .line 896
    :pswitch_17
    check-cast p2, La/yje;

    .line 897
    .line 898
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 901
    .line 902
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 906
    .line 907
    return-object p0

    .line 908
    :pswitch_18
    check-cast p2, La/yje;

    .line 909
    .line 910
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 913
    .line 914
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 918
    .line 919
    return-object p0

    .line 920
    :pswitch_19
    check-cast p2, La/yje;

    .line 921
    .line 922
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 925
    .line 926
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 930
    .line 931
    return-object p0

    .line 932
    :pswitch_1a
    check-cast p2, La/yje;

    .line 933
    .line 934
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 937
    .line 938
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 942
    .line 943
    return-object p0

    .line 944
    :pswitch_1b
    check-cast p2, La/yje;

    .line 945
    .line 946
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 949
    .line 950
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 954
    .line 955
    return-object p0

    .line 956
    :pswitch_1c
    check-cast p2, La/yje;

    .line 957
    .line 958
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 961
    .line 962
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 966
    .line 967
    return-object p0

    .line 968
    nop

    .line 969
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
