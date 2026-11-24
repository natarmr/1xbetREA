.class public final La/hjp0;
.super La/i3t0;
.source "SourceFile"


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/djp0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/cjp0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, La/ejp0;

    .line 14
    .line 15
    check-cast p1, La/cjp0;

    .line 16
    .line 17
    iget-object p1, p1, La/cjp0;->a:La/bop0;

    .line 18
    .line 19
    invoke-direct {v0, p1}, La/ejp0;-><init>(La/bop0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    sget-object v0, La/bjp0;->a:La/bjp0;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 39
    .line 40
    .line 41
    return-void
.end method
