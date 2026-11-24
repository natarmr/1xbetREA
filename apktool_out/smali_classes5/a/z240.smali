.class public final La/z240;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/j340;


# direct methods
.method public synthetic constructor <init>(La/j340;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z240;->i:B

    iput-object p1, p0, La/z240;->k:La/j340;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/z240;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/z240;->k:La/j340;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/z240;

    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/z240;-><init>(La/j340;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/z240;

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/z240;-><init>(La/j340;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/z240;

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/z240;-><init>(La/j340;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/z240;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/z240;-><init>(La/j340;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/z240;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/z240;-><init>(La/j340;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_4
    new-instance p1, La/z240;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {p1, p0, p2, v0}, La/z240;-><init>(La/j340;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object p1

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/z240;->i:B

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
    invoke-virtual {p0, p1, p2}, La/z240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/z240;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/z240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/z240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/z240;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/z240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/z240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/z240;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/z240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/z240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/z240;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/z240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/z240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/z240;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/z240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/z240;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/z240;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/z240;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
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
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z240;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/z240;->k:La/j340;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v2, v0, La/z240;->j:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v6, La/j340;->C:La/rou;

    .line 37
    .line 38
    iput-boolean v5, v0, La/z240;->j:Z

    .line 39
    .line 40
    invoke-virtual {v2, v5, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-ne v0, v1, :cond_2

    .line 45
    .line 46
    move-object v3, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :goto_0
    check-cast v0, La/m2c0;

    .line 49
    .line 50
    iget-object v0, v0, La/m2c0;->e0:La/cau0;

    .line 51
    .line 52
    sget-object v1, La/cau0;->h:La/cau0;

    .line 53
    .line 54
    if-eq v0, v1, :cond_3

    .line 55
    .line 56
    sget v0, La/j340;->i1:I

    .line 57
    .line 58
    sget-object v0, La/z040;->a:La/z040;

    .line 59
    .line 60
    invoke-virtual {v6, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    :goto_1
    return-object v3

    .line 66
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 67
    .line 68
    iget-boolean v2, v0, La/z240;->j:Z

    .line 69
    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    if-ne v2, v5, :cond_4

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iput-boolean v5, v0, La/z240;->j:Z

    .line 86
    .line 87
    sget v2, La/j340;->i1:I

    .line 88
    .line 89
    invoke-virtual {v6, v0}, La/j340;->W(La/zje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-ne v0, v1, :cond_6

    .line 94
    .line 95
    move-object v3, v1

    .line 96
    goto :goto_3

    .line 97
    :cond_6
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    :goto_3
    return-object v3

    .line 100
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 101
    .line 102
    iget-boolean v7, v0, La/z240;->j:Z

    .line 103
    .line 104
    if-eqz v7, :cond_8

    .line 105
    .line 106
    if-ne v7, v5, :cond_7

    .line 107
    .line 108
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    sget v3, La/j340;->i1:I

    .line 121
    .line 122
    iget-object v3, v6, La/i3t0;->i:La/ocj;

    .line 123
    .line 124
    iget-object v7, v3, La/ocj;->a:La/p7m0;

    .line 125
    .line 126
    :cond_9
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-object v8, v3

    .line 134
    check-cast v8, La/d140;

    .line 135
    .line 136
    const/16 v27, 0x0

    .line 137
    .line 138
    const v28, 0x3ffff7ff    # 1.9997557f

    .line 139
    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    const/4 v10, 0x0

    .line 143
    const/4 v11, 0x0

    .line 144
    const/4 v12, 0x0

    .line 145
    const/4 v13, 0x0

    .line 146
    const/4 v14, 0x0

    .line 147
    const/4 v15, 0x0

    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const/16 v18, 0x1

    .line 153
    .line 154
    const/16 v19, 0x0

    .line 155
    .line 156
    const/16 v20, 0x0

    .line 157
    .line 158
    const/16 v21, 0x0

    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const/16 v23, 0x0

    .line 163
    .line 164
    const/16 v24, 0x0

    .line 165
    .line 166
    const/16 v25, 0x0

    .line 167
    .line 168
    const/16 v26, 0x0

    .line 169
    .line 170
    invoke-static/range {v8 .. v28}, La/d140;->a(La/d140;ZZZLjava/lang/Integer;La/i8m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/util/Map;Ljava/util/Set;La/r040;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)La/d140;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v7, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_9

    .line 179
    .line 180
    iget-object v3, v6, La/j340;->P:La/yfu;

    .line 181
    .line 182
    iget-object v3, v3, La/yfu;->a:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, La/o470;

    .line 185
    .line 186
    iget-object v3, v3, La/o470;->a:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v3, La/m4i0;

    .line 189
    .line 190
    iget-object v3, v3, La/m4i0;->a:La/r040;

    .line 191
    .line 192
    sget-object v4, La/r040;->e:La/r040;

    .line 193
    .line 194
    if-ne v3, v4, :cond_a

    .line 195
    .line 196
    iget-object v3, v6, La/j340;->y:La/ytt;

    .line 197
    .line 198
    sget-object v4, La/aue0;->d:La/aue0;

    .line 199
    .line 200
    iput-boolean v5, v0, La/z240;->j:Z

    .line 201
    .line 202
    invoke-virtual {v3, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-ne v0, v1, :cond_a

    .line 207
    .line 208
    move-object v3, v1

    .line 209
    goto :goto_6

    .line 210
    :cond_a
    :goto_4
    iget-object v0, v6, La/j340;->q:La/i1w0;

    .line 211
    .line 212
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    new-instance v3, La/c8d;

    .line 217
    .line 218
    sget-object v4, La/y7d;->a:La/v7d;

    .line 219
    .line 220
    sget-object v5, La/o0w0;->a:La/o0w0;

    .line 221
    .line 222
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v3, v3, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    :goto_5
    move-object v2, v1

    .line 234
    check-cast v2, La/paw;

    .line 235
    .line 236
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_b

    .line 241
    .line 242
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    check-cast v2, La/oe50;

    .line 247
    .line 248
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_b
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    :goto_6
    return-object v3

    .line 255
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 256
    .line 257
    iget-boolean v7, v0, La/z240;->j:Z

    .line 258
    .line 259
    if-eqz v7, :cond_d

    .line 260
    .line 261
    if-ne v7, v5, :cond_c

    .line 262
    .line 263
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object v3, v6, La/j340;->P:La/yfu;

    .line 275
    .line 276
    iget-object v3, v3, La/yfu;->a:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v3, La/o470;

    .line 279
    .line 280
    iget-object v3, v3, La/o470;->a:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v3, La/m4i0;

    .line 283
    .line 284
    iget-object v3, v3, La/m4i0;->a:La/r040;

    .line 285
    .line 286
    sget-object v4, La/r040;->e:La/r040;

    .line 287
    .line 288
    if-ne v3, v4, :cond_e

    .line 289
    .line 290
    iget-object v3, v6, La/j340;->y:La/ytt;

    .line 291
    .line 292
    sget-object v4, La/aue0;->d:La/aue0;

    .line 293
    .line 294
    iput-boolean v5, v0, La/z240;->j:Z

    .line 295
    .line 296
    invoke-virtual {v3, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-ne v0, v1, :cond_e

    .line 301
    .line 302
    move-object v3, v1

    .line 303
    goto :goto_9

    .line 304
    :cond_e
    :goto_7
    iget-object v0, v6, La/j340;->q:La/i1w0;

    .line 305
    .line 306
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    new-instance v3, La/c8d;

    .line 311
    .line 312
    sget-object v4, La/y7d;->a:La/v7d;

    .line 313
    .line 314
    sget-object v5, La/n0w0;->a:La/n0w0;

    .line 315
    .line 316
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v1, v3, v3, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    :goto_8
    move-object v2, v1

    .line 328
    check-cast v2, La/paw;

    .line 329
    .line 330
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    if-eqz v3, :cond_f

    .line 335
    .line 336
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    check-cast v2, La/oe50;

    .line 341
    .line 342
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 343
    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_f
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    :goto_9
    return-object v3

    .line 349
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 350
    .line 351
    iget-boolean v2, v0, La/z240;->j:Z

    .line 352
    .line 353
    if-eqz v2, :cond_11

    .line 354
    .line 355
    if-ne v2, v5, :cond_10

    .line 356
    .line 357
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v0, p1

    .line 361
    .line 362
    goto :goto_a

    .line 363
    :cond_10
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    goto :goto_b

    .line 367
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    iget-object v2, v6, La/j340;->D:La/ahu;

    .line 371
    .line 372
    iput-boolean v5, v0, La/z240;->j:Z

    .line 373
    .line 374
    invoke-static {v2, v0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    if-ne v0, v1, :cond_12

    .line 379
    .line 380
    move-object v3, v1

    .line 381
    goto :goto_b

    .line 382
    :cond_12
    :goto_a
    check-cast v0, La/ql5;

    .line 383
    .line 384
    iget-object v1, v6, La/j340;->t:La/ot;

    .line 385
    .line 386
    sget-object v2, La/bm5;->g:La/bm5;

    .line 387
    .line 388
    invoke-virtual {v1, v2, v0}, La/ot;->a(La/bm5;La/ql5;)V

    .line 389
    .line 390
    .line 391
    iget-object v1, v6, La/j340;->u:La/jyg0;

    .line 392
    .line 393
    iget-wide v3, v0, La/ql5;->a:J

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    iget-object v0, v1, La/jyg0;->a:La/rrd;

    .line 399
    .line 400
    invoke-virtual {v0, v2, v3, v4}, La/rrd;->z(La/bm5;J)V

    .line 401
    .line 402
    .line 403
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 404
    .line 405
    :goto_b
    return-object v3

    .line 406
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 407
    .line 408
    iget-boolean v2, v0, La/z240;->j:Z

    .line 409
    .line 410
    if-eqz v2, :cond_14

    .line 411
    .line 412
    if-ne v2, v5, :cond_13

    .line 413
    .line 414
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v0, p1

    .line 418
    .line 419
    goto :goto_c

    .line 420
    :cond_13
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    goto :goto_d

    .line 424
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    iget-object v2, v6, La/j340;->B0:La/u8u;

    .line 428
    .line 429
    iput-boolean v5, v0, La/z240;->j:Z

    .line 430
    .line 431
    invoke-virtual {v2, v0}, La/u8u;->v(La/zje;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    if-ne v0, v1, :cond_15

    .line 436
    .line 437
    move-object v3, v1

    .line 438
    goto :goto_d

    .line 439
    :cond_15
    :goto_c
    check-cast v0, La/gx10;

    .line 440
    .line 441
    iget-object v1, v6, La/j340;->q:La/i1w0;

    .line 442
    .line 443
    new-instance v2, La/bw20;

    .line 444
    .line 445
    const/16 v3, 0x13

    .line 446
    .line 447
    invoke-direct {v2, v6, v0, v3}, La/bw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 451
    .line 452
    .line 453
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 454
    .line 455
    :goto_d
    return-object v3

    .line 456
    nop

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
