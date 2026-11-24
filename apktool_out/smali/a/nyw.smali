.class public final synthetic La/nyw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iwq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/b1x;La/b1x;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput-byte p1, p0, La/nyw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/nyw;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/nyw;->a:B

    iput-object p1, p0, La/nyw;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/jwq;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/nyw;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nyw;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/ibe0;

    .line 9
    .line 10
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget v1, p0, La/ibe0;->a:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    iput v1, p0, La/ibe0;->a:I

    .line 18
    .line 19
    iget-boolean v2, p0, La/ibe0;->b:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, La/ibe0;->close()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    iget-object p0, p0, La/ibe0;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/ito0;

    .line 34
    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ito0;->a(La/jwq;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p0

    .line 44
    :pswitch_0
    check-cast p0, La/b1x;

    .line 45
    .line 46
    sget p1, Landroidx/camera/core/ImageProcessingUtil;->a:I

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    check-cast p0, La/oyw;

    .line 53
    .line 54
    iget-object p0, p0, La/oyw;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/pyw;

    .line 63
    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    iget-object p1, p0, La/pyw;->p:Ljava/util/concurrent/Executor;

    .line 67
    .line 68
    new-instance v0, La/wss;

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    invoke-direct {v0, p0, v1}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
