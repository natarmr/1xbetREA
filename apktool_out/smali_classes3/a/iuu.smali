.class public final La/iuu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ynt;

.field public final b:La/pmi;

.field public final c:La/epc;

.field public final d:La/kqc;

.field public final e:La/pru;


# direct methods
.method public constructor <init>(La/epc;La/kqc;La/pmi;La/ynt;La/pru;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La/iuu;->a:La/ynt;

    .line 5
    .line 6
    iput-object p3, p0, La/iuu;->b:La/pmi;

    .line 7
    .line 8
    iput-object p1, p0, La/iuu;->c:La/epc;

    .line 9
    .line 10
    iput-object p2, p0, La/iuu;->d:La/kqc;

    .line 11
    .line 12
    iput-object p5, p0, La/iuu;->e:La/pru;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/huu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/huu;

    .line 7
    .line 8
    iget v1, v0, La/huu;->n:I

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
    iput v1, v0, La/huu;->n:I

    .line 18
    .line 19
    :goto_0
    move-object v9, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/huu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/huu;-><init>(La/iuu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v9, La/huu;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v9, La/huu;->n:I

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
    iget p1, v9, La/huu;->j:I

    .line 53
    .line 54
    iget v1, v9, La/huu;->i:I

    .line 55
    .line 56
    iget-object v4, v9, La/huu;->k:La/ynt;

    .line 57
    .line 58
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, La/iuu;->a:La/ynt;

    .line 66
    .line 67
    iput-object p2, v9, La/huu;->k:La/ynt;

    .line 68
    .line 69
    iput p1, v9, La/huu;->i:I

    .line 70
    .line 71
    iput p1, v9, La/huu;->j:I

    .line 72
    .line 73
    iput v4, v9, La/huu;->n:I

    .line 74
    .line 75
    iget-object v1, p0, La/iuu;->b:La/pmi;

    .line 76
    .line 77
    invoke-virtual {v1, v9}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-ne v1, v0, :cond_4

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    move-object v4, p2

    .line 85
    move-object p2, v1

    .line 86
    move v1, p1

    .line 87
    :goto_2
    check-cast p2, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    iget-object v5, p0, La/iuu;->c:La/epc;

    .line 94
    .line 95
    invoke-virtual {v5}, La/epc;->a()La/hr4;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget-boolean v5, v5, La/hr4;->a:Z

    .line 100
    .line 101
    sget-object v6, La/sub0;->b:La/nh70;

    .line 102
    .line 103
    iget-object v7, p0, La/iuu;->d:La/kqc;

    .line 104
    .line 105
    invoke-virtual {v7}, La/kqc;->a()La/sub0;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v7}, La/nh70;->j(La/sub0;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    iget-object p0, p0, La/iuu;->e:La/pru;

    .line 117
    .line 118
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iget-object p0, p0, La/sff0;->d:La/q1w0;

    .line 123
    .line 124
    iget-boolean v8, p0, La/q1w0;->b:Z

    .line 125
    .line 126
    iput-object v2, v9, La/huu;->k:La/ynt;

    .line 127
    .line 128
    iput v1, v9, La/huu;->i:I

    .line 129
    .line 130
    iput v3, v9, La/huu;->n:I

    .line 131
    .line 132
    iget-object v1, v4, La/ynt;->a:La/cu5;

    .line 133
    .line 134
    iget-object p0, v4, La/ynt;->b:La/j1q0;

    .line 135
    .line 136
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 137
    .line 138
    invoke-virtual {p0}, La/m1q0;->i()Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 143
    .line 144
    move v2, p1

    .line 145
    move v3, p2

    .line 146
    move v4, v5

    .line 147
    move v5, p0

    .line 148
    invoke-virtual/range {v1 .. v9}, La/cu5;->q(IIZZLjava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v0, :cond_5

    .line 153
    .line 154
    :goto_3
    return-object v0

    .line 155
    :cond_5
    return-object p0
.end method
