.class public final La/w590;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/cg60;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/w590;",
        "La/yx5;",
        "La/cg60;",
        "<init>",
        "()V",
        "a/mi70",
        "promotions"
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
.field public static final W1:La/mi70;

.field public static final synthetic X1:[La/iiy;

.field public static final Y1:Ljava/util/List;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public M1:La/fiu0;

.field public N1:La/wdk0;

.field public O1:La/ii;

.field public P1:La/vby;

.field public final Q1:La/kiu0;

.field public final R1:La/ywq;

.field public final S1:La/n0o0;

.field public U1:Landroid/webkit/ValueCallback;

.field public final V1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/w590;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/promotions/databinding/PaymentConsultantFragmentBinding;"

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
    sput-object v1, La/w590;->X1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/mi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/w590;->W1:La/mi70;

    .line 26
    .line 27
    const/16 v0, 0x191

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, La/w590;->Y1:Ljava/util/List;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0507

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/w590;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, La/w590;->L1:La/hnm0;

    .line 20
    .line 21
    new-instance v0, La/r590;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-direct {v0, p0, v1}, La/r590;-><init>(La/w590;B)V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/wz80;

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    invoke-direct {v1, p0, v2}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    sget-object v3, La/wez;->b:La/wez;

    .line 34
    .line 35
    new-instance v4, La/wz80;

    .line 36
    .line 37
    const/4 v5, 0x5

    .line 38
    invoke-direct {v4, v1, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v3, La/s690;

    .line 46
    .line 47
    sget-object v4, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, La/a190;

    .line 54
    .line 55
    invoke-direct {v4, v1, v2}, La/a190;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    new-instance v6, La/a190;

    .line 59
    .line 60
    invoke-direct {v6, v1, v5}, La/a190;-><init>(La/a8z;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v3, v4, v6, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/w590;->Q1:La/kiu0;

    .line 68
    .line 69
    new-instance v0, La/xn;

    .line 70
    .line 71
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 72
    .line 73
    .line 74
    new-instance v1, La/s590;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-direct {v1, p0, v3}, La/s590;-><init>(La/w590;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/w590;->R1:La/ywq;

    .line 85
    .line 86
    new-instance v0, La/xn;

    .line 87
    .line 88
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 89
    .line 90
    .line 91
    new-instance v1, La/s590;

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    invoke-direct {v1, p0, v2}, La/s590;-><init>(La/w590;B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 98
    .line 99
    .line 100
    new-instance v0, La/r590;

    .line 101
    .line 102
    const/4 v1, 0x3

    .line 103
    invoke-direct {v0, p0, v1}, La/r590;-><init>(La/w590;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, La/w590;->S1:La/n0o0;

    .line 111
    .line 112
    sget-object v0, La/t590;->a:La/t590;

    .line 113
    .line 114
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p0, La/w590;->V1:La/s0r;

    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v6, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/16 v2, 0x9

    .line 17
    .line 18
    const v3, 0x7f040ae1

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v6, v3, v3, v2}, La/ofm0;->z(Landroid/view/Window;Landroid/content/Context;III)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, La/w590;->H0()La/m590;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, La/m590;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 29
    .line 30
    new-instance v2, La/r590;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v2, v0, v3}, La/r590;-><init>(La/w590;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 37
    .line 38
    .line 39
    new-instance v7, La/hc50;

    .line 40
    .line 41
    sget-object v9, La/ybg0;->a:La/ybg0;

    .line 42
    .line 43
    new-instance v10, La/cz60;

    .line 44
    .line 45
    invoke-virtual {v0}, La/w590;->I0()La/s690;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    const/16 v17, 0xf

    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    const-class v13, La/s690;

    .line 55
    .line 56
    const-string v14, "reload"

    .line 57
    .line 58
    const-string v15, "reload()V"

    .line 59
    .line 60
    invoke-direct/range {v10 .. v17}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 61
    .line 62
    .line 63
    const/16 v12, 0x7f0

    .line 64
    .line 65
    const-string v8, "TOOLBAR_BUTTON_REFRESH"

    .line 66
    .line 67
    move-object v11, v10

    .line 68
    const v10, 0x7f080b1d

    .line 69
    .line 70
    .line 71
    invoke-direct/range {v7 .. v12}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 72
    .line 73
    .line 74
    filled-new-array {v7}, [La/hc50;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v2}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const v4, 0x7f040b0b

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, La/w590;->H0()La/m590;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iget-object v1, v1, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 111
    .line 112
    invoke-static {v1, v3}, La/knm0;->h(Landroid/view/View;Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, La/w590;->H0()La/m590;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v1, v1, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 120
    .line 121
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const/4 v2, 0x1

    .line 126
    if-eqz v1, :cond_1

    .line 127
    .line 128
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 161
    .line 162
    .line 163
    :cond_1
    invoke-virtual {v0}, La/w590;->I0()La/s690;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget-object v4, v1, La/s690;->j:La/m1e;

    .line 168
    .line 169
    invoke-interface {v4}, La/m1e;->b()La/gmq;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    new-instance v5, La/q690;

    .line 174
    .line 175
    invoke-direct {v5, v1, v6, v3}, La/q690;-><init>(La/s690;La/yje;B)V

    .line 176
    .line 177
    .line 178
    new-instance v7, La/fnq;

    .line 179
    .line 180
    const/4 v8, 0x4

    .line 181
    invoke-direct {v7, v4, v5, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 182
    .line 183
    .line 184
    sget-object v4, La/r690;->h:La/r690;

    .line 185
    .line 186
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    iget-object v9, v1, La/s690;->k:La/mne;

    .line 191
    .line 192
    iget-object v10, v9, La/mne;->a:La/rwj;

    .line 193
    .line 194
    invoke-static {v5, v10}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-static {v7, v5, v4}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 199
    .line 200
    .line 201
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    iget-object v13, v9, La/mne;->a:La/rwj;

    .line 206
    .line 207
    new-instance v11, La/x590;

    .line 208
    .line 209
    invoke-direct {v11, v1, v3}, La/x590;-><init>(La/s690;B)V

    .line 210
    .line 211
    .line 212
    new-instance v14, La/m690;

    .line 213
    .line 214
    invoke-direct {v14, v1, v6, v2}, La/m690;-><init>(La/s690;La/yje;B)V

    .line 215
    .line 216
    .line 217
    const/16 v15, 0xa

    .line 218
    .line 219
    const/4 v12, 0x0

    .line 220
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 221
    .line 222
    .line 223
    iget-object v4, v1, La/s690;->x:La/ol60;

    .line 224
    .line 225
    new-instance v5, La/m690;

    .line 226
    .line 227
    invoke-direct {v5, v1, v6, v3}, La/m690;-><init>(La/s690;La/yje;B)V

    .line 228
    .line 229
    .line 230
    new-instance v7, La/fnq;

    .line 231
    .line 232
    invoke-direct {v7, v4, v5, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 233
    .line 234
    .line 235
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    sget-object v5, La/n690;->h:La/n690;

    .line 240
    .line 241
    invoke-static {v7, v4, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, La/s690;->y()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, La/w590;->I0()La/s690;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iget-object v1, v1, La/s690;->v:La/p7m0;

    .line 252
    .line 253
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    new-instance v4, La/u590;

    .line 258
    .line 259
    invoke-direct {v4, v0, v6, v3}, La/u590;-><init>(La/w590;La/yje;B)V

    .line 260
    .line 261
    .line 262
    sget-object v3, La/lkz;->a:La/lkz;

    .line 263
    .line 264
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    new-instance v7, La/w090;

    .line 277
    .line 278
    invoke-direct {v7, v1, v3, v4, v6}, La/w090;-><init>(La/xae0;La/clz;La/u590;La/yje;)V

    .line 279
    .line 280
    .line 281
    const/4 v1, 0x3

    .line 282
    invoke-static {v5, v6, v6, v7, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, La/w590;->I0()La/s690;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    iget-object v3, v3, La/s690;->w:La/p7m0;

    .line 290
    .line 291
    invoke-static {v3}, La/vtb;->N(La/qz40;)La/xae0;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    new-instance v5, La/u590;

    .line 296
    .line 297
    invoke-direct {v5, v0, v6, v2}, La/u590;-><init>(La/w590;La/yje;B)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    new-instance v2, La/w090;

    .line 313
    .line 314
    const/4 v7, 0x0

    .line 315
    invoke-direct/range {v2 .. v7}, La/w090;-><init>(La/xae0;La/clz;La/u590;La/yje;B)V

    .line 316
    .line 317
    .line 318
    invoke-static {v8, v6, v6, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, La/w590;->I0()La/s690;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    iget-object v2, v2, La/s690;->y:La/ol60;

    .line 326
    .line 327
    new-instance v3, La/u590;

    .line 328
    .line 329
    const/4 v4, 0x2

    .line 330
    invoke-direct {v3, v0, v6, v4}, La/u590;-><init>(La/w590;La/yje;B)V

    .line 331
    .line 332
    .line 333
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    invoke-static {v7}, La/x0x;->Q(La/glz;)La/tkz;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    new-instance v8, La/w090;

    .line 346
    .line 347
    invoke-direct {v8, v2, v5, v3, v6}, La/w090;-><init>(La/gmq;La/clz;La/u590;La/yje;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v7, v6, v6, v8, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, La/w590;->H0()La/m590;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    iget-object v2, v2, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 358
    .line 359
    invoke-virtual {v2}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    if-eqz v2, :cond_2

    .line 364
    .line 365
    new-instance v3, La/v590;

    .line 366
    .line 367
    invoke-direct {v3, v0}, La/v590;-><init>(La/w590;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v3}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 371
    .line 372
    .line 373
    :cond_2
    invoke-virtual {v0}, La/w590;->H0()La/m590;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    iget-object v2, v2, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 378
    .line 379
    invoke-virtual {v2}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    if-eqz v2, :cond_4

    .line 384
    .line 385
    iget-object v12, v0, La/w590;->P1:La/vby;

    .line 386
    .line 387
    if-eqz v12, :cond_3

    .line 388
    .line 389
    new-instance v7, La/q590;

    .line 390
    .line 391
    new-instance v8, La/r590;

    .line 392
    .line 393
    const/4 v3, 0x5

    .line 394
    invoke-direct {v8, v0, v3}, La/r590;-><init>(La/w590;B)V

    .line 395
    .line 396
    .line 397
    new-instance v9, La/r590;

    .line 398
    .line 399
    const/4 v3, 0x6

    .line 400
    invoke-direct {v9, v0, v3}, La/r590;-><init>(La/w590;B)V

    .line 401
    .line 402
    .line 403
    new-instance v10, La/r590;

    .line 404
    .line 405
    const/4 v3, 0x7

    .line 406
    invoke-direct {v10, v0, v3}, La/r590;-><init>(La/w590;B)V

    .line 407
    .line 408
    .line 409
    new-instance v11, La/yr80;

    .line 410
    .line 411
    invoke-direct {v11, v0, v1}, La/yr80;-><init>(Ljava/lang/Object;B)V

    .line 412
    .line 413
    .line 414
    invoke-direct/range {v7 .. v12}, La/q590;-><init>(La/r590;La/r590;La/r590;La/yr80;La/vby;)V

    .line 415
    .line 416
    .line 417
    const-string v1, "MobileAppApiV2"

    .line 418
    .line 419
    invoke-virtual {v2, v7, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    goto :goto_0

    .line 423
    :cond_3
    const-string v0, "json"

    .line 424
    .line 425
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v6

    .line 429
    :cond_4
    :goto_0
    invoke-virtual {v0}, La/w590;->H0()La/m590;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    iget-object v1, v1, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 434
    .line 435
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    if-eqz v1, :cond_5

    .line 440
    .line 441
    new-instance v2, La/mzo;

    .line 442
    .line 443
    invoke-direct {v2, v0, v4}, La/mzo;-><init>(La/yx5;B)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 447
    .line 448
    .line 449
    :cond_5
    return-void
.end method

.method public final C0()V
    .locals 4

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
    const-class v1, La/e590;

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
    instance-of v3, v0, La/e590;

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
    check-cast v2, La/e590;

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
    invoke-virtual {v2, v0}, La/e590;->a(La/i1w0;)La/v9i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/v9i;->e()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/w590;->M1:La/fiu0;

    .line 68
    .line 69
    iget-object v1, v0, La/v9i;->w:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/wdk0;

    .line 72
    .line 73
    iput-object v1, p0, La/w590;->N1:La/wdk0;

    .line 74
    .line 75
    iget-object v1, v0, La/v9i;->v:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La/ii;

    .line 78
    .line 79
    iput-object v1, p0, La/w590;->O1:La/ii;

    .line 80
    .line 81
    iget-object v0, v0, La/v9i;->u:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/vby;

    .line 84
    .line 85
    iput-object v0, p0, La/w590;->P1:La/vby;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 89
    .line 90
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final G0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/w590;->S1:La/n0o0;

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
    new-instance v1, La/lz9;

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    invoke-direct {v1, v0, p0, v2}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, La/qog0;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final H0()La/m590;
    .locals 2

    .line 1
    sget-object v0, La/w590;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/w590;->V1:La/s0r;

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
    check-cast p0, La/m590;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/s690;
    .locals 0

    .line 1
    iget-object p0, p0, La/w590;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/s690;

    .line 8
    .line 9
    return-object p0
.end method

.method public final J0()V
    .locals 13

    .line 1
    iget-object v0, p0, La/w590;->O1:La/ii;

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
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/r590;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-direct {v0, p0, v1}, La/r590;-><init>(La/w590;B)V

    .line 65
    .line 66
    .line 67
    const-string v1, "CAMERA_PERMISSION_DIALOG"

    .line 68
    .line 69
    invoke-static {p0, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    const-string p0, "actionDialogManager"

    .line 74
    .line 75
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    throw p0
.end method

.method public final K0()V
    .locals 13

    .line 1
    iget-object v0, p0, La/w590;->O1:La/ii;

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
    const v3, 0x7f130f3d

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
    const-string v7, "PERMISSION_DIALOG"

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
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/r590;

    .line 62
    .line 63
    const/4 v1, 0x4

    .line 64
    invoke-direct {v0, p0, v1}, La/r590;-><init>(La/w590;B)V

    .line 65
    .line 66
    .line 67
    const-string v1, "PERMISSION_DIALOG"

    .line 68
    .line 69
    invoke-static {p0, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    const-string p0, "actionDialogManager"

    .line 74
    .line 75
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    throw p0
.end method

.method public final g0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/w590;->H0()La/m590;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/m590;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->g0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/w590;->H0()La/m590;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/m590;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

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
    .locals 0

    .line 1
    invoke-virtual {p0}, La/w590;->I0()La/s690;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/s690;->w()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/w590;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/w590;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
