.class public final La/k3x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/t3x0;Landroid/os/Parcelable;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k3x0;->a:B

    iput-object p2, p0, La/k3x0;->b:Ljava/lang/Object;

    iput-object p1, p0, La/k3x0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/k3x0;->a:B

    iput-object p1, p0, La/k3x0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/k3x0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-byte v0, p0, La/k3x0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/k3x0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/c1x0;

    .line 13
    .line 14
    iget-object v0, v0, La/c1x0;->b:Landroid/content/Context;

    .line 15
    .line 16
    const-string v1, "Unable to read Phenotype PackageMetadata for "

    .line 17
    .line 18
    const-string v4, "phenotype/"

    .line 19
    .line 20
    sget-object v5, La/pfw;->q:La/wcf0;

    .line 21
    .line 22
    if-nez v5, :cond_5

    .line 23
    .line 24
    sget-object v6, La/pfw;->p:Ljava/lang/Object;

    .line 25
    .line 26
    monitor-enter v6

    .line 27
    :try_start_0
    sget-object v5, La/pfw;->q:La/wcf0;

    .line 28
    .line 29
    if-nez v5, :cond_4

    .line 30
    .line 31
    invoke-static {}, La/wcf0;->a()La/zz2;

    .line 32
    .line 33
    .line 34
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const-string v8, "phenotype"

    .line 40
    .line 41
    invoke-virtual {v7, v8}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    if-eqz v7, :cond_3

    .line 46
    .line 47
    array-length v8, v7

    .line 48
    const/4 v9, 0x0

    .line 49
    :goto_0
    if-ge v9, v8, :cond_3

    .line 50
    .line 51
    aget-object v10, v7, v9

    .line 52
    .line 53
    const-string v11, "_package_metadata.binarypb"

    .line 54
    .line 55
    invoke-virtual {v10, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v11
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    if-nez v11, :cond_0

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_0
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    add-int/2addr v12, v2

    .line 71
    new-instance v13, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v13, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    invoke-virtual {v11, v12}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 87
    .line 88
    .line 89
    move-result-object v11
    :try_end_2
    .catch La/zew0; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    :try_start_3
    new-instance v12, La/pfw;

    .line 91
    .line 92
    sget-object v13, La/bew0;->b:La/bew0;

    .line 93
    .line 94
    sget v13, La/ldw0;->a:I

    .line 95
    .line 96
    sget-object v13, La/bew0;->c:La/bew0;

    .line 97
    .line 98
    invoke-static {v11, v13}, La/z6x0;->t(Ljava/io/InputStream;La/bew0;)La/z6x0;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    invoke-direct {v12, v0, v13}, La/pfw;-><init>(Landroid/content/Context;La/z6x0;)V

    .line 103
    .line 104
    .line 105
    iget-object v13, v12, La/pfw;->b:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v5, v13, v12}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 108
    .line 109
    .line 110
    if-eqz v11, :cond_2

    .line 111
    .line 112
    :try_start_4
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch La/zew0; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    goto :goto_5

    .line 118
    :catch_0
    move-exception v0

    .line 119
    goto :goto_4

    .line 120
    :catch_1
    move-exception v11

    .line 121
    goto :goto_2

    .line 122
    :catchall_1
    move-exception v12

    .line 123
    if-eqz v11, :cond_1

    .line 124
    .line 125
    :try_start_5
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catchall_2
    move-exception v11

    .line 130
    :try_start_6
    invoke-virtual {v12, v11}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    :cond_1
    :goto_1
    throw v12
    :try_end_6
    .catch La/zew0; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 134
    :goto_2
    :try_start_7
    const-string v12, "PackageInfo"

    .line 135
    .line 136
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    add-int/lit8 v13, v13, 0x2d

    .line 141
    .line 142
    new-instance v14, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-static {v12, v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 158
    .line 159
    .line 160
    :cond_2
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :goto_4
    :try_start_8
    const-string v1, "PackageInfo"

    .line 164
    .line 165
    const-string v2, "Unable to read Phenotype PackageMetadata from assets."

    .line 166
    .line 167
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 168
    .line 169
    .line 170
    :cond_3
    invoke-virtual {v5, v3}, La/zz2;->e(Z)La/wcf0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sput-object v0, La/pfw;->q:La/wcf0;

    .line 175
    .line 176
    move-object v5, v0

    .line 177
    :cond_4
    monitor-exit v6

    .line 178
    goto :goto_6

    .line 179
    :goto_5
    monitor-exit v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 180
    throw p0

    .line 181
    :cond_5
    :goto_6
    iget-object p0, p0, La/k3x0;->c:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v5, p0}, La/wcf0;->containsKey(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_6

    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    add-int/lit16 v0, v0, 0xad

    .line 198
    .line 199
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 200
    .line 201
    .line 202
    const-string v0, "Config package "

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string p0, " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."

    .line 211
    .line 212
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    const-string v0, "FilePhenotypeFlags"

    .line 220
    .line 221
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    :cond_6
    return-void

    .line 225
    :pswitch_0
    iget-object v0, p0, La/k3x0;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, La/drm0;

    .line 228
    .line 229
    iget-object p0, p0, La/k3x0;->c:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p0, Landroid/app/job/JobParameters;

    .line 232
    .line 233
    const-string v1, "FA"

    .line 234
    .line 235
    const-string v2, "[sgtm] AppMeasurementJobService processed last Scion upload request."

    .line 236
    .line 237
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    iget-object v0, v0, La/drm0;->a:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Landroid/app/Service;

    .line 243
    .line 244
    check-cast v0, La/h4x0;

    .line 245
    .line 246
    invoke-interface {v0, p0}, La/h4x0;->b(Landroid/app/job/JobParameters;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_1
    iget-object v0, p0, La/k3x0;->c:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, La/t3x0;

    .line 253
    .line 254
    iget-object v0, v0, La/t3x0;->c:La/a4x0;

    .line 255
    .line 256
    iput-object v1, v0, La/a4x0;->e:La/gtw0;

    .line 257
    .line 258
    iget-object v4, p0, La/k3x0;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v4, Lcom/google/android/gms/common/ConnectionResult;

    .line 261
    .line 262
    iget v4, v4, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 263
    .line 264
    const/16 v5, 0x1e61

    .line 265
    .line 266
    if-ne v4, v5, :cond_8

    .line 267
    .line 268
    iget-object v4, v0, La/a4x0;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 269
    .line 270
    if-nez v4, :cond_7

    .line 271
    .line 272
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    iput-object v4, v0, La/a4x0;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 277
    .line 278
    :cond_7
    new-instance v0, La/fju0;

    .line 279
    .line 280
    invoke-direct {v0, p0, v2}, La/fju0;-><init>(Ljava/lang/Object;B)V

    .line 281
    .line 282
    .line 283
    sget-object p0, La/btw0;->Z:La/atw0;

    .line 284
    .line 285
    invoke-virtual {p0, v1}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    check-cast p0, Ljava/lang/Long;

    .line 290
    .line 291
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 292
    .line 293
    .line 294
    move-result-wide v1

    .line 295
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 296
    .line 297
    invoke-interface {v4, v0, v1, v2, p0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 298
    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_8
    invoke-virtual {v0}, La/a4x0;->A1()V

    .line 302
    .line 303
    .line 304
    :goto_7
    return-void

    .line 305
    :pswitch_2
    iget-object v0, p0, La/k3x0;->c:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, La/f8x0;

    .line 308
    .line 309
    iget-object p0, p0, La/k3x0;->b:Ljava/lang/Object;

    .line 310
    .line 311
    move-object v2, p0

    .line 312
    check-cast v2, La/d6x0;

    .line 313
    .line 314
    iget p0, v0, La/f8x0;->a:I

    .line 315
    .line 316
    monitor-enter v2

    .line 317
    :try_start_9
    iget-object v0, v2, La/d6x0;->e:Landroid/util/SparseArray;

    .line 318
    .line 319
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    check-cast v3, La/f8x0;

    .line 324
    .line 325
    if-eqz v3, :cond_9

    .line 326
    .line 327
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    new-instance v5, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    const/16 v6, 0x14

    .line 338
    .line 339
    add-int/2addr v4, v6

    .line 340
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 341
    .line 342
    .line 343
    const-string v4, "Timing out request: "

    .line 344
    .line 345
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    const-string v5, "MessengerIpcClient"

    .line 356
    .line 357
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->remove(I)V

    .line 361
    .line 362
    .line 363
    const-string p0, "Timed out waiting for response"

    .line 364
    .line 365
    new-instance v0, La/c44;

    .line 366
    .line 367
    invoke-direct {v0, p0, v1, v6}, La/c44;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3, v0}, La/f8x0;->c(La/c44;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, La/d6x0;->d()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 374
    .line 375
    .line 376
    :cond_9
    monitor-exit v2

    .line 377
    goto :goto_8

    .line 378
    :catchall_3
    move-exception p0

    .line 379
    goto :goto_9

    .line 380
    :goto_8
    return-void

    .line 381
    :goto_9
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 382
    throw p0

    .line 383
    :pswitch_3
    iget-object v0, p0, La/k3x0;->c:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, La/t3x0;

    .line 386
    .line 387
    iget-object v0, v0, La/t3x0;->c:La/a4x0;

    .line 388
    .line 389
    iget-object p0, p0, La/k3x0;->b:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast p0, Landroid/content/ComponentName;

    .line 392
    .line 393
    invoke-virtual {v0, p0}, La/a4x0;->w1(Landroid/content/ComponentName;)V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
