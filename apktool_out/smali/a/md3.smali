.class public final La/md3;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/md3;->a:B

    iput-object p1, p0, La/md3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;BZ)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/md3;->a:B

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, La/md3;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/md3;->a:B

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    const/16 v2, 0x21

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v5, p0, La/md3;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v5, La/kxw0;

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    iget-object p0, v5, La/kxw0;->f:La/uuw0;

    .line 20
    .line 21
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/uuw0;->j:La/quw0;

    .line 25
    .line 26
    const-string p1, "App receiver called with null intent"

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/quw0;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    iget-object p0, v5, La/kxw0;->f:La/uuw0;

    .line 40
    .line 41
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/uuw0;->j:La/quw0;

    .line 45
    .line 46
    const-string p1, "App receiver called with null action"

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/quw0;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    const v0, -0x72ee9a21

    .line 58
    .line 59
    .line 60
    if-eq p2, v0, :cond_3

    .line 61
    .line 62
    const v0, 0x4c497878    # 5.2814304E7f

    .line 63
    .line 64
    .line 65
    if-eq p2, v0, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string p2, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    iget-object p1, v5, La/kxw0;->f:La/uuw0;

    .line 77
    .line 78
    invoke-static {p1}, La/kxw0;->g(La/ryw0;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p1, La/uuw0;->o:La/quw0;

    .line 82
    .line 83
    const-string p2, "[sgtm] App Receiver notified batches are available"

    .line 84
    .line 85
    invoke-virtual {p1, p2}, La/quw0;->a(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, v5, La/kxw0;->g:La/fxw0;

    .line 89
    .line 90
    invoke-static {p1}, La/kxw0;->g(La/ryw0;)V

    .line 91
    .line 92
    .line 93
    new-instance p2, La/fju0;

    .line 94
    .line 95
    const/16 v0, 0x10

    .line 96
    .line 97
    invoke-direct {p2, p0, v0}, La/fju0;-><init>(Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, La/fxw0;->v1(Ljava/lang/Runnable;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    const-string p0, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 105
    .line 106
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_5

    .line 111
    .line 112
    invoke-static {}, La/miw0;->a()V

    .line 113
    .line 114
    .line 115
    iget-object p0, v5, La/kxw0;->d:La/bkw0;

    .line 116
    .line 117
    sget-object p1, La/btw0;->P0:La/atw0;

    .line 118
    .line 119
    invoke-virtual {p0, v4, p1}, La/bkw0;->x1(Ljava/lang/String;La/atw0;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-nez p0, :cond_4

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    iget-object p0, v5, La/kxw0;->f:La/uuw0;

    .line 127
    .line 128
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 129
    .line 130
    .line 131
    iget-object p0, p0, La/uuw0;->o:La/quw0;

    .line 132
    .line 133
    const-string p1, "App receiver notified triggers are available"

    .line 134
    .line 135
    invoke-virtual {p0, p1}, La/quw0;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object p0, v5, La/kxw0;->g:La/fxw0;

    .line 139
    .line 140
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 141
    .line 142
    .line 143
    new-instance p1, La/fju0;

    .line 144
    .line 145
    const/16 p2, 0x11

    .line 146
    .line 147
    invoke-direct {p1, v5, p2}, La/fju0;-><init>(Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, p1}, La/fxw0;->v1(Ljava/lang/Runnable;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_5
    :goto_0
    iget-object p0, v5, La/kxw0;->f:La/uuw0;

    .line 155
    .line 156
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 157
    .line 158
    .line 159
    iget-object p0, p0, La/uuw0;->j:La/quw0;

    .line 160
    .line 161
    const-string p1, "App receiver called with unknown action"

    .line 162
    .line 163
    invoke-virtual {p0, p1}, La/quw0;->a(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :goto_1
    return-void

    .line 167
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    const-string p1, "android.intent.action.PACKAGE_ADDED"

    .line 178
    .line 179
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-nez p0, :cond_6

    .line 184
    .line 185
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const-string p1, "android.intent.action.PACKAGE_REPLACED"

    .line 190
    .line 191
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-nez p0, :cond_6

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_6
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    if-eqz p0, :cond_8

    .line 203
    .line 204
    invoke-virtual {p0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    if-nez p0, :cond_7

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_7
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_8

    .line 216
    .line 217
    invoke-static {v3}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-nez p0, :cond_8

    .line 222
    .line 223
    check-cast v5, La/kr3;

    .line 224
    .line 225
    invoke-virtual {v5}, La/kr3;->invoke()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    :cond_8
    :goto_2
    return-void

    .line 229
    :pswitch_1
    check-cast v5, La/wl50;

    .line 230
    .line 231
    iget-object p2, v5, La/wl50;->a:Ljava/util/concurrent/Executor;

    .line 232
    .line 233
    new-instance v0, La/llo;

    .line 234
    .line 235
    const/16 v1, 0x1d

    .line 236
    .line 237
    invoke-direct {v0, p0, p1, v1}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :pswitch_2
    const-string p1, "android.intent.action.BATTERY_CHANGED"

    .line 245
    .line 246
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_a

    .line 255
    .line 256
    const-string p1, "plugged"

    .line 257
    .line 258
    const/4 v0, -0x1

    .line 259
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-gtz p1, :cond_9

    .line 264
    .line 265
    const/4 p1, 0x1

    .line 266
    goto :goto_3

    .line 267
    :cond_9
    const/4 p1, 0x0

    .line 268
    :goto_3
    check-cast v5, La/cwj;

    .line 269
    .line 270
    iget-object p2, v5, La/cwj;->e:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p2, Landroid/os/Handler;

    .line 273
    .line 274
    new-instance v0, La/hp2;

    .line 275
    .line 276
    const/4 v1, 0x3

    .line 277
    invoke-direct {v0, p0, p1, v1}, La/hp2;-><init>(Ljava/lang/Object;ZB)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 281
    .line 282
    .line 283
    :cond_a
    return-void

    .line 284
    :pswitch_3
    check-cast v5, La/nvu;

    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    if-nez p0, :cond_b

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 300
    .line 301
    if-gt p1, v2, :cond_c

    .line 302
    .line 303
    const-string p1, "com.huawei.hms.auth.api.phone.EXTRA_STATUS"

    .line 304
    .line 305
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    goto :goto_4

    .line 310
    :cond_c
    invoke-static {p0}, La/r6e;->D(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    check-cast p1, Landroid/os/Parcelable;

    .line 315
    .line 316
    :goto_4
    check-cast p1, Lcom/huawei/hms/support/api/client/Status;

    .line 317
    .line 318
    if-eqz p1, :cond_d

    .line 319
    .line 320
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    .line 321
    .line 322
    .line 323
    move-result p1

    .line 324
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    goto :goto_5

    .line 329
    :cond_d
    move-object p1, v4

    .line 330
    :goto_5
    if-nez p1, :cond_e

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 334
    .line 335
    .line 336
    move-result p2

    .line 337
    if-ne p2, v1, :cond_f

    .line 338
    .line 339
    invoke-virtual {v5}, La/nvu;->X()V

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_f
    :goto_6
    if-nez p1, :cond_10

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    if-nez p1, :cond_11

    .line 351
    .line 352
    const-string p1, "com.huawei.hms.auth.api.phone.EXTRA_SMS_MESSAGE"

    .line 353
    .line 354
    invoke-virtual {p0, p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    if-eqz p0, :cond_11

    .line 359
    .line 360
    iget-object p1, v5, La/nvu;->c:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p1, La/qoj0;

    .line 363
    .line 364
    invoke-virtual {p1, p0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    :cond_11
    :goto_7
    return-void

    .line 368
    :pswitch_4
    check-cast v5, La/ywu;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    const-string p0, "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"

    .line 377
    .line 378
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result p0

    .line 386
    if-eqz p0, :cond_19

    .line 387
    .line 388
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    if-nez p0, :cond_12

    .line 393
    .line 394
    goto :goto_b

    .line 395
    :cond_12
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 396
    .line 397
    if-gt p1, v2, :cond_13

    .line 398
    .line 399
    const-string p1, "com.google.android.gms.auth.api.phone.EXTRA_STATUS"

    .line 400
    .line 401
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    goto :goto_8

    .line 406
    :cond_13
    invoke-static {p0}, La/r6e;->B(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    check-cast p1, Landroid/os/Parcelable;

    .line 411
    .line 412
    :goto_8
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 413
    .line 414
    if-eqz p1, :cond_14

    .line 415
    .line 416
    iget p1, p1, Lcom/google/android/gms/common/api/Status;->a:I

    .line 417
    .line 418
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    :cond_14
    if-nez v4, :cond_15

    .line 423
    .line 424
    goto :goto_a

    .line 425
    :cond_15
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result p1

    .line 429
    if-nez p1, :cond_17

    .line 430
    .line 431
    const-string p1, "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"

    .line 432
    .line 433
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    if-nez p0, :cond_16

    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_16
    move-object v3, p0

    .line 441
    :goto_9
    iget-object p0, v5, La/ywu;->c:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast p0, La/qoj0;

    .line 444
    .line 445
    invoke-virtual {p0, v3}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    goto :goto_b

    .line 449
    :cond_17
    :goto_a
    if-nez v4, :cond_18

    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_18
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 453
    .line 454
    .line 455
    move-result p0

    .line 456
    if-ne p0, v1, :cond_19

    .line 457
    .line 458
    invoke-virtual {v5}, La/ywu;->D()V

    .line 459
    .line 460
    .line 461
    :cond_19
    :goto_b
    return-void

    .line 462
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    check-cast v5, La/va6;

    .line 469
    .line 470
    iget-byte p0, v5, La/va6;->h:B

    .line 471
    .line 472
    const-string p1, "Received "

    .line 473
    .line 474
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    packed-switch p0, :pswitch_data_1

    .line 478
    .line 479
    .line 480
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    if-nez p0, :cond_1a

    .line 485
    .line 486
    goto/16 :goto_c

    .line 487
    .line 488
    :cond_1a
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    sget-object v0, La/arm0;->a:Ljava/lang/String;

    .line 493
    .line 494
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    new-instance v2, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    invoke-virtual {p0, v0, p1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    if-eqz p0, :cond_29

    .line 518
    .line 519
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 520
    .line 521
    .line 522
    move-result p1

    .line 523
    const p2, -0x46671f94

    .line 524
    .line 525
    .line 526
    if-eq p1, p2, :cond_1d

    .line 527
    .line 528
    const p2, -0x2b8fb65c

    .line 529
    .line 530
    .line 531
    if-eq p1, p2, :cond_1b

    .line 532
    .line 533
    goto/16 :goto_c

    .line 534
    .line 535
    :cond_1b
    const-string p1, "android.intent.action.DEVICE_STORAGE_OK"

    .line 536
    .line 537
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result p0

    .line 541
    if-nez p0, :cond_1c

    .line 542
    .line 543
    goto/16 :goto_c

    .line 544
    .line 545
    :cond_1c
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 546
    .line 547
    invoke-virtual {v5, p0}, La/b4e;->f(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    goto/16 :goto_c

    .line 551
    .line 552
    :cond_1d
    const-string p1, "android.intent.action.DEVICE_STORAGE_LOW"

    .line 553
    .line 554
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result p0

    .line 558
    if-nez p0, :cond_1e

    .line 559
    .line 560
    goto/16 :goto_c

    .line 561
    .line 562
    :cond_1e
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 563
    .line 564
    invoke-virtual {v5, p0}, La/b4e;->f(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    goto/16 :goto_c

    .line 568
    .line 569
    :pswitch_6
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    if-nez p0, :cond_1f

    .line 574
    .line 575
    goto/16 :goto_c

    .line 576
    .line 577
    :cond_1f
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 578
    .line 579
    .line 580
    move-result-object p0

    .line 581
    sget-object v0, La/cb6;->a:Ljava/lang/String;

    .line 582
    .line 583
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    new-instance v2, Ljava/lang/StringBuilder;

    .line 588
    .line 589
    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object p1

    .line 599
    invoke-virtual {p0, v0, p1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    if-eqz p0, :cond_29

    .line 607
    .line 608
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 609
    .line 610
    .line 611
    move-result p1

    .line 612
    const p2, -0x7606c095    # -6.0004207E-33f

    .line 613
    .line 614
    .line 615
    if-eq p1, p2, :cond_22

    .line 616
    .line 617
    const p2, 0x1d398bfd

    .line 618
    .line 619
    .line 620
    if-eq p1, p2, :cond_20

    .line 621
    .line 622
    goto/16 :goto_c

    .line 623
    .line 624
    :cond_20
    const-string p1, "android.intent.action.BATTERY_LOW"

    .line 625
    .line 626
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result p0

    .line 630
    if-nez p0, :cond_21

    .line 631
    .line 632
    goto/16 :goto_c

    .line 633
    .line 634
    :cond_21
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 635
    .line 636
    invoke-virtual {v5, p0}, La/b4e;->f(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    goto/16 :goto_c

    .line 640
    .line 641
    :cond_22
    const-string p1, "android.intent.action.BATTERY_OKAY"

    .line 642
    .line 643
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result p0

    .line 647
    if-nez p0, :cond_23

    .line 648
    .line 649
    goto :goto_c

    .line 650
    :cond_23
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 651
    .line 652
    invoke-virtual {v5, p0}, La/b4e;->f(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    goto :goto_c

    .line 656
    :pswitch_7
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object p0

    .line 660
    if-nez p0, :cond_24

    .line 661
    .line 662
    goto :goto_c

    .line 663
    :cond_24
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 664
    .line 665
    .line 666
    move-result-object p2

    .line 667
    sget-object v0, La/wa6;->a:Ljava/lang/String;

    .line 668
    .line 669
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object p1

    .line 673
    invoke-virtual {p2, v0, p1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 677
    .line 678
    .line 679
    move-result p1

    .line 680
    sparse-switch p1, :sswitch_data_0

    .line 681
    .line 682
    .line 683
    goto :goto_c

    .line 684
    :sswitch_0
    const-string p1, "android.intent.action.ACTION_POWER_CONNECTED"

    .line 685
    .line 686
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result p0

    .line 690
    if-nez p0, :cond_25

    .line 691
    .line 692
    goto :goto_c

    .line 693
    :cond_25
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 694
    .line 695
    invoke-virtual {v5, p0}, La/b4e;->f(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    goto :goto_c

    .line 699
    :sswitch_1
    const-string p1, "android.os.action.CHARGING"

    .line 700
    .line 701
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result p0

    .line 705
    if-nez p0, :cond_26

    .line 706
    .line 707
    goto :goto_c

    .line 708
    :cond_26
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 709
    .line 710
    invoke-virtual {v5, p0}, La/b4e;->f(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    goto :goto_c

    .line 714
    :sswitch_2
    const-string p1, "android.os.action.DISCHARGING"

    .line 715
    .line 716
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-result p0

    .line 720
    if-nez p0, :cond_27

    .line 721
    .line 722
    goto :goto_c

    .line 723
    :cond_27
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 724
    .line 725
    invoke-virtual {v5, p0}, La/b4e;->f(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    goto :goto_c

    .line 729
    :sswitch_3
    const-string p1, "android.intent.action.ACTION_POWER_DISCONNECTED"

    .line 730
    .line 731
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result p0

    .line 735
    if-nez p0, :cond_28

    .line 736
    .line 737
    goto :goto_c

    .line 738
    :cond_28
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 739
    .line 740
    invoke-virtual {v5, p0}, La/b4e;->f(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    :cond_29
    :goto_c
    return-void

    .line 744
    :pswitch_8
    check-cast v5, La/a56;

    .line 745
    .line 746
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object p0

    .line 756
    if-eqz p0, :cond_2b

    .line 757
    .line 758
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    const v1, 0x7343ab80

    .line 763
    .line 764
    .line 765
    if-eq v0, v1, :cond_2a

    .line 766
    .line 767
    goto :goto_d

    .line 768
    :cond_2a
    const-string v0, "action_change_locale"

    .line 769
    .line 770
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result p0

    .line 774
    if-eqz p0, :cond_2b

    .line 775
    .line 776
    invoke-virtual {v5}, La/a56;->e()La/g56;

    .line 777
    .line 778
    .line 779
    move-result-object p0

    .line 780
    invoke-interface {p0}, La/g56;->c()V

    .line 781
    .line 782
    .line 783
    goto :goto_e

    .line 784
    :cond_2b
    :goto_d
    invoke-virtual {v5, p1, p2}, La/a56;->g(Landroid/content/Context;Landroid/content/Intent;)V

    .line 785
    .line 786
    .line 787
    :goto_e
    return-void

    .line 788
    :pswitch_9
    check-cast v5, La/krs0;

    .line 789
    .line 790
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 791
    .line 792
    .line 793
    move-result p0

    .line 794
    if-nez p0, :cond_2c

    .line 795
    .line 796
    invoke-virtual {v5}, La/krs0;->b()Ljava/util/List;

    .line 797
    .line 798
    .line 799
    move-result-object p0

    .line 800
    iget-object v0, v5, La/krs0;->k:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v0, La/m24;

    .line 803
    .line 804
    iget-object v1, v5, La/krs0;->j:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v1, Landroid/media/AudioDeviceInfo;

    .line 807
    .line 808
    invoke-static {p1, p2, v0, v1, p0}, La/q24;->b(Landroid/content/Context;Landroid/content/Intent;La/m24;Landroid/media/AudioDeviceInfo;Ljava/util/List;)La/q24;

    .line 809
    .line 810
    .line 811
    move-result-object p0

    .line 812
    invoke-virtual {v5, p0}, La/krs0;->d(La/q24;)V

    .line 813
    .line 814
    .line 815
    :cond_2c
    return-void

    .line 816
    :pswitch_a
    check-cast v5, La/c2;

    .line 817
    .line 818
    invoke-virtual {v5}, La/c2;->B()V

    .line 819
    .line 820
    .line 821
    return-void

    .line 822
    nop

    .line 823
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    :sswitch_data_0
    .sparse-switch
        -0x7073f927 -> :sswitch_3
        -0x3465cce -> :sswitch_2
        0x388694fe -> :sswitch_1
        0x3cbf870b -> :sswitch_0
    .end sparse-switch
.end method
