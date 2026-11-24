.class public final synthetic Lcom/appsflyer/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lcom/appsflyer/internal/a;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, Lcom/appsflyer/internal/a;->a:B

    packed-switch p0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/appsflyer/internal/AFc1aSDK;->g(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_0
    invoke-static {p1}, Lcom/appsflyer/internal/AFa1mSDK;->k(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-static {p1}, Lcom/appsflyer/internal/AFa1mSDK;->j(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_2
    invoke-static {p1}, Lcom/appsflyer/internal/AFa1mSDK;->f(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_3
    invoke-static {p1}, Lcom/appsflyer/internal/AFa1mSDK;->a(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_4
    invoke-static {p1}, Lcom/appsflyer/internal/AFa1mSDK;->b(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_5
    invoke-static {p1}, Lcom/appsflyer/internal/AFa1mSDK;->e(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
