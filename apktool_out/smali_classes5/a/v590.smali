.class public final La/v590;
.super La/tiq;
.source "SourceFile"


# instance fields
.field public final synthetic b:La/w590;


# direct methods
.method public constructor <init>(La/w590;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v590;->b:La/w590;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 6

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    sget-object p2, La/w590;->Y1:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p0, p0, La/v590;->b:La/w590;

    .line 22
    .line 23
    invoke-virtual {p0}, La/w590;->I0()La/s690;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object p1, p0, La/s690;->B:La/bby;

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-ne p1, p2, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object p1, p0, La/s690;->k:La/mne;

    .line 44
    .line 45
    iget-object v3, p1, La/mne;->b:La/dvj;

    .line 46
    .line 47
    new-instance v1, La/x590;

    .line 48
    .line 49
    const/4 p1, 0x2

    .line 50
    invoke-direct {v1, p0, p1}, La/x590;-><init>(La/s690;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/q690;

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    invoke-direct {v4, p0, p1, p2}, La/q690;-><init>(La/s690;La/yje;B)V

    .line 57
    .line 58
    .line 59
    const/16 v5, 0xa

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, La/s690;->B:La/bby;

    .line 67
    .line 68
    :cond_2
    :goto_1
    return-void
.end method
