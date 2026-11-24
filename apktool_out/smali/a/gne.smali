.class public final synthetic La/gne;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/uu9;
.implements La/k4r;
.implements La/zf60;
.implements La/rw3;
.implements La/xbf;
.implements La/zon0;
.implements La/d1x;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements La/izj;
.implements La/jgd;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gne;->a:B

    iput-object p1, p0, La/gne;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/p5d0;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/k8f;

    .line 4
    .line 5
    const-string v0, "FirebaseCrashlytics"

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v1, "Crashlytics native component now available."

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, La/k8f;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    invoke-interface {p1}, La/p5d0;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/k8f;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ii5;

    .line 4
    .line 5
    sget-object v0, La/ii5;->O1:La/gfk0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/ii5;->J0()La/dk5;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, La/dk5;->N()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 4
    .line 5
    check-cast p1, La/m1r;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object p1, La/d54;->R1:La/gfk0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p1, La/d54;

    .line 16
    .line 17
    invoke-direct {p1}, La/d54;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/d54;->S1:[La/iiy;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    aget-object v0, v0, v1

    .line 24
    .line 25
    iget-object v1, p1, La/d54;->P1:La/khf0;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public d(La/es;)La/vw3;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, La/gne;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/k8b;

    .line 8
    .line 9
    iget-object v2, v1, La/es;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/net/URL;

    .line 12
    .line 13
    const-string v3, "CctTransportBackend"

    .line 14
    .line 15
    invoke-static {v3}, La/m8x;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x4

    .line 20
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const-string v7, "Making request to: %s"

    .line 31
    .line 32
    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-static {v4, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 44
    .line 45
    const/16 v4, 0x7530

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 48
    .line 49
    .line 50
    const v4, 0x1fbd0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 54
    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 58
    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 62
    .line 63
    .line 64
    const-string v4, "POST"

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v4, "User-Agent"

    .line 70
    .line 71
    const-string v6, "datatransport/3.3.0 android/"

    .line 72
    .line 73
    invoke-virtual {v2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v4, "Content-Encoding"

    .line 77
    .line 78
    const-string v6, "gzip"

    .line 79
    .line 80
    invoke-virtual {v2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v7, "application/json"

    .line 84
    .line 85
    const-string v8, "Content-Type"

    .line 86
    .line 87
    invoke-virtual {v2, v8, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v7, "Accept-Encoding"

    .line 91
    .line 92
    invoke-virtual {v2, v7, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v7, v1, La/es;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v7, Ljava/lang/String;

    .line 98
    .line 99
    if-eqz v7, :cond_1

    .line 100
    .line 101
    const-string v9, "X-Goog-Api-Key"

    .line 102
    .line 103
    invoke-virtual {v2, v9, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    :try_start_0
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 107
    .line 108
    .line 109
    move-result-object v10
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch La/hwn; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :try_start_1
    new-instance v11, Ljava/util/zip/GZIPOutputStream;

    .line 111
    .line 112
    invoke-direct {v11, v10}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 113
    .line 114
    .line 115
    :try_start_2
    iget-object v0, v0, La/k8b;->a:La/g2v;

    .line 116
    .line 117
    iget-object v1, v1, La/es;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, La/n15;

    .line 120
    .line 121
    new-instance v13, Ljava/io/BufferedWriter;

    .line 122
    .line 123
    new-instance v12, Ljava/io/OutputStreamWriter;

    .line 124
    .line 125
    invoke-direct {v12, v11}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v13, v12}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 129
    .line 130
    .line 131
    new-instance v12, La/xdy;

    .line 132
    .line 133
    iget-object v0, v0, La/g2v;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/hcy;

    .line 136
    .line 137
    iget-object v14, v0, La/hcy;->a:Ljava/util/HashMap;

    .line 138
    .line 139
    iget-object v7, v0, La/hcy;->b:Ljava/util/HashMap;

    .line 140
    .line 141
    iget-object v9, v0, La/hcy;->c:La/ecy;

    .line 142
    .line 143
    iget-boolean v0, v0, La/hcy;->d:Z

    .line 144
    .line 145
    move/from16 v17, v0

    .line 146
    .line 147
    move-object v15, v7

    .line 148
    move-object/from16 v16, v9

    .line 149
    .line 150
    invoke-direct/range {v12 .. v17}, La/xdy;-><init>(Ljava/io/Writer;Ljava/util/HashMap;Ljava/util/HashMap;La/ecy;Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v1}, La/xdy;->h(Ljava/lang/Object;)La/xdy;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, La/xdy;->j()V

    .line 157
    .line 158
    .line 159
    iget-object v0, v12, La/xdy;->b:Landroid/util/JsonWriter;

    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/util/JsonWriter;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 162
    .line 163
    .line 164
    :try_start_3
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 165
    .line 166
    .line 167
    if-eqz v10, :cond_2

    .line 168
    .line 169
    :try_start_4
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/net/ConnectException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_2
    .catch La/hwn; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :catch_0
    move-exception v0

    .line 174
    goto/16 :goto_d

    .line 175
    .line 176
    :catch_1
    move-exception v0

    .line 177
    goto/16 :goto_d

    .line 178
    .line 179
    :catch_2
    move-exception v0

    .line 180
    :goto_0
    const-wide/16 v4, 0x0

    .line 181
    .line 182
    const/4 v6, 0x0

    .line 183
    goto/16 :goto_e

    .line 184
    .line 185
    :catch_3
    move-exception v0

    .line 186
    goto :goto_0

    .line 187
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-static {v3}, La/m8x;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-eqz v5, :cond_3

    .line 204
    .line 205
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    const-string v5, "Status Code: %d"

    .line 210
    .line 211
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {v7, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    :cond_3
    const-string v1, "Content-Type: %s"

    .line 219
    .line 220
    invoke-virtual {v2, v8}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-static {v5, v3, v1}, La/m8x;->N(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const-string v1, "Content-Encoding: %s"

    .line 228
    .line 229
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    invoke-static {v5, v3, v1}, La/m8x;->N(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const/16 v1, 0x12e

    .line 237
    .line 238
    if-eq v0, v1, :cond_b

    .line 239
    .line 240
    const/16 v1, 0x12d

    .line 241
    .line 242
    if-eq v0, v1, :cond_b

    .line 243
    .line 244
    const/16 v1, 0x133

    .line 245
    .line 246
    if-ne v0, v1, :cond_4

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_4
    const/16 v1, 0xc8

    .line 250
    .line 251
    if-eq v0, v1, :cond_5

    .line 252
    .line 253
    new-instance v1, La/vw3;

    .line 254
    .line 255
    const-wide/16 v2, 0x0

    .line 256
    .line 257
    const/4 v4, 0x0

    .line 258
    invoke-direct {v1, v0, v4, v2, v3}, La/vw3;-><init>(ILjava/net/URL;J)V

    .line 259
    .line 260
    .line 261
    return-object v1

    .line 262
    :cond_5
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    :try_start_5
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_6

    .line 275
    .line 276
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    .line 277
    .line 278
    invoke-direct {v2, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 279
    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_6
    move-object v2, v1

    .line 283
    :goto_2
    :try_start_6
    new-instance v3, Ljava/io/BufferedReader;

    .line 284
    .line 285
    new-instance v4, Ljava/io/InputStreamReader;

    .line 286
    .line 287
    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 288
    .line 289
    .line 290
    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v3}, La/j45;->a(Ljava/io/BufferedReader;)La/j45;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    iget-wide v3, v3, La/j45;->a:J

    .line 298
    .line 299
    new-instance v5, La/vw3;

    .line 300
    .line 301
    const/4 v6, 0x0

    .line 302
    invoke-direct {v5, v0, v6, v3, v4}, La/vw3;-><init>(ILjava/net/URL;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 303
    .line 304
    .line 305
    if-eqz v2, :cond_7

    .line 306
    .line 307
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 308
    .line 309
    .line 310
    goto :goto_3

    .line 311
    :catchall_0
    move-exception v0

    .line 312
    move-object v2, v0

    .line 313
    goto :goto_5

    .line 314
    :cond_7
    :goto_3
    if-eqz v1, :cond_8

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 317
    .line 318
    .line 319
    :cond_8
    return-object v5

    .line 320
    :catchall_1
    move-exception v0

    .line 321
    move-object v3, v0

    .line 322
    if-eqz v2, :cond_9

    .line 323
    .line 324
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :catchall_2
    move-exception v0

    .line 329
    :try_start_9
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    :cond_9
    :goto_4
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 333
    :goto_5
    if-eqz v1, :cond_a

    .line 334
    .line 335
    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 336
    .line 337
    .line 338
    goto :goto_6

    .line 339
    :catchall_3
    move-exception v0

    .line 340
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 341
    .line 342
    .line 343
    :cond_a
    :goto_6
    throw v2

    .line 344
    :cond_b
    :goto_7
    const-string v1, "Location"

    .line 345
    .line 346
    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    new-instance v2, La/vw3;

    .line 351
    .line 352
    new-instance v3, Ljava/net/URL;

    .line 353
    .line 354
    invoke-direct {v3, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    const-wide/16 v4, 0x0

    .line 358
    .line 359
    invoke-direct {v2, v0, v3, v4, v5}, La/vw3;-><init>(ILjava/net/URL;J)V

    .line 360
    .line 361
    .line 362
    return-object v2

    .line 363
    :catchall_4
    move-exception v0

    .line 364
    move-object v1, v0

    .line 365
    goto :goto_b

    .line 366
    :goto_8
    move-object v1, v0

    .line 367
    goto :goto_9

    .line 368
    :catchall_5
    move-exception v0

    .line 369
    goto :goto_8

    .line 370
    :goto_9
    :try_start_b
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 371
    .line 372
    .line 373
    goto :goto_a

    .line 374
    :catchall_6
    move-exception v0

    .line 375
    :try_start_c
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    :goto_a
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 379
    :goto_b
    if-eqz v10, :cond_c

    .line 380
    .line 381
    :try_start_d
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 382
    .line 383
    .line 384
    goto :goto_c

    .line 385
    :catchall_7
    move-exception v0

    .line 386
    :try_start_e
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    :cond_c
    :goto_c
    throw v1
    :try_end_e
    .catch Ljava/net/ConnectException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_e .. :try_end_e} :catch_2
    .catch La/hwn; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 390
    :goto_d
    const-string v1, "Couldn\'t encode request, returning with 400"

    .line 391
    .line 392
    invoke-static {v0, v3, v1}, La/m8x;->O(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    new-instance v0, La/vw3;

    .line 396
    .line 397
    const/16 v1, 0x190

    .line 398
    .line 399
    const-wide/16 v4, 0x0

    .line 400
    .line 401
    const/4 v6, 0x0

    .line 402
    invoke-direct {v0, v1, v6, v4, v5}, La/vw3;-><init>(ILjava/net/URL;J)V

    .line 403
    .line 404
    .line 405
    goto :goto_f

    .line 406
    :goto_e
    const-string v1, "Couldn\'t open connection, returning with 500"

    .line 407
    .line 408
    invoke-static {v0, v3, v1}, La/m8x;->O(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    new-instance v0, La/vw3;

    .line 412
    .line 413
    const/16 v1, 0x1f4

    .line 414
    .line 415
    invoke-direct {v0, v1, v6, v4, v5}, La/vw3;-><init>(ILjava/net/URL;J)V

    .line 416
    .line 417
    .line 418
    :goto_f
    return-object v0
.end method

.method public e(La/e1x;)V
    .locals 6

    .line 1
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/esg0;

    .line 4
    .line 5
    const-string v0, "Failed to acquire latest image"

    .line 6
    .line 7
    const-string v1, "OnImageAvailableListener: mCurrentRequest ID = "

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    :try_start_0
    invoke-interface {p1}, La/e1x;->b()La/b1x;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v3, "CaptureNode"

    .line 15
    .line 16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/dzb0;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    move-object v1, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget v1, v1, La/dzb0;->a:I

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ", image.isNull = "

    .line 40
    .line 41
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 v1, 0x0

    .line 49
    :goto_1
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v3, v1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0, p1}, La/esg0;->n0(La/b1x;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catch_0
    move-exception p1

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget-object p1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, La/dzb0;

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    iget p1, p1, La/dzb0;->a:I

    .line 74
    .line 75
    new-instance v1, La/ozw;

    .line 76
    .line 77
    invoke-direct {v1, v2, v0, v5}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    new-instance v3, La/n55;

    .line 81
    .line 82
    invoke-direct {v3, p1, v1}, La/n55;-><init>(ILa/ozw;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v3}, La/esg0;->x0(La/n55;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :goto_2
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, La/dzb0;

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    iget v1, v1, La/dzb0;->a:I

    .line 96
    .line 97
    new-instance v3, La/ozw;

    .line 98
    .line 99
    invoke-direct {v3, v2, v0, p1}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    new-instance p1, La/n55;

    .line 103
    .line 104
    invoke-direct {p1, v1, v3}, La/n55;-><init>(ILa/ozw;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/esg0;->x0(La/n55;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
.end method

.method public f(La/tu9;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/gne;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/j4a;

    .line 9
    .line 10
    iget-object v0, p0, La/j4a;->n:La/z1a;

    .line 11
    .line 12
    invoke-virtual {v0}, La/z1a;->f()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/j4a;->o:La/n0o0;

    .line 16
    .line 17
    invoke-virtual {v0}, La/n0o0;->a()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, La/j4a;->o:La/n0o0;

    .line 24
    .line 25
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/veg0;

    .line 30
    .line 31
    iget-object v1, v0, La/veg0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v1

    .line 34
    :try_start_0
    iget-object v2, v0, La/veg0;->b:La/teg0;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->disable()V

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, La/veg0;->c:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 42
    .line 43
    .line 44
    const/4 v2, -0x1

    .line 45
    iput v2, v0, La/veg0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit v1

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    monitor-exit v1

    .line 51
    throw p0

    .line 52
    :cond_0
    :goto_0
    iget-object v0, p0, La/j4a;->a:La/j2a;

    .line 53
    .line 54
    iget-object v1, v0, La/j2a;->a:Ljava/lang/Object;

    .line 55
    .line 56
    monitor-enter v1

    .line 57
    :try_start_1
    iget-object v2, v0, La/j2a;->b:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    iget-object v3, v0, La/j2a;->d:La/ig00;

    .line 64
    .line 65
    const/16 v4, 0x14

    .line 66
    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    if-nez v3, :cond_1

    .line 70
    .line 71
    :try_start_2
    sget-object v3, La/m3x;->c:La/m3x;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    move-exception p0

    .line 75
    goto :goto_4

    .line 76
    :cond_1
    :goto_1
    monitor-exit v1

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    if-nez v3, :cond_3

    .line 79
    .line 80
    new-instance v2, La/gne;

    .line 81
    .line 82
    invoke-direct {v2, v0, v4}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {v2}, La/y0x0;->I(La/uu9;)La/wu9;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iput-object v3, v0, La/j2a;->d:La/ig00;

    .line 90
    .line 91
    :cond_3
    iget-object v2, v0, La/j2a;->c:Ljava/util/HashSet;

    .line 92
    .line 93
    iget-object v5, v0, La/j2a;->b:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-interface {v2, v5}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 100
    .line 101
    .line 102
    iget-object v2, v0, La/j2a;->b:Ljava/util/LinkedHashMap;

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_4

    .line 117
    .line 118
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, La/s0a;

    .line 123
    .line 124
    invoke-interface {v5}, La/s0a;->release()La/ig00;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    new-instance v7, La/fy2;

    .line 129
    .line 130
    const/16 v8, 0x12

    .line 131
    .line 132
    invoke-direct {v7, v0, v5, v8}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-interface {v6, v7, v5}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    iget-object v0, v0, La/j2a;->b:Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 146
    .line 147
    .line 148
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    :goto_3
    new-instance v0, La/fy2;

    .line 150
    .line 151
    invoke-direct {v0, p0, p1, v4}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    iget-object p0, p0, La/j4a;->d:Ljava/util/concurrent/Executor;

    .line 155
    .line 156
    invoke-interface {v3, v0, p0}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 157
    .line 158
    .line 159
    const-string p0, "CameraX shutdownInternal"

    .line 160
    .line 161
    return-object p0

    .line 162
    :goto_4
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 163
    throw p0

    .line 164
    :sswitch_0
    check-cast p0, La/j2a;

    .line 165
    .line 166
    iget-object v0, p0, La/j2a;->a:Ljava/lang/Object;

    .line 167
    .line 168
    monitor-enter v0

    .line 169
    :try_start_4
    iput-object p1, p0, La/j2a;->e:La/tu9;

    .line 170
    .line 171
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 172
    const-string p0, "CameraRepository-deinit"

    .line 173
    .line 174
    return-object p0

    .line 175
    :catchall_2
    move-exception p0

    .line 176
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 177
    throw p0

    .line 178
    :sswitch_1
    check-cast p0, La/pby;

    .line 179
    .line 180
    const-string v0, "Job.asListenableFuture"

    .line 181
    .line 182
    new-instance v1, La/ejd;

    .line 183
    .line 184
    const/16 v2, 0xe

    .line 185
    .line 186
    invoke-direct {v1, p1, v2}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v1}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public g(ILa/k6z;)I
    .locals 2

    .line 1
    iget-byte v0, p0, La/gne;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/xx7;

    .line 10
    .line 11
    invoke-virtual {p0, v1, p1, p2}, La/xx7;->a(IILa/k6z;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :pswitch_0
    check-cast p0, La/yx7;

    .line 17
    .line 18
    invoke-virtual {p0, v1, p1}, La/yx7;->a(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/gne;->a:B

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    check-cast p0, La/xnb;

    .line 11
    .line 12
    sget-object p1, La/xnb;->w2:La/kj5;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/xnb;->S0()La/gob;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, La/gob;->y()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    check-cast p0, La/xra;

    .line 26
    .line 27
    sget-object v0, La/xra;->X1:La/cl5;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    if-lt p2, v1, :cond_0

    .line 35
    .line 36
    invoke-static {p1}, La/uq6;->l(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p2, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    if-nez p1, :cond_1

    .line 48
    .line 49
    sget-object p1, La/iun;->a:La/iun;

    .line 50
    .line 51
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, La/xra;->P0()La/k3t0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance p2, La/yf2;

    .line 62
    .line 63
    invoke-direct {p2, p1}, La/yf2;-><init>(Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void

    .line 70
    :pswitch_2
    check-cast p0, La/wq9;

    .line 71
    .line 72
    sget-object p1, La/wq9;->S1:La/gl5;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, La/wq9;->G0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object p1, La/lq9;->a:La/lq9;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_3
    check-cast p0, La/tv8;

    .line 88
    .line 89
    sget-object v0, La/tv8;->N1:La/yk5;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const-string v0, "BRAND_GAMES_SELECT_SORT_OPTION_REQUEST_KEY"

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-nez p2, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-nez p1, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    iget-object p0, p0, La/tv8;->M1:La/a8z;

    .line 111
    .line 112
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/k3t0;

    .line 117
    .line 118
    new-instance p2, La/kv8;

    .line 119
    .line 120
    invoke-direct {p2, p1}, La/kv8;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    return-void

    .line 127
    :pswitch_4
    check-cast p0, La/e68;

    .line 128
    .line 129
    sget-object p1, La/e68;->N1:La/cl5;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    const v0, -0x16582a8c

    .line 139
    .line 140
    .line 141
    if-eq p1, v0, :cond_5

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    const-string p1, "FINGERPRINT_REQUEST_KEY"

    .line 145
    .line 146
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_6

    .line 151
    .line 152
    invoke-virtual {p0}, La/e68;->H0()La/j68;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    sget-object p1, La/m2a;->e:La/m2a;

    .line 157
    .line 158
    invoke-virtual {p0, p1}, La/j68;->w(La/w58;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    :goto_2
    return-void

    .line 162
    :pswitch_5
    check-cast p0, La/t42;

    .line 163
    .line 164
    sget-object v0, La/t42;->p2:La/jdk0;

    .line 165
    .line 166
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    const-string v0, "DATE_PICKER_REQUEST_KEY"

    .line 170
    .line 171
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-nez p2, :cond_7

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    const-string p2, "BUNDLE_RESULT_CANCELED"

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_8

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_8
    const-string p2, "BUNDLE_RESULT_START_TIME_SEC"

    .line 188
    .line 189
    const-wide/16 v0, 0x0

    .line 190
    .line 191
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 192
    .line 193
    .line 194
    move-result-wide v2

    .line 195
    const-string p2, "BUNDLE_RESULT_END_TIME_SEC"

    .line 196
    .line 197
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 198
    .line 199
    .line 200
    move-result-wide p1

    .line 201
    invoke-virtual {p0}, La/t42;->Q0()La/k3t0;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    new-instance v0, La/l42;

    .line 206
    .line 207
    invoke-direct {v0, v2, v3, p1, p2}, La/l42;-><init>(JJ)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :goto_3
    return-void

    .line 214
    :pswitch_6
    check-cast p0, La/ty1;

    .line 215
    .line 216
    sget-object v0, La/ty1;->R1:La/rek0;

    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 222
    .line 223
    const/4 v0, 0x0

    .line 224
    if-lt p2, v1, :cond_9

    .line 225
    .line 226
    invoke-static {p1}, La/e4e0;->q(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    goto :goto_4

    .line 231
    :cond_9
    const-string p2, "RESULT_TOURNAMENT_PAGE"

    .line 232
    .line 233
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    instance-of p2, p1, La/s9s0;

    .line 238
    .line 239
    if-nez p2, :cond_a

    .line 240
    .line 241
    move-object p1, v0

    .line 242
    :cond_a
    check-cast p1, La/s9s0;

    .line 243
    .line 244
    :goto_4
    instance-of p2, p1, La/s9s0;

    .line 245
    .line 246
    if-eqz p2, :cond_b

    .line 247
    .line 248
    move-object v0, p1

    .line 249
    check-cast v0, La/s9s0;

    .line 250
    .line 251
    :cond_b
    if-eqz v0, :cond_c

    .line 252
    .line 253
    invoke-virtual {p0}, La/ty1;->G0()La/k3t0;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    new-instance p1, La/nx1;

    .line 258
    .line 259
    invoke-direct {p1, v0}, La/nx1;-><init>(La/s9s0;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_c
    return-void

    .line 266
    :pswitch_7
    check-cast p0, La/on1;

    .line 267
    .line 268
    sget-object p1, La/on1;->S1:La/hfk0;

    .line 269
    .line 270
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, La/on1;->G0()La/k3t0;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    sget-object p1, La/cn1;->a:La/cn1;

    .line 278
    .line 279
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :pswitch_8
    check-cast p0, La/dm0;

    .line 284
    .line 285
    sget-object p1, La/dm0;->S1:La/pek0;

    .line 286
    .line 287
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0}, La/dm0;->G0()La/k3t0;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    sget-object p1, La/il0;->a:La/il0;

    .line 295
    .line 296
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_9
    check-cast p0, La/yi90;

    .line 301
    .line 302
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    const-string v0, "SELECT_PHONE_ACTION_DIALOG_KEY"

    .line 306
    .line 307
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result p2

    .line 311
    if-nez p2, :cond_d

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_d
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    if-eqz p1, :cond_e

    .line 319
    .line 320
    check-cast p1, Ljava/io/Serializable;

    .line 321
    .line 322
    invoke-virtual {p0, p1}, La/yi90;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_e
    invoke-static {}, La/e9d0;->o()V

    .line 327
    .line 328
    .line 329
    :goto_5
    return-void

    .line 330
    :pswitch_a
    check-cast p0, La/t9;

    .line 331
    .line 332
    sget-object p1, La/t9;->P1:La/gfk0;

    .line 333
    .line 334
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, La/t9;->H0()La/ab;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-virtual {p0}, La/ab;->y()V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_b
    check-cast p0, La/f9;

    .line 346
    .line 347
    sget-object p1, La/f9;->P1:La/rek0;

    .line 348
    .line 349
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-virtual {p0}, La/f9;->H0()La/ab;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    invoke-virtual {p0}, La/ab;->y()V

    .line 357
    .line 358
    .line 359
    return-void

    .line 360
    :pswitch_c
    check-cast p0, La/y8;

    .line 361
    .line 362
    sget-object p1, La/y8;->P1:La/qek0;

    .line 363
    .line 364
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-virtual {p0}, La/y8;->H0()La/ab;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    invoke-virtual {p0}, La/ab;->y()V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :pswitch_d
    check-cast p0, La/l8;

    .line 376
    .line 377
    sget-object p1, La/l8;->P1:La/pek0;

    .line 378
    .line 379
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual {p0}, La/l8;->H0()La/ab;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    invoke-virtual {p0}, La/ab;->y()V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    nop

    .line 391
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 4

    .line 1
    iget-byte v0, p0, La/gne;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/yx5;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, La/yx5;->y0()La/jnm0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, p2}, La/knm0;->o(La/jnm0;La/xiv0;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/4 v0, 0x0

    .line 26
    const/16 v1, 0xd

    .line 27
    .line 28
    invoke-static {p0, v0, v1, p1}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-object p2

    .line 32
    :pswitch_0
    check-cast p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 33
    .line 34
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p1, p2, La/xiv0;->a:La/uiv0;

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    invoke-virtual {p1, v0}, La/uiv0;->i(I)La/pfx;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget v0, v0, La/pfx;->d:I

    .line 47
    .line 48
    const/16 v1, 0x8

    .line 49
    .line 50
    invoke-virtual {p1, v1}, La/uiv0;->i(I)La/pfx;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget v2, v2, La/pfx;->d:I

    .line 55
    .line 56
    invoke-virtual {p1, v1}, La/uiv0;->u(I)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->f1:La/vfx;

    .line 61
    .line 62
    if-eqz p0, :cond_1

    .line 63
    .line 64
    iget-object p0, p0, La/vfx;->a:La/p7m0;

    .line 65
    .line 66
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v3, v1

    .line 71
    check-cast v3, La/cgx;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v3, La/cgx;

    .line 77
    .line 78
    invoke-direct {v3, v0, v2, p1}, La/cgx;-><init>(IIZ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    return-object p2

    .line 88
    :cond_1
    const-string p0, "insetsHolder"

    .line 89
    .line 90
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    throw p0

    .line 95
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    .line 1
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/qrd;

    .line 4
    .line 5
    check-cast p1, La/mrd;

    .line 6
    .line 7
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public x0(La/pzu;)Ljava/lang/Object;
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, La/gne;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;

    .line 8
    .line 9
    sget v2, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->d:I

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    const-class v4, La/nfq;

    .line 16
    .line 17
    invoke-virtual {v1, v4}, La/pzu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    move-object v6, v4

    .line 22
    check-cast v6, La/nfq;

    .line 23
    .line 24
    const-class v4, La/dgq;

    .line 25
    .line 26
    invoke-virtual {v1, v4}, La/pzu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, La/dgq;

    .line 31
    .line 32
    const-class v5, La/k8f;

    .line 33
    .line 34
    invoke-virtual {v1, v5}, La/pzu;->H(Ljava/lang/Class;)La/y680;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-class v7, La/vp2;

    .line 39
    .line 40
    invoke-virtual {v1, v7}, La/pzu;->H(Ljava/lang/Class;)La/y680;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const-class v8, La/bhq;

    .line 45
    .line 46
    invoke-virtual {v1, v8}, La/pzu;->H(Ljava/lang/Class;)La/y680;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    iget-object v9, v0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:La/jkd0;

    .line 51
    .line 52
    invoke-virtual {v1, v9}, La/pzu;->e(La/jkd0;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    check-cast v9, Ljava/util/concurrent/ExecutorService;

    .line 57
    .line 58
    iget-object v10, v0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:La/jkd0;

    .line 59
    .line 60
    invoke-virtual {v1, v10}, La/pzu;->e(La/jkd0;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    check-cast v10, Ljava/util/concurrent/ExecutorService;

    .line 65
    .line 66
    iget-object v0, v0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:La/jkd0;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, La/pzu;->e(La/jkd0;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 73
    .line 74
    const-string v1, ""

    .line 75
    .line 76
    const-string v11, "FirebaseCrashlytics"

    .line 77
    .line 78
    invoke-virtual {v6}, La/nfq;->a()V

    .line 79
    .line 80
    .line 81
    iget-object v12, v6, La/nfq;->a:Landroid/content/Context;

    .line 82
    .line 83
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    new-instance v14, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v15, "Initializing Firebase Crashlytics 20.1.1 for "

    .line 90
    .line 91
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    const/4 v15, 0x0

    .line 102
    invoke-static {v11, v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 103
    .line 104
    .line 105
    move-object v14, v15

    .line 106
    new-instance v15, La/cu;

    .line 107
    .line 108
    invoke-direct {v15, v9, v10}, La/cu;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V

    .line 109
    .line 110
    .line 111
    new-instance v9, La/xzp;

    .line 112
    .line 113
    invoke-direct {v9, v12}, La/xzp;-><init>(Landroid/content/Context;)V

    .line 114
    .line 115
    .line 116
    new-instance v10, La/qaj;

    .line 117
    .line 118
    invoke-direct {v10, v6}, La/qaj;-><init>(La/nfq;)V

    .line 119
    .line 120
    .line 121
    new-instance v14, La/hxw;

    .line 122
    .line 123
    invoke-direct {v14, v12, v13, v4, v10}, La/hxw;-><init>(Landroid/content/Context;Ljava/lang/String;La/dgq;La/qaj;)V

    .line 124
    .line 125
    .line 126
    new-instance v4, La/k8f;

    .line 127
    .line 128
    invoke-direct {v4, v5}, La/k8f;-><init>(La/y680;)V

    .line 129
    .line 130
    .line 131
    new-instance v5, La/yp2;

    .line 132
    .line 133
    invoke-direct {v5, v7}, La/yp2;-><init>(La/y680;)V

    .line 134
    .line 135
    .line 136
    new-instance v13, La/a8f;

    .line 137
    .line 138
    invoke-direct {v13, v10, v9}, La/a8f;-><init>(La/qaj;La/xzp;)V

    .line 139
    .line 140
    .line 141
    sget-object v7, La/nhq;->a:La/nhq;

    .line 142
    .line 143
    const-string v7, "Subscriber "

    .line 144
    .line 145
    move-wide/from16 v26, v2

    .line 146
    .line 147
    const-string v2, "FirebaseSessions"

    .line 148
    .line 149
    sget-object v3, La/jki0;->a:La/jki0;

    .line 150
    .line 151
    sget-object v16, La/nhq;->a:La/nhq;

    .line 152
    .line 153
    move-object/from16 p1, v4

    .line 154
    .line 155
    invoke-static {v3}, La/nhq;->a(La/jki0;)La/lhq;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    move-object/from16 v16, v6

    .line 160
    .line 161
    iget-object v6, v4, La/lhq;->b:La/a8f;

    .line 162
    .line 163
    if-eqz v6, :cond_0

    .line 164
    .line 165
    new-instance v4, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v3, " already registered."

    .line 174
    .line 175
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    :goto_0
    move-object/from16 v21, v14

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_0
    iput-object v13, v4, La/lhq;->b:La/a8f;

    .line 189
    .line 190
    new-instance v6, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v3, " registered."

    .line 199
    .line 200
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    iget-object v2, v4, La/lhq;->a:Ljava/util/concurrent/CountDownLatch;

    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 213
    .line 214
    .line 215
    goto :goto_0

    .line 216
    :goto_1
    new-instance v14, La/nr00;

    .line 217
    .line 218
    invoke-direct {v14, v8}, La/nr00;-><init>(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    new-instance v2, La/j8f;

    .line 222
    .line 223
    move-object/from16 v19, v10

    .line 224
    .line 225
    new-instance v10, La/xp2;

    .line 226
    .line 227
    invoke-direct {v10, v5}, La/xp2;-><init>(La/yp2;)V

    .line 228
    .line 229
    .line 230
    move-object v3, v11

    .line 231
    new-instance v11, La/xp2;

    .line 232
    .line 233
    invoke-direct {v11, v5}, La/xp2;-><init>(La/yp2;)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v8, p1

    .line 237
    .line 238
    move-object v5, v2

    .line 239
    move-object v4, v12

    .line 240
    move-object/from16 v6, v16

    .line 241
    .line 242
    move-object/from16 v7, v21

    .line 243
    .line 244
    const/4 v2, 0x0

    .line 245
    move-object v12, v9

    .line 246
    move-object/from16 v9, v19

    .line 247
    .line 248
    invoke-direct/range {v5 .. v15}, La/j8f;-><init>(La/nfq;La/hxw;La/k8f;La/qaj;La/xp2;La/xp2;La/xzp;La/a8f;La/nr00;La/cu;)V

    .line 249
    .line 250
    .line 251
    move-object v7, v5

    .line 252
    move-object v5, v15

    .line 253
    iget-object v8, v7, La/j8f;->o:La/cu;

    .line 254
    .line 255
    invoke-virtual {v6}, La/nfq;->a()V

    .line 256
    .line 257
    .line 258
    iget-object v6, v6, La/nfq;->c:La/mgq;

    .line 259
    .line 260
    iget-object v6, v6, La/mgq;->b:Ljava/lang/String;

    .line 261
    .line 262
    const-string v10, "com.google.firebase.crashlytics.mapping_file_id"

    .line 263
    .line 264
    const-string v11, "string"

    .line 265
    .line 266
    invoke-static {v4, v10, v11}, La/aad;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-nez v10, :cond_1

    .line 271
    .line 272
    const-string v10, "com.crashlytics.android.build_id"

    .line 273
    .line 274
    invoke-static {v4, v10, v11}, La/aad;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    :cond_1
    if-eqz v10, :cond_2

    .line 279
    .line 280
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    invoke-virtual {v11, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v15

    .line 288
    goto :goto_2

    .line 289
    :cond_2
    move-object v15, v2

    .line 290
    :goto_2
    new-instance v10, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    const-string v11, "com.google.firebase.crashlytics.build_ids_lib"

    .line 296
    .line 297
    const-string v13, "array"

    .line 298
    .line 299
    invoke-static {v4, v11, v13}, La/aad;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    const-string v14, "com.google.firebase.crashlytics.build_ids_arch"

    .line 304
    .line 305
    invoke-static {v4, v14, v13}, La/aad;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 306
    .line 307
    .line 308
    move-result v14

    .line 309
    const-string v2, "com.google.firebase.crashlytics.build_ids_build_id"

    .line 310
    .line 311
    invoke-static {v4, v2, v13}, La/aad;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-eqz v11, :cond_3

    .line 316
    .line 317
    if-eqz v14, :cond_3

    .line 318
    .line 319
    if-nez v2, :cond_4

    .line 320
    .line 321
    :cond_3
    move-object/from16 v29, v6

    .line 322
    .line 323
    move-object/from16 v39, v8

    .line 324
    .line 325
    move-object/from16 v38, v9

    .line 326
    .line 327
    goto/16 :goto_6

    .line 328
    .line 329
    :cond_4
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    invoke-virtual {v13, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 338
    .line 339
    .line 340
    move-result-object v13

    .line 341
    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v13

    .line 345
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 346
    .line 347
    .line 348
    move-result-object v14

    .line 349
    invoke-virtual {v14, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    array-length v14, v11

    .line 354
    move-object/from16 v29, v6

    .line 355
    .line 356
    array-length v6, v2

    .line 357
    if-ne v14, v6, :cond_5

    .line 358
    .line 359
    array-length v6, v13

    .line 360
    array-length v14, v2

    .line 361
    if-eq v6, v14, :cond_6

    .line 362
    .line 363
    :cond_5
    move-object/from16 v39, v8

    .line 364
    .line 365
    move-object/from16 v38, v9

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_6
    const/4 v6, 0x0

    .line 369
    :goto_3
    array-length v14, v2

    .line 370
    if-ge v6, v14, :cond_7

    .line 371
    .line 372
    new-instance v14, La/cb9;

    .line 373
    .line 374
    move/from16 v16, v6

    .line 375
    .line 376
    aget-object v6, v11, v16

    .line 377
    .line 378
    move-object/from16 v38, v9

    .line 379
    .line 380
    aget-object v9, v13, v16

    .line 381
    .line 382
    move-object/from16 v39, v8

    .line 383
    .line 384
    aget-object v8, v2, v16

    .line 385
    .line 386
    invoke-direct {v14, v6, v9, v8}, La/cb9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    add-int/lit8 v6, v16, 0x1

    .line 393
    .line 394
    move-object/from16 v9, v38

    .line 395
    .line 396
    move-object/from16 v8, v39

    .line 397
    .line 398
    goto :goto_3

    .line 399
    :cond_7
    move-object/from16 v39, v8

    .line 400
    .line 401
    move-object/from16 v38, v9

    .line 402
    .line 403
    :cond_8
    :goto_4
    const/4 v6, 0x3

    .line 404
    :cond_9
    const/4 v14, 0x0

    .line 405
    goto :goto_7

    .line 406
    :goto_5
    const-string v6, "Lengths did not match: %d %d %d"

    .line 407
    .line 408
    array-length v8, v11

    .line 409
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    array-length v9, v13

    .line 414
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    array-length v2, v2

    .line 419
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    filled-new-array {v8, v9, v2}, [Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-static {v6, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/4 v6, 0x3

    .line 432
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    if-eqz v8, :cond_8

    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    invoke-static {v3, v2, v14}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 440
    .line 441
    .line 442
    goto :goto_4

    .line 443
    :goto_6
    const-string v6, "Could not find resources: %d %d %d"

    .line 444
    .line 445
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 446
    .line 447
    .line 448
    move-result-object v8

    .line 449
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    filled-new-array {v8, v9, v2}, [Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-static {v6, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const/4 v6, 0x3

    .line 466
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 467
    .line 468
    .line 469
    move-result v8

    .line 470
    if-eqz v8, :cond_9

    .line 471
    .line 472
    const/4 v14, 0x0

    .line 473
    invoke-static {v3, v2, v14}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 474
    .line 475
    .line 476
    :goto_7
    const-string v2, "Mapping file ID is: "

    .line 477
    .line 478
    invoke-static {v2, v15}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 483
    .line 484
    .line 485
    move-result v8

    .line 486
    if-eqz v8, :cond_a

    .line 487
    .line 488
    invoke-static {v3, v2, v14}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 489
    .line 490
    .line 491
    :cond_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    :cond_b
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    if-eqz v6, :cond_c

    .line 500
    .line 501
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    check-cast v6, La/cb9;

    .line 506
    .line 507
    iget-object v8, v6, La/cb9;->a:Ljava/lang/String;

    .line 508
    .line 509
    iget-object v9, v6, La/cb9;->b:Ljava/lang/String;

    .line 510
    .line 511
    iget-object v6, v6, La/cb9;->c:Ljava/lang/String;

    .line 512
    .line 513
    const-string v11, "Build id for "

    .line 514
    .line 515
    const-string v13, " on "

    .line 516
    .line 517
    const-string v14, ": "

    .line 518
    .line 519
    invoke-static {v11, v8, v13, v9, v14}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    move-result-object v8

    .line 523
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v6

    .line 530
    const/4 v8, 0x3

    .line 531
    invoke-static {v3, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 532
    .line 533
    .line 534
    move-result v9

    .line 535
    if-eqz v9, :cond_b

    .line 536
    .line 537
    const/4 v14, 0x0

    .line 538
    invoke-static {v3, v6, v14}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 539
    .line 540
    .line 541
    goto :goto_8

    .line 542
    :cond_c
    const/4 v8, 0x3

    .line 543
    new-instance v2, La/fhj;

    .line 544
    .line 545
    const/4 v6, 0x4

    .line 546
    invoke-direct {v2, v4, v6}, La/fhj;-><init>(Landroid/content/Context;B)V

    .line 547
    .line 548
    .line 549
    :try_start_0
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    invoke-virtual/range {v21 .. v21}, La/hxw;->d()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v32

    .line 557
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 558
    .line 559
    .line 560
    move-result-object v11

    .line 561
    const/4 v13, 0x0

    .line 562
    invoke-virtual {v11, v9, v13}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 563
    .line 564
    .line 565
    move-result-object v11

    .line 566
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 567
    .line 568
    const/16 v8, 0x1c

    .line 569
    .line 570
    if-lt v14, v8, :cond_d

    .line 571
    .line 572
    invoke-static {v11}, Lcom/appsflyer/internal/b0;->a(Landroid/content/pm/PackageInfo;)J

    .line 573
    .line 574
    .line 575
    move-result-wide v16

    .line 576
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    :goto_9
    move-object/from16 v34, v8

    .line 581
    .line 582
    goto :goto_a

    .line 583
    :cond_d
    iget v8, v11, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 584
    .line 585
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v8

    .line 589
    goto :goto_9

    .line 590
    :goto_a
    iget-object v8, v11, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 591
    .line 592
    if-nez v8, :cond_e

    .line 593
    .line 594
    const-string v8, "0.0"

    .line 595
    .line 596
    :cond_e
    move-object/from16 v35, v8

    .line 597
    .line 598
    new-instance v46, La/rrd;

    .line 599
    .line 600
    const/16 v37, 0x1

    .line 601
    .line 602
    move-object/from16 v36, v2

    .line 603
    .line 604
    move-object/from16 v33, v9

    .line 605
    .line 606
    move-object/from16 v31, v10

    .line 607
    .line 608
    move-object/from16 v30, v15

    .line 609
    .line 610
    move-object/from16 v28, v46

    .line 611
    .line 612
    invoke-direct/range {v28 .. v37}, La/rrd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 613
    .line 614
    .line 615
    move-object/from16 v11, v28

    .line 616
    .line 617
    move-object/from16 v2, v29

    .line 618
    .line 619
    move-object/from16 v8, v32

    .line 620
    .line 621
    move-object/from16 v9, v34

    .line 622
    .line 623
    move-object/from16 v10, v35

    .line 624
    .line 625
    const-string v14, "Installer package name is: "

    .line 626
    .line 627
    invoke-static {v14, v8}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v8

    .line 631
    const/4 v14, 0x2

    .line 632
    invoke-static {v3, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 633
    .line 634
    .line 635
    move-result v15

    .line 636
    if-eqz v15, :cond_f

    .line 637
    .line 638
    const/4 v15, 0x0

    .line 639
    invoke-static {v3, v8, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 640
    .line 641
    .line 642
    :cond_f
    new-instance v8, La/art;

    .line 643
    .line 644
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v21 .. v21}, La/hxw;->d()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v15

    .line 651
    move-object/from16 v16, v15

    .line 652
    .line 653
    new-instance v15, La/j6m0;

    .line 654
    .line 655
    const/16 v13, 0xa

    .line 656
    .line 657
    invoke-direct {v15, v13}, La/j6m0;-><init>(B)V

    .line 658
    .line 659
    .line 660
    new-instance v13, La/dpi0;

    .line 661
    .line 662
    invoke-direct {v13, v15}, La/dpi0;-><init>(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    new-instance v14, La/do20;

    .line 666
    .line 667
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 668
    .line 669
    .line 670
    const-string v6, "com.crashlytics.settings.json"

    .line 671
    .line 672
    move-object/from16 v29, v13

    .line 673
    .line 674
    new-instance v13, Ljava/io/File;

    .line 675
    .line 676
    iget-object v12, v12, La/xzp;->c:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v12, Ljava/io/File;

    .line 679
    .line 680
    invoke-direct {v13, v12, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    iput-object v13, v14, La/do20;->a:Ljava/lang/Object;

    .line 684
    .line 685
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 686
    .line 687
    const-string v6, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/"

    .line 688
    .line 689
    const-string v12, "/settings"

    .line 690
    .line 691
    invoke-static {v6, v2, v12}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    new-instance v12, La/fhn;

    .line 696
    .line 697
    invoke-direct {v12, v6, v8}, La/fhn;-><init>(Ljava/lang/String;La/art;)V

    .line 698
    .line 699
    .line 700
    sget-object v6, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 701
    .line 702
    sget-object v8, La/hxw;->h:Ljava/lang/String;

    .line 703
    .line 704
    const-string v13, ""

    .line 705
    .line 706
    invoke-virtual {v6, v8, v13}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v6

    .line 710
    sget-object v13, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 711
    .line 712
    move-object/from16 v30, v12

    .line 713
    .line 714
    const-string v12, ""

    .line 715
    .line 716
    invoke-virtual {v13, v8, v12}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v12

    .line 720
    const-string v13, "/"

    .line 721
    .line 722
    invoke-static {v6, v13, v12}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v18

    .line 726
    sget-object v6, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 727
    .line 728
    const-string v12, ""

    .line 729
    .line 730
    invoke-virtual {v6, v8, v12}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v19

    .line 734
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 735
    .line 736
    const-string v12, ""

    .line 737
    .line 738
    invoke-virtual {v6, v8, v12}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v20

    .line 742
    const-string v6, "com.google.firebase.crashlytics.mapping_file_id"

    .line 743
    .line 744
    const-string v8, "string"

    .line 745
    .line 746
    invoke-static {v4, v6, v8}, La/aad;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 747
    .line 748
    .line 749
    move-result v6

    .line 750
    if-nez v6, :cond_10

    .line 751
    .line 752
    const-string v6, "com.crashlytics.android.build_id"

    .line 753
    .line 754
    invoke-static {v4, v6, v8}, La/aad;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 755
    .line 756
    .line 757
    move-result v6

    .line 758
    :cond_10
    if-eqz v6, :cond_11

    .line 759
    .line 760
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 761
    .line 762
    .line 763
    move-result-object v8

    .line 764
    invoke-virtual {v8, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v6

    .line 768
    goto :goto_b

    .line 769
    :cond_11
    const/4 v6, 0x0

    .line 770
    :goto_b
    filled-new-array {v6, v2, v10, v9}, [Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v6

    .line 774
    new-instance v8, Ljava/util/ArrayList;

    .line 775
    .line 776
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 777
    .line 778
    .line 779
    const/4 v12, 0x0

    .line 780
    :goto_c
    const/4 v13, 0x4

    .line 781
    if-ge v12, v13, :cond_13

    .line 782
    .line 783
    aget-object v13, v6, v12

    .line 784
    .line 785
    move-object/from16 v22, v2

    .line 786
    .line 787
    if-eqz v13, :cond_12

    .line 788
    .line 789
    const-string v2, "-"

    .line 790
    .line 791
    invoke-virtual {v13, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 796
    .line 797
    invoke-virtual {v2, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    :cond_12
    add-int/lit8 v12, v12, 0x1

    .line 805
    .line 806
    move-object/from16 v2, v22

    .line 807
    .line 808
    goto :goto_c

    .line 809
    :cond_13
    move-object/from16 v22, v2

    .line 810
    .line 811
    invoke-static {v8}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 812
    .line 813
    .line 814
    new-instance v2, Ljava/lang/StringBuilder;

    .line 815
    .line 816
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 820
    .line 821
    .line 822
    move-result-object v6

    .line 823
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 824
    .line 825
    .line 826
    move-result v8

    .line 827
    if-eqz v8, :cond_14

    .line 828
    .line 829
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v8

    .line 833
    check-cast v8, Ljava/lang/String;

    .line 834
    .line 835
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    goto :goto_d

    .line 839
    :cond_14
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 844
    .line 845
    .line 846
    move-result v6

    .line 847
    if-lez v6, :cond_15

    .line 848
    .line 849
    invoke-static {v2}, La/aad;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    move-object/from16 v54, v22

    .line 854
    .line 855
    move-object/from16 v22, v2

    .line 856
    .line 857
    move-object/from16 v2, v54

    .line 858
    .line 859
    goto :goto_e

    .line 860
    :cond_15
    move-object/from16 v2, v22

    .line 861
    .line 862
    const/16 v22, 0x0

    .line 863
    .line 864
    :goto_e
    const/4 v6, 0x1

    .line 865
    if-eqz v16, :cond_16

    .line 866
    .line 867
    const/16 v17, 0x4

    .line 868
    .line 869
    goto :goto_f

    .line 870
    :cond_16
    move/from16 v17, v6

    .line 871
    .line 872
    :goto_f
    invoke-static/range {v17 .. v17}, La/b1j;->b(I)B

    .line 873
    .line 874
    .line 875
    move-result v25

    .line 876
    new-instance v16, La/z6j0;

    .line 877
    .line 878
    move-object/from16 v17, v2

    .line 879
    .line 880
    move-object/from16 v24, v9

    .line 881
    .line 882
    move-object/from16 v23, v10

    .line 883
    .line 884
    invoke-direct/range {v16 .. v25}, La/z6j0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/hxw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 885
    .line 886
    .line 887
    new-instance v47, La/sd60;

    .line 888
    .line 889
    move-object v13, v4

    .line 890
    move-object/from16 v17, v14

    .line 891
    .line 892
    move-object/from16 v14, v16

    .line 893
    .line 894
    move-object/from16 v16, v29

    .line 895
    .line 896
    move-object/from16 v18, v30

    .line 897
    .line 898
    move-object/from16 v19, v38

    .line 899
    .line 900
    move-object/from16 v12, v47

    .line 901
    .line 902
    const/4 v2, 0x0

    .line 903
    const/4 v4, 0x2

    .line 904
    const/4 v8, 0x3

    .line 905
    invoke-direct/range {v12 .. v19}, La/sd60;-><init>(Landroid/content/Context;La/z6j0;La/j6m0;La/dpi0;La/do20;La/fhn;La/qaj;)V

    .line 906
    .line 907
    .line 908
    iget-object v9, v12, La/sd60;->i:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v9, Ljava/util/concurrent/atomic/AtomicReference;

    .line 911
    .line 912
    iget-object v10, v12, La/sd60;->h:Ljava/lang/Object;

    .line 913
    .line 914
    check-cast v10, Ljava/util/concurrent/atomic/AtomicReference;

    .line 915
    .line 916
    iget-object v13, v12, La/sd60;->b:Ljava/lang/Object;

    .line 917
    .line 918
    check-cast v13, Landroid/content/Context;

    .line 919
    .line 920
    const-string v14, "com.google.firebase.crashlytics"

    .line 921
    .line 922
    invoke-virtual {v13, v14, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 923
    .line 924
    .line 925
    move-result-object v13

    .line 926
    const-string v14, "existing_instance_identifier"

    .line 927
    .line 928
    invoke-interface {v13, v14, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    iget-object v13, v12, La/sd60;->c:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast v13, La/z6j0;

    .line 935
    .line 936
    iget-object v13, v13, La/z6j0;->f:Ljava/lang/String;

    .line 937
    .line 938
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v1

    .line 942
    if-eqz v1, :cond_17

    .line 943
    .line 944
    invoke-virtual {v12, v6}, La/sd60;->c(I)La/lwi0;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    if-eqz v1, :cond_17

    .line 949
    .line 950
    invoke-virtual {v10, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v5

    .line 957
    check-cast v5, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 958
    .line 959
    invoke-virtual {v5, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    const/4 v14, 0x0

    .line 963
    invoke-static {v14}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 964
    .line 965
    .line 966
    move-result-object v1

    .line 967
    goto :goto_10

    .line 968
    :cond_17
    invoke-virtual {v12, v8}, La/sd60;->c(I)La/lwi0;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    if-eqz v1, :cond_18

    .line 973
    .line 974
    invoke-virtual {v10, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v9

    .line 981
    check-cast v9, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 982
    .line 983
    invoke-virtual {v9, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    :cond_18
    iget-object v1, v12, La/sd60;->g:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v1, La/qaj;

    .line 989
    .line 990
    iget-object v9, v1, La/qaj;->e:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v9, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 993
    .line 994
    invoke-virtual {v9}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 995
    .line 996
    .line 997
    move-result-object v9

    .line 998
    iget-object v10, v1, La/qaj;->b:Ljava/lang/Object;

    .line 999
    .line 1000
    monitor-enter v10

    .line 1001
    :try_start_1
    iget-object v1, v1, La/qaj;->d:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1004
    .line 1005
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1010
    invoke-static {v9, v1}, La/q8a;->r0(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    iget-object v9, v5, La/cu;->b:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v9, La/aaf;

    .line 1017
    .line 1018
    new-instance v10, La/g090;

    .line 1019
    .line 1020
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 1021
    .line 1022
    .line 1023
    iput-object v12, v10, La/g090;->b:Ljava/lang/Object;

    .line 1024
    .line 1025
    iput-object v5, v10, La/g090;->a:Ljava/lang/Object;

    .line 1026
    .line 1027
    invoke-virtual {v1, v9, v10}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    :goto_10
    new-instance v5, La/udk;

    .line 1032
    .line 1033
    const/16 v9, 0x17

    .line 1034
    .line 1035
    invoke-direct {v5, v9}, La/udk;-><init>(B)V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v1, v0, v5}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 1039
    .line 1040
    .line 1041
    iget-object v0, v7, La/j8f;->i:La/xzp;

    .line 1042
    .line 1043
    const-string v1, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    .line 1044
    .line 1045
    iget-object v5, v7, La/j8f;->a:Landroid/content/Context;

    .line 1046
    .line 1047
    const-string v9, "com.google.firebase.crashlytics.RequireBuildId"

    .line 1048
    .line 1049
    const-string v10, "com.crashlytics.RequireBuildId"

    .line 1050
    .line 1051
    invoke-static {v5, v10, v6}, La/aad;->L(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v10

    .line 1055
    invoke-static {v5, v9, v10}, La/aad;->L(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v9

    .line 1059
    iget-object v10, v11, La/rrd;->c:Ljava/lang/Object;

    .line 1060
    .line 1061
    check-cast v10, Ljava/lang/String;

    .line 1062
    .line 1063
    const-string v13, "."

    .line 1064
    .line 1065
    const-string v14, ".     |  |"

    .line 1066
    .line 1067
    if-nez v9, :cond_19

    .line 1068
    .line 1069
    const-string v1, "Configured not to require a build ID."

    .line 1070
    .line 1071
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v9

    .line 1075
    if-eqz v9, :cond_1a

    .line 1076
    .line 1077
    const/4 v14, 0x0

    .line 1078
    invoke-static {v3, v1, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1079
    .line 1080
    .line 1081
    goto :goto_11

    .line 1082
    :cond_19
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v9

    .line 1086
    if-nez v9, :cond_20

    .line 1087
    .line 1088
    :cond_1a
    :goto_11
    new-instance v1, La/dh9;

    .line 1089
    .line 1090
    invoke-direct {v1}, La/dh9;-><init>()V

    .line 1091
    .line 1092
    .line 1093
    iget-object v1, v1, La/dh9;->a:Ljava/lang/String;

    .line 1094
    .line 1095
    :try_start_2
    new-instance v9, La/c5k;

    .line 1096
    .line 1097
    const-string v10, "crash_marker"

    .line 1098
    .line 1099
    invoke-direct {v9, v10, v0}, La/c5k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1100
    .line 1101
    .line 1102
    iput-object v9, v7, La/j8f;->f:La/c5k;

    .line 1103
    .line 1104
    new-instance v9, La/c5k;

    .line 1105
    .line 1106
    const-string v10, "initialization_marker"

    .line 1107
    .line 1108
    invoke-direct {v9, v10, v0}, La/c5k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1109
    .line 1110
    .line 1111
    iput-object v9, v7, La/j8f;->e:La/c5k;

    .line 1112
    .line 1113
    new-instance v9, La/ywq0;

    .line 1114
    .line 1115
    move-object/from16 v10, v39

    .line 1116
    .line 1117
    invoke-direct {v9, v1, v0, v10}, La/ywq0;-><init>(Ljava/lang/String;La/xzp;La/cu;)V

    .line 1118
    .line 1119
    .line 1120
    new-instance v13, La/yzn0;

    .line 1121
    .line 1122
    invoke-direct {v13, v0}, La/yzn0;-><init>(La/xzp;)V

    .line 1123
    .line 1124
    .line 1125
    new-instance v0, La/dq00;

    .line 1126
    .line 1127
    new-instance v14, La/gne0;

    .line 1128
    .line 1129
    const/4 v15, 0x6

    .line 1130
    invoke-direct {v14, v15}, La/gne0;-><init>(B)V

    .line 1131
    .line 1132
    .line 1133
    new-array v6, v6, [La/zul0;

    .line 1134
    .line 1135
    aput-object v14, v6, v2

    .line 1136
    .line 1137
    invoke-direct {v0, v6}, La/dq00;-><init>([La/zul0;)V

    .line 1138
    .line 1139
    .line 1140
    iget-object v6, v7, La/j8f;->n:La/nr00;

    .line 1141
    .line 1142
    new-instance v14, La/p8f;

    .line 1143
    .line 1144
    invoke-direct {v14, v9}, La/p8f;-><init>(La/ywq0;)V

    .line 1145
    .line 1146
    .line 1147
    iget-object v6, v6, La/nr00;->a:Ljava/lang/Object;

    .line 1148
    .line 1149
    check-cast v6, La/y680;

    .line 1150
    .line 1151
    new-instance v15, La/ex60;

    .line 1152
    .line 1153
    const/16 v2, 0x14

    .line 1154
    .line 1155
    invoke-direct {v15, v14, v2}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v6, v15}, La/y680;->a(La/izj;)V

    .line 1159
    .line 1160
    .line 1161
    iget-object v2, v7, La/j8f;->a:Landroid/content/Context;

    .line 1162
    .line 1163
    iget-object v6, v7, La/j8f;->h:La/hxw;

    .line 1164
    .line 1165
    iget-object v14, v7, La/j8f;->i:La/xzp;

    .line 1166
    .line 1167
    iget-object v15, v7, La/j8f;->c:La/zn00;

    .line 1168
    .line 1169
    iget-object v8, v7, La/j8f;->l:La/a8f;

    .line 1170
    .line 1171
    iget-object v4, v7, La/j8f;->o:La/cu;

    .line 1172
    .line 1173
    move-object/from16 v46, v0

    .line 1174
    .line 1175
    move-object/from16 v40, v2

    .line 1176
    .line 1177
    move-object/from16 v50, v4

    .line 1178
    .line 1179
    move-object/from16 v41, v6

    .line 1180
    .line 1181
    move-object/from16 v49, v8

    .line 1182
    .line 1183
    move-object/from16 v45, v9

    .line 1184
    .line 1185
    move-object/from16 v43, v11

    .line 1186
    .line 1187
    move-object/from16 v47, v12

    .line 1188
    .line 1189
    move-object/from16 v44, v13

    .line 1190
    .line 1191
    move-object/from16 v42, v14

    .line 1192
    .line 1193
    move-object/from16 v48, v15

    .line 1194
    .line 1195
    invoke-static/range {v40 .. v50}, La/ywq0;->f(Landroid/content/Context;La/hxw;La/xzp;La/rrd;La/yzn0;La/ywq0;La/dq00;La/sd60;La/zn00;La/a8f;La/cu;)La/ywq0;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v49

    .line 1199
    move-object/from16 v46, v43

    .line 1200
    .line 1201
    move-object/from16 v48, v44

    .line 1202
    .line 1203
    move-object/from16 v12, v47

    .line 1204
    .line 1205
    new-instance v40, La/f8f;

    .line 1206
    .line 1207
    iget-object v0, v7, La/j8f;->a:Landroid/content/Context;

    .line 1208
    .line 1209
    iget-object v2, v7, La/j8f;->h:La/hxw;

    .line 1210
    .line 1211
    iget-object v4, v7, La/j8f;->b:La/qaj;

    .line 1212
    .line 1213
    iget-object v6, v7, La/j8f;->i:La/xzp;

    .line 1214
    .line 1215
    iget-object v8, v7, La/j8f;->f:La/c5k;

    .line 1216
    .line 1217
    iget-object v9, v7, La/j8f;->m:La/k8f;

    .line 1218
    .line 1219
    iget-object v11, v7, La/j8f;->k:La/xp2;

    .line 1220
    .line 1221
    iget-object v13, v7, La/j8f;->l:La/a8f;

    .line 1222
    .line 1223
    iget-object v14, v7, La/j8f;->o:La/cu;

    .line 1224
    .line 1225
    move-object/from16 v41, v0

    .line 1226
    .line 1227
    move-object/from16 v42, v2

    .line 1228
    .line 1229
    move-object/from16 v43, v4

    .line 1230
    .line 1231
    move-object/from16 v44, v6

    .line 1232
    .line 1233
    move-object/from16 v50, v9

    .line 1234
    .line 1235
    move-object/from16 v51, v11

    .line 1236
    .line 1237
    move-object/from16 v52, v13

    .line 1238
    .line 1239
    move-object/from16 v53, v14

    .line 1240
    .line 1241
    move-object/from16 v47, v45

    .line 1242
    .line 1243
    move-object/from16 v45, v8

    .line 1244
    .line 1245
    invoke-direct/range {v40 .. v53}, La/f8f;-><init>(Landroid/content/Context;La/hxw;La/qaj;La/xzp;La/c5k;La/rrd;La/ywq0;La/yzn0;La/ywq0;La/k8f;La/xp2;La/a8f;La/cu;)V

    .line 1246
    .line 1247
    .line 1248
    move-object/from16 v0, v40

    .line 1249
    .line 1250
    iput-object v0, v7, La/j8f;->g:La/f8f;

    .line 1251
    .line 1252
    iget-object v0, v7, La/j8f;->e:La/c5k;

    .line 1253
    .line 1254
    iget-object v2, v0, La/c5k;->b:Ljava/lang/Object;

    .line 1255
    .line 1256
    check-cast v2, La/xzp;

    .line 1257
    .line 1258
    iget-object v0, v0, La/c5k;->a:Ljava/lang/Object;

    .line 1259
    .line 1260
    check-cast v0, Ljava/lang/String;

    .line 1261
    .line 1262
    new-instance v4, Ljava/io/File;

    .line 1263
    .line 1264
    iget-object v2, v2, La/xzp;->c:Ljava/lang/Object;

    .line 1265
    .line 1266
    check-cast v2, Ljava/io/File;

    .line 1267
    .line 1268
    invoke-direct {v4, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 1272
    .line 1273
    .line 1274
    move-result v0

    .line 1275
    iget-object v2, v10, La/cu;->b:Ljava/lang/Object;

    .line 1276
    .line 1277
    check-cast v2, La/aaf;

    .line 1278
    .line 1279
    iget-object v2, v2, La/aaf;->a:Ljava/util/concurrent/ExecutorService;

    .line 1280
    .line 1281
    new-instance v4, La/hrd;

    .line 1282
    .line 1283
    const/4 v6, 0x2

    .line 1284
    invoke-direct {v4, v7, v6}, La/hrd;-><init>(Ljava/lang/Object;B)V

    .line 1285
    .line 1286
    .line 1287
    invoke-interface {v2, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 1291
    :try_start_3
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1292
    .line 1293
    const-wide/16 v8, 0x3

    .line 1294
    .line 1295
    invoke-interface {v2, v8, v9, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    check-cast v2, Ljava/lang/Boolean;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 1300
    .line 1301
    :try_start_4
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1302
    .line 1303
    invoke-virtual {v4, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 1304
    .line 1305
    .line 1306
    :catch_0
    iget-object v2, v7, La/j8f;->g:La/f8f;

    .line 1307
    .line 1308
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v4

    .line 1312
    iget-object v6, v2, La/f8f;->e:La/cu;

    .line 1313
    .line 1314
    iget-object v6, v6, La/cu;->b:Ljava/lang/Object;

    .line 1315
    .line 1316
    check-cast v6, La/aaf;

    .line 1317
    .line 1318
    new-instance v8, La/a4e;

    .line 1319
    .line 1320
    const/4 v9, 0x3

    .line 1321
    invoke-direct {v8, v2, v1, v9}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v6, v8}, La/aaf;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 1325
    .line 1326
    .line 1327
    new-instance v6, La/rrc;

    .line 1328
    .line 1329
    const/4 v8, 0x7

    .line 1330
    invoke-direct {v6, v2, v8}, La/rrc;-><init>(Ljava/lang/Object;B)V

    .line 1331
    .line 1332
    .line 1333
    new-instance v8, La/y9f;

    .line 1334
    .line 1335
    iget-object v9, v2, La/f8f;->j:La/k8f;

    .line 1336
    .line 1337
    invoke-direct {v8, v6, v12, v4, v9}, La/y9f;-><init>(La/rrc;La/sd60;Ljava/lang/Thread$UncaughtExceptionHandler;La/k8f;)V

    .line 1338
    .line 1339
    .line 1340
    iput-object v8, v2, La/f8f;->n:La/y9f;

    .line 1341
    .line 1342
    invoke-static {v8}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 1343
    .line 1344
    .line 1345
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1346
    .line 1347
    const/16 v4, 0x25

    .line 1348
    .line 1349
    if-lt v2, v4, :cond_1b

    .line 1350
    .line 1351
    iget-object v2, v7, La/j8f;->g:La/f8f;

    .line 1352
    .line 1353
    invoke-virtual {v2, v1}, La/f8f;->c(Ljava/lang/String;)V

    .line 1354
    .line 1355
    .line 1356
    goto :goto_12

    .line 1357
    :catch_1
    move-exception v0

    .line 1358
    goto :goto_13

    .line 1359
    :cond_1b
    :goto_12
    if-eqz v0, :cond_1e

    .line 1360
    .line 1361
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 1362
    .line 1363
    invoke-virtual {v5, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 1364
    .line 1365
    .line 1366
    move-result v0

    .line 1367
    if-nez v0, :cond_1c

    .line 1368
    .line 1369
    const-string v0, "connectivity"

    .line 1370
    .line 1371
    invoke-virtual {v5, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 1376
    .line 1377
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    if-eqz v0, :cond_1e

    .line 1382
    .line 1383
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    .line 1384
    .line 1385
    .line 1386
    move-result v0

    .line 1387
    if-eqz v0, :cond_1e

    .line 1388
    .line 1389
    :cond_1c
    const-string v0, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    .line 1390
    .line 1391
    const/4 v6, 0x3

    .line 1392
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1393
    .line 1394
    .line 1395
    move-result v1

    .line 1396
    if-eqz v1, :cond_1d

    .line 1397
    .line 1398
    const/4 v14, 0x0

    .line 1399
    invoke-static {v3, v0, v14}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1400
    .line 1401
    .line 1402
    :cond_1d
    invoke-virtual {v7, v12}, La/j8f;->b(La/sd60;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 1403
    .line 1404
    .line 1405
    goto :goto_14

    .line 1406
    :cond_1e
    const-string v0, "Successfully configured exception handler."

    .line 1407
    .line 1408
    const/4 v6, 0x3

    .line 1409
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v1

    .line 1413
    if-eqz v1, :cond_1f

    .line 1414
    .line 1415
    const/4 v14, 0x0

    .line 1416
    invoke-static {v3, v0, v14}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1417
    .line 1418
    .line 1419
    :cond_1f
    iget-object v0, v10, La/cu;->b:Ljava/lang/Object;

    .line 1420
    .line 1421
    check-cast v0, La/aaf;

    .line 1422
    .line 1423
    new-instance v1, La/g8f;

    .line 1424
    .line 1425
    const/4 v2, 0x0

    .line 1426
    invoke-direct {v1, v7, v12, v2}, La/g8f;-><init>(La/j8f;La/sd60;B)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v0, v1}, La/aaf;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 1430
    .line 1431
    .line 1432
    goto :goto_14

    .line 1433
    :goto_13
    const-string v1, "Crashlytics was not started due to an exception during initialization"

    .line 1434
    .line 1435
    invoke-static {v3, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1436
    .line 1437
    .line 1438
    const/4 v14, 0x0

    .line 1439
    iput-object v14, v7, La/j8f;->g:La/f8f;

    .line 1440
    .line 1441
    :goto_14
    new-instance v15, La/tfq;

    .line 1442
    .line 1443
    invoke-direct {v15, v7}, La/tfq;-><init>(La/j8f;)V

    .line 1444
    .line 1445
    .line 1446
    goto :goto_15

    .line 1447
    :cond_20
    invoke-static {v3, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1448
    .line 1449
    .line 1450
    const-string v0, ".     |  | "

    .line 1451
    .line 1452
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1453
    .line 1454
    .line 1455
    invoke-static {v3, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1456
    .line 1457
    .line 1458
    invoke-static {v3, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1459
    .line 1460
    .line 1461
    const-string v0, ".   \\ |  | /"

    .line 1462
    .line 1463
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1464
    .line 1465
    .line 1466
    const-string v0, ".    \\    /"

    .line 1467
    .line 1468
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1469
    .line 1470
    .line 1471
    const-string v0, ".     \\  /"

    .line 1472
    .line 1473
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1474
    .line 1475
    .line 1476
    const-string v0, ".      \\/"

    .line 1477
    .line 1478
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1479
    .line 1480
    .line 1481
    invoke-static {v3, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1482
    .line 1483
    .line 1484
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1485
    .line 1486
    .line 1487
    invoke-static {v3, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1488
    .line 1489
    .line 1490
    const-string v0, ".      /\\"

    .line 1491
    .line 1492
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1493
    .line 1494
    .line 1495
    const-string v0, ".     /  \\"

    .line 1496
    .line 1497
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1498
    .line 1499
    .line 1500
    const-string v0, ".    /    \\"

    .line 1501
    .line 1502
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1503
    .line 1504
    .line 1505
    const-string v0, ".   / |  | \\"

    .line 1506
    .line 1507
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1508
    .line 1509
    .line 1510
    invoke-static {v3, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1511
    .line 1512
    .line 1513
    invoke-static {v3, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1514
    .line 1515
    .line 1516
    invoke-static {v3, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1517
    .line 1518
    .line 1519
    invoke-static {v3, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1520
    .line 1521
    .line 1522
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 1523
    .line 1524
    .line 1525
    const/4 v14, 0x0

    .line 1526
    return-object v14

    .line 1527
    :catchall_0
    move-exception v0

    .line 1528
    :try_start_5
    monitor-exit v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1529
    throw v0

    .line 1530
    :catch_2
    move-exception v0

    .line 1531
    const-string v1, "Error retrieving app package info."

    .line 1532
    .line 1533
    invoke-static {v3, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1534
    .line 1535
    .line 1536
    const/4 v15, 0x0

    .line 1537
    :goto_15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1538
    .line 1539
    .line 1540
    move-result-wide v0

    .line 1541
    sub-long v0, v0, v26

    .line 1542
    .line 1543
    const-wide/16 v4, 0x10

    .line 1544
    .line 1545
    cmp-long v2, v0, v4

    .line 1546
    .line 1547
    if-lez v2, :cond_21

    .line 1548
    .line 1549
    const-string v2, "Initializing Crashlytics blocked main for "

    .line 1550
    .line 1551
    const-string v4, " ms"

    .line 1552
    .line 1553
    invoke-static {v0, v1, v2, v4}, La/axq;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v0

    .line 1557
    const/4 v6, 0x3

    .line 1558
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1559
    .line 1560
    .line 1561
    move-result v1

    .line 1562
    if-eqz v1, :cond_21

    .line 1563
    .line 1564
    const/4 v14, 0x0

    .line 1565
    invoke-static {v3, v0, v14}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1566
    .line 1567
    .line 1568
    :cond_21
    return-object v15
.end method
