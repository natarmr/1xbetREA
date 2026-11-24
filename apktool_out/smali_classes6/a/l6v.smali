.class public final La/l6v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h3v0;

.field public final b:La/scu;

.field public final c:La/ntu;

.field public final d:La/pru;


# direct methods
.method public constructor <init>(La/h3v0;La/scu;La/ntu;La/pru;)V
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
    iput-object p1, p0, La/l6v;->a:La/h3v0;

    .line 8
    .line 9
    iput-object p2, p0, La/l6v;->b:La/scu;

    .line 10
    .line 11
    iput-object p3, p0, La/l6v;->c:La/ntu;

    .line 12
    .line 13
    iput-object p4, p0, La/l6v;->d:La/pru;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/ql5;La/csr;ZZLa/zje;)Ljava/lang/Enum;
    .locals 6

    .line 1
    instance-of v0, p5, La/k6v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/k6v;

    .line 7
    .line 8
    iget v1, v0, La/k6v;->o:I

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
    iput v1, v0, La/k6v;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/k6v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/k6v;-><init>(La/l6v;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/k6v;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/k6v;->o:I

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
    iget-boolean p4, v0, La/k6v;->l:Z

    .line 37
    .line 38
    iget-boolean p3, v0, La/k6v;->k:Z

    .line 39
    .line 40
    iget-object p2, v0, La/k6v;->j:La/csr;

    .line 41
    .line 42
    iget-object p1, v0, La/k6v;->i:La/ql5;

    .line 43
    .line 44
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p5, p0, La/l6v;->a:La/h3v0;

    .line 59
    .line 60
    iget-object p5, p5, La/h3v0;->b:La/s2v0;

    .line 61
    .line 62
    iget-wide v4, p5, La/s2v0;->a:J

    .line 63
    .line 64
    iget-object p5, p0, La/l6v;->c:La/ntu;

    .line 65
    .line 66
    invoke-virtual {p5}, La/ntu;->a()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p5

    .line 70
    iput-object p1, v0, La/k6v;->i:La/ql5;

    .line 71
    .line 72
    iput-object p2, v0, La/k6v;->j:La/csr;

    .line 73
    .line 74
    iput-boolean p3, v0, La/k6v;->k:Z

    .line 75
    .line 76
    iput-boolean p4, v0, La/k6v;->l:Z

    .line 77
    .line 78
    iput v3, v0, La/k6v;->o:I

    .line 79
    .line 80
    iget-object v2, p0, La/l6v;->b:La/scu;

    .line 81
    .line 82
    invoke-virtual {v2, v4, v5, v0, p5}, La/scu;->a(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p5

    .line 86
    if-ne p5, v1, :cond_3

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    :goto_1
    check-cast p5, La/pbv;

    .line 90
    .line 91
    iget-object p0, p0, La/l6v;->d:La/pru;

    .line 92
    .line 93
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget-object p0, p0, La/sff0;->d:La/q1w0;

    .line 98
    .line 99
    iget-object p0, p0, La/q1w0;->a:La/dyv0;

    .line 100
    .line 101
    iget-boolean p0, p0, La/dyv0;->g:Z

    .line 102
    .line 103
    iget-object v0, p2, La/csr;->a:La/bsr;

    .line 104
    .line 105
    iget-object v0, v0, La/bsr;->a:La/esr;

    .line 106
    .line 107
    invoke-virtual {v0}, La/esr;->b()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    if-nez p0, :cond_4

    .line 114
    .line 115
    sget-object p0, La/w870;->g:La/w870;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_4
    if-eqz p4, :cond_5

    .line 119
    .line 120
    sget-object p0, La/w870;->a:La/w870;

    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_5
    iget-object p0, p1, La/ql5;->i:La/txs0;

    .line 124
    .line 125
    invoke-virtual {p0}, La/txs0;->f()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    sget-object p0, La/w870;->b:La/w870;

    .line 132
    .line 133
    return-object p0

    .line 134
    :cond_6
    iget-boolean p1, p5, La/pbv;->i:Z

    .line 135
    .line 136
    if-nez p1, :cond_7

    .line 137
    .line 138
    invoke-virtual {p0}, La/txs0;->a()Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    sget-object p0, La/w870;->c:La/w870;

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_7
    if-eqz p3, :cond_8

    .line 148
    .line 149
    invoke-virtual {p2}, La/csr;->a()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-nez p1, :cond_8

    .line 154
    .line 155
    sget-object p0, La/w870;->f:La/w870;

    .line 156
    .line 157
    return-object p0

    .line 158
    :cond_8
    invoke-virtual {p2}, La/csr;->a()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_9

    .line 163
    .line 164
    invoke-virtual {p0}, La/txs0;->a()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_9

    .line 169
    .line 170
    sget-object p0, La/w870;->e:La/w870;

    .line 171
    .line 172
    return-object p0

    .line 173
    :cond_9
    iget-boolean p1, p5, La/pbv;->h:Z

    .line 174
    .line 175
    if-nez p1, :cond_a

    .line 176
    .line 177
    invoke-virtual {p0}, La/txs0;->d()Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_a

    .line 182
    .line 183
    invoke-virtual {p2}, La/csr;->a()Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-nez p0, :cond_a

    .line 188
    .line 189
    sget-object p0, La/w870;->d:La/w870;

    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_a
    sget-object p0, La/w870;->h:La/w870;

    .line 193
    .line 194
    return-object p0
.end method
