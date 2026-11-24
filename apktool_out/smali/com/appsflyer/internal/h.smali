.class public final synthetic Lcom/appsflyer/internal/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/appsflyer/internal/AFb1gSDK;

.field public final synthetic c:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lcom/appsflyer/internal/h;->a:B

    iput-object p1, p0, Lcom/appsflyer/internal/h;->b:Lcom/appsflyer/internal/AFb1gSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/h;->c:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/internal/h;->a:B

    iget-object v1, p0, Lcom/appsflyer/internal/h;->c:Landroid/content/Intent;

    iget-object p0, p0, Lcom/appsflyer/internal/h;->b:Lcom/appsflyer/internal/AFb1gSDK;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFb1gSDK;->a(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V

    return-void

    :pswitch_0
    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFb1gSDK;->c(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
