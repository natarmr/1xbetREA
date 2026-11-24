.class public final La/e21;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/n21;


# direct methods
.method public synthetic constructor <init>(La/n21;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e21;->i:B

    iput-object p1, p0, La/e21;->k:La/n21;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/e21;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/e21;->k:La/n21;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/e21;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/e21;-><init>(La/n21;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/e21;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/e21;-><init>(La/n21;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/e21;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/e21;-><init>(La/n21;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/e21;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance v0, La/e21;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v0, p0, p2, v1}, La/e21;-><init>(La/n21;La/yje;B)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    iput-boolean p0, v0, La/e21;->j:Z

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_3
    new-instance p1, La/e21;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-direct {p1, p0, p2, v0}, La/e21;-><init>(La/n21;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
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
    iget-byte v0, p0, La/e21;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/e21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/e21;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/e21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/e21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/e21;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/e21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/e21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/e21;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/e21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    check-cast p2, La/yje;

    .line 66
    .line 67
    invoke-virtual {p0, p1, p2}, La/e21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/e21;

    .line 72
    .line 73
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/e21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_3
    check-cast p1, La/vne;

    .line 81
    .line 82
    check-cast p2, La/yje;

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, La/e21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/e21;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/e21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e21;->i:B

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
    iget-object v6, v0, La/e21;->k:La/n21;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v7, v0, La/e21;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v5, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v6, La/n21;->E:La/u58;

    .line 35
    .line 36
    const-string v4, "aggregator_gifts"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, La/u58;->m(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v6, La/n21;->G:La/s64;

    .line 42
    .line 43
    sget-object v4, La/y1p;->f1:La/y1p;

    .line 44
    .line 45
    iget-object v7, v6, La/n21;->H:La/cmt;

    .line 46
    .line 47
    invoke-virtual {v7}, La/cmt;->g()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v3, v4, v7}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, v6, La/n21;->K:La/ytt;

    .line 55
    .line 56
    sget-object v4, La/aue0;->d:La/aue0;

    .line 57
    .line 58
    iput-boolean v5, v0, La/e21;->j:Z

    .line 59
    .line 60
    invoke-virtual {v3, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-ne v0, v1, :cond_2

    .line 65
    .line 66
    move-object v3, v1

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    :goto_0
    iget-object v0, v6, La/n21;->q:La/oeg0;

    .line 69
    .line 70
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v3, La/c8d;

    .line 79
    .line 80
    sget-object v4, La/y7d;->a:La/v7d;

    .line 81
    .line 82
    sget-object v5, La/o0w0;->a:La/o0w0;

    .line 83
    .line 84
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v3, v3, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :goto_1
    move-object v2, v1

    .line 96
    check-cast v2, La/paw;

    .line 97
    .line 98
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, La/oe50;

    .line 109
    .line 110
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    :goto_2
    return-object v3

    .line 117
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 118
    .line 119
    iget-boolean v7, v0, La/e21;->j:Z

    .line 120
    .line 121
    if-eqz v7, :cond_5

    .line 122
    .line 123
    if-ne v7, v5, :cond_4

    .line 124
    .line 125
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object v3, v6, La/n21;->E:La/u58;

    .line 137
    .line 138
    const-string v4, "my_aggregator"

    .line 139
    .line 140
    invoke-virtual {v3, v4}, La/u58;->l(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v3, v6, La/n21;->G:La/s64;

    .line 144
    .line 145
    sget-object v7, La/y1p;->b:La/y1p;

    .line 146
    .line 147
    invoke-virtual {v3, v4}, La/s64;->c(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object v3, v6, La/n21;->K:La/ytt;

    .line 151
    .line 152
    sget-object v4, La/aue0;->d:La/aue0;

    .line 153
    .line 154
    iput-boolean v5, v0, La/e21;->j:Z

    .line 155
    .line 156
    invoke-virtual {v3, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-ne v0, v1, :cond_6

    .line 161
    .line 162
    move-object v3, v1

    .line 163
    goto :goto_5

    .line 164
    :cond_6
    :goto_3
    iget-object v0, v6, La/n21;->q:La/oeg0;

    .line 165
    .line 166
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-instance v3, La/c8d;

    .line 175
    .line 176
    sget-object v4, La/y7d;->a:La/v7d;

    .line 177
    .line 178
    sget-object v5, La/n0w0;->a:La/n0w0;

    .line 179
    .line 180
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v3, v3, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    :goto_4
    move-object v2, v1

    .line 192
    check-cast v2, La/paw;

    .line 193
    .line 194
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_7

    .line 199
    .line 200
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, La/oe50;

    .line 205
    .line 206
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    :goto_5
    return-object v3

    .line 213
    :pswitch_1
    iget-boolean v15, v0, La/e21;->j:Z

    .line 214
    .line 215
    sget-object v0, La/wne;->a:La/wne;

    .line 216
    .line 217
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, La/q11;

    .line 225
    .line 226
    iget-boolean v0, v0, La/q11;->l:Z

    .line 227
    .line 228
    if-nez v0, :cond_8

    .line 229
    .line 230
    if-eqz v15, :cond_8

    .line 231
    .line 232
    invoke-virtual {v6}, La/n21;->P()V

    .line 233
    .line 234
    .line 235
    :cond_8
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 236
    .line 237
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 238
    .line 239
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-object v4, v0

    .line 247
    check-cast v4, La/q11;

    .line 248
    .line 249
    const/16 v22, 0x0

    .line 250
    .line 251
    const v23, 0x1fffbfff

    .line 252
    .line 253
    .line 254
    const-wide/16 v5, 0x0

    .line 255
    .line 256
    const/4 v7, 0x0

    .line 257
    const/4 v8, 0x0

    .line 258
    const/4 v9, 0x0

    .line 259
    const/4 v10, 0x0

    .line 260
    const/4 v11, 0x0

    .line 261
    const/4 v12, 0x0

    .line 262
    const/4 v13, 0x0

    .line 263
    const/4 v14, 0x0

    .line 264
    const/16 v16, 0x0

    .line 265
    .line 266
    const/16 v17, 0x0

    .line 267
    .line 268
    const/16 v18, 0x0

    .line 269
    .line 270
    const/16 v19, 0x0

    .line 271
    .line 272
    const/16 v20, 0x0

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    invoke-static/range {v4 .. v23}, La/q11;->a(La/q11;JLa/d7v;Ljava/lang/Integer;La/b7v;La/m7v;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/LinkedHashMap;ZZZLa/g7v;ZLa/ql5;Ljava/util/ArrayList;Ljava/util/Set;I)La/q11;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_9

    .line 285
    .line 286
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object v0

    .line 289
    :pswitch_2
    iget-boolean v13, v0, La/e21;->j:Z

    .line 290
    .line 291
    sget-object v0, La/wne;->a:La/wne;

    .line 292
    .line 293
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    sget-object v0, La/n21;->a0:Ljava/lang/String;

    .line 297
    .line 298
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 299
    .line 300
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 301
    .line 302
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-object v2, v1

    .line 310
    move-object v1, v2

    .line 311
    check-cast v1, La/q11;

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    const v20, 0x1fff7fff

    .line 316
    .line 317
    .line 318
    move-object v4, v2

    .line 319
    const-wide/16 v2, 0x0

    .line 320
    .line 321
    move-object v5, v4

    .line 322
    const/4 v4, 0x0

    .line 323
    move-object v6, v5

    .line 324
    const/4 v5, 0x0

    .line 325
    move-object v7, v6

    .line 326
    const/4 v6, 0x0

    .line 327
    move-object v8, v7

    .line 328
    const/4 v7, 0x0

    .line 329
    move-object v9, v8

    .line 330
    const/4 v8, 0x0

    .line 331
    move-object v10, v9

    .line 332
    const/4 v9, 0x0

    .line 333
    move-object v11, v10

    .line 334
    const/4 v10, 0x0

    .line 335
    move-object v12, v11

    .line 336
    const/4 v11, 0x0

    .line 337
    move-object v14, v12

    .line 338
    const/4 v12, 0x0

    .line 339
    move-object v15, v14

    .line 340
    const/4 v14, 0x0

    .line 341
    move-object/from16 v16, v15

    .line 342
    .line 343
    const/4 v15, 0x0

    .line 344
    move-object/from16 v17, v16

    .line 345
    .line 346
    const/16 v16, 0x0

    .line 347
    .line 348
    move-object/from16 v18, v17

    .line 349
    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    move-object/from16 v21, v18

    .line 353
    .line 354
    const/16 v18, 0x0

    .line 355
    .line 356
    move-object/from16 v24, v21

    .line 357
    .line 358
    invoke-static/range {v1 .. v20}, La/q11;->a(La/q11;JLa/d7v;Ljava/lang/Integer;La/b7v;La/m7v;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/LinkedHashMap;ZZZLa/g7v;ZLa/ql5;Ljava/util/ArrayList;Ljava/util/Set;I)La/q11;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    move-object/from16 v2, v24

    .line 363
    .line 364
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-eqz v1, :cond_a

    .line 369
    .line 370
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 374
    .line 375
    iget-boolean v7, v0, La/e21;->j:Z

    .line 376
    .line 377
    if-eqz v7, :cond_c

    .line 378
    .line 379
    if-ne v7, v5, :cond_b

    .line 380
    .line 381
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v0, p1

    .line 385
    .line 386
    check-cast v0, La/j0g0;

    .line 387
    .line 388
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_b
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    iget-object v3, v6, La/n21;->z:La/iqt;

    .line 399
    .line 400
    iget-object v3, v3, La/iqt;->a:La/gst0;

    .line 401
    .line 402
    invoke-virtual {v3}, La/gst0;->a()Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    iget-object v4, v6, La/n21;->t:La/wdu;

    .line 407
    .line 408
    iput-boolean v5, v0, La/e21;->j:Z

    .line 409
    .line 410
    invoke-static {v4, v2, v3, v5, v0}, La/wdu;->A(La/wdu;ZZZLa/zje;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    if-ne v0, v1, :cond_d

    .line 415
    .line 416
    move-object v3, v1

    .line 417
    goto :goto_7

    .line 418
    :cond_d
    :goto_6
    sget-object v1, La/iun;->a:La/iun;

    .line 419
    .line 420
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 421
    .line 422
    instance-of v2, v0, La/g0g0;

    .line 423
    .line 424
    if-eqz v2, :cond_e

    .line 425
    .line 426
    move-object v0, v1

    .line 427
    :cond_e
    check-cast v0, Ljava/util/List;

    .line 428
    .line 429
    new-instance v1, La/bo0;

    .line 430
    .line 431
    const/4 v2, 0x2

    .line 432
    invoke-direct {v1, v0, v2}, La/bo0;-><init>(Ljava/util/List;B)V

    .line 433
    .line 434
    .line 435
    sget-object v0, La/n21;->a0:Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {v6, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 438
    .line 439
    .line 440
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    :goto_7
    return-object v3

    .line 443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
