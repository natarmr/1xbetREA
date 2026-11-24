.class public final La/b3w0;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public o:F

.field public p:Ljava/lang/Object;


# virtual methods
.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, La/pu90;->a:I

    .line 6
    .line 7
    iget p4, p2, La/pu90;->b:I

    .line 8
    .line 9
    new-instance v0, La/fne;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, p2, p0, v1}, La/fne;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p3, p4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
