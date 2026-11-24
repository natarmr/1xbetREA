.class public final La/cl3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mii0;


# direct methods
.method public synthetic constructor <init>(La/mii0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cl3;->a:La/mii0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/cl3;->a:La/mii0;

    .line 2
    .line 3
    iget-object v1, v0, La/mii0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/mne;

    .line 6
    .line 7
    instance-of v2, p5, La/bl3;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, p5

    .line 12
    check-cast v2, La/bl3;

    .line 13
    .line 14
    iget v3, v2, La/bl3;->m:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, La/bl3;->m:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, La/bl3;

    .line 27
    .line 28
    invoke-direct {v2, p0, p5}, La/bl3;-><init>(La/cl3;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p0, v2, La/bl3;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object p5, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v2, La/bl3;->m:I

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    const/4 v5, 0x1

    .line 39
    const/4 v6, 0x0

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    if-eq v3, v5, :cond_2

    .line 43
    .line 44
    if-ne v3, v4, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_2
    iget-wide p3, v2, La/bl3;->j:J

    .line 57
    .line 58
    iget-object p2, v2, La/bl3;->i:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p2, v2, La/bl3;->i:Ljava/lang/String;

    .line 68
    .line 69
    iput-wide p3, v2, La/bl3;->j:J

    .line 70
    .line 71
    iput v5, v2, La/bl3;->m:I

    .line 72
    .line 73
    iget-object p0, v1, La/mne;->b:La/dvj;

    .line 74
    .line 75
    new-instance v3, La/tg3;

    .line 76
    .line 77
    invoke-direct {v3, v0, p1, p2, v6}, La/tg3;-><init>(La/mii0;Ljava/lang/String;Ljava/lang/String;La/yje;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v3, v2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-ne p0, p5, :cond_4

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    :goto_1
    check-cast p0, La/yk3;

    .line 88
    .line 89
    iget-wide v7, p0, La/yk3;->b:J

    .line 90
    .line 91
    cmp-long p1, v7, p3

    .line 92
    .line 93
    if-gtz p1, :cond_7

    .line 94
    .line 95
    iput-object v6, v2, La/bl3;->i:Ljava/lang/String;

    .line 96
    .line 97
    iput-wide p3, v2, La/bl3;->j:J

    .line 98
    .line 99
    iput v4, v2, La/bl3;->m:I

    .line 100
    .line 101
    iget-object p1, v1, La/mne;->b:La/dvj;

    .line 102
    .line 103
    new-instance p3, La/ee0;

    .line 104
    .line 105
    invoke-direct {p3, v0, p2, p0, v6}, La/ee0;-><init>(La/mii0;Ljava/lang/String;La/yk3;La/yje;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1, p3, v2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-ne p0, p5, :cond_5

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_2
    if-ne p0, p5, :cond_6

    .line 118
    .line 119
    :goto_3
    return-object p5

    .line 120
    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_7
    new-instance p0, La/c44;

    .line 124
    .line 125
    const/16 p1, 0x8

    .line 126
    .line 127
    invoke-direct {p0, p1}, La/c44;-><init>(B)V

    .line 128
    .line 129
    .line 130
    throw p0
.end method
