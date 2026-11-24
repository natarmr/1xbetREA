.class public final La/w1d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final synthetic a:La/rv2;


# direct methods
.method public constructor <init>(La/rv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/w1d;->a:La/rv2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 4

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long p1, p2, v0

    .line 7
    .line 8
    long-to-int p1, p1

    .line 9
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 p2, 0x0

    .line 14
    cmpg-float p3, p1, p2

    .line 15
    .line 16
    if-gez p3, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, La/w1d;->a:La/rv2;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/rv2;->c(F)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    int-to-long p1, p1

    .line 29
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    int-to-long v2, p0

    .line 34
    const/16 p0, 0x20

    .line 35
    .line 36
    shl-long p0, p1, p0

    .line 37
    .line 38
    and-long p2, v2, v0

    .line 39
    .line 40
    or-long/2addr p0, p2

    .line 41
    return-wide p0

    .line 42
    :cond_0
    const-wide/16 p0, 0x0

    .line 43
    .line 44
    return-wide p0
.end method

.method public final S(IJJ)J
    .locals 2

    .line 1
    const-wide p1, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long p3, p4, p1

    .line 7
    .line 8
    long-to-int p3, p3

    .line 9
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    iget-object p0, p0, La/w1d;->a:La/rv2;

    .line 14
    .line 15
    invoke-virtual {p0, p3}, La/rv2;->c(F)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 p3, 0x0

    .line 20
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    int-to-long p3, p3

    .line 25
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-long v0, p0

    .line 30
    const/16 p0, 0x20

    .line 31
    .line 32
    shl-long/2addr p3, p0

    .line 33
    and-long p0, v0, p1

    .line 34
    .line 35
    or-long/2addr p0, p3

    .line 36
    return-wide p0
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p5, La/v1d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/v1d;

    .line 7
    .line 8
    iget v1, v0, La/v1d;->m:I

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
    iput v1, v0, La/v1d;->m:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/v1d;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/v1d;-><init>(La/w1d;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, La/v1d;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p5, La/v1d;->m:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    iget-wide p3, p5, La/v1d;->j:J

    .line 53
    .line 54
    iget-wide p1, p5, La/v1d;->i:J

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
    const/4 v0, 0x7

    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-static {v2, v2, v3, v0}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-wide p1, p5, La/v1d;->i:J

    .line 70
    .line 71
    iput-wide p3, p5, La/v1d;->j:J

    .line 72
    .line 73
    iput v5, p5, La/v1d;->m:I

    .line 74
    .line 75
    iget-object v2, p0, La/w1d;->a:La/rv2;

    .line 76
    .line 77
    invoke-virtual {v2, v0, p5}, La/rv2;->g(La/uts0;La/zje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-ne v0, v1, :cond_4

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    iput-wide p1, p5, La/v1d;->i:J

    .line 85
    .line 86
    iput-wide p3, p5, La/v1d;->j:J

    .line 87
    .line 88
    iput v4, p5, La/v1d;->m:I

    .line 89
    .line 90
    invoke-super/range {p0 .. p5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v1, :cond_5

    .line 95
    .line 96
    :goto_3
    return-object v1

    .line 97
    :cond_5
    return-object p0
.end method
