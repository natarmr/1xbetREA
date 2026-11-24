.class public final La/mcw0;
.super La/zsm0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/google/firebase/auth/FirebaseUser;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;ZLcom/google/firebase/auth/FirebaseUser;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/mcw0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p3, p0, La/mcw0;->b:Z

    .line 7
    .line 8
    iput-object p4, p0, La/mcw0;->c:Lcom/google/firebase/auth/FirebaseUser;

    .line 9
    .line 10
    iput-object p5, p0, La/mcw0;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, La/mcw0;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p1, p0, La/mcw0;->f:Lcom/google/firebase/auth/FirebaseAuth;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final N(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 10

    .line 1
    iget-object v0, p0, La/mcw0;->f:Lcom/google/firebase/auth/FirebaseAuth;

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
    iget-object v5, p0, La/mcw0;->a:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "Logging in as "

    .line 18
    .line 19
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v4, " with empty reCAPTCHA token"

    .line 26
    .line 27
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "Got reCAPTCHA token for login with email "

    .line 41
    .line 42
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :goto_0
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:La/fck0;

    .line 56
    .line 57
    iget-object v7, p0, La/mcw0;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v6, p0, La/mcw0;->d:Ljava/lang/String;

    .line 60
    .line 61
    iget-boolean v3, p0, La/mcw0;->b:Z

    .line 62
    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    iget-object p0, p0, La/mcw0;->c:Lcom/google/firebase/auth/FirebaseUser;

    .line 66
    .line 67
    invoke-static {p0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v3, La/ofq;

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-direct {v3, v0, v4}, La/ofq;-><init>(Lcom/google/firebase/auth/FirebaseAuth;B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v4, La/lew0;

    .line 80
    .line 81
    const/4 v9, 0x0

    .line 82
    move-object v8, p1

    .line 83
    invoke-direct/range {v4 .. v9}, La/lew0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v1}, La/dgw0;->b(La/nfq;)V

    .line 87
    .line 88
    .line 89
    iput-object p0, v4, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 90
    .line 91
    iput-object v3, v4, La/dgw0;->e:La/lyw0;

    .line 92
    .line 93
    iput-object v3, v4, La/dgw0;->f:La/amw0;

    .line 94
    .line 95
    invoke-virtual {v2, v4}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_1
    move-object v8, p1

    .line 101
    new-instance p0, La/pfq;

    .line 102
    .line 103
    invoke-direct {p0, v0}, La/pfq;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v4, La/lew0;

    .line 110
    .line 111
    const/4 v9, 0x1

    .line 112
    invoke-direct/range {v4 .. v9}, La/lew0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v1}, La/dgw0;->b(La/nfq;)V

    .line 116
    .line 117
    .line 118
    iput-object p0, v4, La/dgw0;->e:La/lyw0;

    .line 119
    .line 120
    invoke-virtual {v2, v4}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method
