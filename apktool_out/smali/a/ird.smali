.class public final synthetic La/ird;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ird;->a:B

    iput-object p1, p0, La/ird;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ird;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ird;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/ird;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    iget-object p0, p0, La/ird;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v1, La/psg0;->a:Ljava/lang/ThreadLocal;

    .line 20
    .line 21
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    sget-object v0, La/psg0;->a:Ljava/lang/ThreadLocal;

    .line 43
    .line 44
    sget-object v0, La/psg0;->a:Ljava/lang/ThreadLocal;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :pswitch_0
    iget-object v0, p0, La/ird;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lcom/airbnb/lottie/LottieAnimationView;

    .line 53
    .line 54
    iget-object p0, p0, La/ird;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Ljava/lang/String;

    .line 57
    .line 58
    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView;->q:La/z910;

    .line 59
    .line 60
    iget-boolean v1, v0, Lcom/airbnb/lottie/LottieAnimationView;->m:Z

    .line 61
    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v1, La/ka10;->a:Ljava/util/HashMap;

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v2, "asset_"

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v0, p0, v1}, La/ka10;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)La/ob10;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0, p0, v2}, La/ka10;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)La/ob10;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :goto_0
    return-object p0

    .line 98
    :pswitch_1
    iget-object v0, p0, La/ird;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Landroid/content/Context;

    .line 101
    .line 102
    iget-object p0, p0, La/ird;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Landroid/content/Intent;

    .line 105
    .line 106
    invoke-static {}, La/mii0;->u()La/mii0;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    const-string v4, "FirebaseMessaging"

    .line 111
    .line 112
    const/4 v5, 0x3

    .line 113
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_1

    .line 118
    .line 119
    const-string v4, "FirebaseMessaging"

    .line 120
    .line 121
    const-string v6, "Starting service"

    .line 122
    .line 123
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    :cond_1
    iget-object v4, v3, La/mii0;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v4, Ljava/util/ArrayDeque;

    .line 129
    .line 130
    invoke-virtual {v4, p0}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    new-instance p0, Landroid/content/Intent;

    .line 134
    .line 135
    const-string v4, "com.google.firebase.MESSAGING_EVENT"

    .line 136
    .line 137
    invoke-direct {p0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {p0, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    const-string v4, "Error resolving target intent service, skipping classname enforcement. Resolved service was: "

    .line 148
    .line 149
    monitor-enter v3

    .line 150
    :try_start_1
    iget-object v6, v3, La/mii0;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    .line 154
    if-eqz v6, :cond_2

    .line 155
    .line 156
    monitor-exit v3

    .line 157
    move-object v2, v6

    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v6, p0, v1}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    if-eqz v1, :cond_7

    .line 169
    .line 170
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 171
    .line 172
    if-nez v1, :cond_3

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    iget-object v7, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-eqz v6, :cond_6

    .line 186
    .line 187
    iget-object v6, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 188
    .line 189
    if-nez v6, :cond_4

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_4
    const-string v2, "."

    .line 193
    .line 194
    invoke-virtual {v6, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_5

    .line 199
    .line 200
    new-instance v2, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iput-object v1, v3, La/mii0;->b:Ljava/lang/Object;

    .line 222
    .line 223
    :goto_1
    move-object v2, v1

    .line 224
    goto :goto_2

    .line 225
    :catchall_1
    move-exception p0

    .line 226
    goto/16 :goto_8

    .line 227
    .line 228
    :cond_5
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 229
    .line 230
    iput-object v1, v3, La/mii0;->b:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 231
    .line 232
    goto :goto_1

    .line 233
    :goto_2
    monitor-exit v3

    .line 234
    goto :goto_5

    .line 235
    :cond_6
    :goto_3
    :try_start_3
    const-string v6, "FirebaseMessaging"

    .line 236
    .line 237
    new-instance v7, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v4, "/"

    .line 248
    .line 249
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-static {v6, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 262
    .line 263
    .line 264
    monitor-exit v3

    .line 265
    goto :goto_5

    .line 266
    :cond_7
    :goto_4
    :try_start_4
    const-string v1, "FirebaseMessaging"

    .line 267
    .line 268
    const-string v4, "Failed to resolve target intent service, skipping classname enforcement"

    .line 269
    .line 270
    invoke-static {v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 271
    .line 272
    .line 273
    monitor-exit v3

    .line 274
    :goto_5
    if-eqz v2, :cond_9

    .line 275
    .line 276
    const-string v1, "FirebaseMessaging"

    .line 277
    .line 278
    invoke-static {v1, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_8

    .line 283
    .line 284
    const-string v1, "FirebaseMessaging"

    .line 285
    .line 286
    const-string v4, "Restricting intent to a specific service: "

    .line 287
    .line 288
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    .line 294
    .line 295
    :cond_8
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 300
    .line 301
    .line 302
    :cond_9
    :try_start_5
    invoke-virtual {v3, v0}, La/mii0;->z(Landroid/content/Context;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-eqz v1, :cond_a

    .line 307
    .line 308
    invoke-static {v0, p0}, La/qjj;->X(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    goto :goto_6

    .line 313
    :cond_a
    invoke-virtual {v0, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    const-string v0, "FirebaseMessaging"

    .line 318
    .line 319
    const-string v1, "Missing wake lock permission, service start may be delayed"

    .line 320
    .line 321
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    :goto_6
    if-nez p0, :cond_b

    .line 325
    .line 326
    const-string p0, "FirebaseMessaging"

    .line 327
    .line 328
    const-string v0, "Error while delivering the message: ServiceIntent not found."

    .line 329
    .line 330
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_0

    .line 331
    .line 332
    .line 333
    const/16 p0, 0x194

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_b
    const/4 p0, -0x1

    .line 337
    goto :goto_7

    .line 338
    :catch_0
    move-exception p0

    .line 339
    const-string v0, "FirebaseMessaging"

    .line 340
    .line 341
    new-instance v1, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-string v2, "Failed to start service while in background: "

    .line 344
    .line 345
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 356
    .line 357
    .line 358
    const/16 p0, 0x192

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :catch_1
    move-exception p0

    .line 362
    const-string v0, "FirebaseMessaging"

    .line 363
    .line 364
    const-string v1, "Error while delivering the message to the serviceIntent"

    .line 365
    .line 366
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 367
    .line 368
    .line 369
    const/16 p0, 0x191

    .line 370
    .line 371
    :goto_7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    return-object p0

    .line 376
    :goto_8
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 377
    throw p0

    .line 378
    :pswitch_2
    iget-object v0, p0, La/ird;->b:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, La/krd;

    .line 381
    .line 382
    iget-object p0, p0, La/ird;->c:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast p0, La/mrd;

    .line 385
    .line 386
    iget-object v0, v0, La/krd;->b:La/nsd;

    .line 387
    .line 388
    monitor-enter v0

    .line 389
    :try_start_7
    iget-object v3, v0, La/nsd;->a:Landroid/content/Context;

    .line 390
    .line 391
    iget-object v4, v0, La/nsd;->b:Ljava/lang/String;

    .line 392
    .line 393
    invoke-virtual {v3, v4, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    .line 394
    .line 395
    .line 396
    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 397
    :try_start_8
    iget-object p0, p0, La/mrd;->a:Lorg/json/JSONObject;

    .line 398
    .line 399
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    const-string v3, "UTF-8"

    .line 404
    .line 405
    invoke-virtual {p0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    invoke-virtual {v1, p0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 410
    .line 411
    .line 412
    :try_start_9
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 413
    .line 414
    .line 415
    monitor-exit v0

    .line 416
    return-object v2

    .line 417
    :catchall_2
    move-exception p0

    .line 418
    goto :goto_9

    .line 419
    :catchall_3
    move-exception p0

    .line 420
    :try_start_a
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 421
    .line 422
    .line 423
    throw p0

    .line 424
    :goto_9
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 425
    throw p0

    .line 426
    nop

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
