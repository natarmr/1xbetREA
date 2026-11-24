.class public final La/nzo;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/nzo;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/pek",
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
.field public static final P1:La/pek;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public O1:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/nzo;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/fast_games/impl/databinding/FragmentFastGamesBinding;"

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
    sput-object v1, La/nzo;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/pek;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/nzo;->P1:La/pek;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0232

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/jzo;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, La/jzo;-><init>(La/nzo;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/jfl;

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v3, La/jfl;

    .line 23
    .line 24
    const/16 v4, 0x9

    .line 25
    .line 26
    invoke-direct {v3, v1, v4}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-class v2, La/e0p;

    .line 34
    .line 35
    sget-object v3, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, La/b9k;

    .line 42
    .line 43
    const/16 v4, 0x1a

    .line 44
    .line 45
    invoke-direct {v3, v1, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/b9k;

    .line 49
    .line 50
    const/16 v5, 0x1b

    .line 51
    .line 52
    invoke-direct {v4, v1, v5}, La/b9k;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/nzo;->M1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/kzo;->a:La/kzo;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/nzo;->N1:La/s0r;

    .line 68
    .line 69
    const-string v0, ""

    .line 70
    .line 71
    iput-object v0, p0, La/nzo;->O1:Ljava/lang/String;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La/wzq;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 8
    .line 9
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v4}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v1, v1, La/wzq;->f:Landroid/widget/ProgressBar;

    .line 71
    .line 72
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget-object v5, v5, La/wzq;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 77
    .line 78
    invoke-virtual {v5}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    new-instance v6, La/lzo;

    .line 85
    .line 86
    invoke-direct {v6, v0, v1}, La/lzo;-><init>(La/nzo;Landroid/widget/ProgressBar;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v6}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v1, v1, La/wzq;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 97
    .line 98
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/4 v5, 0x0

    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    new-instance v6, La/mzo;

    .line 106
    .line 107
    invoke-direct {v6, v0, v5}, La/mzo;-><init>(La/yx5;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v6}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v1, v1, La/wzq;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 118
    .line 119
    const v6, 0x7f080629

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v6}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iget-object v1, v1, La/wzq;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 130
    .line 131
    new-instance v6, La/q10;

    .line 132
    .line 133
    const/16 v7, 0x15

    .line 134
    .line 135
    invoke-direct {v6, v0, v7}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v6}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iget-object v1, v1, La/wzq;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 146
    .line 147
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    iget-object v6, v6, La/wzq;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 156
    .line 157
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    const v7, 0x7f040b0b

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v6, v7}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iget-object v1, v1, La/wzq;->f:Landroid/widget/ProgressBar;

    .line 175
    .line 176
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iget-object v1, v1, La/wzq;->b:Lorg/xplatform/ui_core/viewcomponents/views/BalanceView;

    .line 184
    .line 185
    new-instance v6, La/yhn;

    .line 186
    .line 187
    const/16 v7, 0x17

    .line 188
    .line 189
    invoke-direct {v6, v0, v7}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v6}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 193
    .line 194
    .line 195
    new-instance v1, La/jzo;

    .line 196
    .line 197
    invoke-direct {v1, v0, v5}, La/jzo;-><init>(La/nzo;B)V

    .line 198
    .line 199
    .line 200
    const-string v5, "REQUEST_GAME_URL_ERROR_DIALOG_KEY"

    .line 201
    .line 202
    invoke-static {v0, v5, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 214
    .line 215
    and-int/2addr v1, v2

    .line 216
    if-eqz v1, :cond_3

    .line 217
    .line 218
    invoke-static {v4}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 219
    .line 220
    .line 221
    :cond_3
    iget-object v0, v0, La/nzo;->M1:La/kiu0;

    .line 222
    .line 223
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, La/e0p;

    .line 228
    .line 229
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    new-instance v5, La/hin;

    .line 234
    .line 235
    iget-object v7, v0, La/e0p;->i:La/duj;

    .line 236
    .line 237
    const/4 v11, 0x0

    .line 238
    const/16 v12, 0x17

    .line 239
    .line 240
    const/4 v6, 0x1

    .line 241
    const-class v16, La/duj;

    .line 242
    .line 243
    const-string v9, "handleError"

    .line 244
    .line 245
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 246
    .line 247
    move-object/from16 v8, v16

    .line 248
    .line 249
    invoke-direct/range {v5 .. v12}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 250
    .line 251
    .line 252
    new-instance v8, La/hij;

    .line 253
    .line 254
    const/16 v1, 0x11

    .line 255
    .line 256
    invoke-direct {v8, v0, v3, v1}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 257
    .line 258
    .line 259
    const/16 v9, 0xe

    .line 260
    .line 261
    const/4 v6, 0x0

    .line 262
    const/4 v7, 0x0

    .line 263
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 264
    .line 265
    .line 266
    iget-object v1, v0, La/e0p;->d:La/b8u;

    .line 267
    .line 268
    sget-object v2, La/bm5;->e:La/bm5;

    .line 269
    .line 270
    invoke-virtual {v1, v2}, La/b8u;->a(La/bm5;)La/i89;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    new-instance v2, La/sxk;

    .line 279
    .line 280
    const/16 v4, 0xa

    .line 281
    .line 282
    invoke-direct {v2, v0, v3, v4}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 283
    .line 284
    .line 285
    new-instance v3, La/fnq;

    .line 286
    .line 287
    const/4 v4, 0x4

    .line 288
    invoke-direct {v3, v1, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 289
    .line 290
    .line 291
    new-instance v13, La/pfl;

    .line 292
    .line 293
    iget-object v15, v0, La/e0p;->i:La/duj;

    .line 294
    .line 295
    const/16 v19, 0x4

    .line 296
    .line 297
    const/16 v20, 0x5

    .line 298
    .line 299
    const/4 v14, 0x2

    .line 300
    const-string v17, "handleError"

    .line 301
    .line 302
    const-string v18, "handleError(Ljava/lang/Throwable;)V"

    .line 303
    .line 304
    invoke-direct/range {v13 .. v20}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 305
    .line 306
    .line 307
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v3, v0, v13}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 312
    .line 313
    .line 314
    return-void
.end method

.method public final C0()V
    .locals 15

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
    const-class v1, La/ozo;

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
    instance-of v3, v0, La/ozo;

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
    check-cast v2, La/ozo;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v4, v2, La/ozo;->d:La/cad;

    .line 63
    .line 64
    iget-object v9, v2, La/ozo;->a:La/btt0;

    .line 65
    .line 66
    iget-object v10, v2, La/ozo;->b:La/zri;

    .line 67
    .line 68
    iget-object v11, v2, La/ozo;->c:La/knf0;

    .line 69
    .line 70
    iget-object v12, v2, La/ozo;->f:La/v88;

    .line 71
    .line 72
    iget-object v0, v2, La/ozo;->g:La/gii0;

    .line 73
    .line 74
    iget-object v5, v2, La/ozo;->i:La/wsf0;

    .line 75
    .line 76
    iget-object v6, v2, La/ozo;->j:La/gst0;

    .line 77
    .line 78
    iget-object v7, v2, La/ozo;->h:La/ii;

    .line 79
    .line 80
    iget-object v13, v2, La/ozo;->k:La/fsd;

    .line 81
    .line 82
    iget-object v8, v2, La/ozo;->l:La/duj;

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v3, La/o3c;

    .line 103
    .line 104
    invoke-direct/range {v3 .. v14}, La/o3c;-><init>(La/cad;La/wsf0;La/gst0;La/ii;La/duj;La/btt0;La/zri;La/knf0;La/v88;La/fsd;La/i1w0;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, La/fiu0;

    .line 108
    .line 109
    iget-object v1, v3, La/o3c;->k:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, La/yei;

    .line 112
    .line 113
    const-class v2, La/e0p;

    .line 114
    .line 115
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, La/nzo;->K1:La/fiu0;

    .line 123
    .line 124
    iput-object v7, p0, La/nzo;->L1:La/ii;

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 128
    .line 129
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/nzo;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/e0p;

    .line 8
    .line 9
    iget-object v0, v0, La/e0p;->k:La/qoj0;

    .line 10
    .line 11
    new-instance v1, La/sxk;

    .line 12
    .line 13
    const/16 v2, 0x9

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

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
    new-instance v4, La/ofl;

    .line 34
    .line 35
    invoke-direct {v4, v0, p0, v1, v3}, La/ofl;-><init>(La/gmq;La/clz;La/sxk;La/yje;)V

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

.method public final G0()La/wzq;
    .locals 2

    .line 1
    sget-object v0, La/nzo;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/nzo;->N1:La/s0r;

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
    check-cast p0, La/wzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/nzo;->G0()La/wzq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/wzq;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 6
    .line 7
    const v1, 0x7f130677

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setText(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/nzo;->G0()La/wzq;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/wzq;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/nzo;->G0()La/wzq;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, La/wzq;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 32
    .line 33
    const/16 v0, 0x8

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
