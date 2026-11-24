.class public final Lokhttp3/internal/http/RetryAndFollowUpInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/internal/http/RetryAndFollowUpInterceptor;",
        "Lokhttp3/Interceptor;",
        "Companion",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static b(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Request;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lokhttp3/internal/connection/Exchange;->c()Lokhttp3/internal/connection/RealConnection;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v1, v1, Lokhttp3/internal/connection/RealConnection;->c:Lokhttp3/Route;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    iget v2, p0, Lokhttp3/Response;->d:I

    .line 13
    .line 14
    iget-object v3, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 15
    .line 16
    iget-object v4, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    const/16 v7, 0x134

    .line 21
    .line 22
    const/16 v8, 0x133

    .line 23
    .line 24
    if-eq v2, v8, :cond_e

    .line 25
    .line 26
    if-eq v2, v7, :cond_e

    .line 27
    .line 28
    const/16 v9, 0x191

    .line 29
    .line 30
    if-eq v2, v9, :cond_d

    .line 31
    .line 32
    const/16 v9, 0x1a5

    .line 33
    .line 34
    if-eq v2, v9, :cond_a

    .line 35
    .line 36
    const/16 p1, 0x1f7

    .line 37
    .line 38
    if-eq v2, p1, :cond_8

    .line 39
    .line 40
    const/16 p1, 0x197

    .line 41
    .line 42
    if-eq v2, p1, :cond_6

    .line 43
    .line 44
    const/16 p1, 0x198

    .line 45
    .line 46
    if-eq v2, p1, :cond_1

    .line 47
    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    iget-boolean p2, p2, Lokhttp3/internal/http/RealInterceptorChain;->r:Z

    .line 54
    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_2
    iget-object p2, v3, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 60
    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p2}, Lokhttp3/RequestBody;->c()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_3
    iget-object p2, p0, Lokhttp3/Response;->k:Lokhttp3/Response;

    .line 72
    .line 73
    if-eqz p2, :cond_4

    .line 74
    .line 75
    iget p2, p2, Lokhttp3/Response;->d:I

    .line 76
    .line 77
    if-ne p2, p1, :cond_4

    .line 78
    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :cond_4
    invoke-static {p0, v5}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->d(Lokhttp3/Response;I)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-lez p1, :cond_5

    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_5
    iget-object p0, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p1, v1, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 102
    .line 103
    if-ne p1, v2, :cond_7

    .line 104
    .line 105
    iget-object p1, p2, Lokhttp3/internal/http/RealInterceptorChain;->p:Lokhttp3/Authenticator;

    .line 106
    .line 107
    invoke-interface {p1, v1, p0}, Lokhttp3/Authenticator;->d(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_7
    const-string p0, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 113
    .line 114
    invoke-static {p0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_8
    iget-object p2, p0, Lokhttp3/Response;->k:Lokhttp3/Response;

    .line 119
    .line 120
    if-eqz p2, :cond_9

    .line 121
    .line 122
    iget p2, p2, Lokhttp3/Response;->d:I

    .line 123
    .line 124
    if-ne p2, p1, :cond_9

    .line 125
    .line 126
    goto/16 :goto_3

    .line 127
    .line 128
    :cond_9
    const p1, 0x7fffffff

    .line 129
    .line 130
    .line 131
    invoke-static {p0, p1}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->d(Lokhttp3/Response;I)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-nez p1, :cond_14

    .line 136
    .line 137
    iget-object p0, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_a
    iget-object p2, v3, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 141
    .line 142
    if-eqz p2, :cond_b

    .line 143
    .line 144
    invoke-virtual {p2}, Lokhttp3/RequestBody;->c()Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-eqz p2, :cond_b

    .line 149
    .line 150
    goto/16 :goto_3

    .line 151
    .line 152
    :cond_b
    if-eqz p1, :cond_14

    .line 153
    .line 154
    iget-object p2, p1, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/internal/connection/ExchangeFinder;

    .line 155
    .line 156
    invoke-interface {p2}, Lokhttp3/internal/connection/ExchangeFinder;->b()Lokhttp3/internal/connection/RoutePlanner;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-interface {p2}, Lokhttp3/internal/connection/RoutePlanner;->getAddress()Lokhttp3/Address;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    iget-object p2, p2, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 165
    .line 166
    iget-object p2, p2, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v1, p1, Lokhttp3/internal/connection/Exchange;->c:Lokhttp3/internal/http/ExchangeCodec;

    .line 169
    .line 170
    invoke-interface {v1}, Lokhttp3/internal/http/ExchangeCodec;->j()Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-interface {v1}, Lokhttp3/internal/http/ExchangeCodec$Carrier;->e()Lokhttp3/Route;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    iget-object v1, v1, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 179
    .line 180
    iget-object v1, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 181
    .line 182
    iget-object v1, v1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-eqz p2, :cond_c

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_c
    invoke-virtual {p1}, Lokhttp3/internal/connection/Exchange;->c()Lokhttp3/internal/connection/RealConnection;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    monitor-enter p1

    .line 196
    :try_start_0
    iput-boolean v6, p1, Lokhttp3/internal/connection/RealConnection;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    .line 198
    monitor-exit p1

    .line 199
    iget-object p0, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 200
    .line 201
    return-object p0

    .line 202
    :catchall_0
    move-exception p0

    .line 203
    monitor-exit p1

    .line 204
    throw p0

    .line 205
    :cond_d
    iget-object p1, p2, Lokhttp3/internal/http/RealInterceptorChain;->i:Lokhttp3/Authenticator;

    .line 206
    .line 207
    invoke-interface {p1, v1, p0}, Lokhttp3/Authenticator;->d(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0

    .line 212
    :cond_e
    :pswitch_0
    iget-object p1, p2, Lokhttp3/internal/http/RealInterceptorChain;->a:Lokhttp3/internal/connection/RealCall;

    .line 213
    .line 214
    iget-object p1, p1, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 215
    .line 216
    iget-boolean p1, p1, Lokhttp3/OkHttpClient;->h:Z

    .line 217
    .line 218
    if-nez p1, :cond_f

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_f
    const-string p1, "Location"

    .line 222
    .line 223
    iget-object v1, p0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 224
    .line 225
    invoke-virtual {v1, p1}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    if-nez p1, :cond_10

    .line 230
    .line 231
    move-object p1, v0

    .line 232
    :cond_10
    iget-object v1, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 233
    .line 234
    if-nez p1, :cond_11

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_11
    iget-object v2, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    :try_start_1
    new-instance v3, Lokhttp3/HttpUrl$Builder;

    .line 243
    .line 244
    invoke-direct {v3}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v2, p1}, Lokhttp3/HttpUrl$Builder;->b(Lokhttp3/HttpUrl;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :catch_0
    move-object v3, v0

    .line 252
    :goto_1
    if-eqz v3, :cond_12

    .line 253
    .line 254
    invoke-virtual {v3}, Lokhttp3/HttpUrl$Builder;->a()Lokhttp3/HttpUrl;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    goto :goto_2

    .line 259
    :cond_12
    move-object p1, v0

    .line 260
    :goto_2
    if-nez p1, :cond_13

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_13
    iget-object v2, p1, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 264
    .line 265
    iget-object v3, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 266
    .line 267
    iget-object v3, v3, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-nez v2, :cond_15

    .line 274
    .line 275
    iget-object p2, p2, Lokhttp3/internal/http/RealInterceptorChain;->a:Lokhttp3/internal/connection/RealCall;

    .line 276
    .line 277
    iget-object p2, p2, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 278
    .line 279
    iget-boolean p2, p2, Lokhttp3/OkHttpClient;->i:Z

    .line 280
    .line 281
    if-nez p2, :cond_15

    .line 282
    .line 283
    :cond_14
    :goto_3
    return-object v0

    .line 284
    :cond_15
    invoke-virtual {v1}, Lokhttp3/Request;->a()Lokhttp3/Request$Builder;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    invoke-static {v4}, Lokhttp3/internal/http/HttpMethod;->a(Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_19

    .line 293
    .line 294
    iget p0, p0, Lokhttp3/Response;->d:I

    .line 295
    .line 296
    const-string v2, "PROPFIND"

    .line 297
    .line 298
    const/16 v3, 0x12f

    .line 299
    .line 300
    if-ne p0, v3, :cond_16

    .line 301
    .line 302
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    xor-int/lit8 v5, p0, 0x1

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_16
    if-eq p0, v8, :cond_17

    .line 310
    .line 311
    if-eq p0, v7, :cond_17

    .line 312
    .line 313
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    if-nez p0, :cond_17

    .line 318
    .line 319
    const-string p0, "QUERY"

    .line 320
    .line 321
    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result p0

    .line 325
    if-nez p0, :cond_17

    .line 326
    .line 327
    move v5, v6

    .line 328
    :cond_17
    :goto_4
    if-eqz v5, :cond_18

    .line 329
    .line 330
    const-string p0, "GET"

    .line 331
    .line 332
    invoke-virtual {p2, p0, v0}, Lokhttp3/Request$Builder;->b(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 333
    .line 334
    .line 335
    const-string p0, "Transfer-Encoding"

    .line 336
    .line 337
    iget-object v0, p2, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 338
    .line 339
    invoke-virtual {v0, p0}, Lokhttp3/Headers$Builder;->d(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    const-string p0, "Content-Length"

    .line 343
    .line 344
    iget-object v0, p2, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 345
    .line 346
    invoke-virtual {v0, p0}, Lokhttp3/Headers$Builder;->d(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    const-string p0, "Content-Type"

    .line 350
    .line 351
    iget-object v0, p2, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 352
    .line 353
    invoke-virtual {v0, p0}, Lokhttp3/Headers$Builder;->d(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_18
    iget-object p0, v1, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 358
    .line 359
    invoke-virtual {p2, v4, p0}, Lokhttp3/Request$Builder;->b(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 360
    .line 361
    .line 362
    :cond_19
    :goto_5
    iget-object p0, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 363
    .line 364
    invoke-static {p0, p1}, Lokhttp3/internal/_UtilJvmKt;->a(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    if-nez p0, :cond_1a

    .line 369
    .line 370
    const-string p0, "Authorization"

    .line 371
    .line 372
    iget-object v0, p2, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 373
    .line 374
    invoke-virtual {v0, p0}, Lokhttp3/Headers$Builder;->d(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    :cond_1a
    iput-object p1, p2, Lokhttp3/Request$Builder;->a:Lokhttp3/HttpUrl;

    .line 378
    .line 379
    new-instance p0, Lokhttp3/Request;

    .line 380
    .line 381
    invoke-direct {p0, p2}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 382
    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Ljava/io/IOException;Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/Request;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 2
    .line 3
    iget-boolean p2, p2, Lokhttp3/internal/http/RealInterceptorChain;->r:Z

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    if-nez v0, :cond_2

    .line 9
    .line 10
    iget-object p2, p3, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Lokhttp3/RequestBody;->c()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_8

    .line 19
    .line 20
    :cond_1
    instance-of p2, p0, Ljava/io/FileNotFoundException;

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    instance-of p2, p0, Ljava/net/ProtocolException;

    .line 26
    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_3
    instance-of p2, p0, Ljava/io/InterruptedIOException;

    .line 31
    .line 32
    if-eqz p2, :cond_4

    .line 33
    .line 34
    instance-of p0, p0, Ljava/net/SocketTimeoutException;

    .line 35
    .line 36
    if-eqz p0, :cond_8

    .line 37
    .line 38
    if-eqz v0, :cond_8

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    instance-of p2, p0, Ljavax/net/ssl/SSLHandshakeException;

    .line 42
    .line 43
    if-eqz p2, :cond_5

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    instance-of p2, p2, Ljava/security/cert/CertificateException;

    .line 50
    .line 51
    if-eqz p2, :cond_5

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_5
    instance-of p0, p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 55
    .line 56
    if-eqz p0, :cond_6

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_6
    :goto_0
    iget-object p0, p1, Lokhttp3/internal/connection/RealCall;->s:Lokhttp3/internal/connection/Exchange;

    .line 60
    .line 61
    if-eqz p0, :cond_8

    .line 62
    .line 63
    iget-boolean p0, p0, Lokhttp3/internal/connection/Exchange;->d:Z

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    if-ne p0, p2, :cond_8

    .line 67
    .line 68
    iget-object p0, p1, Lokhttp3/internal/connection/RealCall;->i:Lokhttp3/internal/connection/ExchangeFinder;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, Lokhttp3/internal/connection/ExchangeFinder;->b()Lokhttp3/internal/connection/RoutePlanner;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p1, p1, Lokhttp3/internal/connection/RealCall;->s:Lokhttp3/internal/connection/Exchange;

    .line 78
    .line 79
    if-eqz p1, :cond_7

    .line 80
    .line 81
    invoke-virtual {p1}, Lokhttp3/internal/connection/Exchange;->c()Lokhttp3/internal/connection/RealConnection;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    goto :goto_1

    .line 86
    :cond_7
    const/4 p1, 0x0

    .line 87
    :goto_1
    invoke-interface {p0, p1}, Lokhttp3/internal/connection/RoutePlanner;->a(Lokhttp3/internal/connection/RealConnection;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_8

    .line 92
    .line 93
    return p2

    .line 94
    :cond_8
    :goto_2
    const/4 p0, 0x0

    .line 95
    return p0
.end method

.method public static d(Lokhttp3/Response;I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 2
    .line 3
    const-string v0, "Retry-After"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    new-instance p1, Lkotlin/text/Regex;

    .line 16
    .line 17
    const-string v0, "\\d+"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p0}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    const p0, 0x7fffffff

    .line 41
    .line 42
    .line 43
    return p0
.end method


# virtual methods
.method public final a(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Response;
    .locals 35

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 4
    .line 5
    iget-object v14, v1, Lokhttp3/internal/http/RealInterceptorChain;->a:Lokhttp3/internal/connection/RealCall;

    .line 6
    .line 7
    sget-object v2, La/iun;->a:La/iun;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/16 v16, 0x0

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    move-object v15, v0

    .line 14
    move/from16 v18, v3

    .line 15
    .line 16
    move v0, v4

    .line 17
    move-object/from16 v17, v16

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v5, v14, Lokhttp3/internal/connection/RealCall;->l:Lokhttp3/internal/connection/Exchange;

    .line 23
    .line 24
    if-nez v5, :cond_c

    .line 25
    .line 26
    monitor-enter v14

    .line 27
    :try_start_0
    iget-boolean v5, v14, Lokhttp3/internal/connection/RealCall;->n:Z

    .line 28
    .line 29
    if-nez v5, :cond_b

    .line 30
    .line 31
    iget-boolean v5, v14, Lokhttp3/internal/connection/RealCall;->m:Z

    .line 32
    .line 33
    if-nez v5, :cond_a

    .line 34
    .line 35
    iget-boolean v5, v14, Lokhttp3/internal/connection/RealCall;->p:Z

    .line 36
    .line 37
    if-nez v5, :cond_a

    .line 38
    .line 39
    iget-boolean v5, v14, Lokhttp3/internal/connection/RealCall;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 40
    .line 41
    if-nez v5, :cond_a

    .line 42
    .line 43
    monitor-exit v14

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    move-object v5, v2

    .line 47
    new-instance v2, Lokhttp3/internal/connection/RealRoutePlanner;

    .line 48
    .line 49
    iget-object v0, v14, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 50
    .line 51
    move v6, v3

    .line 52
    iget-object v3, v0, Lokhttp3/OkHttpClient;->D:Lokhttp3/internal/concurrent/TaskRunner;

    .line 53
    .line 54
    iget-object v7, v1, Lokhttp3/internal/http/RealInterceptorChain;->k:Lokhttp3/ConnectionPool;

    .line 55
    .line 56
    iget-object v7, v7, Lokhttp3/ConnectionPool;->a:Lokhttp3/internal/connection/RealConnectionPool;

    .line 57
    .line 58
    move-object v8, v5

    .line 59
    iget v5, v1, Lokhttp3/internal/http/RealInterceptorChain;->g:I

    .line 60
    .line 61
    move v9, v6

    .line 62
    iget v6, v1, Lokhttp3/internal/http/RealInterceptorChain;->h:I

    .line 63
    .line 64
    move v10, v4

    .line 65
    move-object v4, v7

    .line 66
    iget v7, v1, Lokhttp3/internal/http/RealInterceptorChain;->f:I

    .line 67
    .line 68
    move v11, v9

    .line 69
    iget v9, v0, Lokhttp3/OkHttpClient;->z:I

    .line 70
    .line 71
    move v12, v10

    .line 72
    iget-boolean v10, v1, Lokhttp3/internal/http/RealInterceptorChain;->r:Z

    .line 73
    .line 74
    iget-boolean v0, v0, Lokhttp3/OkHttpClient;->f:Z

    .line 75
    .line 76
    iget-object v13, v15, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 77
    .line 78
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v13}, Lokhttp3/HttpUrl;->f()Z

    .line 82
    .line 83
    .line 84
    move-result v19

    .line 85
    if-eqz v19, :cond_0

    .line 86
    .line 87
    iget-object v11, v1, Lokhttp3/internal/http/RealInterceptorChain;->t:Ljavax/net/ssl/SSLSocketFactory;

    .line 88
    .line 89
    iget-object v12, v1, Lokhttp3/internal/http/RealInterceptorChain;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 90
    .line 91
    move/from16 v20, v0

    .line 92
    .line 93
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->j:Lokhttp3/CertificatePinner;

    .line 94
    .line 95
    move-object/from16 v28, v0

    .line 96
    .line 97
    move-object/from16 v26, v11

    .line 98
    .line 99
    move-object/from16 v27, v12

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_0
    move/from16 v20, v0

    .line 103
    .line 104
    move-object/from16 v26, v16

    .line 105
    .line 106
    move-object/from16 v27, v26

    .line 107
    .line 108
    move-object/from16 v28, v27

    .line 109
    .line 110
    :goto_1
    new-instance v21, Lokhttp3/Address;

    .line 111
    .line 112
    iget-object v0, v13, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 113
    .line 114
    iget v11, v13, Lokhttp3/HttpUrl;->e:I

    .line 115
    .line 116
    iget-object v12, v1, Lokhttp3/internal/http/RealInterceptorChain;->m:Lokhttp3/Dns;

    .line 117
    .line 118
    iget-object v13, v1, Lokhttp3/internal/http/RealInterceptorChain;->s:Ljavax/net/SocketFactory;

    .line 119
    .line 120
    move-object/from16 v22, v0

    .line 121
    .line 122
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->p:Lokhttp3/Authenticator;

    .line 123
    .line 124
    move-object/from16 v29, v0

    .line 125
    .line 126
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->o:Ljava/net/Proxy;

    .line 127
    .line 128
    move-object/from16 v30, v0

    .line 129
    .line 130
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->a:Lokhttp3/internal/connection/RealCall;

    .line 131
    .line 132
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 133
    .line 134
    move-object/from16 v34, v2

    .line 135
    .line 136
    iget-object v2, v0, Lokhttp3/OkHttpClient;->s:Ljava/util/List;

    .line 137
    .line 138
    iget-object v0, v0, Lokhttp3/OkHttpClient;->r:Ljava/util/List;

    .line 139
    .line 140
    move-object/from16 v32, v0

    .line 141
    .line 142
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->q:Ljava/net/ProxySelector;

    .line 143
    .line 144
    move-object/from16 v33, v0

    .line 145
    .line 146
    move-object/from16 v31, v2

    .line 147
    .line 148
    move/from16 v23, v11

    .line 149
    .line 150
    move-object/from16 v24, v12

    .line 151
    .line 152
    move-object/from16 v25, v13

    .line 153
    .line 154
    invoke-direct/range {v21 .. v33}, Lokhttp3/Address;-><init>(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, v14, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 158
    .line 159
    iget-object v13, v0, Lokhttp3/OkHttpClient;->C:Lokhttp3/internal/connection/RouteDatabase;

    .line 160
    .line 161
    move-object v2, v8

    .line 162
    move v8, v5

    .line 163
    move-object/from16 p0, v2

    .line 164
    .line 165
    move/from16 v11, v20

    .line 166
    .line 167
    move-object/from16 v12, v21

    .line 168
    .line 169
    move-object/from16 v2, v34

    .line 170
    .line 171
    invoke-direct/range {v2 .. v15}, Lokhttp3/internal/connection/RealRoutePlanner;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZZLokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, v14, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 175
    .line 176
    iget-boolean v3, v0, Lokhttp3/OkHttpClient;->f:Z

    .line 177
    .line 178
    if-eqz v3, :cond_1

    .line 179
    .line 180
    new-instance v3, Lokhttp3/internal/connection/FastFallbackExchangeFinder;

    .line 181
    .line 182
    iget-object v0, v0, Lokhttp3/OkHttpClient;->D:Lokhttp3/internal/concurrent/TaskRunner;

    .line 183
    .line 184
    invoke-direct {v3, v2, v0}, Lokhttp3/internal/connection/FastFallbackExchangeFinder;-><init>(Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/internal/concurrent/TaskRunner;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_1
    new-instance v3, Lokhttp3/internal/connection/SequentialExchangeFinder;

    .line 189
    .line 190
    invoke-direct {v3, v2}, Lokhttp3/internal/connection/SequentialExchangeFinder;-><init>(Lokhttp3/internal/connection/RealRoutePlanner;)V

    .line 191
    .line 192
    .line 193
    :goto_2
    iput-object v3, v14, Lokhttp3/internal/connection/RealCall;->i:Lokhttp3/internal/connection/ExchangeFinder;

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_2
    move-object/from16 p0, v2

    .line 197
    .line 198
    :goto_3
    :try_start_1
    iget-boolean v0, v14, Lokhttp3/internal/connection/RealCall;->r:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 199
    .line 200
    if-nez v0, :cond_9

    .line 201
    .line 202
    :try_start_2
    invoke-virtual {v1, v15}, Lokhttp3/internal/http/RealInterceptorChain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    .line 203
    .line 204
    .line 205
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 206
    :try_start_3
    invoke-virtual {v0}, Lokhttp3/Response;->c()Lokhttp3/Response$Builder;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iput-object v15, v0, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 211
    .line 212
    if-eqz v17, :cond_3

    .line 213
    .line 214
    :try_start_4
    invoke-static/range {v17 .. v17}, Lokhttp3/internal/UnreadableResponseBodyKt;->a(Lokhttp3/Response;)Lokhttp3/Response;

    .line 215
    .line 216
    .line 217
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 218
    goto :goto_4

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    const/4 v3, 0x1

    .line 221
    goto/16 :goto_8

    .line 222
    .line 223
    :cond_3
    move-object/from16 v2, v16

    .line 224
    .line 225
    :goto_4
    :try_start_5
    iput-object v2, v0, Lokhttp3/Response$Builder;->k:Lokhttp3/Response;

    .line 226
    .line 227
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v2, v14, Lokhttp3/internal/connection/RealCall;->l:Lokhttp3/internal/connection/Exchange;

    .line 232
    .line 233
    invoke-static {v0, v2, v1}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->b(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Request;

    .line 234
    .line 235
    .line 236
    move-result-object v15
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 237
    if-nez v15, :cond_4

    .line 238
    .line 239
    :try_start_6
    iget-object v1, v14, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 240
    .line 241
    invoke-virtual {v1, v14, v0}, Lokhttp3/EventListener;->p(Lokhttp3/Call;Lokhttp3/Response;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 242
    .line 243
    .line 244
    const/4 v6, 0x0

    .line 245
    invoke-virtual {v14, v6}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 246
    .line 247
    .line 248
    return-object v0

    .line 249
    :catchall_1
    move-exception v0

    .line 250
    const/4 v6, 0x0

    .line 251
    :goto_5
    move v3, v6

    .line 252
    goto/16 :goto_8

    .line 253
    .line 254
    :cond_4
    const/4 v6, 0x0

    .line 255
    :try_start_7
    iget-object v2, v15, Lokhttp3/Request;->d:Lokhttp3/RequestBody;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 256
    .line 257
    if-eqz v2, :cond_5

    .line 258
    .line 259
    :try_start_8
    invoke-virtual {v2}, Lokhttp3/RequestBody;->c()Z

    .line 260
    .line 261
    .line 262
    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 263
    if-eqz v2, :cond_5

    .line 264
    .line 265
    :try_start_9
    iget-object v1, v14, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 266
    .line 267
    invoke-virtual {v1, v14, v0}, Lokhttp3/EventListener;->p(Lokhttp3/Call;Lokhttp3/Response;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 268
    .line 269
    .line 270
    invoke-virtual {v14, v6}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 271
    .line 272
    .line 273
    return-object v0

    .line 274
    :catchall_2
    move-exception v0

    .line 275
    goto :goto_5

    .line 276
    :cond_5
    :try_start_a
    iget-object v2, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 277
    .line 278
    invoke-static {v2}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 279
    .line 280
    .line 281
    add-int/lit8 v2, v18, 0x1

    .line 282
    .line 283
    iget-object v3, v14, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 284
    .line 285
    const/16 v4, 0x14

    .line 286
    .line 287
    if-gt v2, v4, :cond_6

    .line 288
    .line 289
    :try_start_b
    invoke-virtual {v3, v14, v0}, Lokhttp3/EventListener;->p(Lokhttp3/Call;Lokhttp3/Response;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 290
    .line 291
    .line 292
    const/4 v10, 0x1

    .line 293
    invoke-virtual {v14, v10}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v17, v0

    .line 297
    .line 298
    move/from16 v18, v2

    .line 299
    .line 300
    move v3, v6

    .line 301
    move v0, v10

    .line 302
    move v4, v0

    .line 303
    move-object/from16 v2, p0

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :catchall_3
    move-exception v0

    .line 308
    const/4 v10, 0x1

    .line 309
    :goto_6
    move v3, v10

    .line 310
    goto :goto_8

    .line 311
    :cond_6
    const/4 v10, 0x1

    .line 312
    :try_start_c
    invoke-virtual {v3, v14, v0}, Lokhttp3/EventListener;->p(Lokhttp3/Call;Lokhttp3/Response;)V

    .line 313
    .line 314
    .line 315
    new-instance v0, Ljava/net/ProtocolException;

    .line 316
    .line 317
    new-instance v1, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    const-string v3, "Too many follow-up requests: "

    .line 323
    .line 324
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw v0

    .line 338
    :catchall_4
    move-exception v0

    .line 339
    goto :goto_6

    .line 340
    :catch_0
    move-exception v0

    .line 341
    const/4 v6, 0x0

    .line 342
    const/4 v10, 0x1

    .line 343
    invoke-static {v0, v14, v1, v15}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->c(Ljava/io/IOException;Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/Request;)Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    iget-object v3, v14, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 348
    .line 349
    invoke-virtual {v3, v14, v0}, Lokhttp3/EventListener;->C(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 350
    .line 351
    .line 352
    if-nez v2, :cond_8

    .line 353
    .line 354
    sget-object v1, Lokhttp3/internal/_UtilCommonKt;->a:[B

    .line 355
    .line 356
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eqz v2, :cond_7

    .line 368
    .line 369
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    check-cast v2, Ljava/lang/Exception;

    .line 374
    .line 375
    invoke-static {v0, v2}, La/tjo;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_7
    throw v0

    .line 380
    :cond_8
    move-object/from16 v2, p0

    .line 381
    .line 382
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 383
    .line 384
    .line 385
    move-result-object v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 386
    invoke-virtual {v14, v10}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 387
    .line 388
    .line 389
    move v0, v6

    .line 390
    move v3, v0

    .line 391
    move v4, v10

    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :cond_9
    const/4 v10, 0x1

    .line 395
    :try_start_d
    new-instance v0, Ljava/io/IOException;

    .line 396
    .line 397
    const-string v1, "Canceled"

    .line 398
    .line 399
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 403
    :goto_8
    invoke-virtual {v14, v3}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 404
    .line 405
    .line 406
    throw v0

    .line 407
    :catchall_5
    move-exception v0

    .line 408
    goto :goto_9

    .line 409
    :cond_a
    :try_start_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 410
    .line 411
    const-string v1, "Check failed."

    .line 412
    .line 413
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw v0

    .line 417
    :cond_b
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 418
    .line 419
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 420
    .line 421
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 425
    :goto_9
    monitor-exit v14

    .line 426
    throw v0

    .line 427
    :cond_c
    const-string v0, "Check failed."

    .line 428
    .line 429
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    return-object v16
.end method
