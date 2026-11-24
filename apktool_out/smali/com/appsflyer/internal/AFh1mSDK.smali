.class public abstract Lcom/appsflyer/internal/AFh1mSDK;
.super Lcom/appsflyer/internal/AFh1pSDK;
.source "SourceFile"


# instance fields
.field private final AFLoggerLogLevel:Z

.field private final afDebugLog:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0, v0, v0}, Lcom/appsflyer/internal/AFh1mSDK;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    .line 4
    invoke-direct {p0, p1, p1, p3}, Lcom/appsflyer/internal/AFh1pSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p2, p1

    .line 16
    :goto_0
    iput-boolean p2, p0, Lcom/appsflyer/internal/AFh1mSDK;->afDebugLog:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFh1mSDK;->AFLoggerLogLevel:Z

    .line 19
    .line 20
    return-void
.end method
