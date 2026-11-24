.class public final Lcom/appsflyer/internal/AFe1jSDK;
.super Lcom/appsflyer/internal/AFe1ySDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFe1jSDK$AFa1uSDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1ySDK<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0015\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0010\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0008\u001a\u00020\u00178\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\"\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@RX\u0097\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFe1jSDK;",
        "Lcom/appsflyer/internal/AFe1ySDK;",
        "",
        "Lcom/appsflyer/internal/AFc1bSDK;",
        "p0",
        "<init>",
        "(Lcom/appsflyer/internal/AFc1bSDK;)V",
        "Lcom/appsflyer/internal/AFd1cSDK;",
        "registerClient",
        "()Lcom/appsflyer/internal/AFd1cSDK;",
        "Lcom/appsflyer/internal/AFc1sSDK;",
        "",
        "unregisterClient",
        "(Lcom/appsflyer/internal/AFc1sSDK;)Ljava/lang/String;",
        "",
        "d",
        "()J",
        "AFLogger",
        "()Z",
        "Lcom/appsflyer/internal/AFc1vSDK;",
        "e",
        "Lcom/appsflyer/internal/AFc1vSDK;",
        "AFKeystoreWrapper",
        "Lcom/appsflyer/internal/AFe1wSDK;",
        "v",
        "Lcom/appsflyer/internal/AFe1wSDK;",
        "afErrorLog",
        "Lcom/appsflyer/internal/AFc1bSDK;",
        "i",
        "Ljava/lang/Boolean;",
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
.field public static final AFa1uSDK:Lcom/appsflyer/internal/AFe1jSDK$AFa1uSDK;

.field public static volatile force:Z


# instance fields
.field private final afErrorLog:Lcom/appsflyer/internal/AFc1bSDK;

.field private final e:Lcom/appsflyer/internal/AFc1vSDK;

.field public i:Ljava/lang/Boolean;

.field private final v:Lcom/appsflyer/internal/AFe1wSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFe1jSDK$AFa1uSDK;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFe1jSDK$AFa1uSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/appsflyer/internal/AFe1jSDK;->AFa1uSDK:Lcom/appsflyer/internal/AFe1jSDK$AFa1uSDK;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    new-array v1, v1, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 8
    .line 9
    const-string v2, "LoadCachedRequests"

    .line 10
    .line 11
    invoke-direct {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFe1ySDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->values()Lcom/appsflyer/internal/AFc1vSDK;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1jSDK;->e:Lcom/appsflyer/internal/AFc1vSDK;

    .line 22
    .line 23
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1jSDK;->v:Lcom/appsflyer/internal/AFe1wSDK;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1jSDK;->afErrorLog:Lcom/appsflyer/internal/AFc1bSDK;

    .line 33
    .line 34
    return-void
.end method

.method private static unregisterClient(Lcom/appsflyer/internal/AFc1sSDK;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1sSDK;->registerClient:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/16 v3, 0xa

    .line 11
    .line 12
    invoke-static {v3}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-static {v2, v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1sSDK;->unregisterClient:Ljava/lang/String;

    .line 21
    .line 22
    :try_start_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "isCachedRequest"

    .line 31
    .line 32
    const-string v6, "true"

    .line 33
    .line 34
    invoke-virtual {v4, v5, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const-string v5, "timeincache"

    .line 39
    .line 40
    sub-long/2addr v0, v2

    .line 41
    const-wide/16 v2, 0x3e8

    .line 42
    .line 43
    div-long/2addr v0, v2

    .line 44
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v4, v5, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    move-object v4, v0

    .line 59
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 60
    .line 61
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 62
    .line 63
    const/16 v9, 0x60

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    const-string v3, "Couldn\'t parse the uri"

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    return-object p0
.end method


# virtual methods
.method public final AFLogger()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final d()J
    .locals 2

    const-wide/16 v0, 0x7530

    return-wide v0
.end method

.method public final registerClient()Lcom/appsflyer/internal/AFd1cSDK;
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1jSDK;->e:Lcom/appsflyer/internal/AFc1vSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1vSDK;->AFKeystoreWrapper()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/appsflyer/internal/AFc1sSDK;

    .line 22
    .line 23
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 24
    .line 25
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 26
    .line 27
    iget-object v4, v0, Lcom/appsflyer/internal/AFc1sSDK;->unregisterClient:Ljava/lang/String;

    .line 28
    .line 29
    const-string v5, "resending request: "

    .line 30
    .line 31
    invoke-static {v5, v4}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v6, 0x4

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    invoke-static {v0}, Lcom/appsflyer/internal/AFe1jSDK;->unregisterClient(Lcom/appsflyer/internal/AFc1sSDK;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    new-instance v8, Lcom/appsflyer/internal/AFh1nSDK;

    .line 46
    .line 47
    iget-object v10, v0, Lcom/appsflyer/internal/AFc1sSDK;->d:[B

    .line 48
    .line 49
    iget-object v11, v0, Lcom/appsflyer/internal/AFc1sSDK;->registerClient:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v12, v0, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger:Lcom/appsflyer/internal/AFe1zSDK;

    .line 52
    .line 53
    iget-object v13, v0, Lcom/appsflyer/internal/AFc1sSDK;->e:Ljava/util/Map;

    .line 54
    .line 55
    invoke-direct/range {v8 .. v13}, Lcom/appsflyer/internal/AFh1nSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Lcom/appsflyer/internal/AFe1zSDK;Ljava/util/Map;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1jSDK;->v:Lcom/appsflyer/internal/AFe1wSDK;

    .line 59
    .line 60
    new-instance v2, Lcom/appsflyer/internal/AFf1sSDK;

    .line 61
    .line 62
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1jSDK;->afErrorLog:Lcom/appsflyer/internal/AFc1bSDK;

    .line 63
    .line 64
    invoke-direct {v2, v8, v3}, Lcom/appsflyer/internal/AFf1sSDK;-><init>(Lcom/appsflyer/internal/AFh1nSDK;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    move-object v5, v0

    .line 73
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 74
    .line 75
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->QUEUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 76
    .line 77
    const/16 v10, 0x78

    .line 78
    .line 79
    const/4 v11, 0x0

    .line 80
    const-string v4, "Failed to resend cached request"

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 91
    .line 92
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1jSDK;->i:Ljava/lang/Boolean;

    .line 93
    .line 94
    const/4 p0, 0x1

    .line 95
    sput-boolean p0, Lcom/appsflyer/internal/AFe1jSDK;->force:Z

    .line 96
    .line 97
    sget-object p0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    .line 98
    .line 99
    return-object p0
.end method
