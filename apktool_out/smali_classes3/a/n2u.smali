.class public final La/n2u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j2u;

.field public final b:La/o8u;

.field public final c:La/pmi;

.field public final d:La/epc;

.field public final e:La/kqc;

.field public final f:La/pru;


# direct methods
.method public constructor <init>(La/j2u;La/o8u;La/pmi;La/epc;La/kqc;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/n2u;->a:La/j2u;

    .line 8
    .line 9
    iput-object p2, p0, La/n2u;->b:La/o8u;

    .line 10
    .line 11
    iput-object p3, p0, La/n2u;->c:La/pmi;

    .line 12
    .line 13
    iput-object p4, p0, La/n2u;->d:La/epc;

    .line 14
    .line 15
    iput-object p5, p0, La/n2u;->e:La/kqc;

    .line 16
    .line 17
    iput-object p6, p0, La/n2u;->f:La/pru;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/m2u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/m2u;

    .line 7
    .line 8
    iget v1, v0, La/m2u;->m:I

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
    iput v1, v0, La/m2u;->m:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/m2u;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/m2u;-><init>(La/n2u;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v7, La/m2u;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/m2u;->m:I

    .line 32
    .line 33
    const/4 v8, 0x3

    .line 34
    const/4 v2, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v9, 0x0

    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    if-eq v1, v3, :cond_3

    .line 40
    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    if-ne v1, v8, :cond_1

    .line 44
    .line 45
    iget-object p0, v7, La/m2u;->i:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v9

    .line 57
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    iget-object p1, v7, La/m2u;->j:Ljava/util/List;

    .line 62
    .line 63
    iget-object v1, v7, La/m2u;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/j2u;

    .line 66
    .line 67
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, La/n2u;->a:La/j2u;

    .line 75
    .line 76
    iput-object v1, v7, La/m2u;->i:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p1, v7, La/m2u;->j:Ljava/util/List;

    .line 79
    .line 80
    iput v3, v7, La/m2u;->m:I

    .line 81
    .line 82
    iget-object p2, p0, La/n2u;->c:La/pmi;

    .line 83
    .line 84
    invoke-virtual {p2, v7}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-ne p2, v0, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    :goto_2
    check-cast p2, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    iget-object p2, p0, La/n2u;->d:La/epc;

    .line 98
    .line 99
    invoke-virtual {p2}, La/epc;->a()La/hr4;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    iget-boolean v4, p2, La/hr4;->a:Z

    .line 104
    .line 105
    sget-object p2, La/sub0;->b:La/nh70;

    .line 106
    .line 107
    iget-object v5, p0, La/n2u;->e:La/kqc;

    .line 108
    .line 109
    invoke-virtual {v5}, La/kqc;->a()La/sub0;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v5}, La/nh70;->j(La/sub0;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    iget-object p2, p0, La/n2u;->f:La/pru;

    .line 121
    .line 122
    invoke-virtual {p2}, La/pru;->a()La/sff0;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    iget-object p2, p2, La/sff0;->d:La/q1w0;

    .line 127
    .line 128
    iget-boolean v6, p2, La/q1w0;->b:Z

    .line 129
    .line 130
    iput-object v9, v7, La/m2u;->i:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v9, v7, La/m2u;->j:Ljava/util/List;

    .line 133
    .line 134
    iput v2, v7, La/m2u;->m:I

    .line 135
    .line 136
    move-object v2, p1

    .line 137
    invoke-virtual/range {v1 .. v7}, La/j2u;->a(Ljava/util/List;IZZZLa/zje;)Ljava/io/Serializable;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    if-ne p2, v0, :cond_6

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_6
    :goto_3
    move-object p1, p2

    .line 145
    check-cast p1, Ljava/util/List;

    .line 146
    .line 147
    iput-object p2, v7, La/m2u;->i:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v9, v7, La/m2u;->j:Ljava/util/List;

    .line 150
    .line 151
    iput v8, v7, La/m2u;->m:I

    .line 152
    .line 153
    iget-object p0, p0, La/n2u;->b:La/o8u;

    .line 154
    .line 155
    iget-object p0, p0, La/o8u;->a:La/b2g;

    .line 156
    .line 157
    iget-object p0, p0, La/b2g;->a:La/ehf0;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p0, La/or30;

    .line 165
    .line 166
    invoke-virtual {p0, p1}, La/or30;->d(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    if-ne p0, v0, :cond_7

    .line 172
    .line 173
    :goto_4
    return-object v0

    .line 174
    :cond_7
    return-object p2
.end method
