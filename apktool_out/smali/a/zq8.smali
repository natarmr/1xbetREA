.class public abstract La/zq8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/hz40;

.field public static final b:La/hz40;

.field public static final c:La/r71;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, La/zq8;->b(Z)La/hz40;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, La/zq8;->a:La/hz40;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, La/zq8;->b(Z)La/hz40;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, La/zq8;->b:La/hz40;

    .line 14
    .line 15
    sget-object v0, La/r71;->k:La/r71;

    .line 16
    .line 17
    sput-object v0, La/zq8;->c:La/r71;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(ILa/fet;La/mm40;)V
    .locals 6

    .line 1
    const v0, -0xc96ce69

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p0, 0x6

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    or-int/2addr v0, p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, p0

    .line 24
    :goto_1
    and-int/lit8 v2, v0, 0x3

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-eq v2, v1, :cond_2

    .line 28
    .line 29
    move v1, v3

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    const/4 v1, 0x0

    .line 32
    :goto_2
    and-int/2addr v0, v3

    .line 33
    invoke-virtual {p1, v0, v1}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-wide v0, p1, La/fet;->T:J

    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, La/fet;->i0()V

    .line 59
    .line 60
    .line 61
    iget-boolean v4, p1, La/fet;->S:Z

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 66
    .line 67
    invoke-virtual {p1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    invoke-virtual {p1}, La/fet;->r0()V

    .line 72
    .line 73
    .line 74
    :goto_3
    sget-object v4, La/gqw0;->x:La/shd;

    .line 75
    .line 76
    sget-object v5, La/zq8;->c:La/r71;

    .line 77
    .line 78
    invoke-static {p1, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 79
    .line 80
    .line 81
    sget-object v4, La/gqw0;->w:La/shd;

    .line 82
    .line 83
    invoke-static {p1, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 87
    .line 88
    .line 89
    sget-object v2, La/gqw0;->v:La/shd;

    .line 90
    .line 91
    invoke-static {p1, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v1, La/gqw0;->y:La/shd;

    .line 99
    .line 100
    invoke-static {p1, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 108
    .line 109
    .line 110
    :goto_4
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    new-instance v0, La/y30;

    .line 117
    .line 118
    const/16 v1, 0xc

    .line 119
    .line 120
    invoke-direct {v0, p2, p0, v1}, La/y30;-><init>(La/mm40;IB)V

    .line 121
    .line 122
    .line 123
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 124
    .line 125
    :cond_5
    return-void
.end method

.method public static final b(Z)La/hz40;
    .locals 3

    .line 1
    new-instance v0, La/hz40;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/hz40;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La/gqw0;->a:La/zx7;

    .line 9
    .line 10
    new-instance v2, La/ar8;

    .line 11
    .line 12
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, La/gqw0;->b:La/zx7;

    .line 19
    .line 20
    new-instance v2, La/ar8;

    .line 21
    .line 22
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, La/gqw0;->c:La/zx7;

    .line 29
    .line 30
    new-instance v2, La/ar8;

    .line 31
    .line 32
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, La/gqw0;->d:La/zx7;

    .line 39
    .line 40
    new-instance v2, La/ar8;

    .line 41
    .line 42
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 49
    .line 50
    new-instance v2, La/ar8;

    .line 51
    .line 52
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, La/gqw0;->f:La/zx7;

    .line 59
    .line 60
    new-instance v2, La/ar8;

    .line 61
    .line 62
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, La/gqw0;->g:La/zx7;

    .line 69
    .line 70
    new-instance v2, La/ar8;

    .line 71
    .line 72
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v1, La/gqw0;->h:La/zx7;

    .line 79
    .line 80
    new-instance v2, La/ar8;

    .line 81
    .line 82
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, La/gqw0;->i:La/zx7;

    .line 89
    .line 90
    new-instance v2, La/ar8;

    .line 91
    .line 92
    invoke-direct {v2, v1, p0}, La/ar8;-><init>(La/u12;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method

.method public static final c(La/u12;Z)La/tj30;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, La/zq8;->a:La/hz40;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, La/zq8;->b:La/hz40;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {v0, p0}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/tj30;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, La/ar8;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, La/ar8;-><init>(La/u12;Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-object v0
.end method

.method public static final d(La/ou90;La/pu90;La/pj30;La/k6z;IILa/u12;)V
    .locals 7

    .line 1
    invoke-interface {p2}, La/pj30;->n()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of v0, p2, La/yq8;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p2, La/yq8;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-eqz p2, :cond_2

    .line 14
    .line 15
    iget-object p2, p2, La/yq8;->o:La/u12;

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v0, p2

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    :goto_1
    move-object v0, p6

    .line 23
    :goto_2
    iget p2, p1, La/pu90;->a:I

    .line 24
    .line 25
    iget p6, p1, La/pu90;->b:I

    .line 26
    .line 27
    int-to-long v1, p2

    .line 28
    const/16 p2, 0x20

    .line 29
    .line 30
    shl-long/2addr v1, p2

    .line 31
    int-to-long v3, p6

    .line 32
    const-wide v5, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v3, v5

    .line 38
    or-long/2addr v1, v3

    .line 39
    int-to-long v3, p4

    .line 40
    shl-long/2addr v3, p2

    .line 41
    int-to-long p4, p5

    .line 42
    and-long/2addr p4, v5

    .line 43
    or-long/2addr v3, p4

    .line 44
    move-object v5, p3

    .line 45
    invoke-interface/range {v0 .. v5}, La/u12;->a(JJLa/k6z;)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    invoke-static {p0, p1, p2, p3}, La/ou90;->j(La/ou90;La/pu90;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
