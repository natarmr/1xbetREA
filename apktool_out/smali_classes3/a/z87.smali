.class public final La/z87;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/nrt;

.field public k:B

.field public final synthetic l:La/f97;


# direct methods
.method public synthetic constructor <init>(La/f97;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z87;->i:B

    iput-object p1, p0, La/z87;->l:La/f97;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/z87;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/z87;->l:La/f97;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/z87;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/z87;-><init>(La/f97;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/z87;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/z87;-><init>(La/f97;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/z87;->i:B

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
    invoke-virtual {p0, p1, p2}, La/z87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/z87;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/z87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/z87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/z87;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/z87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z87;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/z87;->l:La/f97;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

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
    iget-byte v7, v0, La/z87;->k:B

    .line 18
    .line 19
    const/4 v8, 0x3

    .line 20
    if-eqz v7, :cond_3

    .line 21
    .line 22
    if-eq v7, v4, :cond_2

    .line 23
    .line 24
    if-eq v7, v5, :cond_1

    .line 25
    .line 26
    if-ne v7, v8, :cond_0

    .line 27
    .line 28
    iget-object v0, v0, La/z87;->j:La/nrt;

    .line 29
    .line 30
    check-cast v0, La/ql5;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v2, p1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object v2, v0, La/z87;->j:La/nrt;

    .line 49
    .line 50
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object/from16 v4, p1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v3, La/f97;->v:La/nrt;

    .line 60
    .line 61
    iput-object v2, v0, La/z87;->j:La/nrt;

    .line 62
    .line 63
    iput-byte v4, v0, La/z87;->k:B

    .line 64
    .line 65
    invoke-virtual {v3, v0}, La/f97;->S(La/yje;)Ljava/io/Serializable;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-ne v4, v1, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_0
    check-cast v4, La/ql5;

    .line 73
    .line 74
    iget-wide v9, v4, La/ql5;->a:J

    .line 75
    .line 76
    iput-object v6, v0, La/z87;->j:La/nrt;

    .line 77
    .line 78
    iput-byte v5, v0, La/z87;->k:B

    .line 79
    .line 80
    invoke-static {v2, v9, v10, v0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-ne v2, v1, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    :goto_1
    move-object v13, v2

    .line 88
    check-cast v13, La/ql5;

    .line 89
    .line 90
    sget v2, La/f97;->R0:I

    .line 91
    .line 92
    iget-object v2, v3, La/i3t0;->i:La/ocj;

    .line 93
    .line 94
    iget-object v7, v2, La/ocj;->a:La/p7m0;

    .line 95
    .line 96
    :cond_6
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-object v9, v2

    .line 104
    check-cast v9, La/i77;

    .line 105
    .line 106
    const/16 v37, -0x11

    .line 107
    .line 108
    const/16 v38, 0x7ff

    .line 109
    .line 110
    const/4 v10, 0x0

    .line 111
    const/4 v11, 0x0

    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v15, 0x0

    .line 115
    const/16 v16, 0x0

    .line 116
    .line 117
    const/16 v17, 0x0

    .line 118
    .line 119
    const/16 v18, 0x0

    .line 120
    .line 121
    const/16 v19, 0x0

    .line 122
    .line 123
    const/16 v20, 0x0

    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const/16 v22, 0x0

    .line 128
    .line 129
    const/16 v23, 0x0

    .line 130
    .line 131
    const/16 v24, 0x0

    .line 132
    .line 133
    const/16 v25, 0x0

    .line 134
    .line 135
    const/16 v26, 0x0

    .line 136
    .line 137
    const/16 v27, 0x0

    .line 138
    .line 139
    const/16 v28, 0x0

    .line 140
    .line 141
    const/16 v29, 0x0

    .line 142
    .line 143
    const/16 v30, 0x0

    .line 144
    .line 145
    const/16 v31, 0x0

    .line 146
    .line 147
    const/16 v32, 0x0

    .line 148
    .line 149
    const/16 v33, 0x0

    .line 150
    .line 151
    const/16 v34, 0x0

    .line 152
    .line 153
    const/16 v35, 0x0

    .line 154
    .line 155
    const/16 v36, 0x0

    .line 156
    .line 157
    invoke-static/range {v9 .. v38}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v7, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    invoke-virtual {v3}, La/f97;->a0()V

    .line 168
    .line 169
    .line 170
    sget-object v2, La/wen;->b:La/uen;

    .line 171
    .line 172
    const-wide/16 v2, 0x7530

    .line 173
    .line 174
    sget-object v4, La/bfn;->d:La/bfn;

    .line 175
    .line 176
    invoke-static {v2, v3, v4}, La/ibc;->w0(JLa/bfn;)J

    .line 177
    .line 178
    .line 179
    move-result-wide v2

    .line 180
    iput-object v6, v0, La/z87;->j:La/nrt;

    .line 181
    .line 182
    iput-byte v8, v0, La/z87;->k:B

    .line 183
    .line 184
    invoke-static {v2, v3, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    if-ne v0, v1, :cond_7

    .line 189
    .line 190
    :goto_2
    move-object v6, v1

    .line 191
    goto :goto_4

    .line 192
    :cond_7
    :goto_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    :goto_4
    return-object v6

    .line 195
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 196
    .line 197
    iget-byte v7, v0, La/z87;->k:B

    .line 198
    .line 199
    if-eqz v7, :cond_a

    .line 200
    .line 201
    if-eq v7, v4, :cond_9

    .line 202
    .line 203
    if-ne v7, v5, :cond_8

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    move-object/from16 v0, p1

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_8

    .line 215
    .line 216
    :cond_9
    iget-object v2, v0, La/z87;->j:La/nrt;

    .line 217
    .line 218
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    move-object/from16 v4, p1

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-object v2, v3, La/f97;->v:La/nrt;

    .line 228
    .line 229
    iput-object v2, v0, La/z87;->j:La/nrt;

    .line 230
    .line 231
    iput-byte v4, v0, La/z87;->k:B

    .line 232
    .line 233
    invoke-virtual {v3, v0}, La/f97;->S(La/yje;)Ljava/io/Serializable;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    if-ne v4, v1, :cond_b

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_b
    :goto_5
    check-cast v4, La/ql5;

    .line 241
    .line 242
    iget-wide v7, v4, La/ql5;->a:J

    .line 243
    .line 244
    iput-object v6, v0, La/z87;->j:La/nrt;

    .line 245
    .line 246
    iput-byte v5, v0, La/z87;->k:B

    .line 247
    .line 248
    invoke-static {v2, v7, v8, v0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    if-ne v0, v1, :cond_c

    .line 253
    .line 254
    :goto_6
    move-object v6, v1

    .line 255
    goto :goto_8

    .line 256
    :cond_c
    :goto_7
    move-object v8, v0

    .line 257
    check-cast v8, La/ql5;

    .line 258
    .line 259
    sget v0, La/f97;->R0:I

    .line 260
    .line 261
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 262
    .line 263
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 264
    .line 265
    :cond_d
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-object v4, v1

    .line 273
    check-cast v4, La/i77;

    .line 274
    .line 275
    const/16 v32, -0x11

    .line 276
    .line 277
    const/16 v33, 0x7ff

    .line 278
    .line 279
    const/4 v5, 0x0

    .line 280
    const/4 v6, 0x0

    .line 281
    const/4 v7, 0x0

    .line 282
    const/4 v9, 0x0

    .line 283
    const/4 v10, 0x0

    .line 284
    const/4 v11, 0x0

    .line 285
    const/4 v12, 0x0

    .line 286
    const/4 v13, 0x0

    .line 287
    const/4 v14, 0x0

    .line 288
    const/4 v15, 0x0

    .line 289
    const/16 v16, 0x0

    .line 290
    .line 291
    const/16 v17, 0x0

    .line 292
    .line 293
    const/16 v18, 0x0

    .line 294
    .line 295
    const/16 v19, 0x0

    .line 296
    .line 297
    const/16 v20, 0x0

    .line 298
    .line 299
    const/16 v21, 0x0

    .line 300
    .line 301
    const/16 v22, 0x0

    .line 302
    .line 303
    const/16 v23, 0x0

    .line 304
    .line 305
    const/16 v24, 0x0

    .line 306
    .line 307
    const/16 v25, 0x0

    .line 308
    .line 309
    const/16 v26, 0x0

    .line 310
    .line 311
    const/16 v27, 0x0

    .line 312
    .line 313
    const/16 v28, 0x0

    .line 314
    .line 315
    const/16 v29, 0x0

    .line 316
    .line 317
    const/16 v30, 0x0

    .line 318
    .line 319
    const/16 v31, 0x0

    .line 320
    .line 321
    invoke-static/range {v4 .. v33}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-eqz v1, :cond_d

    .line 330
    .line 331
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    :goto_8
    return-object v6

    .line 334
    nop

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
