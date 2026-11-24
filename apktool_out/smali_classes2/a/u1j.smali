.class public final La/u1j;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final o:La/ctf0;

.field public final p:La/h4u;

.field public final q:La/duj;

.field public final r:La/mne;

.field public final s:La/crt;

.field public final t:La/rpt;

.field public final u:La/b4j;

.field public final v:La/je;

.field public final w:La/crt;

.field public x:La/c4m0;

.field public y:La/bby;


# direct methods
.method public constructor <init>(La/ctf0;La/h4u;La/duj;La/mne;La/crt;La/rpt;La/b4j;La/je;La/crt;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p4, La/mne;->c:La/vs10;

    .line 5
    .line 6
    iget-object v1, p4, La/mne;->a:La/rwj;

    .line 7
    .line 8
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/bmh;

    .line 13
    .line 14
    const/16 v2, 0x12

    .line 15
    .line 16
    invoke-direct {v1, v2}, La/bmh;-><init>(B)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/ep4;

    .line 20
    .line 21
    const/16 v3, 0x19

    .line 22
    .line 23
    invoke-direct {v2, p1, v3}, La/ep4;-><init>(La/ctf0;B)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {p0, v1, v0, v2, v3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/u1j;->o:La/ctf0;

    .line 31
    .line 32
    iput-object p2, p0, La/u1j;->p:La/h4u;

    .line 33
    .line 34
    iput-object p3, p0, La/u1j;->q:La/duj;

    .line 35
    .line 36
    iput-object p4, p0, La/u1j;->r:La/mne;

    .line 37
    .line 38
    iput-object p5, p0, La/u1j;->s:La/crt;

    .line 39
    .line 40
    iput-object p6, p0, La/u1j;->t:La/rpt;

    .line 41
    .line 42
    iput-object p7, p0, La/u1j;->u:La/b4j;

    .line 43
    .line 44
    iput-object p8, p0, La/u1j;->v:La/je;

    .line 45
    .line 46
    iput-object p9, p0, La/u1j;->w:La/crt;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final M(ILjava/lang/String;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/2addr p1, v0

    .line 3
    iget-object v1, p0, La/u1j;->u:La/b4j;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v1, La/b4j;->a:La/kt2;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Lkotlin/Pair;

    .line 15
    .line 16
    const-string v4, "index"

    .line 17
    .line 18
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lkotlin/Pair;

    .line 22
    .line 23
    const-string v4, "position"

    .line 24
    .line 25
    invoke-direct {v2, v4, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    filled-new-array {v3, v2}, [Lkotlin/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "dchallenge_popup_close"

    .line 37
    .line 38
    invoke-interface {v1, v3, v2}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, La/u1j;->v:La/je;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, La/je;->a:La/s1p;

    .line 47
    .line 48
    new-instance v1, La/i1p;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-direct {v1, p1, v2}, La/i1p;-><init>(IB)V

    .line 52
    .line 53
    .line 54
    new-instance p1, La/j1p;

    .line 55
    .line 56
    invoke-direct {p1, p2, v0}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 57
    .line 58
    .line 59
    new-array p2, v2, [La/k1p;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    aput-object v1, p2, v2

    .line 63
    .line 64
    aput-object p1, p2, v0

    .line 65
    .line 66
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-wide/16 v0, 0x2ab0

    .line 71
    .line 72
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 11

    .line 1
    check-cast p1, La/n1j;

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
    instance-of v0, p1, La/h1j;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p1, La/i1j;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iget-object v2, p0, La/u1j;->r:La/mne;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, La/u1j;->w:La/crt;

    .line 27
    .line 28
    invoke-virtual {p1}, La/crt;->a()La/i89;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, La/r1j;

    .line 33
    .line 34
    invoke-direct {v0, p0, v3, v1}, La/r1j;-><init>(La/u1j;La/yje;B)V

    .line 35
    .line 36
    .line 37
    new-instance v1, La/fnq;

    .line 38
    .line 39
    const/4 v5, 0x4

    .line 40
    invoke-direct {v1, p1, v0, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, v2, La/mne;->b:La/dvj;

    .line 48
    .line 49
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, La/r1j;

    .line 54
    .line 55
    invoke-direct {v0, p0, v3, v4}, La/r1j;-><init>(La/u1j;La/yje;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    instance-of v0, p1, La/j1j;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    iget-object p1, p0, La/u1j;->x:La/c4m0;

    .line 67
    .line 68
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, La/u1j;->y:La/bby;

    .line 72
    .line 73
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    instance-of v0, p1, La/l1j;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    check-cast p1, La/l1j;

    .line 82
    .line 83
    iget p1, p1, La/l1j;->a:I

    .line 84
    .line 85
    const-string v0, "button"

    .line 86
    .line 87
    invoke-virtual {p0, p1, v0}, La/u1j;->M(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object p1, La/y1j;->a:La/y1j;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    instance-of v0, p1, La/k1j;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    check-cast p1, La/k1j;

    .line 101
    .line 102
    iget v0, p1, La/k1j;->a:I

    .line 103
    .line 104
    add-int/2addr v0, v4

    .line 105
    iget p1, p1, La/k1j;->b:I

    .line 106
    .line 107
    if-ne v0, p1, :cond_5

    .line 108
    .line 109
    iget-object p1, p0, La/u1j;->y:La/bby;

    .line 110
    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-ne p1, v4, :cond_4

    .line 118
    .line 119
    return-void

    .line 120
    :cond_4
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    new-instance v6, La/x2i;

    .line 125
    .line 126
    const/4 p1, 0x2

    .line 127
    invoke-direct {v6, p1}, La/x2i;-><init>(B)V

    .line 128
    .line 129
    .line 130
    iget-object v8, v2, La/mne;->b:La/dvj;

    .line 131
    .line 132
    new-instance v9, La/t1j;

    .line 133
    .line 134
    invoke-direct {v9, p0, v3, v4}, La/t1j;-><init>(La/u1j;La/yje;B)V

    .line 135
    .line 136
    .line 137
    const/16 v10, 0xa

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, La/u1j;->y:La/bby;

    .line 145
    .line 146
    return-void

    .line 147
    :cond_5
    iget-object p1, p0, La/u1j;->u:La/b4j;

    .line 148
    .line 149
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 150
    .line 151
    const-string v0, "dchallenge_popup_second"

    .line 152
    .line 153
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object p0, p0, La/u1j;->v:La/je;

    .line 157
    .line 158
    iget-object p0, p0, La/je;->a:La/s1p;

    .line 159
    .line 160
    const-wide/16 v0, 0x2aaf

    .line 161
    .line 162
    sget-object p1, La/xun;->a:La/xun;

    .line 163
    .line 164
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_6
    instance-of v0, p1, La/m1j;

    .line 169
    .line 170
    if-eqz v0, :cond_a

    .line 171
    .line 172
    check-cast p1, La/m1j;

    .line 173
    .line 174
    iget v0, p1, La/m1j;->a:I

    .line 175
    .line 176
    add-int/2addr v0, v4

    .line 177
    iget p1, p1, La/m1j;->b:I

    .line 178
    .line 179
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 180
    .line 181
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 182
    .line 183
    if-ne v0, p1, :cond_8

    .line 184
    .line 185
    iget-object p1, p0, La/ocj;->a:La/p7m0;

    .line 186
    .line 187
    :cond_7
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-object v0, p0

    .line 195
    check-cast v0, La/b2j;

    .line 196
    .line 197
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-static {v0, v3, v1, v4}, La/b2j;->a(La/b2j;La/n85;ZI)La/b2j;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {p1, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-eqz p0, :cond_7

    .line 209
    .line 210
    return-void

    .line 211
    :cond_8
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 212
    .line 213
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-object p1, p0

    .line 221
    check-cast p1, La/b2j;

    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {p1, v3, v4, v4}, La/b2j;->a(La/b2j;La/n85;ZI)La/b2j;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    if-eqz p0, :cond_9

    .line 235
    .line 236
    return-void

    .line 237
    :cond_a
    instance-of p1, p1, La/g1j;

    .line 238
    .line 239
    if-eqz p1, :cond_b

    .line 240
    .line 241
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, La/b2j;

    .line 246
    .line 247
    iget-boolean p1, p1, La/b2j;->b:Z

    .line 248
    .line 249
    xor-int/2addr p1, v4

    .line 250
    const-string v0, "outside"

    .line 251
    .line 252
    invoke-virtual {p0, p1, v0}, La/u1j;->M(ILjava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 257
    .line 258
    .line 259
    return-void
.end method
