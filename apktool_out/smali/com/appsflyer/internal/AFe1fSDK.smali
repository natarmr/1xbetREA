.class public final Lcom/appsflyer/internal/AFe1fSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Lcom/appsflyer/internal/AFa1gSDK;",
        ">;"
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

.field private AppsFlyerLib:I

.field private final afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

.field private final afErrorLog:Lcom/appsflyer/internal/AFi1aSDK;

.field private final afInfoLog:Lcom/appsflyer/internal/AFc1eSDK;

.field private afWarnLog:I

.field private final force:Lcom/appsflyer/internal/AFc1iSDK;

.field private final getLevel:Ljava/util/concurrent/CountDownLatch;

.field private final v:Lcom/appsflyer/internal/AFa1oSDK;

.field private final valueOf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;"
        }
    .end annotation
.end field

.field private values:I


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->force:Lcom/appsflyer/internal/AFd1bSDK;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    new-array v2, v1, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 8
    .line 9
    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    aput-object v3, v2, v4

    .line 13
    .line 14
    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    aput-object v3, v2, v5

    .line 18
    .line 19
    const-string v3, "DdlSdk"

    .line 20
    .line 21
    invoke-direct {p0, v0, v2, p1, v3}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/appsflyer/internal/AFa1oSDK;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/appsflyer/internal/AFa1oSDK;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 30
    .line 31
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 39
    .line 40
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->afInfoLog:Lcom/appsflyer/internal/AFc1eSDK;

    .line 48
    .line 49
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 57
    .line 58
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 66
    .line 67
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afErrorLog:Lcom/appsflyer/internal/AFi1aSDK;

    .line 75
    .line 76
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 77
    .line 78
    invoke-direct {v0, v5}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->getLevel:Ljava/util/concurrent/CountDownLatch;

    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->valueOf:Ljava/util/List;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    new-array v0, v4, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    array-length v2, p1

    .line 109
    move v3, v4

    .line 110
    :goto_0
    if-ge v3, v2, :cond_1

    .line 111
    .line 112
    aget-object v6, p1, v3

    .line 113
    .line 114
    if-eqz v6, :cond_0

    .line 115
    .line 116
    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    sget-object v8, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->NOT_STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 121
    .line 122
    if-eq v7, v8, :cond_0

    .line 123
    .line 124
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iput p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->AppsFlyerLib:I

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_4

    .line 145
    .line 146
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    sget-object v3, Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;->AFKeystoreWrapper:[I

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    aget v2, v3, v2

    .line 163
    .line 164
    if-eq v2, v5, :cond_3

    .line 165
    .line 166
    if-eq v2, v1, :cond_2

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_2
    new-instance v2, Lcom/appsflyer/internal/o;

    .line 170
    .line 171
    invoke-direct {v2, v0, p0, v4}, Lcom/appsflyer/internal/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v2}, Lcom/appsflyer/sdk_base/referrer/Referrer;->setAdditionalReferrerDataCollectionFinishedCallback(Ljava/lang/Runnable;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_3
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 179
    .line 180
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 181
    .line 182
    iget-object v2, v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 183
    .line 184
    const-string v3, "source"

    .line 185
    .line 186
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    new-instance v3, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v2, " referrer collected earlier"

    .line 199
    .line 200
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    const/4 v10, 0x4

    .line 208
    const/4 v11, 0x0

    .line 209
    const/4 v9, 0x0

    .line 210
    invoke-static/range {v6 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFe1fSDK;->AFKeystoreWrapper(Lcom/appsflyer/sdk_base/referrer/Referrer;)V

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_4
    return-void
.end method

.method private final AFKeystoreWrapper(Lcom/appsflyer/sdk_base/referrer/Referrer;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/appsflyer/internal/AFe1fSDK;->unregisterClient(Lcom/appsflyer/sdk_base/referrer/Referrer;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->valueOf:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1fSDK;->getLevel:Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 18
    .line 19
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string p1, "Added non-organic "

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v4, 0x4

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->values:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    iput p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->values:I

    .line 47
    .line 48
    iget v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->AppsFlyerLib:I

    .line 49
    .line 50
    if-ne p1, v0, :cond_1

    .line 51
    .line 52
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1fSDK;->getLevel:Ljava/util/concurrent/CountDownLatch;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFe1fSDK;->unregisterClient(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V

    return-void
.end method

.method private static unregisterClient(Lcom/appsflyer/internal/AFb1lSDK;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFb1lSDK;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 47
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1lSDK;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 48
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1lSDK;->AFLogger:Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_1

    .line 50
    :cond_0
    new-instance p0, Lkotlin/Pair;

    const-string v1, "type"

    const-string v2, "unhashed"

    invoke-direct {p0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    new-instance v1, Lkotlin/Pair;

    const-string v2, "value"

    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    filled-new-array {p0, v1}, [Lkotlin/Pair;

    move-result-object p0

    .line 53
    invoke-static {p0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final unregisterClient(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V
    .locals 6

    .line 45
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    iget-object v2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v3, "source"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " referrer collected via callback"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 46
    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFe1fSDK;->AFKeystoreWrapper(Lcom/appsflyer/sdk_base/referrer/Referrer;)V

    return-void
.end method

.method private static unregisterClient(Lcom/appsflyer/sdk_base/referrer/Referrer;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "click_ts"

    .line 4
    .line 5
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Ljava/lang/Long;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Long;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 29
    .line 30
    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    sub-long/2addr v3, v1

    .line 35
    const-wide/32 v1, 0x5265c00

    .line 36
    .line 37
    .line 38
    cmp-long p0, v3, v1

    .line 39
    .line 40
    if-gez p0, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_1
    return v0
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Lcom/appsflyer/internal/AFa1gSDK;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    add-int/2addr p1, v0

    .line 8
    iput p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 9
    .line 10
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 11
    .line 12
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 13
    .line 14
    const-string v3, "Preparing request "

    .line 15
    .line 16
    invoke-static {p1, v3}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v5, 0x4

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 29
    .line 30
    iget v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-ne v1, v0, :cond_4

    .line 34
    .line 35
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 38
    .line 39
    const-string v3, "appsFlyerCount"

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-interface {v1, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v0, v4

    .line 50
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "is_first"

    .line 55
    .line 56
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, "-"

    .line 80
    .line 81
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v1, "lang"

    .line 92
    .line 93
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    const-string v0, "os"

    .line 97
    .line 98
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const-string v0, "type"

    .line 104
    .line 105
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 111
    .line 112
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 113
    .line 114
    invoke-static {v0}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-string v1, "request_id"

    .line 119
    .line 120
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->afInfoLog:Lcom/appsflyer/internal/AFc1eSDK;

    .line 124
    .line 125
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->w:Lcom/appsflyer/internal/AFb1rSDK;

    .line 126
    .line 127
    if-eqz v0, :cond_1

    .line 128
    .line 129
    iget-object v0, v0, Lcom/appsflyer/internal/AFb1rSDK;->AFKeystoreWrapper:[Ljava/lang/String;

    .line 130
    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    const-string v1, "sharing_filter"

    .line 134
    .line 135
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 139
    .line 140
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 141
    .line 142
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFh1qSDK;

    .line 143
    .line 144
    if-eqz v0, :cond_2

    .line 145
    .line 146
    new-instance v1, Lcom/appsflyer/internal/AFb1lSDK;

    .line 147
    .line 148
    iget-object v3, v0, Lcom/appsflyer/internal/AFh1qSDK;->AFLogger:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1qSDK;->registerClient:Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-direct {v1, v3, v0}, Lcom/appsflyer/internal/AFb1lSDK;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    move-object v1, v2

    .line 157
    :goto_1
    invoke-static {v1}, Lcom/appsflyer/internal/AFe1fSDK;->unregisterClient(Lcom/appsflyer/internal/AFb1lSDK;)Ljava/util/Map;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_3

    .line 162
    .line 163
    const-string v1, "gaid"

    .line 164
    .line 165
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 169
    .line 170
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 171
    .line 172
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 173
    .line 174
    invoke-static {v0}, Lcom/appsflyer/internal/AFb1iSDK;->unregisterClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1lSDK;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Lcom/appsflyer/internal/AFe1fSDK;->unregisterClient(Lcom/appsflyer/internal/AFb1lSDK;)Ljava/util/Map;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_4

    .line 183
    .line 184
    const-string v1, "oaid"

    .line 185
    .line 186
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 190
    .line 191
    .line 192
    move-result-wide v0

    .line 193
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 194
    .line 195
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 196
    .line 197
    const-string v5, "yyyy-MM-dd\'T\'HH:mm:ss.SSS"

    .line 198
    .line 199
    invoke-direct {v3, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 200
    .line 201
    .line 202
    const-string v4, "UTC"

    .line 203
    .line 204
    invoke-static {v4}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 209
    .line 210
    .line 211
    new-instance v4, Ljava/util/Date;

    .line 212
    .line 213
    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const-string v1, "timestamp"

    .line 221
    .line 222
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    iget v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 226
    .line 227
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const-string v3, "request_count"

    .line 232
    .line 233
    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->valueOf:Ljava/util/List;

    .line 237
    .line 238
    new-instance v3, Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_8

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    check-cast v4, Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 258
    .line 259
    invoke-virtual {v4}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    sget-object v6, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->FINISHED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 264
    .line 265
    if-ne v5, v6, :cond_7

    .line 266
    .line 267
    iget-object v5, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 268
    .line 269
    const-string v6, "referrer"

    .line 270
    .line 271
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    instance-of v6, v5, Ljava/lang/String;

    .line 276
    .line 277
    if-eqz v6, :cond_6

    .line 278
    .line 279
    check-cast v5, Ljava/lang/String;

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_6
    move-object v5, v2

    .line 283
    :goto_3
    if-eqz v5, :cond_7

    .line 284
    .line 285
    iget-object v4, v4, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 286
    .line 287
    const-string v6, "source"

    .line 288
    .line 289
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    check-cast v4, Ljava/lang/String;

    .line 297
    .line 298
    new-instance v7, Lkotlin/Pair;

    .line 299
    .line 300
    invoke-direct {v7, v6, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    new-instance v4, Lkotlin/Pair;

    .line 304
    .line 305
    const-string v6, "value"

    .line 306
    .line 307
    invoke-direct {v4, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    filled-new-array {v7, v4}, [Lkotlin/Pair;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-static {v4}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    goto :goto_4

    .line 319
    :cond_7
    move-object v4, v2

    .line 320
    :goto_4
    if-eqz v4, :cond_5

    .line 321
    .line 322
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_8
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-nez v0, :cond_9

    .line 331
    .line 332
    const-string v0, "referrers"

    .line 333
    .line 334
    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    :cond_9
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 338
    .line 339
    new-instance v0, Lcom/appsflyer/internal/AFj1mSDK;

    .line 340
    .line 341
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 342
    .line 343
    invoke-direct {v0, v2}, Lcom/appsflyer/internal/AFj1mSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afInfoLog()Lcom/appsflyer/internal/AFf1fSDK;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    const v4, -0x62ff1f55

    .line 359
    .line 360
    .line 361
    const v5, 0x62ff1f57

    .line 362
    .line 363
    .line 364
    invoke-static {v3, v4, v5, v2}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    check-cast v2, Ljava/lang/String;

    .line 369
    .line 370
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 371
    .line 372
    iget-object v3, v3, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 373
    .line 374
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    check-cast v1, Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {v0, v2, v1}, Lcom/appsflyer/internal/AFj1mSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    iput-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->i:Ljava/lang/String;

    .line 388
    .line 389
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 390
    .line 391
    iget v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 392
    .line 393
    if-lez v0, :cond_c

    .line 394
    .line 395
    const/4 v1, 0x2

    .line 396
    if-le v0, v1, :cond_a

    .line 397
    .line 398
    goto :goto_5

    .line 399
    :cond_a
    add-int/lit8 v0, v0, -0x1

    .line 400
    .line 401
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1xSDK;->force:[J

    .line 402
    .line 403
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 404
    .line 405
    .line 406
    move-result-wide v2

    .line 407
    aput-wide v2, v1, v0

    .line 408
    .line 409
    if-nez v0, :cond_d

    .line 410
    .line 411
    iget-wide v1, p1, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    .line 412
    .line 413
    const-wide/16 v3, 0x0

    .line 414
    .line 415
    cmp-long v3, v1, v3

    .line 416
    .line 417
    if-eqz v3, :cond_b

    .line 418
    .line 419
    iget-object v3, p1, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    .line 420
    .line 421
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1xSDK;->force:[J

    .line 422
    .line 423
    aget-wide v4, p1, v0

    .line 424
    .line 425
    sub-long/2addr v4, v1

    .line 426
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    const-string v0, "from_fg"

    .line 431
    .line 432
    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    goto :goto_6

    .line 436
    :cond_b
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 437
    .line 438
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 439
    .line 440
    const-string v1, "Metrics: fg ts is missing"

    .line 441
    .line 442
    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    goto :goto_6

    .line 446
    :cond_c
    :goto_5
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 447
    .line 448
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 449
    .line 450
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 451
    .line 452
    const-string p1, "Metrics: Unexpected ddl requestCount = "

    .line 453
    .line 454
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    invoke-direct {v5, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    const/4 v6, 0x0

    .line 466
    const/4 v7, 0x0

    .line 467
    const-string v4, "Unexpected ddl requestCount - start"

    .line 468
    .line 469
    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 470
    .line 471
    .line 472
    :cond_d
    :goto_6
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 477
    .line 478
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 483
    .line 484
    .line 485
    move-result p1

    .line 486
    const v0, 0xde1efcf

    .line 487
    .line 488
    .line 489
    const v1, -0xde1efce

    .line 490
    .line 491
    .line 492
    invoke-static {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    .line 497
    .line 498
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    return-object p0
.end method

.method public final AFLogger()Z
    .locals 0

    .line 502
    const/4 p0, 0x0

    return p0
.end method

.method public final a_()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final bridge synthetic afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final e()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final registerClient()Lcom/appsflyer/internal/AFd1cSDK;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "referrers"

    .line 4
    .line 5
    const-string v2, "Error occurred. Server response code = "

    .line 6
    .line 7
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    invoke-super {v1}, Lcom/appsflyer/internal/AFe1kSDK;->registerClient()Lcom/appsflyer/internal/AFd1cSDK;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    iget-object v5, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 15
    .line 16
    iget v6, v1, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 17
    .line 18
    const-wide/16 v7, 0x0

    .line 19
    .line 20
    const/4 v9, 0x2

    .line 21
    const/4 v10, 0x1

    .line 22
    if-lez v6, :cond_2

    .line 23
    .line 24
    if-le v6, v9, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sub-int/2addr v6, v10

    .line 28
    iget-object v11, v5, Lcom/appsflyer/internal/AFh1xSDK;->v:[J

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v12

    .line 34
    aput-wide v12, v11, v6

    .line 35
    .line 36
    iget-object v11, v5, Lcom/appsflyer/internal/AFh1xSDK;->force:[J

    .line 37
    .line 38
    aget-wide v12, v11, v6

    .line 39
    .line 40
    cmp-long v11, v12, v7

    .line 41
    .line 42
    if-eqz v11, :cond_1

    .line 43
    .line 44
    iget-object v11, v5, Lcom/appsflyer/internal/AFh1xSDK;->w:[J

    .line 45
    .line 46
    iget-object v14, v5, Lcom/appsflyer/internal/AFh1xSDK;->v:[J

    .line 47
    .line 48
    aget-wide v15, v14, v6

    .line 49
    .line 50
    sub-long/2addr v15, v12

    .line 51
    aput-wide v15, v11, v6

    .line 52
    .line 53
    iget-object v5, v5, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    .line 54
    .line 55
    const-string v6, "net"

    .line 56
    .line 57
    invoke-interface {v5, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_1
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 65
    .line 66
    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 67
    .line 68
    new-instance v12, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v13, "Metrics: ddlStart["

    .line 71
    .line 72
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v6, "] ts is missing"

    .line 79
    .line 80
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v5, v11, v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    :goto_0
    sget-object v11, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 92
    .line 93
    sget-object v12, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 94
    .line 95
    const-string v13, "Unexpected ddl requestCount - end"

    .line 96
    .line 97
    new-instance v14, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v5, "Metrics: Unexpected ddl requestCount = "

    .line 100
    .line 101
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-direct {v14, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 v15, 0x0

    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    invoke-virtual/range {v11 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 116
    .line 117
    .line 118
    :goto_1
    sget-object v5, Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;->registerClient:[I

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    aget v5, v5, v6

    .line 125
    .line 126
    if-eq v5, v10, :cond_5

    .line 127
    .line 128
    if-eq v5, v9, :cond_3

    .line 129
    .line 130
    return-object v3

    .line 131
    :cond_3
    sget-object v11, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 132
    .line 133
    sget-object v12, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 134
    .line 135
    iget-object v0, v1, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 136
    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move-object v0, v4

    .line 149
    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    const/4 v15, 0x4

    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    invoke-static/range {v11 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    .line 169
    .line 170
    sget-object v2, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->HTTP_STATUS_CODE:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 171
    .line 172
    invoke-direct {v0, v4, v2}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    .line 173
    .line 174
    .line 175
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 176
    .line 177
    iget-object v5, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 178
    .line 179
    iget-wide v5, v5, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 180
    .line 181
    invoke-virtual {v2, v0, v5, v6}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    .line 182
    .line 183
    .line 184
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 185
    .line 186
    invoke-virtual {v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    .line 187
    .line 188
    .line 189
    return-object v3

    .line 190
    :cond_5
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    check-cast v2, Lcom/appsflyer/internal/AFa1gSDK;

    .line 203
    .line 204
    iget-object v5, v2, Lcom/appsflyer/internal/AFa1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/share/deeplink/DeepLink;

    .line 205
    .line 206
    if-eqz v5, :cond_6

    .line 207
    .line 208
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    .line 209
    .line 210
    invoke-direct {v0, v5, v4}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    .line 211
    .line 212
    .line 213
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 214
    .line 215
    iget-object v5, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 216
    .line 217
    iget-wide v5, v5, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 218
    .line 219
    invoke-virtual {v2, v0, v5, v6}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    .line 220
    .line 221
    .line 222
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 223
    .line 224
    invoke-virtual {v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    .line 225
    .line 226
    .line 227
    return-object v3

    .line 228
    :cond_6
    iget v5, v1, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 229
    .line 230
    if-gt v5, v10, :cond_b

    .line 231
    .line 232
    iget-boolean v2, v2, Lcom/appsflyer/internal/AFa1gSDK;->AFLogger:Z

    .line 233
    .line 234
    if-eqz v2, :cond_b

    .line 235
    .line 236
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 237
    .line 238
    iget-object v2, v2, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 239
    .line 240
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    instance-of v5, v2, Ljava/util/List;

    .line 245
    .line 246
    if-eqz v5, :cond_7

    .line 247
    .line 248
    check-cast v2, Ljava/util/List;

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_7
    move-object v2, v4

    .line 252
    :goto_3
    const/4 v5, 0x0

    .line 253
    if-eqz v2, :cond_8

    .line 254
    .line 255
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    goto :goto_4

    .line 260
    :cond_8
    move v2, v5

    .line 261
    :goto_4
    iget v6, v1, Lcom/appsflyer/internal/AFe1fSDK;->AppsFlyerLib:I

    .line 262
    .line 263
    if-ge v2, v6, :cond_b

    .line 264
    .line 265
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 266
    .line 267
    iget-object v2, v2, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 268
    .line 269
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_b

    .line 274
    .line 275
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 276
    .line 277
    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 278
    .line 279
    const-string v11, "Waiting for referrers..."

    .line 280
    .line 281
    const/4 v13, 0x4

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v12, 0x0

    .line 284
    invoke-static/range {v9 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-object v0, v1, Lcom/appsflyer/internal/AFe1fSDK;->getLevel:Ljava/util/concurrent/CountDownLatch;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 290
    .line 291
    .line 292
    iget-object v0, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 293
    .line 294
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 295
    .line 296
    .line 297
    move-result-wide v10

    .line 298
    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->v:[J

    .line 299
    .line 300
    aget-wide v5, v2, v5

    .line 301
    .line 302
    cmp-long v2, v5, v7

    .line 303
    .line 304
    if-eqz v2, :cond_9

    .line 305
    .line 306
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    .line 307
    .line 308
    const-string v2, "rfr_wait"

    .line 309
    .line 310
    sub-long/2addr v10, v5

    .line 311
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-interface {v0, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_9
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 320
    .line 321
    const-string v2, "Metrics: ddlEnd[0] ts is missing"

    .line 322
    .line 323
    invoke-virtual {v9, v0, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    :goto_5
    iget v0, v1, Lcom/appsflyer/internal/AFe1fSDK;->values:I

    .line 327
    .line 328
    iget v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->AppsFlyerLib:I

    .line 329
    .line 330
    if-ne v0, v2, :cond_a

    .line 331
    .line 332
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    .line 333
    .line 334
    invoke-direct {v0, v4, v4}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    .line 335
    .line 336
    .line 337
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 338
    .line 339
    iget-object v5, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 340
    .line 341
    iget-wide v5, v5, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 342
    .line 343
    invoke-virtual {v2, v0, v5, v6}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    .line 344
    .line 345
    .line 346
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 347
    .line 348
    invoke-virtual {v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    .line 349
    .line 350
    .line 351
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    .line 352
    .line 353
    return-object v0

    .line 354
    :cond_a
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFe1fSDK;->registerClient()Lcom/appsflyer/internal/AFd1cSDK;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    return-object v0

    .line 359
    :cond_b
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    .line 360
    .line 361
    invoke-direct {v0, v4, v4}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    .line 362
    .line 363
    .line 364
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 365
    .line 366
    iget-object v5, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 367
    .line 368
    iget-wide v5, v5, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 369
    .line 370
    invoke-virtual {v2, v0, v5, v6}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    .line 371
    .line 372
    .line 373
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 374
    .line 375
    invoke-virtual {v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    .line 377
    .line 378
    return-object v3

    .line 379
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    instance-of v5, v2, Ljava/lang/InterruptedException;

    .line 384
    .line 385
    if-nez v5, :cond_e

    .line 386
    .line 387
    instance-of v5, v2, Ljava/io/InterruptedIOException;

    .line 388
    .line 389
    if-eqz v5, :cond_c

    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_c
    instance-of v2, v2, Ljava/io/IOException;

    .line 393
    .line 394
    if-eqz v2, :cond_d

    .line 395
    .line 396
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 397
    .line 398
    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 399
    .line 400
    const/4 v9, 0x4

    .line 401
    const/4 v10, 0x0

    .line 402
    const-string v7, "Http Exception: the request was not sent to the server"

    .line 403
    .line 404
    const/4 v8, 0x0

    .line 405
    invoke-static/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    .line 409
    .line 410
    sget-object v2, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->NETWORK:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 411
    .line 412
    invoke-direct {v0, v4, v2}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    .line 413
    .line 414
    .line 415
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 416
    .line 417
    iget-object v4, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 418
    .line 419
    iget-wide v4, v4, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 420
    .line 421
    invoke-virtual {v2, v0, v4, v5}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    .line 422
    .line 423
    .line 424
    iget-object v1, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 425
    .line 426
    invoke-virtual {v1, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    .line 427
    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_d
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 431
    .line 432
    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 433
    .line 434
    new-instance v2, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    const-string v7, "Unexpected Exception: "

    .line 437
    .line 438
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    const/4 v9, 0x4

    .line 449
    const/4 v10, 0x0

    .line 450
    const/4 v8, 0x0

    .line 451
    invoke-static/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    .line 455
    .line 456
    sget-object v2, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->UNEXPECTED:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 457
    .line 458
    invoke-direct {v0, v4, v2}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    .line 459
    .line 460
    .line 461
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 462
    .line 463
    iget-object v4, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 464
    .line 465
    iget-wide v4, v4, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 466
    .line 467
    invoke-virtual {v2, v0, v4, v5}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    .line 468
    .line 469
    .line 470
    iget-object v1, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 471
    .line 472
    invoke-virtual {v1, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    .line 473
    .line 474
    .line 475
    goto :goto_8

    .line 476
    :cond_e
    :goto_7
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 477
    .line 478
    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 479
    .line 480
    new-instance v8, Ljava/util/concurrent/TimeoutException;

    .line 481
    .line 482
    invoke-direct {v8}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 483
    .line 484
    .line 485
    const/16 v13, 0x60

    .line 486
    .line 487
    const/4 v14, 0x0

    .line 488
    const-string v7, "[DDL] Timeout"

    .line 489
    .line 490
    const/4 v9, 0x0

    .line 491
    const/4 v10, 0x0

    .line 492
    const/4 v11, 0x0

    .line 493
    const/4 v12, 0x0

    .line 494
    invoke-static/range {v5 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    iget v0, v1, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 498
    .line 499
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 500
    .line 501
    iget-wide v2, v2, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 502
    .line 503
    const-string v7, "Timeout, didn\'t manage to find deferred deeplink after "

    .line 504
    .line 505
    const-string v8, " attempt(s) within "

    .line 506
    .line 507
    invoke-static {v0, v2, v3, v7, v8}, La/vqd;->q(IJLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    const-string v2, " milliseconds"

    .line 512
    .line 513
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v7

    .line 520
    const/4 v9, 0x4

    .line 521
    const/4 v10, 0x0

    .line 522
    const/4 v8, 0x0

    .line 523
    invoke-static/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    .line 527
    .line 528
    sget-object v2, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->TIMEOUT:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 529
    .line 530
    invoke-direct {v0, v4, v2}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    .line 531
    .line 532
    .line 533
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 534
    .line 535
    iget-object v3, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 536
    .line 537
    iget-wide v3, v3, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    .line 538
    .line 539
    invoke-virtual {v2, v0, v3, v4}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v1, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    .line 543
    .line 544
    invoke-virtual {v1, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    .line 545
    .line 546
    .line 547
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 548
    .line 549
    :goto_8
    return-object v3
.end method
