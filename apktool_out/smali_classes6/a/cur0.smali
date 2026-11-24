.class public final La/cur0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:I

.field public final p:La/rkt0;

.field public final q:La/i1w0;


# direct methods
.method public constructor <init>(La/vzg0;IJLa/xsu;La/tqt;La/g2v;La/rkt0;La/mne;La/ctu;La/i1w0;La/ctf0;)V
    .locals 8

    .line 1
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/duo;

    .line 5
    .line 6
    move v5, p2

    .line 7
    move-wide v6, p3

    .line 8
    move-object v2, p5

    .line 9
    move-object v3, p6

    .line 10
    move-object v4, p7

    .line 11
    move-object/from16 v1, p10

    .line 12
    .line 13
    invoke-direct/range {v0 .. v7}, La/duo;-><init>(La/ctu;La/xsu;La/tqt;La/g2v;IJ)V

    .line 14
    .line 15
    .line 16
    new-instance p3, La/h0j0;

    .line 17
    .line 18
    const/16 p4, 0x18

    .line 19
    .line 20
    move-object/from16 p5, p12

    .line 21
    .line 22
    invoke-direct {p3, p5, p4}, La/h0j0;-><init>(La/ctf0;B)V

    .line 23
    .line 24
    .line 25
    move-object/from16 p4, p9

    .line 26
    .line 27
    iget-object p4, p4, La/mne;->a:La/rwj;

    .line 28
    .line 29
    invoke-static {p4, p4}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    invoke-direct {p0, p1, v0, p3, p4}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/g090;)V

    .line 34
    .line 35
    .line 36
    iput p2, p0, La/cur0;->o:I

    .line 37
    .line 38
    move-object/from16 p1, p8

    .line 39
    .line 40
    iput-object p1, p0, La/cur0;->p:La/rkt0;

    .line 41
    .line 42
    move-object/from16 p1, p11

    .line 43
    .line 44
    iput-object p1, p0, La/cur0;->q:La/i1w0;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 4

    .line 1
    iget-object p0, p0, La/cur0;->q:La/i1w0;

    .line 2
    .line 3
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/c8d;

    .line 8
    .line 9
    sget-object v2, La/y7d;->a:La/v7d;

    .line 10
    .line 11
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    move-object v1, v0

    .line 22
    check-cast v1, La/paw;

    .line 23
    .line 24
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/oe50;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/vtr0;

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
    sget-object v0, La/ptr0;->a:La/ptr0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/ztr0;

    .line 22
    .line 23
    iget-object p1, p1, La/ztr0;->b:Ljava/util/List;

    .line 24
    .line 25
    new-instance v0, La/sx3;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p1, v1}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p1, La/t9r0;

    .line 32
    .line 33
    const/16 v1, 0x13

    .line 34
    .line 35
    invoke-direct {p1, v1}, La/t9r0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p1}, La/pgi0;->l(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, La/t9r0;

    .line 43
    .line 44
    const/16 v1, 0x14

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/t9r0;-><init>(B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, La/t9r0;

    .line 54
    .line 55
    const/16 v1, 0x15

    .line 56
    .line 57
    invoke-direct {v0, v1}, La/t9r0;-><init>(B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v0}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, La/pgi0;->v(Lkotlin/sequences/Sequence;)Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v0, p0, La/cur0;->p:La/rkt0;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v0, v0, La/rkt0;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La/vkr0;

    .line 79
    .line 80
    iget-object v0, v0, La/vkr0;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, La/sd80;

    .line 83
    .line 84
    iget-object v0, v0, La/sd80;->a:La/qoj0;

    .line 85
    .line 86
    invoke-virtual {v0}, La/qoj0;->d()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Ljava/util/Map;

    .line 95
    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 107
    .line 108
    .line 109
    :goto_0
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget v3, p0, La/cur0;->o:I

    .line 114
    .line 115
    if-eqz v1, :cond_1

    .line 116
    .line 117
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :goto_1
    invoke-virtual {v0, v2}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, La/cur0;->M()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_2
    sget-object v0, La/qtr0;->a:La/qtr0;

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    invoke-virtual {p0}, La/cur0;->M()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_3
    sget-object v0, La/str0;->a:La/str0;

    .line 152
    .line 153
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_4

    .line 158
    .line 159
    new-instance p1, La/efr0;

    .line 160
    .line 161
    const/16 v0, 0x8

    .line 162
    .line 163
    invoke-direct {p1, v0}, La/efr0;-><init>(B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_4
    sget-object v0, La/ttr0;->a:La/ttr0;

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    new-instance p1, La/efr0;

    .line 179
    .line 180
    const/4 v0, 0x7

    .line 181
    invoke-direct {p1, v0}, La/efr0;-><init>(B)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_5
    instance-of v0, p1, La/rtr0;

    .line 189
    .line 190
    if-eqz v0, :cond_6

    .line 191
    .line 192
    check-cast p1, La/rtr0;

    .line 193
    .line 194
    iget p1, p1, La/rtr0;->a:I

    .line 195
    .line 196
    new-instance v0, La/bur0;

    .line 197
    .line 198
    invoke-direct {v0, p1, p0}, La/bur0;-><init>(ILa/cur0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_6
    instance-of v0, p1, La/utr0;

    .line 206
    .line 207
    if-eqz v0, :cond_7

    .line 208
    .line 209
    check-cast p1, La/utr0;

    .line 210
    .line 211
    iget v0, p1, La/utr0;->a:I

    .line 212
    .line 213
    iget p1, p1, La/utr0;->b:I

    .line 214
    .line 215
    new-instance v1, La/dv90;

    .line 216
    .line 217
    const/4 v2, 0x4

    .line 218
    invoke-direct {v1, v0, p1, v2}, La/dv90;-><init>(IIB)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 226
    .line 227
    .line 228
    return-void
.end method
