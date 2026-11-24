.class public final Lcom/appsflyer/internal/AFh1rSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final unregisterClient()Z
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/appsflyer/migration/internal/MigrationDataProvider;->INSTANCE:Lcom/appsflyer/migration/internal/MigrationDataProvider;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    return v0

    .line 5
    :catchall_0
    const/4 v0, 0x0

    .line 6
    return v0
.end method
