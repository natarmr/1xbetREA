.class public final La/yz3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:La/xz3;


# instance fields
.field public final a:La/fvt0;

.field public final b:La/yzn0;

.field public final c:La/xz3;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public e:Ljava/util/List;

.field public f:Ljava/util/List;

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/xz3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/xz3;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/yz3;->h:La/xz3;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/fvt0;La/yzn0;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, La/yz3;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, La/yz3;->f:Ljava/util/List;

    .line 38
    iput-object p1, p0, La/yz3;->a:La/fvt0;

    .line 39
    iput-object p2, p0, La/yz3;->b:La/yzn0;

    .line 40
    sget-object p1, La/yz3;->h:La/xz3;

    iput-object p1, p0, La/yz3;->c:La/xz3;

    return-void
.end method

.method public constructor <init>(La/yge0;La/dtb;)V
    .locals 2

    .line 1
    new-instance v0, La/fvt0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, La/p8a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    sget-object v1, La/p8a;->b:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, La/p8a;->b:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    new-instance p1, La/yzn0;

    .line 25
    .line 26
    invoke-direct {p1, v1, p2}, La/yzn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, La/yz3;-><init>(La/fvt0;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p0
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/yz3;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/fc00;

    .line 18
    .line 19
    iget-object v2, p0, La/yz3;->f:Ljava/util/List;

    .line 20
    .line 21
    iget-object v1, v1, La/fc00;->a:La/q4;

    .line 22
    .line 23
    invoke-virtual {v1, p1, v2}, La/q4;->E(Ljava/util/List;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final b(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 7

    .line 1
    iget v0, p0, La/yz3;->g:I

    .line 2
    .line 3
    add-int/lit8 v5, v0, 0x1

    .line 4
    .line 5
    iput v5, p0, La/yz3;->g:I

    .line 6
    .line 7
    iget-object v3, p0, La/yz3;->e:Ljava/util/List;

    .line 8
    .line 9
    if-ne p1, v3, :cond_1

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    iget-object v0, p0, La/yz3;->f:Ljava/util/List;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iget-object v2, p0, La/yz3;->a:La/fvt0;

    .line 21
    .line 22
    if-nez p1, :cond_2

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 v3, 0x0

    .line 29
    iput-object v3, p0, La/yz3;->e:Ljava/util/List;

    .line 30
    .line 31
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 32
    .line 33
    iput-object v3, p0, La/yz3;->f:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v2, v1, p1}, La/fvt0;->d(II)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0, p2}, La/yz3;->a(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    if-nez v3, :cond_3

    .line 43
    .line 44
    iput-object p1, p0, La/yz3;->e:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput-object v3, p0, La/yz3;->f:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {v2, v1, p1}, La/fvt0;->c(II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0, p2}, La/yz3;->a(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iget-object v0, p0, La/yz3;->b:La/yzn0;

    .line 64
    .line 65
    iget-object v0, v0, La/yzn0;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 68
    .line 69
    new-instance v1, La/wz3;

    .line 70
    .line 71
    move-object v2, p0

    .line 72
    move-object v4, p1

    .line 73
    move-object v6, p2

    .line 74
    invoke-direct/range {v1 .. v6}, La/wz3;-><init>(La/yz3;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
