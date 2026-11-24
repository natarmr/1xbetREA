.class public final La/j68;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/dbu;

.field public final c:La/krc;

.field public final d:La/gu00;

.field public final e:La/myg0;

.field public final f:La/pmi0;

.field public final g:La/zpu;

.field public final h:La/i1w0;

.field public final i:La/bh3;

.field public final j:La/p7m0;

.field public final k:La/ol60;


# direct methods
.method public constructor <init>(La/dbu;La/krc;La/gu00;La/myg0;La/pmi0;La/zpu;La/i1w0;La/bh3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/j68;->b:La/dbu;

    .line 5
    .line 6
    iput-object p2, p0, La/j68;->c:La/krc;

    .line 7
    .line 8
    iput-object p3, p0, La/j68;->d:La/gu00;

    .line 9
    .line 10
    iput-object p4, p0, La/j68;->e:La/myg0;

    .line 11
    .line 12
    iput-object p5, p0, La/j68;->f:La/pmi0;

    .line 13
    .line 14
    iput-object p6, p0, La/j68;->g:La/zpu;

    .line 15
    .line 16
    iput-object p7, p0, La/j68;->h:La/i1w0;

    .line 17
    .line 18
    iput-object p8, p0, La/j68;->i:La/bh3;

    .line 19
    .line 20
    new-instance p1, La/x58;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-direct {p1, p2}, La/x58;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/j68;->j:La/p7m0;

    .line 31
    .line 32
    new-instance p1, La/ol60;

    .line 33
    .line 34
    const/4 p2, 0x3

    .line 35
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, La/j68;->k:La/ol60;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 1

    .line 1
    sget-object v0, La/lwf;->d:La/lwf;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/j68;->w(La/w58;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w(La/w58;)V
    .locals 6

    .line 1
    sget-object v0, La/gqw0;->q:La/gqw0;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "biometrics_passed"

    .line 8
    .line 9
    const-string v2, "FINGER_LOCK"

    .line 10
    .line 11
    iget-object v3, p0, La/j68;->f:La/pmi0;

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, v3, La/pmi0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La/a1d;

    .line 20
    .line 21
    iget-object p1, p1, La/a1d;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, La/xwb0;

    .line 24
    .line 25
    invoke-virtual {p1, v1, v5}, La/xwb0;->a(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/j68;->d:La/gu00;

    .line 29
    .line 30
    iget-object p0, p0, La/gu00;->a:La/a1d;

    .line 31
    .line 32
    iget-object p0, p0, La/a1d;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/xwb0;

    .line 35
    .line 36
    invoke-virtual {p0, v2, v4}, La/xwb0;->a(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    sget-object v0, La/lwf;->d:La/lwf;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object p0, p0, La/j68;->e:La/myg0;

    .line 49
    .line 50
    iget-object p0, p0, La/myg0;->a:La/a1d;

    .line 51
    .line 52
    iget-object p0, p0, La/a1d;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/xwb0;

    .line 55
    .line 56
    invoke-virtual {p0, v2, v5}, La/xwb0;->a(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    sget-object v0, La/rv00;->d:La/rv00;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, La/j68;->k:La/ol60;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    iget-object p1, p0, La/j68;->b:La/dbu;

    .line 71
    .line 72
    iget-object p1, p1, La/dbu;->a:La/a1d;

    .line 73
    .line 74
    iget-object p1, p1, La/a1d;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, La/xwb0;

    .line 77
    .line 78
    iget-object p1, p1, La/xwb0;->c:La/n0o0;

    .line 79
    .line 80
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Landroid/content/SharedPreferences;

    .line 85
    .line 86
    const-string v0, "fingerprint_enabled"

    .line 87
    .line 88
    invoke-interface {p1, v0, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    iget-object p1, p0, La/j68;->g:La/zpu;

    .line 95
    .line 96
    invoke-virtual {p1}, La/zpu;->l()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    move v4, v5

    .line 104
    :goto_0
    new-instance p1, La/x58;

    .line 105
    .line 106
    invoke-direct {p1, v4}, La/x58;-><init>(Z)V

    .line 107
    .line 108
    .line 109
    iget-object p0, p0, La/j68;->j:La/p7m0;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    if-eqz v4, :cond_5

    .line 119
    .line 120
    sget-object p0, La/h68;->a:La/h68;

    .line 121
    .line 122
    invoke-virtual {v2, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    instance-of v0, p1, La/v58;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    check-cast p1, La/v58;

    .line 131
    .line 132
    iget-object p1, p1, La/v58;->a:Ljava/lang/String;

    .line 133
    .line 134
    iget-object p0, p0, La/j68;->c:La/krc;

    .line 135
    .line 136
    invoke-virtual {p0}, La/krc;->a()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    new-instance p1, La/g68;

    .line 145
    .line 146
    invoke-direct {p1, p0}, La/g68;-><init>(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_4
    sget-object v0, La/m2a;->e:La/m2a;

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_6

    .line 160
    .line 161
    iget-object p1, v3, La/pmi0;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p1, La/a1d;

    .line 164
    .line 165
    iget-object p1, p1, La/a1d;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, La/xwb0;

    .line 168
    .line 169
    invoke-virtual {p1, v1, v4}, La/xwb0;->a(Ljava/lang/String;Z)V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, La/j68;->h:La/i1w0;

    .line 173
    .line 174
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object p0, p0, La/j68;->i:La/bh3;

    .line 179
    .line 180
    invoke-virtual {p0}, La/bh3;->a()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    new-instance v1, La/y0w0;

    .line 185
    .line 186
    invoke-direct {v1, p0}, La/y0w0;-><init>(La/m7h0;)V

    .line 187
    .line 188
    .line 189
    new-instance p0, La/c8d;

    .line 190
    .line 191
    sget-object v2, La/y7d;->a:La/v7d;

    .line 192
    .line 193
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v0, p0, p1, v0, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    :goto_1
    move-object v0, p0

    .line 201
    check-cast v0, La/paw;

    .line 202
    .line 203
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_5

    .line 208
    .line 209
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, La/oe50;

    .line 214
    .line 215
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_5
    return-void

    .line 220
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 221
    .line 222
    .line 223
    return-void
.end method
