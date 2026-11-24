.class public final La/wic;
.super La/tw00;
.source "SourceFile"


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/r8x;


# direct methods
.method public synthetic constructor <init>(La/r8x;La/uw00;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wic;->i:B

    iput-object p1, p0, La/wic;->j:La/r8x;

    invoke-direct {p0, p2}, La/tw00;-><init>(La/uw00;)V

    return-void
.end method


# virtual methods
.method public final Z(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wic;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wic;->j:La/r8x;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, La/k2w0;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p0, La/q950;

    .line 14
    .line 15
    iget-object p0, p0, La/q950;->b:Landroid/content/Intent;

    .line 16
    .line 17
    iget-object p1, p2, La/k2w0;->a:Lcom/yandex/authsdk/YandexAuthOptions;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string p2, "com.yandex.auth.CLIENT_ID"

    .line 23
    .line 24
    iget-object v0, p1, Lcom/yandex/authsdk/YandexAuthOptions;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, Lcom/yandex/authsdk/YandexAuthOptions;->c:Ljava/lang/String;

    .line 30
    .line 31
    const-string p2, "oauth.yandex.ru"

    .line 32
    .line 33
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 p2, 0x1

    .line 38
    xor-int/2addr p1, p2

    .line 39
    const-string v0, "com.yandex.auth.USE_TESTING_ENV"

    .line 40
    .line 41
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    const-string p1, "com.yandex.auth.FORCE_CONFIRM"

    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    check-cast p2, La/k2w0;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v0, Landroid/content/Intent;

    .line 56
    .line 57
    const-class v1, Lcom/yandex/authsdk/internal/ChromeTabLoginActivity;

    .line 58
    .line 59
    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 60
    .line 61
    .line 62
    check-cast p0, La/xic;

    .line 63
    .line 64
    const-string p1, "com.yandex.authsdk.internal.EXTRA_PACKAGE_NAME"

    .line 65
    .line 66
    iget-object p0, p0, La/xic;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    iget-object p0, p2, La/k2w0;->a:Lcom/yandex/authsdk/YandexAuthOptions;

    .line 72
    .line 73
    iget-object p1, p2, La/k2w0;->b:Lcom/yandex/authsdk/YandexAuthLoginOptions;

    .line 74
    .line 75
    iget-object p2, p2, La/k2w0;->c:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const-string v1, "com.yandex.authsdk.EXTRA_OPTIONS"

    .line 87
    .line 88
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    const-string p0, "com.yandex.authsdk.EXTRA_LOGIN_OPTIONS"

    .line 92
    .line 93
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 94
    .line 95
    .line 96
    const-string p0, "com.yandex.authsdk.EXTRA_STATE"

    .line 97
    .line 98
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
