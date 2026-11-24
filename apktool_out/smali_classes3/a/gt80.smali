.class public final La/gt80;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/jt80;


# direct methods
.method public constructor <init>(La/jt80;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/gt80;->i:B

    .line 3
    .line 4
    sget-object v0, La/wgh0;->b:La/wgh0;

    .line 5
    .line 6
    iput-object p1, p0, La/gt80;->j:La/jt80;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(La/jt80;La/yje;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/gt80;->i:B

    iput-object p1, p0, La/gt80;->j:La/jt80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/gt80;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gt80;->j:La/jt80;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/gt80;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/gt80;-><init>(La/jt80;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/gt80;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/gt80;-><init>(La/jt80;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/gt80;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/gt80;-><init>(La/jt80;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/gt80;

    .line 30
    .line 31
    sget-object v0, La/wgh0;->b:La/wgh0;

    .line 32
    .line 33
    invoke-direct {p1, p0, p2}, La/gt80;-><init>(La/jt80;La/yje;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
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
    iget-byte v0, p0, La/gt80;->i:B

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
    invoke-virtual {p0, p1, p2}, La/gt80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gt80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gt80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/gt80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/gt80;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/gt80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/gt80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/gt80;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/gt80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/gt80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/gt80;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/gt80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gt80;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/gt80;->j:La/jt80;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 17
    .line 18
    iget-object v2, v0, La/jt80;->o0:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    iget-object v2, v0, La/jt80;->o0:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v2}, La/jt80;->R(Ljava/util/List;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v19

    .line 36
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 37
    .line 38
    :goto_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-object v4, v3

    .line 46
    move-object v3, v4

    .line 47
    check-cast v3, La/rs80;

    .line 48
    .line 49
    sget-object v20, La/iun;->a:La/iun;

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    const v23, 0x67fcfff

    .line 54
    .line 55
    .line 56
    move-object v5, v4

    .line 57
    const/4 v4, 0x0

    .line 58
    move-object v6, v5

    .line 59
    const/4 v5, 0x0

    .line 60
    move-object v7, v6

    .line 61
    const/4 v6, 0x0

    .line 62
    move-object v8, v7

    .line 63
    const/4 v7, 0x0

    .line 64
    move-object v9, v8

    .line 65
    const/4 v8, 0x0

    .line 66
    move-object v10, v9

    .line 67
    const/4 v9, 0x0

    .line 68
    move-object v11, v10

    .line 69
    const/4 v10, 0x0

    .line 70
    move-object v12, v11

    .line 71
    const/4 v11, 0x0

    .line 72
    move-object v13, v12

    .line 73
    const/4 v12, 0x0

    .line 74
    move-object v14, v13

    .line 75
    const/4 v13, 0x0

    .line 76
    move-object v15, v14

    .line 77
    const/4 v14, 0x0

    .line 78
    move-object/from16 v16, v15

    .line 79
    .line 80
    const/4 v15, 0x0

    .line 81
    move-object/from16 v17, v16

    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    move-object/from16 v18, v17

    .line 86
    .line 87
    const/16 v17, 0x0

    .line 88
    .line 89
    move-object/from16 v21, v18

    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    move-object/from16 v24, v21

    .line 94
    .line 95
    const/16 v21, 0x0

    .line 96
    .line 97
    move-object/from16 p0, v1

    .line 98
    .line 99
    move-object/from16 v1, v24

    .line 100
    .line 101
    invoke-static/range {v3 .. v23}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    invoke-virtual {v0}, La/jt80;->Z()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, La/jt80;->d0()V

    .line 115
    .line 116
    .line 117
    new-instance v1, La/ur80;

    .line 118
    .line 119
    iget-object v0, v0, La/jt80;->o0:Ljava/util/List;

    .line 120
    .line 121
    invoke-direct {v1, v0}, La/ur80;-><init>(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    move-object/from16 v3, p0

    .line 125
    .line 126
    iget-object v4, v3, La/ocj;->a:La/p7m0;

    .line 127
    .line 128
    :goto_1
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-object/from16 v20, v0

    .line 136
    .line 137
    check-cast v20, La/rs80;

    .line 138
    .line 139
    const/16 v39, 0x0

    .line 140
    .line 141
    const v40, 0x7bfffff

    .line 142
    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const/16 v23, 0x0

    .line 149
    .line 150
    const/16 v24, 0x0

    .line 151
    .line 152
    const/16 v25, 0x0

    .line 153
    .line 154
    const/16 v26, 0x0

    .line 155
    .line 156
    const/16 v27, 0x0

    .line 157
    .line 158
    const/16 v28, 0x0

    .line 159
    .line 160
    const/16 v29, 0x0

    .line 161
    .line 162
    const/16 v30, 0x0

    .line 163
    .line 164
    const/16 v31, 0x0

    .line 165
    .line 166
    const/16 v32, 0x0

    .line 167
    .line 168
    const/16 v33, 0x0

    .line 169
    .line 170
    const/16 v34, 0x0

    .line 171
    .line 172
    const/16 v36, 0x0

    .line 173
    .line 174
    const/16 v37, 0x0

    .line 175
    .line 176
    const/16 v38, 0x0

    .line 177
    .line 178
    move-object/from16 v35, v1

    .line 179
    .line 180
    invoke-static/range {v20 .. v40}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_1

    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    :goto_2
    return-object v0

    .line 193
    :cond_1
    move-object/from16 v1, v35

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_2
    move-object/from16 v1, p0

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 201
    .line 202
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, La/jt80;->L:La/pwi;

    .line 206
    .line 207
    iget-wide v3, v0, La/jt80;->o:J

    .line 208
    .line 209
    sget-object v5, La/nw80;->b:La/nw80;

    .line 210
    .line 211
    invoke-virtual {v5}, La/nw80;->getId()J

    .line 212
    .line 213
    .line 214
    move-result-wide v5

    .line 215
    cmp-long v5, v3, v5

    .line 216
    .line 217
    if-nez v5, :cond_3

    .line 218
    .line 219
    sget-object v3, La/fk60;->n:La/fk60;

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_3
    sget-object v5, La/nw80;->a:La/nw80;

    .line 223
    .line 224
    invoke-virtual {v5}, La/nw80;->getId()J

    .line 225
    .line 226
    .line 227
    move-result-wide v5

    .line 228
    cmp-long v3, v3, v5

    .line 229
    .line 230
    if-nez v3, :cond_4

    .line 231
    .line 232
    sget-object v3, La/fk60;->o:La/fk60;

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_4
    sget-object v3, La/fk60;->n:La/fk60;

    .line 236
    .line 237
    :goto_3
    invoke-virtual {v1, v3}, La/pwi;->r(La/fk60;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_5

    .line 242
    .line 243
    sget-object v1, La/ls80;->a:La/ls80;

    .line 244
    .line 245
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_5
    iget-object v0, v0, La/jt80;->K:La/o470;

    .line 249
    .line 250
    invoke-virtual {v0, v2}, La/o470;->i(Z)V

    .line 251
    .line 252
    .line 253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 257
    .line 258
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    iget-object v1, v0, La/jt80;->A:La/u58;

    .line 262
    .line 263
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 264
    .line 265
    const-string v3, "game_menu_filter_call"

    .line 266
    .line 267
    invoke-interface {v1, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    iget-object v1, v0, La/jt80;->p:La/oeg0;

    .line 271
    .line 272
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    new-instance v4, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorFiltersScreen;

    .line 281
    .line 282
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    check-cast v5, La/rs80;

    .line 287
    .line 288
    iget-wide v5, v5, La/rs80;->v:J

    .line 289
    .line 290
    invoke-direct {v4, v5, v6}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorFiltersScreen;-><init>(J)V

    .line 291
    .line 292
    .line 293
    instance-of v5, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 294
    .line 295
    if-eqz v5, :cond_6

    .line 296
    .line 297
    new-instance v5, La/e1w0;

    .line 298
    .line 299
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 300
    .line 301
    invoke-direct {v5, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 302
    .line 303
    .line 304
    new-instance v4, La/c8d;

    .line 305
    .line 306
    sget-object v6, La/y7d;->a:La/v7d;

    .line 307
    .line 308
    invoke-direct {v4, v6, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_6
    new-instance v5, La/w0w0;

    .line 316
    .line 317
    invoke-direct {v5, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 318
    .line 319
    .line 320
    new-instance v4, La/c8d;

    .line 321
    .line 322
    sget-object v6, La/y7d;->a:La/v7d;

    .line 323
    .line 324
    invoke-direct {v4, v6, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :goto_4
    invoke-static {v1, v3, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    :goto_5
    move-object v3, v2

    .line 335
    check-cast v3, La/paw;

    .line 336
    .line 337
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    if-eqz v4, :cond_7

    .line 342
    .line 343
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    check-cast v3, La/oe50;

    .line 348
    .line 349
    invoke-virtual {v1, v3}, La/i1w0;->a(La/oe50;)V

    .line 350
    .line 351
    .line 352
    goto :goto_5

    .line 353
    :cond_7
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 354
    .line 355
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 356
    .line 357
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    move-object v2, v0

    .line 365
    check-cast v2, La/rs80;

    .line 366
    .line 367
    iget-boolean v9, v2, La/rs80;->e:Z

    .line 368
    .line 369
    const/16 v21, 0x0

    .line 370
    .line 371
    const v22, 0x7ffffbf

    .line 372
    .line 373
    .line 374
    const/4 v3, 0x0

    .line 375
    const/4 v4, 0x0

    .line 376
    const/4 v5, 0x0

    .line 377
    const/4 v6, 0x0

    .line 378
    const/4 v7, 0x0

    .line 379
    const/4 v8, 0x0

    .line 380
    const/4 v10, 0x0

    .line 381
    const/4 v11, 0x0

    .line 382
    const/4 v12, 0x0

    .line 383
    const/4 v13, 0x0

    .line 384
    const/4 v14, 0x0

    .line 385
    const/4 v15, 0x0

    .line 386
    const/16 v16, 0x0

    .line 387
    .line 388
    const/16 v17, 0x0

    .line 389
    .line 390
    const/16 v18, 0x0

    .line 391
    .line 392
    const/16 v19, 0x0

    .line 393
    .line 394
    const/16 v20, 0x0

    .line 395
    .line 396
    invoke-static/range {v2 .. v22}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-eqz v0, :cond_8

    .line 405
    .line 406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 410
    .line 411
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    iget-object v1, v0, La/jt80;->W:La/s91;

    .line 415
    .line 416
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 417
    .line 418
    sget-object v8, La/wgh0;->i:La/wgh0;

    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const/16 v15, 0x1e7

    .line 422
    .line 423
    const/4 v3, 0x0

    .line 424
    const/4 v4, 0x0

    .line 425
    const-wide/16 v5, 0x0

    .line 426
    .line 427
    sget-object v7, La/vl1;->a:La/vl1;

    .line 428
    .line 429
    const-wide/16 v9, 0x0

    .line 430
    .line 431
    const-wide/16 v11, 0x0

    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    invoke-direct/range {v2 .. v15}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1, v2}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 438
    .line 439
    .line 440
    sget-object v1, La/wgh0;->b:La/wgh0;

    .line 441
    .line 442
    iget-object v1, v0, La/jt80;->U:La/s31;

    .line 443
    .line 444
    invoke-virtual {v1, v8}, La/s31;->g(La/wgh0;)V

    .line 445
    .line 446
    .line 447
    iget-object v0, v0, La/jt80;->X:La/cyu;

    .line 448
    .line 449
    const-string v1, "aggregator_live"

    .line 450
    .line 451
    invoke-virtual {v0, v1}, La/cyu;->C(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 455
    .line 456
    return-object v0

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
