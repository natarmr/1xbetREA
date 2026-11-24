.class public final La/rp6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/vp6;


# direct methods
.method public synthetic constructor <init>(La/vp6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rp6;->i:B

    iput-object p1, p0, La/rp6;->k:La/vp6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rp6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rp6;->k:La/vp6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/rp6;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/rp6;-><init>(La/vp6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/rp6;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/rp6;-><init>(La/vp6;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/rp6;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/rp6;-><init>(La/vp6;La/yje;B)V

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
    iput-boolean p0, v0, La/rp6;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance v0, La/rp6;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, p2, v1}, La/rp6;-><init>(La/vp6;La/yje;B)V

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
    iput-boolean p0, v0, La/rp6;->j:Z

    .line 50
    .line 51
    return-object v0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rp6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/rp6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rp6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rp6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/rp6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/rp6;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/rp6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/rp6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/rp6;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/rp6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/rp6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/rp6;

    .line 72
    .line 73
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/rp6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v1, v0, La/rp6;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/rp6;->k:La/vp6;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/rp6;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object v2, v5, La/vp6;->I:La/buo0;

    .line 34
    .line 35
    sget-object v3, La/hae0;->c:La/hae0;

    .line 36
    .line 37
    iput-boolean v4, v0, La/rp6;->j:Z

    .line 38
    .line 39
    invoke-virtual {v2, v3, v0}, La/buo0;->a(La/hae0;La/zje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v2, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v2

    .line 50
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 51
    .line 52
    iget-boolean v6, v0, La/rp6;->j:Z

    .line 53
    .line 54
    if-eqz v6, :cond_4

    .line 55
    .line 56
    if-ne v6, v4, :cond_3

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v5, La/vp6;->C:La/yk50;

    .line 71
    .line 72
    invoke-virtual {v2}, La/yk50;->g()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v3, 0x0

    .line 77
    if-eqz v2, :cond_6

    .line 78
    .line 79
    iget-object v2, v5, La/vp6;->F:La/vpu;

    .line 80
    .line 81
    iput-boolean v4, v0, La/rp6;->j:Z

    .line 82
    .line 83
    invoke-virtual {v2, v3, v0}, La/vpu;->b(ZLa/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-ne v0, v1, :cond_5

    .line 88
    .line 89
    move-object v2, v1

    .line 90
    goto :goto_5

    .line 91
    :cond_5
    :goto_2
    sget v0, La/vp6;->W:I

    .line 92
    .line 93
    sget-object v0, La/dp6;->a:La/dp6;

    .line 94
    .line 95
    invoke-virtual {v5, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_6
    iget-object v0, v5, La/vp6;->O:La/i1w0;

    .line 100
    .line 101
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v2, La/zo4;

    .line 106
    .line 107
    const/16 v4, 0x13

    .line 108
    .line 109
    invoke-direct {v2, v5, v4}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    new-instance v4, La/a1w0;

    .line 113
    .line 114
    invoke-direct {v4, v2}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 115
    .line 116
    .line 117
    new-instance v2, La/c8d;

    .line 118
    .line 119
    sget-object v6, La/y7d;->a:La/v7d;

    .line 120
    .line 121
    invoke-direct {v2, v6, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :goto_3
    move-object v2, v1

    .line 129
    check-cast v2, La/paw;

    .line 130
    .line 131
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_7

    .line 136
    .line 137
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, La/oe50;

    .line 142
    .line 143
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    :goto_4
    sget v0, La/vp6;->W:I

    .line 148
    .line 149
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 150
    .line 151
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 152
    .line 153
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-object v2, v0

    .line 161
    check-cast v2, La/jp6;

    .line 162
    .line 163
    const/16 v20, 0x0

    .line 164
    .line 165
    const v21, 0x1f7fff

    .line 166
    .line 167
    .line 168
    const/4 v3, 0x0

    .line 169
    const/4 v4, 0x0

    .line 170
    const/4 v5, 0x0

    .line 171
    const/4 v6, 0x0

    .line 172
    const/4 v7, 0x0

    .line 173
    const/4 v8, 0x0

    .line 174
    const/4 v9, 0x0

    .line 175
    const/4 v10, 0x0

    .line 176
    const/4 v11, 0x0

    .line 177
    const/4 v12, 0x0

    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    const/4 v15, 0x0

    .line 181
    const/16 v16, 0x0

    .line 182
    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    const/16 v18, 0x0

    .line 186
    .line 187
    const/16 v19, 0x0

    .line 188
    .line 189
    invoke-static/range {v2 .. v21}, La/jp6;->a(La/jp6;ZZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/LinkedHashSet;Ljava/util/List;ZLjava/util/Map;ZZZLa/jg7;ZLjava/lang/Long;ZI)La/jp6;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_5
    return-object v2

    .line 202
    :pswitch_1
    iget-boolean v0, v0, La/rp6;->j:Z

    .line 203
    .line 204
    sget-object v1, La/wne;->a:La/wne;

    .line 205
    .line 206
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    sget v1, La/vp6;->W:I

    .line 210
    .line 211
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 212
    .line 213
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 214
    .line 215
    :goto_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v3, v5, La/i3t0;->f:La/oyg0;

    .line 223
    .line 224
    move-object v6, v2

    .line 225
    check-cast v6, La/jp6;

    .line 226
    .line 227
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    const/16 v24, 0x0

    .line 231
    .line 232
    const v25, 0x1fdfff

    .line 233
    .line 234
    .line 235
    const/4 v7, 0x0

    .line 236
    const/4 v8, 0x0

    .line 237
    const/4 v9, 0x0

    .line 238
    const/4 v10, 0x0

    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v12, 0x0

    .line 241
    const/4 v13, 0x0

    .line 242
    const/4 v14, 0x0

    .line 243
    const/4 v15, 0x0

    .line 244
    const/16 v16, 0x0

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const/16 v18, 0x0

    .line 249
    .line 250
    const/16 v19, 0x0

    .line 251
    .line 252
    const/16 v21, 0x0

    .line 253
    .line 254
    const/16 v22, 0x0

    .line 255
    .line 256
    const/16 v23, 0x0

    .line 257
    .line 258
    move/from16 v20, v0

    .line 259
    .line 260
    invoke-static/range {v6 .. v25}, La/jp6;->a(La/jp6;ZZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/LinkedHashSet;Ljava/util/List;ZLjava/util/Map;ZZZLa/jg7;ZLjava/lang/Long;ZI)La/jp6;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_9

    .line 269
    .line 270
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object v0

    .line 273
    :cond_9
    move/from16 v0, v20

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :pswitch_2
    iget-boolean v0, v0, La/rp6;->j:Z

    .line 277
    .line 278
    sget-object v1, La/wne;->a:La/wne;

    .line 279
    .line 280
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 284
    .line 285
    if-eqz v0, :cond_a

    .line 286
    .line 287
    sget v2, La/vp6;->W:I

    .line 288
    .line 289
    invoke-virtual {v5}, La/vp6;->Q()V

    .line 290
    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_a
    iget-object v2, v5, La/vp6;->U:La/c4m0;

    .line 294
    .line 295
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    check-cast v2, La/jp6;

    .line 303
    .line 304
    iget-boolean v2, v2, La/jp6;->a:Z

    .line 305
    .line 306
    if-eqz v2, :cond_c

    .line 307
    .line 308
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 309
    .line 310
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-object v4, v3

    .line 318
    check-cast v4, La/jp6;

    .line 319
    .line 320
    const/16 v22, 0x0

    .line 321
    .line 322
    const v23, 0x1ffff8

    .line 323
    .line 324
    .line 325
    const/4 v5, 0x0

    .line 326
    const/4 v6, 0x1

    .line 327
    const/4 v7, 0x0

    .line 328
    const/4 v8, 0x0

    .line 329
    const/4 v9, 0x0

    .line 330
    const/4 v10, 0x0

    .line 331
    const/4 v11, 0x0

    .line 332
    const/4 v12, 0x0

    .line 333
    const/4 v13, 0x0

    .line 334
    const/4 v14, 0x0

    .line 335
    const/4 v15, 0x0

    .line 336
    const/16 v16, 0x0

    .line 337
    .line 338
    const/16 v17, 0x0

    .line 339
    .line 340
    const/16 v18, 0x0

    .line 341
    .line 342
    const/16 v19, 0x0

    .line 343
    .line 344
    const/16 v20, 0x0

    .line 345
    .line 346
    const/16 v21, 0x0

    .line 347
    .line 348
    invoke-static/range {v4 .. v23}, La/jp6;->a(La/jp6;ZZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/LinkedHashSet;Ljava/util/List;ZLjava/util/Map;ZZZLa/jg7;ZLjava/lang/Long;ZI)La/jp6;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-eqz v3, :cond_b

    .line 357
    .line 358
    :cond_c
    :goto_7
    sget v2, La/vp6;->W:I

    .line 359
    .line 360
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 361
    .line 362
    :goto_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    move-object v3, v1

    .line 370
    move-object v1, v2

    .line 371
    check-cast v1, La/jp6;

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    const v20, 0x1dffff

    .line 376
    .line 377
    .line 378
    move-object v4, v2

    .line 379
    const/4 v2, 0x0

    .line 380
    move-object v5, v3

    .line 381
    const/4 v3, 0x0

    .line 382
    move-object v6, v4

    .line 383
    const/4 v4, 0x0

    .line 384
    move-object v7, v5

    .line 385
    const/4 v5, 0x0

    .line 386
    move-object v8, v6

    .line 387
    const/4 v6, 0x0

    .line 388
    move-object v9, v7

    .line 389
    const/4 v7, 0x0

    .line 390
    move-object v10, v8

    .line 391
    const/4 v8, 0x0

    .line 392
    move-object v11, v9

    .line 393
    const/4 v9, 0x0

    .line 394
    move-object v12, v10

    .line 395
    const/4 v10, 0x0

    .line 396
    move-object v13, v11

    .line 397
    const/4 v11, 0x0

    .line 398
    move-object v14, v12

    .line 399
    const/4 v12, 0x0

    .line 400
    move-object v15, v13

    .line 401
    const/4 v13, 0x0

    .line 402
    move-object/from16 v16, v14

    .line 403
    .line 404
    const/4 v14, 0x0

    .line 405
    move-object/from16 v17, v15

    .line 406
    .line 407
    const/4 v15, 0x0

    .line 408
    move-object/from16 v19, v16

    .line 409
    .line 410
    const/16 v16, 0x0

    .line 411
    .line 412
    move-object/from16 v21, v17

    .line 413
    .line 414
    const/16 v17, 0x0

    .line 415
    .line 416
    move-object/from16 v26, v19

    .line 417
    .line 418
    move/from16 v19, v0

    .line 419
    .line 420
    move-object/from16 v0, v21

    .line 421
    .line 422
    invoke-static/range {v1 .. v20}, La/jp6;->a(La/jp6;ZZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/LinkedHashSet;Ljava/util/List;ZLjava/util/Map;ZZZLa/jg7;ZLjava/lang/Long;ZI)La/jp6;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    move-object/from16 v14, v26

    .line 427
    .line 428
    invoke-virtual {v0, v14, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-eqz v1, :cond_d

    .line 433
    .line 434
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :cond_d
    move-object v1, v0

    .line 438
    move/from16 v0, v19

    .line 439
    .line 440
    goto :goto_8

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
