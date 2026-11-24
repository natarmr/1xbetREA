.class public final La/h53;
.super La/fnx;
.source "SourceFile"


# instance fields
.field public p:La/vls0;

.field public q:La/pz40;

.field public r:La/i53;

.field public s:La/pu90;

.field public t:La/pu90;

.field public u:J

.field public v:J

.field public final w:La/f53;

.field public final x:La/f53;

.field public y:J


# direct methods
.method public constructor <init>(La/vls0;La/pz40;La/i53;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, La/fnx;-><init>(B)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, La/h53;->p:La/vls0;

    .line 6
    .line 7
    iput-object p2, p0, La/h53;->q:La/pz40;

    .line 8
    .line 9
    iput-object p3, p0, La/h53;->r:La/i53;

    .line 10
    .line 11
    const-wide/16 p1, 0x0

    .line 12
    .line 13
    iput-wide p1, p0, La/h53;->u:J

    .line 14
    .line 15
    iput-wide p1, p0, La/h53;->v:J

    .line 16
    .line 17
    new-instance p1, La/f53;

    .line 18
    .line 19
    invoke-direct {p1, p0, v0}, La/f53;-><init>(La/h53;B)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/h53;->w:La/f53;

    .line 23
    .line 24
    new-instance p1, La/f53;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p1, p0, p2}, La/f53;-><init>(La/h53;B)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/h53;->x:La/f53;

    .line 31
    .line 32
    const-wide p1, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    iput-wide p1, p0, La/h53;->y:J

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final T0()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, La/h53;->y:J

    .line 7
    .line 8
    return-void
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 7

    .line 1
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, La/cnx;->M()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const-wide v0, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/16 p4, 0x20

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iget p3, p2, La/pu90;->a:I

    .line 19
    .line 20
    iget v2, p2, La/pu90;->b:I

    .line 21
    .line 22
    int-to-long v3, p3

    .line 23
    shl-long/2addr v3, p4

    .line 24
    int-to-long v5, v2

    .line 25
    and-long/2addr v5, v0

    .line 26
    or-long v2, v3, v5

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p3, p0, La/h53;->p:La/vls0;

    .line 30
    .line 31
    iget v2, p2, La/pu90;->a:I

    .line 32
    .line 33
    if-nez p3, :cond_1

    .line 34
    .line 35
    iget p3, p2, La/pu90;->b:I

    .line 36
    .line 37
    int-to-long v2, v2

    .line 38
    shl-long/2addr v2, p4

    .line 39
    int-to-long v4, p3

    .line 40
    and-long/2addr v4, v0

    .line 41
    or-long/2addr v2, v4

    .line 42
    iput-wide v2, p0, La/h53;->y:J

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget v3, p2, La/pu90;->b:I

    .line 46
    .line 47
    int-to-long v4, v2

    .line 48
    shl-long/2addr v4, p4

    .line 49
    int-to-long v2, v3

    .line 50
    and-long/2addr v2, v0

    .line 51
    or-long/2addr v2, v4

    .line 52
    new-instance v4, La/g53;

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct {v4, p0, v2, v3, v5}, La/g53;-><init>(Ljava/lang/Object;JB)V

    .line 56
    .line 57
    .line 58
    new-instance v5, La/g53;

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    invoke-direct {v5, p0, v2, v3, v6}, La/g53;-><init>(Ljava/lang/Object;JB)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-virtual {p3, v4, v2, v2, v5}, La/vls0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;La/t73;Lkotlin/jvm/functions/Function1;)La/uls0;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p3}, La/uls0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, La/qkx;

    .line 74
    .line 75
    iget-wide v2, v2, La/qkx;->a:J

    .line 76
    .line 77
    invoke-virtual {p3}, La/uls0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    check-cast p3, La/qkx;

    .line 82
    .line 83
    iget-wide v4, p3, La/qkx;->a:J

    .line 84
    .line 85
    iput-wide v4, p0, La/h53;->y:J

    .line 86
    .line 87
    :goto_0
    invoke-interface {p1}, La/cnx;->M()Z

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    if-eqz p3, :cond_2

    .line 92
    .line 93
    iput-object p2, p0, La/h53;->s:La/pu90;

    .line 94
    .line 95
    iput-wide v2, p0, La/h53;->u:J

    .line 96
    .line 97
    shr-long p2, v2, p4

    .line 98
    .line 99
    long-to-int p2, p2

    .line 100
    and-long p3, v2, v0

    .line 101
    .line 102
    long-to-int p3, p3

    .line 103
    iget-object p0, p0, La/h53;->w:La/f53;

    .line 104
    .line 105
    invoke-static {p1, p2, p3, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_2
    iput-object p2, p0, La/h53;->t:La/pu90;

    .line 111
    .line 112
    iput-wide v2, p0, La/h53;->v:J

    .line 113
    .line 114
    shr-long p2, v2, p4

    .line 115
    .line 116
    long-to-int p2, p2

    .line 117
    and-long p3, v2, v0

    .line 118
    .line 119
    long-to-int p3, p3

    .line 120
    iget-object p0, p0, La/h53;->x:La/f53;

    .line 121
    .line 122
    invoke-static {p1, p2, p3, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0
.end method
