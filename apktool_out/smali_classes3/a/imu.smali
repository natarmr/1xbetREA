.class public final La/imu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jmu;

.field public final b:La/pmi;

.field public final c:La/epc;

.field public final d:La/kqc;

.field public final e:La/n0o0;


# direct methods
.method public constructor <init>(La/jmu;La/pmi;La/pru;La/epc;La/kqc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/imu;->a:La/jmu;

    .line 5
    .line 6
    iput-object p2, p0, La/imu;->b:La/pmi;

    .line 7
    .line 8
    iput-object p4, p0, La/imu;->c:La/epc;

    .line 9
    .line 10
    iput-object p5, p0, La/imu;->d:La/kqc;

    .line 11
    .line 12
    new-instance p1, La/b6u;

    .line 13
    .line 14
    const/4 p2, 0x6

    .line 15
    invoke-direct {p1, p3, p2}, La/b6u;-><init>(La/pru;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/imu;->e:La/n0o0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/hmu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/hmu;

    .line 7
    .line 8
    iget v1, v0, La/hmu;->l:I

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
    iput v1, v0, La/hmu;->l:I

    .line 18
    .line 19
    :goto_0
    move-object v3, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/hmu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/hmu;-><init>(La/imu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v3, La/hmu;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v3, La/hmu;->l:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-ne v1, v4, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    iget-object v1, v3, La/hmu;->i:La/jmu;

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, La/imu;->a:La/jmu;

    .line 62
    .line 63
    iput-object v1, v3, La/hmu;->i:La/jmu;

    .line 64
    .line 65
    iput v5, v3, La/hmu;->l:I

    .line 66
    .line 67
    iget-object p1, p0, La/imu;->b:La/pmi;

    .line 68
    .line 69
    invoke-virtual {p1, v3}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v0, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget-object v5, p0, La/imu;->c:La/epc;

    .line 83
    .line 84
    invoke-virtual {v5}, La/epc;->a()La/hr4;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget-boolean v5, v5, La/hr4;->a:Z

    .line 89
    .line 90
    iget-object v6, p0, La/imu;->e:La/n0o0;

    .line 91
    .line 92
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    check-cast v6, La/sff0;

    .line 97
    .line 98
    iget-object v6, v6, La/sff0;->d:La/q1w0;

    .line 99
    .line 100
    iget-boolean v7, v6, La/q1w0;->b:Z

    .line 101
    .line 102
    sget-object v6, La/sub0;->b:La/nh70;

    .line 103
    .line 104
    iget-object p0, p0, La/imu;->d:La/kqc;

    .line 105
    .line 106
    invoke-virtual {p0}, La/kqc;->a()La/sub0;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, La/nh70;->j(La/sub0;)Z

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    iput-object v2, v3, La/hmu;->i:La/jmu;

    .line 118
    .line 119
    iput v4, v3, La/hmu;->l:I

    .line 120
    .line 121
    move-object p0, v1

    .line 122
    iget-object v1, p0, La/jmu;->a:La/cu5;

    .line 123
    .line 124
    iget-object p0, p0, La/jmu;->b:La/j1q0;

    .line 125
    .line 126
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 127
    .line 128
    invoke-virtual {p0}, La/m1q0;->i()Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 133
    .line 134
    move v2, p1

    .line 135
    invoke-virtual/range {v1 .. v8}, La/cu5;->o(ILa/zje;Ljava/lang/String;ZZZZ)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v0, :cond_5

    .line 140
    .line 141
    :goto_3
    return-object v0

    .line 142
    :cond_5
    return-object p0
.end method
