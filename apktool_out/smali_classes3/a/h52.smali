.class public final La/h52;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

.field public final p:La/f8w;

.field public final q:La/uyn;

.field public final r:La/o470;

.field public final s:La/ugf0;

.field public final t:La/pru;

.field public final u:La/ctf0;

.field public final v:La/f4u;

.field public final w:La/epi0;

.field public final x:La/hnu;


# direct methods
.method public constructor <init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;La/uyn;La/o470;La/ugf0;La/pru;La/ctf0;La/f4u;La/epi0;La/r9u;La/hnu;La/mne;)V
    .locals 11

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    move-object/from16 v1, p12

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v3, La/pg1;

    .line 12
    .line 13
    const/4 v10, 0x3

    .line 14
    move-object v5, p1

    .line 15
    move-object v6, p2

    .line 16
    move-object v7, p3

    .line 17
    move-object/from16 v8, p8

    .line 18
    .line 19
    move-object/from16 v9, p10

    .line 20
    .line 21
    move-object/from16 v4, p11

    .line 22
    .line 23
    move-object v2, v3

    .line 24
    move-object/from16 v3, p6

    .line 25
    .line 26
    invoke-direct/range {v2 .. v10}, La/pg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    move-object v3, v2

    .line 30
    new-instance v4, La/df1;

    .line 31
    .line 32
    const/16 v2, 0xb

    .line 33
    .line 34
    invoke-direct {v4, v0, p2, v2}, La/df1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v1, La/mne;->c:La/vs10;

    .line 38
    .line 39
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 40
    .line 41
    invoke-static {v2, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    move-object v1, p0

    .line 48
    invoke-direct/range {v1 .. v6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, La/h52;->o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 52
    .line 53
    iput-object p2, p0, La/h52;->p:La/f8w;

    .line 54
    .line 55
    iput-object p3, p0, La/h52;->q:La/uyn;

    .line 56
    .line 57
    iput-object p4, p0, La/h52;->r:La/o470;

    .line 58
    .line 59
    move-object/from16 p1, p5

    .line 60
    .line 61
    iput-object p1, p0, La/h52;->s:La/ugf0;

    .line 62
    .line 63
    move-object/from16 v3, p6

    .line 64
    .line 65
    iput-object v3, p0, La/h52;->t:La/pru;

    .line 66
    .line 67
    iput-object v0, p0, La/h52;->u:La/ctf0;

    .line 68
    .line 69
    iput-object v8, p0, La/h52;->v:La/f4u;

    .line 70
    .line 71
    move-object/from16 p1, p9

    .line 72
    .line 73
    iput-object p1, p0, La/h52;->w:La/epi0;

    .line 74
    .line 75
    move-object/from16 v4, p11

    .line 76
    .line 77
    iput-object v4, p0, La/h52;->x:La/hnu;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final M(La/s3q;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq p1, v0, :cond_6

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, La/c52;

    .line 20
    .line 21
    iget-object p1, p1, La/c52;->d:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, La/un7;

    .line 45
    .line 46
    iget-boolean v0, v0, La/un7;->b:Z

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    if-ltz v2, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-static {}, La/q3d;->o()V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_4
    :goto_1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, La/c52;

    .line 64
    .line 65
    iget-object p1, p1, La/c52;->c:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-ne v2, p1, :cond_5

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    new-instance p1, La/xg1;

    .line 75
    .line 76
    const/16 v0, 0x17

    .line 77
    .line 78
    invoke-direct {p1, v0}, La/xg1;-><init>(B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_6
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, La/c52;

    .line 90
    .line 91
    iget-object p1, p1, La/c52;->b:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :cond_8
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_a

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/h0w;

    .line 115
    .line 116
    iget-boolean v0, v0, La/h0w;->b:Z

    .line 117
    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    add-int/lit8 v2, v2, 0x1

    .line 121
    .line 122
    if-ltz v2, :cond_9

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_9
    invoke-static {}, La/q3d;->o()V

    .line 126
    .line 127
    .line 128
    throw v1

    .line 129
    :cond_a
    :goto_3
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, La/c52;

    .line 134
    .line 135
    iget-object p1, p1, La/c52;->a:Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-ne v2, p1, :cond_b

    .line 142
    .line 143
    :goto_4
    return-void

    .line 144
    :cond_b
    new-instance p1, La/xg1;

    .line 145
    .line 146
    const/16 v0, 0x16

    .line 147
    .line 148
    invoke-direct {p1, v0}, La/xg1;-><init>(B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/o42;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {v0, v1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, La/k42;->a:La/k42;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, La/i3t0;->E()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object v2, La/g42;->a:La/g42;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_8

    .line 34
    .line 35
    iget-object v1, v0, La/h52;->t:La/pru;

    .line 36
    .line 37
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v1, v1, La/sff0;->a:La/gx7;

    .line 42
    .line 43
    iget-object v1, v1, La/gx7;->a:La/gm7;

    .line 44
    .line 45
    iget-boolean v2, v1, La/gm7;->m:Z

    .line 46
    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    iget-boolean v2, v1, La/gm7;->n:Z

    .line 50
    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    iget-boolean v2, v1, La/gm7;->q:Z

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v3, v4

    .line 59
    :cond_2
    :goto_0
    iget-object v2, v0, La/h52;->x:La/hnu;

    .line 60
    .line 61
    iget-object v4, v0, La/h52;->o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 62
    .line 63
    iget-object v5, v0, La/h52;->p:La/f8w;

    .line 64
    .line 65
    invoke-virtual {v2, v4, v5, v3}, La/hnu;->h(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;Z)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v3, v0, La/h52;->q:La/uyn;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, La/uyn;->k(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    new-instance v6, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    move-object v8, v7

    .line 95
    check-cast v8, La/un7;

    .line 96
    .line 97
    iget-boolean v9, v1, La/gm7;->s:Z

    .line 98
    .line 99
    if-nez v9, :cond_4

    .line 100
    .line 101
    iget-object v8, v8, La/un7;->a:La/q4f;

    .line 102
    .line 103
    sget-object v9, La/q4f;->l:La/q4f;

    .line 104
    .line 105
    if-eq v8, v9, :cond_3

    .line 106
    .line 107
    :cond_4
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    iget-object v1, v0, La/h52;->v:La/f4u;

    .line 112
    .line 113
    iget-object v1, v1, La/f4u;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, La/prc;

    .line 116
    .line 117
    iget-object v1, v1, La/prc;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, La/xdj;

    .line 120
    .line 121
    iget-object v1, v1, La/xdj;->a:La/wdj;

    .line 122
    .line 123
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, La/c52;

    .line 128
    .line 129
    iget-object v3, v3, La/c52;->e:La/wdj;

    .line 130
    .line 131
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, La/c52;

    .line 142
    .line 143
    iget-object v1, v1, La/c52;->d:Ljava/util/List;

    .line 144
    .line 145
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_7

    .line 150
    .line 151
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, La/c52;

    .line 156
    .line 157
    iget-object v1, v1, La/c52;->b:Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_6

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_6
    sget-object v1, La/w42;->a:La/w42;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_7
    :goto_2
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, La/c52;

    .line 177
    .line 178
    iget-object v1, v1, La/c52;->e:La/wdj;

    .line 179
    .line 180
    iget-object v2, v0, La/h52;->w:La/epi0;

    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v2, v2, La/epi0;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, La/prc;

    .line 191
    .line 192
    iget-object v2, v2, La/prc;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v2, La/xdj;

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iput-object v1, v2, La/xdj;->a:La/wdj;

    .line 200
    .line 201
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, La/c52;

    .line 206
    .line 207
    iget-object v1, v1, La/c52;->d:Ljava/util/List;

    .line 208
    .line 209
    iget-object v2, v0, La/h52;->r:La/o470;

    .line 210
    .line 211
    invoke-virtual {v2, v1}, La/o470;->h(Ljava/util/List;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, La/c52;

    .line 219
    .line 220
    iget-object v1, v1, La/c52;->b:Ljava/util/List;

    .line 221
    .line 222
    iget-object v2, v0, La/h52;->s:La/ugf0;

    .line 223
    .line 224
    invoke-virtual {v2, v1, v4, v5}, La/ugf0;->f0(Ljava/util/List;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;)V

    .line 225
    .line 226
    .line 227
    sget-object v1, La/v42;->a:La/v42;

    .line 228
    .line 229
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_8
    sget-object v2, La/n42;->a:La/n42;

    .line 234
    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    iget-object v5, v0, La/i3t0;->f:La/oyg0;

    .line 240
    .line 241
    iget-object v6, v0, La/i3t0;->i:La/ocj;

    .line 242
    .line 243
    if-eqz v2, :cond_a

    .line 244
    .line 245
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 246
    .line 247
    :cond_9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-object v1, v0

    .line 255
    check-cast v1, La/c52;

    .line 256
    .line 257
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    iget-object v3, v1, La/c52;->f:La/wdj;

    .line 261
    .line 262
    iget-object v4, v1, La/c52;->a:Ljava/util/List;

    .line 263
    .line 264
    iget-object v6, v1, La/c52;->c:Ljava/util/List;

    .line 265
    .line 266
    const/16 v7, 0xfe5

    .line 267
    .line 268
    invoke-static {v1, v4, v6, v3, v7}, La/c52;->a(La/c52;Ljava/util/List;Ljava/util/List;La/wdj;I)La/c52;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_9

    .line 277
    .line 278
    return-void

    .line 279
    :cond_a
    sget-object v2, La/m42;->a:La/m42;

    .line 280
    .line 281
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-eqz v2, :cond_b

    .line 286
    .line 287
    new-instance v1, La/x42;

    .line 288
    .line 289
    sget-object v2, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 290
    .line 291
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_b
    instance-of v2, v1, La/l42;

    .line 299
    .line 300
    const/16 v7, 0xfef

    .line 301
    .line 302
    const-wide/16 v8, 0x0

    .line 303
    .line 304
    const/4 v10, 0x0

    .line 305
    if-eqz v2, :cond_e

    .line 306
    .line 307
    check-cast v1, La/l42;

    .line 308
    .line 309
    iget-wide v11, v1, La/l42;->a:J

    .line 310
    .line 311
    iget-wide v13, v1, La/l42;->b:J

    .line 312
    .line 313
    cmp-long v1, v13, v8

    .line 314
    .line 315
    if-nez v1, :cond_c

    .line 316
    .line 317
    new-instance v1, La/z42;

    .line 318
    .line 319
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    check-cast v2, La/c52;

    .line 324
    .line 325
    iget v2, v2, La/c52;->k:I

    .line 326
    .line 327
    invoke-direct {v1, v11, v12, v2}, La/z42;-><init>(JI)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :cond_c
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 335
    .line 336
    :cond_d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-object v1, v0

    .line 344
    check-cast v1, La/c52;

    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    new-instance v3, La/vdj;

    .line 350
    .line 351
    invoke-direct {v3, v11, v12, v13, v14}, La/vdj;-><init>(JJ)V

    .line 352
    .line 353
    .line 354
    invoke-static {v1, v10, v10, v3, v7}, La/c52;->a(La/c52;Ljava/util/List;Ljava/util/List;La/wdj;I)La/c52;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_d

    .line 363
    .line 364
    return-void

    .line 365
    :cond_e
    instance-of v2, v1, La/j42;

    .line 366
    .line 367
    if-eqz v2, :cond_10

    .line 368
    .line 369
    check-cast v1, La/j42;

    .line 370
    .line 371
    iget-object v2, v1, La/j42;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 372
    .line 373
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    iget-object v12, v6, La/ocj;->a:La/p7m0;

    .line 378
    .line 379
    :cond_f
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    move-object v1, v0

    .line 387
    check-cast v1, La/c52;

    .line 388
    .line 389
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    new-instance v3, La/tdj;

    .line 393
    .line 394
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-static {v2, v11}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v11}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 401
    .line 402
    .line 403
    move-result-wide v8

    .line 404
    const-wide/16 v13, 0x3e8

    .line 405
    .line 406
    div-long/2addr v8, v13

    .line 407
    invoke-direct {v3, v8, v9}, La/tdj;-><init>(J)V

    .line 408
    .line 409
    .line 410
    invoke-static {v1, v10, v10, v3, v7}, La/c52;->a(La/c52;Ljava/util/List;Ljava/util/List;La/wdj;I)La/c52;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-virtual {v12, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eqz v0, :cond_f

    .line 419
    .line 420
    return-void

    .line 421
    :cond_10
    instance-of v2, v1, La/i42;

    .line 422
    .line 423
    if-eqz v2, :cond_12

    .line 424
    .line 425
    check-cast v1, La/i42;

    .line 426
    .line 427
    iget-object v1, v1, La/i42;->a:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 428
    .line 429
    iget-object v2, v1, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 430
    .line 431
    iget-object v1, v1, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 432
    .line 433
    if-nez v2, :cond_11

    .line 434
    .line 435
    if-nez v1, :cond_11

    .line 436
    .line 437
    goto/16 :goto_a

    .line 438
    .line 439
    :cond_11
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    new-instance v5, La/g52;

    .line 444
    .line 445
    invoke-direct {v5, v2, v3, v1, v4}, La/g52;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;B)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v5}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 449
    .line 450
    .line 451
    return-void

    .line 452
    :cond_12
    instance-of v2, v1, La/h42;

    .line 453
    .line 454
    if-eqz v2, :cond_39

    .line 455
    .line 456
    check-cast v1, La/h42;

    .line 457
    .line 458
    iget-wide v11, v1, La/h42;->b:J

    .line 459
    .line 460
    iget-object v1, v1, La/h42;->a:La/s3q;

    .line 461
    .line 462
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    const/4 v2, 0x2

    .line 467
    if-eqz v1, :cond_2b

    .line 468
    .line 469
    if-eq v1, v3, :cond_1f

    .line 470
    .line 471
    if-ne v1, v2, :cond_1e

    .line 472
    .line 473
    long-to-int v1, v11

    .line 474
    sget-object v5, La/j3q;->b:[La/j3q;

    .line 475
    .line 476
    const/16 v5, -0xc8

    .line 477
    .line 478
    if-ne v1, v5, :cond_13

    .line 479
    .line 480
    sget-object v1, La/s3q;->c:La/s3q;

    .line 481
    .line 482
    invoke-virtual {v0, v1}, La/h52;->M(La/s3q;)V

    .line 483
    .line 484
    .line 485
    return-void

    .line 486
    :cond_13
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    check-cast v5, La/c52;

    .line 491
    .line 492
    iget-object v5, v5, La/c52;->d:Ljava/util/List;

    .line 493
    .line 494
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    :cond_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result v6

    .line 502
    if-eqz v6, :cond_15

    .line 503
    .line 504
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v6

    .line 508
    move-object v7, v6

    .line 509
    check-cast v7, La/un7;

    .line 510
    .line 511
    iget-object v7, v7, La/un7;->a:La/q4f;

    .line 512
    .line 513
    invoke-virtual {v7}, La/q4f;->a()I

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    if-ne v7, v1, :cond_14

    .line 518
    .line 519
    goto :goto_3

    .line 520
    :cond_15
    move-object v6, v10

    .line 521
    :goto_3
    check-cast v6, La/un7;

    .line 522
    .line 523
    if-nez v6, :cond_16

    .line 524
    .line 525
    goto/16 :goto_a

    .line 526
    .line 527
    :cond_16
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    check-cast v1, La/c52;

    .line 532
    .line 533
    iget-object v1, v1, La/c52;->d:Ljava/util/List;

    .line 534
    .line 535
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 536
    .line 537
    .line 538
    move-result v5

    .line 539
    if-eqz v5, :cond_17

    .line 540
    .line 541
    move v5, v4

    .line 542
    goto :goto_5

    .line 543
    :cond_17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    move v5, v4

    .line 548
    :cond_18
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 549
    .line 550
    .line 551
    move-result v7

    .line 552
    if-eqz v7, :cond_1a

    .line 553
    .line 554
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v7

    .line 558
    check-cast v7, La/un7;

    .line 559
    .line 560
    iget-boolean v7, v7, La/un7;->b:Z

    .line 561
    .line 562
    if-eqz v7, :cond_18

    .line 563
    .line 564
    add-int/lit8 v5, v5, 0x1

    .line 565
    .line 566
    if-ltz v5, :cond_19

    .line 567
    .line 568
    goto :goto_4

    .line 569
    :cond_19
    invoke-static {}, La/q3d;->o()V

    .line 570
    .line 571
    .line 572
    throw v10

    .line 573
    :cond_1a
    :goto_5
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    check-cast v1, La/c52;

    .line 578
    .line 579
    iget-object v1, v1, La/c52;->c:Ljava/util/List;

    .line 580
    .line 581
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-ne v5, v1, :cond_1b

    .line 586
    .line 587
    new-instance v1, La/e52;

    .line 588
    .line 589
    invoke-direct {v1, v6, v3}, La/e52;-><init>(La/un7;B)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 593
    .line 594
    .line 595
    return-void

    .line 596
    :cond_1b
    iget-boolean v1, v6, La/un7;->b:Z

    .line 597
    .line 598
    if-eqz v1, :cond_1c

    .line 599
    .line 600
    if-le v5, v3, :cond_1c

    .line 601
    .line 602
    new-instance v1, La/e52;

    .line 603
    .line 604
    invoke-direct {v1, v6, v2}, La/e52;-><init>(La/un7;B)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 608
    .line 609
    .line 610
    return-void

    .line 611
    :cond_1c
    if-nez v1, :cond_1d

    .line 612
    .line 613
    new-instance v1, La/e52;

    .line 614
    .line 615
    invoke-direct {v1, v6, v4}, La/e52;-><init>(La/un7;B)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 619
    .line 620
    .line 621
    return-void

    .line 622
    :cond_1d
    if-eqz v1, :cond_2f

    .line 623
    .line 624
    if-ne v5, v3, :cond_2f

    .line 625
    .line 626
    new-instance v1, La/xg1;

    .line 627
    .line 628
    const/16 v2, 0x15

    .line 629
    .line 630
    invoke-direct {v1, v2}, La/xg1;-><init>(B)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 634
    .line 635
    .line 636
    return-void

    .line 637
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :cond_1f
    long-to-int v1, v11

    .line 642
    sget-object v5, La/j3q;->b:[La/j3q;

    .line 643
    .line 644
    const/16 v5, -0x64

    .line 645
    .line 646
    if-ne v1, v5, :cond_20

    .line 647
    .line 648
    sget-object v1, La/s3q;->b:La/s3q;

    .line 649
    .line 650
    invoke-virtual {v0, v1}, La/h52;->M(La/s3q;)V

    .line 651
    .line 652
    .line 653
    return-void

    .line 654
    :cond_20
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v5

    .line 658
    check-cast v5, La/c52;

    .line 659
    .line 660
    iget-object v5, v5, La/c52;->b:Ljava/util/List;

    .line 661
    .line 662
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 663
    .line 664
    .line 665
    move-result-object v5

    .line 666
    :cond_21
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 667
    .line 668
    .line 669
    move-result v6

    .line 670
    if-eqz v6, :cond_22

    .line 671
    .line 672
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v6

    .line 676
    move-object v7, v6

    .line 677
    check-cast v7, La/h0w;

    .line 678
    .line 679
    invoke-static {v7}, La/xnm0;->k(La/h0w;)I

    .line 680
    .line 681
    .line 682
    move-result v7

    .line 683
    if-ne v7, v1, :cond_21

    .line 684
    .line 685
    goto :goto_6

    .line 686
    :cond_22
    move-object v6, v10

    .line 687
    :goto_6
    check-cast v6, La/h0w;

    .line 688
    .line 689
    if-nez v6, :cond_23

    .line 690
    .line 691
    goto/16 :goto_a

    .line 692
    .line 693
    :cond_23
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    check-cast v1, La/c52;

    .line 698
    .line 699
    iget-object v1, v1, La/c52;->b:Ljava/util/List;

    .line 700
    .line 701
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 702
    .line 703
    .line 704
    move-result v5

    .line 705
    if-eqz v5, :cond_24

    .line 706
    .line 707
    move v5, v4

    .line 708
    goto :goto_8

    .line 709
    :cond_24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    move v5, v4

    .line 714
    :cond_25
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 715
    .line 716
    .line 717
    move-result v7

    .line 718
    if-eqz v7, :cond_27

    .line 719
    .line 720
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v7

    .line 724
    check-cast v7, La/h0w;

    .line 725
    .line 726
    iget-boolean v7, v7, La/h0w;->b:Z

    .line 727
    .line 728
    if-eqz v7, :cond_25

    .line 729
    .line 730
    add-int/lit8 v5, v5, 0x1

    .line 731
    .line 732
    if-ltz v5, :cond_26

    .line 733
    .line 734
    goto :goto_7

    .line 735
    :cond_26
    invoke-static {}, La/q3d;->o()V

    .line 736
    .line 737
    .line 738
    throw v10

    .line 739
    :cond_27
    :goto_8
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    check-cast v1, La/c52;

    .line 744
    .line 745
    iget-object v1, v1, La/c52;->a:Ljava/util/List;

    .line 746
    .line 747
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 748
    .line 749
    .line 750
    move-result v1

    .line 751
    if-ne v5, v1, :cond_28

    .line 752
    .line 753
    new-instance v1, La/f52;

    .line 754
    .line 755
    invoke-direct {v1, v6, v4}, La/f52;-><init>(La/h0w;B)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 759
    .line 760
    .line 761
    return-void

    .line 762
    :cond_28
    iget-boolean v1, v6, La/h0w;->b:Z

    .line 763
    .line 764
    if-eqz v1, :cond_29

    .line 765
    .line 766
    if-le v5, v3, :cond_29

    .line 767
    .line 768
    new-instance v1, La/f52;

    .line 769
    .line 770
    invoke-direct {v1, v6, v3}, La/f52;-><init>(La/h0w;B)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 774
    .line 775
    .line 776
    return-void

    .line 777
    :cond_29
    if-nez v1, :cond_2a

    .line 778
    .line 779
    new-instance v1, La/f52;

    .line 780
    .line 781
    invoke-direct {v1, v6, v2}, La/f52;-><init>(La/h0w;B)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 785
    .line 786
    .line 787
    return-void

    .line 788
    :cond_2a
    if-eqz v1, :cond_2f

    .line 789
    .line 790
    if-ne v5, v3, :cond_2f

    .line 791
    .line 792
    new-instance v1, La/xg1;

    .line 793
    .line 794
    const/16 v2, 0x18

    .line 795
    .line 796
    invoke-direct {v1, v2}, La/xg1;-><init>(B)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 800
    .line 801
    .line 802
    return-void

    .line 803
    :cond_2b
    long-to-int v1, v11

    .line 804
    sget-object v11, La/j3q;->c:La/c0o;

    .line 805
    .line 806
    invoke-virtual {v11}, La/b3;->iterator()Ljava/util/Iterator;

    .line 807
    .line 808
    .line 809
    move-result-object v11

    .line 810
    :cond_2c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 811
    .line 812
    .line 813
    move-result v12

    .line 814
    if-eqz v12, :cond_2d

    .line 815
    .line 816
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v12

    .line 820
    move-object v13, v12

    .line 821
    check-cast v13, La/j3q;

    .line 822
    .line 823
    iget-short v13, v13, La/j3q;->a:S

    .line 824
    .line 825
    if-ne v13, v1, :cond_2c

    .line 826
    .line 827
    goto :goto_9

    .line 828
    :cond_2d
    move-object v12, v10

    .line 829
    :goto_9
    check-cast v12, La/j3q;

    .line 830
    .line 831
    if-nez v12, :cond_2e

    .line 832
    .line 833
    goto :goto_a

    .line 834
    :cond_2e
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 835
    .line 836
    .line 837
    move-result v1

    .line 838
    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 839
    .line 840
    const/4 v12, 0x5

    .line 841
    iget-object v13, v0, La/h52;->u:La/ctf0;

    .line 842
    .line 843
    if-eq v1, v2, :cond_36

    .line 844
    .line 845
    const/4 v2, 0x3

    .line 846
    if-eq v1, v2, :cond_34

    .line 847
    .line 848
    const/4 v2, 0x4

    .line 849
    if-eq v1, v2, :cond_30

    .line 850
    .line 851
    :cond_2f
    :goto_a
    return-void

    .line 852
    :cond_30
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    check-cast v1, La/c52;

    .line 857
    .line 858
    iget-boolean v1, v1, La/c52;->j:Z

    .line 859
    .line 860
    if-eqz v1, :cond_33

    .line 861
    .line 862
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 867
    .line 868
    .line 869
    move-result-wide v5

    .line 870
    invoke-static {v5, v6, v1}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 871
    .line 872
    .line 873
    move-result-object v19

    .line 874
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    check-cast v2, La/c52;

    .line 879
    .line 880
    iget v2, v2, La/c52;->k:I

    .line 881
    .line 882
    sub-int/2addr v2, v3

    .line 883
    neg-int v2, v2

    .line 884
    invoke-virtual {v1, v12, v2}, Ljava/util/Calendar;->add(II)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 888
    .line 889
    .line 890
    move-result-wide v2

    .line 891
    invoke-static {v2, v3, v1}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 892
    .line 893
    .line 894
    move-result-object v18

    .line 895
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    check-cast v2, La/c52;

    .line 900
    .line 901
    iget-object v2, v2, La/c52;->e:La/wdj;

    .line 902
    .line 903
    instance-of v3, v2, La/vdj;

    .line 904
    .line 905
    if-eqz v3, :cond_31

    .line 906
    .line 907
    check-cast v2, La/vdj;

    .line 908
    .line 909
    goto :goto_b

    .line 910
    :cond_31
    move-object v2, v10

    .line 911
    :goto_b
    new-array v3, v4, [Ljava/lang/Object;

    .line 912
    .line 913
    iget-object v5, v13, La/ctf0;->b:La/lsm0;

    .line 914
    .line 915
    iget-object v6, v13, La/ctf0;->b:La/lsm0;

    .line 916
    .line 917
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v3

    .line 921
    const v7, 0x7f13030e

    .line 922
    .line 923
    .line 924
    invoke-virtual {v5, v7, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object v15

    .line 928
    new-array v3, v4, [Ljava/lang/Object;

    .line 929
    .line 930
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v3

    .line 934
    const v5, 0x7f131379

    .line 935
    .line 936
    .line 937
    invoke-virtual {v6, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v16

    .line 941
    new-array v3, v4, [Ljava/lang/Object;

    .line 942
    .line 943
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    const v4, 0x7f130798

    .line 948
    .line 949
    .line 950
    invoke-virtual {v6, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v17

    .line 954
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v3

    .line 958
    check-cast v3, La/c52;

    .line 959
    .line 960
    iget v3, v3, La/c52;->k:I

    .line 961
    .line 962
    if-eqz v2, :cond_32

    .line 963
    .line 964
    new-instance v10, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 965
    .line 966
    iget-wide v4, v2, La/vdj;->a:J

    .line 967
    .line 968
    invoke-virtual {v11, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 969
    .line 970
    .line 971
    move-result-wide v4

    .line 972
    invoke-static {v4, v5, v1}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 973
    .line 974
    .line 975
    move-result-object v4

    .line 976
    iget-wide v5, v2, La/vdj;->b:J

    .line 977
    .line 978
    invoke-virtual {v11, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 979
    .line 980
    .line 981
    move-result-wide v5

    .line 982
    invoke-static {v5, v6, v1}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    invoke-direct {v10, v4, v1}, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 987
    .line 988
    .line 989
    :cond_32
    move-object/from16 v22, v10

    .line 990
    .line 991
    new-instance v14, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 992
    .line 993
    const/16 v20, 0x0

    .line 994
    .line 995
    move/from16 v21, v3

    .line 996
    .line 997
    invoke-direct/range {v14 .. v22}, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/lang/Integer;ILorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;)V

    .line 998
    .line 999
    .line 1000
    new-instance v1, La/y42;

    .line 1001
    .line 1002
    invoke-direct {v1, v14}, La/y42;-><init>(Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1006
    .line 1007
    .line 1008
    return-void

    .line 1009
    :cond_33
    new-instance v1, La/z42;

    .line 1010
    .line 1011
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v2

    .line 1015
    check-cast v2, La/c52;

    .line 1016
    .line 1017
    iget v2, v2, La/c52;->k:I

    .line 1018
    .line 1019
    invoke-direct {v1, v8, v9, v2}, La/z42;-><init>(JI)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    return-void

    .line 1026
    :cond_34
    iget-object v1, v6, La/ocj;->a:La/p7m0;

    .line 1027
    .line 1028
    :cond_35
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1033
    .line 1034
    .line 1035
    move-object v2, v0

    .line 1036
    check-cast v2, La/c52;

    .line 1037
    .line 1038
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1039
    .line 1040
    .line 1041
    sget-object v3, La/udj;->a:La/udj;

    .line 1042
    .line 1043
    invoke-static {v2, v10, v10, v3, v7}, La/c52;->a(La/c52;Ljava/util/List;Ljava/util/List;La/wdj;I)La/c52;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v0

    .line 1051
    if-eqz v0, :cond_35

    .line 1052
    .line 1053
    return-void

    .line 1054
    :cond_36
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1059
    .line 1060
    .line 1061
    move-result-wide v5

    .line 1062
    invoke-static {v5, v6, v1}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v2

    .line 1066
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v5

    .line 1070
    check-cast v5, La/c52;

    .line 1071
    .line 1072
    iget v5, v5, La/c52;->k:I

    .line 1073
    .line 1074
    sub-int/2addr v5, v3

    .line 1075
    neg-int v3, v5

    .line 1076
    invoke-virtual {v1, v12, v3}, Ljava/util/Calendar;->add(II)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1080
    .line 1081
    .line 1082
    move-result-wide v5

    .line 1083
    invoke-static {v5, v6, v1}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    new-instance v5, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 1088
    .line 1089
    new-array v6, v4, [Ljava/lang/Object;

    .line 1090
    .line 1091
    iget-object v7, v13, La/ctf0;->b:La/lsm0;

    .line 1092
    .line 1093
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    const v6, 0x7f13030d

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v7, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v4

    .line 1104
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v6

    .line 1108
    check-cast v6, La/c52;

    .line 1109
    .line 1110
    iget-object v6, v6, La/c52;->e:La/wdj;

    .line 1111
    .line 1112
    instance-of v7, v6, La/tdj;

    .line 1113
    .line 1114
    if-eqz v7, :cond_37

    .line 1115
    .line 1116
    check-cast v6, La/tdj;

    .line 1117
    .line 1118
    goto :goto_c

    .line 1119
    :cond_37
    move-object v6, v10

    .line 1120
    :goto_c
    if-eqz v6, :cond_38

    .line 1121
    .line 1122
    iget-wide v6, v6, La/tdj;->a:J

    .line 1123
    .line 1124
    invoke-virtual {v11, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 1125
    .line 1126
    .line 1127
    move-result-wide v6

    .line 1128
    invoke-static {v6, v7, v1}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v10

    .line 1132
    :cond_38
    invoke-direct {v5, v4, v3, v2, v10}, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;-><init>(Ljava/lang/String;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 1133
    .line 1134
    .line 1135
    new-instance v1, La/a52;

    .line 1136
    .line 1137
    invoke-direct {v1, v5}, La/a52;-><init>(Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1141
    .line 1142
    .line 1143
    return-void

    .line 1144
    :cond_39
    invoke-static {}, La/t9f;->b()V

    .line 1145
    .line 1146
    .line 1147
    return-void
.end method
