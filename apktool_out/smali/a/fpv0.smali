.class public final La/fpv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xgi0;

.field public final b:La/lne;

.field public final c:La/sje;

.field public final d:Landroid/os/Handler;

.field public final e:La/vox;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/fpv0;->d:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, La/vox;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, v1}, La/vox;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/fpv0;->e:La/vox;

    .line 22
    .line 23
    new-instance v0, La/xgi0;

    .line 24
    .line 25
    invoke-direct {v0, p1}, La/xgi0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/fpv0;->a:La/xgi0;

    .line 29
    .line 30
    invoke-static {v0}, La/obb;->Y(Ljava/util/concurrent/Executor;)La/lne;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/fpv0;->b:La/lne;

    .line 35
    .line 36
    new-instance v1, La/xgi0;

    .line 37
    .line 38
    invoke-direct {v1, p1}, La/xgi0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, La/obb;->Y(Ljava/util/concurrent/Executor;)La/lne;

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/fpv0;->c:La/sje;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fpv0;->a:La/xgi0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xgi0;->execute(Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
