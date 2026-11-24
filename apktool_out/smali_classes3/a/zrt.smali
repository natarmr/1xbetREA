.class public final La/zrt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fhj;

.field public final b:La/pmi;

.field public final c:La/kqc;

.field public final d:La/epc;

.field public final e:La/pru;


# direct methods
.method public constructor <init>(La/fhj;La/pmi;La/kqc;La/epc;La/pru;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zrt;->a:La/fhj;

    .line 5
    .line 6
    iput-object p2, p0, La/zrt;->b:La/pmi;

    .line 7
    .line 8
    iput-object p3, p0, La/zrt;->c:La/kqc;

    .line 9
    .line 10
    iput-object p4, p0, La/zrt;->d:La/epc;

    .line 11
    .line 12
    iput-object p5, p0, La/zrt;->e:La/pru;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/yrt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/yrt;

    .line 7
    .line 8
    iget v1, v0, La/yrt;->n:I

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
    iput v1, v0, La/yrt;->n:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/yrt;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/yrt;-><init>(La/zrt;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v7, La/yrt;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/yrt;->n:I

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
    iget-boolean p1, v7, La/yrt;->k:Z

    .line 53
    .line 54
    iget v1, v7, La/yrt;->i:I

    .line 55
    .line 56
    iget-object v4, v7, La/yrt;->j:La/fhj;

    .line 57
    .line 58
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object v8, v4

    .line 62
    move v4, p1

    .line 63
    move p1, v1

    .line 64
    move-object v1, v8

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p2, p0, La/zrt;->d:La/epc;

    .line 70
    .line 71
    invoke-virtual {p2}, La/epc;->a()La/hr4;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    iget-boolean p2, p2, La/hr4;->a:Z

    .line 76
    .line 77
    iget-object v1, p0, La/zrt;->a:La/fhj;

    .line 78
    .line 79
    iput-object v1, v7, La/yrt;->j:La/fhj;

    .line 80
    .line 81
    iput p1, v7, La/yrt;->i:I

    .line 82
    .line 83
    iput-boolean p2, v7, La/yrt;->k:Z

    .line 84
    .line 85
    iput v4, v7, La/yrt;->n:I

    .line 86
    .line 87
    iget-object v4, p0, La/zrt;->b:La/pmi;

    .line 88
    .line 89
    invoke-virtual {v4, v7}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    if-ne v4, v0, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move-object v8, v4

    .line 97
    move v4, p2

    .line 98
    move-object p2, v8

    .line 99
    :goto_2
    check-cast p2, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    sget-object v5, La/sub0;->b:La/nh70;

    .line 106
    .line 107
    iget-object v6, p0, La/zrt;->c:La/kqc;

    .line 108
    .line 109
    invoke-virtual {v6}, La/kqc;->a()La/sub0;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v6}, La/nh70;->j(La/sub0;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    iget-object p0, p0, La/zrt;->e:La/pru;

    .line 121
    .line 122
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    iget-object p0, p0, La/sff0;->d:La/q1w0;

    .line 127
    .line 128
    iget-boolean v6, p0, La/q1w0;->b:Z

    .line 129
    .line 130
    iput-object v2, v7, La/yrt;->j:La/fhj;

    .line 131
    .line 132
    iput p1, v7, La/yrt;->i:I

    .line 133
    .line 134
    iput v3, v7, La/yrt;->n:I

    .line 135
    .line 136
    move v2, p1

    .line 137
    move v3, p2

    .line 138
    invoke-virtual/range {v1 .. v7}, La/fhj;->v(IIZZZLa/zje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-ne p0, v0, :cond_5

    .line 143
    .line 144
    :goto_3
    return-object v0

    .line 145
    :cond_5
    return-object p0
.end method
