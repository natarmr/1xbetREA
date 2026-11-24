.class public final La/r79;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/s79;


# direct methods
.method public synthetic constructor <init>(La/s79;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r79;->i:B

    iput-object p1, p0, La/r79;->k:La/s79;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r79;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r79;->k:La/s79;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r79;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/r79;-><init>(La/s79;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/r79;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/r79;-><init>(La/s79;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/r79;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/r79;-><init>(La/s79;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/r79;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/r79;-><init>(La/s79;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r79;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/r79;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/r79;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/r79;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/r79;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/r79;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/r79;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/r79;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/r79;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/r79;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/r79;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/r79;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/r79;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r79;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/r79;->k:La/s79;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/r79;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v2, La/s79;->t:La/sdi0;

    .line 34
    .line 35
    sget-object v3, La/psr;->d:La/psr;

    .line 36
    .line 37
    iput-boolean v5, v0, La/r79;->j:Z

    .line 38
    .line 39
    invoke-virtual {v2, v3, v0}, La/sdi0;->a(La/psr;La/bnn0;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v3, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v3

    .line 50
    :pswitch_0
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 51
    .line 52
    sget-object v6, La/wne;->a:La/wne;

    .line 53
    .line 54
    iget-boolean v2, v0, La/r79;->j:Z

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    if-ne v2, v5, :cond_3

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sget v2, La/s79;->A:I

    .line 72
    .line 73
    iget-object v7, v1, La/ocj;->a:La/p7m0;

    .line 74
    .line 75
    :cond_5
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-object v8, v2

    .line 83
    check-cast v8, La/o79;

    .line 84
    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const/16 v17, 0x7eff

    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v11, 0x1

    .line 92
    const/4 v12, 0x0

    .line 93
    const/4 v13, 0x0

    .line 94
    const/4 v14, 0x0

    .line 95
    const/4 v15, 0x0

    .line 96
    invoke-static/range {v8 .. v17}, La/o79;->a(La/o79;ZZZZLa/w3w0;La/w3w0;ZLjava/lang/String;I)La/o79;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v7, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_5

    .line 105
    .line 106
    sget v2, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 107
    .line 108
    const-wide/16 v2, 0x2

    .line 109
    .line 110
    invoke-static {v2, v3}, La/znq0;->f(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v2

    .line 114
    iput-boolean v5, v0, La/r79;->j:Z

    .line 115
    .line 116
    invoke-static {v2, v3, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-ne v0, v6, :cond_6

    .line 121
    .line 122
    move-object v3, v6

    .line 123
    goto :goto_3

    .line 124
    :cond_6
    :goto_2
    sget v0, La/s79;->A:I

    .line 125
    .line 126
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 127
    .line 128
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-object v3, v0

    .line 136
    check-cast v3, La/o79;

    .line 137
    .line 138
    const/4 v11, 0x0

    .line 139
    const/16 v12, 0x7eff

    .line 140
    .line 141
    const/4 v4, 0x0

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x0

    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v8, 0x0

    .line 146
    const/4 v9, 0x0

    .line 147
    const/4 v10, 0x0

    .line 148
    invoke-static/range {v3 .. v12}, La/o79;->a(La/o79;ZZZZLa/w3w0;La/w3w0;ZLjava/lang/String;I)La/o79;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    :goto_3
    return-object v3

    .line 161
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 162
    .line 163
    iget-boolean v6, v0, La/r79;->j:Z

    .line 164
    .line 165
    if-eqz v6, :cond_9

    .line 166
    .line 167
    if-ne v6, v5, :cond_8

    .line 168
    .line 169
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    iget-object v2, v2, La/s79;->t:La/sdi0;

    .line 181
    .line 182
    sget-object v3, La/psr;->f:La/psr;

    .line 183
    .line 184
    iput-boolean v5, v0, La/r79;->j:Z

    .line 185
    .line 186
    invoke-virtual {v2, v3, v0}, La/sdi0;->a(La/psr;La/bnn0;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-ne v0, v1, :cond_a

    .line 191
    .line 192
    move-object v3, v1

    .line 193
    goto :goto_5

    .line 194
    :cond_a
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    :goto_5
    return-object v3

    .line 197
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 198
    .line 199
    iget-boolean v6, v0, La/r79;->j:Z

    .line 200
    .line 201
    if-eqz v6, :cond_c

    .line 202
    .line 203
    if-ne v6, v5, :cond_b

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_b
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget-object v2, v2, La/s79;->t:La/sdi0;

    .line 217
    .line 218
    sget-object v3, La/psr;->b:La/psr;

    .line 219
    .line 220
    iput-boolean v5, v0, La/r79;->j:Z

    .line 221
    .line 222
    invoke-virtual {v2, v3, v0}, La/sdi0;->a(La/psr;La/bnn0;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne v0, v1, :cond_d

    .line 227
    .line 228
    move-object v3, v1

    .line 229
    goto :goto_7

    .line 230
    :cond_d
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    :goto_7
    return-object v3

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
