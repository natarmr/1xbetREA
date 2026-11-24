.class public final La/zmt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ant;

.field public final b:La/pmi;

.field public final c:La/kqc;

.field public final d:La/epc;

.field public final e:La/pru;


# direct methods
.method public constructor <init>(La/epc;La/kqc;La/pmi;La/ant;La/pru;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La/zmt;->a:La/ant;

    .line 5
    .line 6
    iput-object p3, p0, La/zmt;->b:La/pmi;

    .line 7
    .line 8
    iput-object p2, p0, La/zmt;->c:La/kqc;

    .line 9
    .line 10
    iput-object p1, p0, La/zmt;->d:La/epc;

    .line 11
    .line 12
    iput-object p5, p0, La/zmt;->e:La/pru;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/ec0;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/ymt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ymt;

    .line 7
    .line 8
    iget v1, v0, La/ymt;->m:I

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
    iput v1, v0, La/ymt;->m:I

    .line 18
    .line 19
    :goto_0
    move-object v9, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/ymt;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/ymt;-><init>(La/zmt;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v9, La/ymt;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v9, La/ymt;->m:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object p2

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
    iget-object p1, v9, La/ymt;->j:La/ant;

    .line 53
    .line 54
    iget-object v1, v9, La/ymt;->i:La/ec0;

    .line 55
    .line 56
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v5, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, v9, La/ymt;->i:La/ec0;

    .line 65
    .line 66
    iget-object p2, p0, La/zmt;->a:La/ant;

    .line 67
    .line 68
    iput-object p2, v9, La/ymt;->j:La/ant;

    .line 69
    .line 70
    iput v4, v9, La/ymt;->m:I

    .line 71
    .line 72
    iget-object v1, p0, La/zmt;->b:La/pmi;

    .line 73
    .line 74
    invoke-virtual {v1, v9}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-ne v1, v0, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move-object v5, p1

    .line 82
    move-object p1, p2

    .line 83
    move-object p2, v1

    .line 84
    :goto_2
    check-cast p2, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    iget-object v1, p0, La/zmt;->d:La/epc;

    .line 91
    .line 92
    invoke-virtual {v1}, La/epc;->a()La/hr4;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-boolean v1, v1, La/hr4;->a:Z

    .line 97
    .line 98
    sget-object v4, La/sub0;->b:La/nh70;

    .line 99
    .line 100
    iget-object v6, p0, La/zmt;->c:La/kqc;

    .line 101
    .line 102
    invoke-virtual {v6}, La/kqc;->a()La/sub0;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {v6}, La/nh70;->j(La/sub0;)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    iget-object p0, p0, La/zmt;->e:La/pru;

    .line 114
    .line 115
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    iget-object p0, p0, La/sff0;->d:La/q1w0;

    .line 120
    .line 121
    iget-boolean v8, p0, La/q1w0;->b:Z

    .line 122
    .line 123
    iput-object v2, v9, La/ymt;->i:La/ec0;

    .line 124
    .line 125
    iput-object v2, v9, La/ymt;->j:La/ant;

    .line 126
    .line 127
    iput v3, v9, La/ymt;->m:I

    .line 128
    .line 129
    move v3, v1

    .line 130
    iget-object v1, p1, La/ant;->a:La/cu5;

    .line 131
    .line 132
    iget-object p0, p1, La/ant;->b:La/j1q0;

    .line 133
    .line 134
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 135
    .line 136
    invoke-virtual {p0}, La/m1q0;->i()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 141
    .line 142
    move v2, p2

    .line 143
    invoke-virtual/range {v1 .. v9}, La/cu5;->e(IZZLa/ec0;Ljava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    if-ne p0, v0, :cond_5

    .line 148
    .line 149
    :goto_3
    return-object v0

    .line 150
    :cond_5
    return-object p0
.end method
