.class public final La/i0j0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/gle0;

.field public final p:La/azt;

.field public final q:La/yo4;

.field public final r:La/i1w0;

.field public final s:La/je;


# direct methods
.method public constructor <init>(La/vzg0;La/gle0;La/k7u;La/azt;La/yo4;La/i1w0;La/mne;La/je;La/ctf0;)V
    .locals 2

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p7, p7, La/mne;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {p7, p7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 7
    .line 8
    .line 9
    move-result-object p7

    .line 10
    new-instance v0, La/rai0;

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-direct {v0, p3, v1}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance p3, La/h0j0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p3, p9, v1}, La/h0j0;-><init>(La/ctf0;B)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1, v0, p7, p3}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;La/g090;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, La/i0j0;->o:La/gle0;

    .line 27
    .line 28
    iput-object p4, p0, La/i0j0;->p:La/azt;

    .line 29
    .line 30
    iput-object p5, p0, La/i0j0;->q:La/yo4;

    .line 31
    .line 32
    iput-object p6, p0, La/i0j0;->r:La/i1w0;

    .line 33
    .line 34
    iput-object p8, p0, La/i0j0;->s:La/je;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/b0j0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/yzi0;->a:La/yzi0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, La/i0j0;->r:La/i1w0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, La/c8d;

    .line 21
    .line 22
    sget-object v0, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p0, p1, v1, p0, v0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    move-object p1, p0

    .line 35
    check-cast p1, La/paw;

    .line 36
    .line 37
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, La/oe50;

    .line 48
    .line 49
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    instance-of v0, p1, La/zzi0;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    check-cast p1, La/zzi0;

    .line 58
    .line 59
    iget-object p1, p1, La/zzi0;->a:La/jvn;

    .line 60
    .line 61
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/f0j0;

    .line 66
    .line 67
    iget-object v0, v0, La/f0j0;->a:La/jvn;

    .line 68
    .line 69
    if-eq p1, v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {p1}, La/jvn;->a()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, La/i0j0;->q:La/yo4;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v1, v1, La/yo4;->a:La/kt2;

    .line 81
    .line 82
    const-string v2, "acc_settings_coeff_set"

    .line 83
    .line 84
    const-string v3, "option"

    .line 85
    .line 86
    invoke-static {v3, v0, v1, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, La/jvn;->a()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, p0, La/i0j0;->s:La/je;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v1, v1, La/je;->a:La/s1p;

    .line 99
    .line 100
    const-wide/16 v2, 0xcd7

    .line 101
    .line 102
    invoke-static {v0, v1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, La/i0j0;->p:La/azt;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, La/azt;->a:La/uzc;

    .line 111
    .line 112
    iget-object v0, v0, La/uzc;->a:La/q7d0;

    .line 113
    .line 114
    const-string v1, "COEF_TYPE_ID"

    .line 115
    .line 116
    invoke-virtual {p1}, La/jvn;->getId()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-virtual {v0, v2, v1}, La/q7d0;->e(ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 124
    .line 125
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 126
    .line 127
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-object v2, v1

    .line 135
    check-cast v2, La/f0j0;

    .line 136
    .line 137
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object v2, v2, La/f0j0;->b:Ljava/util/List;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v3, La/f0j0;

    .line 148
    .line 149
    invoke-direct {v3, p1, v2}, La/f0j0;-><init>(La/jvn;Ljava/util/List;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_1

    .line 157
    .line 158
    :cond_2
    return-void

    .line 159
    :cond_3
    sget-object v0, La/a0j0;->a:La/a0j0;

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_4

    .line 166
    .line 167
    new-instance p1, La/rai0;

    .line 168
    .line 169
    const/16 v0, 0x9

    .line 170
    .line 171
    invoke-direct {p1, p0, v0}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_4
    sget-object v0, La/xzi0;->a:La/xzi0;

    .line 179
    .line 180
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_5

    .line 185
    .line 186
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 191
    .line 192
    .line 193
    return-void
.end method
