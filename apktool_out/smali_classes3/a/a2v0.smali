.class public final La/a2v0;
.super La/by5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/by5<",
        "La/tjk;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/a2v0;",
        "La/by5;",
        "La/tjk;",
        "<init>",
        "()V",
        "a/svs0",
        "captcha"
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
.field public static final g2:La/svs0;

.field public static final synthetic h2:[La/iiy;


# instance fields
.field public final b2:La/yzn0;

.field public final c2:La/a8z;

.field public final d2:La/kiu0;

.field public final e2:La/nae0;

.field public final f2:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/a2v0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/captcha/impl/presentation/fragments/webcaptcha/redesign/model/WebCaptchaDialogDesignSystemParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/captcha/databinding/DialogWebCaptchaDesignSystemBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/a2v0;->h2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/svs0;

    .line 33
    .line 34
    const/16 v1, 0xc

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/svs0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/a2v0;->g2:La/svs0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/by5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yzn0;

    .line 5
    .line 6
    const-string v1, "KEY_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/a2v0;->b2:La/yzn0;

    .line 12
    .line 13
    new-instance v0, La/y1v0;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p0, v1}, La/y1v0;-><init>(La/a2v0;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wez;->b:La/wez;

    .line 20
    .line 21
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/a2v0;->c2:La/a8z;

    .line 26
    .line 27
    new-instance v0, La/y1v0;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v0, p0, v2}, La/y1v0;-><init>(La/a2v0;B)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La/cvs0;

    .line 34
    .line 35
    const/16 v3, 0x17

    .line 36
    .line 37
    invoke-direct {v2, p0, v3}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    new-instance v3, La/cvs0;

    .line 41
    .line 42
    const/16 v4, 0x18

    .line 43
    .line 44
    invoke-direct {v3, v2, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-class v2, La/h2v0;

    .line 52
    .line 53
    sget-object v3, La/sre0;->a:La/tre0;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, La/w6u0;

    .line 60
    .line 61
    const/16 v4, 0x10

    .line 62
    .line 63
    invoke-direct {v3, v1, v4}, La/w6u0;-><init>(La/a8z;B)V

    .line 64
    .line 65
    .line 66
    new-instance v4, La/w6u0;

    .line 67
    .line 68
    const/16 v5, 0x11

    .line 69
    .line 70
    invoke-direct {v4, v1, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/a2v0;->d2:La/kiu0;

    .line 78
    .line 79
    sget-object v0, La/z1v0;->a:La/z1v0;

    .line 80
    .line 81
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/a2v0;->e2:La/nae0;

    .line 86
    .line 87
    const v0, 0x7f040ae3

    .line 88
    .line 89
    .line 90
    iput v0, p0, La/a2v0;->f2:I

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final A0()Landroid/app/Dialog;
    .locals 1

    .line 1
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p0, La/sik;->M1:I

    .line 6
    .line 7
    new-instance v1, La/v1v0;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p0, p1, v0, v2}, La/v1v0;-><init>(La/by5;Landroid/content/Context;IB)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public final bridge synthetic I0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/a2v0;->R0()La/tjk;

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
    iget p0, p0, La/a2v0;->f2:I

    .line 2
    .line 3
    return p0
.end method

.method public final K0()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/a2v0;->R0()La/tjk;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La/tjk;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 8
    .line 9
    new-instance v2, La/y1v0;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, v0, v3}, La/y1v0;-><init>(La/a2v0;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 23
    .line 24
    const v2, 0x7f040ae3

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {v0}, La/sik;->D0()Landroid/app/Dialog;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    .line 42
    .line 43
    invoke-direct {v6, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v6}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    const/4 v4, 0x4

    .line 50
    invoke-static {v5, v2, v1, v4}, La/ofm0;->x(Landroid/view/Window;ILandroid/content/Context;I)V

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {v0}, La/a2v0;->R0()La/tjk;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v1, v1, La/tjk;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 58
    .line 59
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v8, 0x0

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/4 v4, 0x1

    .line 71
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v4, 0x2

    .line 86
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v4, v8}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-virtual {v0}, La/a2v0;->R0()La/tjk;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v1, v1, La/tjk;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 100
    .line 101
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    new-instance v2, La/hdy;

    .line 108
    .line 109
    new-instance v3, La/npt0;

    .line 110
    .line 111
    const/16 v4, 0x17

    .line 112
    .line 113
    invoke-direct {v3, v0, v4}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v2, v3}, La/hdy;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 117
    .line 118
    .line 119
    const-string v3, "MobileAppApi"

    .line 120
    .line 121
    invoke-virtual {v1, v2, v3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_2
    invoke-virtual {v0}, La/a2v0;->R0()La/tjk;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iget-object v1, v1, La/tjk;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 129
    .line 130
    invoke-virtual {v0}, La/a2v0;->S0()La/c2v0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget-object v2, v2, La/c2v0;->d:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    iget-object v1, v0, La/a2v0;->d2:La/kiu0;

    .line 140
    .line 141
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, La/h2v0;

    .line 146
    .line 147
    iget-object v2, v2, La/h2v0;->e:La/ol60;

    .line 148
    .line 149
    new-instance v3, La/rtq0;

    .line 150
    .line 151
    const/16 v4, 0x19

    .line 152
    .line 153
    invoke-direct {v3, v0, v8, v4}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 154
    .line 155
    .line 156
    sget-object v4, La/lkz;->a:La/lkz;

    .line 157
    .line 158
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    new-instance v6, La/npu0;

    .line 171
    .line 172
    invoke-direct {v6, v2, v4, v3, v8}, La/npu0;-><init>(La/gmq;La/clz;La/rtq0;La/yje;)V

    .line 173
    .line 174
    .line 175
    const/4 v2, 0x3

    .line 176
    invoke-static {v5, v8, v8, v6, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, La/h2v0;

    .line 184
    .line 185
    iget-object v5, v1, La/h2v0;->f:La/p7m0;

    .line 186
    .line 187
    sget-object v1, La/lkz;->a:La/lkz;

    .line 188
    .line 189
    new-instance v7, La/k5r0;

    .line 190
    .line 191
    invoke-virtual {v0}, La/a2v0;->R0()La/tjk;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iget-object v11, v1, La/tjk;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 196
    .line 197
    const/4 v15, 0x4

    .line 198
    const/16 v16, 0x14

    .line 199
    .line 200
    const/4 v10, 0x2

    .line 201
    const-class v12, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 202
    .line 203
    const-string v13, "loadUrl"

    .line 204
    .line 205
    const-string v14, "loadUrl(Ljava/lang/String;)V"

    .line 206
    .line 207
    move-object v9, v7

    .line 208
    invoke-direct/range {v9 .. v16}, La/k5r0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 209
    .line 210
    .line 211
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v4, La/npu0;

    .line 224
    .line 225
    const/4 v9, 0x0

    .line 226
    invoke-direct/range {v4 .. v9}, La/npu0;-><init>(La/gmq;La/clz;La/k5r0;La/yje;C)V

    .line 227
    .line 228
    .line 229
    invoke-static {v0, v8, v8, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final R0()La/tjk;
    .locals 2

    .line 1
    sget-object v0, La/a2v0;->h2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/a2v0;->e2:La/nae0;

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
    check-cast p0, La/tjk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final S0()La/c2v0;
    .locals 2

    .line 1
    sget-object v0, La/a2v0;->h2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/a2v0;->b2:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/c2v0;

    .line 13
    .line 14
    return-object p0
.end method
