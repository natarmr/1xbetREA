.class public final La/jbw;
.super La/e06;
.source "SourceFile"


# instance fields
.field public final i:La/ruj;

.field public final j:La/psc;

.field public final k:La/kwd;

.field public final l:La/cil;

.field public final m:La/x860;

.field public final n:Z

.field public final o:Z

.field public final p:La/vuj;

.field public final q:J

.field public r:La/dn30;

.field public s:La/rsj;

.field public t:Landroidx/media3/common/MediaItem;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer.hls"

    .line 2
    .line 3
    invoke-static {v0}, La/hn30;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/MediaItem;La/psc;La/ruj;La/kwd;La/cil;La/x860;La/vuj;JZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/e06;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jbw;->t:Landroidx/media3/common/MediaItem;

    .line 5
    .line 6
    iget-object p1, p1, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 7
    .line 8
    iput-object p1, p0, La/jbw;->r:La/dn30;

    .line 9
    .line 10
    iput-object p2, p0, La/jbw;->j:La/psc;

    .line 11
    .line 12
    iput-object p3, p0, La/jbw;->i:La/ruj;

    .line 13
    .line 14
    iput-object p4, p0, La/jbw;->k:La/kwd;

    .line 15
    .line 16
    iput-object p5, p0, La/jbw;->l:La/cil;

    .line 17
    .line 18
    iput-object p6, p0, La/jbw;->m:La/x860;

    .line 19
    .line 20
    iput-object p7, p0, La/jbw;->p:La/vuj;

    .line 21
    .line 22
    iput-wide p8, p0, La/jbw;->q:J

    .line 23
    .line 24
    iput-boolean p10, p0, La/jbw;->n:Z

    .line 25
    .line 26
    iput-boolean p11, p0, La/jbw;->o:Z

    .line 27
    .line 28
    return-void
.end method

.method public static s(JLjava/util/List;)La/dbw;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, La/dbw;

    .line 14
    .line 15
    iget-wide v3, v2, La/gbw;->e:J

    .line 16
    .line 17
    cmp-long v5, v3, p0

    .line 18
    .line 19
    if-gtz v5, :cond_0

    .line 20
    .line 21
    iget-boolean v5, v2, La/dbw;->l:Z

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    move-object v0, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    cmp-long v2, v3, p0

    .line 28
    .line 29
    if-lez v2, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final a(La/vn30;La/lhf0;J)La/mn30;
    .locals 14

    .line 1
    new-instance v8, La/zhl;

    .line 2
    .line 3
    iget-object v0, p0, La/e06;->c:La/zhl;

    .line 4
    .line 5
    iget-object v0, v0, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v8, v0, v1, p1}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 9
    .line 10
    .line 11
    new-instance v6, La/zhl;

    .line 12
    .line 13
    iget-object v0, p0, La/e06;->d:La/zhl;

    .line 14
    .line 15
    iget-object v0, v0, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-direct {v6, v0, v1, p1}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, La/zaw;

    .line 21
    .line 22
    iget-object v4, p0, La/jbw;->s:La/rsj;

    .line 23
    .line 24
    iget-object v13, p0, La/e06;->g:La/a4a0;

    .line 25
    .line 26
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/jbw;->i:La/ruj;

    .line 30
    .line 31
    iget-object v2, p0, La/jbw;->p:La/vuj;

    .line 32
    .line 33
    iget-object v3, p0, La/jbw;->j:La/psc;

    .line 34
    .line 35
    iget-object v5, p0, La/jbw;->l:La/cil;

    .line 36
    .line 37
    iget-object v7, p0, La/jbw;->m:La/x860;

    .line 38
    .line 39
    iget-object v10, p0, La/jbw;->k:La/kwd;

    .line 40
    .line 41
    iget-boolean v11, p0, La/jbw;->n:Z

    .line 42
    .line 43
    iget-boolean v12, p0, La/jbw;->o:Z

    .line 44
    .line 45
    move-object/from16 v9, p2

    .line 46
    .line 47
    invoke-direct/range {v0 .. v13}, La/zaw;-><init>(La/ruj;La/vuj;La/psc;La/rsj;La/cil;La/zhl;La/x860;La/zhl;La/lhf0;La/kwd;ZILa/a4a0;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public final declared-synchronized g()Landroidx/media3/common/MediaItem;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/jbw;->t:Landroidx/media3/common/MediaItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object p0, p0, La/jbw;->p:La/vuj;

    .line 2
    .line 3
    iget-object v0, p0, La/vuj;->g:La/lhf0;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, v0, La/lhf0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/io/IOException;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/lhf0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/jq00;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget v1, v0, La/jq00;->a:I

    .line 20
    .line 21
    iget-object v2, v0, La/jq00;->e:Ljava/io/IOException;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget v0, v0, La/jq00;->f:I

    .line 26
    .line 27
    if-gt v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    throw v2

    .line 31
    :cond_1
    throw v1

    .line 32
    :cond_2
    :goto_0
    iget-object v0, p0, La/vuj;->l:La/kq80;

    .line 33
    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    iget-object v0, p0, La/vuj;->r:Landroid/net/Uri;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0, v0}, La/vuj;->j(Landroid/net/Uri;)V

    .line 41
    .line 42
    .line 43
    :cond_3
    return-void

    .line 44
    :cond_4
    throw v0
.end method

.method public final k(La/rsj;)V
    .locals 14

    .line 1
    iput-object p1, p0, La/jbw;->s:La/rsj;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/e06;->g:La/a4a0;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, La/jbw;->l:La/cil;

    .line 16
    .line 17
    invoke-interface {v1, p1, v0}, La/cil;->a(Landroid/os/Looper;La/a4a0;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, La/cil;->b()V

    .line 21
    .line 22
    .line 23
    new-instance p1, La/zhl;

    .line 24
    .line 25
    iget-object v0, p0, La/e06;->c:La/zhl;

    .line 26
    .line 27
    iget-object v0, v0, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {p1, v0, v1, v2}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/jbw;->g()Landroidx/media3/common/MediaItem;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v0, v0, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v4, v0, La/en30;->a:Landroid/net/Uri;

    .line 44
    .line 45
    iget-object v0, p0, La/e06;->h:La/rsj;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, La/vtt0;->n(La/wm30;)Landroid/os/Handler;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v13, p0, La/jbw;->p:La/vuj;

    .line 55
    .line 56
    iput-object v2, v13, La/vuj;->h:Landroid/os/Handler;

    .line 57
    .line 58
    iput-object p1, v13, La/vuj;->f:La/zhl;

    .line 59
    .line 60
    iput-object p0, v13, La/vuj;->i:La/jbw;

    .line 61
    .line 62
    iput-object v0, v13, La/vuj;->j:La/rsj;

    .line 63
    .line 64
    sget-object v7, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 65
    .line 66
    const-string p0, "The uri must be set."

    .line 67
    .line 68
    invoke-static {v4, p0}, La/x0x;->G(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v3, La/mbj;

    .line 72
    .line 73
    const/4 v5, 0x1

    .line 74
    const/4 v6, 0x0

    .line 75
    const-wide/16 v8, 0x0

    .line 76
    .line 77
    const-wide/16 v10, -0x1

    .line 78
    .line 79
    const/4 v12, 0x1

    .line 80
    invoke-direct/range {v3 .. v12}, La/mbj;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    .line 81
    .line 82
    .line 83
    new-instance p0, La/mq80;

    .line 84
    .line 85
    iget-object p1, v13, La/vuj;->a:La/psc;

    .line 86
    .line 87
    iget-object p1, p1, La/psc;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, La/hbj;

    .line 90
    .line 91
    invoke-interface {p1}, La/hbj;->d()La/jbj;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object v0, v13, La/vuj;->b:La/qbw;

    .line 96
    .line 97
    invoke-interface {v0}, La/qbw;->a()La/lq80;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const/4 v2, 0x4

    .line 102
    invoke-direct {p0, p1, v3, v2, v0}, La/mq80;-><init>(La/jbj;La/mbj;ILa/lq80;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, v13, La/vuj;->g:La/lhf0;

    .line 106
    .line 107
    const/4 v0, 0x1

    .line 108
    if-nez p1, :cond_0

    .line 109
    .line 110
    move v1, v0

    .line 111
    :cond_0
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 112
    .line 113
    .line 114
    new-instance p1, La/lhf0;

    .line 115
    .line 116
    const-string v1, "DefaultHlsPlaylistTracker:MultivariantPlaylist"

    .line 117
    .line 118
    invoke-direct {p1, v1, v0}, La/lhf0;-><init>(Ljava/lang/String;B)V

    .line 119
    .line 120
    .line 121
    iput-object p1, v13, La/vuj;->g:La/lhf0;

    .line 122
    .line 123
    iget-object v0, v13, La/vuj;->c:La/x860;

    .line 124
    .line 125
    iget-byte v1, p0, La/mq80;->c:B

    .line 126
    .line 127
    invoke-virtual {v0, v1}, La/x860;->e(I)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-virtual {p1, p0, v13, v0}, La/lhf0;->J(La/kq00;La/iq00;I)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final o()V
    .locals 6

    .line 1
    iget-object v0, p0, La/jbw;->p:La/vuj;

    .line 2
    .line 3
    iget-object v1, v0, La/vuj;->d:Ljava/util/HashMap;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-object v2, v0, La/vuj;->r:Landroid/net/Uri;

    .line 7
    .line 8
    iput-object v2, v0, La/vuj;->s:La/ibw;

    .line 9
    .line 10
    iput-object v2, v0, La/vuj;->k:La/mbw;

    .line 11
    .line 12
    iget-object v3, v0, La/vuj;->m:La/xaw;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, La/xaw;->f()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iput-object v2, v0, La/vuj;->n:La/b4x;

    .line 20
    .line 21
    iput-object v2, v0, La/vuj;->o:La/b4x;

    .line 22
    .line 23
    iput-object v2, v0, La/vuj;->p:La/b4x;

    .line 24
    .line 25
    iput-object v2, v0, La/vuj;->q:La/b4x;

    .line 26
    .line 27
    iput-object v2, v0, La/vuj;->l:La/kq80;

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    iput-wide v3, v0, La/vuj;->v:J

    .line 35
    .line 36
    iget-object v3, v0, La/vuj;->g:La/lhf0;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, La/lhf0;->F(La/lq00;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, v0, La/vuj;->g:La/lhf0;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, La/uuj;

    .line 62
    .line 63
    iget-object v4, v4, La/uuj;->b:Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_1

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, La/tuj;

    .line 84
    .line 85
    iget-object v5, v5, La/tuj;->c:La/lhf0;

    .line 86
    .line 87
    invoke-virtual {v5, v2}, La/lhf0;->F(La/lq00;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    iget-object v3, v0, La/vuj;->h:Landroid/os/Handler;

    .line 92
    .line 93
    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v2, v0, La/vuj;->h:Landroid/os/Handler;

    .line 97
    .line 98
    iput-object v2, v0, La/vuj;->j:La/rsj;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, La/jbw;->l:La/cil;

    .line 104
    .line 105
    invoke-interface {p0}, La/cil;->release()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final declared-synchronized r(Landroidx/media3/common/MediaItem;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, La/jbw;->t:Landroidx/media3/common/MediaItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final t(La/ibw;)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, La/ibw;->p:Z

    .line 6
    .line 7
    iget-boolean v3, v1, La/ibw;->g:Z

    .line 8
    .line 9
    iget-object v4, v1, La/ibw;->r:La/b4x;

    .line 10
    .line 11
    iget-wide v5, v1, La/ibw;->u:J

    .line 12
    .line 13
    iget-wide v7, v1, La/ibw;->e:J

    .line 14
    .line 15
    iget v9, v1, La/ibw;->d:I

    .line 16
    .line 17
    iget-wide v10, v1, La/ibw;->h:J

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-static {v10, v11}, La/vtt0;->Y(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v14

    .line 25
    move-wide/from16 v19, v14

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :goto_0
    const/4 v2, 0x1

    .line 34
    const/4 v14, 0x2

    .line 35
    if-eq v9, v14, :cond_2

    .line 36
    .line 37
    if-ne v9, v2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    move-wide/from16 v17, v19

    .line 47
    .line 48
    :goto_2
    new-instance v32, La/gst;

    .line 49
    .line 50
    iget-object v15, v0, La/jbw;->p:La/vuj;

    .line 51
    .line 52
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    iget-object v12, v15, La/vuj;->k:La/mbw;

    .line 58
    .line 59
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-direct/range {v32 .. v32}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-boolean v12, v15, La/vuj;->u:Z

    .line 66
    .line 67
    const-wide/16 v23, 0x0

    .line 68
    .line 69
    if-eqz v12, :cond_13

    .line 70
    .line 71
    iget-object v12, v1, La/ibw;->v:La/hbw;

    .line 72
    .line 73
    move v13, v3

    .line 74
    iget-wide v2, v12, La/hbw;->c:J

    .line 75
    .line 76
    move-wide/from16 v25, v2

    .line 77
    .line 78
    iget-wide v2, v12, La/hbw;->d:J

    .line 79
    .line 80
    iget-wide v14, v15, La/vuj;->v:J

    .line 81
    .line 82
    sub-long v14, v10, v14

    .line 83
    .line 84
    iget-boolean v12, v1, La/ibw;->o:Z

    .line 85
    .line 86
    if-eqz v12, :cond_3

    .line 87
    .line 88
    add-long v28, v14, v5

    .line 89
    .line 90
    :goto_3
    move-wide/from16 v30, v2

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_3
    move-wide/from16 v28, v21

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :goto_4
    iget-boolean v2, v1, La/ibw;->p:Z

    .line 97
    .line 98
    if-eqz v2, :cond_5

    .line 99
    .line 100
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 101
    .line 102
    iget-wide v2, v0, La/jbw;->q:J

    .line 103
    .line 104
    cmp-long v33, v2, v21

    .line 105
    .line 106
    if-nez v33, :cond_4

    .line 107
    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    goto :goto_5

    .line 113
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 114
    .line 115
    .line 116
    move-result-wide v33

    .line 117
    add-long v2, v33, v2

    .line 118
    .line 119
    :goto_5
    invoke-static {v2, v3}, La/vtt0;->M(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    add-long/2addr v10, v5

    .line 124
    sub-long/2addr v2, v10

    .line 125
    move-wide/from16 v35, v2

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_5
    move-wide/from16 v35, v23

    .line 129
    .line 130
    :goto_6
    iget-object v2, v0, La/jbw;->r:La/dn30;

    .line 131
    .line 132
    iget-wide v2, v2, La/dn30;->a:J

    .line 133
    .line 134
    cmp-long v10, v2, v21

    .line 135
    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    invoke-static {v2, v3}, La/vtt0;->M(J)J

    .line 139
    .line 140
    .line 141
    move-result-wide v2

    .line 142
    :goto_7
    move-wide/from16 v33, v2

    .line 143
    .line 144
    goto :goto_9

    .line 145
    :cond_6
    cmp-long v2, v7, v21

    .line 146
    .line 147
    if-eqz v2, :cond_7

    .line 148
    .line 149
    sub-long v2, v5, v7

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_7
    cmp-long v2, v30, v21

    .line 153
    .line 154
    if-eqz v2, :cond_8

    .line 155
    .line 156
    iget-wide v2, v1, La/ibw;->n:J

    .line 157
    .line 158
    cmp-long v2, v2, v21

    .line 159
    .line 160
    if-eqz v2, :cond_8

    .line 161
    .line 162
    move-wide/from16 v2, v30

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_8
    cmp-long v2, v25, v21

    .line 166
    .line 167
    if-eqz v2, :cond_9

    .line 168
    .line 169
    move-wide/from16 v2, v25

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_9
    const-wide/16 v2, 0x3

    .line 173
    .line 174
    iget-wide v10, v1, La/ibw;->m:J

    .line 175
    .line 176
    mul-long/2addr v2, v10

    .line 177
    :goto_8
    add-long v2, v2, v35

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :goto_9
    add-long v37, v5, v35

    .line 181
    .line 182
    invoke-static/range {v33 .. v38}, La/vtt0;->j(JJJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide v2

    .line 186
    invoke-virtual {v0}, La/jbw;->g()Landroidx/media3/common/MediaItem;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    iget-object v5, v5, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 191
    .line 192
    iget v6, v5, La/dn30;->d:F

    .line 193
    .line 194
    const v10, -0x800001

    .line 195
    .line 196
    .line 197
    cmpl-float v6, v6, v10

    .line 198
    .line 199
    const/4 v11, 0x0

    .line 200
    if-nez v6, :cond_a

    .line 201
    .line 202
    iget v5, v5, La/dn30;->e:F

    .line 203
    .line 204
    cmpl-float v5, v5, v10

    .line 205
    .line 206
    if-nez v5, :cond_a

    .line 207
    .line 208
    cmp-long v5, v25, v21

    .line 209
    .line 210
    if-nez v5, :cond_a

    .line 211
    .line 212
    cmp-long v5, v30, v21

    .line 213
    .line 214
    if-nez v5, :cond_a

    .line 215
    .line 216
    const/4 v5, 0x1

    .line 217
    goto :goto_a

    .line 218
    :cond_a
    move v5, v11

    .line 219
    :goto_a
    iget-object v6, v0, La/jbw;->r:La/dn30;

    .line 220
    .line 221
    invoke-virtual {v6}, La/dn30;->a()La/cn30;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-static {v2, v3}, La/vtt0;->Y(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v2

    .line 229
    iput-wide v2, v6, La/cn30;->a:J

    .line 230
    .line 231
    const/high16 v2, 0x3f800000    # 1.0f

    .line 232
    .line 233
    if-eqz v5, :cond_b

    .line 234
    .line 235
    move v3, v2

    .line 236
    goto :goto_b

    .line 237
    :cond_b
    iget-object v3, v0, La/jbw;->r:La/dn30;

    .line 238
    .line 239
    iget v3, v3, La/dn30;->d:F

    .line 240
    .line 241
    :goto_b
    iput v3, v6, La/cn30;->d:F

    .line 242
    .line 243
    if-eqz v5, :cond_c

    .line 244
    .line 245
    goto :goto_c

    .line 246
    :cond_c
    iget-object v2, v0, La/jbw;->r:La/dn30;

    .line 247
    .line 248
    iget v2, v2, La/dn30;->e:F

    .line 249
    .line 250
    :goto_c
    iput v2, v6, La/cn30;->e:F

    .line 251
    .line 252
    new-instance v2, La/dn30;

    .line 253
    .line 254
    invoke-direct {v2, v6}, La/dn30;-><init>(La/cn30;)V

    .line 255
    .line 256
    .line 257
    iput-object v2, v0, La/jbw;->r:La/dn30;

    .line 258
    .line 259
    cmp-long v3, v7, v21

    .line 260
    .line 261
    if-eqz v3, :cond_d

    .line 262
    .line 263
    goto :goto_d

    .line 264
    :cond_d
    iget-wide v2, v2, La/dn30;->a:J

    .line 265
    .line 266
    invoke-static {v2, v3}, La/vtt0;->M(J)J

    .line 267
    .line 268
    .line 269
    move-result-wide v2

    .line 270
    sub-long v7, v37, v2

    .line 271
    .line 272
    :goto_d
    if-eqz v13, :cond_e

    .line 273
    .line 274
    move-wide/from16 v23, v7

    .line 275
    .line 276
    :goto_e
    const/4 v2, 0x2

    .line 277
    goto :goto_10

    .line 278
    :cond_e
    iget-object v2, v1, La/ibw;->s:La/b4x;

    .line 279
    .line 280
    invoke-static {v7, v8, v2}, La/jbw;->s(JLjava/util/List;)La/dbw;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    if-eqz v2, :cond_f

    .line 285
    .line 286
    iget-wide v2, v2, La/gbw;->e:J

    .line 287
    .line 288
    :goto_f
    move-wide/from16 v23, v2

    .line 289
    .line 290
    goto :goto_e

    .line 291
    :cond_f
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_10

    .line 296
    .line 297
    goto :goto_e

    .line 298
    :cond_10
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const/4 v3, 0x1

    .line 303
    invoke-static {v4, v2, v3}, La/vtt0;->d(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, La/fbw;

    .line 312
    .line 313
    iget-object v3, v2, La/fbw;->m:La/b4x;

    .line 314
    .line 315
    invoke-static {v7, v8, v3}, La/jbw;->s(JLjava/util/List;)La/dbw;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    if-eqz v3, :cond_11

    .line 320
    .line 321
    iget-wide v2, v3, La/gbw;->e:J

    .line 322
    .line 323
    goto :goto_f

    .line 324
    :cond_11
    iget-wide v2, v2, La/gbw;->e:J

    .line 325
    .line 326
    goto :goto_f

    .line 327
    :goto_10
    if-ne v9, v2, :cond_12

    .line 328
    .line 329
    iget-boolean v2, v1, La/ibw;->f:Z

    .line 330
    .line 331
    if-eqz v2, :cond_12

    .line 332
    .line 333
    const/16 v31, 0x1

    .line 334
    .line 335
    :goto_11
    const/4 v3, 0x1

    .line 336
    goto :goto_12

    .line 337
    :cond_12
    move/from16 v31, v11

    .line 338
    .line 339
    goto :goto_11

    .line 340
    :goto_12
    new-instance v16, La/i3k0;

    .line 341
    .line 342
    iget-wide v1, v1, La/ibw;->u:J

    .line 343
    .line 344
    xor-int/lit8 v30, v12, 0x1

    .line 345
    .line 346
    invoke-virtual {v0}, La/jbw;->g()Landroidx/media3/common/MediaItem;

    .line 347
    .line 348
    .line 349
    move-result-object v33

    .line 350
    iget-object v3, v0, La/jbw;->r:La/dn30;

    .line 351
    .line 352
    move-wide/from16 v21, v28

    .line 353
    .line 354
    const/16 v29, 0x1

    .line 355
    .line 356
    move-object/from16 v34, v3

    .line 357
    .line 358
    move-wide/from16 v25, v14

    .line 359
    .line 360
    move-wide/from16 v27, v23

    .line 361
    .line 362
    move-wide/from16 v23, v1

    .line 363
    .line 364
    invoke-direct/range {v16 .. v34}, La/i3k0;-><init>(JJJJJJZZZLa/gst;Landroidx/media3/common/MediaItem;La/dn30;)V

    .line 365
    .line 366
    .line 367
    :goto_13
    move-object/from16 v1, v16

    .line 368
    .line 369
    goto :goto_17

    .line 370
    :cond_13
    move v13, v3

    .line 371
    cmp-long v2, v7, v21

    .line 372
    .line 373
    if-eqz v2, :cond_17

    .line 374
    .line 375
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    if-eqz v2, :cond_14

    .line 380
    .line 381
    goto :goto_15

    .line 382
    :cond_14
    if-nez v13, :cond_16

    .line 383
    .line 384
    cmp-long v2, v7, v5

    .line 385
    .line 386
    if-nez v2, :cond_15

    .line 387
    .line 388
    goto :goto_14

    .line 389
    :cond_15
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    const/4 v3, 0x1

    .line 394
    invoke-static {v4, v2, v3}, La/vtt0;->d(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    check-cast v2, La/fbw;

    .line 403
    .line 404
    iget-wide v7, v2, La/gbw;->e:J

    .line 405
    .line 406
    :cond_16
    :goto_14
    move-wide/from16 v27, v7

    .line 407
    .line 408
    goto :goto_16

    .line 409
    :cond_17
    :goto_15
    move-wide/from16 v27, v23

    .line 410
    .line 411
    :goto_16
    new-instance v16, La/i3k0;

    .line 412
    .line 413
    iget-wide v1, v1, La/ibw;->u:J

    .line 414
    .line 415
    invoke-virtual {v0}, La/jbw;->g()Landroidx/media3/common/MediaItem;

    .line 416
    .line 417
    .line 418
    move-result-object v33

    .line 419
    const/16 v34, 0x0

    .line 420
    .line 421
    const-wide/16 v25, 0x0

    .line 422
    .line 423
    const/16 v29, 0x1

    .line 424
    .line 425
    const/16 v30, 0x0

    .line 426
    .line 427
    const/16 v31, 0x1

    .line 428
    .line 429
    move-wide/from16 v23, v1

    .line 430
    .line 431
    move-wide/from16 v21, v1

    .line 432
    .line 433
    invoke-direct/range {v16 .. v34}, La/i3k0;-><init>(JJJJJJZZZLa/gst;Landroidx/media3/common/MediaItem;La/dn30;)V

    .line 434
    .line 435
    .line 436
    goto :goto_13

    .line 437
    :goto_17
    invoke-virtual {v0, v1}, La/e06;->l(La/bmq0;)V

    .line 438
    .line 439
    .line 440
    return-void
.end method
