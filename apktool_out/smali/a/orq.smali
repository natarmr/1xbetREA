.class public final La/orq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mrq;


# instance fields
.field public final a:La/hz2;

.field public final b:La/iz2;

.field public final c:La/trm0;

.field public final d:La/srq;

.field public final e:La/pv00;

.field public final f:La/g7p;


# direct methods
.method public constructor <init>(La/hz2;La/iz2;)V
    .locals 4

    .line 1
    sget-object v0, La/prq;->a:La/trm0;

    .line 2
    .line 3
    new-instance v1, La/srq;

    .line 4
    .line 5
    sget-object v2, La/prq;->b:La/phf0;

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/srq;-><init>(La/phf0;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, La/pv00;

    .line 11
    .line 12
    const/16 v3, 0xc

    .line 13
    .line 14
    invoke-direct {v2, v3}, La/pv00;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/orq;->a:La/hz2;

    .line 21
    .line 22
    iput-object p2, p0, La/orq;->b:La/iz2;

    .line 23
    .line 24
    iput-object v0, p0, La/orq;->c:La/trm0;

    .line 25
    .line 26
    iput-object v1, p0, La/orq;->d:La/srq;

    .line 27
    .line 28
    iput-object v2, p0, La/orq;->e:La/pv00;

    .line 29
    .line 30
    new-instance p1, La/g7p;

    .line 31
    .line 32
    const/16 p2, 0xa

    .line 33
    .line 34
    invoke-direct {p1, p0, p2}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, La/orq;->f:La/g7p;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(La/y0t0;)La/b1t0;
    .locals 4

    .line 1
    iget-object v0, p0, La/orq;->c:La/trm0;

    .line 2
    .line 3
    new-instance v1, La/f5p;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, v2}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, v0, La/trm0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/j6m0;

    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    iget-object v2, v0, La/trm0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, La/dj10;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, La/dj10;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, La/b1t0;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v2}, La/b1t0;->a()Z

    .line 28
    .line 29
    .line 30
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-object v2

    .line 35
    :cond_0
    :try_start_1
    iget-object v2, v0, La/trm0;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, La/dj10;

    .line 38
    .line 39
    invoke-virtual {v2, p1}, La/dj10;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, La/b1t0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    :goto_0
    monitor-exit p0

    .line 49
    :try_start_2
    new-instance p0, La/xis0;

    .line 50
    .line 51
    const/4 v2, 0x7

    .line 52
    invoke-direct {p0, v0, p1, v2}, La/xis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p0}, La/f5p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, La/b1t0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 60
    .line 61
    iget-object v1, v0, La/trm0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, La/j6m0;

    .line 64
    .line 65
    monitor-enter v1

    .line 66
    :try_start_3
    iget-object v2, v0, La/trm0;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, La/dj10;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, La/dj10;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    invoke-interface {p0}, La/b1t0;->a()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    iget-object v0, v0, La/trm0;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, La/dj10;

    .line 85
    .line 86
    invoke-virtual {v0, p1, p0}, La/dj10;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    :goto_1
    monitor-exit v1

    .line 93
    return-object p0

    .line 94
    :goto_2
    monitor-exit v1

    .line 95
    throw p0

    .line 96
    :catch_0
    move-exception p0

    .line 97
    const-string p1, "Could not load font"

    .line 98
    .line 99
    invoke-static {p1, p0}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    return-object p0

    .line 104
    :goto_3
    monitor-exit p0

    .line 105
    throw p1
.end method

.method public final b(La/nrq;La/psq;II)La/b1t0;
    .locals 6

    .line 1
    new-instance v0, La/y0t0;

    .line 2
    .line 3
    iget-object v1, p0, La/orq;->b:La/iz2;

    .line 4
    .line 5
    iget v1, v1, La/iz2;->a:I

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const v2, 0x7fffffff

    .line 10
    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget p2, p2, La/psq;->a:I

    .line 16
    .line 17
    add-int/2addr p2, v1

    .line 18
    const/4 v1, 0x1

    .line 19
    const/16 v2, 0x3e8

    .line 20
    .line 21
    invoke-static {p2, v1, v2}, La/l1e0;->d(III)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    new-instance v1, La/psq;

    .line 26
    .line 27
    invoke-direct {v1, p2}, La/psq;-><init>(I)V

    .line 28
    .line 29
    .line 30
    move-object v2, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    move-object v2, p2

    .line 33
    :goto_1
    const/4 v5, 0x0

    .line 34
    move-object v1, p1

    .line 35
    move v3, p3

    .line 36
    move v4, p4

    .line 37
    invoke-direct/range {v0 .. v5}, La/y0t0;-><init>(La/nrq;La/psq;IILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, La/orq;->a(La/y0t0;)La/b1t0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
