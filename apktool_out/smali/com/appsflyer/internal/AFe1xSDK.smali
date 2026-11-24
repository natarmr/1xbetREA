.class public final Lcom/appsflyer/internal/AFe1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static final AFLogger:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/appsflyer/internal/AFe1xSDK;->AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    const v0, 0x4e864ee

    .line 9
    .line 10
    .line 11
    sput v0, Lcom/appsflyer/internal/AFe1xSDK;->AFLogger:I

    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic d()I
    .locals 1

    .line 1
    sget v0, Lcom/appsflyer/internal/AFe1xSDK;->AFLogger:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic unregisterClient()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFe1xSDK;->AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object v0
.end method
