.class public final La/r1t;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/x1t;


# direct methods
.method public synthetic constructor <init>(La/x1t;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r1t;->i:B

    iput-object p1, p0, La/r1t;->k:La/x1t;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r1t;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r1t;->k:La/x1t;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/r1t;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/r1t;-><init>(La/x1t;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/r1t;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/r1t;-><init>(La/x1t;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/r1t;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/r1t;-><init>(La/x1t;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/r1t;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/r1t;-><init>(La/x1t;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance v0, La/r1t;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, p0, p2, v1}, La/r1t;-><init>(La/x1t;La/yje;B)V

    .line 40
    .line 41
    .line 42
    check-cast p1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    iput-boolean p0, v0, La/r1t;->j:Z

    .line 49
    .line 50
    return-object v0

    .line 51
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
    iget-byte v0, p0, La/r1t;->i:B

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
    invoke-virtual {p0, p1, p2}, La/r1t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r1t;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r1t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r1t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r1t;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r1t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/r1t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/r1t;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/r1t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/r1t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/r1t;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/r1t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    check-cast p2, La/yje;

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, La/r1t;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/r1t;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/r1t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r1t;->i:B

    .line 4
    .line 5
    sget-object v2, La/h1t;->a:La/h1t;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, La/r1t;->k:La/x1t;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v1, v5, La/x1t;->m:La/p7m0;

    .line 17
    .line 18
    sget-object v7, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v8, v0, La/r1t;->j:Z

    .line 21
    .line 22
    if-eqz v8, :cond_1

    .line 23
    .line 24
    if-ne v8, v4, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v5, La/x1t;->d:La/mpx;

    .line 38
    .line 39
    new-instance v8, La/tsr;

    .line 40
    .line 41
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    check-cast v9, La/j1t;

    .line 46
    .line 47
    iget-wide v10, v9, La/j1t;->a:J

    .line 48
    .line 49
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    check-cast v9, La/j1t;

    .line 54
    .line 55
    iget-wide v12, v9, La/j1t;->b:J

    .line 56
    .line 57
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    check-cast v9, La/j1t;

    .line 62
    .line 63
    iget v9, v9, La/j1t;->c:I

    .line 64
    .line 65
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, La/j1t;

    .line 70
    .line 71
    iget-wide v14, v1, La/j1t;->d:J

    .line 72
    .line 73
    invoke-direct/range {v8 .. v15}, La/tsr;-><init>(IJJJ)V

    .line 74
    .line 75
    .line 76
    iput-boolean v4, v0, La/r1t;->j:Z

    .line 77
    .line 78
    invoke-virtual {v3, v8, v0}, La/mpx;->a(La/xsr;La/bnn0;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-ne v0, v7, :cond_2

    .line 83
    .line 84
    move-object v6, v7

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    :goto_0
    iget-object v0, v5, La/x1t;->n:La/p7m0;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    :goto_1
    return-object v6

    .line 97
    :pswitch_0
    iget-object v1, v5, La/x1t;->m:La/p7m0;

    .line 98
    .line 99
    sget-object v7, La/wne;->a:La/wne;

    .line 100
    .line 101
    iget-boolean v2, v0, La/r1t;->j:Z

    .line 102
    .line 103
    if-eqz v2, :cond_4

    .line 104
    .line 105
    if-ne v2, v4, :cond_3

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v8, v2

    .line 123
    check-cast v8, La/j1t;

    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const/16 v23, 0x7dff

    .line 128
    .line 129
    const-wide/16 v9, 0x0

    .line 130
    .line 131
    const-wide/16 v11, 0x0

    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const-wide/16 v14, 0x0

    .line 135
    .line 136
    const/16 v16, 0x0

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const/16 v19, 0x1

    .line 143
    .line 144
    const/16 v20, 0x0

    .line 145
    .line 146
    const/16 v21, 0x0

    .line 147
    .line 148
    invoke-static/range {v8 .. v23}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_5

    .line 157
    .line 158
    sget v2, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 159
    .line 160
    const-wide/16 v2, 0x2

    .line 161
    .line 162
    invoke-static {v2, v3}, La/znq0;->f(J)J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    iput-boolean v4, v0, La/r1t;->j:Z

    .line 167
    .line 168
    invoke-static {v2, v3, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-ne v0, v7, :cond_6

    .line 173
    .line 174
    move-object v6, v7

    .line 175
    goto :goto_3

    .line 176
    :cond_6
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    move-object v2, v0

    .line 181
    check-cast v2, La/j1t;

    .line 182
    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    const/16 v17, 0x7dff

    .line 186
    .line 187
    const-wide/16 v3, 0x0

    .line 188
    .line 189
    const-wide/16 v5, 0x0

    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    const-wide/16 v8, 0x0

    .line 193
    .line 194
    const/4 v10, 0x0

    .line 195
    const/4 v11, 0x0

    .line 196
    const/4 v12, 0x0

    .line 197
    const/4 v13, 0x0

    .line 198
    const/4 v14, 0x0

    .line 199
    const/4 v15, 0x0

    .line 200
    invoke-static/range {v2 .. v17}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_6

    .line 209
    .line 210
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    :goto_3
    return-object v6

    .line 213
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 214
    .line 215
    iget-boolean v7, v0, La/r1t;->j:Z

    .line 216
    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    if-ne v7, v4, :cond_7

    .line 220
    .line 221
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    iget-object v3, v5, La/x1t;->d:La/mpx;

    .line 233
    .line 234
    sget-object v7, La/wsr;->b:La/wsr;

    .line 235
    .line 236
    iput-boolean v4, v0, La/r1t;->j:Z

    .line 237
    .line 238
    invoke-virtual {v3, v7, v0}, La/mpx;->a(La/xsr;La/bnn0;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-ne v0, v1, :cond_9

    .line 243
    .line 244
    move-object v6, v1

    .line 245
    goto :goto_5

    .line 246
    :cond_9
    :goto_4
    iget-object v0, v5, La/x1t;->n:La/p7m0;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    :goto_5
    return-object v6

    .line 257
    :pswitch_2
    iget-object v1, v5, La/x1t;->m:La/p7m0;

    .line 258
    .line 259
    sget-object v7, La/wne;->a:La/wne;

    .line 260
    .line 261
    iget-boolean v8, v0, La/r1t;->j:Z

    .line 262
    .line 263
    if-eqz v8, :cond_b

    .line 264
    .line 265
    if-ne v8, v4, :cond_a

    .line 266
    .line 267
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    iget-object v3, v5, La/x1t;->d:La/mpx;

    .line 279
    .line 280
    sget-object v8, La/vsr;->b:La/vsr;

    .line 281
    .line 282
    iput-boolean v4, v0, La/r1t;->j:Z

    .line 283
    .line 284
    invoke-virtual {v3, v8, v0}, La/mpx;->a(La/xsr;La/bnn0;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    if-ne v0, v7, :cond_c

    .line 289
    .line 290
    move-object v6, v7

    .line 291
    goto :goto_7

    .line 292
    :cond_c
    :goto_6
    iget-object v0, v5, La/x1t;->b:La/ali;

    .line 293
    .line 294
    new-instance v7, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 295
    .line 296
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    check-cast v3, La/j1t;

    .line 301
    .line 302
    iget-wide v8, v3, La/j1t;->a:J

    .line 303
    .line 304
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    check-cast v3, La/j1t;

    .line 309
    .line 310
    iget-wide v10, v3, La/j1t;->b:J

    .line 311
    .line 312
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    check-cast v3, La/j1t;

    .line 317
    .line 318
    iget v12, v3, La/j1t;->c:I

    .line 319
    .line 320
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    check-cast v1, La/j1t;

    .line 325
    .line 326
    iget-wide v13, v1, La/j1t;->d:J

    .line 327
    .line 328
    const/4 v15, 0x1

    .line 329
    invoke-direct/range {v7 .. v15}, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;-><init>(JJIJZ)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v7}, La/ali;->C(Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;)V

    .line 333
    .line 334
    .line 335
    iget-object v0, v5, La/x1t;->n:La/p7m0;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    :goto_7
    return-object v6

    .line 346
    :pswitch_3
    iget-boolean v0, v0, La/r1t;->j:Z

    .line 347
    .line 348
    sget-object v1, La/wne;->a:La/wne;

    .line 349
    .line 350
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    if-eqz v0, :cond_e

    .line 354
    .line 355
    iget-object v0, v5, La/x1t;->m:La/p7m0;

    .line 356
    .line 357
    :cond_d
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    move-object v2, v1

    .line 362
    check-cast v2, La/j1t;

    .line 363
    .line 364
    const/16 v16, 0x0

    .line 365
    .line 366
    const/16 v17, 0x7fdf

    .line 367
    .line 368
    const-wide/16 v3, 0x0

    .line 369
    .line 370
    const-wide/16 v5, 0x0

    .line 371
    .line 372
    const/4 v7, 0x0

    .line 373
    const-wide/16 v8, 0x0

    .line 374
    .line 375
    const/4 v10, 0x0

    .line 376
    const/4 v11, 0x1

    .line 377
    const/4 v12, 0x0

    .line 378
    const/4 v13, 0x0

    .line 379
    const/4 v14, 0x0

    .line 380
    const/4 v15, 0x0

    .line 381
    invoke-static/range {v2 .. v17}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_d

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_e
    invoke-virtual {v5}, La/x1t;->x()V

    .line 393
    .line 394
    .line 395
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object v0

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
