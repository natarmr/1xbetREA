.class public final La/lvs;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/f3j;


# direct methods
.method public synthetic constructor <init>(La/f3j;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lvs;->i:B

    iput-object p1, p0, La/lvs;->k:La/f3j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/lvs;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lvs;->k:La/f3j;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/lvs;

    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/lvs;-><init>(La/f3j;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/lvs;

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/lvs;-><init>(La/f3j;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/lvs;

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/lvs;-><init>(La/f3j;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/lvs;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/lvs;-><init>(La/f3j;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/lvs;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/lvs;-><init>(La/f3j;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_4
    new-instance p1, La/lvs;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {p1, p0, p2, v0}, La/lvs;-><init>(La/f3j;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lvs;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lvs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lvs;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lvs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lvs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lvs;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lvs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/lvs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/lvs;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/lvs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/lvs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/lvs;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/lvs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/lvs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/lvs;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/lvs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/lvs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/lvs;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/lvs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
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
    iget-byte v1, v0, La/lvs;->i:B

    .line 4
    .line 5
    iget-object v3, v0, La/lvs;->k:La/f3j;

    .line 6
    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v2, v0, La/lvs;->j:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    if-ne v2, v5, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object v2, v3, La/f3j;->r:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, La/p7m0;

    .line 36
    .line 37
    sget-object v3, La/ny30;->b:La/ny30;

    .line 38
    .line 39
    iput-boolean v5, v0, La/lvs;->j:Z

    .line 40
    .line 41
    invoke-virtual {v2, v6, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    if-ne v0, v1, :cond_2

    .line 47
    .line 48
    move-object v6, v1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    :goto_1
    return-object v6

    .line 53
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 54
    .line 55
    iget-boolean v2, v0, La/lvs;->j:Z

    .line 56
    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    if-ne v2, v5, :cond_3

    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, v3, La/f3j;->r:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, La/p7m0;

    .line 75
    .line 76
    sget-object v3, La/ny30;->a:La/ny30;

    .line 77
    .line 78
    iput-boolean v5, v0, La/lvs;->j:Z

    .line 79
    .line 80
    invoke-virtual {v2, v6, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    if-ne v0, v1, :cond_5

    .line 86
    .line 87
    move-object v6, v1

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_3
    return-object v6

    .line 92
    :pswitch_1
    iget-object v1, v3, La/f3j;->q:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, La/p7m0;

    .line 95
    .line 96
    sget-object v7, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-boolean v8, v0, La/lvs;->j:Z

    .line 99
    .line 100
    if-eqz v8, :cond_7

    .line 101
    .line 102
    if-ne v8, v5, :cond_6

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_7

    .line 108
    .line 109
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_8

    .line 113
    .line 114
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v4, v3, La/f3j;->r:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v4, La/p7m0;

    .line 120
    .line 121
    new-instance v8, La/oy30;

    .line 122
    .line 123
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    check-cast v9, La/yus;

    .line 128
    .line 129
    iget-wide v11, v9, La/yus;->a:J

    .line 130
    .line 131
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    check-cast v9, La/yus;

    .line 136
    .line 137
    iget-object v15, v9, La/yus;->b:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    check-cast v9, La/yus;

    .line 144
    .line 145
    iget-wide v9, v9, La/yus;->c:J

    .line 146
    .line 147
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    check-cast v13, La/yus;

    .line 152
    .line 153
    iget-boolean v13, v13, La/yus;->d:Z

    .line 154
    .line 155
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    check-cast v14, La/yus;

    .line 160
    .line 161
    move-object/from16 v29, v7

    .line 162
    .line 163
    iget-wide v6, v14, La/yus;->e:J

    .line 164
    .line 165
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    check-cast v14, La/yus;

    .line 170
    .line 171
    iget-boolean v14, v14, La/yus;->m:Z

    .line 172
    .line 173
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v16

    .line 177
    move-object/from16 v2, v16

    .line 178
    .line 179
    check-cast v2, La/yus;

    .line 180
    .line 181
    iget-boolean v2, v2, La/yus;->l:Z

    .line 182
    .line 183
    if-eqz v2, :cond_8

    .line 184
    .line 185
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    check-cast v2, La/yus;

    .line 190
    .line 191
    iget-object v2, v2, La/yus;->r:La/px7;

    .line 192
    .line 193
    instance-of v2, v2, La/ox7;

    .line 194
    .line 195
    if-eqz v2, :cond_8

    .line 196
    .line 197
    move/from16 v22, v5

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_8
    const/16 v22, 0x0

    .line 201
    .line 202
    :goto_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, La/yus;

    .line 207
    .line 208
    iget-boolean v2, v2, La/yus;->n:Z

    .line 209
    .line 210
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v16

    .line 214
    move-object/from16 v5, v16

    .line 215
    .line 216
    check-cast v5, La/yus;

    .line 217
    .line 218
    iget-boolean v5, v5, La/yus;->o:Z

    .line 219
    .line 220
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v16

    .line 224
    move-object/from16 v18, v1

    .line 225
    .line 226
    move-object/from16 v1, v16

    .line 227
    .line 228
    check-cast v1, La/yus;

    .line 229
    .line 230
    iget-boolean v1, v1, La/yus;->p:Z

    .line 231
    .line 232
    invoke-virtual/range {v18 .. v18}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v16

    .line 236
    move/from16 v25, v1

    .line 237
    .line 238
    move-object/from16 v1, v16

    .line 239
    .line 240
    check-cast v1, La/yus;

    .line 241
    .line 242
    iget-object v1, v1, La/yus;->r:La/px7;

    .line 243
    .line 244
    instance-of v1, v1, La/ox7;

    .line 245
    .line 246
    if-nez v1, :cond_a

    .line 247
    .line 248
    invoke-virtual/range {v18 .. v18}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    check-cast v1, La/yus;

    .line 253
    .line 254
    iget-object v1, v1, La/yus;->r:La/px7;

    .line 255
    .line 256
    instance-of v1, v1, La/mx7;

    .line 257
    .line 258
    if-eqz v1, :cond_9

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_9
    const/16 v26, 0x0

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_a
    :goto_5
    const/16 v26, 0x1

    .line 265
    .line 266
    :goto_6
    iget-object v1, v3, La/f3j;->o:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v1, La/npn;

    .line 269
    .line 270
    iget-object v1, v1, La/npn;->d:Ljava/lang/Object;

    .line 271
    .line 272
    move-object/from16 v27, v1

    .line 273
    .line 274
    check-cast v27, Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual/range {v18 .. v18}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    check-cast v1, La/yus;

    .line 281
    .line 282
    move/from16 v23, v2

    .line 283
    .line 284
    iget-wide v1, v1, La/yus;->q:J

    .line 285
    .line 286
    invoke-virtual/range {v18 .. v18}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    check-cast v3, La/yus;

    .line 291
    .line 292
    iget-boolean v3, v3, La/yus;->s:Z

    .line 293
    .line 294
    move-wide/from16 v16, v9

    .line 295
    .line 296
    new-instance v10, Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 297
    .line 298
    move/from16 v28, v3

    .line 299
    .line 300
    move/from16 v24, v5

    .line 301
    .line 302
    move-wide/from16 v19, v6

    .line 303
    .line 304
    move/from16 v18, v13

    .line 305
    .line 306
    move/from16 v21, v14

    .line 307
    .line 308
    move-wide v13, v1

    .line 309
    invoke-direct/range {v10 .. v28}, Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;-><init>(JJLjava/lang/String;JZJZZZZZZLjava/lang/String;Z)V

    .line 310
    .line 311
    .line 312
    invoke-direct {v8, v10}, La/oy30;-><init>(Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;)V

    .line 313
    .line 314
    .line 315
    const/4 v1, 0x1

    .line 316
    iput-boolean v1, v0, La/lvs;->j:Z

    .line 317
    .line 318
    const/4 v0, 0x0

    .line 319
    invoke-virtual {v4, v0, v8}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    move-object/from16 v1, v29

    .line 325
    .line 326
    if-ne v0, v1, :cond_b

    .line 327
    .line 328
    move-object v6, v1

    .line 329
    goto :goto_8

    .line 330
    :cond_b
    :goto_7
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    :goto_8
    return-object v6

    .line 333
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 334
    .line 335
    iget-boolean v2, v0, La/lvs;->j:Z

    .line 336
    .line 337
    if-eqz v2, :cond_d

    .line 338
    .line 339
    const/4 v5, 0x1

    .line 340
    if-ne v2, v5, :cond_c

    .line 341
    .line 342
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    const/4 v6, 0x0

    .line 350
    goto :goto_a

    .line 351
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    iget-object v2, v3, La/f3j;->l:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v2, La/vpu;

    .line 357
    .line 358
    invoke-virtual {v2}, La/vpu;->a()La/fnq;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    new-instance v4, La/gvs;

    .line 363
    .line 364
    const/4 v5, 0x2

    .line 365
    invoke-direct {v4, v3, v5}, La/gvs;-><init>(La/f3j;B)V

    .line 366
    .line 367
    .line 368
    const/4 v5, 0x1

    .line 369
    iput-boolean v5, v0, La/lvs;->j:Z

    .line 370
    .line 371
    invoke-virtual {v2, v4, v0}, La/fnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    if-ne v0, v1, :cond_e

    .line 376
    .line 377
    move-object v6, v1

    .line 378
    goto :goto_a

    .line 379
    :cond_e
    :goto_9
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 380
    .line 381
    :goto_a
    return-object v6

    .line 382
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 383
    .line 384
    iget-boolean v2, v0, La/lvs;->j:Z

    .line 385
    .line 386
    if-eqz v2, :cond_10

    .line 387
    .line 388
    if-ne v2, v5, :cond_f

    .line 389
    .line 390
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    goto :goto_b

    .line 394
    :cond_f
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const/4 v6, 0x0

    .line 398
    goto :goto_c

    .line 399
    :cond_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    iget-object v2, v3, La/f3j;->g:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v2, La/rbu;

    .line 405
    .line 406
    invoke-virtual {v2}, La/rbu;->a()La/p7m0;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-static {v2}, La/i120;->W(La/gmq;)La/gmq;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    new-instance v4, La/gvs;

    .line 415
    .line 416
    invoke-direct {v4, v3, v5}, La/gvs;-><init>(La/f3j;B)V

    .line 417
    .line 418
    .line 419
    iput-boolean v5, v0, La/lvs;->j:Z

    .line 420
    .line 421
    invoke-interface {v2, v4, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    if-ne v0, v1, :cond_11

    .line 426
    .line 427
    move-object v6, v1

    .line 428
    goto :goto_c

    .line 429
    :cond_11
    :goto_b
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 430
    .line 431
    :goto_c
    return-object v6

    .line 432
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 433
    .line 434
    iget-boolean v2, v0, La/lvs;->j:Z

    .line 435
    .line 436
    if-eqz v2, :cond_13

    .line 437
    .line 438
    if-ne v2, v5, :cond_12

    .line 439
    .line 440
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    goto :goto_d

    .line 444
    :cond_12
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    const/4 v6, 0x0

    .line 448
    goto :goto_e

    .line 449
    :cond_13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    iget-object v2, v3, La/f3j;->m:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v2, La/r1u;

    .line 455
    .line 456
    invoke-virtual {v2}, La/r1u;->a()La/i89;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    new-instance v4, La/fvs;

    .line 461
    .line 462
    const/4 v5, 0x0

    .line 463
    const/4 v6, 0x0

    .line 464
    invoke-direct {v4, v3, v6, v5}, La/fvs;-><init>(La/f3j;La/yje;B)V

    .line 465
    .line 466
    .line 467
    new-instance v5, La/fnq;

    .line 468
    .line 469
    const/4 v7, 0x4

    .line 470
    invoke-direct {v5, v2, v4, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 471
    .line 472
    .line 473
    new-instance v2, La/rf0;

    .line 474
    .line 475
    const/4 v4, 0x5

    .line 476
    invoke-direct {v2, v5, v4}, La/rf0;-><init>(La/fnq;B)V

    .line 477
    .line 478
    .line 479
    new-instance v4, La/zo1;

    .line 480
    .line 481
    const/16 v5, 0x1d

    .line 482
    .line 483
    invoke-direct {v4, v6, v3, v5}, La/zo1;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 484
    .line 485
    .line 486
    invoke-static {v2, v4}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    new-instance v4, La/gvs;

    .line 491
    .line 492
    const/4 v5, 0x0

    .line 493
    invoke-direct {v4, v3, v5}, La/gvs;-><init>(La/f3j;B)V

    .line 494
    .line 495
    .line 496
    const/4 v5, 0x1

    .line 497
    iput-boolean v5, v0, La/lvs;->j:Z

    .line 498
    .line 499
    invoke-virtual {v2, v4, v0}, La/qtb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    if-ne v0, v1, :cond_14

    .line 504
    .line 505
    move-object v6, v1

    .line 506
    goto :goto_e

    .line 507
    :cond_14
    :goto_d
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    :goto_e
    return-object v6

    .line 510
    nop

    .line 511
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
