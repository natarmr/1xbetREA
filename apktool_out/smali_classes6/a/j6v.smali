.class public final La/j6v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h3v0;

.field public final b:La/scu;

.field public final c:La/ntu;

.field public final d:La/ipu;


# direct methods
.method public constructor <init>(La/h3v0;La/scu;La/ntu;La/ipu;)V
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
    iput-object p1, p0, La/j6v;->a:La/h3v0;

    .line 8
    .line 9
    iput-object p2, p0, La/j6v;->b:La/scu;

    .line 10
    .line 11
    iput-object p3, p0, La/j6v;->c:La/ntu;

    .line 12
    .line 13
    iput-object p4, p0, La/j6v;->d:La/ipu;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/ql5;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/i6v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/i6v;

    .line 7
    .line 8
    iget v1, v0, La/i6v;->n:I

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
    iput v1, v0, La/i6v;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/i6v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/i6v;-><init>(La/j6v;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/i6v;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/i6v;->n:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v6, :cond_2

    .line 38
    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    iget-boolean p0, v0, La/i6v;->k:Z

    .line 42
    .line 43
    iget p1, v0, La/i6v;->j:I

    .line 44
    .line 45
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    iget-object p1, v0, La/i6v;->i:La/ql5;

    .line 56
    .line 57
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p2, p0, La/j6v;->a:La/h3v0;

    .line 65
    .line 66
    iget-object p2, p2, La/h3v0;->b:La/s2v0;

    .line 67
    .line 68
    iget-wide v7, p2, La/s2v0;->a:J

    .line 69
    .line 70
    iget-object p2, p0, La/j6v;->c:La/ntu;

    .line 71
    .line 72
    invoke-virtual {p2}, La/ntu;->a()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iput-object p1, v0, La/i6v;->i:La/ql5;

    .line 77
    .line 78
    iput v6, v0, La/i6v;->n:I

    .line 79
    .line 80
    iget-object v2, p0, La/j6v;->b:La/scu;

    .line 81
    .line 82
    invoke-virtual {v2, v7, v8, v0, p2}, La/scu;->a(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-ne p2, v1, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    :goto_1
    check-cast p2, La/pbv;

    .line 90
    .line 91
    iget-boolean p2, p2, La/pbv;->h:Z

    .line 92
    .line 93
    if-nez p2, :cond_5

    .line 94
    .line 95
    iget-object p2, p1, La/ql5;->i:La/txs0;

    .line 96
    .line 97
    invoke-virtual {p2}, La/txs0;->d()Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_5

    .line 102
    .line 103
    move p2, v6

    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move p2, v4

    .line 106
    :goto_2
    iget-object p1, p1, La/ql5;->i:La/txs0;

    .line 107
    .line 108
    invoke-virtual {p1}, La/txs0;->a()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    iput-object v3, v0, La/i6v;->i:La/ql5;

    .line 113
    .line 114
    iput p2, v0, La/i6v;->j:I

    .line 115
    .line 116
    iput-boolean p1, v0, La/i6v;->k:Z

    .line 117
    .line 118
    iput v5, v0, La/i6v;->n:I

    .line 119
    .line 120
    iget-object p0, p0, La/j6v;->d:La/ipu;

    .line 121
    .line 122
    invoke-virtual {p0, v0}, La/ipu;->a(La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v1, :cond_6

    .line 127
    .line 128
    :goto_3
    return-object v1

    .line 129
    :cond_6
    move v9, p2

    .line 130
    move-object p2, p0

    .line 131
    move p0, p1

    .line 132
    move p1, v9

    .line 133
    :goto_4
    check-cast p2, Ljava/lang/Iterable;

    .line 134
    .line 135
    new-instance v0, Ljava/util/ArrayList;

    .line 136
    .line 137
    const/16 v1, 0xa

    .line 138
    .line 139
    invoke-static {p2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_7

    .line 155
    .line 156
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, La/tq60;

    .line 161
    .line 162
    iget-object v1, v1, La/tq60;->b:La/d270;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    sget-object p2, La/d270;->d:La/d270;

    .line 169
    .line 170
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-nez p1, :cond_8

    .line 175
    .line 176
    if-nez p0, :cond_8

    .line 177
    .line 178
    if-eqz p2, :cond_8

    .line 179
    .line 180
    move v4, v6

    .line 181
    :cond_8
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0
.end method
