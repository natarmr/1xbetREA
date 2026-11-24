.class public final La/m2x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cnw0;


# direct methods
.method public static a(La/q0x0;)La/cnw0;
    .locals 4

    .line 1
    iget-object v0, p0, La/q0x0;->a:La/e0x0;

    .line 2
    .line 3
    iget-object v1, v0, La/e0x0;->a:La/d0x0;

    .line 4
    .line 5
    sget-object v2, La/d0x0;->g:La/d0x0;

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, La/x3x0;->a(La/q0x0;)La/x3x0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v2, La/m2x0;

    .line 15
    .line 16
    iget-object v3, p0, La/q0x0;->b:La/icw0;

    .line 17
    .line 18
    invoke-static {v1}, La/w7n0;->L(La/d0x0;)La/r2x0;

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, La/e0x0;->b:La/c0x0;

    .line 22
    .line 23
    invoke-static {v1}, La/w7n0;->J(La/c0x0;)La/h70;

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, La/e0x0;->c:La/b0x0;

    .line 27
    .line 28
    invoke-static {v0}, La/w7n0;->K(La/b0x0;)La/k2x0;

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/q0x0;->c:La/icw0;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, La/icw0;->b()[B

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 40
    .line 41
    .line 42
    return-object v2
.end method
