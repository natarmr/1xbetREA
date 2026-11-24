.class public final La/icf;
.super La/ecf;
.source "SourceFile"


# instance fields
.field public final d:Landroid/content/Context;

.field public e:La/ybf;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Landroid/os/CancellationSignal;

.field public final h:Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/icf;->d:Landroid/content/Context;

    .line 8
    .line 9
    new-instance p1, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;-><init>(La/icf;Landroid/os/Handler;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/icf;->h:Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/auth/api/identity/SignInCredential;)La/g0u;
    .locals 8

    .line 1
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/SignInCredential;->g:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p0, 0x3

    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz v2, :cond_5

    .line 6
    .line 7
    iget-object v1, p1, Lcom/google/android/gms/auth/api/identity/SignInCredential;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    iget-object v3, p1, Lcom/google/android/gms/auth/api/identity/SignInCredential;->b:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v3, v0

    .line 21
    :goto_0
    iget-object v4, p1, Lcom/google/android/gms/auth/api/identity/SignInCredential;->c:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    move-object v5, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v5, v0

    .line 28
    :goto_1
    iget-object v4, p1, Lcom/google/android/gms/auth/api/identity/SignInCredential;->d:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object v4, v0

    .line 34
    :goto_2
    iget-object v6, p1, Lcom/google/android/gms/auth/api/identity/SignInCredential;->h:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    move-object v7, v6

    .line 39
    goto :goto_3

    .line 40
    :cond_3
    move-object v7, v0

    .line 41
    :goto_3
    iget-object p1, p1, Lcom/google/android/gms/auth/api/identity/SignInCredential;->e:Landroid/net/Uri;

    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    move-object v6, p1

    .line 46
    goto :goto_4

    .line 47
    :cond_4
    move-object v6, v0

    .line 48
    :goto_4
    new-instance v0, La/tav;

    .line 49
    .line 50
    invoke-direct/range {v0 .. v7}, La/tav;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_5

    .line 54
    :catch_0
    new-instance p1, La/d0u;

    .line 55
    .line 56
    const-string v0, "When attempting to convert get response, null Google ID Token found"

    .line 57
    .line 58
    invoke-direct {p1, v0, p0}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_5
    const-string p1, "GetSignInIntent"

    .line 63
    .line 64
    const-string v1, "Credential returned but no google Id found"

    .line 65
    .line 66
    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    :goto_5
    if-eqz v0, :cond_6

    .line 70
    .line 71
    new-instance p0, La/g0u;

    .line 72
    .line 73
    invoke-direct {p0, v0}, La/g0u;-><init>(La/c2;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_6
    new-instance p1, La/d0u;

    .line 78
    .line 79
    const-string v0, "When attempting to convert get response, null credential found"

    .line 80
    .line 81
    invoke-direct {p1, v0, p0}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method public final d()La/ybf;
    .locals 0

    .line 1
    iget-object p0, p0, La/icf;->e:La/ybf;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "callback"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final e()Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, La/icf;->f:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "executor"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final f(La/f0u;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;La/ybf;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/icf;->g:Landroid/os/CancellationSignal;

    .line 11
    .line 12
    iput-object p4, p0, La/icf;->e:La/ybf;

    .line 13
    .line 14
    iput-object p3, p0, La/icf;->f:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    sget-object p3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    :try_start_0
    iget-object p1, p1, La/f0u;->a:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    const/4 p4, 0x1

    .line 36
    if-ne p3, p4, :cond_1

    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast p1, La/utu;

    .line 47
    .line 48
    iget-object v2, p1, La/utu;->d:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v0, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch La/h0u; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, La/icf;->d:Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {p1}, La/qxw;->F(Landroid/content/Context;)La/oaw0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v3, v0, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v3}, La/s0x;->H(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v5, p1, La/oaw0;->l:Ljava/lang/String;

    .line 72
    .line 73
    new-instance v1, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    .line 74
    .line 75
    iget v2, v0, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;->f:I

    .line 76
    .line 77
    iget-object v4, v0, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;->b:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v6, v0, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;->d:Ljava/lang/String;

    .line 80
    .line 81
    iget-boolean v7, v0, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;->e:Z

    .line 82
    .line 83
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    invoke-static {}, La/s9w0;->a()La/euo0;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    sget-object v0, La/x4d0;->q:Lcom/google/android/gms/common/Feature;

    .line 91
    .line 92
    filled-new-array {v0}, [Lcom/google/android/gms/common/Feature;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p4, La/euo0;->d:[Lcom/google/android/gms/common/Feature;

    .line 97
    .line 98
    new-instance v0, La/w4p0;

    .line 99
    .line 100
    invoke-direct {v0, p1, v1}, La/w4p0;-><init>(La/oaw0;Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p4, La/euo0;->a:La/mff0;

    .line 104
    .line 105
    const/16 v0, 0x613

    .line 106
    .line 107
    iput-char v0, p4, La/euo0;->e:C

    .line 108
    .line 109
    invoke-virtual {p4}, La/euo0;->a()La/s9w0;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    invoke-virtual {p1, p3, p4}, La/nav;->b(ILa/s9w0;)Lcom/google/android/gms/tasks/Task;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance p3, La/v4f;

    .line 118
    .line 119
    const/4 p4, 0x2

    .line 120
    invoke-direct {p3, p2, p0, p4}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 121
    .line 122
    .line 123
    new-instance p4, La/z9f;

    .line 124
    .line 125
    const/4 v0, 0x3

    .line 126
    invoke-direct {p4, p3, v0}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p4}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance p3, La/uq;

    .line 134
    .line 135
    const/16 p4, 0xa

    .line 136
    .line 137
    invoke-direct {p3, p0, p2, p4}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_1
    :try_start_1
    new-instance p1, La/h0u;

    .line 145
    .line 146
    const-string p3, "GetSignInWithGoogleOption cannot be combined with other options."

    .line 147
    .line 148
    invoke-direct {p1, p3}, La/h0u;-><init>(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    throw p1
    :try_end_1
    .catch La/h0u; {:try_start_1 .. :try_end_1} :catch_0

    .line 152
    :catch_0
    move-exception v0

    .line 153
    move-object p1, v0

    .line 154
    sget-object p3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 155
    .line 156
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {p2}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    if-eqz p2, :cond_2

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_2
    invoke-virtual {p0}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    new-instance p3, La/a4e;

    .line 171
    .line 172
    const/16 p4, 0xb

    .line 173
    .line 174
    invoke-direct {p3, p0, p1, p4}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 178
    .line 179
    .line 180
    :goto_0
    return-void
.end method
