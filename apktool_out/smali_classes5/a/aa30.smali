.class public final synthetic La/aa30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ncl0;


# direct methods
.method public synthetic constructor <init>(La/ncl0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aa30;->a:B

    iput-object p1, p0, La/aa30;->b:La/ncl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/aa30;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/aa30;->b:La/ncl0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/ncl0;->c:La/vzg0;

    .line 12
    .line 13
    iget-object v0, v0, La/ncl0;->j:La/frs;

    .line 14
    .line 15
    const-string v3, "KEY_SHOW_BETTING"

    .line 16
    .line 17
    invoke-virtual {v1, v3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    :cond_0
    move v4, v2

    .line 30
    const-string v2, "KEY_GAME_ID"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/Long;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    :goto_0
    move-wide v5, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-wide v2, v0, La/frs;->d:J

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :goto_1
    const-string v2, "KEY_CHAMP_ID"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/Long;

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    :goto_2
    move-wide v9, v2

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    iget-wide v2, v0, La/frs;->f:J

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :goto_3
    iget-wide v7, v0, La/frs;->b:J

    .line 69
    .line 70
    iget-wide v11, v0, La/frs;->e:J

    .line 71
    .line 72
    const-string v2, "KEY_LIVE"

    .line 73
    .line 74
    invoke-virtual {v1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    :goto_4
    move v13, v0

    .line 87
    goto :goto_5

    .line 88
    :cond_3
    iget-boolean v0, v0, La/frs;->c:Z

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :goto_5
    new-instance v3, La/zqs;

    .line 92
    .line 93
    const/4 v15, 0x0

    .line 94
    const/16 v18, 0x0

    .line 95
    .line 96
    const/4 v14, 0x0

    .line 97
    const-wide/16 v16, 0x0

    .line 98
    .line 99
    invoke-direct/range {v3 .. v18}, La/zqs;-><init>(ZJJJJZZZJLa/vzj0;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :pswitch_0
    iget-object v0, v0, La/ncl0;->G:La/r9u;

    .line 108
    .line 109
    sget-object v1, La/ygp;->t:La/ygp;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :pswitch_1
    sget v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t1:I

    .line 131
    .line 132
    iget-object v1, v0, La/ncl0;->N:La/p7m0;

    .line 133
    .line 134
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, La/wqs;

    .line 139
    .line 140
    iget-object v3, v3, La/wqs;->a:La/xqs;

    .line 141
    .line 142
    sget-object v4, La/xqs;->b:La/xqs;

    .line 143
    .line 144
    if-ne v3, v4, :cond_4

    .line 145
    .line 146
    goto :goto_9

    .line 147
    :cond_4
    iget-object v3, v0, La/ncl0;->Q:La/p7m0;

    .line 148
    .line 149
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, La/fsr;

    .line 154
    .line 155
    const/4 v5, 0x0

    .line 156
    if-eqz v3, :cond_5

    .line 157
    .line 158
    iget-boolean v3, v3, La/fsr;->b:Z

    .line 159
    .line 160
    if-ne v3, v2, :cond_5

    .line 161
    .line 162
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, La/wqs;

    .line 167
    .line 168
    iget v1, v1, La/wqs;->b:I

    .line 169
    .line 170
    if-nez v1, :cond_5

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_5
    move v2, v5

    .line 174
    :goto_6
    if-eqz v2, :cond_6

    .line 175
    .line 176
    sget-object v1, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->a:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 177
    .line 178
    invoke-virtual {v0, v1}, La/ncl0;->B(Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;)V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_6
    sget-object v1, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->b:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, La/ncl0;->B(Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;)V

    .line 185
    .line 186
    .line 187
    :goto_7
    if-eqz v2, :cond_7

    .line 188
    .line 189
    sget-object v1, La/v39;->b:La/v39;

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_7
    sget-object v1, La/v39;->c:La/v39;

    .line 193
    .line 194
    :goto_8
    iget-object v2, v0, La/ncl0;->J:La/yox;

    .line 195
    .line 196
    invoke-virtual {v0}, La/ncl0;->w()La/qz40;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    check-cast v3, La/p7m0;

    .line 201
    .line 202
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, La/zqs;

    .line 207
    .line 208
    iget-wide v5, v3, La/zqs;->b:J

    .line 209
    .line 210
    invoke-virtual {v2, v5, v6, v1}, La/yox;->p(JLa/v39;)V

    .line 211
    .line 212
    .line 213
    iget-object v1, v0, La/ncl0;->n:La/zsr;

    .line 214
    .line 215
    invoke-virtual {v1}, La/zsr;->a()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v4}, La/ncl0;->C(La/xqs;)V

    .line 219
    .line 220
    .line 221
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_2
    sget v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t1:I

    .line 225
    .line 226
    iget-object v1, v0, La/ncl0;->N:La/p7m0;

    .line 227
    .line 228
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    check-cast v1, La/wqs;

    .line 233
    .line 234
    iget-object v1, v1, La/wqs;->a:La/xqs;

    .line 235
    .line 236
    sget-object v2, La/xqs;->a:La/xqs;

    .line 237
    .line 238
    if-ne v1, v2, :cond_8

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_8
    iget-object v1, v0, La/ncl0;->y:La/lhf0;

    .line 242
    .line 243
    invoke-virtual {v0}, La/ncl0;->w()La/qz40;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, La/p7m0;

    .line 248
    .line 249
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    check-cast v3, La/zqs;

    .line 254
    .line 255
    iget-wide v3, v3, La/zqs;->c:J

    .line 256
    .line 257
    invoke-virtual {v1, v3, v4}, La/lhf0;->M(J)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v2}, La/ncl0;->C(La/xqs;)V

    .line 261
    .line 262
    .line 263
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object v0

    .line 266
    nop

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
