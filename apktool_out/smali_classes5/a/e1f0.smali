.class public final La/e1f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/n0o0;


# direct methods
.method public constructor <init>(La/rrc;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/dio;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, p1, v1}, La/dio;-><init>(La/rrc;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/e1f0;->a:La/n0o0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/c1f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/c1f0;

    .line 7
    .line 8
    iget v1, v0, La/c1f0;->k:I

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
    iput v1, v0, La/c1f0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/c1f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/c1f0;-><init>(La/e1f0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/c1f0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/c1f0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    return-object v3

    .line 48
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/e1f0;->a:La/n0o0;

    .line 52
    .line 53
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, La/xue0;

    .line 58
    .line 59
    iput v5, v0, La/c1f0;->k:I

    .line 60
    .line 61
    iget-object p0, p0, La/xue0;->a:La/zdg0;

    .line 62
    .line 63
    new-instance p1, La/st20;

    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    const/16 v6, 0x17

    .line 67
    .line 68
    invoke-direct {p1, v2, v3, v6}, La/st20;-><init>(ILa/yje;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p0, p1, v5, v4}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v1, :cond_3

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide p0

    .line 84
    const-wide/16 v0, 0x0

    .line 85
    .line 86
    cmp-long p0, p0, v0

    .line 87
    .line 88
    if-eqz p0, :cond_4

    .line 89
    .line 90
    move v4, v5

    .line 91
    :cond_4
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method

.method public final b(Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/d1f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/d1f0;

    .line 7
    .line 8
    iget v1, v0, La/d1f0;->l:I

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
    iput v1, v0, La/d1f0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d1f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/d1f0;-><init>(La/e1f0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/d1f0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d1f0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object p0, p0, La/e1f0;->a:La/n0o0;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v6, :cond_2

    .line 40
    .line 41
    if-ne v2, v5, :cond_1

    .line 42
    .line 43
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_5

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    iget-object p1, v0, La/d1f0;->i:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, La/xue0;

    .line 67
    .line 68
    iput-object p1, v0, La/d1f0;->i:Ljava/util/ArrayList;

    .line 69
    .line 70
    iput v6, v0, La/d1f0;->l:I

    .line 71
    .line 72
    iget-object p2, p2, La/xue0;->a:La/zdg0;

    .line 73
    .line 74
    new-instance v2, La/st20;

    .line 75
    .line 76
    const/16 v7, 0x18

    .line 77
    .line 78
    invoke-direct {v2, v5, v4, v7}, La/st20;-><init>(ILa/yje;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, p2, v2, v3, v6}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    if-ne p2, v1, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    :goto_1
    if-ne p2, v1, :cond_5

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    :goto_2
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, La/xue0;

    .line 98
    .line 99
    iput-object v4, v0, La/d1f0;->i:Ljava/util/ArrayList;

    .line 100
    .line 101
    iput v5, v0, La/d1f0;->l:I

    .line 102
    .line 103
    iget-object p2, p0, La/xue0;->a:La/zdg0;

    .line 104
    .line 105
    new-instance v2, La/g4e0;

    .line 106
    .line 107
    const/16 v5, 0x1a

    .line 108
    .line 109
    invoke-direct {v2, p0, p1, v4, v5}, La/g4e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0, p2, v2, v3, v6}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v1, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    :goto_3
    if-ne p0, v1, :cond_7

    .line 122
    .line 123
    :goto_4
    return-object v1

    .line 124
    :cond_7
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0
.end method
