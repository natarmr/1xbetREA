.class public final La/mcj;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/dgu;La/j700;Ljava/util/Set;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/mcj;->i:B

    .line 17
    iput-object p1, p0, La/mcj;->n:Ljava/lang/Object;

    iput-object p2, p0, La/mcj;->o:Ljava/lang/Object;

    iput-object p3, p0, La/mcj;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/kie0;La/ncj;Ljava/lang/Object;ZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/mcj;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/mcj;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/mcj;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/mcj;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p4, p0, La/mcj;->j:Z

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/mcj;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/mcj;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/mcj;->n:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/mcj;

    .line 11
    .line 12
    check-cast v2, La/dgu;

    .line 13
    .line 14
    iget-object p0, p0, La/mcj;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/j700;

    .line 17
    .line 18
    check-cast v1, Ljava/util/Set;

    .line 19
    .line 20
    invoke-direct {v0, v2, p0, v1, p2}, La/mcj;-><init>(La/dgu;La/j700;Ljava/util/Set;La/yje;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/mcj;->l:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    new-instance v3, La/mcj;

    .line 27
    .line 28
    move-object v4, v2

    .line 29
    check-cast v4, La/kie0;

    .line 30
    .line 31
    move-object v5, v1

    .line 32
    check-cast v5, La/ncj;

    .line 33
    .line 34
    iget-object v6, p0, La/mcj;->o:Ljava/lang/Object;

    .line 35
    .line 36
    iget-boolean v7, p0, La/mcj;->j:Z

    .line 37
    .line 38
    move-object v8, p2

    .line 39
    invoke-direct/range {v3 .. v8}, La/mcj;-><init>(La/kie0;La/ncj;Ljava/lang/Object;ZLa/yje;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v3, La/mcj;->l:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v3

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mcj;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mcj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mcj;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mcj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/g0q;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mcj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mcj;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mcj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mcj;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/mcj;->p:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v5, v0, La/mcj;->n:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, La/mcj;->o:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v11, v6

    .line 21
    check-cast v11, La/j700;

    .line 22
    .line 23
    check-cast v5, La/dgu;

    .line 24
    .line 25
    iget-object v1, v0, La/mcj;->l:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, La/kmq;

    .line 28
    .line 29
    sget-object v6, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget-byte v10, v0, La/mcj;->k:B

    .line 32
    .line 33
    const/4 v12, 0x3

    .line 34
    if-eqz v10, :cond_3

    .line 35
    .line 36
    if-eq v10, v8, :cond_2

    .line 37
    .line 38
    if-eq v10, v7, :cond_1

    .line 39
    .line 40
    if-ne v10, v12, :cond_0

    .line 41
    .line 42
    iget-object v0, v0, La/mcj;->m:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, La/rtu;

    .line 45
    .line 46
    check-cast v0, La/c3c0;

    .line 47
    .line 48
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object/from16 v4, p1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    iget-boolean v4, v0, La/mcj;->j:Z

    .line 65
    .line 66
    iget-object v10, v0, La/mcj;->m:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v10, La/rtu;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v13, p1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, v5, La/dgu;->c:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v10, v4

    .line 82
    check-cast v10, La/rtu;

    .line 83
    .line 84
    invoke-static {v11}, La/t9x;->J(La/j700;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    iget-object v13, v5, La/dgu;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v13, La/ieu;

    .line 91
    .line 92
    iput-object v1, v0, La/mcj;->l:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v10, v0, La/mcj;->m:Ljava/lang/Object;

    .line 95
    .line 96
    iput-boolean v4, v0, La/mcj;->j:Z

    .line 97
    .line 98
    iput-byte v8, v0, La/mcj;->k:B

    .line 99
    .line 100
    invoke-virtual {v13, v0}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v13

    .line 104
    if-ne v13, v6, :cond_4

    .line 105
    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_4
    :goto_0
    check-cast v13, La/elt;

    .line 109
    .line 110
    iget v13, v13, La/elt;->e:I

    .line 111
    .line 112
    iput-object v1, v0, La/mcj;->l:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v9, v0, La/mcj;->m:Ljava/lang/Object;

    .line 115
    .line 116
    iput-byte v7, v0, La/mcj;->k:B

    .line 117
    .line 118
    invoke-virtual {v10, v4, v13, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-ne v4, v6, :cond_5

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_5
    :goto_1
    check-cast v4, La/c3c0;

    .line 127
    .line 128
    iget-object v7, v5, La/dgu;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v7, La/viu;

    .line 131
    .line 132
    invoke-virtual {v7}, La/viu;->a()J

    .line 133
    .line 134
    .line 135
    move-result-wide v13

    .line 136
    invoke-static {v13, v14}, La/ynq0;->f(J)J

    .line 137
    .line 138
    .line 139
    move-result-wide v16

    .line 140
    iget-object v5, v5, La/dgu;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v5, La/ouu;

    .line 143
    .line 144
    iget v13, v4, La/c3c0;->a:I

    .line 145
    .line 146
    move-object v14, v3

    .line 147
    check-cast v14, Ljava/util/Set;

    .line 148
    .line 149
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v11}, La/t9x;->J(La/j700;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    iget-object v4, v5, La/ouu;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v4, La/lef0;

    .line 162
    .line 163
    if-eqz v3, :cond_6

    .line 164
    .line 165
    iget-object v2, v4, La/lef0;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v2, La/m8l0;

    .line 168
    .line 169
    iget-object v2, v2, La/m8l0;->a:La/p7m0;

    .line 170
    .line 171
    invoke-static {v2}, La/i120;->W(La/gmq;)La/gmq;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    new-instance v10, La/p4m;

    .line 176
    .line 177
    const/4 v15, 0x0

    .line 178
    move v3, v12

    .line 179
    move-object v12, v5

    .line 180
    invoke-direct/range {v10 .. v15}, La/p4m;-><init>(La/j700;La/ouu;ILjava/util/Set;La/yje;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v2, v10}, La/aoq;->a(La/gmq;Lkotlin/jvm/functions/Function2;)La/utb;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    :goto_2
    move-object v12, v2

    .line 188
    goto :goto_3

    .line 189
    :cond_6
    move-object/from16 v18, v5

    .line 190
    .line 191
    move v3, v12

    .line 192
    move/from16 v19, v13

    .line 193
    .line 194
    invoke-virtual {v4, v2}, La/lef0;->f(Z)La/p7m0;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v4}, La/lef0;->g()La/p6d;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    sget-object v5, La/yo00;->h:La/yo00;

    .line 203
    .line 204
    new-instance v7, La/p6d;

    .line 205
    .line 206
    invoke-direct {v7, v2, v4, v5, v8}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 207
    .line 208
    .line 209
    new-instance v15, La/fr6;

    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    move-object/from16 v20, v14

    .line 214
    .line 215
    invoke-direct/range {v15 .. v21}, La/fr6;-><init>(JLa/ouu;ILjava/util/Set;La/yje;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v7, v15}, La/aoq;->a(La/gmq;Lkotlin/jvm/functions/Function2;)La/utb;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    goto :goto_2

    .line 223
    :goto_3
    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const-string v4, "LoadSportsScenarioImpl.withRetry("

    .line 228
    .line 229
    const-string v5, ")"

    .line 230
    .line 231
    invoke-static {v4, v2, v5}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v13

    .line 235
    const-class v2, La/oqt0;

    .line 236
    .line 237
    const-class v4, Ljava/net/UnknownHostException;

    .line 238
    .line 239
    filled-new-array {v2, v4}, [Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v17

    .line 247
    const/16 v19, 0x0

    .line 248
    .line 249
    const/16 v20, 0x34

    .line 250
    .line 251
    const/4 v14, 0x5

    .line 252
    const-wide/16 v15, 0x0

    .line 253
    .line 254
    const/16 v18, 0x0

    .line 255
    .line 256
    invoke-static/range {v12 .. v20}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    iput-object v9, v0, La/mcj;->l:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object v9, v0, La/mcj;->m:Ljava/lang/Object;

    .line 263
    .line 264
    iput-byte v3, v0, La/mcj;->k:B

    .line 265
    .line 266
    invoke-static {v1, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    if-ne v0, v6, :cond_7

    .line 271
    .line 272
    :goto_4
    move-object v9, v6

    .line 273
    goto :goto_6

    .line 274
    :cond_7
    :goto_5
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    :goto_6
    return-object v9

    .line 277
    :pswitch_0
    check-cast v3, La/ncj;

    .line 278
    .line 279
    check-cast v5, La/kie0;

    .line 280
    .line 281
    sget-object v1, La/wne;->a:La/wne;

    .line 282
    .line 283
    iget-byte v10, v0, La/mcj;->k:B

    .line 284
    .line 285
    if-eqz v10, :cond_a

    .line 286
    .line 287
    if-eq v10, v8, :cond_9

    .line 288
    .line 289
    if-ne v10, v7, :cond_8

    .line 290
    .line 291
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_8
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_b

    .line 299
    .line 300
    :cond_9
    iget-object v4, v0, La/mcj;->m:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v4, La/kie0;

    .line 303
    .line 304
    iget-object v8, v0, La/mcj;->l:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v8, La/g0q;

    .line 307
    .line 308
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    move-object v10, v8

    .line 312
    move-object/from16 v8, p1

    .line 313
    .line 314
    goto :goto_7

    .line 315
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    iget-object v4, v0, La/mcj;->l:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v4, La/g0q;

    .line 321
    .line 322
    invoke-virtual {v3}, La/ncj;->c()La/mlx;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    iput-object v4, v0, La/mcj;->l:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v5, v0, La/mcj;->m:Ljava/lang/Object;

    .line 329
    .line 330
    iput-byte v8, v0, La/mcj;->k:B

    .line 331
    .line 332
    invoke-interface {v10, v0}, La/mlx;->e(La/mcj;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    if-ne v8, v1, :cond_b

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_b
    move-object v10, v4

    .line 340
    move-object v4, v5

    .line 341
    :goto_7
    check-cast v8, Ljava/lang/Number;

    .line 342
    .line 343
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v8

    .line 347
    iput v8, v4, La/kie0;->a:I

    .line 348
    .line 349
    iput-object v9, v0, La/mcj;->l:Ljava/lang/Object;

    .line 350
    .line 351
    iput-object v9, v0, La/mcj;->m:Ljava/lang/Object;

    .line 352
    .line 353
    iput-byte v7, v0, La/mcj;->k:B

    .line 354
    .line 355
    iget-object v4, v10, La/nzp;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 356
    .line 357
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-nez v4, :cond_10

    .line 362
    .line 363
    iget-object v4, v10, La/nzp;->a:Ljava/io/File;

    .line 364
    .line 365
    new-instance v7, La/bm4;

    .line 366
    .line 367
    invoke-direct {v7, v10, v6, v9}, La/bm4;-><init>(La/g0q;Ljava/lang/Object;La/yje;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v4, v7, v0}, La/sac;->l0(Ljava/io/File;Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    if-ne v4, v1, :cond_c

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    :goto_8
    if-ne v4, v1, :cond_d

    .line 380
    .line 381
    :goto_9
    move-object v9, v1

    .line 382
    goto :goto_b

    .line 383
    :cond_d
    :goto_a
    iget-boolean v0, v0, La/mcj;->j:Z

    .line 384
    .line 385
    if-eqz v0, :cond_f

    .line 386
    .line 387
    iget-object v0, v3, La/ncj;->h:La/ocj;

    .line 388
    .line 389
    new-instance v1, La/naj;

    .line 390
    .line 391
    if-eqz v6, :cond_e

    .line 392
    .line 393
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    :cond_e
    iget v3, v5, La/kie0;->a:I

    .line 398
    .line 399
    invoke-direct {v1, v2, v3, v6}, La/naj;-><init>(IILjava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v1}, La/ocj;->b(La/g7m0;)V

    .line 403
    .line 404
    .line 405
    :cond_f
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    goto :goto_b

    .line 408
    :cond_10
    const-string v0, "This scope has already been closed."

    .line 409
    .line 410
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    :goto_b
    return-object v9

    .line 414
    nop

    .line 415
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
