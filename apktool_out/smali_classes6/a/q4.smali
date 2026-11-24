.class public abstract La/q4;
.super La/yge0;
.source "SourceFile"


# instance fields
.field public final synthetic d:B

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    iput-byte v0, p0, La/q4;->d:B

    .line 55
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 56
    new-instance v0, La/bp00;

    const/4 v1, 0x0

    .line 57
    invoke-direct {v0, v1}, La/mva;-><init>(Z)V

    .line 58
    iput-object v0, p0, La/q4;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/dtb;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/q4;->d:B

    .line 3
    .line 4
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/fc00;

    .line 8
    .line 9
    invoke-direct {v0, p0}, La/fc00;-><init>(La/q4;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, La/yz3;

    .line 13
    .line 14
    new-instance v2, La/fvt0;

    .line 15
    .line 16
    invoke-direct {v2, p0}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v3, La/p8a;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v3

    .line 22
    :try_start_0
    sget-object v4, La/p8a;->b:Ljava/util/concurrent/ExecutorService;

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    invoke-static {v4}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sput-object v4, La/p8a;->b:Ljava/util/concurrent/ExecutorService;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    new-instance v3, La/yzn0;

    .line 38
    .line 39
    invoke-direct {v3, v4, p1}, La/yzn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v2, v3}, La/yz3;-><init>(La/fvt0;La/yzn0;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, La/q4;->e:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object p0, v1, La/yz3;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p0
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/q4;->d:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 60
    iput-object p2, p0, La/q4;->e:Ljava/lang/Object;

    return-void
.end method

.method public static z(ILa/w5;)V
    .locals 1

    .line 1
    add-int/lit8 p0, p0, 0x1

    .line 2
    .line 3
    rem-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    iget-object p1, p1, La/xhe0;->a:Landroid/view/View;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const v0, 0x7f040ae6

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const v0, 0x7f040ae3

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public A(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/q4;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/q4;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/yz3;

    .line 9
    .line 10
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    iget-object v0, p0, La/q4;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    if-ltz p1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, La/q4;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-lt p1, v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object p0, p0, La/q4;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 50
    :goto_1
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public B(La/mva;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return p0
.end method

.method public C(La/xhe0;La/mva;)V
    .locals 0

    .line 1
    check-cast p1, La/s3w;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public D(Landroid/view/ViewGroup;La/mva;)La/xhe0;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, La/s3w;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const v0, 0x7f0d0336

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public E(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public F(La/mva;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/q4;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/mva;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_7

    .line 13
    .line 14
    iget-object v0, p0, La/q4;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/mva;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    instance-of v1, v0, La/ap00;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    instance-of v0, v0, La/zo00;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    move v0, v2

    .line 35
    :goto_1
    instance-of v1, p1, La/ap00;

    .line 36
    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    instance-of v1, p1, La/zo00;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move v1, v3

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    :goto_2
    move v1, v2

    .line 47
    :goto_3
    iget-object v4, p0, La/yge0;->a:La/zge0;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    if-nez v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {v4, v3, v2}, La/zge0;->f(II)V

    .line 54
    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    if-eqz v1, :cond_5

    .line 58
    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    invoke-virtual {v4, v3, v2}, La/zge0;->e(II)V

    .line 62
    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    if-eqz v0, :cond_6

    .line 66
    .line 67
    if-eqz v1, :cond_6

    .line 68
    .line 69
    invoke-virtual {p0, v3}, La/yge0;->h(I)V

    .line 70
    .line 71
    .line 72
    :cond_6
    :goto_4
    iput-object p1, p0, La/q4;->e:Ljava/lang/Object;

    .line 73
    .line 74
    :cond_7
    return-void
.end method

.method public G(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/q4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yz3;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public H(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/q4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yz3;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/q4;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/q4;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/mva;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v0, p0, La/ap00;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    instance-of p0, p0, La/zo00;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    :goto_1
    return p0

    .line 26
    :pswitch_0
    iget-object p0, p0, La/q4;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, La/yz3;

    .line 29
    .line 30
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :pswitch_1
    iget-object p0, p0, La/q4;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(I)I
    .locals 1

    .line 1
    iget-byte v0, p0, La/q4;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, La/yge0;->f(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_1
    iget-object p1, p0, La/q4;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, La/mva;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/q4;->B(La/mva;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_2
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public n(La/xhe0;I)V
    .locals 0

    .line 1
    iget-object p2, p0, La/q4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, La/mva;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/q4;->C(La/xhe0;La/mva;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 0

    .line 1
    iget-object p2, p0, La/q4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, La/mva;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/q4;->D(Landroid/view/ViewGroup;La/mva;)La/xhe0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
