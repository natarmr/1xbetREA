.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/un30;


# instance fields
.field public final a:La/psc;

.field public b:La/ruj;

.field public c:La/kwd;

.field public d:Z

.field public e:B

.field public final f:La/std;

.field public final g:La/csj;

.field public final h:La/kwd;

.field public final i:La/a1d;

.field public j:La/x860;

.field public final k:Z

.field public final l:Z

.field public final m:J


# direct methods
.method public constructor <init>(La/hbj;)V
    .locals 2

    .line 1
    new-instance v0, La/psc;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, La/psc;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:La/psc;

    .line 12
    .line 13
    new-instance p1, La/a1d;

    .line 14
    .line 15
    const/16 v0, 0xd

    .line 16
    .line 17
    invoke-direct {p1, v0}, La/a1d;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:La/a1d;

    .line 21
    .line 22
    new-instance p1, La/std;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:La/std;

    .line 28
    .line 29
    sget-object p1, La/vuj;->w:La/csj;

    .line 30
    .line 31
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:La/csj;

    .line 32
    .line 33
    new-instance p1, La/x860;

    .line 34
    .line 35
    const/4 v0, -0x1

    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {p1, v0, v1}, La/x860;-><init>(IZ)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:La/x860;

    .line 41
    .line 42
    new-instance p1, La/kwd;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:La/kwd;

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:Z

    .line 51
    .line 52
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->m:J

    .line 58
    .line 59
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:Z

    .line 60
    .line 61
    const/4 v0, 0x3

    .line 62
    iput-byte v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:B

    .line 63
    .line 64
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Z

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b(Landroidx/media3/common/MediaItem;)La/e06;
    .locals 14

    .line 1
    iget-object v0, p1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:La/ruj;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, La/ruj;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/kwd;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, La/ruj;->c:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    iput-byte v1, v0, La/ruj;->b:B

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:La/ruj;

    .line 26
    .line 27
    :cond_0
    move-object v5, v0

    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:La/kwd;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iput-object v0, v5, La/ruj;->c:Ljava/lang/Object;

    .line 33
    .line 34
    :cond_1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Z

    .line 35
    .line 36
    iput-boolean v0, v5, La/ruj;->a:Z

    .line 37
    .line 38
    iget-byte v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:B

    .line 39
    .line 40
    iput-byte v0, v5, La/ruj;->b:B

    .line 41
    .line 42
    iget-object v0, p1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 43
    .line 44
    iget-object v0, v0, La/en30;->c:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:La/std;

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    new-instance v1, La/wti;

    .line 55
    .line 56
    const/16 v3, 0xd

    .line 57
    .line 58
    invoke-direct {v1, v2, v0, v3}, La/wti;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    move-object v2, v1

    .line 62
    :cond_2
    new-instance v0, La/jbw;

    .line 63
    .line 64
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:La/a1d;

    .line 65
    .line 66
    invoke-virtual {v1, p1}, La/a1d;->b(Landroidx/media3/common/MediaItem;)La/cil;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    iget-object v8, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:La/x860;

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:La/csj;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v9, La/vuj;

    .line 78
    .line 79
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:La/psc;

    .line 80
    .line 81
    invoke-direct {v9, v4, v8, v2}, La/vuj;-><init>(La/psc;La/x860;La/qbw;)V

    .line 82
    .line 83
    .line 84
    iget-boolean v12, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:Z

    .line 85
    .line 86
    iget-boolean v13, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:Z

    .line 87
    .line 88
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:La/kwd;

    .line 89
    .line 90
    iget-wide v10, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->m:J

    .line 91
    .line 92
    move-object v3, p1

    .line 93
    move-object v2, v0

    .line 94
    invoke-direct/range {v2 .. v13}, La/jbw;-><init>(Landroidx/media3/common/MediaItem;La/psc;La/ruj;La/kwd;La/cil;La/x860;La/vuj;JZI)V

    .line 95
    .line 96
    .line 97
    return-object v2
.end method

.method public final c(La/x860;)La/un30;
    .locals 1

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, La/x0x;->G(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:La/x860;

    .line 7
    .line 8
    return-object p0
.end method

.method public final d(La/kwd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:La/kwd;

    .line 2
    .line 3
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:B

    .line 3
    .line 4
    return-void
.end method
