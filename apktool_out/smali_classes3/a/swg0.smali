.class public final La/swg0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cxg0;


# direct methods
.method public synthetic constructor <init>(La/cxg0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/swg0;->i:B

    iput-object p1, p0, La/swg0;->k:La/cxg0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/swg0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/swg0;->k:La/cxg0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/swg0;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/swg0;-><init>(La/cxg0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/swg0;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/swg0;-><init>(La/cxg0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/swg0;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/swg0;-><init>(La/cxg0;La/yje;B)V

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
    iput-boolean p0, v0, La/swg0;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance p1, La/swg0;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/swg0;-><init>(La/cxg0;La/yje;B)V

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
    iget-byte v0, p0, La/swg0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/swg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/swg0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/swg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/swg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/swg0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/swg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/swg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/swg0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/swg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/swg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/swg0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/swg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/swg0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/swg0;->k:La/cxg0;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v2, v0, La/swg0;->j:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v5, La/cxg0;->d:La/wwv;

    .line 35
    .line 36
    new-instance v6, La/ctx;

    .line 37
    .line 38
    iget-object v8, v5, La/cxg0;->l:La/n3w;

    .line 39
    .line 40
    iget-wide v9, v5, La/cxg0;->n:J

    .line 41
    .line 42
    iget-object v11, v8, La/n3w;->g:Ljava/lang/String;

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    invoke-direct/range {v6 .. v11}, La/ctx;-><init>(ZLa/n3w;JLjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-boolean v4, v0, La/swg0;->j:Z

    .line 49
    .line 50
    invoke-virtual {v2, v6, v0}, La/wwv;->a(La/ctx;La/bnn0;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-ne v0, v1, :cond_2

    .line 55
    .line 56
    move-object v6, v1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    :goto_1
    return-object v6

    .line 61
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 62
    .line 63
    iget-boolean v2, v0, La/swg0;->j:Z

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    if-ne v2, v4, :cond_3

    .line 68
    .line 69
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-boolean v4, v0, La/swg0;->j:Z

    .line 81
    .line 82
    const-wide/16 v2, 0xc8

    .line 83
    .line 84
    invoke-static {v2, v3, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-ne v0, v1, :cond_5

    .line 89
    .line 90
    move-object v6, v1

    .line 91
    goto :goto_3

    .line 92
    :cond_5
    :goto_2
    iget-object v0, v5, La/cxg0;->z:La/p7m0;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v1, La/pwg0;->a:La/pwg0;

    .line 98
    .line 99
    invoke-virtual {v0, v6, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    :goto_3
    return-object v6

    .line 105
    :pswitch_1
    iget-boolean v0, v0, La/swg0;->j:Z

    .line 106
    .line 107
    sget-object v1, La/wne;->a:La/wne;

    .line 108
    .line 109
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v5, La/cxg0;->y:La/p7m0;

    .line 113
    .line 114
    :goto_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    move-object v7, v3

    .line 119
    check-cast v7, La/m9h0;

    .line 120
    .line 121
    const/16 v19, 0x0

    .line 122
    .line 123
    const/16 v20, 0x1dff

    .line 124
    .line 125
    const/4 v8, 0x0

    .line 126
    const/4 v9, 0x0

    .line 127
    const/4 v10, 0x0

    .line 128
    const/4 v11, 0x0

    .line 129
    const/4 v12, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v14, 0x0

    .line 132
    const/4 v15, 0x0

    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    .line 137
    move/from16 v16, v0

    .line 138
    .line 139
    invoke-static/range {v7 .. v20}, La/m9h0;->a(La/m9h0;La/jug0;IIIZZZZZLjava/lang/String;La/hje;II)La/m9h0;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    move/from16 v7, v16

    .line 144
    .line 145
    invoke-virtual {v1, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    iget-boolean v0, v5, La/cxg0;->w:Z

    .line 152
    .line 153
    if-nez v0, :cond_6

    .line 154
    .line 155
    if-eqz v7, :cond_6

    .line 156
    .line 157
    iget-boolean v1, v5, La/cxg0;->x:Z

    .line 158
    .line 159
    if-nez v1, :cond_6

    .line 160
    .line 161
    invoke-virtual {v5}, La/cxg0;->x()V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_6
    if-nez v0, :cond_7

    .line 166
    .line 167
    if-eqz v7, :cond_7

    .line 168
    .line 169
    iget-boolean v0, v5, La/cxg0;->x:Z

    .line 170
    .line 171
    if-eqz v0, :cond_7

    .line 172
    .line 173
    invoke-virtual {v5, v2}, La/cxg0;->F(Z)V

    .line 174
    .line 175
    .line 176
    :cond_7
    :goto_5
    iput-boolean v7, v5, La/cxg0;->w:Z

    .line 177
    .line 178
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object v0

    .line 181
    :cond_8
    move v0, v7

    .line 182
    goto :goto_4

    .line 183
    :pswitch_2
    iget-object v1, v5, La/cxg0;->l:La/n3w;

    .line 184
    .line 185
    sget-object v7, La/wne;->a:La/wne;

    .line 186
    .line 187
    iget-boolean v8, v0, La/swg0;->j:Z

    .line 188
    .line 189
    if-eqz v8, :cond_a

    .line 190
    .line 191
    if-ne v8, v4, :cond_9

    .line 192
    .line 193
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v0, p1

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_10

    .line 203
    .line 204
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget-object v10, v5, La/cxg0;->b:La/cu;

    .line 208
    .line 209
    iget-wide v11, v5, La/cxg0;->n:J

    .line 210
    .line 211
    iget-object v13, v1, La/n3w;->a:Ljava/lang/String;

    .line 212
    .line 213
    iput-boolean v4, v0, La/swg0;->j:Z

    .line 214
    .line 215
    iget-object v3, v10, La/cu;->b:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v3, La/mne;

    .line 218
    .line 219
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 220
    .line 221
    new-instance v9, La/ir;

    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const/16 v15, 0x10

    .line 225
    .line 226
    invoke-direct/range {v9 .. v15}, La/ir;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 227
    .line 228
    .line 229
    invoke-static {v3, v9, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-ne v0, v7, :cond_b

    .line 234
    .line 235
    move-object v6, v7

    .line 236
    goto/16 :goto_10

    .line 237
    .line 238
    :cond_b
    :goto_6
    check-cast v0, La/ytg0;

    .line 239
    .line 240
    invoke-virtual {v5, v2}, La/cxg0;->F(Z)V

    .line 241
    .line 242
    .line 243
    iget-wide v7, v0, La/ytg0;->a:D

    .line 244
    .line 245
    iget-wide v9, v0, La/ytg0;->c:D

    .line 246
    .line 247
    iget-wide v11, v0, La/ytg0;->d:D

    .line 248
    .line 249
    iget-wide v13, v0, La/ytg0;->e:D

    .line 250
    .line 251
    iget-wide v2, v0, La/ytg0;->f:D

    .line 252
    .line 253
    move-object/from16 v31, v5

    .line 254
    .line 255
    iget-wide v4, v0, La/ytg0;->g:D

    .line 256
    .line 257
    move-wide/from16 v17, v2

    .line 258
    .line 259
    iget-wide v2, v0, La/ytg0;->h:D

    .line 260
    .line 261
    mul-double v15, v13, v7

    .line 262
    .line 263
    div-double/2addr v15, v11

    .line 264
    sub-double v15, v7, v15

    .line 265
    .line 266
    new-instance v6, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 267
    .line 268
    const-wide/16 v25, 0x0

    .line 269
    .line 270
    move-wide/from16 v21, v17

    .line 271
    .line 272
    move-wide/from16 v27, v15

    .line 273
    .line 274
    move-wide/from16 v29, v13

    .line 275
    .line 276
    move-wide/from16 v23, v2

    .line 277
    .line 278
    move-wide/from16 v19, v4

    .line 279
    .line 280
    invoke-direct/range {v6 .. v30}, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;-><init>(DDDDDDDDDDDD)V

    .line 281
    .line 282
    .line 283
    move-object/from16 v0, v31

    .line 284
    .line 285
    iget-boolean v2, v0, La/cxg0;->p:Z

    .line 286
    .line 287
    iget-object v3, v0, La/cxg0;->o:La/sff0;

    .line 288
    .line 289
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 290
    .line 291
    mul-double v4, v4, v23

    .line 292
    .line 293
    div-double/2addr v4, v15

    .line 294
    invoke-static {v4, v5}, La/si30;->a(D)I

    .line 295
    .line 296
    .line 297
    invoke-static {v4, v5}, La/si30;->a(D)I

    .line 298
    .line 299
    .line 300
    iget-boolean v4, v0, La/cxg0;->m:Z

    .line 301
    .line 302
    if-eqz v4, :cond_c

    .line 303
    .line 304
    const-wide/16 v26, 0x0

    .line 305
    .line 306
    const/16 v28, 0xffb

    .line 307
    .line 308
    move-wide/from16 v18, v17

    .line 309
    .line 310
    const-wide/16 v16, 0x0

    .line 311
    .line 312
    const-wide/16 v20, 0x0

    .line 313
    .line 314
    const-wide/16 v22, 0x0

    .line 315
    .line 316
    const-wide/16 v24, 0x0

    .line 317
    .line 318
    move-object v15, v6

    .line 319
    invoke-static/range {v15 .. v28}, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;->a(Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;DDDDDDI)Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    goto :goto_7

    .line 324
    :cond_c
    move-object v15, v6

    .line 325
    :goto_7
    iput-object v6, v0, La/cxg0;->r:Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 326
    .line 327
    iget-wide v7, v6, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;->b:D

    .line 328
    .line 329
    const-wide/16 v9, 0x0

    .line 330
    .line 331
    cmpg-double v5, v7, v9

    .line 332
    .line 333
    if-nez v5, :cond_d

    .line 334
    .line 335
    goto :goto_8

    .line 336
    :cond_d
    iget-object v5, v3, La/sff0;->a:La/gx7;

    .line 337
    .line 338
    iget-object v5, v5, La/gx7;->a:La/gm7;

    .line 339
    .line 340
    iget-boolean v5, v5, La/gm7;->n:Z

    .line 341
    .line 342
    if-nez v5, :cond_e

    .line 343
    .line 344
    :goto_8
    const/4 v5, 0x1

    .line 345
    goto :goto_9

    .line 346
    :cond_e
    const/4 v5, 0x0

    .line 347
    :goto_9
    iput-boolean v5, v0, La/cxg0;->q:Z

    .line 348
    .line 349
    iget-wide v7, v6, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;->g:D

    .line 350
    .line 351
    cmpl-double v7, v7, v9

    .line 352
    .line 353
    if-lez v7, :cond_f

    .line 354
    .line 355
    const/4 v7, 0x1

    .line 356
    goto :goto_a

    .line 357
    :cond_f
    const/4 v7, 0x0

    .line 358
    :goto_a
    if-eqz v5, :cond_11

    .line 359
    .line 360
    if-nez v4, :cond_11

    .line 361
    .line 362
    :cond_10
    const/16 v21, 0x1

    .line 363
    .line 364
    const/16 v22, 0x0

    .line 365
    .line 366
    :goto_b
    const/16 v23, 0x0

    .line 367
    .line 368
    :goto_c
    const/16 v24, 0x0

    .line 369
    .line 370
    goto :goto_d

    .line 371
    :cond_11
    if-eqz v5, :cond_12

    .line 372
    .line 373
    if-eqz v7, :cond_12

    .line 374
    .line 375
    if-eqz v4, :cond_12

    .line 376
    .line 377
    const/16 v21, 0x0

    .line 378
    .line 379
    const/16 v22, 0x1

    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_12
    if-nez v5, :cond_13

    .line 383
    .line 384
    if-eqz v7, :cond_13

    .line 385
    .line 386
    if-eqz v4, :cond_13

    .line 387
    .line 388
    const/16 v21, 0x0

    .line 389
    .line 390
    const/16 v22, 0x0

    .line 391
    .line 392
    const/16 v23, 0x0

    .line 393
    .line 394
    const/16 v24, 0x1

    .line 395
    .line 396
    goto :goto_d

    .line 397
    :cond_13
    iget-object v3, v3, La/sff0;->a:La/gx7;

    .line 398
    .line 399
    iget-object v3, v3, La/gx7;->a:La/gm7;

    .line 400
    .line 401
    iget-boolean v3, v3, La/gm7;->n:Z

    .line 402
    .line 403
    if-eqz v3, :cond_10

    .line 404
    .line 405
    const/16 v21, 0x0

    .line 406
    .line 407
    const/16 v22, 0x0

    .line 408
    .line 409
    const/16 v23, 0x1

    .line 410
    .line 411
    goto :goto_c

    .line 412
    :goto_d
    if-nez v2, :cond_14

    .line 413
    .line 414
    goto :goto_e

    .line 415
    :cond_14
    invoke-static {v15}, La/cxg0;->D(Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;)Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    move-object v15, v3

    .line 420
    :goto_e
    iget-wide v3, v15, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;->c:D

    .line 421
    .line 422
    sget-object v5, La/pn40;->a:La/pn40;

    .line 423
    .line 424
    iget-object v1, v1, La/n3w;->g:Ljava/lang/String;

    .line 425
    .line 426
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 427
    .line 428
    invoke-static {v3, v4, v1, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v26

    .line 432
    iput-wide v3, v0, La/cxg0;->v:D

    .line 433
    .line 434
    if-nez v2, :cond_15

    .line 435
    .line 436
    goto :goto_f

    .line 437
    :cond_15
    invoke-static {v6}, La/cxg0;->D(Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;)Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    :goto_f
    iget-object v1, v0, La/cxg0;->y:La/p7m0;

    .line 442
    .line 443
    :cond_16
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    move-object/from16 v16, v2

    .line 448
    .line 449
    check-cast v16, La/m9h0;

    .line 450
    .line 451
    invoke-virtual {v0, v6}, La/cxg0;->z(Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;)La/jug0;

    .line 452
    .line 453
    .line 454
    move-result-object v17

    .line 455
    const/16 v28, 0x0

    .line 456
    .line 457
    const/16 v29, 0x1a1e

    .line 458
    .line 459
    const/16 v18, 0x0

    .line 460
    .line 461
    const/16 v19, 0x0

    .line 462
    .line 463
    const/16 v20, 0x0

    .line 464
    .line 465
    const/16 v25, 0x0

    .line 466
    .line 467
    const/16 v27, 0x0

    .line 468
    .line 469
    invoke-static/range {v16 .. v29}, La/m9h0;->a(La/m9h0;La/jug0;IIIZZZZZLjava/lang/String;La/hje;II)La/m9h0;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-eqz v2, :cond_16

    .line 478
    .line 479
    const/4 v2, 0x1

    .line 480
    iput-boolean v2, v0, La/cxg0;->x:Z

    .line 481
    .line 482
    const/4 v3, 0x0

    .line 483
    invoke-virtual {v0, v3}, La/cxg0;->w(I)V

    .line 484
    .line 485
    .line 486
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 487
    .line 488
    :goto_10
    return-object v6

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
