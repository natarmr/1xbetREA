.class public final enum Lcom/appsflyer/internal/AFa1mSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFa1mSDK;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B%\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000fj\u0002\u0008\u000ej\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFa1mSDK;",
        "",
        "",
        "p0",
        "Lkotlin/Function1;",
        "",
        "",
        "p1",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "registerClient",
        "Ljava/lang/String;",
        "AFLogger",
        "Lkotlin/jvm/functions/Function1;",
        "unregisterClient",
        "d",
        "AFKeystoreWrapper",
        "w",
        "e",
        "v"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFa1mSDK;

.field private static enum d:Lcom/appsflyer/internal/AFa1mSDK;

.field private static enum e:Lcom/appsflyer/internal/AFa1mSDK;

.field private static final synthetic force:[Lcom/appsflyer/internal/AFa1mSDK;

.field private static final synthetic i:La/a0o;

.field private static enum unregisterClient:Lcom/appsflyer/internal/AFa1mSDK;

.field private static enum v:Lcom/appsflyer/internal/AFa1mSDK;

.field private static enum w:Lcom/appsflyer/internal/AFa1mSDK;


# instance fields
.field public AFLogger:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final registerClient:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    .line 2
    .line 3
    new-instance v1, Lcom/appsflyer/internal/a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/a;-><init>(B)V

    .line 7
    .line 8
    .line 9
    const-string v2, "DebugLog"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const-string v4, "debug_mode"

    .line 13
    .line 14
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->d:Lcom/appsflyer/internal/AFa1mSDK;

    .line 18
    .line 19
    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    .line 20
    .line 21
    new-instance v1, Lcom/appsflyer/internal/a;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/a;-><init>(B)V

    .line 25
    .line 26
    .line 27
    const-string v2, "DisableAdvertisingIdentifiers"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const-string v4, "disable_advertising_identifiers"

    .line 31
    .line 32
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->unregisterClient:Lcom/appsflyer/internal/AFa1mSDK;

    .line 36
    .line 37
    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    .line 38
    .line 39
    new-instance v1, Lcom/appsflyer/internal/a;

    .line 40
    .line 41
    const/4 v2, 0x2

    .line 42
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/a;-><init>(B)V

    .line 43
    .line 44
    .line 45
    const-string v2, "MinTimeBetweenSessions"

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    const-string v4, "min_time_between_sessions"

    .line 49
    .line 50
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFa1mSDK;

    .line 54
    .line 55
    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    .line 56
    .line 57
    new-instance v1, Lcom/appsflyer/internal/a;

    .line 58
    .line 59
    const/4 v2, 0x3

    .line 60
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/a;-><init>(B)V

    .line 61
    .line 62
    .line 63
    const-string v2, "CurrencyCode"

    .line 64
    .line 65
    const/4 v3, 0x3

    .line 66
    const-string v4, "currency_code"

    .line 67
    .line 68
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->w:Lcom/appsflyer/internal/AFa1mSDK;

    .line 72
    .line 73
    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    .line 74
    .line 75
    new-instance v1, Lcom/appsflyer/internal/a;

    .line 76
    .line 77
    const/4 v2, 0x4

    .line 78
    invoke-direct {v1, v2}, Lcom/appsflyer/internal/a;-><init>(B)V

    .line 79
    .line 80
    .line 81
    const-string v2, "Host"

    .line 82
    .line 83
    const/4 v3, 0x4

    .line 84
    const-string v4, "host"

    .line 85
    .line 86
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->e:Lcom/appsflyer/internal/AFa1mSDK;

    .line 90
    .line 91
    new-instance v10, Lcom/appsflyer/internal/AFa1mSDK;

    .line 92
    .line 93
    new-instance v0, Lcom/appsflyer/internal/a;

    .line 94
    .line 95
    const/4 v1, 0x5

    .line 96
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/a;-><init>(B)V

    .line 97
    .line 98
    .line 99
    const-string v1, "DdlTimeout"

    .line 100
    .line 101
    const/4 v2, 0x5

    .line 102
    const-string v3, "ddlTimeout"

    .line 103
    .line 104
    invoke-direct {v10, v1, v2, v3, v0}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 105
    .line 106
    .line 107
    sput-object v10, Lcom/appsflyer/internal/AFa1mSDK;->v:Lcom/appsflyer/internal/AFa1mSDK;

    .line 108
    .line 109
    sget-object v5, Lcom/appsflyer/internal/AFa1mSDK;->d:Lcom/appsflyer/internal/AFa1mSDK;

    .line 110
    .line 111
    sget-object v6, Lcom/appsflyer/internal/AFa1mSDK;->unregisterClient:Lcom/appsflyer/internal/AFa1mSDK;

    .line 112
    .line 113
    sget-object v7, Lcom/appsflyer/internal/AFa1mSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFa1mSDK;

    .line 114
    .line 115
    sget-object v8, Lcom/appsflyer/internal/AFa1mSDK;->w:Lcom/appsflyer/internal/AFa1mSDK;

    .line 116
    .line 117
    sget-object v9, Lcom/appsflyer/internal/AFa1mSDK;->e:Lcom/appsflyer/internal/AFa1mSDK;

    .line 118
    .line 119
    filled-new-array/range {v5 .. v10}, [Lcom/appsflyer/internal/AFa1mSDK;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->force:[Lcom/appsflyer/internal/AFa1mSDK;

    .line 124
    .line 125
    new-instance v1, La/c0o;

    .line 126
    .line 127
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 128
    .line 129
    .line 130
    sput-object v1, Lcom/appsflyer/internal/AFa1mSDK;->i:La/a0o;

    .line 131
    .line 132
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/appsflyer/internal/AFa1mSDK;->registerClient:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/appsflyer/internal/AFa1mSDK;->AFLogger:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
.end method

.method private static final AFKeystoreWrapper(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast p0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFa1tSDK;->setMinTimeBetweenSessions(I)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final AFLogger(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFa1tSDK;->setCurrencyCode(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->AFKeystoreWrapper(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->d(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast p0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFa1tSDK;->setDisableAdvertisingIdentifiers(Z)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->registerClient(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->AFLogger(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    int-to-long v1, p0

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/AppsFlyerLib;->setDeepLinkTimeout(J)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->unregisterClient(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->i(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static registerClient()La/a0o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/a0o;"
        }
    .end annotation

    .line 20
    sget-object v0, Lcom/appsflyer/internal/AFa1mSDK;->i:La/a0o;

    return-object v0
.end method

.method private static final registerClient(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast p0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFa1tSDK;->setDebugLog(Z)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final unregisterClient(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Ljava/util/HashMap;

    .line 5
    .line 6
    const-string v0, "host"

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "prefix"

    .line 13
    .line 14
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v1, v0}, Lcom/appsflyer/internal/AFa1tSDK;->setHost(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, p0, v0}, Lcom/appsflyer/internal/AFa1tSDK;->setHost(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 52
    .line 53
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->INIT_BY_CONFIG:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 54
    .line 55
    const/4 v6, 0x4

    .line 56
    const/4 v7, 0x0

    .line 57
    const-string v4, "Unsupported/Missing values - host value is mandatory for setHost method"

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFa1mSDK;
    .locals 1

    .line 1
    const-class v0, Lcom/appsflyer/internal/AFa1mSDK;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/appsflyer/internal/AFa1mSDK;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFa1mSDK;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFa1mSDK;->force:[Lcom/appsflyer/internal/AFa1mSDK;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/appsflyer/internal/AFa1mSDK;

    .line 8
    .line 9
    return-object v0
.end method
