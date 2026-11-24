.class public final La/jd70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xd70;


# direct methods
.method public synthetic constructor <init>(La/xd70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jd70;->i:B

    iput-object p1, p0, La/jd70;->k:La/xd70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jd70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/jd70;->k:La/xd70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/jd70;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/jd70;-><init>(La/xd70;La/yje;B)V

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
    iput-boolean p0, v0, La/jd70;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/jd70;

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/jd70;-><init>(La/xd70;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/jd70;

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/jd70;-><init>(La/xd70;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/jd70;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/jd70;-><init>(La/xd70;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/jd70;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/jd70;-><init>(La/xd70;La/yje;B)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_4
    new-instance p1, La/jd70;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {p1, p0, p2, v0}, La/jd70;-><init>(La/xd70;La/yje;B)V

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
    iget-byte v0, p0, La/jd70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/jd70;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/jd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/jd70;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/jd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/jd70;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/jd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/jd70;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/jd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/jd70;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/jd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/jd70;

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/jd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jd70;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/jd70;->k:La/xd70;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-boolean v14, v0, La/jd70;->j:Z

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/xb70;

    .line 29
    .line 30
    iget-boolean v0, v0, La/xb70;->g:Z

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    if-eqz v14, :cond_0

    .line 35
    .line 36
    move/from16 v26, v5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move/from16 v26, v2

    .line 40
    .line 41
    :goto_0
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/xb70;

    .line 46
    .line 47
    iget-boolean v0, v0, La/xb70;->g:Z

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    if-nez v14, :cond_1

    .line 52
    .line 53
    move/from16 v27, v5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move/from16 v27, v2

    .line 57
    .line 58
    :goto_1
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object v7, v2

    .line 68
    check-cast v7, La/xb70;

    .line 69
    .line 70
    const/16 v24, 0x0

    .line 71
    .line 72
    const v25, 0x1ffbf

    .line 73
    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

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
    const/16 v22, 0x0

    .line 95
    .line 96
    const/16 v23, 0x0

    .line 97
    .line 98
    invoke-static/range {v7 .. v25}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, La/xb70;

    .line 113
    .line 114
    iget-object v0, v0, La/xb70;->n:La/fa70;

    .line 115
    .line 116
    iget-boolean v0, v0, La/fa70;->f:Z

    .line 117
    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    if-nez v14, :cond_3

    .line 121
    .line 122
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, La/xb70;

    .line 127
    .line 128
    iget-object v0, v0, La/xb70;->n:La/fa70;

    .line 129
    .line 130
    iget-boolean v0, v0, La/fa70;->c:Z

    .line 131
    .line 132
    if-nez v0, :cond_3

    .line 133
    .line 134
    invoke-virtual {v4}, La/xd70;->r0()V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :cond_3
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, La/xb70;

    .line 144
    .line 145
    iget-object v0, v0, La/xb70;->n:La/fa70;

    .line 146
    .line 147
    iget-boolean v0, v0, La/fa70;->f:Z

    .line 148
    .line 149
    if-eqz v0, :cond_5

    .line 150
    .line 151
    if-eqz v27, :cond_5

    .line 152
    .line 153
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, La/xb70;

    .line 158
    .line 159
    iget-object v0, v0, La/xb70;->n:La/fa70;

    .line 160
    .line 161
    iget-boolean v0, v0, La/fa70;->c:Z

    .line 162
    .line 163
    if-eqz v0, :cond_5

    .line 164
    .line 165
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 166
    .line 167
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-object v2, v1

    .line 175
    check-cast v2, La/xb70;

    .line 176
    .line 177
    const/16 v19, 0x0

    .line 178
    .line 179
    const v20, 0x1fdff

    .line 180
    .line 181
    .line 182
    const/4 v3, 0x0

    .line 183
    const/4 v4, 0x0

    .line 184
    const/4 v5, 0x0

    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v8, 0x0

    .line 188
    const/4 v9, 0x0

    .line 189
    const/4 v10, 0x0

    .line 190
    const/4 v11, 0x0

    .line 191
    const/4 v12, 0x0

    .line 192
    const/4 v13, 0x0

    .line 193
    const/4 v14, 0x0

    .line 194
    const/4 v15, 0x0

    .line 195
    const/16 v16, 0x0

    .line 196
    .line 197
    const/16 v17, 0x0

    .line 198
    .line 199
    const/16 v18, 0x0

    .line 200
    .line 201
    invoke-static/range {v2 .. v20}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_4

    .line 210
    .line 211
    goto/16 :goto_2

    .line 212
    .line 213
    :cond_5
    if-eqz v26, :cond_7

    .line 214
    .line 215
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, La/xb70;

    .line 220
    .line 221
    iget-boolean v0, v0, La/xb70;->m:Z

    .line 222
    .line 223
    if-eqz v0, :cond_7

    .line 224
    .line 225
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 226
    .line 227
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-object v2, v1

    .line 235
    check-cast v2, La/xb70;

    .line 236
    .line 237
    const/16 v19, 0x0

    .line 238
    .line 239
    const v20, 0x1fdff

    .line 240
    .line 241
    .line 242
    const/4 v3, 0x0

    .line 243
    const/4 v4, 0x0

    .line 244
    const/4 v5, 0x0

    .line 245
    const/4 v6, 0x0

    .line 246
    const/4 v7, 0x0

    .line 247
    const/4 v8, 0x0

    .line 248
    const/4 v9, 0x0

    .line 249
    const/4 v10, 0x0

    .line 250
    const/4 v11, 0x0

    .line 251
    const/4 v12, 0x1

    .line 252
    const/4 v13, 0x0

    .line 253
    const/4 v14, 0x0

    .line 254
    const/4 v15, 0x0

    .line 255
    const/16 v16, 0x0

    .line 256
    .line 257
    const/16 v17, 0x0

    .line 258
    .line 259
    const/16 v18, 0x0

    .line 260
    .line 261
    invoke-static/range {v2 .. v20}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_6

    .line 270
    .line 271
    goto/16 :goto_2

    .line 272
    .line 273
    :cond_7
    if-eqz v26, :cond_9

    .line 274
    .line 275
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, La/xb70;

    .line 280
    .line 281
    iget-object v0, v0, La/xb70;->n:La/fa70;

    .line 282
    .line 283
    iget-boolean v0, v0, La/fa70;->f:Z

    .line 284
    .line 285
    if-eqz v0, :cond_9

    .line 286
    .line 287
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    check-cast v0, La/xb70;

    .line 292
    .line 293
    iget-object v0, v0, La/xb70;->n:La/fa70;

    .line 294
    .line 295
    iget-boolean v0, v0, La/fa70;->c:Z

    .line 296
    .line 297
    if-eqz v0, :cond_9

    .line 298
    .line 299
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 300
    .line 301
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    move-object v5, v1

    .line 309
    check-cast v5, La/xb70;

    .line 310
    .line 311
    const/16 v22, 0x0

    .line 312
    .line 313
    const v23, 0x1fdff

    .line 314
    .line 315
    .line 316
    const/4 v6, 0x0

    .line 317
    const/4 v7, 0x0

    .line 318
    const/4 v8, 0x0

    .line 319
    const/4 v9, 0x0

    .line 320
    const/4 v10, 0x0

    .line 321
    const/4 v11, 0x0

    .line 322
    const/4 v12, 0x0

    .line 323
    const/4 v13, 0x0

    .line 324
    const/4 v14, 0x0

    .line 325
    const/4 v15, 0x1

    .line 326
    const/16 v16, 0x0

    .line 327
    .line 328
    const/16 v17, 0x0

    .line 329
    .line 330
    const/16 v18, 0x0

    .line 331
    .line 332
    const/16 v19, 0x0

    .line 333
    .line 334
    const/16 v20, 0x0

    .line 335
    .line 336
    const/16 v21, 0x0

    .line 337
    .line 338
    invoke-static/range {v5 .. v23}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    if-eqz v1, :cond_8

    .line 347
    .line 348
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    check-cast v0, La/xb70;

    .line 353
    .line 354
    iget-object v0, v0, La/xb70;->n:La/fa70;

    .line 355
    .line 356
    iget-boolean v0, v0, La/fa70;->b:Z

    .line 357
    .line 358
    if-eqz v0, :cond_c

    .line 359
    .line 360
    invoke-virtual {v4}, La/xd70;->k0()V

    .line 361
    .line 362
    .line 363
    goto :goto_2

    .line 364
    :cond_9
    if-eqz v26, :cond_c

    .line 365
    .line 366
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, La/xb70;

    .line 371
    .line 372
    iget-object v0, v0, La/xb70;->n:La/fa70;

    .line 373
    .line 374
    iget-boolean v0, v0, La/fa70;->b:Z

    .line 375
    .line 376
    if-eqz v0, :cond_a

    .line 377
    .line 378
    invoke-virtual {v4}, La/xd70;->k0()V

    .line 379
    .line 380
    .line 381
    goto :goto_2

    .line 382
    :cond_a
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 383
    .line 384
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    move-object v5, v1

    .line 392
    check-cast v5, La/xb70;

    .line 393
    .line 394
    const/16 v22, 0x0

    .line 395
    .line 396
    const v23, 0x1f7ff

    .line 397
    .line 398
    .line 399
    const/4 v6, 0x0

    .line 400
    const/4 v7, 0x0

    .line 401
    const/4 v8, 0x0

    .line 402
    const/4 v9, 0x0

    .line 403
    const/4 v10, 0x0

    .line 404
    const/4 v11, 0x0

    .line 405
    const/4 v12, 0x0

    .line 406
    const/4 v13, 0x0

    .line 407
    const/4 v14, 0x0

    .line 408
    const/4 v15, 0x0

    .line 409
    const/16 v16, 0x0

    .line 410
    .line 411
    const/16 v17, 0x0

    .line 412
    .line 413
    const/16 v18, 0x0

    .line 414
    .line 415
    const/16 v19, 0x0

    .line 416
    .line 417
    const/16 v20, 0x0

    .line 418
    .line 419
    const/16 v21, 0x0

    .line 420
    .line 421
    invoke-static/range {v5 .. v23}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-eqz v1, :cond_b

    .line 430
    .line 431
    invoke-virtual {v4}, La/xd70;->t0()V

    .line 432
    .line 433
    .line 434
    :cond_c
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 438
    .line 439
    iget-boolean v7, v0, La/jd70;->j:Z

    .line 440
    .line 441
    if-eqz v7, :cond_e

    .line 442
    .line 443
    if-ne v7, v5, :cond_d

    .line 444
    .line 445
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    goto :goto_3

    .line 449
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    goto :goto_4

    .line 453
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    iget-object v3, v4, La/xd70;->k0:La/ea70;

    .line 457
    .line 458
    new-instance v7, La/ud70;

    .line 459
    .line 460
    invoke-direct {v7, v4, v6, v2}, La/ud70;-><init>(La/xd70;La/yje;B)V

    .line 461
    .line 462
    .line 463
    iput-boolean v5, v0, La/jd70;->j:Z

    .line 464
    .line 465
    invoke-virtual {v3, v7, v0}, La/ea70;->b(La/ud70;La/zje;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    if-ne v0, v1, :cond_f

    .line 470
    .line 471
    move-object v6, v1

    .line 472
    goto :goto_4

    .line 473
    :cond_f
    :goto_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    :goto_4
    return-object v6

    .line 476
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 477
    .line 478
    iget-boolean v2, v0, La/jd70;->j:Z

    .line 479
    .line 480
    if-eqz v2, :cond_11

    .line 481
    .line 482
    if-ne v2, v5, :cond_10

    .line 483
    .line 484
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    goto :goto_5

    .line 488
    :cond_10
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    goto :goto_6

    .line 492
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    sget-object v2, La/wen;->b:La/uen;

    .line 496
    .line 497
    const/4 v2, 0x3

    .line 498
    sget-object v3, La/bfn;->e:La/bfn;

    .line 499
    .line 500
    invoke-static {v2, v3}, La/ibc;->v0(ILa/bfn;)J

    .line 501
    .line 502
    .line 503
    move-result-wide v2

    .line 504
    iput-boolean v5, v0, La/jd70;->j:Z

    .line 505
    .line 506
    invoke-static {v2, v3, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    if-ne v0, v1, :cond_12

    .line 511
    .line 512
    move-object v6, v1

    .line 513
    goto :goto_6

    .line 514
    :cond_12
    :goto_5
    sget v0, La/xd70;->B0:I

    .line 515
    .line 516
    invoke-virtual {v4}, La/xd70;->t0()V

    .line 517
    .line 518
    .line 519
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    :goto_6
    return-object v6

    .line 522
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 523
    .line 524
    iget-boolean v2, v0, La/jd70;->j:Z

    .line 525
    .line 526
    if-eqz v2, :cond_14

    .line 527
    .line 528
    if-ne v2, v5, :cond_13

    .line 529
    .line 530
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    goto :goto_8

    .line 534
    :cond_13
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    check-cast v2, La/xb70;

    .line 546
    .line 547
    iget-object v2, v2, La/xb70;->c:La/c5v0;

    .line 548
    .line 549
    if-eqz v2, :cond_16

    .line 550
    .line 551
    iput-boolean v5, v0, La/jd70;->j:Z

    .line 552
    .line 553
    iget-object v3, v2, La/c5v0;->b:La/mne;

    .line 554
    .line 555
    iget-object v3, v3, La/mne;->c:La/vs10;

    .line 556
    .line 557
    new-instance v4, La/wup0;

    .line 558
    .line 559
    const/16 v5, 0x12

    .line 560
    .line 561
    invoke-direct {v4, v2, v6, v5}, La/wup0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 562
    .line 563
    .line 564
    invoke-static {v3, v4, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    if-ne v0, v1, :cond_15

    .line 569
    .line 570
    goto :goto_7

    .line 571
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 572
    .line 573
    :goto_7
    if-ne v0, v1, :cond_16

    .line 574
    .line 575
    move-object v6, v1

    .line 576
    goto :goto_9

    .line 577
    :cond_16
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    :goto_9
    return-object v6

    .line 580
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 581
    .line 582
    iget-boolean v2, v0, La/jd70;->j:Z

    .line 583
    .line 584
    if-eqz v2, :cond_18

    .line 585
    .line 586
    if-ne v2, v5, :cond_17

    .line 587
    .line 588
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    goto :goto_a

    .line 592
    :cond_17
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    goto :goto_b

    .line 596
    :cond_18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    iget-object v2, v4, La/xd70;->B:La/z7z;

    .line 600
    .line 601
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    check-cast v2, La/hse0;

    .line 609
    .line 610
    iput-boolean v5, v0, La/jd70;->j:Z

    .line 611
    .line 612
    const/4 v3, 0x5

    .line 613
    invoke-static {v2, v6, v5, v0, v3}, La/hse0;->a(La/hse0;Ljava/lang/String;ZLa/yje;I)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    if-ne v0, v1, :cond_19

    .line 618
    .line 619
    move-object v6, v1

    .line 620
    goto :goto_b

    .line 621
    :cond_19
    :goto_a
    sget v0, La/xd70;->B0:I

    .line 622
    .line 623
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 624
    .line 625
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 626
    .line 627
    :cond_1a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    move-object v5, v0

    .line 635
    check-cast v5, La/xb70;

    .line 636
    .line 637
    const/16 v22, 0x0

    .line 638
    .line 639
    const v23, 0x1f7ff

    .line 640
    .line 641
    .line 642
    const/4 v6, 0x0

    .line 643
    const/4 v7, 0x0

    .line 644
    const/4 v8, 0x0

    .line 645
    const/4 v9, 0x0

    .line 646
    const/4 v10, 0x0

    .line 647
    const/4 v11, 0x0

    .line 648
    const/4 v12, 0x0

    .line 649
    const/4 v13, 0x0

    .line 650
    const/4 v14, 0x0

    .line 651
    const/4 v15, 0x0

    .line 652
    const/16 v16, 0x0

    .line 653
    .line 654
    const/16 v17, 0x0

    .line 655
    .line 656
    const/16 v18, 0x0

    .line 657
    .line 658
    const/16 v19, 0x0

    .line 659
    .line 660
    const/16 v20, 0x0

    .line 661
    .line 662
    const/16 v21, 0x0

    .line 663
    .line 664
    invoke-static/range {v5 .. v23}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    if-eqz v0, :cond_1a

    .line 673
    .line 674
    new-instance v0, La/qb70;

    .line 675
    .line 676
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    check-cast v1, La/xb70;

    .line 681
    .line 682
    iget-object v1, v1, La/xb70;->c:La/c5v0;

    .line 683
    .line 684
    invoke-direct {v0, v1}, La/qb70;-><init>(La/c5v0;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v4, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    new-instance v0, La/rb70;

    .line 691
    .line 692
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    check-cast v1, La/xb70;

    .line 697
    .line 698
    iget-object v1, v1, La/xb70;->c:La/c5v0;

    .line 699
    .line 700
    invoke-direct {v0, v1}, La/rb70;-><init>(La/c5v0;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v4, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v4}, La/xd70;->t0()V

    .line 707
    .line 708
    .line 709
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 710
    .line 711
    :goto_b
    return-object v6

    .line 712
    :pswitch_4
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 713
    .line 714
    sget-object v7, La/wne;->a:La/wne;

    .line 715
    .line 716
    iget-boolean v8, v0, La/jd70;->j:Z

    .line 717
    .line 718
    if-eqz v8, :cond_1c

    .line 719
    .line 720
    if-ne v8, v5, :cond_1b

    .line 721
    .line 722
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    move-object/from16 v0, p1

    .line 726
    .line 727
    goto/16 :goto_c

    .line 728
    .line 729
    :cond_1b
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    goto/16 :goto_d

    .line 733
    .line 734
    :cond_1c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    sget v3, La/xd70;->B0:I

    .line 738
    .line 739
    invoke-virtual {v4, v2}, La/xd70;->j0(Z)V

    .line 740
    .line 741
    .line 742
    iget-object v3, v1, La/ocj;->a:La/p7m0;

    .line 743
    .line 744
    :cond_1d
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    move-object v8, v6

    .line 752
    check-cast v8, La/xb70;

    .line 753
    .line 754
    iget-object v9, v8, La/xb70;->o:La/f970;

    .line 755
    .line 756
    const/16 v17, 0x0

    .line 757
    .line 758
    const/16 v18, 0x1d

    .line 759
    .line 760
    const/4 v10, 0x0

    .line 761
    const/4 v11, 0x0

    .line 762
    const/4 v12, 0x0

    .line 763
    const-wide/16 v13, 0x0

    .line 764
    .line 765
    const/4 v15, 0x0

    .line 766
    const/16 v16, 0x0

    .line 767
    .line 768
    invoke-static/range {v9 .. v18}, La/f970;->a(La/f970;ZZZDZZZI)La/f970;

    .line 769
    .line 770
    .line 771
    move-result-object v23

    .line 772
    const/16 v25, 0x0

    .line 773
    .line 774
    const v26, 0x1bfff

    .line 775
    .line 776
    .line 777
    const/4 v9, 0x0

    .line 778
    const/4 v10, 0x0

    .line 779
    const/4 v11, 0x0

    .line 780
    const/4 v13, 0x0

    .line 781
    const/4 v14, 0x0

    .line 782
    const/16 v17, 0x0

    .line 783
    .line 784
    const/16 v18, 0x0

    .line 785
    .line 786
    const/16 v19, 0x0

    .line 787
    .line 788
    const/16 v20, 0x0

    .line 789
    .line 790
    const/16 v21, 0x0

    .line 791
    .line 792
    const/16 v22, 0x0

    .line 793
    .line 794
    const/16 v24, 0x0

    .line 795
    .line 796
    invoke-static/range {v8 .. v26}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 797
    .line 798
    .line 799
    move-result-object v8

    .line 800
    invoke-virtual {v3, v6, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    move-result v6

    .line 804
    if-eqz v6, :cond_1d

    .line 805
    .line 806
    new-instance v3, La/pgr;

    .line 807
    .line 808
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v6

    .line 812
    check-cast v6, La/xb70;

    .line 813
    .line 814
    iget-object v6, v6, La/xb70;->n:La/fa70;

    .line 815
    .line 816
    iget-wide v8, v6, La/fa70;->e:J

    .line 817
    .line 818
    invoke-direct {v3, v2, v8, v9}, La/pgr;-><init>(ZJ)V

    .line 819
    .line 820
    .line 821
    iget-object v2, v4, La/xd70;->j0:La/z7z;

    .line 822
    .line 823
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    check-cast v2, La/vby;

    .line 831
    .line 832
    invoke-virtual {v3, v2}, La/mir;->a(La/vby;)La/agr;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    invoke-virtual {v4, v2}, La/xd70;->m0(La/agr;)V

    .line 837
    .line 838
    .line 839
    iget-object v2, v4, La/xd70;->H:La/z7z;

    .line 840
    .line 841
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    check-cast v2, La/ahu;

    .line 846
    .line 847
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v3

    .line 851
    check-cast v3, La/xb70;

    .line 852
    .line 853
    iget-object v3, v3, La/xb70;->q:La/z870;

    .line 854
    .line 855
    iget-object v3, v3, La/z870;->b:La/bm5;

    .line 856
    .line 857
    iput-boolean v5, v0, La/jd70;->j:Z

    .line 858
    .line 859
    invoke-virtual {v2, v3, v0}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    if-ne v0, v7, :cond_1e

    .line 864
    .line 865
    move-object v6, v7

    .line 866
    goto :goto_d

    .line 867
    :cond_1e
    :goto_c
    move-object v11, v0

    .line 868
    check-cast v11, La/ql5;

    .line 869
    .line 870
    sget v0, La/xd70;->B0:I

    .line 871
    .line 872
    iget-object v14, v1, La/ocj;->a:La/p7m0;

    .line 873
    .line 874
    :cond_1f
    invoke-virtual {v14}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    move-object v15, v0

    .line 882
    check-cast v15, La/xb70;

    .line 883
    .line 884
    iget-object v6, v15, La/xb70;->q:La/z870;

    .line 885
    .line 886
    const/4 v12, 0x0

    .line 887
    const/16 v13, 0x2f

    .line 888
    .line 889
    const/4 v7, 0x0

    .line 890
    const/4 v8, 0x0

    .line 891
    const/4 v9, 0x0

    .line 892
    const/4 v10, 0x0

    .line 893
    invoke-static/range {v6 .. v13}, La/z870;->a(La/z870;ILa/bm5;ZZLa/ql5;ZI)La/z870;

    .line 894
    .line 895
    .line 896
    move-result-object v32

    .line 897
    const v33, 0xffff

    .line 898
    .line 899
    .line 900
    const/16 v16, 0x0

    .line 901
    .line 902
    const/16 v17, 0x0

    .line 903
    .line 904
    const/16 v18, 0x0

    .line 905
    .line 906
    const/16 v19, 0x0

    .line 907
    .line 908
    const/16 v20, 0x0

    .line 909
    .line 910
    const/16 v21, 0x0

    .line 911
    .line 912
    const/16 v22, 0x0

    .line 913
    .line 914
    const/16 v23, 0x0

    .line 915
    .line 916
    const/16 v24, 0x0

    .line 917
    .line 918
    const/16 v25, 0x0

    .line 919
    .line 920
    const/16 v26, 0x0

    .line 921
    .line 922
    const/16 v27, 0x0

    .line 923
    .line 924
    const/16 v28, 0x0

    .line 925
    .line 926
    const/16 v29, 0x0

    .line 927
    .line 928
    const/16 v30, 0x0

    .line 929
    .line 930
    const/16 v31, 0x0

    .line 931
    .line 932
    invoke-static/range {v15 .. v33}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    invoke-virtual {v14, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    if-eqz v0, :cond_1f

    .line 941
    .line 942
    invoke-virtual {v4}, La/xd70;->l0()V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v4}, La/xd70;->Y()V

    .line 946
    .line 947
    .line 948
    iget-object v0, v4, La/xd70;->u:La/z7z;

    .line 949
    .line 950
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    check-cast v0, La/v88;

    .line 955
    .line 956
    iget-object v1, v4, La/xd70;->q:La/i1w0;

    .line 957
    .line 958
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    check-cast v2, La/xb70;

    .line 963
    .line 964
    iget-object v2, v2, La/xb70;->q:La/z870;

    .line 965
    .line 966
    iget-object v2, v2, La/z870;->e:La/ql5;

    .line 967
    .line 968
    iget-wide v2, v2, La/ql5;->a:J

    .line 969
    .line 970
    invoke-virtual {v0, v1, v5, v2, v3}, La/v88;->a(La/i1w0;ZJ)V

    .line 971
    .line 972
    .line 973
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 974
    .line 975
    :goto_d
    return-object v6

    .line 976
    nop

    .line 977
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
