.class public final Lcom/appsflyer/internal/AFh1oSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFh1sSDK;


# instance fields
.field private AFKeystoreWrapper:Ljava/lang/Long;

.field private AFLogger:Lorg/json/JSONObject;

.field private final d:Lcom/appsflyer/internal/AFi1aSDK;

.field private e:Z

.field private force:Z

.field private registerClient:Ljava/lang/Long;

.field private final unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

.field private v:Z


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1aSDK;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFh1oSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/appsflyer/internal/AFh1oSDK;->d:Lcom/appsflyer/internal/AFi1aSDK;

    .line 13
    .line 14
    return-void
.end method

.method private final AFKeystoreWrapper()Lorg/json/JSONObject;
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0xbb8

    .line 6
    .line 7
    invoke-static {v2, v3}, Lcom/appsflyer/migration/internal/MigrationDataProvider;->waitForAttributionData(J)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    sub-long/2addr v3, v0

    .line 18
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->registerClient:Ljava/lang/Long;

    .line 23
    .line 24
    :cond_0
    return-object v2
.end method

.method private final unregisterClient(Ljava/lang/String;Lcom/appsflyer/internal/AFh1pSDK;Lorg/json/JSONObject;)V
    .locals 1

    .line 77
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 78
    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 80
    const-string p3, "branch"

    invoke-interface {p1, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 82
    const-string v0, "external"

    invoke-interface {p3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    invoke-virtual {p2, p3}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 84
    iget-object p1, p2, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFh1oSDK;->unregisterClient(Ljava/util/Map;Lcom/appsflyer/internal/AFe1zSDK;)V

    return-void
.end method

.method private final unregisterClient(Ljava/util/Map;Lcom/appsflyer/internal/AFe1zSDK;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            ")V"
        }
    .end annotation

    .line 86
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    if-ne p2, v0, :cond_0

    iget-object p0, p0, Lcom/appsflyer/internal/AFh1oSDK;->AFKeystoreWrapper:Ljava/lang/Long;

    goto :goto_0

    .line 87
    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    if-ne p2, v0, :cond_1

    iget-object p0, p0, Lcom/appsflyer/internal/AFh1oSDK;->registerClient:Ljava/lang/Long;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    .line 88
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 89
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1iSDK;->AFLogger(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    .line 90
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 91
    new-instance p2, Lkotlin/Pair;

    const-string v0, "delay"

    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    invoke-static {p2}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "migration"

    invoke-interface {p0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method


# virtual methods
.method public final AFLogger()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->e:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->force:Z

    .line 5
    .line 6
    invoke-static {}, Lcom/appsflyer/migration/internal/MigrationDataProvider;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final D_(Landroid/content/Intent;Lcom/appsflyer/internal/AFa1qSDK;)V
    .locals 10

    .line 1
    const v0, 0x59e3c68a

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0xf8e7231

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x5b131229

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const/4 v3, 0x2

    .line 36
    :try_start_0
    new-array v3, v3, [Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    aput-object p2, v3, v4

    .line 40
    .line 41
    const/4 p2, 0x0

    .line 42
    aput-object p1, v3, p2

    .line 43
    .line 44
    sget-object p1, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 45
    .line 46
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    const-string v5, ""

    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v8

    .line 61
    cmp-long v4, v8, v6

    .line 62
    .line 63
    const v8, 0xa1c7

    .line 64
    .line 65
    .line 66
    add-int/2addr v4, v8

    .line 67
    int-to-char v4, v4

    .line 68
    invoke-static {p2, p2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    const/16 v9, 0x30

    .line 73
    .line 74
    invoke-static {v5, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    add-int/lit8 v9, v9, 0x26

    .line 79
    .line 80
    invoke-static {v4, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/Class;

    .line 85
    .line 86
    const-class v8, Landroid/net/Uri;

    .line 87
    .line 88
    const-class v9, Lcom/appsflyer/internal/AFa1qSDK;

    .line 89
    .line 90
    filled-new-array {v8, v9}, [Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-virtual {v4, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {p1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    :goto_0
    check-cast v4, Ljava/lang/reflect/Constructor;

    .line 102
    .line 103
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    const-string v4, "AFLogger"

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    :try_start_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    shr-int/lit8 v3, v3, 0x8

    .line 122
    .line 123
    const v9, 0xa1c8

    .line 124
    .line 125
    .line 126
    sub-int/2addr v9, v3

    .line 127
    int-to-char v3, v9

    .line 128
    invoke-static {v5}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    add-int/lit8 v9, v9, 0x25

    .line 137
    .line 138
    invoke-static {v3, v5, v9}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Ljava/lang/Class;

    .line 143
    .line 144
    invoke-virtual {v3, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :goto_1
    check-cast v3, Ljava/lang/reflect/Method;

    .line 152
    .line 153
    invoke-virtual {v3, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-eqz v2, :cond_3

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_3
    invoke-static {p2, p2}, Landroid/view/View;->getDefaultSize(II)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    int-to-char p2, p2

    .line 169
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 170
    .line 171
    .line 172
    move-result-wide v2

    .line 173
    cmp-long v2, v2, v6

    .line 174
    .line 175
    add-int/lit8 v2, v2, 0x24

    .line 176
    .line 177
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    shr-int/lit8 v3, v3, 0x10

    .line 182
    .line 183
    rsub-int/lit8 v3, v3, 0x32

    .line 184
    .line 185
    invoke-static {p2, v2, v3}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    check-cast p2, Ljava/lang/Class;

    .line 190
    .line 191
    invoke-virtual {p2, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    :goto_2
    check-cast v2, Ljava/lang/reflect/Method;

    .line 199
    .line 200
    invoke-virtual {v2, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    check-cast p1, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 210
    xor-int/lit8 p2, p1, 0x1

    .line 211
    .line 212
    iput-boolean p2, p0, Lcom/appsflyer/internal/AFh1oSDK;->e:Z

    .line 213
    .line 214
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFh1oSDK;->force:Z

    .line 215
    .line 216
    return-void

    .line 217
    :catchall_0
    move-exception p0

    .line 218
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    if-eqz p1, :cond_4

    .line 223
    .line 224
    throw p1

    .line 225
    :cond_4
    throw p0
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->force:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/appsflyer/migration/internal/MigrationDataProvider;->waitForDeepLinkingData(J)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->e:Z

    .line 21
    .line 22
    :cond_2
    :goto_0
    return-void
.end method

.method public final d(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {}, Lcom/appsflyer/migration/internal/MigrationDataProvider;->getAttributionData()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 24
    const-string v1, "attr"

    invoke-direct {p0, v1, p1, v0}, Lcom/appsflyer/internal/AFh1oSDK;->unregisterClient(Ljava/lang/String;Lcom/appsflyer/internal/AFh1pSDK;Lorg/json/JSONObject;)V

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFh1oSDK;->v:Z

    .line 26
    :cond_0
    invoke-static {}, Lcom/appsflyer/migration/internal/MigrationDataProvider;->clear()V

    return-void
.end method

.method public final registerClient(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0xbb8

    .line 9
    .line 10
    invoke-static {v2, v3}, Lcom/appsflyer/migration/internal/MigrationDataProvider;->waitForDeepLinkingData(J)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    sub-long/2addr v3, v0

    .line 21
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->AFKeystoreWrapper:Ljava/lang/Long;

    .line 26
    .line 27
    const-string v0, "dl"

    .line 28
    .line 29
    invoke-direct {p0, v0, p1, v2}, Lcom/appsflyer/internal/AFh1oSDK;->unregisterClient(Ljava/lang/String;Lcom/appsflyer/internal/AFh1pSDK;Lorg/json/JSONObject;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-static {}, Lcom/appsflyer/migration/internal/MigrationDataProvider;->clear()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final registerClient()Z
    .locals 0

    .line 36
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFh1oSDK;->e:Z

    return p0
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFf1uSDK;Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFf1uSDK;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 10
    .line 11
    const-string v1, "appsFlyerCount"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    iget-object p1, p1, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 22
    .line 23
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    .line 27
    iget-object p1, p0, Lcom/appsflyer/internal/AFh1oSDK;->d:Lcom/appsflyer/internal/AFi1aSDK;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 52
    .line 53
    if-ne v0, v1, :cond_0

    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iget-boolean p1, p0, Lcom/appsflyer/internal/AFh1oSDK;->v:Z

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    invoke-direct {p0}, Lcom/appsflyer/internal/AFh1oSDK;->AFKeystoreWrapper()Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    iput-object p1, p0, Lcom/appsflyer/internal/AFh1oSDK;->AFLogger:Lorg/json/JSONObject;

    .line 67
    .line 68
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1oSDK;->AFLogger:Lorg/json/JSONObject;

    const-string v1, "attr"

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, v1, p1, v0}, Lcom/appsflyer/internal/AFh1oSDK;->unregisterClient(Ljava/lang/String;Lcom/appsflyer/internal/AFh1pSDK;Lorg/json/JSONObject;)V

    goto :goto_0

    .line 74
    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFh1oSDK;->AFKeystoreWrapper()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 75
    invoke-direct {p0, v1, p1, v0}, Lcom/appsflyer/internal/AFh1oSDK;->unregisterClient(Ljava/lang/String;Lcom/appsflyer/internal/AFh1pSDK;Lorg/json/JSONObject;)V

    .line 76
    :cond_1
    :goto_0
    invoke-static {}, Lcom/appsflyer/migration/internal/MigrationDataProvider;->clear()V

    return-void
.end method

.method public final unregisterClient()Z
    .locals 0

    .line 93
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFh1oSDK;->v:Z

    return p0
.end method
