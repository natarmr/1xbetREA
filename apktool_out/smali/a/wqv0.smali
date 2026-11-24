.class public final La/wqv0;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public o:La/dnk;

.field public p:Z

.field public q:Lkotlin/jvm/functions/Function2;


# virtual methods
.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 8

    .line 1
    iget-object v0, p0, La/wqv0;->o:La/dnk;

    .line 2
    .line 3
    sget-object v1, La/dnk;->a:La/dnk;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p3, p4}, La/p4e;->k(J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :goto_0
    iget-object v3, p0, La/wqv0;->o:La/dnk;

    .line 15
    .line 16
    sget-object v4, La/dnk;->b:La/dnk;

    .line 17
    .line 18
    if-eq v3, v4, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-static {p3, p4}, La/p4e;->j(J)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    :goto_1
    iget-object v3, p0, La/wqv0;->o:La/dnk;

    .line 26
    .line 27
    const v5, 0x7fffffff

    .line 28
    .line 29
    .line 30
    if-eq v3, v1, :cond_2

    .line 31
    .line 32
    iget-boolean v1, p0, La/wqv0;->p:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    move v1, v5

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    :goto_2
    iget-object v3, p0, La/wqv0;->o:La/dnk;

    .line 43
    .line 44
    if-eq v3, v4, :cond_3

    .line 45
    .line 46
    iget-boolean v3, p0, La/wqv0;->p:Z

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    :goto_3
    invoke-static {v0, v1, v2, v5}, La/r4e;->a(IIII)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    iget p2, v5, La/pu90;->a:I

    .line 64
    .line 65
    invoke-static {p3, p4}, La/p4e;->k(J)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {p2, v0, v1}, La/l1e0;->d(III)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    iget p2, v5, La/pu90;->b:I

    .line 78
    .line 79
    invoke-static {p3, p4}, La/p4e;->j(J)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    invoke-static {p2, v0, p3}, La/l1e0;->d(III)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    new-instance v2, La/yc6;

    .line 92
    .line 93
    move-object v3, p0

    .line 94
    move-object v7, p1

    .line 95
    invoke-direct/range {v2 .. v7}, La/yc6;-><init>(La/wqv0;ILa/pu90;ILa/vj30;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v7, v4, v6, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
