.class public final La/vc;
.super La/i3t0;
.source "SourceFile"


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/kc;

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
    instance-of v0, p1, La/jc;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, La/rc;

    .line 14
    .line 15
    check-cast p1, La/jc;

    .line 16
    .line 17
    iget-object p1, p1, La/jc;->a:La/hc;

    .line 18
    .line 19
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La/sc;

    .line 24
    .line 25
    iget-wide v1, v1, La/sc;->a:J

    .line 26
    .line 27
    invoke-direct {v0, p1, v1, v2}, La/rc;-><init>(La/hc;J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    instance-of p1, p1, La/ic;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 43
    .line 44
    .line 45
    return-void
.end method
