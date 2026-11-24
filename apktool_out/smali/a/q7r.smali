.class public final La/q7r;
.super La/c2;
.source "SourceFile"

# interfaces
.implements La/ue80;


# instance fields
.field public final c:I

.field public final d:I

.field public final e:La/z04;

.field public final synthetic f:La/s7r;


# direct methods
.method public constructor <init>(La/s7r;IILa/z04;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/q7r;->f:La/s7r;

    .line 2
    .line 3
    const/4 p1, 0x7

    .line 4
    invoke-direct {p0, p1}, La/c2;-><init>(B)V

    .line 5
    .line 6
    .line 7
    iput p2, p0, La/q7r;->c:I

    .line 8
    .line 9
    iput p3, p0, La/q7r;->d:I

    .line 10
    .line 11
    iput-object p4, p0, La/q7r;->e:La/z04;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final G()V
    .locals 5

    .line 1
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/odd;

    .line 4
    .line 5
    invoke-virtual {p0}, La/pby;->isCompleted()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La/pby;->isCancelled()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/pby;->B()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/bf80;

    .line 23
    .line 24
    iget-object p0, p0, La/bf80;->a:Ljava/lang/Object;

    .line 25
    .line 26
    instance-of v0, p0, La/df80;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    move-object v1, p0

    .line 33
    :cond_0
    check-cast v1, La/voj0;

    .line 34
    .line 35
    if-eqz v1, :cond_6

    .line 36
    .line 37
    instance-of p0, v1, Ljava/lang/AutoCloseable;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, La/voj0;->close()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    instance-of p0, v1, Ljava/util/concurrent/ExecutorService;

    .line 46
    .line 47
    if-eqz p0, :cond_5

    .line 48
    .line 49
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 50
    .line 51
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne v1, p0, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_6

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    :cond_3
    :goto_0
    if-nez p0, :cond_4

    .line 69
    .line 70
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 71
    .line 72
    const-wide/16 v3, 0x1

    .line 73
    .line 74
    invoke-interface {v1, v3, v4, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 75
    .line 76
    .line 77
    move-result p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    goto :goto_0

    .line 79
    :catch_0
    if-nez v0, :cond_3

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    if-eqz v0, :cond_6

    .line 87
    .line 88
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    invoke-static {}, La/e9d0;->o()V

    .line 97
    .line 98
    .line 99
    :cond_6
    :goto_1
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 6

    .line 1
    instance-of v0, p1, La/df80;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    check-cast v1, La/ye80;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_8

    .line 14
    .line 15
    instance-of p1, v1, La/voj0;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    check-cast v1, La/voj0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/voj0;->a()La/voj0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const-class p1, La/voj0;

    .line 27
    .line 28
    sget-object v0, La/sre0;->a:La/tre0;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {v1, p1}, La/kft0;->H(La/sgy;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, La/voj0;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1}, La/voj0;->a()La/voj0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    new-instance p1, La/ywu;

    .line 48
    .line 49
    invoke-direct {p1, v1}, La/ywu;-><init>(La/ye80;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, La/voj0;

    .line 53
    .line 54
    invoke-direct {v0, v1, p1}, La/voj0;-><init>(La/ye80;La/ywu;)V

    .line 55
    .line 56
    .line 57
    move-object p1, v0

    .line 58
    :goto_1
    iget-object v0, p0, La/c2;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, La/odd;

    .line 61
    .line 62
    new-instance v1, La/bf80;

    .line 63
    .line 64
    invoke-direct {v1, p1}, La/bf80;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_b

    .line 72
    .line 73
    instance-of v0, p1, Ljava/lang/AutoCloseable;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-virtual {p1}, La/voj0;->close()V

    .line 78
    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_3
    instance-of v0, p1, Ljava/util/concurrent/ExecutorService;

    .line 82
    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 86
    .line 87
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-ne p1, v0, :cond_4

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_4
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_b

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 101
    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    :cond_5
    :goto_2
    if-nez v0, :cond_6

    .line 105
    .line 106
    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 107
    .line 108
    const-wide/16 v4, 0x1

    .line 109
    .line 110
    invoke-interface {p1, v4, v5, v3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 111
    .line 112
    .line 113
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    goto :goto_2

    .line 115
    :catch_0
    if-nez v1, :cond_5

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move v1, v2

    .line 121
    goto :goto_2

    .line 122
    :cond_6
    if-eqz v1, :cond_b

    .line 123
    .line 124
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_7
    invoke-static {}, La/e9d0;->o()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_8
    iget-object v1, p0, La/c2;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, La/odd;

    .line 139
    .line 140
    if-nez v0, :cond_9

    .line 141
    .line 142
    if-eqz p1, :cond_9

    .line 143
    .line 144
    move p1, v2

    .line 145
    goto :goto_3

    .line 146
    :cond_9
    if-nez p1, :cond_a

    .line 147
    .line 148
    const/4 p1, 0x2

    .line 149
    goto :goto_3

    .line 150
    :cond_a
    check-cast p1, La/df80;

    .line 151
    .line 152
    iget p1, p1, La/df80;->a:I

    .line 153
    .line 154
    :goto_3
    new-instance v0, La/df80;

    .line 155
    .line 156
    invoke-direct {v0, p1}, La/df80;-><init>(I)V

    .line 157
    .line 158
    .line 159
    new-instance p1, La/bf80;

    .line 160
    .line 161
    invoke-direct {p1, v0}, La/bf80;-><init>(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, p1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    :cond_b
    :goto_4
    iget-object p1, p0, La/q7r;->e:La/z04;

    .line 168
    .line 169
    sget-object v0, La/z04;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 170
    .line 171
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_13

    .line 176
    .line 177
    iget-object p1, p0, La/q7r;->f:La/s7r;

    .line 178
    .line 179
    iget-object p1, p1, La/s7r;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_12

    .line 193
    .line 194
    iget-object p0, p0, La/q7r;->f:La/s7r;

    .line 195
    .line 196
    iget-object p1, p0, La/s7r;->g:La/z04;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_c

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_c
    iget-object v0, p0, La/s7r;->f:La/c14;

    .line 209
    .line 210
    :cond_d
    iget-object p1, v0, La/c14;->a:Ljava/lang/Object;

    .line 211
    .line 212
    move-object v1, p1

    .line 213
    check-cast v1, La/r7r;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_f

    .line 220
    .line 221
    if-ne v3, v2, :cond_e

    .line 222
    .line 223
    sget-object v1, La/r7r;->d:La/r7r;

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 227
    .line 228
    new-instance v0, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    const-string v2, "Unexpected frame state for "

    .line 231
    .line 232
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string p0, "! State is "

    .line 239
    .line 240
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const/16 p0, 0x20

    .line 247
    .line 248
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :cond_f
    sget-object v1, La/r7r;->c:La/r7r;

    .line 260
    .line 261
    :goto_5
    invoke-virtual {v0, p1, v1}, La/c14;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-eqz p1, :cond_d

    .line 266
    .line 267
    iget-object p1, p0, La/s7r;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-nez v0, :cond_11

    .line 281
    .line 282
    sget-object p1, La/r7r;->d:La/r7r;

    .line 283
    .line 284
    if-ne v1, p1, :cond_13

    .line 285
    .line 286
    iget-object p0, p0, La/s7r;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 287
    .line 288
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    if-nez p1, :cond_10

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_10
    invoke-static {p0}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    throw p0

    .line 307
    :cond_11
    invoke-static {p1}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    throw p0

    .line 312
    :cond_12
    invoke-static {p1}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    throw p0

    .line 317
    :cond_13
    :goto_6
    return-void
.end method
