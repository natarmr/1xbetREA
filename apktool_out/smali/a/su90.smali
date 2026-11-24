.class public final La/su90;
.super La/zru0;
.source "SourceFile"


# virtual methods
.method public final c(La/p900;Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, La/k4e;->c(La/p900;Z)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, La/jvv;->v0:I

    .line 5
    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, La/jvv;->u0:[La/k4e;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    aget-object p1, p1, p2

    .line 12
    .line 13
    invoke-virtual {p1}, La/k4e;->F()V

    .line 14
    .line 15
    .line 16
    const/high16 v0, 0x3f000000    # 0.5f

    .line 17
    .line 18
    iput v0, p1, La/k4e;->g0:F

    .line 19
    .line 20
    iput v0, p1, La/k4e;->f0:F

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-virtual {p1, v0, p0, v0, p2}, La/k4e;->f(ILa/k4e;II)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    invoke-virtual {p1, v0, p0, v0, p2}, La/k4e;->f(ILa/k4e;II)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    invoke-virtual {p1, v0, p0, v0, p2}, La/k4e;->f(ILa/k4e;II)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x5

    .line 35
    invoke-virtual {p1, v0, p0, v0, p2}, La/k4e;->f(ILa/k4e;II)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method
