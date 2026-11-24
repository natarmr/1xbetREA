.class public final Lcom/appsflyer/internal/AFa1pSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final unregisterClient:Lcom/appsflyer/internal/AFh1pSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFh1pSDK;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFc1bSDK;",
            "Lcom/appsflyer/internal/AFh1pSDK;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFa1pSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/appsflyer/internal/AFa1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1pSDK;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/appsflyer/internal/AFa1pSDK;->d:Ljava/util/Map;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1pSDK;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/appsflyer/internal/AFf1uSDK;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1pSDK;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/appsflyer/internal/AFa1pSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFf1uSDK;-><init>(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1pSDK;->d:Ljava/util/Map;

    .line 21
    .line 22
    iput-object v1, v0, Lcom/appsflyer/internal/AFf1uSDK;->v:Ljava/util/Map;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of v0, v0, Lcom/appsflyer/internal/AFh1lSDK;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lcom/appsflyer/internal/AFf1vSDK;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1pSDK;

    .line 32
    .line 33
    check-cast v1, Lcom/appsflyer/internal/AFh1lSDK;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/appsflyer/internal/AFa1pSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 36
    .line 37
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFf1vSDK;-><init>(Lcom/appsflyer/internal/AFh1lSDK;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance v3, Lcom/appsflyer/internal/AFf1tSDK;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/appsflyer/internal/AFa1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1pSDK;

    .line 44
    .line 45
    iget-object v5, p0, Lcom/appsflyer/internal/AFa1pSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 46
    .line 47
    const/4 v7, 0x4

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-direct/range {v3 .. v8}, Lcom/appsflyer/internal/AFf1tSDK;-><init>(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    move-object v0, v3

    .line 54
    :goto_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1pSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    .line 55
    .line 56
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
