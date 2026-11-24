.class public final La/vtv;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final a:La/ani0;

.field public final b:La/ntv;

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(La/ani0;La/ntv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vtv;->a:La/ani0;

    .line 5
    .line 6
    iput-object p2, p0, La/vtv;->b:La/ntv;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, La/vtv;->c:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    .line 3
    .line 4
    :cond_0
    :goto_0
    iget-boolean v0, p0, La/vtv;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-boolean v0, p0, La/vtv;->d:Z

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, La/vtv;->a:La/ani0;

    .line 14
    .line 15
    iget-object v0, v0, La/ani0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/ntv;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/TextureView;->lockCanvas()Landroid/graphics/Canvas;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, La/vtv;->a:La/ani0;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    iget-object v2, p0, La/vtv;->b:La/ntv;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, La/ntv;->a(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iput-boolean v2, p0, La/vtv;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v1

    .line 37
    move-object v1, v0

    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    monitor-exit v1

    .line 41
    throw p0

    .line 42
    :cond_1
    :goto_1
    if-eqz v1, :cond_0

    .line 43
    .line 44
    iget-object v0, p0, La/vtv;->a:La/ani0;

    .line 45
    .line 46
    iget-object v0, v0, La/ani0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, La/ntv;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-void
.end method
