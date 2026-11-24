.class public abstract Lcom/appsflyer/internal/AFh1pSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public AFKeystoreWrapper:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

.field protected afErrorLog:Z

.field public afInfoLog:Ljava/lang/String;

.field public afWarnLog:I

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/String;

.field public force:[B

.field public i:Ljava/lang/String;

.field public final registerClient:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final unregisterClient:Z

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, v0, v0, v0}, Lcom/appsflyer/internal/AFh1pSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->registerClient:Ljava/util/Map;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->afErrorLog:Z

    .line 20
    .line 21
    iput-object p1, p0, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p2, p0, Lcom/appsflyer/internal/AFh1pSDK;->i:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x1

    .line 33
    :goto_0
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient:Z

    .line 34
    .line 35
    return-void
.end method

.method public static unregisterClient(D)Z
    .locals 10

    const-wide/16 v0, 0x0

    cmpg-double v2, p0, v0

    const/4 v3, 0x0

    if-ltz v2, :cond_4

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v2, p0, v4

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    cmpl-double v0, p0, v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    return v1

    :cond_1
    div-double p0, v4, p0

    double-to-int p0, p0

    add-int/lit8 p1, p0, 0x1

    if-lez p1, :cond_3

    .line 56
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v6

    int-to-double v8, p0

    mul-double/2addr v6, v8

    add-double/2addr v6, v4

    double-to-int p1, v6

    if-eq p1, p0, :cond_2

    return v1

    :cond_2
    return v3

    .line 57
    :cond_3
    const-string p0, "Unsupported max value"

    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_4
    :goto_0
    return v3
.end method


# virtual methods
.method public abstract AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;
.end method

.method public final AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    return-object p0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0

    .line 13
    throw p0
.end method

.method public final AFKeystoreWrapper(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1pSDK;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lcom/appsflyer/internal/AFh1pSDK;"
        }
    .end annotation

    .line 14
    monitor-enter p1

    .line 15
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 16
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit p1

    throw p0
.end method

.method public AFLogger()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public d()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public registerClient()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final unregisterClient()Lcom/appsflyer/internal/AFh1pSDK;
    .locals 1

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->afErrorLog:Z

    return-object p0
.end method

.method public final unregisterClient(I)Lcom/appsflyer/internal/AFh1pSDK;
    .locals 4

    .line 1
    iput p1, p0, Lcom/appsflyer/internal/AFh1pSDK;->afWarnLog:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 7
    .line 8
    const-string v2, "counter"

    .line 9
    .line 10
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 17
    .line 18
    const-string v2, "counter"

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 31
    .line 32
    const-string v2, "launch_counter"

    .line 33
    .line 34
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 41
    .line 42
    const-string v2, "launch_counter"

    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    return-object p0

    .line 53
    :goto_1
    monitor-exit v0

    .line 54
    throw p0
.end method
