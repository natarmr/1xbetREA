.class public final La/yax;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/yax;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/art",
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
.field public static final S1:La/art;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/cji;

.field public M1:La/z7z;

.field public N1:La/wdk0;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/n0o0;

.field public final R1:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/yax;

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
    sput-object v1, La/yax;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/art;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/yax;->S1:La/art;

    .line 38
    .line 39
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
    iput-object v0, p0, La/yax;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/vax;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/vax;-><init>(La/yax;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/aaw;

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    invoke-direct {v1, p0, v2}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v3, La/aaw;

    .line 26
    .line 27
    const/4 v4, 0x5

    .line 28
    invoke-direct {v3, v1, v4}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v2, La/ibx;

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
    new-instance v3, La/qwv;

    .line 44
    .line 45
    const/16 v4, 0x10

    .line 46
    .line 47
    invoke-direct {v3, v1, v4}, La/qwv;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/qwv;

    .line 51
    .line 52
    const/16 v5, 0x11

    .line 53
    .line 54
    invoke-direct {v4, v1, v5}, La/qwv;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/yax;->O1:La/kiu0;

    .line 62
    .line 63
    sget-object v0, La/wax;->a:La/wax;

    .line 64
    .line 65
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/yax;->P1:La/s0r;

    .line 70
    .line 71
    new-instance v0, La/vax;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-direct {v0, p0, v1}, La/vax;-><init>(La/yax;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/yax;->Q1:La/n0o0;

    .line 82
    .line 83
    new-instance v0, La/phf0;

    .line 84
    .line 85
    const-string v1, "URL"

    .line 86
    .line 87
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, La/yax;->R1:La/phf0;

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/yax;->G0()La/p6r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x2

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-virtual {p0}, La/yax;->G0()La/p6r;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p1, p1, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static {p1, v3}, La/knm0;->h(Landroid/view/View;Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/yax;->G0()La/p6r;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p1, p1, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 79
    .line 80
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    new-instance v4, La/xax;

    .line 87
    .line 88
    invoke-direct {v4, p0}, La/xax;-><init>(La/yax;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v4}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-virtual {p0}, La/yax;->G0()La/p6r;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object p1, p1, La/p6r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 99
    .line 100
    const v4, 0x7f130a47

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v4}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    new-instance v4, La/vax;

    .line 114
    .line 115
    invoke-direct {v4, p0, v0}, La/vax;-><init>(La/yax;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v4}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v2}, La/yax;->I0(Z)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, La/yax;->O1:La/kiu0;

    .line 125
    .line 126
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, La/ibx;

    .line 131
    .line 132
    iget-object v2, v0, La/ibx;->l:La/p7m0;

    .line 133
    .line 134
    new-instance v4, La/gbx;

    .line 135
    .line 136
    invoke-direct {v4, v0, v1, v3}, La/gbx;-><init>(La/ibx;La/yje;B)V

    .line 137
    .line 138
    .line 139
    new-instance v0, La/s6n0;

    .line 140
    .line 141
    invoke-direct {v0, v2, v4}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, La/kaw;

    .line 145
    .line 146
    const/16 v3, 0x8

    .line 147
    .line 148
    invoke-direct {v2, p0, v1, v3}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 149
    .line 150
    .line 151
    sget-object v3, La/lkz;->a:La/lkz;

    .line 152
    .line 153
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    new-instance v5, La/r1w;

    .line 166
    .line 167
    invoke-direct {v5, v0, v3, v2, v1}, La/r1w;-><init>(La/s6n0;La/clz;La/kaw;La/yje;)V

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x3

    .line 171
    invoke-static {v4, v1, v1, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, La/ibx;

    .line 179
    .line 180
    iget-object p1, p1, La/ibx;->m:La/ol60;

    .line 181
    .line 182
    new-instance v2, La/pfl;

    .line 183
    .line 184
    const/4 v8, 0x4

    .line 185
    const/16 v9, 0x19

    .line 186
    .line 187
    const/4 v3, 0x2

    .line 188
    const-class v5, La/yax;

    .line 189
    .line 190
    const-string v6, "handleViewAction"

    .line 191
    .line 192
    const-string v7, "handleViewAction(Lorg/xplatform/rules/impl/presentation/InfoWebViewModel$ViewAction;)V"

    .line 193
    .line 194
    move-object v4, p0

    .line 195
    invoke-direct/range {v2 .. v9}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 196
    .line 197
    .line 198
    invoke-static {v4}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    new-instance v4, La/r1w;

    .line 211
    .line 212
    invoke-direct {v4, p1, p0, v2, v1}, La/r1w;-><init>(La/gmq;La/clz;La/pfl;La/yje;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v3, v1, v1, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final C0()V
    .locals 12

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
    const-class v1, La/uax;

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
    instance-of v3, v0, La/uax;

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
    check-cast v2, La/uax;

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
    sget-object v1, La/yax;->U1:[La/iiy;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    aget-object v1, v1, v3

    .line 63
    .line 64
    iget-object v3, p0, La/yax;->R1:La/phf0;

    .line 65
    .line 66
    invoke-virtual {v3, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v0, v2, La/uax;->a:La/a6u;

    .line 77
    .line 78
    iget-object v3, v2, La/uax;->b:La/kt2;

    .line 79
    .line 80
    iget-object v4, v2, La/uax;->c:La/sa10;

    .line 81
    .line 82
    iget-object v5, v2, La/uax;->d:La/m1e;

    .line 83
    .line 84
    iget-object v6, v2, La/uax;->e:La/duj;

    .line 85
    .line 86
    iget-object v7, v2, La/uax;->f:La/j1q0;

    .line 87
    .line 88
    iget-object v8, v2, La/uax;->g:La/btt0;

    .line 89
    .line 90
    iget-object v9, v2, La/uax;->h:La/cad;

    .line 91
    .line 92
    iget-object v10, v2, La/uax;->i:La/wdk0;

    .line 93
    .line 94
    iget-object v11, v2, La/uax;->j:La/pyu;

    .line 95
    .line 96
    iget-object v2, v2, La/uax;->k:La/iqt;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v3, La/ru;

    .line 114
    .line 115
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v1, v3, La/ru;->a:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v11, v3, La/ru;->c:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v2, v3, La/ru;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v0, v3, La/ru;->e:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v5, v3, La/ru;->h:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v7, v3, La/ru;->f:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v6, v3, La/ru;->b:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v9, v3, La/ru;->g:Ljava/lang/Object;

    .line 133
    .line 134
    new-instance v0, La/tii;

    .line 135
    .line 136
    const/16 v1, 0x8

    .line 137
    .line 138
    invoke-direct {v0, v3, v1}, La/tii;-><init>(Ljava/lang/Object;B)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iput-object v0, v3, La/ru;->i:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-static {v4}, La/zix;->a(Ljava/lang/Object;)La/zix;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, v3, La/ru;->j:Ljava/lang/Object;

    .line 152
    .line 153
    iget-object v0, v3, La/ru;->i:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, La/n5d0;

    .line 156
    .line 157
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, La/cji;

    .line 162
    .line 163
    iput-object v0, p0, La/yax;->L1:La/cji;

    .line 164
    .line 165
    iget-object v0, v3, La/ru;->j:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, La/zix;

    .line 168
    .line 169
    invoke-static {v0}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iput-object v0, p0, La/yax;->M1:La/z7z;

    .line 174
    .line 175
    iput-object v10, p0, La/yax;->N1:La/wdk0;

    .line 176
    .line 177
    return-void

    .line 178
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 179
    .line 180
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public final G0()La/p6r;
    .locals 2

    .line 1
    sget-object v0, La/yax;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/yax;->P1:La/s0r;

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

.method public final H0(Landroid/content/Intent;)V
    .locals 9

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/yax;->N1:La/wdk0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v1, La/xdk0;

    .line 16
    .line 17
    sget-object v2, La/rek0;->b:La/rek0;

    .line 18
    .line 19
    const p1, 0x7f130a82

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const/16 v8, 0x7c

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 36
    .line 37
    .line 38
    const/16 v7, 0x3fc

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v2, p0

    .line 43
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string p0, "snackbarManager"

    .line 48
    .line 49
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    throw p0

    .line 54
    :cond_1
    :goto_0
    return-void
.end method

.method public final I0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/yax;->G0()La/p6r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/p6r;->f:La/nq8;

    .line 6
    .line 7
    iget-object p0, p0, La/nq8;->b:Landroid/view/View;

    .line 8
    .line 9
    check-cast p0, Landroid/widget/ProgressBar;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 p1, 0x8

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/yax;->G0()La/p6r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->Z()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/yax;->G0()La/p6r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->f()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/yax;->G0()La/p6r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 15
    .line 16
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getCurrentUrl()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, La/yax;->O1:La/kiu0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/ibx;

    .line 33
    .line 34
    iget-object v1, v0, La/ibx;->l:La/p7m0;

    .line 35
    .line 36
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, La/ebx;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-direct {v2, v3}, La/ebx;-><init>(Z)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v5, La/zax;

    .line 57
    .line 58
    invoke-direct {v5, v0, v3}, La/zax;-><init>(La/ibx;B)V

    .line 59
    .line 60
    .line 61
    new-instance v8, La/gkr;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    const/16 v2, 0x1c

    .line 65
    .line 66
    invoke-direct {v8, v0, v1, v2}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    const/16 v9, 0xe

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-super {p0}, La/yx5;->e0()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/yax;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
