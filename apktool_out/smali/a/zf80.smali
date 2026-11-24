.class public final La/zf80;
.super La/f3k;
.source "SourceFile"


# instance fields
.field public q:La/yzj;


# virtual methods
.method public final R0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/zf80;->q:La/yzj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, La/lm40;

    .line 7
    .line 8
    iget-object v1, v1, La/lm40;->a:La/lm40;

    .line 9
    .line 10
    iget-boolean v1, v1, La/lm40;->n:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iput-object v0, p0, La/zf80;->q:La/yzj;

    .line 20
    .line 21
    return-void
.end method

.method public final S0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/zf80;->q:La/yzj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, La/f3k;->a1(La/yzj;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
