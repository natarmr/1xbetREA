.class public final La/lmg0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/lmg0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/eke0",
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
.field public static final Y1:La/eke0;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/z7z;

.field public N1:La/wdk0;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/zz2;

.field public final R1:La/phf0;

.field public final S1:La/zz2;

.field public final U1:La/cgx0;

.field public V1:Z

.field public W1:Z

.field public final X1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/lmg0;

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
    const-string v3, "titleRes"

    .line 16
    .line 17
    const-string v5, "getTitleRes()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "url"

    .line 25
    .line 26
    const-string v6, "getUrl()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "projectId"

    .line 34
    .line 35
    const-string v7, "getProjectId()I"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "showReload"

    .line 43
    .line 44
    const-string v8, "getShowReload()Z"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/lmg0;->Z1:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/eke0;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/lmg0;->Y1:La/eke0;

    .line 74
    .line 75
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
    iput-object v0, p0, La/lmg0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/hmg0;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, p0, v1}, La/hmg0;-><init>(La/lmg0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/yxf0;

    .line 18
    .line 19
    const/4 v2, 0x7

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
    const/16 v4, 0x8

    .line 28
    .line 29
    invoke-direct {v3, v1, v4}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-class v2, La/umg0;

    .line 37
    .line 38
    sget-object v3, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, La/fxf0;

    .line 45
    .line 46
    const/16 v4, 0xa

    .line 47
    .line 48
    invoke-direct {v3, v1, v4}, La/fxf0;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v4, La/fxf0;

    .line 52
    .line 53
    const/16 v5, 0xb

    .line 54
    .line 55
    invoke-direct {v4, v1, v5}, La/fxf0;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/lmg0;->O1:La/kiu0;

    .line 63
    .line 64
    sget-object v0, La/img0;->a:La/img0;

    .line 65
    .line 66
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/lmg0;->P1:La/s0r;

    .line 71
    .line 72
    new-instance v0, La/zz2;

    .line 73
    .line 74
    const-string v1, "EXTRA_TITLE_RES"

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/lmg0;->Q1:La/zz2;

    .line 81
    .line 82
    new-instance v0, La/phf0;

    .line 83
    .line 84
    const-string v1, "EXTRA_URL"

    .line 85
    .line 86
    const-string v3, ""

    .line 87
    .line 88
    invoke-direct {v0, v1, v3}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, La/lmg0;->R1:La/phf0;

    .line 92
    .line 93
    new-instance v0, La/zz2;

    .line 94
    .line 95
    const-string v1, "EXTRA_PROJECT_ID"

    .line 96
    .line 97
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, La/lmg0;->S1:La/zz2;

    .line 101
    .line 102
    new-instance v0, La/cgx0;

    .line 103
    .line 104
    const-string v1, "EXTRA_SHOW_RELOAD"

    .line 105
    .line 106
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, La/lmg0;->U1:La/cgx0;

    .line 110
    .line 111
    new-instance v0, La/hmg0;

    .line 112
    .line 113
    const/4 v1, 0x3

    .line 114
    invoke-direct {v0, p0, v1}, La/hmg0;-><init>(La/lmg0;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, La/lmg0;->X1:La/n0o0;

    .line 122
    .line 123
    return-void
.end method

.method public static H0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "http"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "mailto"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-string v0, "tel"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const-string v0, "http://"

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/p6r;->f:La/nq8;

    .line 6
    .line 7
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 8
    .line 9
    check-cast v0, Landroid/widget/ProgressBar;

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/p6r;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 31
    .line 32
    invoke-static {v0, v8}, La/knm0;->h(Landroid/view/View;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 40
    .line 41
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v9, 0x2

    .line 46
    const/4 v10, 0x1

    .line 47
    const/4 v11, 0x0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v10}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v9, v11}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 99
    .line 100
    .line 101
    :cond_0
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v2, v0, La/p6r;->f:La/nq8;

    .line 106
    .line 107
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v4, v0, La/p6r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 112
    .line 113
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v5, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 118
    .line 119
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v6, v0, La/p6r;->e:Landroid/widget/TextView;

    .line 124
    .line 125
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v7, v0, La/p6r;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 130
    .line 131
    invoke-virtual/range {p0 .. p0}, La/lmg0;->G0()La/p6r;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 136
    .line 137
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-eqz v3, :cond_1

    .line 142
    .line 143
    new-instance v0, La/jmg0;

    .line 144
    .line 145
    move-object/from16 v1, p0

    .line 146
    .line 147
    invoke-direct/range {v0 .. v7}, La/jmg0;-><init>(La/lmg0;La/nq8;La/siq;Lorg/xplatform/uikit/components/lottie/LottieView;Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 148
    .line 149
    .line 150
    move-object v2, v1

    .line 151
    invoke-virtual {v3, v0}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_1
    move-object/from16 v2, p0

    .line 156
    .line 157
    :goto_0
    invoke-virtual {v2}, La/lmg0;->G0()La/p6r;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v0, v0, La/p6r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 162
    .line 163
    sget-object v1, La/lmg0;->Z1:[La/iiy;

    .line 164
    .line 165
    aget-object v3, v1, v10

    .line 166
    .line 167
    iget-object v4, v2, La/lmg0;->Q1:La/zz2;

    .line 168
    .line 169
    invoke-virtual {v4, v2, v3}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    new-instance v3, La/hmg0;

    .line 188
    .line 189
    invoke-direct {v3, v2, v8}, La/hmg0;-><init>(La/lmg0;B)V

    .line 190
    .line 191
    .line 192
    invoke-static {v0, v3}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 193
    .line 194
    .line 195
    const/4 v3, 0x4

    .line 196
    aget-object v3, v1, v3

    .line 197
    .line 198
    iget-object v4, v2, La/lmg0;->U1:La/cgx0;

    .line 199
    .line 200
    invoke-virtual {v4, v2, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_2

    .line 209
    .line 210
    new-instance v12, La/hc50;

    .line 211
    .line 212
    sget-object v14, La/ybg0;->a:La/ybg0;

    .line 213
    .line 214
    new-instance v3, La/hmg0;

    .line 215
    .line 216
    invoke-direct {v3, v2, v10}, La/hmg0;-><init>(La/lmg0;B)V

    .line 217
    .line 218
    .line 219
    const/16 v17, 0x7f0

    .line 220
    .line 221
    const-string v13, "REFRESH_BUTTON"

    .line 222
    .line 223
    const v15, 0x7f080b1d

    .line 224
    .line 225
    .line 226
    move-object/from16 v16, v3

    .line 227
    .line 228
    invoke-direct/range {v12 .. v17}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 229
    .line 230
    .line 231
    filled-new-array {v12}, [La/hc50;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-static {v3}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 240
    .line 241
    .line 242
    :cond_2
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    const v4, 0x7f040b0b

    .line 247
    .line 248
    .line 249
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 258
    .line 259
    .line 260
    iget-object v0, v2, La/lmg0;->R1:La/phf0;

    .line 261
    .line 262
    aget-object v1, v1, v9

    .line 263
    .line 264
    invoke-virtual {v0, v2, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    sget-object v1, La/lun;->a:La/lun;

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, La/lmg0;->G0()La/p6r;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    iget-object v3, v3, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 278
    .line 279
    invoke-static {v0}, La/lmg0;->H0(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v3, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 284
    .line 285
    .line 286
    iget-object v8, v2, La/lmg0;->O1:La/kiu0;

    .line 287
    .line 288
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, La/umg0;

    .line 293
    .line 294
    iget-object v9, v0, La/umg0;->g:La/qoj0;

    .line 295
    .line 296
    new-instance v0, La/jjc0;

    .line 297
    .line 298
    const/4 v6, 0x4

    .line 299
    const/16 v7, 0x1a

    .line 300
    .line 301
    const/4 v1, 0x2

    .line 302
    const-class v3, La/lmg0;

    .line 303
    .line 304
    const-string v4, "handleLoadPageEvent"

    .line 305
    .line 306
    const-string v5, "handleLoadPageEvent(Lorg/xplatform/rules/impl/presentation/RulesOldWebViewModel$LoadPageEvent;)V"

    .line 307
    .line 308
    invoke-direct/range {v0 .. v7}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 309
    .line 310
    .line 311
    sget-object v1, La/lkz;->a:La/lkz;

    .line 312
    .line 313
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    new-instance v4, La/kmg0;

    .line 326
    .line 327
    invoke-direct {v4, v9, v1, v0, v11}, La/kmg0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;)V

    .line 328
    .line 329
    .line 330
    const/4 v9, 0x3

    .line 331
    invoke-static {v2, v11, v11, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, La/umg0;

    .line 339
    .line 340
    iget-object v10, v0, La/umg0;->h:La/ol60;

    .line 341
    .line 342
    new-instance v0, La/jjc0;

    .line 343
    .line 344
    const/16 v7, 0x1b

    .line 345
    .line 346
    const/4 v1, 0x2

    .line 347
    const-string v4, "handleViewAction"

    .line 348
    .line 349
    const-string v5, "handleViewAction(Lorg/xplatform/rules/impl/presentation/RulesOldWebViewModel$ViewAction;)V"

    .line 350
    .line 351
    move-object/from16 v2, p0

    .line 352
    .line 353
    invoke-direct/range {v0 .. v7}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 354
    .line 355
    .line 356
    move-object v1, v3

    .line 357
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    new-instance v2, La/kmg0;

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    move-object v5, v0

    .line 373
    move-object v3, v10

    .line 374
    move-object v6, v11

    .line 375
    invoke-direct/range {v2 .. v7}, La/kmg0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;B)V

    .line 376
    .line 377
    .line 378
    move-object v10, v6

    .line 379
    invoke-static {v12, v10, v10, v2, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    check-cast v0, La/umg0;

    .line 387
    .line 388
    iget-object v8, v0, La/umg0;->i:La/p7m0;

    .line 389
    .line 390
    new-instance v0, La/jjc0;

    .line 391
    .line 392
    const/4 v6, 0x4

    .line 393
    const/16 v7, 0x1c

    .line 394
    .line 395
    move-object v3, v1

    .line 396
    const/4 v1, 0x2

    .line 397
    const-string v4, "handleReloadState"

    .line 398
    .line 399
    const-string v5, "handleReloadState(Lorg/xplatform/rules/impl/presentation/RulesOldWebViewModel$ReloadState;)V"

    .line 400
    .line 401
    move-object/from16 v2, p0

    .line 402
    .line 403
    invoke-direct/range {v0 .. v7}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 404
    .line 405
    .line 406
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    new-instance v2, La/kmg0;

    .line 419
    .line 420
    const/4 v7, 0x0

    .line 421
    move-object v5, v0

    .line 422
    move-object v3, v8

    .line 423
    move-object v6, v10

    .line 424
    invoke-direct/range {v2 .. v7}, La/kmg0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;C)V

    .line 425
    .line 426
    .line 427
    invoke-static {v1, v6, v6, v2, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 428
    .line 429
    .line 430
    return-void
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/t790;

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
    instance-of v3, v0, La/t790;

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
    check-cast v2, La/t790;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    new-instance v0, Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;

    .line 56
    .line 57
    sget-object v1, La/lmg0;->Z1:[La/iiy;

    .line 58
    .line 59
    const/4 v3, 0x3

    .line 60
    aget-object v1, v1, v3

    .line 61
    .line 62
    iget-object v3, p0, La/lmg0;->S1:La/zz2;

    .line 63
    .line 64
    invoke-virtual {v3, p0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const-string v3, ""

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-direct {v0, v1, v4, v3, v4}, Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;-><init>(IILjava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, La/t790;->a(Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;)La/o3c;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, La/o3c;->y()La/fiu0;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, p0, La/lmg0;->L1:La/fiu0;

    .line 87
    .line 88
    iget-object v1, v0, La/o3c;->k:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, La/zix;

    .line 91
    .line 92
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iput-object v1, p0, La/lmg0;->M1:La/z7z;

    .line 97
    .line 98
    iget-object v0, v0, La/o3c;->g:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, La/wdk0;

    .line 101
    .line 102
    iput-object v0, p0, La/lmg0;->N1:La/wdk0;

    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 106
    .line 107
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final G0()La/p6r;
    .locals 2

    .line 1
    sget-object v0, La/lmg0;->Z1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/lmg0;->P1:La/s0r;

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

.method public final I0()V
    .locals 4

    .line 1
    iget-object p0, p0, La/lmg0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/umg0;

    .line 8
    .line 9
    iget-object p0, p0, La/umg0;->f:La/oeg0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, La/c8d;

    .line 20
    .line 21
    sget-object v2, La/y7d;->a:La/v7d;

    .line 22
    .line 23
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 24
    .line 25
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    move-object v1, v0

    .line 34
    check-cast v1, La/paw;

    .line 35
    .line 36
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/oe50;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lmg0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
