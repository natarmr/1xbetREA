.class public final La/yi3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/ij3;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Z

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(La/ij3;Ljava/lang/String;ZZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/yi3;->i:B

    iput-object p1, p0, La/yi3;->k:La/ij3;

    iput-object p2, p0, La/yi3;->l:Ljava/lang/String;

    iput-boolean p3, p0, La/yi3;->m:Z

    iput-boolean p4, p0, La/yi3;->n:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/yi3;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/yi3;

    .line 7
    .line 8
    iget-boolean v4, p0, La/yi3;->n:Z

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v1, p0, La/yi3;->k:La/ij3;

    .line 12
    .line 13
    iget-object v2, p0, La/yi3;->l:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v3, p0, La/yi3;->m:Z

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/yi3;-><init>(La/ij3;Ljava/lang/String;ZZLa/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v5, p2

    .line 23
    new-instance v1, La/yi3;

    .line 24
    .line 25
    move-object v6, v5

    .line 26
    iget-boolean v5, p0, La/yi3;->n:Z

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    iget-object v2, p0, La/yi3;->k:La/ij3;

    .line 30
    .line 31
    iget-object v3, p0, La/yi3;->l:Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v4, p0, La/yi3;->m:Z

    .line 34
    .line 35
    invoke-direct/range {v1 .. v7}, La/yi3;-><init>(La/ij3;Ljava/lang/String;ZZLa/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yi3;->i:B

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
    invoke-virtual {p0, p1, p2}, La/yi3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yi3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yi3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/yi3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/yi3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/yi3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yi3;->i:B

    .line 4
    .line 5
    iget-boolean v2, v0, La/yi3;->n:Z

    .line 6
    .line 7
    iget-boolean v3, v0, La/yi3;->m:Z

    .line 8
    .line 9
    iget-object v4, v0, La/yi3;->l:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    iget-object v7, v0, La/yi3;->k:La/ij3;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x2

    .line 18
    const/4 v10, 0x3

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget-object v1, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-byte v11, v0, La/yi3;->j:B

    .line 25
    .line 26
    if-eqz v11, :cond_3

    .line 27
    .line 28
    if-eq v11, v8, :cond_2

    .line 29
    .line 30
    if-eq v11, v9, :cond_1

    .line 31
    .line 32
    if-ne v11, v10, :cond_0

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v5, v7, La/ij3;->j:La/evt;

    .line 56
    .line 57
    sget-object v6, La/ed5;->b:La/ed5;

    .line 58
    .line 59
    iput-byte v8, v0, La/yi3;->j:B

    .line 60
    .line 61
    invoke-virtual {v5, v6, v4, v0}, La/evt;->b(La/ed5;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-ne v4, v1, :cond_4

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    :goto_0
    if-eqz v3, :cond_5

    .line 69
    .line 70
    iput-byte v9, v0, La/yi3;->j:B

    .line 71
    .line 72
    invoke-virtual {v7, v0}, La/ij3;->C(La/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    if-ne v3, v1, :cond_5

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    :goto_1
    if-eqz v2, :cond_8

    .line 80
    .line 81
    iput-byte v10, v0, La/yi3;->j:B

    .line 82
    .line 83
    iget-object v0, v7, La/ij3;->j0:La/p7m0;

    .line 84
    .line 85
    iget-object v2, v7, La/ij3;->k:La/evt;

    .line 86
    .line 87
    sget-object v3, La/ed5;->b:La/ed5;

    .line 88
    .line 89
    invoke-virtual {v2, v3}, La/evt;->a(La/ed5;)La/oc5;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-nez v2, :cond_6

    .line 94
    .line 95
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, La/jh3;

    .line 103
    .line 104
    iget-object v3, v3, La/jh3;->b:La/iy3;

    .line 105
    .line 106
    invoke-static {v2, v3}, La/o050;->b0(La/oc5;La/iy3;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_7

    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    move-object v4, v2

    .line 124
    check-cast v4, La/jh3;

    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const/16 v15, 0xf7f

    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    const/4 v7, 0x0

    .line 132
    const/4 v8, 0x0

    .line 133
    const/4 v9, 0x0

    .line 134
    const/4 v11, 0x0

    .line 135
    const/4 v12, 0x0

    .line 136
    const/4 v13, 0x0

    .line 137
    invoke-static/range {v4 .. v15}, La/jh3;->a(La/jh3;La/iy3;Ljava/util/ArrayList;La/ph3;La/oc5;La/oc5;Ljava/lang/String;La/yfw;Ljava/util/Set;ZZI)La/jh3;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_7

    .line 146
    .line 147
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_2
    if-ne v0, v1, :cond_8

    .line 150
    .line 151
    :goto_3
    move-object v5, v1

    .line 152
    goto :goto_5

    .line 153
    :cond_8
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    :goto_5
    return-object v5

    .line 156
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 157
    .line 158
    iget-byte v11, v0, La/yi3;->j:B

    .line 159
    .line 160
    if-eqz v11, :cond_c

    .line 161
    .line 162
    if-eq v11, v8, :cond_b

    .line 163
    .line 164
    if-eq v11, v9, :cond_a

    .line 165
    .line 166
    if-ne v11, v10, :cond_9

    .line 167
    .line 168
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_9
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_b

    .line 176
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iget-object v5, v7, La/ij3;->j:La/evt;

    .line 188
    .line 189
    sget-object v6, La/ed5;->a:La/ed5;

    .line 190
    .line 191
    iput-byte v8, v0, La/yi3;->j:B

    .line 192
    .line 193
    invoke-virtual {v5, v6, v4, v0}, La/evt;->b(La/ed5;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    if-ne v4, v1, :cond_d

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_d
    :goto_6
    if-eqz v3, :cond_e

    .line 201
    .line 202
    iput-byte v9, v0, La/yi3;->j:B

    .line 203
    .line 204
    invoke-virtual {v7, v0}, La/ij3;->B(La/zje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    if-ne v3, v1, :cond_e

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_e
    :goto_7
    if-eqz v2, :cond_11

    .line 212
    .line 213
    iput-byte v10, v0, La/yi3;->j:B

    .line 214
    .line 215
    iget-object v0, v7, La/ij3;->k:La/evt;

    .line 216
    .line 217
    sget-object v2, La/ed5;->a:La/ed5;

    .line 218
    .line 219
    invoke-virtual {v0, v2}, La/evt;->a(La/ed5;)La/oc5;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    if-nez v13, :cond_f

    .line 224
    .line 225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_f
    iget-object v0, v7, La/ij3;->j0:La/p7m0;

    .line 229
    .line 230
    :cond_10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    move-object v8, v2

    .line 235
    check-cast v8, La/jh3;

    .line 236
    .line 237
    const/16 v18, 0x0

    .line 238
    .line 239
    const/16 v19, 0xfbf

    .line 240
    .line 241
    const/4 v9, 0x0

    .line 242
    const/4 v10, 0x0

    .line 243
    const/4 v11, 0x0

    .line 244
    const/4 v12, 0x0

    .line 245
    const/4 v14, 0x0

    .line 246
    const/4 v15, 0x0

    .line 247
    const/16 v16, 0x0

    .line 248
    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    invoke-static/range {v8 .. v19}, La/jh3;->a(La/jh3;La/iy3;Ljava/util/ArrayList;La/ph3;La/oc5;La/oc5;Ljava/lang/String;La/yfw;Ljava/util/Set;ZZI)La/jh3;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_10

    .line 260
    .line 261
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    :goto_8
    if-ne v0, v1, :cond_11

    .line 264
    .line 265
    :goto_9
    move-object v5, v1

    .line 266
    goto :goto_b

    .line 267
    :cond_11
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    :goto_b
    return-object v5

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
