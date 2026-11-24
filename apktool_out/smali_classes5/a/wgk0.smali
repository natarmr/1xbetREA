.class public abstract La/wgk0;
.super La/by5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/by5<",
        "La/jjk0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wgk0;",
        "La/by5;",
        "La/jjk0;",
        "<init>",
        "()V",
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
.field public static final synthetic d2:[La/iiy;


# instance fields
.field public final b2:I

.field public final c2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/wgk0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/social/impl/databinding/SocialWebViewBinding;"

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
    sput-object v1, La/wgk0;->d2:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/by5;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f040ae1

    .line 5
    .line 6
    .line 7
    iput v0, p0, La/wgk0;->b2:I

    .line 8
    .line 9
    sget-object v0, La/vgk0;->a:La/vgk0;

    .line 10
    .line 11
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/wgk0;->c2:La/nae0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p0, La/sik;->M1:I

    .line 6
    .line 7
    new-instance v1, La/a630;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, p0, p1, v0, v2}, La/a630;-><init>(La/by5;La/kxq;IB)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public final bridge synthetic I0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/wgk0;->R0()La/jjk0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final J0()I
    .locals 0

    .line 1
    iget p0, p0, La/wgk0;->b2:I

    .line 2
    .line 3
    return p0
.end method

.method public K0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/wgk0;->R0()La/jjk0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/jjk0;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 6
    .line 7
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, v3}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/webkit/WebStorage;->deleteAllData()V

    .line 26
    .line 27
    .line 28
    new-instance v2, La/o0k0;

    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    invoke-direct {v2, v0, p0, v4}, La/o0k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->setDetaching(Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object v1, v0, La/jjk0;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 63
    .line 64
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const v2, 0x7f040b0b

    .line 71
    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-static {p0, v2, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-virtual {v1, p0}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(I)V

    .line 79
    .line 80
    .line 81
    iget-object p0, v0, La/jjk0;->b:Landroid/widget/ProgressBar;

    .line 82
    .line 83
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    const v1, 0x7f0606da

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    sget-object v1, La/b4d;->a:La/b4d;

    .line 105
    .line 106
    invoke-static {v0, p0}, La/vcc;->b0(Landroid/graphics/drawable/Drawable;I)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final O0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0ff0

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final P0()I
    .locals 0

    .line 1
    const p0, 0x7f080629

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final Q0()Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, La/jpe0;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final R0()La/jjk0;
    .locals 2

    .line 1
    sget-object v0, La/wgk0;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/wgk0;->c2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/jjk0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final S0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/wgk0;->R0()La/jjk0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/jjk0;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 6
    .line 7
    iget-object v0, v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a:La/siq;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, La/wgk0;->R0()La/jjk0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/jjk0;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 24
    .line 25
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a:La/siq;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Lkotlin/Pair;

    .line 38
    .line 39
    const-string v2, "CLOSE_SOCIAL"

    .line 40
    .line 41
    const-string v3, ""

    .line 42
    .line 43
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/sik;->y0()V

    .line 58
    .line 59
    .line 60
    return-void
.end method
