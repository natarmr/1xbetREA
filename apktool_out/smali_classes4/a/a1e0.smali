.class public final La/a1e0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d1e0;


# direct methods
.method public synthetic constructor <init>(La/d1e0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a1e0;->i:B

    iput-object p1, p0, La/a1e0;->k:La/d1e0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a1e0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a1e0;->k:La/d1e0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/a1e0;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/a1e0;-><init>(La/d1e0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/a1e0;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/a1e0;-><init>(La/d1e0;La/yje;B)V

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
    iput-boolean p0, v0, La/a1e0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, La/a1e0;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-direct {v0, p0, p2, v1}, La/a1e0;-><init>(La/d1e0;La/yje;B)V

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
    iput-boolean p0, v0, La/a1e0;->j:Z

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_2
    new-instance v0, La/a1e0;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {v0, p0, p2, v1}, La/a1e0;-><init>(La/d1e0;La/yje;B)V

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
    iput-boolean p0, v0, La/a1e0;->j:Z

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_3
    new-instance p1, La/a1e0;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-direct {p1, p0, p2, v0}, La/a1e0;-><init>(La/d1e0;La/yje;B)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/a1e0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/a1e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a1e0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a1e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/a1e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/a1e0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/a1e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/a1e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/a1e0;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/a1e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/a1e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/a1e0;

    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/a1e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_3
    check-cast p1, La/vne;

    .line 84
    .line 85
    check-cast p2, La/yje;

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, La/a1e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/a1e0;

    .line 92
    .line 93
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, La/a1e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
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
    iget-byte v0, v5, La/a1e0;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    iget-object v6, v5, La/a1e0;->k:La/d1e0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v7, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v0, v5, La/a1e0;->j:Z

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
    iget-object v0, v6, La/d1e0;->D:La/j3c;

    .line 36
    .line 37
    iget-object v1, v6, La/d1e0;->r:Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;

    .line 38
    .line 39
    iget-wide v8, v1, Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;->e:J

    .line 40
    .line 41
    iget-wide v1, v1, Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;->d:J

    .line 42
    .line 43
    iput-boolean v3, v5, La/a1e0;->j:Z

    .line 44
    .line 45
    move-wide v3, v1

    .line 46
    move-wide v1, v8

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
    move-object v1, v7

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    move-object v11, v0

    .line 56
    check-cast v11, La/ypl0;

    .line 57
    .line 58
    sget v0, La/d1e0;->e0:I

    .line 59
    .line 60
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 61
    .line 62
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 63
    .line 64
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-object v7, v1

    .line 72
    check-cast v7, La/qyd0;

    .line 73
    .line 74
    const/16 v23, 0x0

    .line 75
    .line 76
    const v24, 0x7ffffef

    .line 77
    .line 78
    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v9, 0x0

    .line 81
    const/4 v10, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    const/4 v13, 0x0

    .line 84
    const/4 v14, 0x0

    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    const/16 v19, 0x0

    .line 93
    .line 94
    const/16 v20, 0x0

    .line 95
    .line 96
    const/16 v21, 0x0

    .line 97
    .line 98
    const/16 v22, 0x0

    .line 99
    .line 100
    invoke-static/range {v7 .. v24}, La/qyd0;->a(La/qyd0;La/gps;La/jlr;La/vvd0;La/ypl0;La/bqr;La/xus;ZLa/ixd0;La/rud0;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/qyd0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    :goto_1
    return-object v1

    .line 113
    :pswitch_0
    iget-boolean v0, v5, La/a1e0;->j:Z

    .line 114
    .line 115
    sget-object v1, La/wne;->a:La/wne;

    .line 116
    .line 117
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    sget v1, La/d1e0;->e0:I

    .line 121
    .line 122
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 123
    .line 124
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 125
    .line 126
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-object v12, v2

    .line 134
    check-cast v12, La/qyd0;

    .line 135
    .line 136
    const/16 v28, 0x0

    .line 137
    .line 138
    const v29, 0x7ff7fff

    .line 139
    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const/4 v14, 0x0

    .line 143
    const/4 v15, 0x0

    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    const/16 v19, 0x0

    .line 151
    .line 152
    const/16 v20, 0x0

    .line 153
    .line 154
    const/16 v21, 0x0

    .line 155
    .line 156
    const/16 v22, 0x0

    .line 157
    .line 158
    const/16 v24, 0x0

    .line 159
    .line 160
    const/16 v25, 0x0

    .line 161
    .line 162
    const/16 v26, 0x0

    .line 163
    .line 164
    const/16 v27, 0x0

    .line 165
    .line 166
    move/from16 v23, v0

    .line 167
    .line 168
    invoke-static/range {v12 .. v29}, La/qyd0;->a(La/qyd0;La/gps;La/jlr;La/vvd0;La/ypl0;La/bqr;La/xus;ZLa/ixd0;La/rud0;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/qyd0;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_4

    .line 177
    .line 178
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object v0

    .line 181
    :cond_4
    move/from16 v0, v23

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :pswitch_1
    iget-boolean v0, v5, La/a1e0;->j:Z

    .line 185
    .line 186
    sget-object v1, La/wne;->a:La/wne;

    .line 187
    .line 188
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    if-eqz v0, :cond_5

    .line 192
    .line 193
    iget-object v0, v6, La/d1e0;->I:La/iw20;

    .line 194
    .line 195
    invoke-virtual {v0}, La/iw20;->h()V

    .line 196
    .line 197
    .line 198
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_2
    iget-boolean v14, v5, La/a1e0;->j:Z

    .line 202
    .line 203
    sget-object v0, La/wne;->a:La/wne;

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    sget v0, La/d1e0;->e0:I

    .line 209
    .line 210
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 211
    .line 212
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 213
    .line 214
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-object v2, v1

    .line 222
    move-object v1, v2

    .line 223
    check-cast v1, La/qyd0;

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    const v18, 0x7dfffff

    .line 228
    .line 229
    .line 230
    move-object v3, v2

    .line 231
    const/4 v2, 0x0

    .line 232
    move-object v4, v3

    .line 233
    const/4 v3, 0x0

    .line 234
    move-object v5, v4

    .line 235
    const/4 v4, 0x0

    .line 236
    move-object v6, v5

    .line 237
    const/4 v5, 0x0

    .line 238
    move-object v7, v6

    .line 239
    const/4 v6, 0x0

    .line 240
    move-object v8, v7

    .line 241
    const/4 v7, 0x0

    .line 242
    move-object v9, v8

    .line 243
    const/4 v8, 0x0

    .line 244
    move-object v10, v9

    .line 245
    const/4 v9, 0x0

    .line 246
    move-object v11, v10

    .line 247
    const/4 v10, 0x0

    .line 248
    move-object v12, v11

    .line 249
    const/4 v11, 0x0

    .line 250
    move-object v13, v12

    .line 251
    const/4 v12, 0x0

    .line 252
    move-object v15, v13

    .line 253
    const/4 v13, 0x0

    .line 254
    move-object/from16 v16, v15

    .line 255
    .line 256
    const/4 v15, 0x0

    .line 257
    move-object/from16 v19, v16

    .line 258
    .line 259
    const/16 v16, 0x0

    .line 260
    .line 261
    move-object/from16 v30, v19

    .line 262
    .line 263
    invoke-static/range {v1 .. v18}, La/qyd0;->a(La/qyd0;La/gps;La/jlr;La/vvd0;La/ypl0;La/bqr;La/xus;ZLa/ixd0;La/rud0;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/qyd0;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    move-object/from16 v2, v30

    .line 268
    .line 269
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_6

    .line 274
    .line 275
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object v0

    .line 278
    :pswitch_3
    sget-object v7, La/wne;->a:La/wne;

    .line 279
    .line 280
    iget-boolean v0, v5, La/a1e0;->j:Z

    .line 281
    .line 282
    if-eqz v0, :cond_8

    .line 283
    .line 284
    if-ne v0, v3, :cond_7

    .line 285
    .line 286
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v0, p1

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget-object v0, v6, La/d1e0;->H:La/h3c;

    .line 300
    .line 301
    iget-object v1, v6, La/d1e0;->r:Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;

    .line 302
    .line 303
    iget-wide v8, v1, Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;->e:J

    .line 304
    .line 305
    iget-wide v1, v1, Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;->d:J

    .line 306
    .line 307
    iput-boolean v3, v5, La/a1e0;->j:Z

    .line 308
    .line 309
    move-wide v3, v1

    .line 310
    move-wide v1, v8

    .line 311
    invoke-virtual/range {v0 .. v5}, La/h3c;->a(JJLa/zje;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-ne v0, v7, :cond_9

    .line 316
    .line 317
    move-object v1, v7

    .line 318
    goto :goto_4

    .line 319
    :cond_9
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 320
    .line 321
    iget-object v1, v6, La/d1e0;->P:La/oeg0;

    .line 322
    .line 323
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    new-instance v2, La/oac0;

    .line 328
    .line 329
    const/16 v3, 0x11

    .line 330
    .line 331
    invoke-direct {v2, v6, v0, v3}, La/oac0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 335
    .line 336
    .line 337
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    :goto_4
    return-object v1

    .line 340
    nop

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
