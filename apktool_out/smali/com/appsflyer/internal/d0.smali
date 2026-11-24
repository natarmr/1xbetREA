.class public final synthetic Lcom/appsflyer/internal/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFj1sSDK;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/d0;->a:Lcom/appsflyer/internal/AFj1sSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/d0;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/appsflyer/internal/d0;->c:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/d0;->b:Ljava/lang/String;

    iget-wide v1, p0, Lcom/appsflyer/internal/d0;->c:J

    iget-object p0, p0, Lcom/appsflyer/internal/d0;->a:Lcom/appsflyer/internal/AFj1sSDK;

    invoke-static {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFj1sSDK;->c(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method
