.class public final Landroidx/work/impl/workers/ConstraintTrackingWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/work/impl/workers/ConstraintTrackingWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "a/d4e",
        "work-runtime"
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
.field public final g:Landroidx/work/WorkerParameters;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/og00;->b:Landroidx/work/WorkerParameters;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, La/obb;->Y(Ljava/util/concurrent/Executor;)La/lne;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/igb;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x9

    .line 16
    .line 17
    invoke-direct {v1, p0, v2, v3}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final e(La/og00;La/zas0;La/ppv0;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, La/e4e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/e4e;

    .line 7
    .line 8
    iget v1, v0, La/e4e;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/e4e;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/e4e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/e4e;-><init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/e4e;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p4, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/e4e;->k:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p0, La/c43;

    .line 51
    .line 52
    invoke-direct {p0, p1, p2, p3, v2}, La/c43;-><init>(La/og00;La/zas0;La/ppv0;La/yje;)V

    .line 53
    .line 54
    .line 55
    iput v3, v0, La/e4e;->k:I

    .line 56
    .line 57
    invoke-static {v0, p0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-ne p0, p4, :cond_3

    .line 62
    .line 63
    return-object p4

    .line 64
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    return-object p0
.end method

.method public final f(La/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

    .line 6
    .line 7
    instance-of v3, v0, La/f4e;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, La/f4e;

    .line 13
    .line 14
    iget v4, v3, La/f4e;->l:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/f4e;->l:I

    .line 24
    .line 25
    :goto_0
    move-object v7, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, La/f4e;

    .line 28
    .line 29
    invoke-direct {v3, v1, v0}, La/f4e;-><init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;La/zje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v7, La/f4e;->j:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v8, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v3, v7, La/f4e;->l:I

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x1

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    if-ne v3, v10, :cond_1

    .line 44
    .line 45
    iget-object v2, v7, La/f4e;->i:La/og00;

    .line 46
    .line 47
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    move-object/from16 p1, v9

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object/from16 p1, v9

    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v9

    .line 65
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v1, La/og00;->b:Landroidx/work/WorkerParameters;

    .line 69
    .line 70
    iget-object v3, v0, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 71
    .line 72
    const-string v4, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 73
    .line 74
    invoke-virtual {v3, v4}, La/maj;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const-string v4, "No worker to delegate to."

    .line 79
    .line 80
    if-eqz v3, :cond_10

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_3

    .line 87
    .line 88
    goto/16 :goto_9

    .line 89
    .line 90
    :cond_3
    iget-object v5, v1, La/og00;->a:Landroid/content/Context;

    .line 91
    .line 92
    invoke-static {v5}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v11, v6, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 100
    .line 101
    invoke-virtual {v11}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    iget-object v12, v0, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 106
    .line 107
    invoke-virtual {v12}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v11, v12}, La/upv0;->e(Ljava/lang/String;)La/ppv0;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    if-nez v11, :cond_4

    .line 119
    .line 120
    new-instance v0, La/kg00;

    .line 121
    .line 122
    invoke-direct {v0}, La/kg00;-><init>()V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_4
    new-instance v12, La/zas0;

    .line 127
    .line 128
    iget-object v13, v6, La/cpv0;->j:La/lds0;

    .line 129
    .line 130
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-direct {v12, v13}, La/zas0;-><init>(La/lds0;)V

    .line 134
    .line 135
    .line 136
    iget-object v13, v12, La/zas0;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v13, Ljava/util/ArrayList;

    .line 139
    .line 140
    new-instance v14, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    if-eqz v15, :cond_6

    .line 154
    .line 155
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v15

    .line 159
    move-object/from16 p1, v9

    .line 160
    .line 161
    move-object v9, v15

    .line 162
    check-cast v9, La/y2e;

    .line 163
    .line 164
    invoke-interface {v9, v11}, La/y2e;->a(La/ppv0;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_5

    .line 169
    .line 170
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_5
    move-object/from16 v9, p1

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_6
    move-object/from16 p1, v9

    .line 177
    .line 178
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-nez v9, :cond_7

    .line 183
    .line 184
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    sget-object v13, La/pov0;->a:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v15, v11, La/ppv0;->a:Ljava/lang/String;

    .line 191
    .line 192
    new-instance v10, La/ejv0;

    .line 193
    .line 194
    const/4 v1, 0x5

    .line 195
    invoke-direct {v10, v1}, La/ejv0;-><init>(B)V

    .line 196
    .line 197
    .line 198
    const/16 v19, 0x1f

    .line 199
    .line 200
    move-object v1, v15

    .line 201
    const/4 v15, 0x0

    .line 202
    const/16 v16, 0x0

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    move-object/from16 v18, v10

    .line 207
    .line 208
    invoke-static/range {v14 .. v19}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    const-string v15, "Work "

    .line 213
    .line 214
    move-object/from16 v16, v11

    .line 215
    .line 216
    const-string v11, " constrained by "

    .line 217
    .line 218
    invoke-static {v15, v1, v11, v10}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v9, v13, v1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_7
    move-object/from16 v16, v11

    .line 227
    .line 228
    :goto_3
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_8

    .line 233
    .line 234
    sget-object v0, La/i4e;->a:Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    new-instance v2, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    const-string v4, "Constraints not met for delegate "

    .line 243
    .line 244
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v3, ". Requesting retry."

    .line 251
    .line 252
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {v1, v0, v2}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    new-instance v0, La/lg00;

    .line 263
    .line 264
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :cond_8
    sget-object v1, La/i4e;->a:Ljava/lang/String;

    .line 269
    .line 270
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    const-string v10, "Constraints met for delegate "

    .line 275
    .line 276
    invoke-virtual {v10, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    invoke-virtual {v9, v1, v10}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :try_start_1
    iget-object v0, v0, Landroidx/work/WorkerParameters;->f:La/jtv;

    .line 284
    .line 285
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v5, v3, v2}, La/jtv;->H0(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)La/og00;

    .line 289
    .line 290
    .line 291
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 292
    iget-object v0, v2, Landroidx/work/WorkerParameters;->e:La/fpv0;

    .line 293
    .line 294
    iget-object v0, v0, La/fpv0;->e:La/vox;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    :try_start_2
    invoke-static {v0}, La/obb;->Y(Ljava/util/concurrent/Executor;)La/lne;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    new-instance v0, La/ic1;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 304
    .line 305
    const/4 v5, 0x0

    .line 306
    const/16 v6, 0x11

    .line 307
    .line 308
    move-object v2, v1

    .line 309
    move-object v3, v12

    .line 310
    move-object/from16 v4, v16

    .line 311
    .line 312
    move-object/from16 v1, p0

    .line 313
    .line 314
    :try_start_3
    invoke-direct/range {v0 .. v6}, La/ic1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 315
    .line 316
    .line 317
    iput-object v2, v7, La/f4e;->i:La/og00;

    .line 318
    .line 319
    const/4 v3, 0x1

    .line 320
    iput v3, v7, La/f4e;->l:I

    .line 321
    .line 322
    invoke-static {v9, v0, v7}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    if-ne v0, v8, :cond_9

    .line 327
    .line 328
    return-object v8

    .line 329
    :cond_9
    :goto_4
    check-cast v0, La/ng00;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 330
    .line 331
    return-object v0

    .line 332
    :catch_1
    move-exception v0

    .line 333
    goto :goto_5

    .line 334
    :catch_2
    move-exception v0

    .line 335
    move-object v2, v1

    .line 336
    move-object/from16 v1, p0

    .line 337
    .line 338
    :goto_5
    iget-object v1, v1, La/og00;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 339
    .line 340
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    const/16 v4, -0x100

    .line 345
    .line 346
    if-eq v3, v4, :cond_a

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_a
    instance-of v3, v0, La/d4e;

    .line 350
    .line 351
    if-eqz v3, :cond_e

    .line 352
    .line 353
    :goto_6
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 354
    .line 355
    const/16 v5, 0x1f

    .line 356
    .line 357
    if-ge v3, v5, :cond_b

    .line 358
    .line 359
    const/16 v1, -0x200

    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_b
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eq v3, v4, :cond_c

    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    goto :goto_7

    .line 373
    :cond_c
    instance-of v1, v0, La/d4e;

    .line 374
    .line 375
    if-eqz v1, :cond_d

    .line 376
    .line 377
    move-object v1, v0

    .line 378
    check-cast v1, La/d4e;

    .line 379
    .line 380
    iget v1, v1, La/d4e;->a:I

    .line 381
    .line 382
    :goto_7
    iget-object v2, v2, La/og00;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 383
    .line 384
    invoke-virtual {v2, v4, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 385
    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_d
    const-string v0, "Unreachable"

    .line 389
    .line 390
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-object p1

    .line 394
    :cond_e
    :goto_8
    instance-of v1, v0, La/d4e;

    .line 395
    .line 396
    if-eqz v1, :cond_f

    .line 397
    .line 398
    new-instance v0, La/lg00;

    .line 399
    .line 400
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 401
    .line 402
    .line 403
    return-object v0

    .line 404
    :cond_f
    throw v0

    .line 405
    :catchall_0
    sget-object v0, La/i4e;->a:Ljava/lang/String;

    .line 406
    .line 407
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v1, v0, v4}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    iget-object v0, v6, La/cpv0;->b:La/wsd;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    new-instance v0, La/kg00;

    .line 420
    .line 421
    invoke-direct {v0}, La/kg00;-><init>()V

    .line 422
    .line 423
    .line 424
    return-object v0

    .line 425
    :cond_10
    :goto_9
    sget-object v0, La/i4e;->a:Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-virtual {v1, v0, v4}, La/wv00;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    new-instance v0, La/kg00;

    .line 435
    .line 436
    invoke-direct {v0}, La/kg00;-><init>()V

    .line 437
    .line 438
    .line 439
    return-object v0
.end method
