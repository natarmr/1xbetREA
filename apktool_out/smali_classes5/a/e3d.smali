.class public final La/e3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final synthetic a:La/f3d;


# direct methods
.method public constructor <init>(La/f3d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/e3d;->a:La/f3d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 0

    .line 1
    const-wide/16 p0, 0x0

    .line 2
    .line 3
    return-wide p0
.end method

.method public final I0(JLa/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, La/g6u0;

    .line 2
    .line 3
    const-wide/16 p1, 0x0

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, La/g6u0;-><init>(J)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final S(IJJ)J
    .locals 1

    .line 1
    const-wide p1, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr p1, p4

    .line 7
    long-to-int p1, p1

    .line 8
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 p3, 0x0

    .line 13
    cmpg-float p2, p2, p3

    .line 14
    .line 15
    iget-object p0, p0, La/e3d;->a:La/f3d;

    .line 16
    .line 17
    if-gez p2, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, La/f3d;->a:La/agk0;

    .line 20
    .line 21
    invoke-virtual {p2}, La/agk0;->l()F

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iget-object v0, p0, La/f3d;->d:La/agk0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/agk0;->l()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    cmpg-float p2, p2, v0

    .line 32
    .line 33
    if-gez p2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, p4, p5}, La/f3d;->c(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    return-wide p0

    .line 40
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    cmpl-float p1, p1, p3

    .line 45
    .line 46
    if-lez p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, p4, p5}, La/f3d;->c(J)J

    .line 49
    .line 50
    .line 51
    move-result-wide p0

    .line 52
    return-wide p0

    .line 53
    :cond_1
    const-wide/16 p0, 0x0

    .line 54
    .line 55
    return-wide p0
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/d3d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/d3d;

    .line 7
    .line 8
    iget v1, v0, La/d3d;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/d3d;->m:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/d3d;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/d3d;-><init>(La/e3d;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, La/d3d;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p5, La/d3d;->m:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    iget-wide p3, p5, La/d3d;->j:J

    .line 53
    .line 54
    iget-wide p1, p5, La/d3d;->i:J

    .line 55
    .line 56
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-wide p1, p5, La/d3d;->i:J

    .line 64
    .line 65
    iput-wide p3, p5, La/d3d;->j:J

    .line 66
    .line 67
    iput v4, p5, La/d3d;->m:I

    .line 68
    .line 69
    iget-object v0, p0, La/e3d;->a:La/f3d;

    .line 70
    .line 71
    invoke-virtual {v0, p5}, La/f3d;->e(La/zje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-ne v0, v1, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    :goto_2
    iput-wide p1, p5, La/d3d;->i:J

    .line 79
    .line 80
    iput-wide p3, p5, La/d3d;->j:J

    .line 81
    .line 82
    iput v3, p5, La/d3d;->m:I

    .line 83
    .line 84
    invoke-super/range {p0 .. p5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-ne p0, v1, :cond_5

    .line 89
    .line 90
    :goto_3
    return-object v1

    .line 91
    :cond_5
    return-object p0
.end method
