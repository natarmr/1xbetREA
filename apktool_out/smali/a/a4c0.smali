.class public final La/a4c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/un30;


# instance fields
.field public final a:La/hbj;

.field public final b:La/ex60;

.field public final c:La/a1d;

.field public d:La/x860;


# direct methods
.method public constructor <init>(La/hbj;La/huj;)V
    .locals 4

    .line 1
    new-instance v0, La/ex60;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    new-instance p2, La/a1d;

    .line 9
    .line 10
    invoke-direct {p2, v1}, La/a1d;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/x860;

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, v2, v3}, La/x860;-><init>(IZ)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/a4c0;->a:La/hbj;

    .line 24
    .line 25
    iput-object v0, p0, La/a4c0;->b:La/ex60;

    .line 26
    .line 27
    iput-object p2, p0, La/a4c0;->c:La/a1d;

    .line 28
    .line 29
    iput-object v1, p0, La/a4c0;->d:La/x860;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final b(Landroidx/media3/common/MediaItem;)La/e06;
    .locals 8

    .line 1
    iget-object v0, p1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, La/b4c0;

    .line 7
    .line 8
    iget-object v0, p0, La/a4c0;->c:La/a1d;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, La/a1d;->b(Landroidx/media3/common/MediaItem;)La/cil;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget-object v6, p0, La/a4c0;->d:La/x860;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    iget-object v3, p0, La/a4c0;->a:La/hbj;

    .line 18
    .line 19
    iget-object v4, p0, La/a4c0;->b:La/ex60;

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    invoke-direct/range {v1 .. v7}, La/b4c0;-><init>(Landroidx/media3/common/MediaItem;La/hbj;La/ex60;La/cil;La/x860;Landroidx/media3/common/b;)V

    .line 23
    .line 24
    .line 25
    return-object v1
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
    iput-object p1, p0, La/a4c0;->d:La/x860;

    .line 7
    .line 8
    return-object p0
.end method
