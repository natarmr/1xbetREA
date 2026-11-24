.class public final synthetic Lcom/appsflyer/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcom/appsflyer/internal/d;->a:B

    iput-object p1, p0, Lcom/appsflyer/internal/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/internal/d;->a:B

    iget-object p0, p0, Lcom/appsflyer/internal/d;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p0, Lcom/appsflyer/internal/AFf1uSDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFf1uSDK;->b(Lcom/appsflyer/internal/AFf1uSDK;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_0
    check-cast p0, Lcom/appsflyer/internal/AFc1bSDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFf1uSDK;->a(Lcom/appsflyer/internal/AFc1bSDK;)Lcom/appsflyer/share/AppsFlyerConversionListener;

    move-result-object p0

    return-object p0

    :pswitch_1
    check-cast p0, Lcom/appsflyer/internal/AFc1gSDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFc1gSDK;->a(Lcom/appsflyer/internal/AFc1gSDK;)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0

    :pswitch_2
    check-cast p0, Lcom/appsflyer/internal/AFa1tSDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->b(Lcom/appsflyer/internal/AFa1tSDK;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
