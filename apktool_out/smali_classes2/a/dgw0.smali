.class public abstract La/dgw0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:B

.field public final b:La/zlt0;

.field public c:La/nfq;

.field public d:Lcom/google/firebase/auth/FirebaseUser;

.field public e:La/lyw0;

.field public f:La/amw0;

.field public g:La/trm0;

.field public h:Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

.field public i:La/biw0;

.field public j:Lcom/google/firebase/auth/AuthCredential;

.field public k:La/cmt0;

.field public l:La/jiw0;

.field public m:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zlt0;

    .line 5
    .line 6
    const/16 v1, 0xb

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/zlt0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/dgw0;->b:La/zlt0;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-byte p1, p0, La/dgw0;->a:B

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public final b(La/nfq;)V
    .locals 1

    .line 1
    const-string v0, "firebaseApp cannot be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/dgw0;->c:La/nfq;

    .line 7
    .line 8
    return-void
.end method

.method public final c(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/dgw0;->m:Z

    .line 3
    .line 4
    iget-object p0, p0, La/dgw0;->g:La/trm0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0, p1}, La/trm0;->s(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public abstract d(Lcom/google/android/gms/tasks/TaskCompletionSource;La/ffw0;)V
.end method

.method public abstract e()V
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/dgw0;->m:Z

    .line 3
    .line 4
    iget-object p0, p0, La/dgw0;->g:La/trm0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, v0}, La/trm0;->s(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
