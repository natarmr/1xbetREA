.class public final synthetic Lcom/appsflyer/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/appsflyer/sdk_base/logger/LogTag;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/f;->a:Lcom/appsflyer/sdk_base/logger/LogTag;

    iput-object p2, p0, Lcom/appsflyer/f;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/f;->b:Ljava/lang/String;

    check-cast p1, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    iget-object p0, p0, Lcom/appsflyer/f;->a:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-static {p0, v0, p1}, Lcom/appsflyer/AFLogger;->k(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
