.class public final La/bd40;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final o:La/i1w0;

.field public final p:Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;

.field public final q:La/m1e;

.field public final r:La/cyu;

.field public final s:La/hzg;

.field public final t:La/qv2;

.field public final u:La/p4u;

.field public v:La/c4m0;

.field public w:La/bby;


# direct methods
.method public constructor <init>(La/i1w0;Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;La/mne;La/m1e;La/cyu;La/g2v;La/ctf0;La/hzg;La/qv2;La/p4u;La/r9u;)V
    .locals 2

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, La/bz;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p11, v1}, La/bz;-><init>(La/r9u;B)V

    .line 14
    .line 15
    .line 16
    iget-object p3, p3, La/mne;->a:La/rwj;

    .line 17
    .line 18
    invoke-static {p3, p3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    new-instance p11, La/o20;

    .line 23
    .line 24
    const/16 v1, 0xe

    .line 25
    .line 26
    invoke-direct {p11, p6, p7, v1}, La/o20;-><init>(La/g2v;La/ctf0;B)V

    .line 27
    .line 28
    .line 29
    const/4 p6, 0x0

    .line 30
    invoke-direct {p0, v0, p3, p11, p6}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/bd40;->o:La/i1w0;

    .line 34
    .line 35
    iput-object p2, p0, La/bd40;->p:Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;

    .line 36
    .line 37
    iput-object p4, p0, La/bd40;->q:La/m1e;

    .line 38
    .line 39
    iput-object p5, p0, La/bd40;->r:La/cyu;

    .line 40
    .line 41
    iput-object p8, p0, La/bd40;->s:La/hzg;

    .line 42
    .line 43
    iput-object p9, p0, La/bd40;->t:La/qv2;

    .line 44
    .line 45
    iput-object p10, p0, La/bd40;->u:La/p4u;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/bd40;->v:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/bd40;->q:La/m1e;

    .line 7
    .line 8
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/w620;

    .line 13
    .line 14
    const/16 v2, 0xc

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, p0, v3, v2}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    new-instance v2, La/fnq;

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    invoke-direct {v2, v0, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    invoke-static {p0, v2, v3, v3, v0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/bd40;->v:La/c4m0;

    .line 32
    .line 33
    return-void
.end method

.method public final N(La/xb40;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/bd40;->w:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v0, La/ffd;

    .line 9
    .line 10
    const/16 v1, 0x1c

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v2, v1}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {p0, v2, v2, v0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/bd40;->w:La/bby;

    .line 22
    .line 23
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/bb40;

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
    instance-of v0, p1, La/ab40;

    .line 10
    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    check-cast p1, La/ab40;

    .line 14
    .line 15
    sget-object v0, La/va40;->a:La/va40;

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
    iget-object p0, p0, La/bd40;->s:La/hzg;

    .line 24
    .line 25
    check-cast p0, La/uzg;

    .line 26
    .line 27
    invoke-virtual {p0}, La/uzg;->a()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    instance-of v0, p1, La/wa40;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    check-cast p1, La/wa40;

    .line 36
    .line 37
    iget-wide v0, p1, La/wa40;->a:J

    .line 38
    .line 39
    const-wide/16 v2, 0x1

    .line 40
    .line 41
    cmp-long p1, v0, v2

    .line 42
    .line 43
    if-nez p1, :cond_b

    .line 44
    .line 45
    new-instance p1, La/pc40;

    .line 46
    .line 47
    new-instance v0, Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;

    .line 48
    .line 49
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/yc40;

    .line 54
    .line 55
    iget-object v1, v1, La/yc40;->a:La/xb40;

    .line 56
    .line 57
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, La/yc40;

    .line 62
    .line 63
    iget-object v2, v2, La/yc40;->b:Ljava/util/List;

    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;-><init>(La/xb40;Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, v0}, La/pc40;-><init>(Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    instance-of v0, p1, La/za40;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    check-cast p1, La/za40;

    .line 80
    .line 81
    iget-object v1, p1, La/za40;->a:La/xb40;

    .line 82
    .line 83
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, La/yc40;

    .line 88
    .line 89
    iget-object p1, p1, La/yc40;->a:La/xb40;

    .line 90
    .line 91
    if-eq p1, v1, :cond_b

    .line 92
    .line 93
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 94
    .line 95
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 96
    .line 97
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-object v0, v6

    .line 105
    check-cast v0, La/yc40;

    .line 106
    .line 107
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    const/4 v4, 0x0

    .line 113
    const/16 v5, 0x3e

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    const/4 v3, 0x0

    .line 117
    invoke-static/range {v0 .. v5}, La/yc40;->a(La/yc40;La/xb40;Ljava/util/List;La/j0g0;ZI)La/yc40;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {p1, v6, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    invoke-virtual {p0, v1}, La/bd40;->N(La/xb40;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_3
    instance-of v0, p1, La/xa40;

    .line 132
    .line 133
    if-eqz v0, :cond_4

    .line 134
    .line 135
    check-cast p1, La/xa40;

    .line 136
    .line 137
    new-instance v0, La/bw20;

    .line 138
    .line 139
    const/16 v1, 0x18

    .line 140
    .line 141
    invoke-direct {v0, p0, p1, v1}, La/bw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    iget-object p0, p0, La/bd40;->o:La/i1w0;

    .line 145
    .line 146
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_4
    sget-object v0, La/ya40;->a:La/ya40;

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_5

    .line 157
    .line 158
    invoke-virtual {p0}, La/bd40;->M()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, La/yc40;

    .line 166
    .line 167
    iget-object p1, p1, La/yc40;->a:La/xb40;

    .line 168
    .line 169
    invoke-virtual {p0, p1}, La/bd40;->N(La/xb40;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_6
    instance-of v0, p1, La/ua40;

    .line 178
    .line 179
    if-eqz v0, :cond_b

    .line 180
    .line 181
    check-cast p1, La/ua40;

    .line 182
    .line 183
    sget-object v0, La/ra40;->a:La/ra40;

    .line 184
    .line 185
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_7

    .line 190
    .line 191
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_7
    sget-object v0, La/sa40;->a:La/sa40;

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_9

    .line 202
    .line 203
    iget-object p1, p0, La/bd40;->v:La/c4m0;

    .line 204
    .line 205
    const/4 v0, 0x0

    .line 206
    if-eqz p1, :cond_8

    .line 207
    .line 208
    invoke-virtual {p1, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 209
    .line 210
    .line 211
    :cond_8
    iget-object p0, p0, La/bd40;->w:La/bby;

    .line 212
    .line 213
    if-eqz p0, :cond_b

    .line 214
    .line 215
    invoke-interface {p0, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_9
    sget-object v0, La/ta40;->a:La/ta40;

    .line 220
    .line 221
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eqz p1, :cond_a

    .line 226
    .line 227
    invoke-virtual {p0}, La/bd40;->M()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, La/yc40;

    .line 235
    .line 236
    iget-object p1, p1, La/yc40;->a:La/xb40;

    .line 237
    .line 238
    sget-object v0, La/xb40;->a:La/xb40;

    .line 239
    .line 240
    if-eq p1, v0, :cond_b

    .line 241
    .line 242
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, La/yc40;

    .line 247
    .line 248
    iget-object p1, p1, La/yc40;->a:La/xb40;

    .line 249
    .line 250
    invoke-virtual {p0, p1}, La/bd40;->N(La/xb40;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 255
    .line 256
    .line 257
    :cond_b
    return-void
.end method
