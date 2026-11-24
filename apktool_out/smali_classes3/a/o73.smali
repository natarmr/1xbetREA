.class public final La/o73;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/t33;

.field public final synthetic l:La/zsf;


# direct methods
.method public synthetic constructor <init>(La/t33;La/zsf;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/o73;->i:B

    iput-object p1, p0, La/o73;->k:La/t33;

    iput-object p2, p0, La/o73;->l:La/zsf;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/o73;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/o73;->l:La/zsf;

    .line 4
    .line 5
    iget-object p0, p0, La/o73;->k:La/t33;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/o73;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/o73;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/o73;

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_2
    new-instance p1, La/o73;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-direct {p1, p0, v0, p2, v1}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_3
    new-instance p1, La/o73;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-direct {p1, p0, v0, p2, v1}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_4
    new-instance p1, La/o73;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {p1, p0, v0, p2, v1}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_5
    new-instance p1, La/o73;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {p1, p0, v0, p2, v1}, La/o73;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/o73;->i:B

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
    invoke-virtual {p0, p1, p2}, La/o73;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/o73;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/o73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/o73;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/o73;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/o73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/o73;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/o73;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/o73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/o73;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/o73;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/o73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/o73;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/o73;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/o73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/o73;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/o73;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/o73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, La/o73;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/o73;

    .line 93
    .line 94
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/o73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/o73;->i:B

    .line 4
    .line 5
    const/high16 v8, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/16 v1, 0x3e8

    .line 8
    .line 9
    const v2, 0x3f666666    # 0.9f

    .line 10
    .line 11
    .line 12
    const-wide/16 v3, 0xd48

    .line 13
    .line 14
    const-wide/16 v9, 0xfa0

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/16 v11, 0x190

    .line 18
    .line 19
    iget-object v12, v5, La/o73;->l:La/zsf;

    .line 20
    .line 21
    const/4 v13, 0x0

    .line 22
    const-string v15, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    const/4 v14, 0x2

    .line 25
    const/4 v7, 0x1

    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    sget-object v8, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget-byte v0, v5, La/o73;->j:B

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    if-eq v0, v7, :cond_1

    .line 36
    .line 37
    if-ne v0, v14, :cond_0

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v14, 0x0

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-byte v7, v5, La/o73;->j:B

    .line 56
    .line 57
    invoke-static {v3, v4, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-ne v0, v8, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_0
    new-instance v1, Ljava/lang/Float;

    .line 65
    .line 66
    invoke-direct {v1, v6}, Ljava/lang/Float;-><init>(F)V

    .line 67
    .line 68
    .line 69
    invoke-static {v11, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-byte v14, v5, La/o73;->j:B

    .line 74
    .line 75
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    const/16 v6, 0xc

    .line 80
    .line 81
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-ne v0, v8, :cond_4

    .line 86
    .line 87
    :goto_1
    move-object v14, v8

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    :goto_2
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_3
    return-object v14

    .line 92
    :pswitch_0
    sget-object v8, La/wne;->a:La/wne;

    .line 93
    .line 94
    iget-byte v0, v5, La/o73;->j:B

    .line 95
    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    if-eq v0, v7, :cond_6

    .line 99
    .line 100
    if-ne v0, v14, :cond_5

    .line 101
    .line 102
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_5
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    goto :goto_7

    .line 111
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iput-byte v7, v5, La/o73;->j:B

    .line 119
    .line 120
    invoke-static {v9, v10, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-ne v0, v8, :cond_8

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_8
    :goto_4
    new-instance v1, Ljava/lang/Float;

    .line 128
    .line 129
    invoke-direct {v1, v6}, Ljava/lang/Float;-><init>(F)V

    .line 130
    .line 131
    .line 132
    invoke-static {v11, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iput-byte v14, v5, La/o73;->j:B

    .line 137
    .line 138
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    const/4 v4, 0x0

    .line 142
    const/16 v6, 0xc

    .line 143
    .line 144
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-ne v0, v8, :cond_9

    .line 149
    .line 150
    :goto_5
    move-object v14, v8

    .line 151
    goto :goto_7

    .line 152
    :cond_9
    :goto_6
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    :goto_7
    return-object v14

    .line 155
    :pswitch_1
    sget-object v8, La/wne;->a:La/wne;

    .line 156
    .line 157
    iget-byte v0, v5, La/o73;->j:B

    .line 158
    .line 159
    if-eqz v0, :cond_c

    .line 160
    .line 161
    if-eq v0, v7, :cond_b

    .line 162
    .line 163
    if-ne v0, v14, :cond_a

    .line 164
    .line 165
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_a

    .line 169
    :cond_a
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    goto :goto_b

    .line 174
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    iput-byte v7, v5, La/o73;->j:B

    .line 182
    .line 183
    invoke-static {v3, v4, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-ne v0, v8, :cond_d

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_d
    :goto_8
    new-instance v1, Ljava/lang/Float;

    .line 191
    .line 192
    invoke-direct {v1, v6}, Ljava/lang/Float;-><init>(F)V

    .line 193
    .line 194
    .line 195
    invoke-static {v11, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    iput-byte v14, v5, La/o73;->j:B

    .line 200
    .line 201
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 202
    .line 203
    const/4 v3, 0x0

    .line 204
    const/4 v4, 0x0

    .line 205
    const/16 v6, 0xc

    .line 206
    .line 207
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-ne v0, v8, :cond_e

    .line 212
    .line 213
    :goto_9
    move-object v14, v8

    .line 214
    goto :goto_b

    .line 215
    :cond_e
    :goto_a
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    :goto_b
    return-object v14

    .line 218
    :pswitch_2
    sget-object v9, La/wne;->a:La/wne;

    .line 219
    .line 220
    iget-byte v0, v5, La/o73;->j:B

    .line 221
    .line 222
    if-eqz v0, :cond_11

    .line 223
    .line 224
    if-eq v0, v7, :cond_10

    .line 225
    .line 226
    if-ne v0, v14, :cond_f

    .line 227
    .line 228
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    move-object/from16 v16, p1

    .line 232
    .line 233
    goto :goto_e

    .line 234
    :cond_f
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    goto :goto_e

    .line 240
    :cond_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto :goto_c

    .line 244
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    new-instance v0, Ljava/lang/Float;

    .line 248
    .line 249
    invoke-direct {v0, v2}, Ljava/lang/Float;-><init>(F)V

    .line 250
    .line 251
    .line 252
    invoke-static {v1, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    iput-byte v7, v5, La/o73;->j:B

    .line 257
    .line 258
    move-object v1, v0

    .line 259
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 260
    .line 261
    const/4 v3, 0x0

    .line 262
    const/4 v4, 0x0

    .line 263
    const/16 v6, 0xc

    .line 264
    .line 265
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-ne v0, v9, :cond_12

    .line 270
    .line 271
    goto :goto_d

    .line 272
    :cond_12
    :goto_c
    new-instance v1, Ljava/lang/Float;

    .line 273
    .line 274
    invoke-direct {v1, v8}, Ljava/lang/Float;-><init>(F)V

    .line 275
    .line 276
    .line 277
    const/16 v0, 0x1f4

    .line 278
    .line 279
    invoke-static {v0, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    iput-byte v14, v5, La/o73;->j:B

    .line 284
    .line 285
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 286
    .line 287
    const/4 v3, 0x0

    .line 288
    const/4 v4, 0x0

    .line 289
    const/16 v6, 0xc

    .line 290
    .line 291
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-ne v0, v9, :cond_13

    .line 296
    .line 297
    :goto_d
    move-object/from16 v16, v9

    .line 298
    .line 299
    goto :goto_e

    .line 300
    :cond_13
    move-object/from16 v16, v0

    .line 301
    .line 302
    :goto_e
    return-object v16

    .line 303
    :pswitch_3
    sget-object v9, La/wne;->a:La/wne;

    .line 304
    .line 305
    iget-byte v0, v5, La/o73;->j:B

    .line 306
    .line 307
    if-eqz v0, :cond_16

    .line 308
    .line 309
    if-eq v0, v7, :cond_15

    .line 310
    .line 311
    if-ne v0, v14, :cond_14

    .line 312
    .line 313
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    move-object/from16 v16, p1

    .line 317
    .line 318
    goto :goto_11

    .line 319
    :cond_14
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    const/16 v16, 0x0

    .line 323
    .line 324
    goto :goto_11

    .line 325
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto :goto_f

    .line 329
    :cond_16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    new-instance v0, Ljava/lang/Float;

    .line 333
    .line 334
    invoke-direct {v0, v2}, Ljava/lang/Float;-><init>(F)V

    .line 335
    .line 336
    .line 337
    invoke-static {v1, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    iput-byte v7, v5, La/o73;->j:B

    .line 342
    .line 343
    move-object v1, v0

    .line 344
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 345
    .line 346
    const/4 v3, 0x0

    .line 347
    const/4 v4, 0x0

    .line 348
    const/16 v6, 0xc

    .line 349
    .line 350
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    if-ne v0, v9, :cond_17

    .line 355
    .line 356
    goto :goto_10

    .line 357
    :cond_17
    :goto_f
    new-instance v1, Ljava/lang/Float;

    .line 358
    .line 359
    invoke-direct {v1, v8}, Ljava/lang/Float;-><init>(F)V

    .line 360
    .line 361
    .line 362
    const/16 v0, 0x1f4

    .line 363
    .line 364
    invoke-static {v0, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    iput-byte v14, v5, La/o73;->j:B

    .line 369
    .line 370
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 371
    .line 372
    const/4 v3, 0x0

    .line 373
    const/4 v4, 0x0

    .line 374
    const/16 v6, 0xc

    .line 375
    .line 376
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    if-ne v0, v9, :cond_18

    .line 381
    .line 382
    :goto_10
    move-object/from16 v16, v9

    .line 383
    .line 384
    goto :goto_11

    .line 385
    :cond_18
    move-object/from16 v16, v0

    .line 386
    .line 387
    :goto_11
    return-object v16

    .line 388
    :pswitch_4
    sget-object v8, La/wne;->a:La/wne;

    .line 389
    .line 390
    iget-byte v0, v5, La/o73;->j:B

    .line 391
    .line 392
    if-eqz v0, :cond_1b

    .line 393
    .line 394
    if-eq v0, v7, :cond_1a

    .line 395
    .line 396
    if-ne v0, v14, :cond_19

    .line 397
    .line 398
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    goto :goto_14

    .line 402
    :cond_19
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    goto :goto_15

    .line 407
    :cond_1a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    goto :goto_12

    .line 411
    :cond_1b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    iput-byte v7, v5, La/o73;->j:B

    .line 415
    .line 416
    invoke-static {v9, v10, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    if-ne v0, v8, :cond_1c

    .line 421
    .line 422
    goto :goto_13

    .line 423
    :cond_1c
    :goto_12
    new-instance v1, Ljava/lang/Float;

    .line 424
    .line 425
    invoke-direct {v1, v6}, Ljava/lang/Float;-><init>(F)V

    .line 426
    .line 427
    .line 428
    invoke-static {v11, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    iput-byte v14, v5, La/o73;->j:B

    .line 433
    .line 434
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 435
    .line 436
    const/4 v3, 0x0

    .line 437
    const/4 v4, 0x0

    .line 438
    const/16 v6, 0xc

    .line 439
    .line 440
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    if-ne v0, v8, :cond_1d

    .line 445
    .line 446
    :goto_13
    move-object v14, v8

    .line 447
    goto :goto_15

    .line 448
    :cond_1d
    :goto_14
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    :goto_15
    return-object v14

    .line 451
    :pswitch_5
    sget-object v8, La/wne;->a:La/wne;

    .line 452
    .line 453
    iget-byte v0, v5, La/o73;->j:B

    .line 454
    .line 455
    if-eqz v0, :cond_20

    .line 456
    .line 457
    if-eq v0, v7, :cond_1f

    .line 458
    .line 459
    if-ne v0, v14, :cond_1e

    .line 460
    .line 461
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    goto :goto_18

    .line 465
    :cond_1e
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    const/4 v14, 0x0

    .line 469
    goto :goto_19

    .line 470
    :cond_1f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    goto :goto_16

    .line 474
    :cond_20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    iput-byte v7, v5, La/o73;->j:B

    .line 478
    .line 479
    invoke-static {v9, v10, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    if-ne v0, v8, :cond_21

    .line 484
    .line 485
    goto :goto_17

    .line 486
    :cond_21
    :goto_16
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 487
    .line 488
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 493
    .line 494
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 495
    .line 496
    .line 497
    move-result-wide v0

    .line 498
    new-instance v2, La/y3d;

    .line 499
    .line 500
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 501
    .line 502
    .line 503
    invoke-static {v11, v13, v12, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    iput-byte v14, v5, La/o73;->j:B

    .line 508
    .line 509
    move-object v1, v2

    .line 510
    move-object v2, v0

    .line 511
    iget-object v0, v5, La/o73;->k:La/t33;

    .line 512
    .line 513
    const/4 v3, 0x0

    .line 514
    const/4 v4, 0x0

    .line 515
    const/16 v6, 0xc

    .line 516
    .line 517
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    if-ne v0, v8, :cond_22

    .line 522
    .line 523
    :goto_17
    move-object v14, v8

    .line 524
    goto :goto_19

    .line 525
    :cond_22
    :goto_18
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 526
    .line 527
    :goto_19
    return-object v14

    .line 528
    nop

    .line 529
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
