.class public final La/ciz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/eiz;


# direct methods
.method public synthetic constructor <init>(La/eiz;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ciz;->i:B

    iput-object p1, p0, La/ciz;->k:La/eiz;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ciz;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ciz;->k:La/eiz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ciz;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/ciz;-><init>(La/eiz;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/ciz;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/ciz;-><init>(La/eiz;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/ciz;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/ciz;-><init>(La/eiz;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ciz;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/ciz;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/ciz;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/ciz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/ciz;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/ciz;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/ciz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/ciz;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/ciz;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/ciz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/ciz;->i:B

    .line 4
    .line 5
    iget-object v6, v5, La/ciz;->k:La/eiz;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v7, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v0, v5, La/ciz;->j:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v6, La/eiz;->s:La/j3c;

    .line 36
    .line 37
    iget-object v1, v6, La/eiz;->o:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 38
    .line 39
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->b:J

    .line 40
    .line 41
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, La/ihz;

    .line 46
    .line 47
    iget-wide v8, v4, La/ihz;->b:J

    .line 48
    .line 49
    iput-boolean v3, v5, La/ciz;->j:Z

    .line 50
    .line 51
    move-wide v3, v8

    .line 52
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-ne v0, v7, :cond_2

    .line 57
    .line 58
    move-object v1, v7

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_0
    move-object v14, v0

    .line 61
    check-cast v14, La/ypl0;

    .line 62
    .line 63
    sget v0, La/eiz;->E:I

    .line 64
    .line 65
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 66
    .line 67
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-object v7, v1

    .line 77
    check-cast v7, La/ihz;

    .line 78
    .line 79
    const/16 v24, 0x0

    .line 80
    .line 81
    const v25, 0x1ffbf

    .line 82
    .line 83
    .line 84
    const-wide/16 v8, 0x0

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    const/4 v11, 0x0

    .line 88
    const/4 v12, 0x0

    .line 89
    const/4 v13, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    const/16 v18, 0x0

    .line 96
    .line 97
    const/16 v19, 0x0

    .line 98
    .line 99
    const/16 v20, 0x0

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const/16 v22, 0x0

    .line 104
    .line 105
    const/16 v23, 0x0

    .line 106
    .line 107
    invoke-static/range {v7 .. v25}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    :goto_1
    return-object v1

    .line 120
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 121
    .line 122
    iget-boolean v4, v5, La/ciz;->j:Z

    .line 123
    .line 124
    if-eqz v4, :cond_5

    .line 125
    .line 126
    if-ne v4, v3, :cond_4

    .line 127
    .line 128
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object v7, v5, La/ciz;->k:La/eiz;

    .line 140
    .line 141
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, La/ihz;

    .line 146
    .line 147
    iget-wide v10, v1, La/ihz;->b:J

    .line 148
    .line 149
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, La/ihz;

    .line 154
    .line 155
    iget v12, v1, La/ihz;->c:I

    .line 156
    .line 157
    iget-object v1, v7, La/eiz;->o:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 158
    .line 159
    iget-wide v8, v1, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->b:J

    .line 160
    .line 161
    new-instance v6, La/diz;

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    invoke-direct/range {v6 .. v13}, La/diz;-><init>(La/eiz;JJILa/yje;)V

    .line 165
    .line 166
    .line 167
    iput-boolean v3, v5, La/ciz;->j:Z

    .line 168
    .line 169
    invoke-static {v5, v6}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    if-ne v1, v0, :cond_6

    .line 174
    .line 175
    move-object v1, v0

    .line 176
    goto :goto_3

    .line 177
    :cond_6
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    :goto_3
    return-object v1

    .line 180
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 181
    .line 182
    iget-boolean v4, v5, La/ciz;->j:Z

    .line 183
    .line 184
    if-eqz v4, :cond_8

    .line 185
    .line 186
    if-ne v4, v3, :cond_7

    .line 187
    .line 188
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    move-object/from16 v0, p1

    .line 192
    .line 193
    check-cast v0, La/j0g0;

    .line 194
    .line 195
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v6, La/eiz;->v:La/n4u;

    .line 206
    .line 207
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, La/ihz;

    .line 212
    .line 213
    iget-object v2, v2, La/ihz;->e:La/qgz;

    .line 214
    .line 215
    iget-object v2, v2, La/qgz;->b:Ljava/lang/String;

    .line 216
    .line 217
    iput-boolean v3, v5, La/ciz;->j:Z

    .line 218
    .line 219
    invoke-virtual {v1, v2, v5}, La/n4u;->g(Ljava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-ne v1, v0, :cond_9

    .line 224
    .line 225
    move-object v1, v0

    .line 226
    goto :goto_5

    .line 227
    :cond_9
    move-object v0, v1

    .line 228
    :goto_4
    new-instance v1, La/biz;

    .line 229
    .line 230
    const/4 v2, 0x0

    .line 231
    invoke-direct {v1, v0, v2}, La/biz;-><init>(Ljava/lang/Object;B)V

    .line 232
    .line 233
    .line 234
    sget v0, La/eiz;->E:I

    .line 235
    .line 236
    invoke-virtual {v6, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    :goto_5
    return-object v1

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
