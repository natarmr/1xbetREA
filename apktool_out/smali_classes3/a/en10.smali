.class public final La/en10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/pn10;


# direct methods
.method public synthetic constructor <init>(La/pn10;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/en10;->i:B

    iput-object p1, p0, La/en10;->k:La/pn10;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/en10;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/en10;->k:La/pn10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/en10;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/en10;-><init>(La/pn10;La/yje;B)V

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
    iput-boolean p0, v0, La/en10;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/en10;

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/en10;-><init>(La/pn10;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/en10;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/en10;-><init>(La/pn10;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/en10;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/en10;-><init>(La/pn10;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/en10;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/en10;-><init>(La/pn10;La/yje;B)V

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
    iget-byte v0, p0, La/en10;->i:B

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
    invoke-virtual {p0, p1, p2}, La/en10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/en10;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/en10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/en10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/en10;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/en10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/en10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/en10;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/en10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/en10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/en10;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/en10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/en10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/en10;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/en10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/en10;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/en10;->k:La/pn10;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, v0, La/en10;->j:Z

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-boolean v0, v5, La/pn10;->b0:Z

    .line 22
    .line 23
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v6, v2

    .line 35
    check-cast v6, La/tm10;

    .line 36
    .line 37
    const/16 v28, 0x0

    .line 38
    .line 39
    const v29, 0x3dffff

    .line 40
    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    const/16 v18, 0x0

    .line 56
    .line 57
    const-wide/16 v19, 0x0

    .line 58
    .line 59
    const/16 v21, 0x0

    .line 60
    .line 61
    const/16 v22, 0x0

    .line 62
    .line 63
    const/16 v23, 0x0

    .line 64
    .line 65
    const/16 v25, 0x0

    .line 66
    .line 67
    const/16 v26, 0x0

    .line 68
    .line 69
    const/16 v27, 0x0

    .line 70
    .line 71
    move/from16 v24, v0

    .line 72
    .line 73
    invoke-static/range {v6 .. v29}, La/tm10;->a(La/tm10;La/io10;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/esr;La/esr;ZLa/jo10;Ljava/lang/String;ZLjava/lang/String;ZJZLa/ho10;Ljava/util/List;ZZZLa/csr;La/ko10;I)La/tm10;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    if-eqz v24, :cond_0

    .line 84
    .line 85
    iget-object v0, v5, La/pn10;->U:La/x9v0;

    .line 86
    .line 87
    if-nez v0, :cond_0

    .line 88
    .line 89
    sget-object v0, La/jo10;->a:La/jo10;

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    invoke-virtual {v5, v0, v1, v1}, La/pn10;->Q(La/jo10;ZZ)V

    .line 93
    .line 94
    .line 95
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_1
    move/from16 v0, v24

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 102
    .line 103
    iget-boolean v6, v0, La/en10;->j:Z

    .line 104
    .line 105
    if-eqz v6, :cond_3

    .line 106
    .line 107
    if-ne v6, v4, :cond_2

    .line 108
    .line 109
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iput-boolean v4, v0, La/en10;->j:Z

    .line 121
    .line 122
    sget v2, La/pn10;->e0:I

    .line 123
    .line 124
    invoke-virtual {v5, v4, v0}, La/pn10;->P(ZLa/zje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v1, :cond_4

    .line 129
    .line 130
    move-object v2, v1

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    :goto_2
    return-object v2

    .line 135
    :pswitch_1
    iget-object v1, v5, La/pn10;->C:La/wsf0;

    .line 136
    .line 137
    sget-object v6, La/wne;->a:La/wne;

    .line 138
    .line 139
    iget-boolean v7, v0, La/en10;->j:Z

    .line 140
    .line 141
    if-eqz v7, :cond_6

    .line 142
    .line 143
    if-ne v7, v4, :cond_5

    .line 144
    .line 145
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v0, p1

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object v2, v5, La/pn10;->E:La/hs60;

    .line 159
    .line 160
    sget-object v3, La/s470;->p:La/s470;

    .line 161
    .line 162
    invoke-virtual {v3}, La/s470;->a()J

    .line 163
    .line 164
    .line 165
    move-result-wide v7

    .line 166
    sget-object v9, La/zn60;->b:La/zn60;

    .line 167
    .line 168
    invoke-virtual {v2, v7, v8}, La/hs60;->b(J)V

    .line 169
    .line 170
    .line 171
    iget-object v2, v5, La/pn10;->M:La/l7k;

    .line 172
    .line 173
    invoke-virtual {v3}, La/s470;->a()J

    .line 174
    .line 175
    .line 176
    move-result-wide v7

    .line 177
    long-to-int v3, v7

    .line 178
    sget-object v7, La/y1p;->b:La/y1p;

    .line 179
    .line 180
    iget-object v7, v5, La/pn10;->N:La/cmt;

    .line 181
    .line 182
    invoke-virtual {v7}, La/cmt;->g()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    const-string v8, "games"

    .line 187
    .line 188
    invoke-virtual {v2, v3, v8, v7}, La/l7k;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    iget-object v2, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v2, La/g45;

    .line 194
    .line 195
    invoke-virtual {v2}, La/g45;->G()La/khf0;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    sget-object v3, La/bm5;->d:La/bm5;

    .line 200
    .line 201
    iput-boolean v4, v0, La/en10;->j:Z

    .line 202
    .line 203
    sget-object v7, La/tl5;->c:La/tl5;

    .line 204
    .line 205
    invoke-virtual {v2, v3, v7, v0}, La/khf0;->A(La/bm5;La/tl5;La/yje;)Ljava/io/Serializable;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-ne v0, v6, :cond_7

    .line 210
    .line 211
    move-object v2, v6

    .line 212
    goto :goto_4

    .line 213
    :cond_7
    :goto_3
    check-cast v0, La/ql5;

    .line 214
    .line 215
    invoke-virtual {v1}, La/wsf0;->s()La/trm0;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    sget-object v2, La/bm5;->d:La/bm5;

    .line 220
    .line 221
    invoke-virtual {v1, v2, v0}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v5, La/pn10;->L:La/v88;

    .line 225
    .line 226
    iget-object v2, v5, La/pn10;->o:La/i1w0;

    .line 227
    .line 228
    iget-wide v5, v0, La/ql5;->a:J

    .line 229
    .line 230
    invoke-virtual {v1, v2, v4, v5, v6}, La/v88;->a(La/i1w0;ZJ)V

    .line 231
    .line 232
    .line 233
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    :goto_4
    return-object v2

    .line 236
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 237
    .line 238
    iget-boolean v6, v0, La/en10;->j:Z

    .line 239
    .line 240
    if-eqz v6, :cond_9

    .line 241
    .line 242
    if-ne v6, v4, :cond_8

    .line 243
    .line 244
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iget-object v2, v5, La/pn10;->K:La/qa60;

    .line 256
    .line 257
    invoke-virtual {v2}, La/qa60;->a()La/vae0;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    new-instance v3, La/kg10;

    .line 262
    .line 263
    const/16 v6, 0x11

    .line 264
    .line 265
    invoke-direct {v3, v5, v6}, La/kg10;-><init>(Ljava/lang/Object;B)V

    .line 266
    .line 267
    .line 268
    iput-boolean v4, v0, La/en10;->j:Z

    .line 269
    .line 270
    iget-object v2, v2, La/vae0;->a:La/noj0;

    .line 271
    .line 272
    invoke-interface {v2, v3, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    if-ne v0, v1, :cond_a

    .line 277
    .line 278
    move-object v2, v1

    .line 279
    goto :goto_6

    .line 280
    :cond_a
    :goto_5
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    :goto_6
    return-object v2

    .line 283
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 284
    .line 285
    iget-boolean v6, v0, La/en10;->j:Z

    .line 286
    .line 287
    if-eqz v6, :cond_c

    .line 288
    .line 289
    if-ne v6, v4, :cond_b

    .line 290
    .line 291
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_b
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    iput-boolean v4, v0, La/en10;->j:Z

    .line 303
    .line 304
    sget v2, La/pn10;->e0:I

    .line 305
    .line 306
    invoke-virtual {v5, v4, v0}, La/pn10;->P(ZLa/zje;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-ne v0, v1, :cond_d

    .line 311
    .line 312
    move-object v2, v1

    .line 313
    goto :goto_8

    .line 314
    :cond_d
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    :goto_8
    return-object v2

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
