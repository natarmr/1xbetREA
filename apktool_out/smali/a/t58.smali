.class public La/t58;
.super La/diu0;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:La/hy40;

.field public C:La/hy40;

.field public b:Ljava/util/concurrent/Executor;

.field public c:La/nnw0;

.field public d:La/yzn0;

.field public e:La/q58;

.field public f:La/lo4;

.field public g:La/t5a;

.field public h:La/so4;

.field public i:La/so4;

.field public j:Ljava/lang/String;

.field public k:B

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:I

.field public s:La/hy40;

.field public t:La/hy40;

.field public u:La/hy40;

.field public v:La/hy40;

.field public w:La/hy40;

.field public x:La/hy40;

.field public y:Z

.field public z:La/hy40;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/diu0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-byte v0, p0, La/t58;->k:B

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, La/t58;->y:Z

    .line 9
    .line 10
    iput v0, p0, La/t58;->A:I

    .line 11
    .line 12
    return-void
.end method

.method public static z(La/hy40;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/wh00;->l(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, La/wh00;->i(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final w(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/t58;->B:La/hy40;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/hy40;

    .line 6
    .line 7
    invoke-direct {v0}, La/wh00;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/t58;->B:La/hy40;

    .line 11
    .line 12
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {v0, p0}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final x(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La/t58;->w:La/hy40;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/hy40;

    .line 6
    .line 7
    invoke-direct {v0}, La/wh00;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/t58;->w:La/hy40;

    .line 11
    .line 12
    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {v0, p0}, La/t58;->z(La/hy40;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    iget-object v0, p0, La/t58;->d:La/yzn0;

    .line 2
    .line 3
    iget-object v1, p0, La/t58;->e:La/q58;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    if-eqz v1, :cond_1

    .line 10
    .line 11
    const/16 v0, 0xf

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/16 v0, 0xff

    .line 15
    .line 16
    :goto_0
    iput v0, p0, La/t58;->r:I

    .line 17
    .line 18
    return-void
.end method
