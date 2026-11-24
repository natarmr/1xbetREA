.class public final La/r2t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, La/r2t;->a:La/p7m0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/q2t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/q2t;

    .line 7
    .line 8
    iget v1, v0, La/q2t;->k:I

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
    iput v1, v0, La/q2t;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/q2t;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/q2t;-><init>(La/r2t;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/q2t;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/q2t;->k:I

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
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/r2t;->a:La/p7m0;

    .line 51
    .line 52
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/ndd;

    .line 57
    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 64
    .line 65
    iput v3, v0, La/q2t;->k:I

    .line 66
    .line 67
    check-cast p0, La/odd;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v1, :cond_4

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_4
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 83
    .line 84
    new-instance p1, La/g0g0;

    .line 85
    .line 86
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    move-object p0, p1

    .line 90
    :goto_2
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_7

    .line 95
    .line 96
    invoke-static {p0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    invoke-static {p0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    throw p0

    .line 110
    :cond_6
    :goto_3
    new-instance p0, La/vub0;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0
.end method
