.class public final synthetic Lcom/appsflyer/internal/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/appsflyer/internal/AFj1vSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFj1vSDK;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcom/appsflyer/internal/e0;->a:B

    iput-object p1, p0, Lcom/appsflyer/internal/e0;->b:Lcom/appsflyer/internal/AFj1vSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/internal/e0;->a:B

    iget-object p0, p0, Lcom/appsflyer/internal/e0;->b:Lcom/appsflyer/internal/AFj1vSDK;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lcom/appsflyer/internal/AFj1vSDK;->c(Lcom/appsflyer/internal/AFj1vSDK;)V

    return-void

    :pswitch_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1vSDK;->a(Lcom/appsflyer/internal/AFj1vSDK;)V

    return-void

    :pswitch_1
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1vSDK;->b(Lcom/appsflyer/internal/AFj1vSDK;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
