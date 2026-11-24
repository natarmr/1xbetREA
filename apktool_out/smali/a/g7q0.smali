.class public final La/g7q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p5q0;


# instance fields
.field public final synthetic a:La/k7q0;


# direct methods
.method public constructor <init>(La/k7q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/g7q0;->a:La/k7q0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JLa/w4i0;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object p0, p0, La/g7q0;->a:La/k7q0;

    .line 3
    .line 4
    invoke-virtual {p0, p1}, La/k7q0;->j(Z)J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    invoke-static {p1, p2}, La/h5i0;->a(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    iget-object p3, p0, La/k7q0;->d:La/djz;

    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p3}, La/djz;->d()La/b9q0;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    if-nez p3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p3, p1, p2}, La/b9q0;->e(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    iput-wide p1, p0, La/k7q0;->o:J

    .line 28
    .line 29
    new-instance p3, La/ne60;

    .line 30
    .line 31
    invoke-direct {p3, p1, p2}, La/ne60;-><init>(J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p3}, La/k7q0;->p(La/ne60;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    iput-wide p1, p0, La/k7q0;->q:J

    .line 40
    .line 41
    sget-object p1, La/blv;->a:La/blv;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/k7q0;->q(La/blv;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1}, La/k7q0;->u(Z)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object p0, p0, La/g7q0;->a:La/k7q0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, La/k7q0;->q(La/blv;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/k7q0;->p(La/ne60;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object p0, p0, La/g7q0;->a:La/k7q0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, La/k7q0;->q(La/blv;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/k7q0;->p(La/ne60;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e(J)V
    .locals 4

    .line 1
    iget-object p0, p0, La/g7q0;->a:La/k7q0;

    .line 2
    .line 3
    iget-wide v0, p0, La/k7q0;->q:J

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, La/ne60;->f(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    iput-wide p1, p0, La/k7q0;->q:J

    .line 10
    .line 11
    iget-object p1, p0, La/k7q0;->d:La/djz;

    .line 12
    .line 13
    if-eqz p1, :cond_3

    .line 14
    .line 15
    invoke-virtual {p1}, La/djz;->d()La/b9q0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    iget-wide v0, p0, La/k7q0;->o:J

    .line 22
    .line 23
    iget-wide v2, p0, La/k7q0;->q:J

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, La/ne60;->f(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    new-instance p2, La/ne60;

    .line 30
    .line 31
    invoke-direct {p2, v0, v1}, La/ne60;-><init>(J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p2}, La/k7q0;->p(La/ne60;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, La/k7q0;->b:La/qe60;

    .line 38
    .line 39
    invoke-virtual {p0}, La/k7q0;->g()La/ne60;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-wide v0, v0, La/ne60;->a:J

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {p1, v2, v0, v1}, La/b9q0;->b(ZJ)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-interface {p2, p1}, La/qe60;->n(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {p1, p1}, La/s7n0;->e(II)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-wide v0, v0, La/a8q0;->b:J

    .line 66
    .line 67
    invoke-static {p1, p2, v0, v1}, La/o9q0;->b(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    iget-object v0, p0, La/k7q0;->d:La/djz;

    .line 75
    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    iget-object v0, v0, La/djz;->q:La/pz40;

    .line 79
    .line 80
    check-cast v0, La/hgk0;

    .line 81
    .line 82
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    iget-object v0, p0, La/k7q0;->k:La/omv;

    .line 96
    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    const/16 v1, 0x9

    .line 100
    .line 101
    check-cast v0, La/tv90;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, La/tv90;->a(I)V

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_0
    iget-object v0, p0, La/k7q0;->c:Lkotlin/jvm/functions/Function1;

    .line 107
    .line 108
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iget-object v1, v1, La/a8q0;->a:La/j83;

    .line 113
    .line 114
    invoke-static {v1, p1, p2}, La/k7q0;->b(La/j83;J)La/a8q0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    new-instance v0, La/o9q0;

    .line 122
    .line 123
    invoke-direct {v0, p1, p2}, La/o9q0;-><init>(J)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, La/k7q0;->w:La/o9q0;

    .line 127
    .line 128
    :cond_3
    :goto_1
    return-void
.end method

.method public final onCancel()V
    .locals 0

    .line 1
    return-void
.end method
