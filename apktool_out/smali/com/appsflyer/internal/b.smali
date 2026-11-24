.class public final synthetic Lcom/appsflyer/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/appsflyer/internal/AFa1tSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFa1tSDK;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcom/appsflyer/internal/b;->a:B

    iput-object p1, p0, Lcom/appsflyer/internal/b;->b:Lcom/appsflyer/internal/AFa1tSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/internal/b;->a:B

    iget-object p0, p0, Lcom/appsflyer/internal/b;->b:Lcom/appsflyer/internal/AFa1tSDK;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->a(Lcom/appsflyer/internal/AFa1tSDK;)V

    return-void

    :pswitch_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->c(Lcom/appsflyer/internal/AFa1tSDK;)V

    return-void

    :pswitch_1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->f(Lcom/appsflyer/internal/AFa1tSDK;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
