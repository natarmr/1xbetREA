.class public final La/i270;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/n270;


# direct methods
.method public synthetic constructor <init>(La/n270;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i270;->i:B

    iput-object p1, p0, La/i270;->k:La/n270;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/i270;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/i270;->k:La/n270;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/i270;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/i270;-><init>(La/n270;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/i270;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/i270;-><init>(La/n270;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/i270;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/i270;-><init>(La/n270;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/i270;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance v0, La/i270;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v0, p0, p2, v1}, La/i270;-><init>(La/n270;La/yje;B)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    iput-boolean p0, v0, La/i270;->j:Z

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_3
    new-instance p1, La/i270;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-direct {p1, p0, p2, v0}, La/i270;-><init>(La/n270;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
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
    iget-byte v0, p0, La/i270;->i:B

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
    invoke-virtual {p0, p1, p2}, La/i270;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/i270;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/i270;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/i270;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/i270;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/i270;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/i270;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/i270;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/i270;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    check-cast p2, La/yje;

    .line 66
    .line 67
    invoke-virtual {p0, p1, p2}, La/i270;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/i270;

    .line 72
    .line 73
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/i270;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_3
    check-cast p1, La/vne;

    .line 81
    .line 82
    check-cast p2, La/yje;

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, La/i270;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/i270;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/i270;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/i270;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/i270;->k:La/n270;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v2, v0, La/i270;->j:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v6, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v5, La/n270;->x:La/ls;

    .line 35
    .line 36
    sget-object v3, La/s470;->p:La/s470;

    .line 37
    .line 38
    invoke-virtual {v3}, La/s470;->a()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    iput-boolean v6, v0, La/i270;->j:Z

    .line 43
    .line 44
    invoke-virtual {v2, v3, v4, v0}, La/ls;->b(JLa/yje;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    move-object v4, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    iget-object v0, v5, La/n270;->K:La/i1w0;

    .line 53
    .line 54
    new-instance v1, La/f270;

    .line 55
    .line 56
    const/4 v2, 0x5

    .line 57
    invoke-direct {v1, v5, v2}, La/f270;-><init>(La/n270;B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    :goto_1
    return-object v4

    .line 66
    :pswitch_0
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 67
    .line 68
    sget-object v7, La/wne;->a:La/wne;

    .line 69
    .line 70
    iget-boolean v8, v0, La/i270;->j:Z

    .line 71
    .line 72
    if-eqz v8, :cond_4

    .line 73
    .line 74
    if-ne v8, v6, :cond_3

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object/from16 v0, p1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, La/c270;

    .line 94
    .line 95
    iget-object v3, v3, La/c270;->g:La/k170;

    .line 96
    .line 97
    iget-boolean v3, v3, La/k170;->a:Z

    .line 98
    .line 99
    if-eqz v3, :cond_7

    .line 100
    .line 101
    iput-boolean v6, v0, La/i270;->j:Z

    .line 102
    .line 103
    invoke-virtual {v5, v0}, La/n270;->M(La/zje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-ne v0, v7, :cond_5

    .line 108
    .line 109
    move-object v4, v7

    .line 110
    goto :goto_4

    .line 111
    :cond_5
    :goto_2
    check-cast v0, La/ql5;

    .line 112
    .line 113
    iget-object v2, v5, La/n270;->y:La/dmt;

    .line 114
    .line 115
    invoke-virtual {v2}, La/dmt;->b()La/kg;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-object v4, v1, La/ocj;->a:La/p7m0;

    .line 120
    .line 121
    :cond_6
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-object v7, v1

    .line 129
    check-cast v7, La/c270;

    .line 130
    .line 131
    new-instance v14, La/k170;

    .line 132
    .line 133
    invoke-direct {v14, v6, v3, v0}, La/k170;-><init>(ZLa/kg;La/ql5;)V

    .line 134
    .line 135
    .line 136
    const/4 v15, 0x0

    .line 137
    const/16 v16, 0xbf

    .line 138
    .line 139
    const/4 v8, 0x0

    .line 140
    const/4 v9, 0x0

    .line 141
    const/4 v10, 0x0

    .line 142
    const/4 v11, 0x0

    .line 143
    const/4 v12, 0x0

    .line 144
    const/4 v13, 0x0

    .line 145
    invoke-static/range {v7 .. v16}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v4, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_6

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 157
    .line 158
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-object v3, v0

    .line 166
    check-cast v3, La/c270;

    .line 167
    .line 168
    iget-object v4, v3, La/c270;->g:La/k170;

    .line 169
    .line 170
    iget-object v5, v4, La/k170;->b:La/kg;

    .line 171
    .line 172
    iget-object v4, v4, La/k170;->c:La/ql5;

    .line 173
    .line 174
    new-instance v10, La/k170;

    .line 175
    .line 176
    invoke-direct {v10, v2, v5, v4}, La/k170;-><init>(ZLa/kg;La/ql5;)V

    .line 177
    .line 178
    .line 179
    const/4 v11, 0x0

    .line 180
    const/16 v12, 0xbf

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v5, 0x0

    .line 184
    const/4 v6, 0x0

    .line 185
    const/4 v7, 0x0

    .line 186
    const/4 v8, 0x0

    .line 187
    const/4 v9, 0x0

    .line 188
    invoke-static/range {v3 .. v12}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_8

    .line 197
    .line 198
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    :goto_4
    return-object v4

    .line 201
    :pswitch_1
    iget-boolean v1, v0, La/i270;->j:Z

    .line 202
    .line 203
    sget-object v0, La/wne;->a:La/wne;

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    sget v0, La/n270;->Z:I

    .line 209
    .line 210
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 211
    .line 212
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 213
    .line 214
    :cond_9
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-object v6, v0

    .line 222
    check-cast v6, La/c270;

    .line 223
    .line 224
    iget-object v2, v6, La/c270;->g:La/k170;

    .line 225
    .line 226
    iget-object v4, v2, La/k170;->b:La/kg;

    .line 227
    .line 228
    iget-object v2, v2, La/k170;->c:La/ql5;

    .line 229
    .line 230
    new-instance v13, La/k170;

    .line 231
    .line 232
    invoke-direct {v13, v1, v4, v2}, La/k170;-><init>(ZLa/kg;La/ql5;)V

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const/16 v15, 0xbf

    .line 237
    .line 238
    const/4 v7, 0x0

    .line 239
    const/4 v8, 0x0

    .line 240
    const/4 v9, 0x0

    .line 241
    const/4 v10, 0x0

    .line 242
    const/4 v11, 0x0

    .line 243
    const/4 v12, 0x0

    .line 244
    invoke-static/range {v6 .. v15}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_9

    .line 253
    .line 254
    if-eqz v1, :cond_a

    .line 255
    .line 256
    invoke-virtual {v5}, La/n270;->O()V

    .line 257
    .line 258
    .line 259
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_2
    iget-boolean v0, v0, La/i270;->j:Z

    .line 263
    .line 264
    sget-object v1, La/wne;->a:La/wne;

    .line 265
    .line 266
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    iget-object v1, v5, La/n270;->R:La/p7m0;

    .line 270
    .line 271
    iget-object v3, v5, La/n270;->S:La/p7m0;

    .line 272
    .line 273
    iget-object v7, v5, La/i3t0;->f:La/oyg0;

    .line 274
    .line 275
    iget-object v8, v5, La/i3t0;->i:La/ocj;

    .line 276
    .line 277
    sget v9, La/n270;->Z:I

    .line 278
    .line 279
    invoke-virtual {v5}, La/n270;->O()V

    .line 280
    .line 281
    .line 282
    if-eqz v0, :cond_d

    .line 283
    .line 284
    iget-object v2, v5, La/n270;->V:La/c4m0;

    .line 285
    .line 286
    if-eqz v2, :cond_b

    .line 287
    .line 288
    invoke-virtual {v2}, La/pby;->isActive()Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-ne v2, v6, :cond_b

    .line 293
    .line 294
    goto/16 :goto_6

    .line 295
    .line 296
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, La/pat;

    .line 301
    .line 302
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    instance-of v2, v2, La/kat;

    .line 306
    .line 307
    if-eqz v2, :cond_c

    .line 308
    .line 309
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, La/pat;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    instance-of v2, v2, La/kat;

    .line 319
    .line 320
    if-eqz v2, :cond_c

    .line 321
    .line 322
    sget-object v2, La/b270;->a:La/b270;

    .line 323
    .line 324
    invoke-virtual {v5, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_c
    sget-object v2, La/m270;->h:La/m270;

    .line 328
    .line 329
    new-instance v7, La/p6d;

    .line 330
    .line 331
    invoke-direct {v7, v1, v3, v2, v6}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 332
    .line 333
    .line 334
    new-instance v1, La/j270;

    .line 335
    .line 336
    invoke-direct {v1, v5, v4, v6}, La/j270;-><init>(La/n270;La/yje;B)V

    .line 337
    .line 338
    .line 339
    new-instance v2, La/fnq;

    .line 340
    .line 341
    const/4 v3, 0x4

    .line 342
    invoke-direct {v2, v7, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 343
    .line 344
    .line 345
    new-instance v1, La/rf0;

    .line 346
    .line 347
    const/16 v7, 0x9

    .line 348
    .line 349
    invoke-direct {v1, v2, v7}, La/rf0;-><init>(La/fnq;B)V

    .line 350
    .line 351
    .line 352
    new-instance v2, La/az60;

    .line 353
    .line 354
    invoke-direct {v2, v5, v4}, La/az60;-><init>(La/n270;La/yje;)V

    .line 355
    .line 356
    .line 357
    new-instance v7, La/fnq;

    .line 358
    .line 359
    invoke-direct {v7, v1, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 360
    .line 361
    .line 362
    new-instance v1, La/j270;

    .line 363
    .line 364
    const/4 v2, 0x2

    .line 365
    invoke-direct {v1, v5, v4, v2}, La/j270;-><init>(La/n270;La/yje;B)V

    .line 366
    .line 367
    .line 368
    new-instance v2, La/fnq;

    .line 369
    .line 370
    invoke-direct {v2, v7, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 371
    .line 372
    .line 373
    new-instance v1, La/qos;

    .line 374
    .line 375
    const/16 v3, 0x18

    .line 376
    .line 377
    invoke-direct {v1, v5, v4, v3}, La/qos;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 378
    .line 379
    .line 380
    new-instance v3, La/dnq;

    .line 381
    .line 382
    invoke-direct {v3, v2, v1, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 383
    .line 384
    .line 385
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    iget-object v2, v5, La/n270;->O:La/mne;

    .line 390
    .line 391
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 392
    .line 393
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-static {v3, v1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    iput-object v1, v5, La/n270;->V:La/c4m0;

    .line 402
    .line 403
    goto/16 :goto_6

    .line 404
    .line 405
    :cond_d
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    check-cast v4, La/c270;

    .line 410
    .line 411
    iget-boolean v4, v4, La/c270;->d:Z

    .line 412
    .line 413
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    check-cast v1, La/pat;

    .line 418
    .line 419
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    instance-of v1, v1, La/oat;

    .line 423
    .line 424
    if-nez v1, :cond_e

    .line 425
    .line 426
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    check-cast v1, La/pat;

    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    instance-of v1, v1, La/oat;

    .line 436
    .line 437
    if-eqz v1, :cond_f

    .line 438
    .line 439
    :cond_e
    move v2, v6

    .line 440
    :cond_f
    if-eqz v4, :cond_11

    .line 441
    .line 442
    if-eqz v2, :cond_11

    .line 443
    .line 444
    iget-object v1, v8, La/ocj;->a:La/p7m0;

    .line 445
    .line 446
    :cond_10
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    move-object v9, v2

    .line 454
    check-cast v9, La/c270;

    .line 455
    .line 456
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    sget-object v15, La/m170;->c:La/m170;

    .line 460
    .line 461
    const/16 v17, 0x0

    .line 462
    .line 463
    const/16 v18, 0xdf

    .line 464
    .line 465
    const/4 v10, 0x0

    .line 466
    const/4 v11, 0x0

    .line 467
    const/4 v12, 0x0

    .line 468
    const/4 v13, 0x0

    .line 469
    const/4 v14, 0x0

    .line 470
    const/16 v16, 0x0

    .line 471
    .line 472
    invoke-static/range {v9 .. v18}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-eqz v2, :cond_10

    .line 481
    .line 482
    goto/16 :goto_5

    .line 483
    .line 484
    :cond_11
    if-nez v4, :cond_13

    .line 485
    .line 486
    if-eqz v2, :cond_13

    .line 487
    .line 488
    iget-object v1, v8, La/ocj;->a:La/p7m0;

    .line 489
    .line 490
    :cond_12
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    move-object v9, v2

    .line 498
    check-cast v9, La/c270;

    .line 499
    .line 500
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    sget-object v15, La/m170;->b:La/m170;

    .line 504
    .line 505
    const/16 v17, 0x0

    .line 506
    .line 507
    const/16 v18, 0xdf

    .line 508
    .line 509
    const/4 v10, 0x0

    .line 510
    const/4 v11, 0x0

    .line 511
    const/4 v12, 0x0

    .line 512
    const/4 v13, 0x0

    .line 513
    const/4 v14, 0x0

    .line 514
    const/16 v16, 0x0

    .line 515
    .line 516
    invoke-static/range {v9 .. v18}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    if-eqz v2, :cond_12

    .line 525
    .line 526
    goto :goto_5

    .line 527
    :cond_13
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    check-cast v1, La/c270;

    .line 532
    .line 533
    iget-object v1, v1, La/c270;->h:Ljava/util/List;

    .line 534
    .line 535
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 536
    .line 537
    .line 538
    move-result v1

    .line 539
    if-eqz v1, :cond_15

    .line 540
    .line 541
    iget-object v1, v8, La/ocj;->a:La/p7m0;

    .line 542
    .line 543
    :cond_14
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    move-object v9, v2

    .line 551
    check-cast v9, La/c270;

    .line 552
    .line 553
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    sget-object v15, La/m170;->b:La/m170;

    .line 557
    .line 558
    const/16 v17, 0x0

    .line 559
    .line 560
    const/16 v18, 0xdf

    .line 561
    .line 562
    const/4 v10, 0x0

    .line 563
    const/4 v11, 0x0

    .line 564
    const/4 v12, 0x0

    .line 565
    const/4 v13, 0x0

    .line 566
    const/4 v14, 0x0

    .line 567
    const/16 v16, 0x0

    .line 568
    .line 569
    invoke-static/range {v9 .. v18}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    if-eqz v2, :cond_14

    .line 578
    .line 579
    goto :goto_5

    .line 580
    :cond_15
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    check-cast v1, La/c270;

    .line 585
    .line 586
    iget-object v1, v1, La/c270;->h:Ljava/util/List;

    .line 587
    .line 588
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    if-nez v1, :cond_17

    .line 593
    .line 594
    iget-object v1, v8, La/ocj;->a:La/p7m0;

    .line 595
    .line 596
    :cond_16
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    move-object v9, v2

    .line 604
    check-cast v9, La/c270;

    .line 605
    .line 606
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    sget-object v15, La/m170;->a:La/m170;

    .line 610
    .line 611
    const/16 v17, 0x0

    .line 612
    .line 613
    const/16 v18, 0xdf

    .line 614
    .line 615
    const/4 v10, 0x0

    .line 616
    const/4 v11, 0x0

    .line 617
    const/4 v12, 0x0

    .line 618
    const/4 v13, 0x0

    .line 619
    const/4 v14, 0x0

    .line 620
    const/16 v16, 0x0

    .line 621
    .line 622
    invoke-static/range {v9 .. v18}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    if-eqz v2, :cond_16

    .line 631
    .line 632
    :cond_17
    :goto_5
    iget-object v1, v8, La/ocj;->a:La/p7m0;

    .line 633
    .line 634
    :cond_18
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    move-object v9, v2

    .line 642
    check-cast v9, La/c270;

    .line 643
    .line 644
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    const/16 v17, 0x0

    .line 648
    .line 649
    const/16 v18, 0xef

    .line 650
    .line 651
    const/4 v10, 0x0

    .line 652
    const/4 v11, 0x0

    .line 653
    const/4 v12, 0x0

    .line 654
    const/4 v13, 0x0

    .line 655
    const/4 v14, 0x0

    .line 656
    const/4 v15, 0x0

    .line 657
    const/16 v16, 0x0

    .line 658
    .line 659
    invoke-static/range {v9 .. v18}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    if-eqz v2, :cond_18

    .line 668
    .line 669
    :goto_6
    iget-object v11, v8, La/ocj;->a:La/p7m0;

    .line 670
    .line 671
    :goto_7
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v12

    .line 675
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    move-object v1, v12

    .line 679
    check-cast v1, La/c270;

    .line 680
    .line 681
    const/4 v9, 0x0

    .line 682
    const/16 v10, 0xf7

    .line 683
    .line 684
    const/4 v2, 0x0

    .line 685
    const/4 v3, 0x0

    .line 686
    const/4 v4, 0x0

    .line 687
    const/4 v6, 0x0

    .line 688
    const/4 v7, 0x0

    .line 689
    const/4 v8, 0x0

    .line 690
    move v5, v0

    .line 691
    invoke-static/range {v1 .. v10}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    move v2, v5

    .line 696
    invoke-virtual {v11, v12, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    if-eqz v0, :cond_19

    .line 701
    .line 702
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    return-object v0

    .line 705
    :cond_19
    move v0, v2

    .line 706
    goto :goto_7

    .line 707
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 708
    .line 709
    iget-boolean v2, v0, La/i270;->j:Z

    .line 710
    .line 711
    if-eqz v2, :cond_1b

    .line 712
    .line 713
    if-ne v2, v6, :cond_1a

    .line 714
    .line 715
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    move-object/from16 v0, p1

    .line 719
    .line 720
    goto :goto_8

    .line 721
    :cond_1a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    goto :goto_9

    .line 725
    :cond_1b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    iput-boolean v6, v0, La/i270;->j:Z

    .line 729
    .line 730
    sget v2, La/n270;->Z:I

    .line 731
    .line 732
    invoke-virtual {v5, v0}, La/n270;->M(La/zje;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    if-ne v0, v1, :cond_1c

    .line 737
    .line 738
    move-object v4, v1

    .line 739
    goto :goto_9

    .line 740
    :cond_1c
    :goto_8
    check-cast v0, La/ql5;

    .line 741
    .line 742
    iget-object v1, v5, La/n270;->Q:La/v88;

    .line 743
    .line 744
    iget-object v2, v5, La/n270;->K:La/i1w0;

    .line 745
    .line 746
    iget-wide v3, v0, La/ql5;->a:J

    .line 747
    .line 748
    invoke-virtual {v1, v2, v6, v3, v4}, La/v88;->a(La/i1w0;ZJ)V

    .line 749
    .line 750
    .line 751
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 752
    .line 753
    :goto_9
    return-object v4

    .line 754
    nop

    .line 755
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
