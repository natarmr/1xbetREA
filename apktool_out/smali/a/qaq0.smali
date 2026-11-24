.class public final synthetic La/qaq0;
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

    .line 1
    iput-byte p3, p0, La/qaq0;->a:B

    iput-object p1, p0, La/qaq0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/qaq0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-byte v0, p0, La/qaq0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/yqv0;

    .line 13
    .line 14
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/glz;

    .line 17
    .line 18
    iget-boolean v1, v0, La/yqv0;->c:Z

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iput-object p0, v0, La/yqv0;->d:La/glz;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/glz;->a(La/blz;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/hcp0;

    .line 31
    .line 32
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    monitor-enter v0

    .line 37
    :try_start_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, La/hcp0;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Landroid/os/PowerManager$WakeLock;

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    monitor-exit v0

    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0

    .line 59
    :pswitch_1
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, La/m9c;

    .line 62
    .line 63
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 66
    .line 67
    iget-object v0, v0, La/m9c;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/hcp0;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    new-instance v1, Ljava/lang/Thread;

    .line 78
    .line 79
    new-instance v2, La/qaq0;

    .line 80
    .line 81
    const/16 v3, 0x14

    .line 82
    .line 83
    invoke-direct {v2, v0, p0, v3}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    const-string p0, "ExoPlayer:WakeLockManager"

    .line 87
    .line 88
    invoke-direct {v1, v2, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 92
    .line 93
    .line 94
    :cond_2
    return-void

    .line 95
    :pswitch_2
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, La/vlu0;

    .line 98
    .line 99
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, [Landroid/view/View;

    .line 102
    .line 103
    iget v1, v0, La/vlu0;->p:I

    .line 104
    .line 105
    const/4 v4, -0x1

    .line 106
    if-eq v1, v4, :cond_3

    .line 107
    .line 108
    array-length v1, p0

    .line 109
    move v5, v2

    .line 110
    :goto_2
    if-ge v5, v1, :cond_3

    .line 111
    .line 112
    aget-object v6, p0, v5

    .line 113
    .line 114
    iget v7, v0, La/vlu0;->p:I

    .line 115
    .line 116
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 117
    .line 118
    .line 119
    move-result-wide v8

    .line 120
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v6, v7, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    add-int/lit8 v5, v5, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    iget v1, v0, La/vlu0;->q:I

    .line 131
    .line 132
    if-eq v1, v4, :cond_4

    .line 133
    .line 134
    array-length v1, p0

    .line 135
    :goto_3
    if-ge v2, v1, :cond_4

    .line 136
    .line 137
    aget-object v4, p0, v2

    .line 138
    .line 139
    iget v5, v0, La/vlu0;->q:I

    .line 140
    .line 141
    invoke-virtual {v4, v5, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    add-int/lit8 v2, v2, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    return-void

    .line 148
    :pswitch_3
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, La/fck0;

    .line 151
    .line 152
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, La/hyc;

    .line 155
    .line 156
    iget-object v0, v0, La/fck0;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, La/qlo;

    .line 159
    .line 160
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 161
    .line 162
    iget-object v0, v0, La/qlo;->a:La/ulo;

    .line 163
    .line 164
    iget-object v0, v0, La/ulo;->G:La/fhj;

    .line 165
    .line 166
    invoke-virtual {v0, p0}, La/fhj;->A(La/hyc;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_4
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/fck0;

    .line 173
    .line 174
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, La/tkj;

    .line 177
    .line 178
    monitor-enter p0

    .line 179
    monitor-exit p0

    .line 180
    iget-object v0, v0, La/fck0;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, La/qlo;

    .line 183
    .line 184
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 185
    .line 186
    iget-object v0, v0, La/qlo;->a:La/ulo;

    .line 187
    .line 188
    iget-object v0, v0, La/ulo;->s:La/fsj;

    .line 189
    .line 190
    iget-object v1, v0, La/fsj;->d:La/uii;

    .line 191
    .line 192
    iget-object v1, v1, La/uii;->e:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v1, La/vn30;

    .line 195
    .line 196
    invoke-virtual {v0, v1}, La/fsj;->J(La/vn30;)La/ft2;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    new-instance v2, La/z9f;

    .line 201
    .line 202
    const/16 v3, 0x9

    .line 203
    .line 204
    invoke-direct {v2, v1, p0, v3}, La/z9f;-><init>(La/ft2;Ljava/lang/Object;B)V

    .line 205
    .line 206
    .line 207
    const/16 p0, 0x3fc

    .line 208
    .line 209
    invoke-virtual {v0, v1, p0, v2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_5
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, La/fck0;

    .line 216
    .line 217
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p0, La/qfu0;

    .line 220
    .line 221
    iget-object v0, v0, La/fck0;->c:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, La/qlo;

    .line 224
    .line 225
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v0, v0, La/qlo;->a:La/ulo;

    .line 228
    .line 229
    iput-object p0, v0, La/ulo;->i0:La/qfu0;

    .line 230
    .line 231
    iget-object v0, v0, La/ulo;->m:La/vg00;

    .line 232
    .line 233
    new-instance v1, La/esj;

    .line 234
    .line 235
    invoke-direct {v1, p0}, La/esj;-><init>(La/qfu0;)V

    .line 236
    .line 237
    .line 238
    const/16 p0, 0x19

    .line 239
    .line 240
    invoke-virtual {v0, p0, v1}, La/vg00;->e(ILa/sg00;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :pswitch_6
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Landroid/content/Context;

    .line 247
    .line 248
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p0, Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance v1, Landroid/content/Intent;

    .line 256
    .line 257
    const-class v2, Lcom/vk/api/sdk/ui/VKConfirmationActivity;

    .line 258
    .line 259
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 260
    .line 261
    .line 262
    const/high16 v2, 0x10000000

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    const-string v2, "key_message"

    .line 269
    .line 270
    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_7
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lcom/vk/api/sdk/ui/VKCaptchaActivity;

    .line 284
    .line 285
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast p0, Landroid/graphics/Bitmap;

    .line 288
    .line 289
    sget-object v2, Lcom/vk/api/sdk/ui/VKCaptchaActivity;->d:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v2, v0, Lcom/vk/api/sdk/ui/VKCaptchaActivity;->b:Landroid/widget/ImageView;

    .line 295
    .line 296
    if-eqz v2, :cond_6

    .line 297
    .line 298
    invoke-virtual {v2, p0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 299
    .line 300
    .line 301
    iget-object p0, v0, Lcom/vk/api/sdk/ui/VKCaptchaActivity;->c:Landroid/widget/ProgressBar;

    .line 302
    .line 303
    if-eqz p0, :cond_5

    .line 304
    .line 305
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_5
    const-string p0, "progress"

    .line 310
    .line 311
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v3

    .line 315
    :cond_6
    const-string p0, "image"

    .line 316
    .line 317
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v3

    .line 321
    :pswitch_8
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, Ljava/lang/String;

    .line 324
    .line 325
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast p0, Lcom/vk/api/sdk/ui/VKCaptchaActivity;

    .line 328
    .line 329
    sget-object v1, Lcom/vk/api/sdk/ui/VKCaptchaActivity;->d:Ljava/lang/String;

    .line 330
    .line 331
    :try_start_2
    new-instance v1, Lokhttp3/Request$Builder;

    .line 332
    .line 333
    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->d(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Lokhttp3/Request;

    .line 340
    .line 341
    invoke-direct {v0, v1}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 342
    .line 343
    .line 344
    new-instance v1, La/tvt0;

    .line 345
    .line 346
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1}, La/tvt0;->a()Lokhttp3/OkHttpClient;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    new-instance v4, Lokhttp3/internal/connection/RealCall;

    .line 354
    .line 355
    invoke-direct {v4, v1, v0, v2}, Lokhttp3/internal/connection/RealCall;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V

    .line 356
    .line 357
    .line 358
    invoke-static {v4}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->execute(Lokhttp3/Call;)Lokhttp3/Response;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-nez v0, :cond_7

    .line 363
    .line 364
    goto :goto_8

    .line 365
    :cond_7
    iget-object v0, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 366
    .line 367
    if-eqz v0, :cond_8

    .line 368
    .line 369
    :try_start_3
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->c()[B

    .line 370
    .line 371
    .line 372
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 373
    goto :goto_4

    .line 374
    :catchall_1
    move-exception p0

    .line 375
    move-object v3, v0

    .line 376
    goto :goto_6

    .line 377
    :cond_8
    :goto_4
    if-eqz v0, :cond_a

    .line 378
    .line 379
    :goto_5
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    .line 380
    .line 381
    .line 382
    goto :goto_8

    .line 383
    :catchall_2
    move-exception p0

    .line 384
    goto :goto_6

    .line 385
    :catch_0
    move-object v0, v3

    .line 386
    goto :goto_7

    .line 387
    :goto_6
    if-eqz v3, :cond_9

    .line 388
    .line 389
    invoke-virtual {v3}, Lokhttp3/ResponseBody;->close()V

    .line 390
    .line 391
    .line 392
    :cond_9
    throw p0

    .line 393
    :catch_1
    :goto_7
    if-eqz v0, :cond_a

    .line 394
    .line 395
    goto :goto_5

    .line 396
    :cond_a
    :goto_8
    if-eqz v3, :cond_b

    .line 397
    .line 398
    array-length v0, v3

    .line 399
    invoke-static {v3, v2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    new-instance v1, La/qaq0;

    .line 407
    .line 408
    const/16 v2, 0xd

    .line 409
    .line 410
    invoke-direct {v1, p0, v0, v2}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 411
    .line 412
    .line 413
    invoke-static {v1}, La/wvt0;->a(Ljava/lang/Runnable;)V

    .line 414
    .line 415
    .line 416
    :cond_b
    return-void

    .line 417
    :pswitch_9
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Ljava/lang/Exception;

    .line 420
    .line 421
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast p0, La/mkt0;

    .line 424
    .line 425
    instance-of v1, v0, La/yut0;

    .line 426
    .line 427
    if-eqz v1, :cond_10

    .line 428
    .line 429
    check-cast v0, La/yut0;

    .line 430
    .line 431
    iget v0, v0, La/yut0;->b:I

    .line 432
    .line 433
    const/4 v1, 0x4

    .line 434
    if-eq v0, v1, :cond_c

    .line 435
    .line 436
    const/4 v1, 0x5

    .line 437
    if-eq v0, v1, :cond_c

    .line 438
    .line 439
    const/16 v1, 0xe1a

    .line 440
    .line 441
    if-eq v0, v1, :cond_c

    .line 442
    .line 443
    goto :goto_a

    .line 444
    :cond_c
    sget-object v0, La/tut0;->c:La/fvt0;

    .line 445
    .line 446
    if-eqz v0, :cond_f

    .line 447
    .line 448
    sget-object v1, La/uut0;->j:Ljava/util/List;

    .line 449
    .line 450
    iget-object v0, v0, La/fvt0;->a:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, La/nmt0;

    .line 453
    .line 454
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    sget-object v1, La/uut0;->j:Ljava/util/List;

    .line 458
    .line 459
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    if-eqz v2, :cond_d

    .line 468
    .line 469
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    check-cast v2, Ljava/lang/String;

    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iget-object v3, v0, La/nmt0;->a:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v3, Landroid/content/SharedPreferences;

    .line 481
    .line 482
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-interface {v3, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 491
    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_d
    sget-object v0, La/tut0;->d:Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    if-nez v1, :cond_e

    .line 505
    .line 506
    goto :goto_a

    .line 507
    :cond_e
    invoke-static {v0}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    throw p0

    .line 512
    :cond_f
    const-string p0, "authManager"

    .line 513
    .line 514
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    throw v3

    .line 518
    :cond_10
    :goto_a
    if-eqz p0, :cond_11

    .line 519
    .line 520
    :try_start_4
    iget-object p0, p0, La/mkt0;->a:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast p0, La/rvt0;

    .line 523
    .line 524
    const v0, 0x7f13131f

    .line 525
    .line 526
    .line 527
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    const-string v2, "ERROR_SOCIAL"

    .line 539
    .line 540
    new-instance v3, Lkotlin/Pair;

    .line 541
    .line 542
    invoke-direct {v3, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {p0}, La/sik;->y0()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 557
    .line 558
    .line 559
    goto :goto_b

    .line 560
    :catch_2
    move-exception p0

    .line 561
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 562
    .line 563
    .line 564
    :cond_11
    :goto_b
    return-void

    .line 565
    :pswitch_a
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v0, La/mkt0;

    .line 568
    .line 569
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 570
    .line 571
    if-eqz v0, :cond_12

    .line 572
    .line 573
    check-cast p0, La/awt0;

    .line 574
    .line 575
    :try_start_5
    iget-object v1, v0, La/mkt0;->a:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v1, La/rvt0;

    .line 578
    .line 579
    iget-object v2, v0, La/mkt0;->b:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v2, Ljava/lang/String;

    .line 582
    .line 583
    iget-object v0, v0, La/mkt0;->c:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, Ljava/lang/String;

    .line 586
    .line 587
    sget-object v3, La/rvt0;->f2:La/sxs0;

    .line 588
    .line 589
    invoke-virtual {v1, p0, v2, v0}, La/rvt0;->R0(La/awt0;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 590
    .line 591
    .line 592
    goto :goto_c

    .line 593
    :catch_3
    move-exception p0

    .line 594
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 595
    .line 596
    .line 597
    :cond_12
    :goto_c
    return-void

    .line 598
    :pswitch_b
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v0, La/vvt0;

    .line 601
    .line 602
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 603
    .line 604
    check-cast p0, La/mkt0;

    .line 605
    .line 606
    :try_start_6
    invoke-static {v0}, La/tut0;->a(La/vvt0;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    new-instance v1, La/qaq0;

    .line 611
    .line 612
    const/16 v2, 0xa

    .line 613
    .line 614
    invoke-direct {v1, p0, v0, v2}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 615
    .line 616
    .line 617
    invoke-static {v1}, La/wvt0;->a(Ljava/lang/Runnable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 618
    .line 619
    .line 620
    goto :goto_d

    .line 621
    :catch_4
    move-exception v0

    .line 622
    new-instance v1, La/qaq0;

    .line 623
    .line 624
    const/16 v2, 0xb

    .line 625
    .line 626
    invoke-direct {v1, v0, p0, v2}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 627
    .line 628
    .line 629
    invoke-static {v1}, La/wvt0;->a(Ljava/lang/Runnable;)V

    .line 630
    .line 631
    .line 632
    :goto_d
    return-void

    .line 633
    :pswitch_c
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v0, La/ywq0;

    .line 636
    .line 637
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast p0, Ljava/util/List;

    .line 640
    .line 641
    iget-object v1, v0, La/ywq0;->a:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v1, La/oa40;

    .line 644
    .line 645
    iget-object v0, v0, La/ywq0;->c:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, Ljava/lang/String;

    .line 648
    .line 649
    invoke-virtual {v1, v0, p0}, La/oa40;->i(Ljava/lang/String;Ljava/util/List;)V

    .line 650
    .line 651
    .line 652
    return-void

    .line 653
    :pswitch_d
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v0, La/tpt0;

    .line 656
    .line 657
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast p0, Ljava/lang/Runnable;

    .line 660
    .line 661
    iget-object v0, v0, La/tpt0;->d:Ljava/lang/ThreadLocal;

    .line 662
    .line 663
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 664
    .line 665
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    :try_start_7
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :catchall_3
    move-exception p0

    .line 676
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 677
    .line 678
    .line 679
    throw p0

    .line 680
    :pswitch_e
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v0, La/dps0;

    .line 683
    .line 684
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast p0, La/id90;

    .line 687
    .line 688
    iget-object v1, p0, La/id90;->a:La/md90;

    .line 689
    .line 690
    iget-object p0, p0, La/id90;->b:La/ts3;

    .line 691
    .line 692
    invoke-virtual {v0, v1, p0}, La/dps0;->d(La/md90;La/ts3;)V

    .line 693
    .line 694
    .line 695
    return-void

    .line 696
    :pswitch_f
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v0, Ljava/lang/Runnable;

    .line 699
    .line 700
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast p0, La/gd3;

    .line 703
    .line 704
    :try_start_8
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 705
    .line 706
    .line 707
    invoke-virtual {p0}, La/gd3;->a()V

    .line 708
    .line 709
    .line 710
    return-void

    .line 711
    :catchall_4
    move-exception v0

    .line 712
    invoke-virtual {p0}, La/gd3;->a()V

    .line 713
    .line 714
    .line 715
    throw v0

    .line 716
    :pswitch_10
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v0, La/qjk;

    .line 719
    .line 720
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast p0, La/noq0;

    .line 723
    .line 724
    sget-object v3, La/noq0;->m2:La/y2m0;

    .line 725
    .line 726
    iget-object v3, v0, La/qjk;->c:Lcom/google/android/material/button/MaterialButton;

    .line 727
    .line 728
    invoke-virtual {p0}, La/noq0;->W0()Z

    .line 729
    .line 730
    .line 731
    move-result v4

    .line 732
    if-nez v4, :cond_13

    .line 733
    .line 734
    move v4, v2

    .line 735
    goto :goto_e

    .line 736
    :cond_13
    move v4, v1

    .line 737
    :goto_e
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 738
    .line 739
    .line 740
    iget-object v3, v0, La/qjk;->d:Lcom/google/android/material/button/MaterialButton;

    .line 741
    .line 742
    invoke-virtual {p0}, La/noq0;->W0()Z

    .line 743
    .line 744
    .line 745
    move-result v4

    .line 746
    if-nez v4, :cond_14

    .line 747
    .line 748
    move v4, v2

    .line 749
    goto :goto_f

    .line 750
    :cond_14
    move v4, v1

    .line 751
    :goto_f
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 752
    .line 753
    .line 754
    iget-object v0, v0, La/qjk;->b:Lcom/google/android/material/button/MaterialButton;

    .line 755
    .line 756
    invoke-virtual {p0}, La/noq0;->W0()Z

    .line 757
    .line 758
    .line 759
    move-result p0

    .line 760
    if-eqz p0, :cond_15

    .line 761
    .line 762
    move v1, v2

    .line 763
    :cond_15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 764
    .line 765
    .line 766
    return-void

    .line 767
    :pswitch_11
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v0, La/h0q0;

    .line 770
    .line 771
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast p0, La/h6m0;

    .line 774
    .line 775
    iget-object v0, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v0, La/okt0;

    .line 778
    .line 779
    const/4 v1, 0x3

    .line 780
    invoke-virtual {v0, p0, v1}, La/okt0;->k(La/h6m0;I)V

    .line 781
    .line 782
    .line 783
    return-void

    .line 784
    :pswitch_12
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v0, La/wss;

    .line 787
    .line 788
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 791
    .line 792
    :try_start_9
    invoke-virtual {v0}, La/wss;->run()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 793
    .line 794
    .line 795
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 796
    .line 797
    .line 798
    return-void

    .line 799
    :catchall_5
    move-exception v0

    .line 800
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 801
    .line 802
    .line 803
    throw v0

    .line 804
    :pswitch_13
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v0, La/mie0;

    .line 807
    .line 808
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast p0, La/mie0;

    .line 811
    .line 812
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v0, La/vne;

    .line 815
    .line 816
    invoke-static {v0, v3}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 817
    .line 818
    .line 819
    iget-object p0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 820
    .line 821
    check-cast p0, La/vne;

    .line 822
    .line 823
    invoke-static {p0, v3}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 824
    .line 825
    .line 826
    return-void

    .line 827
    :pswitch_14
    iget-object v0, p0, La/qaq0;->b:Ljava/lang/Object;

    .line 828
    .line 829
    check-cast v0, La/raq0;

    .line 830
    .line 831
    iget-object p0, p0, La/qaq0;->c:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast p0, La/pmn0;

    .line 834
    .line 835
    iget-object v1, v0, La/raq0;->h:La/pmn0;

    .line 836
    .line 837
    if-eqz v1, :cond_16

    .line 838
    .line 839
    if-ne v1, p0, :cond_16

    .line 840
    .line 841
    iput-object v3, v0, La/raq0;->h:La/pmn0;

    .line 842
    .line 843
    iput-object v3, v0, La/raq0;->g:La/wu9;

    .line 844
    .line 845
    :cond_16
    iget-object p0, v0, La/raq0;->l:La/hi;

    .line 846
    .line 847
    if-eqz p0, :cond_17

    .line 848
    .line 849
    invoke-virtual {p0}, La/hi;->b()V

    .line 850
    .line 851
    .line 852
    iput-object v3, v0, La/raq0;->l:La/hi;

    .line 853
    .line 854
    :cond_17
    return-void

    .line 855
    :pswitch_data_0
    .packed-switch 0x0
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
