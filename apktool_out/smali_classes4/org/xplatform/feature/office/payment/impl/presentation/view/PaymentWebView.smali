.class public final Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;
.super Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;
.source "SourceFile"


# static fields
.field public static final y:Ljava/util/List;


# instance fields
.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Ljava/lang/String;

.field public j:Z

.field public final k:Ljava/util/LinkedHashSet;

.field public l:I

.field public m:Lkotlin/jvm/functions/Function1;

.field public n:Lkotlin/jvm/functions/Function1;

.field public o:Lkotlin/jvm/functions/Function1;

.field public p:Lkotlin/jvm/functions/Function0;

.field public q:Lkotlin/jvm/functions/Function0;

.field public r:Lkotlin/jvm/functions/Function0;

.field public s:La/xdr;

.field public t:Lkotlin/jvm/functions/Function0;

.field public u:Lkotlin/jvm/functions/Function1;

.field public v:Lkotlin/jvm/functions/Function1;

.field public w:Lkotlin/jvm/functions/Function1;

.field public x:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x191

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x1f4

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x1f6

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x1f8

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    iput-object p1, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->i:Ljava/lang/String;

    .line 10
    .line 11
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->k:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 42
    .line 43
    .line 44
    const-string p2, "PAYMENT_REQUEST"

    .line 45
    .line 46
    invoke-static {p2}, La/z4v0;->a(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz p2, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object v2, La/z4v0;->d:La/sa3;

    .line 58
    .line 59
    invoke-virtual {v2}, La/ta3;->b()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    const/4 v2, 0x5

    .line 66
    :try_start_0
    sget-object v3, La/a5v0;->a:La/ilp0;

    .line 67
    .line 68
    new-instance v4, La/zlt0;

    .line 69
    .line 70
    const-class v5, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 71
    .line 72
    iget-object v3, v3, La/ilp0;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 75
    .line 76
    invoke-interface {v3, p2}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertSettings(Landroid/webkit/WebSettings;)Ljava/lang/reflect/InvocationHandler;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {v5, v3}, La/rq8;->G(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 85
    .line 86
    invoke-direct {v4, v3, v2}, La/zlt0;-><init>(Ljava/lang/Object;B)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move-exception v3

    .line 91
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    .line 93
    const/16 v5, 0x1e

    .line 94
    .line 95
    if-ne v4, v5, :cond_0

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    const-string v4, "android.webkit.WebSettingsWrapper"

    .line 106
    .line 107
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_0

    .line 112
    .line 113
    const-string p2, "WebSettingsCompat"

    .line 114
    .line 115
    const-string v4, "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info."

    .line 116
    .line 117
    invoke-static {p2, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    .line 119
    .line 120
    new-instance v4, La/d4v0;

    .line 121
    .line 122
    invoke-direct {v4, v1, v2}, La/zlt0;-><init>(Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    :goto_0
    invoke-virtual {v4}, La/zlt0;->o()V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_0
    throw v3

    .line 130
    :cond_1
    const-string p0, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 131
    .line 132
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v1

    .line 136
    :cond_2
    :goto_1
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 137
    .line 138
    .line 139
    const/4 p2, 0x2

    .line 140
    invoke-virtual {p1, p2, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 141
    .line 142
    .line 143
    new-instance p2, La/gb90;

    .line 144
    .line 145
    invoke-direct {p2, p0}, La/gb90;-><init>(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 149
    .line 150
    .line 151
    new-instance p2, La/hb90;

    .line 152
    .line 153
    invoke-direct {p2, p0}, La/hb90;-><init>(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, p2}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 157
    .line 158
    .line 159
    new-instance p0, La/eb90;

    .line 160
    .line 161
    const/4 p2, 0x0

    .line 162
    invoke-direct {p0, p1, p2}, La/eb90;-><init>(Landroid/webkit/WebView;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    return-void
.end method

.method private final getWindow()Landroid/view/Window;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x1020002

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast p0, Landroid/app/Activity;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public static final synthetic h(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)Landroid/view/Window;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, ""

    .line 18
    .line 19
    :cond_0
    iput-object v0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->i:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->k:Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput v0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->l:I

    .line 28
    .line 29
    const-string v1, "http"

    .line 30
    .line 31
    invoke-static {p1, v1, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    const-string v1, "mailto"

    .line 38
    .line 39
    invoke-static {p1, v1, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    const-string v1, "tel"

    .line 46
    .line 47
    invoke-static {p1, v1, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    const-string v0, "http://"

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_1
    invoke-super {p0, p1, p2}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    invoke-super {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->j:Z

    .line 6
    .line 7
    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x45f2b0e1

    .line 6
    .line 7
    .line 8
    if-eq v0, v1, :cond_4

    .line 9
    .line 10
    const p2, 0x60574456

    .line 11
    .line 12
    .line 13
    if-eq v0, p2, :cond_1

    .line 14
    .line 15
    const p2, 0x68649402

    .line 16
    .line 17
    .line 18
    if-eq v0, p2, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const-string p2, "net::ERR_INTERNET_DISCONNECTED"

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_5

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string p2, "net::ERR_PROXY_CONNECTION_FAILED"

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->t:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void

    .line 47
    :cond_4
    const-string v0, "net::ERR_UNKNOWN_URL_SCHEME"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_6

    .line 54
    .line 55
    :cond_5
    :goto_1
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_6
    const-string p1, "mailto"

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-static {p2, p1, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_7

    .line 67
    .line 68
    const-string p1, "tel"

    .line 69
    .line 70
    invoke-static {p2, p1, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_8

    .line 75
    .line 76
    :cond_7
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->w:Lkotlin/jvm/functions/Function1;

    .line 77
    .line 78
    if-eqz p0, :cond_8

    .line 79
    .line 80
    new-instance p1, Landroid/content/Intent;

    .line 81
    .line 82
    const-string v0, "android.intent.action.VIEW"

    .line 83
    .line 84
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-direct {p1, v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_8
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final j(La/jb90;)V
    .locals 3

    .line 1
    iget-object v0, p1, La/jb90;->a:La/ib90;

    .line 2
    .line 3
    sget-object v1, La/fb90;->a:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->l:I

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    if-ge v0, v1, :cond_1

    .line 18
    .line 19
    add-int/2addr v0, v2

    .line 20
    iput v0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->l:I

    .line 21
    .line 22
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->x:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object v1, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->k:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->x:Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/xdr;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->o:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iput-object p2, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->p:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    iput-object p3, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->q:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    iput-object p4, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->r:Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    iput-object p5, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->s:La/xdr;

    .line 16
    .line 17
    iput-object p6, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->t:Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    iput-object p7, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->u:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    iput-object p8, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->v:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    iput-object p9, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->w:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    return-void
.end method

.method public final l(Landroid/net/Uri;)Z
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const-string v1, ""

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    move-object v0, v1

    .line 14
    :cond_1
    iget-object v2, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->i:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-lez v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-lez v2, :cond_2

    .line 29
    .line 30
    iget-object v2, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->i:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    move v0, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v0, v4

    .line 41
    :goto_1
    iput-boolean v0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->h:Z

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-string v2, "/office/verification"

    .line 55
    .line 56
    invoke-static {v0, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    :try_start_0
    const-string v0, "type"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_13

    .line 69
    .line 70
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->u:Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    if-eqz p0, :cond_13

    .line 73
    .line 74
    sget-object v0, La/mbu0;->b:La/svs0;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const-string v0, "sumsub"

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    sget-object p1, La/mbu0;->h:La/mbu0;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    sget-object p1, La/mbu0;->c:La/mbu0;

    .line 91
    .line 92
    :goto_2
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    return v3

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    .line 99
    .line 100
    return v3

    .line 101
    :cond_5
    const-string v2, "sobflous://"

    .line 102
    .line 103
    invoke-static {v0, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    const-string v5, "android.intent.action.VIEW"

    .line 108
    .line 109
    if-nez v2, :cond_12

    .line 110
    .line 111
    const-string v2, "sberpay://"

    .line 112
    .line 113
    invoke-static {v0, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_12

    .line 118
    .line 119
    const-string v2, "https://kaspi.kz"

    .line 120
    .line 121
    invoke-static {v0, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    goto/16 :goto_7

    .line 128
    .line 129
    :cond_6
    const-string v2, ".pdf"

    .line 130
    .line 131
    invoke-static {v0, v2, v4}, Lkotlin/text/c;->n(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_7

    .line 136
    .line 137
    new-instance v0, Landroid/content/Intent;

    .line 138
    .line 139
    invoke-direct {v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v2, "https://docs.google.com/gview?embedded=true&url="

    .line 145
    .line 146
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 161
    .line 162
    .line 163
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->v:Lkotlin/jvm/functions/Function1;

    .line 164
    .line 165
    if-eqz p0, :cond_13

    .line 166
    .line 167
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    return v3

    .line 171
    :cond_7
    const-string v2, "mailto"

    .line 172
    .line 173
    invoke-static {v0, v2, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-nez v2, :cond_11

    .line 178
    .line 179
    const-string v2, "tel"

    .line 180
    .line 181
    invoke-static {v0, v2, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_8

    .line 186
    .line 187
    goto/16 :goto_6

    .line 188
    .line 189
    :cond_8
    const-string v2, "browserintent://"

    .line 190
    .line 191
    invoke-static {v0, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-eqz v6, :cond_9

    .line 196
    .line 197
    invoke-static {v0, v2, v1, v3}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    new-instance v0, Landroid/content/Intent;

    .line 202
    .line 203
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-direct {v0, v5, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 208
    .line 209
    .line 210
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->v:Lkotlin/jvm/functions/Function1;

    .line 211
    .line 212
    if-eqz p0, :cond_13

    .line 213
    .line 214
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    return v3

    .line 218
    :cond_9
    const-string v1, "intent://"

    .line 219
    .line 220
    invoke-static {v0, v1, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_a

    .line 225
    .line 226
    invoke-static {v0, v3}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->v:Lkotlin/jvm/functions/Function1;

    .line 231
    .line 232
    if-eqz p0, :cond_13

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    return v3

    .line 241
    :cond_a
    iget-object v1, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->o:Lkotlin/jvm/functions/Function1;

    .line 242
    .line 243
    if-eqz v1, :cond_b

    .line 244
    .line 245
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    check-cast v1, Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    goto :goto_3

    .line 256
    :cond_b
    move v1, v4

    .line 257
    :goto_3
    if-eqz v1, :cond_c

    .line 258
    .line 259
    goto/16 :goto_8

    .line 260
    .line 261
    :cond_c
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    const-string v6, "tg"

    .line 273
    .line 274
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-nez v2, :cond_10

    .line 279
    .line 280
    const-string v2, "https://telegram.dog"

    .line 281
    .line 282
    invoke-static {v1, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-nez v2, :cond_10

    .line 287
    .line 288
    const-string v2, "https://t.me"

    .line 289
    .line 290
    invoke-static {v1, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-nez v2, :cond_10

    .line 295
    .line 296
    const-string v2, "https://telegram.me"

    .line 297
    .line 298
    invoke-static {v1, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    if-nez v2, :cond_10

    .line 303
    .line 304
    const-string v2, "tg://"

    .line 305
    .line 306
    invoke-static {v1, v2, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-eqz v1, :cond_d

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_d
    const-string v1, "viber://"

    .line 314
    .line 315
    invoke-static {v0, v1, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_e

    .line 320
    .line 321
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->s:La/xdr;

    .line 322
    .line 323
    if-eqz p0, :cond_13

    .line 324
    .line 325
    const p1, 0x7f131318

    .line 326
    .line 327
    .line 328
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    const-string v1, "com.viber.voip&hl"

    .line 333
    .line 334
    invoke-interface {p0, p1, v1, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    return v3

    .line 338
    :cond_e
    const-string v1, "http"

    .line 339
    .line 340
    invoke-static {v0, v1, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_f

    .line 345
    .line 346
    new-instance v0, Landroid/content/Intent;

    .line 347
    .line 348
    invoke-direct {v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 352
    .line 353
    .line 354
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->v:Lkotlin/jvm/functions/Function1;

    .line 355
    .line 356
    if-eqz p0, :cond_13

    .line 357
    .line 358
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    return v3

    .line 362
    :cond_f
    :goto_4
    return v4

    .line 363
    :cond_10
    :goto_5
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->s:La/xdr;

    .line 364
    .line 365
    if-eqz p0, :cond_13

    .line 366
    .line 367
    const p1, 0x7f131316

    .line 368
    .line 369
    .line 370
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    const-string v1, "org.telegram.messenger"

    .line 375
    .line 376
    invoke-interface {p0, p1, v1, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    return v3

    .line 380
    :cond_11
    :goto_6
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->w:Lkotlin/jvm/functions/Function1;

    .line 381
    .line 382
    if-eqz p0, :cond_13

    .line 383
    .line 384
    new-instance v0, Landroid/content/Intent;

    .line 385
    .line 386
    invoke-direct {v0, v5, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    return v3

    .line 393
    :cond_12
    :goto_7
    new-instance v0, Landroid/content/Intent;

    .line 394
    .line 395
    invoke-direct {v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 399
    .line 400
    .line 401
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->v:Lkotlin/jvm/functions/Function1;

    .line 402
    .line 403
    if-eqz p0, :cond_13

    .line 404
    .line 405
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    :cond_13
    :goto_8
    return v3
.end method

.method public final setDownloadListener$impl(Landroid/webkit/DownloadListener;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setOnWebViewErrorListener$impl(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "La/jb90;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->x:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method
