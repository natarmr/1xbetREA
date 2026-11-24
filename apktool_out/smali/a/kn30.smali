.class public final La/kn30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gt2;


# instance fields
.field public A:I

.field public B:Z

.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:La/owj;

.field public final d:Landroid/media/metrics/PlaybackSession;

.field public final e:J

.field public final f:Landroidx/media3/common/Timeline$Window;

.field public final g:La/amq0;

.field public final h:Ljava/util/HashMap;

.field public final i:Ljava/util/HashMap;

.field public j:Ljava/lang/String;

.field public k:Landroid/media/metrics/PlaybackMetrics$Builder;

.field public l:I

.field public m:I

.field public n:I

.field public o:La/dlo;

.field public p:La/zz2;

.field public q:La/zz2;

.field public r:La/zz2;

.field public s:Landroidx/media3/common/b;

.field public t:Landroidx/media3/common/b;

.field public u:Landroidx/media3/common/b;

.field public v:Z

.field public w:B

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, La/kn30;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, La/kn30;->d:Landroid/media/metrics/PlaybackSession;

    .line 11
    .line 12
    invoke-static {}, La/kc5;->P0()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/kn30;->b:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance p1, Landroidx/media3/common/Timeline$Window;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/media3/common/Timeline$Window;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/kn30;->f:Landroidx/media3/common/Timeline$Window;

    .line 24
    .line 25
    new-instance p1, La/amq0;

    .line 26
    .line 27
    invoke-direct {p1}, La/amq0;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/kn30;->g:La/amq0;

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, La/kn30;->i:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance p1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, La/kn30;->h:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iput-wide p1, p0, La/kn30;->e:J

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput p1, p0, La/kn30;->m:I

    .line 54
    .line 55
    iput p1, p0, La/kn30;->n:I

    .line 56
    .line 57
    new-instance p1, La/owj;

    .line 58
    .line 59
    invoke-direct {p1}, La/owj;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, La/kn30;->c:La/owj;

    .line 63
    .line 64
    iput-object p0, p1, La/owj;->d:La/kn30;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a(La/zz2;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, La/zz2;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, La/kn30;->c:La/owj;

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, La/owj;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, La/kn30;->B:Z

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget v2, p0, La/kn30;->A:I

    .line 11
    .line 12
    invoke-static {v0, v2}, La/isj;->v(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 16
    .line 17
    iget v2, p0, La/kn30;->y:I

    .line 18
    .line 19
    invoke-static {v0, v2}, La/isj;->x(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 23
    .line 24
    iget v2, p0, La/kn30;->z:I

    .line 25
    .line 26
    invoke-static {v0, v2}, La/isj;->y(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, La/kn30;->h:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, La/kn30;->j:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    iget-object v2, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-wide v5, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    :goto_0
    invoke-static {v2, v5, v6}, La/isj;->t(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/kn30;->i:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v2, p0, La/kn30;->j:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    iget-object v2, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-wide v5, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    :goto_1
    invoke-static {v2, v5, v6}, La/isj;->w(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v0, v1

    .line 92
    :goto_2
    invoke-static {v2, v0}, La/isj;->z(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 96
    .line 97
    invoke-static {v0}, La/isj;->f(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v2, La/llo;

    .line 102
    .line 103
    const/16 v3, 0x16

    .line 104
    .line 105
    invoke-direct {v2, p0, v0, v3}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, La/kn30;->b:Ljava/util/concurrent/Executor;

    .line 109
    .line 110
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    const/4 v0, 0x0

    .line 114
    iput-object v0, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 115
    .line 116
    iput-object v0, p0, La/kn30;->j:Ljava/lang/String;

    .line 117
    .line 118
    iput v1, p0, La/kn30;->A:I

    .line 119
    .line 120
    iput v1, p0, La/kn30;->y:I

    .line 121
    .line 122
    iput v1, p0, La/kn30;->z:I

    .line 123
    .line 124
    iput-object v0, p0, La/kn30;->s:Landroidx/media3/common/b;

    .line 125
    .line 126
    iput-object v0, p0, La/kn30;->t:Landroidx/media3/common/b;

    .line 127
    .line 128
    iput-object v0, p0, La/kn30;->u:Landroidx/media3/common/b;

    .line 129
    .line 130
    iput-boolean v1, p0, La/kn30;->B:Z

    .line 131
    .line 132
    return-void
.end method

.method public final c(La/bmq0;La/vn30;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p2, La/vn30;->a:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne p2, v1, :cond_1

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_1
    iget-object v1, p0, La/kn30;->g:La/amq0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, p2, v1, v2}, La/bmq0;->f(ILa/amq0;Z)La/amq0;

    .line 20
    .line 21
    .line 22
    iget p2, v1, La/amq0;->c:I

    .line 23
    .line 24
    iget-object v1, p0, La/kn30;->f:Landroidx/media3/common/Timeline$Window;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v1}, La/bmq0;->n(ILandroidx/media3/common/Timeline$Window;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v1, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 30
    .line 31
    iget-object p1, p1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 32
    .line 33
    const/4 p2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v2, p1, La/en30;->a:Landroid/net/Uri;

    .line 39
    .line 40
    iget-object p1, p1, La/en30;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2, p1}, La/vtt0;->F(Landroid/net/Uri;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    if-eq p1, v3, :cond_4

    .line 49
    .line 50
    if-eq p1, p2, :cond_3

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const/4 v2, 0x4

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    const/4 v2, 0x5

    .line 57
    goto :goto_1

    .line 58
    :cond_5
    const/4 v2, 0x3

    .line 59
    :goto_1
    invoke-static {v0, v2}, La/isj;->k(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 60
    .line 61
    .line 62
    iget-wide v4, v1, Landroidx/media3/common/Timeline$Window;->l:J

    .line 63
    .line 64
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    cmp-long p1, v4, v6

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    iget-boolean p1, v1, Landroidx/media3/common/Timeline$Window;->j:Z

    .line 74
    .line 75
    if-nez p1, :cond_6

    .line 76
    .line 77
    iget-boolean p1, v1, Landroidx/media3/common/Timeline$Window;->h:Z

    .line 78
    .line 79
    if-nez p1, :cond_6

    .line 80
    .line 81
    invoke-virtual {v1}, Landroidx/media3/common/Timeline$Window;->a()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_6

    .line 86
    .line 87
    iget-wide v4, v1, Landroidx/media3/common/Timeline$Window;->l:J

    .line 88
    .line 89
    invoke-static {v4, v5}, La/vtt0;->Y(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {v0, v4, v5}, La/isj;->l(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 94
    .line 95
    .line 96
    :cond_6
    invoke-virtual {v1}, Landroidx/media3/common/Timeline$Window;->a()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    move p2, v3

    .line 104
    :goto_2
    invoke-static {v0, p2}, La/isj;->s(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 105
    .line 106
    .line 107
    iput-boolean v3, p0, La/kn30;->B:Z

    .line 108
    .line 109
    return-void
.end method

.method public final d(La/my90;La/xr;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    iget-object v1, v6, La/xr;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/jjq;

    .line 8
    .line 9
    iget-object v1, v1, La/jjq;->a:Landroid/util/SparseBooleanArray;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_35

    .line 18
    .line 19
    :cond_0
    const/4 v7, 0x0

    .line 20
    move v1, v7

    .line 21
    :goto_0
    iget-object v2, v6, La/xr;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, La/jjq;

    .line 24
    .line 25
    iget-object v2, v2, La/jjq;->a:Landroid/util/SparseBooleanArray;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/16 v8, 0xb

    .line 32
    .line 33
    const/4 v9, 0x1

    .line 34
    if-ge v1, v2, :cond_c

    .line 35
    .line 36
    iget-object v2, v6, La/xr;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, La/jjq;

    .line 39
    .line 40
    iget-object v2, v2, La/jjq;->a:Landroid/util/SparseBooleanArray;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-static {v1, v3}, La/x0x;->D(II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v3, v6, La/xr;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Landroid/util/SparseArray;

    .line 56
    .line 57
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, La/ft2;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v4, v0, La/kn30;->c:La/owj;

    .line 67
    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    monitor-enter v4

    .line 71
    :try_start_0
    iget-object v2, v4, La/owj;->d:La/kn30;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v2, v4, La/owj;->e:La/bmq0;

    .line 77
    .line 78
    iget-object v5, v3, La/ft2;->b:La/bmq0;

    .line 79
    .line 80
    iput-object v5, v4, La/owj;->e:La/bmq0;

    .line 81
    .line 82
    iget-object v5, v4, La/owj;->c:Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_4

    .line 97
    .line 98
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    check-cast v8, La/nwj;

    .line 103
    .line 104
    iget-object v9, v4, La/owj;->e:La/bmq0;

    .line 105
    .line 106
    invoke-virtual {v8, v2, v9}, La/nwj;->b(La/bmq0;La/bmq0;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_2

    .line 111
    .line 112
    invoke-virtual {v8, v3}, La/nwj;->a(La/ft2;)Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-eqz v9, :cond_1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    goto :goto_3

    .line 121
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 122
    .line 123
    .line 124
    iget-object v9, v8, La/nwj;->a:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v10, v4, La/owj;->f:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_3

    .line 133
    .line 134
    invoke-virtual {v4, v8}, La/owj;->a(La/nwj;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    iget-boolean v9, v8, La/nwj;->e:Z

    .line 138
    .line 139
    if-eqz v9, :cond_1

    .line 140
    .line 141
    iget-object v9, v4, La/owj;->d:La/kn30;

    .line 142
    .line 143
    iget-object v8, v8, La/nwj;->a:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v9, v3, v8}, La/kn30;->f(La/ft2;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_4
    invoke-virtual {v4, v3}, La/owj;->d(La/ft2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    monitor-exit v4

    .line 153
    goto :goto_8

    .line 154
    :goto_3
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    throw v0

    .line 156
    :cond_5
    if-ne v2, v8, :cond_b

    .line 157
    .line 158
    iget v2, v0, La/kn30;->l:I

    .line 159
    .line 160
    monitor-enter v4

    .line 161
    :try_start_2
    iget-object v5, v4, La/owj;->d:La/kn30;

    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    if-nez v2, :cond_6

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_6
    move v9, v7

    .line 170
    :goto_4
    iget-object v2, v4, La/owj;->c:Ljava/util/HashMap;

    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    :cond_7
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_a

    .line 185
    .line 186
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    check-cast v5, La/nwj;

    .line 191
    .line 192
    invoke-virtual {v5, v3}, La/nwj;->a(La/ft2;)Z

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    if-eqz v8, :cond_7

    .line 197
    .line 198
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 199
    .line 200
    .line 201
    iget-object v8, v5, La/nwj;->a:Ljava/lang/String;

    .line 202
    .line 203
    iget-object v10, v4, La/owj;->f:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-eqz v8, :cond_8

    .line 210
    .line 211
    invoke-virtual {v4, v5}, La/owj;->a(La/nwj;)V

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :catchall_1
    move-exception v0

    .line 216
    goto :goto_7

    .line 217
    :cond_8
    :goto_6
    iget-boolean v10, v5, La/nwj;->e:Z

    .line 218
    .line 219
    if-eqz v10, :cond_7

    .line 220
    .line 221
    if-eqz v9, :cond_9

    .line 222
    .line 223
    if-eqz v8, :cond_9

    .line 224
    .line 225
    iget-boolean v8, v5, La/nwj;->f:Z

    .line 226
    .line 227
    :cond_9
    iget-object v8, v4, La/owj;->d:La/kn30;

    .line 228
    .line 229
    iget-object v5, v5, La/nwj;->a:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {v8, v3, v5}, La/kn30;->f(La/ft2;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_a
    invoke-virtual {v4, v3}, La/owj;->d(La/ft2;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 236
    .line 237
    .line 238
    monitor-exit v4

    .line 239
    goto :goto_8

    .line 240
    :goto_7
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 241
    throw v0

    .line 242
    :cond_b
    invoke-virtual {v4, v3}, La/owj;->e(La/ft2;)V

    .line 243
    .line 244
    .line 245
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_c
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 250
    .line 251
    .line 252
    move-result-wide v2

    .line 253
    invoke-virtual {v6, v7}, La/xr;->d(I)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-eqz v1, :cond_d

    .line 258
    .line 259
    iget-object v1, v6, La/xr;->b:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v1, Landroid/util/SparseArray;

    .line 262
    .line 263
    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    check-cast v1, La/ft2;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object v4, v0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 273
    .line 274
    if-eqz v4, :cond_d

    .line 275
    .line 276
    iget-object v4, v1, La/ft2;->b:La/bmq0;

    .line 277
    .line 278
    iget-object v1, v1, La/ft2;->d:La/vn30;

    .line 279
    .line 280
    invoke-virtual {v0, v4, v1}, La/kn30;->c(La/bmq0;La/vn30;)V

    .line 281
    .line 282
    .line 283
    :cond_d
    const/4 v10, 0x2

    .line 284
    invoke-virtual {v6, v10}, La/xr;->d(I)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_15

    .line 289
    .line 290
    iget-object v1, v0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 291
    .line 292
    if-eqz v1, :cond_15

    .line 293
    .line 294
    move-object/from16 v1, p1

    .line 295
    .line 296
    check-cast v1, La/ulo;

    .line 297
    .line 298
    invoke-virtual {v1}, La/ulo;->o()La/rds0;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    iget-object v1, v1, La/rds0;->a:La/b4x;

    .line 303
    .line 304
    invoke-virtual {v1, v7}, La/b4x;->r(I)La/v3x;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    :cond_e
    invoke-virtual {v1}, La/v3x;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-eqz v5, :cond_10

    .line 313
    .line 314
    invoke-virtual {v1}, La/v3x;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    check-cast v5, La/qds0;

    .line 319
    .line 320
    move v13, v7

    .line 321
    :goto_9
    iget v14, v5, La/qds0;->a:I

    .line 322
    .line 323
    if-ge v13, v14, :cond_e

    .line 324
    .line 325
    iget-object v14, v5, La/qds0;->e:[Z

    .line 326
    .line 327
    aget-boolean v14, v14, v13

    .line 328
    .line 329
    if-eqz v14, :cond_f

    .line 330
    .line 331
    iget-object v14, v5, La/qds0;->b:La/ccs0;

    .line 332
    .line 333
    iget-object v14, v14, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 334
    .line 335
    aget-object v14, v14, v13

    .line 336
    .line 337
    iget-object v14, v14, Landroidx/media3/common/b;->t:Landroidx/media3/common/DrmInitData;

    .line 338
    .line 339
    if-eqz v14, :cond_f

    .line 340
    .line 341
    goto :goto_a

    .line 342
    :cond_f
    add-int/lit8 v13, v13, 0x1

    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_10
    const/4 v14, 0x0

    .line 346
    :goto_a
    if-eqz v14, :cond_15

    .line 347
    .line 348
    iget-object v1, v0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 349
    .line 350
    sget-object v5, La/vtt0;->a:Ljava/lang/String;

    .line 351
    .line 352
    move v5, v7

    .line 353
    :goto_b
    iget v13, v14, Landroidx/media3/common/DrmInitData;->d:I

    .line 354
    .line 355
    if-ge v5, v13, :cond_14

    .line 356
    .line 357
    iget-object v13, v14, Landroidx/media3/common/DrmInitData;->a:[Landroidx/media3/common/DrmInitData$SchemeData;

    .line 358
    .line 359
    aget-object v13, v13, v5

    .line 360
    .line 361
    iget-object v13, v13, Landroidx/media3/common/DrmInitData$SchemeData;->b:Ljava/util/UUID;

    .line 362
    .line 363
    sget-object v15, La/tg9;->d:Ljava/util/UUID;

    .line 364
    .line 365
    invoke-virtual {v13, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v15

    .line 369
    if-eqz v15, :cond_11

    .line 370
    .line 371
    const/4 v5, 0x3

    .line 372
    goto :goto_c

    .line 373
    :cond_11
    sget-object v15, La/tg9;->e:Ljava/util/UUID;

    .line 374
    .line 375
    invoke-virtual {v13, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v15

    .line 379
    if-eqz v15, :cond_12

    .line 380
    .line 381
    move v5, v10

    .line 382
    goto :goto_c

    .line 383
    :cond_12
    sget-object v15, La/tg9;->c:Ljava/util/UUID;

    .line 384
    .line 385
    invoke-virtual {v13, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    if-eqz v13, :cond_13

    .line 390
    .line 391
    const/4 v5, 0x6

    .line 392
    goto :goto_c

    .line 393
    :cond_13
    add-int/lit8 v5, v5, 0x1

    .line 394
    .line 395
    goto :goto_b

    .line 396
    :cond_14
    move v5, v9

    .line 397
    :goto_c
    invoke-virtual {v1, v5}, Landroid/media/metrics/PlaybackMetrics$Builder;->setDrmType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 398
    .line 399
    .line 400
    :cond_15
    const/16 v1, 0x3f3

    .line 401
    .line 402
    invoke-virtual {v6, v1}, La/xr;->d(I)Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-eqz v1, :cond_16

    .line 407
    .line 408
    iget v1, v0, La/kn30;->A:I

    .line 409
    .line 410
    add-int/2addr v1, v9

    .line 411
    iput v1, v0, La/kn30;->A:I

    .line 412
    .line 413
    :cond_16
    iget-object v1, v0, La/kn30;->o:La/dlo;

    .line 414
    .line 415
    const/16 v13, 0x14

    .line 416
    .line 417
    const/4 v4, 0x7

    .line 418
    const/4 v10, 0x5

    .line 419
    const/4 v8, 0x4

    .line 420
    if-nez v1, :cond_17

    .line 421
    .line 422
    move v5, v9

    .line 423
    const/16 v8, 0xd

    .line 424
    .line 425
    const/16 v17, 0x8

    .line 426
    .line 427
    const/16 v18, 0x6

    .line 428
    .line 429
    const/16 v19, 0x9

    .line 430
    .line 431
    :goto_d
    const/4 v1, 0x2

    .line 432
    goto/16 :goto_1d

    .line 433
    .line 434
    :cond_17
    iget v5, v1, La/dlo;->a:I

    .line 435
    .line 436
    iget-object v11, v0, La/kn30;->a:Landroid/content/Context;

    .line 437
    .line 438
    iget-byte v12, v0, La/kn30;->w:B

    .line 439
    .line 440
    if-ne v12, v8, :cond_18

    .line 441
    .line 442
    move v12, v9

    .line 443
    goto :goto_e

    .line 444
    :cond_18
    move v12, v7

    .line 445
    :goto_e
    const/16 v8, 0x3e9

    .line 446
    .line 447
    const/16 v15, 0x15

    .line 448
    .line 449
    if-ne v5, v8, :cond_19

    .line 450
    .line 451
    new-instance v5, La/eld0;

    .line 452
    .line 453
    invoke-direct {v5, v13, v7, v4}, La/eld0;-><init>(IIB)V

    .line 454
    .line 455
    .line 456
    :goto_f
    const/16 v8, 0xd

    .line 457
    .line 458
    const/16 v17, 0x8

    .line 459
    .line 460
    const/16 v18, 0x6

    .line 461
    .line 462
    const/16 v19, 0x9

    .line 463
    .line 464
    goto/16 :goto_1c

    .line 465
    .line 466
    :cond_19
    instance-of v8, v1, La/dlo;

    .line 467
    .line 468
    if-eqz v8, :cond_1b

    .line 469
    .line 470
    iget-byte v8, v1, La/dlo;->c:B

    .line 471
    .line 472
    if-ne v8, v9, :cond_1a

    .line 473
    .line 474
    move v8, v9

    .line 475
    goto :goto_10

    .line 476
    :cond_1a
    move v8, v7

    .line 477
    :goto_10
    iget v13, v1, La/dlo;->g:I

    .line 478
    .line 479
    goto :goto_11

    .line 480
    :cond_1b
    move v8, v7

    .line 481
    move v13, v8

    .line 482
    :goto_11
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    instance-of v14, v9, Ljava/io/IOException;

    .line 490
    .line 491
    const/16 v20, 0x19

    .line 492
    .line 493
    const/16 v21, 0x1a

    .line 494
    .line 495
    const/16 v7, 0x1b

    .line 496
    .line 497
    if-eqz v14, :cond_30

    .line 498
    .line 499
    instance-of v8, v9, La/ptw;

    .line 500
    .line 501
    if-eqz v8, :cond_1c

    .line 502
    .line 503
    check-cast v9, La/ptw;

    .line 504
    .line 505
    iget v5, v9, La/ptw;->c:I

    .line 506
    .line 507
    new-instance v7, La/eld0;

    .line 508
    .line 509
    invoke-direct {v7, v10, v5, v4}, La/eld0;-><init>(IIB)V

    .line 510
    .line 511
    .line 512
    move-object v5, v7

    .line 513
    goto :goto_f

    .line 514
    :cond_1c
    instance-of v8, v9, La/otw;

    .line 515
    .line 516
    if-nez v8, :cond_1d

    .line 517
    .line 518
    instance-of v8, v9, La/kq80;

    .line 519
    .line 520
    if-eqz v8, :cond_1e

    .line 521
    .line 522
    :cond_1d
    const/16 v7, 0x9

    .line 523
    .line 524
    const/16 v8, 0x8

    .line 525
    .line 526
    const/4 v11, 0x6

    .line 527
    const/4 v14, 0x0

    .line 528
    goto/16 :goto_18

    .line 529
    .line 530
    :cond_1e
    instance-of v8, v9, La/ntw;

    .line 531
    .line 532
    if-nez v8, :cond_1f

    .line 533
    .line 534
    instance-of v12, v9, La/l3t0;

    .line 535
    .line 536
    if-eqz v12, :cond_20

    .line 537
    .line 538
    :cond_1f
    const/16 v7, 0x9

    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    goto/16 :goto_14

    .line 542
    .line 543
    :cond_20
    const/16 v8, 0x3ea

    .line 544
    .line 545
    if-ne v5, v8, :cond_21

    .line 546
    .line 547
    new-instance v5, La/eld0;

    .line 548
    .line 549
    const/4 v7, 0x0

    .line 550
    invoke-direct {v5, v15, v7, v4}, La/eld0;-><init>(IIB)V

    .line 551
    .line 552
    .line 553
    goto :goto_f

    .line 554
    :cond_21
    instance-of v5, v9, La/xhl;

    .line 555
    .line 556
    if-eqz v5, :cond_28

    .line 557
    .line 558
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 559
    .line 560
    .line 561
    move-result-object v5

    .line 562
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    instance-of v8, v5, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 566
    .line 567
    if-eqz v8, :cond_22

    .line 568
    .line 569
    check-cast v5, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 570
    .line 571
    invoke-virtual {v5}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    invoke-static {v5}, La/vtt0;->w(Ljava/lang/String;)I

    .line 576
    .line 577
    .line 578
    move-result v5

    .line 579
    invoke-static {v5}, La/vtt0;->v(I)I

    .line 580
    .line 581
    .line 582
    move-result v8

    .line 583
    packed-switch v8, :pswitch_data_0

    .line 584
    .line 585
    .line 586
    goto :goto_12

    .line 587
    :pswitch_0
    move/from16 v7, v21

    .line 588
    .line 589
    goto :goto_12

    .line 590
    :pswitch_1
    move/from16 v7, v20

    .line 591
    .line 592
    goto :goto_12

    .line 593
    :pswitch_2
    const/16 v7, 0x1c

    .line 594
    .line 595
    goto :goto_12

    .line 596
    :pswitch_3
    const/16 v7, 0x18

    .line 597
    .line 598
    :goto_12
    new-instance v8, La/eld0;

    .line 599
    .line 600
    invoke-direct {v8, v7, v5, v4}, La/eld0;-><init>(IIB)V

    .line 601
    .line 602
    .line 603
    move-object v5, v8

    .line 604
    goto/16 :goto_f

    .line 605
    .line 606
    :cond_22
    instance-of v8, v5, Landroid/media/MediaDrmResetException;

    .line 607
    .line 608
    if-eqz v8, :cond_23

    .line 609
    .line 610
    new-instance v5, La/eld0;

    .line 611
    .line 612
    const/4 v8, 0x0

    .line 613
    invoke-direct {v5, v7, v8, v4}, La/eld0;-><init>(IIB)V

    .line 614
    .line 615
    .line 616
    goto/16 :goto_f

    .line 617
    .line 618
    :cond_23
    const/4 v8, 0x0

    .line 619
    instance-of v7, v5, Landroid/media/NotProvisionedException;

    .line 620
    .line 621
    if-eqz v7, :cond_24

    .line 622
    .line 623
    new-instance v5, La/eld0;

    .line 624
    .line 625
    const/16 v11, 0x18

    .line 626
    .line 627
    invoke-direct {v5, v11, v8, v4}, La/eld0;-><init>(IIB)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_f

    .line 631
    .line 632
    :cond_24
    instance-of v7, v5, Landroid/media/DeniedByServerException;

    .line 633
    .line 634
    if-eqz v7, :cond_25

    .line 635
    .line 636
    new-instance v5, La/eld0;

    .line 637
    .line 638
    const/16 v7, 0x1d

    .line 639
    .line 640
    invoke-direct {v5, v7, v8, v4}, La/eld0;-><init>(IIB)V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_f

    .line 644
    .line 645
    :cond_25
    instance-of v7, v5, La/rft0;

    .line 646
    .line 647
    if-eqz v7, :cond_26

    .line 648
    .line 649
    new-instance v5, La/eld0;

    .line 650
    .line 651
    const/16 v7, 0x17

    .line 652
    .line 653
    invoke-direct {v5, v7, v8, v4}, La/eld0;-><init>(IIB)V

    .line 654
    .line 655
    .line 656
    goto/16 :goto_f

    .line 657
    .line 658
    :cond_26
    instance-of v5, v5, La/xtj;

    .line 659
    .line 660
    if-eqz v5, :cond_27

    .line 661
    .line 662
    new-instance v5, La/eld0;

    .line 663
    .line 664
    const/16 v12, 0x1c

    .line 665
    .line 666
    invoke-direct {v5, v12, v8, v4}, La/eld0;-><init>(IIB)V

    .line 667
    .line 668
    .line 669
    goto/16 :goto_f

    .line 670
    .line 671
    :cond_27
    new-instance v5, La/eld0;

    .line 672
    .line 673
    const/16 v7, 0x1e

    .line 674
    .line 675
    invoke-direct {v5, v7, v8, v4}, La/eld0;-><init>(IIB)V

    .line 676
    .line 677
    .line 678
    goto/16 :goto_f

    .line 679
    .line 680
    :cond_28
    instance-of v5, v9, La/dzp;

    .line 681
    .line 682
    if-eqz v5, :cond_2a

    .line 683
    .line 684
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    instance-of v5, v5, Ljava/io/FileNotFoundException;

    .line 689
    .line 690
    if-eqz v5, :cond_2a

    .line 691
    .line 692
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 700
    .line 701
    .line 702
    move-result-object v5

    .line 703
    instance-of v7, v5, Landroid/system/ErrnoException;

    .line 704
    .line 705
    if-eqz v7, :cond_29

    .line 706
    .line 707
    check-cast v5, Landroid/system/ErrnoException;

    .line 708
    .line 709
    iget v5, v5, Landroid/system/ErrnoException;->errno:I

    .line 710
    .line 711
    sget v7, Landroid/system/OsConstants;->EACCES:I

    .line 712
    .line 713
    if-ne v5, v7, :cond_29

    .line 714
    .line 715
    new-instance v5, La/eld0;

    .line 716
    .line 717
    const/16 v7, 0x20

    .line 718
    .line 719
    const/4 v14, 0x0

    .line 720
    invoke-direct {v5, v7, v14, v4}, La/eld0;-><init>(IIB)V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_f

    .line 724
    .line 725
    :cond_29
    const/4 v14, 0x0

    .line 726
    new-instance v5, La/eld0;

    .line 727
    .line 728
    const/16 v7, 0x1f

    .line 729
    .line 730
    invoke-direct {v5, v7, v14, v4}, La/eld0;-><init>(IIB)V

    .line 731
    .line 732
    .line 733
    goto/16 :goto_f

    .line 734
    .line 735
    :cond_2a
    const/4 v14, 0x0

    .line 736
    new-instance v5, La/eld0;

    .line 737
    .line 738
    const/16 v7, 0x9

    .line 739
    .line 740
    invoke-direct {v5, v7, v14, v4}, La/eld0;-><init>(IIB)V

    .line 741
    .line 742
    .line 743
    :goto_13
    move/from16 v19, v7

    .line 744
    .line 745
    const/16 v8, 0xd

    .line 746
    .line 747
    const/16 v17, 0x8

    .line 748
    .line 749
    const/16 v18, 0x6

    .line 750
    .line 751
    goto/16 :goto_1c

    .line 752
    .line 753
    :goto_14
    invoke-static {v11}, La/wl50;->a(Landroid/content/Context;)La/wl50;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    invoke-virtual {v5}, La/wl50;->b()I

    .line 758
    .line 759
    .line 760
    move-result v5

    .line 761
    const/4 v11, 0x1

    .line 762
    if-ne v5, v11, :cond_2b

    .line 763
    .line 764
    new-instance v5, La/eld0;

    .line 765
    .line 766
    const/4 v8, 0x3

    .line 767
    invoke-direct {v5, v8, v14, v4}, La/eld0;-><init>(IIB)V

    .line 768
    .line 769
    .line 770
    goto :goto_13

    .line 771
    :cond_2b
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 772
    .line 773
    .line 774
    move-result-object v5

    .line 775
    instance-of v11, v5, Ljava/net/UnknownHostException;

    .line 776
    .line 777
    if-eqz v11, :cond_2c

    .line 778
    .line 779
    new-instance v5, La/eld0;

    .line 780
    .line 781
    const/4 v11, 0x6

    .line 782
    invoke-direct {v5, v11, v14, v4}, La/eld0;-><init>(IIB)V

    .line 783
    .line 784
    .line 785
    :goto_15
    move/from16 v19, v7

    .line 786
    .line 787
    move/from16 v18, v11

    .line 788
    .line 789
    const/16 v8, 0xd

    .line 790
    .line 791
    const/16 v17, 0x8

    .line 792
    .line 793
    goto/16 :goto_1c

    .line 794
    .line 795
    :cond_2c
    const/4 v11, 0x6

    .line 796
    instance-of v5, v5, Ljava/net/SocketTimeoutException;

    .line 797
    .line 798
    if-eqz v5, :cond_2d

    .line 799
    .line 800
    new-instance v5, La/eld0;

    .line 801
    .line 802
    invoke-direct {v5, v4, v14, v4}, La/eld0;-><init>(IIB)V

    .line 803
    .line 804
    .line 805
    goto :goto_15

    .line 806
    :cond_2d
    if-eqz v8, :cond_2e

    .line 807
    .line 808
    check-cast v9, La/ntw;

    .line 809
    .line 810
    iget-byte v5, v9, La/ntw;->b:B

    .line 811
    .line 812
    const/4 v8, 0x1

    .line 813
    if-ne v5, v8, :cond_2e

    .line 814
    .line 815
    new-instance v5, La/eld0;

    .line 816
    .line 817
    const/4 v8, 0x4

    .line 818
    invoke-direct {v5, v8, v14, v4}, La/eld0;-><init>(IIB)V

    .line 819
    .line 820
    .line 821
    goto :goto_15

    .line 822
    :cond_2e
    new-instance v5, La/eld0;

    .line 823
    .line 824
    const/16 v8, 0x8

    .line 825
    .line 826
    invoke-direct {v5, v8, v14, v4}, La/eld0;-><init>(IIB)V

    .line 827
    .line 828
    .line 829
    :goto_16
    move/from16 v19, v7

    .line 830
    .line 831
    move/from16 v17, v8

    .line 832
    .line 833
    move/from16 v18, v11

    .line 834
    .line 835
    :goto_17
    const/16 v8, 0xd

    .line 836
    .line 837
    goto/16 :goto_1c

    .line 838
    .line 839
    :goto_18
    new-instance v5, La/eld0;

    .line 840
    .line 841
    if-eqz v12, :cond_2f

    .line 842
    .line 843
    const/16 v9, 0xa

    .line 844
    .line 845
    goto :goto_19

    .line 846
    :cond_2f
    const/16 v9, 0xb

    .line 847
    .line 848
    :goto_19
    invoke-direct {v5, v9, v14, v4}, La/eld0;-><init>(IIB)V

    .line 849
    .line 850
    .line 851
    goto :goto_16

    .line 852
    :cond_30
    const/16 v11, 0x18

    .line 853
    .line 854
    const/16 v12, 0x1c

    .line 855
    .line 856
    const/4 v14, 0x0

    .line 857
    const/16 v17, 0x8

    .line 858
    .line 859
    const/16 v18, 0x6

    .line 860
    .line 861
    const/16 v19, 0x9

    .line 862
    .line 863
    if-eqz v8, :cond_32

    .line 864
    .line 865
    if-eqz v13, :cond_31

    .line 866
    .line 867
    const/4 v5, 0x1

    .line 868
    if-ne v13, v5, :cond_32

    .line 869
    .line 870
    :cond_31
    new-instance v5, La/eld0;

    .line 871
    .line 872
    const/16 v7, 0x23

    .line 873
    .line 874
    invoke-direct {v5, v7, v14, v4}, La/eld0;-><init>(IIB)V

    .line 875
    .line 876
    .line 877
    goto :goto_17

    .line 878
    :cond_32
    if-eqz v8, :cond_33

    .line 879
    .line 880
    const/4 v5, 0x3

    .line 881
    if-ne v13, v5, :cond_33

    .line 882
    .line 883
    new-instance v5, La/eld0;

    .line 884
    .line 885
    const/16 v7, 0xf

    .line 886
    .line 887
    invoke-direct {v5, v7, v14, v4}, La/eld0;-><init>(IIB)V

    .line 888
    .line 889
    .line 890
    goto :goto_17

    .line 891
    :cond_33
    if-eqz v8, :cond_34

    .line 892
    .line 893
    const/4 v5, 0x2

    .line 894
    if-ne v13, v5, :cond_34

    .line 895
    .line 896
    new-instance v5, La/eld0;

    .line 897
    .line 898
    const/16 v7, 0x17

    .line 899
    .line 900
    invoke-direct {v5, v7, v14, v4}, La/eld0;-><init>(IIB)V

    .line 901
    .line 902
    .line 903
    goto :goto_17

    .line 904
    :cond_34
    instance-of v5, v9, La/km30;

    .line 905
    .line 906
    if-eqz v5, :cond_35

    .line 907
    .line 908
    check-cast v9, La/km30;

    .line 909
    .line 910
    iget-object v5, v9, La/km30;->d:Ljava/lang/String;

    .line 911
    .line 912
    invoke-static {v5}, La/vtt0;->w(Ljava/lang/String;)I

    .line 913
    .line 914
    .line 915
    move-result v5

    .line 916
    new-instance v7, La/eld0;

    .line 917
    .line 918
    const/16 v8, 0xd

    .line 919
    .line 920
    invoke-direct {v7, v8, v5, v4}, La/eld0;-><init>(IIB)V

    .line 921
    .line 922
    .line 923
    :goto_1a
    move-object v5, v7

    .line 924
    goto/16 :goto_1c

    .line 925
    .line 926
    :cond_35
    const/16 v8, 0xd

    .line 927
    .line 928
    instance-of v5, v9, La/hm30;

    .line 929
    .line 930
    const/16 v13, 0xe

    .line 931
    .line 932
    if-eqz v5, :cond_36

    .line 933
    .line 934
    check-cast v9, La/hm30;

    .line 935
    .line 936
    iget v5, v9, La/hm30;->a:I

    .line 937
    .line 938
    new-instance v7, La/eld0;

    .line 939
    .line 940
    invoke-direct {v7, v13, v5, v4}, La/eld0;-><init>(IIB)V

    .line 941
    .line 942
    .line 943
    goto :goto_1a

    .line 944
    :cond_36
    instance-of v5, v9, Ljava/lang/OutOfMemoryError;

    .line 945
    .line 946
    if-eqz v5, :cond_37

    .line 947
    .line 948
    new-instance v5, La/eld0;

    .line 949
    .line 950
    const/4 v14, 0x0

    .line 951
    invoke-direct {v5, v13, v14, v4}, La/eld0;-><init>(IIB)V

    .line 952
    .line 953
    .line 954
    goto :goto_1c

    .line 955
    :cond_37
    const/4 v14, 0x0

    .line 956
    instance-of v5, v9, La/b44;

    .line 957
    .line 958
    if-eqz v5, :cond_38

    .line 959
    .line 960
    new-instance v5, La/eld0;

    .line 961
    .line 962
    const/16 v7, 0x11

    .line 963
    .line 964
    invoke-direct {v5, v7, v14, v4}, La/eld0;-><init>(IIB)V

    .line 965
    .line 966
    .line 967
    goto :goto_1c

    .line 968
    :cond_38
    instance-of v5, v9, La/d44;

    .line 969
    .line 970
    if-eqz v5, :cond_39

    .line 971
    .line 972
    check-cast v9, La/d44;

    .line 973
    .line 974
    iget v5, v9, La/d44;->a:I

    .line 975
    .line 976
    new-instance v7, La/eld0;

    .line 977
    .line 978
    const/16 v9, 0x12

    .line 979
    .line 980
    invoke-direct {v7, v9, v5, v4}, La/eld0;-><init>(IIB)V

    .line 981
    .line 982
    .line 983
    goto :goto_1a

    .line 984
    :cond_39
    instance-of v5, v9, Landroid/media/MediaCodec$CryptoException;

    .line 985
    .line 986
    if-eqz v5, :cond_3a

    .line 987
    .line 988
    check-cast v9, Landroid/media/MediaCodec$CryptoException;

    .line 989
    .line 990
    invoke-virtual {v9}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 991
    .line 992
    .line 993
    move-result v5

    .line 994
    invoke-static {v5}, La/vtt0;->v(I)I

    .line 995
    .line 996
    .line 997
    move-result v9

    .line 998
    packed-switch v9, :pswitch_data_1

    .line 999
    .line 1000
    .line 1001
    goto :goto_1b

    .line 1002
    :pswitch_4
    move/from16 v7, v21

    .line 1003
    .line 1004
    goto :goto_1b

    .line 1005
    :pswitch_5
    move/from16 v7, v20

    .line 1006
    .line 1007
    goto :goto_1b

    .line 1008
    :pswitch_6
    move v7, v12

    .line 1009
    goto :goto_1b

    .line 1010
    :pswitch_7
    move v7, v11

    .line 1011
    :goto_1b
    new-instance v9, La/eld0;

    .line 1012
    .line 1013
    invoke-direct {v9, v7, v5, v4}, La/eld0;-><init>(IIB)V

    .line 1014
    .line 1015
    .line 1016
    move-object v5, v9

    .line 1017
    goto :goto_1c

    .line 1018
    :cond_3a
    new-instance v5, La/eld0;

    .line 1019
    .line 1020
    const/16 v7, 0x16

    .line 1021
    .line 1022
    const/4 v14, 0x0

    .line 1023
    invoke-direct {v5, v7, v14, v4}, La/eld0;-><init>(IIB)V

    .line 1024
    .line 1025
    .line 1026
    :goto_1c
    new-instance v7, Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1027
    .line 1028
    invoke-direct {v7}, Landroid/media/metrics/PlaybackErrorEvent$Builder;-><init>()V

    .line 1029
    .line 1030
    .line 1031
    iget-wide v11, v0, La/kn30;->e:J

    .line 1032
    .line 1033
    sub-long v11, v2, v11

    .line 1034
    .line 1035
    invoke-virtual {v7, v11, v12}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v7

    .line 1039
    iget v9, v5, La/eld0;->b:I

    .line 1040
    .line 1041
    invoke-virtual {v7, v9}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v7

    .line 1045
    iget v5, v5, La/eld0;->c:I

    .line 1046
    .line 1047
    invoke-virtual {v7, v5}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setSubErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v5

    .line 1051
    invoke-virtual {v5, v1}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setException(Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v1

    .line 1055
    invoke-virtual {v1}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->build()Landroid/media/metrics/PlaybackErrorEvent;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    iget-object v5, v0, La/kn30;->b:Ljava/util/concurrent/Executor;

    .line 1060
    .line 1061
    new-instance v7, La/llo;

    .line 1062
    .line 1063
    invoke-direct {v7, v0, v1, v15}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1064
    .line 1065
    .line 1066
    invoke-interface {v5, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1067
    .line 1068
    .line 1069
    const/4 v5, 0x1

    .line 1070
    iput-boolean v5, v0, La/kn30;->B:Z

    .line 1071
    .line 1072
    const/4 v1, 0x0

    .line 1073
    iput-object v1, v0, La/kn30;->o:La/dlo;

    .line 1074
    .line 1075
    goto/16 :goto_d

    .line 1076
    .line 1077
    :goto_1d
    invoke-virtual {v6, v1}, La/xr;->d(I)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v7

    .line 1081
    if-eqz v7, :cond_3b

    .line 1082
    .line 1083
    move-object/from16 v7, p1

    .line 1084
    .line 1085
    check-cast v7, La/ulo;

    .line 1086
    .line 1087
    invoke-virtual {v7}, La/ulo;->o()La/rds0;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v7

    .line 1091
    invoke-virtual {v7, v1}, La/rds0;->a(I)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v9

    .line 1095
    invoke-virtual {v7, v5}, La/rds0;->a(I)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v11

    .line 1099
    const/4 v5, 0x3

    .line 1100
    invoke-virtual {v7, v5}, La/rds0;->a(I)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v7

    .line 1104
    if-nez v9, :cond_3c

    .line 1105
    .line 1106
    if-nez v11, :cond_3c

    .line 1107
    .line 1108
    if-eqz v7, :cond_3b

    .line 1109
    .line 1110
    goto :goto_1e

    .line 1111
    :cond_3b
    move v12, v4

    .line 1112
    const/4 v7, 0x0

    .line 1113
    const/16 v9, 0xa

    .line 1114
    .line 1115
    goto/16 :goto_26

    .line 1116
    .line 1117
    :cond_3c
    :goto_1e
    if-nez v9, :cond_3f

    .line 1118
    .line 1119
    iget-object v1, v0, La/kn30;->s:Landroidx/media3/common/b;

    .line 1120
    .line 1121
    const/4 v5, 0x0

    .line 1122
    invoke-static {v1, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v1

    .line 1126
    if-eqz v1, :cond_3d

    .line 1127
    .line 1128
    move v12, v4

    .line 1129
    move-object v4, v5

    .line 1130
    goto :goto_20

    .line 1131
    :cond_3d
    iget-object v1, v0, La/kn30;->s:Landroidx/media3/common/b;

    .line 1132
    .line 1133
    if-nez v1, :cond_3e

    .line 1134
    .line 1135
    const/4 v1, 0x1

    .line 1136
    goto :goto_1f

    .line 1137
    :cond_3e
    const/4 v1, 0x0

    .line 1138
    :goto_1f
    iput-object v5, v0, La/kn30;->s:Landroidx/media3/common/b;

    .line 1139
    .line 1140
    move-object/from16 v16, v5

    .line 1141
    .line 1142
    move v5, v1

    .line 1143
    const/4 v1, 0x1

    .line 1144
    move v12, v4

    .line 1145
    move-object/from16 v4, v16

    .line 1146
    .line 1147
    const/16 v9, 0xa

    .line 1148
    .line 1149
    invoke-virtual/range {v0 .. v5}, La/kn30;->g(IJLandroidx/media3/common/b;I)V

    .line 1150
    .line 1151
    .line 1152
    goto :goto_21

    .line 1153
    :cond_3f
    move v12, v4

    .line 1154
    const/4 v4, 0x0

    .line 1155
    :goto_20
    const/16 v9, 0xa

    .line 1156
    .line 1157
    :goto_21
    if-nez v11, :cond_42

    .line 1158
    .line 1159
    iget-object v1, v0, La/kn30;->t:Landroidx/media3/common/b;

    .line 1160
    .line 1161
    invoke-static {v1, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v1

    .line 1165
    if-eqz v1, :cond_40

    .line 1166
    .line 1167
    goto :goto_23

    .line 1168
    :cond_40
    iget-object v1, v0, La/kn30;->t:Landroidx/media3/common/b;

    .line 1169
    .line 1170
    if-nez v1, :cond_41

    .line 1171
    .line 1172
    const/4 v5, 0x1

    .line 1173
    goto :goto_22

    .line 1174
    :cond_41
    const/4 v5, 0x0

    .line 1175
    :goto_22
    iput-object v4, v0, La/kn30;->t:Landroidx/media3/common/b;

    .line 1176
    .line 1177
    const/4 v1, 0x0

    .line 1178
    invoke-virtual/range {v0 .. v5}, La/kn30;->g(IJLandroidx/media3/common/b;I)V

    .line 1179
    .line 1180
    .line 1181
    :cond_42
    :goto_23
    if-nez v7, :cond_45

    .line 1182
    .line 1183
    iget-object v1, v0, La/kn30;->u:Landroidx/media3/common/b;

    .line 1184
    .line 1185
    invoke-static {v1, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1186
    .line 1187
    .line 1188
    move-result v1

    .line 1189
    if-eqz v1, :cond_43

    .line 1190
    .line 1191
    goto :goto_25

    .line 1192
    :cond_43
    iget-object v1, v0, La/kn30;->u:Landroidx/media3/common/b;

    .line 1193
    .line 1194
    if-nez v1, :cond_44

    .line 1195
    .line 1196
    const/4 v5, 0x1

    .line 1197
    goto :goto_24

    .line 1198
    :cond_44
    const/4 v5, 0x0

    .line 1199
    :goto_24
    iput-object v4, v0, La/kn30;->u:Landroidx/media3/common/b;

    .line 1200
    .line 1201
    const/4 v1, 0x2

    .line 1202
    invoke-virtual/range {v0 .. v5}, La/kn30;->g(IJLandroidx/media3/common/b;I)V

    .line 1203
    .line 1204
    .line 1205
    :cond_45
    :goto_25
    move-object v7, v4

    .line 1206
    :goto_26
    iget-object v1, v0, La/kn30;->p:La/zz2;

    .line 1207
    .line 1208
    invoke-virtual {v0, v1}, La/kn30;->a(La/zz2;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v1

    .line 1212
    if-eqz v1, :cond_48

    .line 1213
    .line 1214
    iget-object v1, v0, La/kn30;->p:La/zz2;

    .line 1215
    .line 1216
    iget-object v4, v1, La/zz2;->b:Ljava/lang/Object;

    .line 1217
    .line 1218
    check-cast v4, Landroidx/media3/common/b;

    .line 1219
    .line 1220
    iget v5, v4, Landroidx/media3/common/b;->x:I

    .line 1221
    .line 1222
    const/4 v11, -0x1

    .line 1223
    if-eq v5, v11, :cond_48

    .line 1224
    .line 1225
    iget v1, v1, La/zz2;->a:I

    .line 1226
    .line 1227
    iget-object v5, v0, La/kn30;->s:Landroidx/media3/common/b;

    .line 1228
    .line 1229
    invoke-static {v5, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v5

    .line 1233
    if-eqz v5, :cond_46

    .line 1234
    .line 1235
    goto :goto_28

    .line 1236
    :cond_46
    iget-object v5, v0, La/kn30;->s:Landroidx/media3/common/b;

    .line 1237
    .line 1238
    if-nez v5, :cond_47

    .line 1239
    .line 1240
    if-nez v1, :cond_47

    .line 1241
    .line 1242
    const/4 v5, 0x1

    .line 1243
    goto :goto_27

    .line 1244
    :cond_47
    move v5, v1

    .line 1245
    :goto_27
    iput-object v4, v0, La/kn30;->s:Landroidx/media3/common/b;

    .line 1246
    .line 1247
    const/4 v1, 0x1

    .line 1248
    invoke-virtual/range {v0 .. v5}, La/kn30;->g(IJLandroidx/media3/common/b;I)V

    .line 1249
    .line 1250
    .line 1251
    :goto_28
    iput-object v7, v0, La/kn30;->p:La/zz2;

    .line 1252
    .line 1253
    :cond_48
    iget-object v1, v0, La/kn30;->q:La/zz2;

    .line 1254
    .line 1255
    invoke-virtual {v0, v1}, La/kn30;->a(La/zz2;)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v1

    .line 1259
    if-eqz v1, :cond_4b

    .line 1260
    .line 1261
    iget-object v1, v0, La/kn30;->q:La/zz2;

    .line 1262
    .line 1263
    iget-object v4, v1, La/zz2;->b:Ljava/lang/Object;

    .line 1264
    .line 1265
    check-cast v4, Landroidx/media3/common/b;

    .line 1266
    .line 1267
    iget v1, v1, La/zz2;->a:I

    .line 1268
    .line 1269
    iget-object v5, v0, La/kn30;->t:Landroidx/media3/common/b;

    .line 1270
    .line 1271
    invoke-static {v5, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v5

    .line 1275
    if-eqz v5, :cond_49

    .line 1276
    .line 1277
    goto :goto_2a

    .line 1278
    :cond_49
    iget-object v5, v0, La/kn30;->t:Landroidx/media3/common/b;

    .line 1279
    .line 1280
    if-nez v5, :cond_4a

    .line 1281
    .line 1282
    if-nez v1, :cond_4a

    .line 1283
    .line 1284
    const/4 v5, 0x1

    .line 1285
    goto :goto_29

    .line 1286
    :cond_4a
    move v5, v1

    .line 1287
    :goto_29
    iput-object v4, v0, La/kn30;->t:Landroidx/media3/common/b;

    .line 1288
    .line 1289
    const/4 v1, 0x0

    .line 1290
    invoke-virtual/range {v0 .. v5}, La/kn30;->g(IJLandroidx/media3/common/b;I)V

    .line 1291
    .line 1292
    .line 1293
    :goto_2a
    iput-object v7, v0, La/kn30;->q:La/zz2;

    .line 1294
    .line 1295
    :cond_4b
    iget-object v1, v0, La/kn30;->r:La/zz2;

    .line 1296
    .line 1297
    invoke-virtual {v0, v1}, La/kn30;->a(La/zz2;)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v1

    .line 1301
    if-eqz v1, :cond_4e

    .line 1302
    .line 1303
    iget-object v1, v0, La/kn30;->r:La/zz2;

    .line 1304
    .line 1305
    iget-object v4, v1, La/zz2;->b:Ljava/lang/Object;

    .line 1306
    .line 1307
    check-cast v4, Landroidx/media3/common/b;

    .line 1308
    .line 1309
    iget v1, v1, La/zz2;->a:I

    .line 1310
    .line 1311
    iget-object v5, v0, La/kn30;->u:Landroidx/media3/common/b;

    .line 1312
    .line 1313
    invoke-static {v5, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v5

    .line 1317
    if-eqz v5, :cond_4c

    .line 1318
    .line 1319
    goto :goto_2c

    .line 1320
    :cond_4c
    iget-object v5, v0, La/kn30;->u:Landroidx/media3/common/b;

    .line 1321
    .line 1322
    if-nez v5, :cond_4d

    .line 1323
    .line 1324
    if-nez v1, :cond_4d

    .line 1325
    .line 1326
    const/4 v5, 0x1

    .line 1327
    goto :goto_2b

    .line 1328
    :cond_4d
    move v5, v1

    .line 1329
    :goto_2b
    iput-object v4, v0, La/kn30;->u:Landroidx/media3/common/b;

    .line 1330
    .line 1331
    const/4 v1, 0x2

    .line 1332
    invoke-virtual/range {v0 .. v5}, La/kn30;->g(IJLandroidx/media3/common/b;I)V

    .line 1333
    .line 1334
    .line 1335
    :goto_2c
    iput-object v7, v0, La/kn30;->r:La/zz2;

    .line 1336
    .line 1337
    :cond_4e
    iget-object v1, v0, La/kn30;->a:Landroid/content/Context;

    .line 1338
    .line 1339
    invoke-static {v1}, La/wl50;->a(Landroid/content/Context;)La/wl50;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v1

    .line 1343
    invoke-virtual {v1}, La/wl50;->b()I

    .line 1344
    .line 1345
    .line 1346
    move-result v1

    .line 1347
    packed-switch v1, :pswitch_data_2

    .line 1348
    .line 1349
    .line 1350
    :pswitch_8
    const/4 v1, 0x1

    .line 1351
    goto :goto_2d

    .line 1352
    :pswitch_9
    move v1, v12

    .line 1353
    goto :goto_2d

    .line 1354
    :pswitch_a
    move/from16 v1, v17

    .line 1355
    .line 1356
    goto :goto_2d

    .line 1357
    :pswitch_b
    const/4 v1, 0x3

    .line 1358
    goto :goto_2d

    .line 1359
    :pswitch_c
    move/from16 v1, v18

    .line 1360
    .line 1361
    goto :goto_2d

    .line 1362
    :pswitch_d
    move v1, v10

    .line 1363
    goto :goto_2d

    .line 1364
    :pswitch_e
    const/4 v1, 0x4

    .line 1365
    goto :goto_2d

    .line 1366
    :pswitch_f
    const/4 v1, 0x2

    .line 1367
    goto :goto_2d

    .line 1368
    :pswitch_10
    move/from16 v1, v19

    .line 1369
    .line 1370
    goto :goto_2d

    .line 1371
    :pswitch_11
    const/4 v1, 0x0

    .line 1372
    :goto_2d
    iget v4, v0, La/kn30;->n:I

    .line 1373
    .line 1374
    if-eq v1, v4, :cond_4f

    .line 1375
    .line 1376
    iput v1, v0, La/kn30;->n:I

    .line 1377
    .line 1378
    new-instance v4, Landroid/media/metrics/NetworkEvent$Builder;

    .line 1379
    .line 1380
    invoke-direct {v4}, Landroid/media/metrics/NetworkEvent$Builder;-><init>()V

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v4, v1}, Landroid/media/metrics/NetworkEvent$Builder;->setNetworkType(I)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v1

    .line 1387
    iget-wide v4, v0, La/kn30;->e:J

    .line 1388
    .line 1389
    sub-long v4, v2, v4

    .line 1390
    .line 1391
    invoke-virtual {v1, v4, v5}, Landroid/media/metrics/NetworkEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v1

    .line 1395
    invoke-virtual {v1}, Landroid/media/metrics/NetworkEvent$Builder;->build()Landroid/media/metrics/NetworkEvent;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v1

    .line 1399
    iget-object v4, v0, La/kn30;->b:Ljava/util/concurrent/Executor;

    .line 1400
    .line 1401
    new-instance v5, La/llo;

    .line 1402
    .line 1403
    const/16 v7, 0x14

    .line 1404
    .line 1405
    invoke-direct {v5, v0, v1, v7}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1406
    .line 1407
    .line 1408
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1409
    .line 1410
    .line 1411
    :cond_4f
    move-object/from16 v1, p1

    .line 1412
    .line 1413
    check-cast v1, La/ulo;

    .line 1414
    .line 1415
    invoke-virtual {v1}, La/ulo;->s()I

    .line 1416
    .line 1417
    .line 1418
    move-result v4

    .line 1419
    const/4 v5, 0x2

    .line 1420
    const/4 v14, 0x0

    .line 1421
    if-eq v4, v5, :cond_50

    .line 1422
    .line 1423
    iput-boolean v14, v0, La/kn30;->v:Z

    .line 1424
    .line 1425
    :cond_50
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 1426
    .line 1427
    .line 1428
    iget-object v4, v1, La/ulo;->n0:La/yx90;

    .line 1429
    .line 1430
    iget-object v4, v4, La/yx90;->f:La/dlo;

    .line 1431
    .line 1432
    if-nez v4, :cond_51

    .line 1433
    .line 1434
    iput-boolean v14, v0, La/kn30;->x:Z

    .line 1435
    .line 1436
    goto :goto_2e

    .line 1437
    :cond_51
    invoke-virtual {v6, v9}, La/xr;->d(I)Z

    .line 1438
    .line 1439
    .line 1440
    move-result v4

    .line 1441
    if-eqz v4, :cond_52

    .line 1442
    .line 1443
    const/4 v5, 0x1

    .line 1444
    iput-boolean v5, v0, La/kn30;->x:Z

    .line 1445
    .line 1446
    :cond_52
    :goto_2e
    invoke-virtual {v1}, La/ulo;->s()I

    .line 1447
    .line 1448
    .line 1449
    move-result v4

    .line 1450
    iget-boolean v5, v0, La/kn30;->v:Z

    .line 1451
    .line 1452
    if-eqz v5, :cond_54

    .line 1453
    .line 1454
    move v7, v10

    .line 1455
    :cond_53
    :goto_2f
    const/4 v8, 0x1

    .line 1456
    goto :goto_31

    .line 1457
    :cond_54
    iget-boolean v5, v0, La/kn30;->x:Z

    .line 1458
    .line 1459
    if-eqz v5, :cond_55

    .line 1460
    .line 1461
    :goto_30
    move v7, v8

    .line 1462
    goto :goto_2f

    .line 1463
    :cond_55
    const/4 v8, 0x4

    .line 1464
    if-ne v4, v8, :cond_56

    .line 1465
    .line 1466
    const/16 v7, 0xb

    .line 1467
    .line 1468
    goto :goto_2f

    .line 1469
    :cond_56
    const/16 v5, 0xc

    .line 1470
    .line 1471
    const/4 v7, 0x2

    .line 1472
    if-ne v4, v7, :cond_5a

    .line 1473
    .line 1474
    iget v4, v0, La/kn30;->m:I

    .line 1475
    .line 1476
    if-eqz v4, :cond_53

    .line 1477
    .line 1478
    if-eq v4, v7, :cond_53

    .line 1479
    .line 1480
    if-ne v4, v5, :cond_57

    .line 1481
    .line 1482
    goto :goto_2f

    .line 1483
    :cond_57
    invoke-virtual {v1}, La/ulo;->r()Z

    .line 1484
    .line 1485
    .line 1486
    move-result v4

    .line 1487
    if-nez v4, :cond_58

    .line 1488
    .line 1489
    move v7, v12

    .line 1490
    goto :goto_2f

    .line 1491
    :cond_58
    invoke-virtual {v1}, La/ulo;->t()I

    .line 1492
    .line 1493
    .line 1494
    move-result v1

    .line 1495
    if-eqz v1, :cond_59

    .line 1496
    .line 1497
    move v7, v9

    .line 1498
    goto :goto_2f

    .line 1499
    :cond_59
    move/from16 v7, v18

    .line 1500
    .line 1501
    goto :goto_2f

    .line 1502
    :cond_5a
    const/4 v7, 0x3

    .line 1503
    if-ne v4, v7, :cond_5c

    .line 1504
    .line 1505
    invoke-virtual {v1}, La/ulo;->r()Z

    .line 1506
    .line 1507
    .line 1508
    move-result v4

    .line 1509
    if-nez v4, :cond_5b

    .line 1510
    .line 1511
    goto :goto_30

    .line 1512
    :cond_5b
    invoke-virtual {v1}, La/ulo;->t()I

    .line 1513
    .line 1514
    .line 1515
    move-result v1

    .line 1516
    if-eqz v1, :cond_53

    .line 1517
    .line 1518
    move/from16 v7, v19

    .line 1519
    .line 1520
    goto :goto_2f

    .line 1521
    :cond_5c
    const/4 v8, 0x1

    .line 1522
    if-ne v4, v8, :cond_5d

    .line 1523
    .line 1524
    iget v1, v0, La/kn30;->m:I

    .line 1525
    .line 1526
    if-eqz v1, :cond_5d

    .line 1527
    .line 1528
    move v7, v5

    .line 1529
    goto :goto_31

    .line 1530
    :cond_5d
    iget v1, v0, La/kn30;->m:I

    .line 1531
    .line 1532
    move v7, v1

    .line 1533
    :goto_31
    iget v1, v0, La/kn30;->m:I

    .line 1534
    .line 1535
    if-eq v1, v7, :cond_5e

    .line 1536
    .line 1537
    iput v7, v0, La/kn30;->m:I

    .line 1538
    .line 1539
    iput-boolean v8, v0, La/kn30;->B:Z

    .line 1540
    .line 1541
    new-instance v1, Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1542
    .line 1543
    invoke-direct {v1}, Landroid/media/metrics/PlaybackStateEvent$Builder;-><init>()V

    .line 1544
    .line 1545
    .line 1546
    iget v4, v0, La/kn30;->m:I

    .line 1547
    .line 1548
    invoke-virtual {v1, v4}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setState(I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v1

    .line 1552
    iget-wide v4, v0, La/kn30;->e:J

    .line 1553
    .line 1554
    sub-long/2addr v2, v4

    .line 1555
    invoke-virtual {v1, v2, v3}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v1

    .line 1559
    invoke-virtual {v1}, Landroid/media/metrics/PlaybackStateEvent$Builder;->build()Landroid/media/metrics/PlaybackStateEvent;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v1

    .line 1563
    iget-object v2, v0, La/kn30;->b:Ljava/util/concurrent/Executor;

    .line 1564
    .line 1565
    new-instance v3, La/llo;

    .line 1566
    .line 1567
    const/16 v7, 0x17

    .line 1568
    .line 1569
    invoke-direct {v3, v0, v1, v7}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1570
    .line 1571
    .line 1572
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1573
    .line 1574
    .line 1575
    :cond_5e
    const/16 v1, 0x404

    .line 1576
    .line 1577
    invoke-virtual {v6, v1}, La/xr;->d(I)Z

    .line 1578
    .line 1579
    .line 1580
    move-result v2

    .line 1581
    if-eqz v2, :cond_62

    .line 1582
    .line 1583
    iget-object v2, v0, La/kn30;->c:La/owj;

    .line 1584
    .line 1585
    iget-object v0, v6, La/xr;->b:Ljava/lang/Object;

    .line 1586
    .line 1587
    check-cast v0, Landroid/util/SparseArray;

    .line 1588
    .line 1589
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v0

    .line 1593
    check-cast v0, La/ft2;

    .line 1594
    .line 1595
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1596
    .line 1597
    .line 1598
    monitor-enter v2

    .line 1599
    :try_start_4
    iget-object v1, v2, La/owj;->f:Ljava/lang/String;

    .line 1600
    .line 1601
    if-eqz v1, :cond_5f

    .line 1602
    .line 1603
    iget-object v3, v2, La/owj;->c:Ljava/util/HashMap;

    .line 1604
    .line 1605
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v1

    .line 1609
    check-cast v1, La/nwj;

    .line 1610
    .line 1611
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v2, v1}, La/owj;->a(La/nwj;)V

    .line 1615
    .line 1616
    .line 1617
    goto :goto_32

    .line 1618
    :catchall_2
    move-exception v0

    .line 1619
    goto :goto_34

    .line 1620
    :cond_5f
    :goto_32
    iget-object v1, v2, La/owj;->c:Ljava/util/HashMap;

    .line 1621
    .line 1622
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v1

    .line 1626
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v1

    .line 1630
    :cond_60
    :goto_33
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1631
    .line 1632
    .line 1633
    move-result v3

    .line 1634
    if-eqz v3, :cond_61

    .line 1635
    .line 1636
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v3

    .line 1640
    check-cast v3, La/nwj;

    .line 1641
    .line 1642
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 1643
    .line 1644
    .line 1645
    iget-boolean v4, v3, La/nwj;->e:Z

    .line 1646
    .line 1647
    if-eqz v4, :cond_60

    .line 1648
    .line 1649
    iget-object v4, v2, La/owj;->d:La/kn30;

    .line 1650
    .line 1651
    if-eqz v4, :cond_60

    .line 1652
    .line 1653
    iget-object v3, v3, La/nwj;->a:Ljava/lang/String;

    .line 1654
    .line 1655
    invoke-virtual {v4, v0, v3}, La/kn30;->f(La/ft2;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1656
    .line 1657
    .line 1658
    goto :goto_33

    .line 1659
    :cond_61
    monitor-exit v2

    .line 1660
    return-void

    .line 1661
    :goto_34
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1662
    throw v0

    .line 1663
    :cond_62
    :goto_35
    return-void

    .line 1664
    nop

    .line 1665
    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    :pswitch_data_1
    .packed-switch 0x1772
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_b
        :pswitch_8
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public final e(La/ft2;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p1, La/ft2;->d:La/vn30;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/vn30;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, La/kn30;->b()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, La/kn30;->j:Ljava/lang/String;

    .line 16
    .line 17
    new-instance p2, Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 18
    .line 19
    invoke-direct {p2}, Landroid/media/metrics/PlaybackMetrics$Builder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "AndroidXMedia3"

    .line 23
    .line 24
    invoke-virtual {p2, v1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerName(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v1, "1.11.1"

    .line 29
    .line 30
    invoke-virtual {p2, v1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerVersion(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, La/kn30;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 35
    .line 36
    iget-object p1, p1, La/ft2;->b:La/bmq0;

    .line 37
    .line 38
    invoke-virtual {p0, p1, v0}, La/kn30;->c(La/bmq0;La/vn30;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final f(La/ft2;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p1, La/ft2;->d:La/vn30;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, La/vn30;->c()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, La/kn30;->j:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, La/kn30;->b()V

    .line 21
    .line 22
    .line 23
    :cond_2
    :goto_0
    iget-object p1, p0, La/kn30;->h:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/kn30;->i:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final g(IJLandroidx/media3/common/b;I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/media/metrics/TrackChangeEvent$Builder;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, La/kn30;->e:J

    .line 7
    .line 8
    sub-long/2addr p2, v1

    .line 9
    invoke-virtual {v0, p2, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    const/4 p3, 0x1

    .line 15
    if-eqz p4, :cond_d

    .line 16
    .line 17
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    if-eq p5, p3, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    if-eq p5, v0, :cond_2

    .line 25
    .line 26
    if-eq p5, v1, :cond_0

    .line 27
    .line 28
    move v1, p3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v1, v0

    .line 33
    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackChangeReason(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 34
    .line 35
    .line 36
    iget-object p5, p4, Landroidx/media3/common/b;->o:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz p5, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setContainerMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 41
    .line 42
    .line 43
    :cond_3
    iget-object p5, p4, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz p5, :cond_4

    .line 46
    .line 47
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setSampleMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 48
    .line 49
    .line 50
    :cond_4
    iget-object p5, p4, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 51
    .line 52
    if-eqz p5, :cond_5

    .line 53
    .line 54
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setCodecName(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 55
    .line 56
    .line 57
    :cond_5
    iget p5, p4, Landroidx/media3/common/b;->k:I

    .line 58
    .line 59
    const/4 v1, -0x1

    .line 60
    if-eq p5, v1, :cond_6

    .line 61
    .line 62
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setBitrate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 63
    .line 64
    .line 65
    :cond_6
    iget p5, p4, Landroidx/media3/common/b;->w:I

    .line 66
    .line 67
    if-eq p5, v1, :cond_7

    .line 68
    .line 69
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setWidth(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 70
    .line 71
    .line 72
    :cond_7
    iget p5, p4, Landroidx/media3/common/b;->x:I

    .line 73
    .line 74
    if-eq p5, v1, :cond_8

    .line 75
    .line 76
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setHeight(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 77
    .line 78
    .line 79
    :cond_8
    iget p5, p4, Landroidx/media3/common/b;->J:I

    .line 80
    .line 81
    if-eq p5, v1, :cond_9

    .line 82
    .line 83
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setChannelCount(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 84
    .line 85
    .line 86
    :cond_9
    iget p5, p4, Landroidx/media3/common/b;->L:I

    .line 87
    .line 88
    if-eq p5, v1, :cond_a

    .line 89
    .line 90
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setAudioSampleRate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 91
    .line 92
    .line 93
    :cond_a
    iget-object p5, p4, Landroidx/media3/common/b;->d:Ljava/lang/String;

    .line 94
    .line 95
    if-eqz p5, :cond_c

    .line 96
    .line 97
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 98
    .line 99
    const-string v2, "-"

    .line 100
    .line 101
    invoke-virtual {p5, v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p5

    .line 105
    aget-object p2, p5, p2

    .line 106
    .line 107
    array-length v1, p5

    .line 108
    if-lt v1, v0, :cond_b

    .line 109
    .line 110
    aget-object p5, p5, p3

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_b
    const/4 p5, 0x0

    .line 114
    :goto_1
    invoke-static {p2, p5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    iget-object p5, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p5, Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguage(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 123
    .line 124
    .line 125
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 126
    .line 127
    if-eqz p2, :cond_c

    .line 128
    .line 129
    check-cast p2, Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguageRegion(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 132
    .line 133
    .line 134
    :cond_c
    iget p2, p4, Landroidx/media3/common/b;->B:F

    .line 135
    .line 136
    const/high16 p4, -0x40800000    # -1.0f

    .line 137
    .line 138
    cmpl-float p4, p2, p4

    .line 139
    .line 140
    if-eqz p4, :cond_e

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setVideoFrameRate(F)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_d
    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 147
    .line 148
    .line 149
    :cond_e
    :goto_2
    iput-boolean p3, p0, La/kn30;->B:Z

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/media/metrics/TrackChangeEvent$Builder;->build()Landroid/media/metrics/TrackChangeEvent;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance p2, La/llo;

    .line 156
    .line 157
    const/16 p3, 0x13

    .line 158
    .line 159
    invoke-direct {p2, p0, p1, p3}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 160
    .line 161
    .line 162
    iget-object p0, p0, La/kn30;->b:Ljava/util/concurrent/Executor;

    .line 163
    .line 164
    invoke-interface {p0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 165
    .line 166
    .line 167
    return-void
.end method
