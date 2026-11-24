.class public final La/jy7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:F

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/jy7;->i:B

    iput-object p1, p0, La/jy7;->l:Ljava/lang/Object;

    iput p2, p0, La/jy7;->k:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/jy7;->i:B

    .line 2
    .line 3
    iget v0, p0, La/jy7;->k:F

    .line 4
    .line 5
    iget-object p0, p0, La/jy7;->l:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/jy7;

    .line 11
    .line 12
    check-cast p0, La/ruv0;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, p0, v0, p2, v1}, La/jy7;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    new-instance p1, La/jy7;

    .line 20
    .line 21
    check-cast p0, La/t33;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/jy7;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jy7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jy7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jy7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jy7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jy7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jy7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jy7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 15

    .line 1
    iget-byte v0, p0, La/jy7;->i:B

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    iget v8, p0, La/jy7;->k:F

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v9, 0x2

    .line 11
    iget-object v10, p0, La/jy7;->l:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v10, La/ruv0;

    .line 17
    .line 18
    iget-object v0, v10, La/ruv0;->v:La/t33;

    .line 19
    .line 20
    sget-object v10, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-byte v4, p0, La/jy7;->j:B

    .line 23
    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    if-eq v4, v3, :cond_1

    .line 27
    .line 28
    if-ne v4, v9, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ljava/lang/Float;

    .line 46
    .line 47
    invoke-direct {v1, v8}, Ljava/lang/Float;-><init>(F)V

    .line 48
    .line 49
    .line 50
    iput-byte v3, p0, La/jy7;->j:B

    .line 51
    .line 52
    invoke-virtual {v0, p0, v1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-ne v1, v10, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    new-instance v1, Ljava/lang/Float;

    .line 60
    .line 61
    invoke-direct {v1, v7}, Ljava/lang/Float;-><init>(F)V

    .line 62
    .line 63
    .line 64
    sget-object v2, La/ruv0;->x:La/uts0;

    .line 65
    .line 66
    iput-byte v9, p0, La/jy7;->j:B

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    const/16 v6, 0xc

    .line 71
    .line 72
    move-object v5, p0

    .line 73
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-ne v0, v10, :cond_4

    .line 78
    .line 79
    :goto_1
    move-object v1, v10

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_3
    return-object v1

    .line 84
    :pswitch_0
    sget-object v11, La/wne;->a:La/wne;

    .line 85
    .line 86
    iget-byte v0, p0, La/jy7;->j:B

    .line 87
    .line 88
    const/4 v12, 0x5

    .line 89
    const/4 v13, 0x4

    .line 90
    const/4 v14, 0x3

    .line 91
    if-eqz v0, :cond_a

    .line 92
    .line 93
    if-eq v0, v3, :cond_9

    .line 94
    .line 95
    if-eq v0, v9, :cond_8

    .line 96
    .line 97
    if-eq v0, v14, :cond_7

    .line 98
    .line 99
    if-eq v0, v13, :cond_6

    .line 100
    .line 101
    if-ne v0, v12, :cond_5

    .line 102
    .line 103
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object/from16 v0, p1

    .line 107
    .line 108
    goto/16 :goto_9

    .line 109
    .line 110
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    move-object v0, v1

    .line 114
    goto/16 :goto_9

    .line 115
    .line 116
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_7

    .line 120
    .line 121
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    move-object v0, v10

    .line 137
    check-cast v0, La/t33;

    .line 138
    .line 139
    new-instance v1, Ljava/lang/Float;

    .line 140
    .line 141
    invoke-direct {v1, v7}, Ljava/lang/Float;-><init>(F)V

    .line 142
    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    sget-object v4, La/ihn;->a:La/zsf;

    .line 146
    .line 147
    const/16 v6, 0x118

    .line 148
    .line 149
    invoke-static {v6, v2, v4, v9}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iput-byte v3, p0, La/jy7;->j:B

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    const/4 v4, 0x0

    .line 157
    const/16 v6, 0xc

    .line 158
    .line 159
    move-object v5, p0

    .line 160
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-ne v0, v11, :cond_b

    .line 165
    .line 166
    goto/16 :goto_8

    .line 167
    .line 168
    :cond_b
    :goto_4
    move-object v0, v10

    .line 169
    check-cast v0, La/t33;

    .line 170
    .line 171
    new-instance v1, Ljava/lang/Float;

    .line 172
    .line 173
    invoke-direct {v1, v8}, Ljava/lang/Float;-><init>(F)V

    .line 174
    .line 175
    .line 176
    sget-object v2, La/ry7;->c:La/n0o0;

    .line 177
    .line 178
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, La/j73;

    .line 183
    .line 184
    iput-byte v9, p0, La/jy7;->j:B

    .line 185
    .line 186
    const/4 v3, 0x0

    .line 187
    const/4 v4, 0x0

    .line 188
    const/16 v6, 0xc

    .line 189
    .line 190
    move-object v5, p0

    .line 191
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-ne v0, v11, :cond_c

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_c
    :goto_5
    move-object v0, v10

    .line 199
    check-cast v0, La/t33;

    .line 200
    .line 201
    new-instance v1, Ljava/lang/Float;

    .line 202
    .line 203
    invoke-direct {v1, v7}, Ljava/lang/Float;-><init>(F)V

    .line 204
    .line 205
    .line 206
    sget-object v2, La/ry7;->c:La/n0o0;

    .line 207
    .line 208
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, La/j73;

    .line 213
    .line 214
    iput-byte v14, p0, La/jy7;->j:B

    .line 215
    .line 216
    const/4 v3, 0x0

    .line 217
    const/4 v4, 0x0

    .line 218
    const/16 v6, 0xc

    .line 219
    .line 220
    move-object v5, p0

    .line 221
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-ne v0, v11, :cond_d

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_d
    :goto_6
    move-object v0, v10

    .line 229
    check-cast v0, La/t33;

    .line 230
    .line 231
    new-instance v1, Ljava/lang/Float;

    .line 232
    .line 233
    invoke-direct {v1, v8}, Ljava/lang/Float;-><init>(F)V

    .line 234
    .line 235
    .line 236
    sget-object v2, La/ry7;->c:La/n0o0;

    .line 237
    .line 238
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, La/j73;

    .line 243
    .line 244
    iput-byte v13, p0, La/jy7;->j:B

    .line 245
    .line 246
    const/4 v3, 0x0

    .line 247
    const/4 v4, 0x0

    .line 248
    const/16 v6, 0xc

    .line 249
    .line 250
    move-object v5, p0

    .line 251
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-ne v0, v11, :cond_e

    .line 256
    .line 257
    goto :goto_8

    .line 258
    :cond_e
    :goto_7
    move-object v0, v10

    .line 259
    check-cast v0, La/t33;

    .line 260
    .line 261
    new-instance v1, Ljava/lang/Float;

    .line 262
    .line 263
    invoke-direct {v1, v7}, Ljava/lang/Float;-><init>(F)V

    .line 264
    .line 265
    .line 266
    sget-object v2, La/ry7;->c:La/n0o0;

    .line 267
    .line 268
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    check-cast v2, La/j73;

    .line 273
    .line 274
    iput-byte v12, p0, La/jy7;->j:B

    .line 275
    .line 276
    const/4 v3, 0x0

    .line 277
    const/4 v4, 0x0

    .line 278
    const/16 v6, 0xc

    .line 279
    .line 280
    move-object v5, p0

    .line 281
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-ne v0, v11, :cond_f

    .line 286
    .line 287
    :goto_8
    move-object v0, v11

    .line 288
    :cond_f
    :goto_9
    return-object v0

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
