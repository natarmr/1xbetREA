.class public final La/bil;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cil;


# virtual methods
.method public final a(Landroid/os/Looper;La/a4a0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c(La/zhl;Landroidx/media3/common/b;)La/ivn;
    .locals 1

    .line 1
    iget-object p0, p2, Landroidx/media3/common/b;->t:Landroidx/media3/common/DrmInitData;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance p0, La/ivn;

    .line 8
    .line 9
    new-instance p1, La/xhl;

    .line 10
    .line 11
    new-instance p2, La/rft0;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/lang/Exception;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x1771

    .line 17
    .line 18
    invoke-direct {p1, v0, p2}, La/xhl;-><init>(ILjava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final d(Landroidx/media3/common/b;)I
    .locals 0

    .line 1
    iget-object p0, p1, Landroidx/media3/common/b;->t:Landroidx/media3/common/DrmInitData;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method
