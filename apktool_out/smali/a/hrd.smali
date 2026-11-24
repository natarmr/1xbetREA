.class public final synthetic La/hrd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hrd;->a:B

    iput-object p1, p0, La/hrd;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/hrd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/hrd;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/content/res/AssetFileDescriptor;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    const-string v0, "Requesting settings from "

    .line 16
    .line 17
    iget-object p0, p0, La/hrd;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/g090;

    .line 20
    .line 21
    iget-object p0, p0, La/g090;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/sd60;

    .line 24
    .line 25
    iget-object v1, p0, La/sd60;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, La/fhn;

    .line 28
    .line 29
    iget-object p0, p0, La/sd60;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/z6j0;

    .line 32
    .line 33
    iget-object v3, v1, La/fhn;->b:Ljava/lang/String;

    .line 34
    .line 35
    const-string v5, "FirebaseCrashlytics"

    .line 36
    .line 37
    const-string v6, "Settings query params were: "

    .line 38
    .line 39
    invoke-static {}, La/cu;->e()V

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-static {p0}, La/fhn;->g(La/z6j0;)Ljava/util/HashMap;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    new-instance v8, La/yuu;

    .line 47
    .line 48
    invoke-direct {v8, v3, v7}, La/yuu;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 49
    .line 50
    .line 51
    const-string v9, "User-Agent"

    .line 52
    .line 53
    const-string v10, "Crashlytics Android SDK/20.1.1"

    .line 54
    .line 55
    invoke-virtual {v8, v9, v10}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v9, "X-CRASHLYTICS-DEVELOPER-TOKEN"

    .line 59
    .line 60
    const-string v10, "470fa2b4ae81cd56ecbcda9735803434cec591fa"

    .line 61
    .line 62
    invoke-virtual {v8, v9, v10}, La/yuu;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v8, p0}, La/fhn;->c(La/yuu;La/z6j0;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const/4 v0, 0x3

    .line 73
    invoke-static {v5, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    invoke-static {v5, p0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 80
    .line 81
    .line 82
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {v5, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    invoke-static {v5, p0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-virtual {v8}, La/yuu;->f()La/kge;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {v1, p0}, La/fhn;->h(La/kge;)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    goto :goto_0

    .line 112
    :catch_0
    move-exception p0

    .line 113
    const-string v0, "Settings request failed."

    .line 114
    .line 115
    invoke-static {v5, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 116
    .line 117
    .line 118
    :goto_0
    return-object v4

    .line 119
    :pswitch_1
    iget-object p0, p0, La/hrd;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, La/qff0;

    .line 122
    .line 123
    const-string v0, "firebase"

    .line 124
    .line 125
    invoke-virtual {p0, v0}, La/qff0;->b(Ljava/lang/String;)La/xgq;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :pswitch_2
    iget-object p0, p0, La/hrd;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, Ljava/io/ByteArrayInputStream;

    .line 133
    .line 134
    invoke-static {p0}, La/w9x;->L(Ljava/io/InputStream;)La/hfx;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0, v4}, La/ka10;->e(La/hfx;Ljava/lang/String;)La/ob10;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_3
    iget-object p0, p0, La/hrd;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, La/jru;

    .line 146
    .line 147
    iget-object p0, p0, La/jru;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p0, Landroidx/work/impl/WorkDatabase;

    .line 150
    .line 151
    const-string v0, "next_job_scheduler_id"

    .line 152
    .line 153
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->t()La/vsb0;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2, v0}, La/vsb0;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-eqz v2, :cond_2

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 164
    .line 165
    .line 166
    move-result-wide v4

    .line 167
    long-to-int v2, v4

    .line 168
    goto :goto_1

    .line 169
    :cond_2
    move v2, v3

    .line 170
    :goto_1
    const v4, 0x7fffffff

    .line 171
    .line 172
    .line 173
    if-ne v2, v4, :cond_3

    .line 174
    .line 175
    move v5, v3

    .line 176
    goto :goto_2

    .line 177
    :cond_3
    add-int/lit8 v5, v2, 0x1

    .line 178
    .line 179
    :goto_2
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->t()La/vsb0;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    new-instance v7, La/usb0;

    .line 184
    .line 185
    int-to-long v8, v5

    .line 186
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-direct {v7, v0, v5}, La/usb0;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 191
    .line 192
    .line 193
    iget-object v5, v6, La/vsb0;->a:La/aeg0;

    .line 194
    .line 195
    new-instance v8, La/zga0;

    .line 196
    .line 197
    const/16 v9, 0x15

    .line 198
    .line 199
    invoke-direct {v8, v6, v7, v9}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 200
    .line 201
    .line 202
    invoke-static {v5, v3, v1, v8}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    if-ltz v2, :cond_4

    .line 206
    .line 207
    if-gt v2, v4, :cond_4

    .line 208
    .line 209
    move v3, v2

    .line 210
    goto :goto_3

    .line 211
    :cond_4
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->t()La/vsb0;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    new-instance v2, La/usb0;

    .line 216
    .line 217
    const-wide/16 v4, 0x1

    .line 218
    .line 219
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-direct {v2, v0, v4}, La/usb0;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, La/vsb0;->a:La/aeg0;

    .line 227
    .line 228
    new-instance v4, La/zga0;

    .line 229
    .line 230
    invoke-direct {v4, p0, v2, v9}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v3, v1, v4}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :pswitch_4
    iget-object p0, p0, La/hrd;->b:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p0, La/j8f;

    .line 244
    .line 245
    iget-object p0, p0, La/j8f;->g:La/f8f;

    .line 246
    .line 247
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    const-string v0, "FirebaseCrashlytics"

    .line 251
    .line 252
    invoke-static {}, La/cu;->d()V

    .line 253
    .line 254
    .line 255
    iget-object v5, p0, La/f8f;->c:La/c5k;

    .line 256
    .line 257
    iget-object v6, v5, La/c5k;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v6, La/xzp;

    .line 260
    .line 261
    iget-object v7, v5, La/c5k;->a:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v7, Ljava/lang/String;

    .line 264
    .line 265
    new-instance v8, Ljava/io/File;

    .line 266
    .line 267
    iget-object v6, v6, La/xzp;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v6, Ljava/io/File;

    .line 270
    .line 271
    invoke-direct {v8, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-nez v6, :cond_6

    .line 279
    .line 280
    invoke-virtual {p0}, La/f8f;->e()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-eqz v0, :cond_5

    .line 285
    .line 286
    iget-object p0, p0, La/f8f;->j:La/k8f;

    .line 287
    .line 288
    invoke-virtual {p0}, La/k8f;->c()Z

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    if-eqz p0, :cond_5

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_5
    move v1, v3

    .line 296
    goto :goto_4

    .line 297
    :cond_6
    const-string p0, "Found previous crash marker."

    .line 298
    .line 299
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_7

    .line 304
    .line 305
    invoke-static {v0, p0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 306
    .line 307
    .line 308
    :cond_7
    iget-object p0, v5, La/c5k;->b:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast p0, La/xzp;

    .line 311
    .line 312
    new-instance v0, Ljava/io/File;

    .line 313
    .line 314
    iget-object p0, p0, La/xzp;->c:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p0, Ljava/io/File;

    .line 317
    .line 318
    invoke-direct {v0, p0, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 322
    .line 323
    .line 324
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :pswitch_5
    iget-object p0, p0, La/hrd;->b:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;

    .line 332
    .line 333
    invoke-static {p0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->a(Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    return-object p0

    .line 338
    :pswitch_6
    iget-object p0, p0, La/hrd;->b:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast p0, La/nsd;

    .line 341
    .line 342
    monitor-enter p0

    .line 343
    :try_start_1
    iget-object v0, p0, La/nsd;->a:Landroid/content/Context;

    .line 344
    .line 345
    iget-object v1, p0, La/nsd;->b:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 348
    .line 349
    .line 350
    move-result-object v0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 351
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    new-array v2, v1, [B

    .line 356
    .line 357
    invoke-virtual {v0, v2, v3, v1}, Ljava/io/FileInputStream;->read([BII)I

    .line 358
    .line 359
    .line 360
    new-instance v1, Ljava/lang/String;

    .line 361
    .line 362
    const-string v3, "UTF-8"

    .line 363
    .line 364
    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 365
    .line 366
    .line 367
    new-instance v2, Lorg/json/JSONObject;

    .line 368
    .line 369
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v2}, La/mrd;->a(Lorg/json/JSONObject;)La/mrd;

    .line 373
    .line 374
    .line 375
    move-result-object v4
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 376
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 377
    .line 378
    .line 379
    monitor-exit p0

    .line 380
    goto :goto_9

    .line 381
    :catchall_0
    move-exception v0

    .line 382
    goto :goto_7

    .line 383
    :catchall_1
    move-exception v1

    .line 384
    move-object v4, v0

    .line 385
    goto :goto_5

    .line 386
    :catchall_2
    move-exception v1

    .line 387
    goto :goto_5

    .line 388
    :catch_1
    move-object v0, v4

    .line 389
    goto :goto_6

    .line 390
    :goto_5
    if-eqz v4, :cond_8

    .line 391
    .line 392
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    .line 393
    .line 394
    .line 395
    :cond_8
    throw v1

    .line 396
    :catch_2
    :goto_6
    if-eqz v0, :cond_9

    .line 397
    .line 398
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 399
    .line 400
    .line 401
    goto :goto_8

    .line 402
    :goto_7
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 403
    throw v0

    .line 404
    :cond_9
    :goto_8
    monitor-exit p0

    .line 405
    :goto_9
    return-object v4

    .line 406
    nop

    .line 407
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
