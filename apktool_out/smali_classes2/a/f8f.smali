.class public final La/f8f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final r:La/z7f;

.field public static final s:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/qaj;

.field public final c:La/c5k;

.field public final d:La/ywq0;

.field public final e:La/cu;

.field public final f:La/hxw;

.field public final g:La/xzp;

.field public final h:La/rrd;

.field public final i:La/yzn0;

.field public final j:La/k8f;

.field public final k:La/xp2;

.field public final l:La/a8f;

.field public final m:La/ywq0;

.field public n:La/y9f;

.field public final o:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final p:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final q:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/z7f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La/z7f;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/f8f;->r:La/z7f;

    .line 8
    .line 9
    const-string v0, "UTF-8"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/f8f;->s:Ljava/nio/charset/Charset;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/hxw;La/qaj;La/xzp;La/c5k;La/rrd;La/ywq0;La/yzn0;La/ywq0;La/k8f;La/xp2;La/a8f;La/cu;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/f8f;->o:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/f8f;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 17
    .line 18
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/f8f;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/f8f;->a:Landroid/content/Context;

    .line 32
    .line 33
    iput-object p2, p0, La/f8f;->f:La/hxw;

    .line 34
    .line 35
    iput-object p3, p0, La/f8f;->b:La/qaj;

    .line 36
    .line 37
    iput-object p4, p0, La/f8f;->g:La/xzp;

    .line 38
    .line 39
    iput-object p5, p0, La/f8f;->c:La/c5k;

    .line 40
    .line 41
    iput-object p6, p0, La/f8f;->h:La/rrd;

    .line 42
    .line 43
    iput-object p7, p0, La/f8f;->d:La/ywq0;

    .line 44
    .line 45
    iput-object p8, p0, La/f8f;->i:La/yzn0;

    .line 46
    .line 47
    iput-object p10, p0, La/f8f;->j:La/k8f;

    .line 48
    .line 49
    iput-object p11, p0, La/f8f;->k:La/xp2;

    .line 50
    .line 51
    iput-object p12, p0, La/f8f;->l:La/a8f;

    .line 52
    .line 53
    iput-object p9, p0, La/f8f;->m:La/ywq0;

    .line 54
    .line 55
    iput-object p13, p0, La/f8f;->e:La/cu;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a(ZLa/sd60;Z)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    iget-object v3, v1, La/f8f;->j:La/k8f;

    .line 6
    .line 7
    const-string v4, "activity"

    .line 8
    .line 9
    iget-object v5, v1, La/f8f;->a:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v6, v1, La/f8f;->g:La/xzp;

    .line 12
    .line 13
    const-string v7, "FirebaseCrashlytics"

    .line 14
    .line 15
    invoke-static {}, La/cu;->d()V

    .line 16
    .line 17
    .line 18
    new-instance v8, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v9, v1, La/f8f;->m:La/ywq0;

    .line 21
    .line 22
    iget-object v0, v9, La/ywq0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/x9f;

    .line 25
    .line 26
    invoke-virtual {v0}, La/x9f;->d()Ljava/util/NavigableSet;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v10, 0x2

    .line 38
    const/4 v11, 0x0

    .line 39
    if-gt v0, v2, :cond_0

    .line 40
    .line 41
    const-string v0, "No open sessions to be closed."

    .line 42
    .line 43
    invoke-static {v7, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_35

    .line 48
    .line 49
    invoke-static {v7, v0, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v12, v0

    .line 58
    check-cast v12, Ljava/lang/String;

    .line 59
    .line 60
    const/16 v16, 0x4

    .line 61
    .line 62
    const/16 v17, 0x8

    .line 63
    .line 64
    const/4 v13, 0x0

    .line 65
    if-eqz p3, :cond_15

    .line 66
    .line 67
    invoke-virtual/range {p2 .. p2}, La/sd60;->e()La/lwi0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, La/lwi0;->b:La/c34;

    .line 72
    .line 73
    iget-boolean v0, v0, La/c34;->b:Z

    .line 74
    .line 75
    if-eqz v0, :cond_15

    .line 76
    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    const/16 v10, 0x1e

    .line 80
    .line 81
    if-lt v0, v10, :cond_14

    .line 82
    .line 83
    invoke-virtual {v5, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Landroid/app/ActivityManager;

    .line 88
    .line 89
    invoke-static {v0}, La/a7;->n(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_12

    .line 98
    .line 99
    new-instance v11, La/yzn0;

    .line 100
    .line 101
    invoke-direct {v11, v6}, La/yzn0;-><init>(La/xzp;)V

    .line 102
    .line 103
    .line 104
    sget-object v0, La/yzn0;->c:La/uuz;

    .line 105
    .line 106
    iput-object v0, v11, La/yzn0;->b:Ljava/lang/Object;

    .line 107
    .line 108
    if-nez v12, :cond_1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const-string v0, "userlog"

    .line 112
    .line 113
    invoke-virtual {v6, v12, v0}, La/xzp;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v14, La/ild0;

    .line 118
    .line 119
    invoke-direct {v14, v0}, La/ild0;-><init>(Ljava/io/File;)V

    .line 120
    .line 121
    .line 122
    iput-object v14, v11, La/yzn0;->b:Ljava/lang/Object;

    .line 123
    .line 124
    :goto_0
    iget-object v0, v1, La/f8f;->e:La/cu;

    .line 125
    .line 126
    new-instance v14, La/oa40;

    .line 127
    .line 128
    invoke-direct {v14, v6}, La/oa40;-><init>(La/xzp;)V

    .line 129
    .line 130
    .line 131
    new-instance v15, La/ywq0;

    .line 132
    .line 133
    invoke-direct {v15, v12, v6, v0}, La/ywq0;-><init>(Ljava/lang/String;La/xzp;La/cu;)V

    .line 134
    .line 135
    .line 136
    iget-object v0, v15, La/ywq0;->d:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, La/o24;

    .line 139
    .line 140
    iget-object v0, v0, La/o24;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, La/qmy;

    .line 149
    .line 150
    invoke-virtual {v14, v12, v13}, La/oa40;->c(Ljava/lang/String;Z)Ljava/util/Map;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v0, v2}, La/qmy;->c(Ljava/util/Map;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, v15, La/ywq0;->e:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/o24;

    .line 160
    .line 161
    iget-object v0, v0, La/o24;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, La/qmy;

    .line 170
    .line 171
    const/4 v2, 0x1

    .line 172
    invoke-virtual {v14, v12, v2}, La/oa40;->c(Ljava/lang/String;Z)Ljava/util/Map;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    invoke-virtual {v0, v13}, La/qmy;->c(Ljava/util/Map;)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v15, La/ywq0;->g:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 182
    .line 183
    invoke-virtual {v14, v12}, La/oa40;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/4 v13, 0x0

    .line 188
    invoke-virtual {v0, v2, v13}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v15, La/ywq0;->f:Ljava/lang/Object;

    .line 192
    .line 193
    move-object v2, v0

    .line 194
    check-cast v2, La/jdg0;

    .line 195
    .line 196
    const-string v13, "Failed to close rollouts state file."

    .line 197
    .line 198
    const-string v0, "Loaded rollouts state:\n"

    .line 199
    .line 200
    const-string v14, "rollouts-state"

    .line 201
    .line 202
    invoke-virtual {v6, v12, v14}, La/xzp;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 207
    .line 208
    .line 209
    move-result v20

    .line 210
    if-eqz v20, :cond_2

    .line 211
    .line 212
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 213
    .line 214
    .line 215
    move-result-wide v20

    .line 216
    const-wide/16 v22, 0x0

    .line 217
    .line 218
    cmp-long v20, v20, v22

    .line 219
    .line 220
    if-nez v20, :cond_3

    .line 221
    .line 222
    :cond_2
    move-object/from16 v20, v3

    .line 223
    .line 224
    move-object/from16 v21, v8

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_3
    move-object/from16 v20, v3

    .line 228
    .line 229
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    .line 230
    .line 231
    invoke-direct {v3, v14}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 232
    .line 233
    .line 234
    :try_start_1
    invoke-static {v3}, La/aad;->b0(Ljava/io/FileInputStream;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v21

    .line 238
    invoke-static/range {v21 .. v21}, La/oa40;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 239
    .line 240
    .line 241
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 242
    move-object/from16 v21, v8

    .line 243
    .line 244
    :try_start_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v0, "\nfor session "

    .line 253
    .line 254
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    const/4 v8, 0x3

    .line 265
    invoke-static {v7, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 266
    .line 267
    .line 268
    move-result v22

    .line 269
    if-eqz v22, :cond_4

    .line 270
    .line 271
    const/4 v8, 0x0

    .line 272
    invoke-static {v7, v0, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 273
    .line 274
    .line 275
    :cond_4
    invoke-static {v3, v13}, La/aad;->J(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :goto_1
    move-object v11, v3

    .line 280
    goto :goto_3

    .line 281
    :catchall_0
    move-exception v0

    .line 282
    goto :goto_1

    .line 283
    :catch_0
    move-exception v0

    .line 284
    goto :goto_2

    .line 285
    :catch_1
    move-exception v0

    .line 286
    move-object/from16 v21, v8

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :catchall_1
    move-exception v0

    .line 290
    const/4 v11, 0x0

    .line 291
    goto :goto_3

    .line 292
    :catch_2
    move-exception v0

    .line 293
    move-object/from16 v21, v8

    .line 294
    .line 295
    const/4 v3, 0x0

    .line 296
    :goto_2
    :try_start_3
    const-string v1, "Error deserializing rollouts state."

    .line 297
    .line 298
    invoke-static {v7, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 299
    .line 300
    .line 301
    invoke-static {v14}, La/oa40;->f(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 302
    .line 303
    .line 304
    invoke-static {v3, v13}, La/aad;->J(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :goto_3
    invoke-static {v11, v13}, La/aad;->J(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v0

    .line 314
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    const-string v1, "The file has a length of zero for session: "

    .line 317
    .line 318
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v14, v0}, La/oa40;->g(Ljava/io/File;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 332
    .line 333
    :goto_5
    invoke-virtual {v2, v1}, La/jdg0;->d(Ljava/util/List;)Z

    .line 334
    .line 335
    .line 336
    new-instance v0, La/eki0;

    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    invoke-direct {v0, v13}, La/eki0;-><init>(B)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v9, v12, v10, v0}, La/ywq0;->g(Ljava/lang/String;Ljava/util/List;Ljava/util/function/Predicate;)Landroid/app/ApplicationExitInfo;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    if-nez v1, :cond_6

    .line 347
    .line 348
    const-string v0, "No relevant ApplicationExitInfo occurred during session: "

    .line 349
    .line 350
    invoke-static {v0, v12}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const/4 v1, 0x2

    .line 355
    invoke-static {v7, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_5

    .line 360
    .line 361
    const/4 v8, 0x0

    .line 362
    invoke-static {v7, v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 363
    .line 364
    .line 365
    :cond_5
    move-object/from16 v31, v4

    .line 366
    .line 367
    move-object/from16 v30, v6

    .line 368
    .line 369
    goto/16 :goto_a

    .line 370
    .line 371
    :cond_6
    iget-object v0, v9, La/ywq0;->a:Ljava/lang/Object;

    .line 372
    .line 373
    move-object v2, v0

    .line 374
    check-cast v2, La/s9f;

    .line 375
    .line 376
    :try_start_4
    invoke-static {v1}, La/tmb0;->m(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    if-eqz v0, :cond_7

    .line 381
    .line 382
    invoke-static {v0}, La/ywq0;->e(Ljava/io/InputStream;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 386
    goto :goto_6

    .line 387
    :catch_3
    move-exception v0

    .line 388
    new-instance v3, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    const-string v8, "Could not get input trace in application exit info: "

    .line 391
    .line 392
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v1}, La/tmb0;->n(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    const-string v8, " Error: "

    .line 403
    .line 404
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    const/4 v8, 0x0

    .line 415
    invoke-static {v7, v0, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 416
    .line 417
    .line 418
    :cond_7
    const/4 v0, 0x0

    .line 419
    :goto_6
    new-instance v3, La/y15;

    .line 420
    .line 421
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-static {v1}, La/tmb0;->c(Landroid/app/ApplicationExitInfo;)I

    .line 425
    .line 426
    .line 427
    move-result v8

    .line 428
    iput v8, v3, La/y15;->d:I

    .line 429
    .line 430
    iget-byte v8, v3, La/y15;->j:B

    .line 431
    .line 432
    or-int/lit8 v8, v8, 0x4

    .line 433
    .line 434
    int-to-byte v8, v8

    .line 435
    iput-byte v8, v3, La/y15;->j:B

    .line 436
    .line 437
    invoke-static {v1}, La/tmb0;->z(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    if-eqz v8, :cond_11

    .line 442
    .line 443
    iput-object v8, v3, La/y15;->b:Ljava/lang/String;

    .line 444
    .line 445
    invoke-static {v1}, La/tmb0;->w(Landroid/app/ApplicationExitInfo;)I

    .line 446
    .line 447
    .line 448
    move-result v8

    .line 449
    iput v8, v3, La/y15;->c:I

    .line 450
    .line 451
    iget-byte v8, v3, La/y15;->j:B

    .line 452
    .line 453
    const/16 v18, 0x2

    .line 454
    .line 455
    or-int/lit8 v8, v8, 0x2

    .line 456
    .line 457
    int-to-byte v8, v8

    .line 458
    iput-byte v8, v3, La/y15;->j:B

    .line 459
    .line 460
    invoke-static {v1}, La/a7;->d(Landroid/app/ApplicationExitInfo;)J

    .line 461
    .line 462
    .line 463
    move-result-wide v13

    .line 464
    iput-wide v13, v3, La/y15;->g:J

    .line 465
    .line 466
    iget-byte v8, v3, La/y15;->j:B

    .line 467
    .line 468
    or-int/lit8 v8, v8, 0x20

    .line 469
    .line 470
    int-to-byte v8, v8

    .line 471
    iput-byte v8, v3, La/y15;->j:B

    .line 472
    .line 473
    invoke-static {v1}, La/tmb0;->C(Landroid/app/ApplicationExitInfo;)I

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    iput v8, v3, La/y15;->a:I

    .line 478
    .line 479
    iget-byte v8, v3, La/y15;->j:B

    .line 480
    .line 481
    const/16 v19, 0x1

    .line 482
    .line 483
    or-int/lit8 v8, v8, 0x1

    .line 484
    .line 485
    int-to-byte v8, v8

    .line 486
    iput-byte v8, v3, La/y15;->j:B

    .line 487
    .line 488
    invoke-static {v1}, La/tmb0;->x(Landroid/app/ApplicationExitInfo;)J

    .line 489
    .line 490
    .line 491
    move-result-wide v13

    .line 492
    iput-wide v13, v3, La/y15;->e:J

    .line 493
    .line 494
    iget-byte v8, v3, La/y15;->j:B

    .line 495
    .line 496
    or-int/lit8 v8, v8, 0x8

    .line 497
    .line 498
    int-to-byte v8, v8

    .line 499
    iput-byte v8, v3, La/y15;->j:B

    .line 500
    .line 501
    invoke-static {v1}, La/tmb0;->D(Landroid/app/ApplicationExitInfo;)J

    .line 502
    .line 503
    .line 504
    move-result-wide v13

    .line 505
    iput-wide v13, v3, La/y15;->f:J

    .line 506
    .line 507
    iget-byte v1, v3, La/y15;->j:B

    .line 508
    .line 509
    or-int/lit8 v1, v1, 0x10

    .line 510
    .line 511
    int-to-byte v1, v1

    .line 512
    iput-byte v1, v3, La/y15;->j:B

    .line 513
    .line 514
    iput-object v0, v3, La/y15;->h:Ljava/lang/String;

    .line 515
    .line 516
    invoke-virtual {v3}, La/y15;->a()La/z15;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    iget-object v1, v2, La/s9f;->a:Landroid/content/Context;

    .line 521
    .line 522
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 531
    .line 532
    new-instance v3, La/m25;

    .line 533
    .line 534
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 535
    .line 536
    .line 537
    const-string v8, "anr"

    .line 538
    .line 539
    iput-object v8, v3, La/m25;->b:Ljava/lang/String;

    .line 540
    .line 541
    iget-wide v13, v0, La/z15;->g:J

    .line 542
    .line 543
    iput-wide v13, v3, La/m25;->a:J

    .line 544
    .line 545
    iget-byte v8, v3, La/m25;->g:B

    .line 546
    .line 547
    const/16 v19, 0x1

    .line 548
    .line 549
    or-int/lit8 v8, v8, 0x1

    .line 550
    .line 551
    int-to-byte v8, v8

    .line 552
    iput-byte v8, v3, La/m25;->g:B

    .line 553
    .line 554
    iget-object v8, v2, La/s9f;->c:La/rrd;

    .line 555
    .line 556
    iget-object v10, v2, La/s9f;->e:La/sd60;

    .line 557
    .line 558
    invoke-virtual {v10}, La/sd60;->e()La/lwi0;

    .line 559
    .line 560
    .line 561
    move-result-object v10

    .line 562
    iget-object v10, v10, La/lwi0;->b:La/c34;

    .line 563
    .line 564
    iget-boolean v10, v10, La/c34;->c:Z

    .line 565
    .line 566
    if-eqz v10, :cond_c

    .line 567
    .line 568
    iget-object v10, v8, La/rrd;->d:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v10, Ljava/util/ArrayList;

    .line 571
    .line 572
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    if-lez v10, :cond_c

    .line 577
    .line 578
    new-instance v10, Ljava/util/ArrayList;

    .line 579
    .line 580
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 581
    .line 582
    .line 583
    iget-object v8, v8, La/rrd;->d:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v8, Ljava/util/ArrayList;

    .line 586
    .line 587
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 588
    .line 589
    .line 590
    move-result-object v8

    .line 591
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 592
    .line 593
    .line 594
    move-result v22

    .line 595
    if-eqz v22, :cond_b

    .line 596
    .line 597
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v22

    .line 601
    move/from16 v29, v1

    .line 602
    .line 603
    move-object/from16 v1, v22

    .line 604
    .line 605
    check-cast v1, La/cb9;

    .line 606
    .line 607
    move-object/from16 p2, v8

    .line 608
    .line 609
    iget-object v8, v1, La/cb9;->a:Ljava/lang/String;

    .line 610
    .line 611
    if-eqz v8, :cond_a

    .line 612
    .line 613
    move-object/from16 v30, v6

    .line 614
    .line 615
    iget-object v6, v1, La/cb9;->b:Ljava/lang/String;

    .line 616
    .line 617
    if-eqz v6, :cond_9

    .line 618
    .line 619
    iget-object v1, v1, La/cb9;->c:Ljava/lang/String;

    .line 620
    .line 621
    if-eqz v1, :cond_8

    .line 622
    .line 623
    move-object/from16 v31, v4

    .line 624
    .line 625
    new-instance v4, La/a25;

    .line 626
    .line 627
    invoke-direct {v4, v6, v8, v1}, La/a25;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-object/from16 v8, p2

    .line 634
    .line 635
    move/from16 v1, v29

    .line 636
    .line 637
    move-object/from16 v6, v30

    .line 638
    .line 639
    move-object/from16 v4, v31

    .line 640
    .line 641
    goto :goto_7

    .line 642
    :cond_8
    const-string v0, "Null buildId"

    .line 643
    .line 644
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    return-void

    .line 648
    :cond_9
    const-string v0, "Null arch"

    .line 649
    .line 650
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    return-void

    .line 654
    :cond_a
    const-string v0, "Null libraryName"

    .line 655
    .line 656
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    return-void

    .line 660
    :cond_b
    move/from16 v29, v1

    .line 661
    .line 662
    move-object/from16 v31, v4

    .line 663
    .line 664
    move-object/from16 v30, v6

    .line 665
    .line 666
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    goto :goto_8

    .line 671
    :cond_c
    move/from16 v29, v1

    .line 672
    .line 673
    move-object/from16 v31, v4

    .line 674
    .line 675
    move-object/from16 v30, v6

    .line 676
    .line 677
    const/4 v1, 0x0

    .line 678
    :goto_8
    new-instance v4, La/y15;

    .line 679
    .line 680
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 681
    .line 682
    .line 683
    iget v6, v0, La/z15;->d:I

    .line 684
    .line 685
    iput v6, v4, La/y15;->d:I

    .line 686
    .line 687
    iget-byte v6, v4, La/y15;->j:B

    .line 688
    .line 689
    or-int/lit8 v6, v6, 0x4

    .line 690
    .line 691
    int-to-byte v6, v6

    .line 692
    iput-byte v6, v4, La/y15;->j:B

    .line 693
    .line 694
    iget-object v8, v0, La/z15;->b:Ljava/lang/String;

    .line 695
    .line 696
    if-eqz v8, :cond_10

    .line 697
    .line 698
    iput-object v8, v4, La/y15;->b:Ljava/lang/String;

    .line 699
    .line 700
    iget v8, v0, La/z15;->c:I

    .line 701
    .line 702
    iput v8, v4, La/y15;->c:I

    .line 703
    .line 704
    const/16 v18, 0x2

    .line 705
    .line 706
    or-int/lit8 v6, v6, 0x2

    .line 707
    .line 708
    int-to-byte v6, v6

    .line 709
    iput-wide v13, v4, La/y15;->g:J

    .line 710
    .line 711
    or-int/lit8 v6, v6, 0x20

    .line 712
    .line 713
    int-to-byte v6, v6

    .line 714
    iget v8, v0, La/z15;->a:I

    .line 715
    .line 716
    iput v8, v4, La/y15;->a:I

    .line 717
    .line 718
    const/16 v19, 0x1

    .line 719
    .line 720
    or-int/lit8 v6, v6, 0x1

    .line 721
    .line 722
    int-to-byte v6, v6

    .line 723
    iget-wide v13, v0, La/z15;->e:J

    .line 724
    .line 725
    iput-wide v13, v4, La/y15;->e:J

    .line 726
    .line 727
    or-int/lit8 v6, v6, 0x8

    .line 728
    .line 729
    int-to-byte v6, v6

    .line 730
    iget-wide v13, v0, La/z15;->f:J

    .line 731
    .line 732
    iput-wide v13, v4, La/y15;->f:J

    .line 733
    .line 734
    or-int/lit8 v6, v6, 0x10

    .line 735
    .line 736
    int-to-byte v6, v6

    .line 737
    iput-byte v6, v4, La/y15;->j:B

    .line 738
    .line 739
    iget-object v0, v0, La/z15;->h:Ljava/lang/String;

    .line 740
    .line 741
    iput-object v0, v4, La/y15;->h:Ljava/lang/String;

    .line 742
    .line 743
    iput-object v1, v4, La/y15;->i:Ljava/util/List;

    .line 744
    .line 745
    invoke-virtual {v4}, La/y15;->a()La/z15;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    iget v1, v0, La/z15;->d:I

    .line 750
    .line 751
    const/16 v4, 0x64

    .line 752
    .line 753
    if-eq v1, v4, :cond_d

    .line 754
    .line 755
    const/4 v4, 0x1

    .line 756
    goto :goto_9

    .line 757
    :cond_d
    const/4 v4, 0x0

    .line 758
    :goto_9
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    iget-object v6, v0, La/z15;->b:Ljava/lang/String;

    .line 763
    .line 764
    iget v8, v0, La/z15;->a:I

    .line 765
    .line 766
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    new-instance v10, La/kjv;

    .line 770
    .line 771
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 772
    .line 773
    .line 774
    iput-object v6, v10, La/kjv;->e:Ljava/io/Serializable;

    .line 775
    .line 776
    iput v8, v10, La/kjv;->a:I

    .line 777
    .line 778
    iget-byte v6, v10, La/kjv;->d:B

    .line 779
    .line 780
    const/16 v19, 0x1

    .line 781
    .line 782
    or-int/lit8 v6, v6, 0x1

    .line 783
    .line 784
    int-to-byte v6, v6

    .line 785
    iput v1, v10, La/kjv;->b:I

    .line 786
    .line 787
    const/16 v18, 0x2

    .line 788
    .line 789
    or-int/lit8 v1, v6, 0x2

    .line 790
    .line 791
    int-to-byte v1, v1

    .line 792
    const/4 v13, 0x0

    .line 793
    iput-boolean v13, v10, La/kjv;->c:Z

    .line 794
    .line 795
    or-int/lit8 v1, v1, 0x4

    .line 796
    .line 797
    int-to-byte v1, v1

    .line 798
    iput-byte v1, v10, La/kjv;->d:B

    .line 799
    .line 800
    invoke-virtual {v10}, La/kjv;->a()La/x25;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    invoke-static {}, La/s9f;->e()La/t25;

    .line 805
    .line 806
    .line 807
    move-result-object v27

    .line 808
    invoke-virtual {v2}, La/s9f;->a()Ljava/util/List;

    .line 809
    .line 810
    .line 811
    move-result-object v28

    .line 812
    if-eqz v28, :cond_f

    .line 813
    .line 814
    new-instance v22, La/q25;

    .line 815
    .line 816
    const/16 v23, 0x0

    .line 817
    .line 818
    const/16 v24, 0x0

    .line 819
    .line 820
    const/16 v26, 0x0

    .line 821
    .line 822
    move-object/from16 v25, v0

    .line 823
    .line 824
    invoke-direct/range {v22 .. v28}, La/q25;-><init>(Ljava/util/List;La/b9f;La/r8f;La/w8f;La/t25;Ljava/util/List;)V

    .line 825
    .line 826
    .line 827
    new-instance v0, La/p25;

    .line 828
    .line 829
    const/16 v25, 0x0

    .line 830
    .line 831
    const/16 v28, 0x0

    .line 832
    .line 833
    move-object/from16 v27, v1

    .line 834
    .line 835
    move-object/from16 v26, v4

    .line 836
    .line 837
    move-object/from16 v23, v22

    .line 838
    .line 839
    move-object/from16 v22, v0

    .line 840
    .line 841
    invoke-direct/range {v22 .. v29}, La/p25;-><init>(La/f9f;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;La/g9f;Ljava/util/List;I)V

    .line 842
    .line 843
    .line 844
    move-object/from16 v1, v22

    .line 845
    .line 846
    move/from16 v0, v29

    .line 847
    .line 848
    iput-object v1, v3, La/m25;->c:La/h9f;

    .line 849
    .line 850
    invoke-virtual {v2, v0}, La/s9f;->b(I)La/z25;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    iput-object v0, v3, La/m25;->d:La/i9f;

    .line 855
    .line 856
    invoke-virtual {v3}, La/m25;->a()La/n25;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    const-string v1, "Persisting anr for session "

    .line 861
    .line 862
    invoke-static {v1, v12}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    const/4 v8, 0x3

    .line 867
    invoke-static {v7, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 868
    .line 869
    .line 870
    move-result v2

    .line 871
    if-eqz v2, :cond_e

    .line 872
    .line 873
    const/4 v8, 0x0

    .line 874
    invoke-static {v7, v1, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 875
    .line 876
    .line 877
    :cond_e
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 878
    .line 879
    invoke-static {v0, v11, v15, v1}, La/ywq0;->a(La/n25;La/yzn0;La/ywq0;Ljava/util/Map;)La/n25;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-static {v0, v15}, La/ywq0;->b(La/n25;La/ywq0;)La/n9f;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    iget-object v1, v9, La/ywq0;->b:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v1, La/x9f;

    .line 890
    .line 891
    const/4 v2, 0x1

    .line 892
    invoke-virtual {v1, v0, v12, v2}, La/x9f;->e(La/n9f;Ljava/lang/String;Z)V

    .line 893
    .line 894
    .line 895
    :goto_a
    const/4 v1, 0x2

    .line 896
    goto :goto_b

    .line 897
    :cond_f
    const-string v0, "Null binaries"

    .line 898
    .line 899
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    return-void

    .line 903
    :cond_10
    const-string v0, "Null processName"

    .line 904
    .line 905
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    return-void

    .line 909
    :cond_11
    const-string v0, "Null processName"

    .line 910
    .line 911
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    return-void

    .line 915
    :cond_12
    move-object/from16 v20, v3

    .line 916
    .line 917
    move-object/from16 v31, v4

    .line 918
    .line 919
    move-object/from16 v30, v6

    .line 920
    .line 921
    move-object/from16 v21, v8

    .line 922
    .line 923
    const-string v0, "No ApplicationExitInfo available. Session: "

    .line 924
    .line 925
    invoke-static {v0, v12}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    const/4 v1, 0x2

    .line 930
    invoke-static {v7, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 931
    .line 932
    .line 933
    move-result v2

    .line 934
    if-eqz v2, :cond_13

    .line 935
    .line 936
    const/4 v8, 0x0

    .line 937
    invoke-static {v7, v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 938
    .line 939
    .line 940
    goto :goto_c

    .line 941
    :cond_13
    :goto_b
    const/4 v8, 0x0

    .line 942
    goto :goto_c

    .line 943
    :cond_14
    move-object/from16 v20, v3

    .line 944
    .line 945
    move-object/from16 v31, v4

    .line 946
    .line 947
    move-object/from16 v30, v6

    .line 948
    .line 949
    move-object/from16 v21, v8

    .line 950
    .line 951
    move-object v8, v11

    .line 952
    const/4 v1, 0x2

    .line 953
    const-string v2, "ANR feature enabled, but device is API "

    .line 954
    .line 955
    invoke-static {v0, v2}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    invoke-static {v7, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 960
    .line 961
    .line 962
    move-result v2

    .line 963
    if-eqz v2, :cond_16

    .line 964
    .line 965
    invoke-static {v7, v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 966
    .line 967
    .line 968
    goto :goto_c

    .line 969
    :cond_15
    move-object/from16 v20, v3

    .line 970
    .line 971
    move-object/from16 v31, v4

    .line 972
    .line 973
    move-object/from16 v30, v6

    .line 974
    .line 975
    move-object/from16 v21, v8

    .line 976
    .line 977
    move v1, v10

    .line 978
    move-object v8, v11

    .line 979
    const-string v0, "ANR feature disabled."

    .line 980
    .line 981
    invoke-static {v7, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    if-eqz v2, :cond_16

    .line 986
    .line 987
    invoke-static {v7, v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 988
    .line 989
    .line 990
    :cond_16
    :goto_c
    if-eqz p3, :cond_18

    .line 991
    .line 992
    invoke-virtual/range {v20 .. v20}, La/k8f;->c()Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    if-eqz v0, :cond_18

    .line 997
    .line 998
    const-string v0, "Finalizing native report for session "

    .line 999
    .line 1000
    invoke-static {v0, v12}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    invoke-static {v7, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v2

    .line 1008
    if-eqz v2, :cond_17

    .line 1009
    .line 1010
    invoke-static {v7, v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1011
    .line 1012
    .line 1013
    :cond_17
    invoke-virtual/range {v20 .. v20}, La/k8f;->a()La/kwd;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1021
    .line 1022
    const-string v1, "No minidump data found for session "

    .line 1023
    .line 1024
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-static {v7, v0, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1035
    .line 1036
    .line 1037
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1038
    .line 1039
    const-string v1, "No Tombstones data found for session "

    .line 1040
    .line 1041
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    invoke-static {v7, v0, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1052
    .line 1053
    .line 1054
    const-string v0, "No native core present"

    .line 1055
    .line 1056
    invoke-static {v7, v0, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1057
    .line 1058
    .line 1059
    :cond_18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1060
    .line 1061
    const/16 v1, 0x25

    .line 1062
    .line 1063
    if-lt v0, v1, :cond_1b

    .line 1064
    .line 1065
    move-object/from16 v1, v31

    .line 1066
    .line 1067
    invoke-virtual {v5, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    check-cast v0, Landroid/app/ActivityManager;

    .line 1072
    .line 1073
    new-instance v1, La/z7f;

    .line 1074
    .line 1075
    const/4 v2, 0x2

    .line 1076
    invoke-direct {v1, v2}, La/z7f;-><init>(B)V

    .line 1077
    .line 1078
    .line 1079
    new-instance v2, Ljava/io/File;

    .line 1080
    .line 1081
    move-object/from16 v3, v30

    .line 1082
    .line 1083
    iget-object v3, v3, La/xzp;->d:Ljava/lang/Object;

    .line 1084
    .line 1085
    check-cast v3, Ljava/io/File;

    .line 1086
    .line 1087
    invoke-direct {v2, v3, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v2, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v1

    .line 1097
    invoke-static {v1}, La/xzp;->V([Ljava/lang/Object;)Ljava/util/List;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v1

    .line 1101
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v1

    .line 1105
    new-instance v2, La/t24;

    .line 1106
    .line 1107
    const/4 v3, 0x1

    .line 1108
    invoke-direct {v2, v3}, La/t24;-><init>(B)V

    .line 1109
    .line 1110
    .line 1111
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v1

    .line 1115
    new-instance v2, La/c8f;

    .line 1116
    .line 1117
    const/4 v13, 0x0

    .line 1118
    invoke-direct {v2, v13}, La/c8f;-><init>(B)V

    .line 1119
    .line 1120
    .line 1121
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    check-cast v1, Ljava/util/List;

    .line 1134
    .line 1135
    invoke-static {v0}, La/a7;->n(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v1

    .line 1143
    invoke-interface {v1}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    invoke-virtual {v1}, Ljava/util/Optional;->isPresent()Z

    .line 1148
    .line 1149
    .line 1150
    move-result v2

    .line 1151
    if-eqz v2, :cond_19

    .line 1152
    .line 1153
    goto :goto_f

    .line 1154
    :cond_19
    new-instance v1, La/eki0;

    .line 1155
    .line 1156
    const/4 v2, 0x1

    .line 1157
    invoke-direct {v1, v2}, La/eki0;-><init>(B)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v9, v12, v0, v1}, La/ywq0;->g(Ljava/lang/String;Ljava/util/List;Ljava/util/function/Predicate;)Landroid/app/ApplicationExitInfo;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v0

    .line 1164
    if-eqz v0, :cond_1a

    .line 1165
    .line 1166
    const/4 v0, 0x7

    .line 1167
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    invoke-static {v0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v0

    .line 1175
    :goto_d
    move-object v1, v0

    .line 1176
    goto :goto_e

    .line 1177
    :cond_1a
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    goto :goto_d

    .line 1182
    :goto_e
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    :goto_f
    new-instance v0, La/fki0;

    .line 1186
    .line 1187
    invoke-direct {v0, v9, v12}, La/fki0;-><init>(La/ywq0;Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v1, v0}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    .line 1191
    .line 1192
    .line 1193
    :cond_1b
    if-eqz p1, :cond_1c

    .line 1194
    .line 1195
    move-object/from16 v1, v21

    .line 1196
    .line 1197
    const/4 v13, 0x0

    .line 1198
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    check-cast v0, Ljava/lang/String;

    .line 1203
    .line 1204
    goto :goto_10

    .line 1205
    :cond_1c
    move-object/from16 v1, p0

    .line 1206
    .line 1207
    const/4 v13, 0x0

    .line 1208
    iget-object v0, v1, La/f8f;->l:La/a8f;

    .line 1209
    .line 1210
    const/4 v8, 0x0

    .line 1211
    invoke-virtual {v0, v8}, La/a8f;->a(Ljava/lang/String;)V

    .line 1212
    .line 1213
    .line 1214
    const/4 v0, 0x0

    .line 1215
    :goto_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1216
    .line 1217
    .line 1218
    move-result-wide v1

    .line 1219
    const-wide/16 v3, 0x3e8

    .line 1220
    .line 1221
    div-long/2addr v1, v3

    .line 1222
    iget-object v3, v9, La/ywq0;->b:Ljava/lang/Object;

    .line 1223
    .line 1224
    check-cast v3, La/x9f;

    .line 1225
    .line 1226
    iget-object v4, v3, La/x9f;->b:La/xzp;

    .line 1227
    .line 1228
    const-string v5, ".com.google.firebase.crashlytics"

    .line 1229
    .line 1230
    invoke-virtual {v4, v5}, La/xzp;->g(Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    const-string v5, ".com.google.firebase.crashlytics-ndk"

    .line 1234
    .line 1235
    invoke-virtual {v4, v5}, La/xzp;->g(Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    iget-object v5, v4, La/xzp;->a:Ljava/lang/Object;

    .line 1239
    .line 1240
    check-cast v5, Ljava/lang/String;

    .line 1241
    .line 1242
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 1243
    .line 1244
    .line 1245
    move-result v5

    .line 1246
    if-nez v5, :cond_1d

    .line 1247
    .line 1248
    const-string v5, ".com.google.firebase.crashlytics.files.v1"

    .line 1249
    .line 1250
    invoke-virtual {v4, v5}, La/xzp;->g(Ljava/lang/String;)V

    .line 1251
    .line 1252
    .line 1253
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1254
    .line 1255
    const-string v6, ".com.google.firebase.crashlytics.files.v2"

    .line 1256
    .line 1257
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1258
    .line 1259
    .line 1260
    sget-object v6, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    .line 1261
    .line 1262
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v5

    .line 1269
    iget-object v6, v4, La/xzp;->b:Ljava/lang/Object;

    .line 1270
    .line 1271
    check-cast v6, Ljava/io/File;

    .line 1272
    .line 1273
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 1274
    .line 1275
    .line 1276
    move-result v8

    .line 1277
    if-eqz v8, :cond_1d

    .line 1278
    .line 1279
    new-instance v8, La/yrd;

    .line 1280
    .line 1281
    const/4 v9, 0x1

    .line 1282
    invoke-direct {v8, v5, v9}, La/yrd;-><init>(Ljava/lang/String;B)V

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v6, v8}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v5

    .line 1289
    if-eqz v5, :cond_1e

    .line 1290
    .line 1291
    array-length v6, v5

    .line 1292
    move v8, v13

    .line 1293
    :goto_11
    if-ge v8, v6, :cond_1e

    .line 1294
    .line 1295
    aget-object v10, v5, v8

    .line 1296
    .line 1297
    invoke-virtual {v4, v10}, La/xzp;->g(Ljava/lang/String;)V

    .line 1298
    .line 1299
    .line 1300
    add-int/lit8 v8, v8, 0x1

    .line 1301
    .line 1302
    goto :goto_11

    .line 1303
    :cond_1d
    const/4 v9, 0x1

    .line 1304
    :cond_1e
    invoke-virtual {v3}, La/x9f;->d()Ljava/util/NavigableSet;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v5

    .line 1308
    if-eqz v0, :cond_1f

    .line 1309
    .line 1310
    invoke-interface {v5, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    :cond_1f
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 1314
    .line 1315
    .line 1316
    move-result v0

    .line 1317
    move/from16 v6, v17

    .line 1318
    .line 1319
    if-gt v0, v6, :cond_20

    .line 1320
    .line 1321
    goto :goto_13

    .line 1322
    :cond_20
    :goto_12
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 1323
    .line 1324
    .line 1325
    move-result v0

    .line 1326
    if-le v0, v6, :cond_22

    .line 1327
    .line 1328
    invoke-interface {v5}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    check-cast v0, Ljava/lang/String;

    .line 1333
    .line 1334
    const-string v8, "Removing session over cap: "

    .line 1335
    .line 1336
    invoke-static {v8, v0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v8

    .line 1340
    const/4 v10, 0x3

    .line 1341
    invoke-static {v7, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v11

    .line 1345
    if-eqz v11, :cond_21

    .line 1346
    .line 1347
    const/4 v10, 0x0

    .line 1348
    invoke-static {v7, v8, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1349
    .line 1350
    .line 1351
    :cond_21
    new-instance v8, Ljava/io/File;

    .line 1352
    .line 1353
    iget-object v10, v4, La/xzp;->d:Ljava/lang/Object;

    .line 1354
    .line 1355
    check-cast v10, Ljava/io/File;

    .line 1356
    .line 1357
    invoke-direct {v8, v10, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1358
    .line 1359
    .line 1360
    invoke-static {v8}, La/xzp;->T(Ljava/io/File;)Z

    .line 1361
    .line 1362
    .line 1363
    invoke-interface {v5, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1364
    .line 1365
    .line 1366
    goto :goto_12

    .line 1367
    :cond_22
    :goto_13
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v5

    .line 1371
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1372
    .line 1373
    .line 1374
    move-result v0

    .line 1375
    if-eqz v0, :cond_33

    .line 1376
    .line 1377
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    move-object v6, v0

    .line 1382
    check-cast v6, Ljava/lang/String;

    .line 1383
    .line 1384
    const-string v0, "Finalizing report for session "

    .line 1385
    .line 1386
    invoke-static {v0, v6}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    const/4 v8, 0x2

    .line 1391
    invoke-static {v7, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1392
    .line 1393
    .line 1394
    move-result v10

    .line 1395
    if-eqz v10, :cond_23

    .line 1396
    .line 1397
    const/4 v8, 0x0

    .line 1398
    invoke-static {v7, v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1399
    .line 1400
    .line 1401
    :cond_23
    sget-object v8, La/x9f;->g:La/v9f;

    .line 1402
    .line 1403
    sget-object v0, La/x9f;->i:La/z7f;

    .line 1404
    .line 1405
    new-instance v10, Ljava/io/File;

    .line 1406
    .line 1407
    iget-object v11, v4, La/xzp;->d:Ljava/lang/Object;

    .line 1408
    .line 1409
    check-cast v11, Ljava/io/File;

    .line 1410
    .line 1411
    invoke-direct {v10, v11, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v10, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    invoke-static {v0}, La/xzp;->V([Ljava/lang/Object;)Ljava/util/List;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v0

    .line 1425
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1426
    .line 1427
    .line 1428
    move-result v10

    .line 1429
    if-eqz v10, :cond_25

    .line 1430
    .line 1431
    const-string v0, "Session "

    .line 1432
    .line 1433
    const-string v8, " has no events."

    .line 1434
    .line 1435
    invoke-static {v0, v6, v8}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v0

    .line 1439
    const/4 v8, 0x2

    .line 1440
    invoke-static {v7, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1441
    .line 1442
    .line 1443
    move-result v10

    .line 1444
    if-eqz v10, :cond_24

    .line 1445
    .line 1446
    const/4 v8, 0x0

    .line 1447
    invoke-static {v7, v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1448
    .line 1449
    .line 1450
    :cond_24
    const/4 v11, 0x3

    .line 1451
    const/4 v15, 0x0

    .line 1452
    :goto_15
    const/16 v18, 0x2

    .line 1453
    .line 1454
    goto/16 :goto_25

    .line 1455
    .line 1456
    :cond_25
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1457
    .line 1458
    .line 1459
    new-instance v10, Ljava/util/ArrayList;

    .line 1460
    .line 1461
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1462
    .line 1463
    .line 1464
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v11

    .line 1468
    move v12, v13

    .line 1469
    :goto_16
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1470
    .line 1471
    .line 1472
    move-result v0

    .line 1473
    if-eqz v0, :cond_28

    .line 1474
    .line 1475
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v0

    .line 1479
    move-object v14, v0

    .line 1480
    check-cast v14, Ljava/io/File;

    .line 1481
    .line 1482
    :try_start_5
    invoke-static {v14}, La/x9f;->f(Ljava/io/File;)Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1487
    .line 1488
    .line 1489
    :try_start_6
    new-instance v15, Landroid/util/JsonReader;

    .line 1490
    .line 1491
    new-instance v9, Ljava/io/StringReader;

    .line 1492
    .line 1493
    invoke-direct {v9, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 1494
    .line 1495
    .line 1496
    invoke-direct {v15, v9}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 1497
    .line 1498
    .line 1499
    :try_start_7
    invoke-static {v15}, La/v9f;->d(Landroid/util/JsonReader;)La/n25;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1503
    :try_start_8
    invoke-virtual {v15}, Landroid/util/JsonReader;->close()V
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 1504
    .line 1505
    .line 1506
    :try_start_9
    invoke-virtual {v3, v6, v0}, La/x9f;->a(Ljava/lang/String;La/n25;)La/n9f;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v0

    .line 1510
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1511
    .line 1512
    .line 1513
    if-nez v12, :cond_27

    .line 1514
    .line 1515
    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    const-string v9, "event"

    .line 1520
    .line 1521
    invoke-virtual {v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1522
    .line 1523
    .line 1524
    move-result v9

    .line 1525
    if-eqz v9, :cond_26

    .line 1526
    .line 1527
    const-string v9, "_"

    .line 1528
    .line 1529
    invoke-virtual {v0, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1530
    .line 1531
    .line 1532
    move-result v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 1533
    if-eqz v0, :cond_26

    .line 1534
    .line 1535
    goto :goto_17

    .line 1536
    :cond_26
    move v0, v13

    .line 1537
    goto :goto_18

    .line 1538
    :catch_4
    move-exception v0

    .line 1539
    goto :goto_1b

    .line 1540
    :cond_27
    :goto_17
    const/4 v0, 0x1

    .line 1541
    :goto_18
    move v12, v0

    .line 1542
    goto :goto_1c

    .line 1543
    :catch_5
    move-exception v0

    .line 1544
    goto :goto_1a

    .line 1545
    :catchall_2
    move-exception v0

    .line 1546
    move-object v9, v0

    .line 1547
    :try_start_a
    invoke-virtual {v15}, Landroid/util/JsonReader;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1548
    .line 1549
    .line 1550
    goto :goto_19

    .line 1551
    :catchall_3
    move-exception v0

    .line 1552
    :try_start_b
    invoke-virtual {v9, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1553
    .line 1554
    .line 1555
    :goto_19
    throw v9
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4

    .line 1556
    :goto_1a
    :try_start_c
    new-instance v9, Ljava/io/IOException;

    .line 1557
    .line 1558
    invoke-direct {v9, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 1559
    .line 1560
    .line 1561
    throw v9
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4

    .line 1562
    :goto_1b
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1563
    .line 1564
    const-string v15, "Could not add event to report for "

    .line 1565
    .line 1566
    invoke-direct {v9, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v9

    .line 1576
    invoke-static {v7, v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1577
    .line 1578
    .line 1579
    :goto_1c
    const/4 v9, 0x1

    .line 1580
    goto :goto_16

    .line 1581
    :cond_28
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1582
    .line 1583
    .line 1584
    move-result v0

    .line 1585
    if-eqz v0, :cond_29

    .line 1586
    .line 1587
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1588
    .line 1589
    const-string v8, "Could not parse event files for session "

    .line 1590
    .line 1591
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v0

    .line 1601
    const/4 v8, 0x0

    .line 1602
    invoke-static {v7, v0, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1603
    .line 1604
    .line 1605
    move-object v15, v8

    .line 1606
    const/4 v11, 0x3

    .line 1607
    goto/16 :goto_15

    .line 1608
    .line 1609
    :cond_29
    new-instance v0, La/oa40;

    .line 1610
    .line 1611
    invoke-direct {v0, v4}, La/oa40;-><init>(La/xzp;)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v0, v6}, La/oa40;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v0

    .line 1618
    iget-object v9, v3, La/x9f;->d:La/a8f;

    .line 1619
    .line 1620
    iget-object v9, v9, La/a8f;->b:La/es;

    .line 1621
    .line 1622
    monitor-enter v9

    .line 1623
    :try_start_d
    iget-object v11, v9, La/es;->b:Ljava/lang/Object;

    .line 1624
    .line 1625
    check-cast v11, Ljava/lang/String;

    .line 1626
    .line 1627
    invoke-static {v11, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1628
    .line 1629
    .line 1630
    move-result v11

    .line 1631
    if-eqz v11, :cond_2a

    .line 1632
    .line 1633
    iget-object v11, v9, La/es;->c:Ljava/lang/Object;

    .line 1634
    .line 1635
    check-cast v11, Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 1636
    .line 1637
    monitor-exit v9

    .line 1638
    goto :goto_1e

    .line 1639
    :cond_2a
    :try_start_e
    iget-object v11, v9, La/es;->a:Ljava/lang/Object;

    .line 1640
    .line 1641
    check-cast v11, La/xzp;

    .line 1642
    .line 1643
    sget-object v14, La/es;->d:La/z7f;

    .line 1644
    .line 1645
    new-instance v15, Ljava/io/File;

    .line 1646
    .line 1647
    iget-object v11, v11, La/xzp;->d:Ljava/lang/Object;

    .line 1648
    .line 1649
    check-cast v11, Ljava/io/File;

    .line 1650
    .line 1651
    invoke-direct {v15, v11, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1652
    .line 1653
    .line 1654
    invoke-virtual {v15}, Ljava/io/File;->mkdirs()Z

    .line 1655
    .line 1656
    .line 1657
    invoke-virtual {v15, v14}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v11

    .line 1661
    invoke-static {v11}, La/xzp;->V([Ljava/lang/Object;)Ljava/util/List;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v11

    .line 1665
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1666
    .line 1667
    .line 1668
    move-result v14

    .line 1669
    if-eqz v14, :cond_2b

    .line 1670
    .line 1671
    const-string v11, "Unable to read App Quality Sessions session id."

    .line 1672
    .line 1673
    const-string v14, "FirebaseCrashlytics"

    .line 1674
    .line 1675
    const/4 v15, 0x0

    .line 1676
    invoke-static {v14, v11, v15}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1677
    .line 1678
    .line 1679
    const/4 v11, 0x0

    .line 1680
    goto :goto_1d

    .line 1681
    :cond_2b
    sget-object v14, La/es;->e:La/l13;

    .line 1682
    .line 1683
    invoke-static {v11, v14}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v11

    .line 1687
    check-cast v11, Ljava/io/File;

    .line 1688
    .line 1689
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v11

    .line 1693
    move/from16 v14, v16

    .line 1694
    .line 1695
    invoke-virtual {v11, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v11
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 1699
    :goto_1d
    monitor-exit v9

    .line 1700
    :goto_1e
    const-string v9, "report"

    .line 1701
    .line 1702
    invoke-virtual {v4, v6, v9}, La/xzp;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v9

    .line 1706
    const-string v14, "appQualitySessionId: "

    .line 1707
    .line 1708
    :try_start_f
    invoke-static {v9}, La/x9f;->f(Ljava/io/File;)Ljava/lang/String;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v15

    .line 1712
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1713
    .line 1714
    .line 1715
    invoke-static {v15}, La/v9f;->j(Ljava/lang/String;)La/w15;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v8

    .line 1719
    invoke-virtual {v8}, La/w15;->a()La/v15;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v15

    .line 1723
    iget-object v8, v8, La/w15;->k:La/q9f;
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    .line 1724
    .line 1725
    if-eqz v8, :cond_2d

    .line 1726
    .line 1727
    :try_start_10
    invoke-virtual {v8}, La/q9f;->a()La/g25;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v8

    .line 1731
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v13

    .line 1735
    iput-object v13, v8, La/g25;->e:Ljava/lang/Long;

    .line 1736
    .line 1737
    iput-boolean v12, v8, La/g25;->f:Z

    .line 1738
    .line 1739
    iget-byte v13, v8, La/g25;->m:B
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6

    .line 1740
    .line 1741
    const/16 v18, 0x2

    .line 1742
    .line 1743
    or-int/lit8 v13, v13, 0x2

    .line 1744
    .line 1745
    int-to-byte v13, v13

    .line 1746
    :try_start_11
    iput-byte v13, v8, La/g25;->m:B

    .line 1747
    .line 1748
    if-eqz v0, :cond_2c

    .line 1749
    .line 1750
    new-instance v13, La/h35;

    .line 1751
    .line 1752
    invoke-direct {v13, v0}, La/h35;-><init>(Ljava/lang/String;)V

    .line 1753
    .line 1754
    .line 1755
    iput-object v13, v8, La/g25;->h:La/p9f;

    .line 1756
    .line 1757
    :cond_2c
    invoke-virtual {v8}, La/g25;->a()La/h25;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v0

    .line 1761
    iput-object v0, v15, La/v15;->j:La/q9f;

    .line 1762
    .line 1763
    goto :goto_1f

    .line 1764
    :catch_6
    move-exception v0

    .line 1765
    const/16 v18, 0x2

    .line 1766
    .line 1767
    goto/16 :goto_22

    .line 1768
    .line 1769
    :cond_2d
    const/16 v18, 0x2

    .line 1770
    .line 1771
    :goto_1f
    invoke-virtual {v15}, La/v15;->a()La/w15;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v0

    .line 1775
    invoke-virtual {v0}, La/w15;->a()La/v15;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v8

    .line 1779
    iput-object v11, v8, La/v15;->g:Ljava/lang/String;

    .line 1780
    .line 1781
    iget-object v0, v0, La/w15;->k:La/q9f;

    .line 1782
    .line 1783
    if-eqz v0, :cond_2e

    .line 1784
    .line 1785
    invoke-virtual {v0}, La/q9f;->a()La/g25;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v0

    .line 1789
    iput-object v11, v0, La/g25;->c:Ljava/lang/String;

    .line 1790
    .line 1791
    invoke-virtual {v0}, La/g25;->a()La/h25;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v0

    .line 1795
    iput-object v0, v8, La/v15;->j:La/q9f;

    .line 1796
    .line 1797
    :cond_2e
    invoke-virtual {v8}, La/v15;->a()La/w15;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v0

    .line 1801
    iget-object v8, v0, La/w15;->k:La/q9f;

    .line 1802
    .line 1803
    if-eqz v8, :cond_32

    .line 1804
    .line 1805
    invoke-virtual {v0}, La/w15;->a()La/v15;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v0

    .line 1809
    invoke-virtual {v8}, La/q9f;->a()La/g25;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v8

    .line 1813
    iput-object v10, v8, La/g25;->k:Ljava/util/List;

    .line 1814
    .line 1815
    invoke-virtual {v8}, La/g25;->a()La/h25;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v8

    .line 1819
    iput-object v8, v0, La/v15;->j:La/q9f;

    .line 1820
    .line 1821
    invoke-virtual {v0}, La/v15;->a()La/w15;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    iget-object v8, v0, La/w15;->k:La/q9f;

    .line 1826
    .line 1827
    if-nez v8, :cond_2f

    .line 1828
    .line 1829
    const/4 v11, 0x3

    .line 1830
    const/4 v15, 0x0

    .line 1831
    goto :goto_25

    .line 1832
    :cond_2f
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1833
    .line 1834
    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1835
    .line 1836
    .line 1837
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1838
    .line 1839
    .line 1840
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v10
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9

    .line 1844
    const/4 v11, 0x3

    .line 1845
    :try_start_12
    invoke-static {v7, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1846
    .line 1847
    .line 1848
    move-result v13
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_8

    .line 1849
    if-eqz v13, :cond_30

    .line 1850
    .line 1851
    const/4 v15, 0x0

    .line 1852
    :try_start_13
    invoke-static {v7, v10, v15}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1853
    .line 1854
    .line 1855
    goto :goto_20

    .line 1856
    :cond_30
    const/4 v15, 0x0

    .line 1857
    :goto_20
    if-eqz v12, :cond_31

    .line 1858
    .line 1859
    check-cast v8, La/h25;

    .line 1860
    .line 1861
    iget-object v8, v8, La/h25;->b:Ljava/lang/String;

    .line 1862
    .line 1863
    new-instance v10, Ljava/io/File;

    .line 1864
    .line 1865
    iget-object v12, v4, La/xzp;->f:Ljava/lang/Object;

    .line 1866
    .line 1867
    check-cast v12, Ljava/io/File;

    .line 1868
    .line 1869
    invoke-direct {v10, v12, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1870
    .line 1871
    .line 1872
    goto :goto_21

    .line 1873
    :cond_31
    check-cast v8, La/h25;

    .line 1874
    .line 1875
    iget-object v8, v8, La/h25;->b:Ljava/lang/String;

    .line 1876
    .line 1877
    new-instance v10, Ljava/io/File;

    .line 1878
    .line 1879
    iget-object v12, v4, La/xzp;->e:Ljava/lang/Object;

    .line 1880
    .line 1881
    check-cast v12, Ljava/io/File;

    .line 1882
    .line 1883
    invoke-direct {v10, v12, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    :goto_21
    sget-object v8, La/v9f;->a:La/g2v;

    .line 1887
    .line 1888
    invoke-virtual {v8, v0}, La/g2v;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v0

    .line 1892
    invoke-static {v10, v0}, La/x9f;->g(Ljava/io/File;Ljava/lang/String;)V

    .line 1893
    .line 1894
    .line 1895
    goto :goto_25

    .line 1896
    :catch_7
    move-exception v0

    .line 1897
    goto :goto_24

    .line 1898
    :catch_8
    move-exception v0

    .line 1899
    goto :goto_23

    .line 1900
    :catch_9
    move-exception v0

    .line 1901
    :goto_22
    const/4 v11, 0x3

    .line 1902
    :goto_23
    const/4 v15, 0x0

    .line 1903
    goto :goto_24

    .line 1904
    :cond_32
    const/4 v11, 0x3

    .line 1905
    const/4 v15, 0x0

    .line 1906
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1907
    .line 1908
    const-string v8, "Reports without sessions cannot have events added to them."

    .line 1909
    .line 1910
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1911
    .line 1912
    .line 1913
    throw v0
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_7

    .line 1914
    :catch_a
    move-exception v0

    .line 1915
    const/4 v11, 0x3

    .line 1916
    const/4 v15, 0x0

    .line 1917
    const/16 v18, 0x2

    .line 1918
    .line 1919
    :goto_24
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1920
    .line 1921
    const-string v10, "Could not synthesize final report file for "

    .line 1922
    .line 1923
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1924
    .line 1925
    .line 1926
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v8

    .line 1933
    invoke-static {v7, v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1934
    .line 1935
    .line 1936
    :goto_25
    new-instance v0, Ljava/io/File;

    .line 1937
    .line 1938
    iget-object v8, v4, La/xzp;->d:Ljava/lang/Object;

    .line 1939
    .line 1940
    check-cast v8, Ljava/io/File;

    .line 1941
    .line 1942
    invoke-direct {v0, v8, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1943
    .line 1944
    .line 1945
    invoke-static {v0}, La/xzp;->T(Ljava/io/File;)Z

    .line 1946
    .line 1947
    .line 1948
    const/4 v9, 0x1

    .line 1949
    const/4 v13, 0x0

    .line 1950
    const/16 v16, 0x4

    .line 1951
    .line 1952
    goto/16 :goto_14

    .line 1953
    .line 1954
    :catchall_4
    move-exception v0

    .line 1955
    :try_start_14
    monitor-exit v9
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 1956
    throw v0

    .line 1957
    :cond_33
    iget-object v0, v3, La/x9f;->c:La/sd60;

    .line 1958
    .line 1959
    invoke-virtual {v0}, La/sd60;->e()La/lwi0;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v0

    .line 1963
    iget-object v0, v0, La/lwi0;->a:La/x860;

    .line 1964
    .line 1965
    invoke-virtual {v3}, La/x9f;->c()Ljava/util/ArrayList;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v0

    .line 1969
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1970
    .line 1971
    .line 1972
    move-result v1

    .line 1973
    const/4 v14, 0x4

    .line 1974
    if-gt v1, v14, :cond_34

    .line 1975
    .line 1976
    goto :goto_27

    .line 1977
    :cond_34
    invoke-virtual {v0, v14, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v0

    .line 1981
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v0

    .line 1985
    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1986
    .line 1987
    .line 1988
    move-result v1

    .line 1989
    if-eqz v1, :cond_35

    .line 1990
    .line 1991
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v1

    .line 1995
    check-cast v1, Ljava/io/File;

    .line 1996
    .line 1997
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1998
    .line 1999
    .line 2000
    goto :goto_26

    .line 2001
    :cond_35
    :goto_27
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const-wide/16 v7, 0x3e8

    .line 10
    .line 11
    div-long v9, v1, v7

    .line 12
    .line 13
    const-string v1, "Opening a new session with ID "

    .line 14
    .line 15
    invoke-static {v1, v3}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "FirebaseCrashlytics"

    .line 20
    .line 21
    const/4 v11, 0x3

    .line 22
    invoke-static {v2, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v12, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const-string v2, "FirebaseCrashlytics"

    .line 30
    .line 31
    invoke-static {v2, v1, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 35
    .line 36
    iget-object v1, v0, La/f8f;->f:La/hxw;

    .line 37
    .line 38
    iget-object v2, v0, La/f8f;->h:La/rrd;

    .line 39
    .line 40
    iget-object v15, v1, La/hxw;->c:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v4, v2, La/rrd;->g:Ljava/lang/Object;

    .line 43
    .line 44
    move-object/from16 v16, v4

    .line 45
    .line 46
    check-cast v16, Ljava/lang/String;

    .line 47
    .line 48
    iget-object v4, v2, La/rrd;->h:Ljava/lang/Object;

    .line 49
    .line 50
    move-object/from16 v17, v4

    .line 51
    .line 52
    check-cast v17, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1}, La/hxw;->c()La/b45;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v1, v1, La/b45;->a:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v4, v2, La/rrd;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Ljava/lang/String;

    .line 63
    .line 64
    const/16 v21, 0x1

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    const/4 v4, 0x4

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move/from16 v4, v21

    .line 71
    .line 72
    :goto_0
    invoke-static {v4}, La/b1j;->b(I)B

    .line 73
    .line 74
    .line 75
    move-result v19

    .line 76
    iget-object v2, v2, La/rrd;->i:Ljava/lang/Object;

    .line 77
    .line 78
    move-object/from16 v20, v2

    .line 79
    .line 80
    check-cast v20, La/fhj;

    .line 81
    .line 82
    new-instance v14, La/e55;

    .line 83
    .line 84
    move-object/from16 v18, v1

    .line 85
    .line 86
    invoke-direct/range {v14 .. v20}, La/e55;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa/fhj;)V

    .line 87
    .line 88
    .line 89
    sget-object v15, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 90
    .line 91
    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {}, La/aad;->S()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    new-instance v4, La/g55;

    .line 98
    .line 99
    invoke-direct {v4, v2}, La/g55;-><init>(Z)V

    .line 100
    .line 101
    .line 102
    iget-object v2, v0, La/f8f;->a:Landroid/content/Context;

    .line 103
    .line 104
    new-instance v6, Landroid/os/StatFs;

    .line 105
    .line 106
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object v16

    .line 110
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-direct {v6, v5}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockCount()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    move-wide/from16 v18, v7

    .line 122
    .line 123
    int-to-long v7, v5

    .line 124
    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSize()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    int-to-long v5, v5

    .line 129
    mul-long v27, v7, v5

    .line 130
    .line 131
    sget-object v5, La/z9d;->a:La/z9d;

    .line 132
    .line 133
    const-string v6, "FirebaseCrashlytics"

    .line 134
    .line 135
    sget-object v7, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    const/4 v11, 0x2

    .line 142
    if-eqz v8, :cond_2

    .line 143
    .line 144
    const-string v8, "Architecture#getValue()::Build.CPU_ABI returned null or empty"

    .line 145
    .line 146
    invoke-static {v6, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 147
    .line 148
    .line 149
    move-result v20

    .line 150
    if-eqz v20, :cond_4

    .line 151
    .line 152
    invoke-static {v6, v8, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    invoke-virtual {v7, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    sget-object v8, La/z9d;->b:Ljava/util/HashMap;

    .line 161
    .line 162
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, La/z9d;

    .line 167
    .line 168
    if-nez v6, :cond_3

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_3
    move-object v5, v6

    .line 172
    :cond_4
    :goto_1
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 173
    .line 174
    .line 175
    move-result v23

    .line 176
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    .line 183
    .line 184
    .line 185
    move-result v24

    .line 186
    invoke-static {v2}, La/aad;->H(Landroid/content/Context;)J

    .line 187
    .line 188
    .line 189
    move-result-wide v25

    .line 190
    invoke-static {}, La/aad;->R()Z

    .line 191
    .line 192
    .line 193
    move-result v29

    .line 194
    invoke-static {}, La/aad;->M()I

    .line 195
    .line 196
    .line 197
    move-result v30

    .line 198
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 199
    .line 200
    sget-object v5, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 201
    .line 202
    new-instance v22, La/f55;

    .line 203
    .line 204
    invoke-direct/range {v22 .. v30}, La/f55;-><init>(IIJJZI)V

    .line 205
    .line 206
    .line 207
    move/from16 v20, v11

    .line 208
    .line 209
    move-object/from16 v6, v22

    .line 210
    .line 211
    iget-object v11, v0, La/f8f;->j:La/k8f;

    .line 212
    .line 213
    new-instance v12, La/d55;

    .line 214
    .line 215
    invoke-direct {v12, v14, v4, v6}, La/d55;-><init>(La/e55;La/g55;La/f55;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11, v3, v9, v10, v12}, La/k8f;->d(Ljava/lang/String;JLa/d55;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_5

    .line 226
    .line 227
    if-eqz v3, :cond_5

    .line 228
    .line 229
    move-object v4, v2

    .line 230
    iget-object v2, v0, La/f8f;->d:La/ywq0;

    .line 231
    .line 232
    iget-object v6, v2, La/ywq0;->c:Ljava/lang/Object;

    .line 233
    .line 234
    move-object v11, v6

    .line 235
    check-cast v11, Ljava/lang/String;

    .line 236
    .line 237
    monitor-enter v11

    .line 238
    :try_start_0
    iput-object v3, v2, La/ywq0;->c:Ljava/lang/Object;

    .line 239
    .line 240
    iget-object v6, v2, La/ywq0;->d:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v6, La/o24;

    .line 243
    .line 244
    iget-object v6, v6, La/o24;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v6, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    check-cast v6, La/qmy;

    .line 253
    .line 254
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    :try_start_1
    new-instance v12, Ljava/util/HashMap;

    .line 256
    .line 257
    iget-object v14, v6, La/qmy;->a:Ljava/util/HashMap;

    .line 258
    .line 259
    invoke-direct {v12, v14}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v12}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 263
    .line 264
    .line 265
    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 266
    :try_start_2
    monitor-exit v6

    .line 267
    iget-object v6, v2, La/ywq0;->f:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v6, La/jdg0;

    .line 270
    .line 271
    invoke-virtual {v6}, La/jdg0;->c()Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    iget-object v14, v2, La/ywq0;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v14, La/cu;

    .line 278
    .line 279
    iget-object v14, v14, La/cu;->c:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v14, La/aaf;

    .line 282
    .line 283
    move-object/from16 v23, v1

    .line 284
    .line 285
    new-instance v1, La/qx9;

    .line 286
    .line 287
    move-object/from16 v24, v5

    .line 288
    .line 289
    move-object v5, v6

    .line 290
    const/16 v6, 0xa

    .line 291
    .line 292
    move-object/from16 v31, v4

    .line 293
    .line 294
    move-object/from16 v17, v8

    .line 295
    .line 296
    move-object v4, v12

    .line 297
    move-object/from16 v12, v23

    .line 298
    .line 299
    move-object/from16 v32, v24

    .line 300
    .line 301
    const/4 v8, 0x4

    .line 302
    invoke-direct/range {v1 .. v6}, La/qx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v14, v1}, La/aaf;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 306
    .line 307
    .line 308
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 309
    goto :goto_3

    .line 310
    :catchall_0
    move-exception v0

    .line 311
    goto :goto_2

    .line 312
    :catchall_1
    move-exception v0

    .line 313
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 314
    :try_start_4
    throw v0

    .line 315
    :goto_2
    monitor-exit v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 316
    throw v0

    .line 317
    :cond_5
    move-object v12, v1

    .line 318
    move-object/from16 v31, v2

    .line 319
    .line 320
    move-object/from16 v32, v5

    .line 321
    .line 322
    move-object/from16 v17, v8

    .line 323
    .line 324
    const/4 v8, 0x4

    .line 325
    :goto_3
    iget-object v1, v0, La/f8f;->i:La/yzn0;

    .line 326
    .line 327
    iget-object v2, v1, La/yzn0;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v2, La/lzp;

    .line 330
    .line 331
    invoke-interface {v2}, La/lzp;->closeLogFile()V

    .line 332
    .line 333
    .line 334
    sget-object v2, La/yzn0;->c:La/uuz;

    .line 335
    .line 336
    iput-object v2, v1, La/yzn0;->b:Ljava/lang/Object;

    .line 337
    .line 338
    if-nez v3, :cond_6

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_6
    iget-object v2, v1, La/yzn0;->a:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v2, La/xzp;

    .line 344
    .line 345
    const-string v4, "userlog"

    .line 346
    .line 347
    invoke-virtual {v2, v3, v4}, La/xzp;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    new-instance v4, La/ild0;

    .line 352
    .line 353
    invoke-direct {v4, v2}, La/ild0;-><init>(Ljava/io/File;)V

    .line 354
    .line 355
    .line 356
    iput-object v4, v1, La/yzn0;->b:Ljava/lang/Object;

    .line 357
    .line 358
    :goto_4
    iget-object v1, v0, La/f8f;->l:La/a8f;

    .line 359
    .line 360
    invoke-virtual {v1, v3}, La/a8f;->a(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    iget-object v0, v0, La/f8f;->m:La/ywq0;

    .line 364
    .line 365
    iget-object v1, v0, La/ywq0;->a:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v1, La/s9f;

    .line 368
    .line 369
    sget-object v2, La/r9f;->a:Ljava/nio/charset/Charset;

    .line 370
    .line 371
    new-instance v2, La/v15;

    .line 372
    .line 373
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 374
    .line 375
    .line 376
    const-string v4, "20.1.1"

    .line 377
    .line 378
    iput-object v4, v2, La/v15;->a:Ljava/lang/String;

    .line 379
    .line 380
    iget-object v4, v1, La/s9f;->c:La/rrd;

    .line 381
    .line 382
    iget-object v5, v4, La/rrd;->b:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v5, Ljava/lang/String;

    .line 385
    .line 386
    if-eqz v5, :cond_18

    .line 387
    .line 388
    iput-object v5, v2, La/v15;->b:Ljava/lang/String;

    .line 389
    .line 390
    iget-object v5, v1, La/s9f;->b:La/hxw;

    .line 391
    .line 392
    invoke-virtual {v5}, La/hxw;->c()La/b45;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    iget-object v6, v6, La/b45;->a:Ljava/lang/String;

    .line 397
    .line 398
    if-eqz v6, :cond_17

    .line 399
    .line 400
    iput-object v6, v2, La/v15;->d:Ljava/lang/String;

    .line 401
    .line 402
    invoke-virtual {v5}, La/hxw;->c()La/b45;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    iget-object v6, v6, La/b45;->b:Ljava/lang/String;

    .line 407
    .line 408
    iput-object v6, v2, La/v15;->e:Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {v5}, La/hxw;->c()La/b45;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    iget-object v6, v6, La/b45;->c:Ljava/lang/String;

    .line 415
    .line 416
    iput-object v6, v2, La/v15;->f:Ljava/lang/String;

    .line 417
    .line 418
    iget-object v6, v4, La/rrd;->g:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v6, Ljava/lang/String;

    .line 421
    .line 422
    if-eqz v6, :cond_16

    .line 423
    .line 424
    iput-object v6, v2, La/v15;->h:Ljava/lang/String;

    .line 425
    .line 426
    iget-object v11, v4, La/rrd;->h:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v11, Ljava/lang/String;

    .line 429
    .line 430
    if-eqz v11, :cond_15

    .line 431
    .line 432
    iput-object v11, v2, La/v15;->i:Ljava/lang/String;

    .line 433
    .line 434
    iput v8, v2, La/v15;->c:I

    .line 435
    .line 436
    iget-byte v14, v2, La/v15;->m:B

    .line 437
    .line 438
    or-int/lit8 v14, v14, 0x1

    .line 439
    .line 440
    int-to-byte v14, v14

    .line 441
    iput-byte v14, v2, La/v15;->m:B

    .line 442
    .line 443
    new-instance v14, La/g25;

    .line 444
    .line 445
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 446
    .line 447
    .line 448
    move/from16 v30, v8

    .line 449
    .line 450
    const/4 v8, 0x0

    .line 451
    iput-boolean v8, v14, La/g25;->f:Z

    .line 452
    .line 453
    iget-byte v8, v14, La/g25;->m:B

    .line 454
    .line 455
    or-int/lit8 v8, v8, 0x2

    .line 456
    .line 457
    int-to-byte v8, v8

    .line 458
    iput-wide v9, v14, La/g25;->d:J

    .line 459
    .line 460
    or-int/lit8 v8, v8, 0x1

    .line 461
    .line 462
    int-to-byte v8, v8

    .line 463
    iput-byte v8, v14, La/g25;->m:B

    .line 464
    .line 465
    if-eqz v3, :cond_14

    .line 466
    .line 467
    iput-object v3, v14, La/g25;->b:Ljava/lang/String;

    .line 468
    .line 469
    sget-object v3, La/s9f;->g:Ljava/lang/String;

    .line 470
    .line 471
    if-eqz v3, :cond_13

    .line 472
    .line 473
    iput-object v3, v14, La/g25;->a:Ljava/lang/String;

    .line 474
    .line 475
    iget-object v3, v5, La/hxw;->c:Ljava/lang/String;

    .line 476
    .line 477
    if-eqz v3, :cond_12

    .line 478
    .line 479
    iget-object v4, v4, La/rrd;->i:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v4, La/fhj;

    .line 482
    .line 483
    invoke-virtual {v5}, La/hxw;->c()La/b45;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    iget-object v5, v5, La/b45;->a:Ljava/lang/String;

    .line 488
    .line 489
    iget-object v8, v4, La/fhj;->b:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v8, La/mgk;

    .line 492
    .line 493
    if-nez v8, :cond_7

    .line 494
    .line 495
    new-instance v8, La/mgk;

    .line 496
    .line 497
    invoke-direct {v8, v4}, La/mgk;-><init>(La/fhj;)V

    .line 498
    .line 499
    .line 500
    iput-object v8, v4, La/fhj;->b:Ljava/lang/Object;

    .line 501
    .line 502
    :cond_7
    move-object v9, v8

    .line 503
    iget-object v8, v8, La/mgk;->a:Ljava/lang/String;

    .line 504
    .line 505
    if-nez v9, :cond_8

    .line 506
    .line 507
    new-instance v9, La/mgk;

    .line 508
    .line 509
    invoke-direct {v9, v4}, La/mgk;-><init>(La/fhj;)V

    .line 510
    .line 511
    .line 512
    iput-object v9, v4, La/fhj;->b:Ljava/lang/Object;

    .line 513
    .line 514
    :cond_8
    iget-object v4, v9, La/mgk;->b:Ljava/lang/String;

    .line 515
    .line 516
    new-instance v23, La/i25;

    .line 517
    .line 518
    move-object/from16 v24, v3

    .line 519
    .line 520
    move-object/from16 v29, v4

    .line 521
    .line 522
    move-object/from16 v27, v5

    .line 523
    .line 524
    move-object/from16 v25, v6

    .line 525
    .line 526
    move-object/from16 v28, v8

    .line 527
    .line 528
    move-object/from16 v26, v11

    .line 529
    .line 530
    invoke-direct/range {v23 .. v29}, La/i25;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    move-object/from16 v3, v23

    .line 534
    .line 535
    iput-object v3, v14, La/g25;->g:La/y8f;

    .line 536
    .line 537
    new-instance v3, La/f35;

    .line 538
    .line 539
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 540
    .line 541
    .line 542
    const/4 v4, 0x3

    .line 543
    iput v4, v3, La/f35;->a:I

    .line 544
    .line 545
    iget-byte v4, v3, La/f35;->e:B

    .line 546
    .line 547
    or-int/lit8 v4, v4, 0x1

    .line 548
    .line 549
    int-to-byte v4, v4

    .line 550
    iput-byte v4, v3, La/f35;->e:B

    .line 551
    .line 552
    if-eqz v15, :cond_11

    .line 553
    .line 554
    iput-object v15, v3, La/f35;->b:Ljava/lang/String;

    .line 555
    .line 556
    if-eqz v12, :cond_10

    .line 557
    .line 558
    iput-object v12, v3, La/f35;->c:Ljava/lang/String;

    .line 559
    .line 560
    invoke-static {}, La/aad;->S()Z

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    iput-boolean v4, v3, La/f35;->d:Z

    .line 565
    .line 566
    iget-byte v4, v3, La/f35;->e:B

    .line 567
    .line 568
    or-int/lit8 v4, v4, 0x2

    .line 569
    .line 570
    int-to-byte v4, v4

    .line 571
    iput-byte v4, v3, La/f35;->e:B

    .line 572
    .line 573
    invoke-virtual {v3}, La/f35;->a()La/g35;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    iput-object v3, v14, La/g25;->i:La/o9f;

    .line 578
    .line 579
    new-instance v3, Landroid/os/StatFs;

    .line 580
    .line 581
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 582
    .line 583
    .line 584
    move-result-object v4

    .line 585
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    invoke-direct {v3, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    const/4 v5, 0x7

    .line 597
    if-eqz v4, :cond_9

    .line 598
    .line 599
    goto :goto_5

    .line 600
    :cond_9
    sget-object v4, La/s9f;->f:Ljava/util/HashMap;

    .line 601
    .line 602
    invoke-virtual {v7, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v6

    .line 606
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    check-cast v4, Ljava/lang/Integer;

    .line 611
    .line 612
    if-nez v4, :cond_a

    .line 613
    .line 614
    goto :goto_5

    .line 615
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 616
    .line 617
    .line 618
    move-result v5

    .line 619
    :goto_5
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    invoke-virtual {v4}, Ljava/lang/Runtime;->availableProcessors()I

    .line 624
    .line 625
    .line 626
    move-result v4

    .line 627
    iget-object v1, v1, La/s9f;->a:Landroid/content/Context;

    .line 628
    .line 629
    invoke-static {v1}, La/aad;->H(Landroid/content/Context;)J

    .line 630
    .line 631
    .line 632
    move-result-wide v6

    .line 633
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCount()I

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    int-to-long v8, v1

    .line 638
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    int-to-long v10, v1

    .line 643
    mul-long/2addr v8, v10

    .line 644
    invoke-static {}, La/aad;->R()Z

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    invoke-static {}, La/aad;->M()I

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    new-instance v10, La/k25;

    .line 653
    .line 654
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 655
    .line 656
    .line 657
    iput v5, v10, La/k25;->a:I

    .line 658
    .line 659
    iget-byte v5, v10, La/k25;->j:B

    .line 660
    .line 661
    or-int/lit8 v5, v5, 0x1

    .line 662
    .line 663
    int-to-byte v5, v5

    .line 664
    iput-byte v5, v10, La/k25;->j:B

    .line 665
    .line 666
    if-eqz v17, :cond_f

    .line 667
    .line 668
    move-object/from16 v11, v17

    .line 669
    .line 670
    iput-object v11, v10, La/k25;->b:Ljava/lang/String;

    .line 671
    .line 672
    iput v4, v10, La/k25;->c:I

    .line 673
    .line 674
    or-int/lit8 v4, v5, 0x2

    .line 675
    .line 676
    int-to-byte v4, v4

    .line 677
    iput-wide v6, v10, La/k25;->d:J

    .line 678
    .line 679
    or-int/lit8 v4, v4, 0x4

    .line 680
    .line 681
    int-to-byte v4, v4

    .line 682
    iput-wide v8, v10, La/k25;->e:J

    .line 683
    .line 684
    or-int/lit8 v4, v4, 0x8

    .line 685
    .line 686
    int-to-byte v4, v4

    .line 687
    iput-boolean v1, v10, La/k25;->f:Z

    .line 688
    .line 689
    or-int/lit8 v1, v4, 0x10

    .line 690
    .line 691
    int-to-byte v1, v1

    .line 692
    iput v3, v10, La/k25;->g:I

    .line 693
    .line 694
    or-int/lit8 v1, v1, 0x20

    .line 695
    .line 696
    int-to-byte v1, v1

    .line 697
    iput-byte v1, v10, La/k25;->j:B

    .line 698
    .line 699
    move-object/from16 v4, v31

    .line 700
    .line 701
    if-eqz v4, :cond_e

    .line 702
    .line 703
    iput-object v4, v10, La/k25;->h:Ljava/lang/String;

    .line 704
    .line 705
    move-object/from16 v1, v32

    .line 706
    .line 707
    if-eqz v1, :cond_d

    .line 708
    .line 709
    iput-object v1, v10, La/k25;->i:Ljava/lang/String;

    .line 710
    .line 711
    invoke-virtual {v10}, La/k25;->a()La/l25;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    iput-object v1, v14, La/g25;->j:La/z8f;

    .line 716
    .line 717
    const/4 v4, 0x3

    .line 718
    iput v4, v14, La/g25;->l:I

    .line 719
    .line 720
    iget-byte v1, v14, La/g25;->m:B

    .line 721
    .line 722
    or-int/lit8 v1, v1, 0x4

    .line 723
    .line 724
    int-to-byte v1, v1

    .line 725
    iput-byte v1, v14, La/g25;->m:B

    .line 726
    .line 727
    invoke-virtual {v14}, La/g25;->a()La/h25;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    iput-object v1, v2, La/v15;->j:La/q9f;

    .line 732
    .line 733
    invoke-virtual {v2}, La/v15;->a()La/w15;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    iget-object v0, v0, La/ywq0;->b:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v0, La/x9f;

    .line 740
    .line 741
    iget-object v0, v0, La/x9f;->b:La/xzp;

    .line 742
    .line 743
    const-string v2, "FirebaseCrashlytics"

    .line 744
    .line 745
    iget-object v3, v1, La/w15;->k:La/q9f;

    .line 746
    .line 747
    if-nez v3, :cond_b

    .line 748
    .line 749
    const-string v0, "Could not get session for report"

    .line 750
    .line 751
    const/4 v4, 0x3

    .line 752
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-eqz v1, :cond_c

    .line 757
    .line 758
    const/4 v1, 0x0

    .line 759
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 760
    .line 761
    .line 762
    return-void

    .line 763
    :cond_b
    move-object v4, v3

    .line 764
    check-cast v4, La/h25;

    .line 765
    .line 766
    iget-object v4, v4, La/h25;->b:Ljava/lang/String;

    .line 767
    .line 768
    :try_start_5
    sget-object v5, La/x9f;->g:La/v9f;

    .line 769
    .line 770
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    sget-object v5, La/v9f;->a:La/g2v;

    .line 774
    .line 775
    invoke-virtual {v5, v1}, La/g2v;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    const-string v5, "report"

    .line 780
    .line 781
    invoke-virtual {v0, v4, v5}, La/xzp;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    invoke-static {v5, v1}, La/x9f;->g(Ljava/io/File;Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    const-string v1, "start-time"

    .line 789
    .line 790
    invoke-virtual {v0, v4, v1}, La/xzp;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    const-string v1, ""

    .line 795
    .line 796
    check-cast v3, La/h25;

    .line 797
    .line 798
    iget-wide v5, v3, La/h25;->d:J

    .line 799
    .line 800
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 801
    .line 802
    new-instance v7, Ljava/io/FileOutputStream;

    .line 803
    .line 804
    invoke-direct {v7, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 805
    .line 806
    .line 807
    sget-object v8, La/x9f;->e:Ljava/nio/charset/Charset;

    .line 808
    .line 809
    invoke-direct {v3, v7, v8}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 810
    .line 811
    .line 812
    :try_start_6
    invoke-virtual {v3, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    mul-long v5, v5, v18

    .line 816
    .line 817
    invoke-virtual {v0, v5, v6}, Ljava/io/File;->setLastModified(J)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 818
    .line 819
    .line 820
    :try_start_7
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 821
    .line 822
    .line 823
    return-void

    .line 824
    :catchall_2
    move-exception v0

    .line 825
    move-object v1, v0

    .line 826
    :try_start_8
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 827
    .line 828
    .line 829
    goto :goto_6

    .line 830
    :catchall_3
    move-exception v0

    .line 831
    :try_start_9
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 832
    .line 833
    .line 834
    :goto_6
    throw v1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    .line 835
    :catch_0
    move-exception v0

    .line 836
    const-string v1, "Could not persist report for session "

    .line 837
    .line 838
    invoke-static {v1, v4}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    const/4 v4, 0x3

    .line 843
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 844
    .line 845
    .line 846
    move-result v3

    .line 847
    if-eqz v3, :cond_c

    .line 848
    .line 849
    invoke-static {v2, v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 850
    .line 851
    .line 852
    :cond_c
    return-void

    .line 853
    :cond_d
    const-string v0, "Null modelClass"

    .line 854
    .line 855
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    return-void

    .line 859
    :cond_e
    const-string v0, "Null manufacturer"

    .line 860
    .line 861
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    return-void

    .line 865
    :cond_f
    const-string v0, "Null model"

    .line 866
    .line 867
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    return-void

    .line 871
    :cond_10
    const-string v0, "Null buildVersion"

    .line 872
    .line 873
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    return-void

    .line 877
    :cond_11
    const-string v0, "Null version"

    .line 878
    .line 879
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    return-void

    .line 883
    :cond_12
    const-string v0, "Null identifier"

    .line 884
    .line 885
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :cond_13
    const-string v0, "Null generator"

    .line 890
    .line 891
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    return-void

    .line 895
    :cond_14
    const-string v0, "Null identifier"

    .line 896
    .line 897
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    return-void

    .line 901
    :cond_15
    const-string v0, "Null displayVersion"

    .line 902
    .line 903
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    return-void

    .line 907
    :cond_16
    const-string v0, "Null buildVersion"

    .line 908
    .line 909
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    return-void

    .line 913
    :cond_17
    const-string v0, "Null installationUuid"

    .line 914
    .line 915
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    return-void

    .line 919
    :cond_18
    const-string v0, "Null gmpAppId"

    .line 920
    .line 921
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 922
    .line 923
    .line 924
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/f8f;->e:La/cu;

    .line 2
    .line 3
    iget-object v0, v0, La/cu;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/aaf;

    .line 6
    .line 7
    iget-object v0, v0, La/aaf;->a:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    iget-object v1, p0, La/f8f;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-class v2, Landroid/os/ProfilingManager;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/os/ProfilingManager;

    .line 18
    .line 19
    new-instance v2, Landroid/os/ProfilingTrigger$Builder;

    .line 20
    .line 21
    const/4 v3, 0x7

    .line 22
    invoke-direct {v2, v3}, Landroid/os/ProfilingTrigger$Builder;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/os/ProfilingTrigger$Builder;->build()Landroid/os/ProfilingTrigger;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Landroid/os/ProfilingTrigger$Builder;

    .line 30
    .line 31
    const/16 v4, 0x8

    .line 32
    .line 33
    invoke-direct {v3, v4}, Landroid/os/ProfilingTrigger$Builder;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/os/ProfilingTrigger$Builder;->build()Landroid/os/ProfilingTrigger;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    :goto_0
    if-ge v5, v4, :cond_0

    .line 52
    .line 53
    aget-object v6, v2, v5

    .line 54
    .line 55
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Landroid/os/ProfilingManager;->addProfilingTriggers(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, La/b8f;

    .line 72
    .line 73
    invoke-direct {v2, p0, p1}, La/b8f;-><init>(La/f8f;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Landroid/os/ProfilingManager;->registerForAllProfilingResults(Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final d(La/sd60;)Z
    .locals 5

    .line 1
    invoke-static {}, La/cu;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/f8f;->n:La/y9f;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "FirebaseCrashlytics"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, La/y9f;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const-string p0, "Skipping session finalization because a crash has already occurred."

    .line 21
    .line 22
    invoke-static {v3, p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    const/4 v0, 0x2

    .line 27
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const-string v4, "Finalizing previously open sessions."

    .line 34
    .line 35
    invoke-static {v3, v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 v4, 0x1

    .line 39
    :try_start_0
    invoke-virtual {p0, v4, p1, v4}, La/f8f;->a(ZLa/sd60;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    const-string p0, "Closed all previously open sessions."

    .line 49
    .line 50
    invoke-static {v3, p0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 51
    .line 52
    .line 53
    :cond_2
    return v4

    .line 54
    :catch_0
    move-exception p0

    .line 55
    const-string p1, "Unable to finalize previously open sessions."

    .line 56
    .line 57
    invoke-static {v3, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    return v2
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, La/f8f;->m:La/ywq0;

    .line 2
    .line 3
    iget-object p0, p0, La/ywq0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/x9f;

    .line 6
    .line 7
    invoke-virtual {p0}, La/x9f;->d()Ljava/util/NavigableSet;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public final f()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "com.google.firebase.crashlytics.version_control_info"

    .line 2
    .line 3
    const-string v1, "string"

    .line 4
    .line 5
    iget-object p0, p0, La/f8f;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, La/aad;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move-object p0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    const/4 v0, 0x3

    .line 25
    const/4 v2, 0x0

    .line 26
    const-string v3, "FirebaseCrashlytics"

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const-string v0, "Read version control info from string resource"

    .line 37
    .line 38
    invoke-static {v3, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 39
    .line 40
    .line 41
    :cond_1
    sget-object v0, La/f8f;->s:Ljava/nio/charset/Charset;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    const-class p0, La/f8f;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    const-string p0, "Couldn\'t get Class Loader"

    .line 61
    .line 62
    invoke-static {v3, p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    move-object p0, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const-string v4, "META-INF/version-control-info.textproto"

    .line 68
    .line 69
    invoke-virtual {p0, v4}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_1
    if-eqz p0, :cond_6

    .line 74
    .line 75
    :try_start_0
    const-string v4, "Read version control info from file"

    .line 76
    .line 77
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-static {v3, v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 84
    .line 85
    .line 86
    :cond_4
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    .line 90
    .line 91
    const/16 v1, 0x400

    .line 92
    .line 93
    :try_start_1
    new-array v1, v1, [B

    .line 94
    .line 95
    :goto_2
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/4 v4, -0x1

    .line 100
    if-eq v3, v4, :cond_5

    .line 101
    .line 102
    invoke-virtual {v0, v1, v2, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception v1

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 109
    .line 110
    .line 111
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 119
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 120
    .line 121
    .line 122
    return-object v0

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    goto :goto_5

    .line 125
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :catchall_2
    move-exception v0

    .line 130
    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    :goto_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 134
    :goto_5
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 135
    .line 136
    .line 137
    goto :goto_6

    .line 138
    :catchall_3
    move-exception p0

    .line 139
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :goto_6
    throw v0

    .line 143
    :cond_6
    if-eqz p0, :cond_7

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 146
    .line 147
    .line 148
    :cond_7
    const-string p0, "No version control information found"

    .line 149
    .line 150
    invoke-static {v3, p0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 151
    .line 152
    .line 153
    return-object v1
.end method

.method public final g()Lcom/google/android/gms/tasks/Task;
    .locals 9

    .line 1
    const-string v0, "FirebaseCrashlytics"

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, La/f8f;->g:La/xzp;

    .line 9
    .line 10
    iget-object v2, v2, La/xzp;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/io/File;

    .line 13
    .line 14
    sget-object v3, La/f8f;->r:La/z7f;

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, La/xzp;->V([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/io/File;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const/4 v6, 0x3

    .line 46
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 54
    :try_start_1
    const-string v5, "com.google.firebase.crash.FirebaseCrash"

    .line 55
    .line 56
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 57
    .line 58
    .line 59
    :try_start_2
    const-string v5, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    .line 60
    .line 61
    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 62
    .line 63
    .line 64
    invoke-static {v4}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    goto :goto_1

    .line 69
    :catch_0
    const-string v5, "Logging app exception event to Firebase Analytics"

    .line 70
    .line 71
    invoke-static {v0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_0

    .line 76
    .line 77
    invoke-static {v0, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .line 79
    .line 80
    :cond_0
    new-instance v5, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 81
    .line 82
    const/4 v6, 0x1

    .line 83
    invoke-direct {v5, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    .line 84
    .line 85
    .line 86
    new-instance v6, La/e8f;

    .line 87
    .line 88
    invoke-direct {v6, p0, v7, v8}, La/e8f;-><init>(La/f8f;J)V

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v6}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    :goto_1
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :catch_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v6, "Could not parse app exception timestamp from file "

    .line 102
    .line 103
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    .line 119
    .line 120
    :goto_2
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0
.end method

.method public final h()V
    .locals 5

    .line 1
    const-string v0, "FirebaseCrashlytics"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, La/f8f;->f()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    const-string v2, "com.crashlytics.version-control-info"
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :try_start_1
    iget-object v4, p0, La/f8f;->d:La/ywq0;

    .line 13
    .line 14
    iget-object v4, v4, La/ywq0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, La/o24;

    .line 17
    .line 18
    invoke-virtual {v4, v2, v1}, La/o24;->s(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 19
    .line 20
    .line 21
    goto :goto_2

    .line 22
    :catch_0
    move-exception v1

    .line 23
    :try_start_2
    iget-object p0, p0, La/f8f;->a:Landroid/content/Context;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 32
    .line 33
    and-int/lit8 p0, p0, 0x2

    .line 34
    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    :goto_0
    if-nez p0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    throw v1

    .line 44
    :cond_2
    :goto_1
    const-string p0, "Attempting to set custom attribute with null key, ignoring."

    .line 45
    .line 46
    invoke-static {v0, p0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    :goto_2
    const-string p0, "Saved version control info"

    .line 50
    .line 51
    invoke-static {v0, p0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :catch_1
    move-exception p0

    .line 56
    const-string v1, "Unable to save version control info"

    .line 57
    .line 58
    invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_3
    return-void
.end method

.method public final i(Lcom/google/android/gms/tasks/Task;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/f8f;->o:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    const-string v1, "FirebaseCrashlytics"

    .line 4
    .line 5
    iget-object v2, p0, La/f8f;->m:La/ywq0;

    .line 6
    .line 7
    iget-object v2, v2, La/ywq0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/x9f;

    .line 10
    .line 11
    iget-object v2, v2, La/x9f;->b:La/xzp;

    .line 12
    .line 13
    iget-object v3, v2, La/xzp;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, La/xzp;->V([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget-object v3, v2, La/xzp;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3}, La/xzp;->V([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    iget-object v2, v2, La/xzp;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/io/File;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, La/xzp;->V([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const-string p0, "No crash reports are available to be sent."

    .line 70
    .line 71
    const/4 p1, 0x2

    .line 72
    invoke-static {v1, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    invoke-static {v1, p0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    :goto_0
    sget-object v2, La/rv00;->s:La/rv00;

    .line 88
    .line 89
    const-string v3, "Crash reports are available to be sent."

    .line 90
    .line 91
    invoke-virtual {v2, v3}, La/rv00;->D(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v3, p0, La/f8f;->b:La/qaj;

    .line 95
    .line 96
    invoke-virtual {v3}, La/qaj;->e()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_4

    .line 101
    .line 102
    const-string v2, "Automatic data collection is enabled. Allowing upload."

    .line 103
    .line 104
    const/4 v3, 0x3

    .line 105
    invoke-static {v1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    invoke-static {v1, v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 112
    .line 113
    .line 114
    :cond_3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    const-string v1, "Automatic data collection is disabled."

    .line 127
    .line 128
    invoke-virtual {v2, v1}, La/rv00;->t(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v1, "Notifying that unsent reports are available."

    .line 132
    .line 133
    invoke-virtual {v2, v1}, La/rv00;->D(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    iget-object v0, v3, La/qaj;->b:Ljava/lang/Object;

    .line 142
    .line 143
    monitor-enter v0

    .line 144
    :try_start_0
    iget-object v1, v3, La/qaj;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 147
    .line 148
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    new-instance v0, La/qud;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-string v1, "Waiting for send/deleteUnsentReports to be called."

    .line 163
    .line 164
    invoke-virtual {v2, v1}, La/rv00;->t(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, p0, La/f8f;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 168
    .line 169
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v0, v1}, La/q8a;->r0(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    :goto_1
    iget-object v1, p0, La/f8f;->e:La/cu;

    .line 178
    .line 179
    iget-object v1, v1, La/cu;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, La/aaf;

    .line 182
    .line 183
    new-instance v2, La/xr;

    .line 184
    .line 185
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 186
    .line 187
    .line 188
    iput-object p0, v2, La/xr;->b:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object p1, v2, La/xr;->a:Ljava/lang/Object;

    .line 191
    .line 192
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :catchall_0
    move-exception p0

    .line 197
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    throw p0
.end method
