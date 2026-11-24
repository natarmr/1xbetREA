.class public final La/ico0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/zco0;


# direct methods
.method public synthetic constructor <init>(La/zco0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ico0;->i:B

    iput-object p1, p0, La/ico0;->k:La/zco0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ico0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ico0;->k:La/zco0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ico0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ico0;-><init>(La/zco0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ico0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ico0;-><init>(La/zco0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ico0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ico0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ico0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ico0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ico0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ico0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ico0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ico0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/ico0;->k:La/zco0;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/ico0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

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
    iget-object v2, v4, La/zco0;->O:La/r2u;

    .line 36
    .line 37
    iput-boolean v3, v0, La/ico0;->j:Z

    .line 38
    .line 39
    invoke-virtual {v2, v0}, La/r2u;->c(La/zje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v5, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    move-object/from16 v22, v0

    .line 48
    .line 49
    check-cast v22, Ljava/util/List;

    .line 50
    .line 51
    sget v0, La/zco0;->r0:I

    .line 52
    .line 53
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 54
    .line 55
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 56
    .line 57
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-object v5, v0

    .line 65
    check-cast v5, La/glb0;

    .line 66
    .line 67
    const/16 v24, 0x0

    .line 68
    .line 69
    const v25, 0x1bfffff

    .line 70
    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x0

    .line 81
    const/4 v15, 0x0

    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v17, 0x0

    .line 85
    .line 86
    const/16 v18, 0x0

    .line 87
    .line 88
    const/16 v19, 0x0

    .line 89
    .line 90
    const/16 v20, 0x0

    .line 91
    .line 92
    const/16 v21, 0x0

    .line 93
    .line 94
    const/16 v23, 0x0

    .line 95
    .line 96
    invoke-static/range {v5 .. v25}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    :goto_1
    return-object v5

    .line 109
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 110
    .line 111
    iget-boolean v6, v0, La/ico0;->j:Z

    .line 112
    .line 113
    if-eqz v6, :cond_5

    .line 114
    .line 115
    if-ne v6, v3, :cond_4

    .line 116
    .line 117
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v0, p1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_5

    .line 127
    .line 128
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v2, v4, La/zco0;->v:La/j3c;

    .line 132
    .line 133
    iput-boolean v3, v0, La/ico0;->j:Z

    .line 134
    .line 135
    invoke-virtual {v2, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-ne v0, v1, :cond_6

    .line 140
    .line 141
    move-object v5, v1

    .line 142
    goto :goto_5

    .line 143
    :cond_6
    :goto_2
    move-object v9, v0

    .line 144
    check-cast v9, La/wcb;

    .line 145
    .line 146
    sget v0, La/zco0;->r0:I

    .line 147
    .line 148
    invoke-virtual {v4}, La/zco0;->P()La/sff0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 153
    .line 154
    iget-object v0, v0, La/mum0;->a:La/c4l0;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_b

    .line 161
    .line 162
    if-eq v0, v3, :cond_a

    .line 163
    .line 164
    const/4 v1, 0x2

    .line 165
    if-eq v0, v1, :cond_9

    .line 166
    .line 167
    const/4 v1, 0x3

    .line 168
    if-eq v0, v1, :cond_8

    .line 169
    .line 170
    const/4 v1, 0x4

    .line 171
    if-ne v0, v1, :cond_7

    .line 172
    .line 173
    sget-object v0, La/uql0;->b:La/uql0;

    .line 174
    .line 175
    :goto_3
    move-object v7, v0

    .line 176
    goto :goto_4

    .line 177
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_8
    sget-object v0, La/uql0;->e:La/uql0;

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_9
    sget-object v0, La/uql0;->d:La/uql0;

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_a
    sget-object v0, La/uql0;->a:La/uql0;

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_b
    sget-object v0, La/uql0;->c:La/uql0;

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :goto_4
    invoke-virtual {v4}, La/zco0;->P()La/sff0;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 198
    .line 199
    iget-object v0, v0, La/mum0;->A:La/r6l0;

    .line 200
    .line 201
    invoke-static {v0}, La/gkb;->b0(La/r6l0;)La/npo;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-virtual {v4}, La/zco0;->P()La/sff0;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 210
    .line 211
    iget-object v11, v0, La/mum0;->y:La/v5l0;

    .line 212
    .line 213
    invoke-virtual {v4}, La/zco0;->P()La/sff0;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iget-boolean v8, v0, La/sff0;->J:Z

    .line 218
    .line 219
    iget-object v0, v4, La/zco0;->P:La/r9u;

    .line 220
    .line 221
    sget-object v1, La/ygp;->t:La/ygp;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 232
    .line 233
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    new-instance v6, La/qxf;

    .line 238
    .line 239
    invoke-direct/range {v6 .. v12}, La/qxf;-><init>(La/uql0;ZLa/wcb;La/npo;La/v5l0;Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4, v6}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 243
    .line 244
    .line 245
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    :goto_5
    return-object v5

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
