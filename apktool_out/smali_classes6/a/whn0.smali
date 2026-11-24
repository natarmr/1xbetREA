.class public final La/whn0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/cg60;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/whn0;",
        "La/yx5;",
        "La/cg60;",
        "<init>",
        "()V",
        "a/s2m0",
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
.field public static final Y1:La/s2m0;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public K1:La/jvi;

.field public L1:La/kvi;

.field public M1:La/c8c;

.field public N1:La/ii;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public Q1:Landroid/webkit/ValueCallback;

.field public final R1:La/n0o0;

.field public final S1:La/n0o0;

.field public final U1:La/n0o0;

.field public final V1:La/rhn0;

.field public final W1:La/rhn0;

.field public final X1:La/vhn0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/whn0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/verification/sum_sub/impl/databinding/FragmentIframeSumSubBinding;"

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
    sput-object v1, La/whn0;->Z1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/s2m0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/whn0;->Y1:La/s2m0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d024d

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/phn0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/phn0;-><init>(La/whn0;B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/fyk0;

    .line 14
    .line 15
    const/16 v3, 0x12

    .line 16
    .line 17
    invoke-direct {v2, p0, v3}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v3, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v4, La/fyk0;

    .line 23
    .line 24
    const/16 v5, 0x13

    .line 25
    .line 26
    invoke-direct {v4, v2, v5}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-class v3, La/fin0;

    .line 34
    .line 35
    sget-object v4, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v4, La/cdl0;

    .line 42
    .line 43
    const/16 v5, 0xe

    .line 44
    .line 45
    invoke-direct {v4, v2, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v5, La/cdl0;

    .line 49
    .line 50
    const/16 v6, 0xf

    .line 51
    .line 52
    invoke-direct {v5, v2, v6}, La/cdl0;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/whn0;->O1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/shn0;->a:La/shn0;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/whn0;->P1:La/s0r;

    .line 68
    .line 69
    new-instance v0, La/phn0;

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    invoke-direct {v0, p0, v2}, La/phn0;-><init>(La/whn0;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/whn0;->R1:La/n0o0;

    .line 80
    .line 81
    new-instance v0, La/phn0;

    .line 82
    .line 83
    const/4 v2, 0x3

    .line 84
    invoke-direct {v0, p0, v2}, La/phn0;-><init>(La/whn0;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, La/whn0;->S1:La/n0o0;

    .line 92
    .line 93
    new-instance v0, La/phn0;

    .line 94
    .line 95
    const/4 v2, 0x4

    .line 96
    invoke-direct {v0, p0, v2}, La/phn0;-><init>(La/whn0;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, La/whn0;->U1:La/n0o0;

    .line 104
    .line 105
    new-instance v0, La/rhn0;

    .line 106
    .line 107
    invoke-direct {v0, p0, v1}, La/rhn0;-><init>(La/whn0;B)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, La/whn0;->V1:La/rhn0;

    .line 111
    .line 112
    new-instance v0, La/rhn0;

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    invoke-direct {v0, p0, v1}, La/rhn0;-><init>(La/whn0;B)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, La/whn0;->W1:La/rhn0;

    .line 119
    .line 120
    new-instance v0, La/vhn0;

    .line 121
    .line 122
    invoke-direct {v0, p0}, La/vhn0;-><init>(La/whn0;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, La/whn0;->X1:La/vhn0;

    .line 126
    .line 127
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const v2, 0x7f040ae1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v1, v2, v2, v0}, La/ofm0;->z(Landroid/view/Window;Landroid/content/Context;III)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, La/whn0;->H0()La/r0r;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, La/r0r;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 27
    .line 28
    new-instance v2, La/jpe0;

    .line 29
    .line 30
    const/16 v3, 0xb

    .line 31
    .line 32
    invoke-direct {v2, p0, v3}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/whn0;->H0()La/r0r;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p1, p1, La/r0r;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 43
    .line 44
    sget-object v2, La/ymx;->b:La/ymx;

    .line 45
    .line 46
    new-instance v2, La/j1l0;

    .line 47
    .line 48
    const/16 v3, 0x19

    .line 49
    .line 50
    invoke-direct {v2, p0, v3}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    new-instance v3, La/ejj;

    .line 54
    .line 55
    invoke-direct {v3, v2}, La/ejj;-><init>(La/j1l0;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(La/hwq0;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, La/whn0;->H0()La/r0r;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object p1, p1, La/r0r;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 66
    .line 67
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 v2, 0x1

    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 107
    .line 108
    .line 109
    :cond_1
    invoke-virtual {p0}, La/whn0;->H0()La/r0r;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object p1, p1, La/r0r;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 114
    .line 115
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-eqz p1, :cond_2

    .line 120
    .line 121
    iget-object v3, p0, La/whn0;->X1:La/vhn0;

    .line 122
    .line 123
    invoke-virtual {p1, v3}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 124
    .line 125
    .line 126
    :cond_2
    invoke-virtual {p0}, La/whn0;->H0()La/r0r;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object p1, p1, La/r0r;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 131
    .line 132
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const/4 v3, 0x3

    .line 137
    if-eqz p1, :cond_3

    .line 138
    .line 139
    new-instance v4, La/mzo;

    .line 140
    .line 141
    invoke-direct {v4, p0, v3}, La/mzo;-><init>(La/yx5;B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 145
    .line 146
    .line 147
    :cond_3
    invoke-virtual {p0}, La/whn0;->J0()La/fin0;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object p1, p1, La/fin0;->m:La/p7m0;

    .line 152
    .line 153
    new-instance v4, La/z2n0;

    .line 154
    .line 155
    invoke-direct {v4, p0, v1, v2}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 156
    .line 157
    .line 158
    sget-object v2, La/lkz;->a:La/lkz;

    .line 159
    .line 160
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    new-instance v6, La/agn0;

    .line 173
    .line 174
    invoke-direct {v6, p1, v2, v4, v1}, La/agn0;-><init>(La/gmq;La/clz;La/z2n0;La/yje;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v5, v1, v1, v6, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, La/whn0;->J0()La/fin0;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object p1, p1, La/fin0;->l:La/p7m0;

    .line 185
    .line 186
    invoke-static {p1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    new-instance v2, La/ssl0;

    .line 191
    .line 192
    invoke-direct {v2, p0, v1, v0}, La/ssl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 193
    .line 194
    .line 195
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    new-instance v5, La/agn0;

    .line 208
    .line 209
    invoke-direct {v5, p1, v0, v2, v1}, La/agn0;-><init>(La/xae0;La/clz;La/ssl0;La/yje;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v4, v1, v1, v5, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, La/whn0;->J0()La/fin0;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    const/4 p1, 0x0

    .line 220
    invoke-virtual {p0, p1}, La/fin0;->w(Z)V

    .line 221
    .line 222
    .line 223
    return-void
.end method

.method public final C0()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/ohn0;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/ohn0;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/ohn0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v5, v3, La/ohn0;->a:La/cad;

    .line 58
    .line 59
    iget-object v6, v3, La/ohn0;->b:La/duj;

    .line 60
    .line 61
    iget-object v1, v3, La/ohn0;->c:La/btt0;

    .line 62
    .line 63
    iget-object v2, v3, La/ohn0;->d:La/gii0;

    .line 64
    .line 65
    iget-object v7, v3, La/ohn0;->e:La/ilp0;

    .line 66
    .line 67
    iget-object v8, v3, La/ohn0;->f:La/sa10;

    .line 68
    .line 69
    iget-object v4, v3, La/ohn0;->g:La/knf0;

    .line 70
    .line 71
    iget-object v9, v3, La/ohn0;->h:La/ntu;

    .line 72
    .line 73
    iget-object v10, v3, La/ohn0;->i:La/n4u;

    .line 74
    .line 75
    iget-object v11, v3, La/ohn0;->j:La/wgu;

    .line 76
    .line 77
    iget-object v12, v3, La/ohn0;->k:La/iqt;

    .line 78
    .line 79
    iget-object v13, v3, La/ohn0;->l:La/hru;

    .line 80
    .line 81
    iget-object v14, v3, La/ohn0;->m:La/hse0;

    .line 82
    .line 83
    iget-object v15, v3, La/ohn0;->n:La/ii;

    .line 84
    .line 85
    move-object/from16 v16, v1

    .line 86
    .line 87
    iget-object v1, v3, La/ohn0;->o:La/zri;

    .line 88
    .line 89
    iget-object v3, v3, La/ohn0;->p:La/c8c;

    .line 90
    .line 91
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v4, La/qv2;

    .line 113
    .line 114
    move-object/from16 v16, v1

    .line 115
    .line 116
    move-object/from16 v17, v3

    .line 117
    .line 118
    invoke-direct/range {v4 .. v17}, La/qv2;-><init>(La/cad;La/duj;La/ilp0;La/sa10;La/ntu;La/n4u;La/wgu;La/iqt;La/hru;La/hse0;La/ii;La/zri;La/c8c;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v1, v17

    .line 122
    .line 123
    iget-object v2, v4, La/qv2;->m:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, La/n5d0;

    .line 126
    .line 127
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, La/jvi;

    .line 132
    .line 133
    iput-object v2, v0, La/whn0;->K1:La/jvi;

    .line 134
    .line 135
    iget-object v2, v4, La/qv2;->n:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v2, La/n5d0;

    .line 138
    .line 139
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, La/kvi;

    .line 144
    .line 145
    iput-object v2, v0, La/whn0;->L1:La/kvi;

    .line 146
    .line 147
    iput-object v1, v0, La/whn0;->M1:La/c8c;

    .line 148
    .line 149
    iput-object v15, v0, La/whn0;->N1:La/ii;

    .line 150
    .line 151
    return-void

    .line 152
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 153
    .line 154
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-void
.end method

.method public final G0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/whn0;->R1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qog0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, La/lz9;

    .line 12
    .line 13
    const/4 v2, 0x7

    .line 14
    invoke-direct {v1, v0, p0, v2}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, La/qog0;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final H0()La/r0r;
    .locals 2

    .line 1
    sget-object v0, La/whn0;->Z1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/whn0;->P1:La/s0r;

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
    check-cast p0, La/r0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/qm90;
    .locals 0

    .line 1
    iget-object p0, p0, La/whn0;->U1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qm90;

    .line 8
    .line 9
    return-object p0
.end method

.method public final J0()La/fin0;
    .locals 0

    .line 1
    iget-object p0, p0, La/whn0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fin0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final K0()V
    .locals 13

    .line 1
    iget-object v0, p0, La/whn0;->N1:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    const v2, 0x7f1303fb

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x7f130f39

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const v4, 0x7f130f34

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const v5, 0x7f13032f

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    sget-object v10, La/n12;->a:La/n12;

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/16 v12, 0x5d0

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const-string v7, "CAMERA_PERMISSION_DIALOG"

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "actionDialogManager"

    .line 63
    .line 64
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0
.end method

.method public final L0(Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/whn0;->M1:La/c8c;

    .line 6
    .line 7
    const-string v3, "checkSystemPermissionAccessProvider"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v2, :cond_5

    .line 11
    .line 12
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v6, 0x1e

    .line 15
    .line 16
    const/4 v7, 0x1

    .line 17
    if-ge v5, v6, :cond_2

    .line 18
    .line 19
    const-string v5, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 20
    .line 21
    iget-object v2, v2, La/c8c;->a:La/us00;

    .line 22
    .line 23
    invoke-virtual {v2, v5}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v2, v0, La/whn0;->N1:La/ii;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 35
    .line 36
    const v3, 0x7f1303fb

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    const v3, 0x7f130f3d

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    const v3, 0x7f130f34

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const v3, 0x7f13032f

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    sget-object v17, La/n12;->a:La/n12;

    .line 68
    .line 69
    const/16 v18, 0x0

    .line 70
    .line 71
    const/16 v19, 0x5d0

    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    const-string v14, "PERMISSION_DIALOG"

    .line 75
    .line 76
    const/4 v15, 0x0

    .line 77
    const/16 v16, 0x0

    .line 78
    .line 79
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v8, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 90
    .line 91
    .line 92
    new-instance v2, La/qhn0;

    .line 93
    .line 94
    invoke-direct {v2, v1, v0, v7}, La/qhn0;-><init>(ZLa/whn0;B)V

    .line 95
    .line 96
    .line 97
    const-string v1, "PERMISSION_DIALOG"

    .line 98
    .line 99
    invoke-static {v0, v1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 100
    .line 101
    .line 102
    new-instance v2, La/phn0;

    .line 103
    .line 104
    const/4 v3, 0x5

    .line 105
    invoke-direct {v2, v0, v3}, La/phn0;-><init>(La/whn0;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v1, v2}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_1
    const-string v0, "actionDialogManager"

    .line 113
    .line 114
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v4

    .line 118
    :cond_2
    :goto_0
    iget-object v2, v0, La/whn0;->M1:La/c8c;

    .line 119
    .line 120
    if-eqz v2, :cond_4

    .line 121
    .line 122
    const-string v3, "android.permission.CAMERA"

    .line 123
    .line 124
    iget-object v2, v2, La/c8c;->a:La/us00;

    .line 125
    .line 126
    invoke-virtual {v2, v3}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_3

    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    invoke-virtual {v0}, La/whn0;->K0()V

    .line 134
    .line 135
    .line 136
    new-instance v2, La/qhn0;

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    invoke-direct {v2, v1, v0, v3}, La/qhn0;-><init>(ZLa/whn0;B)V

    .line 140
    .line 141
    .line 142
    const-string v1, "CAMERA_PERMISSION_DIALOG"

    .line 143
    .line 144
    invoke-static {v0, v1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 145
    .line 146
    .line 147
    new-instance v2, La/phn0;

    .line 148
    .line 149
    invoke-direct {v2, v0, v7}, La/phn0;-><init>(La/whn0;B)V

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v1, v2}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v4

    .line 160
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v4
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x21

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, La/r6e;->w(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "BUNDLE_EXTRA_CONTAINER"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of v0, p1, La/pm90;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    :cond_1
    check-cast p1, La/pm90;

    .line 29
    .line 30
    :goto_0
    check-cast p1, La/pm90;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, La/whn0;->I0()La/qm90;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/qm90;->g:La/pm90;

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, La/whn0;->I0()La/qm90;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, La/whn0;->V1:La/rhn0;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, La/whn0;->W1:La/rhn0;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iput-object v0, p1, La/qm90;->c:Lkotlin/jvm/functions/Function2;

    .line 61
    .line 62
    iput-object v1, p1, La/qm90;->d:Lkotlin/jvm/functions/Function2;

    .line 63
    .line 64
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 65
    .line 66
    invoke-virtual {p0}, La/whn0;->I0()La/qm90;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p1, p0}, La/glz;->a(La/blz;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/whn0;->H0()La/r0r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/r0r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->e0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/whn0;->I0()La/qm90;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/qm90;->g:La/pm90;

    .line 6
    .line 7
    const-string v0, "BUNDLE_EXTRA_CONTAINER"

    .line 8
    .line 9
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/whn0;->H0()La/r0r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/r0r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void
.end method

.method public final j()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, La/whn0;->J0()La/fin0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/fin0;->b:La/i1w0;

    .line 6
    .line 7
    new-instance v1, La/xhn0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, La/xhn0;-><init>(La/fin0;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return v2
.end method
