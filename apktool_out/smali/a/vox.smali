.class public final La/vox;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static volatile c:La/vox;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/vox;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/cz9;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, v1}, La/cz9;-><init>(B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/vox;->b:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;)V
    .locals 2

    const/4 v0, 0x1

    iput-byte v0, p0, La/vox;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/jaw0;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, La/jaw0;-><init>(Landroid/os/Looper;B)V

    iput-object v0, p0, La/vox;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 21
    iput-byte p2, p0, La/vox;->a:B

    iput-object p1, p0, La/vox;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    sget-object v0, La/vox;->c:La/vox;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La/vox;->c:La/vox;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, La/vox;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, La/vox;->c:La/vox;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, La/vox;

    .line 16
    .line 17
    invoke-direct {v1}, La/vox;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v1, La/vox;->c:La/vox;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    sget-object v0, La/vox;->c:La/vox;

    .line 27
    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v1
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/vox;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vox;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/b1x0;

    .line 9
    .line 10
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/kxw0;

    .line 13
    .line 14
    iget-object p0, p0, La/kxw0;->g:La/fxw0;

    .line 15
    .line 16
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/fxw0;->v1(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast p0, La/fpv0;

    .line 24
    .line 25
    iget-object p0, p0, La/fpv0;->d:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    check-cast p0, La/jaw0;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
