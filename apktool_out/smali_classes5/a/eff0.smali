.class public final La/eff0;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public o:F

.field public p:F

.field public q:Z


# virtual methods
.method public final O0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iget p3, p2, La/pu90;->a:I

    .line 9
    .line 10
    iget p4, p2, La/pu90;->b:I

    .line 11
    .line 12
    new-instance v0, La/dff0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, p2, v1}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p3, p4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
