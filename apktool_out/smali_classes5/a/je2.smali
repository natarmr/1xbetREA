.class public final La/je2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:Z

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/f47;La/z470;ZLjava/lang/String;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/je2;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/je2;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/je2;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, La/je2;->k:Z

    .line 9
    .line 10
    iput-object p4, p0, La/je2;->n:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/le2;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/je2;->i:B

    .line 16
    iput-object p1, p0, La/je2;->n:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/je2;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/je2;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/je2;

    .line 9
    .line 10
    iget-object v0, p0, La/je2;->l:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, La/f47;

    .line 14
    .line 15
    iget-object v0, p0, La/je2;->m:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, La/z470;

    .line 19
    .line 20
    iget-boolean v5, p0, La/je2;->k:Z

    .line 21
    .line 22
    move-object v6, v1

    .line 23
    check-cast v6, Ljava/lang/String;

    .line 24
    .line 25
    move-object v7, p1

    .line 26
    invoke-direct/range {v2 .. v7}, La/je2;-><init>(La/f47;La/z470;ZLjava/lang/String;La/yje;)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_0
    move-object v7, p1

    .line 31
    new-instance p0, La/je2;

    .line 32
    .line 33
    check-cast v1, La/le2;

    .line 34
    .line 35
    invoke-direct {p0, v1, v7}, La/je2;-><init>(La/le2;La/yje;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/je2;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/je2;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/je2;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/je2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/je2;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/je2;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/je2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/je2;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/je2;->n:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/je2;->l:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v8, v1

    .line 17
    check-cast v8, La/f47;

    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v7, v0, La/je2;->j:B

    .line 22
    .line 23
    if-eqz v7, :cond_2

    .line 24
    .line 25
    if-eq v7, v4, :cond_1

    .line 26
    .line 27
    if-ne v7, v5, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    goto :goto_4

    .line 38
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object/from16 v3, p1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v8, La/f47;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, La/p4u;

    .line 50
    .line 51
    iput-byte v4, v0, La/je2;->j:B

    .line 52
    .line 53
    invoke-virtual {v3, v0}, La/p4u;->e(La/zje;)Ljava/io/Serializable;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-ne v3, v1, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :goto_0
    check-cast v3, Ljava/util/List;

    .line 61
    .line 62
    iget-object v4, v0, La/je2;->m:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, La/z470;

    .line 65
    .line 66
    iget-boolean v11, v0, La/je2;->k:Z

    .line 67
    .line 68
    move-object v12, v2

    .line 69
    check-cast v12, Ljava/lang/String;

    .line 70
    .line 71
    iput-byte v5, v0, La/je2;->j:B

    .line 72
    .line 73
    sget v0, La/f47;->t:I

    .line 74
    .line 75
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    sget-object v0, La/dw60;->a:La/dw60;

    .line 82
    .line 83
    invoke-virtual {v8, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-static {v4}, La/x1x;->D(La/a570;)J

    .line 90
    .line 91
    .line 92
    move-result-wide v9

    .line 93
    iget-object v0, v8, La/f47;->n:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, La/oeg0;

    .line 96
    .line 97
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v7, La/q71;

    .line 102
    .line 103
    invoke-direct/range {v7 .. v12}, La/q71;-><init>(La/f47;JZLjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v7}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 107
    .line 108
    .line 109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_1
    if-ne v0, v1, :cond_5

    .line 112
    .line 113
    :goto_2
    move-object v6, v1

    .line 114
    goto :goto_4

    .line 115
    :cond_5
    :goto_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_4
    return-object v6

    .line 118
    :pswitch_0
    check-cast v2, La/le2;

    .line 119
    .line 120
    sget-object v1, La/wne;->a:La/wne;

    .line 121
    .line 122
    iget-byte v7, v0, La/je2;->j:B

    .line 123
    .line 124
    if-eqz v7, :cond_8

    .line 125
    .line 126
    if-eq v7, v4, :cond_7

    .line 127
    .line 128
    if-ne v7, v5, :cond_6

    .line 129
    .line 130
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_a

    .line 134
    .line 135
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 v6, 0x0

    .line 139
    goto/16 :goto_b

    .line 140
    .line 141
    :cond_7
    iget-boolean v3, v0, La/je2;->k:Z

    .line 142
    .line 143
    iget-object v4, v0, La/je2;->m:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Ljava/util/List;

    .line 146
    .line 147
    iget-object v7, v0, La/je2;->l:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v7, La/sff0;

    .line 150
    .line 151
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move v15, v3

    .line 155
    move-object v13, v4

    .line 156
    move-object/from16 v4, p1

    .line 157
    .line 158
    :goto_5
    move-object v3, v7

    .line 159
    goto :goto_6

    .line 160
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object v3, v2, La/le2;->y:La/pru;

    .line 164
    .line 165
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    iget-object v3, v2, La/le2;->q:La/luu;

    .line 170
    .line 171
    iget-object v3, v3, La/luu;->a:La/nok0;

    .line 172
    .line 173
    invoke-virtual {v3}, La/nok0;->a()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    iget-object v8, v2, La/le2;->z:La/lbu;

    .line 178
    .line 179
    invoke-virtual {v8}, La/lbu;->j()Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    iget-object v9, v2, La/le2;->v:La/j3c;

    .line 184
    .line 185
    iput-object v7, v0, La/je2;->l:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v3, v0, La/je2;->m:Ljava/lang/Object;

    .line 188
    .line 189
    iput-boolean v8, v0, La/je2;->k:Z

    .line 190
    .line 191
    iput-byte v4, v0, La/je2;->j:B

    .line 192
    .line 193
    invoke-virtual {v9, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    if-ne v4, v1, :cond_9

    .line 198
    .line 199
    goto/16 :goto_9

    .line 200
    .line 201
    :cond_9
    move-object v13, v3

    .line 202
    move v15, v8

    .line 203
    goto :goto_5

    .line 204
    :goto_6
    move-object v14, v4

    .line 205
    check-cast v14, La/wcb;

    .line 206
    .line 207
    iget-object v4, v2, La/le2;->A:La/bzt;

    .line 208
    .line 209
    iget-object v4, v4, La/bzt;->a:La/fsd;

    .line 210
    .line 211
    invoke-virtual {v4}, La/fsd;->a()La/v8d;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    iget v11, v4, La/v8d;->r:I

    .line 216
    .line 217
    iget-object v4, v2, La/le2;->o:La/vzg0;

    .line 218
    .line 219
    const-string v7, "KEY_SEARCH_QUERY"

    .line 220
    .line 221
    invoke-virtual {v4, v7}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Ljava/lang/String;

    .line 226
    .line 227
    const-string v7, ""

    .line 228
    .line 229
    if-nez v4, :cond_a

    .line 230
    .line 231
    move-object v8, v7

    .line 232
    goto :goto_7

    .line 233
    :cond_a
    move-object v8, v4

    .line 234
    :goto_7
    iget-object v4, v2, La/i3t0;->i:La/ocj;

    .line 235
    .line 236
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 237
    .line 238
    :goto_8
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-object v10, v7

    .line 246
    move-object v7, v9

    .line 247
    check-cast v7, La/ce2;

    .line 248
    .line 249
    iget-boolean v12, v3, La/sff0;->J:Z

    .line 250
    .line 251
    move/from16 v16, v12

    .line 252
    .line 253
    const/4 v12, 0x0

    .line 254
    const/16 v17, 0x22be

    .line 255
    .line 256
    move-object/from16 v18, v9

    .line 257
    .line 258
    const/4 v9, 0x0

    .line 259
    move-object/from16 v19, v10

    .line 260
    .line 261
    const/4 v10, 0x0

    .line 262
    move-object/from16 v5, v18

    .line 263
    .line 264
    move-object/from16 v6, v19

    .line 265
    .line 266
    invoke-static/range {v7 .. v17}, La/ce2;->a(La/ce2;Ljava/lang/String;ZLa/hie;IZLjava/util/List;La/wcb;ZZI)La/ce2;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-virtual {v4, v5, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    if-eqz v5, :cond_c

    .line 275
    .line 276
    iget-object v2, v2, La/le2;->x:La/hjd;

    .line 277
    .line 278
    new-instance v3, La/cid;

    .line 279
    .line 280
    new-instance v4, La/or2;

    .line 281
    .line 282
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-direct {v3, v6, v4}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 286
    .line 287
    .line 288
    const/4 v5, 0x0

    .line 289
    iput-object v5, v0, La/je2;->l:Ljava/lang/Object;

    .line 290
    .line 291
    iput-object v5, v0, La/je2;->m:Ljava/lang/Object;

    .line 292
    .line 293
    iput-boolean v15, v0, La/je2;->k:Z

    .line 294
    .line 295
    const/4 v7, 0x2

    .line 296
    iput-byte v7, v0, La/je2;->j:B

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v3, v0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    if-ne v0, v1, :cond_b

    .line 306
    .line 307
    :goto_9
    move-object v6, v1

    .line 308
    goto :goto_b

    .line 309
    :cond_b
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    :goto_b
    return-object v6

    .line 312
    :cond_c
    move-object v7, v6

    .line 313
    const/4 v5, 0x2

    .line 314
    goto :goto_8

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
