.class public final La/x5t0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/a6t0;


# direct methods
.method public synthetic constructor <init>(La/a6t0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/x5t0;->i:B

    iput-object p1, p0, La/x5t0;->k:La/a6t0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/x5t0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/x5t0;->k:La/a6t0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/x5t0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/x5t0;-><init>(La/a6t0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/x5t0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/x5t0;-><init>(La/a6t0;La/yje;B)V

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
    iput-boolean p0, v0, La/x5t0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/x5t0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/x5t0;-><init>(La/a6t0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x5t0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/x5t0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/x5t0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/x5t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/x5t0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/x5t0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/x5t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/x5t0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/x5t0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/x5t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/x5t0;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    iget-object v6, v5, La/x5t0;->k:La/a6t0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v7, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v0, v5, La/x5t0;->j:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v2, :cond_0

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
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object v0, v6, La/a6t0;->s:La/j3c;

    .line 36
    .line 37
    iput-boolean v2, v5, La/x5t0;->j:Z

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
    move-object v3, v7

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    move-object v15, v0

    .line 52
    check-cast v15, La/ypl0;

    .line 53
    .line 54
    sget v0, La/a6t0;->K:I

    .line 55
    .line 56
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 57
    .line 58
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object v7, v1

    .line 68
    check-cast v7, La/s5t0;

    .line 69
    .line 70
    const-wide/16 v24, 0x0

    .line 71
    .line 72
    const v26, 0x1fdff

    .line 73
    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v17, 0x0

    .line 85
    .line 86
    const-wide/16 v18, 0x0

    .line 87
    .line 88
    const-wide/16 v20, 0x0

    .line 89
    .line 90
    const-wide/16 v22, 0x0

    .line 91
    .line 92
    invoke-static/range {v7 .. v26}, La/s5t0;->a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    :goto_1
    return-object v3

    .line 105
    :pswitch_0
    iget-boolean v0, v5, La/x5t0;->j:Z

    .line 106
    .line 107
    sget-object v1, La/wne;->a:La/wne;

    .line 108
    .line 109
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    sget v0, La/a6t0;->K:I

    .line 115
    .line 116
    invoke-virtual {v6}, La/a6t0;->M()V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, La/s5t0;

    .line 125
    .line 126
    iget-object v0, v0, La/s5t0;->c:La/i6t0;

    .line 127
    .line 128
    if-nez v0, :cond_6

    .line 129
    .line 130
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 131
    .line 132
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 133
    .line 134
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-object v2, v1

    .line 142
    check-cast v2, La/s5t0;

    .line 143
    .line 144
    sget-object v3, La/n5t0;->c:La/n5t0;

    .line 145
    .line 146
    const-wide/16 v19, 0x0

    .line 147
    .line 148
    const v21, 0x1fffd

    .line 149
    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v5, 0x0

    .line 153
    const/4 v6, 0x0

    .line 154
    const/4 v7, 0x0

    .line 155
    const/4 v8, 0x0

    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v10, 0x0

    .line 158
    const/4 v11, 0x0

    .line 159
    const/4 v12, 0x0

    .line 160
    const-wide/16 v13, 0x0

    .line 161
    .line 162
    const-wide/16 v15, 0x0

    .line 163
    .line 164
    const-wide/16 v17, 0x0

    .line 165
    .line 166
    invoke-static/range {v2 .. v21}, La/s5t0;->a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    :cond_6
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 180
    .line 181
    iget-boolean v4, v5, La/x5t0;->j:Z

    .line 182
    .line 183
    if-eqz v4, :cond_8

    .line 184
    .line 185
    if-ne v4, v2, :cond_7

    .line 186
    .line 187
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v1, p1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iget-object v1, v6, La/a6t0;->D:La/dgu;

    .line 201
    .line 202
    iget-object v4, v6, La/a6t0;->q:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 203
    .line 204
    iget-object v4, v4, Lorg/xplatform/ufc/api/game/UfcPostGameParams;->a:Ljava/lang/String;

    .line 205
    .line 206
    iput-boolean v2, v5, La/x5t0;->j:Z

    .line 207
    .line 208
    invoke-virtual {v1, v4, v5}, La/dgu;->w(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-ne v1, v0, :cond_9

    .line 213
    .line 214
    move-object v3, v0

    .line 215
    goto :goto_5

    .line 216
    :cond_9
    :goto_3
    check-cast v1, La/q5t0;

    .line 217
    .line 218
    iget-object v0, v1, La/q5t0;->a:Ljava/lang/Object;

    .line 219
    .line 220
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 221
    .line 222
    instance-of v2, v0, La/g0g0;

    .line 223
    .line 224
    if-eqz v2, :cond_a

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_a
    move-object v3, v0

    .line 228
    :goto_4
    check-cast v3, La/i6t0;

    .line 229
    .line 230
    if-nez v3, :cond_c

    .line 231
    .line 232
    sget v0, La/a6t0;->K:I

    .line 233
    .line 234
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 235
    .line 236
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 237
    .line 238
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-object v2, v1

    .line 246
    check-cast v2, La/s5t0;

    .line 247
    .line 248
    sget-object v3, La/n5t0;->c:La/n5t0;

    .line 249
    .line 250
    const-wide/16 v19, 0x0

    .line 251
    .line 252
    const v21, 0x1fffd

    .line 253
    .line 254
    .line 255
    const/4 v4, 0x0

    .line 256
    const/4 v5, 0x0

    .line 257
    const/4 v6, 0x0

    .line 258
    const/4 v7, 0x0

    .line 259
    const/4 v8, 0x0

    .line 260
    const/4 v9, 0x0

    .line 261
    const/4 v10, 0x0

    .line 262
    const/4 v11, 0x0

    .line 263
    const/4 v12, 0x0

    .line 264
    const-wide/16 v13, 0x0

    .line 265
    .line 266
    const-wide/16 v15, 0x0

    .line 267
    .line 268
    const-wide/16 v17, 0x0

    .line 269
    .line 270
    invoke-static/range {v2 .. v21}, La/s5t0;->a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_b

    .line 279
    .line 280
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_c
    new-instance v0, La/htr0;

    .line 284
    .line 285
    const/16 v2, 0x17

    .line 286
    .line 287
    invoke-direct {v0, v3, v1, v2}, La/htr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 288
    .line 289
    .line 290
    sget v1, La/a6t0;->K:I

    .line 291
    .line 292
    invoke-virtual {v6, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 293
    .line 294
    .line 295
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    :goto_5
    return-object v3

    .line 298
    nop

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
