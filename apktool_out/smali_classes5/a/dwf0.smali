.class public final La/dwf0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dwf0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cge0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final O1:La/cge0;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public K1:La/jzi;

.field public final L1:La/kiu0;

.field public final M1:La/s0r;

.field public final N1:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dwf0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentResponsibleGamblingWebBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "url"

    .line 16
    .line 17
    const-string v5, "getUrl()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/dwf0;->P1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/cge0;

    .line 33
    .line 34
    const/16 v1, 0x8

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/cge0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/dwf0;->O1:La/cge0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02bd

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/tie0;

    .line 8
    .line 9
    const/16 v1, 0x19

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/tie0;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/lce0;

    .line 15
    .line 16
    invoke-direct {v2, p0, v1}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wez;->b:La/wez;

    .line 20
    .line 21
    new-instance v3, La/lce0;

    .line 22
    .line 23
    const/16 v4, 0x1a

    .line 24
    .line 25
    invoke-direct {v3, v2, v4}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-class v2, La/jwf0;

    .line 33
    .line 34
    sget-object v3, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, La/wbe0;

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/wbe0;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/wbe0;

    .line 46
    .line 47
    const/16 v5, 0x1b

    .line 48
    .line 49
    invoke-direct {v4, v1, v5}, La/wbe0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/dwf0;->L1:La/kiu0;

    .line 57
    .line 58
    sget-object v0, La/bwf0;->a:La/bwf0;

    .line 59
    .line 60
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/dwf0;->M1:La/s0r;

    .line 65
    .line 66
    new-instance v0, La/phf0;

    .line 67
    .line 68
    const-string v1, "URL"

    .line 69
    .line 70
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/dwf0;->N1:La/phf0;

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/dwf0;->G0()La/f4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/f4r;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    new-instance v0, La/jpe0;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p0, v1}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/dwf0;->G0()La/f4r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/f4r;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 21
    .line 22
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 72
    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/dwf0;->G0()La/f4r;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v1, v1, La/f4r;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 83
    .line 84
    invoke-virtual {p0}, La/dwf0;->G0()La/f4r;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iget-object v2, v2, La/f4r;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 89
    .line 90
    invoke-virtual {p0}, La/dwf0;->G0()La/f4r;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    iget-object p0, p0, La/f4r;->d:La/nq8;

    .line 95
    .line 96
    new-instance v3, La/cwf0;

    .line 97
    .line 98
    invoke-direct {v3, v2, v1, p0}, La/cwf0;-><init>(Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;Lorg/xplatform/uikit/components/lottie/LottieView;La/nq8;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const/4 v0, 0x0

    .line 109
    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 110
    .line 111
    .line 112
    :cond_0
    const/16 p0, 0x8

    .line 113
    .line 114
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final C0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/q2v0;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/q2v0;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/q2v0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/dwf0;->P1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/dwf0;->N1:La/phf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v4, v2, La/q2v0;->a:La/duj;

    .line 70
    .line 71
    iget-object v6, v2, La/q2v0;->b:La/sa10;

    .line 72
    .line 73
    iget-object v7, v2, La/q2v0;->c:La/m1e;

    .line 74
    .line 75
    iget-object v8, v2, La/q2v0;->d:La/mne;

    .line 76
    .line 77
    iget-object v9, v2, La/q2v0;->e:La/pyu;

    .line 78
    .line 79
    iget-object v10, v2, La/q2v0;->f:La/iqt;

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v3, La/rrd;

    .line 85
    .line 86
    invoke-direct/range {v3 .. v10}, La/rrd;-><init>(La/duj;Ljava/lang/String;La/sa10;La/m1e;La/mne;La/pyu;La/iqt;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v3, La/rrd;->i:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, La/n5d0;

    .line 92
    .line 93
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/jzi;

    .line 98
    .line 99
    iput-object v0, p0, La/dwf0;->K1:La/jzi;

    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 103
    .line 104
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/dwf0;->L1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/jwf0;

    .line 8
    .line 9
    iget-object v0, v0, La/jwf0;->h:La/p7m0;

    .line 10
    .line 11
    new-instance v1, La/tye0;

    .line 12
    .line 13
    const/16 v2, 0x9

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v4, La/w7f0;

    .line 34
    .line 35
    invoke-direct {v4, v0, p0, v1, v3}, La/w7f0;-><init>(La/gmq;La/clz;La/tye0;La/yje;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x3

    .line 39
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final G0()La/f4r;
    .locals 2

    .line 1
    sget-object v0, La/dwf0;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dwf0;->M1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/f4r;

    .line 16
    .line 17
    return-object p0
.end method
