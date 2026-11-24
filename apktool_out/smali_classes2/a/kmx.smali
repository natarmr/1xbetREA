.class public final La/kmx;
.super La/cwr0;
.source "SourceFile"


# instance fields
.field public final synthetic q:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/kmx;->q:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Landroid/content/Context;Landroid/os/Looper;La/qgd;Ljava/lang/Object;La/qav;La/rav;)La/b9v;
    .locals 7

    .line 1
    iget-byte v0, p0, La/kmx;->q:B

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p6}, La/cwr0;->I(Landroid/content/Context;Landroid/os/Looper;La/qgd;Ljava/lang/Object;La/qav;La/rav;)La/b9v;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_0
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v5, p5

    .line 15
    move-object v6, p6

    .line 16
    check-cast p4, La/da3;

    .line 17
    .line 18
    new-instance v0, La/i0x0;

    .line 19
    .line 20
    const/16 v3, 0x33

    .line 21
    .line 22
    move-object v4, p3

    .line 23
    invoke-direct/range {v0 .. v6}, La/b9v;-><init>(Landroid/content/Context;Landroid/os/Looper;ILa/qgd;La/qav;La/rav;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :sswitch_1
    move-object v1, p1

    .line 28
    move-object v2, p2

    .line 29
    move-object v3, p3

    .line 30
    move-object v5, p5

    .line 31
    move-object v6, p6

    .line 32
    move-object v4, p4

    .line 33
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 34
    .line 35
    new-instance v0, La/waw0;

    .line 36
    .line 37
    check-cast v5, La/h9w0;

    .line 38
    .line 39
    check-cast v6, La/h9w0;

    .line 40
    .line 41
    invoke-direct/range {v0 .. v6}, La/waw0;-><init>(Landroid/content/Context;Landroid/os/Looper;La/qgd;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;La/h9w0;La/h9w0;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :sswitch_2
    move-object v1, p1

    .line 46
    move-object v2, p2

    .line 47
    move-object v3, p3

    .line 48
    move-object v5, p5

    .line 49
    move-object v6, p6

    .line 50
    move-object v4, p4

    .line 51
    check-cast v4, La/uaw0;

    .line 52
    .line 53
    new-instance v0, La/vaw0;

    .line 54
    .line 55
    check-cast v5, La/h9w0;

    .line 56
    .line 57
    check-cast v6, La/h9w0;

    .line 58
    .line 59
    invoke-direct/range {v0 .. v6}, La/vaw0;-><init>(Landroid/content/Context;Landroid/os/Looper;La/qgd;La/uaw0;La/h9w0;La/h9w0;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :sswitch_3
    invoke-static {p4}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    throw p0

    .line 68
    :sswitch_4
    move-object v1, p1

    .line 69
    move-object v2, p2

    .line 70
    move-object v3, p3

    .line 71
    move-object v5, p5

    .line 72
    move-object v6, p6

    .line 73
    check-cast p4, La/cuj0;

    .line 74
    .line 75
    new-instance v0, La/buj0;

    .line 76
    .line 77
    iget-object p0, v3, La/qgd;->g:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object p0, v3, La/qgd;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Ljava/lang/Integer;

    .line 82
    .line 83
    new-instance v4, Landroid/os/Bundle;

    .line 84
    .line 85
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string p1, "com.google.android.gms.signin.internal.clientRequestedAccount"

    .line 89
    .line 90
    const/4 p2, 0x0

    .line 91
    invoke-virtual {v4, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 92
    .line 93
    .line 94
    if-eqz p0, :cond_0

    .line 95
    .line 96
    const-string p1, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    invoke-virtual {v4, p1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    :cond_0
    const-string p0, "com.google.android.gms.signin.internal.offlineAccessRequested"

    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    invoke-virtual {v4, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    const-string p0, "com.google.android.gms.signin.internal.idTokenRequested"

    .line 112
    .line 113
    invoke-virtual {v4, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 114
    .line 115
    .line 116
    const-string p0, "com.google.android.gms.signin.internal.serverClientId"

    .line 117
    .line 118
    invoke-virtual {v4, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string p0, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    .line 122
    .line 123
    const/4 p3, 0x1

    .line 124
    invoke-virtual {v4, p0, p3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    const-string p0, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    .line 128
    .line 129
    invoke-virtual {v4, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 130
    .line 131
    .line 132
    const-string p0, "com.google.android.gms.signin.internal.hostedDomain"

    .line 133
    .line 134
    invoke-virtual {v4, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string p0, "com.google.android.gms.signin.internal.logSessionId"

    .line 138
    .line 139
    invoke-virtual {v4, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string p0, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    .line 143
    .line 144
    invoke-virtual {v4, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    invoke-direct/range {v0 .. v6}, La/buj0;-><init>(Landroid/content/Context;Landroid/os/Looper;La/qgd;Landroid/os/Bundle;La/qav;La/rav;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_4
        0x2 -> :sswitch_3
        0x5 -> :sswitch_2
        0x7 -> :sswitch_1
        0xa -> :sswitch_0
    .end sparse-switch
.end method

.method public J(Landroid/content/Context;Landroid/os/Looper;La/qgd;Ljava/lang/Object;La/h9w0;La/h9w0;)La/b9v;
    .locals 7

    .line 1
    iget-byte v0, p0, La/kmx;->q:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super/range {p0 .. p6}, La/cwr0;->J(Landroid/content/Context;Landroid/os/Looper;La/qgd;Ljava/lang/Object;La/h9w0;La/h9w0;)La/b9v;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v4, p3

    .line 14
    move-object v5, p5

    .line 15
    move-object v6, p6

    .line 16
    check-cast p4, La/da3;

    .line 17
    .line 18
    new-instance v0, La/bqw0;

    .line 19
    .line 20
    const/16 v3, 0x1c9

    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, La/b9v;-><init>(Landroid/content/Context;Landroid/os/Looper;ILa/qgd;La/qav;La/rav;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_2
    move-object v1, p1

    .line 27
    move-object v2, p2

    .line 28
    move-object v4, p3

    .line 29
    move-object v5, p5

    .line 30
    move-object v6, p6

    .line 31
    check-cast p4, La/da3;

    .line 32
    .line 33
    new-instance v0, La/fhw0;

    .line 34
    .line 35
    const/16 v3, 0x7e

    .line 36
    .line 37
    invoke-direct/range {v0 .. v6}, La/b9v;-><init>(Landroid/content/Context;Landroid/os/Looper;ILa/qgd;La/qav;La/rav;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_3
    move-object v1, p1

    .line 42
    move-object v2, p2

    .line 43
    move-object v4, p3

    .line 44
    move-object v5, p5

    .line 45
    move-object v6, p6

    .line 46
    check-cast p4, La/dbw0;

    .line 47
    .line 48
    new-instance p1, La/paw0;

    .line 49
    .line 50
    move-object p2, v1

    .line 51
    move-object p3, v2

    .line 52
    move-object p4, v4

    .line 53
    invoke-direct/range {p1 .. p6}, La/paw0;-><init>(Landroid/content/Context;Landroid/os/Looper;La/qgd;La/h9w0;La/h9w0;)V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    move-object v1, p1

    .line 58
    move-object v2, p2

    .line 59
    move-object v4, p3

    .line 60
    move-object v5, p5

    .line 61
    move-object v6, p6

    .line 62
    check-cast p4, La/mwp0;

    .line 63
    .line 64
    new-instance v0, La/kaw0;

    .line 65
    .line 66
    move-object v3, v4

    .line 67
    move-object v4, p4

    .line 68
    invoke-direct/range {v0 .. v6}, La/kaw0;-><init>(Landroid/content/Context;Landroid/os/Looper;La/qgd;La/mwp0;La/h9w0;La/h9w0;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_5
    move-object v1, p1

    .line 73
    move-object v2, p2

    .line 74
    move-object v4, p3

    .line 75
    move-object v5, p5

    .line 76
    move-object v6, p6

    .line 77
    check-cast p4, La/da3;

    .line 78
    .line 79
    new-instance v0, La/e9w0;

    .line 80
    .line 81
    const/16 v3, 0x1c1

    .line 82
    .line 83
    invoke-direct/range {v0 .. v6}, La/b9v;-><init>(Landroid/content/Context;Landroid/os/Looper;ILa/qgd;La/qav;La/rav;)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_6
    move-object v1, p1

    .line 88
    move-object v2, p2

    .line 89
    move-object v4, p3

    .line 90
    move-object v5, p5

    .line 91
    move-object v6, p6

    .line 92
    check-cast p4, La/da3;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v0, La/rxw;

    .line 104
    .line 105
    const/16 v3, 0x160

    .line 106
    .line 107
    invoke-direct/range {v0 .. v6}, La/b9v;-><init>(Landroid/content/Context;Landroid/os/Looper;ILa/qgd;La/qav;La/rav;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
