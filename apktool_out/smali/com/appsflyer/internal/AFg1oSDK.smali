.class public final Lcom/appsflyer/internal/AFg1oSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFg1rSDK;


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AppsFlyerLib:I = 0x0

.field private static getEntries:J = 0x0L

.field private static getLevel:I = 0x1

.field private static valueOf:[C


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFg1qSDK;

.field private final AFLogger:Landroid/content/Context;

.field private final AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

.field private final afDebugLog:La/a8z;

.field private final afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

.field private final afInfoLog:Lcom/appsflyer/internal/AFf1bSDK;

.field private final afWarnLog:Lcom/appsflyer/internal/AFd1zSDK;

.field private final d:Lcom/appsflyer/internal/AFj1cSDK;

.field private final e:Lcom/appsflyer/internal/AFc1kSDK;

.field private final force:Lcom/appsflyer/internal/AFi1vSDK;

.field private final i:Lcom/appsflyer/internal/AFc1iSDK;

.field private final registerClient:Lcom/appsflyer/internal/AFj1ySDK;

.field private final unregisterClient:Lcom/appsflyer/internal/AFg1wSDK;

.field private final v:Lcom/appsflyer/internal/AFh1xSDK;

.field private final w:Lcom/appsflyer/internal/AFf1fSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFg1oSDK;->valueOf:[C

    .line 9
    .line 10
    const-wide v0, 0x6f607c584bcd406cL    # 3.12431422391539E228

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    sput-wide v0, Lcom/appsflyer/internal/AFg1oSDK;->getEntries:J

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 2
        0x3643s
        0x7aaas
        -0x5065s
        -0x2f1cs
        0x5c9s
        -0x49e9s
        -0x4e0s
        0x2c1as
        0x517bs
        -0x7db0s
        0x36b1s
        0x7b83s
        -0x5374s
        -0x2e01s
        0x2d4s
        0x4557s
        0x9a1s
        -0x2368s
        -0x5c17s
        0x76c9s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/appsflyer/internal/AFj1cSDK;Lcom/appsflyer/internal/AFg1wSDK;Lcom/appsflyer/internal/AFj1ySDK;Lcom/appsflyer/internal/AFg1qSDK;Lcom/appsflyer/internal/AFh1xSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1vSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFf1bSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/AppsFlyerProperties;)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 47
    .line 48
    iput-object p2, p0, Lcom/appsflyer/internal/AFg1oSDK;->d:Lcom/appsflyer/internal/AFj1cSDK;

    .line 49
    .line 50
    iput-object p3, p0, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient:Lcom/appsflyer/internal/AFg1wSDK;

    .line 51
    .line 52
    iput-object p4, p0, Lcom/appsflyer/internal/AFg1oSDK;->registerClient:Lcom/appsflyer/internal/AFj1ySDK;

    .line 53
    .line 54
    iput-object p5, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFg1qSDK;

    .line 55
    .line 56
    iput-object p6, p0, Lcom/appsflyer/internal/AFg1oSDK;->v:Lcom/appsflyer/internal/AFh1xSDK;

    .line 57
    .line 58
    iput-object p7, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 59
    .line 60
    iput-object p8, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 61
    .line 62
    iput-object p9, p0, Lcom/appsflyer/internal/AFg1oSDK;->force:Lcom/appsflyer/internal/AFi1vSDK;

    .line 63
    .line 64
    iput-object p10, p0, Lcom/appsflyer/internal/AFg1oSDK;->w:Lcom/appsflyer/internal/AFf1fSDK;

    .line 65
    .line 66
    iput-object p11, p0, Lcom/appsflyer/internal/AFg1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFd1zSDK;

    .line 67
    .line 68
    iput-object p12, p0, Lcom/appsflyer/internal/AFg1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1bSDK;

    .line 69
    .line 70
    iput-object p13, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 71
    .line 72
    iput-object p14, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 73
    .line 74
    new-instance p1, Lcom/appsflyer/c;

    .line 75
    .line 76
    const/4 p2, 0x4

    .line 77
    invoke-direct {p1, p2}, Lcom/appsflyer/c;-><init>(B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lcom/appsflyer/internal/AFg1oSDK;->afDebugLog:La/a8z;

    .line 85
    .line 86
    return-void
.end method

.method private static AFKeystoreWrapper()J
    .locals 4

    .line 192
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x63

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sget v2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v2, v2, 0x17

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    return-wide v0
.end method

.method private static AFKeystoreWrapper(Ljava/lang/String;)Ljava/io/File;
    .locals 10

    if-eqz p0, :cond_3

    .line 228
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x4d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 229
    :try_start_0
    invoke-static {p0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    .line 230
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v2, v0, 0x37

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    add-int/lit8 v0, v0, 0x15

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    :cond_1
    if-eqz v1, :cond_3

    .line 231
    :try_start_1
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 232
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    .line 233
    const-string p0, "Failed to create File object from path"

    :cond_2
    move-object v2, p0

    const/16 v8, 0x78

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 234
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic AFKeystoreWrapper([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFg1oSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Ljava/util/Map;

    .line 187
    iget-object v0, v0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 188
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->getOutOfStore:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 189
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x11

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    return-object v1

    :cond_0
    throw v1

    .line 190
    :cond_1
    const-string v2, "net_token"

    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v5, "Network token added to event"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-object v1
.end method

.method private AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFb1qSDK;)V
    .locals 1

    .line 235
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const p2, -0x7cba2bec

    const v0, 0x7cba2bed

    invoke-static {p1, p2, v0, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method private AFKeystoreWrapper(Ljava/util/Map;Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 200
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "prev_event_name"

    if-eqz v0, :cond_1

    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    const-string v2, "prev_event_timestamp"

    if-eqz v0, :cond_0

    .line 204
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 205
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    const-wide/16 v5, -0x1

    invoke-interface {v4, v2, v5, v6}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v3, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 206
    invoke-virtual {v3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 207
    const-string v0, "prev_event"

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 208
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p1, p1, 0x1f

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 209
    :cond_0
    :try_start_2
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {p1, v1, p2}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-interface {p0, v2, p1, p2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    .line 211
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    :try_start_3
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {p0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const/4 p0, 0x0

    .line 213
    :try_start_4
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 214
    throw p0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 215
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x78

    const/4 v9, 0x0

    const-string v2, "Failed to save previous event metadata to preferences"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method private AFKeystoreWrapper(Ljava/util/Map;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)V"
        }
    .end annotation

    .line 193
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x2f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "platformextension"

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->d:Lcom/appsflyer/internal/AFj1cSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1cSDK;->unregisterClient()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x41

    .line 195
    div-int/lit8 v0, v0, 0x0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 196
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->d:Lcom/appsflyer/internal/AFj1cSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1cSDK;->unregisterClient()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_2

    .line 198
    :goto_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->d:Lcom/appsflyer/internal/AFj1cSDK;

    invoke-interface {p0}, Lcom/appsflyer/internal/AFj1cSDK;->AFLogger()Ljava/util/Map;

    move-result-object p0

    const-string p2, "platform_extension_v2"

    invoke-interface {p1, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x6d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    :cond_2
    return-void
.end method

.method private static synthetic AFLogger([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFg1oSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Ljava/util/Map;

    .line 148
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    const-string v3, "is_pc"

    const-string v4, "com.google.android.play.feature.HPE_EXPERIENCE"

    if-nez v1, :cond_0

    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    iget-object v0, v0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 151
    invoke-virtual {v0, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    .line 152
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 153
    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    .line 154
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    iget-object v0, v0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 156
    invoke-virtual {v0, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    .line 157
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 158
    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    throw v2
.end method

.method private static AFLogger(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 160
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x45

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    const/4 v1, 0x0

    .line 161
    :try_start_0
    const-string v0, "android.os.SystemProperties"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 162
    const-string v2, "get"

    const-class v3, Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 163
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v5, p0

    .line 165
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    .line 166
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x71

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    const-string p0, "Failed to retrieve system property via reflection"

    :cond_0
    move-object v4, p0

    const/16 v10, 0x78

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 167
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-object v1
.end method

.method private AFLogger(Ljava/text/SimpleDateFormat;I)Ljava/lang/String;
    .locals 8

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "appsFlyerFirstInstall"

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    :cond_0
    const/4 v0, 0x1

    .line 33
    if-gt p2, v0, :cond_1

    .line 34
    .line 35
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 36
    .line 37
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 38
    .line 39
    const/4 v6, 0x4

    .line 40
    const/4 v7, 0x0

    .line 41
    const-string v4, "First app launch detected, recording install timestamp"

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance p2, Ljava/util/Date;

    .line 48
    .line 49
    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget p2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 57
    .line 58
    add-int/lit8 p2, p2, 0x1d

    .line 59
    .line 60
    rem-int/lit16 p2, p2, 0x80

    .line 61
    .line 62
    sput p2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 63
    .line 64
    :goto_0
    move-object v0, p1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 67
    .line 68
    add-int/lit8 p1, p1, 0x67

    .line 69
    .line 70
    rem-int/lit16 p1, p1, 0x80

    .line 71
    .line 72
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 73
    .line 74
    const-string p1, ""

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 78
    .line 79
    invoke-interface {p0, v1, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 83
    .line 84
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 85
    .line 86
    const-string p0, "AppsFlyer: first launch date: "

    .line 87
    .line 88
    invoke-static {p0, v0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const/4 v5, 0x4

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 106
    .line 107
    invoke-interface {p0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    throw p0
.end method

.method private final AFLogger()Ljava/text/SimpleDateFormat;
    .locals 2

    .line 112
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x79

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afDebugLog:La/a8z;

    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/text/SimpleDateFormat;

    if-nez v0, :cond_0

    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x33

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private static AFLogger(Ljava/util/Map;Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/internal/AFh1pSDK;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 170
    const-string v1, "eventName"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    new-instance v0, Lorg/json/JSONObject;

    iget-object p1, p1, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 172
    const-string v0, "eventValue"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private static AFLogger(Ljava/io/File;)Z
    .locals 3

    .line 168
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x1d

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    if-eqz p0, :cond_2

    add-int/lit8 v1, v1, 0x73

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    throw v2

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_3
    throw v2
.end method

.method private static final AFLoggerLogLevel()Ljava/text/SimpleDateFormat;
    .locals 3

    .line 113
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "yyyy-MM-dd_HHmmssZ"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 114
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method private static AFLoggerLogLevel(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    const/16 v1, 0x30

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, 0x10

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    cmp-long v1, v3, v5

    .line 30
    .line 31
    rsub-int v1, v1, 0x49c0

    .line 32
    .line 33
    int-to-char v1, v1

    .line 34
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    rsub-int/lit8 v3, v3, 0x5

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    new-array v4, v4, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v0, v1, v3, v4}, Lcom/appsflyer/internal/AFg1oSDK;->a(ICI[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    aget-object v0, v4, v2

    .line 47
    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    const-string v0, "device"

    .line 60
    .line 61
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    const-string v0, "product"

    .line 67
    .line 68
    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 69
    .line 70
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, "sdk"

    .line 80
    .line 81
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const-string v0, "model"

    .line 85
    .line 86
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 87
    .line 88
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    const-string v0, "deviceType"

    .line 92
    .line 93
    sget-object v1, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 94
    .line 95
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 99
    .line 100
    add-int/lit8 p0, p0, 0x1d

    .line 101
    .line 102
    rem-int/lit16 v0, p0, 0x80

    .line 103
    .line 104
    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 105
    .line 106
    rem-int/lit8 p0, p0, 0x2

    .line 107
    .line 108
    if-eqz p0, :cond_0

    .line 109
    .line 110
    return-void

    .line 111
    :cond_0
    const/4 p0, 0x0

    .line 112
    throw p0
.end method

.method private AppsFlyerLib(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const v0, 0x115b7027

    .line 10
    .line 11
    .line 12
    const v1, -0x115b7023

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a()Ljava/text/SimpleDateFormat;
    .locals 1

    .line 97
    invoke-static {}, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel()Ljava/text/SimpleDateFormat;

    move-result-object v0

    return-object v0
.end method

.method private static a(ICI[Ljava/lang/Object;)V
    .locals 12

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFk1qSDK;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1qSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    new-array v1, p2, [J

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, v0, Lcom/appsflyer/internal/AFk1qSDK;->unregisterClient:I

    .line 10
    .line 11
    :goto_0
    iget v3, v0, Lcom/appsflyer/internal/AFk1qSDK;->unregisterClient:I

    .line 12
    .line 13
    if-ge v3, p2, :cond_0

    .line 14
    .line 15
    sget v4, Lcom/appsflyer/internal/AFg1oSDK;->$10:I

    .line 16
    .line 17
    add-int/lit8 v4, v4, 0x5

    .line 18
    .line 19
    rem-int/lit16 v4, v4, 0x80

    .line 20
    .line 21
    sput v4, Lcom/appsflyer/internal/AFg1oSDK;->$11:I

    .line 22
    .line 23
    sget-object v4, Lcom/appsflyer/internal/AFg1oSDK;->valueOf:[C

    .line 24
    .line 25
    add-int v5, p0, v3

    .line 26
    .line 27
    aget-char v4, v4, v5

    .line 28
    .line 29
    int-to-long v4, v4

    .line 30
    const-wide v6, 0x61f05630e4830c8aL    # 5.879786475623869E163

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v4, v6

    .line 36
    long-to-int v4, v4

    .line 37
    int-to-char v4, v4

    .line 38
    int-to-long v4, v4

    .line 39
    int-to-long v8, v3

    .line 40
    sget-wide v10, Lcom/appsflyer/internal/AFg1oSDK;->getEntries:J

    .line 41
    .line 42
    xor-long/2addr v6, v10

    .line 43
    mul-long/2addr v8, v6

    .line 44
    xor-long/2addr v4, v8

    .line 45
    int-to-long v6, p1

    .line 46
    xor-long/2addr v4, v6

    .line 47
    aput-wide v4, v1, v3

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    iput v3, v0, Lcom/appsflyer/internal/AFk1qSDK;->unregisterClient:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-array p0, p2, [C

    .line 55
    .line 56
    iput v2, v0, Lcom/appsflyer/internal/AFk1qSDK;->unregisterClient:I

    .line 57
    .line 58
    :goto_1
    iget p1, v0, Lcom/appsflyer/internal/AFk1qSDK;->unregisterClient:I

    .line 59
    .line 60
    if-ge p1, p2, :cond_1

    .line 61
    .line 62
    aget-wide v3, v1, p1

    .line 63
    .line 64
    long-to-int v3, v3

    .line 65
    int-to-char v3, v3

    .line 66
    aput-char v3, p0, p1

    .line 67
    .line 68
    add-int/lit8 p1, p1, 0x1

    .line 69
    .line 70
    iput p1, v0, Lcom/appsflyer/internal/AFk1qSDK;->unregisterClient:I

    .line 71
    .line 72
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->$10:I

    .line 73
    .line 74
    add-int/lit8 p1, p1, 0x73

    .line 75
    .line 76
    rem-int/lit16 p1, p1, 0x80

    .line 77
    .line 78
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->$11:I

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 84
    .line 85
    .line 86
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->$10:I

    .line 87
    .line 88
    add-int/lit8 p0, p0, 0x2d

    .line 89
    .line 90
    rem-int/lit16 p0, p0, 0x80

    .line 91
    .line 92
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->$11:I

    .line 93
    .line 94
    aput-object p1, p3, v2

    .line 95
    .line 96
    return-void
.end method

.method private static afDebugLog()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFd1bSDK;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    long-to-int v1, v1

    .line 9
    const v2, 0x661e25a9

    .line 10
    .line 11
    .line 12
    const v3, -0x661e259e

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2, v3, v1}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/List;

    .line 20
    .line 21
    return-object v0
.end method

.method private afDebugLog(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 22
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, -0x3c31bce9

    const v1, 0x3c31bcee

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method private final afErrorLog()Ljava/lang/String;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 2
    .line 3
    const-string v1, "androidIdCached"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :try_start_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "android_id"

    .line 16
    .line 17
    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    move-object p0, v0

    .line 26
    move-object v5, p0

    .line 27
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 28
    .line 29
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 38
    .line 39
    add-int/lit8 p0, p0, 0x2d

    .line 40
    .line 41
    rem-int/lit16 p0, p0, 0x80

    .line 42
    .line 43
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 44
    .line 45
    const-string p0, "Failed to retrieve Android ID from Settings.Secure"

    .line 46
    .line 47
    :cond_0
    move-object v4, p0

    .line 48
    const/16 v10, 0x78

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 59
    .line 60
    add-int/lit8 p0, p0, 0x9

    .line 61
    .line 62
    rem-int/lit16 p0, p0, 0x80

    .line 63
    .line 64
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 65
    .line 66
    :cond_1
    if-eqz v1, :cond_2

    .line 67
    .line 68
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 69
    .line 70
    add-int/lit8 p0, p0, 0x57

    .line 71
    .line 72
    rem-int/lit16 p0, p0, 0x80

    .line 73
    .line 74
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 75
    .line 76
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 77
    .line 78
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 79
    .line 80
    const-string p0, "Using cached Android ID (current retrieval failed): "

    .line 81
    .line 82
    invoke-static {p0, v1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    const/4 v6, 0x4

    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_2
    const/4 p0, 0x0

    .line 94
    return-object p0
.end method

.method private final afErrorLog(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 95
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x6f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 96
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient:Lcom/appsflyer/internal/AFg1wSDK;

    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    invoke-interface {v0, p0}, Lcom/appsflyer/internal/AFg1wSDK;->registerClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;

    move-result-object p0

    .line 97
    iget p0, p0, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;->unregisterClient:F

    .line 98
    const-string v0, "batteryLevel"

    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x2f

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private final afInfoLog(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 46
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x34be08fe

    const v1, -0x34be08f5    # -1.2711691E7f

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method private final afInfoLog()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->afWarnLog:Z

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x15

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1qSDK;->AFLogger(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    div-int/2addr v0, v1

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 36
    .line 37
    add-int/lit8 p0, p0, 0xb

    .line 38
    .line 39
    rem-int/lit16 p0, p0, 0x80

    .line 40
    .line 41
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method private final afWarnLog()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "ro.appsflyer.preinstall.path"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/io/File;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v0, "AF_PRE_INSTALL_PATH"

    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x6f

    .line 30
    .line 31
    rem-int/lit16 v1, v1, 0x80

    .line 32
    .line 33
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 34
    .line 35
    :cond_0
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/io/File;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const-string v0, "/data/local/tmp/pre_install.appsflyer"

    .line 42
    .line 43
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/io/File;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    const-string v0, "/etc/pre_install.appsflyer"

    .line 54
    .line 55
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_2
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/io/File;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 66
    .line 67
    add-int/lit8 p0, p0, 0x31

    .line 68
    .line 69
    rem-int/lit16 p0, p0, 0x80

    .line 70
    .line 71
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    return-object p0

    .line 75
    :cond_3
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    long-to-int v0, v0

    .line 93
    const v1, 0xe3d0b64

    .line 94
    .line 95
    .line 96
    const v2, -0xe3d0b5a

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v1, v2, v0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Ljava/lang/String;

    .line 104
    .line 105
    return-object p0
.end method

.method private final afWarnLog(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 106
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x41

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 107
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    const-class v0, Landroid/app/UiModeManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/UiModeManager;

    if-eqz p0, :cond_1

    .line 108
    invoke-virtual {p0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result p0

    const/4 v0, 0x4

    if-ne p0, v0, :cond_1

    .line 109
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x75

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 p0, p0, 0x2

    const-string v0, "tv"

    if-eqz p0, :cond_0

    .line 110
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p0, 0x5d

    .line 111
    div-int/lit8 p0, p0, 0x0

    goto :goto_0

    .line 112
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    :goto_0
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x3d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    :cond_1
    return-void
.end method

.method private static synthetic d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    aget-object v1, p0, v0

    check-cast v1, Lcom/appsflyer/internal/AFg1oSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Lcom/appsflyer/internal/AFh1pSDK;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "open_referrer"

    .line 210
    iget-object v3, p0, Lcom/appsflyer/internal/AFh1pSDK;->e:Ljava/lang/String;

    .line 211
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    iget-object v2, p0, Lcom/appsflyer/internal/AFh1pSDK;->afInfoLog:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 213
    sget v3, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v3, v3, 0x23

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 214
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 215
    :cond_0
    sget v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v2, v2, 0x21

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v2, v2, 0x2

    .line 216
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->afInfoLog:Ljava/lang/String;

    .line 217
    const-string v3, "af_web_referrer"

    if-eqz v2, :cond_1

    .line 218
    invoke-interface {v1, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p0, 0x4b

    .line 219
    div-int/2addr p0, v0

    goto :goto_0

    .line 220
    :cond_1
    invoke-interface {v1, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private d()Ljava/lang/String;
    .locals 2

    .line 196
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x37

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->signature(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->signature(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;

    const/4 p0, 0x0

    throw p0
.end method

.method private static d(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 221
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int p1, v0

    const v0, 0xe3d0b64

    const v1, -0xe3d0b5a

    invoke-static {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 197
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x31

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    .line 198
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    .line 199
    iget-boolean v0, v2, Lcom/appsflyer/internal/AFc1eSDK;->afWarnLog:Z

    if-eqz v0, :cond_4

    if-eqz p1, :cond_1

    add-int/lit8 v1, v1, 0x27

    .line 200
    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    .line 201
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 202
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    throw v3

    :cond_1
    :goto_0
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p1, p1, 0x4f

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_3

    .line 203
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->afInfoLog()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 204
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v3

    goto :goto_1

    .line 205
    :cond_3
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->afInfoLog()Z

    throw v3

    :cond_4
    if-eqz p1, :cond_2

    :goto_1
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x67

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    return-object p1

    .line 206
    :cond_5
    iget-boolean p0, v2, Lcom/appsflyer/internal/AFc1eSDK;->afWarnLog:Z

    .line 207
    throw v3
.end method

.method private d(Ljava/util/Map;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)V"
        }
    .end annotation

    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 180
    const-string v1, "ro.product.cpu.abi"

    invoke-static {v1}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cpu_abi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    const-string v1, "ro.product.cpu.abi2"

    invoke-static {v1}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cpu_abi2"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    const-string v1, "os.arch"

    invoke-static {v1}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "arch"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const-string v1, "ro.build.display.id"

    invoke-static {v1}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "build_display_id"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    if-eqz p2, :cond_1

    .line 184
    sget p2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    const/4 v2, 0x5

    add-int/2addr p2, v2

    rem-int/lit16 v3, p2, 0x80

    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/2addr p2, v1

    const/4 v3, 0x0

    const-string v4, "appsFlyerCount"

    const v5, -0x6b37e21c

    const v6, 0x6b37e224

    if-nez p2, :cond_0

    .line 185
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v7

    invoke-static {p2, v6, v5, v7}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 186
    iget-object p2, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 187
    iget-object p2, p2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {p2, v4, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result p2

    if-gt p2, v2, :cond_1

    goto :goto_0

    .line 188
    :cond_0
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p2, v6, v5, v2}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 189
    iget-object p2, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 190
    iget-object p2, p2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {p2, v4, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result p2

    if-gt p2, v1, :cond_1

    .line 191
    :goto_0
    iget-object p2, p0, Lcom/appsflyer/internal/AFg1oSDK;->registerClient:Lcom/appsflyer/internal/AFj1ySDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFj1ySDK;->AFLogger()Ljava/util/Map;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 192
    :cond_1
    iget-object p2, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFg1qSDK;

    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    invoke-interface {p2, p0}, Lcom/appsflyer/internal/AFg1qSDK;->registerClient(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p0

    .line 193
    const-string p2, "dim"

    invoke-interface {v0, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    const-string p0, "deviceData"

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x23

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/2addr p0, v1

    if-eqz p0, :cond_2

    return-void

    :cond_2
    const/4 p0, 0x0

    throw p0
.end method

.method private static synthetic e([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    const-string v1, "Error closing preinstall configuration file reader: "

    .line 2
    .line 3
    const-string v2, "unknown error"

    .line 4
    .line 5
    const-string v0, "Preinstall configuration file not found at path: "

    .line 6
    .line 7
    const-string v3, "Error reading preinstall configuration file: "

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    aget-object v5, p0, v4

    .line 11
    .line 12
    check-cast v5, Ljava/io/File;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    aget-object v6, p0, v6

    .line 16
    .line 17
    check-cast v6, Ljava/lang/String;

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    if-nez v5, :cond_1

    .line 21
    .line 22
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x43

    .line 25
    .line 26
    rem-int/lit16 v1, v0, 0x80

    .line 27
    .line 28
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 29
    .line 30
    rem-int/lit8 v0, v0, 0x2

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    return-object v7

    .line 35
    :cond_0
    throw v7

    .line 36
    :cond_1
    :try_start_0
    new-instance v8, Ljava/util/Properties;

    .line 37
    .line 38
    invoke-direct {v8}, Ljava/util/Properties;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v9, Ljava/io/InputStreamReader;

    .line 42
    .line 43
    new-instance v10, Ljava/io/FileInputStream;

    .line 44
    .line 45
    invoke-direct {v10, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    invoke-direct {v9, v10, v11}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 53
    .line 54
    .line 55
    :try_start_1
    invoke-virtual {v8, v9}, Ljava/util/Properties;->load(Ljava/io/Reader;)V

    .line 56
    .line 57
    .line 58
    sget-object v12, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 59
    .line 60
    sget-object v13, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 61
    .line 62
    const-string v14, "Preinstall configuration file found and loaded successfully"

    .line 63
    .line 64
    const/16 v16, 0x4

    .line 65
    .line 66
    const/16 v17, 0x0

    .line 67
    .line 68
    const/4 v15, 0x0

    .line 69
    invoke-static/range {v12 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    :try_start_2
    invoke-virtual {v9}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    .line 79
    return-object v3

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object v13, v0

    .line 82
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 83
    .line 84
    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 85
    .line 86
    invoke-virtual {v13}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    move-object v2, v0

    .line 94
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    const/16 v18, 0x78

    .line 99
    .line 100
    const/16 v19, 0x0

    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const/4 v15, 0x0

    .line 104
    const/16 v16, 0x0

    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    invoke-static/range {v10 .. v19}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-object v3

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    move-object v11, v0

    .line 114
    move-object v5, v9

    .line 115
    goto :goto_1

    .line 116
    :catchall_2
    move-exception v0

    .line 117
    move-object v11, v0

    .line 118
    move-object v5, v7

    .line 119
    :goto_1
    :try_start_3
    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 120
    .line 121
    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 122
    .line 123
    invoke-virtual {v11}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-nez v0, :cond_3

    .line 128
    .line 129
    move-object v0, v2

    .line 130
    :cond_3
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    const/16 v16, 0x78

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x0

    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    invoke-static/range {v8 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 143
    .line 144
    .line 145
    if-eqz v5, :cond_7

    .line 146
    .line 147
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 148
    .line 149
    add-int/lit8 v0, v0, 0x7b

    .line 150
    .line 151
    rem-int/lit16 v3, v0, 0x80

    .line 152
    .line 153
    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 154
    .line 155
    rem-int/lit8 v0, v0, 0x2

    .line 156
    .line 157
    if-eqz v0, :cond_4

    .line 158
    .line 159
    :try_start_4
    invoke-virtual {v5}, Ljava/io/Reader;->close()V

    .line 160
    .line 161
    .line 162
    const/16 v0, 0x3c

    .line 163
    .line 164
    div-int/2addr v0, v4

    .line 165
    goto/16 :goto_5

    .line 166
    .line 167
    :catchall_3
    move-exception v0

    .line 168
    move-object v11, v0

    .line 169
    goto :goto_2

    .line 170
    :cond_4
    invoke-virtual {v5}, Ljava/io/Reader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :goto_2
    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 175
    .line 176
    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 177
    .line 178
    invoke-virtual {v11}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_5
    move-object v2, v0

    .line 186
    :goto_3
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    const/16 v16, 0x78

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/4 v12, 0x0

    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    const/4 v15, 0x0

    .line 198
    invoke-static/range {v8 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :catchall_4
    move-exception v0

    .line 203
    move-object v3, v0

    .line 204
    goto :goto_6

    .line 205
    :catch_0
    move-object v9, v7

    .line 206
    :catch_1
    :try_start_5
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 207
    .line 208
    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    new-instance v4, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    const/4 v14, 0x4

    .line 227
    const/4 v15, 0x0

    .line 228
    const/4 v13, 0x0

    .line 229
    invoke-static/range {v10 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 230
    .line 231
    .line 232
    if-eqz v9, :cond_7

    .line 233
    .line 234
    :try_start_6
    invoke-virtual {v9}, Ljava/io/Reader;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :catchall_5
    move-exception v0

    .line 239
    move-object/from16 v19, v0

    .line 240
    .line 241
    sget-object v16, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 242
    .line 243
    sget-object v17, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 244
    .line 245
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-nez v0, :cond_6

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_6
    move-object v2, v0

    .line 253
    :goto_4
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v18

    .line 257
    const/16 v24, 0x78

    .line 258
    .line 259
    const/16 v25, 0x0

    .line 260
    .line 261
    const/16 v20, 0x0

    .line 262
    .line 263
    const/16 v21, 0x0

    .line 264
    .line 265
    const/16 v22, 0x0

    .line 266
    .line 267
    const/16 v23, 0x0

    .line 268
    .line 269
    invoke-static/range {v16 .. v25}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    :cond_7
    :goto_5
    return-object v7

    .line 273
    :catchall_6
    move-exception v0

    .line 274
    move-object v3, v0

    .line 275
    move-object v5, v9

    .line 276
    :goto_6
    if-nez v5, :cond_8

    .line 277
    .line 278
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 279
    .line 280
    add-int/lit8 v0, v0, 0x4b

    .line 281
    .line 282
    rem-int/lit16 v0, v0, 0x80

    .line 283
    .line 284
    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_8
    :try_start_7
    invoke-virtual {v5}, Ljava/io/Reader;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 288
    .line 289
    .line 290
    goto :goto_8

    .line 291
    :catchall_7
    move-exception v0

    .line 292
    move-object v7, v0

    .line 293
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 294
    .line 295
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 296
    .line 297
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    if-nez v0, :cond_9

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_9
    move-object v2, v0

    .line 305
    :goto_7
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    const/16 v12, 0x78

    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    const/4 v8, 0x0

    .line 313
    const/4 v9, 0x0

    .line 314
    const/4 v10, 0x0

    .line 315
    const/4 v11, 0x0

    .line 316
    invoke-static/range {v4 .. v13}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :goto_8
    throw v3
.end method

.method private e()Ljava/lang/String;
    .locals 2

    .line 320
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x1d

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    .line 321
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v0, :cond_2

    .line 322
    iget-object v0, v1, Lcom/appsflyer/internal/AFc1eSDK;->getLevel:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 323
    const-string v0, "AF_STORE"

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x29

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_1

    const/16 p0, 0x55

    div-int/lit8 p0, p0, 0x0

    :cond_1
    return-object v0

    .line 324
    :cond_2
    iget-object p0, v1, Lcom/appsflyer/internal/AFc1eSDK;->getLevel:Ljava/lang/String;

    const/4 p0, 0x0

    .line 325
    throw p0
.end method

.method private e(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 326
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->v:Lcom/appsflyer/internal/AFh1xSDK;

    .line 328
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 329
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 330
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "gcd"

    invoke-interface {p0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;)V

    .line 331
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    .line 332
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x27

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 333
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1iSDK;->AFLogger(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    .line 334
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 335
    :cond_0
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0xd

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    return-void
.end method

.method private enableTCFDataCollection(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper(Landroid/content/Context;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "af_preinstalled"

    .line 25
    .line 26
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 30
    .line 31
    add-int/lit8 p0, p0, 0x73

    .line 32
    .line 33
    rem-int/lit16 p0, p0, 0x80

    .line 34
    .line 35
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 36
    .line 37
    return-void
.end method

.method private static synthetic force([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p0, v0

    .line 3
    .line 4
    check-cast v1, Lcom/appsflyer/internal/AFg1oSDK;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    aget-object p0, p0, v2

    .line 8
    .line 9
    check-cast p0, Lcom/appsflyer/internal/AFh1pSDK;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 15
    .line 16
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 17
    .line 18
    iget-boolean v3, v2, Lcom/appsflyer/internal/AFc1eSDK;->setAndroidIdData:Z

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-nez v3, :cond_3

    .line 22
    .line 23
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1eSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFh1qSDK;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    return-object v4

    .line 28
    :cond_0
    iget-object v3, v2, Lcom/appsflyer/internal/AFh1qSDK;->e:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string v3, "gaidError"

    .line 40
    .line 41
    iget-object v5, v2, Lcom/appsflyer/internal/AFh1qSDK;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p0, v3, v5}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    iget-object v3, v2, Lcom/appsflyer/internal/AFh1qSDK;->AFLogger:Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    sget v5, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x4b

    .line 53
    .line 54
    rem-int/lit16 v5, v5, 0x80

    .line 55
    .line 56
    sput v5, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 57
    .line 58
    iget-object v5, v2, Lcom/appsflyer/internal/AFh1qSDK;->AFKeystoreWrapper:Ljava/lang/Boolean;

    .line 59
    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    const-string v5, "advertiserId"

    .line 63
    .line 64
    invoke-virtual {p0, v5, v3}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 65
    .line 66
    .line 67
    iget-object v3, v2, Lcom/appsflyer/internal/AFh1qSDK;->AFKeystoreWrapper:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const-string v5, "advertiserIdEnabled"

    .line 74
    .line 75
    invoke-virtual {p0, v5, v3}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 76
    .line 77
    .line 78
    iget-object v2, v2, Lcom/appsflyer/internal/AFh1qSDK;->d:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v3, "isGaidWithGps"

    .line 85
    .line 86
    invoke-virtual {p0, v3, v2}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    sget v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x2d

    .line 93
    .line 94
    rem-int/lit16 v3, v2, 0x80

    .line 95
    .line 96
    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 97
    .line 98
    rem-int/lit8 v2, v2, 0x2

    .line 99
    .line 100
    const-string v3, "ad_ids_disabled"

    .line 101
    .line 102
    if-nez v2, :cond_7

    .line 103
    .line 104
    iget-object v2, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Lcom/appsflyer/internal/AFj1iSDK;->AFLogger(Ljava/util/Map;)Ljava/util/Map;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    sget v2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 119
    .line 120
    add-int/lit8 v2, v2, 0x3f

    .line 121
    .line 122
    rem-int/lit16 v2, v2, 0x80

    .line 123
    .line 124
    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 125
    .line 126
    :cond_4
    :goto_1
    iget-object v2, v1, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 127
    .line 128
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 129
    .line 130
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1eSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFh1qSDK;

    .line 131
    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    iget-object v0, v2, Lcom/appsflyer/internal/AFh1qSDK;->i:Ljava/lang/Boolean;

    .line 135
    .line 136
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    :cond_5
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const-string v2, "GAID_retry"

    .line 147
    .line 148
    invoke-virtual {p0, v2, v0}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 149
    .line 150
    .line 151
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 152
    .line 153
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 154
    .line 155
    filled-new-array {v0, v2}, [Lcom/appsflyer/internal/AFd1bSDK;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_6

    .line 172
    .line 173
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 174
    .line 175
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setOaidData:Lcom/appsflyer/internal/AFd1nSDK;

    .line 176
    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1iSDK;->AFLogger(Ljava/util/Map;)Ljava/util/Map;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    iget-wide v0, v0, Lcom/appsflyer/internal/AFd1nSDK;->registerClient:J

    .line 189
    .line 190
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-string v1, "fetchAdIdLatency"

    .line 195
    .line 196
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    :cond_6
    return-object v4

    .line 200
    :cond_7
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1iSDK;->AFLogger(Ljava/util/Map;)Ljava/util/Map;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    throw v4
.end method

.method private force()Ljava/lang/String;
    .locals 4

    .line 215
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "INSTALL_STORE"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 216
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x1b

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    return-object v0

    .line 217
    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 218
    sget v2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v2, v2, 0x7b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v2, v2, 0x2

    .line 219
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    if-nez v2, :cond_1

    invoke-interface {p0, v1, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p0, 0x61

    .line 220
    div-int/lit8 p0, p0, 0x0

    return-object v0

    .line 221
    :cond_1
    invoke-interface {p0, v1, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object v0
.end method

.method private final force(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 222
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x6b37e224

    const v1, -0x6b37e21c

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method private getEntries(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->v:Lcom/appsflyer/internal/AFh1xSDK;

    .line 5
    .line 6
    iget-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->afInfoLog:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p0, v0, v2

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 15
    .line 16
    add-int/lit8 p0, p0, 0x47

    .line 17
    .line 18
    rem-int/lit16 p0, p0, 0x80

    .line 19
    .line 20
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "prev_session_dur"

    .line 27
    .line 28
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 32
    .line 33
    add-int/lit8 p0, p0, 0x55

    .line 34
    .line 35
    rem-int/lit16 p0, p0, 0x80

    .line 36
    .line 37
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 38
    .line 39
    return-void
.end method

.method private getInstance(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-string v2, "is_stop_tracking_used"

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 20
    .line 21
    invoke-interface {v0, v2}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 28
    .line 29
    invoke-interface {p0, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const-string v0, "istu"

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_0
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 43
    .line 44
    add-int/lit8 p0, p0, 0x13

    .line 45
    .line 46
    rem-int/lit16 p1, p0, 0x80

    .line 47
    .line 48
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 49
    .line 50
    rem-int/lit8 p0, p0, 0x2

    .line 51
    .line 52
    if-nez p0, :cond_1

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    throw v1

    .line 56
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 60
    .line 61
    invoke-interface {p0, v2}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    throw v1
.end method

.method private getLevel(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "CHANNEL"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/16 v1, 0x5e

    .line 26
    .line 27
    div-int/2addr v1, v2

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    :goto_0
    const-string v1, ""

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1d

    .line 53
    .line 54
    rem-int/lit16 v0, v0, 0x80

    .line 55
    .line 56
    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 60
    .line 61
    invoke-static {v1, v0}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient(Lcom/appsflyer/internal/AFc1kSDK;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/4 v3, 0x1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    sget v4, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x47

    .line 77
    .line 78
    rem-int/lit16 v4, v4, 0x80

    .line 79
    .line 80
    sput v4, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 81
    .line 82
    move v4, v3

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move v4, v2

    .line 85
    :goto_1
    if-nez v1, :cond_3

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    move v2, v3

    .line 90
    :cond_3
    if-nez v4, :cond_4

    .line 91
    .line 92
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x17

    .line 95
    .line 96
    rem-int/lit16 v1, v1, 0x80

    .line 97
    .line 98
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 99
    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    :cond_4
    const-string v1, "af_latestchannel"

    .line 103
    .line 104
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_5
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->force()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    const-string v1, "af_installstore"

    .line 126
    .line 127
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :cond_6
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->w()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    const-string v1, "af_preinstall_name"

    .line 149
    .line 150
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :cond_7
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->e()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    if-eqz p0, :cond_8

    .line 158
    .line 159
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    const-string v0, "af_currentstore"

    .line 172
    .line 173
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    :cond_8
    return-void
.end method

.method private getSdkVersion(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lcom/appsflyer/internal/AFb1iSDK;->h_(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFb1lSDK;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_2

    .line 15
    .line 16
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x6b

    .line 19
    .line 20
    rem-int/lit16 v1, v0, 0x80

    .line 21
    .line 22
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 23
    .line 24
    rem-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    const-string v2, "amazon_aid_limit"

    .line 28
    .line 29
    const-string v3, "amazon_aid"

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1lSDK;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1lSDK;->AFLogger:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 48
    .line 49
    add-int/lit8 p0, p0, 0x3f

    .line 50
    .line 51
    rem-int/lit16 p1, p0, 0x80

    .line 52
    .line 53
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 54
    .line 55
    rem-int/lit8 p0, p0, 0x2

    .line 56
    .line 57
    if-nez p0, :cond_0

    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    throw v1

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1lSDK;->d:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1lSDK;->AFLogger:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-interface {p1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    return-void
.end method

.method private i(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->AppsFlyerLib:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 9
    .line 10
    const-string v1, "onelinkVersion"

    .line 11
    .line 12
    invoke-interface {p0, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x5b

    .line 21
    .line 22
    rem-int/lit16 v2, v1, 0x80

    .line 23
    .line 24
    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 25
    .line 26
    rem-int/lit8 v1, v1, 0x2

    .line 27
    .line 28
    const-string v2, "onelink_id"

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x3b

    .line 36
    .line 37
    div-int/lit8 v0, v0, 0x0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    if-eqz p0, :cond_2

    .line 44
    .line 45
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x53

    .line 48
    .line 49
    rem-int/lit16 v0, v0, 0x80

    .line 50
    .line 51
    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 52
    .line 53
    const-string v0, "onelink_ver"

    .line 54
    .line 55
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 59
    .line 60
    add-int/lit8 p0, p0, 0xf

    .line 61
    .line 62
    rem-int/lit16 p0, p0, 0x80

    .line 63
    .line 64
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 65
    .line 66
    :cond_2
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 67
    .line 68
    add-int/lit8 p0, p0, 0x2f

    .line 69
    .line 70
    rem-int/lit16 p1, p0, 0x80

    .line 71
    .line 72
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 73
    .line 74
    rem-int/lit8 p0, p0, 0x2

    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    const/4 p0, 0x0

    .line 80
    throw p0
.end method

.method private i()Z
    .locals 2

    .line 81
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x5d

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "sentSuccessfully"

    invoke-interface {p0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_0
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    const/4 p0, 0x0

    throw p0
.end method

.method private onPause(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "didConfigureTokenRefreshService="

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1vSDK;->registerClient(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 25
    .line 26
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 27
    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const/4 v6, 0x4

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 53
    .line 54
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1vSDK;->registerClient(Landroid/content/Context;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 59
    .line 60
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 61
    .line 62
    new-instance v4, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const/4 v6, 0x4

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    :goto_0
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 83
    .line 84
    add-int/lit8 v0, v0, 0x45

    .line 85
    .line 86
    rem-int/lit16 v1, v0, 0x80

    .line 87
    .line 88
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 89
    .line 90
    rem-int/lit8 v0, v0, 0x2

    .line 91
    .line 92
    const-string v1, "tokenRefreshConfigured"

    .line 93
    .line 94
    if-nez v0, :cond_1

    .line 95
    .line 96
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    const/16 v0, 0xb

    .line 102
    .line 103
    div-int/lit8 v0, v0, 0x0

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    :cond_2
    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 112
    .line 113
    const-string v0, "sentRegisterRequestToAF"

    .line 114
    .line 115
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    const-string v0, "registeredUninstall"

    .line 124
    .line 125
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method private registerClient()Ljava/lang/Long;
    .locals 2

    .line 304
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0xf

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object p0

    if-nez v0, :cond_0

    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const/16 v0, 0x1c

    div-int/lit8 v0, v0, 0x0

    return-object p0

    :cond_0
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic registerClient([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    aget-object p0, p0, v0

    check-cast p0, Lcom/appsflyer/internal/AFg1oSDK;

    .line 305
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x53

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x2d

    rem-int/lit16 v2, p0, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private static registerClient(Lcom/appsflyer/internal/AFc1kSDK;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 306
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x51

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 307
    const-string v0, "CACHED_CHANNEL"

    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 308
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x59

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    return-object v1

    .line 309
    :cond_0
    invoke-interface {p0, v0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0xf

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_1

    const/16 p0, 0x22

    div-int/lit8 p0, p0, 0x0

    :cond_1
    return-object p1
.end method

.method private final registerClient(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 311
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x7d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p1, p1, 0x45

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    return-object p0
.end method

.method private registerClient(Ljava/util/Map;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 279
    iget-boolean v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->afInfoLog:Z

    if-eqz v1, :cond_1

    .line 280
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x7

    rem-int/lit16 p2, p0, 0x80

    sput p2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p0, p0, 0x2

    const-string p2, "true"

    const-string v0, "deviceTrackingDisabled"

    if-nez p0, :cond_0

    .line 281
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p0, 0x29

    div-int/lit8 p0, p0, 0x0

    return-void

    :cond_0
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 282
    :cond_1
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->AFLoggerLogLevel:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 283
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 284
    :cond_2
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v1, v1, 0x27

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 285
    const-string v1, "imei"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    :cond_3
    :goto_0
    invoke-direct {p0, p2}, Lcom/appsflyer/internal/AFg1oSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 287
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x2f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 288
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "androidIdCached"

    invoke-interface {v0, v1, p2}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "android_id"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 290
    :cond_4
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ADVERTISING_ID:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "Android ID collection skipped: not available or not permitted"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 291
    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    invoke-static {p0}, Lcom/appsflyer/internal/AFb1iSDK;->unregisterClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1lSDK;

    move-result-object p0

    if-eqz p0, :cond_8

    .line 292
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 293
    const-string v0, "isManual"

    .line 294
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1lSDK;->unregisterClient:Ljava/lang/Boolean;

    .line 295
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    const-string v0, "val"

    .line 297
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1lSDK;->d:Ljava/lang/String;

    .line 298
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1lSDK;->AFLogger:Ljava/lang/Boolean;

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 300
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v1, v1, 0x67

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v1, v1, 0x2

    const-string v2, "isLat"

    if-eqz v1, :cond_5

    .line 301
    invoke-interface {p2, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-interface {p2, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    throw v0

    :cond_6
    :goto_2
    const-string p0, "oaid"

    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x2b

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_7

    goto :goto_3

    :cond_7
    throw v0

    :cond_8
    :goto_3
    return-void
.end method

.method private setImeiData(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 5
    .line 6
    const-string v1, "AF_COLLECT_FACEBOOK_ATTR_ID"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "com.facebook.katana"

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 35
    .line 36
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFc1iSDK;->registerClient(Landroid/content/Context;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    const/4 p0, 0x0

    .line 44
    :goto_1
    if-eqz p0, :cond_1

    .line 45
    .line 46
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x13

    .line 49
    .line 50
    rem-int/lit16 v0, v0, 0x80

    .line 51
    .line 52
    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 53
    .line 54
    const-string v0, "fb"

    .line 55
    .line 56
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 60
    .line 61
    add-int/lit8 p0, p0, 0x1f

    .line 62
    .line 63
    rem-int/lit16 p0, p0, 0x80

    .line 64
    .line 65
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 66
    .line 67
    return-void
.end method

.method private setOaidData(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->w:Lcom/appsflyer/internal/AFf1fSDK;

    .line 5
    .line 6
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const v1, -0x62ff1f55

    .line 15
    .line 16
    .line 17
    const v2, 0x62ff1f57

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x6d

    .line 38
    .line 39
    rem-int/lit16 v1, v0, 0x80

    .line 40
    .line 41
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 42
    .line 43
    rem-int/lit8 v0, v0, 0x2

    .line 44
    .line 45
    const-string v1, "appsflyerKey"

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {p1, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-interface {p1, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0

    .line 58
    :cond_2
    :goto_0
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 59
    .line 60
    add-int/lit8 p0, p0, 0x67

    .line 61
    .line 62
    rem-int/lit16 p0, p0, 0x80

    .line 63
    .line 64
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 65
    .line 66
    return-void
.end method

.method private static stop(Ljava/util/Map;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x23

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "lang"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :try_start_0
    invoke-virtual {v2}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    move-object v6, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :try_start_1
    invoke-virtual {v2}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object p0, v0

    .line 51
    throw p0

    .line 52
    :goto_0
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 53
    .line 54
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 55
    .line 56
    const/16 v11, 0x78

    .line 57
    .line 58
    const/4 v12, 0x0

    .line 59
    const-string v5, "Failed to retrieve device display language name"

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    invoke-static/range {v3 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :goto_1
    :try_start_3
    const-string v0, "lang_code"

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :catch_1
    move-exception v0

    .line 86
    move-object v6, v0

    .line 87
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 88
    .line 89
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 90
    .line 91
    const/16 v11, 0x78

    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    const-string v5, "Failed to retrieve device language code"

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v10, 0x0

    .line 100
    invoke-static/range {v3 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :goto_2
    :try_start_4
    const-string v0, "country"

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catch_2
    move-exception v0

    .line 114
    move-object p0, v0

    .line 115
    move-object v3, p0

    .line 116
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 117
    .line 118
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 119
    .line 120
    const/16 v8, 0x78

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    const-string v2, "Failed to retrieve device country code"

    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    const/4 v5, 0x0

    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v7, 0x0

    .line 129
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method private static synthetic unregisterClient([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFg1oSDK;

    const/4 v1, 0x1

    aget-object v1, p0, v1

    check-cast v1, Lcom/appsflyer/internal/AFh1pSDK;

    const/4 v2, 0x2

    aget-object p0, p0, v2

    check-cast p0, Lcom/appsflyer/internal/AFb1qSDK;

    .line 362
    sget v3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v3, v3, 0x59

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/2addr v3, v2

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 363
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    iget-object v3, v1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 365
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    move-result-object v1

    sget-object v5, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    if-ne v1, v5, :cond_1

    .line 366
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v5, v1, 0x80

    sput v5, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/2addr v1, v2

    const v2, -0x34be08f5    # -1.2711691E7f

    const v5, 0x34be08fe

    if-eqz v1, :cond_0

    .line 367
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v3}, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog(Ljava/util/Map;)V

    .line 368
    invoke-direct {v0, v3}, Lcom/appsflyer/internal/AFg1oSDK;->afWarnLog(Ljava/util/Map;)V

    .line 369
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v1, v5, v2, v6}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 370
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v2, v0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    iget-object v5, v0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    invoke-static {v1, v2, v5}, Lcom/appsflyer/internal/AFa1uSDK;->unregisterClient(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/AppsFlyerProperties;)V

    goto :goto_0

    .line 371
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v3}, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog(Ljava/util/Map;)V

    .line 372
    invoke-direct {v0, v3}, Lcom/appsflyer/internal/AFg1oSDK;->afWarnLog(Ljava/util/Map;)V

    .line 373
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, v5, v2, v1}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 374
    iget-object p0, v0, Lcom/appsflyer/internal/AFg1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v1, v0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    invoke-static {p0, v1, v0}, Lcom/appsflyer/internal/AFa1uSDK;->unregisterClient(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/AppsFlyerProperties;)V

    .line 375
    throw v4

    :cond_1
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    const v5, 0x115b7027

    const v6, -0x115b7023

    invoke-static {v1, v5, v6, v2}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 376
    invoke-direct {v0, v3}, Lcom/appsflyer/internal/AFg1oSDK;->i(Ljava/util/Map;)V

    .line 377
    invoke-direct {v0, v3}, Lcom/appsflyer/internal/AFg1oSDK;->e(Ljava/util/Map;)V

    .line 378
    invoke-direct {v0, v3}, Lcom/appsflyer/internal/AFg1oSDK;->getEntries(Ljava/util/Map;)V

    if-eqz p0, :cond_2

    .line 379
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x6d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 380
    invoke-virtual {p0, v3}, Lcom/appsflyer/internal/AFb1qSDK;->AFLogger(Ljava/util/Map;)V

    .line 381
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x35

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    :cond_2
    return-object v4

    .line 382
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    iget-object p0, v1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 384
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    sget-object p0, Lcom/appsflyer/internal/AFd1bSDK;->AFa1vSDK:Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;

    throw v4
.end method

.method public static synthetic unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 8

    .line 1
    mul-int/lit16 v0, p1, -0x295

    .line 2
    .line 3
    mul-int/lit16 v1, p2, -0x295

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    not-int v0, p3

    .line 7
    not-int v2, p1

    .line 8
    not-int v3, p2

    .line 9
    or-int v4, v2, v3

    .line 10
    .line 11
    not-int v4, v4

    .line 12
    or-int/2addr v0, v4

    .line 13
    mul-int/lit16 v0, v0, 0x52c

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    or-int v1, p1, p3

    .line 17
    .line 18
    not-int v1, v1

    .line 19
    or-int/2addr p3, p2

    .line 20
    not-int p3, p3

    .line 21
    or-int/2addr p3, v1

    .line 22
    mul-int/lit16 p3, p3, -0x52c

    .line 23
    .line 24
    add-int/2addr p3, v0

    .line 25
    or-int/2addr p2, v2

    .line 26
    not-int p2, p2

    .line 27
    or-int/2addr p1, v3

    .line 28
    not-int p1, p1

    .line 29
    or-int/2addr p1, p2

    .line 30
    mul-int/lit16 p1, p1, 0x296

    .line 31
    .line 32
    add-int/2addr p1, p3

    .line 33
    const/4 p2, 0x0

    .line 34
    const/4 p3, 0x0

    .line 35
    const/4 v0, 0x1

    .line 36
    packed-switch p1, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper([Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_0
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 45
    .line 46
    add-int/lit8 p0, p0, 0x7d

    .line 47
    .line 48
    rem-int/lit16 p0, p0, 0x80

    .line 49
    .line 50
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 51
    .line 52
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 53
    .line 54
    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 55
    .line 56
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFd1bSDK;

    .line 57
    .line 58
    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->afWarnLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 59
    .line 60
    sget-object v4, Lcom/appsflyer/internal/AFd1bSDK;->getLevel:Lcom/appsflyer/internal/AFd1bSDK;

    .line 61
    .line 62
    sget-object v5, Lcom/appsflyer/internal/AFd1bSDK;->values:Lcom/appsflyer/internal/AFd1bSDK;

    .line 63
    .line 64
    sget-object v6, Lcom/appsflyer/internal/AFd1bSDK;->valueOf:Lcom/appsflyer/internal/AFd1bSDK;

    .line 65
    .line 66
    filled-new-array/range {v0 .. v6}, [Lcom/appsflyer/internal/AFd1bSDK;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 75
    .line 76
    add-int/lit8 p1, p1, 0x43

    .line 77
    .line 78
    rem-int/lit16 p1, p1, 0x80

    .line 79
    .line 80
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1oSDK;->e([Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_2
    aget-object p1, p0, p3

    .line 89
    .line 90
    check-cast p1, Lcom/appsflyer/internal/AFg1oSDK;

    .line 91
    .line 92
    aget-object p0, p0, v0

    .line 93
    .line 94
    check-cast p0, Ljava/util/Map;

    .line 95
    .line 96
    sget p3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 97
    .line 98
    add-int/lit8 p3, p3, 0x4b

    .line 99
    .line 100
    rem-int/lit16 p3, p3, 0x80

    .line 101
    .line 102
    sput p3, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 103
    .line 104
    iget-object p1, p1, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 105
    .line 106
    invoke-static {p1}, Lcom/appsflyer/internal/AFg1iSDK;->registerClient(Landroid/content/Context;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_0

    .line 111
    .line 112
    const-string p1, "inst_app"

    .line 113
    .line 114
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 120
    .line 121
    add-int/lit8 p0, p0, 0x27

    .line 122
    .line 123
    rem-int/lit16 p0, p0, 0x80

    .line 124
    .line 125
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 126
    .line 127
    :cond_0
    return-object p2

    .line 128
    :pswitch_3
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1oSDK;->v([Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_4
    new-instance p0, Landroid/os/StatFs;

    .line 134
    .line 135
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {p0, p1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 147
    .line 148
    .line 149
    move-result-wide p1

    .line 150
    invoke-virtual {p0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    .line 151
    .line 152
    .line 153
    move-result-wide v0

    .line 154
    mul-long/2addr v0, p1

    .line 155
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    mul-long/2addr v2, p1

    .line 160
    const-wide/high16 p0, 0x4000000000000000L    # 2.0

    .line 161
    .line 162
    const-wide/high16 p2, 0x4034000000000000L    # 20.0

    .line 163
    .line 164
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->pow(DD)D

    .line 165
    .line 166
    .line 167
    move-result-wide p0

    .line 168
    long-to-double p2, v0

    .line 169
    div-double/2addr p2, p0

    .line 170
    double-to-long p2, p2

    .line 171
    long-to-double v0, v2

    .line 172
    div-double/2addr v0, p0

    .line 173
    double-to-long p0, v0

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p2, "/"

    .line 183
    .line 184
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 195
    .line 196
    add-int/lit8 p1, p1, 0x2f

    .line 197
    .line 198
    rem-int/lit16 p1, p1, 0x80

    .line 199
    .line 200
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_5
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1oSDK;->force([Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :pswitch_6
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger([Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :pswitch_7
    aget-object p1, p0, p3

    .line 214
    .line 215
    check-cast p1, Lcom/appsflyer/internal/AFg1oSDK;

    .line 216
    .line 217
    aget-object p0, p0, v0

    .line 218
    .line 219
    check-cast p0, Ljava/util/Map;

    .line 220
    .line 221
    sget p3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 222
    .line 223
    add-int/lit8 p3, p3, 0x5

    .line 224
    .line 225
    rem-int/lit16 p3, p3, 0x80

    .line 226
    .line 227
    sput p3, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    iget-object p3, p1, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 233
    .line 234
    const-string v1, "AppsFlyerTimePassedSincePrevLaunch"

    .line 235
    .line 236
    const-wide/16 v2, 0x0

    .line 237
    .line 238
    invoke-interface {p3, v1, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v4

    .line 242
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 243
    .line 244
    .line 245
    move-result-wide v6

    .line 246
    iget-object p1, p1, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 247
    .line 248
    invoke-interface {p1, v1, v6, v7}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    .line 249
    .line 250
    .line 251
    cmp-long p1, v4, v2

    .line 252
    .line 253
    if-lez p1, :cond_1

    .line 254
    .line 255
    sub-long/2addr v6, v4

    .line 256
    const-wide/16 v1, 0x3e8

    .line 257
    .line 258
    div-long/2addr v6, v1

    .line 259
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 260
    .line 261
    add-int/2addr p1, v0

    .line 262
    rem-int/lit16 p1, p1, 0x80

    .line 263
    .line 264
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 265
    .line 266
    goto :goto_0

    .line 267
    :cond_1
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 268
    .line 269
    add-int/lit8 p1, p1, 0x61

    .line 270
    .line 271
    rem-int/lit16 p1, p1, 0x80

    .line 272
    .line 273
    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 274
    .line 275
    const-wide/16 v6, -0x1

    .line 276
    .line 277
    :goto_0
    const-string p1, "timepassedsincelastlaunch"

    .line 278
    .line 279
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p3

    .line 283
    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    return-object p2

    .line 287
    :pswitch_8
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient([Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    :pswitch_9
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1oSDK;->d([Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    return-object p0

    .line 297
    :pswitch_a
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    return-object p0

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final unregisterClient(Ljava/util/Map;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;I)V"
        }
    .end annotation

    .line 328
    const-string v0, "versionCode"

    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v1, v1, 0x11

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 329
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v1

    .line 330
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 331
    invoke-virtual {v3}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    if-le v3, v1, :cond_0

    .line 332
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 333
    invoke-virtual {v3}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 334
    invoke-interface {v1, v0, v3}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;I)V

    .line 335
    :cond_0
    const-string v0, "app_version_code"

    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 336
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 337
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    const-string v0, "app_version_name"

    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 339
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 340
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    const-string v0, "targetSDKver"

    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 342
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 343
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 344
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 345
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    const-string v0, "date1"

    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v3, Ljava/util/Date;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    const-string v0, "date2"

    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v3, Ljava/util/Date;

    iget-object v4, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-virtual {v4}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object v4

    iget-wide v4, v4, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    const-string v0, "counter"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    .line 349
    sget p2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p2, p2, 0x9

    rem-int/lit16 v1, p2, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p2

    const/16 v0, 0x19

    div-int/2addr v0, v2

    goto :goto_0

    .line 350
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 351
    :goto_0
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x21

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    goto :goto_1

    :cond_2
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x7d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 352
    :goto_1
    :try_start_2
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    const/high16 v1, 0x1000000

    add-int/2addr v0, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    add-int/lit16 v1, v1, 0x3aaf

    int-to-char v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0xf

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v3, v4}, Lcom/appsflyer/internal/AFg1oSDK;->a(ICI[Ljava/lang/Object;)V

    aget-object v0, v4, v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger()Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, v1, p2}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/text/SimpleDateFormat;I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 353
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x68

    const/4 v9, 0x0

    const-string v2, "Failed to collect app version and update date information"

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method private static synthetic v([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p0, v0

    .line 3
    .line 4
    check-cast v1, Lcom/appsflyer/internal/AFg1oSDK;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    aget-object p0, p0, v2

    .line 8
    .line 9
    check-cast p0, Ljava/util/Map;

    .line 10
    .line 11
    sget v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x47

    .line 14
    .line 15
    rem-int/lit16 v3, v2, 0x80

    .line 16
    .line 17
    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 18
    .line 19
    rem-int/lit8 v2, v2, 0x2

    .line 20
    .line 21
    const-string v3, "btl"

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient:Lcom/appsflyer/internal/AFg1wSDK;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 28
    .line 29
    invoke-interface {v2, v1}, Lcom/appsflyer/internal/AFg1wSDK;->registerClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v2, v1, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;->unregisterClient:F

    .line 34
    .line 35
    iget-object v1, v1, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;->AFLogger:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {p0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const/16 v2, 0xe

    .line 45
    .line 46
    div-int/2addr v2, v0

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient:Lcom/appsflyer/internal/AFg1wSDK;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 53
    .line 54
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFg1wSDK;->registerClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget v1, v0, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;->unregisterClient:F

    .line 59
    .line 60
    iget-object v0, v0, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;->AFLogger:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {p0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    move-object v1, v0

    .line 72
    :goto_0
    const-string v0, "btch"

    .line 73
    .line 74
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 78
    .line 79
    add-int/lit8 p0, p0, 0x13

    .line 80
    .line 81
    rem-int/lit16 p0, p0, 0x80

    .line 82
    .line 83
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 84
    .line 85
    :cond_1
    const/4 p0, 0x0

    .line 86
    return-object p0
.end method

.method private static v()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 96
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    long-to-int v1, v1

    const v2, -0x8316798

    const v3, 0x831679f

    invoke-static {v0, v2, v3, v1}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final v(Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 87
    :try_start_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient()Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 88
    const-string p0, "yyyy-MM-dd_HHmmssZ"

    .line 89
    new-instance v2, Ljava/text/SimpleDateFormat;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, p0, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 90
    const-string p0, "installDate"

    .line 91
    const-string v3, "UTC"

    invoke-static {v3}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 92
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x6b

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 95
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x78

    const/4 v9, 0x0

    const-string v2, "Failed to retrieve or format app install date"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method private valueOf(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/appsflyer/internal/AFa1uSDK;->INSTANCE:Lcom/appsflyer/internal/AFa1uSDK;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/appsflyer/internal/AFa1uSDK;->registerClient(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 25
    .line 26
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1uSDK;->AFLogger(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/16 v1, 0x3e

    .line 31
    .line 32
    div-int/lit8 v1, v1, 0x0

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v0, Lcom/appsflyer/internal/AFa1uSDK;->INSTANCE:Lcom/appsflyer/internal/AFa1uSDK;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 43
    .line 44
    invoke-static {v0}, Lcom/appsflyer/internal/AFa1uSDK;->registerClient(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 49
    .line 50
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1uSDK;->AFLogger(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    :goto_0
    if-eqz p0, :cond_3

    .line 57
    .line 58
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x37

    .line 61
    .line 62
    rem-int/lit16 v2, v1, 0x80

    .line 63
    .line 64
    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 65
    .line 66
    rem-int/lit8 v1, v1, 0x2

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-lez v1, :cond_1

    .line 75
    .line 76
    const-string v1, "reinstallCounter"

    .line 77
    .line 78
    invoke-interface {p1, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const-string p0, "originalAppsflyerId"

    .line 82
    .line 83
    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_1
    return-void

    .line 87
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    throw p0

    .line 92
    :cond_3
    return-void
.end method

.method private values(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1bSDK;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1bSDK;->AFKeystoreWrapper()Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 23
    .line 24
    .line 25
    const/16 p0, 0x37

    .line 26
    .line 27
    div-int/lit8 p0, p0, 0x0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1bSDK;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1bSDK;->AFKeystoreWrapper()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p1, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private w()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 2
    .line 3
    const-string v1, "preInstallName"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 12
    .line 13
    add-int/lit8 p0, p0, 0x43

    .line 14
    .line 15
    rem-int/lit16 p0, p0, 0x80

    .line 16
    .line 17
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 29
    .line 30
    invoke-interface {p0, v1, v0}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 34
    .line 35
    add-int/lit8 p0, p0, 0x17

    .line 36
    .line 37
    rem-int/lit16 p0, p0, 0x80

    .line 38
    .line 39
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->afWarnLog()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0xf

    .line 51
    .line 52
    rem-int/lit16 v2, v0, 0x80

    .line 53
    .line 54
    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 55
    .line 56
    rem-int/lit8 v0, v0, 0x2

    .line 57
    .line 58
    const-string v2, "AF_PRE_INSTALL_NAME"

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-direct {p0, v2}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/16 v2, 0x2a

    .line 67
    .line 68
    div-int/lit8 v2, v2, 0x0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-direct {p0, v2}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1oSDK;->e:Lcom/appsflyer/internal/AFc1kSDK;

    .line 78
    .line 79
    invoke-interface {v2, v1, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    .line 83
    .line 84
    invoke-interface {p0, v1, v0}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 88
    .line 89
    add-int/lit8 p0, p0, 0x73

    .line 90
    .line 91
    rem-int/lit16 p0, p0, 0x80

    .line 92
    .line 93
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 94
    .line 95
    :cond_4
    return-object v0
.end method

.method private final w(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 96
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x552ee503

    const v1, -0x552ee503

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 5

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x63

    .line 29
    .line 30
    rem-int/lit16 v1, v1, 0x80

    .line 31
    .line 32
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 33
    .line 34
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move p1, v2

    .line 41
    :goto_0
    invoke-direct {p0, v0, p1}, Lcom/appsflyer/internal/AFg1oSDK;->d(Ljava/util/Map;Z)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel(Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1oSDK;->stop(Ljava/util/Map;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/util/Map;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 54
    .line 55
    iget-object p1, p1, Lcom/appsflyer/internal/AFc1eSDK;->force:Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {p0, v0, p1}, Lcom/appsflyer/internal/AFg1oSDK;->registerClient(Ljava/util/Map;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->getSdkVersion(Ljava/util/Map;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget p1, p1, Landroid/content/res/Configuration;->mcc:I

    .line 74
    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v1, Lkotlin/Pair;

    .line 80
    .line 81
    const-string v3, "mcc"

    .line 82
    .line 83
    invoke-direct {v1, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger:Landroid/content/Context;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget p1, p1, Landroid/content/res/Configuration;->mnc:I

    .line 97
    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v3, Lkotlin/Pair;

    .line 103
    .line 104
    const-string v4, "mnc"

    .line 105
    .line 106
    invoke-direct {v3, v4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    filled-new-array {v1, v3}, [Lkotlin/Pair;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string v1, "cell"

    .line 118
    .line 119
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    const-string p1, "sig"

    .line 123
    .line 124
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->d()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper()J

    .line 132
    .line 133
    .line 134
    move-result-wide p0

    .line 135
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    const-string p1, "last_boot_time"

    .line 140
    .line 141
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    new-array p0, v2, [Ljava/lang/Object;

    .line 145
    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v1

    .line 150
    long-to-int p1, v1

    .line 151
    const v1, -0x8316798

    .line 152
    .line 153
    .line 154
    const v2, 0x831679f

    .line 155
    .line 156
    .line 157
    invoke-static {p0, v1, v2, p1}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, Ljava/lang/String;

    .line 162
    .line 163
    const-string p1, "disk"

    .line 164
    .line 165
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 169
    .line 170
    add-int/lit8 p0, p0, 0x79

    .line 171
    .line 172
    rem-int/lit16 p0, p0, 0x80

    .line 173
    .line 174
    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 175
    .line 176
    return-void

    .line 177
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    iget-object p0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    const/4 p0, 0x0

    .line 186
    throw p0
.end method

.method public final AFKeystoreWrapper(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 216
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x53

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    const/4 v1, 0x2

    rem-int/2addr v0, v1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 218
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object v0

    .line 219
    div-int/lit8 v1, v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 220
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 222
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 223
    :goto_0
    const-string v1, "uid"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 225
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v0, "CUSTOM_INSTALL_ID_APPLIED"

    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 226
    const-string p0, "custom_install_id"

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x77

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    :cond_2
    return-void
.end method

.method public final AFLogger(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 2

    .line 113
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x2b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->v(Ljava/util/Map;)V

    .line 117
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    iget v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->afWarnLog:I

    .line 120
    invoke-direct {p0, v0, v1}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient(Ljava/util/Map;I)V

    .line 121
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->getLevel(Ljava/util/Map;)V

    .line 123
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->enableTCFDataCollection(Ljava/util/Map;)V

    .line 125
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->setImeiData(Ljava/util/Map;)V

    .line 127
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v0, p1}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient(Ljava/util/Map;Lcom/appsflyer/internal/AFe1zSDK;)V

    .line 129
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x3f

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final AFLogger(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->force:Lcom/appsflyer/internal/AFi1vSDK;

    .line 132
    iget-object v0, v0, Lcom/appsflyer/internal/AFi1vSDK;->d:Lcom/appsflyer/internal/AFi1ySDK;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFi1ySDK;->unregisterClient()Lcom/appsflyer/internal/AFi1xSDK;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    .line 133
    const-string v1, "network"

    .line 134
    iget-object v2, v0, Lcom/appsflyer/internal/AFi1xSDK;->unregisterClient:Ljava/lang/String;

    .line 135
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    iget-boolean v1, v0, Lcom/appsflyer/internal/AFi1xSDK;->d:Z

    .line 137
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "ivc"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 139
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFc1eSDK;->afErrorLog:Z

    if-nez p0, :cond_4

    .line 140
    iget-object p0, v0, Lcom/appsflyer/internal/AFi1xSDK;->registerClient:Ljava/lang/String;

    if-eqz p0, :cond_1

    .line 141
    const-string v1, "operator"

    invoke-interface {p1, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    :cond_1
    iget-object p0, v0, Lcom/appsflyer/internal/AFi1xSDK;->AFKeystoreWrapper:Ljava/lang/String;

    if-eqz p0, :cond_3

    .line 143
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x21

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "carrier"

    if-eqz v0, :cond_2

    .line 144
    invoke-interface {p1, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p0, 0x16

    .line 145
    div-int/lit8 p0, p0, 0x0

    return-void

    .line 146
    :cond_2
    invoke-interface {p1, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 147
    :cond_3
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x35

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    :cond_4
    return-void
.end method

.method public final d(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 2

    .line 222
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x61500e4

    const v1, -0x61500de

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method public final d(Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->values:Ljava/lang/String;

    .line 19
    .line 20
    const/16 v1, 0x19

    .line 21
    .line 22
    div-int/lit8 v1, v1, 0x0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->values:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    :goto_0
    const-string v1, "appid"

    .line 37
    .line 38
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->stop:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x3

    .line 52
    if-eq v1, v2, :cond_2

    .line 53
    .line 54
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 55
    .line 56
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "WARNING: currency code should be 3 characters!!! \'"

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v2, "\' is not a legal value."

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const/4 v7, 0x4

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    const-string v1, "currency"

    .line 84
    .line 85
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 89
    .line 90
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->getEntries:Z

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v1, "isUpdate"

    .line 97
    .line 98
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 102
    .line 103
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->getSdkVersion:Ljava/lang/String;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    const-string v1, "customData"

    .line 108
    .line 109
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    :cond_4
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 113
    .line 114
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->valueOf:Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 119
    .line 120
    add-int/lit8 v1, v1, 0x41

    .line 121
    .line 122
    rem-int/lit16 v2, v1, 0x80

    .line 123
    .line 124
    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 125
    .line 126
    rem-int/lit8 v1, v1, 0x2

    .line 127
    .line 128
    const-string v2, "appUserId"

    .line 129
    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    const/4 p0, 0x0

    .line 140
    throw p0

    .line 141
    :cond_6
    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 142
    .line 143
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1eSDK;->w:Lcom/appsflyer/internal/AFb1rSDK;

    .line 144
    .line 145
    if-eqz p0, :cond_8

    .line 146
    .line 147
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 148
    .line 149
    add-int/lit8 v0, v0, 0x2f

    .line 150
    .line 151
    rem-int/lit16 v1, v0, 0x80

    .line 152
    .line 153
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 154
    .line 155
    rem-int/lit8 v0, v0, 0x2

    .line 156
    .line 157
    if-eqz v0, :cond_7

    .line 158
    .line 159
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1rSDK;->AFKeystoreWrapper:[Ljava/lang/String;

    .line 160
    .line 161
    const/16 v0, 0x45

    .line 162
    .line 163
    div-int/lit8 v0, v0, 0x0

    .line 164
    .line 165
    if-eqz p0, :cond_8

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_7
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1rSDK;->AFKeystoreWrapper:[Ljava/lang/String;

    .line 169
    .line 170
    if-eqz p0, :cond_8

    .line 171
    .line 172
    :goto_2
    const-string v0, "sharing_filter"

    .line 173
    .line 174
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    :cond_8
    return-void
.end method

.method public final registerClient(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 5
    .line 6
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x69

    .line 15
    .line 16
    rem-int/lit16 v1, v1, 0x80

    .line 17
    .line 18
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 19
    .line 20
    iget-object v4, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x71

    .line 25
    .line 26
    rem-int/lit16 v1, v1, 0x80

    .line 27
    .line 28
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 29
    .line 30
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 31
    .line 32
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1eSDK;->v:Lcom/appsflyer/internal/AFb1qSDK;

    .line 33
    .line 34
    filled-new-array {p0, p1, v1}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const v5, -0x7cba2bec

    .line 43
    .line 44
    .line 45
    const v6, 0x7cba2bed

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v5, v6, v4}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x29

    .line 54
    .line 55
    rem-int/lit16 v1, v1, 0x80

    .line 56
    .line 57
    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    instance-of v1, p1, Lcom/appsflyer/internal/AFh1eSDK;

    .line 61
    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 65
    .line 66
    add-int/2addr v1, v3

    .line 67
    rem-int/lit16 v4, v1, 0x80

    .line 68
    .line 69
    sput v4, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 70
    .line 71
    rem-int/lit8 v1, v1, 0x2

    .line 72
    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, v0, v1}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper(Ljava/util/Map;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/16 v1, 0x28

    .line 87
    .line 88
    div-int/2addr v1, v2

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, v0, v1}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper(Ljava/util/Map;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    :goto_0
    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 102
    .line 103
    sget-object v4, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 104
    .line 105
    sget-object v5, Lcom/appsflyer/internal/AFd1bSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFd1bSDK;

    .line 106
    .line 107
    filled-new-array {v1, v4, v5}, [Lcom/appsflyer/internal/AFd1bSDK;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    sget v5, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    .line 126
    .line 127
    add-int/2addr v5, v3

    .line 128
    rem-int/lit16 v6, v5, 0x80

    .line 129
    .line 130
    sput v6, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 131
    .line 132
    rem-int/lit8 v5, v5, 0x2

    .line 133
    .line 134
    const v6, 0x3c31bcee

    .line 135
    .line 136
    .line 137
    const v7, -0x3c31bce9

    .line 138
    .line 139
    .line 140
    if-eqz v5, :cond_3

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    invoke-static {v5, v7, v6, v8}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-static {p1, v7, v6, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    const/4 p0, 0x0

    .line 172
    throw p0

    .line 173
    :cond_4
    :goto_1
    sget-object v5, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    .line 174
    .line 175
    filled-new-array {v1, v4, v5}, [Lcom/appsflyer/internal/AFd1bSDK;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_5

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    const v5, 0x552ee503

    .line 205
    .line 206
    .line 207
    const v6, -0x552ee503

    .line 208
    .line 209
    .line 210
    invoke-static {v1, v5, v6, v4}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->setOaidData(Ljava/util/Map;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->valueOf(Ljava/util/Map;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->values(Ljava/util/Map;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper(Ljava/util/Map;)V

    .line 226
    .line 227
    .line 228
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 229
    .line 230
    if-nez v1, :cond_6

    .line 231
    .line 232
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 233
    .line 234
    if-nez v1, :cond_6

    .line 235
    .line 236
    move v2, v3

    .line 237
    :cond_6
    invoke-direct {p0, v0, v2}, Lcom/appsflyer/internal/AFg1oSDK;->AFKeystoreWrapper(Ljava/util/Map;Z)V

    .line 238
    .line 239
    .line 240
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->onPause(Ljava/util/Map;)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1oSDK;->getInstance(Ljava/util/Map;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v0, p1}, Lcom/appsflyer/internal/AFg1oSDK;->AFLogger(Ljava/util/Map;Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 247
    .line 248
    .line 249
    const-string p0, "af_events_api"

    .line 250
    .line 251
    const-string p1, "1"

    .line 252
    .line 253
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    return-void
.end method

.method public final registerClient(Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 259
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 260
    sget v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 v2, v2, 0x2b

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 v2, v2, 0x2

    const-string v3, "af_deeplink"

    if-nez v2, :cond_2

    .line 261
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 262
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v6, "Skipping push payload processing: deeplink already extracted from intent"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_2

    .line 263
    :cond_0
    :try_start_0
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 264
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 265
    const-string v0, "isPush"

    const-string v4, "true"

    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 266
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 268
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 269
    new-instance v0, La/g0g0;

    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    move-object p1, v0

    .line 270
    :goto_0
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 271
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p1, p1, 0x11

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 272
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v10, 0x1b

    const/4 v11, 0x0

    const-string v4, "Exception while trying to create JSONObject from pushPayload"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    :goto_1
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v10, 0x78

    const/4 v11, 0x0

    const-string v4, "Exception while trying to create JSONObject from pushPayload"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    goto :goto_1

    .line 273
    :cond_2
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    throw v1

    .line 274
    :cond_3
    sget p1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p1, p1, 0x57

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 275
    :cond_4
    :goto_2
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 276
    iput-object v1, p0, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    return-void
.end method

.method public final unregisterClient()J
    .locals 3

    .line 412
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v1, -0x7c6ba22b

    const v2, 0x7c6ba22e

    invoke-static {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 2

    .line 411
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x6940c7f0

    const v1, -0x6940c7ee

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method public final unregisterClient(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 305
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->AFLogger:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 306
    const-string v1, "email_hashed"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x1b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 309
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 310
    const-string v1, "phone_number_hashed"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 312
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->registerClient:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 313
    const-string v1, "phone_number_e164_hashed"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x2d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 315
    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 316
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->AFKeystoreWrapper:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 317
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v1, v1, 0x35

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 318
    const-string v1, "first_name_hashed"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 320
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->e:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 321
    sget v1, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v1, v1, 0x63

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    rem-int/lit8 v1, v1, 0x2

    const-string v2, "last_name_hashed"

    if-nez v1, :cond_4

    .line 322
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x15

    div-int/lit8 v0, v0, 0x0

    goto :goto_0

    :cond_4
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    :cond_5
    :goto_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 324
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1eSDK;->i:Ljava/lang/Long;

    if-eqz p0, :cond_6

    .line 325
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 326
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    .line 327
    const-string v0, "fb_login_id"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method public final unregisterClient(Ljava/util/Map;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;II)V"
        }
    .end annotation

    .line 354
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    const-string v0, "counter"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    const-string p2, "iaecounter"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1oSDK;->i()Z

    move-result p0

    const/4 p2, 0x0

    if-nez p0, :cond_1

    .line 359
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x1b

    rem-int/lit16 p3, p0, 0x80

    sput p3, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    .line 360
    :cond_1
    :goto_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p0

    const-string p2, "isFirstCall"

    invoke-interface {p1, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x7d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    return-void
.end method

.method public final unregisterClient(Ljava/util/Map;Lcom/appsflyer/internal/AFe1zSDK;)V
    .locals 12
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

    .line 385
    sget v0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x13

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 386
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 387
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    long-to-int v1, v1

    const v2, 0x661e25a9

    const v3, -0x661e259e

    invoke-static {v0, v2, v3, v1}, Lcom/appsflyer/internal/AFg1oSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    .line 388
    :cond_0
    iget-object p2, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 389
    iget-boolean v0, p2, Lcom/appsflyer/internal/AFc1eSDK;->setCustomerUserId:Z

    .line 390
    const-string v1, "app_set_id"

    if-eqz v0, :cond_2

    .line 391
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 392
    new-instance v0, Lkotlin/Pair;

    const-string v2, "app_set_id_disabled"

    invoke-direct {v0, v2, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 393
    invoke-static {v0}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1eSDK;

    .line 395
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1eSDK;->setUserEmail:Lcom/appsflyer/internal/AFc1rSDK;

    if-eqz p0, :cond_1

    .line 396
    sget p0, Lcom/appsflyer/internal/AFg1oSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x3b

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1oSDK;->getLevel:I

    .line 397
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 398
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->APP_SET_ID:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 399
    const-string v2, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK."

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 400
    :cond_1
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 401
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->APP_SET_ID:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v10, 0x4

    const/4 v11, 0x0

    .line 402
    const-string v8, "App Set ID collection is disabled. Skipping inclusion in the event payload."

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 403
    :cond_2
    iget-object p0, p2, Lcom/appsflyer/internal/AFc1eSDK;->setUserEmail:Lcom/appsflyer/internal/AFc1rSDK;

    if-eqz p0, :cond_3

    .line 404
    iget p2, p0, Lcom/appsflyer/internal/AFc1rSDK;->AFKeystoreWrapper:I

    .line 405
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 406
    new-instance v0, Lkotlin/Pair;

    const-string v2, "scope"

    invoke-direct {v0, v2, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 407
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1rSDK;->unregisterClient:Ljava/lang/String;

    .line 408
    new-instance p2, Lkotlin/Pair;

    const-string v2, "id"

    invoke-direct {p2, v2, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    filled-new-array {v0, p2}, [Lkotlin/Pair;

    move-result-object p0

    .line 410
    invoke-static {p0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method
