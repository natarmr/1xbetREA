.class public final Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "a/ga3",
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
.field public final g:La/nmt0;

.field public final h:La/zlt0;

.field public final i:La/rtu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 6

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
    const-class p2, La/ub6;

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
    instance-of v1, p1, La/ub6;

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :cond_2
    check-cast p1, La/ub6;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    iget-object p2, p1, La/ub6;->a:La/udv0;

    .line 60
    .line 61
    iget-object p2, p2, La/udv0;->a:La/rzi;

    .line 62
    .line 63
    iget-object p1, p1, La/ub6;->b:La/rtu;

    .line 64
    .line 65
    new-instance v0, La/nmt0;

    .line 66
    .line 67
    new-instance v1, La/fht0;

    .line 68
    .line 69
    iget-object v2, p2, La/rzi;->e:La/knf0;

    .line 70
    .line 71
    iget-object v3, p2, La/rzi;->f:La/nb6;

    .line 72
    .line 73
    iget-object v4, p2, La/rzi;->g:La/uzc;

    .line 74
    .line 75
    iget-object v5, p2, La/rzi;->h:La/gii0;

    .line 76
    .line 77
    invoke-direct {v1, v2, v3, v4, v5}, La/fht0;-><init>(La/knf0;La/nb6;La/uzc;La/gii0;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v1}, La/nmt0;-><init>(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;->g:La/nmt0;

    .line 84
    .line 85
    new-instance v0, La/zlt0;

    .line 86
    .line 87
    new-instance v1, La/fht0;

    .line 88
    .line 89
    iget-object v2, p2, La/rzi;->e:La/knf0;

    .line 90
    .line 91
    iget-object v3, p2, La/rzi;->f:La/nb6;

    .line 92
    .line 93
    iget-object v4, p2, La/rzi;->g:La/uzc;

    .line 94
    .line 95
    iget-object p2, p2, La/rzi;->h:La/gii0;

    .line 96
    .line 97
    invoke-direct {v1, v2, v3, v4, p2}, La/fht0;-><init>(La/knf0;La/nb6;La/uzc;La/gii0;)V

    .line 98
    .line 99
    .line 100
    const/4 p2, 0x6

    .line 101
    invoke-direct {v0, v1, p2}, La/zlt0;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;->h:La/zlt0;

    .line 105
    .line 106
    iput-object p1, p0, Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;->i:La/rtu;

    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 110
    .line 111
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v0
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, La/tb6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/tb6;

    .line 7
    .line 8
    iget v1, v0, La/tb6;->m:I

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
    iput v1, v0, La/tb6;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/tb6;

    .line 21
    .line 22
    check-cast p1, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, La/tb6;-><init>(Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, La/tb6;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/tb6;->m:I

    .line 32
    .line 33
    iget-object v3, p0, Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;->g:La/nmt0;

    .line 34
    .line 35
    const-string v4, "widgetSendWorkerResponseToLocalDataSourceUseCase"

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eq v2, v7, :cond_2

    .line 43
    .line 44
    if-ne v2, v6, :cond_1

    .line 45
    .line 46
    iget-object p0, v0, La/tb6;->i:Ljava/lang/String;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto/16 :goto_8

    .line 55
    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :cond_2
    iget-boolean v2, v0, La/tb6;->j:Z

    .line 63
    .line 64
    iget-object v7, v0, La/tb6;->i:Ljava/lang/String;

    .line 65
    .line 66
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 67
    .line 68
    .line 69
    move-object v10, v7

    .line 70
    move v7, v2

    .line 71
    move-object v2, v10

    .line 72
    goto :goto_1

    .line 73
    :catch_1
    move-exception p1

    .line 74
    move-object p0, v7

    .line 75
    goto/16 :goto_8

    .line 76
    .line 77
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, La/og00;->b:Landroidx/work/WorkerParameters;

    .line 81
    .line 82
    iget-object v2, p1, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 83
    .line 84
    const-string v8, "BUNDLE_REQUEST_ID"

    .line 85
    .line 86
    invoke-virtual {v2, v8}, La/maj;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_4
    iget-object p1, p1, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 103
    .line 104
    iget-object p1, p1, La/maj;->a:Ljava/util/HashMap;

    .line 105
    .line 106
    const-string v9, "BUNDLE_LIVE_TYPE"

    .line 107
    .line 108
    invoke-virtual {p1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    instance-of v9, p1, Ljava/lang/Boolean;

    .line 113
    .line 114
    if-eqz v9, :cond_5

    .line 115
    .line 116
    move-object v8, p1

    .line 117
    :cond_5
    check-cast v8, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    :try_start_2
    iget-object v8, p0, Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;->i:La/rtu;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 124
    .line 125
    if-eqz v8, :cond_b

    .line 126
    .line 127
    :try_start_3
    iput-object v2, v0, La/tb6;->i:Ljava/lang/String;

    .line 128
    .line 129
    iput-boolean p1, v0, La/tb6;->j:Z

    .line 130
    .line 131
    iput v7, v0, La/tb6;->m:I

    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    invoke-virtual {v8, v7, v7, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    if-ne v7, v1, :cond_6

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_6
    move-object v10, v7

    .line 142
    move v7, p1

    .line 143
    move-object p1, v10

    .line 144
    :goto_1
    check-cast p1, La/c3c0;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 145
    .line 146
    :try_start_4
    iget-object p0, p0, Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;->h:La/zlt0;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 147
    .line 148
    if-eqz p0, :cond_a

    .line 149
    .line 150
    :try_start_5
    iput-object v2, v0, La/tb6;->i:Ljava/lang/String;

    .line 151
    .line 152
    iput-boolean v7, v0, La/tb6;->j:Z

    .line 153
    .line 154
    iput v6, v0, La/tb6;->m:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 155
    .line 156
    :try_start_6
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p0, La/fht0;

    .line 159
    .line 160
    if-eqz v7, :cond_7

    .line 161
    .line 162
    invoke-virtual {p0, p1, v0}, La/fht0;->c(La/c3c0;La/zje;)Ljava/io/Serializable;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    :goto_2
    move-object p1, p0

    .line 167
    goto :goto_3

    .line 168
    :catch_2
    move-exception p0

    .line 169
    goto :goto_6

    .line 170
    :cond_7
    invoke-virtual {p0, p1, v0}, La/fht0;->b(La/c3c0;La/zje;)Ljava/io/Serializable;

    .line 171
    .line 172
    .line 173
    move-result-object p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 174
    goto :goto_2

    .line 175
    :goto_3
    if-ne p1, v1, :cond_8

    .line 176
    .line 177
    :goto_4
    return-object v1

    .line 178
    :cond_8
    move-object p0, v2

    .line 179
    :goto_5
    :try_start_7
    check-cast p1, Ljava/util/List;

    .line 180
    .line 181
    if-eqz v3, :cond_9

    .line 182
    .line 183
    new-instance v0, La/vb6;

    .line 184
    .line 185
    new-instance v1, La/cqv0;

    .line 186
    .line 187
    invoke-direct {v1, p1}, La/cqv0;-><init>(Ljava/util/List;)V

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, p0, v1}, La/vb6;-><init>(Ljava/lang/String;La/dqv0;)V

    .line 191
    .line 192
    .line 193
    iget-object p1, v3, La/nmt0;->a:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast p1, La/fht0;

    .line 196
    .line 197
    iget-object p1, p1, La/fht0;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p1, La/nb6;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget-object p1, p1, La/nb6;->b:La/qoj0;

    .line 205
    .line 206
    invoke-virtual {p1, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_9

    .line 210
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v5
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 214
    :goto_6
    move-object p1, p0

    .line 215
    :goto_7
    move-object p0, v2

    .line 216
    goto :goto_8

    .line 217
    :catch_3
    move-exception p1

    .line 218
    goto :goto_7

    .line 219
    :cond_a
    :try_start_8
    const-string p0, "widgetGetTopGamesUseCase"

    .line 220
    .line 221
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v5
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 225
    :catch_4
    move-exception p0

    .line 226
    goto :goto_6

    .line 227
    :cond_b
    :try_start_9
    const-string p0, "getShortProfileScenario"

    .line 228
    .line 229
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 233
    :catch_5
    move-exception p0

    .line 234
    goto :goto_6

    .line 235
    :goto_8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 236
    .line 237
    .line 238
    if-eqz v3, :cond_c

    .line 239
    .line 240
    new-instance v0, La/vb6;

    .line 241
    .line 242
    new-instance v1, La/bqv0;

    .line 243
    .line 244
    invoke-direct {v1, p1}, La/bqv0;-><init>(Ljava/lang/Exception;)V

    .line 245
    .line 246
    .line 247
    invoke-direct {v0, p0, v1}, La/vb6;-><init>(Ljava/lang/String;La/dqv0;)V

    .line 248
    .line 249
    .line 250
    iget-object p0, v3, La/nmt0;->a:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast p0, La/fht0;

    .line 253
    .line 254
    iget-object p0, p0, La/fht0;->b:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p0, La/nb6;

    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object p0, p0, La/nb6;->b:La/qoj0;

    .line 262
    .line 263
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    :goto_9
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0

    .line 271
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v5
.end method

.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, La/lvq;

    .line 2
    .line 3
    new-instance v1, La/g760;

    .line 4
    .line 5
    iget-object p0, p0, La/og00;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v2, "widget_best_update"

    .line 8
    .line 9
    invoke-direct {v1, p0, v2}, La/g760;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const p0, 0x7f080bba

    .line 13
    .line 14
    .line 15
    iget-object v2, v1, La/g760;->s:Landroid/app/Notification;

    .line 16
    .line 17
    iput p0, v2, Landroid/app/Notification;->icon:I

    .line 18
    .line 19
    const/4 p0, -0x2

    .line 20
    iput p0, v1, La/g760;->j:I

    .line 21
    .line 22
    invoke-virtual {v1}, La/g760;->a()Landroid/app/Notification;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/16 v2, 0x2712

    .line 28
    .line 29
    invoke-direct {v0, v2, p0, v1}, La/lvq;-><init>(ILandroid/app/Notification;I)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
