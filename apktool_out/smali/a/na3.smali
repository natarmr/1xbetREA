.class public final La/na3;
.super Landroid/text/SegmentFinder;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/fuj0;


# direct methods
.method public constructor <init>(La/fuj0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/na3;->a:La/fuj0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/SegmentFinder;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final nextEndBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/na3;->a:La/fuj0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/fuj0;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final nextStartBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/na3;->a:La/fuj0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/fuj0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final previousEndBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/na3;->a:La/fuj0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/fuj0;->e(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final previousStartBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/na3;->a:La/fuj0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/fuj0;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
