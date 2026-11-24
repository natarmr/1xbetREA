.class public final Lokhttp3/Dispatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/Dispatcher;",
        "",
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


# instance fields
.field public a:B

.field public b:B

.field public c:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final d:Ljava/util/ArrayDeque;

.field public final e:Ljava/util/ArrayDeque;

.field public final f:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x40

    .line 5
    .line 6
    iput-byte v0, p0, Lokhttp3/Dispatcher;->a:B

    .line 7
    .line 8
    const/4 v0, 0x5

    .line 9
    iput-byte v0, p0, Lokhttp3/Dispatcher;->b:B

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lokhttp3/Dispatcher;->d:Ljava/util/ArrayDeque;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lokhttp3/Dispatcher;->f:Ljava/util/ArrayDeque;

    .line 31
    .line 32
    return-void
.end method

.method public static c(Lokhttp3/Dispatcher;Lokhttp3/internal/connection/RealCall$AsyncCall;Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealCall$AsyncCall;I)V
    .locals 10

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p4, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object p2, v1

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    move-object p3, v1

    .line 17
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object p4, Lokhttp3/internal/_UtilJvmKt;->a:Ljava/util/TimeZone;

    .line 21
    .line 22
    invoke-virtual {p0}, Lokhttp3/Dispatcher;->a()Ljava/util/concurrent/ExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    invoke-interface {p4}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    monitor-enter p0

    .line 31
    if-eqz p2, :cond_4

    .line 32
    .line 33
    :try_start_0
    iget-object v0, p0, Lokhttp3/Dispatcher;->f:Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-virtual {v0, p2}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    const-string p1, "Call wasn\'t in-flight!"

    .line 43
    .line 44
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p2

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_8

    .line 52
    .line 53
    :cond_4
    :goto_0
    if-eqz p3, :cond_6

    .line 54
    .line 55
    iget-object v0, p3, Lokhttp3/internal/connection/RealCall$AsyncCall;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 61
    .line 62
    invoke-virtual {v0, p3}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_5
    const-string p1, "Call wasn\'t in-flight!"

    .line 70
    .line 71
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p2

    .line 77
    :cond_6
    :goto_1
    if-eqz p1, :cond_7

    .line 78
    .line 79
    iget-object v0, p0, Lokhttp3/Dispatcher;->d:Ljava/util/ArrayDeque;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object v0, p1, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 85
    .line 86
    iget-boolean v2, v0, Lokhttp3/internal/connection/RealCall;->c:Z

    .line 87
    .line 88
    if-nez v2, :cond_7

    .line 89
    .line 90
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall;->b:Lokhttp3/Request;

    .line 91
    .line 92
    iget-object v0, v0, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 93
    .line 94
    iget-object v0, v0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lokhttp3/Dispatcher;->b(Ljava/lang/String;)Lokhttp3/internal/connection/RealCall$AsyncCall;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    iget-object v0, v0, Lokhttp3/internal/connection/RealCall$AsyncCall;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 103
    .line 104
    iput-object v0, p1, Lokhttp3/internal/connection/RealCall$AsyncCall;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 105
    .line 106
    :cond_7
    if-nez p2, :cond_8

    .line 107
    .line 108
    if-eqz p3, :cond_a

    .line 109
    .line 110
    :cond_8
    if-nez p4, :cond_9

    .line 111
    .line 112
    iget-object p2, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_a

    .line 119
    .line 120
    :cond_9
    iget-object p2, p0, Lokhttp3/Dispatcher;->f:Ljava/util/ArrayDeque;

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    :cond_a
    if-eqz p4, :cond_b

    .line 127
    .line 128
    iget-object p2, p0, Lokhttp3/Dispatcher;->d:Ljava/util/ArrayDeque;

    .line 129
    .line 130
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    iget-object p3, p0, Lokhttp3/Dispatcher;->d:Ljava/util/ArrayDeque;

    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->clear()V

    .line 137
    .line 138
    .line 139
    new-instance p3, Lokhttp3/Dispatcher$promoteAndExecute$Effects;

    .line 140
    .line 141
    invoke-direct {p3, p2}, Lokhttp3/Dispatcher$promoteAndExecute$Effects;-><init>(Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_b
    new-instance p2, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    iget-object p3, p0, Lokhttp3/Dispatcher;->d:Ljava/util/ArrayDeque;

    .line 151
    .line 152
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    :cond_c
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_d

    .line 164
    .line 165
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Lokhttp3/internal/connection/RealCall$AsyncCall;

    .line 170
    .line 171
    iget-object v2, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    iget-byte v3, p0, Lokhttp3/Dispatcher;->a:B

    .line 178
    .line 179
    if-ge v2, v3, :cond_d

    .line 180
    .line 181
    iget-object v2, v0, Lokhttp3/internal/connection/RealCall$AsyncCall;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    iget-byte v3, p0, Lokhttp3/Dispatcher;->b:B

    .line 188
    .line 189
    if-ge v2, v3, :cond_c

    .line 190
    .line 191
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    .line 192
    .line 193
    .line 194
    iget-object v2, v0, Lokhttp3/internal/connection/RealCall$AsyncCall;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    iget-object v2, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 203
    .line 204
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_d
    new-instance p3, Lokhttp3/Dispatcher$promoteAndExecute$Effects;

    .line 209
    .line 210
    invoke-direct {p3, p2}, Lokhttp3/Dispatcher$promoteAndExecute$Effects;-><init>(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    .line 212
    .line 213
    :goto_3
    monitor-exit p0

    .line 214
    iget-object p2, p3, Lokhttp3/Dispatcher$promoteAndExecute$Effects;->a:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    const/4 v0, 0x1

    .line 221
    const/4 v2, 0x0

    .line 222
    move v3, v2

    .line 223
    :goto_4
    if-ge v3, p2, :cond_10

    .line 224
    .line 225
    iget-object v4, p3, Lokhttp3/Dispatcher$promoteAndExecute$Effects;->a:Ljava/util/List;

    .line 226
    .line 227
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, Lokhttp3/internal/connection/RealCall$AsyncCall;

    .line 232
    .line 233
    if-ne v4, p1, :cond_e

    .line 234
    .line 235
    move v0, v2

    .line 236
    goto :goto_5

    .line 237
    :cond_e
    iget-object v5, v4, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 238
    .line 239
    iget-object v5, v5, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 240
    .line 241
    iget-object v6, v4, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 242
    .line 243
    invoke-virtual {v5, v6, p0}, Lokhttp3/EventListener;->l(Lokhttp3/internal/connection/RealCall;Lokhttp3/Dispatcher;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    if-eqz p4, :cond_f

    .line 247
    .line 248
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance v5, Ljava/io/InterruptedIOException;

    .line 252
    .line 253
    const-string v6, "executor rejected"

    .line 254
    .line 255
    invoke-direct {v5, v6}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 259
    .line 260
    .line 261
    iget-object v6, v4, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 262
    .line 263
    invoke-virtual {v6, v5}, Lokhttp3/internal/connection/RealCall;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 264
    .line 265
    .line 266
    iget-object v4, v4, Lokhttp3/internal/connection/RealCall$AsyncCall;->a:Lokhttp3/Callback;

    .line 267
    .line 268
    invoke-interface {v4, v6, v5}, Lokhttp3/Callback;->b(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 269
    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_f
    invoke-virtual {p0}, Lokhttp3/Dispatcher;->a()Ljava/util/concurrent/ExecutorService;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    iget-object v6, v4, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 280
    .line 281
    iget-object v7, v6, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 282
    .line 283
    iget-object v7, v7, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    .line 284
    .line 285
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    const/4 v7, 0x3

    .line 289
    :try_start_1
    invoke-interface {v5, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :catchall_1
    move-exception p0

    .line 294
    goto :goto_7

    .line 295
    :catch_0
    move-exception v5

    .line 296
    :try_start_2
    new-instance v8, Ljava/io/InterruptedIOException;

    .line 297
    .line 298
    const-string v9, "executor rejected"

    .line 299
    .line 300
    invoke-direct {v8, v9}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v8, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 304
    .line 305
    .line 306
    iget-object v5, v4, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 307
    .line 308
    invoke-virtual {v5, v8}, Lokhttp3/internal/connection/RealCall;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 309
    .line 310
    .line 311
    iget-object v9, v4, Lokhttp3/internal/connection/RealCall$AsyncCall;->a:Lokhttp3/Callback;

    .line 312
    .line 313
    invoke-interface {v9, v5, v8}, Lokhttp3/Callback;->b(Lokhttp3/Call;Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 314
    .line 315
    .line 316
    iget-object v5, v6, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 317
    .line 318
    iget-object v5, v5, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    .line 319
    .line 320
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-static {v5, v1, v1, v4, v7}, Lokhttp3/Dispatcher;->c(Lokhttp3/Dispatcher;Lokhttp3/internal/connection/RealCall$AsyncCall;Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealCall$AsyncCall;I)V

    .line 324
    .line 325
    .line 326
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 327
    .line 328
    goto :goto_4

    .line 329
    :goto_7
    iget-object p1, v6, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 330
    .line 331
    iget-object p1, p1, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-static {p1, v1, v1, v4, v7}, Lokhttp3/Dispatcher;->c(Lokhttp3/Dispatcher;Lokhttp3/internal/connection/RealCall$AsyncCall;Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealCall$AsyncCall;I)V

    .line 337
    .line 338
    .line 339
    throw p0

    .line 340
    :cond_10
    if-eqz v0, :cond_11

    .line 341
    .line 342
    if-eqz p1, :cond_11

    .line 343
    .line 344
    iget-object p2, p1, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 345
    .line 346
    iget-object p2, p2, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 347
    .line 348
    iget-object p1, p1, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 349
    .line 350
    invoke-virtual {p2, p1, p0}, Lokhttp3/EventListener;->m(Lokhttp3/internal/connection/RealCall;Lokhttp3/Dispatcher;)V

    .line 351
    .line 352
    .line 353
    :cond_11
    return-void

    .line 354
    :goto_8
    monitor-exit p0

    .line 355
    throw p1
.end method


# virtual methods
.method public final declared-synchronized a()Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lokhttp3/Dispatcher;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    .line 11
    .line 12
    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lokhttp3/internal/_UtilJvmKt;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " Dispatcher"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v8, La/m4w0;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v8, v0, v2}, La/m4w0;-><init>(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    const v3, 0x7fffffff

    .line 42
    .line 43
    .line 44
    const-wide/16 v4, 0x3c

    .line 45
    .line 46
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lokhttp3/Dispatcher;->c:Ljava/util/concurrent/ThreadPoolExecutor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    move-object v0, v1

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :goto_0
    monitor-exit p0

    .line 56
    return-object v0

    .line 57
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw v0
.end method

.method public final b(Ljava/lang/String;)Lokhttp3/internal/connection/RealCall$AsyncCall;
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/Dispatcher;->e:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lokhttp3/internal/connection/RealCall$AsyncCall;

    .line 21
    .line 22
    iget-object v2, v1, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 23
    .line 24
    iget-object v2, v2, Lokhttp3/internal/connection/RealCall;->b:Lokhttp3/Request;

    .line 25
    .line 26
    iget-object v2, v2, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 27
    .line 28
    iget-object v2, v2, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_1
    iget-object p0, p0, Lokhttp3/Dispatcher;->d:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lokhttp3/internal/connection/RealCall$AsyncCall;

    .line 57
    .line 58
    iget-object v1, v0, Lokhttp3/internal/connection/RealCall$AsyncCall;->c:Lokhttp3/internal/connection/RealCall;

    .line 59
    .line 60
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->b:Lokhttp3/Request;

    .line 61
    .line 62
    iget-object v1, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 63
    .line 64
    iget-object v1, v1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_3
    const/4 p0, 0x0

    .line 74
    return-object p0
.end method
