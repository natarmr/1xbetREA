.class public final Lcom/appsflyer/internal/AFh1ySDK;
.super Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
.source "SourceFile"


# instance fields
.field private final unregisterClient:Lcom/appsflyer/internal/AFc1bSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFh1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFc1bSDK;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    if-eqz p6, :cond_1

    .line 11
    .line 12
    invoke-static {p2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-eqz p4, :cond_0

    .line 17
    .line 18
    const-string p2, "missing label"

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->withTag(Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/LogTag;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFc1bSDK;

    .line 25
    .line 26
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0, p3, p1}, Lcom/appsflyer/exception_manager/ExceptionManager;->storeNewException(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method
