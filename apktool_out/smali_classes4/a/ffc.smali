.class public final La/ffc;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/atu;

.field public final p:La/ugf0;

.field public final q:La/i1w0;

.field public final r:La/iqt;

.field public final s:La/pmi0;


# direct methods
.method public constructor <init>(La/vzg0;La/atu;La/ugf0;La/ctf0;La/i1w0;La/iqt;La/pmi0;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/zxb;

    .line 5
    .line 6
    const/16 p1, 0xa

    .line 7
    .line 8
    invoke-direct {v2, p1}, La/zxb;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/ep4;

    .line 12
    .line 13
    const/16 p1, 0x12

    .line 14
    .line 15
    invoke-direct {v3, p4, p1}, La/ep4;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p8, La/mne;->a:La/rwj;

    .line 19
    .line 20
    invoke-static {p1, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v1, 0x0

    .line 26
    move-object v0, p0

    .line 27
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, v0, La/ffc;->o:La/atu;

    .line 31
    .line 32
    iput-object p3, v0, La/ffc;->p:La/ugf0;

    .line 33
    .line 34
    iput-object p5, v0, La/ffc;->q:La/i1w0;

    .line 35
    .line 36
    iput-object p6, v0, La/ffc;->r:La/iqt;

    .line 37
    .line 38
    iput-object p7, v0, La/ffc;->s:La/pmi0;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, La/zec;

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
    sget-object v0, La/vec;->a:La/vec;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v2, p0, La/ffc;->q:La/i1w0;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, La/ffc;->r:La/iqt;

    .line 21
    .line 22
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 23
    .line 24
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p0, p0, La/ffc;->s:La/pmi0;

    .line 35
    .line 36
    invoke-static {p0, v1}, La/pmi0;->b(La/pmi0;Z)Lorg/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, La/q0w0;

    .line 41
    .line 42
    invoke-direct {v0, p0}, La/q0w0;-><init>(La/m7h0;)V

    .line 43
    .line 44
    .line 45
    new-instance p0, La/c8d;

    .line 46
    .line 47
    sget-object v3, La/y7d;->a:La/v7d;

    .line 48
    .line 49
    invoke-direct {p0, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p0, v2, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :goto_0
    move-object p1, p0

    .line 57
    check-cast p1, La/paw;

    .line 58
    .line 59
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, La/oe50;

    .line 70
    .line 71
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    sget-object v4, La/efc;->a:La/efc;

    .line 80
    .line 81
    new-instance v7, La/wib;

    .line 82
    .line 83
    const/4 p1, 0x6

    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-direct {v7, p0, v0, p1}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 86
    .line 87
    .line 88
    const/16 v8, 0xe

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_1
    sget-object v0, La/wec;->a:La/wec;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    instance-of v0, p1, La/yec;

    .line 105
    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    check-cast p1, La/yec;

    .line 109
    .line 110
    iget-object p1, p1, La/yec;->a:La/e1q0;

    .line 111
    .line 112
    iget-object v0, p1, La/e1q0;->a:Ljava/lang/String;

    .line 113
    .line 114
    iget-object p1, p1, La/e1q0;->b:Ljava/lang/String;

    .line 115
    .line 116
    iget-object p0, p0, La/ffc;->p:La/ugf0;

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object p0, p0, La/ugf0;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, La/g1q0;

    .line 130
    .line 131
    new-instance v3, La/d1q0;

    .line 132
    .line 133
    invoke-direct {v3, v0, p1}, La/d1q0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, La/g1q0;->a:La/a1q0;

    .line 140
    .line 141
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iput-object v3, p0, La/a1q0;->c:La/d1q0;

    .line 145
    .line 146
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    new-instance p1, La/c8d;

    .line 151
    .line 152
    sget-object v0, La/y7d;->a:La/v7d;

    .line 153
    .line 154
    sget-object v3, La/n0w0;->a:La/n0w0;

    .line 155
    .line 156
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p0, p1}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    sget-object v0, La/wez;->b:La/wez;

    .line 164
    .line 165
    invoke-static {v0, p1, v2, p0, v1}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    :goto_1
    move-object p1, p0

    .line 170
    check-cast p1, La/paw;

    .line 171
    .line 172
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_4

    .line 177
    .line 178
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, La/oe50;

    .line 183
    .line 184
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_2
    sget-object p0, La/xec;->a:La/xec;

    .line 189
    .line 190
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    if-eqz p0, :cond_3

    .line 195
    .line 196
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    new-instance p1, La/c8d;

    .line 201
    .line 202
    sget-object v0, La/y7d;->a:La/v7d;

    .line 203
    .line 204
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 205
    .line 206
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 207
    .line 208
    .line 209
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    :goto_2
    move-object p1, p0

    .line 214
    check-cast p1, La/paw;

    .line 215
    .line 216
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_4

    .line 221
    .line 222
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    check-cast p1, La/oe50;

    .line 227
    .line 228
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 233
    .line 234
    .line 235
    :cond_4
    return-void
.end method
