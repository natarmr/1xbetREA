.class public final La/yvo;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cwo;


# direct methods
.method public synthetic constructor <init>(La/cwo;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yvo;->i:B

    iput-object p1, p0, La/yvo;->k:La/cwo;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yvo;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yvo;->k:La/cwo;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/yvo;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/yvo;-><init>(La/cwo;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/yvo;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/yvo;-><init>(La/cwo;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/yvo;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/yvo;-><init>(La/cwo;La/yje;B)V

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
    iput-boolean p0, v0, La/yvo;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance p1, La/yvo;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/yvo;-><init>(La/cwo;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    nop

    .line 45
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
    iget-byte v0, p0, La/yvo;->i:B

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
    invoke-virtual {p0, p1, p2}, La/yvo;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yvo;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yvo;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yvo;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/yvo;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/yvo;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yvo;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/yvo;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/yvo;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/vne;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/yvo;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/yvo;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/yvo;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yvo;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/yvo;->k:La/cwo;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/yvo;->j:Z

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
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v5, La/cwo;->v:La/jwu;

    .line 34
    .line 35
    iget-object v3, v5, La/cwo;->o:Ljava/lang/String;

    .line 36
    .line 37
    iput-boolean v4, v0, La/yvo;->j:Z

    .line 38
    .line 39
    invoke-virtual {v2, v3, v0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v2, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v2

    .line 50
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 51
    .line 52
    iget-boolean v6, v0, La/yvo;->j:Z

    .line 53
    .line 54
    if-eqz v6, :cond_4

    .line 55
    .line 56
    if-ne v6, v4, :cond_3

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v5, La/cwo;->z:La/bby;

    .line 70
    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    iput-boolean v4, v0, La/yvo;->j:Z

    .line 74
    .line 75
    invoke-static {v2, v0}, La/zvw;->H(La/bby;La/yje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-ne v0, v1, :cond_5

    .line 80
    .line 81
    move-object v2, v1

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    :goto_3
    return-object v2

    .line 86
    :pswitch_1
    iget-boolean v0, v0, La/yvo;->j:Z

    .line 87
    .line 88
    sget-object v1, La/wne;->a:La/wne;

    .line 89
    .line 90
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/mvo;

    .line 100
    .line 101
    iget-object v0, v0, La/mvo;->d:La/kvo;

    .line 102
    .line 103
    if-nez v0, :cond_6

    .line 104
    .line 105
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/mvo;

    .line 110
    .line 111
    iget-boolean v0, v0, La/mvo;->b:Z

    .line 112
    .line 113
    if-nez v0, :cond_6

    .line 114
    .line 115
    invoke-virtual {v5}, La/cwo;->O()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5}, La/cwo;->M()V

    .line 119
    .line 120
    .line 121
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_2
    iget-object v1, v5, La/i3t0;->f:La/oyg0;

    .line 125
    .line 126
    iget-object v6, v5, La/i3t0;->i:La/ocj;

    .line 127
    .line 128
    sget-object v7, La/wne;->a:La/wne;

    .line 129
    .line 130
    iget-boolean v8, v0, La/yvo;->j:Z

    .line 131
    .line 132
    if-eqz v8, :cond_8

    .line 133
    .line 134
    if-ne v8, v4, :cond_7

    .line 135
    .line 136
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v0, p1

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_7

    .line 146
    .line 147
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, La/mvo;

    .line 155
    .line 156
    iget-object v2, v2, La/mvo;->d:La/kvo;

    .line 157
    .line 158
    if-eqz v2, :cond_a

    .line 159
    .line 160
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, La/mvo;

    .line 165
    .line 166
    iget-object v2, v2, La/mvo;->d:La/kvo;

    .line 167
    .line 168
    if-eqz v2, :cond_9

    .line 169
    .line 170
    iget-object v2, v2, La/kvo;->b:Ljava/util/List;

    .line 171
    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-ne v2, v4, :cond_9

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_9
    const/4 v2, 0x0

    .line 182
    move v10, v2

    .line 183
    goto :goto_5

    .line 184
    :cond_a
    :goto_4
    move v10, v4

    .line 185
    :goto_5
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 186
    .line 187
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-object v8, v3

    .line 195
    check-cast v8, La/mvo;

    .line 196
    .line 197
    const/4 v14, 0x0

    .line 198
    const/16 v15, 0x39

    .line 199
    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v11, 0x0

    .line 202
    const/4 v12, 0x0

    .line 203
    const/4 v13, 0x0

    .line 204
    invoke-static/range {v8 .. v15}, La/mvo;->a(La/mvo;ZZZLa/kvo;La/zdm0;La/nc5;I)La/mvo;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-virtual {v2, v3, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_b

    .line 213
    .line 214
    iget-object v2, v5, La/cwo;->t:La/x4u;

    .line 215
    .line 216
    iget-object v3, v5, La/cwo;->o:Ljava/lang/String;

    .line 217
    .line 218
    iput-boolean v4, v0, La/yvo;->j:Z

    .line 219
    .line 220
    iget-object v2, v2, La/x4u;->a:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v2, La/iqi;

    .line 223
    .line 224
    invoke-virtual {v2, v0, v3, v4}, La/iqi;->c(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-ne v0, v7, :cond_c

    .line 229
    .line 230
    move-object v2, v7

    .line 231
    goto :goto_7

    .line 232
    :cond_c
    :goto_6
    move-object v11, v0

    .line 233
    check-cast v11, La/kvo;

    .line 234
    .line 235
    sget v0, La/cwo;->B:I

    .line 236
    .line 237
    iget-object v3, v6, La/ocj;->a:La/p7m0;

    .line 238
    .line 239
    :cond_d
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-object v7, v0

    .line 247
    check-cast v7, La/mvo;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    const/4 v13, 0x0

    .line 253
    const/16 v14, 0x31

    .line 254
    .line 255
    const/4 v8, 0x0

    .line 256
    const/4 v9, 0x0

    .line 257
    const/4 v10, 0x0

    .line 258
    const/4 v12, 0x0

    .line 259
    invoke-static/range {v7 .. v14}, La/mvo;->a(La/mvo;ZZZLa/kvo;La/zdm0;La/nc5;I)La/mvo;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_d

    .line 268
    .line 269
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    :goto_7
    return-object v2

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
