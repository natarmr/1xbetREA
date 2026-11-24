.class public final La/cbg0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/cbg0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/zie0",
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
.field public static final P1:La/zie0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/wdk0;

.field public M1:La/fiu0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/cbg0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/ui_core/databinding/FragmentWebBrowserBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/cbg0;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/zie0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/cbg0;->P1:La/zie0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0306

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/cbg0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/abg0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/abg0;-><init>(La/cbg0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/yxf0;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-direct {v1, p0, v2}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v3, La/yxf0;

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    invoke-direct {v3, v1, v4}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v2, La/pbg0;

    .line 36
    .line 37
    sget-object v3, La/sre0;->a:La/tre0;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, La/fxf0;

    .line 44
    .line 45
    const/4 v4, 0x6

    .line 46
    invoke-direct {v3, v1, v4}, La/fxf0;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    new-instance v4, La/fxf0;

    .line 50
    .line 51
    const/4 v5, 0x7

    .line 52
    invoke-direct {v4, v1, v5}, La/fxf0;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/cbg0;->N1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/bbg0;->a:La/bbg0;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/cbg0;->O1:La/s0r;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/cbg0;->G0()La/p6r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/p6r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    const v0, 0x7f131198

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/cbg0;->G0()La/p6r;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, La/p6r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 25
    .line 26
    new-instance v0, La/abg0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, v1}, La/abg0;-><init>(La/cbg0;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/cbg0;->G0()La/p6r;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p1, p1, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-static {p1, v0}, La/knm0;->h(Landroid/view/View;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/cbg0;->G0()La/p6r;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p0, p0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 50
    .line 51
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x2

    .line 103
    const/4 v0, 0x0

    .line 104
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    :cond_0
    return-void
.end method

.method public final C0()V
    .locals 10

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
    const-class v1, La/dbg0;

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
    instance-of v3, v0, La/dbg0;

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
    check-cast v2, La/dbg0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v1, v2, La/dbg0;->a:La/cad;

    .line 63
    .line 64
    iget-object v3, v2, La/dbg0;->b:La/j1q0;

    .line 65
    .line 66
    iget-object v4, v2, La/dbg0;->c:La/duj;

    .line 67
    .line 68
    iget-object v5, v2, La/dbg0;->d:La/sa10;

    .line 69
    .line 70
    iget-object v6, v2, La/dbg0;->e:La/knf0;

    .line 71
    .line 72
    iget-object v7, v2, La/dbg0;->f:La/btt0;

    .line 73
    .line 74
    iget-object v8, v2, La/dbg0;->g:La/gii0;

    .line 75
    .line 76
    iget-object v2, v2, La/dbg0;->h:La/wdk0;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v9, La/g45;

    .line 94
    .line 95
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v6, v9, La/g45;->a:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v8, v9, La/g45;->b:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v7, v9, La/g45;->c:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v1, v9, La/g45;->d:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v0, v9, La/g45;->e:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v3, v9, La/g45;->f:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v4, v9, La/g45;->g:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v5, v9, La/g45;->h:Ljava/lang/Object;

    .line 113
    .line 114
    new-instance v0, La/fri;

    .line 115
    .line 116
    const/16 v1, 0x10

    .line 117
    .line 118
    invoke-direct {v0, v9, v1}, La/fri;-><init>(Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    iput-object v0, v9, La/g45;->i:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v2, p0, La/cbg0;->L1:La/wdk0;

    .line 124
    .line 125
    new-instance v0, La/fiu0;

    .line 126
    .line 127
    iget-object v1, v9, La/g45;->i:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, La/fri;

    .line 130
    .line 131
    const-class v2, La/pbg0;

    .line 132
    .line 133
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, La/cbg0;->M1:La/fiu0;

    .line 141
    .line 142
    return-void

    .line 143
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 144
    .line 145
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    iget-object v0, p0, La/cbg0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/pbg0;

    .line 8
    .line 9
    iget-object v2, v0, La/pbg0;->h:La/ol60;

    .line 10
    .line 11
    new-instance v3, La/jjc0;

    .line 12
    .line 13
    const/4 v9, 0x4

    .line 14
    const/16 v10, 0x19

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    const-class v6, La/cbg0;

    .line 18
    .line 19
    const-string v7, "handleViewActions"

    .line 20
    .line 21
    const-string v8, "handleViewActions(Lorg/xplatform/reward_system/impl/presentation/RewardSystemViewModel$ViewAction;)V"

    .line 22
    .line 23
    move-object v5, p0

    .line 24
    invoke-direct/range {v3 .. v10}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 25
    .line 26
    .line 27
    sget-object p0, La/lkz;->a:La/lkz;

    .line 28
    .line 29
    invoke-static {v5}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, La/w7f0;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    move-object v4, v3

    .line 46
    move-object v3, p0

    .line 47
    invoke-direct/range {v1 .. v6}, La/w7f0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;S)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x3

    .line 51
    invoke-static {v0, v5, v5, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final G0()La/p6r;
    .locals 2

    .line 1
    sget-object v0, La/cbg0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/cbg0;->O1:La/s0r;

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
    check-cast p0, La/p6r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/cbg0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
