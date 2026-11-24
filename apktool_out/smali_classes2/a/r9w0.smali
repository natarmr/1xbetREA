.class public final La/r9w0;
.super La/f9w0;
.source "SourceFile"

# interfaces
.implements La/qav;
.implements La/rav;


# static fields
.field public static final n:La/kmx;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public final d:La/kmx;

.field public final e:Ljava/util/Set;

.field public final f:La/qgd;

.field public l:La/buj0;

.field public m:La/qaj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/u9w0;->a:La/kmx;

    .line 2
    .line 3
    sput-object v0, La/r9w0;->n:La/kmx;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/jaw0;La/qgd;)V
    .locals 2

    .line 1
    const-string v0, "com.google.android.gms.signin.internal.ISignInCallbacks"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, La/f9w0;-><init>(Ljava/lang/String;B)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/r9w0;->b:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, La/r9w0;->c:Landroid/os/Handler;

    .line 10
    .line 11
    iput-object p3, p0, La/r9w0;->f:La/qgd;

    .line 12
    .line 13
    iget-object p1, p3, La/qgd;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/util/Set;

    .line 16
    .line 17
    iput-object p1, p0, La/r9w0;->e:Ljava/util/Set;

    .line 18
    .line 19
    sget-object p1, La/r9w0;->n:La/kmx;

    .line 20
    .line 21
    iput-object p1, p0, La/r9w0;->d:La/kmx;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/r9w0;->m:La/qaj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/qaj;->l(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onConnected()V
    .locals 9

    .line 1
    iget-object v0, p0, La/r9w0;->l:La/buj0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "<<default account>>"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    :try_start_0
    iget-object v5, v0, La/buj0;->C:La/qgd;

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v5, Landroid/accounts/Account;

    .line 17
    .line 18
    const-string v6, "com.google"

    .line 19
    .line 20
    invoke-direct {v5, v1, v6}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v6, v5, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, v0, La/hz5;->c:Landroid/content/Context;

    .line 32
    .line 33
    invoke-static {v1}, La/xqm0;->a(Landroid/content/Context;)La/xqm0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, La/xqm0;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move-object v1, v4

    .line 45
    :goto_0
    new-instance v6, Lcom/google/android/gms/common/internal/zay;

    .line 46
    .line 47
    iget-object v7, v0, La/buj0;->E:Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-static {v7}, La/s0x;->H(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const/4 v8, 0x2

    .line 57
    invoke-direct {v6, v8, v5, v7, v1}, Lcom/google/android/gms/common/internal/zay;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, La/hz5;->l()Landroid/os/IInterface;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/x9w0;

    .line 65
    .line 66
    new-instance v1, Lcom/google/android/gms/signin/internal/zai;

    .line 67
    .line 68
    invoke-direct {v1, v3, v6}, Lcom/google/android/gms/signin/internal/zai;-><init>(ILcom/google/android/gms/common/internal/zay;)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    iget-object v6, v0, La/y4w0;->c:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v5, v6}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sget v6, La/o9w0;->a:I

    .line 81
    .line 82
    invoke-virtual {v5, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v5, v2}, Lcom/google/android/gms/signin/internal/zai;->writeToParcel(Landroid/os/Parcel;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, p0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 92
    .line 93
    .line 94
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :try_start_1
    iget-object v0, v0, La/y4w0;->b:Landroid/os/IBinder;

    .line 96
    .line 97
    const/16 v6, 0xc

    .line 98
    .line 99
    invoke-interface {v0, v6, v5, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    :try_start_2
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 117
    .line 118
    .line 119
    throw v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 120
    :goto_1
    const-string v1, "Remote service probably died when signIn is called"

    .line 121
    .line 122
    const-string v5, "SignInClientImpl"

    .line 123
    .line 124
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    :try_start_3
    new-instance v1, Lcom/google/android/gms/signin/internal/zak;

    .line 128
    .line 129
    new-instance v6, Lcom/google/android/gms/common/ConnectionResult;

    .line 130
    .line 131
    const/16 v7, 0x8

    .line 132
    .line 133
    invoke-direct {v6, v7, v4, v4}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v1, v3, v6, v4}, Lcom/google/android/gms/signin/internal/zak;-><init>(ILcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/internal/zaaa;)V

    .line 137
    .line 138
    .line 139
    new-instance v3, La/lfr;

    .line 140
    .line 141
    const/16 v4, 0x16

    .line 142
    .line 143
    invoke-direct {v3, p0, v1, v2, v4}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 144
    .line 145
    .line 146
    iget-object p0, p0, La/r9w0;->c:Landroid/os/Handler;

    .line 147
    .line 148
    invoke-virtual {p0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catch_1
    const-string p0, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."

    .line 153
    .line 154
    invoke-static {v5, p0, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 155
    .line 156
    .line 157
    :goto_2
    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 2

    .line 1
    iget-object p0, p0, La/r9w0;->m:La/qaj;

    .line 2
    .line 3
    iget-object v0, p0, La/qaj;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/sav;

    .line 6
    .line 7
    iget-object v0, v0, La/sav;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    iget-object p0, p0, La/qaj;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/ua3;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/h9w0;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    iget-boolean v0, p0, La/h9w0;->n:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    .line 26
    .line 27
    const/16 v0, 0x11

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {p1, v0, v1, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, La/h9w0;->l(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-virtual {p0, p1}, La/h9w0;->onConnectionSuspended(I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method
