.class public final La/mzs;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wzs;


# direct methods
.method public synthetic constructor <init>(La/wzs;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mzs;->i:B

    iput-object p1, p0, La/mzs;->k:La/wzs;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mzs;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mzs;->k:La/wzs;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mzs;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mzs;-><init>(La/wzs;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/mzs;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/mzs;-><init>(La/wzs;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/mzs;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/mzs;-><init>(La/wzs;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/mzs;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/mzs;-><init>(La/wzs;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance v0, La/mzs;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, p0, p2, v1}, La/mzs;-><init>(La/wzs;La/yje;B)V

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
    iput-boolean p0, v0, La/mzs;->j:Z

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
    iget-byte v0, p0, La/mzs;->i:B

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
    invoke-virtual {p0, p1, p2}, La/mzs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mzs;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mzs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mzs;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mzs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/mzs;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/mzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mzs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/mzs;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/mzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mzs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/mzs;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/mzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mzs;->i:B

    .line 4
    .line 5
    sget-object v2, La/azs;->a:La/azs;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, La/mzs;->k:La/wzs;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v1, v5, La/wzs;->u:La/p7m0;

    .line 17
    .line 18
    sget-object v7, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v8, v0, La/mzs;->j:Z

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
    iget-object v3, v5, La/wzs;->d:La/mpx;

    .line 38
    .line 39
    new-instance v8, La/ssr;

    .line 40
    .line 41
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    check-cast v9, La/czs;

    .line 46
    .line 47
    iget-wide v9, v9, La/czs;->a:J

    .line 48
    .line 49
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    check-cast v11, La/czs;

    .line 54
    .line 55
    iget-wide v11, v11, La/czs;->b:J

    .line 56
    .line 57
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    check-cast v13, La/czs;

    .line 62
    .line 63
    iget-object v15, v13, La/czs;->c:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, La/czs;

    .line 70
    .line 71
    iget-wide v13, v1, La/czs;->d:J

    .line 72
    .line 73
    invoke-direct/range {v8 .. v15}, La/ssr;-><init>(JJJLjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-boolean v4, v0, La/mzs;->j:Z

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
    iget-object v0, v5, La/wzs;->v:La/p7m0;

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
    iget-object v1, v5, La/wzs;->u:La/p7m0;

    .line 98
    .line 99
    sget-object v7, La/wne;->a:La/wne;

    .line 100
    .line 101
    iget-boolean v2, v0, La/mzs;->j:Z

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
    check-cast v8, La/czs;

    .line 124
    .line 125
    const/16 v24, 0x0

    .line 126
    .line 127
    const v25, 0xff7f

    .line 128
    .line 129
    .line 130
    const-wide/16 v9, 0x0

    .line 131
    .line 132
    const-wide/16 v11, 0x0

    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const-wide/16 v14, 0x0

    .line 136
    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x1

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
    invoke-static/range {v8 .. v25}, La/czs;->a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_5

    .line 162
    .line 163
    sget v2, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 164
    .line 165
    const-wide/16 v2, 0x2

    .line 166
    .line 167
    invoke-static {v2, v3}, La/znq0;->f(J)J

    .line 168
    .line 169
    .line 170
    move-result-wide v2

    .line 171
    iput-boolean v4, v0, La/mzs;->j:Z

    .line 172
    .line 173
    invoke-static {v2, v3, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-ne v0, v7, :cond_6

    .line 178
    .line 179
    move-object v6, v7

    .line 180
    goto :goto_3

    .line 181
    :cond_6
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    move-object v2, v0

    .line 186
    check-cast v2, La/czs;

    .line 187
    .line 188
    const/16 v18, 0x0

    .line 189
    .line 190
    const v19, 0xff7f

    .line 191
    .line 192
    .line 193
    const-wide/16 v3, 0x0

    .line 194
    .line 195
    const-wide/16 v5, 0x0

    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    const-wide/16 v8, 0x0

    .line 199
    .line 200
    const/4 v10, 0x0

    .line 201
    const/4 v11, 0x0

    .line 202
    const/4 v12, 0x0

    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    invoke-static/range {v2 .. v19}, La/czs;->a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_6

    .line 219
    .line 220
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    :goto_3
    return-object v6

    .line 223
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 224
    .line 225
    iget-boolean v7, v0, La/mzs;->j:Z

    .line 226
    .line 227
    if-eqz v7, :cond_8

    .line 228
    .line 229
    if-ne v7, v4, :cond_7

    .line 230
    .line 231
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object v3, v5, La/wzs;->d:La/mpx;

    .line 243
    .line 244
    sget-object v7, La/wsr;->a:La/wsr;

    .line 245
    .line 246
    iput-boolean v4, v0, La/mzs;->j:Z

    .line 247
    .line 248
    invoke-virtual {v3, v7, v0}, La/mpx;->a(La/xsr;La/bnn0;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    if-ne v0, v1, :cond_9

    .line 253
    .line 254
    move-object v6, v1

    .line 255
    goto :goto_5

    .line 256
    :cond_9
    :goto_4
    iget-object v0, v5, La/wzs;->v:La/p7m0;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    :goto_5
    return-object v6

    .line 267
    :pswitch_2
    iget-object v1, v5, La/wzs;->u:La/p7m0;

    .line 268
    .line 269
    sget-object v7, La/wne;->a:La/wne;

    .line 270
    .line 271
    iget-boolean v8, v0, La/mzs;->j:Z

    .line 272
    .line 273
    if-eqz v8, :cond_b

    .line 274
    .line 275
    if-ne v8, v4, :cond_a

    .line 276
    .line 277
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_9

    .line 285
    .line 286
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    iget-object v3, v5, La/wzs;->d:La/mpx;

    .line 290
    .line 291
    sget-object v8, La/vsr;->a:La/vsr;

    .line 292
    .line 293
    iput-boolean v4, v0, La/mzs;->j:Z

    .line 294
    .line 295
    invoke-virtual {v3, v8, v0}, La/mpx;->a(La/xsr;La/bnn0;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    if-ne v0, v7, :cond_c

    .line 300
    .line 301
    move-object v6, v7

    .line 302
    goto/16 :goto_9

    .line 303
    .line 304
    :cond_c
    :goto_6
    iget-object v0, v5, La/wzs;->b:La/ali;

    .line 305
    .line 306
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    check-cast v3, La/czs;

    .line 311
    .line 312
    iget-wide v8, v3, La/czs;->a:J

    .line 313
    .line 314
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    check-cast v3, La/czs;

    .line 319
    .line 320
    iget-wide v10, v3, La/czs;->b:J

    .line 321
    .line 322
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    check-cast v3, La/czs;

    .line 327
    .line 328
    iget-object v14, v3, La/czs;->c:Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    check-cast v3, La/czs;

    .line 335
    .line 336
    iget-wide v12, v3, La/czs;->d:J

    .line 337
    .line 338
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    check-cast v1, La/czs;

    .line 343
    .line 344
    iget-object v15, v1, La/czs;->e:Ljava/lang/String;

    .line 345
    .line 346
    new-instance v7, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;

    .line 347
    .line 348
    const/16 v16, 0x1

    .line 349
    .line 350
    invoke-direct/range {v7 .. v16}, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;-><init>(JJJLjava/lang/String;Ljava/lang/String;Z)V

    .line 351
    .line 352
    .line 353
    iget-object v0, v0, La/ali;->a:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, La/oeg0;

    .line 356
    .line 357
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    new-instance v3, Lorg/xplatform/game_broadcasting/impl/navigation/BroadcastingVideoFullScreenFactory$getScreen$1;

    .line 366
    .line 367
    invoke-direct {v3, v7}, Lorg/xplatform/game_broadcasting/impl/navigation/BroadcastingVideoFullScreenFactory$getScreen$1;-><init>(Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;)V

    .line 368
    .line 369
    .line 370
    instance-of v4, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 371
    .line 372
    if-eqz v4, :cond_d

    .line 373
    .line 374
    new-instance v4, La/e1w0;

    .line 375
    .line 376
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 377
    .line 378
    invoke-direct {v4, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 379
    .line 380
    .line 381
    new-instance v3, La/c8d;

    .line 382
    .line 383
    sget-object v7, La/y7d;->a:La/v7d;

    .line 384
    .line 385
    invoke-direct {v3, v7, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_d
    new-instance v4, La/w0w0;

    .line 393
    .line 394
    invoke-direct {v4, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 395
    .line 396
    .line 397
    new-instance v3, La/c8d;

    .line 398
    .line 399
    sget-object v7, La/y7d;->a:La/v7d;

    .line 400
    .line 401
    invoke-direct {v3, v7, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    :goto_7
    const/4 v3, 0x0

    .line 408
    invoke-static {v0, v1, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    :goto_8
    move-object v3, v1

    .line 413
    check-cast v3, La/paw;

    .line 414
    .line 415
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    if-eqz v4, :cond_e

    .line 420
    .line 421
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    check-cast v3, La/oe50;

    .line 426
    .line 427
    invoke-virtual {v0, v3}, La/i1w0;->a(La/oe50;)V

    .line 428
    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_e
    iget-object v0, v5, La/wzs;->v:La/p7m0;

    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v0, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 440
    .line 441
    :goto_9
    return-object v6

    .line 442
    :pswitch_3
    iget-boolean v0, v0, La/mzs;->j:Z

    .line 443
    .line 444
    sget-object v1, La/wne;->a:La/wne;

    .line 445
    .line 446
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    if-eqz v0, :cond_10

    .line 450
    .line 451
    iget-object v0, v5, La/wzs;->u:La/p7m0;

    .line 452
    .line 453
    :cond_f
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    move-object v2, v1

    .line 458
    check-cast v2, La/czs;

    .line 459
    .line 460
    const/16 v18, 0x0

    .line 461
    .line 462
    const v19, 0xdfdf

    .line 463
    .line 464
    .line 465
    const-wide/16 v3, 0x0

    .line 466
    .line 467
    const-wide/16 v5, 0x0

    .line 468
    .line 469
    const/4 v7, 0x0

    .line 470
    const-wide/16 v8, 0x0

    .line 471
    .line 472
    const/4 v10, 0x0

    .line 473
    const/4 v11, 0x1

    .line 474
    const/4 v12, 0x0

    .line 475
    const/4 v13, 0x0

    .line 476
    const/4 v14, 0x0

    .line 477
    const/4 v15, 0x0

    .line 478
    const/16 v16, 0x0

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    invoke-static/range {v2 .. v19}, La/czs;->a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    if-eqz v1, :cond_f

    .line 491
    .line 492
    goto :goto_a

    .line 493
    :cond_10
    invoke-virtual {v5}, La/wzs;->z()V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v5}, La/wzs;->y()V

    .line 497
    .line 498
    .line 499
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 500
    .line 501
    return-object v0

    .line 502
    nop

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
