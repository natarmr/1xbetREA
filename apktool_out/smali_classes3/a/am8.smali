.class public final La/am8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/km8;


# direct methods
.method public synthetic constructor <init>(La/km8;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/am8;->i:B

    iput-object p1, p0, La/am8;->k:La/km8;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/am8;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/am8;->k:La/km8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/am8;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/am8;-><init>(La/km8;La/yje;B)V

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
    iput-boolean p0, v0, La/am8;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/am8;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/am8;-><init>(La/km8;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/am8;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/am8;-><init>(La/km8;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/am8;->i:B

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
    invoke-virtual {p0, p1, p2}, La/am8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/am8;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/am8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/am8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/am8;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/am8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/am8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/am8;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/am8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v1, v0, La/am8;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/am8;->k:La/km8;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, v0, La/am8;->j:Z

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v1, v5, La/km8;->E:Z

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v5}, La/km8;->M()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iput-boolean v0, v5, La/km8;->E:Z

    .line 31
    .line 32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 36
    .line 37
    sget-object v6, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget-boolean v7, v0, La/am8;->j:Z

    .line 40
    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    if-ne v7, v4, :cond_1

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 v0, p1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v5, La/km8;->q:La/bwl;

    .line 59
    .line 60
    iput-boolean v4, v0, La/am8;->j:Z

    .line 61
    .line 62
    invoke-virtual {v2, v0}, La/bwl;->g(La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-ne v0, v6, :cond_3

    .line 67
    .line 68
    move-object v2, v6

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    :goto_0
    move-object v7, v0

    .line 71
    check-cast v7, Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    sget v0, La/km8;->F:I

    .line 80
    .line 81
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 82
    .line 83
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-object v6, v1

    .line 91
    check-cast v6, La/nl8;

    .line 92
    .line 93
    const/4 v11, 0x0

    .line 94
    const/16 v12, 0x3e

    .line 95
    .line 96
    const/4 v8, 0x0

    .line 97
    const/4 v9, 0x0

    .line 98
    const/4 v10, 0x0

    .line 99
    invoke-static/range {v6 .. v12}, La/nl8;->a(La/nl8;Ljava/util/List;IZZLa/mdm;I)La/nl8;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    sget v0, La/km8;->F:I

    .line 111
    .line 112
    iget-object v8, v5, La/km8;->w:La/g2v;

    .line 113
    .line 114
    sget-object v9, La/pb10;->r1:La/pb10;

    .line 115
    .line 116
    sget-object v10, La/pdm;->b:La/pdm;

    .line 117
    .line 118
    const-wide/16 v19, 0x0

    .line 119
    .line 120
    const/16 v21, 0x3d4

    .line 121
    .line 122
    const/4 v11, 0x0

    .line 123
    const v12, 0x7f08082b

    .line 124
    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const v14, 0x7f130e0d

    .line 128
    .line 129
    .line 130
    const/4 v15, 0x0

    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    const-wide/16 v17, 0x0

    .line 134
    .line 135
    invoke-static/range {v8 .. v21}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 140
    .line 141
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-object v6, v0

    .line 149
    check-cast v6, La/nl8;

    .line 150
    .line 151
    const/4 v10, 0x1

    .line 152
    const/16 v12, 0x22

    .line 153
    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    invoke-static/range {v6 .. v12}, La/nl8;->a(La/nl8;Ljava/util/List;IZZLa/mdm;I)La/nl8;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_6

    .line 165
    .line 166
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    :goto_2
    return-object v2

    .line 169
    :pswitch_1
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 170
    .line 171
    sget-object v6, La/wne;->a:La/wne;

    .line 172
    .line 173
    iget-boolean v7, v0, La/am8;->j:Z

    .line 174
    .line 175
    if-eqz v7, :cond_8

    .line 176
    .line 177
    if-ne v7, v4, :cond_7

    .line 178
    .line 179
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    move-object/from16 v0, p1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_5

    .line 189
    .line 190
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget v2, La/km8;->F:I

    .line 194
    .line 195
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 196
    .line 197
    :cond_9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-object v7, v3

    .line 205
    check-cast v7, La/nl8;

    .line 206
    .line 207
    const/4 v12, 0x0

    .line 208
    const/16 v13, 0x23

    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    const/4 v9, 0x0

    .line 212
    const/4 v10, 0x1

    .line 213
    const/4 v11, 0x0

    .line 214
    invoke-static/range {v7 .. v13}, La/nl8;->a(La/nl8;Ljava/util/List;IZZLa/mdm;I)La/nl8;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-virtual {v2, v3, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_9

    .line 223
    .line 224
    iget-object v2, v5, La/km8;->q:La/bwl;

    .line 225
    .line 226
    iput-boolean v4, v0, La/am8;->j:Z

    .line 227
    .line 228
    invoke-virtual {v2, v0}, La/bwl;->g(La/zje;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-ne v0, v6, :cond_a

    .line 233
    .line 234
    move-object v2, v6

    .line 235
    goto :goto_5

    .line 236
    :cond_a
    :goto_3
    move-object v7, v0

    .line 237
    check-cast v7, Ljava/util/List;

    .line 238
    .line 239
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-nez v0, :cond_c

    .line 244
    .line 245
    sget v0, La/km8;->F:I

    .line 246
    .line 247
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 248
    .line 249
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-object v6, v1

    .line 257
    check-cast v6, La/nl8;

    .line 258
    .line 259
    const/4 v11, 0x0

    .line 260
    const/16 v12, 0x20

    .line 261
    .line 262
    const/4 v8, 0x0

    .line 263
    const/4 v9, 0x0

    .line 264
    const/4 v10, 0x0

    .line 265
    invoke-static/range {v6 .. v12}, La/nl8;->a(La/nl8;Ljava/util/List;IZZLa/mdm;I)La/nl8;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_b

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_c
    sget v0, La/km8;->F:I

    .line 277
    .line 278
    iget-object v6, v5, La/km8;->w:La/g2v;

    .line 279
    .line 280
    sget-object v7, La/pb10;->r1:La/pb10;

    .line 281
    .line 282
    sget-object v8, La/pdm;->b:La/pdm;

    .line 283
    .line 284
    const-wide/16 v17, 0x0

    .line 285
    .line 286
    const/16 v19, 0x3d4

    .line 287
    .line 288
    const/4 v9, 0x0

    .line 289
    const v10, 0x7f08082b

    .line 290
    .line 291
    .line 292
    const/4 v11, 0x0

    .line 293
    const v12, 0x7f130e0d

    .line 294
    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const/4 v14, 0x0

    .line 298
    const-wide/16 v15, 0x0

    .line 299
    .line 300
    invoke-static/range {v6 .. v19}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 301
    .line 302
    .line 303
    move-result-object v25

    .line 304
    iget-object v3, v1, La/ocj;->a:La/p7m0;

    .line 305
    .line 306
    :cond_d
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-object/from16 v20, v0

    .line 314
    .line 315
    check-cast v20, La/nl8;

    .line 316
    .line 317
    const/16 v24, 0x1

    .line 318
    .line 319
    const/16 v26, 0x21

    .line 320
    .line 321
    const/16 v21, 0x0

    .line 322
    .line 323
    const/16 v22, 0x0

    .line 324
    .line 325
    const/16 v23, 0x0

    .line 326
    .line 327
    invoke-static/range {v20 .. v26}, La/nl8;->a(La/nl8;Ljava/util/List;IZZLa/mdm;I)La/nl8;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_d

    .line 336
    .line 337
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    :goto_5
    return-object v2

    .line 340
    nop

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
