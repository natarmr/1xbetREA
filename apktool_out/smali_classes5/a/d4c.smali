.class public final La/d4c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r7v;


# direct methods
.method public constructor <init>(La/r7v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d4c;->a:La/r7v;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/c4c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/c4c;

    .line 7
    .line 8
    iget v1, v0, La/c4c;->k:I

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
    iput v1, v0, La/c4c;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/c4c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/c4c;-><init>(La/d4c;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/c4c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/c4c;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/c4c;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/d4c;->a:La/r7v;

    .line 53
    .line 54
    iget-object p0, p0, La/r7v;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/sza;

    .line 57
    .line 58
    invoke-virtual {p0}, La/sza;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/p3c;

    .line 63
    .line 64
    new-instance p3, La/l4c;

    .line 65
    .line 66
    new-instance v2, La/s3c;

    .line 67
    .line 68
    invoke-direct {v2, p1, p2, p4}, La/s3c;-><init>(JLjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p3, v2}, La/l4c;-><init>(La/s3c;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, p3, v0}, La/p3c;->a(La/l4c;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    if-ne p3, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_1
    check-cast p3, La/q16;

    .line 82
    .line 83
    iget-object p0, p3, La/q16;->c:La/kuw;

    .line 84
    .line 85
    sget-object p1, La/i2o;->Z1:La/i2o;

    .line 86
    .line 87
    if-eq p0, p1, :cond_4

    .line 88
    .line 89
    sget-object p1, La/i2o;->a2:La/i2o;

    .line 90
    .line 91
    if-eq p0, p1, :cond_4

    .line 92
    .line 93
    sget-object p1, La/i2o;->b2:La/i2o;

    .line 94
    .line 95
    if-eq p0, p1, :cond_4

    .line 96
    .line 97
    sget-object p1, La/i2o;->c2:La/i2o;

    .line 98
    .line 99
    if-eq p0, p1, :cond_4

    .line 100
    .line 101
    sget-object p1, La/i2o;->d2:La/i2o;

    .line 102
    .line 103
    if-eq p0, p1, :cond_4

    .line 104
    .line 105
    invoke-virtual {p3}, La/q16;->a()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_4
    new-instance p0, La/t3c;

    .line 111
    .line 112
    iget-object p1, p3, La/q16;->a:Ljava/lang/String;

    .line 113
    .line 114
    invoke-direct {p0, p1}, La/t3c;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p0
.end method
