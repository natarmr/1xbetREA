.class public final La/ojy;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/g6z;


# instance fields
.field public o:La/xcz;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:La/rzf0;


# virtual methods
.method public final R0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ojy;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Z0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ojy;->o:La/xcz;

    .line 2
    .line 3
    invoke-virtual {v0}, La/xcz;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, La/ojy;->p:I

    .line 8
    .line 9
    iget-object v0, p0, La/ojy;->o:La/xcz;

    .line 10
    .line 11
    invoke-virtual {v0}, La/xcz;->i()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, La/ojy;->q:I

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    iput v1, p0, La/ojy;->r:I

    .line 19
    .line 20
    iput v1, p0, La/ojy;->s:I

    .line 21
    .line 22
    iget v1, p0, La/ojy;->p:I

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    sget-object v0, La/rzf0;->a:La/rzf0;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object v0, La/rzf0;->b:La/rzf0;

    .line 32
    .line 33
    :goto_0
    iput-object v0, p0, La/ojy;->t:La/rzf0;

    .line 34
    .line 35
    return-void
.end method

.method public final a(J)V
    .locals 4

    .line 1
    iget-object p1, p0, La/ojy;->t:La/rzf0;

    .line 2
    .line 3
    sget-object p2, La/rzf0;->b:La/rzf0;

    .line 4
    .line 5
    if-eq p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p1, p0, La/ojy;->o:La/xcz;

    .line 9
    .line 10
    invoke-virtual {p1}, La/xcz;->h()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p2, p0, La/ojy;->o:La/xcz;

    .line 15
    .line 16
    invoke-virtual {p2}, La/xcz;->i()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget v0, p0, La/ojy;->p:I

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    iget v0, p0, La/ojy;->q:I

    .line 27
    .line 28
    if-ne p2, v0, :cond_1

    .line 29
    .line 30
    move v0, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v0, v1

    .line 33
    :goto_0
    iget v3, p0, La/ojy;->r:I

    .line 34
    .line 35
    if-ne p1, v3, :cond_2

    .line 36
    .line 37
    iget v3, p0, La/ojy;->s:I

    .line 38
    .line 39
    if-ne p2, v3, :cond_2

    .line 40
    .line 41
    move v1, v2

    .line 42
    :cond_2
    iget-object v2, p0, La/ojy;->o:La/xcz;

    .line 43
    .line 44
    iget-object v2, v2, La/xcz;->j:La/ywj;

    .line 45
    .line 46
    invoke-virtual {v2}, La/ywj;->a()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_5

    .line 51
    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    iput p1, p0, La/ojy;->r:I

    .line 58
    .line 59
    iput p2, p0, La/ojy;->s:I

    .line 60
    .line 61
    iget-object p1, p0, La/ojy;->o:La/xcz;

    .line 62
    .line 63
    invoke-virtual {p1}, La/xcz;->j()La/mcz;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget p1, p1, La/mcz;->o:I

    .line 68
    .line 69
    iget p2, p0, La/ojy;->p:I

    .line 70
    .line 71
    if-le p1, p2, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, La/ojy;->o:La/xcz;

    .line 74
    .line 75
    iget p0, p0, La/ojy;->q:I

    .line 76
    .line 77
    invoke-virtual {p1, p2, p0}, La/xcz;->k(II)V

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_1
    return-void

    .line 81
    :cond_5
    :goto_2
    sget-object p1, La/rzf0;->c:La/rzf0;

    .line 82
    .line 83
    iput-object p1, p0, La/ojy;->t:La/rzf0;

    .line 84
    .line 85
    return-void
.end method
