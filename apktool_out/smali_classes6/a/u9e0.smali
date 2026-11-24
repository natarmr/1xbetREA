.class public final La/u9e0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:La/i1w0;

.field public final p:La/m1e;

.field public final q:La/x4u;

.field public final r:La/uxs0;

.field public s:La/c4m0;

.field public t:La/bby;


# direct methods
.method public constructor <init>(La/i1w0;La/m1e;La/x4u;La/pru;La/g2v;La/ctf0;La/uxs0;La/mne;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p8, p8, La/mne;->a:La/rwj;

    .line 8
    .line 9
    invoke-static {p8, p8}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 10
    .line 11
    .line 12
    move-result-object p8

    .line 13
    new-instance v0, La/p2e0;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p4, v1}, La/p2e0;-><init>(La/pru;B)V

    .line 17
    .line 18
    .line 19
    new-instance p4, La/o20;

    .line 20
    .line 21
    const/16 v1, 0x17

    .line 22
    .line 23
    invoke-direct {p4, p5, p6, v1}, La/o20;-><init>(La/g2v;La/ctf0;B)V

    .line 24
    .line 25
    .line 26
    const/4 p5, 0x0

    .line 27
    invoke-direct {p0, v0, p8, p4, p5}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/u9e0;->o:La/i1w0;

    .line 31
    .line 32
    iput-object p2, p0, La/u9e0;->p:La/m1e;

    .line 33
    .line 34
    iput-object p3, p0, La/u9e0;->q:La/x4u;

    .line 35
    .line 36
    iput-object p7, p0, La/u9e0;->r:La/uxs0;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/u9e0;->s:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/u9e0;->p:La/m1e;

    .line 7
    .line 8
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/coc0;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, p0, v3, v2}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/fnq;

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    invoke-direct {v2, v0, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    invoke-static {p0, v2, v3, v3, v0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/u9e0;->s:La/c4m0;

    .line 36
    .line 37
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/i3e0;

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
    instance-of v0, p1, La/c3e0;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    check-cast p1, La/c3e0;

    .line 14
    .line 15
    sget-object v0, La/z2e0;->a:La/z2e0;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v0, La/a3e0;->a:La/a3e0;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, La/u9e0;->t:La/bby;

    .line 36
    .line 37
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/u9e0;->s:La/c4m0;

    .line 41
    .line 42
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    sget-object v0, La/b3e0;->a:La/b3e0;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, La/u9e0;->M()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    instance-of v0, p1, La/h3e0;

    .line 63
    .line 64
    if-eqz v0, :cond_e

    .line 65
    .line 66
    check-cast p1, La/h3e0;

    .line 67
    .line 68
    sget-object v0, La/d3e0;->a:La/d3e0;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v1, p0, La/u9e0;->o:La/i1w0;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p1, La/c8d;

    .line 83
    .line 84
    sget-object v0, La/y7d;->a:La/v7d;

    .line 85
    .line 86
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 87
    .line 88
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-static {p0, p1, v1, p0, v0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_0
    move-object p1, p0

    .line 97
    check-cast p1, La/paw;

    .line 98
    .line 99
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, La/oe50;

    .line 110
    .line 111
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    return-void

    .line 116
    :cond_5
    instance-of v0, p1, La/e3e0;

    .line 117
    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    check-cast p1, La/e3e0;

    .line 121
    .line 122
    new-instance v0, La/oac0;

    .line 123
    .line 124
    const/16 v2, 0x16

    .line 125
    .line 126
    invoke-direct {v0, p0, p1, v2}, La/oac0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_6
    sget-object v0, La/f3e0;->a:La/f3e0;

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    invoke-virtual {p0}, La/u9e0;->M()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_7
    instance-of v0, p1, La/g3e0;

    .line 146
    .line 147
    if-eqz v0, :cond_d

    .line 148
    .line 149
    check-cast p1, La/g3e0;

    .line 150
    .line 151
    iget p1, p1, La/g3e0;->a:I

    .line 152
    .line 153
    sget-object v0, La/g7e0;->c:La/g7e0;

    .line 154
    .line 155
    sget-object v1, La/f7e0;->c:La/f7e0;

    .line 156
    .line 157
    if-nez p1, :cond_8

    .line 158
    .line 159
    move-object v3, v1

    .line 160
    goto :goto_1

    .line 161
    :cond_8
    move-object v3, v0

    .line 162
    :goto_1
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_9

    .line 167
    .line 168
    sget-object p1, La/kgz;->b:La/kgz;

    .line 169
    .line 170
    :goto_2
    move-object v4, p1

    .line 171
    goto :goto_3

    .line 172
    :cond_9
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_c

    .line 177
    .line 178
    sget-object p1, La/kgz;->c:La/kgz;

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :goto_3
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 182
    .line 183
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 184
    .line 185
    :cond_a
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-object v2, v0

    .line 193
    check-cast v2, La/o7e0;

    .line 194
    .line 195
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    const/16 v7, 0x19

    .line 202
    .line 203
    const/4 v5, 0x0

    .line 204
    invoke-static/range {v2 .. v7}, La/o7e0;->a(La/o7e0;La/h7e0;La/kgz;La/j0g0;ZI)La/o7e0;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_a

    .line 213
    .line 214
    iget-object p1, p0, La/u9e0;->t:La/bby;

    .line 215
    .line 216
    const/4 v0, 0x0

    .line 217
    if-eqz p1, :cond_b

    .line 218
    .line 219
    invoke-interface {p1, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 220
    .line 221
    .line 222
    :cond_b
    new-instance p1, La/hhb0;

    .line 223
    .line 224
    const/4 v1, 0x1

    .line 225
    invoke-direct {p1, p0, v0, v1}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 226
    .line 227
    .line 228
    const/4 v1, 0x3

    .line 229
    invoke-static {p0, v0, v0, p1, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    iput-object p1, p0, La/u9e0;->t:La/bby;

    .line 234
    .line 235
    return-void

    .line 236
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 245
    .line 246
    .line 247
    return-void
.end method
