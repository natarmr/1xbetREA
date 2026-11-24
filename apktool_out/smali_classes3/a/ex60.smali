.class public final synthetic La/ex60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;
.implements La/xbf;
.implements La/izj;
.implements La/lzw;
.implements La/zon0;
.implements La/ikf0;
.implements Lokhttp3/Authenticator;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ex60;->a:B

    iput-object p1, p0, La/ex60;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/p5d0;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/ex60;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/p8f;

    .line 4
    .line 5
    invoke-interface {p1}, La/p5d0;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La/bhq;

    .line 10
    .line 11
    const-string v0, "firebase"

    .line 12
    .line 13
    check-cast p1, La/qff0;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, La/qff0;->b(Ljava/lang/String;)La/xgq;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p1, p1, La/xgq;->i:La/n660;

    .line 20
    .line 21
    iget-object v0, p1, La/n660;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p1, La/n660;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/krd;

    .line 31
    .line 32
    invoke-virtual {v0}, La/krd;->b()Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p1, La/n660;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    new-instance v2, La/hi;

    .line 41
    .line 42
    const/16 v3, 0xd

    .line 43
    .line 44
    invoke-direct {v2, p1, v0, p0, v3}, La/hi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 48
    .line 49
    .line 50
    const-string p0, "FirebaseCrashlytics"

    .line 51
    .line 52
    const/4 p1, 0x3

    .line 53
    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    const-string p1, "Registering RemoteConfig Rollouts subscriber"

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-static {p0, p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object p0, p0, La/ex60;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/zuh0;

    .line 4
    .line 5
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/zuh0;->y()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ex60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/ex60;->b:Ljava/lang/Object;

    .line 5
    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;

    .line 10
    .line 11
    check-cast p1, La/m1r;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object p1, La/m6f0;->f2:La/gle0;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p1, La/m6f0;

    .line 22
    .line 23
    invoke-direct {p1}, La/m6f0;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, La/m6f0;->g2:[La/iiy;

    .line 27
    .line 28
    aget-object v0, v0, v1

    .line 29
    .line 30
    iget-object v1, p1, La/m6f0;->d2:La/khf0;

    .line 31
    .line 32
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :sswitch_0
    check-cast p0, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;

    .line 37
    .line 38
    check-cast p1, La/m1r;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object p1, La/dxe0;->Y1:La/lme0;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p1, La/dxe0;

    .line 49
    .line 50
    invoke-direct {p1}, La/dxe0;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v0, La/dxe0;->Z1:[La/iiy;

    .line 54
    .line 55
    aget-object v0, v0, v1

    .line 56
    .line 57
    iget-object v1, p1, La/dxe0;->V1:La/khf0;

    .line 58
    .line 59
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :sswitch_1
    check-cast p0, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 64
    .line 65
    check-cast p1, La/m1r;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object p1, La/ep90;->c2:La/jh70;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance p1, La/ep90;

    .line 76
    .line 77
    invoke-direct {p1}, La/ep90;-><init>()V

    .line 78
    .line 79
    .line 80
    sget-object v0, La/ep90;->d2:[La/iiy;

    .line 81
    .line 82
    aget-object v0, v0, v1

    .line 83
    .line 84
    iget-object v1, p1, La/ep90;->b2:La/khf0;

    .line 85
    .line 86
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :sswitch_2
    check-cast p0, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;

    .line 91
    .line 92
    check-cast p1, La/m1r;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object p1, La/exd;->U1:La/usd;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance p1, La/exd;

    .line 103
    .line 104
    invoke-direct {p1}, La/exd;-><init>()V

    .line 105
    .line 106
    .line 107
    sget-object v0, La/exd;->V1:[La/iiy;

    .line 108
    .line 109
    aget-object v0, v0, v1

    .line 110
    .line 111
    iget-object v1, p1, La/exd;->S1:La/khf0;

    .line 112
    .line 113
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 114
    .line 115
    .line 116
    return-object p1

    .line 117
    :sswitch_3
    check-cast p0, La/we50;

    .line 118
    .line 119
    check-cast p1, La/m1r;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    sget-object p1, La/b190;->V1:La/fl70;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance p1, La/b190;

    .line 133
    .line 134
    invoke-direct {p1}, La/b190;-><init>()V

    .line 135
    .line 136
    .line 137
    sget-object v0, La/b190;->W1:[La/iiy;

    .line 138
    .line 139
    aget-object v0, v0, v1

    .line 140
    .line 141
    iget-object v1, p1, La/b190;->S1:La/yzn0;

    .line 142
    .line 143
    invoke-virtual {v1, p1, v0, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 144
    .line 145
    .line 146
    return-object p1

    .line 147
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_3
        0x9 -> :sswitch_2
        0xa -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;
    .locals 1

    .line 1
    iget-object p0, p0, La/ex60;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/e6d0;

    .line 4
    .line 5
    iget-object p1, p0, La/e6d0;->e:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, La/e6d0;->f:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v0, Lkotlin/text/Charsets;->d:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-static {p1, p0, v0}, Lokhttp3/Credentials;->a(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p1, p2, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 16
    .line 17
    invoke-virtual {p1}, Lokhttp3/Request;->a()Lokhttp3/Request$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "Proxy-Authorization"

    .line 22
    .line 23
    invoke-virtual {p1, p2, p0}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Lokhttp3/Request;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public f(JLa/fq80;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ex60;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/y3v;

    .line 4
    .line 5
    iget-object p0, p0, La/y3v;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, [La/ncs0;

    .line 8
    .line 9
    invoke-static {p1, p2, p3, p0}, La/nnw0;->D(JLa/fq80;[La/ncs0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object p0, p0, La/ex60;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/r7h0;

    .line 4
    .line 5
    iget-object v0, p0, La/r7h0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, La/r7h0;->d:La/lzw;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "ScreenFlashWrapper"

    .line 13
    .line 14
    const-string v2, "apply: pendingListener is null!"

    .line 15
    .line 16
    invoke-static {v1, v2}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    invoke-virtual {p0}, La/r7h0;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0

    .line 28
    throw p0
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/ex60;->a:B

    .line 6
    .line 7
    const-string v3, "SELECT_BALANCE_REQUEST_KEY"

    .line 8
    .line 9
    const-string v4, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 10
    .line 11
    const-string v5, "GameIsNotFinishedDialog.REQUEST_KEY"

    .line 12
    .line 13
    const-string v6, "GameIsNotFinishedDialog.RESULT_KEY_CONTINUE"

    .line 14
    .line 15
    const-string v7, "GameIsNotFinishedDialog.RESULT_KEY_EXIT"

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/16 v9, 0x21

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const v11, 0x7f131579

    .line 22
    .line 23
    .line 24
    const/4 v12, 0x1

    .line 25
    const/4 v13, 0x0

    .line 26
    iget-object v0, v0, La/ex60;->b:Ljava/lang/Object;

    .line 27
    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    :pswitch_0
    check-cast v0, La/rbi0;

    .line 32
    .line 33
    sget-object v2, La/rbi0;->U1:La/gle0;

    .line 34
    .line 35
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    if-lt v2, v9, :cond_0

    .line 41
    .line 42
    invoke-static {v1}, La/e4e0;->p(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const-string v2, "MULTI_CHOICE_CALLBACK_KEY"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    instance-of v2, v1, La/obk0;

    .line 54
    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move-object v13, v1

    .line 59
    :goto_0
    move-object v1, v13

    .line 60
    check-cast v1, La/obk0;

    .line 61
    .line 62
    :goto_1
    check-cast v1, La/obk0;

    .line 63
    .line 64
    if-eqz v1, :cond_6

    .line 65
    .line 66
    invoke-virtual {v0}, La/rbi0;->I0()La/ldi0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v2, v0, La/ldi0;->I:La/ol60;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    if-eq v1, v12, :cond_4

    .line 79
    .line 80
    if-eq v1, v8, :cond_3

    .line 81
    .line 82
    const/4 v0, 0x3

    .line 83
    if-ne v1, v0, :cond_2

    .line 84
    .line 85
    sget-object v0, La/lci0;->a:La/lci0;

    .line 86
    .line 87
    invoke-virtual {v2, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    sget-object v1, La/rci0;->a:La/rci0;

    .line 96
    .line 97
    invoke-virtual {v2, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    sget-object v1, La/hfi0;->c:La/hfi0;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, La/ldi0;->H(La/hfi0;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    sget-object v1, La/sci0;->a:La/sci0;

    .line 107
    .line 108
    invoke-virtual {v2, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v1, La/hfi0;->d:La/hfi0;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, La/ldi0;->H(La/hfi0;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    invoke-virtual {v0}, La/ldi0;->E()V

    .line 118
    .line 119
    .line 120
    sget-object v1, La/hfi0;->b:La/hfi0;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, La/ldi0;->H(La/hfi0;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    :goto_2
    return-void

    .line 126
    :pswitch_1
    check-cast v0, La/cqh0;

    .line 127
    .line 128
    sget-object v2, La/cqh0;->N1:La/gne0;

    .line 129
    .line 130
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, La/cqh0;->H0()La/irh0;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    iget-object v0, v4, La/irh0;->r:La/mne;

    .line 149
    .line 150
    iget-object v13, v0, La/mne;->a:La/rwj;

    .line 151
    .line 152
    new-instance v6, La/jjh0;

    .line 153
    .line 154
    const/4 v10, 0x0

    .line 155
    const/16 v11, 0x15

    .line 156
    .line 157
    const/4 v5, 0x1

    .line 158
    const-class v7, La/irh0;

    .line 159
    .line 160
    const-string v8, "onError"

    .line 161
    .line 162
    const-string v9, "onError(Ljava/lang/Throwable;)V"

    .line 163
    .line 164
    move-object/from16 v23, v6

    .line 165
    .line 166
    move-object v6, v4

    .line 167
    move-object/from16 v4, v23

    .line 168
    .line 169
    invoke-direct/range {v4 .. v11}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 170
    .line 171
    .line 172
    move-object v7, v4

    .line 173
    move-object v4, v6

    .line 174
    new-instance v0, La/ah0;

    .line 175
    .line 176
    const/4 v5, 0x0

    .line 177
    const/16 v6, 0x12

    .line 178
    .line 179
    move-object/from16 v2, p2

    .line 180
    .line 181
    invoke-direct/range {v0 .. v6}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 182
    .line 183
    .line 184
    const/16 v10, 0xa

    .line 185
    .line 186
    move-object v4, v7

    .line 187
    const/4 v7, 0x0

    .line 188
    move-object v9, v0

    .line 189
    move-object v6, v4

    .line 190
    move-object v5, v12

    .line 191
    move-object v8, v13

    .line 192
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_2
    check-cast v0, La/oph0;

    .line 197
    .line 198
    sget-object v1, La/oph0;->Q1:La/gle0;

    .line 199
    .line 200
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, La/oph0;->I0()La/zuh0;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    iget-object v0, v4, La/zuh0;->q:La/mne;

    .line 219
    .line 220
    iget-object v13, v0, La/mne;->a:La/rwj;

    .line 221
    .line 222
    new-instance v6, La/jjh0;

    .line 223
    .line 224
    const/4 v10, 0x0

    .line 225
    const/16 v11, 0x1c

    .line 226
    .line 227
    const/4 v5, 0x1

    .line 228
    const-class v7, La/zuh0;

    .line 229
    .line 230
    const-string v8, "onError"

    .line 231
    .line 232
    const-string v9, "onError(Ljava/lang/Throwable;)V"

    .line 233
    .line 234
    move-object/from16 v23, v6

    .line 235
    .line 236
    move-object v6, v4

    .line 237
    move-object/from16 v4, v23

    .line 238
    .line 239
    invoke-direct/range {v4 .. v11}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 240
    .line 241
    .line 242
    move-object v7, v4

    .line 243
    move-object v4, v6

    .line 244
    new-instance v0, La/ah0;

    .line 245
    .line 246
    const/4 v5, 0x0

    .line 247
    const/16 v6, 0x13

    .line 248
    .line 249
    move-object/from16 v1, p1

    .line 250
    .line 251
    move-object/from16 v2, p2

    .line 252
    .line 253
    invoke-direct/range {v0 .. v6}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 254
    .line 255
    .line 256
    const/16 v10, 0xa

    .line 257
    .line 258
    move-object v4, v7

    .line 259
    const/4 v7, 0x0

    .line 260
    move-object v9, v0

    .line 261
    move-object v6, v4

    .line 262
    move-object v5, v12

    .line 263
    move-object v8, v13

    .line 264
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :pswitch_3
    check-cast v0, La/joh0;

    .line 269
    .line 270
    sget-object v1, La/joh0;->N1:La/eke0;

    .line 271
    .line 272
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, La/joh0;->H0()La/iph0;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    iget-object v0, v4, La/iph0;->s:La/mne;

    .line 291
    .line 292
    iget-object v13, v0, La/mne;->a:La/rwj;

    .line 293
    .line 294
    new-instance v6, La/jjh0;

    .line 295
    .line 296
    const/4 v10, 0x0

    .line 297
    const/16 v11, 0xb

    .line 298
    .line 299
    const/4 v5, 0x1

    .line 300
    const-class v7, La/iph0;

    .line 301
    .line 302
    const-string v8, "onError"

    .line 303
    .line 304
    const-string v9, "onError(Ljava/lang/Throwable;)V"

    .line 305
    .line 306
    move-object/from16 v23, v6

    .line 307
    .line 308
    move-object v6, v4

    .line 309
    move-object/from16 v4, v23

    .line 310
    .line 311
    invoke-direct/range {v4 .. v11}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 312
    .line 313
    .line 314
    move-object v7, v4

    .line 315
    move-object v4, v6

    .line 316
    new-instance v0, La/ah0;

    .line 317
    .line 318
    const/4 v5, 0x0

    .line 319
    const/16 v6, 0x11

    .line 320
    .line 321
    move-object/from16 v1, p1

    .line 322
    .line 323
    move-object/from16 v2, p2

    .line 324
    .line 325
    invoke-direct/range {v0 .. v6}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 326
    .line 327
    .line 328
    const/16 v10, 0xa

    .line 329
    .line 330
    move-object v4, v7

    .line 331
    const/4 v7, 0x0

    .line 332
    move-object v9, v0

    .line 333
    move-object v6, v4

    .line 334
    move-object v5, v12

    .line 335
    move-object v8, v13

    .line 336
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :pswitch_4
    move-object/from16 v2, p2

    .line 341
    .line 342
    check-cast v0, La/avg0;

    .line 343
    .line 344
    sget-object v3, La/avg0;->P1:La/cge0;

    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    const-string v3, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 350
    .line 351
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-nez v2, :cond_7

    .line 356
    .line 357
    goto :goto_3

    .line 358
    :cond_7
    const-string v2, "BET_SALE_CONFIRM_REQUEST"

    .line 359
    .line 360
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-eqz v1, :cond_8

    .line 365
    .line 366
    invoke-virtual {v0}, La/avg0;->H0()La/k3t0;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    sget-object v1, La/qtg0;->a:La/qtg0;

    .line 371
    .line 372
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :cond_8
    :goto_3
    return-void

    .line 376
    :pswitch_5
    move-object/from16 v2, p2

    .line 377
    .line 378
    check-cast v0, La/bfe0;

    .line 379
    .line 380
    sget-object v1, La/bfe0;->R1:La/rl70;

    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, La/bfe0;->G0()La/k3t0;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    sget-object v1, La/jee0;->a:La/jee0;

    .line 390
    .line 391
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :pswitch_6
    move-object/from16 v2, p2

    .line 396
    .line 397
    check-cast v0, La/h6d0;

    .line 398
    .line 399
    sget-object v1, La/h6d0;->Q1:La/nh70;

    .line 400
    .line 401
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, La/h6d0;->J0()La/r6d0;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    iget-object v1, v0, La/r6d0;->j:La/bby;

    .line 409
    .line 410
    if-eqz v1, :cond_9

    .line 411
    .line 412
    invoke-interface {v1, v13}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 413
    .line 414
    .line 415
    :cond_9
    iget-object v3, v0, La/r6d0;->k:La/p7m0;

    .line 416
    .line 417
    :cond_a
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    move-object v1, v0

    .line 422
    check-cast v1, La/o6d0;

    .line 423
    .line 424
    const/16 v2, 0x9

    .line 425
    .line 426
    invoke-static {v1, v13, v10, v10, v2}, La/o6d0;->a(La/o6d0;La/j6d0;ZZI)La/o6d0;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-eqz v0, :cond_a

    .line 435
    .line 436
    return-void

    .line 437
    :pswitch_7
    move-object/from16 v2, p2

    .line 438
    .line 439
    check-cast v0, La/ukc0;

    .line 440
    .line 441
    sget-object v3, La/ukc0;->Q1:[La/iiy;

    .line 442
    .line 443
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    if-nez v2, :cond_b

    .line 451
    .line 452
    goto :goto_5

    .line 453
    :cond_b
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    const-string v3, "NEED_SHOW_GAME_NOT_FINISHED_DIALOG"

    .line 458
    .line 459
    if-eqz v2, :cond_c

    .line 460
    .line 461
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    invoke-virtual {v0}, La/ukc0;->G0()La/clc0;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    iget-object v0, v0, La/clc0;->h:La/lef0;

    .line 470
    .line 471
    xor-int/2addr v1, v12

    .line 472
    iget-object v0, v0, La/lef0;->a:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, La/tnc0;

    .line 475
    .line 476
    iget-object v0, v0, La/tnc0;->b:La/dnc0;

    .line 477
    .line 478
    iget-object v0, v0, La/dnc0;->a:La/q7d0;

    .line 479
    .line 480
    invoke-virtual {v0, v3, v1}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 481
    .line 482
    .line 483
    goto :goto_5

    .line 484
    :cond_c
    invoke-virtual {v1, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_d

    .line 489
    .line 490
    invoke-virtual {v1, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    invoke-virtual {v0}, La/ukc0;->G0()La/clc0;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    iget-object v2, v0, La/clc0;->h:La/lef0;

    .line 499
    .line 500
    xor-int/2addr v1, v12

    .line 501
    iget-object v2, v2, La/lef0;->a:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v2, La/tnc0;

    .line 504
    .line 505
    iget-object v2, v2, La/tnc0;->b:La/dnc0;

    .line 506
    .line 507
    iget-object v2, v2, La/dnc0;->a:La/q7d0;

    .line 508
    .line 509
    invoke-virtual {v2, v3, v1}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 510
    .line 511
    .line 512
    iget-object v0, v0, La/clc0;->b:La/i1w0;

    .line 513
    .line 514
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    new-instance v2, La/c8d;

    .line 519
    .line 520
    sget-object v3, La/y7d;->a:La/v7d;

    .line 521
    .line 522
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 523
    .line 524
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 525
    .line 526
    .line 527
    invoke-static {v1, v2, v0, v1, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    :goto_4
    move-object v2, v1

    .line 532
    check-cast v2, La/paw;

    .line 533
    .line 534
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    if-eqz v3, :cond_d

    .line 539
    .line 540
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    check-cast v2, La/oe50;

    .line 545
    .line 546
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 547
    .line 548
    .line 549
    goto :goto_4

    .line 550
    :cond_d
    :goto_5
    return-void

    .line 551
    :pswitch_8
    move-object/from16 v2, p2

    .line 552
    .line 553
    move-object v7, v0

    .line 554
    check-cast v7, La/vic0;

    .line 555
    .line 556
    sget-object v0, La/vic0;->S1:[La/iiy;

    .line 557
    .line 558
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    const-string v0, "BONUS_BOUGHT_REQUEST_KEY"

    .line 562
    .line 563
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-nez v0, :cond_e

    .line 568
    .line 569
    goto/16 :goto_6

    .line 570
    .line 571
    :cond_e
    const-string v0, "BONUS_BOUGHT_RESULT_KEY_USER_ID"

    .line 572
    .line 573
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    if-eqz v2, :cond_f

    .line 578
    .line 579
    new-instance v14, La/k390;

    .line 580
    .line 581
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 582
    .line 583
    .line 584
    move-result-wide v15

    .line 585
    const-string v0, "BONUS_BOUGHT_RESULT_KEY_ACCOUNT_ID"

    .line 586
    .line 587
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 588
    .line 589
    .line 590
    move-result-wide v17

    .line 591
    const-string v0, "BONUS_BOUGHT_RESULT_KEY_ACCOUNT_BALANCE"

    .line 592
    .line 593
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 594
    .line 595
    .line 596
    move-result-wide v19

    .line 597
    const-string v0, "BONUS_BOUGHT_RESULT_KEY_BONUS_BALANCE"

    .line 598
    .line 599
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 600
    .line 601
    .line 602
    move-result v21

    .line 603
    const-string v0, "BONUS_BOUGHT_RESULT_KEY_ROTATION_COUNT"

    .line 604
    .line 605
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 606
    .line 607
    .line 608
    move-result v22

    .line 609
    invoke-direct/range {v14 .. v22}, La/k390;-><init>(JJDII)V

    .line 610
    .line 611
    .line 612
    const-string v0, "BONUS_BOUGHT_RESULT_KEY_BOUGHT_COUNT"

    .line 613
    .line 614
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 615
    .line 616
    .line 617
    move-result v5

    .line 618
    invoke-virtual {v7}, La/vic0;->G0()La/wic0;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    iget-object v0, v0, La/wic0;->e:Landroid/widget/TextView;

    .line 623
    .line 624
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 632
    .line 633
    .line 634
    new-instance v0, Landroid/graphics/Rect;

    .line 635
    .line 636
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 637
    .line 638
    .line 639
    new-instance v1, Landroid/graphics/Rect;

    .line 640
    .line 641
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 642
    .line 643
    .line 644
    new-instance v9, Landroid/graphics/Rect;

    .line 645
    .line 646
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v7}, La/vic0;->G0()La/wic0;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    iget-object v2, v2, La/wic0;->c:Landroid/widget/FrameLayout;

    .line 654
    .line 655
    invoke-virtual {v2, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 656
    .line 657
    .line 658
    invoke-virtual {v7}, La/vic0;->G0()La/wic0;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    iget-object v2, v2, La/wic0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 663
    .line 664
    invoke-virtual {v2, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 665
    .line 666
    .line 667
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 668
    .line 669
    neg-int v2, v2

    .line 670
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 671
    .line 672
    neg-int v3, v3

    .line 673
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 674
    .line 675
    .line 676
    iget-object v2, v7, La/vic0;->N1:Landroid/graphics/Rect;

    .line 677
    .line 678
    invoke-virtual {v9, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 679
    .line 680
    .line 681
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 682
    .line 683
    neg-int v2, v2

    .line 684
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 685
    .line 686
    neg-int v1, v1

    .line 687
    invoke-virtual {v9, v2, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v7}, La/vic0;->G0()La/wic0;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    iget-object v6, v1, La/wic0;->e:Landroid/widget/TextView;

    .line 695
    .line 696
    invoke-virtual {v7}, La/vic0;->G0()La/wic0;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    iget-object v8, v1, La/wic0;->h:Landroid/widget/TextView;

    .line 701
    .line 702
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 707
    .line 708
    int-to-float v2, v2

    .line 709
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 714
    .line 715
    int-to-float v0, v0

    .line 716
    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->y(F)Landroid/view/ViewPropertyAnimator;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    const/4 v1, 0x0

    .line 721
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    const-wide/16 v1, 0x64

    .line 726
    .line 727
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 728
    .line 729
    .line 730
    new-instance v1, La/x73;

    .line 731
    .line 732
    new-instance v3, La/lc0;

    .line 733
    .line 734
    const/4 v4, 0x3

    .line 735
    invoke-direct/range {v3 .. v9}, La/lc0;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    const/16 v2, 0xb

    .line 739
    .line 740
    invoke-direct {v1, v13, v3, v2}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 744
    .line 745
    .line 746
    iput-object v0, v7, La/vic0;->P1:Landroid/view/ViewPropertyAnimator;

    .line 747
    .line 748
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v7}, La/vic0;->H0()La/hjc0;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v0}, La/hjc0;->x()V

    .line 756
    .line 757
    .line 758
    new-instance v1, La/e16;

    .line 759
    .line 760
    invoke-direct {v1, v14}, La/e16;-><init>(La/k390;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v0, v1}, La/hjc0;->w(La/i16;)V

    .line 764
    .line 765
    .line 766
    :cond_f
    :goto_6
    return-void

    .line 767
    :pswitch_9
    move-object/from16 v2, p2

    .line 768
    .line 769
    check-cast v0, La/u6b0;

    .line 770
    .line 771
    sget-object v3, La/u6b0;->e2:La/xi70;

    .line 772
    .line 773
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v0}, La/u6b0;->J0()La/sbb0;

    .line 784
    .line 785
    .line 786
    move-result-object v4

    .line 787
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 788
    .line 789
    .line 790
    move-result-object v9

    .line 791
    iget-object v0, v4, La/sbb0;->q:La/mne;

    .line 792
    .line 793
    iget-object v12, v0, La/mne;->a:La/rwj;

    .line 794
    .line 795
    new-instance v10, La/gab0;

    .line 796
    .line 797
    invoke-direct {v10, v4, v8}, La/gab0;-><init>(La/sbb0;B)V

    .line 798
    .line 799
    .line 800
    new-instance v13, La/ah0;

    .line 801
    .line 802
    const/4 v5, 0x0

    .line 803
    const/16 v6, 0xe

    .line 804
    .line 805
    move-object v0, v13

    .line 806
    invoke-direct/range {v0 .. v6}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 807
    .line 808
    .line 809
    const/16 v14, 0xa

    .line 810
    .line 811
    const/4 v11, 0x0

    .line 812
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 813
    .line 814
    .line 815
    return-void

    .line 816
    :pswitch_a
    move-object/from16 v2, p2

    .line 817
    .line 818
    check-cast v0, La/d2b0;

    .line 819
    .line 820
    sget-object v1, La/d2b0;->S1:La/rl70;

    .line 821
    .line 822
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    iget-object v0, v0, La/d2b0;->L1:La/a8z;

    .line 826
    .line 827
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    check-cast v0, La/k3t0;

    .line 832
    .line 833
    sget-object v1, La/a2b0;->a:La/a2b0;

    .line 834
    .line 835
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    return-void

    .line 839
    :pswitch_b
    move-object/from16 v2, p2

    .line 840
    .line 841
    check-cast v0, La/ou80;

    .line 842
    .line 843
    sget-object v1, La/ou80;->V1:La/rl70;

    .line 844
    .line 845
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v0}, La/ou80;->G0()La/k3t0;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    sget-object v1, La/wt80;->a:La/wt80;

    .line 853
    .line 854
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :pswitch_c
    move-object/from16 v2, p2

    .line 859
    .line 860
    check-cast v0, La/as80;

    .line 861
    .line 862
    sget-object v1, La/as80;->Y1:La/fl70;

    .line 863
    .line 864
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0}, La/as80;->H0()La/jt80;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    sget-object v1, La/fr80;->a:La/fr80;

    .line 872
    .line 873
    invoke-virtual {v0, v1}, La/jt80;->b0(La/lr80;)V

    .line 874
    .line 875
    .line 876
    return-void

    .line 877
    :pswitch_d
    move-object/from16 v2, p2

    .line 878
    .line 879
    check-cast v0, La/kc80;

    .line 880
    .line 881
    sget-object v1, La/kc80;->O1:La/nh70;

    .line 882
    .line 883
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    iget-object v0, v0, La/kc80;->M1:La/kiu0;

    .line 887
    .line 888
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    check-cast v0, La/fho0;

    .line 893
    .line 894
    invoke-virtual {v0}, La/fho0;->B()V

    .line 895
    .line 896
    .line 897
    return-void

    .line 898
    :pswitch_e
    move-object/from16 v2, p2

    .line 899
    .line 900
    check-cast v0, La/bn70;

    .line 901
    .line 902
    sget-object v3, La/bn70;->S1:[La/iiy;

    .line 903
    .line 904
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v2

    .line 911
    if-nez v2, :cond_10

    .line 912
    .line 913
    goto :goto_7

    .line 914
    :cond_10
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 915
    .line 916
    .line 917
    move-result v2

    .line 918
    const-string v3, "SHOW_GAME_IS_NOT_FINISHED_DIALOG"

    .line 919
    .line 920
    if-eqz v2, :cond_11

    .line 921
    .line 922
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 923
    .line 924
    .line 925
    move-result v1

    .line 926
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    iget-object v0, v0, La/to70;->p:La/xsi0;

    .line 931
    .line 932
    xor-int/2addr v1, v12

    .line 933
    iget-object v0, v0, La/xsi0;->a:La/pbt;

    .line 934
    .line 935
    iget-object v0, v0, La/pbt;->b:La/lsn;

    .line 936
    .line 937
    iget-object v0, v0, La/lsn;->a:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v0, Landroid/content/SharedPreferences;

    .line 940
    .line 941
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 950
    .line 951
    .line 952
    goto :goto_7

    .line 953
    :cond_11
    invoke-virtual {v1, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    if-eqz v2, :cond_12

    .line 958
    .line 959
    invoke-virtual {v1, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 960
    .line 961
    .line 962
    move-result v1

    .line 963
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    iget-object v2, v0, La/to70;->p:La/xsi0;

    .line 968
    .line 969
    xor-int/2addr v1, v12

    .line 970
    iget-object v2, v2, La/xsi0;->a:La/pbt;

    .line 971
    .line 972
    iget-object v2, v2, La/pbt;->b:La/lsn;

    .line 973
    .line 974
    iget-object v2, v2, La/lsn;->a:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast v2, Landroid/content/SharedPreferences;

    .line 977
    .line 978
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 987
    .line 988
    .line 989
    new-instance v1, La/iy5;

    .line 990
    .line 991
    sget-object v2, La/csr;->e:La/csr;

    .line 992
    .line 993
    invoke-direct {v1, v2}, La/iy5;-><init>(La/csr;)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v0, v1}, La/to70;->w(La/zy5;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v0}, La/to70;->A()V

    .line 1000
    .line 1001
    .line 1002
    :cond_12
    :goto_7
    return-void

    .line 1003
    :pswitch_f
    move-object/from16 v2, p2

    .line 1004
    .line 1005
    check-cast v0, La/y370;

    .line 1006
    .line 1007
    sget-object v3, La/y370;->Y1:La/wsz;

    .line 1008
    .line 1009
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1010
    .line 1011
    .line 1012
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    return-void

    .line 1016
    :pswitch_10
    move-object/from16 v2, p2

    .line 1017
    .line 1018
    check-cast v0, La/p170;

    .line 1019
    .line 1020
    sget-object v5, La/p170;->Q1:La/xuz;

    .line 1021
    .line 1022
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v2

    .line 1029
    if-nez v2, :cond_13

    .line 1030
    .line 1031
    goto :goto_9

    .line 1032
    :cond_13
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v2

    .line 1036
    if-eqz v2, :cond_15

    .line 1037
    .line 1038
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1039
    .line 1040
    if-lt v2, v9, :cond_14

    .line 1041
    .line 1042
    invoke-static {v1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v1

    .line 1046
    check-cast v1, La/ql5;

    .line 1047
    .line 1048
    goto :goto_8

    .line 1049
    :cond_14
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    check-cast v1, La/ql5;

    .line 1057
    .line 1058
    :goto_8
    if-eqz v1, :cond_15

    .line 1059
    .line 1060
    invoke-virtual {v0}, La/p170;->G0()La/k3t0;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    new-instance v2, La/e170;

    .line 1065
    .line 1066
    invoke-direct {v2, v1}, La/e170;-><init>(La/ql5;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1070
    .line 1071
    .line 1072
    :cond_15
    :goto_9
    return-void

    .line 1073
    :pswitch_11
    move-object/from16 v2, p2

    .line 1074
    .line 1075
    check-cast v0, La/ez60;

    .line 1076
    .line 1077
    sget-object v3, La/ez60;->S1:[La/iiy;

    .line 1078
    .line 1079
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1080
    .line 1081
    .line 1082
    const-string v3, "CHANGE_TAB_REQUEST_KEY"

    .line 1083
    .line 1084
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    move-result v2

    .line 1088
    if-nez v2, :cond_16

    .line 1089
    .line 1090
    goto :goto_c

    .line 1091
    :cond_16
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1092
    .line 1093
    if-lt v2, v9, :cond_17

    .line 1094
    .line 1095
    invoke-static {v1}, La/r6e;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    goto :goto_b

    .line 1100
    :cond_17
    const-string v2, "CHANGE_TAB_ARG"

    .line 1101
    .line 1102
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    instance-of v2, v1, La/t270;

    .line 1107
    .line 1108
    if-nez v2, :cond_18

    .line 1109
    .line 1110
    goto :goto_a

    .line 1111
    :cond_18
    move-object v13, v1

    .line 1112
    :goto_a
    move-object v1, v13

    .line 1113
    check-cast v1, La/t270;

    .line 1114
    .line 1115
    :goto_b
    check-cast v1, La/t270;

    .line 1116
    .line 1117
    if-eqz v1, :cond_19

    .line 1118
    .line 1119
    invoke-virtual {v0}, La/ez60;->H0()La/g670;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    invoke-static {v1}, La/x0x;->V(La/t270;)Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v1

    .line 1127
    invoke-virtual {v0, v1, v12, v10}, La/g670;->w(Ljava/lang/String;ZZ)V

    .line 1128
    .line 1129
    .line 1130
    :cond_19
    :goto_c
    return-void

    .line 1131
    :pswitch_12
    move-object/from16 v2, p2

    .line 1132
    .line 1133
    check-cast v0, La/gx60;

    .line 1134
    .line 1135
    sget-object v5, La/gx60;->R1:La/atz;

    .line 1136
    .line 1137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v2

    .line 1144
    if-nez v2, :cond_1a

    .line 1145
    .line 1146
    goto :goto_d

    .line 1147
    :cond_1a
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v2

    .line 1151
    if-eqz v2, :cond_1b

    .line 1152
    .line 1153
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    check-cast v1, La/ql5;

    .line 1161
    .line 1162
    invoke-virtual {v0}, La/gx60;->G0()La/k3t0;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    new-instance v2, La/xw60;

    .line 1167
    .line 1168
    invoke-direct {v2, v1}, La/xw60;-><init>(La/ql5;)V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1172
    .line 1173
    .line 1174
    :cond_1b
    :goto_d
    return-void

    .line 1175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
