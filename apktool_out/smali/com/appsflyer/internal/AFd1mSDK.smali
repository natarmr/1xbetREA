.class public final Lcom/appsflyer/internal/AFd1mSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final AFKeystoreWrapper:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/appsflyer/internal/AFd1mSDK;->AFKeystoreWrapper:I

    .line 5
    .line 6
    return-void
.end method

.method private static AFLogger(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v1, ""

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_1

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    move-object p0, v0

    .line 11
    move-object v0, v2

    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :catch_0
    move-exception v0

    .line 15
    move-object v6, v0

    .line 16
    :try_start_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 21
    .line 22
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->HTTP_CLIENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v5, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v5, v1

    .line 37
    :goto_0
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-virtual/range {v3 .. v10}, Lcom/appsflyer/AFLogger;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V

    .line 42
    .line 43
    .line 44
    :goto_1
    if-nez p0, :cond_1

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v1, Ljava/io/InputStreamReader;

    .line 53
    .line 54
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-direct {v1, p0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    :try_start_2
    new-instance p0, Ljava/io/BufferedReader;

    .line 62
    .line 63
    invoke-direct {p0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    :goto_2
    :try_start_3
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    if-nez v2, :cond_2

    .line 74
    .line 75
    const/16 v2, 0xa

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    goto :goto_4

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    move-object v2, v0

    .line 83
    move-object v0, p0

    .line 84
    move-object p0, v2

    .line 85
    :goto_3
    move-object v2, v1

    .line 86
    goto :goto_5

    .line 87
    :cond_2
    :goto_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    invoke-virtual {v1}, Ljava/io/Reader;->close()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/io/Reader;->close()V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :catchall_2
    move-exception v0

    .line 104
    move-object p0, v0

    .line 105
    move-object v0, v2

    .line 106
    goto :goto_3

    .line 107
    :goto_5
    if-eqz v2, :cond_4

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/io/Reader;->close()V

    .line 110
    .line 111
    .line 112
    :cond_4
    if-eqz v0, :cond_5

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 115
    .line 116
    .line 117
    :cond_5
    throw p0
.end method


# virtual methods
.method public final registerClient(Lcom/appsflyer/internal/AFd1oSDK;)Lcom/appsflyer/internal/AFd1fSDK;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFd1oSDK;",
            ")",
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v2, "ms"

    .line 4
    .line 5
    const-string v3, "\n took "

    .line 6
    .line 7
    const-string v4, "] "

    .line 8
    .line 9
    const-string v5, "["

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    const/4 v8, 0x0

    .line 16
    :try_start_0
    iget-object v0, v1, Lcom/appsflyer/internal/AFd1oSDK;->unregisterClient:[B

    .line 17
    .line 18
    new-instance v9, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    new-instance v10, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v11, v1, Lcom/appsflyer/internal/AFd1oSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v11, ":"

    .line 31
    .line 32
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v11, v1, Lcom/appsflyer/internal/AFd1oSDK;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v10, v1, Lcom/appsflyer/internal/AFd1oSDK;->unregisterClient:[B

    .line 48
    .line 49
    iget-boolean v11, v1, Lcom/appsflyer/internal/AFd1oSDK;->e:Z

    .line 50
    .line 51
    if-eqz v11, :cond_1

    .line 52
    .line 53
    if-eqz v10, :cond_1

    .line 54
    .line 55
    iget-boolean v11, v1, Lcom/appsflyer/internal/AFd1oSDK;->registerClient:Z

    .line 56
    .line 57
    if-eqz v11, :cond_0

    .line 58
    .line 59
    const-string v10, "<encrypted>"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    move-object v12, v0

    .line 64
    goto/16 :goto_8

    .line 65
    .line 66
    :cond_0
    new-instance v11, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-direct {v11, v10, v12}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 73
    .line 74
    .line 75
    move-object v10, v11

    .line 76
    :goto_0
    const-string v11, "\n payload: "

    .line 77
    .line 78
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object v10, v1, Lcom/appsflyer/internal/AFd1oSDK;->AFLogger:Ljava/util/Map;

    .line 85
    .line 86
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_2

    .line 99
    .line 100
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    check-cast v11, Ljava/util/Map$Entry;

    .line 105
    .line 106
    const-string v12, "\n "

    .line 107
    .line 108
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    check-cast v12, Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v12, ": "

    .line 121
    .line 122
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    check-cast v11, Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    new-instance v10, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v10, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 158
    .line 159
    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->HTTP_CLIENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 160
    .line 161
    invoke-virtual {v10, v11, v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    new-instance v9, Ljava/net/URL;

    .line 165
    .line 166
    iget-object v10, v1, Lcom/appsflyer/internal/AFd1oSDK;->d:Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct {v9, v10}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-static {v9}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    check-cast v9, Ljava/net/URLConnection;

    .line 180
    .line 181
    check-cast v9, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    .line 183
    :try_start_1
    iget-object v10, v1, Lcom/appsflyer/internal/AFd1oSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v9, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iget-boolean v10, v1, Lcom/appsflyer/internal/AFd1oSDK;->force:Z

    .line 189
    .line 190
    const/4 v11, 0x0

    .line 191
    if-eqz v10, :cond_3

    .line 192
    .line 193
    invoke-virtual {v9, v11}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :catchall_1
    move-exception v0

    .line 198
    move-object v12, v0

    .line 199
    move-object v8, v9

    .line 200
    goto/16 :goto_8

    .line 201
    .line 202
    :cond_3
    :goto_2
    iget-boolean v10, v1, Lcom/appsflyer/internal/AFd1oSDK;->w:Z

    .line 203
    .line 204
    if-nez v10, :cond_4

    .line 205
    .line 206
    invoke-virtual {v9, v11}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 207
    .line 208
    .line 209
    :cond_4
    move-object/from16 v10, p0

    .line 210
    .line 211
    iget v10, v10, Lcom/appsflyer/internal/AFd1mSDK;->AFKeystoreWrapper:I

    .line 212
    .line 213
    iget v12, v1, Lcom/appsflyer/internal/AFd1oSDK;->v:I

    .line 214
    .line 215
    const/4 v13, -0x1

    .line 216
    if-eq v12, v13, :cond_5

    .line 217
    .line 218
    move v10, v12

    .line 219
    :cond_5
    invoke-virtual {v9, v10}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9, v10}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 223
    .line 224
    .line 225
    iget-boolean v10, v1, Lcom/appsflyer/internal/AFd1oSDK;->registerClient:Z

    .line 226
    .line 227
    if-eqz v10, :cond_6

    .line 228
    .line 229
    const-string v10, "application/octet-stream"

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_6
    const-string v10, "application/json"

    .line 233
    .line 234
    :goto_3
    const-string v12, "Content-Type"

    .line 235
    .line 236
    invoke-virtual {v9, v12, v10}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    iget-object v10, v1, Lcom/appsflyer/internal/AFd1oSDK;->AFLogger:Ljava/util/Map;

    .line 240
    .line 241
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v12

    .line 253
    if-eqz v12, :cond_7

    .line 254
    .line 255
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v12

    .line 259
    check-cast v12, Ljava/util/Map$Entry;

    .line 260
    .line 261
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v13

    .line 265
    check-cast v13, Ljava/lang/String;

    .line 266
    .line 267
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    check-cast v12, Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v9, v13, v12}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_7
    const/4 v10, 0x1

    .line 278
    if-eqz v0, :cond_9

    .line 279
    .line 280
    invoke-virtual {v9, v10}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 281
    .line 282
    .line 283
    const-string v12, "Content-Length"

    .line 284
    .line 285
    new-instance v13, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 288
    .line 289
    .line 290
    array-length v14, v0

    .line 291
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    invoke-virtual {v9, v12, v13}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 299
    .line 300
    .line 301
    :try_start_2
    new-instance v12, Ljava/io/BufferedOutputStream;

    .line 302
    .line 303
    invoke-virtual {v9}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 304
    .line 305
    .line 306
    move-result-object v13

    .line 307
    invoke-direct {v12, v13}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 308
    .line 309
    .line 310
    :try_start_3
    invoke-virtual {v12, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 311
    .line 312
    .line 313
    :try_start_4
    invoke-virtual {v12}, Ljava/io/OutputStream;->close()V

    .line 314
    .line 315
    .line 316
    goto :goto_6

    .line 317
    :catchall_2
    move-exception v0

    .line 318
    move-object v8, v12

    .line 319
    goto :goto_5

    .line 320
    :catchall_3
    move-exception v0

    .line 321
    :goto_5
    if-eqz v8, :cond_8

    .line 322
    .line 323
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V

    .line 324
    .line 325
    .line 326
    :cond_8
    throw v0

    .line 327
    :cond_9
    :goto_6
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    div-int/lit8 v0, v0, 0x64

    .line 332
    .line 333
    const/4 v12, 0x2

    .line 334
    if-ne v0, v12, :cond_a

    .line 335
    .line 336
    move/from16 v16, v10

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_a
    move/from16 v16, v11

    .line 340
    .line 341
    :goto_7
    iget-boolean v0, v1, Lcom/appsflyer/internal/AFd1oSDK;->i:Z

    .line 342
    .line 343
    const-string v10, ""

    .line 344
    .line 345
    if-eqz v0, :cond_b

    .line 346
    .line 347
    invoke-static {v9}, Lcom/appsflyer/internal/AFd1mSDK;->AFLogger(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v10

    .line 351
    :cond_b
    move-object v14, v10

    .line 352
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 353
    .line 354
    .line 355
    move-result-wide v10

    .line 356
    sub-long/2addr v10, v6

    .line 357
    new-instance v0, Lcom/appsflyer/internal/AFd1nSDK;

    .line 358
    .line 359
    invoke-direct {v0, v10, v11}, Lcom/appsflyer/internal/AFd1nSDK;-><init>(J)V

    .line 360
    .line 361
    .line 362
    new-instance v10, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    const-string v11, "response code:"

    .line 365
    .line 366
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v11, " "

    .line 377
    .line 378
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v11

    .line 385
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string v11, "\n body:"

    .line 389
    .line 390
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    iget-wide v11, v0, Lcom/appsflyer/internal/AFd1nSDK;->registerClient:J

    .line 400
    .line 401
    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    sget-object v11, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 412
    .line 413
    sget-object v12, Lcom/appsflyer/sdk_base/logger/LogTag;->HTTP_CLIENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 414
    .line 415
    new-instance v13, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    invoke-direct {v13, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 421
    .line 422
    .line 423
    move-result v15

    .line 424
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v10

    .line 437
    invoke-virtual {v11, v12, v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    new-instance v10, Ljava/util/HashMap;

    .line 441
    .line 442
    invoke-virtual {v9}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 443
    .line 444
    .line 445
    move-result-object v11

    .line 446
    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v10, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    new-instance v13, Lcom/appsflyer/internal/AFd1fSDK;

    .line 453
    .line 454
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 455
    .line 456
    .line 457
    move-result v15

    .line 458
    move-object/from16 v18, v0

    .line 459
    .line 460
    move-object/from16 v17, v10

    .line 461
    .line 462
    invoke-direct/range {v13 .. v18}, Lcom/appsflyer/internal/AFd1fSDK;-><init>(Ljava/lang/Object;IZLjava/util/Map;Lcom/appsflyer/internal/AFd1nSDK;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 463
    .line 464
    .line 465
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 466
    .line 467
    .line 468
    return-object v13

    .line 469
    :goto_8
    :try_start_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 470
    .line 471
    .line 472
    move-result-wide v9

    .line 473
    sub-long/2addr v9, v6

    .line 474
    new-instance v0, Lcom/appsflyer/internal/AFd1nSDK;

    .line 475
    .line 476
    invoke-direct {v0, v9, v10}, Lcom/appsflyer/internal/AFd1nSDK;-><init>(J)V

    .line 477
    .line 478
    .line 479
    new-instance v6, Ljava/lang/StringBuilder;

    .line 480
    .line 481
    const-string v7, "error: "

    .line 482
    .line 483
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    iget-wide v9, v0, Lcom/appsflyer/internal/AFd1nSDK;->registerClient:J

    .line 493
    .line 494
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 505
    .line 506
    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->HTTP_CLIENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 507
    .line 508
    new-instance v3, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v11

    .line 530
    const/4 v14, 0x0

    .line 531
    const/4 v15, 0x0

    .line 532
    const/4 v13, 0x0

    .line 533
    invoke-virtual/range {v9 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 534
    .line 535
    .line 536
    new-instance v1, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;

    .line 537
    .line 538
    invoke-direct {v1, v12, v0}, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;-><init>(Ljava/lang/Throwable;Lcom/appsflyer/internal/AFd1nSDK;)V

    .line 539
    .line 540
    .line 541
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 542
    :catchall_4
    move-exception v0

    .line 543
    if-eqz v8, :cond_c

    .line 544
    .line 545
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 546
    .line 547
    .line 548
    :cond_c
    throw v0
.end method
