.class public final La/omk;
.super La/c2;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;B)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    packed-switch p3, :pswitch_data_0

    .line 3
    .line 4
    .line 5
    const-string p3, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL"

    .line 6
    .line 7
    invoke-direct {p0, p2, p3}, La/c2;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    :try_start_0
    new-instance p0, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    :cond_0
    const-string p0, "credentialJson must not be empty, and must be a valid JSON"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :pswitch_0
    const-string p3, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"

    .line 32
    .line 33
    invoke-direct {p0, p2, p3}, La/c2;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    :try_start_1
    new-instance p0, Lorg/json/JSONObject;

    .line 46
    .line 47
    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_1
    :cond_1
    const-string p0, "authenticationResponseJson must not be empty, and must be a valid JSON"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :pswitch_1
    const-string p3, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    .line 58
    .line 59
    invoke-direct {p0, p2, p3}, La/c2;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-lez p0, :cond_2

    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    const-string p0, "password should not be empty"

    .line 70
    .line 71
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
