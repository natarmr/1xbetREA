.class public final Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
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
.field public final g:Landroid/content/Context;

.field public final h:La/zx10;

.field public final i:La/h760;

.field public final j:La/mne;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 3

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
    iput-object p1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;->g:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast p1, Landroid/app/Application;

    .line 20
    .line 21
    instance-of p2, p1, La/af3;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    check-cast p1, La/af3;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object p1, v0

    .line 30
    :goto_0
    const-class p2, La/bzf;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, La/o5d0;

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, La/ze3;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object p1, v0

    .line 54
    :goto_1
    instance-of v1, p1, La/bzf;

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    move-object p1, v0

    .line 59
    :cond_2
    check-cast p1, La/bzf;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p2, p1, La/bzf;->a:La/mne;

    .line 64
    .line 65
    iget-object v0, p1, La/bzf;->b:La/lp4;

    .line 66
    .line 67
    iget-object v1, p1, La/bzf;->c:La/h760;

    .line 68
    .line 69
    iget-object v2, p1, La/bzf;->e:La/fsd;

    .line 70
    .line 71
    iget-object p1, p1, La/bzf;->d:La/zx10;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;->h:La/zx10;

    .line 83
    .line 84
    iput-object v1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;->i:La/h760;

    .line 85
    .line 86
    iput-object p2, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;->j:La/mne;

    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 90
    .line 91
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v2, v0, La/zyf;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, La/zyf;

    .line 9
    .line 10
    iget v3, v2, La/zyf;->n:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, La/zyf;->n:I

    .line 20
    .line 21
    :goto_0
    move-object v8, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v2, La/zyf;

    .line 24
    .line 25
    check-cast v0, La/zje;

    .line 26
    .line 27
    invoke-direct {v2, p0, v0}, La/zyf;-><init>(Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v8, La/zyf;->l:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v9, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v8, La/zyf;->n:I

    .line 36
    .line 37
    iget-object v3, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;->j:La/mne;

    .line 38
    .line 39
    const-string v4, "coroutineDispatchers"

    .line 40
    .line 41
    const/4 v10, 0x2

    .line 42
    const/4 v5, 0x1

    .line 43
    const/4 v11, 0x0

    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    if-eq v2, v5, :cond_2

    .line 47
    .line 48
    if-ne v2, v10, :cond_1

    .line 49
    .line 50
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v11

    .line 61
    :cond_2
    iget-object v2, v8, La/zyf;->k:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v5, v8, La/zyf;->j:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v6, v8, La/zyf;->i:Landroid/content/Intent;

    .line 66
    .line 67
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, La/og00;->b:Landroidx/work/WorkerParameters;

    .line 76
    .line 77
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 78
    .line 79
    iget-object v0, v0, La/maj;->a:Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    invoke-static {v6}, La/wp20;->a(I)I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    invoke-direct {v2, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Ljava/lang/Iterable;

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_4

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    check-cast v6, Ljava/util/Map$Entry;

    .line 122
    .line 123
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    check-cast v6, Ljava/lang/String;

    .line 135
    .line 136
    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    iget-object v0, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;->h:La/zx10;

    .line 141
    .line 142
    if-eqz v0, :cond_d

    .line 143
    .line 144
    sget-object v6, La/k9h0;->l1:La/k9h0;

    .line 145
    .line 146
    invoke-virtual {v0, v6, v2}, La/zx10;->j(La/k9h0;Ljava/util/Map;)Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v6, v2}, La/xvw;->L(La/k9h0;Ljava/util/Map;)Landroid/os/Bundle;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    const-string v7, "title"

    .line 155
    .line 156
    invoke-virtual {v2, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Ljava/lang/String;

    .line 161
    .line 162
    const-string v12, ""

    .line 163
    .line 164
    if-nez v7, :cond_5

    .line 165
    .line 166
    move-object v7, v12

    .line 167
    :cond_5
    const-string v13, "message"

    .line 168
    .line 169
    invoke-virtual {v2, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    check-cast v13, Ljava/lang/String;

    .line 174
    .line 175
    if-nez v13, :cond_6

    .line 176
    .line 177
    move-object v13, v12

    .line 178
    :cond_6
    const-string v14, "picUrl"

    .line 179
    .line 180
    invoke-virtual {v2, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Ljava/lang/String;

    .line 185
    .line 186
    if-nez v2, :cond_7

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    move-object v12, v2

    .line 190
    :goto_3
    invoke-virtual {v0, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 191
    .line 192
    .line 193
    invoke-static {v12}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_8

    .line 198
    .line 199
    move-object v2, v0

    .line 200
    move-object v5, v11

    .line 201
    goto :goto_5

    .line 202
    :cond_8
    if-eqz v3, :cond_c

    .line 203
    .line 204
    iget-object v2, v3, La/mne;->c:La/vs10;

    .line 205
    .line 206
    new-instance v6, La/b1f;

    .line 207
    .line 208
    const/4 v14, 0x4

    .line 209
    invoke-direct {v6, p0, v12, v11, v14}, La/b1f;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 210
    .line 211
    .line 212
    iput-object v0, v8, La/zyf;->i:Landroid/content/Intent;

    .line 213
    .line 214
    iput-object v7, v8, La/zyf;->j:Ljava/lang/String;

    .line 215
    .line 216
    iput-object v13, v8, La/zyf;->k:Ljava/lang/String;

    .line 217
    .line 218
    iput v5, v8, La/zyf;->n:I

    .line 219
    .line 220
    invoke-static {v2, v6, v8}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    if-ne v2, v9, :cond_9

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_9
    move-object v6, v0

    .line 228
    move-object v0, v2

    .line 229
    move-object v5, v7

    .line 230
    move-object v2, v13

    .line 231
    :goto_4
    check-cast v0, Landroid/graphics/Bitmap;

    .line 232
    .line 233
    move-object v13, v2

    .line 234
    move-object v7, v5

    .line 235
    move-object v2, v6

    .line 236
    move-object v5, v0

    .line 237
    :goto_5
    if-eqz v3, :cond_b

    .line 238
    .line 239
    iget-object v12, v3, La/mne;->c:La/vs10;

    .line 240
    .line 241
    new-instance v0, La/jv0;

    .line 242
    .line 243
    const/4 v6, 0x0

    .line 244
    move-object v3, v7

    .line 245
    const/4 v7, 0x7

    .line 246
    move-object v1, p0

    .line 247
    move-object v4, v13

    .line 248
    invoke-direct/range {v0 .. v7}, La/jv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 249
    .line 250
    .line 251
    iput-object v11, v8, La/zyf;->i:Landroid/content/Intent;

    .line 252
    .line 253
    iput-object v11, v8, La/zyf;->j:Ljava/lang/String;

    .line 254
    .line 255
    iput-object v11, v8, La/zyf;->k:Ljava/lang/String;

    .line 256
    .line 257
    iput v10, v8, La/zyf;->n:I

    .line 258
    .line 259
    invoke-static {v12, v0, v8}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    if-ne v0, v9, :cond_a

    .line 264
    .line 265
    :goto_6
    return-object v9

    .line 266
    :cond_a
    :goto_7
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0

    .line 271
    :cond_b
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v11

    .line 275
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v11

    .line 279
    :cond_d
    const-string v0, "screenTypeDelegate"

    .line 280
    .line 281
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v11
.end method

.method public final d()Ljava/lang/Object;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const-string v2, "push_worker_foreground"

    .line 6
    .line 7
    if-gt v1, v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, La/i7w0;->b()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/app/NotificationChannel;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-direct {v0, v2, v2, v1}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;->g:Landroid/content/Context;

    .line 23
    .line 24
    const-class v3, Landroid/app/NotificationManager;

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/app/NotificationManager;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    new-instance v0, La/g760;

    .line 36
    .line 37
    iget-object p0, p0, La/og00;->a:Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {v0, p0, v2}, La/g760;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const p0, 0x7f080bba

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, La/g760;->s:Landroid/app/Notification;

    .line 46
    .line 47
    iput p0, v1, Landroid/app/Notification;->icon:I

    .line 48
    .line 49
    const/4 p0, -0x2

    .line 50
    iput p0, v0, La/g760;->j:I

    .line 51
    .line 52
    invoke-virtual {v0}, La/g760;->a()Landroid/app/Notification;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v0, La/lvq;

    .line 60
    .line 61
    const/16 v1, 0x539

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {v0, v1, p0, v2}, La/lvq;-><init>(ILandroid/app/Notification;I)V

    .line 65
    .line 66
    .line 67
    return-object v0
.end method
