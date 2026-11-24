.class public final Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "a/k9x",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:La/mii0;

.field public final h:La/ojj;

.field public final i:La/zx10;

.field public final j:La/jw20;

.field public final k:La/ywu;

.field public final l:La/ot10;

.field public final m:La/msh0;

.field public final n:La/x20;

.field public final o:La/u58;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 7

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
    iget-object p1, p0, La/og00;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, Landroid/app/Application;

    .line 16
    .line 17
    instance-of p2, p1, La/af3;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    check-cast p1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v0

    .line 26
    :goto_0
    const-class p2, La/f5m0;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, La/o5d0;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object p1, v0

    .line 50
    :goto_1
    instance-of v1, p1, La/f5m0;

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :cond_2
    check-cast p1, La/f5m0;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    iget-object p2, p1, La/f5m0;->a:La/mii0;

    .line 60
    .line 61
    iget-object v0, p1, La/f5m0;->b:La/ojj;

    .line 62
    .line 63
    iget-object v1, p1, La/f5m0;->c:La/zx10;

    .line 64
    .line 65
    iget-object v2, p1, La/f5m0;->d:La/jw20;

    .line 66
    .line 67
    iget-object v3, p1, La/f5m0;->e:La/ywu;

    .line 68
    .line 69
    iget-object v4, p1, La/f5m0;->f:La/ot10;

    .line 70
    .line 71
    iget-object v5, p1, La/f5m0;->g:La/msh0;

    .line 72
    .line 73
    iget-object v6, p1, La/f5m0;->h:La/x20;

    .line 74
    .line 75
    iget-object p1, p1, La/f5m0;->i:La/u58;

    .line 76
    .line 77
    iput-object p2, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->g:La/mii0;

    .line 78
    .line 79
    iput-object v0, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->h:La/ojj;

    .line 80
    .line 81
    iput-object v1, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->i:La/zx10;

    .line 82
    .line 83
    iput-object v2, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->j:La/jw20;

    .line 84
    .line 85
    iput-object v3, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->k:La/ywu;

    .line 86
    .line 87
    iput-object v4, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->l:La/ot10;

    .line 88
    .line 89
    iput-object v5, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->m:La/msh0;

    .line 90
    .line 91
    iput-object v6, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->n:La/x20;

    .line 92
    .line 93
    iput-object p1, p0, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->o:La/u58;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 97
    .line 98
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v0
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, La/e5m0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/e5m0;

    .line 11
    .line 12
    iget v3, v2, La/e5m0;->n:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/e5m0;->n:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/e5m0;

    .line 25
    .line 26
    check-cast v0, La/zje;

    .line 27
    .line 28
    invoke-direct {v2, v1, v0}, La/e5m0;-><init>(Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v2, La/e5m0;->l:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v2, La/e5m0;->n:I

    .line 36
    .line 37
    iget-object v5, v1, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->i:La/zx10;

    .line 38
    .line 39
    const-string v6, "saveForRetryUseCase"

    .line 40
    .line 41
    const/4 v7, 0x3

    .line 42
    const/4 v8, 0x2

    .line 43
    const/4 v9, 0x1

    .line 44
    const/4 v10, 0x0

    .line 45
    if-eqz v4, :cond_4

    .line 46
    .line 47
    if-eq v4, v9, :cond_3

    .line 48
    .line 49
    if-eq v4, v8, :cond_2

    .line 50
    .line 51
    if-ne v4, v7, :cond_1

    .line 52
    .line 53
    iget-object v1, v2, La/e5m0;->i:Ljava/io/File;

    .line 54
    .line 55
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_15

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v10

    .line 66
    :cond_2
    iget-object v4, v2, La/e5m0;->j:La/gv00;

    .line 67
    .line 68
    iget-object v8, v2, La/e5m0;->i:Ljava/io/File;

    .line 69
    .line 70
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_12

    .line 74
    .line 75
    :cond_3
    iget-object v4, v2, La/e5m0;->k:Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;

    .line 76
    .line 77
    iget-object v11, v2, La/e5m0;->j:La/gv00;

    .line 78
    .line 79
    iget-object v12, v2, La/e5m0;->i:Ljava/io/File;

    .line 80
    .line 81
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    move-object/from16 p1, v10

    .line 85
    .line 86
    goto/16 :goto_d

    .line 87
    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object/from16 p1, v10

    .line 90
    .line 91
    goto/16 :goto_e

    .line 92
    .line 93
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    new-instance v12, Ljava/io/File;

    .line 97
    .line 98
    iget-object v0, v1, La/og00;->b:Landroidx/work/WorkerParameters;

    .line 99
    .line 100
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 101
    .line 102
    const-string v4, "FAILED_WORKER_LOG_FILE_PATH"

    .line 103
    .line 104
    invoke-virtual {v0, v4}, La/maj;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    new-instance v0, La/kg00;

    .line 111
    .line 112
    invoke-direct {v0}, La/kg00;-><init>()V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_5
    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, v1, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->g:La/mii0;

    .line 120
    .line 121
    if-eqz v0, :cond_29

    .line 122
    .line 123
    invoke-static {v12}, La/i0q;->b(Ljava/io/File;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iget-object v11, v0, La/mii0;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v11, La/iqt;

    .line 130
    .line 131
    iget-object v11, v11, La/iqt;->a:La/gst0;

    .line 132
    .line 133
    invoke-virtual {v11}, La/gst0;->a()Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-eqz v11, :cond_6

    .line 138
    .line 139
    iget-object v11, v0, La/mii0;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v11, La/x1u;

    .line 142
    .line 143
    invoke-virtual {v11}, La/x1u;->a()J

    .line 144
    .line 145
    .line 146
    move-result-wide v13

    .line 147
    goto :goto_1

    .line 148
    :cond_6
    const-wide/16 v13, 0x0

    .line 149
    .line 150
    :goto_1
    new-instance v11, La/gv00;

    .line 151
    .line 152
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    iget-object v14, v0, La/mii0;->d:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v14, La/jru;

    .line 159
    .line 160
    iget-object v14, v14, La/jru;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v14, La/psc;

    .line 163
    .line 164
    iget-object v14, v14, La/psc;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v14, La/tgk;

    .line 167
    .line 168
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 169
    .line 170
    move-object/from16 p1, v10

    .line 171
    .line 172
    const/16 v10, 0x1f

    .line 173
    .line 174
    if-lt v15, v10, :cond_10

    .line 175
    .line 176
    iget-object v10, v14, La/tgk;->e:La/n0o0;

    .line 177
    .line 178
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    check-cast v10, Landroid/net/ConnectivityManager;

    .line 183
    .line 184
    if-eqz v10, :cond_7

    .line 185
    .line 186
    invoke-virtual {v10}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    goto :goto_2

    .line 191
    :cond_7
    move-object/from16 v10, p1

    .line 192
    .line 193
    :goto_2
    iget-object v15, v14, La/tgk;->e:La/n0o0;

    .line 194
    .line 195
    invoke-virtual {v15}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    check-cast v15, Landroid/net/ConnectivityManager;

    .line 200
    .line 201
    if-eqz v15, :cond_8

    .line 202
    .line 203
    invoke-virtual {v15, v10}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    goto :goto_3

    .line 208
    :cond_8
    move-object/from16 v10, p1

    .line 209
    .line 210
    :goto_3
    if-eqz v10, :cond_9

    .line 211
    .line 212
    invoke-static {v10}, La/jfv;->h(Landroid/net/NetworkCapabilities;)Landroid/net/TransportInfo;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    goto :goto_4

    .line 217
    :cond_9
    move-object/from16 v10, p1

    .line 218
    .line 219
    :goto_4
    instance-of v15, v10, Landroid/net/wifi/WifiInfo;

    .line 220
    .line 221
    if-eqz v15, :cond_a

    .line 222
    .line 223
    check-cast v10, Landroid/net/wifi/WifiInfo;

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_a
    move-object/from16 v10, p1

    .line 227
    .line 228
    :goto_5
    if-eqz v10, :cond_b

    .line 229
    .line 230
    invoke-virtual {v10}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v15

    .line 234
    goto :goto_6

    .line 235
    :cond_b
    move-object/from16 v15, p1

    .line 236
    .line 237
    :goto_6
    if-eqz v15, :cond_e

    .line 238
    .line 239
    invoke-static {v15}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 240
    .line 241
    .line 242
    move-result v15

    .line 243
    if-eqz v15, :cond_c

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_c
    invoke-virtual {v10}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    const-string v7, "<unknown ssid>"

    .line 251
    .line 252
    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    if-eqz v7, :cond_d

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_d
    invoke-virtual {v10}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    goto :goto_8

    .line 264
    :cond_e
    :goto_7
    iget-object v7, v14, La/tgk;->f:La/n0o0;

    .line 265
    .line 266
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    check-cast v7, Landroid/net/wifi/WifiManager;

    .line 271
    .line 272
    if-eqz v7, :cond_f

    .line 273
    .line 274
    invoke-virtual {v7}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    if-eqz v7, :cond_f

    .line 279
    .line 280
    invoke-virtual {v7}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    goto :goto_8

    .line 285
    :cond_f
    move-object/from16 v7, p1

    .line 286
    .line 287
    :goto_8
    invoke-static {v7}, La/tgk;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    goto :goto_b

    .line 292
    :cond_10
    iget-object v7, v14, La/tgk;->f:La/n0o0;

    .line 293
    .line 294
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    check-cast v7, Landroid/net/wifi/WifiManager;

    .line 299
    .line 300
    if-eqz v7, :cond_11

    .line 301
    .line 302
    invoke-virtual {v7}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    goto :goto_9

    .line 307
    :cond_11
    move-object/from16 v7, p1

    .line 308
    .line 309
    :goto_9
    if-eqz v7, :cond_12

    .line 310
    .line 311
    invoke-virtual {v7}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    goto :goto_a

    .line 316
    :cond_12
    move-object/from16 v7, p1

    .line 317
    .line 318
    :goto_a
    invoke-static {v7}, La/tgk;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    :goto_b
    iget-object v0, v0, La/mii0;->e:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, La/rpt;

    .line 325
    .line 326
    iget-object v0, v0, La/rpt;->a:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, La/psc;

    .line 329
    .line 330
    iget-object v0, v0, La/psc;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, La/tgk;

    .line 333
    .line 334
    iget-object v0, v0, La/tgk;->g:La/n0o0;

    .line 335
    .line 336
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 341
    .line 342
    if-eqz v0, :cond_13

    .line 343
    .line 344
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    goto :goto_c

    .line 349
    :cond_13
    move-object/from16 v0, p1

    .line 350
    .line 351
    :goto_c
    if-nez v0, :cond_14

    .line 352
    .line 353
    const-string v0, ""

    .line 354
    .line 355
    :cond_14
    invoke-direct {v11, v13, v7, v0, v4}, La/gv00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 359
    .line 360
    const-string v4, "https://mob-experience.space"

    .line 361
    .line 362
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_18

    .line 367
    .line 368
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 369
    .line 370
    iget-object v0, v1, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->l:La/ot10;

    .line 371
    .line 372
    if-eqz v0, :cond_17

    .line 373
    .line 374
    iput-object v12, v2, La/e5m0;->i:Ljava/io/File;

    .line 375
    .line 376
    iput-object v11, v2, La/e5m0;->j:La/gv00;

    .line 377
    .line 378
    iput-object v1, v2, La/e5m0;->k:Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;

    .line 379
    .line 380
    iput v9, v2, La/e5m0;->n:I

    .line 381
    .line 382
    invoke-virtual {v0, v2}, La/ot10;->d(La/zje;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    if-ne v0, v3, :cond_15

    .line 387
    .line 388
    goto/16 :goto_14

    .line 389
    .line 390
    :cond_15
    move-object v4, v1

    .line 391
    :goto_d
    check-cast v0, Ljava/lang/String;

    .line 392
    .line 393
    iget-object v4, v4, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->m:La/msh0;

    .line 394
    .line 395
    if-eqz v4, :cond_16

    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    sput-object v0, La/ujn;->h:Ljava/lang/String;

    .line 401
    .line 402
    iget-object v0, v4, La/msh0;->a:La/gii0;

    .line 403
    .line 404
    iget-object v0, v0, La/gii0;->d:Ljava/util/LinkedHashMap;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 407
    .line 408
    .line 409
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 412
    .line 413
    goto :goto_f

    .line 414
    :catchall_1
    move-exception v0

    .line 415
    goto :goto_e

    .line 416
    :cond_16
    const-string v0, "updateApiEndpointUseCase"

    .line 417
    .line 418
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw p1

    .line 422
    :cond_17
    const-string v0, "mainDomainResolver"

    .line 423
    .line 424
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 428
    :goto_e
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 429
    .line 430
    new-instance v4, La/g0g0;

    .line 431
    .line 432
    invoke-direct {v4, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 433
    .line 434
    .line 435
    move-object v0, v4

    .line 436
    :goto_f
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    if-nez v0, :cond_19

    .line 441
    .line 442
    :cond_18
    move-object v4, v11

    .line 443
    goto :goto_10

    .line 444
    :cond_19
    if-eqz v5, :cond_1a

    .line 445
    .line 446
    invoke-virtual {v5, v11}, La/zx10;->n(La/gv00;)V

    .line 447
    .line 448
    .line 449
    new-instance v0, La/lg00;

    .line 450
    .line 451
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 452
    .line 453
    .line 454
    return-object v0

    .line 455
    :cond_1a
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    throw p1

    .line 459
    :goto_10
    iget-object v0, v1, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->n:La/x20;

    .line 460
    .line 461
    if-eqz v0, :cond_28

    .line 462
    .line 463
    iget-object v7, v4, La/gv00;->b:Ljava/lang/String;

    .line 464
    .line 465
    iget-object v10, v4, La/gv00;->d:Ljava/lang/String;

    .line 466
    .line 467
    iget-object v11, v4, La/gv00;->c:Ljava/lang/String;

    .line 468
    .line 469
    invoke-static {v7, v11, v10}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    iget-object v0, v0, La/x20;->a:La/s1p;

    .line 473
    .line 474
    new-instance v13, La/j1p;

    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    invoke-direct {v13, v7, v14}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 478
    .line 479
    .line 480
    new-instance v7, La/j1p;

    .line 481
    .line 482
    invoke-direct {v7, v11, v9}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 483
    .line 484
    .line 485
    new-instance v15, La/j1p;

    .line 486
    .line 487
    invoke-direct {v15, v10, v8}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 488
    .line 489
    .line 490
    move/from16 v16, v9

    .line 491
    .line 492
    move/from16 v17, v14

    .line 493
    .line 494
    const/4 v9, 0x3

    .line 495
    new-array v14, v9, [La/k1p;

    .line 496
    .line 497
    aput-object v13, v14, v17

    .line 498
    .line 499
    aput-object v7, v14, v16

    .line 500
    .line 501
    aput-object v15, v14, v8

    .line 502
    .line 503
    invoke-static {v14}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 504
    .line 505
    .line 506
    move-result-object v7

    .line 507
    const-wide/16 v13, 0x2ffa

    .line 508
    .line 509
    invoke-virtual {v0, v7, v13, v14}, La/s1p;->a(Ljava/util/Set;J)V

    .line 510
    .line 511
    .line 512
    iget-object v0, v1, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->o:La/u58;

    .line 513
    .line 514
    if-eqz v0, :cond_27

    .line 515
    .line 516
    iget-object v7, v4, La/gv00;->a:Ljava/lang/String;

    .line 517
    .line 518
    iget-object v9, v4, La/gv00;->b:Ljava/lang/String;

    .line 519
    .line 520
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    iget-object v0, v0, La/u58;->a:La/kt2;

    .line 527
    .line 528
    new-instance v13, La/jo20;

    .line 529
    .line 530
    const/16 v14, 0x19

    .line 531
    .line 532
    invoke-direct {v13, v14}, La/jo20;-><init>(I)V

    .line 533
    .line 534
    .line 535
    const/16 v14, 0x64

    .line 536
    .line 537
    invoke-static {v14, v7}, La/ttm0;->L(ILjava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v7

    .line 541
    const-string v15, "userId"

    .line 542
    .line 543
    invoke-virtual {v13, v15, v7}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    const-string v7, "option"

    .line 547
    .line 548
    invoke-static {v14, v9}, La/ttm0;->L(ILjava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v9

    .line 552
    invoke-virtual {v13, v7, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    const-string v7, "point"

    .line 556
    .line 557
    invoke-static {v14, v11}, La/ttm0;->L(ILjava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v9

    .line 561
    invoke-virtual {v13, v7, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    invoke-static {v10}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 565
    .line 566
    .line 567
    move-result v7

    .line 568
    if-nez v7, :cond_1c

    .line 569
    .line 570
    const/16 v7, 0x898

    .line 571
    .line 572
    invoke-static {v7, v10}, La/ttm0;->M(ILjava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v7

    .line 576
    invoke-static {v14, v7}, La/ttm0;->G(ILjava/lang/CharSequence;)Ljava/util/ArrayList;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 581
    .line 582
    .line 583
    move-result-object v7

    .line 584
    move/from16 v14, v17

    .line 585
    .line 586
    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 587
    .line 588
    .line 589
    move-result v9

    .line 590
    if-eqz v9, :cond_1c

    .line 591
    .line 592
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v9

    .line 596
    add-int/lit8 v10, v14, 0x1

    .line 597
    .line 598
    if-ltz v14, :cond_1b

    .line 599
    .line 600
    check-cast v9, Ljava/lang/String;

    .line 601
    .line 602
    new-instance v11, Ljava/lang/StringBuilder;

    .line 603
    .line 604
    const-string v15, "error_code_"

    .line 605
    .line 606
    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v11

    .line 616
    invoke-virtual {v13, v11, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move v14, v10

    .line 620
    goto :goto_11

    .line 621
    :cond_1b
    invoke-static {}, La/q3d;->p()V

    .line 622
    .line 623
    .line 624
    throw p1

    .line 625
    :cond_1c
    invoke-virtual {v13}, La/jo20;->b()La/jo20;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    const-string v9, "app_open_error"

    .line 630
    .line 631
    invoke-interface {v0, v9, v7}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 632
    .line 633
    .line 634
    iget-object v0, v1, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->h:La/ojj;

    .line 635
    .line 636
    if-eqz v0, :cond_26

    .line 637
    .line 638
    iput-object v12, v2, La/e5m0;->i:Ljava/io/File;

    .line 639
    .line 640
    iput-object v4, v2, La/e5m0;->j:La/gv00;

    .line 641
    .line 642
    move-object/from16 v7, p1

    .line 643
    .line 644
    iput-object v7, v2, La/e5m0;->k:Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;

    .line 645
    .line 646
    iput v8, v2, La/e5m0;->n:I

    .line 647
    .line 648
    invoke-virtual {v0, v4, v2}, La/ojj;->a(La/gv00;La/zje;)Ljava/io/Serializable;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    if-ne v0, v3, :cond_1d

    .line 653
    .line 654
    goto :goto_14

    .line 655
    :cond_1d
    move-object v8, v12

    .line 656
    :goto_12
    check-cast v0, Ljava/lang/Boolean;

    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-eqz v0, :cond_24

    .line 663
    .line 664
    iget-object v0, v1, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->j:La/jw20;

    .line 665
    .line 666
    if-eqz v0, :cond_23

    .line 667
    .line 668
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    iget-object v0, v0, La/jw20;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, La/dpi0;

    .line 674
    .line 675
    iget-object v0, v0, La/dpi0;->a:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v0, La/g090;

    .line 678
    .line 679
    invoke-virtual {v0}, La/g090;->l()Ljava/util/List;

    .line 680
    .line 681
    .line 682
    move-result-object v5

    .line 683
    new-instance v6, Ljava/util/ArrayList;

    .line 684
    .line 685
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 686
    .line 687
    .line 688
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object v7

    .line 692
    :cond_1e
    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v9

    .line 696
    if-eqz v9, :cond_1f

    .line 697
    .line 698
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v9

    .line 702
    move-object v10, v9

    .line 703
    check-cast v10, La/gv00;

    .line 704
    .line 705
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    iget-object v10, v10, La/gv00;->d:Ljava/lang/String;

    .line 709
    .line 710
    iget-object v11, v4, La/gv00;->d:Ljava/lang/String;

    .line 711
    .line 712
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v10

    .line 716
    if-nez v10, :cond_1e

    .line 717
    .line 718
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    goto :goto_13

    .line 722
    :cond_1f
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 723
    .line 724
    .line 725
    move-result v4

    .line 726
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 727
    .line 728
    .line 729
    move-result v5

    .line 730
    if-eq v4, v5, :cond_20

    .line 731
    .line 732
    invoke-virtual {v0, v6}, La/g090;->w(Ljava/util/List;)V

    .line 733
    .line 734
    .line 735
    :cond_20
    iget-object v0, v1, Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;->k:La/ywu;

    .line 736
    .line 737
    if-eqz v0, :cond_22

    .line 738
    .line 739
    iput-object v8, v2, La/e5m0;->i:Ljava/io/File;

    .line 740
    .line 741
    const/4 v7, 0x0

    .line 742
    iput-object v7, v2, La/e5m0;->j:La/gv00;

    .line 743
    .line 744
    const/4 v9, 0x3

    .line 745
    iput v9, v2, La/e5m0;->n:I

    .line 746
    .line 747
    invoke-virtual {v0, v2}, La/ywu;->w(La/zje;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    if-ne v0, v3, :cond_21

    .line 752
    .line 753
    :goto_14
    return-object v3

    .line 754
    :cond_21
    move-object v1, v8

    .line 755
    :goto_15
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 756
    .line 757
    .line 758
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    goto :goto_16

    .line 763
    :cond_22
    const-string v0, "retryStartFailedLogsUseCase"

    .line 764
    .line 765
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    const/4 v7, 0x0

    .line 769
    throw v7

    .line 770
    :cond_23
    const/4 v7, 0x0

    .line 771
    const-string v0, "removeFromSavedUseCase"

    .line 772
    .line 773
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    throw v7

    .line 777
    :cond_24
    const/4 v7, 0x0

    .line 778
    if-eqz v5, :cond_25

    .line 779
    .line 780
    invoke-virtual {v5, v4}, La/zx10;->n(La/gv00;)V

    .line 781
    .line 782
    .line 783
    new-instance v0, La/lg00;

    .line 784
    .line 785
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 786
    .line 787
    .line 788
    :goto_16
    return-object v0

    .line 789
    :cond_25
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    throw v7

    .line 793
    :cond_26
    move-object/from16 v7, p1

    .line 794
    .line 795
    const-string v0, "sendSysLogUseCase"

    .line 796
    .line 797
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    throw v7

    .line 801
    :cond_27
    move-object/from16 v7, p1

    .line 802
    .line 803
    const-string v0, "startFailedAnalytics"

    .line 804
    .line 805
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    throw v7

    .line 809
    :cond_28
    move-object/from16 v7, p1

    .line 810
    .line 811
    const-string v0, "appStartFatmanLogger"

    .line 812
    .line 813
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    throw v7

    .line 817
    :cond_29
    move-object v7, v10

    .line 818
    const-string v0, "collectStartFailedLogDataUseCase"

    .line 819
    .line 820
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    throw v7
.end method
