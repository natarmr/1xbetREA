.class public final La/b91;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/n91;


# direct methods
.method public synthetic constructor <init>(La/n91;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/b91;->i:B

    iput-object p1, p0, La/b91;->k:La/n91;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/b91;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/b91;->k:La/n91;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/b91;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/b91;-><init>(La/n91;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/b91;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/b91;-><init>(La/n91;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/b91;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/b91;-><init>(La/n91;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/b91;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/b91;-><init>(La/n91;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/b91;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/b91;-><init>(La/n91;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/b91;->i:B

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
    invoke-virtual {p0, p1, p2}, La/b91;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/b91;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/b91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/b91;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/b91;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/b91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/b91;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/b91;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/b91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/b91;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/b91;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/b91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/b91;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/b91;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/b91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b91;->i:B

    .line 4
    .line 5
    sget-object v2, La/n0w0;->a:La/n0w0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v5, v0, La/b91;->k:La/n91;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v2, v0, La/b91;->j:Z

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    if-ne v2, v7, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v5, La/n91;->W:La/ytt;

    .line 37
    .line 38
    sget-object v4, La/aue0;->d:La/aue0;

    .line 39
    .line 40
    iput-boolean v7, v0, La/b91;->j:Z

    .line 41
    .line 42
    invoke-virtual {v2, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-ne v0, v1, :cond_2

    .line 47
    .line 48
    move-object v6, v1

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    :goto_0
    iget-object v0, v5, La/n91;->r:La/i1w0;

    .line 51
    .line 52
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, La/c8d;

    .line 57
    .line 58
    sget-object v4, La/y7d;->a:La/v7d;

    .line 59
    .line 60
    sget-object v5, La/o0w0;->a:La/o0w0;

    .line 61
    .line 62
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2, v2, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, v3}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_1
    move-object v2, v1

    .line 74
    check-cast v2, La/paw;

    .line 75
    .line 76
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, La/oe50;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    :goto_2
    return-object v6

    .line 95
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 96
    .line 97
    iget-boolean v2, v0, La/b91;->j:Z

    .line 98
    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    if-ne v2, v7, :cond_4

    .line 102
    .line 103
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object/from16 v0, p1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget v2, La/n91;->f0:I

    .line 117
    .line 118
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 119
    .line 120
    iget-object v8, v2, La/ocj;->a:La/p7m0;

    .line 121
    .line 122
    :cond_6
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-object v9, v2

    .line 130
    check-cast v9, La/u81;

    .line 131
    .line 132
    const/16 v25, 0x0

    .line 133
    .line 134
    const v26, 0x1effef

    .line 135
    .line 136
    .line 137
    const/4 v10, 0x0

    .line 138
    const/4 v11, 0x0

    .line 139
    const/4 v12, 0x1

    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    const-wide/16 v16, 0x0

    .line 144
    .line 145
    const/16 v18, 0x0

    .line 146
    .line 147
    const/16 v19, 0x0

    .line 148
    .line 149
    const/16 v20, 0x0

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const/16 v23, 0x1

    .line 156
    .line 157
    const/16 v24, 0x0

    .line 158
    .line 159
    invoke-static/range {v9 .. v26}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v8, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_6

    .line 168
    .line 169
    iget-object v2, v5, La/n91;->t:La/khf0;

    .line 170
    .line 171
    sget-object v3, La/bm5;->e:La/bm5;

    .line 172
    .line 173
    iput-boolean v7, v0, La/b91;->j:Z

    .line 174
    .line 175
    invoke-static {v2, v3, v0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v1, :cond_7

    .line 180
    .line 181
    move-object v6, v1

    .line 182
    goto :goto_4

    .line 183
    :cond_7
    :goto_3
    check-cast v0, La/ql5;

    .line 184
    .line 185
    iget-object v1, v5, La/n91;->M:La/v88;

    .line 186
    .line 187
    iget-object v2, v5, La/n91;->r:La/i1w0;

    .line 188
    .line 189
    iget-wide v3, v0, La/ql5;->a:J

    .line 190
    .line 191
    invoke-virtual {v1, v2, v7, v3, v4}, La/v88;->a(La/i1w0;ZJ)V

    .line 192
    .line 193
    .line 194
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    :goto_4
    return-object v6

    .line 197
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 198
    .line 199
    iget-boolean v8, v0, La/b91;->j:Z

    .line 200
    .line 201
    if-eqz v8, :cond_9

    .line 202
    .line 203
    if-ne v8, v7, :cond_8

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_8
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget-object v4, v5, La/n91;->W:La/ytt;

    .line 217
    .line 218
    sget-object v6, La/aue0;->d:La/aue0;

    .line 219
    .line 220
    iput-boolean v7, v0, La/b91;->j:Z

    .line 221
    .line 222
    invoke-virtual {v4, v6, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne v0, v1, :cond_a

    .line 227
    .line 228
    move-object v6, v1

    .line 229
    goto :goto_7

    .line 230
    :cond_a
    :goto_5
    iget-object v0, v5, La/n91;->r:La/i1w0;

    .line 231
    .line 232
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    new-instance v4, La/c8d;

    .line 237
    .line 238
    sget-object v5, La/y7d;->a:La/v7d;

    .line 239
    .line 240
    invoke-direct {v4, v5, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v1, v4, v4, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v1, v3}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    :goto_6
    move-object v2, v1

    .line 252
    check-cast v2, La/paw;

    .line 253
    .line 254
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eqz v3, :cond_b

    .line 259
    .line 260
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    check-cast v2, La/oe50;

    .line 265
    .line 266
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 267
    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_b
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    :goto_7
    return-object v6

    .line 273
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 274
    .line 275
    iget-boolean v8, v0, La/b91;->j:Z

    .line 276
    .line 277
    if-eqz v8, :cond_d

    .line 278
    .line 279
    if-ne v8, v7, :cond_c

    .line 280
    .line 281
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iget-object v4, v5, La/n91;->W:La/ytt;

    .line 293
    .line 294
    sget-object v6, La/aue0;->d:La/aue0;

    .line 295
    .line 296
    iput-boolean v7, v0, La/b91;->j:Z

    .line 297
    .line 298
    invoke-virtual {v4, v6, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    if-ne v0, v1, :cond_e

    .line 303
    .line 304
    move-object v6, v1

    .line 305
    goto :goto_a

    .line 306
    :cond_e
    :goto_8
    iget-object v0, v5, La/n91;->r:La/i1w0;

    .line 307
    .line 308
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    new-instance v4, La/c8d;

    .line 313
    .line 314
    sget-object v5, La/y7d;->a:La/v7d;

    .line 315
    .line 316
    invoke-direct {v4, v5, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v1, v4, v4, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1, v3}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    :goto_9
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
    goto :goto_9

    .line 346
    :cond_f
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    :goto_a
    return-object v6

    .line 349
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 350
    .line 351
    iget-boolean v2, v0, La/b91;->j:Z

    .line 352
    .line 353
    if-eqz v2, :cond_11

    .line 354
    .line 355
    if-ne v2, v7, :cond_10

    .line 356
    .line 357
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    goto :goto_b

    .line 361
    :cond_10
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_c

    .line 365
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    sget v2, La/n91;->f0:I

    .line 369
    .line 370
    iget-object v2, v5, La/n91;->X:La/bby;

    .line 371
    .line 372
    invoke-static {v2}, La/e3c;->n(La/bby;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    sget-object v13, La/k91;->a:La/k91;

    .line 380
    .line 381
    new-instance v14, La/j91;

    .line 382
    .line 383
    invoke-direct {v14, v5, v6, v7}, La/j91;-><init>(La/n91;La/yje;B)V

    .line 384
    .line 385
    .line 386
    const/16 v15, 0x24

    .line 387
    .line 388
    const-wide/16 v9, 0x7d0

    .line 389
    .line 390
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 391
    .line 392
    const/4 v12, 0x0

    .line 393
    invoke-static/range {v8 .. v15}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    iput-object v2, v5, La/n91;->X:La/bby;

    .line 398
    .line 399
    iget-object v2, v5, La/n91;->s:La/hcp0;

    .line 400
    .line 401
    iput-boolean v7, v0, La/b91;->j:Z

    .line 402
    .line 403
    invoke-virtual {v2, v0}, La/hcp0;->q(La/zje;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    if-ne v0, v1, :cond_12

    .line 408
    .line 409
    move-object v6, v1

    .line 410
    goto :goto_c

    .line 411
    :cond_12
    :goto_b
    iget-object v0, v5, La/n91;->X:La/bby;

    .line 412
    .line 413
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 414
    .line 415
    .line 416
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    :goto_c
    return-object v6

    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
