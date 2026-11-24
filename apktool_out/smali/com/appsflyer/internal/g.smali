.class public final synthetic Lcom/appsflyer/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcom/appsflyer/internal/g;->a:B

    iput-object p1, p0, Lcom/appsflyer/internal/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/internal/g;->a:B

    iget-object p0, p0, Lcom/appsflyer/internal/g;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p0, Lcom/appsflyer/internal/AFe1wSDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFe1wSDK;->a(Lcom/appsflyer/internal/AFe1wSDK;)V

    return-void

    :pswitch_0
    check-cast p0, Lcom/appsflyer/internal/AFd1vSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1cSDK;->unregisterClient()Z

    return-void

    :pswitch_1
    check-cast p0, Lcom/appsflyer/internal/AFc1bSDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->e(Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void

    :pswitch_2
    check-cast p0, Lcom/appsflyer/internal/AFb1gSDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFb1gSDK;->b(Lcom/appsflyer/internal/AFb1gSDK;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
