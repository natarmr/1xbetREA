.class public final La/edr0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic B:I


# instance fields
.field public A:La/bby;

.field public final o:I

.field public final p:La/m1e;

.field public final q:La/zpu;

.field public final r:La/tsc;

.field public final s:La/owp0;

.field public final t:La/i1w0;

.field public final u:La/yo4;

.field public final v:La/zr1;

.field public final w:La/tsc;

.field public x:La/c4m0;

.field public y:La/bby;

.field public z:La/c4m0;


# direct methods
.method public constructor <init>(La/vzg0;ILa/m1e;La/zpu;La/tsc;La/owp0;La/luu;La/mne;La/i1w0;La/ctf0;La/yo4;La/zr1;La/bzt;La/r9u;La/tsc;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p8, p8, La/mne;->c:La/vs10;

    .line 11
    .line 12
    invoke-static {p8, p8}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 13
    .line 14
    .line 15
    move-result-object p8

    .line 16
    new-instance v0, La/yeo0;

    .line 17
    .line 18
    move-object/from16 v1, p13

    .line 19
    .line 20
    move-object/from16 v2, p14

    .line 21
    .line 22
    invoke-direct {v0, v1, p7, p2, v2}, La/yeo0;-><init>(La/bzt;La/luu;ILa/r9u;)V

    .line 23
    .line 24
    .line 25
    new-instance p7, La/h0j0;

    .line 26
    .line 27
    const/16 v1, 0x15

    .line 28
    .line 29
    invoke-direct {p7, p10, v1}, La/h0j0;-><init>(La/ctf0;B)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p1, v0, p8, p7}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;La/g090;Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    iput p2, p0, La/edr0;->o:I

    .line 36
    .line 37
    iput-object p3, p0, La/edr0;->p:La/m1e;

    .line 38
    .line 39
    iput-object p4, p0, La/edr0;->q:La/zpu;

    .line 40
    .line 41
    iput-object p5, p0, La/edr0;->r:La/tsc;

    .line 42
    .line 43
    iput-object p6, p0, La/edr0;->s:La/owp0;

    .line 44
    .line 45
    iput-object p9, p0, La/edr0;->t:La/i1w0;

    .line 46
    .line 47
    iput-object p11, p0, La/edr0;->u:La/yo4;

    .line 48
    .line 49
    iput-object p12, p0, La/edr0;->v:La/zr1;

    .line 50
    .line 51
    move-object/from16 p1, p15

    .line 52
    .line 53
    iput-object p1, p0, La/edr0;->w:La/tsc;

    .line 54
    .line 55
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, La/dbr0;

    .line 60
    .line 61
    iget-object p1, p1, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 62
    .line 63
    iget-object p1, p1, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-lez p1, :cond_0

    .line 70
    .line 71
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, La/dbr0;

    .line 76
    .line 77
    iget-object p1, p1, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 78
    .line 79
    iget-object p1, p1, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p6, p1}, La/owp0;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-virtual {p0}, La/edr0;->M()V

    .line 85
    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 11

    .line 1
    iget-object v0, p0, La/edr0;->y:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/dbr0;

    .line 18
    .line 19
    iget-object v0, v0, La/dbr0;->g:La/wcr0;

    .line 20
    .line 21
    iget-object v0, v0, La/wcr0;->b:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 30
    .line 31
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 32
    .line 33
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-object v3, v2

    .line 41
    check-cast v3, La/dbr0;

    .line 42
    .line 43
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    const/16 v8, 0x1fb

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-static/range {v3 .. v8}, La/dbr0;->a(La/dbr0;ZLorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;La/qar0;La/wcr0;I)La/dbr0;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    :cond_2
    new-instance v3, La/w6q0;

    .line 65
    .line 66
    const/4 v9, 0x0

    .line 67
    const/16 v10, 0x1d

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    const-class v6, La/edr0;

    .line 71
    .line 72
    const-string v7, "handleException"

    .line 73
    .line 74
    const-string v8, "handleException(Ljava/lang/Throwable;)V"

    .line 75
    .line 76
    move-object v5, p0

    .line 77
    invoke-direct/range {v3 .. v10}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 78
    .line 79
    .line 80
    new-instance p0, La/hhb0;

    .line 81
    .line 82
    const/16 v0, 0x1c

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    invoke-direct {p0, v5, v2, v0}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v5, v2, v3, p0, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iput-object p0, v5, La/edr0;->y:La/bby;

    .line 93
    .line 94
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-object p0, p0, La/edr0;->w:La/tsc;

    .line 2
    .line 3
    iget-object p0, p0, La/tsc;->a:La/dhm0;

    .line 4
    .line 5
    iget-object p0, p0, La/dhm0;->d:La/oar0;

    .line 6
    .line 7
    iget-object p0, p0, La/oar0;->a:La/p7m0;

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, La/sar0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, La/n9r0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {v2, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La/g9r0;->a:La/g9r0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v8, 0x3

    .line 20
    const/4 v9, 0x1

    .line 21
    const/4 v10, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v0, v2, La/edr0;->x:La/c4m0;

    .line 25
    .line 26
    const/4 v11, 0x4

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-ne v0, v9, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, v2, La/edr0;->p:La/m1e;

    .line 37
    .line 38
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, La/z2n0;

    .line 43
    .line 44
    const/16 v3, 0x18

    .line 45
    .line 46
    invoke-direct {v1, v2, v10, v3}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 47
    .line 48
    .line 49
    new-instance v12, La/fnq;

    .line 50
    .line 51
    invoke-direct {v12, v0, v1, v11}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 52
    .line 53
    .line 54
    new-instance v0, La/ddr0;

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v1, 0x1

    .line 59
    const-class v3, La/edr0;

    .line 60
    .line 61
    const-string v4, "handleException"

    .line 62
    .line 63
    const-string v5, "handleException(Ljava/lang/Throwable;)V"

    .line 64
    .line 65
    invoke-direct/range {v0 .. v7}, La/ddr0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v12, v10, v0, v9}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, v2, La/edr0;->x:La/c4m0;

    .line 73
    .line 74
    :goto_0
    iget-object v0, v2, La/edr0;->z:La/c4m0;

    .line 75
    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-ne v0, v9, :cond_1

    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :cond_1
    iget-object v0, v2, La/edr0;->r:La/tsc;

    .line 87
    .line 88
    iget-object v0, v0, La/tsc;->a:La/dhm0;

    .line 89
    .line 90
    iget-object v0, v0, La/dhm0;->d:La/oar0;

    .line 91
    .line 92
    iget-object v0, v0, La/oar0;->a:La/p7m0;

    .line 93
    .line 94
    new-instance v1, La/i89;

    .line 95
    .line 96
    const/16 v3, 0x16

    .line 97
    .line 98
    invoke-direct {v1, v0, v3}, La/i89;-><init>(La/gmq;B)V

    .line 99
    .line 100
    .line 101
    new-instance v0, La/rtq0;

    .line 102
    .line 103
    invoke-direct {v0, v2, v10, v9}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 104
    .line 105
    .line 106
    new-instance v3, La/fnq;

    .line 107
    .line 108
    invoke-direct {v3, v1, v0, v11}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v3, v10, v10, v8}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, v2, La/edr0;->z:La/c4m0;

    .line 116
    .line 117
    return-void

    .line 118
    :cond_2
    sget-object v1, La/e9r0;->a:La/e9r0;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    iget-object v0, v2, La/edr0;->y:La/bby;

    .line 127
    .line 128
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, v2, La/edr0;->z:La/c4m0;

    .line 132
    .line 133
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 134
    .line 135
    .line 136
    iget-object v0, v2, La/edr0;->A:La/bby;

    .line 137
    .line 138
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_3
    sget-object v1, La/f9r0;->a:La/f9r0;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_4

    .line 149
    .line 150
    invoke-virtual {v2}, La/i3t0;->E()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_4
    sget-object v1, La/h9r0;->a:La/h9r0;

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 161
    .line 162
    iget-object v4, v2, La/i3t0;->i:La/ocj;

    .line 163
    .line 164
    const/4 v5, 0x0

    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, La/dbr0;

    .line 172
    .line 173
    iget-object v0, v0, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 174
    .line 175
    iget-boolean v0, v0, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;->a:Z

    .line 176
    .line 177
    if-eqz v0, :cond_7

    .line 178
    .line 179
    iget-object v0, v2, La/edr0;->A:La/bby;

    .line 180
    .line 181
    if-eqz v0, :cond_5

    .line 182
    .line 183
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 184
    .line 185
    .line 186
    :cond_5
    iget-object v0, v4, La/ocj;->a:La/p7m0;

    .line 187
    .line 188
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-object v6, v1

    .line 196
    check-cast v6, La/dbr0;

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v4, v6, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 202
    .line 203
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    new-instance v8, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 207
    .line 208
    const-string v4, ""

    .line 209
    .line 210
    invoke-direct {v8, v4, v5}, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;-><init>(Ljava/lang/String;Z)V

    .line 211
    .line 212
    .line 213
    const-string v7, "SEARCH_MODEL_KEY"

    .line 214
    .line 215
    invoke-static {v3, v8, v7}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    const/4 v10, 0x0

    .line 219
    const/16 v11, 0x1df

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v9, 0x0

    .line 223
    invoke-static/range {v6 .. v11}, La/dbr0;->a(La/dbr0;ZLorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;La/qar0;La/wcr0;I)La/dbr0;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-virtual {v0, v1, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_6

    .line 232
    .line 233
    iget-object v0, v2, La/edr0;->s:La/owp0;

    .line 234
    .line 235
    invoke-virtual {v0, v4}, La/owp0;->h(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_7
    iget-object v0, v2, La/edr0;->t:La/i1w0;

    .line 240
    .line 241
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    new-instance v2, La/c8d;

    .line 246
    .line 247
    sget-object v3, La/y7d;->a:La/v7d;

    .line 248
    .line 249
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 250
    .line 251
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v1, v2, v0, v1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    :goto_1
    move-object v2, v1

    .line 259
    check-cast v2, La/paw;

    .line 260
    .line 261
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_f

    .line 266
    .line 267
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, La/oe50;

    .line 272
    .line 273
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 274
    .line 275
    .line 276
    goto :goto_1

    .line 277
    :cond_8
    sget-object v1, La/j9r0;->a:La/j9r0;

    .line 278
    .line 279
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    iget-object v6, v2, La/edr0;->v:La/zr1;

    .line 284
    .line 285
    const-string v7, "championship_id"

    .line 286
    .line 287
    iget v11, v2, La/edr0;->o:I

    .line 288
    .line 289
    iget-object v12, v2, La/edr0;->u:La/yo4;

    .line 290
    .line 291
    if-eqz v1, :cond_9

    .line 292
    .line 293
    sget-object v0, La/cbr0;->a:La/cbr0;

    .line 294
    .line 295
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    iget-object v0, v12, La/yo4;->a:La/kt2;

    .line 299
    .line 300
    const-string v1, "bet_statistic_player_info_call"

    .line 301
    .line 302
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-static {v7, v2, v0, v1}, La/b1j;->w(Ljava/lang/String;Ljava/lang/Integer;La/kt2;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    iget-object v0, v6, La/zr1;->a:La/s1p;

    .line 310
    .line 311
    const-wide/16 v1, 0xc27

    .line 312
    .line 313
    invoke-static {v11, v0, v1, v2}, La/b1j;->r(ILa/s1p;J)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :cond_9
    instance-of v1, v0, La/m9r0;

    .line 318
    .line 319
    if-eqz v1, :cond_b

    .line 320
    .line 321
    check-cast v0, La/m9r0;

    .line 322
    .line 323
    iget-wide v0, v0, La/m9r0;->a:J

    .line 324
    .line 325
    long-to-int v0, v0

    .line 326
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, La/dbr0;

    .line 331
    .line 332
    iget-boolean v1, v1, La/dbr0;->d:Z

    .line 333
    .line 334
    if-nez v1, :cond_a

    .line 335
    .line 336
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    check-cast v1, La/dbr0;

    .line 341
    .line 342
    iget-object v1, v1, La/dbr0;->g:La/wcr0;

    .line 343
    .line 344
    iget-object v1, v1, La/wcr0;->b:Ljava/util/List;

    .line 345
    .line 346
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    if-nez v1, :cond_a

    .line 351
    .line 352
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    check-cast v1, La/dbr0;

    .line 357
    .line 358
    iget-object v1, v1, La/dbr0;->g:La/wcr0;

    .line 359
    .line 360
    iget-object v1, v1, La/wcr0;->b:Ljava/util/List;

    .line 361
    .line 362
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    check-cast v1, La/tcr0;

    .line 367
    .line 368
    iget v3, v1, La/tcr0;->b:I

    .line 369
    .line 370
    iget-object v4, v6, La/zr1;->a:La/s1p;

    .line 371
    .line 372
    new-instance v6, La/i1p;

    .line 373
    .line 374
    const/4 v8, 0x2

    .line 375
    invoke-direct {v6, v11, v8}, La/i1p;-><init>(IB)V

    .line 376
    .line 377
    .line 378
    new-instance v10, La/i1p;

    .line 379
    .line 380
    invoke-direct {v10, v3, v5}, La/i1p;-><init>(IB)V

    .line 381
    .line 382
    .line 383
    new-array v3, v8, [La/k1p;

    .line 384
    .line 385
    aput-object v6, v3, v5

    .line 386
    .line 387
    aput-object v10, v3, v9

    .line 388
    .line 389
    invoke-static {v3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    const-wide/16 v8, 0xc28

    .line 394
    .line 395
    invoke-virtual {v4, v3, v8, v9}, La/s1p;->a(Ljava/util/Set;J)V

    .line 396
    .line 397
    .line 398
    iget v1, v1, La/tcr0;->b:I

    .line 399
    .line 400
    iget-object v3, v12, La/yo4;->a:La/kt2;

    .line 401
    .line 402
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    new-instance v6, Lkotlin/Pair;

    .line 407
    .line 408
    invoke-direct {v6, v7, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    new-instance v4, Lkotlin/Pair;

    .line 416
    .line 417
    const-string v7, "point"

    .line 418
    .line 419
    invoke-direct {v4, v7, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    filled-new-array {v6, v4}, [Lkotlin/Pair;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-static {v1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    const-string v4, "bet_statistic_player_type_call"

    .line 431
    .line 432
    invoke-interface {v3, v4, v1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 433
    .line 434
    .line 435
    :cond_a
    new-instance v1, La/u49;

    .line 436
    .line 437
    const/16 v3, 0x1d

    .line 438
    .line 439
    invoke-direct {v1, v3, v0, v5}, La/u49;-><init>(BIZ)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    :cond_b
    instance-of v1, v0, La/l9r0;

    .line 447
    .line 448
    if-eqz v1, :cond_10

    .line 449
    .line 450
    check-cast v0, La/l9r0;

    .line 451
    .line 452
    iget-object v0, v0, La/l9r0;->a:Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    check-cast v1, La/dbr0;

    .line 459
    .line 460
    iget-object v1, v1, La/dbr0;->g:La/wcr0;

    .line 461
    .line 462
    iget-object v1, v1, La/wcr0;->b:Ljava/util/List;

    .line 463
    .line 464
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    if-nez v1, :cond_f

    .line 469
    .line 470
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    check-cast v1, La/dbr0;

    .line 475
    .line 476
    iget-object v1, v1, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 477
    .line 478
    iget-boolean v1, v1, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;->a:Z

    .line 479
    .line 480
    if-nez v1, :cond_c

    .line 481
    .line 482
    goto :goto_2

    .line 483
    :cond_c
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 484
    .line 485
    :cond_d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    move-object v11, v4

    .line 493
    check-cast v11, La/dbr0;

    .line 494
    .line 495
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    iget-object v5, v11, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 499
    .line 500
    iget-boolean v5, v5, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;->a:Z

    .line 501
    .line 502
    new-instance v13, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 503
    .line 504
    invoke-direct {v13, v0, v5}, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;-><init>(Ljava/lang/String;Z)V

    .line 505
    .line 506
    .line 507
    const/4 v15, 0x0

    .line 508
    const/16 v16, 0x1df

    .line 509
    .line 510
    const/4 v12, 0x0

    .line 511
    const/4 v14, 0x0

    .line 512
    invoke-static/range {v11 .. v16}, La/dbr0;->a(La/dbr0;ZLorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;La/qar0;La/wcr0;I)La/dbr0;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    invoke-virtual {v1, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v4

    .line 520
    if-eqz v4, :cond_d

    .line 521
    .line 522
    iget-object v1, v2, La/edr0;->A:La/bby;

    .line 523
    .line 524
    if-eqz v1, :cond_e

    .line 525
    .line 526
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 527
    .line 528
    .line 529
    :cond_e
    new-instance v1, La/gv60;

    .line 530
    .line 531
    const/16 v3, 0x15

    .line 532
    .line 533
    invoke-direct {v1, v2, v0, v10, v3}, La/gv60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 534
    .line 535
    .line 536
    invoke-static {v2, v10, v10, v1, v8}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    iput-object v0, v2, La/edr0;->A:La/bby;

    .line 541
    .line 542
    :cond_f
    :goto_2
    return-void

    .line 543
    :cond_10
    instance-of v1, v0, La/k9r0;

    .line 544
    .line 545
    if-eqz v1, :cond_11

    .line 546
    .line 547
    new-instance v1, La/p6r0;

    .line 548
    .line 549
    const/4 v3, 0x5

    .line 550
    invoke-direct {v1, v0, v3}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :cond_11
    sget-object v1, La/i9r0;->a:La/i9r0;

    .line 558
    .line 559
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-eqz v0, :cond_12

    .line 564
    .line 565
    invoke-virtual {v2}, La/edr0;->M()V

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 570
    .line 571
    .line 572
    return-void
.end method
