.class public final Lcom/appsflyer/internal/AFh1bSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Ljava/lang/String;

.field public final AFLogger:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Throwable;

.field public final force:Lcom/appsflyer/internal/AFh1dSDK;

.field public final registerClient:I

.field public final unregisterClient:J

.field public final w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJILcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/appsflyer/internal/AFh1bSDK;->d:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/appsflyer/internal/AFh1bSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/appsflyer/internal/AFh1bSDK;->AFLogger:J

    .line 9
    .line 10
    iput-wide p5, p0, Lcom/appsflyer/internal/AFh1bSDK;->unregisterClient:J

    .line 11
    .line 12
    iput p7, p0, Lcom/appsflyer/internal/AFh1bSDK;->registerClient:I

    .line 13
    .line 14
    iput-object p8, p0, Lcom/appsflyer/internal/AFh1bSDK;->force:Lcom/appsflyer/internal/AFh1dSDK;

    .line 15
    .line 16
    iput-object p9, p0, Lcom/appsflyer/internal/AFh1bSDK;->w:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p10, p0, Lcom/appsflyer/internal/AFh1bSDK;->e:Ljava/lang/Throwable;

    .line 19
    .line 20
    return-void
.end method
