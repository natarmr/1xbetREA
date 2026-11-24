.class public final Lokhttp3/logging/HttpLoggingInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/logging/HttpLoggingInterceptor$Companion;,
        Lokhttp3/logging/HttpLoggingInterceptor$Level;,
        Lokhttp3/logging/HttpLoggingInterceptor$Logger;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lokhttp3/logging/HttpLoggingInterceptor;",
        "Lokhttp3/Interceptor;",
        "Level",
        "Logger",
        "Companion",
        "logging-interceptor"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

.field public volatile b:La/xun;

.field public volatile c:La/xun;

.field public volatile d:Lokhttp3/logging/HttpLoggingInterceptor$Level;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 17
    sget-object v0, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 18
    invoke-direct {p0, v0}, Lokhttp3/logging/HttpLoggingInterceptor;-><init>(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 5
    .line 6
    sget-object p1, La/xun;->a:La/xun;

    .line 7
    .line 8
    iput-object p1, p0, Lokhttp3/logging/HttpLoggingInterceptor;->b:La/xun;

    .line 9
    .line 10
    iput-object p1, p0, Lokhttp3/logging/HttpLoggingInterceptor;->c:La/xun;

    .line 11
    .line 12
    sget-object p1, Lokhttp3/logging/HttpLoggingInterceptor$Level;->a:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 13
    .line 14
    iput-object p1, p0, Lokhttp3/logging/HttpLoggingInterceptor;->d:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/Response;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->d:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 6
    .line 7
    iget-object v3, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 8
    .line 9
    sget-object v4, Lokhttp3/logging/HttpLoggingInterceptor$Level;->a:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Lokhttp3/internal/http/RealInterceptorChain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    sget-object v4, Lokhttp3/logging/HttpLoggingInterceptor$Level;->d:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    if-ne v2, v4, :cond_1

    .line 22
    .line 23
    move v4, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v4, 0x0

    .line 26
    :goto_0
    if-nez v4, :cond_3

    .line 27
    .line 28
    sget-object v7, Lokhttp3/logging/HttpLoggingInterceptor$Level;->c:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    .line 29
    .line 30
    if-ne v2, v7, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/4 v6, 0x0

    .line 34
    :cond_3
    :goto_1
    iget-object v2, v3, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 35
    .line 36
    iget-object v7, v0, Lokhttp3/internal/http/RealInterceptorChain;->d:Lokhttp3/internal/connection/Exchange;

    .line 37
    .line 38
    if-eqz v7, :cond_4

    .line 39
    .line 40
    invoke-virtual {v7}, Lokhttp3/internal/connection/Exchange;->c()Lokhttp3/internal/connection/RealConnection;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const/4 v7, 0x0

    .line 46
    :goto_2
    new-instance v9, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v10, "--> "

    .line 49
    .line 50
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v10, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/16 v10, 0x20

    .line 59
    .line 60
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v10, v3, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 64
    .line 65
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v11, v1, Lokhttp3/logging/HttpLoggingInterceptor;->c:La/xun;

    .line 69
    .line 70
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v10, v10, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v10, ""

    .line 79
    .line 80
    const-string v11, " "

    .line 81
    .line 82
    if-eqz v7, :cond_5

    .line 83
    .line 84
    new-instance v12, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v7, v7, Lokhttp3/internal/connection/RealConnection;->g:Lokhttp3/Protocol;

    .line 90
    .line 91
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    move-object v7, v10

    .line 100
    :goto_3
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    const-string v9, "-byte body)"

    .line 108
    .line 109
    const-string v12, " ("

    .line 110
    .line 111
    if-nez v6, :cond_6

    .line 112
    .line 113
    if-eqz v2, :cond_6

    .line 114
    .line 115
    invoke-static {v7, v12}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v2}, Lokhttp3/RequestBody;->a()J

    .line 120
    .line 121
    .line 122
    move-result-wide v13

    .line 123
    invoke-virtual {v7, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    :cond_6
    iget-object v13, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 134
    .line 135
    invoke-interface {v13, v7}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string v7, "identity"

    .line 139
    .line 140
    const-string v13, "-byte body omitted)"

    .line 141
    .line 142
    const-string v14, "Content-Encoding"

    .line 143
    .line 144
    const-string v15, "gzip"

    .line 145
    .line 146
    const-wide/16 v16, -0x1

    .line 147
    .line 148
    if-eqz v6, :cond_15

    .line 149
    .line 150
    iget-object v5, v3, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 151
    .line 152
    if-eqz v2, :cond_9

    .line 153
    .line 154
    invoke-virtual {v2}, Lokhttp3/RequestBody;->b()Lokhttp3/MediaType;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    move/from16 v18, v4

    .line 159
    .line 160
    if-eqz v8, :cond_7

    .line 161
    .line 162
    const-string v4, "Content-Type"

    .line 163
    .line 164
    invoke-virtual {v5, v4}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    if-nez v4, :cond_7

    .line 169
    .line 170
    iget-object v4, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 171
    .line 172
    move/from16 v19, v6

    .line 173
    .line 174
    new-instance v6, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    move-object/from16 v20, v11

    .line 177
    .line 178
    const-string v11, "Content-Type: "

    .line 179
    .line 180
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-interface {v4, v6}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_7
    move/from16 v19, v6

    .line 195
    .line 196
    move-object/from16 v20, v11

    .line 197
    .line 198
    :goto_4
    invoke-virtual {v2}, Lokhttp3/RequestBody;->a()J

    .line 199
    .line 200
    .line 201
    move-result-wide v21

    .line 202
    cmp-long v4, v21, v16

    .line 203
    .line 204
    if-eqz v4, :cond_8

    .line 205
    .line 206
    const-string v4, "Content-Length"

    .line 207
    .line 208
    invoke-virtual {v5, v4}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    if-nez v4, :cond_8

    .line 213
    .line 214
    iget-object v4, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 215
    .line 216
    new-instance v6, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v8, "Content-Length: "

    .line 219
    .line 220
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    move-object v11, v9

    .line 224
    invoke-virtual {v2}, Lokhttp3/RequestBody;->a()J

    .line 225
    .line 226
    .line 227
    move-result-wide v8

    .line 228
    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-interface {v4, v6}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_8
    :goto_5
    move-object v11, v9

    .line 240
    goto :goto_6

    .line 241
    :cond_9
    move/from16 v18, v4

    .line 242
    .line 243
    move/from16 v19, v6

    .line 244
    .line 245
    move-object/from16 v20, v11

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :goto_6
    invoke-virtual {v5}, Lokhttp3/Headers;->size()I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    const/4 v6, 0x0

    .line 253
    :goto_7
    if-ge v6, v4, :cond_a

    .line 254
    .line 255
    invoke-virtual {v1, v5, v6}, Lokhttp3/logging/HttpLoggingInterceptor;->b(Lokhttp3/Headers;I)V

    .line 256
    .line 257
    .line 258
    add-int/lit8 v6, v6, 0x1

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_a
    const-string v4, "--> END "

    .line 262
    .line 263
    if-eqz v18, :cond_14

    .line 264
    .line 265
    if-nez v2, :cond_b

    .line 266
    .line 267
    goto/16 :goto_a

    .line 268
    .line 269
    :cond_b
    iget-object v6, v3, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 270
    .line 271
    invoke-virtual {v6, v14}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    if-nez v6, :cond_c

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_c
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    if-nez v8, :cond_d

    .line 283
    .line 284
    invoke-virtual {v6, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-nez v6, :cond_d

    .line 289
    .line 290
    iget-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 291
    .line 292
    new-instance v5, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    iget-object v4, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string v4, " (encoded body omitted)"

    .line 303
    .line 304
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-interface {v2, v4}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_b

    .line 315
    .line 316
    :cond_d
    :goto_8
    invoke-virtual {v2}, Lokhttp3/RequestBody;->c()Z

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    if-eqz v6, :cond_e

    .line 321
    .line 322
    iget-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 323
    .line 324
    new-instance v5, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    iget-object v4, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 330
    .line 331
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    const-string v4, " (one-shot body omitted)"

    .line 335
    .line 336
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-interface {v2, v4}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_b

    .line 347
    .line 348
    :cond_e
    new-instance v6, La/f99;

    .line 349
    .line 350
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v6}, Lokhttp3/RequestBody;->d(La/t99;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v5, v14}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    invoke-virtual {v15, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-eqz v5, :cond_f

    .line 365
    .line 366
    iget-wide v8, v6, La/f99;->b:J

    .line 367
    .line 368
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    new-instance v8, La/hjv;

    .line 373
    .line 374
    invoke-direct {v8, v6}, La/hjv;-><init>(La/u99;)V

    .line 375
    .line 376
    .line 377
    :try_start_0
    new-instance v6, La/f99;

    .line 378
    .line 379
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6, v8}, La/f99;->P(La/emk0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 383
    .line 384
    .line 385
    invoke-virtual {v8}, La/hjv;->close()V

    .line 386
    .line 387
    .line 388
    goto :goto_9

    .line 389
    :catchall_0
    move-exception v0

    .line 390
    move-object v1, v0

    .line 391
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 392
    :catchall_1
    move-exception v0

    .line 393
    invoke-static {v8, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 394
    .line 395
    .line 396
    throw v0

    .line 397
    :cond_f
    const/4 v5, 0x0

    .line 398
    :goto_9
    invoke-virtual {v2}, Lokhttp3/RequestBody;->b()Lokhttp3/MediaType;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    if-eqz v8, :cond_10

    .line 403
    .line 404
    sget-object v9, Lokhttp3/MediaType;->e:Lkotlin/text/Regex;

    .line 405
    .line 406
    const/4 v9, 0x0

    .line 407
    invoke-virtual {v8, v9}, Lokhttp3/MediaType;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    if-nez v8, :cond_11

    .line 412
    .line 413
    :cond_10
    sget-object v8, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 414
    .line 415
    :cond_11
    iget-object v9, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 416
    .line 417
    invoke-interface {v9, v10}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-static {v6}, Lokhttp3/internal/IsProbablyUtf8Kt;->a(La/f99;)Z

    .line 421
    .line 422
    .line 423
    move-result v9

    .line 424
    move-object/from16 v21, v2

    .line 425
    .line 426
    iget-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 427
    .line 428
    if-nez v9, :cond_12

    .line 429
    .line 430
    new-instance v5, Ljava/lang/StringBuilder;

    .line 431
    .line 432
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    iget-object v4, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    const-string v4, " (binary "

    .line 441
    .line 442
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v21 .. v21}, Lokhttp3/RequestBody;->a()J

    .line 446
    .line 447
    .line 448
    move-result-wide v8

    .line 449
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    invoke-interface {v2, v4}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    goto :goto_b

    .line 463
    :cond_12
    if-eqz v5, :cond_13

    .line 464
    .line 465
    new-instance v8, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    iget-object v4, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    move-object v9, v5

    .line 479
    iget-wide v4, v6, La/f99;->b:J

    .line 480
    .line 481
    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    const-string v4, "-byte, "

    .line 485
    .line 486
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 490
    .line 491
    .line 492
    move-result-wide v4

    .line 493
    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    const-string v4, "-gzipped-byte body)"

    .line 497
    .line 498
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    invoke-interface {v2, v4}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    goto :goto_b

    .line 509
    :cond_13
    invoke-virtual {v6, v8}, La/f99;->H0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    invoke-interface {v2, v5}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    iget-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 517
    .line 518
    new-instance v5, Ljava/lang/StringBuilder;

    .line 519
    .line 520
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    iget-object v4, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 524
    .line 525
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v21 .. v21}, Lokhttp3/RequestBody;->a()J

    .line 532
    .line 533
    .line 534
    move-result-wide v8

    .line 535
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    invoke-interface {v2, v4}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    goto :goto_b

    .line 549
    :cond_14
    :goto_a
    iget-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 550
    .line 551
    new-instance v5, Ljava/lang/StringBuilder;

    .line 552
    .line 553
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    iget-object v4, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-interface {v2, v4}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    goto :goto_b

    .line 569
    :cond_15
    move/from16 v18, v4

    .line 570
    .line 571
    move/from16 v19, v6

    .line 572
    .line 573
    move-object/from16 v20, v11

    .line 574
    .line 575
    :goto_b
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 576
    .line 577
    .line 578
    move-result-wide v4

    .line 579
    const-wide/32 v8, 0xf4240

    .line 580
    .line 581
    .line 582
    :try_start_2
    invoke-virtual {v0, v3}, Lokhttp3/internal/http/RealInterceptorChain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    .line 583
    .line 584
    .line 585
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 586
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 587
    .line 588
    .line 589
    move-result-wide v2

    .line 590
    sub-long/2addr v2, v4

    .line 591
    div-long/2addr v2, v8

    .line 592
    iget-object v6, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 593
    .line 594
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    move-wide/from16 v21, v8

    .line 598
    .line 599
    invoke-virtual {v6}, Lokhttp3/ResponseBody;->d()J

    .line 600
    .line 601
    .line 602
    move-result-wide v8

    .line 603
    cmp-long v11, v8, v16

    .line 604
    .line 605
    move-wide/from16 v16, v4

    .line 606
    .line 607
    const-string v4, "-byte"

    .line 608
    .line 609
    if-eqz v11, :cond_16

    .line 610
    .line 611
    invoke-static {v8, v9, v4}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    goto :goto_c

    .line 616
    :cond_16
    const-string v5, "unknown-length"

    .line 617
    .line 618
    :goto_c
    iget-object v11, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 619
    .line 620
    move-wide/from16 v23, v8

    .line 621
    .line 622
    new-instance v8, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    new-instance v9, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    move-object/from16 p1, v4

    .line 627
    .line 628
    const-string v4, "<-- "

    .line 629
    .line 630
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    iget v4, v0, Lokhttp3/Response;->d:I

    .line 634
    .line 635
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    iget-object v4, v0, Lokhttp3/Response;->c:Ljava/lang/String;

    .line 646
    .line 647
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 648
    .line 649
    .line 650
    move-result v4

    .line 651
    if-lez v4, :cond_17

    .line 652
    .line 653
    new-instance v4, Ljava/lang/StringBuilder;

    .line 654
    .line 655
    move-object/from16 v9, v20

    .line 656
    .line 657
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    move-object/from16 v20, v13

    .line 661
    .line 662
    iget-object v13, v0, Lokhttp3/Response;->c:Ljava/lang/String;

    .line 663
    .line 664
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v4

    .line 671
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    goto :goto_d

    .line 675
    :cond_17
    move-object/from16 v9, v20

    .line 676
    .line 677
    move-object/from16 v20, v13

    .line 678
    .line 679
    :goto_d
    new-instance v4, Ljava/lang/StringBuilder;

    .line 680
    .line 681
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    iget-object v9, v0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 685
    .line 686
    iget-object v9, v9, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 687
    .line 688
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    iget-object v13, v1, Lokhttp3/logging/HttpLoggingInterceptor;->c:La/xun;

    .line 692
    .line 693
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    iget-object v9, v9, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 697
    .line 698
    invoke-static {v4, v2, v3, v9, v12}, Lc;->i(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    const-string v2, "ms"

    .line 702
    .line 703
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    const-string v2, ", "

    .line 714
    .line 715
    if-nez v19, :cond_18

    .line 716
    .line 717
    new-instance v3, Ljava/lang/StringBuilder;

    .line 718
    .line 719
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    const-string v4, " body"

    .line 726
    .line 727
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v3

    .line 734
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    :cond_18
    const-string v3, ")"

    .line 738
    .line 739
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    invoke-interface {v11, v3}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    if-eqz v19, :cond_26

    .line 750
    .line 751
    iget-object v3, v0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 752
    .line 753
    invoke-virtual {v3}, Lokhttp3/Headers;->size()I

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    const/4 v5, 0x0

    .line 758
    :goto_e
    if-ge v5, v4, :cond_19

    .line 759
    .line 760
    invoke-virtual {v1, v3, v5}, Lokhttp3/logging/HttpLoggingInterceptor;->b(Lokhttp3/Headers;I)V

    .line 761
    .line 762
    .line 763
    add-int/lit8 v5, v5, 0x1

    .line 764
    .line 765
    goto :goto_e

    .line 766
    :cond_19
    if-eqz v18, :cond_25

    .line 767
    .line 768
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->a(Lokhttp3/Response;)Z

    .line 769
    .line 770
    .line 771
    move-result v4

    .line 772
    if-nez v4, :cond_1a

    .line 773
    .line 774
    goto/16 :goto_11

    .line 775
    .line 776
    :cond_1a
    iget-object v4, v0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 777
    .line 778
    invoke-virtual {v4, v14}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    if-nez v4, :cond_1b

    .line 783
    .line 784
    goto :goto_f

    .line 785
    :cond_1b
    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 786
    .line 787
    .line 788
    move-result v5

    .line 789
    if-nez v5, :cond_1c

    .line 790
    .line 791
    invoke-virtual {v4, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    if-nez v4, :cond_1c

    .line 796
    .line 797
    iget-object v1, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 798
    .line 799
    const-string v2, "<-- END HTTP (encoded body omitted)"

    .line 800
    .line 801
    invoke-interface {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    return-object v0

    .line 805
    :cond_1c
    :goto_f
    iget-object v4, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 806
    .line 807
    invoke-virtual {v4}, Lokhttp3/ResponseBody;->e()Lokhttp3/MediaType;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    if-eqz v4, :cond_1d

    .line 812
    .line 813
    iget-object v5, v4, Lokhttp3/MediaType;->b:Ljava/lang/String;

    .line 814
    .line 815
    const-string v7, "text"

    .line 816
    .line 817
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v5

    .line 821
    if-eqz v5, :cond_1d

    .line 822
    .line 823
    iget-object v4, v4, Lokhttp3/MediaType;->c:Ljava/lang/String;

    .line 824
    .line 825
    const-string v5, "event-stream"

    .line 826
    .line 827
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    move-result v4

    .line 831
    if-eqz v4, :cond_1d

    .line 832
    .line 833
    iget-object v1, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 834
    .line 835
    const-string v2, "<-- END HTTP (streaming)"

    .line 836
    .line 837
    invoke-interface {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    return-object v0

    .line 841
    :cond_1d
    instance-of v4, v6, Lokhttp3/internal/UnreadableResponseBody;

    .line 842
    .line 843
    if-eqz v4, :cond_1e

    .line 844
    .line 845
    iget-object v1, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 846
    .line 847
    const-string v2, "<-- END HTTP (unreadable body)"

    .line 848
    .line 849
    invoke-interface {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    return-object v0

    .line 853
    :cond_1e
    invoke-virtual {v6}, Lokhttp3/ResponseBody;->V0()La/u99;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    const-wide v7, 0x7fffffffffffffffL

    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    invoke-interface {v4, v7, v8}, La/u99;->G(J)Z

    .line 863
    .line 864
    .line 865
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 866
    .line 867
    .line 868
    move-result-wide v7

    .line 869
    sub-long v7, v7, v16

    .line 870
    .line 871
    div-long v7, v7, v21

    .line 872
    .line 873
    invoke-interface {v4}, La/u99;->g()La/f99;

    .line 874
    .line 875
    .line 876
    move-result-object v4

    .line 877
    invoke-virtual {v3, v14}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-virtual {v15, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 882
    .line 883
    .line 884
    move-result v3

    .line 885
    if-eqz v3, :cond_1f

    .line 886
    .line 887
    iget-wide v11, v4, La/f99;->b:J

    .line 888
    .line 889
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 890
    .line 891
    .line 892
    move-result-object v9

    .line 893
    new-instance v3, La/hjv;

    .line 894
    .line 895
    invoke-virtual {v4}, La/f99;->d()La/f99;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    invoke-direct {v3, v4}, La/hjv;-><init>(La/u99;)V

    .line 900
    .line 901
    .line 902
    :try_start_3
    new-instance v4, La/f99;

    .line 903
    .line 904
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v4, v3}, La/f99;->P(La/emk0;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 908
    .line 909
    .line 910
    invoke-virtual {v3}, La/hjv;->close()V

    .line 911
    .line 912
    .line 913
    goto :goto_10

    .line 914
    :catchall_2
    move-exception v0

    .line 915
    move-object v1, v0

    .line 916
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 917
    :catchall_3
    move-exception v0

    .line 918
    invoke-static {v3, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 919
    .line 920
    .line 921
    throw v0

    .line 922
    :cond_1f
    const/4 v9, 0x0

    .line 923
    :goto_10
    invoke-virtual {v6}, Lokhttp3/ResponseBody;->e()Lokhttp3/MediaType;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    if-eqz v3, :cond_20

    .line 928
    .line 929
    sget-object v5, Lokhttp3/MediaType;->e:Lkotlin/text/Regex;

    .line 930
    .line 931
    const/4 v5, 0x0

    .line 932
    invoke-virtual {v3, v5}, Lokhttp3/MediaType;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    if-nez v3, :cond_21

    .line 937
    .line 938
    :cond_20
    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 939
    .line 940
    :cond_21
    invoke-static {v4}, Lokhttp3/internal/IsProbablyUtf8Kt;->a(La/f99;)Z

    .line 941
    .line 942
    .line 943
    move-result v5

    .line 944
    const-string v6, "<-- END HTTP ("

    .line 945
    .line 946
    if-nez v5, :cond_22

    .line 947
    .line 948
    iget-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 949
    .line 950
    invoke-interface {v2, v10}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    iget-object v1, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 954
    .line 955
    const-string v2, "ms, binary "

    .line 956
    .line 957
    invoke-static {v7, v8, v6, v2}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    iget-wide v3, v4, La/f99;->b:J

    .line 962
    .line 963
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    move-object/from16 v3, v20

    .line 967
    .line 968
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    invoke-interface {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    return-object v0

    .line 979
    :cond_22
    const-wide/16 v11, 0x0

    .line 980
    .line 981
    cmp-long v5, v23, v11

    .line 982
    .line 983
    if-eqz v5, :cond_23

    .line 984
    .line 985
    iget-object v5, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 986
    .line 987
    invoke-interface {v5, v10}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    iget-object v5, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 991
    .line 992
    invoke-virtual {v4}, La/f99;->d()La/f99;

    .line 993
    .line 994
    .line 995
    move-result-object v10

    .line 996
    invoke-virtual {v10, v3}, La/f99;->H0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v3

    .line 1000
    invoke-interface {v5, v3}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    :cond_23
    iget-object v1, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 1004
    .line 1005
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1006
    .line 1007
    const-string v5, "ms, "

    .line 1008
    .line 1009
    invoke-static {v7, v8, v6, v5}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v5

    .line 1013
    iget-wide v6, v4, La/f99;->b:J

    .line 1014
    .line 1015
    move-object/from16 v4, p1

    .line 1016
    .line 1017
    invoke-static {v6, v7, v4, v5}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v4

    .line 1021
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    if-eqz v9, :cond_24

    .line 1025
    .line 1026
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1027
    .line 1028
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 1032
    .line 1033
    .line 1034
    move-result-wide v5

    .line 1035
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1036
    .line 1037
    .line 1038
    const-string v2, "-gzipped-byte"

    .line 1039
    .line 1040
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1048
    .line 1049
    .line 1050
    :cond_24
    const-string v2, " body)"

    .line 1051
    .line 1052
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    invoke-interface {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    return-object v0

    .line 1063
    :cond_25
    :goto_11
    iget-object v1, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 1064
    .line 1065
    const-string v2, "<-- END HTTP"

    .line 1066
    .line 1067
    invoke-interface {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 1068
    .line 1069
    .line 1070
    :cond_26
    return-object v0

    .line 1071
    :catch_0
    move-exception v0

    .line 1072
    move-wide/from16 v16, v4

    .line 1073
    .line 1074
    move-wide/from16 v21, v8

    .line 1075
    .line 1076
    move-object/from16 v9, v20

    .line 1077
    .line 1078
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1079
    .line 1080
    .line 1081
    move-result-wide v4

    .line 1082
    sub-long v4, v4, v16

    .line 1083
    .line 1084
    div-long v4, v4, v21

    .line 1085
    .line 1086
    iget-object v2, v1, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 1087
    .line 1088
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1089
    .line 1090
    const-string v7, "<-- HTTP FAILED: "

    .line 1091
    .line 1092
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1096
    .line 1097
    .line 1098
    const/16 v7, 0x2e

    .line 1099
    .line 1100
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v6

    .line 1107
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1108
    .line 1109
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    iget-object v3, v3, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 1113
    .line 1114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    iget-object v1, v1, Lokhttp3/logging/HttpLoggingInterceptor;->c:La/xun;

    .line 1118
    .line 1119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    iget-object v1, v3, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 1123
    .line 1124
    invoke-static {v7, v4, v5, v1, v12}, Lc;->i(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 1125
    .line 1126
    .line 1127
    const-string v1, "ms)"

    .line 1128
    .line 1129
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    invoke-interface {v2, v1}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    throw v0
.end method

.method public final b(Lokhttp3/Headers;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/logging/HttpLoggingInterceptor;->b:La/xun;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lokhttp3/internal/_HeadersCommonKt;->c(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Lokhttp3/internal/_HeadersCommonKt;->e(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Lokhttp3/logging/HttpLoggingInterceptor;->a:Lokhttp3/logging/HttpLoggingInterceptor$Logger;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-static {p1, p2}, Lokhttp3/internal/_HeadersCommonKt;->c(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string p1, ": "

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p0, p1}, Lokhttp3/logging/HttpLoggingInterceptor$Logger;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
