.class public final La/uk50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nqp;


# instance fields
.field public final a:La/n0o0;

.field public final b:La/n0o0;

.field public final c:La/g090;

.field public final d:La/n0o0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 4

    .line 1
    new-instance v0, La/th50;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, La/th50;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sget-object v1, La/tk50;->a:La/tk50;

    .line 8
    .line 9
    new-instance v2, La/th50;

    .line 10
    .line 11
    const/4 v3, 0x5

    .line 12
    invoke-direct {v2, v3}, La/th50;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/uk50;->a:La/n0o0;

    .line 23
    .line 24
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/uk50;->b:La/n0o0;

    .line 29
    .line 30
    new-instance p1, La/g090;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p1, La/g090;->a:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v0, La/pek0;->f:La/pek0;

    .line 38
    .line 39
    iput-object v0, p1, La/g090;->b:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object p1, p0, La/uk50;->c:La/g090;

    .line 42
    .line 43
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/uk50;->d:La/n0o0;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/a780;La/gbe0;)La/oqp;
    .locals 10

    .line 1
    check-cast p1, La/aot0;

    .line 2
    .line 3
    iget-object v0, p1, La/aot0;->c:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "http"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p1, La/aot0;->c:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "https"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v1

    .line 26
    :cond_1
    :goto_0
    new-instance v2, La/zk50;

    .line 27
    .line 28
    iget-object v3, p1, La/aot0;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v5, p0, La/uk50;->a:La/n0o0;

    .line 31
    .line 32
    new-instance p1, La/np30;

    .line 33
    .line 34
    const/16 v0, 0x14

    .line 35
    .line 36
    invoke-direct {p1, p3, v0}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget-object v7, p0, La/uk50;->b:La/n0o0;

    .line 44
    .line 45
    iget-object p1, p0, La/uk50;->c:La/g090;

    .line 46
    .line 47
    iget-object p3, p2, La/a780;->a:Landroid/content/Context;

    .line 48
    .line 49
    iget-object v0, p1, La/g090;->b:Ljava/lang/Object;

    .line 50
    .line 51
    sget-object v4, La/pek0;->f:La/pek0;

    .line 52
    .line 53
    if-eq v0, v4, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    monitor-enter p1

    .line 57
    :try_start_0
    iget-object v0, p1, La/g090;->b:Ljava/lang/Object;

    .line 58
    .line 59
    if-eq v0, v4, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    iget-object v0, p1, La/g090;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    iput-object p3, p1, La/g090;->b:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v1, p1, La/g090;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    move-object v0, p3

    .line 78
    :goto_1
    monitor-exit p1

    .line 79
    :goto_2
    new-instance v8, La/obx;

    .line 80
    .line 81
    invoke-direct {v8, v0}, La/obx;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v9, p0, La/uk50;->d:La/n0o0;

    .line 85
    .line 86
    move-object v4, p2

    .line 87
    invoke-direct/range {v2 .. v9}, La/zk50;-><init>(Ljava/lang/String;La/a780;La/n0o0;La/n0o0;La/n0o0;La/obx;La/n0o0;)V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    move-object p0, v0

    .line 93
    monitor-exit p1

    .line 94
    throw p0
.end method
