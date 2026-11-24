.class public final La/owc0;
.super La/tiq;
.source "SourceFile"


# instance fields
.field public final synthetic b:La/qwc0;


# direct methods
.method public constructor <init>(La/qwc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/owc0;->b:La/qwc0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/owc0;->b:La/qwc0;

    .line 5
    .line 6
    iget-boolean p2, p0, La/qwc0;->X1:Z

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const-string p2, "javascript:(function() {window.parent.addEventListener (\'message\', function(event) { Android.receiveMessage(JSON.stringify(event.data));});})()"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object p2, p0, La/qwc0;->S1:Ljava/lang/Integer;

    .line 19
    .line 20
    iget-boolean v0, p0, La/qwc0;->U1:Z

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    if-eqz p1, :cond_4

    .line 27
    .line 28
    if-nez p2, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iput-boolean v2, p0, La/qwc0;->U1:Z

    .line 32
    .line 33
    iput-object v1, p0, La/qwc0;->S1:Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-virtual {p1, v2, p2}, Landroid/view/View;->scrollTo(II)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, La/qwc0;->L0()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    new-instance v0, La/pva;

    .line 59
    .line 60
    const/4 v1, 0x3

    .line 61
    invoke-direct {v0, p1, p2, p0, v1}, La/pva;-><init>(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    :goto_0
    iput-boolean v2, p0, La/qwc0;->U1:Z

    .line 69
    .line 70
    iput-object v1, p0, La/qwc0;->S1:Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p0}, La/qwc0;->L0()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/owc0;->b:La/qwc0;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v2, v0, La/qwc0;->X1:Z

    .line 13
    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v2, v1

    .line 29
    :goto_0
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    move-object v2, v3

    .line 34
    :cond_2
    if-eqz p2, :cond_3

    .line 35
    .line 36
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_3
    if-nez v1, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    move-object v3, v1

    .line 50
    :goto_1
    sget-object v1, La/qwc0;->Z1:La/rl70;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const v4, 0x45f2b0e1

    .line 57
    .line 58
    .line 59
    if-eq v1, v4, :cond_8

    .line 60
    .line 61
    const v3, 0x60574456

    .line 62
    .line 63
    .line 64
    if-eq v1, v3, :cond_6

    .line 65
    .line 66
    const v3, 0x68649402

    .line 67
    .line 68
    .line 69
    if-eq v1, v3, :cond_5

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_5
    const-string v1, "net::ERR_INTERNET_DISCONNECTED"

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_9

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    const-string v1, "net::ERR_PROXY_CONNECTION_FAILED"

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_7

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_7
    :goto_2
    invoke-virtual {v0}, La/qwc0;->J0()La/k3t0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sget-object v1, La/zvc0;->a:La/zvc0;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_8
    const-string v1, "net::ERR_UNKNOWN_URL_SCHEME"

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    :cond_9
    :goto_3
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_a
    const-string v1, "mailto:"

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    invoke-static {v3, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_b

    .line 123
    .line 124
    const-string v1, "tel:"

    .line 125
    .line 126
    invoke-static {v3, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_c

    .line 131
    .line 132
    :cond_b
    invoke-virtual {v0}, La/qwc0;->J0()La/k3t0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v1, La/iwc0;

    .line 137
    .line 138
    invoke-direct {v1, v3}, La/iwc0;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_c
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 4

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
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-ne v2, v3, :cond_1

    .line 18
    .line 19
    move v0, v3

    .line 20
    :cond_1
    sget-object v2, La/qwc0;->Z1:La/rl70;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    const/16 v0, 0x191

    .line 25
    .line 26
    if-ne v1, v0, :cond_2

    .line 27
    .line 28
    iget-object p0, p0, La/owc0;->b:La/qwc0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/qwc0;->J0()La/k3t0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object p1, La/bwc0;->a:La/bwc0;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
