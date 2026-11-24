.class public final La/y910;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public o:I

.field public p:I


# virtual methods
.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, La/y910;->o:I

    .line 5
    .line 6
    iget v1, p0, La/y910;->p:I

    .line 7
    .line 8
    invoke-static {v0, v1}, La/n2x;->b(II)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {p3, p4, v0, v1}, La/r4e;->d(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x20

    .line 21
    .line 22
    const v4, 0x7fffffff

    .line 23
    .line 24
    .line 25
    if-ne v2, v4, :cond_0

    .line 26
    .line 27
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eq v2, v4, :cond_0

    .line 32
    .line 33
    shr-long p3, v0, v3

    .line 34
    .line 35
    long-to-int p3, p3

    .line 36
    iget p4, p0, La/y910;->p:I

    .line 37
    .line 38
    mul-int/2addr p4, p3

    .line 39
    iget p0, p0, La/y910;->o:I

    .line 40
    .line 41
    div-int/2addr p4, p0

    .line 42
    invoke-static {p3, p3, p4, p4}, La/r4e;->a(IIII)J

    .line 43
    .line 44
    .line 45
    move-result-wide p3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const-wide v5, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    if-ne v2, v4, :cond_1

    .line 57
    .line 58
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    if-eq p3, v4, :cond_1

    .line 63
    .line 64
    and-long p3, v0, v5

    .line 65
    .line 66
    long-to-int p3, p3

    .line 67
    iget p4, p0, La/y910;->o:I

    .line 68
    .line 69
    mul-int/2addr p4, p3

    .line 70
    iget p0, p0, La/y910;->p:I

    .line 71
    .line 72
    div-int/2addr p4, p0

    .line 73
    invoke-static {p4, p4, p3, p3}, La/r4e;->a(IIII)J

    .line 74
    .line 75
    .line 76
    move-result-wide p3

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    shr-long p3, v0, v3

    .line 79
    .line 80
    long-to-int p0, p3

    .line 81
    and-long p3, v0, v5

    .line 82
    .line 83
    long-to-int p3, p3

    .line 84
    invoke-static {p0, p0, p3, p3}, La/r4e;->a(IIII)J

    .line 85
    .line 86
    .line 87
    move-result-wide p3

    .line 88
    :goto_0
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iget p2, p0, La/pu90;->a:I

    .line 93
    .line 94
    iget p3, p0, La/pu90;->b:I

    .line 95
    .line 96
    new-instance p4, La/r63;

    .line 97
    .line 98
    const/4 v0, 0x3

    .line 99
    invoke-direct {p4, p0, v0}, La/r63;-><init>(La/pu90;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1, p2, p3, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method
