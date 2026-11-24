.class public final La/k29;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/s29;


# direct methods
.method public synthetic constructor <init>(La/s29;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k29;->i:B

    iput-object p1, p0, La/k29;->k:La/s29;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k29;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k29;->k:La/s29;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/k29;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/k29;-><init>(La/s29;La/yje;B)V

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
    iput-boolean p0, v0, La/k29;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/k29;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/k29;-><init>(La/s29;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/k29;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/k29;-><init>(La/s29;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/k29;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/k29;-><init>(La/s29;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    nop

    .line 45
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
    iget-byte v0, p0, La/k29;->i:B

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
    invoke-virtual {p0, p1, p2}, La/k29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/k29;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/k29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/k29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/k29;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/k29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/k29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/k29;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/k29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/k29;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/k29;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/k29;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k29;->i:B

    .line 4
    .line 5
    const-string v2, "screen"

    .line 6
    .line 7
    const-string v3, "provbrand"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v8, v0, La/k29;->k:La/s29;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-boolean v0, v0, La/k29;->j:Z

    .line 20
    .line 21
    sget-object v1, La/wne;->a:La/wne;

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    sget-object v0, La/s29;->Y:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v8, v7, v7}, La/s29;->P(ZZ)V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 37
    .line 38
    iget-boolean v2, v0, La/k29;->j:Z

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    if-ne v2, v6, :cond_1

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object/from16 v0, p1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v2, La/s29;->Y:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v2, v8, La/i3t0;->i:La/ocj;

    .line 61
    .line 62
    iget-object v9, v2, La/ocj;->a:La/p7m0;

    .line 63
    .line 64
    :cond_3
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-object v10, v2

    .line 72
    check-cast v10, La/x19;

    .line 73
    .line 74
    const/16 v16, 0x0

    .line 75
    .line 76
    const/16 v17, 0xff

    .line 77
    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    const/4 v15, 0x0

    .line 83
    invoke-static/range {v10 .. v17}, La/x19;->a(La/x19;La/w19;La/u19;La/v19;ZLa/ql5;La/uzb0;I)La/x19;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v9, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    iget-object v10, v8, La/s29;->D:La/wti;

    .line 94
    .line 95
    sget-object v2, La/uzb0;->a:La/uzb0;

    .line 96
    .line 97
    invoke-static {v2}, La/r7x;->B(La/uzb0;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    iget-wide v2, v8, La/s29;->p:J

    .line 102
    .line 103
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v16

    .line 107
    iget-object v2, v8, La/s29;->M:La/sff0;

    .line 108
    .line 109
    iget-object v2, v2, La/sff0;->b:La/hl1;

    .line 110
    .line 111
    iget-object v2, v2, La/hl1;->a:La/f61;

    .line 112
    .line 113
    iget-boolean v2, v2, La/f61;->k:Z

    .line 114
    .line 115
    sget-object v3, La/uaq0;->a:La/s9m0;

    .line 116
    .line 117
    iget-object v4, v8, La/s29;->C:La/wyu;

    .line 118
    .line 119
    invoke-static {v4, v3}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    xor-int/lit8 v18, v3, 0x1

    .line 124
    .line 125
    const/16 v19, 0x0

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const-wide/16 v11, 0x0

    .line 130
    .line 131
    const-string v14, ""

    .line 132
    .line 133
    const/4 v15, 0x1

    .line 134
    move/from16 v17, v2

    .line 135
    .line 136
    invoke-virtual/range {v10 .. v20}, La/wti;->j(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZZZ)La/gmq;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iput-boolean v6, v0, La/k29;->j:Z

    .line 141
    .line 142
    invoke-static {v2, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-ne v0, v1, :cond_4

    .line 147
    .line 148
    move-object v4, v1

    .line 149
    goto :goto_2

    .line 150
    :cond_4
    :goto_0
    check-cast v0, Ljava/util/List;

    .line 151
    .line 152
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, La/s5d0;

    .line 157
    .line 158
    if-nez v0, :cond_5

    .line 159
    .line 160
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    iget-boolean v1, v8, La/s29;->q:Z

    .line 164
    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    invoke-virtual {v8, v0}, La/s29;->Q(La/s5d0;)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_6
    iget-object v1, v8, La/s29;->K:La/i1w0;

    .line 172
    .line 173
    new-instance v2, La/op7;

    .line 174
    .line 175
    const/16 v3, 0xf

    .line 176
    .line 177
    invoke-direct {v2, v8, v0, v3}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 181
    .line 182
    .line 183
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    :goto_2
    return-object v4

    .line 186
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 187
    .line 188
    iget-boolean v9, v0, La/k29;->j:Z

    .line 189
    .line 190
    if-eqz v9, :cond_8

    .line 191
    .line 192
    if-ne v9, v6, :cond_7

    .line 193
    .line 194
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iget-object v4, v8, La/s29;->x:La/u58;

    .line 206
    .line 207
    iget-object v4, v4, La/u58;->a:La/kt2;

    .line 208
    .line 209
    const-string v5, "reg_page_call"

    .line 210
    .line 211
    invoke-static {v2, v3, v4, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v2, v8, La/s29;->B:La/au0;

    .line 215
    .line 216
    iget-object v4, v8, La/s29;->L:La/cmt;

    .line 217
    .line 218
    invoke-virtual {v4}, La/cmt;->g()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    iget-object v2, v2, La/au0;->a:La/s1p;

    .line 225
    .line 226
    const-wide/16 v4, 0xbcc

    .line 227
    .line 228
    invoke-static {v3, v2, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 229
    .line 230
    .line 231
    iget-object v2, v8, La/s29;->G:La/ytt;

    .line 232
    .line 233
    sget-object v3, La/aue0;->d:La/aue0;

    .line 234
    .line 235
    iput-boolean v6, v0, La/k29;->j:Z

    .line 236
    .line 237
    invoke-virtual {v2, v3, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    if-ne v0, v1, :cond_9

    .line 242
    .line 243
    move-object v4, v1

    .line 244
    goto :goto_5

    .line 245
    :cond_9
    :goto_3
    iget-object v0, v8, La/s29;->s:La/oeg0;

    .line 246
    .line 247
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    new-instance v2, La/c8d;

    .line 256
    .line 257
    sget-object v3, La/y7d;->a:La/v7d;

    .line 258
    .line 259
    sget-object v4, La/o0w0;->a:La/o0w0;

    .line 260
    .line 261
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v1, v2, v2, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v1, v7}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    :goto_4
    move-object v2, v1

    .line 273
    check-cast v2, La/paw;

    .line 274
    .line 275
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_a

    .line 280
    .line 281
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    check-cast v2, La/oe50;

    .line 286
    .line 287
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_a
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 292
    .line 293
    :goto_5
    return-object v4

    .line 294
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 295
    .line 296
    iget-boolean v9, v0, La/k29;->j:Z

    .line 297
    .line 298
    if-eqz v9, :cond_c

    .line 299
    .line 300
    if-ne v9, v6, :cond_b

    .line 301
    .line 302
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_b
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    iget-object v4, v8, La/s29;->x:La/u58;

    .line 314
    .line 315
    iget-object v4, v4, La/u58;->a:La/kt2;

    .line 316
    .line 317
    const-string v5, "login_page_call"

    .line 318
    .line 319
    invoke-static {v2, v3, v4, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    iget-object v2, v8, La/s29;->B:La/au0;

    .line 323
    .line 324
    iget-object v2, v2, La/au0;->a:La/s1p;

    .line 325
    .line 326
    const-wide/16 v4, 0xbdb

    .line 327
    .line 328
    invoke-static {v3, v2, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 329
    .line 330
    .line 331
    iget-object v2, v8, La/s29;->G:La/ytt;

    .line 332
    .line 333
    sget-object v3, La/aue0;->d:La/aue0;

    .line 334
    .line 335
    iput-boolean v6, v0, La/k29;->j:Z

    .line 336
    .line 337
    invoke-virtual {v2, v3, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-ne v0, v1, :cond_d

    .line 342
    .line 343
    move-object v4, v1

    .line 344
    goto :goto_8

    .line 345
    :cond_d
    :goto_6
    iget-object v0, v8, La/s29;->s:La/oeg0;

    .line 346
    .line 347
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    new-instance v2, La/c8d;

    .line 356
    .line 357
    sget-object v3, La/y7d;->a:La/v7d;

    .line 358
    .line 359
    sget-object v4, La/n0w0;->a:La/n0w0;

    .line 360
    .line 361
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v1, v2, v2, v0, v1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-virtual {v1, v7}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    :goto_7
    move-object v2, v1

    .line 373
    check-cast v2, La/paw;

    .line 374
    .line 375
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    if-eqz v3, :cond_e

    .line 380
    .line 381
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, La/oe50;

    .line 386
    .line 387
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 388
    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_e
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    :goto_8
    return-object v4

    .line 394
    nop

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
