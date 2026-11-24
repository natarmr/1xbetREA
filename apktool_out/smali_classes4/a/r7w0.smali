.class public final synthetic La/r7w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x7w0;


# direct methods
.method public synthetic constructor <init>(La/x7w0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r7w0;->a:B

    iput-object p1, p0, La/r7w0;->b:La/x7w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/r7w0;->a:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const-string v2, "magnetometer.values"

    .line 6
    .line 7
    const-string v3, "gyroscope.values"

    .line 8
    .line 9
    const-string v4, "accelerometer.values"

    .line 10
    .line 11
    const-string v5, "roll"

    .line 12
    .line 13
    const-string v6, "pitch"

    .line 14
    .line 15
    const-string v7, "azimuth"

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    iget-object p0, p0, La/r7w0;->b:La/x7w0;

    .line 19
    .line 20
    check-cast p1, La/n7w0;

    .line 21
    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/x7w0;->g:La/y8w0;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget v0, v0, La/y8w0;->d:F

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v0, v8

    .line 40
    :goto_0
    invoke-virtual {p1, v0, v7}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, La/x7w0;->g:La/y8w0;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget v0, v0, La/y8w0;->e:F

    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v0, v8

    .line 55
    :goto_1
    invoke-virtual {p1, v0, v6}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, La/x7w0;->g:La/y8w0;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget v0, v0, La/y8w0;->f:F

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    move-object v0, v8

    .line 70
    :goto_2
    invoke-virtual {p1, v0, v5}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, La/x7w0;->g:La/y8w0;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget-object v0, v0, La/y8w0;->a:La/u8w0;

    .line 78
    .line 79
    iget-object v0, v0, La/u8w0;->g:[F

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    move-object v0, v8

    .line 83
    :goto_3
    invoke-static {v0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0, v4}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, La/x7w0;->g:La/y8w0;

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    iget-object v0, v0, La/y8w0;->b:La/u8w0;

    .line 98
    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    iget-object v0, v0, La/u8w0;->g:[F

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    move-object v0, v8

    .line 105
    :goto_4
    invoke-static {v0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0, v3}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, La/x7w0;->g:La/y8w0;

    .line 116
    .line 117
    if-eqz p0, :cond_5

    .line 118
    .line 119
    iget-object p0, p0, La/y8w0;->c:La/u8w0;

    .line 120
    .line 121
    iget-object v8, p0, La/u8w0;->g:[F

    .line 122
    .line 123
    :cond_5
    invoke-static {v8}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p0, v2}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, La/x7w0;->c:Lorg/xplatform/fingerprint/impl/JniProfiler;

    .line 140
    .line 141
    invoke-static {p0}, Lorg/xplatform/fingerprint/impl/JniProfiler;->a(Lorg/xplatform/fingerprint/impl/JniProfiler;)La/aby;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_6

    .line 146
    .line 147
    const v0, 0x186a0

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    goto :goto_5

    .line 155
    :cond_6
    move-object v0, v8

    .line 156
    :goto_5
    const-string v1, "iterations"

    .line 157
    .line 158
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    if-eqz p0, :cond_7

    .line 162
    .line 163
    iget-wide v0, p0, La/aby;->a:D

    .line 164
    .line 165
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    goto :goto_6

    .line 170
    :cond_7
    move-object v0, v8

    .line 171
    :goto_6
    const-string v1, "averageTimeNs"

    .line 172
    .line 173
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    if-eqz p0, :cond_8

    .line 177
    .line 178
    iget-boolean p0, p0, La/aby;->b:Z

    .line 179
    .line 180
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    :cond_8
    const-string p0, "isHookSuspected"

    .line 185
    .line 186
    invoke-virtual {p1, v8, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iget-object p0, p0, La/x7w0;->b:La/ln4;

    .line 196
    .line 197
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 198
    .line 199
    iget-object p0, p0, La/ln4;->a:La/us00;

    .line 200
    .line 201
    const-string v0, "activity"

    .line 202
    .line 203
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    check-cast p0, Landroid/app/ActivityManager;

    .line 211
    .line 212
    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    .line 213
    .line 214
    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 218
    .line 219
    .line 220
    iget-wide v0, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    .line 221
    .line 222
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    goto :goto_7

    .line 227
    :catchall_0
    move-exception p0

    .line 228
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 229
    .line 230
    new-instance v0, La/g0g0;

    .line 231
    .line 232
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    move-object p0, v0

    .line 236
    :goto_7
    nop

    .line 237
    instance-of v0, p0, La/g0g0;

    .line 238
    .line 239
    if-eqz v0, :cond_9

    .line 240
    .line 241
    const-string p0, "unknown"

    .line 242
    .line 243
    :cond_9
    check-cast p0, Ljava/lang/String;

    .line 244
    .line 245
    const-string v0, "availRam"

    .line 246
    .line 247
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v0, p0, La/x7w0;->f:La/y8w0;

    .line 257
    .line 258
    if-eqz v0, :cond_a

    .line 259
    .line 260
    iget v0, v0, La/y8w0;->d:F

    .line 261
    .line 262
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    goto :goto_8

    .line 267
    :cond_a
    move-object v0, v8

    .line 268
    :goto_8
    invoke-virtual {p1, v0, v7}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, La/x7w0;->f:La/y8w0;

    .line 272
    .line 273
    if-eqz v0, :cond_b

    .line 274
    .line 275
    iget v0, v0, La/y8w0;->e:F

    .line 276
    .line 277
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    goto :goto_9

    .line 282
    :cond_b
    move-object v0, v8

    .line 283
    :goto_9
    invoke-virtual {p1, v0, v6}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iget-object v0, p0, La/x7w0;->f:La/y8w0;

    .line 287
    .line 288
    if-eqz v0, :cond_c

    .line 289
    .line 290
    iget v0, v0, La/y8w0;->f:F

    .line 291
    .line 292
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    goto :goto_a

    .line 297
    :cond_c
    move-object v0, v8

    .line 298
    :goto_a
    invoke-virtual {p1, v0, v5}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    iget-object v0, p0, La/x7w0;->f:La/y8w0;

    .line 302
    .line 303
    if-eqz v0, :cond_d

    .line 304
    .line 305
    iget-object v0, v0, La/y8w0;->a:La/u8w0;

    .line 306
    .line 307
    iget-object v0, v0, La/u8w0;->g:[F

    .line 308
    .line 309
    goto :goto_b

    .line 310
    :cond_d
    move-object v0, v8

    .line 311
    :goto_b
    invoke-static {v0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1, v0, v4}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    iget-object v0, p0, La/x7w0;->f:La/y8w0;

    .line 322
    .line 323
    if-eqz v0, :cond_e

    .line 324
    .line 325
    iget-object v0, v0, La/y8w0;->b:La/u8w0;

    .line 326
    .line 327
    if-eqz v0, :cond_e

    .line 328
    .line 329
    iget-object v0, v0, La/u8w0;->g:[F

    .line 330
    .line 331
    goto :goto_c

    .line 332
    :cond_e
    move-object v0, v8

    .line 333
    :goto_c
    invoke-static {v0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, v0, v3}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    iget-object p0, p0, La/x7w0;->f:La/y8w0;

    .line 344
    .line 345
    if-eqz p0, :cond_f

    .line 346
    .line 347
    iget-object p0, p0, La/y8w0;->c:La/u8w0;

    .line 348
    .line 349
    iget-object v8, p0, La/u8w0;->g:[F

    .line 350
    .line 351
    :cond_f
    invoke-static {v8}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {p1, p0, v2}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object p0

    .line 364
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    iget-object v0, p0, La/x7w0;->b:La/ln4;

    .line 368
    .line 369
    iget-object v2, v0, La/ln4;->a:La/us00;

    .line 370
    .line 371
    const-string v3, "sensor"

    .line 372
    .line 373
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    instance-of v4, v2, Landroid/hardware/SensorManager;

    .line 378
    .line 379
    if-eqz v4, :cond_10

    .line 380
    .line 381
    check-cast v2, Landroid/hardware/SensorManager;

    .line 382
    .line 383
    goto :goto_d

    .line 384
    :cond_10
    move-object v2, v8

    .line 385
    :goto_d
    const/4 v4, -0x1

    .line 386
    if-eqz v2, :cond_11

    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    if-eqz v2, :cond_11

    .line 393
    .line 394
    new-instance v5, Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-static {v2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v6

    .line 411
    if-eqz v6, :cond_12

    .line 412
    .line 413
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    check-cast v6, Landroid/hardware/Sensor;

    .line 418
    .line 419
    new-instance v7, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    const/16 v9, 0x3a

    .line 432
    .line 433
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v6}, Landroid/hardware/Sensor;->getVendor()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6}, Landroid/hardware/Sensor;->getVersion()I

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    goto :goto_e

    .line 461
    :cond_11
    move-object v5, v8

    .line 462
    :cond_12
    if-nez v5, :cond_13

    .line 463
    .line 464
    sget-object v5, La/iun;->a:La/iun;

    .line 465
    .line 466
    :cond_13
    const-string v2, "sensorFingerprint"

    .line 467
    .line 468
    invoke-virtual {p1, v5, v2}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    iget-object v0, v0, La/ln4;->a:La/us00;

    .line 472
    .line 473
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    instance-of v2, v0, Landroid/hardware/SensorManager;

    .line 478
    .line 479
    if-eqz v2, :cond_14

    .line 480
    .line 481
    check-cast v0, Landroid/hardware/SensorManager;

    .line 482
    .line 483
    goto :goto_f

    .line 484
    :cond_14
    move-object v0, v8

    .line 485
    :goto_f
    if-eqz v0, :cond_15

    .line 486
    .line 487
    invoke-virtual {v0, v4}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    if-eqz v0, :cond_15

    .line 492
    .line 493
    new-instance v2, Ljava/util/ArrayList;

    .line 494
    .line 495
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    if-eqz v1, :cond_16

    .line 511
    .line 512
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    check-cast v1, Landroid/hardware/Sensor;

    .line 517
    .line 518
    invoke-virtual {v1}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    goto :goto_10

    .line 526
    :cond_15
    move-object v2, v8

    .line 527
    :cond_16
    if-nez v2, :cond_17

    .line 528
    .line 529
    sget-object v2, La/iun;->a:La/iun;

    .line 530
    .line 531
    :cond_17
    const-string v0, "collectSensorSample"

    .line 532
    .line 533
    invoke-virtual {p1, v2, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    iget-object v0, p0, La/x7w0;->f:La/y8w0;

    .line 537
    .line 538
    if-eqz v0, :cond_18

    .line 539
    .line 540
    iget-object v0, v0, La/y8w0;->a:La/u8w0;

    .line 541
    .line 542
    sget-object v1, La/vby;->d:La/uby;

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    sget-object v2, La/u8w0;->Companion:La/s8w0;

    .line 548
    .line 549
    invoke-virtual {v2}, La/s8w0;->serializer()La/jiy;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    invoke-virtual {v1, v2, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    goto :goto_11

    .line 558
    :cond_18
    move-object v0, v8

    .line 559
    :goto_11
    const-string v1, "accelerometer"

    .line 560
    .line 561
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    iget-object v0, p0, La/x7w0;->f:La/y8w0;

    .line 565
    .line 566
    if-eqz v0, :cond_19

    .line 567
    .line 568
    iget-object v0, v0, La/y8w0;->b:La/u8w0;

    .line 569
    .line 570
    if-eqz v0, :cond_19

    .line 571
    .line 572
    sget-object v1, La/vby;->d:La/uby;

    .line 573
    .line 574
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    sget-object v2, La/u8w0;->Companion:La/s8w0;

    .line 578
    .line 579
    invoke-virtual {v2}, La/s8w0;->serializer()La/jiy;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-virtual {v1, v2, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    goto :goto_12

    .line 588
    :cond_19
    move-object v0, v8

    .line 589
    :goto_12
    const-string v1, "gyroscope"

    .line 590
    .line 591
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    iget-object p0, p0, La/x7w0;->f:La/y8w0;

    .line 595
    .line 596
    if-eqz p0, :cond_1a

    .line 597
    .line 598
    iget-object p0, p0, La/y8w0;->c:La/u8w0;

    .line 599
    .line 600
    sget-object v0, La/vby;->d:La/uby;

    .line 601
    .line 602
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    sget-object v1, La/u8w0;->Companion:La/s8w0;

    .line 606
    .line 607
    invoke-virtual {v1}, La/s8w0;->serializer()La/jiy;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    invoke-virtual {v0, v1, p0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v8

    .line 615
    :cond_1a
    const-string p0, "magnetometer"

    .line 616
    .line 617
    invoke-virtual {p1, v8, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 621
    .line 622
    return-object p0

    .line 623
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    iget-object p0, p0, La/x7w0;->b:La/ln4;

    .line 627
    .line 628
    iget-object p0, p0, La/ln4;->a:La/us00;

    .line 629
    .line 630
    const-string v0, "input_method"

    .line 631
    .line 632
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p0

    .line 636
    instance-of v0, p0, Landroid/view/inputmethod/InputMethodManager;

    .line 637
    .line 638
    if-eqz v0, :cond_1b

    .line 639
    .line 640
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 641
    .line 642
    goto :goto_13

    .line 643
    :cond_1b
    move-object p0, v8

    .line 644
    :goto_13
    if-eqz p0, :cond_1c

    .line 645
    .line 646
    invoke-virtual {p0}, Landroid/view/inputmethod/InputMethodManager;->getEnabledInputMethodList()Ljava/util/List;

    .line 647
    .line 648
    .line 649
    move-result-object v8

    .line 650
    :cond_1c
    if-nez v8, :cond_1d

    .line 651
    .line 652
    sget-object v8, La/iun;->a:La/iun;

    .line 653
    .line 654
    :cond_1d
    new-instance p0, Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-static {v8, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 661
    .line 662
    .line 663
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    if-eqz v1, :cond_1e

    .line 672
    .line 673
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    check-cast v1, Landroid/view/inputmethod/InputMethodInfo;

    .line 678
    .line 679
    invoke-virtual {v1}, Landroid/view/inputmethod/InputMethodInfo;->getPackageName()Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    goto :goto_14

    .line 687
    :cond_1e
    const-string v0, "packageNames"

    .line 688
    .line 689
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 693
    .line 694
    .line 695
    move-result-object p0

    .line 696
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 697
    .line 698
    .line 699
    move-result-object p0

    .line 700
    iget p0, p0, Landroid/content/res/Configuration;->fontScale:F

    .line 701
    .line 702
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    const-string v0, "fontScale"

    .line 707
    .line 708
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 712
    .line 713
    return-object p0

    .line 714
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    iget-object p0, p0, La/x7w0;->a:La/us00;

    .line 718
    .line 719
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    const-string v1, "accessibility_enabled"

    .line 724
    .line 725
    const/4 v2, 0x0

    .line 726
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    const-string v1, "accessibilityEnabled"

    .line 735
    .line 736
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    const-string v1, "development_settings_enabled"

    .line 744
    .line 745
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    const-string v1, "devSettingsEnabled"

    .line 754
    .line 755
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    const-string v1, "adb_enabled"

    .line 763
    .line 764
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    const/4 v1, 0x1

    .line 769
    if-lez v0, :cond_1f

    .line 770
    .line 771
    move v0, v1

    .line 772
    goto :goto_15

    .line 773
    :cond_1f
    move v0, v2

    .line 774
    :goto_15
    :try_start_1
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 775
    .line 776
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 777
    .line 778
    .line 779
    move-result-object p0

    .line 780
    const-string v3, "adb_wifi_enabled"

    .line 781
    .line 782
    invoke-static {p0, v3, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 783
    .line 784
    .line 785
    move-result p0

    .line 786
    if-lez p0, :cond_20

    .line 787
    .line 788
    move p0, v1

    .line 789
    goto :goto_16

    .line 790
    :cond_20
    move p0, v2

    .line 791
    :goto_16
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 792
    .line 793
    .line 794
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 795
    goto :goto_17

    .line 796
    :catchall_1
    move-exception p0

    .line 797
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 798
    .line 799
    new-instance v3, La/g0g0;

    .line 800
    .line 801
    invoke-direct {v3, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 802
    .line 803
    .line 804
    move-object p0, v3

    .line 805
    :goto_17
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 806
    .line 807
    instance-of v4, p0, La/g0g0;

    .line 808
    .line 809
    if-eqz v4, :cond_21

    .line 810
    .line 811
    move-object p0, v3

    .line 812
    :cond_21
    check-cast p0, Ljava/lang/Boolean;

    .line 813
    .line 814
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 815
    .line 816
    .line 817
    move-result p0

    .line 818
    if-nez v0, :cond_22

    .line 819
    .line 820
    if-eqz p0, :cond_23

    .line 821
    .line 822
    :cond_22
    move v2, v1

    .line 823
    :cond_23
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 824
    .line 825
    .line 826
    move-result-object p0

    .line 827
    const-string v0, "adbEnabled"

    .line 828
    .line 829
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 833
    .line 834
    return-object p0

    .line 835
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    iget-object p0, p0, La/x7w0;->e:Lorg/xplatform/fingerprint/impl/AudioTract;

    .line 839
    .line 840
    invoke-virtual {p0}, Lorg/xplatform/fingerprint/impl/AudioTract;->a()La/p44;

    .line 841
    .line 842
    .line 843
    move-result-object p0

    .line 844
    if-eqz p0, :cond_24

    .line 845
    .line 846
    iget v0, p0, La/p44;->a:I

    .line 847
    .line 848
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    goto :goto_18

    .line 853
    :cond_24
    move-object v0, v8

    .line 854
    :goto_18
    const-string v1, "sharingMode"

    .line 855
    .line 856
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    if-eqz p0, :cond_25

    .line 860
    .line 861
    iget v0, p0, La/p44;->b:I

    .line 862
    .line 863
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    goto :goto_19

    .line 868
    :cond_25
    move-object v0, v8

    .line 869
    :goto_19
    const-string v1, "framesPerBurst"

    .line 870
    .line 871
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    if-eqz p0, :cond_26

    .line 875
    .line 876
    iget v0, p0, La/p44;->c:I

    .line 877
    .line 878
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    goto :goto_1a

    .line 883
    :cond_26
    move-object v0, v8

    .line 884
    :goto_1a
    const-string v1, "bufferCapacity"

    .line 885
    .line 886
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    if-eqz p0, :cond_27

    .line 890
    .line 891
    iget p0, p0, La/p44;->d:I

    .line 892
    .line 893
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 894
    .line 895
    .line 896
    move-result-object v8

    .line 897
    :cond_27
    const-string p0, "sampleRate"

    .line 898
    .line 899
    invoke-virtual {p1, v8, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 903
    .line 904
    return-object p0

    .line 905
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
