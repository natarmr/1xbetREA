.class public final synthetic La/vb8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/et8;Z)V
    .locals 0

    .line 1
    const/4 p2, 0x7

    iput-byte p2, p0, La/vb8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vb8;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/vb8;->a:B

    iput-object p1, p0, La/vb8;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/vb8;->a:B

    .line 2
    .line 3
    const-string v1, "CXCP"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "viewModelFactory"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/vb8;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/i2a;

    .line 15
    .line 16
    sget-object v0, La/ipd0;->c:La/ipd0;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v0, v0, La/ipd0;->a:La/hng;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    .line 23
    :try_start_1
    iget-object v0, v0, La/hng;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v3, v0, La/c55;

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    new-instance v0, La/m3x;

    .line 37
    .line 38
    invoke-direct {v0, v4, v5}, La/m3x;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v0}, La/ro4;->a0(Ljava/lang/Object;)La/m3x;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 46
    :goto_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/hpd0;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v3, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, La/i2a;->a:La/c1a;

    .line 61
    .line 62
    if-nez v4, :cond_2

    .line 63
    .line 64
    invoke-static {}, La/l8x;->g0()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    const-string p0, "Failed to enable quirks: camera metadata injection failed"

    .line 71
    .line 72
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :cond_1
    new-instance p0, La/kpd0;

    .line 76
    .line 77
    invoke-direct {p0, v3}, La/kpd0;-><init>(Ljava/util/ArrayList;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_23

    .line 81
    .line 82
    :cond_2
    sget-object v1, La/c1a;->a0:La/b1a;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, La/b1a;->c(La/c1a;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const-class v6, Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;

    .line 92
    .line 93
    invoke-virtual {v0, v6, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    new-instance v1, Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;

    .line 100
    .line 101
    invoke-direct {v1, v4}, Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;-><init>(La/c1a;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    :cond_3
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    const-string v6, "Samsung"

    .line 113
    .line 114
    invoke-virtual {v1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_4

    .line 119
    .line 120
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    :cond_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    const/16 v7, 0x21

    .line 134
    .line 135
    if-ge v1, v7, :cond_6

    .line 136
    .line 137
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-object v7, v4

    .line 143
    check-cast v7, La/ow9;

    .line 144
    .line 145
    invoke-virtual {v7, v1}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Ljava/lang/Integer;

    .line 150
    .line 151
    if-nez v1, :cond_5

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_6

    .line 159
    .line 160
    move v1, v5

    .line 161
    goto :goto_2

    .line 162
    :cond_6
    :goto_1
    move v1, v2

    .line 163
    :goto_2
    const-class v7, Landroidx/camera/camera2/compat/quirk/AfRegionFlipHorizontallyQuirk;

    .line 164
    .line 165
    invoke-virtual {v0, v7, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_7

    .line 170
    .line 171
    new-instance v1, Landroidx/camera/camera2/compat/quirk/AfRegionFlipHorizontallyQuirk;

    .line 172
    .line 173
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    :cond_7
    invoke-static {v4}, La/b1a;->c(La/c1a;)Z

    .line 180
    .line 181
    .line 182
    const-class v1, Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 183
    .line 184
    invoke-virtual {v0, v1, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_8

    .line 189
    .line 190
    new-instance v1, Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 191
    .line 192
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    :cond_8
    const-class v1, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;

    .line 199
    .line 200
    invoke-static {v4}, La/b1a;->c(La/c1a;)Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    invoke-virtual {v0, v1, v7}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_9

    .line 209
    .line 210
    new-instance v1, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;

    .line 211
    .line 212
    iget-object p0, p0, La/i2a;->b:La/erm0;

    .line 213
    .line 214
    invoke-direct {v1, p0}, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;-><init>(La/erm0;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    :cond_9
    sget-object p0, Landroidx/camera/camera2/compat/quirk/CameraNoResponseWhenEnablingFlashQuirk;->a:Ljava/util/List;

    .line 221
    .line 222
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 228
    .line 229
    invoke-virtual {v1, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-interface {p0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    if-eqz p0, :cond_b

    .line 241
    .line 242
    sget-object p0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-object v1, v4

    .line 248
    check-cast v1, La/ow9;

    .line 249
    .line 250
    invoke-virtual {v1, p0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    check-cast p0, Ljava/lang/Integer;

    .line 255
    .line 256
    if-nez p0, :cond_a

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result p0

    .line 263
    if-ne p0, v5, :cond_b

    .line 264
    .line 265
    move p0, v5

    .line 266
    goto :goto_4

    .line 267
    :cond_b
    :goto_3
    move p0, v2

    .line 268
    :goto_4
    const-class v1, Landroidx/camera/camera2/compat/quirk/CameraNoResponseWhenEnablingFlashQuirk;

    .line 269
    .line 270
    invoke-virtual {v0, v1, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    if-eqz p0, :cond_c

    .line 275
    .line 276
    new-instance p0, Landroidx/camera/camera2/compat/quirk/CameraNoResponseWhenEnablingFlashQuirk;

    .line 277
    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    :cond_c
    const-class p0, Landroidx/camera/camera2/compat/quirk/CaptureSessionStuckQuirk;

    .line 285
    .line 286
    invoke-virtual {v0, p0, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    if-eqz p0, :cond_d

    .line 291
    .line 292
    new-instance p0, Landroidx/camera/camera2/compat/quirk/CaptureSessionStuckQuirk;

    .line 293
    .line 294
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    :cond_d
    const-class p0, Landroidx/camera/camera2/compat/quirk/CloseCaptureSessionOnVideoQuirk;

    .line 301
    .line 302
    invoke-virtual {v0, p0, v5}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    if-eqz p0, :cond_e

    .line 307
    .line 308
    new-instance p0, Landroidx/camera/camera2/compat/quirk/CloseCaptureSessionOnVideoQuirk;

    .line 309
    .line 310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    :cond_e
    const-class p0, Landroidx/camera/camera2/compat/quirk/ConfigureSurfaceToSecondarySessionFailQuirk;

    .line 317
    .line 318
    invoke-static {v4}, La/b1a;->c(La/c1a;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-virtual {v0, p0, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 323
    .line 324
    .line 325
    move-result p0

    .line 326
    if-eqz p0, :cond_f

    .line 327
    .line 328
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ConfigureSurfaceToSecondarySessionFailQuirk;

    .line 329
    .line 330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    :cond_f
    const-class p0, Landroidx/camera/camera2/compat/quirk/FinalizeSessionOnCloseQuirk;

    .line 337
    .line 338
    invoke-virtual {v0, p0, v5}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 339
    .line 340
    .line 341
    move-result p0

    .line 342
    if-eqz p0, :cond_10

    .line 343
    .line 344
    new-instance p0, Landroidx/camera/camera2/compat/quirk/FinalizeSessionOnCloseQuirk;

    .line 345
    .line 346
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    :cond_10
    sget-object p0, Landroidx/camera/camera2/compat/quirk/FlashTooSlowQuirk;->a:Ljava/util/List;

    .line 353
    .line 354
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    :cond_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    if-eqz v1, :cond_13

    .line 363
    .line 364
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, Ljava/lang/String;

    .line 369
    .line 370
    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 376
    .line 377
    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-static {v7, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_11

    .line 389
    .line 390
    sget-object p0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 391
    .line 392
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-object v1, v4

    .line 396
    check-cast v1, La/ow9;

    .line 397
    .line 398
    invoke-virtual {v1, p0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    check-cast p0, Ljava/lang/Integer;

    .line 403
    .line 404
    if-nez p0, :cond_12

    .line 405
    .line 406
    goto :goto_5

    .line 407
    :cond_12
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 408
    .line 409
    .line 410
    move-result p0

    .line 411
    if-ne p0, v5, :cond_13

    .line 412
    .line 413
    move p0, v5

    .line 414
    goto :goto_6

    .line 415
    :cond_13
    :goto_5
    move p0, v2

    .line 416
    :goto_6
    const-class v1, Landroidx/camera/camera2/compat/quirk/FlashTooSlowQuirk;

    .line 417
    .line 418
    invoke-virtual {v0, v1, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 419
    .line 420
    .line 421
    move-result p0

    .line 422
    if-eqz p0, :cond_14

    .line 423
    .line 424
    new-instance p0, Landroidx/camera/camera2/compat/quirk/FlashTooSlowQuirk;

    .line 425
    .line 426
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    :cond_14
    sget-object p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailWithAutoFlashQuirk;->a:Ljava/util/List;

    .line 433
    .line 434
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 440
    .line 441
    invoke-virtual {v1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v8

    .line 445
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-interface {p0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result p0

    .line 452
    if-eqz p0, :cond_16

    .line 453
    .line 454
    sget-object p0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 455
    .line 456
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-object v8, v4

    .line 460
    check-cast v8, La/ow9;

    .line 461
    .line 462
    invoke-virtual {v8, p0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    check-cast p0, Ljava/lang/Integer;

    .line 467
    .line 468
    if-nez p0, :cond_15

    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_15
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 472
    .line 473
    .line 474
    move-result p0

    .line 475
    if-nez p0, :cond_16

    .line 476
    .line 477
    move p0, v5

    .line 478
    goto :goto_8

    .line 479
    :cond_16
    :goto_7
    move p0, v2

    .line 480
    :goto_8
    const-class v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailWithAutoFlashQuirk;

    .line 481
    .line 482
    invoke-virtual {v0, v8, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 483
    .line 484
    .line 485
    move-result p0

    .line 486
    if-eqz p0, :cond_17

    .line 487
    .line 488
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailWithAutoFlashQuirk;

    .line 489
    .line 490
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    :cond_17
    sget-object p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;->b:Ljava/util/List;

    .line 497
    .line 498
    invoke-virtual {v1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v8

    .line 502
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    invoke-interface {p0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result p0

    .line 509
    if-eqz p0, :cond_19

    .line 510
    .line 511
    sget-object p0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 512
    .line 513
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    move-object v8, v4

    .line 517
    check-cast v8, La/ow9;

    .line 518
    .line 519
    invoke-virtual {v8, p0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    check-cast p0, Ljava/lang/Integer;

    .line 524
    .line 525
    if-nez p0, :cond_18

    .line 526
    .line 527
    goto :goto_9

    .line 528
    :cond_18
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result p0

    .line 532
    if-nez p0, :cond_19

    .line 533
    .line 534
    move p0, v5

    .line 535
    goto :goto_a

    .line 536
    :cond_19
    :goto_9
    move p0, v2

    .line 537
    :goto_a
    sget-object v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;->a:Ljava/util/List;

    .line 538
    .line 539
    invoke-virtual {v1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v9

    .line 543
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v8

    .line 550
    if-nez p0, :cond_1b

    .line 551
    .line 552
    if-eqz v8, :cond_1a

    .line 553
    .line 554
    goto :goto_b

    .line 555
    :cond_1a
    move p0, v2

    .line 556
    goto :goto_c

    .line 557
    :cond_1b
    :goto_b
    move p0, v5

    .line 558
    :goto_c
    const-class v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;

    .line 559
    .line 560
    invoke-virtual {v0, v8, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 561
    .line 562
    .line 563
    move-result p0

    .line 564
    if-eqz p0, :cond_1c

    .line 565
    .line 566
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;

    .line 567
    .line 568
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    :cond_1c
    sget-object p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureWashedOutImageQuirk;->a:Ljava/util/List;

    .line 575
    .line 576
    invoke-virtual {v1, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-interface {p0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result p0

    .line 587
    if-eqz p0, :cond_1e

    .line 588
    .line 589
    sget-object p0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 590
    .line 591
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    move-object v8, v4

    .line 595
    check-cast v8, La/ow9;

    .line 596
    .line 597
    invoke-virtual {v8, p0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object p0

    .line 601
    check-cast p0, Ljava/lang/Integer;

    .line 602
    .line 603
    if-nez p0, :cond_1d

    .line 604
    .line 605
    goto :goto_d

    .line 606
    :cond_1d
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 607
    .line 608
    .line 609
    move-result p0

    .line 610
    if-ne p0, v5, :cond_1e

    .line 611
    .line 612
    move p0, v5

    .line 613
    goto :goto_e

    .line 614
    :cond_1e
    :goto_d
    move p0, v2

    .line 615
    :goto_e
    const-class v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureWashedOutImageQuirk;

    .line 616
    .line 617
    invoke-virtual {v0, v8, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 618
    .line 619
    .line 620
    move-result p0

    .line 621
    if-eqz p0, :cond_1f

    .line 622
    .line 623
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureWashedOutImageQuirk;

    .line 624
    .line 625
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    :cond_1f
    sget-object p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureWithFlashUnderexposureQuirk;->a:Ljava/util/List;

    .line 632
    .line 633
    invoke-virtual {v1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v8

    .line 637
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    invoke-interface {p0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result p0

    .line 644
    if-eqz p0, :cond_21

    .line 645
    .line 646
    sget-object p0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 647
    .line 648
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    move-object v8, v4

    .line 652
    check-cast v8, La/ow9;

    .line 653
    .line 654
    invoke-virtual {v8, p0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object p0

    .line 658
    check-cast p0, Ljava/lang/Integer;

    .line 659
    .line 660
    if-nez p0, :cond_20

    .line 661
    .line 662
    goto :goto_f

    .line 663
    :cond_20
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 664
    .line 665
    .line 666
    move-result p0

    .line 667
    if-ne p0, v5, :cond_21

    .line 668
    .line 669
    move p0, v5

    .line 670
    goto :goto_10

    .line 671
    :cond_21
    :goto_f
    move p0, v2

    .line 672
    :goto_10
    const-class v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureWithFlashUnderexposureQuirk;

    .line 673
    .line 674
    invoke-virtual {v0, v8, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 675
    .line 676
    .line 677
    move-result p0

    .line 678
    if-eqz p0, :cond_22

    .line 679
    .line 680
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureWithFlashUnderexposureQuirk;

    .line 681
    .line 682
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    :cond_22
    sget-object p0, Landroidx/camera/camera2/compat/quirk/JpegHalCorruptImageQuirk;->a:Ljava/util/List;

    .line 689
    .line 690
    sget-object v8, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 691
    .line 692
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v8, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v8

    .line 699
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    invoke-interface {p0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result p0

    .line 706
    const-class v8, Landroidx/camera/camera2/compat/quirk/JpegHalCorruptImageQuirk;

    .line 707
    .line 708
    invoke-virtual {v0, v8, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 709
    .line 710
    .line 711
    move-result p0

    .line 712
    if-eqz p0, :cond_23

    .line 713
    .line 714
    new-instance p0, Landroidx/camera/camera2/compat/quirk/JpegHalCorruptImageQuirk;

    .line 715
    .line 716
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    :cond_23
    sget-object p0, Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;->a:Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;

    .line 723
    .line 724
    sget-object v8, Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;->b:Ljava/util/Set;

    .line 725
    .line 726
    invoke-virtual {v1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    invoke-interface {v8, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    move-result v1

    .line 737
    if-eqz v1, :cond_25

    .line 738
    .line 739
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 740
    .line 741
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    move-object v7, v4

    .line 745
    check-cast v7, La/ow9;

    .line 746
    .line 747
    invoke-virtual {v7, v1}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    check-cast v1, Ljava/lang/Integer;

    .line 752
    .line 753
    if-nez v1, :cond_24

    .line 754
    .line 755
    goto :goto_11

    .line 756
    :cond_24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 757
    .line 758
    .line 759
    move-result v1

    .line 760
    if-nez v1, :cond_25

    .line 761
    .line 762
    move v1, v5

    .line 763
    goto :goto_12

    .line 764
    :cond_25
    :goto_11
    move v1, v2

    .line 765
    :goto_12
    const-class v7, Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;

    .line 766
    .line 767
    invoke-virtual {v0, v7, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    if-eqz v1, :cond_26

    .line 772
    .line 773
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    :cond_26
    sget-object p0, La/c1a;->a0:La/b1a;

    .line 777
    .line 778
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    invoke-static {v4}, La/b1a;->c(La/c1a;)Z

    .line 782
    .line 783
    .line 784
    move-result p0

    .line 785
    const-class v1, Landroidx/camera/camera2/compat/quirk/PreviewOrientationIncorrectQuirk;

    .line 786
    .line 787
    invoke-virtual {v0, v1, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 788
    .line 789
    .line 790
    move-result p0

    .line 791
    if-eqz p0, :cond_27

    .line 792
    .line 793
    new-instance p0, Landroidx/camera/camera2/compat/quirk/PreviewOrientationIncorrectQuirk;

    .line 794
    .line 795
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    :cond_27
    const-class p0, Landroidx/camera/camera2/compat/quirk/TextureViewIsClosedQuirk;

    .line 802
    .line 803
    invoke-virtual {v0, p0, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 804
    .line 805
    .line 806
    move-result p0

    .line 807
    if-eqz p0, :cond_28

    .line 808
    .line 809
    new-instance p0, Landroidx/camera/camera2/compat/quirk/TextureViewIsClosedQuirk;

    .line 810
    .line 811
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    :cond_28
    sget-object p0, Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;->a:Ljava/util/ArrayList;

    .line 818
    .line 819
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 820
    .line 821
    .line 822
    move-result-object p0

    .line 823
    :cond_29
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    if-eqz v1, :cond_2b

    .line 828
    .line 829
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    check-cast v1, Ljava/lang/String;

    .line 834
    .line 835
    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 836
    .line 837
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 841
    .line 842
    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v7

    .line 846
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v1

    .line 853
    if-eqz v1, :cond_29

    .line 854
    .line 855
    sget-object p0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 856
    .line 857
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    move-object v1, v4

    .line 861
    check-cast v1, La/ow9;

    .line 862
    .line 863
    invoke-virtual {v1, p0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object p0

    .line 867
    check-cast p0, Ljava/lang/Integer;

    .line 868
    .line 869
    if-nez p0, :cond_2a

    .line 870
    .line 871
    goto :goto_13

    .line 872
    :cond_2a
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 873
    .line 874
    .line 875
    move-result p0

    .line 876
    if-nez p0, :cond_2b

    .line 877
    .line 878
    move p0, v5

    .line 879
    goto :goto_14

    .line 880
    :cond_2b
    :goto_13
    move p0, v2

    .line 881
    :goto_14
    const-class v1, Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;

    .line 882
    .line 883
    invoke-virtual {v0, v1, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 884
    .line 885
    .line 886
    move-result p0

    .line 887
    if-eqz p0, :cond_2c

    .line 888
    .line 889
    new-instance p0, Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;

    .line 890
    .line 891
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    :cond_2c
    sget-object p0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 898
    .line 899
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    const-string v1, "Motorola"

    .line 903
    .line 904
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 905
    .line 906
    .line 907
    move-result v7

    .line 908
    if-nez v7, :cond_2d

    .line 909
    .line 910
    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 911
    .line 912
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v7, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 916
    .line 917
    .line 918
    move-result v7

    .line 919
    if-eqz v7, :cond_2e

    .line 920
    .line 921
    :cond_2d
    const-string v7, "MotoG3"

    .line 922
    .line 923
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 924
    .line 925
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 926
    .line 927
    .line 928
    move-result v7

    .line 929
    if-eqz v7, :cond_2e

    .line 930
    .line 931
    goto/16 :goto_15

    .line 932
    .line 933
    :cond_2e
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 934
    .line 935
    .line 936
    move-result v7

    .line 937
    if-nez v7, :cond_2f

    .line 938
    .line 939
    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 940
    .line 941
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 945
    .line 946
    .line 947
    move-result v7

    .line 948
    if-eqz v7, :cond_30

    .line 949
    .line 950
    :cond_2f
    const-string v7, "SM-G532F"

    .line 951
    .line 952
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 953
    .line 954
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 955
    .line 956
    .line 957
    move-result v7

    .line 958
    if-eqz v7, :cond_30

    .line 959
    .line 960
    goto/16 :goto_15

    .line 961
    .line 962
    :cond_30
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 963
    .line 964
    .line 965
    move-result v7

    .line 966
    if-nez v7, :cond_31

    .line 967
    .line 968
    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 969
    .line 970
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 974
    .line 975
    .line 976
    move-result v7

    .line 977
    if-eqz v7, :cond_32

    .line 978
    .line 979
    :cond_31
    const-string v7, "SM-J700F"

    .line 980
    .line 981
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 982
    .line 983
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 984
    .line 985
    .line 986
    move-result v7

    .line 987
    if-eqz v7, :cond_32

    .line 988
    .line 989
    goto :goto_15

    .line 990
    :cond_32
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 991
    .line 992
    .line 993
    move-result v7

    .line 994
    if-nez v7, :cond_33

    .line 995
    .line 996
    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 997
    .line 998
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1002
    .line 1003
    .line 1004
    move-result v7

    .line 1005
    if-eqz v7, :cond_34

    .line 1006
    .line 1007
    :cond_33
    const-string v7, "SM-A920F"

    .line 1008
    .line 1009
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1010
    .line 1011
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v7

    .line 1015
    if-eqz v7, :cond_34

    .line 1016
    .line 1017
    goto :goto_15

    .line 1018
    :cond_34
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v7

    .line 1022
    if-nez v7, :cond_35

    .line 1023
    .line 1024
    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1025
    .line 1026
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v7

    .line 1033
    if-eqz v7, :cond_36

    .line 1034
    .line 1035
    :cond_35
    const-string v7, "SM-J415F"

    .line 1036
    .line 1037
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1038
    .line 1039
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v7

    .line 1043
    if-eqz v7, :cond_36

    .line 1044
    .line 1045
    goto :goto_15

    .line 1046
    :cond_36
    const-string v7, "Xiaomi"

    .line 1047
    .line 1048
    invoke-virtual {p0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v8

    .line 1052
    if-nez v8, :cond_37

    .line 1053
    .line 1054
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1055
    .line 1056
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v7

    .line 1063
    if-eqz v7, :cond_38

    .line 1064
    .line 1065
    :cond_37
    const-string v7, "Mi A1"

    .line 1066
    .line 1067
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1068
    .line 1069
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v7

    .line 1073
    if-eqz v7, :cond_38

    .line 1074
    .line 1075
    :goto_15
    move v7, v5

    .line 1076
    goto :goto_16

    .line 1077
    :cond_38
    move v7, v2

    .line 1078
    :goto_16
    const-class v8, Landroidx/camera/camera2/compat/quirk/YuvImageOnePixelShiftQuirk;

    .line 1079
    .line 1080
    invoke-virtual {v0, v8, v7}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v7

    .line 1084
    if-eqz v7, :cond_39

    .line 1085
    .line 1086
    new-instance v7, Landroidx/camera/camera2/compat/quirk/YuvImageOnePixelShiftQuirk;

    .line 1087
    .line 1088
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    :cond_39
    const-string v7, "Huawei"

    .line 1095
    .line 1096
    invoke-virtual {p0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v8

    .line 1100
    if-nez v8, :cond_3a

    .line 1101
    .line 1102
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1103
    .line 1104
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1108
    .line 1109
    .line 1110
    move-result v8

    .line 1111
    if-eqz v8, :cond_3b

    .line 1112
    .line 1113
    :cond_3a
    const-string v8, "HUAWEI ALE-L04"

    .line 1114
    .line 1115
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1116
    .line 1117
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v8

    .line 1121
    if-eqz v8, :cond_3b

    .line 1122
    .line 1123
    goto/16 :goto_17

    .line 1124
    .line 1125
    :cond_3b
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v8

    .line 1129
    if-nez v8, :cond_3c

    .line 1130
    .line 1131
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1132
    .line 1133
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1137
    .line 1138
    .line 1139
    move-result v8

    .line 1140
    if-eqz v8, :cond_3d

    .line 1141
    .line 1142
    :cond_3c
    const-string v8, "sm-j320f"

    .line 1143
    .line 1144
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1145
    .line 1146
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v8

    .line 1150
    if-eqz v8, :cond_3d

    .line 1151
    .line 1152
    goto/16 :goto_17

    .line 1153
    .line 1154
    :cond_3d
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v8

    .line 1158
    if-nez v8, :cond_3e

    .line 1159
    .line 1160
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1161
    .line 1162
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v8

    .line 1169
    if-eqz v8, :cond_3f

    .line 1170
    .line 1171
    :cond_3e
    const-string v8, "sm-j700f"

    .line 1172
    .line 1173
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1174
    .line 1175
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v8

    .line 1179
    if-eqz v8, :cond_3f

    .line 1180
    .line 1181
    goto :goto_17

    .line 1182
    :cond_3f
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v8

    .line 1186
    if-nez v8, :cond_40

    .line 1187
    .line 1188
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1189
    .line 1190
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v8

    .line 1197
    if-eqz v8, :cond_41

    .line 1198
    .line 1199
    :cond_40
    const-string v8, "sm-j111f"

    .line 1200
    .line 1201
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1202
    .line 1203
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1204
    .line 1205
    .line 1206
    move-result v8

    .line 1207
    if-eqz v8, :cond_41

    .line 1208
    .line 1209
    goto :goto_17

    .line 1210
    :cond_41
    const-string v8, "Oppo"

    .line 1211
    .line 1212
    invoke-virtual {p0, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1213
    .line 1214
    .line 1215
    move-result v9

    .line 1216
    if-nez v9, :cond_42

    .line 1217
    .line 1218
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1219
    .line 1220
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v8

    .line 1227
    if-eqz v8, :cond_43

    .line 1228
    .line 1229
    :cond_42
    const-string v8, "A37F"

    .line 1230
    .line 1231
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1232
    .line 1233
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v8

    .line 1237
    if-eqz v8, :cond_43

    .line 1238
    .line 1239
    goto :goto_17

    .line 1240
    :cond_43
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v8

    .line 1244
    if-nez v8, :cond_44

    .line 1245
    .line 1246
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1247
    .line 1248
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v8

    .line 1255
    if-eqz v8, :cond_45

    .line 1256
    .line 1257
    :cond_44
    const-string v8, "sm-j510fn"

    .line 1258
    .line 1259
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1260
    .line 1261
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v8

    .line 1265
    if-eqz v8, :cond_45

    .line 1266
    .line 1267
    :goto_17
    move v8, v5

    .line 1268
    goto :goto_18

    .line 1269
    :cond_45
    move v8, v2

    .line 1270
    :goto_18
    const-class v9, Landroidx/camera/camera2/compat/quirk/PreviewStretchWhenVideoCaptureIsBoundQuirk;

    .line 1271
    .line 1272
    invoke-virtual {v0, v9, v8}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v8

    .line 1276
    if-eqz v8, :cond_46

    .line 1277
    .line 1278
    new-instance v8, Landroidx/camera/camera2/compat/quirk/PreviewStretchWhenVideoCaptureIsBoundQuirk;

    .line 1279
    .line 1280
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    :cond_46
    invoke-virtual {p0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1287
    .line 1288
    .line 1289
    move-result v8

    .line 1290
    if-nez v8, :cond_48

    .line 1291
    .line 1292
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1293
    .line 1294
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v8

    .line 1301
    if-eqz v8, :cond_47

    .line 1302
    .line 1303
    goto :goto_19

    .line 1304
    :cond_47
    move v8, v2

    .line 1305
    goto :goto_1a

    .line 1306
    :cond_48
    :goto_19
    move v8, v5

    .line 1307
    :goto_1a
    const-class v9, Landroidx/camera/camera2/compat/quirk/PreviewDelayWhenVideoCaptureIsBoundQuirk;

    .line 1308
    .line 1309
    invoke-virtual {v0, v9, v8}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v8

    .line 1313
    if-eqz v8, :cond_49

    .line 1314
    .line 1315
    new-instance v8, Landroidx/camera/camera2/compat/quirk/PreviewDelayWhenVideoCaptureIsBoundQuirk;

    .line 1316
    .line 1317
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1321
    .line 1322
    .line 1323
    :cond_49
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1324
    .line 1325
    .line 1326
    move-result v8

    .line 1327
    if-nez v8, :cond_4a

    .line 1328
    .line 1329
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1330
    .line 1331
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v8

    .line 1338
    if-eqz v8, :cond_4b

    .line 1339
    .line 1340
    :cond_4a
    sget-object v8, La/c1a;->a0:La/b1a;

    .line 1341
    .line 1342
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1343
    .line 1344
    .line 1345
    invoke-static {v4}, La/b1a;->c(La/c1a;)Z

    .line 1346
    .line 1347
    .line 1348
    move-result v8

    .line 1349
    if-eqz v8, :cond_4b

    .line 1350
    .line 1351
    move v8, v5

    .line 1352
    goto :goto_1b

    .line 1353
    :cond_4b
    move v8, v2

    .line 1354
    :goto_1b
    const-class v9, Landroidx/camera/camera2/compat/quirk/QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;

    .line 1355
    .line 1356
    invoke-virtual {v0, v9, v8}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1357
    .line 1358
    .line 1359
    move-result v8

    .line 1360
    if-eqz v8, :cond_4c

    .line 1361
    .line 1362
    new-instance v8, Landroidx/camera/camera2/compat/quirk/QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;

    .line 1363
    .line 1364
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1368
    .line 1369
    .line 1370
    :cond_4c
    invoke-static {}, La/pzw;->L()Z

    .line 1371
    .line 1372
    .line 1373
    move-result v8

    .line 1374
    if-nez v8, :cond_55

    .line 1375
    .line 1376
    invoke-static {}, La/pzw;->M()Z

    .line 1377
    .line 1378
    .line 1379
    move-result v8

    .line 1380
    if-nez v8, :cond_55

    .line 1381
    .line 1382
    invoke-static {}, La/pzw;->P()Z

    .line 1383
    .line 1384
    .line 1385
    move-result v8

    .line 1386
    if-nez v8, :cond_55

    .line 1387
    .line 1388
    invoke-static {}, La/pzw;->N()Z

    .line 1389
    .line 1390
    .line 1391
    move-result v8

    .line 1392
    if-nez v8, :cond_55

    .line 1393
    .line 1394
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1395
    .line 1396
    const-string v9, "pixel 4 xl"

    .line 1397
    .line 1398
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v9

    .line 1402
    if-eqz v9, :cond_4d

    .line 1403
    .line 1404
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1405
    .line 1406
    const/16 v10, 0x1d

    .line 1407
    .line 1408
    if-ne v9, v10, :cond_4d

    .line 1409
    .line 1410
    goto :goto_1c

    .line 1411
    :cond_4d
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1412
    .line 1413
    .line 1414
    move-result v9

    .line 1415
    if-nez v9, :cond_4e

    .line 1416
    .line 1417
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1418
    .line 1419
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v9, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1423
    .line 1424
    .line 1425
    move-result v1

    .line 1426
    if-eqz v1, :cond_4f

    .line 1427
    .line 1428
    :cond_4e
    const-string v1, "moto e13"

    .line 1429
    .line 1430
    invoke-virtual {v1, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1431
    .line 1432
    .line 1433
    move-result v1

    .line 1434
    if-eqz v1, :cond_4f

    .line 1435
    .line 1436
    goto :goto_1c

    .line 1437
    :cond_4f
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1438
    .line 1439
    .line 1440
    move-result v1

    .line 1441
    if-nez v1, :cond_50

    .line 1442
    .line 1443
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1444
    .line 1445
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v1

    .line 1452
    if-eqz v1, :cond_51

    .line 1453
    .line 1454
    :cond_50
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1455
    .line 1456
    const-string v9, "gta8"

    .line 1457
    .line 1458
    invoke-virtual {v9, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1459
    .line 1460
    .line 1461
    move-result v9

    .line 1462
    if-nez v9, :cond_55

    .line 1463
    .line 1464
    const-string v9, "gta8wifi"

    .line 1465
    .line 1466
    invoke-virtual {v9, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v1

    .line 1470
    if-eqz v1, :cond_51

    .line 1471
    .line 1472
    goto :goto_1c

    .line 1473
    :cond_51
    invoke-virtual {p0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1474
    .line 1475
    .line 1476
    move-result v1

    .line 1477
    if-nez v1, :cond_52

    .line 1478
    .line 1479
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1480
    .line 1481
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1485
    .line 1486
    .line 1487
    move-result v1

    .line 1488
    if-eqz v1, :cond_53

    .line 1489
    .line 1490
    :cond_52
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1491
    .line 1492
    .line 1493
    const-string v1, "SM-A536"

    .line 1494
    .line 1495
    invoke-static {v8, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1496
    .line 1497
    .line 1498
    move-result v1

    .line 1499
    if-eqz v1, :cond_53

    .line 1500
    .line 1501
    goto :goto_1c

    .line 1502
    :cond_53
    invoke-static {}, La/lgb;->d0()Z

    .line 1503
    .line 1504
    .line 1505
    move-result v1

    .line 1506
    if-eqz v1, :cond_54

    .line 1507
    .line 1508
    goto :goto_1c

    .line 1509
    :cond_54
    move v1, v2

    .line 1510
    goto :goto_1d

    .line 1511
    :cond_55
    :goto_1c
    move v1, v5

    .line 1512
    :goto_1d
    const-class v6, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;

    .line 1513
    .line 1514
    invoke-virtual {v0, v6, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1515
    .line 1516
    .line 1517
    move-result v1

    .line 1518
    if-eqz v1, :cond_56

    .line 1519
    .line 1520
    new-instance v1, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;

    .line 1521
    .line 1522
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    :cond_56
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1529
    .line 1530
    const-string v6, "Pixel 8"

    .line 1531
    .line 1532
    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1533
    .line 1534
    .line 1535
    move-result v6

    .line 1536
    if-eqz v6, :cond_58

    .line 1537
    .line 1538
    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 1539
    .line 1540
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1541
    .line 1542
    .line 1543
    move-object v8, v4

    .line 1544
    check-cast v8, La/ow9;

    .line 1545
    .line 1546
    invoke-virtual {v8, v6}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v6

    .line 1550
    check-cast v6, Ljava/lang/Integer;

    .line 1551
    .line 1552
    if-nez v6, :cond_57

    .line 1553
    .line 1554
    goto :goto_1e

    .line 1555
    :cond_57
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1556
    .line 1557
    .line 1558
    move-result v6

    .line 1559
    if-nez v6, :cond_58

    .line 1560
    .line 1561
    move v6, v5

    .line 1562
    goto :goto_1f

    .line 1563
    :cond_58
    :goto_1e
    move v6, v2

    .line 1564
    :goto_1f
    const-class v8, Landroidx/camera/camera2/compat/quirk/TemporalNoiseQuirk;

    .line 1565
    .line 1566
    invoke-virtual {v0, v8, v6}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1567
    .line 1568
    .line 1569
    move-result v6

    .line 1570
    if-eqz v6, :cond_59

    .line 1571
    .line 1572
    new-instance v6, Landroidx/camera/camera2/compat/quirk/TemporalNoiseQuirk;

    .line 1573
    .line 1574
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1575
    .line 1576
    .line 1577
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1578
    .line 1579
    .line 1580
    :cond_59
    sget-object v6, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedForVideoSnapshotQuirk;->a:Ljava/util/Set;

    .line 1581
    .line 1582
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1583
    .line 1584
    .line 1585
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1586
    .line 1587
    invoke-virtual {v1, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v8

    .line 1591
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1592
    .line 1593
    .line 1594
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1595
    .line 1596
    .line 1597
    move-result v6

    .line 1598
    if-nez v6, :cond_5c

    .line 1599
    .line 1600
    invoke-static {}, La/lgb;->d0()Z

    .line 1601
    .line 1602
    .line 1603
    move-result v6

    .line 1604
    if-nez v6, :cond_5c

    .line 1605
    .line 1606
    invoke-virtual {p0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1607
    .line 1608
    .line 1609
    move-result p0

    .line 1610
    if-nez p0, :cond_5a

    .line 1611
    .line 1612
    sget-object p0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1613
    .line 1614
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {p0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1618
    .line 1619
    .line 1620
    move-result p0

    .line 1621
    if-eqz p0, :cond_5b

    .line 1622
    .line 1623
    :cond_5a
    const-string p0, "FIG-LX1"

    .line 1624
    .line 1625
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1626
    .line 1627
    .line 1628
    move-result p0

    .line 1629
    if-eqz p0, :cond_5b

    .line 1630
    .line 1631
    goto :goto_20

    .line 1632
    :cond_5b
    move p0, v2

    .line 1633
    goto :goto_21

    .line 1634
    :cond_5c
    :goto_20
    move p0, v5

    .line 1635
    :goto_21
    const-class v1, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedForVideoSnapshotQuirk;

    .line 1636
    .line 1637
    invoke-virtual {v0, v1, p0}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1638
    .line 1639
    .line 1640
    move-result p0

    .line 1641
    if-eqz p0, :cond_5d

    .line 1642
    .line 1643
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedForVideoSnapshotQuirk;

    .line 1644
    .line 1645
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1649
    .line 1650
    .line 1651
    :cond_5d
    const-class p0, Landroidx/camera/camera2/compat/quirk/AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;

    .line 1652
    .line 1653
    invoke-static {}, La/xf0;->P()Z

    .line 1654
    .line 1655
    .line 1656
    move-result v1

    .line 1657
    invoke-virtual {v0, p0, v1}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1658
    .line 1659
    .line 1660
    move-result p0

    .line 1661
    if-eqz p0, :cond_5e

    .line 1662
    .line 1663
    new-instance p0, Landroidx/camera/camera2/compat/quirk/AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;

    .line 1664
    .line 1665
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1666
    .line 1667
    .line 1668
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1669
    .line 1670
    .line 1671
    :cond_5e
    sget-object p0, Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;->a:Ljava/util/List;

    .line 1672
    .line 1673
    if-eqz p0, :cond_5f

    .line 1674
    .line 1675
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 1676
    .line 1677
    .line 1678
    move-result v1

    .line 1679
    if-eqz v1, :cond_5f

    .line 1680
    .line 1681
    goto :goto_22

    .line 1682
    :cond_5f
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1683
    .line 1684
    .line 1685
    move-result-object p0

    .line 1686
    :cond_60
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1687
    .line 1688
    .line 1689
    move-result v1

    .line 1690
    if-eqz v1, :cond_62

    .line 1691
    .line 1692
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v1

    .line 1696
    check-cast v1, Ljava/lang/String;

    .line 1697
    .line 1698
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1699
    .line 1700
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1704
    .line 1705
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v6

    .line 1709
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1710
    .line 1711
    .line 1712
    invoke-static {v6, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1713
    .line 1714
    .line 1715
    move-result v1

    .line 1716
    if-eqz v1, :cond_60

    .line 1717
    .line 1718
    sget-object p0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 1719
    .line 1720
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1721
    .line 1722
    .line 1723
    check-cast v4, La/ow9;

    .line 1724
    .line 1725
    invoke-virtual {v4, p0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 1726
    .line 1727
    .line 1728
    move-result-object p0

    .line 1729
    check-cast p0, Ljava/lang/Integer;

    .line 1730
    .line 1731
    if-nez p0, :cond_61

    .line 1732
    .line 1733
    goto :goto_22

    .line 1734
    :cond_61
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 1735
    .line 1736
    .line 1737
    move-result p0

    .line 1738
    if-ne p0, v5, :cond_62

    .line 1739
    .line 1740
    move v2, v5

    .line 1741
    :cond_62
    :goto_22
    const-class p0, Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;

    .line 1742
    .line 1743
    invoke-virtual {v0, p0, v2}, La/hpd0;->a(Ljava/lang/Class;Z)Z

    .line 1744
    .line 1745
    .line 1746
    move-result p0

    .line 1747
    if-eqz p0, :cond_63

    .line 1748
    .line 1749
    new-instance p0, Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;

    .line 1750
    .line 1751
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1752
    .line 1753
    .line 1754
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1755
    .line 1756
    .line 1757
    :cond_63
    new-instance p0, La/kpd0;

    .line 1758
    .line 1759
    invoke-direct {p0, v3}, La/kpd0;-><init>(Ljava/util/ArrayList;)V

    .line 1760
    .line 1761
    .line 1762
    invoke-static {p0}, La/kpd0;->d(La/kpd0;)Ljava/lang/String;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v0

    .line 1766
    const-string v1, "camera2 CameraQuirks = "

    .line 1767
    .line 1768
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v0

    .line 1772
    const-string v1, "CameraQuirks"

    .line 1773
    .line 1774
    invoke-static {v1, v0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 1775
    .line 1776
    .line 1777
    :goto_23
    return-object p0

    .line 1778
    :catch_0
    move-exception v0

    .line 1779
    goto :goto_24

    .line 1780
    :catch_1
    move-exception v0

    .line 1781
    :goto_24
    move-object p0, v0

    .line 1782
    new-instance v0, Ljava/lang/AssertionError;

    .line 1783
    .line 1784
    const-string v1, "Unexpected error in QuirkSettings StateObservable"

    .line 1785
    .line 1786
    invoke-direct {v0, v1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1787
    .line 1788
    .line 1789
    throw v0

    .line 1790
    :pswitch_0
    check-cast p0, La/cx9;

    .line 1791
    .line 1792
    iget-object p0, p0, La/cx9;->d:La/o5d0;

    .line 1793
    .line 1794
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 1795
    .line 1796
    .line 1797
    move-result-object p0

    .line 1798
    check-cast p0, La/xy9;

    .line 1799
    .line 1800
    return-object p0

    .line 1801
    :pswitch_1
    check-cast p0, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;

    .line 1802
    .line 1803
    iget-object p0, p0, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;->a:La/erm0;

    .line 1804
    .line 1805
    const/16 v0, 0x22

    .line 1806
    .line 1807
    invoke-virtual {p0, v0}, La/erm0;->b(I)[Landroid/util/Size;

    .line 1808
    .line 1809
    .line 1810
    move-result-object p0

    .line 1811
    if-eqz p0, :cond_64

    .line 1812
    .line 1813
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1814
    .line 1815
    .line 1816
    move-result-object p0

    .line 1817
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1818
    .line 1819
    .line 1820
    goto :goto_25

    .line 1821
    :cond_64
    sget-object p0, La/iun;->a:La/iun;

    .line 1822
    .line 1823
    :goto_25
    invoke-static {v1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 1824
    .line 1825
    .line 1826
    move-result v0

    .line 1827
    if-eqz v0, :cond_65

    .line 1828
    .line 1829
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1830
    .line 1831
    const-string v2, "supportedResolutions = "

    .line 1832
    .line 1833
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v0

    .line 1843
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1844
    .line 1845
    .line 1846
    :cond_65
    return-object p0

    .line 1847
    :pswitch_2
    move-object v0, p0

    .line 1848
    check-cast v0, La/at9;

    .line 1849
    .line 1850
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 1851
    .line 1852
    iget-object v1, p0, La/ocj;->a:La/p7m0;

    .line 1853
    .line 1854
    :cond_66
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1855
    .line 1856
    .line 1857
    move-result-object p0

    .line 1858
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1859
    .line 1860
    .line 1861
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 1862
    .line 1863
    move-object v3, p0

    .line 1864
    check-cast v3, La/cs9;

    .line 1865
    .line 1866
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1867
    .line 1868
    .line 1869
    const/4 v7, 0x0

    .line 1870
    const/16 v8, 0xb

    .line 1871
    .line 1872
    const/4 v4, 0x0

    .line 1873
    const/4 v5, 0x0

    .line 1874
    const/4 v6, 0x0

    .line 1875
    invoke-static/range {v3 .. v8}, La/cs9;->a(La/cs9;Ljava/util/List;La/bs9;ZLa/sp9;I)La/cs9;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v2

    .line 1879
    invoke-virtual {v1, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1880
    .line 1881
    .line 1882
    move-result p0

    .line 1883
    if-eqz p0, :cond_66

    .line 1884
    .line 1885
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1886
    .line 1887
    return-object p0

    .line 1888
    :pswitch_3
    check-cast p0, La/xex;

    .line 1889
    .line 1890
    iget-object p0, p0, La/xex;->a:Ljava/lang/Object;

    .line 1891
    .line 1892
    check-cast p0, La/gii0;

    .line 1893
    .line 1894
    const-class v0, La/cm9;

    .line 1895
    .line 1896
    sget-object v1, La/sre0;->a:La/tre0;

    .line 1897
    .line 1898
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v0

    .line 1902
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1903
    .line 1904
    .line 1905
    move-result-object p0

    .line 1906
    check-cast p0, La/cm9;

    .line 1907
    .line 1908
    return-object p0

    .line 1909
    :pswitch_4
    check-cast p0, La/oj9;

    .line 1910
    .line 1911
    new-instance v1, La/fj9;

    .line 1912
    .line 1913
    :try_start_3
    iget-object v0, p0, La/oj9;->a:La/q7d0;

    .line 1914
    .line 1915
    const-string v3, "track_events_json"

    .line 1916
    .line 1917
    const-string v4, ""

    .line 1918
    .line 1919
    invoke-virtual {v0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v0

    .line 1923
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0

    .line 1927
    if-eqz v0, :cond_68

    .line 1928
    .line 1929
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1930
    .line 1931
    .line 1932
    move-result v3

    .line 1933
    if-nez v3, :cond_67

    .line 1934
    .line 1935
    goto :goto_26

    .line 1936
    :cond_67
    iget-object p0, p0, La/oj9;->b:La/vby;

    .line 1937
    .line 1938
    new-instance v3, La/zw3;

    .line 1939
    .line 1940
    sget-object v4, La/pbs0;->Companion:La/obs0;

    .line 1941
    .line 1942
    invoke-virtual {v4}, La/obs0;->serializer()La/jiy;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v4

    .line 1946
    invoke-direct {v3, v4, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 1947
    .line 1948
    .line 1949
    invoke-virtual {p0, v3, v0}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object p0

    .line 1953
    check-cast p0, Ljava/util/List;

    .line 1954
    .line 1955
    goto :goto_28

    .line 1956
    :catch_2
    move-exception v0

    .line 1957
    move-object p0, v0

    .line 1958
    goto :goto_27

    .line 1959
    :cond_68
    :goto_26
    sget-object p0, La/iun;->a:La/iun;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 1960
    .line 1961
    goto :goto_28

    .line 1962
    :goto_27
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1963
    .line 1964
    .line 1965
    sget-object p0, La/iun;->a:La/iun;

    .line 1966
    .line 1967
    :goto_28
    invoke-direct {v1, p0}, La/fj9;-><init>(Ljava/util/List;)V

    .line 1968
    .line 1969
    .line 1970
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 1971
    .line 1972
    .line 1973
    move-result-object p0

    .line 1974
    return-object p0

    .line 1975
    :pswitch_5
    check-cast p0, La/oi9;

    .line 1976
    .line 1977
    iget-object v0, p0, La/oi9;->q:La/b3h0;

    .line 1978
    .line 1979
    if-nez v0, :cond_69

    .line 1980
    .line 1981
    new-instance v0, La/b3h0;

    .line 1982
    .line 1983
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1984
    .line 1985
    .line 1986
    iput-object v0, p0, La/oi9;->q:La/b3h0;

    .line 1987
    .line 1988
    :cond_69
    iget-object v1, v0, La/b3h0;->b:La/afv;

    .line 1989
    .line 1990
    if-nez v1, :cond_6a

    .line 1991
    .line 1992
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 1993
    .line 1994
    .line 1995
    move-result-object p0

    .line 1996
    invoke-interface {p0}, La/cg80;->getGraphicsContext()La/afv;

    .line 1997
    .line 1998
    .line 1999
    move-result-object p0

    .line 2000
    invoke-virtual {v0}, La/b3h0;->d()V

    .line 2001
    .line 2002
    .line 2003
    iput-object p0, v0, La/b3h0;->b:La/afv;

    .line 2004
    .line 2005
    :cond_6a
    return-object v0

    .line 2006
    :pswitch_6
    check-cast p0, La/sa9;

    .line 2007
    .line 2008
    iget-boolean p0, p0, La/sa9;->c:Z

    .line 2009
    .line 2010
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2011
    .line 2012
    .line 2013
    move-result-object p0

    .line 2014
    return-object p0

    .line 2015
    :pswitch_7
    check-cast p0, La/b99;

    .line 2016
    .line 2017
    return-object p0

    .line 2018
    :pswitch_8
    check-cast p0, La/y89;

    .line 2019
    .line 2020
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v0

    .line 2024
    if-eqz v0, :cond_6b

    .line 2025
    .line 2026
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v0

    .line 2030
    goto :goto_29

    .line 2031
    :cond_6b
    move-object v0, v4

    .line 2032
    :goto_29
    instance-of v1, v0, Landroid/view/View;

    .line 2033
    .line 2034
    if-eqz v1, :cond_6c

    .line 2035
    .line 2036
    move-object v4, v0

    .line 2037
    check-cast v4, Landroid/view/View;

    .line 2038
    .line 2039
    :cond_6c
    if-nez v4, :cond_6d

    .line 2040
    .line 2041
    goto :goto_2a

    .line 2042
    :cond_6d
    move-object p0, v4

    .line 2043
    :goto_2a
    return-object p0

    .line 2044
    :pswitch_9
    check-cast p0, La/p89;

    .line 2045
    .line 2046
    iget-object v0, p0, La/p89;->e:La/ali;

    .line 2047
    .line 2048
    invoke-virtual {v0}, La/ali;->d()V

    .line 2049
    .line 2050
    .line 2051
    iget-object v1, p0, La/p89;->f:La/a5v;

    .line 2052
    .line 2053
    new-instance v2, La/lhv0;

    .line 2054
    .line 2055
    iget-object p0, p0, La/p89;->l:La/p7m0;

    .line 2056
    .line 2057
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v3

    .line 2061
    check-cast v3, La/b89;

    .line 2062
    .line 2063
    iget-wide v3, v3, La/b89;->a:J

    .line 2064
    .line 2065
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v5

    .line 2069
    check-cast v5, La/b89;

    .line 2070
    .line 2071
    iget-wide v5, v5, La/b89;->b:J

    .line 2072
    .line 2073
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v7

    .line 2077
    check-cast v7, La/b89;

    .line 2078
    .line 2079
    iget v7, v7, La/b89;->c:I

    .line 2080
    .line 2081
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v8

    .line 2085
    check-cast v8, La/b89;

    .line 2086
    .line 2087
    iget-wide v8, v8, La/b89;->d:J

    .line 2088
    .line 2089
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2090
    .line 2091
    .line 2092
    move-result-object p0

    .line 2093
    check-cast p0, La/b89;

    .line 2094
    .line 2095
    iget-object v10, p0, La/b89;->e:Ljava/lang/String;

    .line 2096
    .line 2097
    invoke-direct/range {v2 .. v10}, La/lhv0;-><init>(JJIJLjava/lang/String;)V

    .line 2098
    .line 2099
    .line 2100
    invoke-virtual {v1, v2}, La/a5v;->a(La/mhv0;)V

    .line 2101
    .line 2102
    .line 2103
    invoke-virtual {v0}, La/ali;->B()V

    .line 2104
    .line 2105
    .line 2106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2107
    .line 2108
    return-object p0

    .line 2109
    :pswitch_a
    check-cast p0, La/s79;

    .line 2110
    .line 2111
    iget-object v0, p0, La/s79;->r:La/ali;

    .line 2112
    .line 2113
    invoke-virtual {v0}, La/ali;->d()V

    .line 2114
    .line 2115
    .line 2116
    iget-object v1, p0, La/s79;->s:La/a5v;

    .line 2117
    .line 2118
    new-instance v2, La/lhv0;

    .line 2119
    .line 2120
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v3

    .line 2124
    check-cast v3, La/o79;

    .line 2125
    .line 2126
    iget-wide v3, v3, La/o79;->a:J

    .line 2127
    .line 2128
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v5

    .line 2132
    check-cast v5, La/o79;

    .line 2133
    .line 2134
    iget-wide v5, v5, La/o79;->b:J

    .line 2135
    .line 2136
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v7

    .line 2140
    check-cast v7, La/o79;

    .line 2141
    .line 2142
    iget v7, v7, La/o79;->c:I

    .line 2143
    .line 2144
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v8

    .line 2148
    check-cast v8, La/o79;

    .line 2149
    .line 2150
    iget-wide v8, v8, La/o79;->d:J

    .line 2151
    .line 2152
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2153
    .line 2154
    .line 2155
    move-result-object p0

    .line 2156
    check-cast p0, La/o79;

    .line 2157
    .line 2158
    iget-object v10, p0, La/o79;->e:Ljava/lang/String;

    .line 2159
    .line 2160
    invoke-direct/range {v2 .. v10}, La/lhv0;-><init>(JJIJLjava/lang/String;)V

    .line 2161
    .line 2162
    .line 2163
    invoke-virtual {v1, v2}, La/a5v;->a(La/mhv0;)V

    .line 2164
    .line 2165
    .line 2166
    invoke-virtual {v0}, La/ali;->B()V

    .line 2167
    .line 2168
    .line 2169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2170
    .line 2171
    return-object p0

    .line 2172
    :pswitch_b
    check-cast p0, La/k69;

    .line 2173
    .line 2174
    iget-object v0, p0, La/k69;->s:La/a5v;

    .line 2175
    .line 2176
    new-instance v1, La/khv0;

    .line 2177
    .line 2178
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v2

    .line 2182
    check-cast v2, La/z59;

    .line 2183
    .line 2184
    iget-wide v2, v2, La/z59;->a:J

    .line 2185
    .line 2186
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v4

    .line 2190
    check-cast v4, La/z59;

    .line 2191
    .line 2192
    iget-wide v4, v4, La/z59;->b:J

    .line 2193
    .line 2194
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v6

    .line 2198
    check-cast v6, La/z59;

    .line 2199
    .line 2200
    iget-object v8, v6, La/z59;->c:Ljava/lang/String;

    .line 2201
    .line 2202
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v6

    .line 2206
    check-cast v6, La/z59;

    .line 2207
    .line 2208
    iget-wide v6, v6, La/z59;->d:J

    .line 2209
    .line 2210
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v9

    .line 2214
    check-cast v9, La/z59;

    .line 2215
    .line 2216
    iget-object v9, v9, La/z59;->e:Ljava/lang/String;

    .line 2217
    .line 2218
    invoke-direct/range {v1 .. v9}, La/khv0;-><init>(JJJLjava/lang/String;Ljava/lang/String;)V

    .line 2219
    .line 2220
    .line 2221
    invoke-virtual {v0, v1}, La/a5v;->a(La/mhv0;)V

    .line 2222
    .line 2223
    .line 2224
    iget-object p0, p0, La/k69;->r:La/ali;

    .line 2225
    .line 2226
    invoke-virtual {p0}, La/ali;->B()V

    .line 2227
    .line 2228
    .line 2229
    invoke-virtual {p0}, La/ali;->d()V

    .line 2230
    .line 2231
    .line 2232
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2233
    .line 2234
    return-object p0

    .line 2235
    :pswitch_c
    check-cast p0, La/y9j;

    .line 2236
    .line 2237
    iget-object p0, p0, La/y9j;->c:La/a4x;

    .line 2238
    .line 2239
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2240
    .line 2241
    .line 2242
    move-result p0

    .line 2243
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2244
    .line 2245
    .line 2246
    move-result-object p0

    .line 2247
    return-object p0

    .line 2248
    :pswitch_d
    check-cast p0, La/l49;

    .line 2249
    .line 2250
    check-cast p0, La/j49;

    .line 2251
    .line 2252
    iget-object p0, p0, La/j49;->d:La/a4x;

    .line 2253
    .line 2254
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2255
    .line 2256
    .line 2257
    move-result p0

    .line 2258
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2259
    .line 2260
    .line 2261
    move-result-object p0

    .line 2262
    return-object p0

    .line 2263
    :pswitch_e
    check-cast p0, La/jge0;

    .line 2264
    .line 2265
    return-object p0

    .line 2266
    :pswitch_f
    check-cast p0, La/uz8;

    .line 2267
    .line 2268
    new-instance v0, La/q0h0;

    .line 2269
    .line 2270
    iget-object p0, p0, La/uz8;->L1:La/sai;

    .line 2271
    .line 2272
    if-eqz p0, :cond_6e

    .line 2273
    .line 2274
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 2275
    .line 2276
    .line 2277
    return-object v0

    .line 2278
    :cond_6e
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2279
    .line 2280
    .line 2281
    throw v4

    .line 2282
    :pswitch_10
    check-cast p0, La/ez8;

    .line 2283
    .line 2284
    new-instance v3, La/imm;

    .line 2285
    .line 2286
    new-instance v4, La/ilm;

    .line 2287
    .line 2288
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 2289
    .line 2290
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2291
    .line 2292
    .line 2293
    move-result-object v0

    .line 2294
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2295
    .line 2296
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 2297
    .line 2298
    .line 2299
    move-result-wide v0

    .line 2300
    invoke-direct {v4, v0, v1}, La/ilm;-><init>(J)V

    .line 2301
    .line 2302
    .line 2303
    new-instance v5, La/plm;

    .line 2304
    .line 2305
    iget-object p0, p0, La/ez8;->b:La/ctf0;

    .line 2306
    .line 2307
    new-array v0, v2, [Ljava/lang/Object;

    .line 2308
    .line 2309
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 2310
    .line 2311
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v0

    .line 2315
    const v1, 0x7f130a66

    .line 2316
    .line 2317
    .line 2318
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2319
    .line 2320
    .line 2321
    move-result-object p0

    .line 2322
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v0

    .line 2326
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2327
    .line 2328
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 2329
    .line 2330
    .line 2331
    move-result-wide v0

    .line 2332
    sget-object v2, La/fa50;->a:La/fa50;

    .line 2333
    .line 2334
    invoke-direct {v5, p0, v0, v1, v2}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 2335
    .line 2336
    .line 2337
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2338
    .line 2339
    .line 2340
    move-result-object p0

    .line 2341
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2342
    .line 2343
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 2344
    .line 2345
    .line 2346
    move-result-wide v7

    .line 2347
    const/4 v9, 0x1

    .line 2348
    const/4 v10, 0x0

    .line 2349
    sget-object v6, La/fmm;->a:La/fmm;

    .line 2350
    .line 2351
    invoke-direct/range {v3 .. v10}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 2352
    .line 2353
    .line 2354
    return-object v3

    .line 2355
    :pswitch_11
    check-cast p0, La/yy8;

    .line 2356
    .line 2357
    sget-object v0, La/yy8;->Q1:La/gl5;

    .line 2358
    .line 2359
    iget-object p0, p0, La/yy8;->L1:La/fiu0;

    .line 2360
    .line 2361
    if-eqz p0, :cond_6f

    .line 2362
    .line 2363
    return-object p0

    .line 2364
    :cond_6f
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2365
    .line 2366
    .line 2367
    throw v4

    .line 2368
    :pswitch_12
    check-cast p0, La/ty8;

    .line 2369
    .line 2370
    invoke-virtual {p0}, La/ty8;->O()V

    .line 2371
    .line 2372
    .line 2373
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2374
    .line 2375
    return-object p0

    .line 2376
    :pswitch_13
    check-cast p0, La/pw8;

    .line 2377
    .line 2378
    iget-object p0, p0, La/pw8;->p:La/oeg0;

    .line 2379
    .line 2380
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 2381
    .line 2382
    .line 2383
    move-result-object p0

    .line 2384
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v0

    .line 2388
    new-instance v1, La/c8d;

    .line 2389
    .line 2390
    sget-object v3, La/y7d;->a:La/v7d;

    .line 2391
    .line 2392
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 2393
    .line 2394
    invoke-direct {v1, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2395
    .line 2396
    .line 2397
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v0

    .line 2401
    :goto_2b
    move-object v1, v0

    .line 2402
    check-cast v1, La/paw;

    .line 2403
    .line 2404
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 2405
    .line 2406
    .line 2407
    move-result v2

    .line 2408
    if-eqz v2, :cond_70

    .line 2409
    .line 2410
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 2411
    .line 2412
    .line 2413
    move-result-object v1

    .line 2414
    check-cast v1, La/oe50;

    .line 2415
    .line 2416
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 2417
    .line 2418
    .line 2419
    goto :goto_2b

    .line 2420
    :cond_70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2421
    .line 2422
    return-object p0

    .line 2423
    :pswitch_14
    check-cast p0, La/tv8;

    .line 2424
    .line 2425
    sget-object v0, La/tv8;->N1:La/yk5;

    .line 2426
    .line 2427
    iget-object p0, p0, La/tv8;->L1:La/fiu0;

    .line 2428
    .line 2429
    if-eqz p0, :cond_71

    .line 2430
    .line 2431
    return-object p0

    .line 2432
    :cond_71
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2433
    .line 2434
    .line 2435
    throw v4

    .line 2436
    :pswitch_15
    check-cast p0, La/et8;

    .line 2437
    .line 2438
    iget-object p0, p0, La/et8;->b:La/zr8;

    .line 2439
    .line 2440
    if-eqz p0, :cond_72

    .line 2441
    .line 2442
    invoke-virtual {p0}, La/zr8;->c()V

    .line 2443
    .line 2444
    .line 2445
    :cond_72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2446
    .line 2447
    return-object p0

    .line 2448
    :pswitch_16
    check-cast p0, La/bq8;

    .line 2449
    .line 2450
    iget-object p0, p0, La/bq8;->a:La/xpj0;

    .line 2451
    .line 2452
    iget-object p0, p0, La/xpj0;->e:La/qv2;

    .line 2453
    .line 2454
    invoke-virtual {p0}, La/qv2;->v()F

    .line 2455
    .line 2456
    .line 2457
    move-result p0

    .line 2458
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2459
    .line 2460
    .line 2461
    move-result-object p0

    .line 2462
    return-object p0

    .line 2463
    :pswitch_17
    move-object v2, p0

    .line 2464
    check-cast v2, La/yj8;

    .line 2465
    .line 2466
    iget-object p0, v2, La/yj8;->f:La/sa10;

    .line 2467
    .line 2468
    sget-object v8, La/pb10;->g:La/pb10;

    .line 2469
    .line 2470
    new-instance v0, La/pw4;

    .line 2471
    .line 2472
    const/4 v6, 0x0

    .line 2473
    const/16 v7, 0xa

    .line 2474
    .line 2475
    const/4 v1, 0x0

    .line 2476
    const-class v3, La/yj8;

    .line 2477
    .line 2478
    const-string v4, "loadBonusesInfo"

    .line 2479
    .line 2480
    const-string v5, "loadBonusesInfo()V"

    .line 2481
    .line 2482
    invoke-direct/range {v0 .. v7}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2483
    .line 2484
    .line 2485
    move-object v4, v8

    .line 2486
    const-wide/16 v8, 0x2710

    .line 2487
    .line 2488
    const v5, 0x7f130677

    .line 2489
    .line 2490
    .line 2491
    const v6, 0x7f131690

    .line 2492
    .line 2493
    .line 2494
    move-object v3, p0

    .line 2495
    move-object v7, v0

    .line 2496
    invoke-virtual/range {v3 .. v9}, La/sa10;->a(La/pb10;IILkotlin/jvm/functions/Function0;J)La/ra10;

    .line 2497
    .line 2498
    .line 2499
    move-result-object p0

    .line 2500
    return-object p0

    .line 2501
    :pswitch_18
    check-cast p0, La/lj8;

    .line 2502
    .line 2503
    sget-object v0, La/lj8;->O1:La/gl5;

    .line 2504
    .line 2505
    iget-object p0, p0, La/lj8;->L1:La/fiu0;

    .line 2506
    .line 2507
    if-eqz p0, :cond_73

    .line 2508
    .line 2509
    return-object p0

    .line 2510
    :cond_73
    const-string p0, "bonusesViewModelFactory"

    .line 2511
    .line 2512
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2513
    .line 2514
    .line 2515
    throw v4

    .line 2516
    :pswitch_19
    check-cast p0, La/jj8;

    .line 2517
    .line 2518
    iget-object p0, p0, La/jj8;->e2:La/fiu0;

    .line 2519
    .line 2520
    if-eqz p0, :cond_74

    .line 2521
    .line 2522
    return-object p0

    .line 2523
    :cond_74
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2524
    .line 2525
    .line 2526
    throw v4

    .line 2527
    :pswitch_1a
    check-cast p0, La/pi9;

    .line 2528
    .line 2529
    new-instance v0, La/vtm0;

    .line 2530
    .line 2531
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2532
    .line 2533
    const/high16 v1, 0x40000000    # 2.0f

    .line 2534
    .line 2535
    invoke-virtual {p0}, La/pi9;->getDensity()F

    .line 2536
    .line 2537
    .line 2538
    move-result p0

    .line 2539
    mul-float/2addr v1, p0

    .line 2540
    const/4 v5, 0x0

    .line 2541
    const/16 v6, 0x1e

    .line 2542
    .line 2543
    const/4 v2, 0x0

    .line 2544
    const/4 v3, 0x0

    .line 2545
    const/4 v4, 0x0

    .line 2546
    invoke-direct/range {v0 .. v6}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 2547
    .line 2548
    .line 2549
    return-object v0

    .line 2550
    :pswitch_1b
    check-cast p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;

    .line 2551
    .line 2552
    new-instance v0, La/cc8;

    .line 2553
    .line 2554
    iget-object p0, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->b:Ljava/util/List;

    .line 2555
    .line 2556
    invoke-static {p0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2557
    .line 2558
    .line 2559
    move-result-object p0

    .line 2560
    invoke-direct {v0, p0}, La/cc8;-><init>(La/a4x;)V

    .line 2561
    .line 2562
    .line 2563
    return-object v0

    .line 2564
    :pswitch_1c
    check-cast p0, La/wb8;

    .line 2565
    .line 2566
    sget-object v0, La/wb8;->n2:La/kj5;

    .line 2567
    .line 2568
    iget-object p0, p0, La/wb8;->k2:La/fiu0;

    .line 2569
    .line 2570
    if-eqz p0, :cond_75

    .line 2571
    .line 2572
    return-object p0

    .line 2573
    :cond_75
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2574
    .line 2575
    .line 2576
    throw v4

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
