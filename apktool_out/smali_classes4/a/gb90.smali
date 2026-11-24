.class public final La/gb90;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final synthetic d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;


# direct methods
.method public constructor <init>(La/fwp0;Landroid/widget/ProgressBar;Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/gb90;->a:B

    .line 3
    .line 4
    iput-object p1, p0, La/gb90;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/gb90;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 9
    .line 10
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/gb90;->a:B

    iput-object p1, p0, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 14
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public getDefaultVideoPoster()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gb90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->getDefaultVideoPoster()Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const/16 p0, 0x32

    .line 12
    .line 13
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    invoke-static {p0, p0, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCloseWindow(Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/gb90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onCloseWindow(Landroid/webkit/WebView;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 8

    .line 1
    iget-byte v0, p0, La/gb90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    sget-object v1, Landroid/webkit/ConsoleMessage$MessageLevel;->ERROR:Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 20
    .line 21
    if-ne v0, v1, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 24
    .line 25
    check-cast v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 26
    .line 27
    new-instance v1, La/jb90;

    .line 28
    .line 29
    sget-object v2, La/ib90;->e:La/ib90;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, ""

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    move-object v3, v4

    .line 40
    :cond_1
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    move-object v5, v4

    .line 47
    :cond_2
    const/4 v6, 0x0

    .line 48
    const/16 v7, 0x14

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct/range {v1 .. v7}, La/jb90;-><init>(La/ib90;Ljava/lang/String;ILjava/lang/String;ZI)V

    .line 52
    .line 53
    .line 54
    sget-object v2, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->j(La/jb90;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 3

    .line 1
    iget-byte v0, p0, La/gb90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p2, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-direct {p2, p3}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    iget-object p3, p0, La/gb90;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p3, La/fwp0;

    .line 35
    .line 36
    iget-object v0, p0, La/gb90;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroid/widget/ProgressBar;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, La/dwp0;

    .line 52
    .line 53
    invoke-direct {p0, p3, v0}, La/dwp0;-><init>(La/fwp0;Landroid/widget/ProgressBar;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p0}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 60
    .line 61
    const/4 p3, -0x1

    .line 62
    invoke-direct {p0, p3, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    if-eqz p4, :cond_0

    .line 72
    .line 73
    iget-object p0, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 p0, 0x0

    .line 77
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    check-cast p0, Landroid/webkit/WebView$WebViewTransport;

    .line 81
    .line 82
    invoke-virtual {p0, p2}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    const/4 v2, 0x0

    .line 90
    :goto_1
    return v2

    .line 91
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onHideCustomView()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/gb90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 11
    .line 12
    check-cast v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 13
    .line 14
    iget-object v1, p0, La/gb90;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/view/View;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-static {v0}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->h(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast v3, Landroid/widget/FrameLayout;

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->h(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)Landroid/view/Window;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v3, La/ani0;

    .line 42
    .line 43
    invoke-direct {v3, v1}, La/ani0;-><init>(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v4, 0x23

    .line 49
    .line 50
    if-lt v1, v4, :cond_0

    .line 51
    .line 52
    new-instance v1, La/bjv0;

    .line 53
    .line 54
    invoke-direct {v1, v0, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/16 v4, 0x1e

    .line 59
    .line 60
    if-lt v1, v4, :cond_1

    .line 61
    .line 62
    new-instance v1, La/ajv0;

    .line 63
    .line 64
    invoke-direct {v1, v0, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/16 v4, 0x1a

    .line 69
    .line 70
    if-lt v1, v4, :cond_2

    .line 71
    .line 72
    new-instance v1, La/ziv0;

    .line 73
    .line 74
    invoke-direct {v1, v0, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    new-instance v1, La/yiv0;

    .line 79
    .line 80
    invoke-direct {v1, v0, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    const/4 v0, 0x2

    .line 84
    invoke-virtual {v1, v0}, La/ycm0;->y(I)V

    .line 85
    .line 86
    .line 87
    const/16 v0, 0x207

    .line 88
    .line 89
    invoke-virtual {v1, v0}, La/ycm0;->y(I)V

    .line 90
    .line 91
    .line 92
    iput-object v2, p0, La/gb90;->b:Ljava/lang/Object;

    .line 93
    .line 94
    :cond_3
    iget-object v0, p0, La/gb90;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 101
    .line 102
    .line 103
    :cond_4
    iput-object v2, p0, La/gb90;->c:Ljava/lang/Object;

    .line 104
    .line 105
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/gb90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequest(Landroid/webkit/PermissionRequest;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 14
    .line 15
    check-cast p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 16
    .line 17
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->n:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/gb90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/gb90;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroid/view/View;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, La/gb90;->onHideCustomView()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/gb90;->b:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object p2, p0, La/gb90;->c:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object p2, p0, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 35
    .line 36
    check-cast p2, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 37
    .line 38
    invoke-static {p2}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->h(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)Landroid/view/Window;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast p2, Landroid/widget/FrameLayout;

    .line 50
    .line 51
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 52
    .line 53
    const/4 v1, -0x1

    .line 54
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, La/oh60;

    .line 61
    .line 62
    const/4 v1, 0x3

    .line 63
    invoke-direct {v0, p0, p1, v1}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 67
    .line 68
    .line 69
    :goto_0
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 1

    .line 1
    iget-byte v0, p0, La/gb90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 21
    .line 22
    check-cast p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 23
    .line 24
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->m:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
