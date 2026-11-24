.class public final Lcom/appsflyer/internal/AFf1uSDK;
.super Lcom/appsflyer/internal/AFf1tSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1uSDK$AFa1ySDK;
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/internal/AFi1aSDK;

.field private final AppsFlyerLib:Lcom/appsflyer/internal/AFe1wSDK;

.field private final afDebugLog:Lcom/appsflyer/internal/AFa1lSDK;

.field private final afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

.field private final afInfoLog:Lcom/appsflyer/internal/AFf1hSDK;

.field private final afWarnLog:Lcom/appsflyer/internal/AFc1eSDK;

.field private final force:Lcom/appsflyer/internal/AFc1dSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/share/AppsFlyerConversionListener;",
            ">;"
        }
    .end annotation
.end field

.field private final getEntries:Lcom/appsflyer/internal/AFf1aSDK;

.field public v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "+",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final values:Lcom/appsflyer/internal/AFh1sSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1bSDK;)V
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
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFf1tSDK;-><init>(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Lcom/appsflyer/internal/AFc1dSDK;

    .line 17
    .line 18
    new-instance p1, Lcom/appsflyer/internal/d;

    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    invoke-direct {p1, v2, p2}, Lcom/appsflyer/internal/d;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->force:Lcom/appsflyer/internal/AFc1dSDK;

    .line 28
    .line 29
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFi1aSDK;

    .line 37
    .line 38
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 46
    .line 47
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1hSDK;

    .line 55
    .line 56
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->afDebugLog:Lcom/appsflyer/internal/AFa1lSDK;

    .line 64
    .line 65
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1eSDK;

    .line 73
    .line 74
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFe1wSDK;

    .line 82
    .line 83
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->getEntries:Lcom/appsflyer/internal/AFf1aSDK;

    .line 91
    .line 92
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iput-object p0, v0, Lcom/appsflyer/internal/AFf1uSDK;->values:Lcom/appsflyer/internal/AFh1sSDK;

    .line 97
    .line 98
    sget-object p0, Lcom/appsflyer/internal/AFd1bSDK;->e:Lcom/appsflyer/internal/AFd1bSDK;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object p1, v0, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    .line 104
    .line 105
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    sget-object p0, Lcom/appsflyer/internal/AFd1bSDK;->force:Lcom/appsflyer/internal/AFd1bSDK;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object p1, v0, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    .line 114
    .line 115
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method private static final AFLogger(Lcom/appsflyer/internal/AFc1bSDK;)Lcom/appsflyer/share/AppsFlyerConversionListener;
    .locals 0

    .line 51
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserFirstName()Lcom/appsflyer/share/AppsFlyerConversionListener;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFc1bSDK;)Lcom/appsflyer/share/AppsFlyerConversionListener;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1uSDK;->AFLogger(Lcom/appsflyer/internal/AFc1bSDK;)Lcom/appsflyer/share/AppsFlyerConversionListener;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFf1uSDK;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1uSDK;->d(Lcom/appsflyer/internal/AFf1uSDK;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/appsflyer/internal/AFf1uSDK;)Lkotlin/Unit;
    .locals 1

    .line 558
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1uSDK;->getEntries:Lcom/appsflyer/internal/AFf1aSDK;

    new-instance v0, Lcom/appsflyer/internal/AFh1kSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFh1kSDK;-><init>()V

    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 559
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final AFLogger()Z
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->AFLogger()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 11
    .line 12
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    div-int/lit16 v0, v0, 0x1f4

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v4

    .line 30
    :goto_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 31
    .line 32
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 33
    .line 34
    if-eq p0, v2, :cond_2

    .line 35
    .line 36
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    .line 37
    .line 38
    if-ne p0, v2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move p0, v4

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_1
    move p0, v1

    .line 44
    :goto_2
    if-eqz v0, :cond_3

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    return v4

    .line 50
    :cond_4
    :goto_3
    return v1
.end method

.method public final d(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lcom/appsflyer/internal/AFf1tSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->afWarnLog:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 10
    .line 11
    iget-object v2, v1, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 12
    .line 13
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 14
    .line 15
    const-string v3, "appsFlyerCount"

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-interface {v2, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    const-string v3, "first_launch"

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    if-ne v2, v7, :cond_1

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    iput-wide v8, v1, Lcom/appsflyer/internal/AFh1xSDK;->afErrorLog:J

    .line 34
    .line 35
    iget-wide v10, v1, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    .line 36
    .line 37
    cmp-long v2, v10, v5

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    iget-object v2, v1, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 42
    .line 43
    sub-long/2addr v8, v10

    .line 44
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    const-string v9, "from_fg"

    .line 49
    .line 50
    invoke-interface {v2, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v2, v1, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 54
    .line 55
    new-instance v8, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-direct {v8, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v1, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 61
    .line 62
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-interface {v1, v3, v2}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 71
    .line 72
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 73
    .line 74
    const-string v8, "Metrics: fg ts is missing"

    .line 75
    .line 76
    invoke-virtual {v1, v2, v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    :goto_0
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 80
    .line 81
    const-string v2, "meta"

    .line 82
    .line 83
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    instance-of v8, v1, Ljava/util/Map;

    .line 88
    .line 89
    if-eqz v8, :cond_3

    .line 90
    .line 91
    instance-of v8, v1, La/khy;

    .line 92
    .line 93
    if-eqz v8, :cond_2

    .line 94
    .line 95
    instance-of v8, v1, La/ohy;

    .line 96
    .line 97
    if-eqz v8, :cond_3

    .line 98
    .line 99
    :cond_2
    check-cast v1, Ljava/util/Map;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    const/4 v1, 0x0

    .line 103
    :goto_1
    if-nez v1, :cond_4

    .line 104
    .line 105
    new-instance v1, Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v8, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-interface {v8, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_4
    iget-object v8, p0, Lcom/appsflyer/internal/AFf1uSDK;->afDebugLog:Lcom/appsflyer/internal/AFa1lSDK;

    .line 119
    .line 120
    invoke-interface {v8}, Lcom/appsflyer/internal/AFa1lSDK;->unregisterClient()Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-nez v9, :cond_5

    .line 129
    .line 130
    invoke-virtual {p1, v8}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 131
    .line 132
    .line 133
    :cond_5
    iget-object v8, p0, Lcom/appsflyer/internal/AFf1uSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1hSDK;

    .line 134
    .line 135
    invoke-virtual {v8}, Lcom/appsflyer/internal/AFf1hSDK;->d()Lcom/appsflyer/internal/AFh1bSDK;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    if-eqz v8, :cond_d

    .line 140
    .line 141
    new-instance v9, Ljava/util/HashMap;

    .line 142
    .line 143
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v10, "cdn_token"

    .line 147
    .line 148
    iget-object v11, v8, Lcom/appsflyer/internal/AFh1bSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    iget-object v10, v8, Lcom/appsflyer/internal/AFh1bSDK;->d:Ljava/lang/String;

    .line 154
    .line 155
    if-eqz v10, :cond_6

    .line 156
    .line 157
    const-string v11, "c_ver"

    .line 158
    .line 159
    invoke-virtual {v9, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :cond_6
    iget-wide v10, v8, Lcom/appsflyer/internal/AFh1bSDK;->AFLogger:J

    .line 163
    .line 164
    cmp-long v12, v10, v5

    .line 165
    .line 166
    if-lez v12, :cond_7

    .line 167
    .line 168
    const-string v12, "latency"

    .line 169
    .line 170
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    invoke-virtual {v9, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    :cond_7
    iget-wide v10, v8, Lcom/appsflyer/internal/AFh1bSDK;->unregisterClient:J

    .line 178
    .line 179
    cmp-long v5, v10, v5

    .line 180
    .line 181
    if-lez v5, :cond_8

    .line 182
    .line 183
    const-string v5, "delay"

    .line 184
    .line 185
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-virtual {v9, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_8
    iget v5, v8, Lcom/appsflyer/internal/AFh1bSDK;->registerClient:I

    .line 193
    .line 194
    if-lez v5, :cond_9

    .line 195
    .line 196
    const-string v6, "res_code"

    .line 197
    .line 198
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual {v9, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    :cond_9
    iget-object v5, v8, Lcom/appsflyer/internal/AFh1bSDK;->e:Ljava/lang/Throwable;

    .line 206
    .line 207
    if-eqz v5, :cond_a

    .line 208
    .line 209
    new-instance v6, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const-string v5, ": "

    .line 223
    .line 224
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    iget-object v5, v8, Lcom/appsflyer/internal/AFh1bSDK;->e:Ljava/lang/Throwable;

    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    const-string v6, "error"

    .line 241
    .line 242
    invoke-virtual {v9, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    :cond_a
    iget-object v5, v8, Lcom/appsflyer/internal/AFh1bSDK;->force:Lcom/appsflyer/internal/AFh1dSDK;

    .line 246
    .line 247
    if-eqz v5, :cond_b

    .line 248
    .line 249
    const-string v6, "sig"

    .line 250
    .line 251
    invoke-virtual {v5}, Lcom/appsflyer/internal/AFh1dSDK;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-virtual {v9, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    :cond_b
    iget-object v5, v8, Lcom/appsflyer/internal/AFh1bSDK;->w:Ljava/lang/String;

    .line 259
    .line 260
    if-eqz v5, :cond_c

    .line 261
    .line 262
    const-string v6, "cdn_cache_status"

    .line 263
    .line 264
    invoke-virtual {v9, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    :cond_c
    const-string v5, "rc"

    .line 268
    .line 269
    invoke-interface {v1, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    :cond_d
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1tSDK;->values()Lcom/appsflyer/internal/AFg1rSDK;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    iget-object v6, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 277
    .line 278
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-interface {v5, v6}, Lcom/appsflyer/internal/AFg1rSDK;->registerClient(Ljava/util/Map;)V

    .line 282
    .line 283
    .line 284
    const/4 v5, 0x2

    .line 285
    if-eq v0, v7, :cond_f

    .line 286
    .line 287
    if-eq v0, v5, :cond_e

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_e
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 291
    .line 292
    iget-object v8, v6, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 293
    .line 294
    invoke-interface {v8, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    new-instance v8, Ljava/util/HashMap;

    .line 298
    .line 299
    iget-object v6, v6, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 300
    .line 301
    invoke-direct {v8, v6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v8}, Ljava/util/HashMap;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    if-nez v6, :cond_11

    .line 309
    .line 310
    invoke-interface {v1, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_f
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 315
    .line 316
    new-instance v8, Ljava/util/HashMap;

    .line 317
    .line 318
    iget-object v9, v6, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    .line 319
    .line 320
    invoke-direct {v8, v9}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 321
    .line 322
    .line 323
    iget-object v6, v6, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    .line 324
    .line 325
    invoke-interface {v6}, Ljava/util/Map;->clear()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8}, Ljava/util/HashMap;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    if-nez v6, :cond_10

    .line 333
    .line 334
    const-string v6, "ddl"

    .line 335
    .line 336
    invoke-interface {v1, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    :cond_10
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 340
    .line 341
    new-instance v8, Ljava/util/HashMap;

    .line 342
    .line 343
    iget-object v6, v6, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 344
    .line 345
    invoke-direct {v8, v6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v8}, Ljava/util/HashMap;->isEmpty()Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    if-nez v6, :cond_11

    .line 353
    .line 354
    invoke-interface {v1, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    :cond_11
    :goto_2
    iget-object v3, p0, Lcom/appsflyer/internal/AFf1uSDK;->values:Lcom/appsflyer/internal/AFh1sSDK;

    .line 358
    .line 359
    if-nez v3, :cond_12

    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_12
    if-eq v0, v7, :cond_14

    .line 363
    .line 364
    if-eq v0, v5, :cond_13

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :cond_13
    instance-of v6, p1, Lcom/appsflyer/internal/AFh1kSDK;

    .line 368
    .line 369
    if-eqz v6, :cond_15

    .line 370
    .line 371
    invoke-interface {v3}, Lcom/appsflyer/internal/AFh1sSDK;->unregisterClient()Z

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    if-nez v6, :cond_15

    .line 376
    .line 377
    invoke-interface {v3, p1}, Lcom/appsflyer/internal/AFh1sSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 378
    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_14
    invoke-interface {v3, p1}, Lcom/appsflyer/internal/AFh1sSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 382
    .line 383
    .line 384
    :cond_15
    :goto_3
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_16

    .line 389
    .line 390
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 391
    .line 392
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    :cond_16
    if-gt v0, v5, :cond_1f

    .line 396
    .line 397
    if-ne v0, v7, :cond_17

    .line 398
    .line 399
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1uSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFi1aSDK;

    .line 400
    .line 401
    iput-boolean v7, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger:Z

    .line 402
    .line 403
    :cond_17
    new-instance v1, Ljava/util/ArrayList;

    .line 404
    .line 405
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 406
    .line 407
    .line 408
    iget-object v2, p0, Lcom/appsflyer/internal/AFf1uSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFi1aSDK;

    .line 409
    .line 410
    iget-object v2, v2, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 411
    .line 412
    new-array v3, v4, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 413
    .line 414
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    check-cast v2, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 419
    .line 420
    array-length v3, v2

    .line 421
    :goto_4
    if-ge v4, v3, :cond_1d

    .line 422
    .line 423
    aget-object v6, v2, v4

    .line 424
    .line 425
    instance-of v8, v6, Lcom/appsflyer/internal/AFi1gSDK;

    .line 426
    .line 427
    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    sget-object v10, Lcom/appsflyer/internal/AFf1uSDK$AFa1ySDK;->AFLogger:[I

    .line 432
    .line 433
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 434
    .line 435
    .line 436
    move-result v9

    .line 437
    aget v9, v10, v9

    .line 438
    .line 439
    if-eq v9, v7, :cond_1a

    .line 440
    .line 441
    if-eq v9, v5, :cond_19

    .line 442
    .line 443
    const/4 v6, 0x3

    .line 444
    if-ne v9, v6, :cond_18

    .line 445
    .line 446
    goto :goto_5

    .line 447
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 448
    .line 449
    .line 450
    return-void

    .line 451
    :cond_19
    if-ne v0, v5, :cond_1c

    .line 452
    .line 453
    if-nez v8, :cond_1c

    .line 454
    .line 455
    new-instance v8, Ljava/util/HashMap;

    .line 456
    .line 457
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 458
    .line 459
    .line 460
    const-string v9, "source"

    .line 461
    .line 462
    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getSource()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v10

    .line 466
    invoke-virtual {v8, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    const-string v9, "response"

    .line 470
    .line 471
    const-string v10, "TIMEOUT"

    .line 472
    .line 473
    invoke-virtual {v8, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    const-string v9, "type"

    .line 477
    .line 478
    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getType()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    invoke-virtual {v8, v9, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    goto :goto_5

    .line 489
    :cond_1a
    if-eqz v8, :cond_1b

    .line 490
    .line 491
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1tSDK;->getLevel()Lcom/appsflyer/internal/AFc1kSDK;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    const-string v9, "newGPReferrerSent"

    .line 496
    .line 497
    invoke-interface {v8, v9, v7}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    .line 498
    .line 499
    .line 500
    :cond_1b
    iget-object v6, v6, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 501
    .line 502
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    :cond_1c
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 506
    .line 507
    goto :goto_4

    .line 508
    :cond_1d
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-nez v0, :cond_1e

    .line 513
    .line 514
    const-string v0, "referrers"

    .line 515
    .line 516
    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 517
    .line 518
    .line 519
    :cond_1e
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->v:Ljava/util/Map;

    .line 520
    .line 521
    if-eqz v0, :cond_1f

    .line 522
    .line 523
    const-string v1, "fb_ddl"

    .line 524
    .line 525
    invoke-virtual {p1, v1, v0}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 526
    .line 527
    .line 528
    :cond_1f
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->values:Lcom/appsflyer/internal/AFh1sSDK;

    .line 529
    .line 530
    if-nez v0, :cond_20

    .line 531
    .line 532
    goto :goto_6

    .line 533
    :cond_20
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 538
    .line 539
    if-ne v1, v2, :cond_21

    .line 540
    .line 541
    invoke-interface {v0}, Lcom/appsflyer/internal/AFh1sSDK;->registerClient()Z

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    if-eqz v1, :cond_21

    .line 546
    .line 547
    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFh1sSDK;->registerClient(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 548
    .line 549
    .line 550
    :cond_21
    :goto_6
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1tSDK;->values()Lcom/appsflyer/internal/AFg1rSDK;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFg1rSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 555
    .line 556
    .line 557
    return-void
.end method

.method public final force()V
    .locals 11

    .line 1
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->force()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 5
    .line 6
    sget-object v1, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1eSDK;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iput-wide v2, v0, Lcom/appsflyer/internal/AFc1eSDK;->onPause:J

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 19
    .line 20
    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 21
    .line 22
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 23
    .line 24
    const-string v3, "appsFlyerCount"

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-interface {v2, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x1

    .line 32
    if-ne v2, v3, :cond_2

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    iget-wide v7, v0, Lcom/appsflyer/internal/AFh1xSDK;->afErrorLog:J

    .line 39
    .line 40
    const-wide/16 v9, 0x0

    .line 41
    .line 42
    cmp-long v2, v7, v9

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 47
    .line 48
    sub-long/2addr v5, v7

    .line 49
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    const-string v6, "net"

    .line 54
    .line 55
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 59
    .line 60
    new-instance v5, Lorg/json/JSONObject;

    .line 61
    .line 62
    invoke-direct {v5, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 66
    .line 67
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v5, "first_launch"

    .line 72
    .line 73
    invoke-interface {v0, v5, v2}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 78
    .line 79
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 80
    .line 81
    const-string v5, "Metrics collection skipped: launch start timestamp not recorded"

    .line 82
    .line 83
    invoke-virtual {v0, v2, v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->force:Lcom/appsflyer/internal/AFc1dSDK;

    .line 87
    .line 88
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1dSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/appsflyer/share/AppsFlyerConversionListener;

    .line 95
    .line 96
    if-nez v0, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-ne v2, v3, :cond_4

    .line 104
    .line 105
    move v4, v3

    .line 106
    :cond_4
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 107
    .line 108
    if-eq v2, v1, :cond_5

    .line 109
    .line 110
    if-eqz v4, :cond_6

    .line 111
    .line 112
    :cond_5
    new-instance v1, Lcom/appsflyer/internal/AFg1lSDK;

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1tSDK;->getLevel()Lcom/appsflyer/internal/AFc1kSDK;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-direct {v1, p0, v2, v0}, Lcom/appsflyer/internal/AFg1lSDK;-><init>(Lcom/appsflyer/internal/AFf1uSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFe1wSDK;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->values:Lcom/appsflyer/internal/AFh1sSDK;

    .line 127
    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    new-instance v1, Lcom/appsflyer/internal/d;

    .line 131
    .line 132
    const/4 v2, 0x3

    .line 133
    invoke-direct {v1, p0, v2}, Lcom/appsflyer/internal/d;-><init>(Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v0, p0, v1}, Lcom/appsflyer/internal/AFh1sSDK;->unregisterClient(Lcom/appsflyer/internal/AFf1uSDK;Lkotlin/jvm/functions/Function0;)V

    .line 137
    .line 138
    .line 139
    :cond_7
    return-void
.end method
