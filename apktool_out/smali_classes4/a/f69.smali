.class public final La/f69;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/k69;


# direct methods
.method public synthetic constructor <init>(La/k69;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/f69;->i:B

    iput-object p1, p0, La/f69;->k:La/k69;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/f69;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/f69;->k:La/k69;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/f69;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/f69;-><init>(La/k69;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/f69;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/f69;-><init>(La/k69;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/f69;

    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/f69;-><init>(La/k69;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/f69;

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/f69;-><init>(La/k69;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_3
    new-instance v0, La/f69;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v0, p0, p1, v1}, La/f69;-><init>(La/k69;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_4
    new-instance v0, La/f69;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, p0, p1, v1}, La/f69;-><init>(La/k69;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/f69;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/f69;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/f69;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/f69;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/f69;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/f69;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/f69;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/f69;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/f69;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/f69;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/f69;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/f69;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/f69;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/f69;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/f69;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/f69;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/f69;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/f69;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/f69;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f69;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/f69;->k:La/k69;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

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
    iget-boolean v6, v0, La/f69;->j:Z

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
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object v2, v2, La/k69;->u:La/sdi0;

    .line 34
    .line 35
    sget-object v3, La/psr;->c:La/psr;

    .line 36
    .line 37
    iput-boolean v5, v0, La/f69;->j:Z

    .line 38
    .line 39
    invoke-virtual {v2, v3, v0}, La/sdi0;->a(La/psr;La/bnn0;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v3, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v3

    .line 50
    :pswitch_0
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 51
    .line 52
    sget-object v6, La/wne;->a:La/wne;

    .line 53
    .line 54
    iget-boolean v2, v0, La/f69;->j:Z

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    if-ne v2, v5, :cond_3

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sget v2, La/k69;->K:I

    .line 72
    .line 73
    iget-object v7, v1, La/ocj;->a:La/p7m0;

    .line 74
    .line 75
    :cond_5
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-object v8, v2

    .line 83
    check-cast v8, La/z59;

    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    const v19, 0x7ff7f

    .line 88
    .line 89
    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x1

    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    const/4 v15, 0x0

    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    invoke-static/range {v8 .. v19}, La/z59;->a(La/z59;Ljava/lang/String;ZZZZLa/hl90;ZZLjava/lang/String;Ljava/lang/String;I)La/z59;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v7, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    sget v2, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 112
    .line 113
    const-wide/16 v2, 0x2

    .line 114
    .line 115
    invoke-static {v2, v3}, La/znq0;->f(J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v2

    .line 119
    iput-boolean v5, v0, La/f69;->j:Z

    .line 120
    .line 121
    invoke-static {v2, v3, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v6, :cond_6

    .line 126
    .line 127
    move-object v3, v6

    .line 128
    goto :goto_3

    .line 129
    :cond_6
    :goto_2
    sget v0, La/k69;->K:I

    .line 130
    .line 131
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 132
    .line 133
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-object v3, v0

    .line 141
    check-cast v3, La/z59;

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, 0x7ff7f

    .line 145
    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    const/4 v5, 0x0

    .line 149
    const/4 v6, 0x0

    .line 150
    const/4 v7, 0x0

    .line 151
    const/4 v8, 0x0

    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v10, 0x0

    .line 154
    const/4 v11, 0x0

    .line 155
    const/4 v12, 0x0

    .line 156
    invoke-static/range {v3 .. v14}, La/z59;->a(La/z59;Ljava/lang/String;ZZZZLa/hl90;ZZLjava/lang/String;Ljava/lang/String;I)La/z59;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    :goto_3
    return-object v3

    .line 169
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 170
    .line 171
    iget-boolean v6, v0, La/f69;->j:Z

    .line 172
    .line 173
    if-eqz v6, :cond_9

    .line 174
    .line 175
    if-ne v6, v5, :cond_8

    .line 176
    .line 177
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_8
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    iget-object v2, v2, La/k69;->u:La/sdi0;

    .line 189
    .line 190
    sget-object v3, La/psr;->e:La/psr;

    .line 191
    .line 192
    iput-boolean v5, v0, La/f69;->j:Z

    .line 193
    .line 194
    invoke-virtual {v2, v3, v0}, La/sdi0;->a(La/psr;La/bnn0;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-ne v0, v1, :cond_a

    .line 199
    .line 200
    move-object v3, v1

    .line 201
    goto :goto_5

    .line 202
    :cond_a
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    :goto_5
    return-object v3

    .line 205
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 206
    .line 207
    iget-boolean v6, v0, La/f69;->j:Z

    .line 208
    .line 209
    if-eqz v6, :cond_c

    .line 210
    .line 211
    if-ne v6, v5, :cond_b

    .line 212
    .line 213
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_b
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object v2, v2, La/k69;->u:La/sdi0;

    .line 225
    .line 226
    sget-object v3, La/psr;->a:La/psr;

    .line 227
    .line 228
    iput-boolean v5, v0, La/f69;->j:Z

    .line 229
    .line 230
    invoke-virtual {v2, v3, v0}, La/sdi0;->a(La/psr;La/bnn0;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    if-ne v0, v1, :cond_d

    .line 235
    .line 236
    move-object v3, v1

    .line 237
    goto :goto_7

    .line 238
    :cond_d
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    :goto_7
    return-object v3

    .line 241
    :pswitch_3
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 242
    .line 243
    sget-object v6, La/wne;->a:La/wne;

    .line 244
    .line 245
    iget-boolean v7, v0, La/f69;->j:Z

    .line 246
    .line 247
    if-eqz v7, :cond_f

    .line 248
    .line 249
    if-ne v7, v5, :cond_e

    .line 250
    .line 251
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v0, p1

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_e
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    sget v3, La/k69;->K:I

    .line 265
    .line 266
    iget-object v7, v1, La/ocj;->a:La/p7m0;

    .line 267
    .line 268
    :cond_10
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-object v8, v3

    .line 276
    check-cast v8, La/z59;

    .line 277
    .line 278
    const/16 v18, 0x0

    .line 279
    .line 280
    const v19, 0x7f7ff

    .line 281
    .line 282
    .line 283
    const/4 v9, 0x0

    .line 284
    const/4 v10, 0x0

    .line 285
    const/4 v11, 0x0

    .line 286
    const/4 v12, 0x0

    .line 287
    const/4 v13, 0x0

    .line 288
    const/4 v14, 0x0

    .line 289
    const/4 v15, 0x0

    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    invoke-static/range {v8 .. v19}, La/z59;->a(La/z59;Ljava/lang/String;ZZZZLa/hl90;ZZLjava/lang/String;Ljava/lang/String;I)La/z59;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-virtual {v7, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    if-eqz v3, :cond_10

    .line 303
    .line 304
    iget-object v3, v2, La/k69;->q:La/lbu;

    .line 305
    .line 306
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    check-cast v2, La/z59;

    .line 311
    .line 312
    iget-object v2, v2, La/z59;->c:Ljava/lang/String;

    .line 313
    .line 314
    iput-boolean v5, v0, La/f69;->j:Z

    .line 315
    .line 316
    invoke-virtual {v3, v2, v0}, La/lbu;->f(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-ne v0, v6, :cond_11

    .line 321
    .line 322
    move-object v3, v6

    .line 323
    goto :goto_9

    .line 324
    :cond_11
    :goto_8
    move-object v3, v0

    .line 325
    check-cast v3, Ljava/lang/String;

    .line 326
    .line 327
    sget v0, La/k69;->K:I

    .line 328
    .line 329
    iget-object v14, v1, La/ocj;->a:La/p7m0;

    .line 330
    .line 331
    :cond_12
    invoke-virtual {v14}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-object v2, v0

    .line 339
    check-cast v2, La/z59;

    .line 340
    .line 341
    const/4 v12, 0x0

    .line 342
    const v13, 0x7f78f

    .line 343
    .line 344
    .line 345
    const/4 v4, 0x1

    .line 346
    const/4 v5, 0x0

    .line 347
    const/4 v6, 0x0

    .line 348
    const/4 v7, 0x0

    .line 349
    const/4 v8, 0x0

    .line 350
    const/4 v9, 0x0

    .line 351
    const/4 v10, 0x0

    .line 352
    const/4 v11, 0x0

    .line 353
    invoke-static/range {v2 .. v13}, La/z59;->a(La/z59;Ljava/lang/String;ZZZZLa/hl90;ZZLjava/lang/String;Ljava/lang/String;I)La/z59;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-virtual {v14, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_12

    .line 362
    .line 363
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    :goto_9
    return-object v3

    .line 366
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 367
    .line 368
    iget-boolean v6, v0, La/f69;->j:Z

    .line 369
    .line 370
    if-eqz v6, :cond_14

    .line 371
    .line 372
    if-ne v6, v5, :cond_13

    .line 373
    .line 374
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    move-object/from16 v0, p1

    .line 378
    .line 379
    goto :goto_a

    .line 380
    :cond_13
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    goto/16 :goto_e

    .line 384
    .line 385
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    check-cast v3, La/z59;

    .line 393
    .line 394
    iget-boolean v3, v3, La/z59;->q:Z

    .line 395
    .line 396
    if-nez v3, :cond_15

    .line 397
    .line 398
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 399
    .line 400
    goto/16 :goto_e

    .line 401
    .line 402
    :cond_15
    iget-object v3, v2, La/k69;->z:La/iqt;

    .line 403
    .line 404
    iget-object v3, v3, La/iqt;->a:La/gst0;

    .line 405
    .line 406
    invoke-virtual {v3}, La/gst0;->a()Z

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-nez v3, :cond_16

    .line 411
    .line 412
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    goto/16 :goto_e

    .line 415
    .line 416
    :cond_16
    iget-object v3, v2, La/k69;->y:La/reu;

    .line 417
    .line 418
    iput-boolean v5, v0, La/f69;->j:Z

    .line 419
    .line 420
    iget-object v3, v3, La/reu;->b:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v3, La/b3c0;

    .line 423
    .line 424
    const/4 v4, 0x0

    .line 425
    invoke-virtual {v3, v4, v0}, La/b3c0;->a(ZLa/yje;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-ne v0, v1, :cond_17

    .line 430
    .line 431
    move-object v3, v1

    .line 432
    goto :goto_e

    .line 433
    :cond_17
    :goto_a
    check-cast v0, La/m2c0;

    .line 434
    .line 435
    sget v1, La/k69;->K:I

    .line 436
    .line 437
    iget-object v1, v0, La/m2c0;->k:La/jqt0;

    .line 438
    .line 439
    iget-object v0, v0, La/m2c0;->Z:Ljava/lang/String;

    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    if-eqz v1, :cond_18

    .line 446
    .line 447
    if-eq v1, v5, :cond_18

    .line 448
    .line 449
    sget-object v1, La/hl90;->a:La/hl90;

    .line 450
    .line 451
    :goto_b
    move-object v12, v1

    .line 452
    goto :goto_c

    .line 453
    :cond_18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-nez v1, :cond_19

    .line 458
    .line 459
    sget-object v1, La/hl90;->b:La/hl90;

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_19
    sget-object v1, La/hl90;->c:La/hl90;

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :goto_c
    sget-object v1, La/hl90;->b:La/hl90;

    .line 466
    .line 467
    if-eq v12, v1, :cond_1a

    .line 468
    .line 469
    sget-object v1, La/hl90;->c:La/hl90;

    .line 470
    .line 471
    if-ne v12, v1, :cond_1b

    .line 472
    .line 473
    :cond_1a
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 474
    .line 475
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 476
    .line 477
    :goto_d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    move-object v6, v3

    .line 485
    check-cast v6, La/z59;

    .line 486
    .line 487
    const/4 v15, 0x0

    .line 488
    const v17, 0x5ddff

    .line 489
    .line 490
    .line 491
    const/4 v7, 0x0

    .line 492
    const/4 v8, 0x0

    .line 493
    const/4 v9, 0x0

    .line 494
    const/4 v10, 0x0

    .line 495
    const/4 v11, 0x0

    .line 496
    const/4 v13, 0x0

    .line 497
    const/4 v14, 0x0

    .line 498
    move-object/from16 v16, v0

    .line 499
    .line 500
    invoke-static/range {v6 .. v17}, La/z59;->a(La/z59;Ljava/lang/String;ZZZZLa/hl90;ZZLjava/lang/String;Ljava/lang/String;I)La/z59;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v1, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-eqz v0, :cond_1c

    .line 509
    .line 510
    iget-object v0, v2, La/k69;->w:La/ljf0;

    .line 511
    .line 512
    iget-object v0, v0, La/ljf0;->a:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v0, La/neu0;

    .line 515
    .line 516
    iget-object v0, v0, La/neu0;->a:La/meu0;

    .line 517
    .line 518
    invoke-virtual {v0}, La/meu0;->a()V

    .line 519
    .line 520
    .line 521
    :cond_1b
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 522
    .line 523
    :goto_e
    return-object v3

    .line 524
    :cond_1c
    move-object/from16 v0, v16

    .line 525
    .line 526
    goto :goto_d

    .line 527
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
