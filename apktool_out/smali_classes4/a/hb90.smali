.class public final La/hb90;
.super La/tiq;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;


# direct methods
.method public constructor <init>(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final c(La/hb90;Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final d(La/hb90;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 2
    .line 3
    iget-boolean v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->j:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-boolean v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->g:Z

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-boolean v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->j:Z

    .line 18
    .line 19
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-boolean p0, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->f:Z

    .line 23
    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    iget-object p0, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->q:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_2
    iput-boolean v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->f:Z

    .line 34
    .line 35
    :cond_3
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->g:Z

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    iput-boolean v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->f:Z

    .line 8
    .line 9
    iget-object v2, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->k:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 12
    .line 13
    .line 14
    iput v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->l:I

    .line 15
    .line 16
    iget-object v0, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->o:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, p2

    .line 26
    :goto_0
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 9

    if-eqz p1, :cond_0

    .line 86
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 87
    :cond_0
    const-string v0, ""

    if-nez p3, :cond_1

    move-object v1, v0

    goto :goto_0

    :cond_1
    move-object v1, p3

    :goto_0
    if-nez p4, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, p4

    :goto_1
    new-instance v2, La/lc0;

    const/4 v3, 0x2

    move-object v5, p0

    move-object v6, p1

    move v4, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, La/lc0;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 88
    iget-object p0, v5, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    invoke-virtual {p0, v1, v0, v2}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->i(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 12

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_5

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 16
    .line 17
    iput-boolean v1, v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->g:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v2, v1

    .line 34
    :goto_0
    const-string v4, ""

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    move-object v9, v4

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object v9, v2

    .line 41
    :goto_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :cond_3
    if-nez v1, :cond_4

    .line 52
    .line 53
    move-object v7, v4

    .line 54
    goto :goto_2

    .line 55
    :cond_4
    move-object v7, v1

    .line 56
    :goto_2
    new-instance v5, La/jb90;

    .line 57
    .line 58
    sget-object v6, La/ib90;->c:La/ib90;

    .line 59
    .line 60
    const/4 v10, 0x0

    .line 61
    const/16 v11, 0x14

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v5 .. v11}, La/jb90;-><init>(La/ib90;Ljava/lang/String;ILjava/lang/String;ZI)V

    .line 65
    .line 66
    .line 67
    move-object v1, v7

    .line 68
    invoke-virtual {v0, v5}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->j(La/jb90;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, La/mr0;

    .line 72
    .line 73
    const/16 v7, 0x17

    .line 74
    .line 75
    move-object v3, p0

    .line 76
    move-object v4, p1

    .line 77
    move-object v5, p2

    .line 78
    move-object v6, p3

    .line 79
    invoke-direct/range {v2 .. v7}, La/mr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v9, v1, v2}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->i(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    move v4, p3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v4, v0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p3, 0x0

    .line 25
    :goto_1
    if-nez p3, :cond_2

    .line 26
    .line 27
    const-string p3, ""

    .line 28
    .line 29
    :cond_2
    sget-object v1, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 30
    .line 31
    iget-object p0, p0, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 32
    .line 33
    iget-object v1, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->i:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v8, 0x1

    .line 40
    if-lez v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-lez v1, :cond_3

    .line 47
    .line 48
    iget-object v1, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    if-nez p3, :cond_3

    .line 55
    .line 56
    move v0, v8

    .line 57
    :cond_3
    iput-boolean v0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->h:Z

    .line 58
    .line 59
    if-eqz p2, :cond_5

    .line 60
    .line 61
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-ne p3, v8, :cond_5

    .line 66
    .line 67
    sget-object p3, La/i2o;->k1:La/i2o;

    .line 68
    .line 69
    invoke-virtual {p3}, La/i2o;->getErrorCode()I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    if-lt v4, p3, :cond_5

    .line 74
    .line 75
    new-instance v1, La/jb90;

    .line 76
    .line 77
    iget-boolean p3, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->h:Z

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    sget-object p3, La/ib90;->d:La/ib90;

    .line 82
    .line 83
    :goto_2
    move-object v2, p3

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    sget-object p3, La/ib90;->f:La/ib90;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :goto_3
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    const/16 v7, 0x18

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    invoke-direct/range {v1 .. v7}, La/jb90;-><init>(La/ib90;Ljava/lang/String;ILjava/lang/String;ZI)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->j(La/jb90;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    iget-boolean p3, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->h:Z

    .line 110
    .line 111
    if-eqz p3, :cond_6

    .line 112
    .line 113
    sget-object p3, La/i2o;->k1:La/i2o;

    .line 114
    .line 115
    invoke-virtual {p3}, La/i2o;->getErrorCode()I

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    if-lt v4, p3, :cond_6

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    sget-object p3, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 123
    .line 124
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    if-eqz p3, :cond_7

    .line 133
    .line 134
    iget-object p3, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->p:Lkotlin/jvm/functions/Function0;

    .line 135
    .line 136
    if-eqz p3, :cond_7

    .line 137
    .line 138
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :cond_7
    if-eqz p2, :cond_9

    .line 142
    .line 143
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-ne p2, v8, :cond_9

    .line 148
    .line 149
    sget-object p2, La/i2o;->i1:La/i2o;

    .line 150
    .line 151
    invoke-virtual {p2}, La/i2o;->getErrorCode()I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-ne v4, p2, :cond_9

    .line 156
    .line 157
    if-eqz p1, :cond_8

    .line 158
    .line 159
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 160
    .line 161
    .line 162
    :cond_8
    iget-object p0, p0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->r:Lkotlin/jvm/functions/Function0;

    .line 163
    .line 164
    if-eqz p0, :cond_9

    .line 165
    .line 166
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    :cond_9
    :goto_4
    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 8

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 13
    .line 14
    invoke-virtual {p3}, Landroid/net/http/SslError;->getCertificate()Landroid/net/http/SslCertificate;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, La/tiq;->b(Landroid/net/http/SslCertificate;Landroid/content/Context;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 39
    .line 40
    new-instance v1, La/g0g0;

    .line 41
    .line 42
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v1

    .line 46
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    instance-of v2, v0, La/g0g0;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    move-object v0, v1

    .line 53
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    :goto_1
    move v6, v0

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    const/4 v0, 0x0

    .line 65
    goto :goto_1

    .line 66
    :goto_2
    new-instance v1, La/jb90;

    .line 67
    .line 68
    sget-object v2, La/ib90;->b:La/ib90;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    if-eqz p3, :cond_2

    .line 72
    .line 73
    invoke-virtual {p3}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    move-object v3, v0

    .line 79
    :goto_3
    if-nez v3, :cond_3

    .line 80
    .line 81
    const-string v3, ""

    .line 82
    .line 83
    :cond_3
    if-eqz p3, :cond_4

    .line 84
    .line 85
    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v5, "primaryError="

    .line 96
    .line 97
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const/4 v7, 0x4

    .line 108
    const/4 v4, 0x0

    .line 109
    invoke-direct/range {v1 .. v7}, La/jb90;-><init>(La/ib90;Ljava/lang/String;ILjava/lang/String;ZI)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 113
    .line 114
    iget-object v0, p0, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->j(La/jb90;)V

    .line 117
    .line 118
    .line 119
    invoke-super {p0, p1, p2, p3}, La/tiq;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    sget-object p2, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 10
    .line 11
    iget-object p0, p0, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->l(Landroid/net/Uri;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 0

    .line 18
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    sget-object p2, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->y:Ljava/util/List;

    .line 19
    iget-object p0, p0, La/hb90;->b:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    invoke-virtual {p0, p1}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->l(Landroid/net/Uri;)Z

    move-result p0

    return p0
.end method
