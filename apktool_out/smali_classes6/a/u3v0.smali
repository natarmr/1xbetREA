.class public final La/u3v0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/u3v0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kys0",
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
.field public static final P1:La/kys0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/lzi;

.field public final L1:La/kiu0;

.field public final M1:La/s0r;

.field public final N1:La/zz2;

.field public final O1:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/u3v0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/web_rules/impl/databinding/WebRulesFragmentBinding;"

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
    const-string v3, "titleResId"

    .line 16
    .line 17
    const-string v5, "getTitleResId()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "endPoint"

    .line 25
    .line 26
    const-string v6, "getEndPoint()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/u3v0;->Q1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/kys0;

    .line 45
    .line 46
    const/16 v1, 0xc

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/u3v0;->P1:La/kys0;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d06e0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/rbt0;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/cvs0;

    .line 15
    .line 16
    const/16 v2, 0x19

    .line 17
    .line 18
    invoke-direct {v1, p0, v2}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v3, La/cvs0;

    .line 24
    .line 25
    const/16 v4, 0x1a

    .line 26
    .line 27
    invoke-direct {v3, v1, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-class v2, La/c4v0;

    .line 35
    .line 36
    sget-object v3, La/sre0;->a:La/tre0;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v3, La/w6u0;

    .line 43
    .line 44
    const/16 v4, 0x12

    .line 45
    .line 46
    invoke-direct {v3, v1, v4}, La/w6u0;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    new-instance v4, La/w6u0;

    .line 50
    .line 51
    const/16 v5, 0x13

    .line 52
    .line 53
    invoke-direct {v4, v1, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/u3v0;->L1:La/kiu0;

    .line 61
    .line 62
    sget-object v0, La/s3v0;->a:La/s3v0;

    .line 63
    .line 64
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/u3v0;->M1:La/s0r;

    .line 69
    .line 70
    new-instance v0, La/zz2;

    .line 71
    .line 72
    const-string v1, "TITLE_RES"

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, La/u3v0;->N1:La/zz2;

    .line 79
    .line 80
    new-instance v0, La/phf0;

    .line 81
    .line 82
    const-string v1, "END_POINT"

    .line 83
    .line 84
    const-string v2, ""

    .line 85
    .line 86
    invoke-direct {v0, v1, v2}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, La/u3v0;->O1:La/phf0;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/v3v0;->f:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x2

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
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

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
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p1, p1, La/v3v0;->f:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 59
    .line 60
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    new-instance v3, La/t3v0;

    .line 67
    .line 68
    invoke-direct {v3, p0}, La/t3v0;-><init>(La/u3v0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v3}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p1, p1, La/v3v0;->f:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 79
    .line 80
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    new-instance v3, La/mzo;

    .line 87
    .line 88
    const/4 v4, 0x4

    .line 89
    invoke-direct {v3, p0, v4}, La/mzo;-><init>(La/yx5;B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget-object p1, p1, La/v3v0;->d:Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    sget-object v4, La/u3v0;->Q1:[La/iiy;

    .line 106
    .line 107
    aget-object v5, v4, v2

    .line 108
    .line 109
    iget-object v6, p0, La/u3v0;->N1:La/zz2;

    .line 110
    .line 111
    invoke-virtual {v6, p0, v5}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object p1, p1, La/v3v0;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 131
    .line 132
    const v3, 0x7f080629

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object p1, p1, La/v3v0;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 143
    .line 144
    new-instance v3, La/jpe0;

    .line 145
    .line 146
    const/16 v5, 0x13

    .line 147
    .line 148
    invoke-direct {v3, p0, v5}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    iget-object p1, p1, La/v3v0;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 159
    .line 160
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    iget-object v3, v3, La/v3v0;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 169
    .line 170
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const v5, 0x7f040b0b

    .line 178
    .line 179
    .line 180
    invoke-static {p1, v3, v5}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, La/u3v0;->G0()La/v3v0;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget-object p1, p1, La/v3v0;->e:Landroid/widget/ProgressBar;

    .line 188
    .line 189
    const/4 v3, 0x0

    .line 190
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, La/u3v0;->H0()La/c4v0;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget-object v3, p0, La/u3v0;->O1:La/phf0;

    .line 198
    .line 199
    aget-object v1, v4, v1

    .line 200
    .line 201
    invoke-virtual {v3, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iput-object p0, p1, La/c4v0;->i:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    new-instance v4, La/x3v0;

    .line 215
    .line 216
    invoke-direct {v4, p1, v2}, La/x3v0;-><init>(La/c4v0;B)V

    .line 217
    .line 218
    .line 219
    new-instance v7, La/n7t0;

    .line 220
    .line 221
    const/16 p0, 0xd

    .line 222
    .line 223
    invoke-direct {v7, p1, v0, p0}, La/n7t0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 224
    .line 225
    .line 226
    const/16 v8, 0xe

    .line 227
    .line 228
    const/4 v5, 0x0

    .line 229
    const/4 v6, 0x0

    .line 230
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 231
    .line 232
    .line 233
    return-void
.end method

.method public final C0()V
    .locals 9

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
    const-class v1, La/w3v0;

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
    instance-of v3, v0, La/w3v0;

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
    check-cast v2, La/w3v0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/w3v0;->a:La/gii0;

    .line 56
    .line 57
    iget-object v1, v2, La/w3v0;->b:La/fsd;

    .line 58
    .line 59
    iget-object v4, v2, La/w3v0;->c:La/j1q0;

    .line 60
    .line 61
    iget-object v5, v2, La/w3v0;->d:La/sa10;

    .line 62
    .line 63
    iget-object v6, v2, La/w3v0;->e:La/mne;

    .line 64
    .line 65
    iget-object v7, v2, La/w3v0;->f:La/a6u;

    .line 66
    .line 67
    iget-object v8, v2, La/w3v0;->g:La/duj;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v3, La/uii;

    .line 79
    .line 80
    invoke-direct/range {v3 .. v8}, La/uii;-><init>(La/j1q0;La/sa10;La/mne;La/a6u;La/duj;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v3, La/uii;->f:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, La/n5d0;

    .line 86
    .line 87
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/lzi;

    .line 92
    .line 93
    iput-object v0, p0, La/u3v0;->K1:La/lzi;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 97
    .line 98
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final D0()V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, La/u3v0;->H0()La/c4v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/c4v0;->g:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/rtq0;

    .line 12
    .line 13
    const/16 v2, 0x1b

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    move-object/from16 v10, p0

    .line 17
    .line 18
    invoke-direct {v1, v10, v7, v2}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/lkz;->a:La/lkz;

    .line 22
    .line 23
    invoke-static {v10}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    new-instance v4, La/npu0;

    .line 36
    .line 37
    invoke-direct {v4, v0, v2, v1, v7}, La/npu0;-><init>(La/xae0;La/clz;La/rtq0;La/yje;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v10}, La/u3v0;->H0()La/c4v0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v4, v1, La/c4v0;->h:La/ol60;

    .line 49
    .line 50
    new-instance v6, La/k5r0;

    .line 51
    .line 52
    const/4 v14, 0x4

    .line 53
    const/16 v15, 0x15

    .line 54
    .line 55
    const/4 v9, 0x2

    .line 56
    const-class v11, La/u3v0;

    .line 57
    .line 58
    const-string v12, "handleViewAction"

    .line 59
    .line 60
    const-string v13, "handleViewAction(Lorg/xplatform/web_rules/impl/presentation/WebRulesViewModel$ViewAction;)V"

    .line 61
    .line 62
    move-object v8, v6

    .line 63
    invoke-direct/range {v8 .. v15}, La/k5r0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 64
    .line 65
    .line 66
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v3, La/npu0;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    invoke-direct/range {v3 .. v8}, La/npu0;-><init>(La/gmq;La/clz;La/k5r0;La/yje;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final G0()La/v3v0;
    .locals 2

    .line 1
    sget-object v0, La/u3v0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/u3v0;->M1:La/s0r;

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
    check-cast p0, La/v3v0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/c4v0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u3v0;->L1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/c4v0;

    .line 8
    .line 9
    return-object p0
.end method
