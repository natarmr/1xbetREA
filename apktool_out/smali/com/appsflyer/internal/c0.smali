.class public final synthetic Lcom/appsflyer/internal/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/appsflyer/internal/AFj1sSDK;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lcom/appsflyer/internal/c0;->a:B

    iput-object p1, p0, Lcom/appsflyer/internal/c0;->b:Lcom/appsflyer/internal/AFj1sSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/c0;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/internal/c0;->a:B

    iget-object v1, p0, Lcom/appsflyer/internal/c0;->c:Ljava/lang/String;

    iget-object p0, p0, Lcom/appsflyer/internal/c0;->b:Lcom/appsflyer/internal/AFj1sSDK;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFj1sSDK;->d(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :pswitch_0
    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFj1sSDK;->a(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFj1sSDK;->b(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
