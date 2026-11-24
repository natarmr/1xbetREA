.class public final synthetic Lcom/appsflyer/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lcom/appsflyer/c;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, Lcom/appsflyer/c;->a:B

    packed-switch p0, :pswitch_data_0

    invoke-static {}, Lcom/appsflyer/internal/AFj1eSDK;->a()Lcom/appsflyer/share/platform_extension/PluginInfo;

    move-result-object p0

    return-object p0

    :pswitch_0
    invoke-static {}, Lcom/appsflyer/internal/AFg1oSDK;->a()Ljava/text/SimpleDateFormat;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    return-object p0

    :pswitch_2
    invoke-static {}, Lcom/appsflyer/internal/AFc1aSDK;->f()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_3
    invoke-static {}, Lcom/appsflyer/AFLogger;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    return-object p0

    :pswitch_4
    invoke-static {}, Lcom/appsflyer/AFLogger;->f()Ljava/util/Set;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
