.class public final synthetic La/a4e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/a4e;->a:B

    iput-object p1, p0, La/a4e;->b:Ljava/lang/Object;

    iput-object p2, p0, La/a4e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/xplatform/domino/presentation/views/DominoHandView;Ljava/util/List;)V
    .locals 1

    .line 1
    const/16 v0, 0x19

    iput-byte v0, p0, La/a4e;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a4e;->c:Ljava/lang/Object;

    iput-object p2, p0, La/a4e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a4e;->a:B

    .line 4
    .line 5
    const/16 v2, 0x400

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/chf0;

    .line 15
    .line 16
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v7, v0

    .line 19
    check-cast v7, La/ctl;

    .line 20
    .line 21
    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 24
    .line 25
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 26
    .line 27
    sget-object v10, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 28
    .line 29
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 30
    .line 31
    sget-object v12, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 32
    .line 33
    sget-object v13, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 34
    .line 35
    const-string v14, "google_sdk"

    .line 36
    .line 37
    const-string v15, "nox"

    .line 38
    .line 39
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/16 v16, 0x0

    .line 43
    .line 44
    const-string v3, "generic"

    .line 45
    .line 46
    invoke-static {v13, v3, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    if-nez v13, :cond_1

    .line 51
    .line 52
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v11, v14, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    if-nez v13, :cond_1

    .line 60
    .line 61
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 62
    .line 63
    const-string v6, "droid4x"

    .line 64
    .line 65
    invoke-static {v11, v13, v6, v5}, La/vqd;->A(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_1

    .line 70
    .line 71
    const-string v6, "Emulator"

    .line 72
    .line 73
    invoke-static {v11, v6, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-nez v6, :cond_1

    .line 78
    .line 79
    const-string v6, "Android SDK built for x86"

    .line 80
    .line 81
    invoke-static {v11, v6, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-nez v6, :cond_1

    .line 86
    .line 87
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-string v6, "Genymotion"

    .line 91
    .line 92
    invoke-static {v8, v6, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-nez v6, :cond_1

    .line 97
    .line 98
    const-string v6, "goldfish"

    .line 99
    .line 100
    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_1

    .line 105
    .line 106
    const-string v6, "vbox86"

    .line 107
    .line 108
    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_1

    .line 113
    .line 114
    const-string v6, "sdk"

    .line 115
    .line 116
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-nez v6, :cond_1

    .line 121
    .line 122
    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-nez v6, :cond_1

    .line 127
    .line 128
    const-string v6, "sdk_x86"

    .line 129
    .line 130
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-nez v6, :cond_1

    .line 135
    .line 136
    const-string v6, "vbox86p"

    .line 137
    .line 138
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-nez v6, :cond_1

    .line 143
    .line 144
    sget-object v6, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-static {v6, v15, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-nez v6, :cond_1

    .line 161
    .line 162
    sget-object v6, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v6, v15, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-nez v6, :cond_1

    .line 179
    .line 180
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-static {v6, v15, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-nez v6, :cond_1

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {v6, v15, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-nez v6, :cond_1

    .line 211
    .line 212
    sget-object v6, Landroid/os/Build;->HOST:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    const-string v8, "ubuntu"

    .line 218
    .line 219
    invoke-static {v6, v8, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    if-nez v6, :cond_1

    .line 224
    .line 225
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    const-string v6, "aosp"

    .line 229
    .line 230
    invoke-static {v10, v6, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-eqz v6, :cond_0

    .line 235
    .line 236
    goto :goto_0

    .line 237
    :cond_0
    move v6, v5

    .line 238
    goto :goto_1

    .line 239
    :cond_1
    :goto_0
    const/4 v6, 0x1

    .line 240
    :goto_1
    if-eqz v6, :cond_2

    .line 241
    .line 242
    :goto_2
    const/4 v0, 0x1

    .line 243
    goto :goto_4

    .line 244
    :cond_2
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v9, v3, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    if-eqz v8, :cond_3

    .line 252
    .line 253
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {v10, v3, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_3

    .line 261
    .line 262
    const/4 v3, 0x1

    .line 263
    goto :goto_3

    .line 264
    :cond_3
    move v3, v5

    .line 265
    :goto_3
    or-int/2addr v3, v6

    .line 266
    if-eqz v3, :cond_4

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_4
    invoke-virtual {v14, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    or-int/2addr v0, v3

    .line 274
    :goto_4
    const/4 v3, 0x5

    .line 275
    if-nez v0, :cond_12

    .line 276
    .line 277
    iget-object v0, v1, La/chf0;->b:Ljava/lang/Object;

    .line 278
    .line 279
    move-object v6, v0

    .line 280
    check-cast v6, La/us00;

    .line 281
    .line 282
    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 283
    .line 284
    invoke-static {v6, v0}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    sget-object v0, La/chf0;->d:[Ljava/lang/String;

    .line 288
    .line 289
    const-string v8, "Geny"

    .line 290
    .line 291
    invoke-virtual {v1, v8, v0}, La/chf0;->q(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v0, :cond_11

    .line 296
    .line 297
    sget-object v0, La/chf0;->h:[Ljava/lang/String;

    .line 298
    .line 299
    const-string v8, "Andy"

    .line 300
    .line 301
    invoke-virtual {v1, v8, v0}, La/chf0;->q(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-nez v0, :cond_11

    .line 306
    .line 307
    sget-object v0, La/chf0;->i:[Ljava/lang/String;

    .line 308
    .line 309
    const-string v8, "Nox"

    .line 310
    .line 311
    invoke-virtual {v1, v8, v0}, La/chf0;->q(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-nez v0, :cond_11

    .line 316
    .line 317
    new-instance v0, Ljava/io/File;

    .line 318
    .line 319
    const-string v8, "/proc/tty/drivers"

    .line 320
    .line 321
    invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    new-instance v8, Ljava/io/File;

    .line 325
    .line 326
    const-string v9, "/proc/cpuinfo"

    .line 327
    .line 328
    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    filled-new-array {v0, v8}, [Ljava/io/File;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    move v9, v5

    .line 336
    :goto_5
    if-ge v9, v4, :cond_6

    .line 337
    .line 338
    aget-object v0, v8, v9

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    if-eqz v10, :cond_5

    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    if-eqz v10, :cond_5

    .line 351
    .line 352
    new-array v10, v2, [B

    .line 353
    .line 354
    :try_start_0
    new-instance v11, Ljava/io/FileInputStream;

    .line 355
    .line 356
    invoke-direct {v11, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v11, v10}, Ljava/io/FileInputStream;->read([B)I

    .line 360
    .line 361
    .line 362
    invoke-virtual {v11}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 363
    .line 364
    .line 365
    goto :goto_6

    .line 366
    :catch_0
    move-exception v0

    .line 367
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 368
    .line 369
    .line 370
    :goto_6
    new-instance v0, Ljava/lang/String;

    .line 371
    .line 372
    sget-object v11, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 373
    .line 374
    invoke-direct {v0, v10, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 375
    .line 376
    .line 377
    sget-object v10, La/chf0;->e:[Ljava/lang/String;

    .line 378
    .line 379
    aget-object v10, v10, v5

    .line 380
    .line 381
    invoke-static {v0, v10, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_5

    .line 386
    .line 387
    goto/16 :goto_d

    .line 388
    .line 389
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_6
    sget-object v0, La/chf0;->f:[Ljava/lang/String;

    .line 393
    .line 394
    const-string v4, "Pipes"

    .line 395
    .line 396
    invoke-virtual {v1, v4, v0}, La/chf0;->q(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-nez v0, :cond_11

    .line 401
    .line 402
    const-string v0, "android.permission.INTERNET"

    .line 403
    .line 404
    invoke-static {v6, v0}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-nez v0, :cond_c

    .line 409
    .line 410
    const-string v0, "/system/bin/netcfg"

    .line 411
    .line 412
    filled-new-array {v0}, [Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    new-instance v4, Ljava/lang/StringBuilder;

    .line 417
    .line 418
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 419
    .line 420
    .line 421
    :try_start_1
    new-instance v8, Ljava/lang/ProcessBuilder;

    .line 422
    .line 423
    const/4 v9, 0x1

    .line 424
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    check-cast v0, [Ljava/lang/String;

    .line 429
    .line 430
    invoke-direct {v8, v0}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    new-instance v0, Ljava/io/File;

    .line 434
    .line 435
    const-string v9, "/system/bin/"

    .line 436
    .line 437
    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v8, v0}, Ljava/lang/ProcessBuilder;->directory(Ljava/io/File;)Ljava/lang/ProcessBuilder;

    .line 441
    .line 442
    .line 443
    const/4 v9, 0x1

    .line 444
    invoke-virtual {v8, v9}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v8}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    new-array v2, v2, [B

    .line 456
    .line 457
    :goto_7
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    .line 458
    .line 459
    .line 460
    move-result v8

    .line 461
    const/4 v9, -0x1

    .line 462
    if-eq v8, v9, :cond_7

    .line 463
    .line 464
    new-instance v8, Ljava/lang/String;

    .line 465
    .line 466
    sget-object v9, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 467
    .line 468
    invoke-direct {v8, v2, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    goto :goto_7

    .line 475
    :cond_7
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 476
    .line 477
    .line 478
    :catch_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    const-string v2, "netcfg data -> "

    .line 483
    .line 484
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    if-lez v2, :cond_c

    .line 492
    .line 493
    new-instance v2, Lkotlin/text/Regex;

    .line 494
    .line 495
    const-string v4, "\n"

    .line 496
    .line 497
    invoke-direct {v2, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v0}, Lkotlin/text/Regex;->i(Ljava/lang/String;)Ljava/util/List;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    if-nez v2, :cond_9

    .line 509
    .line 510
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    :goto_8
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    if-eqz v4, :cond_9

    .line 523
    .line 524
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    check-cast v4, Ljava/lang/String;

    .line 529
    .line 530
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    if-nez v4, :cond_8

    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_8
    invoke-interface {v2}, Ljava/util/ListIterator;->nextIndex()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    const/16 v17, 0x1

    .line 542
    .line 543
    add-int/lit8 v2, v2, 0x1

    .line 544
    .line 545
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    goto :goto_9

    .line 550
    :cond_9
    sget-object v0, La/iun;->a:La/iun;

    .line 551
    .line 552
    :goto_9
    new-array v2, v5, [Ljava/lang/String;

    .line 553
    .line 554
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    check-cast v0, [Ljava/lang/String;

    .line 559
    .line 560
    array-length v2, v0

    .line 561
    move v4, v5

    .line 562
    :goto_a
    if-ge v4, v2, :cond_c

    .line 563
    .line 564
    aget-object v8, v0, v4

    .line 565
    .line 566
    const-string v9, "wlan0"

    .line 567
    .line 568
    invoke-static {v8, v9, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 569
    .line 570
    .line 571
    move-result v9

    .line 572
    if-nez v9, :cond_a

    .line 573
    .line 574
    const-string v9, "tunl0"

    .line 575
    .line 576
    invoke-static {v8, v9, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 577
    .line 578
    .line 579
    move-result v9

    .line 580
    if-nez v9, :cond_a

    .line 581
    .line 582
    const-string v9, "eth0"

    .line 583
    .line 584
    invoke-static {v8, v9, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 585
    .line 586
    .line 587
    move-result v9

    .line 588
    if-eqz v9, :cond_b

    .line 589
    .line 590
    :cond_a
    const-string v9, "10.0.2.15"

    .line 591
    .line 592
    invoke-static {v8, v9, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 593
    .line 594
    .line 595
    move-result v8

    .line 596
    if-eqz v8, :cond_b

    .line 597
    .line 598
    goto :goto_d

    .line 599
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 600
    .line 601
    goto :goto_a

    .line 602
    :cond_c
    sget-object v0, La/chf0;->j:[La/a0d0;

    .line 603
    .line 604
    array-length v2, v0

    .line 605
    move v4, v5

    .line 606
    move v8, v4

    .line 607
    :goto_b
    if-ge v4, v2, :cond_f

    .line 608
    .line 609
    aget-object v9, v0, v4

    .line 610
    .line 611
    iget-object v10, v9, La/a0d0;->a:Ljava/lang/String;

    .line 612
    .line 613
    iget-object v9, v9, La/a0d0;->b:Ljava/lang/String;

    .line 614
    .line 615
    :try_start_2
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 616
    .line 617
    .line 618
    move-result-object v11

    .line 619
    const-string v12, "android.os.SystemProperties"

    .line 620
    .line 621
    invoke-virtual {v11, v12}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    move-result-object v11

    .line 625
    const-string v12, "get"

    .line 626
    .line 627
    const-class v13, Ljava/lang/String;

    .line 628
    .line 629
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    move-result-object v13

    .line 633
    invoke-virtual {v11, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 634
    .line 635
    .line 636
    move-result-object v12

    .line 637
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v10

    .line 641
    const/4 v13, 0x1

    .line 642
    invoke-static {v10, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v10

    .line 646
    invoke-virtual {v12, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v10

    .line 650
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    check-cast v10, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 654
    .line 655
    goto :goto_c

    .line 656
    :catch_2
    move-object/from16 v10, v16

    .line 657
    .line 658
    :goto_c
    if-nez v9, :cond_d

    .line 659
    .line 660
    if-eqz v10, :cond_d

    .line 661
    .line 662
    add-int/lit8 v8, v8, 0x1

    .line 663
    .line 664
    :cond_d
    if-eqz v9, :cond_e

    .line 665
    .line 666
    if-eqz v10, :cond_e

    .line 667
    .line 668
    invoke-static {v10, v9, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 669
    .line 670
    .line 671
    move-result v9

    .line 672
    const/4 v13, 0x1

    .line 673
    if-ne v9, v13, :cond_e

    .line 674
    .line 675
    add-int/lit8 v8, v8, 0x1

    .line 676
    .line 677
    :cond_e
    add-int/lit8 v4, v4, 0x1

    .line 678
    .line 679
    goto :goto_b

    .line 680
    :cond_f
    if-lt v8, v3, :cond_10

    .line 681
    .line 682
    sget-object v0, La/chf0;->g:[Ljava/lang/String;

    .line 683
    .line 684
    const-string v2, "X86"

    .line 685
    .line 686
    invoke-virtual {v1, v2, v0}, La/chf0;->q(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    if-eqz v0, :cond_10

    .line 691
    .line 692
    goto :goto_d

    .line 693
    :cond_10
    move v0, v5

    .line 694
    goto :goto_e

    .line 695
    :cond_11
    :goto_d
    const/4 v0, 0x1

    .line 696
    :cond_12
    :goto_e
    if-nez v0, :cond_16

    .line 697
    .line 698
    iget-object v0, v1, La/chf0;->c:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v0, Ljava/util/ArrayList;

    .line 701
    .line 702
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    if-eqz v2, :cond_14

    .line 707
    .line 708
    :cond_13
    move v0, v5

    .line 709
    goto :goto_f

    .line 710
    :cond_14
    iget-object v2, v1, La/chf0;->b:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v2, La/us00;

    .line 713
    .line 714
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    new-instance v4, La/sx3;

    .line 719
    .line 720
    const/4 v9, 0x1

    .line 721
    invoke-direct {v4, v0, v9}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 722
    .line 723
    .line 724
    new-instance v0, La/hvn;

    .line 725
    .line 726
    invoke-direct {v0, v2, v5}, La/hvn;-><init>(Landroid/content/pm/PackageManager;B)V

    .line 727
    .line 728
    .line 729
    invoke-static {v4, v0}, La/pgi0;->q(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    new-instance v4, La/hvn;

    .line 734
    .line 735
    invoke-direct {v4, v2, v9}, La/hvn;-><init>(Landroid/content/pm/PackageManager;B)V

    .line 736
    .line 737
    .line 738
    invoke-static {v0, v4}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    iget-object v2, v0, La/qls0;->a:Lkotlin/sequences/Sequence;

    .line 743
    .line 744
    invoke-interface {v2}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    :cond_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 749
    .line 750
    .line 751
    move-result v4

    .line 752
    if-eqz v4, :cond_13

    .line 753
    .line 754
    iget-object v4, v0, La/qls0;->b:Lkotlin/jvm/functions/Function1;

    .line 755
    .line 756
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v6

    .line 760
    invoke-interface {v4, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v4

    .line 764
    check-cast v4, Ljava/util/List;

    .line 765
    .line 766
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    if-nez v4, :cond_15

    .line 774
    .line 775
    const/4 v0, 0x1

    .line 776
    :cond_16
    :goto_f
    if-nez v0, :cond_17

    .line 777
    .line 778
    const-string v0, "/mnt/windows/BstSharedFolder"

    .line 779
    .line 780
    filled-new-array {v0}, [Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    aget-object v0, v0, v5

    .line 785
    .line 786
    new-instance v2, Ljava/io/File;

    .line 787
    .line 788
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 792
    .line 793
    .line 794
    move-result v0

    .line 795
    :cond_17
    if-nez v0, :cond_1c

    .line 796
    .line 797
    :try_start_3
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    const/4 v9, 0x1

    .line 802
    new-array v2, v9, [Z

    .line 803
    .line 804
    aput-boolean v5, v2, v5

    .line 805
    .line 806
    new-instance v4, Ljava/lang/Object;

    .line 807
    .line 808
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 809
    .line 810
    .line 811
    new-instance v6, La/g8l;

    .line 812
    .line 813
    const/16 v8, 0xa

    .line 814
    .line 815
    invoke-direct {v6, v0, v2, v4, v8}, La/g8l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 816
    .line 817
    .line 818
    new-instance v8, Landroid/os/Handler;

    .line 819
    .line 820
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 821
    .line 822
    .line 823
    move-result-object v9

    .line 824
    invoke-direct {v8, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 825
    .line 826
    .line 827
    new-instance v9, La/w1;

    .line 828
    .line 829
    invoke-direct {v9, v6, v3}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 833
    .line 834
    .line 835
    monitor-enter v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 836
    :goto_10
    :try_start_4
    aget-boolean v3, v2, v5

    .line 837
    .line 838
    if-nez v3, :cond_18

    .line 839
    .line 840
    invoke-virtual {v4}, Ljava/lang/Object;->wait()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 841
    .line 842
    .line 843
    goto :goto_10

    .line 844
    :catchall_0
    move-exception v0

    .line 845
    goto :goto_13

    .line 846
    :cond_18
    :try_start_5
    monitor-exit v4

    .line 847
    aget-object v0, v0, v5

    .line 848
    .line 849
    if-nez v0, :cond_1a

    .line 850
    .line 851
    :cond_19
    :goto_11
    move v0, v5

    .line 852
    goto :goto_15

    .line 853
    :cond_1a
    const-string v2, "Bluestacks"

    .line 854
    .line 855
    invoke-static {v0, v2, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 856
    .line 857
    .line 858
    move-result v2

    .line 859
    if-nez v2, :cond_1b

    .line 860
    .line 861
    const-string v2, "Translator"

    .line 862
    .line 863
    invoke-static {v0, v2, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    if-eqz v0, :cond_19

    .line 868
    .line 869
    goto :goto_12

    .line 870
    :catch_3
    move-exception v0

    .line 871
    goto :goto_14

    .line 872
    :cond_1b
    :goto_12
    const/4 v0, 0x1

    .line 873
    goto :goto_15

    .line 874
    :goto_13
    monitor-exit v4

    .line 875
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 876
    :goto_14
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 877
    .line 878
    .line 879
    goto :goto_11

    .line 880
    :cond_1c
    :goto_15
    if-nez v0, :cond_25

    .line 881
    .line 882
    iget-object v0, v1, La/chf0;->b:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v0, La/us00;

    .line 885
    .line 886
    const-string v1, "ranchu"

    .line 887
    .line 888
    const-string v2, "goldfish"

    .line 889
    .line 890
    const-string v3, "sdk"

    .line 891
    .line 892
    const-string v4, "google_sdk"

    .line 893
    .line 894
    const-string v6, "unknown"

    .line 895
    .line 896
    sget-object v8, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 897
    .line 898
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    const-string v9, "generic"

    .line 902
    .line 903
    invoke-static {v8, v9, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 904
    .line 905
    .line 906
    move-result v10

    .line 907
    if-nez v10, :cond_23

    .line 908
    .line 909
    invoke-static {v8, v6, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 910
    .line 911
    .line 912
    move-result v8

    .line 913
    if-nez v8, :cond_23

    .line 914
    .line 915
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 916
    .line 917
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    invoke-static {v8, v4, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 921
    .line 922
    .line 923
    move-result v10

    .line 924
    if-nez v10, :cond_23

    .line 925
    .line 926
    invoke-static {v8, v3, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 927
    .line 928
    .line 929
    move-result v10

    .line 930
    if-nez v10, :cond_23

    .line 931
    .line 932
    const-string v10, "Emulator"

    .line 933
    .line 934
    invoke-static {v8, v10, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 935
    .line 936
    .line 937
    move-result v10

    .line 938
    if-nez v10, :cond_23

    .line 939
    .line 940
    const-string v10, "Android SDK built for x86"

    .line 941
    .line 942
    invoke-static {v8, v10, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 943
    .line 944
    .line 945
    move-result v8

    .line 946
    if-nez v8, :cond_23

    .line 947
    .line 948
    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 949
    .line 950
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    const-string v10, "Genymotion"

    .line 954
    .line 955
    invoke-static {v8, v10, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 956
    .line 957
    .line 958
    move-result v10

    .line 959
    if-nez v10, :cond_23

    .line 960
    .line 961
    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 962
    .line 963
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    invoke-static {v10, v9, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 967
    .line 968
    .line 969
    move-result v10

    .line 970
    if-eqz v10, :cond_1d

    .line 971
    .line 972
    sget-object v10, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 973
    .line 974
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 975
    .line 976
    .line 977
    invoke-static {v10, v9, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 978
    .line 979
    .line 980
    move-result v10

    .line 981
    if-nez v10, :cond_23

    .line 982
    .line 983
    :cond_1d
    sget-object v10, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 984
    .line 985
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    invoke-static {v10, v4, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 989
    .line 990
    .line 991
    move-result v4

    .line 992
    if-nez v4, :cond_23

    .line 993
    .line 994
    invoke-static {v10, v3, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    if-nez v3, :cond_23

    .line 999
    .line 1000
    sget-object v3, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 1001
    .line 1002
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    invoke-static {v3, v2, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v4

    .line 1009
    if-nez v4, :cond_23

    .line 1010
    .line 1011
    invoke-static {v3, v1, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v3

    .line 1015
    if-nez v3, :cond_23

    .line 1016
    .line 1017
    sget-object v3, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 1018
    .line 1019
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    invoke-static {v3, v6, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v3

    .line 1026
    if-nez v3, :cond_23

    .line 1027
    .line 1028
    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 1029
    .line 1030
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    const-string v4, "FRF91"

    .line 1034
    .line 1035
    invoke-static {v3, v4, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v3

    .line 1039
    if-nez v3, :cond_23

    .line 1040
    .line 1041
    invoke-static {v8, v6, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v3

    .line 1045
    if-nez v3, :cond_23

    .line 1046
    .line 1047
    sget-object v3, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 1048
    .line 1049
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1050
    .line 1051
    .line 1052
    const-string v4, "test-keys"

    .line 1053
    .line 1054
    invoke-static {v3, v4, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v3

    .line 1058
    if-eqz v3, :cond_1e

    .line 1059
    .line 1060
    goto/16 :goto_16

    .line 1061
    .line 1062
    :cond_1e
    const-string v3, "ro.hardware"

    .line 1063
    .line 1064
    invoke-static {v0, v3}, La/m0x0;->N(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v4

    .line 1068
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v2

    .line 1072
    if-nez v2, :cond_23

    .line 1073
    .line 1074
    invoke-static {v0, v3}, La/m0x0;->N(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    if-nez v1, :cond_23

    .line 1083
    .line 1084
    const-string v1, "ro.product.device"

    .line 1085
    .line 1086
    invoke-static {v0, v1}, La/m0x0;->N(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v1

    .line 1090
    invoke-virtual {v9, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v1

    .line 1094
    if-nez v1, :cond_23

    .line 1095
    .line 1096
    const-string v1, "1"

    .line 1097
    .line 1098
    const-string v2, "ro.kernel.qemu"

    .line 1099
    .line 1100
    invoke-static {v0, v2}, La/m0x0;->N(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v2

    .line 1104
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1105
    .line 1106
    .line 1107
    move-result v1

    .line 1108
    if-nez v1, :cond_23

    .line 1109
    .line 1110
    const-string v1, "0"

    .line 1111
    .line 1112
    const-string v2, "ro.secure"

    .line 1113
    .line 1114
    invoke-static {v0, v2}, La/m0x0;->N(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v0

    .line 1122
    if-eqz v0, :cond_1f

    .line 1123
    .line 1124
    goto :goto_16

    .line 1125
    :cond_1f
    :try_start_6
    new-instance v0, Ljava/io/BufferedReader;

    .line 1126
    .line 1127
    new-instance v1, Ljava/io/FileReader;

    .line 1128
    .line 1129
    const-string v2, "/proc/cpuinfo"

    .line 1130
    .line 1131
    invoke-direct {v1, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 1132
    .line 1133
    .line 1134
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 1135
    .line 1136
    .line 1137
    :cond_20
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    const-string v2, "Goldfish"

    .line 1145
    .line 1146
    invoke-static {v1, v2, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 1150
    if-eqz v1, :cond_20

    .line 1151
    .line 1152
    goto :goto_16

    .line 1153
    :catch_4
    new-instance v0, Ljava/io/File;

    .line 1154
    .line 1155
    const-string v1, "/init.goldfish.rc"

    .line 1156
    .line 1157
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1161
    .line 1162
    .line 1163
    move-result v0

    .line 1164
    if-nez v0, :cond_23

    .line 1165
    .line 1166
    new-instance v0, Ljava/io/File;

    .line 1167
    .line 1168
    const-string v1, "/sys/qemu_trace"

    .line 1169
    .line 1170
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v0

    .line 1177
    if-nez v0, :cond_23

    .line 1178
    .line 1179
    new-instance v0, Ljava/io/File;

    .line 1180
    .line 1181
    const-string v1, "/system/bin/qemud"

    .line 1182
    .line 1183
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1187
    .line 1188
    .line 1189
    move-result v0

    .line 1190
    if-eqz v0, :cond_21

    .line 1191
    .line 1192
    goto :goto_16

    .line 1193
    :cond_21
    :try_start_7
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    :cond_22
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 1198
    .line 1199
    .line 1200
    move-result v1

    .line 1201
    if-eqz v1, :cond_24

    .line 1202
    .line 1203
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    check-cast v1, Ljava/net/NetworkInterface;

    .line 1208
    .line 1209
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    const-string v2, "eth0"

    .line 1214
    .line 1215
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    .line 1219
    if-eqz v1, :cond_22

    .line 1220
    .line 1221
    :cond_23
    :goto_16
    const/4 v5, 0x1

    .line 1222
    :catch_5
    :cond_24
    move v0, v5

    .line 1223
    :cond_25
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    invoke-virtual {v7, v0}, La/ctl;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    return-void

    .line 1231
    :pswitch_0
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v1, La/mbn;

    .line 1234
    .line 1235
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast v0, La/imn0;

    .line 1238
    .line 1239
    iget-object v2, v1, La/mbn;->c:La/lmv;

    .line 1240
    .line 1241
    new-instance v3, La/m3a;

    .line 1242
    .line 1243
    invoke-direct {v3, v1, v0, v4}, La/m3a;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v0, v2, v3}, La/imn0;->c(La/lmv;La/sbe;)Landroid/view/Surface;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v2

    .line 1250
    iget-object v3, v1, La/mbn;->a:La/jbn;

    .line 1251
    .line 1252
    invoke-virtual {v3, v2}, La/p8l;->s(Landroid/view/Surface;)V

    .line 1253
    .line 1254
    .line 1255
    iget-object v1, v1, La/mbn;->h:Ljava/util/LinkedHashMap;

    .line 1256
    .line 1257
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    return-void

    .line 1261
    :pswitch_1
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1262
    .line 1263
    check-cast v1, La/mbn;

    .line 1264
    .line 1265
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1266
    .line 1267
    check-cast v0, La/pmn0;

    .line 1268
    .line 1269
    iget v2, v1, La/mbn;->e:I

    .line 1270
    .line 1271
    const/4 v9, 0x1

    .line 1272
    add-int/2addr v2, v9

    .line 1273
    iput v2, v1, La/mbn;->e:I

    .line 1274
    .line 1275
    new-instance v2, Landroid/graphics/SurfaceTexture;

    .line 1276
    .line 1277
    iget-object v3, v1, La/mbn;->a:La/jbn;

    .line 1278
    .line 1279
    iget-boolean v4, v0, La/pmn0;->e:Z

    .line 1280
    .line 1281
    iget-object v5, v0, La/pmn0;->b:Landroid/util/Size;

    .line 1282
    .line 1283
    iget-object v6, v3, La/p8l;->c:Ljava/lang/Object;

    .line 1284
    .line 1285
    check-cast v6, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1286
    .line 1287
    invoke-static {v6, v9}, La/vfr;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 1288
    .line 1289
    .line 1290
    iget-object v6, v3, La/p8l;->b:Ljava/lang/Object;

    .line 1291
    .line 1292
    check-cast v6, Ljava/lang/Thread;

    .line 1293
    .line 1294
    invoke-static {v6}, La/vfr;->c(Ljava/lang/Thread;)V

    .line 1295
    .line 1296
    .line 1297
    if-eqz v4, :cond_26

    .line 1298
    .line 1299
    iget v3, v3, La/jbn;->n:I

    .line 1300
    .line 1301
    goto :goto_17

    .line 1302
    :cond_26
    iget v3, v3, La/jbn;->o:I

    .line 1303
    .line 1304
    :goto_17
    invoke-direct {v2, v3}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    .line 1308
    .line 1309
    .line 1310
    move-result v3

    .line 1311
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 1312
    .line 1313
    .line 1314
    move-result v5

    .line 1315
    invoke-virtual {v2, v3, v5}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 1316
    .line 1317
    .line 1318
    new-instance v3, Landroid/view/Surface;

    .line 1319
    .line 1320
    invoke-direct {v3, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 1321
    .line 1322
    .line 1323
    iget-object v5, v1, La/mbn;->c:La/lmv;

    .line 1324
    .line 1325
    new-instance v6, La/lbn;

    .line 1326
    .line 1327
    invoke-direct {v6, v1, v2, v3}, La/lbn;-><init>(La/mbn;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v0, v3, v5, v6}, La/pmn0;->a(Landroid/view/Surface;Ljava/util/concurrent/Executor;La/sbe;)V

    .line 1331
    .line 1332
    .line 1333
    if-eqz v4, :cond_27

    .line 1334
    .line 1335
    iput-object v2, v1, La/mbn;->i:Landroid/graphics/SurfaceTexture;

    .line 1336
    .line 1337
    goto :goto_18

    .line 1338
    :cond_27
    iput-object v2, v1, La/mbn;->j:Landroid/graphics/SurfaceTexture;

    .line 1339
    .line 1340
    iget-object v0, v1, La/mbn;->d:Landroid/os/Handler;

    .line 1341
    .line 1342
    invoke-virtual {v2, v1, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 1343
    .line 1344
    .line 1345
    :goto_18
    return-void

    .line 1346
    :pswitch_2
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1347
    .line 1348
    check-cast v1, La/lyl;

    .line 1349
    .line 1350
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1351
    .line 1352
    check-cast v0, Ljava/util/ArrayList;

    .line 1353
    .line 1354
    iget-boolean v2, v1, La/lyl;->u2:Z

    .line 1355
    .line 1356
    if-nez v2, :cond_28

    .line 1357
    .line 1358
    iget-object v2, v1, La/lyl;->r2:La/uyl;

    .line 1359
    .line 1360
    sget-object v3, La/uyl;->b:La/uyl;

    .line 1361
    .line 1362
    if-eq v2, v3, :cond_28

    .line 1363
    .line 1364
    new-instance v2, La/kyl;

    .line 1365
    .line 1366
    invoke-direct {v2, v0, v1}, La/kyl;-><init>(Ljava/util/List;La/lyl;)V

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1370
    .line 1371
    .line 1372
    :cond_28
    iput-boolean v5, v1, La/lyl;->u2:Z

    .line 1373
    .line 1374
    return-void

    .line 1375
    :pswitch_3
    iget-object v1, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1376
    .line 1377
    check-cast v1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 1378
    .line 1379
    iget-object v0, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1380
    .line 1381
    check-cast v0, Ljava/util/List;

    .line 1382
    .line 1383
    sget-object v2, La/szk;->Q1:[La/iiy;

    .line 1384
    .line 1385
    invoke-virtual {v1, v0}, Lorg/xplatform/domino/presentation/views/DominoHandView;->setOpponentBones(Ljava/util/List;)V

    .line 1386
    .line 1387
    .line 1388
    return-void

    .line 1389
    :pswitch_4
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1390
    .line 1391
    check-cast v1, La/rgk;

    .line 1392
    .line 1393
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v0, Landroid/content/Context;

    .line 1396
    .line 1397
    iget-object v2, v1, La/rgk;->a:Landroid/content/SharedPreferences;

    .line 1398
    .line 1399
    if-nez v2, :cond_29

    .line 1400
    .line 1401
    if-eqz v0, :cond_29

    .line 1402
    .line 1403
    const-string v2, "FirebasePerfSharedPrefs"

    .line 1404
    .line 1405
    invoke-virtual {v0, v2, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v0

    .line 1409
    iput-object v0, v1, La/rgk;->a:Landroid/content/SharedPreferences;

    .line 1410
    .line 1411
    :cond_29
    return-void

    .line 1412
    :pswitch_5
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1413
    .line 1414
    check-cast v1, Ljava/util/concurrent/Callable;

    .line 1415
    .line 1416
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1417
    .line 1418
    check-cast v0, La/prc;

    .line 1419
    .line 1420
    iget-object v0, v0, La/prc;->b:Ljava/lang/Object;

    .line 1421
    .line 1422
    move-object v2, v0

    .line 1423
    check-cast v2, La/o3k;

    .line 1424
    .line 1425
    :try_start_8
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    invoke-virtual {v2, v0}, La/y4;->l(Ljava/lang/Object;)Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 1430
    .line 1431
    .line 1432
    goto :goto_19

    .line 1433
    :catch_6
    move-exception v0

    .line 1434
    invoke-virtual {v2, v0}, La/y4;->m(Ljava/lang/Throwable;)Z

    .line 1435
    .line 1436
    .line 1437
    :goto_19
    return-void

    .line 1438
    :pswitch_6
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1439
    .line 1440
    check-cast v1, La/hzj;

    .line 1441
    .line 1442
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1443
    .line 1444
    move-object v2, v0

    .line 1445
    check-cast v2, Ljava/lang/String;

    .line 1446
    .line 1447
    :try_start_9
    iget-object v0, v1, La/hzj;->e:La/wu9;

    .line 1448
    .line 1449
    invoke-virtual {v0}, La/wu9;->get()Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    const-string v0, "Surface terminated"

    .line 1453
    .line 1454
    sget-object v3, La/hzj;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1455
    .line 1456
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 1457
    .line 1458
    .line 1459
    move-result v3

    .line 1460
    sget-object v4, La/hzj;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1461
    .line 1462
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1463
    .line 1464
    .line 1465
    move-result v4

    .line 1466
    invoke-virtual {v1, v3, v4, v0}, La/hzj;->e(IILjava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    .line 1467
    .line 1468
    .line 1469
    return-void

    .line 1470
    :catch_7
    move-exception v0

    .line 1471
    const-string v3, "DeferrableSurface"

    .line 1472
    .line 1473
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1474
    .line 1475
    const-string v5, "Unexpected surface termination for "

    .line 1476
    .line 1477
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1478
    .line 1479
    .line 1480
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1481
    .line 1482
    .line 1483
    const-string v5, "\nStack Trace:\n"

    .line 1484
    .line 1485
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1489
    .line 1490
    .line 1491
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v2

    .line 1495
    invoke-static {v3, v2}, La/l8x;->X(Ljava/lang/String;Ljava/lang/String;)V

    .line 1496
    .line 1497
    .line 1498
    iget-object v2, v1, La/hzj;->a:Ljava/lang/Object;

    .line 1499
    .line 1500
    monitor-enter v2

    .line 1501
    :try_start_a
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 1502
    .line 1503
    const-string v4, "DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception."

    .line 1504
    .line 1505
    iget-boolean v5, v1, La/hzj;->c:Z

    .line 1506
    .line 1507
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v5

    .line 1511
    iget v6, v1, La/hzj;->b:I

    .line 1512
    .line 1513
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v6

    .line 1517
    filled-new-array {v1, v5, v6}, [Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v1

    .line 1525
    invoke-direct {v3, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1526
    .line 1527
    .line 1528
    throw v3

    .line 1529
    :catchall_1
    move-exception v0

    .line 1530
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 1531
    throw v0

    .line 1532
    :pswitch_7
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1533
    .line 1534
    check-cast v1, La/fhj;

    .line 1535
    .line 1536
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1537
    .line 1538
    check-cast v0, La/qfu0;

    .line 1539
    .line 1540
    iget-object v1, v1, La/fhj;->b:Ljava/lang/Object;

    .line 1541
    .line 1542
    check-cast v1, La/czj;

    .line 1543
    .line 1544
    iget-object v1, v1, La/czj;->i:La/nfu0;

    .line 1545
    .line 1546
    invoke-interface {v1, v0}, La/nfu0;->a(La/qfu0;)V

    .line 1547
    .line 1548
    .line 1549
    return-void

    .line 1550
    :pswitch_8
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1551
    .line 1552
    check-cast v1, La/txj;

    .line 1553
    .line 1554
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1555
    .line 1556
    check-cast v0, La/pmn0;

    .line 1557
    .line 1558
    iget v2, v1, La/txj;->i:I

    .line 1559
    .line 1560
    const/4 v9, 0x1

    .line 1561
    add-int/2addr v2, v9

    .line 1562
    iput v2, v1, La/txj;->i:I

    .line 1563
    .line 1564
    new-instance v2, Landroid/graphics/SurfaceTexture;

    .line 1565
    .line 1566
    iget-object v3, v1, La/txj;->a:La/p8l;

    .line 1567
    .line 1568
    iget-object v4, v3, La/p8l;->c:Ljava/lang/Object;

    .line 1569
    .line 1570
    check-cast v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1571
    .line 1572
    invoke-static {v4, v9}, La/vfr;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 1573
    .line 1574
    .line 1575
    iget-object v4, v3, La/p8l;->b:Ljava/lang/Object;

    .line 1576
    .line 1577
    check-cast v4, Ljava/lang/Thread;

    .line 1578
    .line 1579
    invoke-static {v4}, La/vfr;->c(Ljava/lang/Thread;)V

    .line 1580
    .line 1581
    .line 1582
    iget v3, v3, La/p8l;->a:I

    .line 1583
    .line 1584
    invoke-direct {v2, v3}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 1585
    .line 1586
    .line 1587
    iget-object v3, v0, La/pmn0;->b:Landroid/util/Size;

    .line 1588
    .line 1589
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 1590
    .line 1591
    .line 1592
    move-result v4

    .line 1593
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 1594
    .line 1595
    .line 1596
    move-result v3

    .line 1597
    invoke-virtual {v2, v4, v3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 1598
    .line 1599
    .line 1600
    new-instance v3, Landroid/view/Surface;

    .line 1601
    .line 1602
    invoke-direct {v3, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 1603
    .line 1604
    .line 1605
    iget-object v4, v1, La/txj;->c:La/lmv;

    .line 1606
    .line 1607
    new-instance v5, La/uq;

    .line 1608
    .line 1609
    const/16 v6, 0xd

    .line 1610
    .line 1611
    invoke-direct {v5, v1, v0, v6}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v0, v4, v5}, La/pmn0;->b(Ljava/util/concurrent/Executor;La/omn0;)V

    .line 1615
    .line 1616
    .line 1617
    new-instance v5, La/sxj;

    .line 1618
    .line 1619
    invoke-direct {v5, v1, v0, v2, v3}, La/sxj;-><init>(La/txj;La/pmn0;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    .line 1620
    .line 1621
    .line 1622
    invoke-virtual {v0, v3, v4, v5}, La/pmn0;->a(Landroid/view/Surface;Ljava/util/concurrent/Executor;La/sbe;)V

    .line 1623
    .line 1624
    .line 1625
    iget-object v0, v1, La/txj;->d:Landroid/os/Handler;

    .line 1626
    .line 1627
    invoke-virtual {v2, v1, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 1628
    .line 1629
    .line 1630
    return-void

    .line 1631
    :pswitch_9
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1632
    .line 1633
    check-cast v1, La/txj;

    .line 1634
    .line 1635
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1636
    .line 1637
    check-cast v0, La/j35;

    .line 1638
    .line 1639
    iget-object v1, v1, La/txj;->k:Ljava/util/ArrayList;

    .line 1640
    .line 1641
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    return-void

    .line 1645
    :pswitch_a
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1646
    .line 1647
    check-cast v1, La/txj;

    .line 1648
    .line 1649
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1650
    .line 1651
    check-cast v0, La/imn0;

    .line 1652
    .line 1653
    iget-object v2, v1, La/txj;->c:La/lmv;

    .line 1654
    .line 1655
    new-instance v3, La/m3a;

    .line 1656
    .line 1657
    const/4 v9, 0x1

    .line 1658
    invoke-direct {v3, v1, v0, v9}, La/m3a;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual {v0, v2, v3}, La/imn0;->c(La/lmv;La/sbe;)Landroid/view/Surface;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v2

    .line 1665
    iget-object v3, v1, La/txj;->a:La/p8l;

    .line 1666
    .line 1667
    invoke-virtual {v3, v2}, La/p8l;->s(Landroid/view/Surface;)V

    .line 1668
    .line 1669
    .line 1670
    iget-object v1, v1, La/txj;->h:Ljava/util/LinkedHashMap;

    .line 1671
    .line 1672
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    return-void

    .line 1676
    :pswitch_b
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1677
    .line 1678
    check-cast v1, La/tuj;

    .line 1679
    .line 1680
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1681
    .line 1682
    check-cast v0, Landroid/net/Uri;

    .line 1683
    .line 1684
    iput-boolean v5, v1, La/tuj;->j:Z

    .line 1685
    .line 1686
    iget-object v2, v1, La/tuj;->a:Landroid/net/Uri;

    .line 1687
    .line 1688
    iget-object v3, v1, La/tuj;->m:La/vuj;

    .line 1689
    .line 1690
    iget-object v3, v3, La/vuj;->r:Landroid/net/Uri;

    .line 1691
    .line 1692
    invoke-virtual {v2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1693
    .line 1694
    .line 1695
    move-result v2

    .line 1696
    if-nez v2, :cond_2a

    .line 1697
    .line 1698
    iget-boolean v2, v1, La/tuj;->l:Z

    .line 1699
    .line 1700
    if-eqz v2, :cond_2b

    .line 1701
    .line 1702
    :cond_2a
    invoke-virtual {v1, v0}, La/tuj;->c(Landroid/net/Uri;)V

    .line 1703
    .line 1704
    .line 1705
    :cond_2b
    return-void

    .line 1706
    :pswitch_c
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1707
    .line 1708
    check-cast v1, La/cgx0;

    .line 1709
    .line 1710
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1711
    .line 1712
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1713
    .line 1714
    iget-boolean v2, v1, La/cgx0;->b:Z

    .line 1715
    .line 1716
    if-eqz v2, :cond_2c

    .line 1717
    .line 1718
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 1719
    .line 1720
    .line 1721
    iput-boolean v5, v1, La/cgx0;->b:Z

    .line 1722
    .line 1723
    :cond_2c
    return-void

    .line 1724
    :pswitch_d
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1725
    .line 1726
    check-cast v1, La/eyf;

    .line 1727
    .line 1728
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1729
    .line 1730
    check-cast v0, Ljava/lang/Runnable;

    .line 1731
    .line 1732
    iget-byte v2, v1, La/eyf;->c:B

    .line 1733
    .line 1734
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 1735
    .line 1736
    .line 1737
    iget-object v1, v1, La/eyf;->d:Landroid/os/StrictMode$ThreadPolicy;

    .line 1738
    .line 1739
    if-eqz v1, :cond_2d

    .line 1740
    .line 1741
    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 1742
    .line 1743
    .line 1744
    :cond_2d
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1745
    .line 1746
    .line 1747
    return-void

    .line 1748
    :pswitch_e
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1749
    .line 1750
    check-cast v1, La/ybf;

    .line 1751
    .line 1752
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1753
    .line 1754
    check-cast v0, Ljava/lang/Exception;

    .line 1755
    .line 1756
    invoke-static {v1, v0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$AS0yfz0pVQO1Ewzm5zGeHqWtm6I(La/ybf;Ljava/lang/Exception;)V

    .line 1757
    .line 1758
    .line 1759
    return-void

    .line 1760
    :pswitch_f
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1761
    .line 1762
    check-cast v1, La/ybf;

    .line 1763
    .line 1764
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1765
    .line 1766
    check-cast v0, La/mie0;

    .line 1767
    .line 1768
    invoke-static {v1, v0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$EfEsA0oxTYc7AqOZZSNy2cLCz-o(La/ybf;La/mie0;)V

    .line 1769
    .line 1770
    .line 1771
    return-void

    .line 1772
    :pswitch_10
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1773
    .line 1774
    check-cast v1, La/icf;

    .line 1775
    .line 1776
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1777
    .line 1778
    check-cast v0, La/d0u;

    .line 1779
    .line 1780
    invoke-virtual {v1}, La/icf;->d()La/ybf;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v1

    .line 1784
    check-cast v1, La/a1d;

    .line 1785
    .line 1786
    invoke-virtual {v1, v0}, La/a1d;->j(Ljava/lang/Object;)V

    .line 1787
    .line 1788
    .line 1789
    return-void

    .line 1790
    :pswitch_11
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1791
    .line 1792
    check-cast v1, La/icf;

    .line 1793
    .line 1794
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1795
    .line 1796
    check-cast v0, La/h0u;

    .line 1797
    .line 1798
    invoke-virtual {v1}, La/icf;->d()La/ybf;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v1

    .line 1802
    check-cast v1, La/a1d;

    .line 1803
    .line 1804
    invoke-virtual {v1, v0}, La/a1d;->j(Ljava/lang/Object;)V

    .line 1805
    .line 1806
    .line 1807
    return-void

    .line 1808
    :pswitch_12
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1809
    .line 1810
    check-cast v1, La/icf;

    .line 1811
    .line 1812
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1813
    .line 1814
    check-cast v0, La/g0u;

    .line 1815
    .line 1816
    invoke-virtual {v1}, La/icf;->d()La/ybf;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v1

    .line 1820
    check-cast v1, La/a1d;

    .line 1821
    .line 1822
    invoke-virtual {v1, v0}, La/a1d;->k(Ljava/lang/Object;)V

    .line 1823
    .line 1824
    .line 1825
    return-void

    .line 1826
    :pswitch_13
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1827
    .line 1828
    check-cast v1, La/icf;

    .line 1829
    .line 1830
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1831
    .line 1832
    check-cast v0, La/mie0;

    .line 1833
    .line 1834
    invoke-virtual {v1}, La/icf;->d()La/ybf;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v1

    .line 1838
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 1839
    .line 1840
    check-cast v1, La/a1d;

    .line 1841
    .line 1842
    invoke-virtual {v1, v0}, La/a1d;->j(Ljava/lang/Object;)V

    .line 1843
    .line 1844
    .line 1845
    return-void

    .line 1846
    :pswitch_14
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1847
    .line 1848
    check-cast v1, La/ybf;

    .line 1849
    .line 1850
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1851
    .line 1852
    check-cast v1, La/a1d;

    .line 1853
    .line 1854
    invoke-virtual {v1, v0}, La/a1d;->j(Ljava/lang/Object;)V

    .line 1855
    .line 1856
    .line 1857
    return-void

    .line 1858
    :pswitch_15
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1859
    .line 1860
    check-cast v1, La/dcf;

    .line 1861
    .line 1862
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1863
    .line 1864
    check-cast v0, La/d0u;

    .line 1865
    .line 1866
    invoke-virtual {v1}, La/dcf;->d()La/ybf;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v1

    .line 1870
    check-cast v1, La/a1d;

    .line 1871
    .line 1872
    invoke-virtual {v1, v0}, La/a1d;->j(Ljava/lang/Object;)V

    .line 1873
    .line 1874
    .line 1875
    return-void

    .line 1876
    :pswitch_16
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1877
    .line 1878
    check-cast v1, La/dcf;

    .line 1879
    .line 1880
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1881
    .line 1882
    check-cast v0, La/mie0;

    .line 1883
    .line 1884
    invoke-virtual {v1}, La/dcf;->d()La/ybf;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v1

    .line 1888
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 1889
    .line 1890
    check-cast v1, La/a1d;

    .line 1891
    .line 1892
    invoke-virtual {v1, v0}, La/a1d;->j(Ljava/lang/Object;)V

    .line 1893
    .line 1894
    .line 1895
    return-void

    .line 1896
    :pswitch_17
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1897
    .line 1898
    check-cast v1, La/dcf;

    .line 1899
    .line 1900
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1901
    .line 1902
    check-cast v0, La/g0u;

    .line 1903
    .line 1904
    invoke-virtual {v1}, La/dcf;->d()La/ybf;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v1

    .line 1908
    check-cast v1, La/a1d;

    .line 1909
    .line 1910
    invoke-virtual {v1, v0}, La/a1d;->k(Ljava/lang/Object;)V

    .line 1911
    .line 1912
    .line 1913
    return-void

    .line 1914
    :pswitch_18
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1915
    .line 1916
    check-cast v1, La/j8f;

    .line 1917
    .line 1918
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1919
    .line 1920
    check-cast v0, Ljava/lang/String;

    .line 1921
    .line 1922
    iget-object v1, v1, La/j8f;->g:La/f8f;

    .line 1923
    .line 1924
    iget-object v1, v1, La/f8f;->d:La/ywq0;

    .line 1925
    .line 1926
    invoke-static {v2, v0}, La/qmy;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v0

    .line 1930
    iget-object v2, v1, La/ywq0;->g:Ljava/lang/Object;

    .line 1931
    .line 1932
    check-cast v2, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 1933
    .line 1934
    monitor-enter v2

    .line 1935
    :try_start_b
    iget-object v3, v1, La/ywq0;->g:Ljava/lang/Object;

    .line 1936
    .line 1937
    check-cast v3, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 1938
    .line 1939
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v3

    .line 1943
    check-cast v3, Ljava/lang/String;

    .line 1944
    .line 1945
    if-nez v0, :cond_2e

    .line 1946
    .line 1947
    if-nez v3, :cond_2f

    .line 1948
    .line 1949
    const/4 v5, 0x1

    .line 1950
    goto :goto_1a

    .line 1951
    :cond_2e
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1952
    .line 1953
    .line 1954
    move-result v5

    .line 1955
    :cond_2f
    :goto_1a
    if-eqz v5, :cond_30

    .line 1956
    .line 1957
    monitor-exit v2

    .line 1958
    goto :goto_1b

    .line 1959
    :catchall_2
    move-exception v0

    .line 1960
    goto :goto_1c

    .line 1961
    :cond_30
    iget-object v3, v1, La/ywq0;->g:Ljava/lang/Object;

    .line 1962
    .line 1963
    check-cast v3, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 1964
    .line 1965
    const/4 v9, 0x1

    .line 1966
    invoke-virtual {v3, v0, v9}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 1967
    .line 1968
    .line 1969
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1970
    iget-object v0, v1, La/ywq0;->b:Ljava/lang/Object;

    .line 1971
    .line 1972
    check-cast v0, La/cu;

    .line 1973
    .line 1974
    iget-object v0, v0, La/cu;->c:Ljava/lang/Object;

    .line 1975
    .line 1976
    check-cast v0, La/aaf;

    .line 1977
    .line 1978
    new-instance v2, La/apj0;

    .line 1979
    .line 1980
    const/16 v3, 0x13

    .line 1981
    .line 1982
    invoke-direct {v2, v1, v3}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 1983
    .line 1984
    .line 1985
    invoke-virtual {v0, v2}, La/aaf;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 1986
    .line 1987
    .line 1988
    :goto_1b
    return-void

    .line 1989
    :goto_1c
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1990
    throw v0

    .line 1991
    :pswitch_19
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 1992
    .line 1993
    check-cast v1, La/f8f;

    .line 1994
    .line 1995
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 1996
    .line 1997
    check-cast v0, Ljava/lang/String;

    .line 1998
    .line 1999
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2000
    .line 2001
    invoke-virtual {v1, v0, v2}, La/f8f;->b(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 2002
    .line 2003
    .line 2004
    return-void

    .line 2005
    :pswitch_1a
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 2006
    .line 2007
    check-cast v1, La/axe;

    .line 2008
    .line 2009
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 2010
    .line 2011
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 2012
    .line 2013
    sget-object v2, La/axe;->e2:La/kud;

    .line 2014
    .line 2015
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 2016
    .line 2017
    .line 2018
    move-result v1

    .line 2019
    if-eqz v1, :cond_31

    .line 2020
    .line 2021
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 2022
    .line 2023
    .line 2024
    :cond_31
    return-void

    .line 2025
    :pswitch_1b
    const/16 v16, 0x0

    .line 2026
    .line 2027
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 2028
    .line 2029
    check-cast v1, La/e7e;

    .line 2030
    .line 2031
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 2032
    .line 2033
    check-cast v0, Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;

    .line 2034
    .line 2035
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 2036
    .line 2037
    sget-object v2, La/dbe;->k2:La/kud;

    .line 2038
    .line 2039
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v1

    .line 2043
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2044
    .line 2045
    .line 2046
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2047
    .line 2048
    .line 2049
    const-string v2, "rate_consultant_dialog"

    .line 2050
    .line 2051
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v3

    .line 2055
    instance-of v4, v3, La/dbe;

    .line 2056
    .line 2057
    if-eqz v4, :cond_32

    .line 2058
    .line 2059
    check-cast v3, La/dbe;

    .line 2060
    .line 2061
    goto :goto_1d

    .line 2062
    :cond_32
    move-object/from16 v3, v16

    .line 2063
    .line 2064
    :goto_1d
    if-eqz v3, :cond_33

    .line 2065
    .line 2066
    iget-object v1, v3, La/dbe;->i2:La/khf0;

    .line 2067
    .line 2068
    sget-object v2, La/dbe;->l2:[La/iiy;

    .line 2069
    .line 2070
    const/16 v17, 0x1

    .line 2071
    .line 2072
    aget-object v4, v2, v17

    .line 2073
    .line 2074
    invoke-virtual {v1, v3, v4, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 2075
    .line 2076
    .line 2077
    invoke-virtual {v3}, La/dbe;->U0()La/ibe;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v0

    .line 2081
    aget-object v2, v2, v17

    .line 2082
    .line 2083
    invoke-virtual {v1, v3, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v1

    .line 2087
    check-cast v1, Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;

    .line 2088
    .line 2089
    invoke-virtual {v0, v1}, La/ibe;->w(Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;)V

    .line 2090
    .line 2091
    .line 2092
    goto :goto_1e

    .line 2093
    :cond_33
    const/16 v17, 0x1

    .line 2094
    .line 2095
    new-instance v3, La/dbe;

    .line 2096
    .line 2097
    invoke-direct {v3}, La/dbe;-><init>()V

    .line 2098
    .line 2099
    .line 2100
    iget-object v4, v3, La/dbe;->i2:La/khf0;

    .line 2101
    .line 2102
    sget-object v5, La/dbe;->l2:[La/iiy;

    .line 2103
    .line 2104
    aget-object v5, v5, v17

    .line 2105
    .line 2106
    invoke-virtual {v4, v3, v5, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 2107
    .line 2108
    .line 2109
    invoke-static {v3, v1, v2}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2110
    .line 2111
    .line 2112
    :goto_1e
    return-void

    .line 2113
    :pswitch_1c
    iget-object v1, v0, La/a4e;->b:Ljava/lang/Object;

    .line 2114
    .line 2115
    check-cast v1, Ljava/util/List;

    .line 2116
    .line 2117
    iget-object v0, v0, La/a4e;->c:Ljava/lang/Object;

    .line 2118
    .line 2119
    check-cast v0, La/b4e;

    .line 2120
    .line 2121
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v1

    .line 2125
    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2126
    .line 2127
    .line 2128
    move-result v2

    .line 2129
    if-eqz v2, :cond_35

    .line 2130
    .line 2131
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v2

    .line 2135
    check-cast v2, La/ww5;

    .line 2136
    .line 2137
    iget-object v3, v0, La/b4e;->e:Ljava/lang/Object;

    .line 2138
    .line 2139
    iget-object v4, v2, La/ww5;->a:La/yw5;

    .line 2140
    .line 2141
    invoke-virtual {v4, v3}, La/yw5;->e(Ljava/lang/Object;)Z

    .line 2142
    .line 2143
    .line 2144
    move-result v3

    .line 2145
    if-eqz v3, :cond_34

    .line 2146
    .line 2147
    new-instance v3, La/v4e;

    .line 2148
    .line 2149
    invoke-virtual {v4}, La/yw5;->d()I

    .line 2150
    .line 2151
    .line 2152
    move-result v4

    .line 2153
    invoke-direct {v3, v4}, La/v4e;-><init>(I)V

    .line 2154
    .line 2155
    .line 2156
    goto :goto_20

    .line 2157
    :cond_34
    sget-object v3, La/u4e;->a:La/u4e;

    .line 2158
    .line 2159
    :goto_20
    iget-object v2, v2, La/ww5;->b:La/hzb0;

    .line 2160
    .line 2161
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2162
    .line 2163
    .line 2164
    invoke-virtual {v2, v3}, La/hzb0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2165
    .line 2166
    .line 2167
    goto :goto_1f

    .line 2168
    :cond_35
    return-void

    .line 2169
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
