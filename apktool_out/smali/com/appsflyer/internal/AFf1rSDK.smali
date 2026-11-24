.class public final Lcom/appsflyer/internal/AFf1rSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:[Lcom/appsflyer/internal/AFe1zSDK;

.field private static final unregisterClient:[Lcom/appsflyer/internal/AFe1zSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 3
    .line 4
    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->force:Lcom/appsflyer/internal/AFd1bSDK;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->i:Lcom/appsflyer/internal/AFd1bSDK;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aput-object v1, v0, v3

    .line 13
    .line 14
    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->afInfoLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    aput-object v1, v0, v4

    .line 18
    .line 19
    sput-object v0, Lcom/appsflyer/internal/AFf1rSDK;->AFKeystoreWrapper:[Lcom/appsflyer/internal/AFe1zSDK;

    .line 20
    .line 21
    new-array v0, v4, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 22
    .line 23
    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 24
    .line 25
    aput-object v1, v0, v2

    .line 26
    .line 27
    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

    .line 28
    .line 29
    aput-object v1, v0, v3

    .line 30
    .line 31
    sput-object v0, Lcom/appsflyer/internal/AFf1rSDK;->unregisterClient:[Lcom/appsflyer/internal/AFe1zSDK;

    .line 32
    .line 33
    return-void
.end method

.method public static final synthetic AFLogger()[Lcom/appsflyer/internal/AFe1zSDK;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFf1rSDK;->AFKeystoreWrapper:[Lcom/appsflyer/internal/AFe1zSDK;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()[Lcom/appsflyer/internal/AFe1zSDK;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFf1rSDK;->unregisterClient:[Lcom/appsflyer/internal/AFe1zSDK;

    .line 2
    .line 3
    return-object v0
.end method
