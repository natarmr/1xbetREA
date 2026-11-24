.class public final La/l2u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ant;

.field public final b:La/pmi;

.field public final c:La/epc;

.field public final d:La/kqc;

.field public final e:La/pru;


# direct methods
.method public constructor <init>(La/epc;La/kqc;La/pmi;La/ant;La/pru;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La/l2u;->a:La/ant;

    .line 5
    .line 6
    iput-object p3, p0, La/l2u;->b:La/pmi;

    .line 7
    .line 8
    iput-object p1, p0, La/l2u;->c:La/epc;

    .line 9
    .line 10
    iput-object p2, p0, La/l2u;->d:La/kqc;

    .line 11
    .line 12
    iput-object p5, p0, La/l2u;->e:La/pru;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/k2u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/k2u;

    .line 7
    .line 8
    iget v1, v0, La/k2u;->m:I

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
    iput v1, v0, La/k2u;->m:I

    .line 18
    .line 19
    :goto_0
    move-object v9, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/k2u;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/k2u;-><init>(La/l2u;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v9, La/k2u;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v9, La/k2u;->m:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

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
    return-object v4

    .line 52
    :cond_2
    iget-object p1, v9, La/k2u;->j:Ljava/util/List;

    .line 53
    .line 54
    iget-object v1, v9, La/k2u;->i:La/ant;

    .line 55
    .line 56
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, La/l2u;->a:La/ant;

    .line 64
    .line 65
    iput-object v1, v9, La/k2u;->i:La/ant;

    .line 66
    .line 67
    iput-object p1, v9, La/k2u;->j:Ljava/util/List;

    .line 68
    .line 69
    iput v3, v9, La/k2u;->m:I

    .line 70
    .line 71
    iget-object p2, p0, La/l2u;->b:La/pmi;

    .line 72
    .line 73
    invoke-virtual {p2, v9}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v0, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_2
    check-cast p2, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    iget-object p2, p0, La/l2u;->c:La/epc;

    .line 87
    .line 88
    invoke-virtual {p2}, La/epc;->a()La/hr4;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iget-boolean p2, p2, La/hr4;->a:Z

    .line 93
    .line 94
    sget-object v5, La/sub0;->b:La/nh70;

    .line 95
    .line 96
    iget-object v6, p0, La/l2u;->d:La/kqc;

    .line 97
    .line 98
    invoke-virtual {v6}, La/kqc;->a()La/sub0;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v6}, La/nh70;->j(La/sub0;)Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    iget-object p0, p0, La/l2u;->e:La/pru;

    .line 110
    .line 111
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    iget-object p0, p0, La/sff0;->d:La/q1w0;

    .line 116
    .line 117
    iget-boolean v8, p0, La/q1w0;->b:Z

    .line 118
    .line 119
    iput-object v4, v9, La/k2u;->i:La/ant;

    .line 120
    .line 121
    iput-object v4, v9, La/k2u;->j:Ljava/util/List;

    .line 122
    .line 123
    iput v2, v9, La/k2u;->m:I

    .line 124
    .line 125
    move-object p0, v1

    .line 126
    iget-object v1, p0, La/ant;->a:La/cu5;

    .line 127
    .line 128
    iget-object p0, p0, La/ant;->b:La/j1q0;

    .line 129
    .line 130
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 131
    .line 132
    invoke-virtual {p0}, La/m1q0;->i()Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 137
    .line 138
    move-object v2, p1

    .line 139
    move v4, p2

    .line 140
    invoke-virtual/range {v1 .. v9}, La/cu5;->l(Ljava/util/List;IZZLjava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-ne p0, v0, :cond_5

    .line 145
    .line 146
    :goto_3
    return-object v0

    .line 147
    :cond_5
    return-object p0
.end method
