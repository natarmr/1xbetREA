.class public final La/yci0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ldi0;


# direct methods
.method public synthetic constructor <init>(La/ldi0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yci0;->i:B

    iput-object p1, p0, La/yci0;->k:La/ldi0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yci0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yci0;->k:La/ldi0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yci0;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/yci0;-><init>(La/ldi0;La/yje;B)V

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
    iput-boolean p0, v0, La/yci0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/yci0;

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/yci0;

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/yci0;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/yci0;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_4
    new-instance p1, La/yci0;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {p1, p0, p2, v0}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v0, p0, La/yci0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/yci0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/yci0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/yci0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yci0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/yci0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/yci0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yci0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/yci0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/yci0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yci0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/yci0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/yci0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p1, La/vne;

    .line 78
    .line 79
    check-cast p2, La/yje;

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, La/yci0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/yci0;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/yci0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_4
    check-cast p1, La/vne;

    .line 95
    .line 96
    check-cast p2, La/yje;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, La/yci0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/yci0;

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/yci0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
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
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yci0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/yci0;->k:La/ldi0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v12, v0, La/yci0;->j:Z

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v3, La/ldi0;->H:La/p7m0;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, La/uci0;

    .line 29
    .line 30
    const/4 v13, 0x0

    .line 31
    const/16 v14, 0xeff

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v6 .. v14}, La/uci0;->a(La/uci0;ZZZZLa/eci0;ZZI)La/uci0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 52
    .line 53
    iget-boolean v6, v0, La/yci0;->j:Z

    .line 54
    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    if-ne v6, v5, :cond_1

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v2, La/obk0;->d:La/obk0;

    .line 71
    .line 72
    iput-boolean v5, v0, La/yci0;->j:Z

    .line 73
    .line 74
    invoke-virtual {v3, v2, v0}, La/ldi0;->I(La/obk0;La/zje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    move-object v4, v1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    :goto_1
    return-object v4

    .line 85
    :pswitch_1
    iget-object v7, v0, La/yci0;->k:La/ldi0;

    .line 86
    .line 87
    iget-object v1, v7, La/ldi0;->H:La/p7m0;

    .line 88
    .line 89
    iget-object v3, v7, La/ldi0;->c:La/dci0;

    .line 90
    .line 91
    sget-object v6, La/wne;->a:La/wne;

    .line 92
    .line 93
    iget-boolean v8, v0, La/yci0;->j:Z

    .line 94
    .line 95
    if-eqz v8, :cond_5

    .line 96
    .line 97
    if-ne v8, v5, :cond_4

    .line 98
    .line 99
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_3

    .line 103
    .line 104
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    instance-of v2, v3, La/tbi0;

    .line 113
    .line 114
    if-nez v2, :cond_9

    .line 115
    .line 116
    instance-of v2, v3, La/ubi0;

    .line 117
    .line 118
    if-eqz v2, :cond_6

    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, La/uci0;

    .line 127
    .line 128
    iget-object v2, v2, La/uci0;->h:La/ici0;

    .line 129
    .line 130
    instance-of v2, v2, La/hci0;

    .line 131
    .line 132
    if-eqz v2, :cond_8

    .line 133
    .line 134
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object v8, v0

    .line 139
    check-cast v8, La/uci0;

    .line 140
    .line 141
    sget-object v2, La/obk0;->b:La/zie0;

    .line 142
    .line 143
    iget-object v4, v7, La/ldi0;->G:La/p7m0;

    .line 144
    .line 145
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    check-cast v5, La/kbi0;

    .line 150
    .line 151
    iget-object v5, v5, La/kbi0;->b:Ljava/util/List;

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-static {v5}, La/zie0;->d(Ljava/util/List;)Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, La/kbi0;

    .line 165
    .line 166
    iget-object v2, v2, La/kbi0;->b:Ljava/util/List;

    .line 167
    .line 168
    invoke-static {v2}, La/zie0;->f(Ljava/util/List;)Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, La/kbi0;

    .line 177
    .line 178
    iget-object v2, v2, La/kbi0;->b:Ljava/util/List;

    .line 179
    .line 180
    invoke-static {v2}, La/zie0;->e(Ljava/util/List;)Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, La/kbi0;

    .line 189
    .line 190
    iget-object v2, v2, La/kbi0;->b:Ljava/util/List;

    .line 191
    .line 192
    invoke-static {v2}, La/zie0;->c(Ljava/util/List;)Z

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    new-instance v13, La/eci0;

    .line 197
    .line 198
    new-instance v2, La/pk;

    .line 199
    .line 200
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    check-cast v4, La/kbi0;

    .line 205
    .line 206
    iget-object v4, v4, La/kbi0;->a:La/swp0;

    .line 207
    .line 208
    invoke-interface {v3}, La/dci0;->z()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-interface {v3}, La/dci0;->D()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-direct {v2, v4, v5, v6}, La/pk;-><init>(La/swp0;Ljava/util/List;Ljava/util/List;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {v13, v2}, La/eci0;-><init>(La/pk;)V

    .line 220
    .line 221
    .line 222
    const/4 v15, 0x0

    .line 223
    const/16 v16, 0xf61

    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    invoke-static/range {v8 .. v16}, La/uci0;->a(La/uci0;ZZZZLa/eci0;ZZI)La/uci0;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_7

    .line 235
    .line 236
    goto/16 :goto_3

    .line 237
    .line 238
    :cond_8
    sget-object v1, La/obk0;->c:La/obk0;

    .line 239
    .line 240
    iput-boolean v5, v0, La/yci0;->j:Z

    .line 241
    .line 242
    invoke-virtual {v7, v1, v0}, La/ldi0;->I(La/obk0;La/zje;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-ne v0, v6, :cond_a

    .line 247
    .line 248
    move-object v4, v6

    .line 249
    goto/16 :goto_4

    .line 250
    .line 251
    :cond_9
    :goto_2
    new-instance v0, La/fdi0;

    .line 252
    .line 253
    const/4 v1, 0x0

    .line 254
    invoke-direct {v0, v7, v4, v1}, La/fdi0;-><init>(La/ldi0;La/yje;B)V

    .line 255
    .line 256
    .line 257
    new-instance v2, La/vsg0;

    .line 258
    .line 259
    invoke-direct {v2, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 260
    .line 261
    .line 262
    new-instance v0, La/edi0;

    .line 263
    .line 264
    invoke-direct {v0, v4, v7}, La/edi0;-><init>(La/yje;La/ldi0;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v2, v0}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    new-instance v2, La/fdi0;

    .line 272
    .line 273
    invoke-direct {v2, v7, v4, v5}, La/fdi0;-><init>(La/ldi0;La/yje;B)V

    .line 274
    .line 275
    .line 276
    new-instance v3, La/fnq;

    .line 277
    .line 278
    const/4 v6, 0x4

    .line 279
    invoke-direct {v3, v0, v2, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 280
    .line 281
    .line 282
    new-instance v0, La/nv;

    .line 283
    .line 284
    const/16 v2, 0x9

    .line 285
    .line 286
    invoke-direct {v0, v3, v4, v2}, La/nv;-><init>(La/fnq;La/yje;B)V

    .line 287
    .line 288
    .line 289
    new-instance v2, La/vsg0;

    .line 290
    .line 291
    invoke-direct {v2, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 292
    .line 293
    .line 294
    new-instance v0, La/fdi0;

    .line 295
    .line 296
    const/4 v3, 0x2

    .line 297
    invoke-direct {v0, v7, v4, v3}, La/fdi0;-><init>(La/ldi0;La/yje;B)V

    .line 298
    .line 299
    .line 300
    invoke-static {v2, v0}, La/aoq;->a(La/gmq;Lkotlin/jvm/functions/Function2;)La/utb;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    new-instance v2, La/u52;

    .line 305
    .line 306
    const/16 v8, 0x17

    .line 307
    .line 308
    invoke-direct {v2, v7, v4, v8}, La/u52;-><init>(La/diu0;La/yje;B)V

    .line 309
    .line 310
    .line 311
    new-instance v8, La/fnq;

    .line 312
    .line 313
    invoke-direct {v8, v0, v2, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 314
    .line 315
    .line 316
    new-instance v0, La/rai0;

    .line 317
    .line 318
    invoke-direct {v0, v7, v3}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 319
    .line 320
    .line 321
    new-instance v2, La/noe;

    .line 322
    .line 323
    invoke-direct {v2, v0, v4, v1}, La/noe;-><init>(La/rai0;La/yje;B)V

    .line 324
    .line 325
    .line 326
    new-instance v3, La/fnq;

    .line 327
    .line 328
    invoke-direct {v3, v8, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 329
    .line 330
    .line 331
    new-instance v2, La/noe;

    .line 332
    .line 333
    invoke-direct {v2, v0, v4, v5}, La/noe;-><init>(La/rai0;La/yje;B)V

    .line 334
    .line 335
    .line 336
    new-instance v5, La/fnq;

    .line 337
    .line 338
    invoke-direct {v5, v3, v2, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 339
    .line 340
    .line 341
    new-instance v2, La/e00;

    .line 342
    .line 343
    const/16 v3, 0xd

    .line 344
    .line 345
    invoke-direct {v2, v0, v4, v3}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 346
    .line 347
    .line 348
    new-instance v0, La/dnq;

    .line 349
    .line 350
    invoke-direct {v0, v5, v2, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 351
    .line 352
    .line 353
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    iget-object v2, v7, La/ldi0;->e:La/mne;

    .line 358
    .line 359
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 360
    .line 361
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    new-instance v5, La/jbh0;

    .line 366
    .line 367
    const/4 v11, 0x4

    .line 368
    const/4 v12, 0x2

    .line 369
    const/4 v6, 0x2

    .line 370
    const-class v8, La/ldi0;

    .line 371
    .line 372
    const-string v9, "localHandleError"

    .line 373
    .line 374
    const-string v10, "localHandleError(Ljava/lang/Throwable;)V"

    .line 375
    .line 376
    invoke-direct/range {v5 .. v12}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 377
    .line 378
    .line 379
    invoke-static {v0, v1, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iput-object v0, v7, La/ldi0;->E:La/c4m0;

    .line 384
    .line 385
    :cond_a
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 386
    .line 387
    :goto_4
    return-object v4

    .line 388
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 389
    .line 390
    iget-boolean v6, v0, La/yci0;->j:Z

    .line 391
    .line 392
    if-eqz v6, :cond_c

    .line 393
    .line 394
    if-ne v6, v5, :cond_b

    .line 395
    .line 396
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    goto :goto_5

    .line 400
    :cond_b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    goto :goto_6

    .line 404
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    sget-object v2, La/obk0;->e:La/obk0;

    .line 408
    .line 409
    iput-boolean v5, v0, La/yci0;->j:Z

    .line 410
    .line 411
    invoke-virtual {v3, v2, v0}, La/ldi0;->I(La/obk0;La/zje;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    if-ne v0, v1, :cond_d

    .line 416
    .line 417
    move-object v4, v1

    .line 418
    goto :goto_6

    .line 419
    :cond_d
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    :goto_6
    return-object v4

    .line 422
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 423
    .line 424
    iget-boolean v6, v0, La/yci0;->j:Z

    .line 425
    .line 426
    if-eqz v6, :cond_f

    .line 427
    .line 428
    if-ne v6, v5, :cond_e

    .line 429
    .line 430
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_e
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    sget-object v2, La/obk0;->f:La/obk0;

    .line 442
    .line 443
    iput-boolean v5, v0, La/yci0;->j:Z

    .line 444
    .line 445
    invoke-virtual {v3, v2, v0}, La/ldi0;->I(La/obk0;La/zje;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    if-ne v0, v1, :cond_10

    .line 450
    .line 451
    move-object v4, v1

    .line 452
    goto :goto_8

    .line 453
    :cond_10
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 454
    .line 455
    :goto_8
    return-object v4

    .line 456
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 457
    .line 458
    iget-boolean v6, v0, La/yci0;->j:Z

    .line 459
    .line 460
    if-eqz v6, :cond_12

    .line 461
    .line 462
    if-ne v6, v5, :cond_11

    .line 463
    .line 464
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    move-object/from16 v0, p1

    .line 468
    .line 469
    goto :goto_9

    .line 470
    :cond_11
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    goto :goto_b

    .line 474
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    iput-boolean v5, v0, La/yci0;->j:Z

    .line 478
    .line 479
    invoke-virtual {v3, v0}, La/ldi0;->y(La/zje;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    if-ne v0, v1, :cond_13

    .line 484
    .line 485
    move-object v4, v1

    .line 486
    goto :goto_b

    .line 487
    :cond_13
    :goto_9
    check-cast v0, La/pk;

    .line 488
    .line 489
    iget-object v1, v3, La/ldi0;->H:La/p7m0;

    .line 490
    .line 491
    :cond_14
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    move-object v4, v2

    .line 496
    check-cast v4, La/uci0;

    .line 497
    .line 498
    new-instance v9, La/eci0;

    .line 499
    .line 500
    invoke-direct {v9, v0}, La/eci0;-><init>(La/pk;)V

    .line 501
    .line 502
    .line 503
    const/4 v11, 0x0

    .line 504
    const/16 v12, 0xf7f

    .line 505
    .line 506
    const/4 v5, 0x0

    .line 507
    const/4 v6, 0x0

    .line 508
    const/4 v7, 0x0

    .line 509
    const/4 v8, 0x0

    .line 510
    const/4 v10, 0x0

    .line 511
    invoke-static/range {v4 .. v12}, La/uci0;->a(La/uci0;ZZZZLa/eci0;ZZI)La/uci0;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    if-eqz v2, :cond_14

    .line 520
    .line 521
    iget-object v2, v3, La/ldi0;->G:La/p7m0;

    .line 522
    .line 523
    :cond_15
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    move-object v4, v1

    .line 528
    check-cast v4, La/kbi0;

    .line 529
    .line 530
    iget-object v5, v3, La/ldi0;->c:La/dci0;

    .line 531
    .line 532
    invoke-interface {v5}, La/dci0;->u()Z

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    if-eqz v5, :cond_16

    .line 537
    .line 538
    iget-object v5, v0, La/pk;->c:Ljava/util/List;

    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_16
    iget-object v5, v0, La/pk;->b:Ljava/util/List;

    .line 542
    .line 543
    :goto_a
    iget-object v4, v4, La/kbi0;->a:La/swp0;

    .line 544
    .line 545
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    new-instance v6, La/kbi0;

    .line 552
    .line 553
    invoke-direct {v6, v4, v5}, La/kbi0;-><init>(La/swp0;Ljava/util/List;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v2, v1, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eqz v1, :cond_15

    .line 561
    .line 562
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 563
    .line 564
    :goto_b
    return-object v4

    .line 565
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
