.class public final La/ll40;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/nl40;


# direct methods
.method public synthetic constructor <init>(La/nl40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ll40;->i:B

    iput-object p1, p0, La/ll40;->k:La/nl40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ll40;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ll40;->k:La/nl40;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ll40;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ll40;-><init>(La/nl40;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/ll40;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/ll40;-><init>(La/nl40;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/ll40;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, La/ll40;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {v0, p0, p2, v1}, La/ll40;-><init>(La/nl40;La/yje;B)V

    .line 34
    .line 35
    .line 36
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    iput-boolean p0, v0, La/ll40;->j:Z

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_2
    new-instance v0, La/ll40;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, p2, v1}, La/ll40;-><init>(La/nl40;La/yje;B)V

    .line 49
    .line 50
    .line 51
    check-cast p1, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    iput-boolean p0, v0, La/ll40;->j:Z

    .line 58
    .line 59
    return-object v0

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ll40;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ll40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ll40;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ll40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/ll40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ll40;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ll40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    check-cast p2, La/yje;

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, La/ll40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/ll40;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/ll40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    check-cast p2, La/yje;

    .line 69
    .line 70
    invoke-virtual {p0, p1, p2}, La/ll40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/ll40;

    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/ll40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/ll40;->i:B

    .line 4
    .line 5
    iget-object v6, v5, La/ll40;->k:La/nl40;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v7, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v0, v5, La/ll40;->j:Z

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object/from16 v0, p1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v6, La/nl40;->C:La/j3c;

    .line 36
    .line 37
    iget-object v2, v6, La/nl40;->r:Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;

    .line 38
    .line 39
    iget-wide v3, v2, Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;->e:J

    .line 40
    .line 41
    iget-wide v8, v2, Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;->d:J

    .line 42
    .line 43
    iput-boolean v1, v5, La/ll40;->j:Z

    .line 44
    .line 45
    move-wide v1, v3

    .line 46
    move-wide v3, v8

    .line 47
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-ne v0, v7, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    move-object v11, v0

    .line 55
    check-cast v11, La/ypl0;

    .line 56
    .line 57
    sget v0, La/nl40;->a0:I

    .line 58
    .line 59
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 60
    .line 61
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 62
    .line 63
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-object v7, v1

    .line 71
    check-cast v7, La/dl40;

    .line 72
    .line 73
    const-wide/16 v22, 0x0

    .line 74
    .line 75
    const v24, 0xffffef

    .line 76
    .line 77
    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v12, 0x0

    .line 82
    const/4 v13, 0x0

    .line 83
    const/4 v14, 0x0

    .line 84
    const/4 v15, 0x0

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const/16 v17, 0x0

    .line 88
    .line 89
    const/16 v18, 0x0

    .line 90
    .line 91
    const/16 v19, 0x0

    .line 92
    .line 93
    const/16 v20, 0x0

    .line 94
    .line 95
    const/16 v21, 0x0

    .line 96
    .line 97
    invoke-static/range {v7 .. v24}, La/dl40;->a(La/dl40;La/gps;La/jlr;La/mi40;La/ypl0;La/bqr;ZLjava/util/List;ZZLa/yws;La/szj0;La/o4i0;ZLjava/util/ArrayList;JI)La/dl40;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    :goto_1
    return-object v7

    .line 110
    :pswitch_0
    iget-boolean v0, v5, La/ll40;->j:Z

    .line 111
    .line 112
    sget-object v1, La/wne;->a:La/wne;

    .line 113
    .line 114
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget v1, La/nl40;->a0:I

    .line 118
    .line 119
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 120
    .line 121
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 122
    .line 123
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-object v12, v2

    .line 131
    check-cast v12, La/dl40;

    .line 132
    .line 133
    const-wide/16 v27, 0x0

    .line 134
    .line 135
    const v29, 0xfffdff

    .line 136
    .line 137
    .line 138
    const/4 v13, 0x0

    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x0

    .line 141
    const/16 v16, 0x0

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    const/16 v19, 0x0

    .line 146
    .line 147
    const/16 v20, 0x0

    .line 148
    .line 149
    const/16 v21, 0x0

    .line 150
    .line 151
    const/16 v22, 0x0

    .line 152
    .line 153
    const/16 v23, 0x0

    .line 154
    .line 155
    const/16 v24, 0x0

    .line 156
    .line 157
    const/16 v25, 0x0

    .line 158
    .line 159
    const/16 v26, 0x0

    .line 160
    .line 161
    move/from16 v18, v0

    .line 162
    .line 163
    invoke-static/range {v12 .. v29}, La/dl40;->a(La/dl40;La/gps;La/jlr;La/mi40;La/ypl0;La/bqr;ZLjava/util/List;ZZLa/yws;La/szj0;La/o4i0;ZLjava/util/ArrayList;JI)La/dl40;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_4

    .line 172
    .line 173
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object v0

    .line 176
    :cond_4
    move/from16 v0, v18

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :pswitch_1
    iget-boolean v0, v5, La/ll40;->j:Z

    .line 180
    .line 181
    sget-object v1, La/wne;->a:La/wne;

    .line 182
    .line 183
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    if-eqz v0, :cond_5

    .line 187
    .line 188
    iget-object v0, v6, La/nl40;->G:La/iw20;

    .line 189
    .line 190
    invoke-virtual {v0}, La/iw20;->h()V

    .line 191
    .line 192
    .line 193
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_2
    iget-boolean v9, v5, La/ll40;->j:Z

    .line 197
    .line 198
    sget-object v0, La/wne;->a:La/wne;

    .line 199
    .line 200
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    sget v0, La/nl40;->a0:I

    .line 204
    .line 205
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 206
    .line 207
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 208
    .line 209
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-object v2, v1

    .line 217
    move-object v1, v2

    .line 218
    check-cast v1, La/dl40;

    .line 219
    .line 220
    const-wide/16 v16, 0x0

    .line 221
    .line 222
    const v18, 0xffbfff

    .line 223
    .line 224
    .line 225
    move-object v3, v2

    .line 226
    const/4 v2, 0x0

    .line 227
    move-object v4, v3

    .line 228
    const/4 v3, 0x0

    .line 229
    move-object v5, v4

    .line 230
    const/4 v4, 0x0

    .line 231
    move-object v6, v5

    .line 232
    const/4 v5, 0x0

    .line 233
    move-object v7, v6

    .line 234
    const/4 v6, 0x0

    .line 235
    move-object v8, v7

    .line 236
    const/4 v7, 0x0

    .line 237
    move-object v10, v8

    .line 238
    const/4 v8, 0x0

    .line 239
    move-object v11, v10

    .line 240
    const/4 v10, 0x0

    .line 241
    move-object v12, v11

    .line 242
    const/4 v11, 0x0

    .line 243
    move-object v13, v12

    .line 244
    const/4 v12, 0x0

    .line 245
    move-object v14, v13

    .line 246
    const/4 v13, 0x0

    .line 247
    move-object v15, v14

    .line 248
    const/4 v14, 0x0

    .line 249
    move-object/from16 v19, v15

    .line 250
    .line 251
    const/4 v15, 0x0

    .line 252
    move-object/from16 v30, v19

    .line 253
    .line 254
    invoke-static/range {v1 .. v18}, La/dl40;->a(La/dl40;La/gps;La/jlr;La/mi40;La/ypl0;La/bqr;ZLjava/util/List;ZZLa/yws;La/szj0;La/o4i0;ZLjava/util/ArrayList;JI)La/dl40;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    move-object/from16 v2, v30

    .line 259
    .line 260
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_6

    .line 265
    .line 266
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
