.class Lcom/appsflyer/internal/AFa1iSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFa1dSDK;


# static fields
.field private static afErrorLog:Lcom/appsflyer/internal/AFa1iSDK;


# instance fields
.field private final values:Lcom/appsflyer/internal/AFb1nSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "sdk_bc_lib"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    const-string v1, "Failed to load native library"

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/appsflyer/internal/AFb1nSDK;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/appsflyer/internal/AFb1nSDK;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFa1iSDK;->values:Lcom/appsflyer/internal/AFb1nSDK;

    .line 10
    .line 11
    return-void
.end method

.method public static declared-synchronized afDebugLog()Lcom/appsflyer/internal/AFa1iSDK;
    .locals 2

    .line 1
    const-class v0, Lcom/appsflyer/internal/AFa1iSDK;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/appsflyer/internal/AFa1iSDK;->afErrorLog:Lcom/appsflyer/internal/AFa1iSDK;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/appsflyer/internal/AFa1iSDK;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/appsflyer/internal/AFa1iSDK;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/appsflyer/internal/AFa1iSDK;->afErrorLog:Lcom/appsflyer/internal/AFa1iSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
.end method


# virtual methods
.method public afRDLog(Ljava/util/Map;[BLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFa1iSDK;->values:Lcom/appsflyer/internal/AFb1nSDK;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/appsflyer/internal/AFb1nSDK;->afRDLog(Ljava/util/Map;[BLjava/util/Map;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
