.class public final Lcom/appsflyer/internal/AFj1zSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFj1uSDK;


# instance fields
.field public volatile AFLogger:Z

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "DeeplinkProcessedCondition"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/appsflyer/internal/AFj1zSDK;->d:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1zSDK;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final registerClient()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    .line 3
    .line 4
    return-void
.end method

.method public final unregisterClient()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    .line 2
    .line 3
    return p0
.end method
