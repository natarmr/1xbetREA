.class public final synthetic La/jhk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sbe;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/jhk;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/jhk;->a:B

    .line 4
    .line 5
    const-string v1, "Samsung"

    .line 6
    .line 7
    const-string v2, "Vivo"

    .line 8
    .line 9
    const/16 v3, 0x21

    .line 10
    .line 11
    const-string v4, "DeviceQuirks"

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p1

    .line 18
    .line 19
    check-cast v0, Ljava/util/Set;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    move-object/from16 v0, p1

    .line 23
    .line 24
    check-cast v0, La/hpd0;

    .line 25
    .line 26
    new-instance v7, La/kpd0;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v8, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    sget v9, Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;->b:I

    .line 37
    .line 38
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    const/16 v10, 0x22

    .line 41
    .line 42
    if-lt v9, v10, :cond_5

    .line 43
    .line 44
    new-instance v11, Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;

    .line 45
    .line 46
    sget-object v11, Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk;->a:La/n0o0;

    .line 47
    .line 48
    invoke-virtual {v11}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    check-cast v11, La/bf5;

    .line 53
    .line 54
    sget-object v12, La/xqy;->a:La/wqy;

    .line 55
    .line 56
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v13, v12, La/wqy;->d:La/pcy;

    .line 63
    .line 64
    invoke-virtual {v13}, La/pcy;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    check-cast v13, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    if-eqz v13, :cond_2

    .line 75
    .line 76
    iget-object v12, v12, La/wqy;->c:Ljava/util/Set;

    .line 77
    .line 78
    sget-object v13, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 79
    .line 80
    invoke-interface {v12, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-eqz v12, :cond_0

    .line 85
    .line 86
    sget-object v11, La/fnm0;->a:La/fnm0;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    iget-object v11, v11, La/bf5;->a:La/pmi0;

    .line 90
    .line 91
    iget-object v11, v11, La/pmi0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v11, La/n0o0;

    .line 94
    .line 95
    invoke-virtual {v11}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    check-cast v11, Ljava/util/Set;

    .line 100
    .line 101
    const/4 v12, 0x5

    .line 102
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    invoke-interface {v11, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eqz v11, :cond_1

    .line 111
    .line 112
    sget-object v11, La/fnm0;->a:La/fnm0;

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    sget-object v11, La/fnm0;->c:La/fnm0;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    sget-object v11, La/fnm0;->b:La/fnm0;

    .line 119
    .line 120
    :goto_0
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-eqz v11, :cond_4

    .line 125
    .line 126
    if-eq v11, v6, :cond_5

    .line 127
    .line 128
    const/4 v12, 0x2

    .line 129
    if-eq v11, v12, :cond_5

    .line 130
    .line 131
    const/4 v12, 0x3

    .line 132
    if-ne v11, v12, :cond_3

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_1d

    .line 139
    .line 140
    :cond_4
    :goto_1
    move v11, v6

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    const/4 v11, 0x0

    .line 143
    :goto_2
    const-class v12, Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;

    .line 144
    .line 145
    invoke-virtual {v0, v12, v11}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    if-eqz v11, :cond_6

    .line 150
    .line 151
    new-instance v11, Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;

    .line 152
    .line 153
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    :cond_6
    sget-boolean v11, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->a:Z

    .line 160
    .line 161
    if-nez v11, :cond_8

    .line 162
    .line 163
    sget-boolean v11, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->b:Z

    .line 164
    .line 165
    if-eqz v11, :cond_7

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_7
    const/16 v11, 0x1e

    .line 169
    .line 170
    if-gt v11, v9, :cond_9

    .line 171
    .line 172
    if-ge v9, v10, :cond_9

    .line 173
    .line 174
    const-string v10, "Oppo"

    .line 175
    .line 176
    invoke-static {v10}, La/lgb;->a0(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-nez v10, :cond_8

    .line 181
    .line 182
    const-string v10, "OnePlus"

    .line 183
    .line 184
    invoke-static {v10}, La/lgb;->a0(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v10

    .line 188
    if-nez v10, :cond_8

    .line 189
    .line 190
    const-string v10, "Realme"

    .line 191
    .line 192
    invoke-static {v10}, La/lgb;->a0(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_9

    .line 197
    .line 198
    :cond_8
    :goto_3
    move v10, v6

    .line 199
    goto :goto_4

    .line 200
    :cond_9
    sget-object v10, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    if-nez v10, :cond_8

    .line 210
    .line 211
    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    if-eqz v10, :cond_a

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_a
    sget-boolean v10, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->c:Z

    .line 224
    .line 225
    if-eqz v10, :cond_b

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_b
    sget-boolean v10, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->e:Z

    .line 229
    .line 230
    if-eqz v10, :cond_c

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_c
    sget-boolean v10, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->d:Z

    .line 234
    .line 235
    if-eqz v10, :cond_d

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_d
    const/4 v10, 0x0

    .line 239
    :goto_4
    const-class v11, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;

    .line 240
    .line 241
    invoke-virtual {v0, v11, v10}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-eqz v10, :cond_e

    .line 246
    .line 247
    new-instance v10, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;

    .line 248
    .line 249
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    :cond_e
    sget-object v10, Landroidx/camera/camera2/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;->a:Ljava/util/List;

    .line 256
    .line 257
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 263
    .line 264
    invoke-virtual {v11, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-interface {v10, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    const-class v13, Landroidx/camera/camera2/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;

    .line 276
    .line 277
    invoke-virtual {v0, v13, v10}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    if-eqz v10, :cond_f

    .line 282
    .line 283
    new-instance v10, Landroidx/camera/camera2/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;

    .line 284
    .line 285
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    :cond_f
    sget-object v10, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    const-string v13, "Jio"

    .line 297
    .line 298
    invoke-virtual {v10, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result v14

    .line 302
    if-nez v14, :cond_10

    .line 303
    .line 304
    sget-object v14, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v14, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v13

    .line 313
    if-eqz v13, :cond_11

    .line 314
    .line 315
    :cond_10
    const-string v13, "LS1542QW"

    .line 316
    .line 317
    invoke-static {v11, v13, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 318
    .line 319
    .line 320
    move-result v13

    .line 321
    if-eqz v13, :cond_11

    .line 322
    .line 323
    goto :goto_5

    .line 324
    :cond_11
    invoke-virtual {v10, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 325
    .line 326
    .line 327
    move-result v13

    .line 328
    if-nez v13, :cond_12

    .line 329
    .line 330
    sget-object v13, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 331
    .line 332
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v13, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 336
    .line 337
    .line 338
    move-result v13

    .line 339
    if-eqz v13, :cond_13

    .line 340
    .line 341
    :cond_12
    const-string v13, "SM-A025"

    .line 342
    .line 343
    invoke-static {v11, v13, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 344
    .line 345
    .line 346
    move-result v13

    .line 347
    if-nez v13, :cond_16

    .line 348
    .line 349
    const-string v13, "SM-S124DL"

    .line 350
    .line 351
    invoke-virtual {v11, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 352
    .line 353
    .line 354
    move-result v13

    .line 355
    if-eqz v13, :cond_13

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_13
    invoke-virtual {v10, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 359
    .line 360
    .line 361
    move-result v13

    .line 362
    if-nez v13, :cond_14

    .line 363
    .line 364
    sget-object v13, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v13, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    if-eqz v2, :cond_15

    .line 374
    .line 375
    :cond_14
    const-string v2, "VIVO 2039"

    .line 376
    .line 377
    invoke-virtual {v11, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-eqz v2, :cond_15

    .line 382
    .line 383
    goto :goto_5

    .line 384
    :cond_15
    const/4 v2, 0x0

    .line 385
    goto :goto_6

    .line 386
    :cond_16
    :goto_5
    move v2, v6

    .line 387
    :goto_6
    const-class v13, Landroidx/camera/camera2/compat/quirk/ControlZoomRatioRangeAssertionErrorQuirk;

    .line 388
    .line 389
    invoke-virtual {v0, v13, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-eqz v2, :cond_17

    .line 394
    .line 395
    new-instance v2, Landroidx/camera/camera2/compat/quirk/ControlZoomRatioRangeAssertionErrorQuirk;

    .line 396
    .line 397
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    :cond_17
    sget-boolean v2, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;->a:Z

    .line 404
    .line 405
    const-string v2, "Tecno"

    .line 406
    .line 407
    invoke-virtual {v10, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    move-result v13

    .line 411
    if-nez v13, :cond_1b

    .line 412
    .line 413
    sget-object v13, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v13, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    if-eqz v2, :cond_18

    .line 423
    .line 424
    goto :goto_7

    .line 425
    :cond_18
    const-string v2, "Tecno-mobile"

    .line 426
    .line 427
    invoke-virtual {v10, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 428
    .line 429
    .line 430
    move-result v14

    .line 431
    if-nez v14, :cond_1b

    .line 432
    .line 433
    invoke-virtual {v13, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    if-eqz v2, :cond_19

    .line 438
    .line 439
    goto :goto_7

    .line 440
    :cond_19
    sget-boolean v2, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;->a:Z

    .line 441
    .line 442
    if-nez v2, :cond_1b

    .line 443
    .line 444
    sget-boolean v2, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;->b:Z

    .line 445
    .line 446
    if-eqz v2, :cond_1a

    .line 447
    .line 448
    goto :goto_7

    .line 449
    :cond_1a
    const/4 v2, 0x0

    .line 450
    goto :goto_8

    .line 451
    :cond_1b
    :goto_7
    move v2, v6

    .line 452
    :goto_8
    const-class v13, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;

    .line 453
    .line 454
    invoke-virtual {v0, v13, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-eqz v2, :cond_1c

    .line 459
    .line 460
    new-instance v2, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;

    .line 461
    .line 462
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    :cond_1c
    invoke-virtual {v10, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    const-string v13, "Xiaomi"

    .line 473
    .line 474
    if-nez v2, :cond_1f

    .line 475
    .line 476
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result v14

    .line 485
    if-eqz v14, :cond_1d

    .line 486
    .line 487
    goto :goto_9

    .line 488
    :cond_1d
    invoke-virtual {v10, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 489
    .line 490
    .line 491
    move-result v14

    .line 492
    if-nez v14, :cond_1f

    .line 493
    .line 494
    invoke-virtual {v2, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-eqz v2, :cond_1e

    .line 499
    .line 500
    goto :goto_9

    .line 501
    :cond_1e
    const/4 v2, 0x0

    .line 502
    goto :goto_a

    .line 503
    :cond_1f
    :goto_9
    move v2, v6

    .line 504
    :goto_a
    const-class v14, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopWithSessionProcessorQuirk;

    .line 505
    .line 506
    invoke-virtual {v0, v14, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-eqz v2, :cond_20

    .line 511
    .line 512
    new-instance v2, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopWithSessionProcessorQuirk;

    .line 513
    .line 514
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    :cond_20
    sget-object v2, Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;->a:Ljava/util/Set;

    .line 521
    .line 522
    new-instance v14, La/ojq;

    .line 523
    .line 524
    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 525
    .line 526
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v10, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v11, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v15

    .line 540
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-direct {v14, v5, v15}, La/ojq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-interface {v2, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    const-class v5, Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;

    .line 551
    .line 552
    invoke-virtual {v0, v5, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    if-eqz v2, :cond_21

    .line 557
    .line 558
    new-instance v2, Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;

    .line 559
    .line 560
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    :cond_21
    sget-object v2, Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;->a:Ljava/util/List;

    .line 567
    .line 568
    invoke-interface {v2, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    const-string v5, "Google"

    .line 573
    .line 574
    if-eqz v2, :cond_23

    .line 575
    .line 576
    invoke-virtual {v10, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    if-nez v2, :cond_22

    .line 581
    .line 582
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 583
    .line 584
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    if-eqz v2, :cond_23

    .line 592
    .line 593
    :cond_22
    const/16 v2, 0x1a

    .line 594
    .line 595
    if-lt v9, v2, :cond_23

    .line 596
    .line 597
    move v2, v6

    .line 598
    goto :goto_b

    .line 599
    :cond_23
    const/4 v2, 0x0

    .line 600
    :goto_b
    const-class v14, Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 601
    .line 602
    invoke-virtual {v0, v14, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    if-eqz v2, :cond_24

    .line 607
    .line 608
    new-instance v2, Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 609
    .line 610
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    :cond_24
    sget-object v2, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;->a:Ljava/util/List;

    .line 617
    .line 618
    invoke-virtual {v10, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    const-string v14, "TP1A"

    .line 623
    .line 624
    if-nez v2, :cond_25

    .line 625
    .line 626
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    if-eqz v2, :cond_26

    .line 636
    .line 637
    :cond_25
    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 638
    .line 639
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    invoke-static {v2, v14, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-eqz v2, :cond_26

    .line 647
    .line 648
    goto/16 :goto_10

    .line 649
    .line 650
    :cond_26
    sget-object v2, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;->a:Ljava/util/List;

    .line 651
    .line 652
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v15

    .line 656
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    invoke-interface {v2, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    if-eqz v2, :cond_27

    .line 664
    .line 665
    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 666
    .line 667
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-static {v2, v14, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 671
    .line 672
    .line 673
    move-result v15

    .line 674
    if-nez v15, :cond_2e

    .line 675
    .line 676
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    const-string v15, "TD1A"

    .line 680
    .line 681
    invoke-static {v2, v15, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    if-eqz v2, :cond_27

    .line 686
    .line 687
    goto/16 :goto_10

    .line 688
    .line 689
    :cond_27
    const-string v2, "Redmi"

    .line 690
    .line 691
    invoke-virtual {v10, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 692
    .line 693
    .line 694
    move-result v15

    .line 695
    if-nez v15, :cond_29

    .line 696
    .line 697
    sget-object v15, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 698
    .line 699
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v15, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    if-eqz v2, :cond_28

    .line 707
    .line 708
    goto :goto_c

    .line 709
    :cond_28
    const/4 v2, 0x0

    .line 710
    goto :goto_d

    .line 711
    :cond_29
    :goto_c
    move v2, v6

    .line 712
    :goto_d
    invoke-virtual {v10, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 713
    .line 714
    .line 715
    move-result v15

    .line 716
    if-nez v15, :cond_2b

    .line 717
    .line 718
    sget-object v15, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 719
    .line 720
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v15, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 724
    .line 725
    .line 726
    move-result v15

    .line 727
    if-eqz v15, :cond_2a

    .line 728
    .line 729
    goto :goto_e

    .line 730
    :cond_2a
    const/4 v15, 0x0

    .line 731
    goto :goto_f

    .line 732
    :cond_2b
    :goto_e
    move v15, v6

    .line 733
    :goto_f
    or-int/2addr v2, v15

    .line 734
    if-eqz v2, :cond_2c

    .line 735
    .line 736
    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 737
    .line 738
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    const-string v15, "TKQ1"

    .line 742
    .line 743
    invoke-static {v2, v15, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 744
    .line 745
    .line 746
    move-result v15

    .line 747
    if-nez v15, :cond_2e

    .line 748
    .line 749
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    invoke-static {v2, v14, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    if-eqz v2, :cond_2c

    .line 757
    .line 758
    goto :goto_10

    .line 759
    :cond_2c
    sget-object v2, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;->c:Ljava/util/List;

    .line 760
    .line 761
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v14

    .line 765
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    invoke-interface {v2, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    if-eqz v2, :cond_2d

    .line 773
    .line 774
    if-ne v9, v3, :cond_2d

    .line 775
    .line 776
    goto :goto_10

    .line 777
    :cond_2d
    sget-object v2, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;->b:Ljava/util/List;

    .line 778
    .line 779
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v14

    .line 783
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    invoke-interface {v2, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    if-eqz v2, :cond_2f

    .line 791
    .line 792
    if-ne v9, v3, :cond_2f

    .line 793
    .line 794
    :cond_2e
    :goto_10
    move v2, v6

    .line 795
    goto :goto_11

    .line 796
    :cond_2f
    const/4 v2, 0x0

    .line 797
    :goto_11
    const-class v3, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;

    .line 798
    .line 799
    invoke-virtual {v0, v3, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 800
    .line 801
    .line 802
    move-result v2

    .line 803
    if-eqz v2, :cond_30

    .line 804
    .line 805
    new-instance v2, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;

    .line 806
    .line 807
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    :cond_30
    invoke-static {}, La/lmc;->O()Z

    .line 814
    .line 815
    .line 816
    move-result v2

    .line 817
    if-nez v2, :cond_32

    .line 818
    .line 819
    invoke-static {}, La/lmc;->P()Z

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    if-nez v2, :cond_32

    .line 824
    .line 825
    invoke-static {}, La/lmc;->M()Z

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    if-nez v2, :cond_32

    .line 830
    .line 831
    invoke-static {}, La/lmc;->T()Z

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    if-nez v2, :cond_32

    .line 836
    .line 837
    invoke-static {}, La/lmc;->S()Z

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    if-nez v2, :cond_32

    .line 842
    .line 843
    invoke-static {}, La/lmc;->Q()Z

    .line 844
    .line 845
    .line 846
    move-result v2

    .line 847
    if-nez v2, :cond_32

    .line 848
    .line 849
    invoke-static {}, La/lmc;->R()Z

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    if-nez v2, :cond_32

    .line 854
    .line 855
    invoke-static {}, La/lmc;->N()Z

    .line 856
    .line 857
    .line 858
    move-result v2

    .line 859
    if-nez v2, :cond_32

    .line 860
    .line 861
    invoke-static {}, La/lmc;->U()Z

    .line 862
    .line 863
    .line 864
    move-result v2

    .line 865
    if-eqz v2, :cond_31

    .line 866
    .line 867
    goto :goto_12

    .line 868
    :cond_31
    const/4 v2, 0x0

    .line 869
    goto :goto_13

    .line 870
    :cond_32
    :goto_12
    move v2, v6

    .line 871
    :goto_13
    const-class v3, Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;

    .line 872
    .line 873
    invoke-virtual {v0, v3, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    if-eqz v2, :cond_33

    .line 878
    .line 879
    new-instance v2, Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;

    .line 880
    .line 881
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    :cond_33
    sget-object v2, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;->a:Ljava/util/LinkedHashMap;

    .line 888
    .line 889
    invoke-static {}, La/n4c;->N()Z

    .line 890
    .line 891
    .line 892
    move-result v2

    .line 893
    const-class v3, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;

    .line 894
    .line 895
    invoke-virtual {v0, v3, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 896
    .line 897
    .line 898
    move-result v2

    .line 899
    if-eqz v2, :cond_34

    .line 900
    .line 901
    new-instance v2, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;

    .line 902
    .line 903
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 904
    .line 905
    .line 906
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    :cond_34
    const-string v2, "Motorola"

    .line 910
    .line 911
    invoke-virtual {v10, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 912
    .line 913
    .line 914
    move-result v3

    .line 915
    if-nez v3, :cond_35

    .line 916
    .line 917
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 918
    .line 919
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 923
    .line 924
    .line 925
    move-result v2

    .line 926
    if-eqz v2, :cond_36

    .line 927
    .line 928
    :cond_35
    const-string v2, "moto e5 play"

    .line 929
    .line 930
    invoke-virtual {v2, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 931
    .line 932
    .line 933
    move-result v2

    .line 934
    if-eqz v2, :cond_36

    .line 935
    .line 936
    move v2, v6

    .line 937
    goto :goto_14

    .line 938
    :cond_36
    const/4 v2, 0x0

    .line 939
    :goto_14
    const-class v3, Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;

    .line 940
    .line 941
    invoke-virtual {v0, v3, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 942
    .line 943
    .line 944
    move-result v2

    .line 945
    if-eqz v2, :cond_37

    .line 946
    .line 947
    new-instance v2, Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;

    .line 948
    .line 949
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    :cond_37
    sget-object v2, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:La/sln0;

    .line 956
    .line 957
    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 958
    .line 959
    const-string v3, "heroqltevzw"

    .line 960
    .line 961
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 962
    .line 963
    .line 964
    move-result v3

    .line 965
    if-nez v3, :cond_3a

    .line 966
    .line 967
    const-string v3, "heroqltetmo"

    .line 968
    .line 969
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 970
    .line 971
    .line 972
    move-result v3

    .line 973
    if-eqz v3, :cond_38

    .line 974
    .line 975
    goto :goto_15

    .line 976
    :cond_38
    invoke-static {}, La/mbc;->c0()Z

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    if-nez v3, :cond_3a

    .line 981
    .line 982
    invoke-static {}, La/mbc;->d0()Z

    .line 983
    .line 984
    .line 985
    move-result v3

    .line 986
    if-eqz v3, :cond_39

    .line 987
    .line 988
    goto :goto_15

    .line 989
    :cond_39
    const/4 v3, 0x0

    .line 990
    goto :goto_16

    .line 991
    :cond_3a
    :goto_15
    move v3, v6

    .line 992
    :goto_16
    const-class v9, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 993
    .line 994
    invoke-virtual {v0, v9, v3}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    if-eqz v3, :cond_3b

    .line 999
    .line 1000
    new-instance v3, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 1001
    .line 1002
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    :cond_3b
    sget-object v3, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;->a:Ljava/util/List;

    .line 1009
    .line 1010
    invoke-virtual {v10, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v3

    .line 1014
    if-nez v3, :cond_3c

    .line 1015
    .line 1016
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1017
    .line 1018
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1022
    .line 1023
    .line 1024
    :cond_3c
    const-class v3, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 1025
    .line 1026
    const/4 v9, 0x0

    .line 1027
    invoke-virtual {v0, v3, v9}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v3

    .line 1031
    if-eqz v3, :cond_3d

    .line 1032
    .line 1033
    new-instance v3, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 1034
    .line 1035
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    :cond_3d
    sget-object v3, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;->a:Ljava/util/List;

    .line 1042
    .line 1043
    invoke-virtual {v10, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v3

    .line 1047
    if-nez v3, :cond_3e

    .line 1048
    .line 1049
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1050
    .line 1051
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v3

    .line 1058
    if-eqz v3, :cond_3f

    .line 1059
    .line 1060
    :cond_3e
    sget-object v3, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;->a:Ljava/util/List;

    .line 1061
    .line 1062
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    .line 1064
    .line 1065
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v5

    .line 1069
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v2

    .line 1076
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1077
    .line 1078
    .line 1079
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1080
    .line 1081
    .line 1082
    move-result v2

    .line 1083
    if-eqz v2, :cond_3f

    .line 1084
    .line 1085
    move v2, v6

    .line 1086
    goto :goto_17

    .line 1087
    :cond_3f
    const/4 v2, 0x0

    .line 1088
    :goto_17
    const-class v3, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 1089
    .line 1090
    invoke-virtual {v0, v3, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v2

    .line 1094
    if-eqz v2, :cond_40

    .line 1095
    .line 1096
    new-instance v2, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 1097
    .line 1098
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    :cond_40
    const-string v2, "Huawei"

    .line 1105
    .line 1106
    invoke-virtual {v10, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1107
    .line 1108
    .line 1109
    move-result v3

    .line 1110
    if-nez v3, :cond_41

    .line 1111
    .line 1112
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1113
    .line 1114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v2

    .line 1121
    if-eqz v2, :cond_42

    .line 1122
    .line 1123
    :cond_41
    const-string v2, "mha-l29"

    .line 1124
    .line 1125
    invoke-virtual {v2, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v2

    .line 1129
    if-eqz v2, :cond_42

    .line 1130
    .line 1131
    move v2, v6

    .line 1132
    goto :goto_18

    .line 1133
    :cond_42
    const/4 v2, 0x0

    .line 1134
    :goto_18
    const-class v3, Landroidx/camera/camera2/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 1135
    .line 1136
    invoke-virtual {v0, v3, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1137
    .line 1138
    .line 1139
    move-result v2

    .line 1140
    if-eqz v2, :cond_43

    .line 1141
    .line 1142
    new-instance v2, Landroidx/camera/camera2/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 1143
    .line 1144
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1148
    .line 1149
    .line 1150
    :cond_43
    invoke-virtual {v10, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v2

    .line 1154
    if-nez v2, :cond_44

    .line 1155
    .line 1156
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1157
    .line 1158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v2

    .line 1165
    if-eqz v2, :cond_45

    .line 1166
    .line 1167
    :cond_44
    invoke-virtual {v11, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1172
    .line 1173
    .line 1174
    const-string v3, "SM-A716"

    .line 1175
    .line 1176
    const/4 v9, 0x0

    .line 1177
    invoke-static {v2, v3, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v2

    .line 1181
    if-eqz v2, :cond_45

    .line 1182
    .line 1183
    move v9, v6

    .line 1184
    goto :goto_19

    .line 1185
    :cond_45
    const/4 v9, 0x0

    .line 1186
    :goto_19
    const-class v2, Landroidx/camera/camera2/compat/quirk/StillCaptureFlashStopRepeatingQuirk;

    .line 1187
    .line 1188
    invoke-virtual {v0, v2, v9}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1189
    .line 1190
    .line 1191
    move-result v2

    .line 1192
    if-eqz v2, :cond_46

    .line 1193
    .line 1194
    new-instance v2, Landroidx/camera/camera2/compat/quirk/StillCaptureFlashStopRepeatingQuirk;

    .line 1195
    .line 1196
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    :cond_46
    sget-object v2, Landroidx/camera/camera2/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;->a:Ljava/util/List;

    .line 1203
    .line 1204
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v3

    .line 1208
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1209
    .line 1210
    .line 1211
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v2

    .line 1215
    const-class v3, Landroidx/camera/camera2/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;

    .line 1216
    .line 1217
    invoke-virtual {v0, v3, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v2

    .line 1221
    if-eqz v2, :cond_47

    .line 1222
    .line 1223
    new-instance v2, Landroidx/camera/camera2/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;

    .line 1224
    .line 1225
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1229
    .line 1230
    .line 1231
    :cond_47
    sget-object v2, Landroidx/camera/camera2/compat/quirk/SurfaceOrderQuirk;->a:Ljava/util/List;

    .line 1232
    .line 1233
    invoke-virtual {v10, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v2

    .line 1237
    if-nez v2, :cond_48

    .line 1238
    .line 1239
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1240
    .line 1241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    if-eqz v2, :cond_49

    .line 1249
    .line 1250
    :cond_48
    sget-object v2, Landroidx/camera/camera2/compat/quirk/SurfaceOrderQuirk;->a:Ljava/util/List;

    .line 1251
    .line 1252
    sget-object v3, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 1253
    .line 1254
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1255
    .line 1256
    .line 1257
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v5

    .line 1261
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v3

    .line 1268
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1269
    .line 1270
    .line 1271
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v2

    .line 1275
    if-eqz v2, :cond_49

    .line 1276
    .line 1277
    move v9, v6

    .line 1278
    goto :goto_1a

    .line 1279
    :cond_49
    const/4 v9, 0x0

    .line 1280
    :goto_1a
    const-class v2, Landroidx/camera/camera2/compat/quirk/SurfaceOrderQuirk;

    .line 1281
    .line 1282
    invoke-virtual {v0, v2, v9}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v2

    .line 1286
    if-eqz v2, :cond_4a

    .line 1287
    .line 1288
    new-instance v2, Landroidx/camera/camera2/compat/quirk/SurfaceOrderQuirk;

    .line 1289
    .line 1290
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1294
    .line 1295
    .line 1296
    :cond_4a
    const-class v2, Landroidx/camera/camera2/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    .line 1297
    .line 1298
    const/4 v9, 0x0

    .line 1299
    invoke-virtual {v0, v2, v9}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v2

    .line 1303
    if-eqz v2, :cond_4b

    .line 1304
    .line 1305
    new-instance v2, Landroidx/camera/camera2/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    .line 1306
    .line 1307
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    :cond_4b
    sget-object v2, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;->a:Ljava/util/List;

    .line 1314
    .line 1315
    invoke-virtual {v10, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1316
    .line 1317
    .line 1318
    move-result v2

    .line 1319
    if-nez v2, :cond_4c

    .line 1320
    .line 1321
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1322
    .line 1323
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v1

    .line 1330
    if-eqz v1, :cond_4d

    .line 1331
    .line 1332
    :cond_4c
    sget-object v1, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;->a:Ljava/util/List;

    .line 1333
    .line 1334
    invoke-static {v1}, La/n8n0;->i(Ljava/util/List;)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v1

    .line 1338
    if-eqz v1, :cond_4d

    .line 1339
    .line 1340
    goto :goto_1b

    .line 1341
    :cond_4d
    invoke-virtual {v10, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v1

    .line 1345
    if-nez v1, :cond_4e

    .line 1346
    .line 1347
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1348
    .line 1349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v1, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v1

    .line 1356
    if-eqz v1, :cond_4f

    .line 1357
    .line 1358
    :cond_4e
    sget-object v1, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;->b:Ljava/util/List;

    .line 1359
    .line 1360
    invoke-static {v1}, La/n8n0;->i(Ljava/util/List;)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v1

    .line 1364
    if-eqz v1, :cond_4f

    .line 1365
    .line 1366
    :goto_1b
    move v5, v6

    .line 1367
    goto :goto_1c

    .line 1368
    :cond_4f
    move v5, v9

    .line 1369
    :goto_1c
    const-class v1, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;

    .line 1370
    .line 1371
    invoke-virtual {v0, v1, v5}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v1

    .line 1375
    if-eqz v1, :cond_50

    .line 1376
    .line 1377
    new-instance v1, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;

    .line 1378
    .line 1379
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    :cond_50
    sget-object v1, Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;->a:Ljava/util/Map;

    .line 1386
    .line 1387
    invoke-virtual {v11, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v2

    .line 1391
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1392
    .line 1393
    .line 1394
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1395
    .line 1396
    .line 1397
    move-result v1

    .line 1398
    const-class v2, Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;

    .line 1399
    .line 1400
    invoke-virtual {v0, v2, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1401
    .line 1402
    .line 1403
    move-result v1

    .line 1404
    if-eqz v1, :cond_51

    .line 1405
    .line 1406
    new-instance v1, Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;

    .line 1407
    .line 1408
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1412
    .line 1413
    .line 1414
    :cond_51
    const-class v1, Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;

    .line 1415
    .line 1416
    sget-boolean v2, Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;->b:Z

    .line 1417
    .line 1418
    invoke-virtual {v0, v1, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v0

    .line 1422
    if-eqz v0, :cond_52

    .line 1423
    .line 1424
    sget-object v0, Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;->a:Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;

    .line 1425
    .line 1426
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1427
    .line 1428
    .line 1429
    :cond_52
    invoke-direct {v7, v8}, La/kpd0;-><init>(Ljava/util/ArrayList;)V

    .line 1430
    .line 1431
    .line 1432
    sput-object v7, La/mhk;->a:La/kpd0;

    .line 1433
    .line 1434
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    invoke-static {v0}, La/kpd0;->d(La/kpd0;)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    const-string v1, "camera2 DeviceQuirks = "

    .line 1443
    .line 1444
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v0

    .line 1448
    invoke-static {v4, v0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 1449
    .line 1450
    .line 1451
    :goto_1d
    return-void

    .line 1452
    :pswitch_1
    const/4 v9, 0x0

    .line 1453
    move-object/from16 v0, p1

    .line 1454
    .line 1455
    check-cast v0, La/hpd0;

    .line 1456
    .line 1457
    new-instance v1, La/kpd0;

    .line 1458
    .line 1459
    new-instance v2, Ljava/util/ArrayList;

    .line 1460
    .line 1461
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1462
    .line 1463
    .line 1464
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1465
    .line 1466
    if-ge v5, v3, :cond_56

    .line 1467
    .line 1468
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1469
    .line 1470
    const-string v5, "SAMSUNG"

    .line 1471
    .line 1472
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1473
    .line 1474
    .line 1475
    move-result v5

    .line 1476
    if-eqz v5, :cond_53

    .line 1477
    .line 1478
    sget-object v5, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1479
    .line 1480
    const-string v7, "F2Q"

    .line 1481
    .line 1482
    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v7

    .line 1486
    if-nez v7, :cond_55

    .line 1487
    .line 1488
    const-string v7, "Q2Q"

    .line 1489
    .line 1490
    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1491
    .line 1492
    .line 1493
    move-result v5

    .line 1494
    if-eqz v5, :cond_53

    .line 1495
    .line 1496
    goto :goto_1e

    .line 1497
    :cond_53
    const-string v5, "OPPO"

    .line 1498
    .line 1499
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1500
    .line 1501
    .line 1502
    move-result v5

    .line 1503
    if-eqz v5, :cond_54

    .line 1504
    .line 1505
    const-string v5, "OP4E75L1"

    .line 1506
    .line 1507
    sget-object v7, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1508
    .line 1509
    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v5

    .line 1513
    if-eqz v5, :cond_54

    .line 1514
    .line 1515
    goto :goto_1e

    .line 1516
    :cond_54
    const-string v5, "LENOVO"

    .line 1517
    .line 1518
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1519
    .line 1520
    .line 1521
    move-result v3

    .line 1522
    if-eqz v3, :cond_56

    .line 1523
    .line 1524
    const-string v3, "Q706F"

    .line 1525
    .line 1526
    sget-object v5, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1527
    .line 1528
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v3

    .line 1532
    if-eqz v3, :cond_56

    .line 1533
    .line 1534
    :cond_55
    :goto_1e
    move v3, v6

    .line 1535
    goto :goto_1f

    .line 1536
    :cond_56
    move v3, v9

    .line 1537
    :goto_1f
    const-class v5, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;

    .line 1538
    .line 1539
    invoke-virtual {v0, v5, v3}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1540
    .line 1541
    .line 1542
    move-result v3

    .line 1543
    if-eqz v3, :cond_57

    .line 1544
    .line 1545
    new-instance v3, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;

    .line 1546
    .line 1547
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1551
    .line 1552
    .line 1553
    :cond_57
    const-string v3, "XIAOMI"

    .line 1554
    .line 1555
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1556
    .line 1557
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v3

    .line 1561
    if-eqz v3, :cond_58

    .line 1562
    .line 1563
    const-string v3, "M2101K7AG"

    .line 1564
    .line 1565
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1566
    .line 1567
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1568
    .line 1569
    .line 1570
    move-result v3

    .line 1571
    if-eqz v3, :cond_58

    .line 1572
    .line 1573
    move v5, v6

    .line 1574
    goto :goto_20

    .line 1575
    :cond_58
    move v5, v9

    .line 1576
    :goto_20
    const-class v3, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;

    .line 1577
    .line 1578
    invoke-virtual {v0, v3, v5}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v0

    .line 1582
    if-eqz v0, :cond_59

    .line 1583
    .line 1584
    new-instance v0, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;

    .line 1585
    .line 1586
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1590
    .line 1591
    .line 1592
    :cond_59
    invoke-direct {v1, v2}, La/kpd0;-><init>(Ljava/util/ArrayList;)V

    .line 1593
    .line 1594
    .line 1595
    sput-object v1, La/lhk;->a:La/kpd0;

    .line 1596
    .line 1597
    sget-object v0, La/lhk;->a:La/kpd0;

    .line 1598
    .line 1599
    invoke-static {v0}, La/kpd0;->d(La/kpd0;)Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    const-string v1, "view DeviceQuirks = "

    .line 1604
    .line 1605
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    invoke-static {v4, v0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 1610
    .line 1611
    .line 1612
    return-void

    .line 1613
    :pswitch_2
    const/4 v9, 0x0

    .line 1614
    move-object/from16 v0, p1

    .line 1615
    .line 1616
    check-cast v0, La/hpd0;

    .line 1617
    .line 1618
    new-instance v3, La/kpd0;

    .line 1619
    .line 1620
    new-instance v5, Ljava/util/ArrayList;

    .line 1621
    .line 1622
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1623
    .line 1624
    .line 1625
    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1626
    .line 1627
    const-string v8, "HUAWEI"

    .line 1628
    .line 1629
    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1630
    .line 1631
    .line 1632
    move-result v8

    .line 1633
    if-eqz v8, :cond_5a

    .line 1634
    .line 1635
    const-string v8, "SNE-LX1"

    .line 1636
    .line 1637
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1638
    .line 1639
    invoke-virtual {v8, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1640
    .line 1641
    .line 1642
    move-result v8

    .line 1643
    if-eqz v8, :cond_5a

    .line 1644
    .line 1645
    goto :goto_21

    .line 1646
    :cond_5a
    const-string v8, "HONOR"

    .line 1647
    .line 1648
    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1649
    .line 1650
    .line 1651
    move-result v8

    .line 1652
    if-eqz v8, :cond_5b

    .line 1653
    .line 1654
    const-string v8, "STK-LX1"

    .line 1655
    .line 1656
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1657
    .line 1658
    invoke-virtual {v8, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1659
    .line 1660
    .line 1661
    move-result v8

    .line 1662
    if-eqz v8, :cond_5b

    .line 1663
    .line 1664
    :goto_21
    move v8, v6

    .line 1665
    goto :goto_22

    .line 1666
    :cond_5b
    move v8, v9

    .line 1667
    :goto_22
    const-class v10, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 1668
    .line 1669
    invoke-virtual {v0, v10, v8}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1670
    .line 1671
    .line 1672
    move-result v8

    .line 1673
    if-eqz v8, :cond_5c

    .line 1674
    .line 1675
    new-instance v8, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 1676
    .line 1677
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1681
    .line 1682
    .line 1683
    :cond_5c
    const-class v8, Landroidx/camera/core/internal/compat/quirk/SurfaceOrderQuirk;

    .line 1684
    .line 1685
    invoke-virtual {v0, v8, v6}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1686
    .line 1687
    .line 1688
    move-result v8

    .line 1689
    if-eqz v8, :cond_5d

    .line 1690
    .line 1691
    new-instance v8, Landroidx/camera/core/internal/compat/quirk/SurfaceOrderQuirk;

    .line 1692
    .line 1693
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1694
    .line 1695
    .line 1696
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1697
    .line 1698
    .line 1699
    :cond_5d
    sget-object v8, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;->a:Ljava/util/HashSet;

    .line 1700
    .line 1701
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1702
    .line 1703
    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v10

    .line 1707
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1708
    .line 1709
    invoke-virtual {v11, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v12

    .line 1713
    sget-object v13, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;->a:Ljava/util/HashSet;

    .line 1714
    .line 1715
    invoke-static {v10, v12}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v10

    .line 1719
    invoke-virtual {v13, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1720
    .line 1721
    .line 1722
    move-result v10

    .line 1723
    const-class v12, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 1724
    .line 1725
    invoke-virtual {v0, v12, v10}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1726
    .line 1727
    .line 1728
    move-result v10

    .line 1729
    if-eqz v10, :cond_5e

    .line 1730
    .line 1731
    new-instance v10, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 1732
    .line 1733
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 1734
    .line 1735
    .line 1736
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1737
    .line 1738
    .line 1739
    :cond_5e
    sget-object v10, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;->a:Ljava/util/HashSet;

    .line 1740
    .line 1741
    invoke-virtual {v11, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v12

    .line 1745
    invoke-virtual {v10, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1746
    .line 1747
    .line 1748
    move-result v10

    .line 1749
    const-class v12, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    .line 1750
    .line 1751
    invoke-virtual {v0, v12, v10}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1752
    .line 1753
    .line 1754
    move-result v10

    .line 1755
    if-eqz v10, :cond_5f

    .line 1756
    .line 1757
    new-instance v10, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    .line 1758
    .line 1759
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1763
    .line 1764
    .line 1765
    :cond_5f
    sget-object v10, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->a:Ljava/util/HashSet;

    .line 1766
    .line 1767
    invoke-virtual {v1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1768
    .line 1769
    .line 1770
    move-result v10

    .line 1771
    if-nez v10, :cond_61

    .line 1772
    .line 1773
    invoke-virtual {v2, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1774
    .line 1775
    .line 1776
    move-result v2

    .line 1777
    if-eqz v2, :cond_60

    .line 1778
    .line 1779
    sget-object v2, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->a:Ljava/util/HashSet;

    .line 1780
    .line 1781
    invoke-virtual {v11, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v10

    .line 1785
    invoke-virtual {v2, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1786
    .line 1787
    .line 1788
    move-result v2

    .line 1789
    if-eqz v2, :cond_60

    .line 1790
    .line 1791
    goto :goto_23

    .line 1792
    :cond_60
    move v2, v9

    .line 1793
    goto :goto_24

    .line 1794
    :cond_61
    :goto_23
    move v2, v6

    .line 1795
    :goto_24
    const-class v10, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 1796
    .line 1797
    invoke-virtual {v0, v10, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1798
    .line 1799
    .line 1800
    move-result v2

    .line 1801
    if-eqz v2, :cond_62

    .line 1802
    .line 1803
    new-instance v2, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 1804
    .line 1805
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1809
    .line 1810
    .line 1811
    :cond_62
    sget-object v2, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;->a:Ljava/util/HashSet;

    .line 1812
    .line 1813
    invoke-virtual {v1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1814
    .line 1815
    .line 1816
    move-result v1

    .line 1817
    if-eqz v1, :cond_63

    .line 1818
    .line 1819
    sget-object v1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;->a:Ljava/util/HashSet;

    .line 1820
    .line 1821
    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1822
    .line 1823
    invoke-virtual {v2, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v2

    .line 1827
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v1

    .line 1831
    if-eqz v1, :cond_63

    .line 1832
    .line 1833
    move v1, v6

    .line 1834
    goto :goto_25

    .line 1835
    :cond_63
    move v1, v9

    .line 1836
    :goto_25
    const-class v2, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 1837
    .line 1838
    invoke-virtual {v0, v2, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1839
    .line 1840
    .line 1841
    move-result v1

    .line 1842
    if-eqz v1, :cond_64

    .line 1843
    .line 1844
    new-instance v1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 1845
    .line 1846
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1850
    .line 1851
    .line 1852
    :cond_64
    sget-object v1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->a:Ljava/util/HashSet;

    .line 1853
    .line 1854
    const-string v1, "oneplus"

    .line 1855
    .line 1856
    invoke-virtual {v1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1857
    .line 1858
    .line 1859
    move-result v1

    .line 1860
    if-eqz v1, :cond_65

    .line 1861
    .line 1862
    const-string v1, "cph2583"

    .line 1863
    .line 1864
    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1865
    .line 1866
    .line 1867
    move-result v1

    .line 1868
    if-eqz v1, :cond_65

    .line 1869
    .line 1870
    goto :goto_26

    .line 1871
    :cond_65
    const-string v1, "google"

    .line 1872
    .line 1873
    invoke-virtual {v1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1874
    .line 1875
    .line 1876
    move-result v1

    .line 1877
    if-eqz v1, :cond_66

    .line 1878
    .line 1879
    sget-object v1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->a:Ljava/util/HashSet;

    .line 1880
    .line 1881
    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v2

    .line 1885
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1886
    .line 1887
    .line 1888
    move-result v1

    .line 1889
    if-eqz v1, :cond_66

    .line 1890
    .line 1891
    :goto_26
    move v1, v6

    .line 1892
    goto :goto_27

    .line 1893
    :cond_66
    move v1, v9

    .line 1894
    :goto_27
    const-class v2, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    .line 1895
    .line 1896
    invoke-virtual {v0, v2, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1897
    .line 1898
    .line 1899
    move-result v1

    .line 1900
    if-eqz v1, :cond_67

    .line 1901
    .line 1902
    new-instance v1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    .line 1903
    .line 1904
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1905
    .line 1906
    .line 1907
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1908
    .line 1909
    .line 1910
    :cond_67
    sget-object v1, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;->a:Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    .line 1911
    .line 1912
    const-string v2, "motorola"

    .line 1913
    .line 1914
    invoke-virtual {v2, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1915
    .line 1916
    .line 1917
    move-result v2

    .line 1918
    if-eqz v2, :cond_68

    .line 1919
    .line 1920
    const-string v2, "moto e20"

    .line 1921
    .line 1922
    invoke-virtual {v2, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1923
    .line 1924
    .line 1925
    move-result v2

    .line 1926
    if-eqz v2, :cond_68

    .line 1927
    .line 1928
    goto :goto_28

    .line 1929
    :cond_68
    move v6, v9

    .line 1930
    :goto_28
    const-class v2, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    .line 1931
    .line 1932
    invoke-virtual {v0, v2, v6}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1933
    .line 1934
    .line 1935
    move-result v0

    .line 1936
    if-eqz v0, :cond_69

    .line 1937
    .line 1938
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1939
    .line 1940
    .line 1941
    :cond_69
    invoke-direct {v3, v5}, La/kpd0;-><init>(Ljava/util/ArrayList;)V

    .line 1942
    .line 1943
    .line 1944
    sput-object v3, La/khk;->a:La/kpd0;

    .line 1945
    .line 1946
    sget-object v0, La/khk;->a:La/kpd0;

    .line 1947
    .line 1948
    invoke-static {v0}, La/kpd0;->d(La/kpd0;)Ljava/lang/String;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v0

    .line 1952
    const-string v1, "core DeviceQuirks = "

    .line 1953
    .line 1954
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v0

    .line 1958
    invoke-static {v4, v0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 1959
    .line 1960
    .line 1961
    return-void

    .line 1962
    nop

    .line 1963
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
