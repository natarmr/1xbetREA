.class public final Lcom/appsflyer/internal/AFe1pSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Ljava/lang/String;

.field private final afDebugLog:Lcom/appsflyer/share/LinkGenerator;

.field private final afErrorLog:Lcom/appsflyer/share/LinkGenerator$ResponseListener;

.field private final afInfoLog:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final force:Ljava/util/UUID;

.field private final v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/appsflyer/share/LinkGenerator$ResponseListener;Lcom/appsflyer/share/LinkGenerator;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFc1bSDK;",
            "Ljava/util/UUID;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/appsflyer/share/LinkGenerator$ResponseListener;",
            "Lcom/appsflyer/share/LinkGenerator;",
            ")V"
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->i:Lcom/appsflyer/internal/AFd1bSDK;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    new-array v1, v1, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 20
    .line 21
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v2, v1, v3

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-direct {p0, v0, v1, p1, v2}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lcom/appsflyer/internal/AFe1pSDK;->force:Ljava/util/UUID;

    .line 34
    .line 35
    iput-object p3, p0, Lcom/appsflyer/internal/AFe1pSDK;->v:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/appsflyer/internal/AFe1pSDK;->AFLoggerLogLevel:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p6, p0, Lcom/appsflyer/internal/AFe1pSDK;->afErrorLog:Lcom/appsflyer/share/LinkGenerator$ResponseListener;

    .line 40
    .line 41
    iput-object p7, p0, Lcom/appsflyer/internal/AFe1pSDK;->afDebugLog:Lcom/appsflyer/share/LinkGenerator;

    .line 42
    .line 43
    invoke-static {p4}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1pSDK;->afInfoLog:Ljava/util/Map;

    .line 48
    .line 49
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

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1pSDK;->v:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1pSDK;->afInfoLog:Ljava/util/Map;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1pSDK;->AFLoggerLogLevel:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1pSDK;->force:Ljava/util/UUID;

    .line 15
    .line 16
    move-object v5, p1

    .line 17
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/internal/AFd1sSDK;->unregisterClient(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final a_()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public final d()J
    .locals 2

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFe1oSDK;->AFKeystoreWrapper()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final e()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final force()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->force()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1pSDK;->afErrorLog:Lcom/appsflyer/share/LinkGenerator$ResponseListener;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 11
    .line 12
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-interface {v0, p0}, Lcom/appsflyer/share/LinkGenerator$ResponseListener;->onResponse(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1pSDK;->afDebugLog:Lcom/appsflyer/share/LinkGenerator;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/appsflyer/share/LinkGenerator;->generateLink()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {v0, p0}, Lcom/appsflyer/share/LinkGenerator$ResponseListener;->onResponseError(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method
