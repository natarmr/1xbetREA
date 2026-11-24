.class public final La/y2a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

.field public final b:La/n0o0;

.field public final c:La/n0o0;

.field public final d:La/mdm;


# direct methods
.method public constructor <init>(Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;La/p2a0;La/ocl;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y2a0;->a:Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

    .line 5
    .line 6
    iget-object p1, p2, La/p2a0;->d:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, La/er90;

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/er90;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/yw9;

    .line 16
    .line 17
    const/16 v2, 0x14

    .line 18
    .line 19
    invoke-direct {v1, p1, v0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/y2a0;->b:La/n0o0;

    .line 27
    .line 28
    iget-object p1, p2, La/p2a0;->e:Ljava/util/List;

    .line 29
    .line 30
    new-instance p2, La/er90;

    .line 31
    .line 32
    const/16 v0, 0x9

    .line 33
    .line 34
    invoke-direct {p2, v0}, La/er90;-><init>(B)V

    .line 35
    .line 36
    .line 37
    new-instance v0, La/yw9;

    .line 38
    .line 39
    invoke-direct {v0, p1, p2, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/y2a0;->c:La/n0o0;

    .line 47
    .line 48
    sget-object v1, La/pb10;->g:La/pb10;

    .line 49
    .line 50
    const-wide/16 v9, 0x0

    .line 51
    .line 52
    const/16 v11, 0x25e

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    const v5, 0x7f130677

    .line 58
    .line 59
    .line 60
    const v6, 0x7f131690

    .line 61
    .line 62
    .line 63
    const-wide/16 v7, 0x2710

    .line 64
    .line 65
    move-object v0, p3

    .line 66
    invoke-static/range {v0 .. v11}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, La/y2a0;->d:La/mdm;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/p2a0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/y2a0;->b:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, La/fee;

    .line 17
    .line 18
    iget-object v4, v1, La/p2a0;->d:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v3, v4}, La/fee;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v0, La/y2a0;->c:La/n0o0;

    .line 24
    .line 25
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, La/fee;

    .line 30
    .line 31
    iget-object v5, v1, La/p2a0;->e:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {v4, v5}, La/fee;->d(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v4, v1, La/p2a0;->a:La/rvm0;

    .line 37
    .line 38
    iget-object v4, v4, La/rvm0;->c:Ljava/lang/String;

    .line 39
    .line 40
    const-string v5, ""

    .line 41
    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    move-object v6, v5

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v6, v4

    .line 47
    :goto_0
    iget-boolean v7, v1, La/p2a0;->c:Z

    .line 48
    .line 49
    iget-boolean v8, v1, La/p2a0;->b:Z

    .line 50
    .line 51
    new-instance v9, La/imm;

    .line 52
    .line 53
    new-instance v10, La/ilm;

    .line 54
    .line 55
    sget-object v11, La/s6t0;->a:La/pz40;

    .line 56
    .line 57
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    iget-object v11, v11, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 62
    .line 63
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 64
    .line 65
    .line 66
    move-result-wide v11

    .line 67
    invoke-direct {v10, v11, v12}, La/ilm;-><init>(J)V

    .line 68
    .line 69
    .line 70
    new-instance v11, La/plm;

    .line 71
    .line 72
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    iget-object v12, v12, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 77
    .line 78
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 79
    .line 80
    .line 81
    move-result-wide v12

    .line 82
    sget-object v14, La/fa50;->a:La/fa50;

    .line 83
    .line 84
    invoke-direct {v11, v6, v12, v13, v14}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 85
    .line 86
    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    new-instance v6, La/dmm;

    .line 90
    .line 91
    new-instance v7, La/ta50;

    .line 92
    .line 93
    new-instance v12, La/wkm;

    .line 94
    .line 95
    if-eqz v8, :cond_1

    .line 96
    .line 97
    const v13, 0x7f080b59

    .line 98
    .line 99
    .line 100
    :goto_1
    move v14, v13

    .line 101
    goto :goto_2

    .line 102
    :cond_1
    const v13, 0x7f080b58

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :goto_2
    if-eqz v8, :cond_2

    .line 107
    .line 108
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    iget-object v8, v8, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 113
    .line 114
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 115
    .line 116
    .line 117
    move-result-wide v15

    .line 118
    :goto_3
    move-wide/from16 v17, v15

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_2
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    iget-object v8, v8, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 126
    .line 127
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 128
    .line 129
    .line 130
    move-result-wide v15

    .line 131
    goto :goto_3

    .line 132
    :goto_4
    const/4 v13, 0x1

    .line 133
    const/4 v15, 0x1

    .line 134
    sget-object v16, La/ra50;->a:La/ra50;

    .line 135
    .line 136
    invoke-direct/range {v12 .. v18}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 137
    .line 138
    .line 139
    invoke-direct {v7, v12}, La/ta50;-><init>(La/wkm;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {v6, v7}, La/dmm;-><init>(La/wa50;)V

    .line 143
    .line 144
    .line 145
    :goto_5
    move-object v12, v6

    .line 146
    goto :goto_6

    .line 147
    :cond_3
    sget-object v6, La/fmm;->a:La/fmm;

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :goto_6
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 155
    .line 156
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 157
    .line 158
    .line 159
    move-result-wide v13

    .line 160
    const/4 v15, 0x0

    .line 161
    const/16 v16, 0x0

    .line 162
    .line 163
    invoke-direct/range {v9 .. v16}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 164
    .line 165
    .line 166
    iget-boolean v1, v1, La/p2a0;->f:Z

    .line 167
    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    new-instance v1, La/w2a0;

    .line 171
    .line 172
    iget-object v0, v0, La/y2a0;->d:La/mdm;

    .line 173
    .line 174
    invoke-direct {v1, v0, v9}, La/w2a0;-><init>(La/mdm;La/imm;)V

    .line 175
    .line 176
    .line 177
    return-object v1

    .line 178
    :cond_4
    new-instance v1, La/v2a0;

    .line 179
    .line 180
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, La/fee;

    .line 185
    .line 186
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    check-cast v2, La/a4x;

    .line 191
    .line 192
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    check-cast v3, La/fee;

    .line 197
    .line 198
    invoke-virtual {v3}, La/fee;->b()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, La/a4x;

    .line 203
    .line 204
    new-instance v10, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;

    .line 205
    .line 206
    iget-object v0, v0, La/y2a0;->a:Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

    .line 207
    .line 208
    iget-wide v11, v0, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;->d:J

    .line 209
    .line 210
    iget-wide v13, v0, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;->a:J

    .line 211
    .line 212
    iget-wide v6, v0, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;->b:J

    .line 213
    .line 214
    iget-boolean v0, v0, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;->c:Z

    .line 215
    .line 216
    if-nez v4, :cond_5

    .line 217
    .line 218
    move-object/from16 v18, v5

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_5
    move-object/from16 v18, v4

    .line 222
    .line 223
    :goto_7
    new-instance v17, La/vq2;

    .line 224
    .line 225
    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    .line 226
    .line 227
    .line 228
    move/from16 v19, v0

    .line 229
    .line 230
    move-wide v15, v6

    .line 231
    invoke-direct/range {v10 .. v19}, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;-><init>(JJJLa/ms2;Ljava/lang/String;Z)V

    .line 232
    .line 233
    .line 234
    invoke-direct {v1, v9, v2, v3, v10}, La/v2a0;-><init>(La/imm;La/a4x;La/a4x;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;)V

    .line 235
    .line 236
    .line 237
    return-object v1
.end method
