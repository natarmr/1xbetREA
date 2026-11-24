.class public final synthetic Lcom/appsflyer/internal/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFi1aSDK;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

.field public final synthetic d:Lcom/appsflyer/internal/AFc1bSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFi1aSDK;Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/x;->a:Lcom/appsflyer/internal/AFi1aSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/x;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/appsflyer/internal/x;->c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    iput-object p4, p0, Lcom/appsflyer/internal/x;->d:Lcom/appsflyer/internal/AFc1bSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/x;->c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    iget-object v1, p0, Lcom/appsflyer/internal/x;->d:Lcom/appsflyer/internal/AFc1bSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/x;->a:Lcom/appsflyer/internal/AFi1aSDK;

    iget-object p0, p0, Lcom/appsflyer/internal/x;->b:Landroid/content/Context;

    invoke-static {v2, p0, v0, v1}, Lcom/appsflyer/internal/AFi1aSDK;->g(Lcom/appsflyer/internal/AFi1aSDK;Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void
.end method
