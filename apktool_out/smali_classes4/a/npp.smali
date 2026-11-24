.class public final La/npp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/io/Serializable;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/yje;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;ZZB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/npp;->i:B

    iput-object p2, p0, La/npp;->o:Ljava/lang/Object;

    iput-object p3, p0, La/npp;->p:Ljava/io/Serializable;

    iput-object p4, p0, La/npp;->q:Ljava/lang/Object;

    iput-boolean p5, p0, La/npp;->m:Z

    iput-boolean p6, p0, La/npp;->n:Z

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/npp;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/npp;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/npp;->p:Ljava/io/Serializable;

    .line 6
    .line 7
    iget-object v3, p0, La/npp;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, La/kmq;

    .line 10
    .line 11
    move-object v5, p3

    .line 12
    check-cast v5, La/yje;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance v4, La/npp;

    .line 18
    .line 19
    move-object v6, v3

    .line 20
    check-cast v6, La/v1v;

    .line 21
    .line 22
    move-object v7, v2

    .line 23
    check-cast v7, La/lie0;

    .line 24
    .line 25
    move-object v8, v1

    .line 26
    check-cast v8, La/hie0;

    .line 27
    .line 28
    iget-boolean v10, p0, La/npp;->n:Z

    .line 29
    .line 30
    const/4 v11, 0x2

    .line 31
    iget-boolean v9, p0, La/npp;->m:Z

    .line 32
    .line 33
    invoke-direct/range {v4 .. v11}, La/npp;-><init>(La/yje;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;ZZB)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v4, La/npp;->k:La/kmq;

    .line 37
    .line 38
    iput-object p2, v4, La/npp;->l:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {v4, p0}, La/npp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_0
    new-instance v4, La/npp;

    .line 48
    .line 49
    move-object v6, v3

    .line 50
    check-cast v6, La/f1v;

    .line 51
    .line 52
    move-object v7, v2

    .line 53
    check-cast v7, La/lie0;

    .line 54
    .line 55
    move-object v8, v1

    .line 56
    check-cast v8, La/hie0;

    .line 57
    .line 58
    iget-boolean v10, p0, La/npp;->n:Z

    .line 59
    .line 60
    const/4 v11, 0x1

    .line 61
    iget-boolean v9, p0, La/npp;->m:Z

    .line 62
    .line 63
    invoke-direct/range {v4 .. v11}, La/npp;-><init>(La/yje;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;ZZB)V

    .line 64
    .line 65
    .line 66
    iput-object p1, v4, La/npp;->k:La/kmq;

    .line 67
    .line 68
    iput-object p2, v4, La/npp;->l:Ljava/lang/Object;

    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {v4, p0}, La/npp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_1
    new-instance v4, La/npp;

    .line 78
    .line 79
    move-object v6, v3

    .line 80
    check-cast v6, La/pmi;

    .line 81
    .line 82
    move-object v7, v2

    .line 83
    check-cast v7, La/zos;

    .line 84
    .line 85
    move-object v8, v1

    .line 86
    check-cast v8, La/sgs;

    .line 87
    .line 88
    iget-boolean v10, p0, La/npp;->n:Z

    .line 89
    .line 90
    const/4 v11, 0x0

    .line 91
    iget-boolean v9, p0, La/npp;->m:Z

    .line 92
    .line 93
    invoke-direct/range {v4 .. v11}, La/npp;-><init>(La/yje;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;ZZB)V

    .line 94
    .line 95
    .line 96
    iput-object p1, v4, La/npp;->k:La/kmq;

    .line 97
    .line 98
    iput-object p2, v4, La/npp;->l:Ljava/lang/Object;

    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    invoke-virtual {v4, p0}, La/npp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
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
    iget-byte v1, v0, La/npp;->i:B

    .line 4
    .line 5
    iget-boolean v2, v0, La/npp;->n:Z

    .line 6
    .line 7
    iget-boolean v3, v0, La/npp;->m:Z

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    iget-object v5, v0, La/npp;->o:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/npp;->p:Ljava/io/Serializable;

    .line 14
    .line 15
    iget-object v7, v0, La/npp;->q:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x0

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v14, v7

    .line 23
    check-cast v14, La/hie0;

    .line 24
    .line 25
    move-object v13, v6

    .line 26
    check-cast v13, La/lie0;

    .line 27
    .line 28
    check-cast v5, La/v1v;

    .line 29
    .line 30
    sget-object v1, La/wne;->a:La/wne;

    .line 31
    .line 32
    iget-boolean v6, v0, La/npp;->j:Z

    .line 33
    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    if-ne v6, v8, :cond_0

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v4, v0, La/npp;->k:La/kmq;

    .line 50
    .line 51
    iget-object v6, v0, La/npp;->l:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, La/j0g0;

    .line 54
    .line 55
    iget-object v12, v6, La/j0g0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    instance-of v6, v12, La/g0g0;

    .line 58
    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    iget-object v6, v5, La/v1v;->b:La/w5z;

    .line 62
    .line 63
    sget-object v7, La/y9s;->b:La/y9s;

    .line 64
    .line 65
    invoke-virtual {v6, v7}, La/w5z;->s(La/y9s;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 71
    .line 72
    .line 73
    move-result-wide v10

    .line 74
    iput-wide v10, v13, La/lie0;->a:J

    .line 75
    .line 76
    iput-boolean v8, v14, La/hie0;->a:Z

    .line 77
    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    move-object v6, v9

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move-object v6, v12

    .line 83
    :goto_0
    check-cast v6, Ljava/util/List;

    .line 84
    .line 85
    if-nez v6, :cond_4

    .line 86
    .line 87
    sget-object v6, La/iun;->a:La/iun;

    .line 88
    .line 89
    :cond_4
    :goto_1
    iget-object v5, v5, La/v1v;->e:La/v7i;

    .line 90
    .line 91
    invoke-virtual {v5, v6, v3, v2}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    new-instance v10, La/e1v;

    .line 96
    .line 97
    const/4 v15, 0x1

    .line 98
    invoke-direct/range {v10 .. v15}, La/e1v;-><init>(La/acu;Ljava/lang/Object;La/lie0;La/hie0;B)V

    .line 99
    .line 100
    .line 101
    iput-object v9, v0, La/npp;->k:La/kmq;

    .line 102
    .line 103
    iput-object v9, v0, La/npp;->l:Ljava/lang/Object;

    .line 104
    .line 105
    iput-boolean v8, v0, La/npp;->j:Z

    .line 106
    .line 107
    invoke-static {v4, v10, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-ne v0, v1, :cond_5

    .line 112
    .line 113
    move-object v9, v1

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    :goto_2
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_3
    return-object v9

    .line 118
    :pswitch_0
    check-cast v7, La/hie0;

    .line 119
    .line 120
    check-cast v6, La/lie0;

    .line 121
    .line 122
    check-cast v5, La/f1v;

    .line 123
    .line 124
    sget-object v10, La/wne;->a:La/wne;

    .line 125
    .line 126
    iget-boolean v1, v0, La/npp;->j:Z

    .line 127
    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    if-ne v1, v8, :cond_6

    .line 131
    .line 132
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v11, v0, La/npp;->k:La/kmq;

    .line 144
    .line 145
    iget-object v1, v0, La/npp;->l:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v1, La/j0g0;

    .line 148
    .line 149
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    instance-of v4, v1, La/g0g0;

    .line 152
    .line 153
    if-eqz v4, :cond_8

    .line 154
    .line 155
    iget-object v4, v5, La/f1v;->a:La/w5z;

    .line 156
    .line 157
    sget-object v12, La/y9s;->a:La/y9s;

    .line 158
    .line 159
    invoke-virtual {v4, v12}, La/w5z;->s(La/y9s;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    goto :goto_5

    .line 164
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 165
    .line 166
    .line 167
    move-result-wide v12

    .line 168
    iput-wide v12, v6, La/lie0;->a:J

    .line 169
    .line 170
    iput-boolean v8, v7, La/hie0;->a:Z

    .line 171
    .line 172
    if-eqz v4, :cond_9

    .line 173
    .line 174
    move-object v4, v9

    .line 175
    goto :goto_4

    .line 176
    :cond_9
    move-object v4, v1

    .line 177
    :goto_4
    check-cast v4, Ljava/util/List;

    .line 178
    .line 179
    if-nez v4, :cond_a

    .line 180
    .line 181
    sget-object v4, La/iun;->a:La/iun;

    .line 182
    .line 183
    :cond_a
    :goto_5
    iget-object v5, v5, La/f1v;->e:La/v7i;

    .line 184
    .line 185
    invoke-virtual {v5, v4, v3, v2}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move-object v3, v1

    .line 190
    new-instance v1, La/e1v;

    .line 191
    .line 192
    move-object v4, v6

    .line 193
    const/4 v6, 0x0

    .line 194
    move-object v5, v7

    .line 195
    invoke-direct/range {v1 .. v6}, La/e1v;-><init>(La/acu;Ljava/lang/Object;La/lie0;La/hie0;B)V

    .line 196
    .line 197
    .line 198
    iput-object v9, v0, La/npp;->k:La/kmq;

    .line 199
    .line 200
    iput-object v9, v0, La/npp;->l:Ljava/lang/Object;

    .line 201
    .line 202
    iput-boolean v8, v0, La/npp;->j:Z

    .line 203
    .line 204
    invoke-static {v11, v1, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-ne v0, v10, :cond_b

    .line 209
    .line 210
    move-object v9, v10

    .line 211
    goto :goto_7

    .line 212
    :cond_b
    :goto_6
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    :goto_7
    return-object v9

    .line 215
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 216
    .line 217
    iget-boolean v2, v0, La/npp;->j:Z

    .line 218
    .line 219
    if-eqz v2, :cond_d

    .line 220
    .line 221
    if-ne v2, v8, :cond_c

    .line 222
    .line 223
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_9

    .line 227
    .line 228
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_a

    .line 232
    .line 233
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    iget-object v2, v0, La/npp;->k:La/kmq;

    .line 237
    .line 238
    iget-object v3, v0, La/npp;->l:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v3, Ljava/lang/Number;

    .line 241
    .line 242
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 243
    .line 244
    .line 245
    move-result-wide v13

    .line 246
    check-cast v5, La/pmi;

    .line 247
    .line 248
    iget-object v3, v5, La/pmi;->b:Ljava/lang/Object;

    .line 249
    .line 250
    move-object v11, v3

    .line 251
    check-cast v11, La/ros;

    .line 252
    .line 253
    move-object v15, v6

    .line 254
    check-cast v15, La/zos;

    .line 255
    .line 256
    move-object v12, v7

    .line 257
    check-cast v12, La/sgs;

    .line 258
    .line 259
    iget-object v3, v5, La/pmi;->d:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v3, La/j1q0;

    .line 262
    .line 263
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 264
    .line 265
    invoke-virtual {v3}, La/m1q0;->j()Z

    .line 266
    .line 267
    .line 268
    move-result v17

    .line 269
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v3, v11, La/ros;->c:La/knf0;

    .line 279
    .line 280
    invoke-virtual {v3}, La/knf0;->d()La/lnf0;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    const-wide/16 v5, -0x1a

    .line 289
    .line 290
    cmp-long v5, v13, v5

    .line 291
    .line 292
    if-eqz v5, :cond_e

    .line 293
    .line 294
    goto :goto_8

    .line 295
    :cond_e
    move-object v4, v9

    .line 296
    :goto_8
    invoke-static {v3, v12, v15, v4}, La/n7x;->u(La/lnf0;La/sgs;La/zos;Ljava/lang/Long;)La/jo20;

    .line 297
    .line 298
    .line 299
    move-result-object v16

    .line 300
    new-instance v20, La/hie0;

    .line 301
    .line 302
    invoke-direct/range {v20 .. v20}, Ljava/lang/Object;-><init>()V

    .line 303
    .line 304
    .line 305
    iget-object v3, v11, La/ros;->b:La/zks;

    .line 306
    .line 307
    iget-object v3, v3, La/zks;->d:La/or30;

    .line 308
    .line 309
    invoke-virtual {v11, v15}, La/ros;->a(La/zos;)J

    .line 310
    .line 311
    .line 312
    move-result-wide v22

    .line 313
    new-instance v25, La/los;

    .line 314
    .line 315
    const/16 v21, 0x0

    .line 316
    .line 317
    iget-boolean v4, v0, La/npp;->m:Z

    .line 318
    .line 319
    iget-boolean v5, v0, La/npp;->n:Z

    .line 320
    .line 321
    move/from16 v18, v4

    .line 322
    .line 323
    move/from16 v19, v5

    .line 324
    .line 325
    move-object/from16 v10, v25

    .line 326
    .line 327
    invoke-direct/range {v10 .. v21}, La/los;-><init>(La/ros;La/sgs;JLa/zos;La/jo20;ZZZLa/hie0;La/yje;)V

    .line 328
    .line 329
    .line 330
    move-object/from16 v4, v20

    .line 331
    .line 332
    const/16 v26, 0xfc

    .line 333
    .line 334
    const/16 v24, 0x0

    .line 335
    .line 336
    move-object/from16 v21, v3

    .line 337
    .line 338
    invoke-static/range {v21 .. v26}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    new-instance v5, La/gr0;

    .line 343
    .line 344
    invoke-direct {v5, v3, v4, v13, v14}, La/gr0;-><init>(La/vsg0;La/hie0;J)V

    .line 345
    .line 346
    .line 347
    new-instance v3, La/rj;

    .line 348
    .line 349
    const/16 v4, 0x1d

    .line 350
    .line 351
    invoke-direct {v3, v15, v9, v4}, La/rj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 352
    .line 353
    .line 354
    new-instance v4, La/dnq;

    .line 355
    .line 356
    invoke-direct {v4, v5, v3, v8}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 357
    .line 358
    .line 359
    iput-object v9, v0, La/npp;->k:La/kmq;

    .line 360
    .line 361
    iput-object v9, v0, La/npp;->l:Ljava/lang/Object;

    .line 362
    .line 363
    iput-boolean v8, v0, La/npp;->j:Z

    .line 364
    .line 365
    invoke-static {v2, v4, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-ne v0, v1, :cond_f

    .line 370
    .line 371
    move-object v9, v1

    .line 372
    goto :goto_a

    .line 373
    :cond_f
    :goto_9
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    :goto_a
    return-object v9

    .line 376
    nop

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
