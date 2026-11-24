.class public final La/a7o;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/b7o;


# direct methods
.method public synthetic constructor <init>(La/b7o;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a7o;->i:B

    iput-object p1, p0, La/a7o;->k:La/b7o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a7o;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a7o;->k:La/b7o;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/a7o;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/a7o;-><init>(La/b7o;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/a7o;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/a7o;-><init>(La/b7o;La/yje;B)V

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
    iput-boolean p0, v0, La/a7o;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, La/a7o;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {v0, p0, p2, v1}, La/a7o;-><init>(La/b7o;La/yje;B)V

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
    iput-boolean p0, v0, La/a7o;->j:Z

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_2
    new-instance v0, La/a7o;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, p2, v1}, La/a7o;-><init>(La/b7o;La/yje;B)V

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
    iput-boolean p0, v0, La/a7o;->j:Z

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
    iget-byte v0, p0, La/a7o;->i:B

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
    invoke-virtual {p0, p1, p2}, La/a7o;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a7o;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a7o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/a7o;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/a7o;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/a7o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/a7o;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/a7o;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/a7o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/a7o;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/a7o;

    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/a7o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 30

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/a7o;->i:B

    .line 4
    .line 5
    iget-object v6, v5, La/a7o;->k:La/b7o;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v7, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v0, v5, La/a7o;->j:Z

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
    iget-object v0, v6, La/b7o;->H:La/j3c;

    .line 36
    .line 37
    iget-object v2, v6, La/b7o;->p:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 38
    .line 39
    iget-wide v3, v2, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 40
    .line 41
    iget-wide v8, v2, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 42
    .line 43
    iput-boolean v1, v5, La/a7o;->j:Z

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
    sget v0, La/b7o;->X:I

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
    check-cast v7, La/l6o;

    .line 72
    .line 73
    const/16 v22, 0x0

    .line 74
    .line 75
    const v23, 0x3ffffef

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
    const-wide/16 v20, 0x0

    .line 94
    .line 95
    invoke-static/range {v7 .. v23}, La/l6o;->a(La/l6o;La/gps;La/jlr;La/tdt0;La/ypl0;La/bqr;La/xus;ZLjava/util/List;ZZLa/yws;La/szj0;JZI)La/l6o;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    :goto_1
    return-object v7

    .line 108
    :pswitch_0
    iget-boolean v0, v5, La/a7o;->j:Z

    .line 109
    .line 110
    sget-object v1, La/wne;->a:La/wne;

    .line 111
    .line 112
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget v1, La/b7o;->X:I

    .line 116
    .line 117
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 118
    .line 119
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 120
    .line 121
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-object v12, v2

    .line 129
    check-cast v12, La/l6o;

    .line 130
    .line 131
    const/16 v27, 0x0

    .line 132
    .line 133
    const v28, 0x3fff7ff

    .line 134
    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const/4 v14, 0x0

    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    const/16 v18, 0x0

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const/16 v23, 0x0

    .line 152
    .line 153
    const/16 v24, 0x0

    .line 154
    .line 155
    const-wide/16 v25, 0x0

    .line 156
    .line 157
    move/from16 v19, v0

    .line 158
    .line 159
    invoke-static/range {v12 .. v28}, La/l6o;->a(La/l6o;La/gps;La/jlr;La/tdt0;La/ypl0;La/bqr;La/xus;ZLjava/util/List;ZZLa/yws;La/szj0;JZI)La/l6o;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_4

    .line 168
    .line 169
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_4
    move/from16 v0, v19

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :pswitch_1
    iget-boolean v0, v5, La/a7o;->j:Z

    .line 176
    .line 177
    sget-object v1, La/wne;->a:La/wne;

    .line 178
    .line 179
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    if-eqz v0, :cond_5

    .line 183
    .line 184
    iget-object v0, v6, La/b7o;->z:La/iw20;

    .line 185
    .line 186
    invoke-virtual {v0}, La/iw20;->h()V

    .line 187
    .line 188
    .line 189
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_2
    iget-boolean v10, v5, La/a7o;->j:Z

    .line 193
    .line 194
    sget-object v0, La/wne;->a:La/wne;

    .line 195
    .line 196
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget v0, La/b7o;->X:I

    .line 200
    .line 201
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 202
    .line 203
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 204
    .line 205
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-object v2, v1

    .line 213
    move-object v1, v2

    .line 214
    check-cast v1, La/l6o;

    .line 215
    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    const v17, 0x3fdffff

    .line 219
    .line 220
    .line 221
    move-object v3, v2

    .line 222
    const/4 v2, 0x0

    .line 223
    move-object v4, v3

    .line 224
    const/4 v3, 0x0

    .line 225
    move-object v5, v4

    .line 226
    const/4 v4, 0x0

    .line 227
    move-object v6, v5

    .line 228
    const/4 v5, 0x0

    .line 229
    move-object v7, v6

    .line 230
    const/4 v6, 0x0

    .line 231
    move-object v8, v7

    .line 232
    const/4 v7, 0x0

    .line 233
    move-object v9, v8

    .line 234
    const/4 v8, 0x0

    .line 235
    move-object v11, v9

    .line 236
    const/4 v9, 0x0

    .line 237
    move-object v12, v11

    .line 238
    const/4 v11, 0x0

    .line 239
    move-object v13, v12

    .line 240
    const/4 v12, 0x0

    .line 241
    move-object v14, v13

    .line 242
    const/4 v13, 0x0

    .line 243
    move-object/from16 v18, v14

    .line 244
    .line 245
    const-wide/16 v14, 0x0

    .line 246
    .line 247
    move-object/from16 v29, v18

    .line 248
    .line 249
    invoke-static/range {v1 .. v17}, La/l6o;->a(La/l6o;La/gps;La/jlr;La/tdt0;La/ypl0;La/bqr;La/xus;ZLjava/util/List;ZZLa/yws;La/szj0;JZI)La/l6o;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    move-object/from16 v2, v29

    .line 254
    .line 255
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_6

    .line 260
    .line 261
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object v0

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
