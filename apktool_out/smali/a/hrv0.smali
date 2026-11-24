.class public abstract La/hrv0;
.super La/gld;
.source "SourceFile"


# instance fields
.field public final k:La/e06;


# direct methods
.method public constructor <init>(La/e06;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/gld;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hrv0;->k:La/e06;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f()La/bmq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hrv0;->k:La/e06;

    .line 2
    .line 3
    invoke-virtual {p0}, La/e06;->f()La/bmq0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g()Landroidx/media3/common/MediaItem;
    .locals 0

    .line 1
    iget-object p0, p0, La/hrv0;->k:La/e06;

    .line 2
    .line 3
    invoke-virtual {p0}, La/e06;->g()Landroidx/media3/common/MediaItem;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/hrv0;->k:La/e06;

    .line 2
    .line 3
    invoke-virtual {p0}, La/e06;->h()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final k(La/rsj;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-static {p1}, La/vtt0;->n(La/wm30;)Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, La/gld;->j:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {p0}, La/hrv0;->z()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final s(Ljava/lang/Object;La/vn30;)La/vn30;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/hrv0;->x(La/vn30;)La/vn30;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final t(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    return-wide p2
.end method

.method public final u(ILjava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Void;

    .line 2
    .line 3
    return p1
.end method

.method public final v(Ljava/lang/Object;La/e06;La/bmq0;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p3}, La/hrv0;->y(La/bmq0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public x(La/vn30;)La/vn30;
    .locals 0

    .line 1
    return-object p1
.end method

.method public abstract y(La/bmq0;)V
.end method

.method public z()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/hrv0;->k:La/e06;

    .line 3
    .line 4
    invoke-virtual {p0, v0, v1}, La/gld;->w(Ljava/lang/Integer;La/e06;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
