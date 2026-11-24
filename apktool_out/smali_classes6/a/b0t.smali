.class public final La/b0t;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/c0t;


# direct methods
.method public synthetic constructor <init>(La/c0t;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/b0t;->i:B

    iput-object p1, p0, La/b0t;->k:La/c0t;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/b0t;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/b0t;->k:La/c0t;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/b0t;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/b0t;-><init>(La/c0t;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/b0t;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/b0t;-><init>(La/c0t;La/yje;B)V

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
    iput-boolean p0, v0, La/b0t;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, La/b0t;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {v0, p0, p2, v1}, La/b0t;-><init>(La/c0t;La/yje;B)V

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
    iput-boolean p0, v0, La/b0t;->j:Z

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_2
    new-instance v0, La/b0t;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, p2, v1}, La/b0t;-><init>(La/c0t;La/yje;B)V

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
    iput-boolean p0, v0, La/b0t;->j:Z

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
    iget-byte v0, p0, La/b0t;->i:B

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
    invoke-virtual {p0, p1, p2}, La/b0t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/b0t;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/b0t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/b0t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/b0t;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/b0t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/b0t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/b0t;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/b0t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/b0t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/b0t;

    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/b0t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 34

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/b0t;->i:B

    .line 4
    .line 5
    iget-object v6, v5, La/b0t;->k:La/c0t;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v7, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v0, v5, La/b0t;->j:Z

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
    iget-object v0, v6, La/c0t;->F:La/j3c;

    .line 36
    .line 37
    iput-boolean v1, v5, La/b0t;->j:Z

    .line 38
    .line 39
    const-wide/16 v1, 0xbd

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-ne v0, v7, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    move-object v10, v0

    .line 51
    check-cast v10, La/ypl0;

    .line 52
    .line 53
    sget v0, La/c0t;->b0:I

    .line 54
    .line 55
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 56
    .line 57
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 58
    .line 59
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-object v7, v1

    .line 67
    check-cast v7, La/wrs;

    .line 68
    .line 69
    const-wide/16 v26, 0x0

    .line 70
    .line 71
    const v28, 0x3fffff7

    .line 72
    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v14, 0x0

    .line 80
    const/4 v15, 0x0

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    const/16 v19, 0x0

    .line 88
    .line 89
    const/16 v20, 0x0

    .line 90
    .line 91
    const/16 v21, 0x0

    .line 92
    .line 93
    const/16 v22, 0x0

    .line 94
    .line 95
    const/16 v23, 0x0

    .line 96
    .line 97
    const-wide/16 v24, 0x0

    .line 98
    .line 99
    invoke-static/range {v7 .. v28}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_1
    return-object v7

    .line 112
    :pswitch_0
    iget-boolean v0, v5, La/b0t;->j:Z

    .line 113
    .line 114
    sget-object v1, La/wne;->a:La/wne;

    .line 115
    .line 116
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget v1, La/c0t;->b0:I

    .line 120
    .line 121
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 122
    .line 123
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 124
    .line 125
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-object v11, v2

    .line 133
    check-cast v11, La/wrs;

    .line 134
    .line 135
    const-wide/16 v30, 0x0

    .line 136
    .line 137
    const v32, 0x3ff7fff

    .line 138
    .line 139
    .line 140
    const/4 v12, 0x0

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
    const-wide/16 v28, 0x0

    .line 167
    .line 168
    move/from16 v23, v0

    .line 169
    .line 170
    invoke-static/range {v11 .. v32}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_4

    .line 179
    .line 180
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object v0

    .line 183
    :cond_4
    move/from16 v0, v23

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :pswitch_1
    iget-boolean v0, v5, La/b0t;->j:Z

    .line 187
    .line 188
    sget-object v1, La/wne;->a:La/wne;

    .line 189
    .line 190
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    iget-object v0, v6, La/c0t;->t:La/iw20;

    .line 196
    .line 197
    invoke-virtual {v0}, La/iw20;->h()V

    .line 198
    .line 199
    .line 200
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_2
    iget-boolean v14, v5, La/b0t;->j:Z

    .line 204
    .line 205
    sget-object v0, La/wne;->a:La/wne;

    .line 206
    .line 207
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    sget v0, La/c0t;->b0:I

    .line 211
    .line 212
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 213
    .line 214
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 215
    .line 216
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-object v2, v1

    .line 224
    move-object v1, v2

    .line 225
    check-cast v1, La/wrs;

    .line 226
    .line 227
    const-wide/16 v20, 0x0

    .line 228
    .line 229
    const v22, 0x3feffff

    .line 230
    .line 231
    .line 232
    move-object v3, v2

    .line 233
    const/4 v2, 0x0

    .line 234
    move-object v4, v3

    .line 235
    const/4 v3, 0x0

    .line 236
    move-object v5, v4

    .line 237
    const/4 v4, 0x0

    .line 238
    move-object v6, v5

    .line 239
    const/4 v5, 0x0

    .line 240
    move-object v7, v6

    .line 241
    const/4 v6, 0x0

    .line 242
    move-object v8, v7

    .line 243
    const/4 v7, 0x0

    .line 244
    move-object v9, v8

    .line 245
    const/4 v8, 0x0

    .line 246
    move-object v10, v9

    .line 247
    const/4 v9, 0x0

    .line 248
    move-object v11, v10

    .line 249
    const/4 v10, 0x0

    .line 250
    move-object v12, v11

    .line 251
    const/4 v11, 0x0

    .line 252
    move-object v13, v12

    .line 253
    const/4 v12, 0x0

    .line 254
    move-object v15, v13

    .line 255
    const/4 v13, 0x0

    .line 256
    move-object/from16 v16, v15

    .line 257
    .line 258
    const/4 v15, 0x0

    .line 259
    move-object/from16 v17, v16

    .line 260
    .line 261
    const/16 v16, 0x0

    .line 262
    .line 263
    move-object/from16 v18, v17

    .line 264
    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    move-object/from16 v23, v18

    .line 268
    .line 269
    const-wide/16 v18, 0x0

    .line 270
    .line 271
    move-object/from16 v33, v23

    .line 272
    .line 273
    invoke-static/range {v1 .. v22}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    move-object/from16 v2, v33

    .line 278
    .line 279
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_6

    .line 284
    .line 285
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v0

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
