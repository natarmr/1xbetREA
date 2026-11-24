.class public final La/hk20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/on20;


# direct methods
.method public synthetic constructor <init>(La/on20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hk20;->i:B

    iput-object p1, p0, La/hk20;->k:La/on20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/hk20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/hk20;->k:La/on20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/hk20;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/hk20;-><init>(La/on20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/hk20;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/hk20;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/hk20;-><init>(La/on20;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/hk20;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/hk20;-><init>(La/on20;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/hk20;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/hk20;-><init>(La/on20;La/yje;B)V

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
    iget-byte v0, p0, La/hk20;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/hk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/hk20;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/hk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/hk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/hk20;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/hk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/hk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/hk20;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/hk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/hk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/hk20;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/hk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 25

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    iget-byte v0, v9, La/hk20;->i:B

    .line 4
    .line 5
    iget-object v1, v9, La/hk20;->k:La/on20;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, v9, La/hk20;->j:Z

    .line 15
    .line 16
    sget-object v2, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget v2, La/on20;->m1:I

    .line 22
    .line 23
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v5, v3

    .line 35
    check-cast v5, La/a820;

    .line 36
    .line 37
    const/16 v21, 0x0

    .line 38
    .line 39
    const v22, 0x3bfff

    .line 40
    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v15, 0x0

    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    const/16 v18, 0x0

    .line 57
    .line 58
    const/16 v20, 0x0

    .line 59
    .line 60
    move/from16 v19, v0

    .line 61
    .line 62
    invoke-static/range {v5 .. v22}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v2, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    if-eqz v19, :cond_0

    .line 73
    .line 74
    invoke-virtual {v1}, La/on20;->R0()V

    .line 75
    .line 76
    .line 77
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_1
    move/from16 v0, v19

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 84
    .line 85
    iget-boolean v5, v9, La/hk20;->j:Z

    .line 86
    .line 87
    if-eqz v5, :cond_3

    .line 88
    .line 89
    if-ne v5, v4, :cond_2

    .line 90
    .line 91
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v1, La/on20;->G0:La/tqc;

    .line 103
    .line 104
    iput-boolean v4, v9, La/hk20;->j:Z

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-virtual {v1, v2, v9}, La/tqc;->b(ZLa/bnn0;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-ne v1, v0, :cond_4

    .line 112
    .line 113
    move-object v2, v0

    .line 114
    goto :goto_2

    .line 115
    :cond_4
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_2
    return-object v2

    .line 118
    :pswitch_1
    sget-object v10, La/wne;->a:La/wne;

    .line 119
    .line 120
    iget-boolean v0, v9, La/hk20;->j:Z

    .line 121
    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    if-ne v0, v4, :cond_5

    .line 125
    .line 126
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    sget v0, La/on20;->m1:I

    .line 138
    .line 139
    iget-object v0, v9, La/hk20;->k:La/on20;

    .line 140
    .line 141
    invoke-virtual {v0}, La/on20;->E0()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, La/a820;

    .line 149
    .line 150
    iget-object v1, v1, La/a820;->e:La/pvj0;

    .line 151
    .line 152
    iget-object v1, v1, La/pvj0;->a:La/bx6;

    .line 153
    .line 154
    iget-object v1, v1, La/bx6;->b:La/tw6;

    .line 155
    .line 156
    iget-wide v2, v1, La/tw6;->a:D

    .line 157
    .line 158
    iget-object v5, v0, La/on20;->X:La/hsj;

    .line 159
    .line 160
    invoke-virtual {v5}, La/hsj;->i()D

    .line 161
    .line 162
    .line 163
    move-result-wide v5

    .line 164
    invoke-virtual {v0, v5, v6}, La/on20;->g0(D)D

    .line 165
    .line 166
    .line 167
    move-result-wide v5

    .line 168
    iget-object v1, v1, La/tw6;->f:Ljava/lang/String;

    .line 169
    .line 170
    new-instance v8, La/p0z;

    .line 171
    .line 172
    const/16 v7, 0x9

    .line 173
    .line 174
    invoke-direct {v8, v0, v7}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    iput-boolean v4, v9, La/hk20;->j:Z

    .line 178
    .line 179
    move-wide/from16 v23, v5

    .line 180
    .line 181
    move-object v5, v1

    .line 182
    move-wide v1, v2

    .line 183
    move-wide/from16 v3, v23

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x1

    .line 187
    invoke-virtual/range {v0 .. v9}, La/on20;->V(DDLjava/lang/String;Ljava/lang/Double;ZLa/xdr;La/zje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-ne v0, v10, :cond_7

    .line 192
    .line 193
    move-object v2, v10

    .line 194
    goto :goto_4

    .line 195
    :cond_7
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    :goto_4
    return-object v2

    .line 198
    :pswitch_2
    sget-object v10, La/wne;->a:La/wne;

    .line 199
    .line 200
    iget-boolean v0, v9, La/hk20;->j:Z

    .line 201
    .line 202
    if-eqz v0, :cond_9

    .line 203
    .line 204
    if-ne v0, v4, :cond_8

    .line 205
    .line 206
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    sget v0, La/on20;->m1:I

    .line 218
    .line 219
    iget-object v0, v9, La/hk20;->k:La/on20;

    .line 220
    .line 221
    invoke-virtual {v0}, La/on20;->E0()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, La/a820;

    .line 229
    .line 230
    iget-object v1, v1, La/a820;->g:La/hx4;

    .line 231
    .line 232
    iget-object v2, v1, La/hx4;->c:La/bx6;

    .line 233
    .line 234
    iget-object v3, v1, La/hx4;->b:La/yyc;

    .line 235
    .line 236
    iget-object v3, v3, La/yyc;->a:Ljava/math/BigDecimal;

    .line 237
    .line 238
    iget-object v5, v2, La/bx6;->b:La/tw6;

    .line 239
    .line 240
    iget-wide v5, v5, La/tw6;->a:D

    .line 241
    .line 242
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 243
    .line 244
    .line 245
    move-result-wide v7

    .line 246
    iget-object v2, v2, La/bx6;->b:La/tw6;

    .line 247
    .line 248
    iget-object v2, v2, La/tw6;->f:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 251
    .line 252
    .line 253
    move-result-wide v11

    .line 254
    move-wide v13, v5

    .line 255
    new-instance v6, Ljava/lang/Double;

    .line 256
    .line 257
    invoke-direct {v6, v11, v12}, Ljava/lang/Double;-><init>(D)V

    .line 258
    .line 259
    .line 260
    move-wide v11, v7

    .line 261
    new-instance v8, La/ngz;

    .line 262
    .line 263
    const/16 v3, 0xf

    .line 264
    .line 265
    invoke-direct {v8, v0, v1, v3}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 266
    .line 267
    .line 268
    iput-boolean v4, v9, La/hk20;->j:Z

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    move-object v5, v2

    .line 272
    move-wide v3, v11

    .line 273
    move-wide v1, v13

    .line 274
    invoke-virtual/range {v0 .. v9}, La/on20;->V(DDLjava/lang/String;Ljava/lang/Double;ZLa/xdr;La/zje;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-ne v0, v10, :cond_a

    .line 279
    .line 280
    move-object v2, v10

    .line 281
    goto :goto_6

    .line 282
    :cond_a
    :goto_5
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    :goto_6
    return-object v2

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
