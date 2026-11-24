.class public Lcom/appsflyer/internal/AFd1oSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final AFKeystoreWrapper:Ljava/lang/String;

.field public final AFLogger:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/String;

.field final e:Z

.field public force:Z

.field i:Z

.field final registerClient:Z

.field public final unregisterClient:[B

.field public v:I

.field public w:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 29
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 28
    invoke-direct/range {v0 .. v6}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;ZB)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;ZB)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;ZB)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p6, 0x1

    .line 5
    iput-boolean p6, p0, Lcom/appsflyer/internal/AFd1oSDK;->i:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->force:Z

    .line 9
    .line 10
    iput-boolean p6, p0, Lcom/appsflyer/internal/AFd1oSDK;->w:Z

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    iput v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->v:I

    .line 14
    .line 15
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->d:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->unregisterClient:[B

    .line 18
    .line 19
    iput-object p3, p0, Lcom/appsflyer/internal/AFd1oSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p4, p0, Lcom/appsflyer/internal/AFd1oSDK;->AFLogger:Ljava/util/Map;

    .line 22
    .line 23
    iput-boolean p5, p0, Lcom/appsflyer/internal/AFd1oSDK;->registerClient:Z

    .line 24
    .line 25
    iput-boolean p6, p0, Lcom/appsflyer/internal/AFd1oSDK;->e:Z

    .line 26
    .line 27
    return-void
.end method
