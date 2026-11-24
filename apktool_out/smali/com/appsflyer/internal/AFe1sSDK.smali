.class public final Lcom/appsflyer/internal/AFe1sSDK;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field private final registerClient:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1sSDK;->registerClient:Ljava/lang/Thread;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1sSDK;->registerClient:Ljava/lang/Thread;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
