.class public final La/wl7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/fm7;


# direct methods
.method public synthetic constructor <init>(La/fm7;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wl7;->i:B

    iput-object p1, p0, La/wl7;->k:La/fm7;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wl7;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wl7;->k:La/fm7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wl7;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wl7;-><init>(La/fm7;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/wl7;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/wl7;-><init>(La/fm7;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/wl7;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/wl7;-><init>(La/fm7;La/yje;B)V

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
    iput-boolean p0, v0, La/wl7;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance p1, La/wl7;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/wl7;-><init>(La/fm7;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/wl7;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/wl7;-><init>(La/fm7;La/yje;B)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
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
    iget-byte v0, p0, La/wl7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wl7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/wl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wl7;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/wl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/wl7;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/wl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/wl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/wl7;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/wl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/wl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/wl7;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/wl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v1, v0, La/wl7;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/wl7;->k:La/fm7;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/wl7;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-boolean v3, v0, La/wl7;->j:Z

    .line 36
    .line 37
    sget v2, La/fm7;->p0:I

    .line 38
    .line 39
    invoke-virtual {v5, v0}, La/fm7;->M(La/zje;)Ljava/io/Serializable;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v4, v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_0
    check-cast v0, La/ql5;

    .line 48
    .line 49
    iget-object v0, v0, La/ql5;->i:La/txs0;

    .line 50
    .line 51
    invoke-virtual {v0}, La/txs0;->a()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget-object v0, v5, La/fm7;->i0:La/i1w0;

    .line 58
    .line 59
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v2, La/c8d;

    .line 64
    .line 65
    sget-object v3, La/y7d;->a:La/v7d;

    .line 66
    .line 67
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 68
    .line 69
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 70
    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :goto_1
    move-object v2, v1

    .line 78
    check-cast v2, La/paw;

    .line 79
    .line 80
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, La/oe50;

    .line 91
    .line 92
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    :goto_2
    return-object v4

    .line 99
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 100
    .line 101
    iget-boolean v6, v0, La/wl7;->j:Z

    .line 102
    .line 103
    if-eqz v6, :cond_5

    .line 104
    .line 105
    if-ne v6, v3, :cond_4

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v2, La/wen;->b:La/uen;

    .line 119
    .line 120
    const-wide/16 v6, 0x3e8

    .line 121
    .line 122
    sget-object v2, La/bfn;->d:La/bfn;

    .line 123
    .line 124
    invoke-static {v6, v7, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    iput-boolean v3, v0, La/wl7;->j:Z

    .line 129
    .line 130
    invoke-static {v6, v7, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-ne v0, v1, :cond_6

    .line 135
    .line 136
    move-object v4, v1

    .line 137
    goto :goto_4

    .line 138
    :cond_6
    :goto_3
    sget v0, La/fm7;->p0:I

    .line 139
    .line 140
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 141
    .line 142
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 143
    .line 144
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-object v2, v0

    .line 152
    check-cast v2, La/jk7;

    .line 153
    .line 154
    const/16 v23, 0x0

    .line 155
    .line 156
    const v24, 0x1ffffef

    .line 157
    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    const/4 v4, 0x0

    .line 161
    const-wide/16 v5, 0x0

    .line 162
    .line 163
    const/4 v7, 0x0

    .line 164
    const/4 v8, 0x0

    .line 165
    const/4 v9, 0x0

    .line 166
    const/4 v10, 0x0

    .line 167
    const/4 v11, 0x0

    .line 168
    const/4 v12, 0x0

    .line 169
    const/4 v13, 0x0

    .line 170
    const/4 v14, 0x0

    .line 171
    const/4 v15, 0x0

    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    const/16 v18, 0x0

    .line 177
    .line 178
    const/16 v19, 0x0

    .line 179
    .line 180
    const/16 v20, 0x0

    .line 181
    .line 182
    const/16 v21, 0x0

    .line 183
    .line 184
    const/16 v22, 0x0

    .line 185
    .line 186
    invoke-static/range {v2 .. v24}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_7

    .line 195
    .line 196
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    :goto_4
    return-object v4

    .line 199
    :pswitch_1
    iget-boolean v0, v0, La/wl7;->j:Z

    .line 200
    .line 201
    sget-object v1, La/wne;->a:La/wne;

    .line 202
    .line 203
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 207
    .line 208
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, La/jk7;

    .line 213
    .line 214
    iget-boolean v2, v2, La/jk7;->v:Z

    .line 215
    .line 216
    if-eqz v2, :cond_8

    .line 217
    .line 218
    if-nez v0, :cond_c

    .line 219
    .line 220
    :cond_8
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    check-cast v2, La/jk7;

    .line 225
    .line 226
    iget-object v2, v2, La/jk7;->j:Ljava/util/List;

    .line 227
    .line 228
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_c

    .line 233
    .line 234
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, La/jk7;

    .line 239
    .line 240
    iget-boolean v2, v2, La/jk7;->v:Z

    .line 241
    .line 242
    if-eqz v2, :cond_a

    .line 243
    .line 244
    if-nez v0, :cond_a

    .line 245
    .line 246
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 247
    .line 248
    :cond_9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-object v4, v3

    .line 256
    check-cast v4, La/jk7;

    .line 257
    .line 258
    const/16 v25, 0x0

    .line 259
    .line 260
    const v26, 0x1fffffc

    .line 261
    .line 262
    .line 263
    const/4 v5, 0x0

    .line 264
    const/4 v6, 0x1

    .line 265
    const-wide/16 v7, 0x0

    .line 266
    .line 267
    const/4 v9, 0x0

    .line 268
    const/4 v10, 0x0

    .line 269
    const/4 v11, 0x0

    .line 270
    const/4 v12, 0x0

    .line 271
    const/4 v13, 0x0

    .line 272
    const/4 v14, 0x0

    .line 273
    const/4 v15, 0x0

    .line 274
    const/16 v16, 0x0

    .line 275
    .line 276
    const/16 v17, 0x0

    .line 277
    .line 278
    const/16 v18, 0x0

    .line 279
    .line 280
    const/16 v19, 0x0

    .line 281
    .line 282
    const/16 v20, 0x0

    .line 283
    .line 284
    const/16 v21, 0x0

    .line 285
    .line 286
    const/16 v22, 0x0

    .line 287
    .line 288
    const/16 v23, 0x0

    .line 289
    .line 290
    const/16 v24, 0x0

    .line 291
    .line 292
    invoke-static/range {v4 .. v26}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_9

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_a
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    check-cast v2, La/jk7;

    .line 308
    .line 309
    iget-boolean v2, v2, La/jk7;->v:Z

    .line 310
    .line 311
    if-nez v2, :cond_c

    .line 312
    .line 313
    if-eqz v0, :cond_c

    .line 314
    .line 315
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 316
    .line 317
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-object v6, v3

    .line 325
    check-cast v6, La/jk7;

    .line 326
    .line 327
    const/16 v27, 0x0

    .line 328
    .line 329
    const v28, 0x1fffffe

    .line 330
    .line 331
    .line 332
    const/4 v7, 0x1

    .line 333
    const/4 v8, 0x0

    .line 334
    const-wide/16 v9, 0x0

    .line 335
    .line 336
    const/4 v11, 0x0

    .line 337
    const/4 v12, 0x0

    .line 338
    const/4 v13, 0x0

    .line 339
    const/4 v14, 0x0

    .line 340
    const/4 v15, 0x0

    .line 341
    const/16 v16, 0x0

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    const/16 v18, 0x0

    .line 346
    .line 347
    const/16 v19, 0x0

    .line 348
    .line 349
    const/16 v20, 0x0

    .line 350
    .line 351
    const/16 v21, 0x0

    .line 352
    .line 353
    const/16 v22, 0x0

    .line 354
    .line 355
    const/16 v23, 0x0

    .line 356
    .line 357
    const/16 v24, 0x0

    .line 358
    .line 359
    const/16 v25, 0x0

    .line 360
    .line 361
    const/16 v26, 0x0

    .line 362
    .line 363
    invoke-static/range {v6 .. v28}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    if-eqz v3, :cond_b

    .line 372
    .line 373
    iget-object v2, v5, La/fm7;->l0:La/bby;

    .line 374
    .line 375
    invoke-static {v2}, La/e3c;->n(La/bby;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5}, La/fm7;->O()V

    .line 379
    .line 380
    .line 381
    :cond_c
    :goto_5
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 382
    .line 383
    :goto_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-object v5, v2

    .line 391
    check-cast v5, La/jk7;

    .line 392
    .line 393
    const/16 v26, 0x0

    .line 394
    .line 395
    const v27, 0x1dfffff

    .line 396
    .line 397
    .line 398
    const/4 v6, 0x0

    .line 399
    const/4 v7, 0x0

    .line 400
    const-wide/16 v8, 0x0

    .line 401
    .line 402
    const/4 v10, 0x0

    .line 403
    const/4 v11, 0x0

    .line 404
    const/4 v12, 0x0

    .line 405
    const/4 v13, 0x0

    .line 406
    const/4 v14, 0x0

    .line 407
    const/4 v15, 0x0

    .line 408
    const/16 v16, 0x0

    .line 409
    .line 410
    const/16 v17, 0x0

    .line 411
    .line 412
    const/16 v18, 0x0

    .line 413
    .line 414
    const/16 v19, 0x0

    .line 415
    .line 416
    const/16 v20, 0x0

    .line 417
    .line 418
    const/16 v21, 0x0

    .line 419
    .line 420
    const/16 v22, 0x0

    .line 421
    .line 422
    const/16 v23, 0x0

    .line 423
    .line 424
    const/16 v25, 0x0

    .line 425
    .line 426
    move/from16 v24, v0

    .line 427
    .line 428
    invoke-static/range {v5 .. v27}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_d

    .line 437
    .line 438
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object v0

    .line 441
    :cond_d
    move/from16 v0, v24

    .line 442
    .line 443
    goto :goto_6

    .line 444
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 445
    .line 446
    iget-boolean v6, v0, La/wl7;->j:Z

    .line 447
    .line 448
    if-eqz v6, :cond_f

    .line 449
    .line 450
    if-ne v6, v3, :cond_e

    .line 451
    .line 452
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    goto :goto_7

    .line 456
    :cond_e
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    iput-boolean v3, v0, La/wl7;->j:Z

    .line 464
    .line 465
    sget v2, La/fm7;->p0:I

    .line 466
    .line 467
    invoke-virtual {v5, v0}, La/fm7;->M(La/zje;)Ljava/io/Serializable;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    if-ne v0, v1, :cond_10

    .line 472
    .line 473
    move-object v4, v1

    .line 474
    goto :goto_8

    .line 475
    :cond_10
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    :goto_8
    return-object v4

    .line 478
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 479
    .line 480
    iget-boolean v6, v0, La/wl7;->j:Z

    .line 481
    .line 482
    if-eqz v6, :cond_12

    .line 483
    .line 484
    if-ne v6, v3, :cond_11

    .line 485
    .line 486
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    move-object/from16 v0, p1

    .line 490
    .line 491
    goto :goto_9

    .line 492
    :cond_11
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    iput-boolean v3, v0, La/wl7;->j:Z

    .line 500
    .line 501
    sget v2, La/fm7;->p0:I

    .line 502
    .line 503
    invoke-virtual {v5, v0}, La/fm7;->N(La/zje;)Ljava/io/Serializable;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    if-ne v0, v1, :cond_13

    .line 508
    .line 509
    move-object v4, v1

    .line 510
    goto :goto_a

    .line 511
    :cond_13
    :goto_9
    move-object v12, v0

    .line 512
    check-cast v12, La/ql5;

    .line 513
    .line 514
    sget v0, La/fm7;->p0:I

    .line 515
    .line 516
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 517
    .line 518
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 519
    .line 520
    :cond_14
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    move-object v6, v1

    .line 528
    check-cast v6, La/jk7;

    .line 529
    .line 530
    const/16 v27, 0x0

    .line 531
    .line 532
    const v28, 0x1ffffdf

    .line 533
    .line 534
    .line 535
    const/4 v7, 0x0

    .line 536
    const/4 v8, 0x0

    .line 537
    const-wide/16 v9, 0x0

    .line 538
    .line 539
    const/4 v11, 0x0

    .line 540
    const/4 v13, 0x0

    .line 541
    const/4 v14, 0x0

    .line 542
    const/4 v15, 0x0

    .line 543
    const/16 v16, 0x0

    .line 544
    .line 545
    const/16 v17, 0x0

    .line 546
    .line 547
    const/16 v18, 0x0

    .line 548
    .line 549
    const/16 v19, 0x0

    .line 550
    .line 551
    const/16 v20, 0x0

    .line 552
    .line 553
    const/16 v21, 0x0

    .line 554
    .line 555
    const/16 v22, 0x0

    .line 556
    .line 557
    const/16 v23, 0x0

    .line 558
    .line 559
    const/16 v24, 0x0

    .line 560
    .line 561
    const/16 v25, 0x0

    .line 562
    .line 563
    const/16 v26, 0x0

    .line 564
    .line 565
    invoke-static/range {v6 .. v28}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-eqz v1, :cond_14

    .line 574
    .line 575
    invoke-virtual {v5}, La/fm7;->O()V

    .line 576
    .line 577
    .line 578
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 579
    .line 580
    .line 581
    move-result-object v6

    .line 582
    iget-object v0, v5, La/fm7;->p:La/mne;

    .line 583
    .line 584
    iget-object v9, v0, La/mne;->b:La/dvj;

    .line 585
    .line 586
    new-instance v10, La/b04;

    .line 587
    .line 588
    const/4 v0, 0x2

    .line 589
    invoke-direct {v10, v0, v4, v0}, La/b04;-><init>(ILa/yje;B)V

    .line 590
    .line 591
    .line 592
    const/16 v11, 0xb

    .line 593
    .line 594
    const/4 v7, 0x0

    .line 595
    const/4 v8, 0x0

    .line 596
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    iput-object v0, v5, La/fm7;->m0:La/bby;

    .line 601
    .line 602
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    :goto_a
    return-object v4

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
