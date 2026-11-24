.class public final La/dh80;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:Z


# virtual methods
.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 5

    .line 1
    iget v0, p0, La/dh80;->o:F

    .line 2
    .line 3
    invoke-interface {p1, v0}, La/w6k;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, La/dh80;->q:F

    .line 8
    .line 9
    invoke-interface {p1, v1}, La/w6k;->T(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    iget v0, p0, La/dh80;->p:F

    .line 15
    .line 16
    invoke-interface {p1, v0}, La/w6k;->T(F)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p0, La/dh80;->r:F

    .line 21
    .line 22
    invoke-interface {p1, v2}, La/w6k;->T(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    neg-int v0, v1

    .line 28
    neg-int v3, v2

    .line 29
    invoke-static {v0, v3, p3, p4}, La/r4e;->i(IIJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-interface {p2, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget v0, p2, La/pu90;->a:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    invoke-static {v0, p3, p4}, La/r4e;->g(IJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v1, p2, La/pu90;->b:I

    .line 45
    .line 46
    add-int/2addr v1, v2

    .line 47
    invoke-static {v1, p3, p4}, La/r4e;->f(IJ)I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    new-instance p4, La/ka70;

    .line 52
    .line 53
    const/4 v1, 0x3

    .line 54
    invoke-direct {p4, p0, p2, v1}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0, p3, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method
