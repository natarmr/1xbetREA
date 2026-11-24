.class public final La/zeo0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:La/i1w0;

.field public final p:La/yfm0;

.field public final q:La/yo4;

.field public final r:La/zr1;

.field public final s:La/tsc;

.field public t:La/c4m0;


# direct methods
.method public constructor <init>(La/vzg0;ILa/mne;La/r9u;La/i1w0;La/yfm0;La/yo4;La/zr1;La/luu;La/tsc;La/bzt;La/ctf0;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p3, p3, La/mne;->c:La/vs10;

    .line 8
    .line 9
    invoke-static {p3, p3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    new-instance v0, La/yeo0;

    .line 14
    .line 15
    invoke-direct {v0, p9, p11, p2, p4}, La/yeo0;-><init>(La/luu;La/bzt;ILa/r9u;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, La/h0j0;

    .line 19
    .line 20
    const/16 p4, 0xc

    .line 21
    .line 22
    invoke-direct {p2, p12, p4}, La/h0j0;-><init>(La/ctf0;B)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1, v0, p3, p2}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;La/g090;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    iput-object p5, p0, La/zeo0;->o:La/i1w0;

    .line 29
    .line 30
    iput-object p6, p0, La/zeo0;->p:La/yfm0;

    .line 31
    .line 32
    iput-object p7, p0, La/zeo0;->q:La/yo4;

    .line 33
    .line 34
    iput-object p8, p0, La/zeo0;->r:La/zr1;

    .line 35
    .line 36
    iput-object p10, p0, La/zeo0;->s:La/tsc;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 12

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/keo0;

    .line 6
    .line 7
    iget-object v0, v0, La/keo0;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x3

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/keo0;

    .line 23
    .line 24
    iget-object v0, v0, La/keo0;->c:Ljava/util/List;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    :cond_0
    move v1, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move v1, v3

    .line 41
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_4

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, La/x8r0;

    .line 52
    .line 53
    iget-object v4, v4, La/x8r0;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, La/keo0;

    .line 60
    .line 61
    iget-object v5, v5, La/keo0;->d:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v4, v5, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    if-ltz v1, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-static {}, La/q3d;->o()V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    throw p0

    .line 79
    :cond_4
    :goto_1
    if-nez v1, :cond_5

    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 83
    .line 84
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 85
    .line 86
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-object v5, v4

    .line 94
    check-cast v5, La/keo0;

    .line 95
    .line 96
    iget-object v6, p0, La/i3t0;->f:La/oyg0;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget v6, v5, La/keo0;->f:I

    .line 102
    .line 103
    add-int/2addr v6, p1

    .line 104
    add-int/lit8 v7, v1, -0x1

    .line 105
    .line 106
    invoke-static {v6, v3, v7}, La/l1e0;->d(III)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    const/16 v11, 0x3df

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    invoke-static/range {v5 .. v11}, La/keo0;->a(La/keo0;ILjava/util/List;Ljava/util/List;Ljava/lang/String;II)La/keo0;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v0, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_6

    .line 125
    .line 126
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/jeo0;

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
    instance-of v0, p1, La/feo0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p1, La/feo0;

    .line 15
    .line 16
    iget p1, p1, La/feo0;->a:I

    .line 17
    .line 18
    iget-object v0, p0, La/zeo0;->t:La/c4m0;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, La/zeo0;->s:La/tsc;

    .line 31
    .line 32
    iget-object v0, v0, La/tsc;->a:La/dhm0;

    .line 33
    .line 34
    iget-object v0, v0, La/dhm0;->d:La/oar0;

    .line 35
    .line 36
    iget-object v0, v0, La/oar0;->a:La/p7m0;

    .line 37
    .line 38
    new-instance v1, La/i89;

    .line 39
    .line 40
    const/16 v2, 0x16

    .line 41
    .line 42
    invoke-direct {v1, v0, v2}, La/i89;-><init>(La/gmq;B)V

    .line 43
    .line 44
    .line 45
    new-instance v0, La/mc0;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {v0, p1, p0, v2}, La/mc0;-><init>(ILa/zeo0;La/yje;)V

    .line 49
    .line 50
    .line 51
    new-instance p1, La/fnq;

    .line 52
    .line 53
    const/4 v3, 0x4

    .line 54
    invoke-direct {p1, v1, v0, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    invoke-static {p0, p1, v2, v2, v0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, La/zeo0;->t:La/c4m0;

    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    sget-object v0, La/eeo0;->a:La/eeo0;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object p0, p0, La/zeo0;->t:La/c4m0;

    .line 74
    .line 75
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    instance-of v0, p1, La/heo0;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    check-cast p1, La/heo0;

    .line 84
    .line 85
    iget-object p1, p1, La/heo0;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/keo0;

    .line 92
    .line 93
    iget v0, v0, La/keo0;->g:I

    .line 94
    .line 95
    iget-object v2, p0, La/zeo0;->q:La/yo4;

    .line 96
    .line 97
    const-string v3, "extended_rating"

    .line 98
    .line 99
    invoke-virtual {v2, v0, v3}, La/yo4;->t(ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, La/keo0;

    .line 107
    .line 108
    iget v0, v0, La/keo0;->g:I

    .line 109
    .line 110
    iget-object v2, p0, La/zeo0;->r:La/zr1;

    .line 111
    .line 112
    iget-object v2, v2, La/zr1;->a:La/s1p;

    .line 113
    .line 114
    new-instance v4, La/i1p;

    .line 115
    .line 116
    const/4 v5, 0x2

    .line 117
    invoke-direct {v4, v0, v5}, La/i1p;-><init>(IB)V

    .line 118
    .line 119
    .line 120
    new-instance v0, La/j1p;

    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    invoke-direct {v0, v3, v6}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 124
    .line 125
    .line 126
    new-array v3, v5, [La/k1p;

    .line 127
    .line 128
    aput-object v4, v3, v6

    .line 129
    .line 130
    aput-object v0, v3, v1

    .line 131
    .line 132
    invoke-static {v3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const-wide/16 v3, 0xc26

    .line 137
    .line 138
    invoke-virtual {v2, v0, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, La/keo0;

    .line 146
    .line 147
    iget-wide v0, v0, La/keo0;->h:J

    .line 148
    .line 149
    iget-object v2, p0, La/zeo0;->p:La/yfm0;

    .line 150
    .line 151
    check-cast v2, La/zfm0;

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    const-string v2, ""

    .line 157
    .line 158
    invoke-static {v0, v1, p1, v2}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iget-object p0, p0, La/zeo0;->o:La/i1w0;

    .line 163
    .line 164
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    instance-of v1, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 169
    .line 170
    if-eqz v1, :cond_3

    .line 171
    .line 172
    new-instance v1, La/e1w0;

    .line 173
    .line 174
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 175
    .line 176
    invoke-direct {v1, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 177
    .line 178
    .line 179
    new-instance p1, La/c8d;

    .line 180
    .line 181
    sget-object v2, La/y7d;->a:La/v7d;

    .line 182
    .line 183
    invoke-direct {p1, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_3
    new-instance v1, La/w0w0;

    .line 191
    .line 192
    invoke-direct {v1, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 193
    .line 194
    .line 195
    new-instance p1, La/c8d;

    .line 196
    .line 197
    sget-object v2, La/y7d;->a:La/v7d;

    .line 198
    .line 199
    invoke-direct {p1, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :goto_0
    invoke-static {p0, v0, v6}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    :goto_1
    move-object v0, p1

    .line 210
    check-cast v0, La/paw;

    .line 211
    .line 212
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_4

    .line 217
    .line 218
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, La/oe50;

    .line 223
    .line 224
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_4
    :goto_2
    return-void

    .line 229
    :cond_5
    sget-object v0, La/geo0;->a:La/geo0;

    .line 230
    .line 231
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_6

    .line 236
    .line 237
    invoke-virtual {p0, v1}, La/zeo0;->M(I)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_6
    sget-object v0, La/ieo0;->a:La/ieo0;

    .line 242
    .line 243
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_7

    .line 248
    .line 249
    const/4 p1, -0x1

    .line 250
    invoke-virtual {p0, p1}, La/zeo0;->M(I)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 255
    .line 256
    .line 257
    return-void
.end method
