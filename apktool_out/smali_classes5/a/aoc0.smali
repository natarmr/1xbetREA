.class public final synthetic La/aoc0;
.super La/xo;
.source "SourceFile"

# interfaces
.implements La/xdr;


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, La/gfe;

    .line 2
    .line 3
    check-cast p2, La/gfe;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/doc0;

    .line 10
    .line 11
    iget-object p3, p0, La/doc0;->v:La/xae0;

    .line 12
    .line 13
    iget-object p3, p3, La/xae0;->a:La/n7m0;

    .line 14
    .line 15
    invoke-interface {p3}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0}, La/doc0;->w()La/lc00;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, La/doc0;->k:La/ctf0;

    .line 26
    .line 27
    iget-object v2, p0, La/doc0;->l:La/yfu;

    .line 28
    .line 29
    invoke-virtual {v2}, La/yfu;->j()V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/doc0;->o:La/qho;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    new-array v2, v2, [La/gfe;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    aput-object p1, v2, v3

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    aput-object p2, v2, v3

    .line 60
    .line 61
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v3, La/dfe;->a:La/dfe;

    .line 66
    .line 67
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_0
    invoke-static {p3, p1, v1, v0}, La/fww;->x(Ljava/util/List;La/gfe;La/ctf0;Ljava/util/List;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    instance-of p3, p2, La/afe;

    .line 80
    .line 81
    if-eqz p3, :cond_4

    .line 82
    .line 83
    check-cast p2, La/afe;

    .line 84
    .line 85
    iget-object p2, p2, La/afe;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Iterable;

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-eqz p3, :cond_1

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    check-cast p3, La/etc0;

    .line 104
    .line 105
    iget-object v0, p3, La/etc0;->b:La/zuc0;

    .line 106
    .line 107
    iget-object p3, p3, La/etc0;->d:La/soc0;

    .line 108
    .line 109
    invoke-static {p3}, La/g1x;->E(La/soc0;)La/gtc0;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    const-string v1, ""

    .line 114
    .line 115
    invoke-static {p1, v0, p3, v1, p0}, La/fww;->H(Ljava/util/List;La/zuc0;La/gtc0;Ljava/lang/String;La/qho;)Ljava/util/ArrayList;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    goto :goto_0

    .line 120
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_3

    .line 134
    .line 135
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    move-object p3, p2

    .line 140
    check-cast p3, La/p6t0;

    .line 141
    .line 142
    instance-of p3, p3, La/htc0;

    .line 143
    .line 144
    if-nez p3, :cond_2

    .line 145
    .line 146
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    return-object p0

    .line 151
    :cond_4
    sget-object p0, La/yee;->a:La/yee;

    .line 152
    .line 153
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_8

    .line 158
    .line 159
    new-instance p0, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-eqz p2, :cond_7

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    move-object p3, p2

    .line 179
    check-cast p3, La/p6t0;

    .line 180
    .line 181
    instance-of v0, p3, La/ptc0;

    .line 182
    .line 183
    if-nez v0, :cond_5

    .line 184
    .line 185
    instance-of p3, p3, La/htc0;

    .line 186
    .line 187
    if-eqz p3, :cond_6

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_7
    return-object p0

    .line 195
    :cond_8
    :goto_3
    return-object v0
.end method
