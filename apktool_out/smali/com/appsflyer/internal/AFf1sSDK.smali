.class public final Lcom/appsflyer/internal/AFf1sSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0015\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\n\u001a\u00020\u000cH\u0010\u00a2\u0006\u0004\u0008\n\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFf1sSDK;",
        "Lcom/appsflyer/internal/AFe1kSDK;",
        "",
        "Lcom/appsflyer/internal/AFh1nSDK;",
        "p0",
        "Lcom/appsflyer/internal/AFc1bSDK;",
        "p1",
        "<init>",
        "(Lcom/appsflyer/internal/AFh1nSDK;Lcom/appsflyer/internal/AFc1bSDK;)V",
        "Lcom/appsflyer/internal/AFd1pSDK;",
        "AFLogger",
        "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;",
        "",
        "e",
        "()Z",
        "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;",
        "afWarnLog",
        "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;",
        "v",
        "Lcom/appsflyer/internal/AFh1nSDK;",
        "registerClient",
        "AFa1vSDK_"
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
.field public static final AFa1vSDK_:Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;


# instance fields
.field private final v:Lcom/appsflyer/internal/AFh1nSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/appsflyer/internal/AFf1sSDK;->AFa1vSDK_:Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFh1nSDK;Lcom/appsflyer/internal/AFc1bSDK;)V
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
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1nSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    :goto_0
    move-object v2, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    new-array v3, v0, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 21
    .line 22
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    aput-object v0, v3, v1

    .line 26
    .line 27
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1nSDK;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v4, "-"

    .line 34
    .line 35
    invoke-static {v0, v4, v1}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget-object v6, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 40
    .line 41
    move-object v1, p0

    .line 42
    move-object v4, p2

    .line 43
    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v1, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    iget-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    .line 81
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1pSDK;->force:[B

    const/4 v0, 0x2

    .line 82
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    .line 83
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "cached data: "

    .line 84
    invoke-static {v2, p1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 85
    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 86
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afErrorLog()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    .line 87
    iget-object v1, v1, Lcom/appsflyer/internal/AFh1pSDK;->i:Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v1, p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    move-result-object p1

    iget-object p0, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    invoke-virtual {p1, p0}, Lcom/appsflyer/internal/AFd1sSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1nSDK;)Lcom/appsflyer/internal/AFd1pSDK;

    move-result-object p0

    return-object p0
.end method

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
    if-nez v0, :cond_6

    .line 7
    .line 8
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1nSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

    .line 16
    .line 17
    :goto_0
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->getLevel:Lcom/appsflyer/internal/AFd1bSDK;

    .line 18
    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/16 v2, 0x1a8

    .line 33
    .line 34
    if-ne v0, v2, :cond_1

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 40
    .line 41
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    if-ne v2, v3, :cond_2

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    div-int/lit16 v0, v0, 0x1f4

    .line 53
    .line 54
    if-ne v0, v1, :cond_2

    .line 55
    .line 56
    move v0, v1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v0, v4

    .line 59
    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 60
    .line 61
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 62
    .line 63
    if-eq p0, v2, :cond_4

    .line 64
    .line 65
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    .line 66
    .line 67
    if-ne p0, v2, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move p0, v4

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    :goto_2
    move p0, v1

    .line 73
    :goto_3
    if-eqz v0, :cond_5

    .line 74
    .line 75
    if-eqz p0, :cond_5

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_5
    return v4

    .line 79
    :cond_6
    :goto_4
    return v1
.end method

.method public final afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    .line 4
    .line 5
    return-object p0
.end method

.method public final e()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method
