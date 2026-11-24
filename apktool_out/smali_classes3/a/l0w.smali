.class public final La/l0w;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

.field public final p:La/f8w;

.field public final q:La/ugf0;


# direct methods
.method public constructor <init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;La/mne;La/pru;La/ctf0;La/hnu;La/ugf0;)V
    .locals 6

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/mr0;

    .line 5
    .line 6
    const/16 v5, 0x10

    .line 7
    .line 8
    move-object v3, p1

    .line 9
    move-object v4, p2

    .line 10
    move-object v1, p4

    .line 11
    move-object v2, p6

    .line 12
    invoke-direct/range {v0 .. v5}, La/mr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    move-object p1, p3

    .line 16
    move-object p2, v0

    .line 17
    new-instance p3, La/bcn;

    .line 18
    .line 19
    const/16 p4, 0x15

    .line 20
    .line 21
    invoke-direct {p3, p5, p4}, La/bcn;-><init>(La/ctf0;B)V

    .line 22
    .line 23
    .line 24
    iget-object p4, p1, La/mne;->c:La/vs10;

    .line 25
    .line 26
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 27
    .line 28
    invoke-static {p4, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    const/4 p5, 0x0

    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-direct/range {p0 .. p5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 35
    .line 36
    .line 37
    iput-object v3, p0, La/l0w;->o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 38
    .line 39
    iput-object v4, p0, La/l0w;->p:La/f8w;

    .line 40
    .line 41
    iput-object p7, p0, La/l0w;->q:La/ugf0;

    .line 42
    .line 43
    invoke-virtual {p0}, La/l0w;->M()V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 14

    .line 1
    iget-object v0, p0, La/l0w;->o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 2
    .line 3
    sget-object v1, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->g:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/unm0;

    .line 13
    .line 14
    iget-object v0, v0, La/unm0;->a:Ljava/util/List;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    :cond_1
    move v0, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, La/h0w;

    .line 48
    .line 49
    iget-boolean v4, v4, La/h0w;->b:Z

    .line 50
    .line 51
    if-nez v4, :cond_3

    .line 52
    .line 53
    move v0, v2

    .line 54
    :goto_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, La/unm0;

    .line 59
    .line 60
    iget-object v4, v4, La/unm0;->a:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    :cond_4
    move v1, v3

    .line 75
    goto :goto_1

    .line 76
    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, La/h0w;

    .line 91
    .line 92
    iget-boolean v4, v4, La/h0w;->b:Z

    .line 93
    .line 94
    if-nez v4, :cond_6

    .line 95
    .line 96
    move v1, v2

    .line 97
    :goto_1
    iget-object v4, p0, La/i3t0;->i:La/ocj;

    .line 98
    .line 99
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 100
    .line 101
    :cond_7
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-object v6, v5

    .line 109
    check-cast v6, La/unm0;

    .line 110
    .line 111
    iget-object v7, p0, La/i3t0;->f:La/oyg0;

    .line 112
    .line 113
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    if-nez v1, :cond_8

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_8
    move v9, v2

    .line 122
    goto :goto_3

    .line 123
    :cond_9
    :goto_2
    move v9, v3

    .line 124
    :goto_3
    const/4 v12, 0x0

    .line 125
    const/16 v13, 0xf7

    .line 126
    .line 127
    const/4 v7, 0x0

    .line 128
    const/4 v8, 0x0

    .line 129
    const/4 v10, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    invoke-static/range {v6 .. v13}, La/unm0;->a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v4, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_7

    .line 140
    .line 141
    return-void
.end method

.method public final N(Z)Ljava/util/ArrayList;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/unm0;

    .line 6
    .line 7
    iget-object p0, p0, La/unm0;->a:Ljava/util/List;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/h0w;

    .line 35
    .line 36
    invoke-static {v1, p1}, La/h0w;->a(La/h0w;Z)La/h0w;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/a0w;

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
    instance-of v2, v1, La/yzv;

    .line 14
    .line 15
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 16
    .line 17
    iget-object v4, v0, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x2

    .line 21
    iget-object v7, v0, La/l0w;->o:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 22
    .line 23
    const/16 v8, 0xa

    .line 24
    .line 25
    const/4 v9, 0x1

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    check-cast v1, La/yzv;

    .line 29
    .line 30
    iget-object v1, v1, La/yzv;->a:La/jvw;

    .line 31
    .line 32
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, La/unm0;

    .line 37
    .line 38
    iget-object v2, v2, La/unm0;->a:Ljava/util/List;

    .line 39
    .line 40
    new-instance v11, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-direct {v11, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_1

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    check-cast v8, La/h0w;

    .line 64
    .line 65
    iget-object v10, v8, La/h0w;->a:La/jvw;

    .line 66
    .line 67
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    if-eqz v10, :cond_0

    .line 72
    .line 73
    iget-boolean v10, v8, La/h0w;->b:Z

    .line 74
    .line 75
    xor-int/2addr v10, v9

    .line 76
    invoke-static {v8, v10}, La/h0w;->a(La/h0w;Z)La/h0w;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    :cond_0
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 85
    .line 86
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-object v10, v1

    .line 94
    check-cast v10, La/unm0;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const/16 v17, 0xfe

    .line 102
    .line 103
    const/4 v12, 0x0

    .line 104
    const/4 v13, 0x0

    .line 105
    const/4 v14, 0x0

    .line 106
    const/4 v15, 0x0

    .line 107
    invoke-static/range {v10 .. v17}, La/unm0;->a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v2, v1, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    goto/16 :goto_a

    .line 118
    .line 119
    :cond_3
    sget-object v2, La/xzv;->a:La/xzv;

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_5

    .line 126
    .line 127
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, La/unm0;

    .line 132
    .line 133
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 134
    .line 135
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, La/unm0;

    .line 140
    .line 141
    iget-object v2, v2, La/unm0;->b:Ljava/util/List;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_4

    .line 148
    .line 149
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, La/unm0;

    .line 154
    .line 155
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 156
    .line 157
    iget-object v2, v0, La/l0w;->p:La/f8w;

    .line 158
    .line 159
    iget-object v8, v0, La/l0w;->q:La/ugf0;

    .line 160
    .line 161
    invoke-virtual {v8, v1, v7, v2}, La/ugf0;->f0(Ljava/util/List;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;)V

    .line 162
    .line 163
    .line 164
    sget-object v1, La/c0w;->a:La/c0w;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_a

    .line 170
    .line 171
    :cond_4
    sget-object v1, La/b0w;->a:La/b0w;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_a

    .line 177
    .line 178
    :cond_5
    sget-object v2, La/wzv;->a:La/wzv;

    .line 179
    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_8

    .line 185
    .line 186
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, La/unm0;

    .line 191
    .line 192
    iget-object v1, v1, La/unm0;->b:Ljava/util/List;

    .line 193
    .line 194
    new-instance v11, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_6

    .line 212
    .line 213
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, La/h0w;

    .line 218
    .line 219
    invoke-static {v2, v9}, La/h0w;->a(La/h0w;Z)La/h0w;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_6
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 228
    .line 229
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-object v10, v1

    .line 237
    check-cast v10, La/unm0;

    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    const/16 v16, 0x1

    .line 243
    .line 244
    const/16 v17, 0x9e

    .line 245
    .line 246
    const/4 v12, 0x0

    .line 247
    const/4 v13, 0x0

    .line 248
    const/4 v14, 0x0

    .line 249
    const/4 v15, 0x1

    .line 250
    invoke-static/range {v10 .. v17}, La/unm0;->a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-virtual {v2, v1, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_7

    .line 259
    .line 260
    goto/16 :goto_a

    .line 261
    .line 262
    :cond_8
    instance-of v2, v1, La/zzv;

    .line 263
    .line 264
    if-eqz v2, :cond_1b

    .line 265
    .line 266
    check-cast v1, La/zzv;

    .line 267
    .line 268
    iget-object v1, v1, La/zzv;->a:La/ato0;

    .line 269
    .line 270
    instance-of v2, v1, La/xso0;

    .line 271
    .line 272
    if-eqz v2, :cond_e

    .line 273
    .line 274
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, La/unm0;

    .line 279
    .line 280
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 281
    .line 282
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-eqz v2, :cond_a

    .line 287
    .line 288
    :cond_9
    move v1, v9

    .line 289
    goto :goto_2

    .line 290
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-eqz v2, :cond_9

    .line 299
    .line 300
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    check-cast v2, La/h0w;

    .line 305
    .line 306
    iget-boolean v2, v2, La/h0w;->b:Z

    .line 307
    .line 308
    if-nez v2, :cond_b

    .line 309
    .line 310
    move v1, v5

    .line 311
    :goto_2
    xor-int/lit8 v12, v1, 0x1

    .line 312
    .line 313
    if-nez v1, :cond_c

    .line 314
    .line 315
    invoke-virtual {v0, v9}, La/l0w;->N(Z)Ljava/util/ArrayList;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    :goto_3
    move-object v11, v1

    .line 320
    goto :goto_4

    .line 321
    :cond_c
    invoke-virtual {v0, v5}, La/l0w;->N(Z)Ljava/util/ArrayList;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    goto :goto_3

    .line 326
    :goto_4
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 327
    .line 328
    :cond_d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    move-object v10, v1

    .line 336
    check-cast v10, La/unm0;

    .line 337
    .line 338
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    const/16 v16, 0x0

    .line 342
    .line 343
    const/16 v17, 0xea

    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    const/4 v15, 0x0

    .line 347
    move v14, v12

    .line 348
    invoke-static/range {v10 .. v17}, La/unm0;->a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-virtual {v2, v1, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    if-eqz v1, :cond_d

    .line 357
    .line 358
    goto/16 :goto_a

    .line 359
    .line 360
    :cond_e
    instance-of v2, v1, La/yso0;

    .line 361
    .line 362
    if-eqz v2, :cond_14

    .line 363
    .line 364
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, La/unm0;

    .line 369
    .line 370
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 371
    .line 372
    invoke-static {v6, v1}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    if-eqz v1, :cond_10

    .line 377
    .line 378
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_10

    .line 383
    .line 384
    :cond_f
    move v2, v9

    .line 385
    goto :goto_5

    .line 386
    :cond_10
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    :cond_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v10

    .line 394
    if-eqz v10, :cond_f

    .line 395
    .line 396
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v10

    .line 400
    check-cast v10, La/h0w;

    .line 401
    .line 402
    iget-boolean v10, v10, La/h0w;->b:Z

    .line 403
    .line 404
    if-nez v10, :cond_11

    .line 405
    .line 406
    move v2, v5

    .line 407
    :goto_5
    xor-int/2addr v2, v9

    .line 408
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    check-cast v10, La/unm0;

    .line 413
    .line 414
    iget-object v10, v10, La/unm0;->a:Ljava/util/List;

    .line 415
    .line 416
    invoke-static {v10, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    new-instance v11, Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    invoke-direct {v11, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 434
    .line 435
    .line 436
    move-result v8

    .line 437
    if-eqz v8, :cond_12

    .line 438
    .line 439
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    check-cast v8, La/h0w;

    .line 444
    .line 445
    invoke-static {v8, v2}, La/h0w;->a(La/h0w;Z)La/h0w;

    .line 446
    .line 447
    .line 448
    move-result-object v8

    .line 449
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    goto :goto_6

    .line 453
    :cond_12
    invoke-static {v10, v11}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 454
    .line 455
    .line 456
    move-result-object v11

    .line 457
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 458
    .line 459
    :goto_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v8

    .line 463
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-object v10, v8

    .line 467
    check-cast v10, La/unm0;

    .line 468
    .line 469
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    const/4 v15, 0x0

    .line 473
    const/16 v17, 0xbe

    .line 474
    .line 475
    const/4 v12, 0x0

    .line 476
    const/4 v13, 0x0

    .line 477
    const/4 v14, 0x0

    .line 478
    move/from16 v16, v2

    .line 479
    .line 480
    invoke-static/range {v10 .. v17}, La/unm0;->a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-virtual {v1, v8, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_13

    .line 489
    .line 490
    goto/16 :goto_a

    .line 491
    .line 492
    :cond_13
    move/from16 v2, v16

    .line 493
    .line 494
    goto :goto_7

    .line 495
    :cond_14
    instance-of v1, v1, La/zso0;

    .line 496
    .line 497
    if-eqz v1, :cond_1a

    .line 498
    .line 499
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    check-cast v1, La/unm0;

    .line 504
    .line 505
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 506
    .line 507
    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    if-eqz v1, :cond_16

    .line 512
    .line 513
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    if-eqz v2, :cond_16

    .line 518
    .line 519
    :cond_15
    move v2, v9

    .line 520
    goto :goto_8

    .line 521
    :cond_16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    if-eqz v10, :cond_15

    .line 530
    .line 531
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    check-cast v10, La/h0w;

    .line 536
    .line 537
    iget-boolean v10, v10, La/h0w;->b:Z

    .line 538
    .line 539
    if-nez v10, :cond_17

    .line 540
    .line 541
    move v2, v5

    .line 542
    :goto_8
    xor-int/lit8 v15, v2, 0x1

    .line 543
    .line 544
    new-instance v2, Ljava/util/ArrayList;

    .line 545
    .line 546
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 547
    .line 548
    .line 549
    move-result v8

    .line 550
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 551
    .line 552
    .line 553
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 558
    .line 559
    .line 560
    move-result v8

    .line 561
    if-eqz v8, :cond_18

    .line 562
    .line 563
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v8

    .line 567
    check-cast v8, La/h0w;

    .line 568
    .line 569
    invoke-static {v8, v15}, La/h0w;->a(La/h0w;Z)La/h0w;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    goto :goto_9

    .line 577
    :cond_18
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    check-cast v1, La/unm0;

    .line 582
    .line 583
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 584
    .line 585
    invoke-static {v6, v1}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 590
    .line 591
    .line 592
    move-result-object v11

    .line 593
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 594
    .line 595
    :cond_19
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    move-object v10, v2

    .line 603
    check-cast v10, La/unm0;

    .line 604
    .line 605
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    const/16 v16, 0x0

    .line 609
    .line 610
    const/16 v17, 0xde

    .line 611
    .line 612
    const/4 v12, 0x0

    .line 613
    const/4 v13, 0x0

    .line 614
    const/4 v14, 0x0

    .line 615
    invoke-static/range {v10 .. v17}, La/unm0;->a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;

    .line 616
    .line 617
    .line 618
    move-result-object v8

    .line 619
    invoke-virtual {v1, v2, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    if-eqz v2, :cond_19

    .line 624
    .line 625
    goto :goto_a

    .line 626
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 627
    .line 628
    .line 629
    return-void

    .line 630
    :cond_1b
    :goto_a
    sget-object v1, La/k0w;->a:[I

    .line 631
    .line 632
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 633
    .line 634
    .line 635
    move-result v2

    .line 636
    aget v1, v1, v2

    .line 637
    .line 638
    if-ne v1, v9, :cond_2a

    .line 639
    .line 640
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    check-cast v1, La/unm0;

    .line 645
    .line 646
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 647
    .line 648
    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    if-eqz v1, :cond_1d

    .line 653
    .line 654
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    if-eqz v2, :cond_1d

    .line 659
    .line 660
    :cond_1c
    move v1, v5

    .line 661
    goto :goto_b

    .line 662
    :cond_1d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    :cond_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    if-eqz v2, :cond_1c

    .line 671
    .line 672
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    check-cast v2, La/h0w;

    .line 677
    .line 678
    iget-boolean v2, v2, La/h0w;->b:Z

    .line 679
    .line 680
    if-eqz v2, :cond_1e

    .line 681
    .line 682
    move v1, v9

    .line 683
    :goto_b
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    check-cast v2, La/unm0;

    .line 688
    .line 689
    iget-object v2, v2, La/unm0;->a:Ljava/util/List;

    .line 690
    .line 691
    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    if-eqz v2, :cond_20

    .line 696
    .line 697
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 698
    .line 699
    .line 700
    move-result v7

    .line 701
    if-eqz v7, :cond_20

    .line 702
    .line 703
    :cond_1f
    move v15, v9

    .line 704
    goto :goto_c

    .line 705
    :cond_20
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    :cond_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 710
    .line 711
    .line 712
    move-result v7

    .line 713
    if-eqz v7, :cond_1f

    .line 714
    .line 715
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v7

    .line 719
    check-cast v7, La/h0w;

    .line 720
    .line 721
    iget-boolean v7, v7, La/h0w;->b:Z

    .line 722
    .line 723
    if-nez v7, :cond_21

    .line 724
    .line 725
    move v15, v5

    .line 726
    :goto_c
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    check-cast v2, La/unm0;

    .line 731
    .line 732
    iget-object v2, v2, La/unm0;->a:Ljava/util/List;

    .line 733
    .line 734
    invoke-static {v6, v2}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    if-eqz v2, :cond_23

    .line 739
    .line 740
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 741
    .line 742
    .line 743
    move-result v7

    .line 744
    if-eqz v7, :cond_23

    .line 745
    .line 746
    :cond_22
    move v2, v5

    .line 747
    goto :goto_d

    .line 748
    :cond_23
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    :cond_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 753
    .line 754
    .line 755
    move-result v7

    .line 756
    if-eqz v7, :cond_22

    .line 757
    .line 758
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v7

    .line 762
    check-cast v7, La/h0w;

    .line 763
    .line 764
    iget-boolean v7, v7, La/h0w;->b:Z

    .line 765
    .line 766
    if-eqz v7, :cond_24

    .line 767
    .line 768
    move v2, v9

    .line 769
    :goto_d
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v7

    .line 773
    check-cast v7, La/unm0;

    .line 774
    .line 775
    iget-object v7, v7, La/unm0;->a:Ljava/util/List;

    .line 776
    .line 777
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 778
    .line 779
    .line 780
    move-result-object v6

    .line 781
    if-eqz v6, :cond_26

    .line 782
    .line 783
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 784
    .line 785
    .line 786
    move-result v7

    .line 787
    if-eqz v7, :cond_26

    .line 788
    .line 789
    :cond_25
    move/from16 v16, v9

    .line 790
    .line 791
    goto :goto_e

    .line 792
    :cond_26
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 793
    .line 794
    .line 795
    move-result-object v6

    .line 796
    :cond_27
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 797
    .line 798
    .line 799
    move-result v7

    .line 800
    if-eqz v7, :cond_25

    .line 801
    .line 802
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v7

    .line 806
    check-cast v7, La/h0w;

    .line 807
    .line 808
    iget-boolean v7, v7, La/h0w;->b:Z

    .line 809
    .line 810
    if-nez v7, :cond_27

    .line 811
    .line 812
    move/from16 v16, v5

    .line 813
    .line 814
    :goto_e
    iget-object v6, v4, La/ocj;->a:La/p7m0;

    .line 815
    .line 816
    :cond_28
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v4

    .line 820
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    move-object v10, v4

    .line 824
    check-cast v10, La/unm0;

    .line 825
    .line 826
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    if-eqz v1, :cond_29

    .line 830
    .line 831
    if-eqz v2, :cond_29

    .line 832
    .line 833
    move v12, v9

    .line 834
    goto :goto_f

    .line 835
    :cond_29
    move v12, v5

    .line 836
    :goto_f
    const/4 v14, 0x0

    .line 837
    const/16 v17, 0x9b

    .line 838
    .line 839
    const/4 v11, 0x0

    .line 840
    const/4 v13, 0x0

    .line 841
    invoke-static/range {v10 .. v17}, La/unm0;->a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;

    .line 842
    .line 843
    .line 844
    move-result-object v7

    .line 845
    invoke-virtual {v6, v4, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v4

    .line 849
    if-eqz v4, :cond_28

    .line 850
    .line 851
    goto/16 :goto_12

    .line 852
    .line 853
    :cond_2a
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    check-cast v1, La/unm0;

    .line 858
    .line 859
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 860
    .line 861
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 862
    .line 863
    .line 864
    move-result v2

    .line 865
    if-eqz v2, :cond_2c

    .line 866
    .line 867
    :cond_2b
    move v12, v5

    .line 868
    goto :goto_10

    .line 869
    :cond_2c
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    :cond_2d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    if-eqz v2, :cond_2b

    .line 878
    .line 879
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    check-cast v2, La/h0w;

    .line 884
    .line 885
    iget-boolean v2, v2, La/h0w;->b:Z

    .line 886
    .line 887
    if-eqz v2, :cond_2d

    .line 888
    .line 889
    move v12, v9

    .line 890
    :goto_10
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    check-cast v1, La/unm0;

    .line 895
    .line 896
    iget-object v1, v1, La/unm0;->a:Ljava/util/List;

    .line 897
    .line 898
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 899
    .line 900
    .line 901
    move-result v2

    .line 902
    if-eqz v2, :cond_2f

    .line 903
    .line 904
    :cond_2e
    move v14, v9

    .line 905
    goto :goto_11

    .line 906
    :cond_2f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    :cond_30
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 911
    .line 912
    .line 913
    move-result v2

    .line 914
    if-eqz v2, :cond_2e

    .line 915
    .line 916
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    check-cast v2, La/h0w;

    .line 921
    .line 922
    iget-boolean v2, v2, La/h0w;->b:Z

    .line 923
    .line 924
    if-nez v2, :cond_30

    .line 925
    .line 926
    move v14, v5

    .line 927
    :goto_11
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 928
    .line 929
    :cond_31
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    move-object v10, v2

    .line 937
    check-cast v10, La/unm0;

    .line 938
    .line 939
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    const/16 v16, 0x0

    .line 943
    .line 944
    const/16 v17, 0xeb

    .line 945
    .line 946
    const/4 v11, 0x0

    .line 947
    const/4 v13, 0x0

    .line 948
    const/4 v15, 0x0

    .line 949
    invoke-static/range {v10 .. v17}, La/unm0;->a(La/unm0;Ljava/util/ArrayList;ZZZZZI)La/unm0;

    .line 950
    .line 951
    .line 952
    move-result-object v4

    .line 953
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    if-eqz v2, :cond_31

    .line 958
    .line 959
    :goto_12
    invoke-virtual {v0}, La/l0w;->M()V

    .line 960
    .line 961
    .line 962
    return-void
.end method
