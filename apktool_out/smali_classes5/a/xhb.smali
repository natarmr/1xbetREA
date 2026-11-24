.class public final La/xhb;
.super La/tiq;
.source "SourceFile"


# instance fields
.field public final synthetic b:La/bib;


# direct methods
.method public constructor <init>(La/bib;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/xhb;->b:La/bib;

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
    iget-object p0, p0, La/xhb;->b:La/bib;

    .line 5
    .line 6
    iget-boolean p2, p0, La/bib;->V1:Z

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p2, p0, La/bib;->Q1:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-boolean v0, p0, La/bib;->R1:Z

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    if-nez p2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iput-boolean v2, p0, La/bib;->R1:Z

    .line 25
    .line 26
    iput-object v1, p0, La/bib;->Q1:Ljava/lang/Integer;

    .line 27
    .line 28
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p1, v2, p2}, Landroid/view/View;->scrollTo(II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, La/bib;->L0()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    new-instance v0, La/pva;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p1, p2, p0, v1}, La/pva;-><init>(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    :goto_0
    iput-boolean v2, p0, La/bib;->R1:Z

    .line 64
    .line 65
    iput-object v1, p0, La/bib;->Q1:Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p0}, La/bib;->L0()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/xhb;->b:La/bib;

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
    iput-boolean v2, v0, La/bib;->V1:Z

    .line 13
    .line 14
    :cond_0
    if-eqz p3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    :goto_0
    if-nez v1, :cond_2

    .line 29
    .line 30
    const-string v1, ""

    .line 31
    .line 32
    :cond_2
    sget-object v2, La/bib;->X1:La/bj5;

    .line 33
    .line 34
    const-string v2, "net::ERR_INTERNET_DISCONNECTED"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_4

    .line 41
    .line 42
    const-string v2, "net::ERR_PROXY_CONNECTION_FAILED"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_4
    :goto_1
    invoke-virtual {v0}, La/bib;->J0()La/k3t0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, La/ghb;->a:La/ghb;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 5

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
    const/4 v2, 0x1

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ne v3, v2, :cond_1

    .line 18
    .line 19
    move v0, v2

    .line 20
    :cond_1
    sget-object v3, La/bib;->X1:La/bj5;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    sget-object v0, La/bib;->Z1:Lkotlin/ranges/IntRange;

    .line 29
    .line 30
    iget v3, v0, Lkotlin/ranges/a;->a:I

    .line 31
    .line 32
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 33
    .line 34
    iget-object v4, p0, La/xhb;->b:La/bib;

    .line 35
    .line 36
    if-gt v1, v0, :cond_3

    .line 37
    .line 38
    if-gt v3, v1, :cond_3

    .line 39
    .line 40
    iput-boolean v2, v4, La/bib;->V1:Z

    .line 41
    .line 42
    invoke-virtual {v4}, La/bib;->J0()La/k3t0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object p1, La/ihb;->a:La/ihb;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    sget-object v0, La/bib;->a2:Lkotlin/ranges/IntRange;

    .line 53
    .line 54
    iget v3, v0, Lkotlin/ranges/a;->a:I

    .line 55
    .line 56
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 57
    .line 58
    if-gt v1, v0, :cond_4

    .line 59
    .line 60
    if-gt v3, v1, :cond_4

    .line 61
    .line 62
    iput-boolean v2, v4, La/bib;->V1:Z

    .line 63
    .line 64
    invoke-virtual {v4}, La/bib;->J0()La/k3t0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    sget-object p1, La/jhb;->a:La/jhb;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
