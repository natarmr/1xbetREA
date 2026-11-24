.class public final La/hzu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lbu;

.field public final b:La/pmi;

.field public final c:La/epc;

.field public final d:La/kqc;

.field public final e:La/pru;


# direct methods
.method public constructor <init>(La/lbu;La/pmi;La/epc;La/kqc;La/pru;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hzu;->a:La/lbu;

    .line 5
    .line 6
    iput-object p2, p0, La/hzu;->b:La/pmi;

    .line 7
    .line 8
    iput-object p3, p0, La/hzu;->c:La/epc;

    .line 9
    .line 10
    iput-object p4, p0, La/hzu;->d:La/kqc;

    .line 11
    .line 12
    iput-object p5, p0, La/hzu;->e:La/pru;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/gzu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/gzu;

    .line 7
    .line 8
    iget v1, v0, La/gzu;->l:I

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
    iput v1, v0, La/gzu;->l:I

    .line 18
    .line 19
    :goto_0
    move-object v3, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/gzu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/gzu;-><init>(La/hzu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v3, La/gzu;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v3, La/gzu;->l:I

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
    iget-object v1, v3, La/gzu;->i:La/lbu;

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
    iget-object v1, p0, La/hzu;->a:La/lbu;

    .line 62
    .line 63
    iput-object v1, v3, La/gzu;->i:La/lbu;

    .line 64
    .line 65
    iput v5, v3, La/gzu;->l:I

    .line 66
    .line 67
    iget-object p1, p0, La/hzu;->b:La/pmi;

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
    iget-object v5, p0, La/hzu;->c:La/epc;

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
    sget-object v6, La/sub0;->b:La/nh70;

    .line 91
    .line 92
    iget-object v7, p0, La/hzu;->d:La/kqc;

    .line 93
    .line 94
    invoke-virtual {v7}, La/kqc;->a()La/sub0;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v7}, La/nh70;->j(La/sub0;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    iget-object p0, p0, La/hzu;->e:La/pru;

    .line 106
    .line 107
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    iget-object p0, p0, La/sff0;->d:La/q1w0;

    .line 112
    .line 113
    iget-boolean v8, p0, La/q1w0;->b:Z

    .line 114
    .line 115
    iput-object v2, v3, La/gzu;->i:La/lbu;

    .line 116
    .line 117
    iput v4, v3, La/gzu;->l:I

    .line 118
    .line 119
    iget-object p0, v1, La/lbu;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, La/cu5;

    .line 122
    .line 123
    iget-object v1, v1, La/lbu;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, La/j1q0;

    .line 126
    .line 127
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 128
    .line 129
    invoke-virtual {v1}, La/m1q0;->i()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 134
    .line 135
    move-object v1, p0

    .line 136
    move v2, p1

    .line 137
    invoke-virtual/range {v1 .. v8}, La/cu5;->r(ILa/zje;Ljava/lang/String;ZZZZ)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-ne p0, v0, :cond_5

    .line 142
    .line 143
    :goto_3
    return-object v0

    .line 144
    :cond_5
    return-object p0
.end method
