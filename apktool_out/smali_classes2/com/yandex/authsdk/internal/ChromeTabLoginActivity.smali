.class public final Lcom/yandex/authsdk/internal/ChromeTabLoginActivity;
.super La/yc3;
.source "SourceFile"


# instance fields
.field public B:La/nr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/yc3;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, La/kxq;->onCreate(Landroid/os/Bundle;)V

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
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "com.yandex.authsdk.EXTRA_STATE"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v2, La/nr;

    .line 38
    .line 39
    new-instance v3, La/pv00;

    .line 40
    .line 41
    invoke-direct {v3, p0}, La/pv00;-><init>(Landroid/app/Activity;)V

    .line 42
    .line 43
    .line 44
    new-instance v4, La/svs0;

    .line 45
    .line 46
    const/4 v5, 0x4

    .line 47
    invoke-direct {v4, v5}, La/svs0;-><init>(B)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, Lcom/yandex/authsdk/YandexAuthOptions;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct {v2, v3, v1, v4, v0}, La/nr;-><init>(La/pv00;Ljava/lang/String;La/svs0;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Lcom/yandex/authsdk/internal/ChromeTabLoginActivity;->B:La/nr;

    .line 56
    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const-string v0, "yandex_auth_sdk_android_ct"

    .line 67
    .line 68
    invoke-virtual {v2, p1, v0}, La/nr;->q(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "com.yandex.authsdk.internal.EXTRA_PACKAGE_NAME"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v1, La/mii0;

    .line 83
    .line 84
    const/16 v2, 0x16

    .line 85
    .line 86
    invoke-direct {v1, v2}, La/mii0;-><init>(B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, La/mii0;->m()La/yzn0;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-object v2, v1, La/yzn0;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Landroid/content/Intent;

    .line 96
    .line 97
    new-instance v3, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v4, "android-app://"

    .line 100
    .line 101
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    const-string v4, "android.intent.extra.REFERRER"

    .line 120
    .line 121
    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 132
    .line 133
    .line 134
    iget-object p1, v1, La/yzn0;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, Landroid/os/Bundle;

    .line 137
    .line 138
    invoke-virtual {p0, v2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 139
    .line 140
    .line 141
    :cond_1
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/agd;->onNewIntent(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/yandex/authsdk/internal/ChromeTabLoginActivity;->B:La/nr;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La/nr;->A(Landroid/net/Uri;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string p0, "loginHandler"

    .line 30
    .line 31
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    throw p0

    .line 36
    :cond_1
    return-void
.end method

.method public final onPostResume()V
    .locals 5

    .line 1
    invoke-super {p0}, La/yc3;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/zfd;->a:La/glz;

    .line 5
    .line 6
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, La/tvk;->a:La/rwj;

    .line 11
    .line 12
    sget-object v1, La/ys10;->a:La/vs10;

    .line 13
    .line 14
    new-instance v2, La/fob;

    .line 15
    .line 16
    const/16 v3, 0x9

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v2, p0, v4, v3}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x2

    .line 23
    invoke-static {v0, v1, v4, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 24
    .line 25
    .line 26
    return-void
.end method
