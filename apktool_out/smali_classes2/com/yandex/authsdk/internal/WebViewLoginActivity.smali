.class public final Lcom/yandex/authsdk/internal/WebViewLoginActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public a:La/nr;

.field public b:Lcom/yandex/authsdk/YandexAuthOptions;

.field public c:Landroid/webkit/WebView;

.field public d:La/cgx0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "com.yandex.authsdk.EXTRA_OPTIONS"

    .line 9
    .line 10
    const-class v2, Lcom/yandex/authsdk/YandexAuthOptions;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/x2x;->U(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/yandex/authsdk/YandexAuthOptions;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iput-object v0, p0, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->b:Lcom/yandex/authsdk/YandexAuthOptions;

    .line 25
    .line 26
    new-instance v1, La/cgx0;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    :try_start_0
    const-string v3, "com.yandex.authsdk.internal.domesticroots.webview.WebViewSslErrorHandlerImpl"

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-class v4, Landroid/content/Context;

    .line 42
    .line 43
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast v2, La/i5v0;
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catch_0
    sget-object v2, La/i5v0;->a:La/i5v0;

    .line 70
    .line 71
    :goto_0
    new-instance v3, La/avs0;

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    const/16 v10, 0x9

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    const-class v6, Lcom/yandex/authsdk/internal/WebViewLoginActivity;

    .line 78
    .line 79
    const-string v7, "finishWithSecurityError"

    .line 80
    .line 81
    const-string v8, "finishWithSecurityError()V"

    .line 82
    .line 83
    move-object v5, p0

    .line 84
    invoke-direct/range {v3 .. v10}, La/avs0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v1, v2, v3}, La/cgx0;-><init>(La/i5v0;La/avs0;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, v5, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->d:La/cgx0;

    .line 91
    .line 92
    invoke-virtual {v5}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    const-string v1, "com.yandex.authsdk.EXTRA_STATE"

    .line 97
    .line 98
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v1, La/nr;

    .line 106
    .line 107
    new-instance v2, La/pv00;

    .line 108
    .line 109
    invoke-direct {v2, v5}, La/pv00;-><init>(Landroid/app/Activity;)V

    .line 110
    .line 111
    .line 112
    new-instance v3, La/svs0;

    .line 113
    .line 114
    const/4 v4, 0x4

    .line 115
    invoke-direct {v3, v4}, La/svs0;-><init>(B)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v0, Lcom/yandex/authsdk/YandexAuthOptions;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-direct {v1, v2, p0, v3, v0}, La/nr;-><init>(La/pv00;Ljava/lang/String;La/svs0;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, v5, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->a:La/nr;

    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    if-nez p1, :cond_1

    .line 127
    .line 128
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1, p0}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 133
    .line 134
    .line 135
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Landroid/webkit/CookieManager;->flush()V

    .line 140
    .line 141
    .line 142
    :cond_1
    new-instance p1, Landroid/webkit/WebView;

    .line 143
    .line 144
    invoke-direct {p1, v5}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 145
    .line 146
    .line 147
    new-instance v0, La/d5v0;

    .line 148
    .line 149
    invoke-direct {v0, v5}, La/d5v0;-><init>(Lcom/yandex/authsdk/internal/WebViewLoginActivity;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const/4 v1, 0x1

    .line 160
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v5, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->a:La/nr;

    .line 164
    .line 165
    if-eqz v0, :cond_2

    .line 166
    .line 167
    invoke-virtual {v5}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    const-string v1, "yandex_auth_sdk_android_wv"

    .line 175
    .line 176
    invoke-virtual {v0, p0, v1}, La/nr;->q(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {p1, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iput-object p1, v5, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->c:Landroid/webkit/WebView;

    .line 184
    .line 185
    invoke-virtual {v5, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_2
    const-string p1, "loginHandler"

    .line 190
    .line 191
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p0
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->d:La/cgx0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, La/cgx0;->l()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "sslErrorHandler"

    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v1

    .line 18
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->c:Landroid/webkit/WebView;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const-string p0, "webView"

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_3
    :goto_1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 35
    .line 36
    .line 37
    return-void
.end method
