.class public final La/ssn;
.super La/rcb;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/rcb;

.field public final synthetic b:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(La/rcb;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ssn;->a:La/rcb;

    .line 5
    .line 6
    iput-object p2, p0, La/ssn;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a1(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/ssn;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, La/ssn;->a:La/rcb;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/rcb;->a1(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public final b1(La/dgu;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/ssn;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, La/ssn;->a:La/rcb;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/rcb;->b1(La/dgu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method
