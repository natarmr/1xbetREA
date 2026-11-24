.class public final La/v93;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/hzg;

.field public final p:La/e1u;

.field public final q:La/oeg0;

.field public final r:La/vqc;


# direct methods
.method public constructor <init>(La/mne;La/hzg;La/e1u;La/oeg0;La/vqc;)V
    .locals 3

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/mne;->c:La/vs10;

    .line 5
    .line 6
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 7
    .line 8
    invoke-static {v0, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, La/f33;

    .line 13
    .line 14
    const/4 v1, 0x6

    .line 15
    invoke-direct {v0, v1}, La/f33;-><init>(B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/sy2;

    .line 19
    .line 20
    const/16 v2, 0x11

    .line 21
    .line 22
    invoke-direct {v1, v2}, La/sy2;-><init>(B)V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {p0, v0, p1, v1, v2}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, La/v93;->o:La/hzg;

    .line 30
    .line 31
    iput-object p3, p0, La/v93;->p:La/e1u;

    .line 32
    .line 33
    iput-object p4, p0, La/v93;->q:La/oeg0;

    .line 34
    .line 35
    iput-object p5, p0, La/v93;->r:La/vqc;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/o93;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/m93;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/v93;->o:La/hzg;

    .line 14
    .line 15
    check-cast p0, La/uzg;

    .line 16
    .line 17
    invoke-virtual {p0}, La/uzg;->a()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    instance-of v0, p1, La/l93;

    .line 22
    .line 23
    if-eqz v0, :cond_8

    .line 24
    .line 25
    move-object v3, p1

    .line 26
    check-cast v3, La/l93;

    .line 27
    .line 28
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/s93;

    .line 33
    .line 34
    iget-object p1, p1, La/s93;->a:La/new;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object p1, p1, La/new;->b:Ljava/util/List;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    move-object v2, v1

    .line 58
    check-cast v2, La/vcw;

    .line 59
    .line 60
    iget-wide v4, v2, La/vcw;->a:J

    .line 61
    .line 62
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, La/s93;

    .line 67
    .line 68
    iget-wide v6, v2, La/s93;->c:J

    .line 69
    .line 70
    cmp-long v2, v4, v6

    .line 71
    .line 72
    if-nez v2, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    move-object v1, v0

    .line 76
    :goto_0
    check-cast v1, La/vcw;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object v1, v0

    .line 80
    :goto_1
    if-eqz v1, :cond_6

    .line 81
    .line 82
    iget-object p1, v1, La/vcw;->c:Ljava/util/List;

    .line 83
    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v2, v1

    .line 101
    check-cast v2, La/jdw;

    .line 102
    .line 103
    iget-wide v4, v2, La/jdw;->a:J

    .line 104
    .line 105
    iget-wide v6, v3, La/l93;->a:J

    .line 106
    .line 107
    cmp-long v2, v4, v6

    .line 108
    .line 109
    if-nez v2, :cond_4

    .line 110
    .line 111
    move-object v0, v1

    .line 112
    :cond_5
    check-cast v0, La/jdw;

    .line 113
    .line 114
    :cond_6
    if-eqz v0, :cond_7

    .line 115
    .line 116
    iget-wide v0, v0, La/jdw;->c:J

    .line 117
    .line 118
    :goto_2
    move-wide v4, v0

    .line 119
    goto :goto_3

    .line 120
    :cond_7
    const-wide/16 v0, 0x0

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_3
    iget-object p1, p0, La/v93;->q:La/oeg0;

    .line 124
    .line 125
    invoke-virtual {p1}, La/oeg0;->c()La/i1w0;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-instance v1, La/mz0;

    .line 130
    .line 131
    const/4 v6, 0x5

    .line 132
    move-object v2, p0

    .line 133
    invoke-direct/range {v1 .. v6}, La/mz0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_8
    move-object v2, p0

    .line 141
    instance-of p0, p1, La/n93;

    .line 142
    .line 143
    if-eqz p0, :cond_a

    .line 144
    .line 145
    check-cast p1, La/n93;

    .line 146
    .line 147
    iget-object p0, v2, La/v93;->p:La/e1u;

    .line 148
    .line 149
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p0, La/pew;

    .line 152
    .line 153
    iget-object p0, p0, La/pew;->b:La/mew;

    .line 154
    .line 155
    iget-object p0, p0, La/mew;->b:La/or30;

    .line 156
    .line 157
    invoke-virtual {p0}, La/or30;->b()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, La/new;

    .line 162
    .line 163
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 164
    .line 165
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 166
    .line 167
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-object v3, v1

    .line 175
    check-cast v3, La/s93;

    .line 176
    .line 177
    iget-object v4, v2, La/i3t0;->f:La/oyg0;

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-wide v4, p1, La/n93;->a:J

    .line 183
    .line 184
    iget-object v3, v3, La/s93;->b:La/da10;

    .line 185
    .line 186
    new-instance v6, La/s93;

    .line 187
    .line 188
    invoke-direct {v6, p0, v3, v4, v5}, La/s93;-><init>(La/new;La/da10;J)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_9

    .line 196
    .line 197
    return-void

    .line 198
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 199
    .line 200
    .line 201
    return-void
.end method
