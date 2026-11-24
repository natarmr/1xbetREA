.class public final synthetic Lcom/appsflyer/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:[Lcom/appsflyer/sdk_base/logger/AFLoggerBase;


# direct methods
.method public synthetic constructor <init>([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcom/appsflyer/e;->a:B

    iput-object p1, p0, Lcom/appsflyer/e;->b:[Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/e;->a:B

    iget-object p0, p0, Lcom/appsflyer/e;->b:[Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lcom/appsflyer/AFLogger;->l([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void

    :pswitch_0
    invoke-static {p0}, Lcom/appsflyer/AFLogger;->m([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
