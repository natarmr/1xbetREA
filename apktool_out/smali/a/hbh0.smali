.class public final La/hbh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final a:La/sch0;

.field public b:Z


# direct methods
.method public constructor <init>(La/sch0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hbh0;->a:La/sch0;

    .line 5
    .line 6
    iput-boolean p2, p0, La/hbh0;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final S(IJJ)J
    .locals 0

    .line 1
    iget-boolean p1, p0, La/hbh0;->b:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/hbh0;->a:La/sch0;

    .line 6
    .line 7
    iget-object p1, p0, La/sch0;->a:La/bch0;

    .line 8
    .line 9
    invoke-interface {p1}, La/bch0;->a()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, La/sch0;->a:La/bch0;

    .line 17
    .line 18
    invoke-virtual {p0, p4, p5}, La/sch0;->h(J)F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p0, p2}, La/sch0;->e(F)F

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-interface {p1, p2}, La/bch0;->e(F)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0, p1}, La/sch0;->e(F)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, La/sch0;->i(F)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    return-wide p0

    .line 39
    :cond_1
    :goto_0
    const-wide/16 p0, 0x0

    .line 40
    .line 41
    return-wide p0
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of p1, p5, La/gbh0;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p5

    .line 6
    check-cast p1, La/gbh0;

    .line 7
    .line 8
    iget p2, p1, La/gbh0;->l:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    and-int v1, p2, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p2, v0

    .line 17
    iput p2, p1, La/gbh0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, La/gbh0;

    .line 21
    .line 22
    invoke-direct {p1, p0, p5}, La/gbh0;-><init>(La/hbh0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, p1, La/gbh0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p5, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v0, p1, La/gbh0;->l:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    iget-wide p3, p1, La/gbh0;->i:J

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-boolean p2, p0, La/hbh0;->b:Z

    .line 53
    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    if-eqz p2, :cond_5

    .line 57
    .line 58
    iget-object p0, p0, La/hbh0;->a:La/sch0;

    .line 59
    .line 60
    iget-boolean p2, p0, La/sch0;->i:Z

    .line 61
    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iput-wide p3, p1, La/gbh0;->i:J

    .line 66
    .line 67
    iput v1, p1, La/gbh0;->l:I

    .line 68
    .line 69
    invoke-virtual {p0, p3, p4, p1}, La/sch0;->a(JLa/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, p5, :cond_4

    .line 74
    .line 75
    return-object p5

    .line 76
    :cond_4
    :goto_1
    check-cast p2, La/g6u0;

    .line 77
    .line 78
    iget-wide v2, p2, La/g6u0;->a:J

    .line 79
    .line 80
    :goto_2
    invoke-static {p3, p4, v2, v3}, La/g6u0;->d(JJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    :cond_5
    new-instance p0, La/g6u0;

    .line 85
    .line 86
    invoke-direct {p0, v2, v3}, La/g6u0;-><init>(J)V

    .line 87
    .line 88
    .line 89
    return-object p0
.end method
