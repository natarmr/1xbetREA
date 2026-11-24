.class public final La/ebt;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Z

.field public l:B

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ha20;La/nw40;ZILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/ebt;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/ebt;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/ebt;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, La/ebt;->k:Z

    .line 9
    .line 10
    iput-byte p4, p0, La/ebt;->l:B

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

.method public constructor <init>(ZLa/pbt;ZLa/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/ebt;->i:B

    .line 17
    iput-boolean p1, p0, La/ebt;->j:Z

    iput-object p2, p0, La/ebt;->n:Ljava/lang/Object;

    iput-boolean p3, p0, La/ebt;->k:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ebt;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ebt;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/ebt;

    .line 9
    .line 10
    iget-object p1, p0, La/ebt;->m:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, La/ha20;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, La/nw40;

    .line 17
    .line 18
    iget-boolean v5, p0, La/ebt;->k:Z

    .line 19
    .line 20
    iget-byte v6, p0, La/ebt;->l:B

    .line 21
    .line 22
    move-object v7, p2

    .line 23
    invoke-direct/range {v2 .. v7}, La/ebt;-><init>(La/ha20;La/nw40;ZILa/yje;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    move-object v7, p2

    .line 28
    new-instance p2, La/ebt;

    .line 29
    .line 30
    iget-boolean v0, p0, La/ebt;->j:Z

    .line 31
    .line 32
    check-cast v1, La/pbt;

    .line 33
    .line 34
    iget-boolean p0, p0, La/ebt;->k:Z

    .line 35
    .line 36
    invoke-direct {p2, v0, v1, p0, v7}, La/ebt;-><init>(ZLa/pbt;ZLa/yje;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p2, La/ebt;->m:Ljava/lang/Object;

    .line 40
    .line 41
    return-object p2

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ebt;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ebt;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ebt;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ebt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ebt;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ebt;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ebt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ebt;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/ebt;->n:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, La/nw40;

    .line 15
    .line 16
    iget-object v1, v0, La/ebt;->m:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v8, v1

    .line 19
    check-cast v8, La/ha20;

    .line 20
    .line 21
    iget-object v1, v8, La/ha20;->d:La/knf0;

    .line 22
    .line 23
    sget-object v14, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-boolean v6, v0, La/ebt;->j:Z

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    if-ne v6, v3, :cond_0

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object/from16 v14, p1

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object v14, v5

    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v17

    .line 55
    iget-object v2, v8, La/ha20;->a:La/abu;

    .line 56
    .line 57
    iget-object v5, v8, La/ha20;->b:La/btt0;

    .line 58
    .line 59
    invoke-virtual {v5}, La/btt0;->a()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v1}, La/knf0;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v16

    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v6, La/q4f;->c:La/q4f;

    .line 74
    .line 75
    invoke-virtual {v6}, La/q4f;->a()I

    .line 76
    .line 77
    .line 78
    move-result v15

    .line 79
    iget-object v6, v4, La/nw40;->c:Ljava/util/List;

    .line 80
    .line 81
    iget-object v7, v4, La/nw40;->c:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, La/ouj0;

    .line 88
    .line 89
    if-eqz v6, :cond_2

    .line 90
    .line 91
    iget v6, v6, La/ouj0;->g:I

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    const/4 v6, 0x0

    .line 95
    :goto_0
    new-instance v23, La/yw10;

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    const/16 v13, 0x11

    .line 99
    .line 100
    move-object/from16 v19, v7

    .line 101
    .line 102
    const/4 v7, 0x1

    .line 103
    const-class v9, La/ha20;

    .line 104
    .line 105
    const-string v10, "createEventSign"

    .line 106
    .line 107
    const-string v11, "createEventSign(Lorg/xplatform/betting/core/make_bet/domain/model/SimpleBetDataModel;)Ljava/lang/String;"

    .line 108
    .line 109
    move v3, v6

    .line 110
    move-object/from16 v6, v23

    .line 111
    .line 112
    invoke-direct/range {v6 .. v13}, La/yw10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    const/16 v24, 0x1e

    .line 116
    .line 117
    const-string v20, "##"

    .line 118
    .line 119
    const/16 v21, 0x0

    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    invoke-static/range {v19 .. v24}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    move-object/from16 v7, v19

    .line 128
    .line 129
    invoke-static/range {v17 .. v18}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v9, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    iget-wide v9, v4, La/nw40;->b:J

    .line 150
    .line 151
    new-instance v11, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v11, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string v6, "_"

    .line 157
    .line 158
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-static {v3, v15, v6, v6, v11}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-static {v3}, La/kcx;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v19

    .line 181
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v20

    .line 185
    iget-byte v1, v0, La/ebt;->l:B

    .line 186
    .line 187
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-wide v8, v4, La/nw40;->a:J

    .line 191
    .line 192
    iget-wide v10, v4, La/nw40;->b:J

    .line 193
    .line 194
    invoke-static/range {v17 .. v18}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v25

    .line 198
    new-instance v3, Ljava/util/ArrayList;

    .line 199
    .line 200
    const/16 v6, 0xa

    .line 201
    .line 202
    invoke-static {v7, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 207
    .line 208
    .line 209
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-eqz v7, :cond_3

    .line 218
    .line 219
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    move-object v15, v7

    .line 224
    check-cast v15, La/ouj0;

    .line 225
    .line 226
    const/16 v22, 0x0

    .line 227
    .line 228
    iget-boolean v7, v0, La/ebt;->k:Z

    .line 229
    .line 230
    move/from16 v23, v1

    .line 231
    .line 232
    move/from16 v21, v7

    .line 233
    .line 234
    invoke-static/range {v15 .. v23}, La/lv00;->W(La/ouj0;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZI)La/zt6;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move/from16 v1, v23

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_3
    iget-object v1, v4, La/nw40;->d:Ljava/lang/String;

    .line 245
    .line 246
    move-object/from16 v26, v19

    .line 247
    .line 248
    new-instance v19, La/qw40;

    .line 249
    .line 250
    move-object/from16 v29, v1

    .line 251
    .line 252
    move-object/from16 v28, v3

    .line 253
    .line 254
    move-wide/from16 v22, v10

    .line 255
    .line 256
    move-object/from16 v24, v16

    .line 257
    .line 258
    move-object/from16 v27, v20

    .line 259
    .line 260
    move-wide/from16 v20, v8

    .line 261
    .line 262
    invoke-direct/range {v19 .. v29}, La/qw40;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    move-object/from16 v1, v19

    .line 266
    .line 267
    const/4 v3, 0x1

    .line 268
    iput-boolean v3, v0, La/ebt;->j:Z

    .line 269
    .line 270
    invoke-virtual {v2}, La/abu;->m()La/m520;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-interface {v2, v5, v1, v0}, La/m520;->d(Ljava/lang/String;La/qw40;La/yje;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-ne v0, v14, :cond_4

    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_4
    move-object v14, v0

    .line 282
    :goto_2
    return-object v14

    .line 283
    :pswitch_0
    check-cast v4, La/pbt;

    .line 284
    .line 285
    iget-object v1, v4, La/pbt;->f:La/r2t;

    .line 286
    .line 287
    iget-object v3, v0, La/ebt;->m:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v3, La/vne;

    .line 290
    .line 291
    sget-object v6, La/wne;->a:La/wne;

    .line 292
    .line 293
    iget-byte v7, v0, La/ebt;->l:B

    .line 294
    .line 295
    const/4 v8, 0x2

    .line 296
    if-eqz v7, :cond_7

    .line 297
    .line 298
    const/4 v9, 0x1

    .line 299
    if-eq v7, v9, :cond_6

    .line 300
    .line 301
    if-ne v7, v8, :cond_5

    .line 302
    .line 303
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    move-object/from16 v0, p1

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    iget-boolean v2, v0, La/ebt;->j:Z

    .line 321
    .line 322
    if-eqz v2, :cond_8

    .line 323
    .line 324
    iget-object v2, v4, La/pbt;->l:La/pru;

    .line 325
    .line 326
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    iget-object v2, v2, La/sff0;->d:La/q1w0;

    .line 331
    .line 332
    iget-boolean v2, v2, La/q1w0;->b:Z

    .line 333
    .line 334
    if-nez v2, :cond_8

    .line 335
    .line 336
    sget-object v5, La/iun;->a:La/iun;

    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_8
    iget-object v2, v1, La/r2t;->a:La/p7m0;

    .line 340
    .line 341
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    if-eqz v2, :cond_a

    .line 346
    .line 347
    iput-object v5, v0, La/ebt;->m:Ljava/lang/Object;

    .line 348
    .line 349
    const/4 v3, 0x1

    .line 350
    iput-byte v3, v0, La/ebt;->l:B

    .line 351
    .line 352
    invoke-virtual {v1, v0}, La/r2t;->a(La/zje;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-ne v0, v6, :cond_9

    .line 357
    .line 358
    goto :goto_4

    .line 359
    :cond_9
    :goto_3
    iget-object v0, v4, La/pbt;->d:La/p2t;

    .line 360
    .line 361
    invoke-virtual {v0}, La/p2t;->a()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    if-nez v5, :cond_c

    .line 366
    .line 367
    sget-object v5, La/iun;->a:La/iun;

    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_a
    new-instance v1, La/lv;

    .line 371
    .line 372
    iget-boolean v2, v0, La/ebt;->k:Z

    .line 373
    .line 374
    invoke-direct {v1, v2, v4, v5}, La/lv;-><init>(ZLa/pbt;La/yje;)V

    .line 375
    .line 376
    .line 377
    const/4 v2, 0x3

    .line 378
    invoke-static {v3, v5, v1, v2}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    new-instance v2, La/xat;

    .line 383
    .line 384
    invoke-direct {v2, v4, v8}, La/xat;-><init>(La/pbt;B)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v2}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 388
    .line 389
    .line 390
    iput-object v5, v0, La/ebt;->m:Ljava/lang/Object;

    .line 391
    .line 392
    iput-byte v8, v0, La/ebt;->l:B

    .line 393
    .line 394
    invoke-virtual {v1, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-ne v0, v6, :cond_b

    .line 399
    .line 400
    :goto_4
    move-object v5, v6

    .line 401
    goto :goto_6

    .line 402
    :cond_b
    :goto_5
    move-object v5, v0

    .line 403
    check-cast v5, Ljava/util/List;

    .line 404
    .line 405
    :cond_c
    :goto_6
    return-object v5

    .line 406
    nop

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
