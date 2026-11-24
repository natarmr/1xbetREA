.class public final synthetic La/x6h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/x6h0;->a:B

    iput-object p1, p0, La/x6h0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/x6h0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x6h0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/f0k0;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/e0k0;

    .line 32
    .line 33
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La/faj;

    .line 46
    .line 47
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_2
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, La/d0k0;

    .line 60
    .line 61
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_3
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, La/xxj0;

    .line 70
    .line 71
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 74
    .line 75
    iget-object v2, v1, La/xxj0;->K:La/rpt;

    .line 76
    .line 77
    invoke-virtual {v2}, La/rpt;->g()La/cit0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget-object v2, v2, La/cit0;->e:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, La/m97;

    .line 88
    .line 89
    iget-object v1, v1, La/xxj0;->D:La/loi0;

    .line 90
    .line 91
    invoke-virtual {v1, v2}, La/loi0;->a(La/m97;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_4
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 103
    .line 104
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, La/kvj0;

    .line 107
    .line 108
    sget-object v3, La/kvj0;->S1:La/eke0;

    .line 109
    .line 110
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, La/kvj0;->M0()La/yxj0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, v0, La/yxj0;->U:La/bby;

    .line 118
    .line 119
    if-eqz v1, :cond_0

    .line 120
    .line 121
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-ne v1, v2, :cond_0

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {v0, v4}, La/yxj0;->C(Z)V

    .line 129
    .line 130
    .line 131
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_5
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 137
    .line 138
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, La/jvj0;

    .line 141
    .line 142
    sget-object v2, La/jvj0;->W1:La/zie0;

    .line 143
    .line 144
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, La/jvj0;->J0()La/xxj0;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const-string v1, "BetInputView"

    .line 152
    .line 153
    invoke-virtual {v0, v1, v4, v4, v4}, La/xxj0;->N(Ljava/lang/String;ZZZ)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_6
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Landroid/content/Context;

    .line 162
    .line 163
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v1, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_7
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v1, La/rw40;

    .line 178
    .line 179
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 182
    .line 183
    sget-object v2, La/uoj0;->b:Ljava/lang/Object;

    .line 184
    .line 185
    monitor-enter v2

    .line 186
    :try_start_0
    sget-object v5, La/uoj0;->c:Ljava/util/LinkedHashMap;

    .line 187
    .line 188
    invoke-interface {v5, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_1

    .line 196
    .line 197
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    sget-object v5, La/pov0;->a:Ljava/lang/String;

    .line 202
    .line 203
    const-string v6, "NetworkRequestConstraintController unregister shared callback"

    .line 204
    .line 205
    invoke-virtual {v1, v5, v6}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    sget-object v1, La/uoj0;->a:La/uoj0;

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 211
    .line 212
    .line 213
    sput-object v3, La/uoj0;->f:Ljava/lang/Boolean;

    .line 214
    .line 215
    sput-object v3, La/uoj0;->d:Landroid/net/NetworkCapabilities;

    .line 216
    .line 217
    sput-boolean v4, La/uoj0;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :catchall_0
    move-exception v0

    .line 221
    goto :goto_2

    .line 222
    :cond_1
    :goto_1
    monitor-exit v2

    .line 223
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object v0

    .line 226
    :goto_2
    monitor-exit v2

    .line 227
    throw v0

    .line 228
    :pswitch_8
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v1, La/ofj0;

    .line 231
    .line 232
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, La/vvi0;

    .line 235
    .line 236
    sget-object v2, La/ofj0;->X1:La/cge0;

    .line 237
    .line 238
    invoke-virtual {v1}, La/ofj0;->H0()La/k3t0;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    new-instance v4, La/syi0;

    .line 243
    .line 244
    invoke-direct {v4, v0}, La/syi0;-><init>(La/vvi0;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, v1, La/ofj0;->V1:La/qgd;

    .line 251
    .line 252
    if-eqz v0, :cond_2

    .line 253
    .line 254
    invoke-virtual {v0}, La/qgd;->H()V

    .line 255
    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :cond_2
    const-string v0, "settingsNavigator"

    .line 261
    .line 262
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v3

    .line 266
    :pswitch_9
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v1, La/qbj0;

    .line 269
    .line 270
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, La/vvi0;

    .line 273
    .line 274
    sget-object v2, La/qbj0;->Z1:La/lme0;

    .line 275
    .line 276
    invoke-virtual {v1}, La/qbj0;->H0()La/k3t0;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    new-instance v4, La/ibj0;

    .line 281
    .line 282
    invoke-direct {v4, v0}, La/ibj0;-><init>(La/vvi0;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    iget-object v0, v1, La/qbj0;->V1:La/qgd;

    .line 289
    .line 290
    if-eqz v0, :cond_3

    .line 291
    .line 292
    invoke-virtual {v0}, La/qgd;->H()V

    .line 293
    .line 294
    .line 295
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object v0

    .line 298
    :cond_3
    const-string v0, "settingsNavigator"

    .line 299
    .line 300
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v3

    .line 304
    :pswitch_a
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 307
    .line 308
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v0, La/mv00;

    .line 311
    .line 312
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_b
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v1, La/t1j0;

    .line 321
    .line 322
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, La/vvi0;

    .line 325
    .line 326
    sget-object v4, La/t1j0;->Y1:La/zie0;

    .line 327
    .line 328
    invoke-virtual {v1}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    iget-object v5, v4, Lorg/xplatform/settings/impl/presentation/a;->k:La/i1w0;

    .line 333
    .line 334
    iget-object v6, v4, Lorg/xplatform/settings/impl/presentation/a;->d:La/s31;

    .line 335
    .line 336
    iget-object v7, v6, La/s31;->a:La/kt2;

    .line 337
    .line 338
    const-string v8, "settings_not_logged_click"

    .line 339
    .line 340
    invoke-interface {v7, v8}, La/kt2;->c(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    iget-object v7, v4, Lorg/xplatform/settings/impl/presentation/a;->A:La/s64;

    .line 344
    .line 345
    iget-object v8, v7, La/s64;->a:La/s1p;

    .line 346
    .line 347
    const-wide/16 v9, 0x2b03

    .line 348
    .line 349
    sget-object v11, La/xun;->a:La/xun;

    .line 350
    .line 351
    invoke-virtual {v8, v11, v9, v10}, La/s1p;->a(Ljava/util/Set;J)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_8

    .line 359
    .line 360
    if-eq v0, v2, :cond_7

    .line 361
    .line 362
    const/4 v2, 0x2

    .line 363
    if-eq v0, v2, :cond_6

    .line 364
    .line 365
    const/4 v2, 0x3

    .line 366
    if-eq v0, v2, :cond_5

    .line 367
    .line 368
    const/4 v2, 0x4

    .line 369
    if-ne v0, v2, :cond_4

    .line 370
    .line 371
    invoke-virtual {v6}, La/s31;->r()V

    .line 372
    .line 373
    .line 374
    const-string v0, "history"

    .line 375
    .line 376
    invoke-virtual {v7, v0}, La/s64;->e(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    new-instance v0, La/kej0;

    .line 380
    .line 381
    const/16 v2, 0x11

    .line 382
    .line 383
    invoke-direct {v0, v4, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v5, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 387
    .line 388
    .line 389
    goto :goto_3

    .line 390
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 391
    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_5
    invoke-virtual {v6}, La/s31;->t()V

    .line 395
    .line 396
    .line 397
    const-string v0, "mailing"

    .line 398
    .line 399
    invoke-virtual {v7, v0}, La/s64;->e(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    new-instance v0, La/kej0;

    .line 403
    .line 404
    const/16 v2, 0xa

    .line 405
    .line 406
    invoke-direct {v0, v4, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v5, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 410
    .line 411
    .line 412
    goto :goto_3

    .line 413
    :cond_6
    new-instance v0, La/kej0;

    .line 414
    .line 415
    const/4 v2, 0x6

    .line 416
    invoke-direct {v0, v4, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v5, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 420
    .line 421
    .line 422
    goto :goto_3

    .line 423
    :cond_7
    invoke-virtual {v6}, La/s31;->D()V

    .line 424
    .line 425
    .line 426
    const-string v0, "transactions"

    .line 427
    .line 428
    invoke-virtual {v7, v0}, La/s64;->e(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    new-instance v0, La/kej0;

    .line 432
    .line 433
    const/16 v2, 0x10

    .line 434
    .line 435
    invoke-direct {v0, v4, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v5, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 439
    .line 440
    .line 441
    goto :goto_3

    .line 442
    :cond_8
    sget-object v0, La/nqh0;->a:La/nqh0;

    .line 443
    .line 444
    invoke-virtual {v4, v0}, Lorg/xplatform/settings/impl/presentation/a;->C(La/nqh0;)V

    .line 445
    .line 446
    .line 447
    :goto_3
    iget-object v0, v1, La/t1j0;->U1:La/qgd;

    .line 448
    .line 449
    if-eqz v0, :cond_9

    .line 450
    .line 451
    invoke-virtual {v0}, La/qgd;->H()V

    .line 452
    .line 453
    .line 454
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 455
    .line 456
    :goto_4
    return-object v3

    .line 457
    :cond_9
    const-string v0, "settingsNavigator"

    .line 458
    .line 459
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v3

    .line 463
    :pswitch_c
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 466
    .line 467
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, La/pzi0;

    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    new-instance v2, La/gbj0;

    .line 475
    .line 476
    invoke-direct {v2, v0}, La/gbj0;-><init>(La/hej0;)V

    .line 477
    .line 478
    .line 479
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0

    .line 485
    :pswitch_d
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 488
    .line 489
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, La/nzi0;

    .line 492
    .line 493
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    return-object v0

    .line 499
    :pswitch_e
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 502
    .line 503
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, La/hzi0;

    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    new-instance v2, La/gbj0;

    .line 511
    .line 512
    invoke-direct {v2, v0}, La/gbj0;-><init>(La/hej0;)V

    .line 513
    .line 514
    .line 515
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 519
    .line 520
    return-object v0

    .line 521
    :pswitch_f
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v1, La/swi0;

    .line 524
    .line 525
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v0, La/vvi0;

    .line 528
    .line 529
    sget-object v2, La/swi0;->X1:La/gne0;

    .line 530
    .line 531
    invoke-virtual {v1}, La/swi0;->H0()La/k3t0;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    new-instance v4, La/syi0;

    .line 536
    .line 537
    invoke-direct {v4, v0}, La/syi0;-><init>(La/vvi0;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    iget-object v0, v1, La/swi0;->V1:La/qgd;

    .line 544
    .line 545
    if-eqz v0, :cond_a

    .line 546
    .line 547
    invoke-virtual {v0}, La/qgd;->H()V

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :cond_a
    const-string v0, "settingsNavigator"

    .line 554
    .line 555
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v3

    .line 559
    :pswitch_10
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v1, La/vzg0;

    .line 562
    .line 563
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;

    .line 566
    .line 567
    const-string v3, "MAX_SAVED_HANDLE"

    .line 568
    .line 569
    sget-object v4, La/yg40;->b:La/yg40;

    .line 570
    .line 571
    const-string v4, "MIN_SAVED_HANDLE"

    .line 572
    .line 573
    invoke-virtual {v1, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    check-cast v5, Ljava/lang/Long;

    .line 578
    .line 579
    if-eqz v5, :cond_b

    .line 580
    .line 581
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 582
    .line 583
    .line 584
    move-result-wide v4

    .line 585
    :goto_5
    move-wide v7, v4

    .line 586
    goto :goto_6

    .line 587
    :cond_b
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 592
    .line 593
    .line 594
    move-result-wide v6

    .line 595
    const-wide/32 v8, 0x493e0

    .line 596
    .line 597
    .line 598
    sub-long/2addr v6, v8

    .line 599
    invoke-virtual {v5, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 600
    .line 601
    .line 602
    const/16 v6, 0xb

    .line 603
    .line 604
    invoke-virtual {v5, v6}, Ljava/util/Calendar;->get(I)I

    .line 605
    .line 606
    .line 607
    const/16 v6, 0xc

    .line 608
    .line 609
    invoke-virtual {v5, v6}, Ljava/util/Calendar;->get(I)I

    .line 610
    .line 611
    .line 612
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 613
    .line 614
    .line 615
    move-result-wide v6

    .line 616
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 617
    .line 618
    .line 619
    move-result-object v6

    .line 620
    invoke-virtual {v1, v4, v6}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 624
    .line 625
    .line 626
    move-result-wide v4

    .line 627
    goto :goto_5

    .line 628
    :goto_6
    invoke-virtual {v1, v3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v4

    .line 632
    check-cast v4, Ljava/lang/Long;

    .line 633
    .line 634
    if-eqz v4, :cond_c

    .line 635
    .line 636
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 637
    .line 638
    .line 639
    move-result-wide v1

    .line 640
    :goto_7
    move-wide v9, v1

    .line 641
    goto :goto_8

    .line 642
    :cond_c
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    const/16 v5, 0x64

    .line 647
    .line 648
    invoke-virtual {v4, v2, v5}, Ljava/util/Calendar;->add(II)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 652
    .line 653
    .line 654
    move-result-wide v5

    .line 655
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    invoke-virtual {v1, v3, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 663
    .line 664
    .line 665
    move-result-wide v1

    .line 666
    goto :goto_7

    .line 667
    :goto_8
    new-instance v6, La/h4i0;

    .line 668
    .line 669
    iget-object v11, v0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;->a:Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;

    .line 670
    .line 671
    iget-object v12, v0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;->b:Ljava/lang/String;

    .line 672
    .line 673
    invoke-direct/range {v6 .. v12}, La/h4i0;-><init>(JJLorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    return-object v6

    .line 677
    :pswitch_11
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v1, La/vzg0;

    .line 680
    .line 681
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v0, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 684
    .line 685
    iget-object v5, v0, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;->a:Ljava/util/Date;

    .line 686
    .line 687
    const-string v6, "MAX_SAVED_HANDLE"

    .line 688
    .line 689
    const-string v7, "MIN_SAVED_HANDLE"

    .line 690
    .line 691
    invoke-virtual {v1, v7}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    check-cast v8, Ljava/lang/Long;

    .line 696
    .line 697
    if-eqz v8, :cond_d

    .line 698
    .line 699
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 700
    .line 701
    .line 702
    move-result-wide v7

    .line 703
    :goto_9
    move-wide v10, v7

    .line 704
    goto :goto_a

    .line 705
    :cond_d
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 706
    .line 707
    .line 708
    move-result-object v8

    .line 709
    const/4 v9, -0x2

    .line 710
    invoke-virtual {v8, v2, v9}, Ljava/util/Calendar;->add(II)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v8}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 714
    .line 715
    .line 716
    move-result-wide v9

    .line 717
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 718
    .line 719
    .line 720
    move-result-object v9

    .line 721
    invoke-virtual {v1, v7, v9}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v8}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 725
    .line 726
    .line 727
    move-result-wide v7

    .line 728
    goto :goto_9

    .line 729
    :goto_a
    invoke-virtual {v1, v6}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    check-cast v7, Ljava/lang/Long;

    .line 734
    .line 735
    if-eqz v7, :cond_e

    .line 736
    .line 737
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 738
    .line 739
    .line 740
    move-result-wide v6

    .line 741
    :goto_b
    move-wide v12, v6

    .line 742
    goto :goto_c

    .line 743
    :cond_e
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 744
    .line 745
    .line 746
    move-result-object v7

    .line 747
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 748
    .line 749
    .line 750
    move-result-wide v8

    .line 751
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 752
    .line 753
    .line 754
    move-result-object v8

    .line 755
    invoke-virtual {v1, v6, v8}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 759
    .line 760
    .line 761
    move-result-wide v6

    .line 762
    goto :goto_b

    .line 763
    :goto_c
    new-instance v9, La/l2i0;

    .line 764
    .line 765
    if-eqz v5, :cond_f

    .line 766
    .line 767
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 768
    .line 769
    .line 770
    move-result-wide v6

    .line 771
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    :cond_f
    move-object v14, v3

    .line 776
    iget-object v15, v0, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;->b:Ljava/lang/String;

    .line 777
    .line 778
    if-eqz v5, :cond_10

    .line 779
    .line 780
    move/from16 v16, v2

    .line 781
    .line 782
    goto :goto_d

    .line 783
    :cond_10
    move/from16 v16, v4

    .line 784
    .line 785
    :goto_d
    invoke-direct/range {v9 .. v16}, La/l2i0;-><init>(JJLjava/lang/Long;Ljava/lang/String;Z)V

    .line 786
    .line 787
    .line 788
    return-object v9

    .line 789
    :pswitch_12
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v1, La/gfj;

    .line 792
    .line 793
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v0, La/y3i0;

    .line 796
    .line 797
    sget-object v2, La/y3i0;->n2:La/lme0;

    .line 798
    .line 799
    invoke-virtual {v1}, La/gfj;->Q()La/xk9;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    if-eqz v1, :cond_11

    .line 804
    .line 805
    iget-object v0, v0, La/y3i0;->m2:La/a8z;

    .line 806
    .line 807
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    check-cast v0, La/k3t0;

    .line 812
    .line 813
    new-instance v2, La/t3i0;

    .line 814
    .line 815
    invoke-direct {v2, v1}, La/t3i0;-><init>(La/xk9;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 819
    .line 820
    .line 821
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 822
    .line 823
    return-object v0

    .line 824
    :pswitch_13
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v1, La/hdj;

    .line 827
    .line 828
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v0, La/x1i0;

    .line 831
    .line 832
    sget-object v2, La/x1i0;->n2:La/zie0;

    .line 833
    .line 834
    invoke-virtual {v1}, La/hdj;->a()Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    if-eqz v1, :cond_12

    .line 839
    .line 840
    invoke-virtual {v0}, La/x1i0;->Q0()La/k3t0;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    new-instance v2, La/r1i0;

    .line 845
    .line 846
    invoke-direct {v2, v1}, La/r1i0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 850
    .line 851
    .line 852
    :cond_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 853
    .line 854
    return-object v0

    .line 855
    :pswitch_14
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 858
    .line 859
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v0, La/t0i0;

    .line 862
    .line 863
    iget-object v0, v0, La/t0i0;->c:La/r0i0;

    .line 864
    .line 865
    check-cast v0, La/q0i0;

    .line 866
    .line 867
    iget-byte v0, v0, La/q0i0;->a:B

    .line 868
    .line 869
    new-instance v2, La/i0i0;

    .line 870
    .line 871
    invoke-direct {v2, v0}, La/i0i0;-><init>(I)V

    .line 872
    .line 873
    .line 874
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 878
    .line 879
    return-object v0

    .line 880
    :pswitch_15
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v1, La/x6f;

    .line 883
    .line 884
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v0, La/c5h;

    .line 887
    .line 888
    const-string v2, ""

    .line 889
    .line 890
    invoke-virtual {v1, v2}, La/x6f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    iget-object v1, v0, La/c5h;->q:La/p7m0;

    .line 894
    .line 895
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    check-cast v2, La/l120;

    .line 900
    .line 901
    iget-boolean v2, v2, La/l120;->g:Z

    .line 902
    .line 903
    if-eqz v2, :cond_13

    .line 904
    .line 905
    iget-object v0, v0, La/c5h;->d:La/hzg;

    .line 906
    .line 907
    check-cast v0, La/uzg;

    .line 908
    .line 909
    invoke-virtual {v0}, La/uzg;->a()V

    .line 910
    .line 911
    .line 912
    goto :goto_e

    .line 913
    :cond_13
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    move-object v4, v0

    .line 918
    check-cast v4, La/l120;

    .line 919
    .line 920
    const-string v5, ""

    .line 921
    .line 922
    const/4 v9, 0x0

    .line 923
    const/16 v10, 0xbb

    .line 924
    .line 925
    const/4 v6, 0x0

    .line 926
    const/4 v7, 0x0

    .line 927
    const/4 v8, 0x1

    .line 928
    invoke-static/range {v4 .. v10}, La/l120;->a(La/l120;Ljava/lang/String;ZZZZI)La/l120;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    invoke-virtual {v1, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 933
    .line 934
    .line 935
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 936
    .line 937
    return-object v0

    .line 938
    :pswitch_16
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 939
    .line 940
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 941
    .line 942
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v0, La/gqh0;

    .line 945
    .line 946
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 950
    .line 951
    return-object v0

    .line 952
    :pswitch_17
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 955
    .line 956
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v0, La/fqh0;

    .line 959
    .line 960
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 964
    .line 965
    return-object v0

    .line 966
    :pswitch_18
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 967
    .line 968
    check-cast v1, La/ctf0;

    .line 969
    .line 970
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v0, La/nqh0;

    .line 973
    .line 974
    new-instance v3, La/yph0;

    .line 975
    .line 976
    sget-object v5, La/zvh0;->b:La/zvh0;

    .line 977
    .line 978
    new-instance v6, La/yvh0;

    .line 979
    .line 980
    new-array v7, v4, [Ljava/lang/Object;

    .line 981
    .line 982
    iget-object v8, v1, La/ctf0;->b:La/lsm0;

    .line 983
    .line 984
    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v7

    .line 988
    const v9, 0x7f13100c

    .line 989
    .line 990
    .line 991
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v7

    .line 995
    sget-object v8, La/bwh0;->a:La/bwh0;

    .line 996
    .line 997
    invoke-direct {v6, v7, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 998
    .line 999
    .line 1000
    new-instance v7, La/yvh0;

    .line 1001
    .line 1002
    new-array v9, v4, [Ljava/lang/Object;

    .line 1003
    .line 1004
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1005
    .line 1006
    invoke-static {v9, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v9

    .line 1010
    const v10, 0x7f13128d

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v1, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    invoke-direct {v7, v1, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1018
    .line 1019
    .line 1020
    filled-new-array {v6, v7}, [La/yvh0;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v1

    .line 1028
    sget-object v6, La/nqh0;->a:La/nqh0;

    .line 1029
    .line 1030
    if-ne v0, v6, :cond_14

    .line 1031
    .line 1032
    move v2, v4

    .line 1033
    :cond_14
    invoke-direct {v3, v5, v1, v2}, La/yph0;-><init>(La/zvh0;La/a4x;I)V

    .line 1034
    .line 1035
    .line 1036
    return-object v3

    .line 1037
    :pswitch_19
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 1038
    .line 1039
    check-cast v1, La/thh0;

    .line 1040
    .line 1041
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v0, La/thh0;

    .line 1044
    .line 1045
    instance-of v5, v1, La/nhh0;

    .line 1046
    .line 1047
    if-eqz v5, :cond_15

    .line 1048
    .line 1049
    check-cast v1, La/nhh0;

    .line 1050
    .line 1051
    goto :goto_f

    .line 1052
    :cond_15
    move-object v1, v3

    .line 1053
    :goto_f
    if-eqz v1, :cond_16

    .line 1054
    .line 1055
    iget-object v1, v1, La/nhh0;->a:Ljava/util/List;

    .line 1056
    .line 1057
    goto :goto_10

    .line 1058
    :cond_16
    move-object v1, v3

    .line 1059
    :goto_10
    if-eqz v1, :cond_17

    .line 1060
    .line 1061
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1062
    .line 1063
    .line 1064
    move-result v1

    .line 1065
    if-eqz v1, :cond_1a

    .line 1066
    .line 1067
    :cond_17
    instance-of v1, v0, La/nhh0;

    .line 1068
    .line 1069
    if-eqz v1, :cond_18

    .line 1070
    .line 1071
    check-cast v0, La/nhh0;

    .line 1072
    .line 1073
    goto :goto_11

    .line 1074
    :cond_18
    move-object v0, v3

    .line 1075
    :goto_11
    if-eqz v0, :cond_19

    .line 1076
    .line 1077
    iget-object v3, v0, La/nhh0;->a:Ljava/util/List;

    .line 1078
    .line 1079
    :cond_19
    if-eqz v3, :cond_1b

    .line 1080
    .line 1081
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v0

    .line 1085
    if-eqz v0, :cond_1a

    .line 1086
    .line 1087
    goto :goto_12

    .line 1088
    :cond_1a
    move v2, v4

    .line 1089
    :cond_1b
    :goto_12
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    return-object v0

    .line 1094
    :pswitch_1a
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 1095
    .line 1096
    check-cast v1, Ljava/lang/String;

    .line 1097
    .line 1098
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 1099
    .line 1100
    check-cast v0, La/leh0;

    .line 1101
    .line 1102
    sget-object v2, La/tua0;->c:La/tua0;

    .line 1103
    .line 1104
    new-array v3, v4, [La/ugi0;

    .line 1105
    .line 1106
    new-instance v5, La/keh0;

    .line 1107
    .line 1108
    invoke-direct {v5, v0, v4}, La/keh0;-><init>(La/leh0;B)V

    .line 1109
    .line 1110
    .line 1111
    invoke-static {v1, v2, v3, v5}, La/x2x;->G(Ljava/lang/String;La/c3x;[La/ugi0;Lkotlin/jvm/functions/Function1;)La/wgi0;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    return-object v0

    .line 1116
    :pswitch_1b
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast v1, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;

    .line 1119
    .line 1120
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v0, La/c7h0;

    .line 1123
    .line 1124
    iget-object v2, v1, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->a:Lkotlin/jvm/functions/Function0;

    .line 1125
    .line 1126
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    iget-object v1, v1, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->b:Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;

    .line 1130
    .line 1131
    if-eqz v1, :cond_1c

    .line 1132
    .line 1133
    iget-object v0, v0, La/c7h0;->g:Ljava/util/List;

    .line 1134
    .line 1135
    invoke-virtual {v1, v0}, Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;->a(Ljava/util/List;)V

    .line 1136
    .line 1137
    .line 1138
    :cond_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1139
    .line 1140
    return-object v0

    .line 1141
    :pswitch_1c
    iget-object v1, v0, La/x6h0;->b:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v1, Landroid/content/Context;

    .line 1144
    .line 1145
    iget-object v0, v0, La/x6h0;->c:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast v0, La/y6h0;

    .line 1148
    .line 1149
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v1

    .line 1153
    const v2, 0x7f0d06ca

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v1, v2, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v1

    .line 1160
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1161
    .line 1162
    .line 1163
    const v0, 0x7f0a07f3

    .line 1164
    .line 1165
    .line 1166
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v2

    .line 1170
    check-cast v2, Landroid/widget/ImageView;

    .line 1171
    .line 1172
    if-eqz v2, :cond_1d

    .line 1173
    .line 1174
    new-instance v3, La/oku0;

    .line 1175
    .line 1176
    check-cast v1, Landroid/widget/FrameLayout;

    .line 1177
    .line 1178
    invoke-direct {v3, v1, v2}, La/oku0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_13

    .line 1182
    :cond_1d
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v1

    .line 1186
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    const-string v1, "Missing required view with ID: "

    .line 1191
    .line 1192
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1197
    .line 1198
    .line 1199
    :goto_13
    return-object v3

    .line 1200
    nop

    .line 1201
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
