.class public final synthetic Lcom/appsflyer/internal/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/appsflyer/internal/AFd1jSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFd1jSDK;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcom/appsflyer/internal/n;->a:B

    iput-object p1, p0, Lcom/appsflyer/internal/n;->b:Lcom/appsflyer/internal/AFd1jSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/internal/n;->a:B

    iget-object p0, p0, Lcom/appsflyer/internal/n;->b:Lcom/appsflyer/internal/AFd1jSDK;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lcom/appsflyer/internal/AFd1jSDK;->b(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1jSDK;->a(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
