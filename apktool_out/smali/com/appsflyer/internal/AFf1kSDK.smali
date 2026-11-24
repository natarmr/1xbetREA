.class public final Lcom/appsflyer/internal/AFf1kSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0015\u0010\u000b\u001a\u00020\u00138FX\u0087\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014R\u0015\u0010\u0015\u001a\u00020\u00138FX\u0087\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFf1kSDK;",
        "",
        "Lcom/appsflyer/internal/AFc1iSDK;",
        "p0",
        "Lcom/appsflyer/internal/AFf1jSDK;",
        "p1",
        "Lcom/appsflyer/internal/AFc1eSDK;",
        "p2",
        "<init>",
        "(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFc1eSDK;)V",
        "",
        "AFKeystoreWrapper",
        "()J",
        "AFLogger",
        "Lcom/appsflyer/internal/AFc1iSDK;",
        "unregisterClient",
        "Lcom/appsflyer/internal/AFf1jSDK;",
        "d",
        "Lcom/appsflyer/internal/AFc1eSDK;",
        "",
        "La/a8z;",
        "registerClient",
        "AFa1uSDK"
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
.field public static final AFa1uSDK:Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;

.field private static final force:J


# instance fields
.field public final AFKeystoreWrapper:La/a8z;

.field private final AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

.field public final d:Lcom/appsflyer/internal/AFc1eSDK;

.field public final registerClient:La/a8z;

.field public final unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/appsflyer/internal/AFf1kSDK;->AFa1uSDK:Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;

    .line 8
    .line 9
    const-wide/32 v0, 0x15180

    .line 10
    .line 11
    .line 12
    sput-wide v0, Lcom/appsflyer/internal/AFf1kSDK;->force:J

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFc1eSDK;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/appsflyer/internal/AFf1kSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/appsflyer/internal/AFf1kSDK;->d:Lcom/appsflyer/internal/AFc1eSDK;

    .line 18
    .line 19
    new-instance p1, Lcom/appsflyer/internal/t;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/t;-><init>(Lcom/appsflyer/internal/AFf1kSDK;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFKeystoreWrapper:La/a8z;

    .line 30
    .line 31
    new-instance p1, Lcom/appsflyer/internal/t;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/t;-><init>(Lcom/appsflyer/internal/AFf1kSDK;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1kSDK;->registerClient:La/a8z;

    .line 42
    .line 43
    return-void
.end method

.method private static final AFLogger(Lcom/appsflyer/internal/AFf1kSDK;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 2
    .line 3
    const-string v0, "com.appsflyer.rc.staging"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFf1kSDK;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger(Lcom/appsflyer/internal/AFf1kSDK;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFf1kSDK;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1kSDK;->d(Lcom/appsflyer/internal/AFf1kSDK;)Z

    move-result p0

    return p0
.end method

.method private static final d(Lcom/appsflyer/internal/AFf1kSDK;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 2
    .line 3
    const-string v0, "com.appsflyer.rc.sandbox"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final AFKeystoreWrapper()J
    .locals 10

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 2
    .line 3
    const-string v0, "com.appsflyer.rc.cache.max-age-fallback"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    move-object p0, v0

    .line 24
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 25
    .line 26
    new-instance v0, La/g0g0;

    .line 27
    .line 28
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object p0, v0

    .line 32
    :goto_0
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 40
    .line 41
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_1

    .line 48
    .line 49
    const-string p0, "unknown error"

    .line 50
    .line 51
    :cond_1
    const-string v2, "Can\'t read maxAgeFallback from Manifest: "

    .line 52
    .line 53
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const/16 v8, 0x78

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-wide v0, Lcom/appsflyer/internal/AFf1kSDK;->force:J

    .line 68
    .line 69
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_1
    check-cast p0, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    return-wide v0

    .line 80
    :cond_2
    sget-wide v0, Lcom/appsflyer/internal/AFf1kSDK;->force:J

    .line 81
    .line 82
    return-wide v0
.end method
