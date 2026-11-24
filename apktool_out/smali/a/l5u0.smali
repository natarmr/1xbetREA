.class public interface abstract La/l5u0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(La/t73;La/t73;La/t73;)J
.end method

.method public abstract c(JLa/t73;La/t73;La/t73;)La/t73;
.end method

.method public g(La/t73;La/t73;La/t73;)La/t73;
    .locals 6

    .line 1
    invoke-interface {p0, p1, p2, p3}, La/l5u0;->b(La/t73;La/t73;La/t73;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    move-object v0, p0

    .line 6
    move-object v3, p1

    .line 7
    move-object v4, p2

    .line 8
    move-object v5, p3

    .line 9
    invoke-interface/range {v0 .. v5}, La/l5u0;->h(JLa/t73;La/t73;La/t73;)La/t73;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public abstract h(JLa/t73;La/t73;La/t73;)La/t73;
.end method
