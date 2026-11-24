.class public final synthetic Lcom/appsflyer/internal/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/appsflyer/internal/AFi1aSDK;

.field public final synthetic c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lcom/appsflyer/internal/w;->a:B

    iput-object p1, p0, Lcom/appsflyer/internal/w;->b:Lcom/appsflyer/internal/AFi1aSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/w;->c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/internal/w;->a:B

    iget-object v1, p0, Lcom/appsflyer/internal/w;->c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    iget-object p0, p0, Lcom/appsflyer/internal/w;->b:Lcom/appsflyer/internal/AFi1aSDK;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFi1aSDK;->e(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-void

    :pswitch_0
    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFi1aSDK;->d(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
