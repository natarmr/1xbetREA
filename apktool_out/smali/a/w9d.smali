.class public abstract La/w9d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v1, v1

    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/w9d;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    return-void
.end method

.method public static a(Lcom/google/firebase/messaging/FirebaseMessagingService;La/pyu;)La/xex;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, "Couldn\'t get own application info: "

    .line 6
    .line 7
    const-string v4, "FirebaseMessaging"

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const/16 v6, 0x80

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v0, v5, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    :goto_0
    move-object v5, v0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    move-exception v0

    .line 32
    new-instance v5, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_0
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :goto_1
    const-string v0, "gcm.n.android_channel_id"

    .line 51
    .line 52
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/4 v7, 0x3

    .line 59
    const/4 v8, 0x0

    .line 60
    const/16 v10, 0x1a

    .line 61
    .line 62
    if-ge v6, v10, :cond_1

    .line 63
    .line 64
    :catch_1
    :goto_2
    const/4 v0, 0x0

    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-virtual {v6, v11, v8}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    iget v6, v6, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    if-ge v6, v10, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const-class v6, Landroid/app/NotificationManager;

    .line 85
    .line 86
    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Landroid/app/NotificationManager;

    .line 91
    .line 92
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-nez v10, :cond_4

    .line 97
    .line 98
    invoke-virtual {v6, v0}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    if-eqz v10, :cond_3

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_3
    new-instance v10, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v11, "Notification Channel requested ("

    .line 108
    .line 109
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v0, ") has not been created by the app. Manifest configuration, or default, value will be used."

    .line 116
    .line 117
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    :cond_4
    const-string v0, "com.google.firebase.messaging.default_notification_channel_id"

    .line 128
    .line 129
    invoke-virtual {v5, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-nez v10, :cond_6

    .line 138
    .line 139
    invoke-virtual {v6, v0}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    if-eqz v10, :cond_5

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    const-string v0, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."

    .line 147
    .line 148
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    const-string v0, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."

    .line 153
    .line 154
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    :goto_3
    const-string v0, "fcm_fallback_notification_channel"

    .line 158
    .line 159
    invoke-virtual {v6, v0}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    if-nez v10, :cond_8

    .line 164
    .line 165
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    const-string v11, "string"

    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    const-string v13, "fcm_fallback_notification_channel_label"

    .line 176
    .line 177
    invoke-virtual {v10, v13, v11, v12}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-nez v10, :cond_7

    .line 182
    .line 183
    const-string v10, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."

    .line 184
    .line 185
    invoke-static {v4, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    const-string v10, "Misc"

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_7
    invoke-virtual {v1, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    :goto_4
    new-instance v11, Landroid/app/NotificationChannel;

    .line 196
    .line 197
    invoke-direct {v11, v0, v10, v7}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6, v11}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 201
    .line 202
    .line 203
    :cond_8
    :goto_5
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    new-instance v12, La/g760;

    .line 216
    .line 217
    invoke-direct {v12, v1, v0}, La/g760;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const-string v0, "gcm.n.title"

    .line 221
    .line 222
    invoke-virtual {v2, v10, v6, v0}, La/pyu;->d(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    if-nez v13, :cond_9

    .line 231
    .line 232
    invoke-static {v0}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iput-object v0, v12, La/g760;->e:Ljava/lang/CharSequence;

    .line 237
    .line 238
    :cond_9
    const-string v0, "gcm.n.body"

    .line 239
    .line 240
    invoke-virtual {v2, v10, v6, v0}, La/pyu;->d(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    if-nez v13, :cond_a

    .line 249
    .line 250
    invoke-static {v0}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    iput-object v13, v12, La/g760;->f:Ljava/lang/CharSequence;

    .line 255
    .line 256
    new-instance v13, La/f760;

    .line 257
    .line 258
    const/4 v14, 0x7

    .line 259
    invoke-direct {v13, v14, v8}, La/p4;-><init>(BZ)V

    .line 260
    .line 261
    .line 262
    invoke-static {v0}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iput-object v0, v13, La/f760;->c:Ljava/lang/CharSequence;

    .line 267
    .line 268
    invoke-virtual {v12, v13}, La/g760;->f(La/p4;)V

    .line 269
    .line 270
    .line 271
    :cond_a
    const-string v0, "gcm.n.icon"

    .line 272
    .line 273
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    if-nez v13, :cond_d

    .line 282
    .line 283
    const-string v13, "drawable"

    .line 284
    .line 285
    invoke-virtual {v10, v0, v13, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 286
    .line 287
    .line 288
    move-result v13

    .line 289
    if-eqz v13, :cond_b

    .line 290
    .line 291
    invoke-static {v10, v13}, La/w9d;->b(Landroid/content/res/Resources;I)Z

    .line 292
    .line 293
    .line 294
    move-result v14

    .line 295
    if-eqz v14, :cond_b

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_b
    const-string v13, "mipmap"

    .line 299
    .line 300
    invoke-virtual {v10, v0, v13, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    move-result v13

    .line 304
    if-eqz v13, :cond_c

    .line 305
    .line 306
    invoke-static {v10, v13}, La/w9d;->b(Landroid/content/res/Resources;I)Z

    .line 307
    .line 308
    .line 309
    move-result v14

    .line 310
    if-eqz v14, :cond_c

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_c
    new-instance v13, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string v14, "Icon resource "

    .line 316
    .line 317
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const-string v0, " not found. Notification will use default icon."

    .line 324
    .line 325
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 333
    .line 334
    .line 335
    :cond_d
    const-string v0, "com.google.firebase.messaging.default_notification_icon"

    .line 336
    .line 337
    invoke-virtual {v5, v0, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 338
    .line 339
    .line 340
    move-result v13

    .line 341
    if-eqz v13, :cond_e

    .line 342
    .line 343
    invoke-static {v10, v13}, La/w9d;->b(Landroid/content/res/Resources;I)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-nez v0, :cond_f

    .line 348
    .line 349
    :cond_e
    :try_start_2
    invoke-virtual {v11, v6, v8}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    iget v13, v0, Landroid/content/pm/ApplicationInfo;->icon:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :catch_2
    move-exception v0

    .line 357
    new-instance v14, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v14, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 370
    .line 371
    .line 372
    :cond_f
    :goto_6
    if-eqz v13, :cond_10

    .line 373
    .line 374
    invoke-static {v10, v13}, La/w9d;->b(Landroid/content/res/Resources;I)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    if-nez v0, :cond_11

    .line 379
    .line 380
    :cond_10
    const v0, 0x1080093

    .line 381
    .line 382
    .line 383
    move v13, v0

    .line 384
    :cond_11
    :goto_7
    iget-object v3, v12, La/g760;->s:Landroid/app/Notification;

    .line 385
    .line 386
    iput v13, v3, Landroid/app/Notification;->icon:I

    .line 387
    .line 388
    const-string v0, "gcm.n.sound2"

    .line 389
    .line 390
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 395
    .line 396
    .line 397
    move-result v13

    .line 398
    if-eqz v13, :cond_12

    .line 399
    .line 400
    const-string v0, "gcm.n.sound"

    .line 401
    .line 402
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    :cond_12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 407
    .line 408
    .line 409
    move-result v13

    .line 410
    const/4 v14, 0x2

    .line 411
    if-eqz v13, :cond_13

    .line 412
    .line 413
    const/4 v0, 0x0

    .line 414
    goto :goto_8

    .line 415
    :cond_13
    const-string v13, "default"

    .line 416
    .line 417
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v13

    .line 421
    if-nez v13, :cond_14

    .line 422
    .line 423
    const-string v13, "raw"

    .line 424
    .line 425
    invoke-virtual {v10, v0, v13, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 426
    .line 427
    .line 428
    move-result v10

    .line 429
    if-eqz v10, :cond_14

    .line 430
    .line 431
    new-instance v10, Ljava/lang/StringBuilder;

    .line 432
    .line 433
    const-string v13, "android.resource://"

    .line 434
    .line 435
    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    const-string v13, "/raw/"

    .line 442
    .line 443
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    goto :goto_8

    .line 458
    :cond_14
    invoke-static {v14}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    :goto_8
    if-eqz v0, :cond_15

    .line 463
    .line 464
    invoke-virtual {v12, v0}, La/g760;->e(Landroid/net/Uri;)V

    .line 465
    .line 466
    .line 467
    :cond_15
    const-string v0, "gcm.n.click_action"

    .line 468
    .line 469
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 474
    .line 475
    .line 476
    move-result v10

    .line 477
    if-nez v10, :cond_16

    .line 478
    .line 479
    new-instance v10, Landroid/content/Intent;

    .line 480
    .line 481
    invoke-direct {v10, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v10, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 485
    .line 486
    .line 487
    const/high16 v0, 0x10000000

    .line 488
    .line 489
    invoke-virtual {v10, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 490
    .line 491
    .line 492
    goto :goto_a

    .line 493
    :cond_16
    const-string v0, "gcm.n.link_android"

    .line 494
    .line 495
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 500
    .line 501
    .line 502
    move-result v10

    .line 503
    if-eqz v10, :cond_17

    .line 504
    .line 505
    const-string v0, "gcm.n.link"

    .line 506
    .line 507
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    :cond_17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 512
    .line 513
    .line 514
    move-result v10

    .line 515
    if-nez v10, :cond_18

    .line 516
    .line 517
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    goto :goto_9

    .line 522
    :cond_18
    const/4 v0, 0x0

    .line 523
    :goto_9
    if-eqz v0, :cond_19

    .line 524
    .line 525
    new-instance v10, Landroid/content/Intent;

    .line 526
    .line 527
    const-string v11, "android.intent.action.VIEW"

    .line 528
    .line 529
    invoke-direct {v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v10, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v10, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 536
    .line 537
    .line 538
    goto :goto_a

    .line 539
    :cond_19
    invoke-virtual {v11, v6}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 540
    .line 541
    .line 542
    move-result-object v10

    .line 543
    if-nez v10, :cond_1a

    .line 544
    .line 545
    const-string v0, "No activity found to launch app"

    .line 546
    .line 547
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 548
    .line 549
    .line 550
    :cond_1a
    :goto_a
    const/high16 v0, 0x44000000    # 512.0f

    .line 551
    .line 552
    sget-object v6, La/w9d;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 553
    .line 554
    const-string v11, "google.c.a.e"

    .line 555
    .line 556
    if-nez v10, :cond_1b

    .line 557
    .line 558
    const/4 v7, 0x0

    .line 559
    goto :goto_c

    .line 560
    :cond_1b
    const/high16 v13, 0x4000000

    .line 561
    .line 562
    invoke-virtual {v10, v13}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 563
    .line 564
    .line 565
    new-instance v13, Landroid/os/Bundle;

    .line 566
    .line 567
    iget-object v15, v2, La/pyu;->a:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v15, Landroid/os/Bundle;

    .line 570
    .line 571
    invoke-direct {v13, v15}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v15}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 575
    .line 576
    .line 577
    move-result-object v15

    .line 578
    invoke-interface {v15}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 579
    .line 580
    .line 581
    move-result-object v15

    .line 582
    :goto_b
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 583
    .line 584
    .line 585
    move-result v16

    .line 586
    if-eqz v16, :cond_1e

    .line 587
    .line 588
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v16

    .line 592
    move-object/from16 v9, v16

    .line 593
    .line 594
    check-cast v9, Ljava/lang/String;

    .line 595
    .line 596
    const-string v7, "google.c."

    .line 597
    .line 598
    invoke-virtual {v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 599
    .line 600
    .line 601
    move-result v7

    .line 602
    if-nez v7, :cond_1c

    .line 603
    .line 604
    const-string v7, "gcm.n."

    .line 605
    .line 606
    invoke-virtual {v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 607
    .line 608
    .line 609
    move-result v7

    .line 610
    if-nez v7, :cond_1c

    .line 611
    .line 612
    const-string v7, "gcm.notification."

    .line 613
    .line 614
    invoke-virtual {v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    if-eqz v7, :cond_1d

    .line 619
    .line 620
    :cond_1c
    invoke-virtual {v13, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    :cond_1d
    const/4 v7, 0x3

    .line 624
    goto :goto_b

    .line 625
    :cond_1e
    invoke-virtual {v10, v13}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2, v11}, La/pyu;->a(Ljava/lang/String;)Z

    .line 629
    .line 630
    .line 631
    move-result v7

    .line 632
    if-eqz v7, :cond_1f

    .line 633
    .line 634
    const-string v7, "gcm.n.analytics_data"

    .line 635
    .line 636
    invoke-virtual {v2}, La/pyu;->n()Landroid/os/Bundle;

    .line 637
    .line 638
    .line 639
    move-result-object v9

    .line 640
    invoke-virtual {v10, v7, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 641
    .line 642
    .line 643
    :cond_1f
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 644
    .line 645
    .line 646
    move-result v7

    .line 647
    invoke-static {v1, v7, v10, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 648
    .line 649
    .line 650
    move-result-object v7

    .line 651
    :goto_c
    iput-object v7, v12, La/g760;->g:Landroid/app/PendingIntent;

    .line 652
    .line 653
    invoke-virtual {v2, v11}, La/pyu;->a(Ljava/lang/String;)Z

    .line 654
    .line 655
    .line 656
    move-result v7

    .line 657
    if-nez v7, :cond_20

    .line 658
    .line 659
    const/4 v0, 0x0

    .line 660
    goto :goto_d

    .line 661
    :cond_20
    new-instance v7, Landroid/content/Intent;

    .line 662
    .line 663
    const-string v9, "com.google.firebase.messaging.NOTIFICATION_DISMISS"

    .line 664
    .line 665
    invoke-direct {v7, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2}, La/pyu;->n()Landroid/os/Bundle;

    .line 669
    .line 670
    .line 671
    move-result-object v9

    .line 672
    invoke-virtual {v7, v9}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 673
    .line 674
    .line 675
    move-result-object v7

    .line 676
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 677
    .line 678
    .line 679
    move-result v6

    .line 680
    new-instance v9, Landroid/content/Intent;

    .line 681
    .line 682
    const-string v10, "com.google.android.c2dm.intent.RECEIVE"

    .line 683
    .line 684
    invoke-direct {v9, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v10

    .line 691
    invoke-virtual {v9, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 692
    .line 693
    .line 694
    move-result-object v9

    .line 695
    const-string v10, "wrapped_intent"

    .line 696
    .line 697
    invoke-virtual {v9, v10, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 698
    .line 699
    .line 700
    move-result-object v7

    .line 701
    invoke-static {v1, v6, v7, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    :goto_d
    if-eqz v0, :cond_21

    .line 706
    .line 707
    iput-object v0, v3, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 708
    .line 709
    :cond_21
    const-string v0, "gcm.n.color"

    .line 710
    .line 711
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 716
    .line 717
    .line 718
    move-result v6

    .line 719
    if-nez v6, :cond_22

    .line 720
    .line 721
    :try_start_3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 722
    .line 723
    .line 724
    move-result v6

    .line 725
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 726
    .line 727
    .line 728
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 729
    goto :goto_e

    .line 730
    :catch_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 731
    .line 732
    const-string v7, "Color is invalid: "

    .line 733
    .line 734
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    const-string v0, ". Notification will use default color."

    .line 741
    .line 742
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 750
    .line 751
    .line 752
    :cond_22
    const-string v0, "com.google.firebase.messaging.default_notification_color"

    .line 753
    .line 754
    invoke-virtual {v5, v0, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    if-eqz v0, :cond_23

    .line 759
    .line 760
    :try_start_4
    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    .line 761
    .line 762
    .line 763
    move-result v0

    .line 764
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 765
    .line 766
    .line 767
    move-result-object v0
    :try_end_4
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_4 .. :try_end_4} :catch_4

    .line 768
    goto :goto_e

    .line 769
    :catch_4
    const-string v0, "Cannot find the color resource referenced in AndroidManifest."

    .line 770
    .line 771
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 772
    .line 773
    .line 774
    :cond_23
    const/4 v0, 0x0

    .line 775
    :goto_e
    if-eqz v0, :cond_24

    .line 776
    .line 777
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 778
    .line 779
    .line 780
    move-result v0

    .line 781
    iput v0, v12, La/g760;->o:I

    .line 782
    .line 783
    :cond_24
    const-string v0, "gcm.n.sticky"

    .line 784
    .line 785
    invoke-virtual {v2, v0}, La/pyu;->a(Ljava/lang/String;)Z

    .line 786
    .line 787
    .line 788
    move-result v0

    .line 789
    const/4 v1, 0x1

    .line 790
    xor-int/2addr v0, v1

    .line 791
    invoke-virtual {v12, v0}, La/g760;->c(Z)V

    .line 792
    .line 793
    .line 794
    const-string v0, "gcm.n.local_only"

    .line 795
    .line 796
    invoke-virtual {v2, v0}, La/pyu;->a(Ljava/lang/String;)Z

    .line 797
    .line 798
    .line 799
    move-result v0

    .line 800
    iput-boolean v0, v12, La/g760;->m:Z

    .line 801
    .line 802
    const-string v0, "gcm.n.ticker"

    .line 803
    .line 804
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    if-eqz v0, :cond_25

    .line 809
    .line 810
    invoke-static {v0}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    iput-object v0, v3, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 815
    .line 816
    :cond_25
    const-string v0, "gcm.n.notification_priority"

    .line 817
    .line 818
    invoke-virtual {v2, v0}, La/pyu;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    const/4 v5, -0x2

    .line 823
    if-nez v0, :cond_26

    .line 824
    .line 825
    :goto_f
    const/4 v0, 0x0

    .line 826
    goto :goto_10

    .line 827
    :cond_26
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 828
    .line 829
    .line 830
    move-result v6

    .line 831
    if-lt v6, v5, :cond_27

    .line 832
    .line 833
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 834
    .line 835
    .line 836
    move-result v6

    .line 837
    if-le v6, v14, :cond_28

    .line 838
    .line 839
    :cond_27
    new-instance v6, Ljava/lang/StringBuilder;

    .line 840
    .line 841
    const-string v7, "notificationPriority is invalid "

    .line 842
    .line 843
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    const-string v0, ". Skipping setting notificationPriority."

    .line 850
    .line 851
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 859
    .line 860
    .line 861
    goto :goto_f

    .line 862
    :cond_28
    :goto_10
    if-eqz v0, :cond_29

    .line 863
    .line 864
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    iput v0, v12, La/g760;->j:I

    .line 869
    .line 870
    :cond_29
    const-string v0, "gcm.n.visibility"

    .line 871
    .line 872
    invoke-virtual {v2, v0}, La/pyu;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    const-string v6, "NotificationParams"

    .line 877
    .line 878
    if-nez v0, :cond_2a

    .line 879
    .line 880
    :goto_11
    const/4 v0, 0x0

    .line 881
    goto :goto_12

    .line 882
    :cond_2a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 883
    .line 884
    .line 885
    move-result v7

    .line 886
    const/4 v9, -0x1

    .line 887
    if-lt v7, v9, :cond_2b

    .line 888
    .line 889
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 890
    .line 891
    .line 892
    move-result v7

    .line 893
    if-le v7, v1, :cond_2c

    .line 894
    .line 895
    :cond_2b
    new-instance v7, Ljava/lang/StringBuilder;

    .line 896
    .line 897
    const-string v9, "visibility is invalid: "

    .line 898
    .line 899
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 903
    .line 904
    .line 905
    const-string v0, ". Skipping setting visibility."

    .line 906
    .line 907
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 915
    .line 916
    .line 917
    goto :goto_11

    .line 918
    :cond_2c
    :goto_12
    if-eqz v0, :cond_2d

    .line 919
    .line 920
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    iput v0, v12, La/g760;->p:I

    .line 925
    .line 926
    :cond_2d
    const-string v0, "gcm.n.notification_count"

    .line 927
    .line 928
    invoke-virtual {v2, v0}, La/pyu;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    if-nez v0, :cond_2e

    .line 933
    .line 934
    :goto_13
    const/4 v0, 0x0

    .line 935
    goto :goto_14

    .line 936
    :cond_2e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 937
    .line 938
    .line 939
    move-result v7

    .line 940
    if-gez v7, :cond_2f

    .line 941
    .line 942
    new-instance v7, Ljava/lang/StringBuilder;

    .line 943
    .line 944
    const-string v9, "notificationCount is invalid: "

    .line 945
    .line 946
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 950
    .line 951
    .line 952
    const-string v0, ". Skipping setting notificationCount."

    .line 953
    .line 954
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 955
    .line 956
    .line 957
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 962
    .line 963
    .line 964
    goto :goto_13

    .line 965
    :cond_2f
    :goto_14
    if-eqz v0, :cond_30

    .line 966
    .line 967
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    iput v0, v12, La/g760;->i:I

    .line 972
    .line 973
    :cond_30
    const-string v0, "gcm.n.event_time"

    .line 974
    .line 975
    invoke-virtual {v2, v0}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v4

    .line 979
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 980
    .line 981
    .line 982
    move-result v7

    .line 983
    if-nez v7, :cond_31

    .line 984
    .line 985
    :try_start_5
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 986
    .line 987
    .line 988
    move-result-wide v9

    .line 989
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 990
    .line 991
    .line 992
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    .line 993
    goto :goto_15

    .line 994
    :catch_5
    new-instance v7, Ljava/lang/StringBuilder;

    .line 995
    .line 996
    const-string v9, "Couldn\'t parse value of "

    .line 997
    .line 998
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    invoke-static {v0}, La/pyu;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1006
    .line 1007
    .line 1008
    const-string v0, "("

    .line 1009
    .line 1010
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1014
    .line 1015
    .line 1016
    const-string v0, ") into a long"

    .line 1017
    .line 1018
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1026
    .line 1027
    .line 1028
    :cond_31
    const/4 v0, 0x0

    .line 1029
    :goto_15
    if-eqz v0, :cond_32

    .line 1030
    .line 1031
    iput-boolean v1, v12, La/g760;->k:Z

    .line 1032
    .line 1033
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1034
    .line 1035
    .line 1036
    move-result-wide v9

    .line 1037
    iput-wide v9, v3, Landroid/app/Notification;->when:J

    .line 1038
    .line 1039
    :cond_32
    const-string v0, "gcm.n.vibrate_timings"

    .line 1040
    .line 1041
    invoke-virtual {v2, v0}, La/pyu;->c(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    if-nez v0, :cond_33

    .line 1046
    .line 1047
    :goto_16
    const/4 v7, 0x0

    .line 1048
    goto :goto_18

    .line 1049
    :cond_33
    :try_start_6
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 1050
    .line 1051
    .line 1052
    move-result v4

    .line 1053
    if-le v4, v1, :cond_34

    .line 1054
    .line 1055
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 1056
    .line 1057
    .line 1058
    move-result v4

    .line 1059
    new-array v7, v4, [J

    .line 1060
    .line 1061
    move v9, v8

    .line 1062
    :goto_17
    if-ge v9, v4, :cond_35

    .line 1063
    .line 1064
    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->optLong(I)J

    .line 1065
    .line 1066
    .line 1067
    move-result-wide v10

    .line 1068
    aput-wide v10, v7, v9

    .line 1069
    .line 1070
    add-int/lit8 v9, v9, 0x1

    .line 1071
    .line 1072
    goto :goto_17

    .line 1073
    :cond_34
    new-instance v4, Lorg/json/JSONException;

    .line 1074
    .line 1075
    const-string v7, "vibrateTimings have invalid length"

    .line 1076
    .line 1077
    invoke-direct {v4, v7}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    throw v4
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    .line 1081
    :catch_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1082
    .line 1083
    const-string v7, "User defined vibrateTimings is invalid: "

    .line 1084
    .line 1085
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1089
    .line 1090
    .line 1091
    const-string v0, ". Skipping setting vibrateTimings."

    .line 1092
    .line 1093
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1101
    .line 1102
    .line 1103
    goto :goto_16

    .line 1104
    :cond_35
    :goto_18
    if-eqz v7, :cond_36

    .line 1105
    .line 1106
    iput-object v7, v3, Landroid/app/Notification;->vibrate:[J

    .line 1107
    .line 1108
    :cond_36
    const-string v4, ". Skipping setting LightSettings"

    .line 1109
    .line 1110
    const-string v7, "LightSettings is invalid: "

    .line 1111
    .line 1112
    const-string v0, "gcm.n.light_settings"

    .line 1113
    .line 1114
    invoke-virtual {v2, v0}, La/pyu;->c(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v9

    .line 1118
    if-nez v9, :cond_37

    .line 1119
    .line 1120
    :goto_19
    const/4 v9, 0x0

    .line 1121
    goto :goto_1b

    .line 1122
    :cond_37
    const/4 v10, 0x3

    .line 1123
    new-array v0, v10, [I

    .line 1124
    .line 1125
    :try_start_7
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    .line 1126
    .line 1127
    .line 1128
    move-result v11

    .line 1129
    if-ne v11, v10, :cond_39

    .line 1130
    .line 1131
    invoke-virtual {v9, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v10

    .line 1135
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1136
    .line 1137
    .line 1138
    move-result v10

    .line 1139
    const/high16 v11, -0x1000000

    .line 1140
    .line 1141
    if-eq v10, v11, :cond_38

    .line 1142
    .line 1143
    aput v10, v0, v8

    .line 1144
    .line 1145
    invoke-virtual {v9, v1}, Lorg/json/JSONArray;->optInt(I)I

    .line 1146
    .line 1147
    .line 1148
    move-result v10

    .line 1149
    aput v10, v0, v1

    .line 1150
    .line 1151
    invoke-virtual {v9, v14}, Lorg/json/JSONArray;->optInt(I)I

    .line 1152
    .line 1153
    .line 1154
    move-result v10

    .line 1155
    aput v10, v0, v14

    .line 1156
    .line 1157
    move-object v9, v0

    .line 1158
    goto :goto_1b

    .line 1159
    :catch_7
    move-exception v0

    .line 1160
    goto :goto_1a

    .line 1161
    :cond_38
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1162
    .line 1163
    const-string v10, "Transparent color is invalid"

    .line 1164
    .line 1165
    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1166
    .line 1167
    .line 1168
    throw v0

    .line 1169
    :cond_39
    new-instance v0, Lorg/json/JSONException;

    .line 1170
    .line 1171
    const-string v10, "lightSettings don\'t have all three fields"

    .line 1172
    .line 1173
    invoke-direct {v0, v10}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 1174
    .line 1175
    .line 1176
    throw v0
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1177
    :goto_1a
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1178
    .line 1179
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1183
    .line 1184
    .line 1185
    const-string v7, ". "

    .line 1186
    .line 1187
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1205
    .line 1206
    .line 1207
    goto :goto_19

    .line 1208
    :catch_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v0

    .line 1223
    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1224
    .line 1225
    .line 1226
    goto :goto_19

    .line 1227
    :goto_1b
    if-eqz v9, :cond_3b

    .line 1228
    .line 1229
    aget v0, v9, v8

    .line 1230
    .line 1231
    aget v4, v9, v1

    .line 1232
    .line 1233
    aget v6, v9, v14

    .line 1234
    .line 1235
    iput v0, v3, Landroid/app/Notification;->ledARGB:I

    .line 1236
    .line 1237
    iput v4, v3, Landroid/app/Notification;->ledOnMS:I

    .line 1238
    .line 1239
    iput v6, v3, Landroid/app/Notification;->ledOffMS:I

    .line 1240
    .line 1241
    if-eqz v4, :cond_3a

    .line 1242
    .line 1243
    if-eqz v6, :cond_3a

    .line 1244
    .line 1245
    move v8, v1

    .line 1246
    :cond_3a
    iget v0, v3, Landroid/app/Notification;->flags:I

    .line 1247
    .line 1248
    and-int/2addr v0, v5

    .line 1249
    or-int/2addr v0, v8

    .line 1250
    iput v0, v3, Landroid/app/Notification;->flags:I

    .line 1251
    .line 1252
    :cond_3b
    const-string v0, "gcm.n.default_sound"

    .line 1253
    .line 1254
    invoke-virtual {v2, v0}, La/pyu;->a(Ljava/lang/String;)Z

    .line 1255
    .line 1256
    .line 1257
    move-result v0

    .line 1258
    const-string v4, "gcm.n.default_vibrate_timings"

    .line 1259
    .line 1260
    invoke-virtual {v2, v4}, La/pyu;->a(Ljava/lang/String;)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v4

    .line 1264
    if-eqz v4, :cond_3c

    .line 1265
    .line 1266
    or-int/lit8 v0, v0, 0x2

    .line 1267
    .line 1268
    :cond_3c
    const-string v4, "gcm.n.default_light_settings"

    .line 1269
    .line 1270
    invoke-virtual {v2, v4}, La/pyu;->a(Ljava/lang/String;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v4

    .line 1274
    if-eqz v4, :cond_3d

    .line 1275
    .line 1276
    or-int/lit8 v0, v0, 0x4

    .line 1277
    .line 1278
    :cond_3d
    iput v0, v3, Landroid/app/Notification;->defaults:I

    .line 1279
    .line 1280
    and-int/lit8 v0, v0, 0x4

    .line 1281
    .line 1282
    if-eqz v0, :cond_3e

    .line 1283
    .line 1284
    iget v0, v3, Landroid/app/Notification;->flags:I

    .line 1285
    .line 1286
    or-int/2addr v0, v1

    .line 1287
    iput v0, v3, Landroid/app/Notification;->flags:I

    .line 1288
    .line 1289
    :cond_3e
    new-instance v0, La/xex;

    .line 1290
    .line 1291
    const-string v1, "gcm.n.tag"

    .line 1292
    .line 1293
    invoke-virtual {v2, v1}, La/pyu;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v1

    .line 1297
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v2

    .line 1301
    if-nez v2, :cond_3f

    .line 1302
    .line 1303
    goto :goto_1c

    .line 1304
    :cond_3f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1305
    .line 1306
    const-string v2, "FCM-Notification:"

    .line 1307
    .line 1308
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1312
    .line 1313
    .line 1314
    move-result-wide v2

    .line 1315
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    :goto_1c
    invoke-direct {v0, v12, v1}, La/xex;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1323
    .line 1324
    .line 1325
    return-object v0
.end method

.method public static b(Landroid/content/res/Resources;I)Z
    .locals 4

    .line 1
    const-string v0, "FirebaseMessaging"

    .line 2
    .line 3
    const-string v1, "Adaptive icons cannot be used in notifications. Ignoring icon id: "

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1a

    .line 8
    .line 9
    if-eq v2, v3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0, p1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, La/y24;->v(Landroid/graphics/drawable/Drawable;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    new-instance p0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return v3

    .line 40
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "Couldn\'t find resource "

    .line 45
    .line 46
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, ", treating it as an invalid icon"

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    return v3
.end method
