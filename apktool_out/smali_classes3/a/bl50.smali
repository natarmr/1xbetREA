.class public final La/bl50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field public final a:La/m1e;

.field public final b:La/iqi;


# direct methods
.method public constructor <init>(La/m1e;La/iqi;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/bl50;->a:La/m1e;

    .line 8
    .line 9
    iput-object p2, p0, La/bl50;->b:La/iqi;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Response;
    .locals 3

    .line 1
    iget-object v0, p1, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 2
    .line 3
    iget-object v1, p0, La/bl50;->a:La/m1e;

    .line 4
    .line 5
    invoke-interface {v1}, La/m1e;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/bl50;->b(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Request;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1, p0}, Lokhttp3/internal/http/RealInterceptorChain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v1, La/sre0;->a:La/tre0;

    .line 24
    .line 25
    const-class v2, La/fk9;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lokhttp3/Request;->b(La/sgy;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lokhttp3/internal/http/RealInterceptorChain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_1
    invoke-virtual {p0, p1}, La/bl50;->b(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Request;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p1, p0}, Lokhttp3/internal/http/RealInterceptorChain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final b(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Request;
    .locals 5

    .line 1
    iget-object p1, p1, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 2
    .line 3
    iget-object p0, p0, La/bl50;->b:La/iqi;

    .line 4
    .line 5
    iget-object v0, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 6
    .line 7
    iget-object v0, v0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 11
    .line 12
    const-string v2, "https://mob-experience.space"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto/16 :goto_8

    .line 31
    .line 32
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 33
    :try_start_1
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 34
    .line 35
    iget-object v2, p0, La/iqi;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, La/cad;

    .line 38
    .line 39
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, La/drm0;

    .line 42
    .line 43
    iget-object v2, v2, La/drm0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, La/wsb0;

    .line 46
    .line 47
    const-string v3, "SAFE_DOMAIN"

    .line 48
    .line 49
    check-cast v2, La/twb0;

    .line 50
    .line 51
    iget-object v2, v2, La/twb0;->a:La/vwb0;

    .line 52
    .line 53
    const-string v4, ""

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, La/vwb0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    sput-object v2, La/ujn;->h:Ljava/lang/String;

    .line 66
    .line 67
    const-string v3, "https://mob-experience.space"

    .line 68
    .line 69
    invoke-static {v0, v3, v2, v1}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    goto :goto_2

    .line 74
    :catchall_1
    move-exception v2

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    new-instance v2, La/qtj;

    .line 77
    .line 78
    invoke-direct {v2, v0}, La/qtj;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    :goto_1
    :try_start_2
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 83
    .line 84
    new-instance v3, La/g0g0;

    .line 85
    .line 86
    invoke-direct {v3, v2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    move-object v2, v3

    .line 90
    :goto_2
    invoke-static {v2}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-nez v3, :cond_2

    .line 95
    .line 96
    move-object v0, v2

    .line 97
    goto :goto_3

    .line 98
    :cond_2
    iget-object v2, p0, La/iqi;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, La/wti;

    .line 101
    .line 102
    new-instance v4, Ljava/lang/Exception;

    .line 103
    .line 104
    invoke-direct {v4, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 108
    :try_start_3
    iget-object v3, v2, La/wti;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, La/ilp0;

    .line 111
    .line 112
    iget-object v3, v3, La/ilp0;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, La/wsb0;

    .line 115
    .line 116
    check-cast v3, La/twb0;

    .line 117
    .line 118
    iget-object v3, v3, La/twb0;->a:La/vwb0;

    .line 119
    .line 120
    const-string v4, "ATTEMPTS_VALUE"

    .line 121
    .line 122
    invoke-virtual {v3}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 127
    .line 128
    .line 129
    iget-object v3, v2, La/wti;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 132
    .line 133
    const/4 v4, 0x1

    .line 134
    invoke-virtual {v3, v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 135
    .line 136
    .line 137
    iget-object v3, v2, La/wti;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, La/ilp0;

    .line 140
    .line 141
    iget-object v3, v3, La/ilp0;->a:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v3, La/wsb0;

    .line 144
    .line 145
    const-string v4, "ATTEMPTS_VALUE"

    .line 146
    .line 147
    check-cast v3, La/twb0;

    .line 148
    .line 149
    iget-object v3, v3, La/twb0;->a:La/vwb0;

    .line 150
    .line 151
    invoke-virtual {v3, v1, v4}, La/vwb0;->f(ILjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 152
    .line 153
    .line 154
    :try_start_4
    monitor-exit v2

    .line 155
    :goto_3
    check-cast v0, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 156
    .line 157
    :cond_3
    monitor-exit p0

    .line 158
    :try_start_5
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-lez p0, :cond_4

    .line 165
    .line 166
    iget-object p0, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 167
    .line 168
    iget-object p0, p0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-nez p0, :cond_4

    .line 175
    .line 176
    invoke-virtual {p1}, Lokhttp3/Request;->a()Lokhttp3/Request$Builder;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {p0, v0}, Lokhttp3/Request$Builder;->d(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    new-instance v0, Lokhttp3/Request;

    .line 184
    .line 185
    invoke-direct {v0, p0}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :catchall_2
    move-exception p0

    .line 190
    goto :goto_4

    .line 191
    :cond_4
    move-object v0, p1

    .line 192
    goto :goto_5

    .line 193
    :goto_4
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 194
    .line 195
    new-instance v0, La/g0g0;

    .line 196
    .line 197
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :goto_5
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    if-nez p0, :cond_5

    .line 205
    .line 206
    check-cast v0, Lokhttp3/Request;

    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_5
    instance-of v0, p0, Ljava/net/UnknownHostException;

    .line 210
    .line 211
    if-nez v0, :cond_8

    .line 212
    .line 213
    instance-of v0, p0, Ljava/net/ConnectException;

    .line 214
    .line 215
    if-nez v0, :cond_7

    .line 216
    .line 217
    instance-of v0, p0, Ljava/net/SocketException;

    .line 218
    .line 219
    if-nez v0, :cond_6

    .line 220
    .line 221
    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    .line 222
    .line 223
    if-eqz v0, :cond_9

    .line 224
    .line 225
    new-instance v0, Ljava/net/SocketTimeoutException;

    .line 226
    .line 227
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    iget-object p1, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 236
    .line 237
    new-instance v2, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v3, "original: "

    .line 240
    .line 241
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v1, " "

    .line 248
    .line 249
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string p0, "additional: "

    .line 256
    .line 257
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-direct {v0, p0}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :goto_6
    move-object p0, v0

    .line 271
    goto/16 :goto_7

    .line 272
    .line 273
    :cond_6
    new-instance v0, Ljava/net/SocketException;

    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    iget-object p1, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 284
    .line 285
    new-instance v2, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v3, "original: "

    .line 288
    .line 289
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v1, " "

    .line 296
    .line 297
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    const-string p0, "additional: "

    .line 304
    .line 305
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-direct {v0, p0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_7
    new-instance v0, Ljava/net/ConnectException;

    .line 320
    .line 321
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    iget-object p1, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 330
    .line 331
    new-instance v2, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    const-string v3, "original: "

    .line 334
    .line 335
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v1, " "

    .line 342
    .line 343
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    const-string p0, "additional: "

    .line 350
    .line 351
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-direct {v0, p0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_8
    new-instance v0, Ljava/net/UnknownHostException;

    .line 366
    .line 367
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    iget-object p1, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 376
    .line 377
    new-instance v2, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v3, "original: "

    .line 380
    .line 381
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    const-string v1, " "

    .line 388
    .line 389
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    const-string p0, "additional: "

    .line 396
    .line 397
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    invoke-direct {v0, p0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    goto/16 :goto_6

    .line 411
    .line 412
    :cond_9
    :goto_7
    throw p0

    .line 413
    :catchall_3
    move-exception p1

    .line 414
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 415
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 416
    :goto_8
    monitor-exit p0

    .line 417
    throw p1
.end method
