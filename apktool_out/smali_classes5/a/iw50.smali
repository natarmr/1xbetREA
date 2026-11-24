.class public final La/iw50;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/kw50;


# direct methods
.method public synthetic constructor <init>(La/kw50;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/iw50;->i:B

    iput-object p1, p0, La/iw50;->k:La/kw50;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/iw50;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/iw50;->k:La/kw50;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/iw50;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/iw50;-><init>(La/kw50;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/iw50;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/iw50;-><init>(La/kw50;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/iw50;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/iw50;-><init>(La/kw50;La/yje;B)V

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
    iput-boolean p0, v0, La/iw50;->j:Z

    .line 35
    .line 36
    return-object v0

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
    iget-byte v0, p0, La/iw50;->i:B

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
    invoke-virtual {p0, p1, p2}, La/iw50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/iw50;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/iw50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/iw50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/iw50;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/iw50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/iw50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/iw50;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/iw50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iw50;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/iw50;->k:La/kw50;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/iw50;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

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
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    sget v2, La/kw50;->N:I

    .line 36
    .line 37
    iget-object v2, v5, La/kw50;->v:La/iqt;

    .line 38
    .line 39
    iget-object v2, v2, La/iqt;->a:La/gst0;

    .line 40
    .line 41
    invoke-virtual {v2}, La/gst0;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    iget-object v2, v5, La/kw50;->p:La/rou;

    .line 48
    .line 49
    iput-boolean v4, v0, La/iw50;->j:Z

    .line 50
    .line 51
    invoke-virtual {v2, v4, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-ne v0, v1, :cond_2

    .line 56
    .line 57
    move-object v2, v1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    check-cast v0, La/m2c0;

    .line 60
    .line 61
    iget-boolean v15, v0, La/m2c0;->n0:Z

    .line 62
    .line 63
    sget v0, La/kw50;->N:I

    .line 64
    .line 65
    iget-object v0, v5, La/i3t0;->i:La/ocj;

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
    move-object v6, v1

    .line 77
    check-cast v6, La/zv50;

    .line 78
    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    const v17, 0x9fff

    .line 82
    .line 83
    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v11, 0x0

    .line 89
    const/4 v12, 0x0

    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v14, 0x0

    .line 92
    invoke-static/range {v6 .. v17}, La/zv50;->a(La/zv50;La/kr5;La/ykg0;La/nk80;ZLjava/util/List;IZZZZI)La/zv50;

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
    :cond_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    :goto_1
    return-object v2

    .line 105
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 106
    .line 107
    iget-boolean v6, v0, La/iw50;->j:Z

    .line 108
    .line 109
    if-eqz v6, :cond_6

    .line 110
    .line 111
    if-ne v6, v4, :cond_5

    .line 112
    .line 113
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object/from16 v0, p1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object v2, v5, La/kw50;->v:La/iqt;

    .line 127
    .line 128
    iget-object v2, v2, La/iqt;->a:La/gst0;

    .line 129
    .line 130
    invoke-virtual {v2}, La/gst0;->a()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_8

    .line 135
    .line 136
    iget-object v2, v5, La/kw50;->p:La/rou;

    .line 137
    .line 138
    iput-boolean v4, v0, La/iw50;->j:Z

    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    invoke-virtual {v2, v3, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-ne v0, v1, :cond_7

    .line 146
    .line 147
    move-object v2, v1

    .line 148
    goto :goto_4

    .line 149
    :cond_7
    :goto_2
    check-cast v0, La/m2c0;

    .line 150
    .line 151
    sget v1, La/kw50;->N:I

    .line 152
    .line 153
    invoke-virtual {v5, v0}, La/kw50;->Q(La/m2c0;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    invoke-static {}, La/u7x;->C()La/m2c0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v5, v0}, La/kw50;->Q(La/m2c0;)V

    .line 162
    .line 163
    .line 164
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    :goto_4
    return-object v2

    .line 167
    :pswitch_1
    iget-boolean v0, v0, La/iw50;->j:Z

    .line 168
    .line 169
    sget-object v1, La/wne;->a:La/wne;

    .line 170
    .line 171
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iput-boolean v0, v5, La/kw50;->M:Z

    .line 175
    .line 176
    if-eqz v0, :cond_9

    .line 177
    .line 178
    invoke-virtual {v5}, La/kw50;->S()V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_9
    if-nez v0, :cond_b

    .line 183
    .line 184
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, La/zv50;

    .line 189
    .line 190
    iget-object v1, v1, La/zv50;->a:La/kr5;

    .line 191
    .line 192
    sget-object v2, La/kr5;->B:La/kr5;

    .line 193
    .line 194
    invoke-virtual {v1, v2}, La/kr5;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_b

    .line 199
    .line 200
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 201
    .line 202
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 203
    .line 204
    :cond_a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-object v6, v0

    .line 212
    check-cast v6, La/zv50;

    .line 213
    .line 214
    sget-object v7, La/kr5;->B:La/kr5;

    .line 215
    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    const v17, 0xfffa

    .line 219
    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v9, 0x0

    .line 223
    const/4 v10, 0x0

    .line 224
    const/4 v11, 0x0

    .line 225
    const/4 v12, 0x0

    .line 226
    const/4 v13, 0x0

    .line 227
    const/4 v14, 0x0

    .line 228
    const/4 v15, 0x0

    .line 229
    invoke-static/range {v6 .. v17}, La/zv50;->a(La/zv50;La/kr5;La/ykg0;La/nk80;ZLjava/util/List;IZZZZI)La/zv50;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_a

    .line 238
    .line 239
    sget-object v0, La/mk80;->b:La/mk80;

    .line 240
    .line 241
    invoke-virtual {v5, v0}, La/kw50;->T(La/mk80;)V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_b
    if-nez v0, :cond_c

    .line 246
    .line 247
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, La/zv50;

    .line 252
    .line 253
    iget-object v0, v0, La/zv50;->a:La/kr5;

    .line 254
    .line 255
    sget-object v1, La/kr5;->B:La/kr5;

    .line 256
    .line 257
    invoke-virtual {v0, v1}, La/kr5;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-nez v0, :cond_c

    .line 262
    .line 263
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_c
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    :goto_6
    return-object v0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
