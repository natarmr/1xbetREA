.class public final La/l470;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final h:La/uf3;

.field public final i:La/hs60;

.field public final j:La/gw60;

.field public final k:La/ix0;

.field public final l:La/ls;

.field public final m:La/xcc;

.field public final n:La/p4u;

.field public final o:La/oeg0;

.field public final p:La/z4u;

.field public final q:La/iqt;

.field public final r:La/lbu;

.field public final s:La/dcu;

.field public final t:La/uxs0;


# direct methods
.method public constructor <init>(La/uf3;La/hs60;La/gw60;La/ix0;La/ls;La/xcc;La/p4u;La/oeg0;La/z4u;La/iqt;La/lbu;La/dcu;La/uxs0;)V
    .locals 2

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/fq60;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/fq60;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/l470;->h:La/uf3;

    .line 15
    .line 16
    iput-object p2, p0, La/l470;->i:La/hs60;

    .line 17
    .line 18
    iput-object p3, p0, La/l470;->j:La/gw60;

    .line 19
    .line 20
    iput-object p4, p0, La/l470;->k:La/ix0;

    .line 21
    .line 22
    iput-object p5, p0, La/l470;->l:La/ls;

    .line 23
    .line 24
    iput-object p6, p0, La/l470;->m:La/xcc;

    .line 25
    .line 26
    iput-object p7, p0, La/l470;->n:La/p4u;

    .line 27
    .line 28
    iput-object p8, p0, La/l470;->o:La/oeg0;

    .line 29
    .line 30
    iput-object p9, p0, La/l470;->p:La/z4u;

    .line 31
    .line 32
    iput-object p10, p0, La/l470;->q:La/iqt;

    .line 33
    .line 34
    iput-object p11, p0, La/l470;->r:La/lbu;

    .line 35
    .line 36
    iput-object p12, p0, La/l470;->s:La/dcu;

    .line 37
    .line 38
    iput-object p13, p0, La/l470;->t:La/uxs0;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/e470;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/l470;->i(La/e470;La/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i(La/e470;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/f470;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/f470;

    .line 7
    .line 8
    iget v1, v0, La/f470;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/f470;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f470;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/f470;-><init>(La/l470;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/f470;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/f470;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p1, v0, La/f470;->i:La/e470;

    .line 51
    .line 52
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/f470;->i:La/e470;

    .line 60
    .line 61
    iput v5, v0, La/f470;->l:I

    .line 62
    .line 63
    invoke-static {p0, p1, v0}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-ne p2, v1, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_1
    instance-of p2, p1, La/c470;

    .line 71
    .line 72
    if-eqz p2, :cond_6

    .line 73
    .line 74
    check-cast p1, La/c470;

    .line 75
    .line 76
    iput-object v3, v0, La/f470;->i:La/e470;

    .line 77
    .line 78
    iput v4, v0, La/f470;->l:I

    .line 79
    .line 80
    invoke-virtual {p0, p1, v0}, La/l470;->j(La/c470;La/zje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-ne p0, v1, :cond_5

    .line 85
    .line 86
    :goto_2
    return-object v1

    .line 87
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_6
    instance-of p2, p1, La/b470;

    .line 91
    .line 92
    if-eqz p2, :cond_8

    .line 93
    .line 94
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, La/n470;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, La/l470;->i:La/hs60;

    .line 104
    .line 105
    iget-object p1, p1, La/hs60;->a:La/kt2;

    .line 106
    .line 107
    const-string p2, "games_open_all"

    .line 108
    .line 109
    const-string v0, "screen"

    .line 110
    .line 111
    const-string v1, ""

    .line 112
    .line 113
    invoke-static {v0, v1, p1, p2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, La/n470;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, La/l470;->k:La/ix0;

    .line 126
    .line 127
    iget-object p1, p1, La/ix0;->a:La/s1p;

    .line 128
    .line 129
    const-wide/16 v2, 0xbf3

    .line 130
    .line 131
    invoke-static {v1, p1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, La/l470;->o:La/oeg0;

    .line 135
    .line 136
    invoke-virtual {p1}, La/oeg0;->c()La/i1w0;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    iget-object p0, p0, La/l470;->h:La/uf3;

    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    invoke-virtual {p0, v0}, La/uf3;->e(I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    instance-of v1, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 152
    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    new-instance v1, La/e1w0;

    .line 156
    .line 157
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 158
    .line 159
    invoke-direct {v1, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 160
    .line 161
    .line 162
    new-instance p0, La/c8d;

    .line 163
    .line 164
    sget-object v2, La/y7d;->a:La/v7d;

    .line 165
    .line 166
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_7
    new-instance v1, La/w0w0;

    .line 174
    .line 175
    invoke-direct {v1, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 176
    .line 177
    .line 178
    new-instance p0, La/c8d;

    .line 179
    .line 180
    sget-object v2, La/y7d;->a:La/v7d;

    .line 181
    .line 182
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :goto_4
    invoke-static {p1, p2, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    :goto_5
    move-object p2, p0

    .line 193
    check-cast p2, La/paw;

    .line 194
    .line 195
    invoke-virtual {p2}, La/paw;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    invoke-virtual {p2}, La/paw;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    check-cast p2, La/oe50;

    .line 206
    .line 207
    invoke-virtual {p1, p2}, La/i1w0;->a(La/oe50;)V

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_8
    sget-object p2, La/z370;->a:La/z370;

    .line 212
    .line 213
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    if-eqz p2, :cond_9

    .line 218
    .line 219
    invoke-virtual {p0}, La/x2t0;->e()V

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_9
    instance-of p1, p1, La/a470;

    .line 224
    .line 225
    if-eqz p1, :cond_c

    .line 226
    .line 227
    iget-object p0, p0, La/x2t0;->b:La/ocj;

    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 233
    .line 234
    :cond_a
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    move-object p2, p1

    .line 239
    check-cast p2, La/n470;

    .line 240
    .line 241
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    new-instance p2, La/n470;

    .line 245
    .line 246
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, p1, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-eqz p1, :cond_a

    .line 254
    .line 255
    :cond_b
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object p0

    .line 258
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 259
    .line 260
    .line 261
    return-object v3
.end method

.method public final j(La/c470;La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/g470;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/g470;

    .line 11
    .line 12
    iget v3, v2, La/g470;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/g470;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v5, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/g470;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/g470;-><init>(La/l470;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v5, La/g470;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v6, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v5, La/g470;->l:I

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    const/4 v4, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x0

    .line 41
    if-eqz v2, :cond_4

    .line 42
    .line 43
    if-eq v2, v7, :cond_3

    .line 44
    .line 45
    if-eq v2, v4, :cond_2

    .line 46
    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_b

    .line 53
    .line 54
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v8

    .line 60
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_9

    .line 64
    .line 65
    :cond_3
    iget-object v2, v5, La/g470;->i:La/c470;

    .line 66
    .line 67
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object/from16 v16, v2

    .line 71
    .line 72
    move-object v2, v1

    .line 73
    move-object/from16 v1, v16

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object/from16 v1, p1

    .line 80
    .line 81
    iput-object v1, v5, La/g470;->i:La/c470;

    .line 82
    .line 83
    iput v7, v5, La/g470;->l:I

    .line 84
    .line 85
    iget-object v2, v0, La/l470;->r:La/lbu;

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    invoke-static {v2, v9, v5, v3}, La/lbu;->k(La/lbu;ILa/yje;I)Ljava/io/Serializable;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-ne v2, v6, :cond_5

    .line 93
    .line 94
    goto/16 :goto_a

    .line 95
    .line 96
    :cond_5
    :goto_2
    check-cast v2, Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_7

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    move-object v10, v9

    .line 113
    check-cast v10, La/pbv;

    .line 114
    .line 115
    iget-wide v10, v10, La/pbv;->a:J

    .line 116
    .line 117
    iget-wide v12, v1, La/c470;->a:J

    .line 118
    .line 119
    cmp-long v10, v10, v12

    .line 120
    .line 121
    if-nez v10, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_7
    move-object v9, v8

    .line 125
    :goto_3
    check-cast v9, La/pbv;

    .line 126
    .line 127
    if-eqz v9, :cond_8

    .line 128
    .line 129
    iget-object v2, v9, La/pbv;->e:La/a570;

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_8
    move-object v2, v8

    .line 133
    :goto_4
    instance-of v2, v2, La/z470;

    .line 134
    .line 135
    if-eqz v2, :cond_9

    .line 136
    .line 137
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    :goto_5
    move-object v14, v2

    .line 146
    goto :goto_6

    .line 147
    :cond_9
    const-string v2, ""

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :goto_6
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    if-eqz v9, :cond_a

    .line 154
    .line 155
    iget-object v2, v9, La/pbv;->n:La/hds;

    .line 156
    .line 157
    if-eqz v2, :cond_a

    .line 158
    .line 159
    iget-object v10, v1, La/c470;->b:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v2, v10}, La/hds;->a(Ljava/lang/String;)La/lz60;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz v2, :cond_a

    .line 166
    .line 167
    :goto_7
    move-object v15, v2

    .line 168
    goto :goto_8

    .line 169
    :cond_a
    sget-object v2, La/jz60;->a:La/jz60;

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :goto_8
    if-eqz v9, :cond_c

    .line 173
    .line 174
    iget-object v2, v9, La/pbv;->e:La/a570;

    .line 175
    .line 176
    if-eqz v2, :cond_c

    .line 177
    .line 178
    invoke-static {v2}, La/x1x;->G(La/a570;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-ne v2, v7, :cond_c

    .line 183
    .line 184
    iget-boolean v2, v9, La/pbv;->p:Z

    .line 185
    .line 186
    if-nez v2, :cond_c

    .line 187
    .line 188
    iget-wide v11, v1, La/c470;->a:J

    .line 189
    .line 190
    iget-object v10, v0, La/l470;->i:La/hs60;

    .line 191
    .line 192
    sget-object v13, La/zn60;->m:La/zn60;

    .line 193
    .line 194
    invoke-virtual/range {v10 .. v15}, La/hs60;->d(JLa/zn60;Ljava/lang/String;La/lz60;)V

    .line 195
    .line 196
    .line 197
    long-to-int v2, v11

    .line 198
    sget-object v3, La/y1p;->j1:La/y1p;

    .line 199
    .line 200
    iget-object v7, v0, La/l470;->j:La/gw60;

    .line 201
    .line 202
    invoke-virtual {v7, v2, v3, v14, v15}, La/gw60;->d(ILa/y1p;Ljava/lang/String;La/lz60;)V

    .line 203
    .line 204
    .line 205
    iget-wide v1, v1, La/c470;->a:J

    .line 206
    .line 207
    iput-object v8, v5, La/g470;->i:La/c470;

    .line 208
    .line 209
    iput v4, v5, La/g470;->l:I

    .line 210
    .line 211
    move-object v3, v9

    .line 212
    move-object v4, v14

    .line 213
    invoke-virtual/range {v0 .. v5}, La/l470;->k(JLa/pbv;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-ne v0, v6, :cond_b

    .line 218
    .line 219
    goto :goto_a

    .line 220
    :cond_b
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_c
    if-eqz v9, :cond_d

    .line 224
    .line 225
    iget-object v1, v9, La/pbv;->e:La/a570;

    .line 226
    .line 227
    if-eqz v1, :cond_d

    .line 228
    .line 229
    invoke-static {v1}, La/x1x;->G(La/a570;)Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-ne v1, v7, :cond_d

    .line 234
    .line 235
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object v0

    .line 238
    :cond_d
    iput-object v8, v5, La/g470;->i:La/c470;

    .line 239
    .line 240
    iput v3, v5, La/g470;->l:I

    .line 241
    .line 242
    sget-object v1, La/b470;->a:La/b470;

    .line 243
    .line 244
    invoke-virtual {v0, v1, v5}, La/l470;->i(La/e470;La/zje;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-ne v0, v6, :cond_e

    .line 249
    .line 250
    :goto_a
    return-object v6

    .line 251
    :cond_e
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0
.end method

.method public final k(JLa/pbv;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, La/h470;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/h470;

    .line 7
    .line 8
    iget v1, v0, La/h470;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/h470;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/h470;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/h470;-><init>(La/l470;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/h470;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/h470;->n:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v6, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v7

    .line 57
    :cond_2
    iget-wide p1, v0, La/h470;->i:J

    .line 58
    .line 59
    :try_start_0
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :catch_0
    move-exception p3

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-wide p1, v0, La/h470;->i:J

    .line 67
    .line 68
    iget-object p4, v0, La/h470;->k:Ljava/lang/String;

    .line 69
    .line 70
    iget-object p3, v0, La/h470;->j:La/pbv;

    .line 71
    .line 72
    :try_start_1
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :try_start_2
    iget-object p5, p0, La/l470;->l:La/ls;

    .line 80
    .line 81
    iput-object p3, v0, La/h470;->j:La/pbv;

    .line 82
    .line 83
    iput-object p4, v0, La/h470;->k:Ljava/lang/String;

    .line 84
    .line 85
    iput-wide p1, v0, La/h470;->i:J

    .line 86
    .line 87
    iput v6, v0, La/h470;->n:I

    .line 88
    .line 89
    invoke-virtual {p5, p1, p2, v0}, La/ls;->b(JLa/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p5

    .line 93
    if-ne p5, v1, :cond_5

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_5
    :goto_1
    iget-object p5, p3, La/pbv;->e:La/a570;

    .line 97
    .line 98
    if-nez p5, :cond_6

    .line 99
    .line 100
    const/4 v2, -0x1

    .line 101
    goto :goto_2

    .line 102
    :cond_6
    instance-of v2, p5, La/w470;

    .line 103
    .line 104
    if-eqz v2, :cond_7

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    goto :goto_2

    .line 108
    :cond_7
    instance-of v2, p5, La/z470;

    .line 109
    .line 110
    if-eqz v2, :cond_8

    .line 111
    .line 112
    move v2, v6

    .line 113
    goto :goto_2

    .line 114
    :cond_8
    const/4 v2, -0x2

    .line 115
    :goto_2
    if-eqz v2, :cond_a

    .line 116
    .line 117
    if-ne v2, v6, :cond_9

    .line 118
    .line 119
    check-cast p5, La/z470;

    .line 120
    .line 121
    iput-object v7, v0, La/h470;->j:La/pbv;

    .line 122
    .line 123
    iput-object v7, v0, La/h470;->k:Ljava/lang/String;

    .line 124
    .line 125
    iput-wide p1, v0, La/h470;->i:J

    .line 126
    .line 127
    iput v4, v0, La/h470;->n:I

    .line 128
    .line 129
    invoke-virtual {p0, p5, p4, v0}, La/l470;->m(La/z470;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, v1, :cond_b

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_9
    new-instance p3, La/m460;

    .line 137
    .line 138
    invoke-direct {p3}, Ljava/lang/RuntimeException;-><init>()V

    .line 139
    .line 140
    .line 141
    throw p3

    .line 142
    :cond_a
    iput-object v7, v0, La/h470;->j:La/pbv;

    .line 143
    .line 144
    iput-object v7, v0, La/h470;->k:Ljava/lang/String;

    .line 145
    .line 146
    iput-wide p1, v0, La/h470;->i:J

    .line 147
    .line 148
    iput v5, v0, La/h470;->n:I

    .line 149
    .line 150
    invoke-virtual {p0, p3, v0}, La/l470;->l(La/pbv;La/zje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 154
    if-ne p0, v1, :cond_b

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :goto_3
    iput-object v7, v0, La/h470;->j:La/pbv;

    .line 158
    .line 159
    iput-object v7, v0, La/h470;->k:Ljava/lang/String;

    .line 160
    .line 161
    iput-wide p1, v0, La/h470;->i:J

    .line 162
    .line 163
    iput v3, v0, La/h470;->n:I

    .line 164
    .line 165
    iget-object p0, p0, La/l470;->m:La/xcc;

    .line 166
    .line 167
    invoke-virtual {p0, p3, v0}, La/xcc;->a(Ljava/lang/Throwable;La/yje;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    if-ne p0, v1, :cond_b

    .line 172
    .line 173
    :goto_4
    return-object v1

    .line 174
    :cond_b
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0
.end method

.method public final l(La/pbv;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/i470;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/i470;

    .line 7
    .line 8
    iget v1, v0, La/i470;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/i470;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/i470;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/i470;-><init>(La/l470;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/i470;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/i470;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-wide v0, v0, La/i470;->i:J

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p1, La/pbv;->e:La/a570;

    .line 53
    .line 54
    invoke-static {p1}, La/x1x;->D(La/a570;)J

    .line 55
    .line 56
    .line 57
    move-result-wide p1

    .line 58
    iput-wide p1, v0, La/i470;->i:J

    .line 59
    .line 60
    iput v4, v0, La/i470;->l:I

    .line 61
    .line 62
    iget-object v2, p0, La/l470;->p:La/z4u;

    .line 63
    .line 64
    invoke-virtual {v2, p1, p2, v0}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    move-wide v5, p1

    .line 72
    move-object p2, v0

    .line 73
    move-wide v0, v5

    .line 74
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    const/4 p2, 0x6

    .line 81
    invoke-static {p2, v0, v1, v3}, La/jtv;->M0(IJLa/csr;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    if-nez p2, :cond_4

    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_4
    iget-object p0, p0, La/l470;->o:La/oeg0;

    .line 91
    .line 92
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance v0, La/qm60;

    .line 97
    .line 98
    invoke-direct {v0, p2, p1, v4}, La/qm60;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;ZB)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0
.end method

.method public final m(La/z470;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/j470;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/j470;

    .line 11
    .line 12
    iget v3, v2, La/j470;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/j470;->q:I

    .line 22
    .line 23
    :goto_0
    move-object v3, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/j470;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/j470;-><init>(La/l470;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v3, La/j470;->o:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v6, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v3, La/j470;->q:I

    .line 36
    .line 37
    const/4 v4, 0x5

    .line 38
    const/4 v5, 0x4

    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v2, :cond_6

    .line 44
    .line 45
    if-eq v2, v9, :cond_5

    .line 46
    .line 47
    if-eq v2, v8, :cond_4

    .line 48
    .line 49
    if-eq v2, v7, :cond_3

    .line 50
    .line 51
    if-eq v2, v5, :cond_2

    .line 52
    .line 53
    if-ne v2, v4, :cond_1

    .line 54
    .line 55
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v10

    .line 66
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_3
    iget-boolean v2, v3, La/j470;->m:Z

    .line 72
    .line 73
    iget-wide v7, v3, La/j470;->n:J

    .line 74
    .line 75
    iget-boolean v4, v3, La/j470;->l:Z

    .line 76
    .line 77
    iget-boolean v9, v3, La/j470;->k:Z

    .line 78
    .line 79
    iget-object v11, v3, La/j470;->j:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v12, v3, La/j470;->i:La/z470;

    .line 82
    .line 83
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_4

    .line 87
    .line 88
    :cond_4
    iget-wide v8, v3, La/j470;->n:J

    .line 89
    .line 90
    iget-boolean v2, v3, La/j470;->l:Z

    .line 91
    .line 92
    iget-boolean v11, v3, La/j470;->k:Z

    .line 93
    .line 94
    iget-object v12, v3, La/j470;->j:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v13, v3, La/j470;->i:La/z470;

    .line 97
    .line 98
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    iget-boolean v2, v3, La/j470;->k:Z

    .line 103
    .line 104
    iget-object v9, v3, La/j470;->j:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v11, v3, La/j470;->i:La/z470;

    .line 107
    .line 108
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v13, v9

    .line 112
    move-object v9, v1

    .line 113
    move-object v1, v11

    .line 114
    goto :goto_2

    .line 115
    :cond_6
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, v0, La/l470;->q:La/iqt;

    .line 119
    .line 120
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 121
    .line 122
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-static/range {p1 .. p1}, La/x1x;->D(La/a570;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v11

    .line 130
    move-object/from16 v1, p1

    .line 131
    .line 132
    iput-object v1, v3, La/j470;->i:La/z470;

    .line 133
    .line 134
    move-object/from16 v13, p2

    .line 135
    .line 136
    iput-object v13, v3, La/j470;->j:Ljava/lang/String;

    .line 137
    .line 138
    iput-boolean v2, v3, La/j470;->k:Z

    .line 139
    .line 140
    iput v9, v3, La/j470;->q:I

    .line 141
    .line 142
    iget-object v9, v0, La/l470;->p:La/z4u;

    .line 143
    .line 144
    invoke-virtual {v9, v11, v12, v3}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    if-ne v9, v6, :cond_7

    .line 149
    .line 150
    goto/16 :goto_7

    .line 151
    .line 152
    :cond_7
    :goto_2
    check-cast v9, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    invoke-static {v1}, La/x1x;->D(La/a570;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v11

    .line 162
    iput-object v1, v3, La/j470;->i:La/z470;

    .line 163
    .line 164
    iput-object v13, v3, La/j470;->j:Ljava/lang/String;

    .line 165
    .line 166
    iput-boolean v2, v3, La/j470;->k:Z

    .line 167
    .line 168
    iput-boolean v9, v3, La/j470;->l:Z

    .line 169
    .line 170
    iput-wide v11, v3, La/j470;->n:J

    .line 171
    .line 172
    iput v8, v3, La/j470;->q:I

    .line 173
    .line 174
    iget-object v8, v0, La/l470;->s:La/dcu;

    .line 175
    .line 176
    invoke-virtual {v8, v11, v12, v3}, La/dcu;->a(JLa/zje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    if-ne v8, v6, :cond_8

    .line 181
    .line 182
    goto/16 :goto_7

    .line 183
    .line 184
    :cond_8
    move-object v15, v13

    .line 185
    move-object v13, v1

    .line 186
    move-object v1, v8

    .line 187
    move-wide/from16 v16, v11

    .line 188
    .line 189
    move v11, v2

    .line 190
    move v2, v9

    .line 191
    move-wide/from16 v8, v16

    .line 192
    .line 193
    move-object v12, v15

    .line 194
    :goto_3
    check-cast v1, Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v11, :cond_d

    .line 201
    .line 202
    if-nez v2, :cond_d

    .line 203
    .line 204
    iput-object v13, v3, La/j470;->i:La/z470;

    .line 205
    .line 206
    iput-object v12, v3, La/j470;->j:Ljava/lang/String;

    .line 207
    .line 208
    iput-boolean v11, v3, La/j470;->k:Z

    .line 209
    .line 210
    iput-boolean v2, v3, La/j470;->l:Z

    .line 211
    .line 212
    iput-wide v8, v3, La/j470;->n:J

    .line 213
    .line 214
    iput-boolean v1, v3, La/j470;->m:Z

    .line 215
    .line 216
    iput v7, v3, La/j470;->q:I

    .line 217
    .line 218
    iget-object v4, v0, La/l470;->n:La/p4u;

    .line 219
    .line 220
    invoke-virtual {v4, v3}, La/p4u;->e(La/zje;)Ljava/io/Serializable;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    if-ne v4, v6, :cond_9

    .line 225
    .line 226
    goto/16 :goto_7

    .line 227
    .line 228
    :cond_9
    move v7, v2

    .line 229
    move v2, v1

    .line 230
    move-object v1, v4

    .line 231
    move v4, v7

    .line 232
    move-wide v7, v8

    .line 233
    move v9, v11

    .line 234
    move-object v11, v12

    .line 235
    move-object v12, v13

    .line 236
    :goto_4
    check-cast v1, Ljava/util/List;

    .line 237
    .line 238
    iput-object v10, v3, La/j470;->i:La/z470;

    .line 239
    .line 240
    iput-object v10, v3, La/j470;->j:Ljava/lang/String;

    .line 241
    .line 242
    iput-boolean v9, v3, La/j470;->k:Z

    .line 243
    .line 244
    iput-boolean v4, v3, La/j470;->l:Z

    .line 245
    .line 246
    iput-wide v7, v3, La/j470;->n:J

    .line 247
    .line 248
    iput-boolean v2, v3, La/j470;->m:Z

    .line 249
    .line 250
    iput v5, v3, La/j470;->q:I

    .line 251
    .line 252
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-nez v1, :cond_a

    .line 257
    .line 258
    sget-object v1, La/m470;->a:La/m470;

    .line 259
    .line 260
    invoke-virtual {v0, v1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_a
    invoke-static {v12}, La/x1x;->D(La/a570;)J

    .line 267
    .line 268
    .line 269
    move-result-wide v4

    .line 270
    move-wide v15, v4

    .line 271
    move v5, v2

    .line 272
    move-wide v1, v15

    .line 273
    move-object v4, v11

    .line 274
    invoke-virtual/range {v0 .. v5}, La/l470;->n(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-ne v0, v6, :cond_b

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    :goto_5
    if-ne v0, v6, :cond_c

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_c
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object v0

    .line 289
    :cond_d
    invoke-static {v13}, La/x1x;->D(La/a570;)J

    .line 290
    .line 291
    .line 292
    move-result-wide v13

    .line 293
    iput-object v10, v3, La/j470;->i:La/z470;

    .line 294
    .line 295
    iput-object v10, v3, La/j470;->j:Ljava/lang/String;

    .line 296
    .line 297
    iput-boolean v11, v3, La/j470;->k:Z

    .line 298
    .line 299
    iput-boolean v2, v3, La/j470;->l:Z

    .line 300
    .line 301
    iput-wide v8, v3, La/j470;->n:J

    .line 302
    .line 303
    iput-boolean v1, v3, La/j470;->m:Z

    .line 304
    .line 305
    iput v4, v3, La/j470;->q:I

    .line 306
    .line 307
    move-object/from16 v0, p0

    .line 308
    .line 309
    move v5, v1

    .line 310
    move-object v4, v12

    .line 311
    move-wide v1, v13

    .line 312
    invoke-virtual/range {v0 .. v5}, La/l470;->n(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-ne v0, v6, :cond_e

    .line 317
    .line 318
    :goto_7
    return-object v6

    .line 319
    :cond_e
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0
.end method

.method public final n(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, La/k470;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/k470;

    .line 7
    .line 8
    iget v1, v0, La/k470;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/k470;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/k470;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/k470;-><init>(La/l470;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/k470;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/k470;->n:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    if-ne v2, v3, :cond_2

    .line 35
    .line 36
    iget-boolean p5, v0, La/k470;->j:Z

    .line 37
    .line 38
    iget-wide p1, v0, La/k470;->i:J

    .line 39
    .line 40
    iget-object p4, v0, La/k470;->k:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    move-wide v3, p1

    .line 46
    move-object v7, p4

    .line 47
    move v6, p5

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object p4, v0, La/k470;->k:Ljava/lang/String;

    .line 60
    .line 61
    iput-wide p1, v0, La/k470;->i:J

    .line 62
    .line 63
    iput-boolean p5, v0, La/k470;->j:Z

    .line 64
    .line 65
    iput v3, v0, La/k470;->n:I

    .line 66
    .line 67
    iget-object p3, p0, La/l470;->p:La/z4u;

    .line 68
    .line 69
    invoke-virtual {p3, p1, p2, v0}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    if-ne p3, v1, :cond_1

    .line 74
    .line 75
    return-object v1

    .line 76
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v8, 0x6

    .line 84
    iget-object v2, p0, La/l470;->t:La/uxs0;

    .line 85
    .line 86
    invoke-static/range {v2 .. v8}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    iget-object p0, p0, La/l470;->o:La/oeg0;

    .line 91
    .line 92
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance p3, La/x9;

    .line 97
    .line 98
    const/16 p4, 0x1d

    .line 99
    .line 100
    invoke-direct {p3, p2, p1, p4}, La/x9;-><init>(Ljava/lang/Object;ZB)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0
.end method
