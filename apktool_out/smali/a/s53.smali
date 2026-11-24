.class public final La/s53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final a:La/v63;

.field public b:Z


# direct methods
.method public constructor <init>(La/v63;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/s53;->a:La/v63;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/cnx;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/pj30;

    .line 14
    .line 15
    invoke-interface {p0, p3}, La/pj30;->D(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x1

    .line 24
    sub-int/2addr p1, v0

    .line 25
    if-gt v0, p1, :cond_2

    .line 26
    .line 27
    :goto_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/pj30;

    .line 32
    .line 33
    invoke-interface {v1, p3}, La/pj30;->D(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-le v1, p0, :cond_1

    .line 38
    .line 39
    move p0, v1

    .line 40
    :cond_1
    if-eq v0, p1, :cond_2

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return p0
.end method

.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 11

    .line 1
    iget-object v0, p0, La/s53;->a:La/v63;

    .line 2
    .line 3
    iget-object v0, v0, La/v63;->a:La/pz40;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    move v5, v4

    .line 21
    move v6, v5

    .line 22
    :goto_0
    if-ge v4, v2, :cond_0

    .line 23
    .line 24
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    check-cast v7, La/pj30;

    .line 29
    .line 30
    invoke-interface {v7, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    iget v8, v7, La/pu90;->a:I

    .line 35
    .line 36
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    iget v8, v7, La/pu90;->b:I

    .line 41
    .line 42
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-interface {p1}, La/cnx;->M()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    const-wide p3, 0xffffffffL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    const/16 v2, 0x20

    .line 62
    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    iput-boolean p2, p0, La/s53;->b:Z

    .line 67
    .line 68
    int-to-long v7, v5

    .line 69
    shl-long/2addr v7, v2

    .line 70
    int-to-long v9, v6

    .line 71
    and-long p2, v9, p3

    .line 72
    .line 73
    or-long/2addr p2, v7

    .line 74
    new-instance p0, La/qkx;

    .line 75
    .line 76
    invoke-direct {p0, p2, p3}, La/qkx;-><init>(J)V

    .line 77
    .line 78
    .line 79
    check-cast v0, La/hgk0;

    .line 80
    .line 81
    invoke-virtual {v0, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    iget-boolean p0, p0, La/s53;->b:Z

    .line 86
    .line 87
    if-nez p0, :cond_2

    .line 88
    .line 89
    int-to-long v7, v5

    .line 90
    shl-long/2addr v7, v2

    .line 91
    int-to-long v9, v6

    .line 92
    and-long p2, v9, p3

    .line 93
    .line 94
    or-long/2addr p2, v7

    .line 95
    new-instance p0, La/qkx;

    .line 96
    .line 97
    invoke-direct {p0, p2, p3}, La/qkx;-><init>(J)V

    .line 98
    .line 99
    .line 100
    check-cast v0, La/hgk0;

    .line 101
    .line 102
    invoke-virtual {v0, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_1
    new-instance p0, La/r53;

    .line 106
    .line 107
    invoke-direct {p0, v1, v3}, La/r53;-><init>(Ljava/util/ArrayList;B)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v5, v6, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method

.method public final c(La/cnx;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/pj30;

    .line 14
    .line 15
    invoke-interface {p0, p3}, La/pj30;->b(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x1

    .line 24
    sub-int/2addr p1, v0

    .line 25
    if-gt v0, p1, :cond_2

    .line 26
    .line 27
    :goto_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/pj30;

    .line 32
    .line 33
    invoke-interface {v1, p3}, La/pj30;->b(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-le v1, p0, :cond_1

    .line 38
    .line 39
    move p0, v1

    .line 40
    :cond_1
    if-eq v0, p1, :cond_2

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return p0
.end method

.method public final d(La/cnx;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/pj30;

    .line 14
    .line 15
    invoke-interface {p0, p3}, La/pj30;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x1

    .line 24
    sub-int/2addr p1, v0

    .line 25
    if-gt v0, p1, :cond_2

    .line 26
    .line 27
    :goto_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/pj30;

    .line 32
    .line 33
    invoke-interface {v1, p3}, La/pj30;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-le v1, p0, :cond_1

    .line 38
    .line 39
    move p0, v1

    .line 40
    :cond_1
    if-eq v0, p1, :cond_2

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return p0
.end method

.method public final e(La/cnx;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/pj30;

    .line 14
    .line 15
    invoke-interface {p0, p3}, La/pj30;->P(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x1

    .line 24
    sub-int/2addr p1, v0

    .line 25
    if-gt v0, p1, :cond_2

    .line 26
    .line 27
    :goto_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/pj30;

    .line 32
    .line 33
    invoke-interface {v1, p3}, La/pj30;->P(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-le v1, p0, :cond_1

    .line 38
    .line 39
    move p0, v1

    .line 40
    :cond_1
    if-eq v0, p1, :cond_2

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return p0
.end method
