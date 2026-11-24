.class public final La/fqf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/drf0;

.field public final b:La/qpt;

.field public final c:La/wsf0;


# direct methods
.method public constructor <init>(La/drf0;La/qpt;La/wsf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fqf0;->a:La/drf0;

    .line 5
    .line 6
    iput-object p2, p0, La/fqf0;->b:La/qpt;

    .line 7
    .line 8
    iput-object p3, p0, La/fqf0;->c:La/wsf0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/eqf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/eqf0;

    .line 7
    .line 8
    iget v1, v0, La/eqf0;->k:I

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
    iput v1, v0, La/eqf0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/eqf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/eqf0;-><init>(La/fqf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/eqf0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/eqf0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, La/fqf0;->b:La/qpt;

    .line 58
    .line 59
    invoke-virtual {p1}, La/qpt;->a()La/ql5;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_5

    .line 64
    .line 65
    iget-object p1, p0, La/fqf0;->c:La/wsf0;

    .line 66
    .line 67
    iget-object p1, p1, La/wsf0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, La/g45;

    .line 70
    .line 71
    invoke-virtual {p1}, La/g45;->G()La/khf0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget-object v2, La/bm5;->d:La/bm5;

    .line 76
    .line 77
    iput v4, v0, La/eqf0;->k:I

    .line 78
    .line 79
    sget-object v4, La/tl5;->c:La/tl5;

    .line 80
    .line 81
    invoke-virtual {p1, v2, v4, v0}, La/khf0;->A(La/bm5;La/tl5;La/yje;)Ljava/io/Serializable;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v1, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    check-cast p1, La/ql5;

    .line 89
    .line 90
    :cond_5
    iget-wide v4, p1, La/ql5;->e:J

    .line 91
    .line 92
    iget-object p1, p1, La/ql5;->f:Ljava/lang/String;

    .line 93
    .line 94
    iput v3, v0, La/eqf0;->k:I

    .line 95
    .line 96
    iget-object p0, p0, La/fqf0;->a:La/drf0;

    .line 97
    .line 98
    invoke-virtual {p0, v4, v5, v0, p1}, La/drf0;->a(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-ne p0, v1, :cond_6

    .line 103
    .line 104
    :goto_2
    return-object v1

    .line 105
    :cond_6
    return-object p0
.end method
