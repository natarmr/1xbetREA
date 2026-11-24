.class public interface abstract La/lfn0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract d([BIILa/kfn0;La/rbe;)V
.end method

.method public f([BII)La/dfn0;
    .locals 6

    .line 1
    invoke-static {}, La/b4x;->l()La/u3x;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v5, La/b0l0;

    .line 6
    .line 7
    const/16 v0, 0x9

    .line 8
    .line 9
    invoke-direct {v5, p2, v0}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sget-object v4, La/kfn0;->c:La/kfn0;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v3, p3

    .line 18
    invoke-interface/range {v0 .. v5}, La/lfn0;->d([BIILa/kfn0;La/rbe;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, La/gtf;

    .line 22
    .line 23
    invoke-virtual {p2}, La/u3x;->g()La/rcf0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p0, p1}, La/gtf;-><init>(La/rcf0;)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public reset()V
    .locals 0

    .line 1
    return-void
.end method
