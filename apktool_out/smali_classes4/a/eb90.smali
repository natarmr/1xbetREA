.class public final synthetic La/eb90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/WebView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eb90;->a:B

    iput-object p1, p0, La/eb90;->b:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-byte p1, p0, La/eb90;->a:B

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x4

    .line 6
    iget-object p0, p0, La/eb90;->b:Landroid/webkit/WebView;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    if-ne p2, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    .line 20
    .line 21
    .line 22
    move p3, v0

    .line 23
    :cond_0
    return p3

    .line 24
    :pswitch_0
    check-cast p0, La/siq;

    .line 25
    .line 26
    sget-object p1, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 27
    .line 28
    if-ne p2, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    .line 37
    .line 38
    .line 39
    move p3, v0

    .line 40
    :cond_1
    return p3

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
