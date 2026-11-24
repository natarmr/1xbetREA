.class public final La/new0;
.super La/dgw0;
.source "SourceFile"


# instance fields
.field public final synthetic n:B

.field public final o:Lcom/google/firebase/auth/AuthCredential;

.field public final p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/EmailAuthCredential;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    iput-byte v0, p0, La/new0;->n:B

    .line 27
    invoke-direct {p0, v0}, La/dgw0;-><init>(I)V

    .line 28
    iput-object p1, p0, La/new0;->o:Lcom/google/firebase/auth/AuthCredential;

    .line 29
    iget-object v0, p1, Lcom/google/firebase/auth/EmailAuthCredential;->a:Ljava/lang/String;

    .line 30
    const-string v1, "email cannot be null"

    invoke-static {v0, v1}, La/s0x;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object p1, p1, Lcom/google/firebase/auth/EmailAuthCredential;->b:Ljava/lang/String;

    .line 32
    const-string v0, "password cannot be null"

    invoke-static {p1, v0}, La/s0x;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    iput-object p2, p0, La/new0;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/auth/PhoneAuthCredential;Ljava/lang/String;B)V
    .locals 1

    .line 1
    iput-byte p3, p0, La/new0;->n:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    packed-switch p3, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, La/dgw0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    iput-boolean p3, p1, Lcom/google/firebase/auth/PhoneAuthCredential;->d:Z

    .line 12
    .line 13
    iput-object p1, p0, La/new0;->o:Lcom/google/firebase/auth/AuthCredential;

    .line 14
    .line 15
    iput-object p2, p0, La/new0;->p:Ljava/lang/String;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0, v0}, La/dgw0;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/new0;->o:Lcom/google/firebase/auth/AuthCredential;

    .line 22
    .line 23
    iput-object p2, p0, La/new0;->p:Ljava/lang/String;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-byte p0, p0, La/new0;->n:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "linkEmailAuthCredential"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "signInWithPhoneNumber"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "reauthenticateWithPhoneCredentialWithData"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lcom/google/android/gms/tasks/TaskCompletionSource;La/ffw0;)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/new0;->n:B

    .line 2
    .line 3
    iget-object v1, p0, La/dgw0;->b:La/zlt0;

    .line 4
    .line 5
    iget-object v2, p0, La/new0;->p:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, La/new0;->o:Lcom/google/firebase/auth/AuthCredential;

    .line 8
    .line 9
    const/16 v4, 0x13

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, La/trm0;

    .line 15
    .line 16
    invoke-direct {v0, p0, p1, v4}, La/trm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/dgw0;->g:La/trm0;

    .line 20
    .line 21
    check-cast v3, Lcom/google/firebase/auth/EmailAuthCredential;

    .line 22
    .line 23
    iget-object p1, v3, Lcom/google/firebase/auth/EmailAuthCredential;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, v3, Lcom/google/firebase/auth/EmailAuthCredential;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0}, La/s0x;->E(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 31
    .line 32
    check-cast v3, Lcom/google/firebase/auth/internal/zzad;

    .line 33
    .line 34
    iget-object v3, v3, Lcom/google/firebase/auth/internal/zzad;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->o()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object p0, p0, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseUser;->m()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, La/s0x;->E(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v3}, La/s0x;->E(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p2, La/ffw0;->a:La/nmt0;

    .line 62
    .line 63
    new-instance v4, La/hcp0;

    .line 64
    .line 65
    sget-object v5, La/ffw0;->b:La/zz2;

    .line 66
    .line 67
    invoke-direct {v4, v1, v5}, La/hcp0;-><init>(La/efw0;La/zz2;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, La/s0x;->E(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v3}, La/s0x;->E(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, La/zcw0;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, v1, La/zcw0;->a:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v0, v1, La/zcw0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object p0, v1, La/zcw0;->c:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v2, v1, La/zcw0;->d:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v4, v1, La/zcw0;->e:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v1, La/zcw0;->f:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-virtual {p2, v3, v1}, La/nmt0;->h(Ljava/lang/String;La/ngw0;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_0
    new-instance v0, La/trm0;

    .line 101
    .line 102
    invoke-direct {v0, p0, p1, v4}, La/trm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, La/dgw0;->g:La/trm0;

    .line 106
    .line 107
    check-cast v3, Lcom/google/firebase/auth/PhoneAuthCredential;

    .line 108
    .line 109
    invoke-virtual {p2, v3, v2, v1}, La/ffw0;->c(Lcom/google/firebase/auth/PhoneAuthCredential;Ljava/lang/String;La/efw0;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_1
    new-instance v0, La/trm0;

    .line 114
    .line 115
    invoke-direct {v0, p0, p1, v4}, La/trm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, La/dgw0;->g:La/trm0;

    .line 119
    .line 120
    check-cast v3, Lcom/google/firebase/auth/PhoneAuthCredential;

    .line 121
    .line 122
    invoke-virtual {p2, v3, v2, v1}, La/ffw0;->c(Lcom/google/firebase/auth/PhoneAuthCredential;Ljava/lang/String;La/efw0;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/new0;->n:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/dgw0;->c:La/nfq;

    .line 7
    .line 8
    iget-object v1, p0, La/dgw0;->i:La/biw0;

    .line 9
    .line 10
    invoke-static {v0, v1}, La/fck0;->t(La/nfq;La/biw0;)Lcom/google/firebase/auth/internal/zzad;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, La/dgw0;->e:La/lyw0;

    .line 15
    .line 16
    check-cast v1, La/lyw0;

    .line 17
    .line 18
    iget-object v2, p0, La/dgw0;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 19
    .line 20
    invoke-interface {v1, v2, v0}, La/lyw0;->b(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;Lcom/google/firebase/auth/FirebaseUser;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lcom/google/firebase/auth/internal/zzx;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/google/firebase/auth/internal/zzx;-><init>(Lcom/google/firebase/auth/internal/zzad;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1}, La/dgw0;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, La/dgw0;->c:La/nfq;

    .line 33
    .line 34
    iget-object v1, p0, La/dgw0;->i:La/biw0;

    .line 35
    .line 36
    invoke-static {v0, v1}, La/fck0;->t(La/nfq;La/biw0;)Lcom/google/firebase/auth/internal/zzad;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, La/dgw0;->e:La/lyw0;

    .line 41
    .line 42
    check-cast v1, La/lyw0;

    .line 43
    .line 44
    iget-object v2, p0, La/dgw0;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 45
    .line 46
    invoke-interface {v1, v2, v0}, La/lyw0;->b(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;Lcom/google/firebase/auth/FirebaseUser;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lcom/google/firebase/auth/internal/zzx;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lcom/google/firebase/auth/internal/zzx;-><init>(Lcom/google/firebase/auth/internal/zzad;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1}, La/dgw0;->f(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_1
    iget-object v0, p0, La/dgw0;->c:La/nfq;

    .line 59
    .line 60
    iget-object v1, p0, La/dgw0;->i:La/biw0;

    .line 61
    .line 62
    invoke-static {v0, v1}, La/fck0;->t(La/nfq;La/biw0;)Lcom/google/firebase/auth/internal/zzad;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v1, p0, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 67
    .line 68
    check-cast v1, Lcom/google/firebase/auth/internal/zzad;

    .line 69
    .line 70
    iget-object v1, v1, Lcom/google/firebase/auth/internal/zzad;->b:Lcom/google/firebase/auth/internal/zzz;

    .line 71
    .line 72
    iget-object v1, v1, Lcom/google/firebase/auth/internal/zzz;->a:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v2, v0, Lcom/google/firebase/auth/internal/zzad;->b:Lcom/google/firebase/auth/internal/zzz;

    .line 75
    .line 76
    iget-object v2, v2, Lcom/google/firebase/auth/internal/zzz;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_0

    .line 83
    .line 84
    iget-object v1, p0, La/dgw0;->e:La/lyw0;

    .line 85
    .line 86
    check-cast v1, La/lyw0;

    .line 87
    .line 88
    iget-object v2, p0, La/dgw0;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 89
    .line 90
    invoke-interface {v1, v2, v0}, La/lyw0;->b(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;Lcom/google/firebase/auth/FirebaseUser;)V

    .line 91
    .line 92
    .line 93
    new-instance v1, Lcom/google/firebase/auth/internal/zzx;

    .line 94
    .line 95
    invoke-direct {v1, v0}, Lcom/google/firebase/auth/internal/zzx;-><init>(Lcom/google/firebase/auth/internal/zzad;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v1}, La/dgw0;->f(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 103
    .line 104
    const/16 v1, 0x4280

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-direct {v0, v1, v2, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, La/dgw0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
