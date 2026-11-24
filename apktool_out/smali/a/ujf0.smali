.class public final La/ujf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:I

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public static b(La/j16;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/j16;->h:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 13
    .line 14
    .line 15
    iput-byte v2, p0, La/j16;->h:B

    .line 16
    .line 17
    invoke-virtual {p0}, La/j16;->v()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public static k(La/j16;)Z
    .locals 0

    .line 1
    iget-byte p0, p0, La/j16;->h:B

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static o(La/j16;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/j16;->n:Z

    .line 3
    .line 4
    instance-of v0, p0, La/r9q0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, La/r9q0;

    .line 9
    .line 10
    iget-boolean v0, p0, La/j16;->n:Z

    .line 11
    .line 12
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, La/r9q0;->m1:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public a(La/j16;La/cwj;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/j16;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, p1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/j16;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p0, v1

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move p0, v2

    .line 19
    :goto_1
    invoke-static {p0}, La/x0x;->K(Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, La/ujf0;->k(La/j16;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget-object p0, p2, La/cwj;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/j16;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    if-ne p1, p0, :cond_3

    .line 35
    .line 36
    iput-object v0, p2, La/cwj;->f:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object v0, p2, La/cwj;->e:Ljava/lang/Object;

    .line 39
    .line 40
    iput-boolean v2, p2, La/cwj;->a:Z

    .line 41
    .line 42
    :cond_3
    invoke-static {p1}, La/ujf0;->b(La/j16;)V

    .line 43
    .line 44
    .line 45
    iget-byte p0, p1, La/j16;->h:B

    .line 46
    .line 47
    if-ne p0, v2, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    move v2, v1

    .line 51
    :goto_2
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p1, La/j16;->c:La/hsj;

    .line 55
    .line 56
    invoke-virtual {p0}, La/hsj;->e()V

    .line 57
    .line 58
    .line 59
    iput-byte v1, p1, La/j16;->h:B

    .line 60
    .line 61
    iput-object v0, p1, La/j16;->i:La/ixg0;

    .line 62
    .line 63
    iput-object v0, p1, La/j16;->j:[Landroidx/media3/common/b;

    .line 64
    .line 65
    iput-boolean v1, p1, La/j16;->n:Z

    .line 66
    .line 67
    invoke-virtual {p1}, La/j16;->p()V

    .line 68
    .line 69
    .line 70
    iput-object v0, p1, La/j16;->q:La/vn30;

    .line 71
    .line 72
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    iput-wide v0, p1, La/j16;->r:J

    .line 78
    .line 79
    return-void
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/j16;

    .line 4
    .line 5
    invoke-static {v0}, La/ujf0;->k(La/j16;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/j16;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, La/ujf0;->k(La/j16;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    add-int/2addr v0, p0

    .line 25
    return v0
.end method

.method public d(La/nn30;)La/j16;
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object p1, p1, La/nn30;->c:[La/ixg0;

    .line 4
    .line 5
    iget v0, p0, La/ujf0;->c:I

    .line 6
    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/j16;

    .line 15
    .line 16
    iget-object v1, v0, La/j16;->i:La/ixg0;

    .line 17
    .line 18
    if-ne v1, p1, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    iget-object p0, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/j16;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, La/j16;->i:La/ixg0;

    .line 28
    .line 29
    if-ne v0, p1, :cond_2

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public e(La/nn30;La/j16;)Z
    .locals 5

    .line 1
    iget p0, p0, La/ujf0;->c:I

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p1, La/nn30;->c:[La/ixg0;

    .line 7
    .line 8
    aget-object v0, v0, p0

    .line 9
    .line 10
    iget-object v1, p2, La/j16;->i:La/ixg0;

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    if-ne v1, v0, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-virtual {p2}, La/j16;->l()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_4

    .line 23
    .line 24
    iget-object v0, p1, La/nn30;->m:La/nn30;

    .line 25
    .line 26
    iget-object v1, p1, La/nn30;->g:La/on30;

    .line 27
    .line 28
    iget-boolean v1, v1, La/on30;->f:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-boolean v1, v0, La/nn30;->e:Z

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    instance-of v1, p2, La/r9q0;

    .line 39
    .line 40
    if-nez v1, :cond_4

    .line 41
    .line 42
    instance-of v1, p2, La/sd40;

    .line 43
    .line 44
    if-nez v1, :cond_4

    .line 45
    .line 46
    iget-wide v1, p2, La/j16;->m:J

    .line 47
    .line 48
    invoke-virtual {v0}, La/nn30;->e()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    cmp-long v0, v1, v3

    .line 53
    .line 54
    if-ltz v0, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iget-object p1, p1, La/nn30;->m:La/nn30;

    .line 58
    .line 59
    :goto_0
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object v0, p1, La/nn30;->c:[La/ixg0;

    .line 62
    .line 63
    aget-object v0, v0, p0

    .line 64
    .line 65
    iget-object v1, p2, La/j16;->i:La/ixg0;

    .line 66
    .line 67
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-object p1, p1, La/nn30;->m:La/nn30;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 80
    return p0
.end method

.method public f()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/j16;

    .line 4
    .line 5
    iget-object p0, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/j16;

    .line 8
    .line 9
    invoke-static {p0}, La/ujf0;->k(La/j16;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/j16;->m()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x1

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-byte v1, v0, La/j16;->h:B

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, La/j16;->m()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    and-int/2addr p0, v0

    .line 32
    :cond_1
    return p0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget p0, p0, La/ujf0;->d:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-eq p0, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x3

    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-ne p0, v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public h(La/nn30;)Z
    .locals 5

    .line 1
    iget v0, p0, La/ujf0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p1}, La/ujf0;->d(La/nn30;)La/j16;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, La/j16;

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    move v0, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v2

    .line 24
    :goto_0
    iget v1, p0, La/ujf0;->d:I

    .line 25
    .line 26
    const/4 v4, 0x3

    .line 27
    if-eq v1, v4, :cond_2

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    if-ne v1, v4, :cond_3

    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0, p1}, La/ujf0;->d(La/nn30;)La/j16;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p0, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/j16;

    .line 39
    .line 40
    if-ne p1, p0, :cond_3

    .line 41
    .line 42
    move p0, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    move p0, v2

    .line 45
    :goto_1
    if-nez v0, :cond_5

    .line 46
    .line 47
    if-eqz p0, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    return v2

    .line 51
    :cond_5
    :goto_2
    return v3
.end method

.method public i(La/nn30;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/ujf0;->d(La/nn30;)La/j16;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public j()Z
    .locals 2

    .line 1
    iget v0, p0, La/ujf0;->d:I

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/j16;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-byte p0, p0, La/j16;->h:B

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_2
    :goto_0
    iget-object p0, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/j16;

    .line 30
    .line 31
    invoke-static {p0}, La/ujf0;->k(La/j16;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public l(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, La/ujf0;->a:Z

    .line 6
    .line 7
    if-eqz p1, :cond_3

    .line 8
    .line 9
    iget-object p1, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, La/j16;

    .line 12
    .line 13
    iget-byte v2, p1, La/j16;->h:B

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, La/j16;->c:La/hsj;

    .line 23
    .line 24
    invoke-virtual {v0}, La/hsj;->e()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, La/j16;->t()V

    .line 28
    .line 29
    .line 30
    iput-boolean v1, p0, La/ujf0;->a:Z

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-boolean p1, p0, La/ujf0;->b:Z

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    iget-object p1, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, La/j16;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-byte v2, p1, La/j16;->h:B

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v0, v1

    .line 50
    :goto_1
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, La/j16;->c:La/hsj;

    .line 54
    .line 55
    invoke-virtual {v0}, La/hsj;->e()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, La/j16;->t()V

    .line 59
    .line 60
    .line 61
    iput-boolean v1, p0, La/ujf0;->b:Z

    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public m(La/j16;La/nn30;La/ucs0;La/cwj;)I
    .locals 12

    .line 1
    iget-object v4, p2, La/nn30;->c:[La/ixg0;

    .line 2
    .line 3
    iget-object v5, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v5, La/j16;

    .line 6
    .line 7
    iget v6, p0, La/ujf0;->c:I

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    if-eqz p1, :cond_c

    .line 11
    .line 12
    iget-byte v8, p1, La/j16;->h:B

    .line 13
    .line 14
    if-eqz v8, :cond_c

    .line 15
    .line 16
    if-ne p1, v5, :cond_1

    .line 17
    .line 18
    iget v8, p0, La/ujf0;->d:I

    .line 19
    .line 20
    const/4 v9, 0x2

    .line 21
    if-eq v8, v9, :cond_0

    .line 22
    .line 23
    const/4 v9, 0x5

    .line 24
    if-ne v8, v9, :cond_1

    .line 25
    .line 26
    :cond_0
    return v7

    .line 27
    :cond_1
    iget-object v8, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v8, La/j16;

    .line 30
    .line 31
    const/4 v9, 0x3

    .line 32
    if-ne p1, v8, :cond_3

    .line 33
    .line 34
    iget v8, p0, La/ujf0;->d:I

    .line 35
    .line 36
    if-eq v8, v9, :cond_2

    .line 37
    .line 38
    const/4 v10, 0x4

    .line 39
    if-ne v8, v10, :cond_3

    .line 40
    .line 41
    :cond_2
    return v7

    .line 42
    :cond_3
    iget-object v8, p1, La/j16;->i:La/ixg0;

    .line 43
    .line 44
    aget-object v10, v4, v6

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    if-eq v8, v10, :cond_4

    .line 48
    .line 49
    move v8, v7

    .line 50
    goto :goto_0

    .line 51
    :cond_4
    move v8, v11

    .line 52
    :goto_0
    invoke-virtual {p3, v6}, La/ucs0;->p(I)Z

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    if-eqz v10, :cond_5

    .line 57
    .line 58
    if-nez v8, :cond_5

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_5
    iget-boolean v8, p1, La/j16;->n:Z

    .line 62
    .line 63
    if-nez v8, :cond_8

    .line 64
    .line 65
    iget-object v0, p3, La/ucs0;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, [La/fmo;

    .line 68
    .line 69
    aget-object v0, v0, v6

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    invoke-interface {v0}, La/fmo;->length()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    goto :goto_1

    .line 78
    :cond_6
    move v3, v11

    .line 79
    :goto_1
    new-array v1, v3, [Landroidx/media3/common/b;

    .line 80
    .line 81
    :goto_2
    if-ge v11, v3, :cond_7

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v11}, La/fmo;->f(I)Landroidx/media3/common/b;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    aput-object v5, v1, v11

    .line 91
    .line 92
    add-int/lit8 v11, v11, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_7
    aget-object v0, v4, v6

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    check-cast v0, La/ixg0;

    .line 101
    .line 102
    invoke-virtual {p2}, La/nn30;->e()J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    iget-wide v5, p2, La/nn30;->p:J

    .line 107
    .line 108
    iget-object v2, p2, La/nn30;->g:La/on30;

    .line 109
    .line 110
    iget-object v7, v2, La/on30;->a:La/vn30;

    .line 111
    .line 112
    move-object v2, v0

    .line 113
    move-object v0, p1

    .line 114
    invoke-virtual/range {v0 .. v7}, La/j16;->A([Landroidx/media3/common/b;La/ixg0;JJLa/vn30;)V

    .line 115
    .line 116
    .line 117
    return v9

    .line 118
    :cond_8
    invoke-virtual {p1}, La/j16;->m()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_b

    .line 123
    .line 124
    move-object/from16 v2, p4

    .line 125
    .line 126
    invoke-virtual {p0, p1, v2}, La/ujf0;->a(La/j16;La/cwj;)V

    .line 127
    .line 128
    .line 129
    if-eqz v10, :cond_9

    .line 130
    .line 131
    invoke-virtual {p0}, La/ujf0;->g()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_c

    .line 136
    .line 137
    :cond_9
    if-ne p1, v5, :cond_a

    .line 138
    .line 139
    move v11, v7

    .line 140
    :cond_a
    invoke-virtual {p0, v11}, La/ujf0;->l(Z)V

    .line 141
    .line 142
    .line 143
    return v7

    .line 144
    :cond_b
    return v11

    .line 145
    :cond_c
    :goto_3
    return v7
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object v0, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/j16;

    .line 4
    .line 5
    invoke-static {v0}, La/ujf0;->k(La/j16;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, La/ujf0;->l(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/j16;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-byte v0, v0, La/j16;->h:B

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p0, v0}, La/ujf0;->l(Z)V

    .line 28
    .line 29
    .line 30
    :cond_2
    return-void
.end method

.method public p()V
    .locals 7

    .line 1
    iget-object v0, p0, La/ujf0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/j16;

    .line 4
    .line 5
    iget-byte v1, v0, La/j16;->h:B

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-ne v1, v4, :cond_1

    .line 11
    .line 12
    iget v5, p0, La/ujf0;->d:I

    .line 13
    .line 14
    const/4 v6, 0x5

    .line 15
    if-eq v5, v6, :cond_1

    .line 16
    .line 17
    if-ne v1, v4, :cond_0

    .line 18
    .line 19
    move v3, v4

    .line 20
    :cond_0
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 21
    .line 22
    .line 23
    iput-byte v2, v0, La/j16;->h:B

    .line 24
    .line 25
    invoke-virtual {v0}, La/j16;->u()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, La/ujf0;->f:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/j16;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-byte v1, v0, La/j16;->h:B

    .line 36
    .line 37
    if-ne v1, v4, :cond_3

    .line 38
    .line 39
    iget p0, p0, La/ujf0;->d:I

    .line 40
    .line 41
    const/4 v5, 0x4

    .line 42
    if-eq p0, v5, :cond_3

    .line 43
    .line 44
    if-ne v1, v4, :cond_2

    .line 45
    .line 46
    move v3, v4

    .line 47
    :cond_2
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 48
    .line 49
    .line 50
    iput-byte v2, v0, La/j16;->h:B

    .line 51
    .line 52
    invoke-virtual {v0}, La/j16;->u()V

    .line 53
    .line 54
    .line 55
    :cond_3
    return-void
.end method
