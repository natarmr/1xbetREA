.class public final La/zsc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/dtc0;


# direct methods
.method public synthetic constructor <init>(La/dtc0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zsc0;->i:B

    iput-object p1, p0, La/zsc0;->k:La/dtc0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/zsc0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zsc0;->k:La/dtc0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/zsc0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/zsc0;-><init>(La/dtc0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/zsc0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/zsc0;-><init>(La/dtc0;La/yje;B)V

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
    iget-byte v0, p0, La/zsc0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zsc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zsc0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zsc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zsc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zsc0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zsc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zsc0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/zsc0;->k:La/dtc0;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/zsc0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

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
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, La/rrc0;

    .line 38
    .line 39
    iget-boolean v2, v2, La/rrc0;->d:Z

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    iput-boolean v5, v0, La/zsc0;->j:Z

    .line 44
    .line 45
    invoke-virtual {v4, v0}, La/dtc0;->N(La/zje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-ne v0, v1, :cond_2

    .line 50
    .line 51
    move-object v2, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    :goto_1
    return-object v2

    .line 56
    :pswitch_0
    iget-object v1, v4, La/dtc0;->p:La/ctf0;

    .line 57
    .line 58
    iget-object v6, v4, La/i3t0;->i:La/ocj;

    .line 59
    .line 60
    sget-object v7, La/wne;->a:La/wne;

    .line 61
    .line 62
    iget-boolean v8, v0, La/zsc0;->j:Z

    .line 63
    .line 64
    if-eqz v8, :cond_4

    .line 65
    .line 66
    if-ne v8, v5, :cond_3

    .line 67
    .line 68
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 v0, p1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget v2, La/dtc0;->D:I

    .line 83
    .line 84
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 85
    .line 86
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-object v8, v3

    .line 94
    check-cast v8, La/rrc0;

    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const v17, 0xfffb

    .line 99
    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    const/4 v10, 0x0

    .line 103
    const/4 v11, 0x1

    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v13, 0x0

    .line 106
    const/4 v14, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    invoke-static/range {v8 .. v17}, La/rrc0;->a(La/rrc0;Ljava/util/List;IZZLjava/lang/String;ZZZI)La/rrc0;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-virtual {v2, v3, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    iget-object v2, v4, La/dtc0;->t:La/j910;

    .line 119
    .line 120
    iput-boolean v5, v0, La/zsc0;->j:Z

    .line 121
    .line 122
    invoke-virtual {v2, v0}, La/j910;->q(La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-ne v0, v7, :cond_6

    .line 127
    .line 128
    move-object v2, v7

    .line 129
    goto/16 :goto_4

    .line 130
    .line 131
    :cond_6
    :goto_2
    move-object v3, v0

    .line 132
    check-cast v3, La/o7c0;

    .line 133
    .line 134
    iget-object v0, v4, La/dtc0;->u:La/b4j;

    .line 135
    .line 136
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 137
    .line 138
    const-string v2, "promo_shop_get_points_call"

    .line 139
    .line 140
    const-string v7, "screen"

    .line 141
    .line 142
    const-string v8, "promo_shop"

    .line 143
    .line 144
    invoke-static {v7, v8, v0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget v11, v3, La/o7c0;->d:I

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const v2, 0x7f13101d

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v2, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, La/rrc0;

    .line 172
    .line 173
    iget-boolean v0, v0, La/rrc0;->f:Z

    .line 174
    .line 175
    if-nez v0, :cond_7

    .line 176
    .line 177
    move-object v0, v14

    .line 178
    goto :goto_3

    .line 179
    :cond_7
    const-string v0, ""

    .line 180
    .line 181
    :goto_3
    new-instance v2, La/psc0;

    .line 182
    .line 183
    invoke-direct {v2, v0}, La/psc0;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v0, v6, La/ocj;->a:La/p7m0;

    .line 190
    .line 191
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-object v9, v2

    .line 199
    check-cast v9, La/rrc0;

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    const v18, 0xffbd

    .line 204
    .line 205
    .line 206
    const/4 v10, 0x0

    .line 207
    const/4 v12, 0x0

    .line 208
    const/4 v13, 0x0

    .line 209
    const/4 v15, 0x0

    .line 210
    const/16 v16, 0x0

    .line 211
    .line 212
    invoke-static/range {v9 .. v18}, La/rrc0;->a(La/rrc0;Ljava/util/List;IZZLjava/lang/String;ZZZI)La/rrc0;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-virtual {v0, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_8

    .line 221
    .line 222
    new-instance v0, La/osc0;

    .line 223
    .line 224
    invoke-static {v3, v1}, La/zvw;->V(La/o7c0;La/ctf0;)La/thc0;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget-object v1, v1, La/thc0;->b:Ljava/lang/String;

    .line 229
    .line 230
    invoke-direct {v0, v1}, La/osc0;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    iget-object v0, v4, La/dtc0;->v:La/x20;

    .line 237
    .line 238
    iget-object v0, v0, La/x20;->a:La/s1p;

    .line 239
    .line 240
    new-instance v1, La/j1p;

    .line 241
    .line 242
    invoke-direct {v1, v8, v5}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 243
    .line 244
    .line 245
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    const-wide/16 v2, 0xced

    .line 250
    .line 251
    invoke-virtual {v0, v1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 252
    .line 253
    .line 254
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    :goto_4
    return-object v2

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
