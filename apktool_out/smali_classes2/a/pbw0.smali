.class public final La/pbw0;
.super La/zsm0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/google/firebase/auth/FirebaseUser;

.field public final synthetic c:Lcom/google/firebase/auth/EmailAuthCredential;

.field public final synthetic d:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;ZLcom/google/firebase/auth/FirebaseUser;Lcom/google/firebase/auth/EmailAuthCredential;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, La/pbw0;->a:Z

    .line 5
    .line 6
    iput-object p3, p0, La/pbw0;->b:Lcom/google/firebase/auth/FirebaseUser;

    .line 7
    .line 8
    iput-object p4, p0, La/pbw0;->c:Lcom/google/firebase/auth/EmailAuthCredential;

    .line 9
    .line 10
    iput-object p1, p0, La/pbw0;->d:Lcom/google/firebase/auth/FirebaseAuth;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final N(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    iget-object v0, p0, La/pbw0;->d:Lcom/google/firebase/auth/FirebaseAuth;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:La/nfq;

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, "FirebaseAuth"

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const-string v2, "Email link login/reauth with empty reCAPTCHA token"

    .line 14
    .line 15
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v2, "Got reCAPTCHA token for login/reauth with email link"

    .line 20
    .line 21
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:La/fck0;

    .line 25
    .line 26
    iget-object v3, p0, La/pbw0;->c:Lcom/google/firebase/auth/EmailAuthCredential;

    .line 27
    .line 28
    iget-boolean v4, p0, La/pbw0;->a:Z

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, La/pbw0;->b:Lcom/google/firebase/auth/FirebaseUser;

    .line 33
    .line 34
    invoke-static {p0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, La/ofq;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct {v4, v0, v5}, La/ofq;-><init>(Lcom/google/firebase/auth/FirebaseAuth;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v0, La/kew0;

    .line 47
    .line 48
    invoke-direct {v0, v3, p1, v5}, La/kew0;-><init>(Lcom/google/firebase/auth/EmailAuthCredential;Ljava/lang/String;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, La/dgw0;->b(La/nfq;)V

    .line 52
    .line 53
    .line 54
    iput-object p0, v0, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 55
    .line 56
    iput-object v4, v0, La/dgw0;->e:La/lyw0;

    .line 57
    .line 58
    iput-object v4, v0, La/dgw0;->f:La/amw0;

    .line 59
    .line 60
    invoke-virtual {v2, v0}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_1
    new-instance p0, La/pfq;

    .line 66
    .line 67
    invoke-direct {p0, v0}, La/pfq;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v0, La/kew0;

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    invoke-direct {v0, v3, p1, v4}, La/kew0;-><init>(Lcom/google/firebase/auth/EmailAuthCredential;Ljava/lang/String;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, La/dgw0;->b(La/nfq;)V

    .line 80
    .line 81
    .line 82
    iput-object p0, v0, La/dgw0;->e:La/lyw0;

    .line 83
    .line 84
    invoke-virtual {v2, v0}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method
