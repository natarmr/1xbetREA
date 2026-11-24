.class public La/zlt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/u73;
.implements La/w7;
.implements La/efw0;
.implements La/mff0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/gii0;B)V
    .locals 1

    iput-byte p2, p0, La/zlt0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance p2, La/lkr0;

    const/16 v0, 0x18

    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    iput-object p2, p0, La/zlt0;->b:Ljava/lang/Object;

    return-void

    .line 95
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance p2, La/lkr0;

    const/16 v0, 0x1a

    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    iput-object p2, p0, La/zlt0;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/nfq;)V
    .locals 5

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    iput-byte v0, p0, La/zlt0;->a:B

    .line 4
    .line 5
    invoke-virtual {p1}, La/nfq;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, La/nfq;->a:Landroid/content/Context;

    .line 9
    .line 10
    new-instance v1, La/tlw0;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v2, La/tlw0;->e:La/zz2;

    .line 16
    .line 17
    const-string v3, "Initializing TokenRefresher"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    new-array v4, v4, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v2, v3, v4}, La/zz2;->K(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Landroid/os/HandlerThread;

    .line 26
    .line 27
    const-string v3, "TokenRefresher"

    .line 28
    .line 29
    const/16 v4, 0xa

    .line 30
    .line 31
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 35
    .line 36
    .line 37
    new-instance v3, La/jaw0;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v3, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    iput-object v3, v1, La/tlw0;->c:La/jaw0;

    .line 50
    .line 51
    new-instance v2, La/mfr;

    .line 52
    .line 53
    invoke-virtual {p1}, La/nfq;->a()V

    .line 54
    .line 55
    .line 56
    iget-object p1, p1, La/nfq;->b:Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct {v2, v1, p1}, La/mfr;-><init>(La/tlw0;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, v1, La/tlw0;->d:La/mfr;

    .line 62
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Landroid/app/Application;

    .line 73
    .line 74
    invoke-static {p1}, La/fc5;->b(Landroid/app/Application;)V

    .line 75
    .line 76
    .line 77
    sget-object p1, La/fc5;->e:La/fc5;

    .line 78
    .line 79
    new-instance v0, La/g9w0;

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    invoke-direct {v0, p0, v1}, La/g9w0;-><init>(Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, La/fc5;->a(La/ec5;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public constructor <init>(La/p4;)V
    .locals 1

    const/16 v0, 0xc

    iput-byte v0, p0, La/zlt0;->a:B

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    sget-object v0, La/lkw0;->a:[B

    iput-object p1, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 92
    iput-object p0, p1, La/p4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/td9;La/qg00;)V
    .locals 0

    const/16 p2, 0x9

    iput-byte p2, p0, La/zlt0;->a:B

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, La/zlt0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 89
    iput-byte p2, p0, La/zlt0;->a:B

    iput-object p1, p0, La/zlt0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/dgw0;

    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->b:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    const-string v2, "MISSING_MFA_PENDING_CREDENTIAL"

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 19
    .line 20
    const/16 v0, 0x42b9

    .line 21
    .line 22
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    const-string v2, "MISSING_MFA_ENROLLMENT_ID"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 36
    .line 37
    const/16 v0, 0x42ba

    .line 38
    .line 39
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :cond_1
    const-string v2, "INVALID_MFA_PENDING_CREDENTIAL"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 53
    .line 54
    const/16 v0, 0x42bb

    .line 55
    .line 56
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_2
    const-string v2, "MFA_ENROLLMENT_NOT_FOUND"

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 70
    .line 71
    const/16 v0, 0x42bc

    .line 72
    .line 73
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    const-string v2, "ADMIN_ONLY_OPERATION"

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 86
    .line 87
    const/16 v0, 0x42bd

    .line 88
    .line 89
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    const-string v2, "UNVERIFIED_EMAIL"

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 102
    .line 103
    const/16 v0, 0x42be

    .line 104
    .line 105
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    const-string v2, "SECOND_FACTOR_EXISTS"

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 118
    .line 119
    const/16 v0, 0x42bf

    .line 120
    .line 121
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    const-string v2, "SECOND_FACTOR_LIMIT_EXCEEDED"

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_7

    .line 132
    .line 133
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 134
    .line 135
    const/16 v0, 0x42c0

    .line 136
    .line 137
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_7
    const-string v2, "UNSUPPORTED_FIRST_FACTOR"

    .line 142
    .line 143
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_8

    .line 148
    .line 149
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 150
    .line 151
    const/16 v0, 0x42c1

    .line 152
    .line 153
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_8
    const-string v2, "EMAIL_CHANGE_NEEDS_VERIFICATION"

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_9

    .line 164
    .line 165
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 166
    .line 167
    const/16 v0, 0x42c2

    .line 168
    .line 169
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 170
    .line 171
    .line 172
    :cond_9
    :goto_0
    iget-byte v0, p0, La/dgw0;->a:B

    .line 173
    .line 174
    const/16 v2, 0x8

    .line 175
    .line 176
    if-eq v0, v2, :cond_b

    .line 177
    .line 178
    iget-object v0, p0, La/dgw0;->f:La/amw0;

    .line 179
    .line 180
    if-eqz v0, :cond_a

    .line 181
    .line 182
    invoke-interface {v0, p1}, La/amw0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 183
    .line 184
    .line 185
    :cond_a
    invoke-virtual {p0, p1}, La/dgw0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_b
    const/4 p1, 0x1

    .line 190
    iput-boolean p1, p0, La/dgw0;->m:Z

    .line 191
    .line 192
    throw v1
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 6
    .line 7
    check-cast p1, La/rxw;

    .line 8
    .line 9
    new-instance v0, La/lmx;

    .line 10
    .line 11
    invoke-direct {v0, p2}, La/lmx;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/uuw;

    .line 19
    .line 20
    new-instance p2, Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 21
    .line 22
    const/4 v1, -0x1

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {p2, v1, v1, v2, v3}, Lcom/google/android/gms/common/api/ComplianceOptions;-><init>(IIIZ)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lcom/google/android/gms/common/api/ApiMetadata;

    .line 29
    .line 30
    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/common/api/ApiMetadata;-><init>(Lcom/google/android/gms/common/api/ComplianceOptions;Z)V

    .line 31
    .line 32
    .line 33
    iput-boolean v2, v1, Lcom/google/android/gms/common/api/ApiMetadata;->c:Z

    .line 34
    .line 35
    check-cast p1, La/suw;

    .line 36
    .line 37
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const-string v4, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService"

    .line 42
    .line 43
    invoke-virtual {p2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget v4, La/onw0;->a:I

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p0}, La/onw0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v1}, La/onw0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :try_start_0
    iget-object p1, p1, La/suw;->a:Landroid/os/IBinder;

    .line 62
    .line 63
    invoke-interface {p1, v3, p2, p0, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 81
    .line 82
    .line 83
    throw p1
.end method

.method public b(Lcom/google/android/gms/common/api/Status;Lcom/google/firebase/auth/PhoneAuthCredential;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/dgw0;

    .line 4
    .line 5
    iget-byte v0, p0, La/dgw0;->a:B

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Unexpected response type "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, La/s0x;->J(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, La/dgw0;->f:La/amw0;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0, p1}, La/amw0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iput-object p2, p0, La/dgw0;->j:Lcom/google/firebase/auth/AuthCredential;

    .line 38
    .line 39
    iget-object p2, p0, La/dgw0;->f:La/amw0;

    .line 40
    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    invoke-interface {p2, p1}, La/amw0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, p1}, La/dgw0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public c(La/cmt0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/dgw0;

    .line 4
    .line 5
    iput-object p1, p0, La/dgw0;->k:La/cmt0;

    .line 6
    .line 7
    const-string p1, "REQUIRES_SECOND_FACTOR_AUTH"

    .line 8
    .line 9
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, La/dgw0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public d(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;La/biw0;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/dgw0;

    .line 4
    .line 5
    iget-byte v0, p0, La/dgw0;->a:B

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Unexpected response type: "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, La/s0x;->J(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/dgw0;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 31
    .line 32
    iput-object p2, p0, La/dgw0;->i:La/biw0;

    .line 33
    .line 34
    invoke-virtual {p0}, La/dgw0;->e()V

    .line 35
    .line 36
    .line 37
    iget-boolean p0, p0, La/dgw0;->m:Z

    .line 38
    .line 39
    const-string p1, "no success or failure set on method implementation"

    .line 40
    .line 41
    invoke-static {p1, p0}, La/s0x;->J(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public e(Landroid/view/View;)Z
    .locals 2

    .line 1
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/fht0;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    sub-int/2addr p1, v0

    .line 13
    iget-object p0, p0, La/fht0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->r:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->f(IZ)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return v0
.end method

.method public f(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/dgw0;

    .line 4
    .line 5
    iget-byte v0, p0, La/dgw0;->a:B

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "Unexpected response type: "

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0, v1}, La/s0x;->J(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/dgw0;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 30
    .line 31
    invoke-virtual {p0}, La/dgw0;->e()V

    .line 32
    .line 33
    .line 34
    iget-boolean p0, p0, La/dgw0;->m:Z

    .line 35
    .line 36
    const-string p1, "no success or failure set on method implementation"

    .line 37
    .line 38
    invoke-static {p1, p0}, La/s0x;->J(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public g(Ljava/lang/String;Z)Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/z220;

    .line 4
    .line 5
    iget-object p0, p0, La/z220;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/eja0;

    .line 8
    .line 9
    iget-object p0, p0, La/eja0;->b:La/fja0;

    .line 10
    .line 11
    iget-object p0, p0, La/fja0;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, La/z5i0;

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    iget-object v1, v1, La/z5i0;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v1, v1, La/z5i0;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-eqz v1, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const/4 v0, 0x0

    .line 54
    :goto_1
    check-cast v0, La/z5i0;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object p0, v0, La/z5i0;->e:Ljava/util/List;

    .line 59
    .line 60
    if-eqz p0, :cond_4

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_4
    sget-object p0, La/iun;->a:La/iun;

    .line 64
    .line 65
    return-object p0
.end method

.method public get(I)La/xkq;
    .locals 0

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/xkq;

    .line 4
    .line 5
    return-object p0
.end method

.method public h(La/fht0;)V
    .locals 2

    .line 1
    iget-object v0, p1, La/fht0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/common/api/Status;

    .line 4
    .line 5
    iget-object p1, p1, La/fht0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lcom/google/firebase/auth/zzc;

    .line 8
    .line 9
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/dgw0;

    .line 12
    .line 13
    iget-object v1, p0, La/dgw0;->f:La/amw0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v1, v0}, La/amw0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object p1, p0, La/dgw0;->j:Lcom/google/firebase/auth/AuthCredential;

    .line 21
    .line 22
    iget-object p1, p0, La/dgw0;->f:La/amw0;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1, v0}, La/amw0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0, v0}, La/dgw0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public i(La/jiw0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/dgw0;

    .line 4
    .line 5
    iput-object p1, p0, La/dgw0;->l:La/jiw0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/dgw0;->e()V

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, La/dgw0;->m:Z

    .line 11
    .line 12
    const-string p1, "no success or failure set on method implementation"

    .line 13
    .line 14
    invoke-static {p1, p0}, La/s0x;->J(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public j()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vlk;

    .line 4
    .line 5
    iget-object p0, p0, La/vlk;->a:La/vwb0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "autoMaximum"

    .line 9
    .line 10
    invoke-static {p0, v1, v0}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public k()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vlk;

    .line 4
    .line 5
    iget-object p0, p0, La/vlk;->a:La/vwb0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "vipBet"

    .line 9
    .line 10
    invoke-static {p0, v1, v0}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public l()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vlk;

    .line 4
    .line 5
    iget-object p0, p0, La/vlk;->a:La/vwb0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "dropOnScoreChange"

    .line 9
    .line 10
    invoke-static {p0, v1, v0}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public m()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vlk;

    .line 4
    .line 5
    iget-object p0, p0, La/vlk;->a:La/vwb0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "fromLineToLive"

    .line 9
    .line 10
    invoke-static {p0, v1, v0}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public n()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vlk;

    .line 4
    .line 5
    iget-object p0, p0, La/vlk;->a:La/vwb0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "subscribeOnBetUpdates"

    .line 9
    .line 10
    invoke-static {p0, v1, v0}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-interface {p0, v0}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setPaymentRequestEnabled(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public p(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-byte v0, p0, La/zlt0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    check-cast v1, La/m6x0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, v1, La/m6x0;->l:La/kxw0;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 21
    .line 22
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/uuw0;->g:La/quw0;

    .line 26
    .line 27
    const-string p1, "AppId not known when logging event"

    .line 28
    .line 29
    invoke-virtual {p0, p3, p1}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1}, La/m6x0;->J()La/fxw0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, La/pb90;

    .line 38
    .line 39
    const/16 v7, 0x10

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    move-object v2, p0

    .line 43
    move-object v5, p1

    .line 44
    move-object v3, p2

    .line 45
    move-object v4, p3

    .line 46
    invoke-direct/range {v1 .. v7}, La/pb90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, La/fxw0;->v1(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void

    .line 53
    :pswitch_0
    move-object v5, p1

    .line 54
    move-object v3, p2

    .line 55
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    check-cast v1, La/b1x0;

    .line 60
    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    const-string p0, "auto"

    .line 64
    .line 65
    const-string p1, "_err"

    .line 66
    .line 67
    invoke-virtual {v1, v5, p0, p1}, La/b1x0;->p1(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const-string p0, "Unexpected call on client side"

    .line 72
    .line 73
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public q(ILjava/lang/Object;La/dlw0;)V
    .locals 2

    .line 1
    check-cast p2, La/ojw0;

    .line 2
    .line 3
    iget-object v0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/p4;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-virtual {v0, p1, v1}, La/p4;->h1(II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p3}, La/ojw0;->b(La/dlw0;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v0, p1}, La/p4;->g1(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p3, p2, p0}, La/dlw0;->c(Ljava/lang/Object;La/zlt0;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public r(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/kxw0;

    .line 4
    .line 5
    iget-object v0, p0, La/kxw0;->g:La/fxw0;

    .line 6
    .line 7
    iget-object v1, p0, La/kxw0;->e:La/wvw0;

    .line 8
    .line 9
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/kxw0;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v0, Landroid/net/Uri$Builder;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_2

    .line 78
    .line 79
    invoke-static {v1}, La/kxw0;->e(La/p4;)V

    .line 80
    .line 81
    .line 82
    iget-object p2, v1, La/wvw0;->x:La/o24;

    .line 83
    .line 84
    invoke-virtual {p2, p1}, La/o24;->u(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, v1, La/wvw0;->y:La/rvw0;

    .line 88
    .line 89
    iget-object p0, p0, La/kxw0;->k:La/lwf;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    invoke-virtual {p1, v0, v1}, La/rvw0;->b(J)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void
.end method

.method public s()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, La/zlt0;->t()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/kxw0;

    .line 11
    .line 12
    iget-object v0, p0, La/kxw0;->k:La/lwf;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-object v2, p0, La/kxw0;->e:La/wvw0;

    .line 22
    .line 23
    invoke-static {v2}, La/kxw0;->e(La/p4;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v2, La/wvw0;->y:La/rvw0;

    .line 27
    .line 28
    invoke-virtual {v2}, La/rvw0;->a()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    sub-long/2addr v0, v2

    .line 33
    iget-object p0, p0, La/kxw0;->d:La/bkw0;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    sget-object v3, La/btw0;->i0:La/atw0;

    .line 37
    .line 38
    invoke-virtual {p0, v2, v3}, La/bkw0;->u1(Ljava/lang/String;La/atw0;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    cmp-long p0, v0, v2

    .line 43
    .line 44
    if-lez p0, :cond_1

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public t()Z
    .locals 4

    .line 1
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/kxw0;

    .line 4
    .line 5
    iget-object p0, p0, La/kxw0;->e:La/wvw0;

    .line 6
    .line 7
    invoke-static {p0}, La/kxw0;->e(La/p4;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/wvw0;->y:La/rvw0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/rvw0;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long p0, v0, v2

    .line 19
    .line 20
    if-lez p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method
