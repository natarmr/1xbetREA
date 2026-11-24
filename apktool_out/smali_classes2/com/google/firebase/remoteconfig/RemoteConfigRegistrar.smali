.class public Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-rc"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(La/jkd0;La/pzu;)La/qff0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->lambda$getComponents$0(La/jkd0;La/dgd;)La/qff0;

    move-result-object p0

    return-object p0
.end method

.method private static lambda$getComponents$0(La/jkd0;La/dgd;)La/qff0;
    .locals 9

    .line 1
    new-instance v0, La/qff0;

    .line 2
    .line 3
    const-class v1, Landroid/content/Context;

    .line 4
    .line 5
    invoke-interface {p1, v1}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-interface {p1, p0}, La/dgd;->e(La/jkd0;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    move-object v2, p0

    .line 16
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 17
    .line 18
    const-class p0, La/nfq;

    .line 19
    .line 20
    invoke-interface {p1, p0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    move-object v3, p0

    .line 25
    check-cast v3, La/nfq;

    .line 26
    .line 27
    const-class p0, La/dgq;

    .line 28
    .line 29
    invoke-interface {p1, p0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    move-object v4, p0

    .line 34
    check-cast v4, La/dgq;

    .line 35
    .line 36
    const-class p0, La/c6;

    .line 37
    .line 38
    invoke-interface {p1, p0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/c6;

    .line 43
    .line 44
    const-string v5, "frc"

    .line 45
    .line 46
    monitor-enter p0

    .line 47
    :try_start_0
    iget-object v6, p0, La/c6;->a:Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_0

    .line 54
    .line 55
    iget-object v6, p0, La/c6;->a:Ljava/util/HashMap;

    .line 56
    .line 57
    new-instance v7, La/gfq;

    .line 58
    .line 59
    iget-object v8, p0, La/c6;->b:La/p5d0;

    .line 60
    .line 61
    invoke-direct {v7, v8}, La/gfq;-><init>(La/p5d0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object p1, v0

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    :goto_0
    iget-object v6, p0, La/c6;->a:Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, La/gfq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    monitor-exit p0

    .line 80
    const-class p0, La/vp2;

    .line 81
    .line 82
    invoke-interface {p1, p0}, La/dgd;->j(Ljava/lang/Class;)La/p5d0;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-direct/range {v0 .. v6}, La/qff0;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;La/nfq;La/dgq;La/gfq;La/p5d0;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/pfd;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, La/jkd0;

    .line 2
    .line 3
    const-class v0, La/sa8;

    .line 4
    .line 5
    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-class v0, La/bhq;

    .line 11
    .line 12
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/ofd;

    .line 17
    .line 18
    const-class v2, La/qff0;

    .line 19
    .line 20
    invoke-direct {v1, v2, v0}, La/ofd;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "fire-rc"

    .line 24
    .line 25
    iput-object v0, v1, La/ofd;->a:Ljava/lang/String;

    .line 26
    .line 27
    const-class v2, Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, La/ofd;->a(La/c7k;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, La/c7k;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {v2, p0, v3, v4}, La/c7k;-><init>(La/jkd0;II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, La/ofd;->a(La/c7k;)V

    .line 44
    .line 45
    .line 46
    const-class v2, La/nfq;

    .line 47
    .line 48
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, La/ofd;->a(La/c7k;)V

    .line 53
    .line 54
    .line 55
    const-class v2, La/dgq;

    .line 56
    .line 57
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v2}, La/ofd;->a(La/c7k;)V

    .line 62
    .line 63
    .line 64
    const-class v2, La/c6;

    .line 65
    .line 66
    invoke-static {v2}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v2}, La/ofd;->a(La/c7k;)V

    .line 71
    .line 72
    .line 73
    const-class v2, La/vp2;

    .line 74
    .line 75
    invoke-static {v2}, La/c7k;->a(Ljava/lang/Class;)La/c7k;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, La/ofd;->a(La/c7k;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, La/ouj;

    .line 83
    .line 84
    const/4 v3, 0x3

    .line 85
    invoke-direct {v2, p0, v3}, La/ouj;-><init>(La/jkd0;B)V

    .line 86
    .line 87
    .line 88
    iput-object v2, v1, La/ofd;->f:La/jgd;

    .line 89
    .line 90
    const/4 p0, 0x2

    .line 91
    invoke-virtual {v1, p0}, La/ofd;->c(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, La/ofd;->b()La/pfd;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-string v1, "23.1.0"

    .line 99
    .line 100
    invoke-static {v0, v1}, La/q0x;->I(Ljava/lang/String;Ljava/lang/String;)La/pfd;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    filled-new-array {p0, v0}, [La/pfd;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method
