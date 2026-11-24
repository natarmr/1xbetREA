.class public final synthetic La/gdv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/pm/PackageInfo;La/x7w0;)V
    .locals 0

    .line 1
    const/16 p2, 0xf

    iput-byte p2, p0, La/gdv0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gdv0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/gdv0;->a:B

    iput-object p1, p0, La/gdv0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/gdv0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object p0, p0, La/gdv0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    check-cast p1, La/n7w0;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v6

    .line 32
    :goto_0
    const-string v1, "firstInstallTime"

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    :cond_1
    const-string p0, "lastUpdateTime"

    .line 46
    .line 47
    invoke-virtual {p1, v6, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :try_start_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 51
    .line 52
    const-class p0, La/oav;

    .line 53
    .line 54
    sget-object v0, La/oav;->d:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object p0, v0

    .line 59
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 60
    .line 61
    new-instance v0, La/g0g0;

    .line 62
    .line 63
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object p0, v0

    .line 67
    :goto_1
    instance-of p0, p0, La/g0g0;

    .line 68
    .line 69
    xor-int/2addr p0, v5

    .line 70
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string v0, "googlePlayServicesAvailable"

    .line 75
    .line 76
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_0
    check-cast p0, Landroid/os/StatFs;

    .line 83
    .line 84
    check-cast p1, La/n7w0;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    if-eqz p0, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    move-object v0, v6

    .line 101
    :goto_2
    const-string v1, "blockSize"

    .line 102
    .line 103
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    if-eqz p0, :cond_3

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    :cond_3
    const-string p0, "blockCount"

    .line 117
    .line 118
    invoke-virtual {p1, v6, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const-string v0, "state"

    .line 126
    .line 127
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {}, Landroid/os/Environment;->isExternalStorageEmulated()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    const-string v0, "emulated"

    .line 139
    .line 140
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_1
    check-cast p0, Landroid/media/AudioManager;

    .line 147
    .line 148
    check-cast p1, La/n7w0;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/media/AudioManager;->getRingerMode()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v1, "ringerMode"

    .line 162
    .line 163
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v4}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const-string v1, "streamRing"

    .line 175
    .line 176
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v3}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    const-string v1, "streamMusic"

    .line 188
    .line 189
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const-string v0, "android.media.property.OUTPUT_SAMPLE_RATE"

    .line 193
    .line 194
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v1, "sampleRate"

    .line 199
    .line 200
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    const-string v0, "android.media.property.SUPPORT_MIC_NEAR_ULTRASOUND"

    .line 204
    .line 205
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    const-string v1, "supportMicUltrasound"

    .line 210
    .line 211
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const-string v0, "android.media.property.SUPPORT_SPEAKER_NEAR_ULTRASOUND"

    .line 215
    .line 216
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const-string v1, "supportSpeakerUltrasound"

    .line 221
    .line 222
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const-string v0, "android.media.property.OUTPUT_FRAMES_PER_BUFFER"

    .line 226
    .line 227
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    const-string v0, "bufferFrames"

    .line 232
    .line 233
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_2
    check-cast p0, Landroid/content/Intent;

    .line 240
    .line 241
    check-cast p1, La/n7w0;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    if-eqz p0, :cond_5

    .line 247
    .line 248
    const-string v0, "level"

    .line 249
    .line 250
    const/4 v1, -0x1

    .line 251
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {p1, v3, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-string v0, "status"

    .line 263
    .line 264
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-ne v0, v4, :cond_4

    .line 269
    .line 270
    move v2, v5

    .line 271
    :cond_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const-string v2, "charging"

    .line 276
    .line 277
    invoke-virtual {p1, v0, v2}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    const-string v0, "plugged"

    .line 281
    .line 282
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-virtual {p1, v2, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-string v0, "health"

    .line 294
    .line 295
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {p1, v2, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    const-string v0, "technology"

    .line 307
    .line 308
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {p1, v2, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    const-string v0, "temperature"

    .line 316
    .line 317
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-virtual {p1, v2, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    const-string v0, "voltage"

    .line 329
    .line 330
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object p0

    .line 344
    :pswitch_3
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 345
    .line 346
    check-cast p1, La/n7w0;

    .line 347
    .line 348
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    if-eqz p0, :cond_6

    .line 352
    .line 353
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    goto :goto_3

    .line 358
    :cond_6
    move-object v0, v6

    .line 359
    :goto_3
    const-string v1, "operator"

    .line 360
    .line 361
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    if-eqz p0, :cond_7

    .line 365
    .line 366
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    :cond_7
    const-string p0, "simCountry"

    .line 371
    .line 372
    invoke-virtual {p1, v6, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-static {}, Landroid/net/TrafficStats;->getTotalTxBytes()J

    .line 376
    .line 377
    .line 378
    move-result-wide v0

    .line 379
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    const-string v0, "TotalTxBytes"

    .line 384
    .line 385
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    .line 389
    .line 390
    .line 391
    move-result-wide v0

    .line 392
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    const-string v0, "TotalRxBytes"

    .line 397
    .line 398
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 402
    .line 403
    return-object p0

    .line 404
    :pswitch_4
    check-cast p0, La/n2w0;

    .line 405
    .line 406
    check-cast p1, Ljava/lang/Throwable;

    .line 407
    .line 408
    sget-object v0, La/n2w0;->h2:La/bzs0;

    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    iget-object v7, p0, La/n2w0;->c2:La/sje;

    .line 414
    .line 415
    if-eqz v7, :cond_8

    .line 416
    .line 417
    sget-object v8, La/m2w0;->a:La/m2w0;

    .line 418
    .line 419
    new-instance v11, La/lvv0;

    .line 420
    .line 421
    invoke-direct {v11, p0, v6}, La/lvv0;-><init>(La/n2w0;La/yje;)V

    .line 422
    .line 423
    .line 424
    const/16 v12, 0xe

    .line 425
    .line 426
    const/4 v9, 0x0

    .line 427
    const/4 v10, 0x0

    .line 428
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 429
    .line 430
    .line 431
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object p0

    .line 434
    :pswitch_5
    check-cast p0, La/o1w0;

    .line 435
    .line 436
    check-cast p1, Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    iget-object v0, p0, La/o1w0;->d:La/wn4;

    .line 442
    .line 443
    iget-object p0, p0, La/o1w0;->g:La/p7m0;

    .line 444
    .line 445
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    check-cast p0, La/j1w0;

    .line 450
    .line 451
    iget-object p0, p0, La/j1w0;->b:Ljava/util/List;

    .line 452
    .line 453
    iget-object v2, v0, La/wn4;->a:La/pru;

    .line 454
    .line 455
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 459
    .line 460
    .line 461
    move-result v7

    .line 462
    const/16 v8, 0xe

    .line 463
    .line 464
    if-eqz v7, :cond_e

    .line 465
    .line 466
    if-ne v7, v5, :cond_d

    .line 467
    .line 468
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    iget-object p1, p1, La/sff0;->N:La/co4;

    .line 473
    .line 474
    iget-object p1, p1, La/co4;->q:La/kse0;

    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 477
    .line 478
    .line 479
    move-result p1

    .line 480
    if-eqz p1, :cond_b

    .line 481
    .line 482
    if-eq p1, v5, :cond_a

    .line 483
    .line 484
    if-ne p1, v4, :cond_9

    .line 485
    .line 486
    new-instance v6, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 487
    .line 488
    sget-object p0, La/z3f0;->Y1:La/zie0;

    .line 489
    .line 490
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    sget-object p0, La/z3f0;->a2:Ljava/lang/String;

    .line 494
    .line 495
    new-instance p1, La/e9d0;

    .line 496
    .line 497
    const/16 v0, 0x9

    .line 498
    .line 499
    invoke-direct {p1, v0}, La/e9d0;-><init>(B)V

    .line 500
    .line 501
    .line 502
    invoke-direct {v6, p0, p1}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;-><init>(Ljava/lang/String;La/xbf;)V

    .line 503
    .line 504
    .line 505
    goto/16 :goto_5

    .line 506
    .line 507
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 508
    .line 509
    .line 510
    goto/16 :goto_5

    .line 511
    .line 512
    :cond_a
    new-instance v6, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 513
    .line 514
    sget-object p0, La/iaf0;->Z1:La/zie0;

    .line 515
    .line 516
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    sget-object p0, La/iaf0;->b2:Ljava/lang/String;

    .line 520
    .line 521
    new-instance p1, La/e9d0;

    .line 522
    .line 523
    const/16 v0, 0xa

    .line 524
    .line 525
    invoke-direct {p1, v0}, La/e9d0;-><init>(B)V

    .line 526
    .line 527
    .line 528
    invoke-direct {v6, p0, p1}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;-><init>(Ljava/lang/String;La/xbf;)V

    .line 529
    .line 530
    .line 531
    goto/16 :goto_5

    .line 532
    .line 533
    :cond_b
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 534
    .line 535
    .line 536
    move-result p1

    .line 537
    if-ne p1, v5, :cond_c

    .line 538
    .line 539
    new-instance p1, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;

    .line 540
    .line 541
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object p0

    .line 545
    check-cast p0, La/q7f0;

    .line 546
    .line 547
    invoke-direct {p1, p0}, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;-><init>(La/q7f0;)V

    .line 548
    .line 549
    .line 550
    new-instance v6, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 551
    .line 552
    sget-object p0, La/dxe0;->Y1:La/lme0;

    .line 553
    .line 554
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    sget-object p0, La/dxe0;->a2:Ljava/lang/String;

    .line 558
    .line 559
    new-instance v0, La/ex60;

    .line 560
    .line 561
    invoke-direct {v0, p1, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 562
    .line 563
    .line 564
    invoke-direct {v6, p0, v0}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;-><init>(Ljava/lang/String;La/xbf;)V

    .line 565
    .line 566
    .line 567
    goto/16 :goto_5

    .line 568
    .line 569
    :cond_c
    sget-object p0, Lorg/xplatform/core/navigation/authorization/model/AuthType;->b:Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 570
    .line 571
    new-instance p1, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;

    .line 572
    .line 573
    new-instance v0, La/gne;

    .line 574
    .line 575
    invoke-direct {v0, p0, v8}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 576
    .line 577
    .line 578
    invoke-direct {p1, v6, v0, v3}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;-><init>(Ljava/lang/String;La/xbf;I)V

    .line 579
    .line 580
    .line 581
    move-object v6, p1

    .line 582
    goto :goto_5

    .line 583
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 584
    .line 585
    .line 586
    goto :goto_5

    .line 587
    :cond_e
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    iget-object p0, p0, La/sff0;->N:La/co4;

    .line 592
    .line 593
    iget-object p0, p0, La/co4;->q:La/kse0;

    .line 594
    .line 595
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 596
    .line 597
    .line 598
    move-result p0

    .line 599
    if-eqz p0, :cond_12

    .line 600
    .line 601
    if-eq p0, v5, :cond_11

    .line 602
    .line 603
    if-ne p0, v4, :cond_10

    .line 604
    .line 605
    iget-object p0, v0, La/wn4;->b:La/n4u;

    .line 606
    .line 607
    iget-object p0, p0, La/n4u;->b:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast p0, La/chf0;

    .line 610
    .line 611
    iget-object p0, p0, La/chf0;->c:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast p0, La/rpx;

    .line 614
    .line 615
    iget-object p0, p0, La/rpx;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 616
    .line 617
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 618
    .line 619
    .line 620
    move-result p0

    .line 621
    if-eqz p0, :cond_f

    .line 622
    .line 623
    new-instance v6, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;

    .line 624
    .line 625
    sget-object p0, La/ze4;->g2:La/qek0;

    .line 626
    .line 627
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    sget-object p0, La/ze4;->i2:Ljava/lang/String;

    .line 631
    .line 632
    new-instance p1, La/jf4;

    .line 633
    .line 634
    const/16 v0, 0x15

    .line 635
    .line 636
    invoke-direct {p1, v0}, La/jf4;-><init>(B)V

    .line 637
    .line 638
    .line 639
    invoke-direct {v6, p0, p1, v4}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;-><init>(Ljava/lang/String;La/xbf;I)V

    .line 640
    .line 641
    .line 642
    goto :goto_5

    .line 643
    :cond_f
    iget-object p0, v0, La/wn4;->c:La/kf4;

    .line 644
    .line 645
    invoke-virtual {p0}, La/kf4;->a()Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Dialog;

    .line 646
    .line 647
    .line 648
    move-result-object v6

    .line 649
    goto :goto_5

    .line 650
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 651
    .line 652
    .line 653
    goto :goto_5

    .line 654
    :cond_11
    new-instance p0, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;

    .line 655
    .line 656
    new-instance p1, La/jf4;

    .line 657
    .line 658
    const/16 v0, 0x16

    .line 659
    .line 660
    invoke-direct {p1, v0}, La/jf4;-><init>(B)V

    .line 661
    .line 662
    .line 663
    invoke-direct {p0, v6, p1, v3}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;-><init>(Ljava/lang/String;La/xbf;I)V

    .line 664
    .line 665
    .line 666
    :goto_4
    move-object v6, p0

    .line 667
    goto :goto_5

    .line 668
    :cond_12
    new-instance p0, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;

    .line 669
    .line 670
    new-instance v0, La/gne;

    .line 671
    .line 672
    invoke-direct {v0, p1, v8}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 673
    .line 674
    .line 675
    invoke-direct {p0, v6, v0, v3}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Screen;-><init>(Ljava/lang/String;La/xbf;I)V

    .line 676
    .line 677
    .line 678
    goto :goto_4

    .line 679
    :goto_5
    return-object v6

    .line 680
    :pswitch_6
    check-cast p0, La/i1w0;

    .line 681
    .line 682
    check-cast p1, Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 683
    .line 684
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    iget-object p0, p0, La/i1w0;->e:La/gdv0;

    .line 688
    .line 689
    if-eqz p0, :cond_13

    .line 690
    .line 691
    invoke-virtual {p0, p1}, La/gdv0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object p0

    .line 695
    move-object v6, p0

    .line 696
    check-cast v6, Lorg/xplatform/core/navigation/authorization/screen/Authorization;

    .line 697
    .line 698
    :cond_13
    return-object v6

    .line 699
    :pswitch_7
    check-cast p0, La/wzv0;

    .line 700
    .line 701
    check-cast p1, La/f240;

    .line 702
    .line 703
    sget-object v0, La/wzv0;->O1:La/wxs0;

    .line 704
    .line 705
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    iget-object p0, p0, La/wzv0;->M1:La/kiu0;

    .line 709
    .line 710
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object p0

    .line 714
    check-cast p0, La/rio0;

    .line 715
    .line 716
    invoke-virtual {p0, p1}, La/rio0;->E(La/f240;)V

    .line 717
    .line 718
    .line 719
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 720
    .line 721
    return-object p0

    .line 722
    :pswitch_8
    check-cast p0, La/cyv0;

    .line 723
    .line 724
    check-cast p1, La/f240;

    .line 725
    .line 726
    sget-object v0, La/cyv0;->O1:La/sxs0;

    .line 727
    .line 728
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    iget-object p0, p0, La/cyv0;->M1:La/kiu0;

    .line 732
    .line 733
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object p0

    .line 737
    check-cast p0, La/fho0;

    .line 738
    .line 739
    invoke-virtual {p0, p1}, La/fho0;->F(La/f240;)V

    .line 740
    .line 741
    .line 742
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 743
    .line 744
    return-object p0

    .line 745
    :pswitch_9
    check-cast p0, La/qnv0;

    .line 746
    .line 747
    check-cast p1, Ljava/lang/Throwable;

    .line 748
    .line 749
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    iget-object v0, p0, La/qnv0;->r:La/duj;

    .line 753
    .line 754
    new-instance v1, La/ggt0;

    .line 755
    .line 756
    const/16 v2, 0x1c

    .line 757
    .line 758
    invoke-direct {v1, p0, v2}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 762
    .line 763
    .line 764
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 765
    .line 766
    return-object p0

    .line 767
    :pswitch_a
    check-cast p0, La/knv0;

    .line 768
    .line 769
    check-cast p1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 770
    .line 771
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    instance-of v1, v0, La/dnv0;

    .line 779
    .line 780
    if-eqz v1, :cond_14

    .line 781
    .line 782
    move-object v6, v0

    .line 783
    check-cast v6, La/dnv0;

    .line 784
    .line 785
    :cond_14
    if-eqz v6, :cond_15

    .line 786
    .line 787
    iget-object p0, p0, La/knv0;->b:La/env0;

    .line 788
    .line 789
    iget-object v0, p0, La/env0;->b:La/a4x;

    .line 790
    .line 791
    iget-object v1, p0, La/env0;->c:La/a4x;

    .line 792
    .line 793
    iget-object v3, p0, La/env0;->a:La/a4x;

    .line 794
    .line 795
    iget-object p0, p0, La/env0;->d:La/vmv0;

    .line 796
    .line 797
    invoke-virtual {v6, v0, v1, v3, p0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 798
    .line 799
    .line 800
    :cond_15
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 801
    .line 802
    .line 803
    move-result-object p0

    .line 804
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderRecyclerView()La/y9b;

    .line 808
    .line 809
    .line 810
    move-result-object p0

    .line 811
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 815
    .line 816
    .line 817
    move-result-object p0

    .line 818
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 819
    .line 820
    .line 821
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 822
    .line 823
    return-object p0

    .line 824
    :pswitch_b
    check-cast p0, La/tmv0;

    .line 825
    .line 826
    check-cast p1, Ljava/lang/Throwable;

    .line 827
    .line 828
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    iget-object v0, p0, La/tmv0;->r:La/duj;

    .line 832
    .line 833
    new-instance v1, La/ggt0;

    .line 834
    .line 835
    const/16 v2, 0x1a

    .line 836
    .line 837
    invoke-direct {v1, p0, v2}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 841
    .line 842
    .line 843
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 844
    .line 845
    return-object p0

    .line 846
    :pswitch_c
    check-cast p0, La/omv0;

    .line 847
    .line 848
    check-cast p1, La/hcz;

    .line 849
    .line 850
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    sget-object v0, La/cfx0;->m:La/ugd;

    .line 854
    .line 855
    invoke-static {p1, v6, v6, v0, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 856
    .line 857
    .line 858
    sget-object v0, La/cfx0;->n:La/ugd;

    .line 859
    .line 860
    invoke-static {p1, v6, v6, v0, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 861
    .line 862
    .line 863
    iget-object p0, p0, La/omv0;->b:La/a4x;

    .line 864
    .line 865
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    new-instance v2, La/vdr0;

    .line 870
    .line 871
    invoke-direct {v2, p0, v1}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 872
    .line 873
    .line 874
    new-instance v1, La/bzp0;

    .line 875
    .line 876
    const/4 v3, 0x6

    .line 877
    invoke-direct {v1, p0, v3}, La/bzp0;-><init>(Ljava/util/List;B)V

    .line 878
    .line 879
    .line 880
    new-instance p0, La/ugd;

    .line 881
    .line 882
    const v3, 0x2fd4df92

    .line 883
    .line 884
    .line 885
    invoke-direct {p0, v3, v5, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {p1, v0, v6, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 889
    .line 890
    .line 891
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 892
    .line 893
    return-object p0

    .line 894
    :pswitch_d
    check-cast p0, La/vft;

    .line 895
    .line 896
    check-cast p1, La/cp;

    .line 897
    .line 898
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 902
    .line 903
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 904
    .line 905
    .line 906
    new-instance v1, La/zfv0;

    .line 907
    .line 908
    invoke-direct {v1, p0, p1, v5}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 909
    .line 910
    .line 911
    invoke-static {v0, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 912
    .line 913
    .line 914
    new-instance p0, La/a8u0;

    .line 915
    .line 916
    const/16 v0, 0x8

    .line 917
    .line 918
    invoke-direct {p0, p1, v0}, La/a8u0;-><init>(La/cp;B)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 922
    .line 923
    .line 924
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 925
    .line 926
    return-object p0

    .line 927
    :pswitch_e
    check-cast p0, La/hdv0;

    .line 928
    .line 929
    check-cast p1, La/abi0;

    .line 930
    .line 931
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    iget p0, p0, La/hdv0;->a:I

    .line 935
    .line 936
    invoke-static {p1, p0}, La/cbi0;->c(La/abi0;I)V

    .line 937
    .line 938
    .line 939
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 940
    .line 941
    return-object p0

    .line 942
    nop

    .line 943
    :pswitch_data_0
    .packed-switch 0x0
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
