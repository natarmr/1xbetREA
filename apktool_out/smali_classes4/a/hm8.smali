.class public final La/hm8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:J

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/jm8;Ljava/lang/String;JLa/csr;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/hm8;->i:B

    .line 21
    iput-object p1, p0, La/hm8;->p:Ljava/lang/Object;

    iput-object p2, p0, La/hm8;->o:Ljava/lang/Object;

    iput-wide p3, p0, La/hm8;->k:J

    iput-object p5, p0, La/hm8;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/t33;La/t33;La/zsf;La/t33;La/t33;JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/hm8;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/hm8;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/hm8;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/hm8;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/hm8;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/hm8;->q:Ljava/lang/Object;

    .line 13
    .line 14
    iput-wide p6, p0, La/hm8;->k:J

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    iget-byte v0, p0, La/hm8;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/hm8;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/hm8;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/hm8;->o:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, La/hm8;

    .line 13
    .line 14
    iget-object v0, p0, La/hm8;->m:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v5, v0

    .line 17
    check-cast v5, La/t33;

    .line 18
    .line 19
    iget-object v0, p0, La/hm8;->n:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v6, v0

    .line 22
    check-cast v6, La/t33;

    .line 23
    .line 24
    move-object v7, v3

    .line 25
    check-cast v7, La/zsf;

    .line 26
    .line 27
    move-object v8, v2

    .line 28
    check-cast v8, La/t33;

    .line 29
    .line 30
    move-object v9, v1

    .line 31
    check-cast v9, La/t33;

    .line 32
    .line 33
    iget-wide v10, p0, La/hm8;->k:J

    .line 34
    .line 35
    move-object v12, p2

    .line 36
    invoke-direct/range {v4 .. v12}, La/hm8;-><init>(La/t33;La/t33;La/zsf;La/t33;La/t33;JLa/yje;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, v4, La/hm8;->l:Ljava/lang/Object;

    .line 40
    .line 41
    return-object v4

    .line 42
    :pswitch_0
    move-object v11, p2

    .line 43
    new-instance v5, La/hm8;

    .line 44
    .line 45
    move-object v6, v2

    .line 46
    check-cast v6, La/jm8;

    .line 47
    .line 48
    move-object v7, v3

    .line 49
    check-cast v7, Ljava/lang/String;

    .line 50
    .line 51
    iget-wide v8, p0, La/hm8;->k:J

    .line 52
    .line 53
    move-object v10, v1

    .line 54
    check-cast v10, La/csr;

    .line 55
    .line 56
    invoke-direct/range {v5 .. v11}, La/hm8;-><init>(La/jm8;Ljava/lang/String;JLa/csr;La/yje;)V

    .line 57
    .line 58
    .line 59
    return-object v5

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hm8;->i:B

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
    invoke-virtual {p0, p1, p2}, La/hm8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hm8;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hm8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/hm8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/hm8;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/hm8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hm8;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/hm8;->p:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x2

    .line 12
    iget-object v7, v0, La/hm8;->o:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v8, 0x3

    .line 15
    iget-object v9, v0, La/hm8;->q:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object v15, v7

    .line 22
    check-cast v15, La/zsf;

    .line 23
    .line 24
    iget-object v1, v0, La/hm8;->n:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/t33;

    .line 27
    .line 28
    iget-object v7, v0, La/hm8;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, La/vne;

    .line 31
    .line 32
    sget-object v11, La/wne;->a:La/wne;

    .line 33
    .line 34
    iget-byte v12, v0, La/hm8;->j:B

    .line 35
    .line 36
    const/high16 v13, 0x3f800000    # 1.0f

    .line 37
    .line 38
    if-eqz v12, :cond_2

    .line 39
    .line 40
    if-eq v12, v5, :cond_1

    .line 41
    .line 42
    if-ne v12, v6, :cond_0

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v4, v0, La/hm8;->m:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, La/t33;

    .line 62
    .line 63
    new-instance v12, Ljava/lang/Float;

    .line 64
    .line 65
    invoke-direct {v12, v13}, Ljava/lang/Float;-><init>(F)V

    .line 66
    .line 67
    .line 68
    iput-object v7, v0, La/hm8;->l:Ljava/lang/Object;

    .line 69
    .line 70
    iput-byte v5, v0, La/hm8;->j:B

    .line 71
    .line 72
    invoke-virtual {v4, v0, v12}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    if-ne v4, v11, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    :goto_0
    new-instance v4, Ljava/lang/Float;

    .line 80
    .line 81
    invoke-direct {v4, v13}, Ljava/lang/Float;-><init>(F)V

    .line 82
    .line 83
    .line 84
    iput-object v7, v0, La/hm8;->l:Ljava/lang/Object;

    .line 85
    .line 86
    iput-byte v6, v0, La/hm8;->j:B

    .line 87
    .line 88
    invoke-virtual {v1, v0, v4}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-ne v4, v11, :cond_4

    .line 93
    .line 94
    :goto_1
    move-object v10, v11

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    :goto_2
    new-instance v4, La/pxn;

    .line 97
    .line 98
    invoke-direct {v4, v1, v15, v10, v3}, La/pxn;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v7, v10, v10, v4, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 102
    .line 103
    .line 104
    new-instance v1, La/pxn;

    .line 105
    .line 106
    check-cast v2, La/t33;

    .line 107
    .line 108
    const/4 v3, 0x6

    .line 109
    invoke-direct {v1, v2, v15, v10, v3}, La/pxn;-><init>(La/t33;La/zsf;La/yje;B)V

    .line 110
    .line 111
    .line 112
    invoke-static {v7, v10, v10, v1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 113
    .line 114
    .line 115
    new-instance v11, La/oxn;

    .line 116
    .line 117
    move-object v12, v9

    .line 118
    check-cast v12, La/t33;

    .line 119
    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    const/16 v17, 0x4

    .line 123
    .line 124
    iget-wide v13, v0, La/hm8;->k:J

    .line 125
    .line 126
    invoke-direct/range {v11 .. v17}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {v7, v10, v10, v11, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 130
    .line 131
    .line 132
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    :goto_3
    return-object v10

    .line 135
    :pswitch_0
    move-object v1, v9

    .line 136
    check-cast v1, La/csr;

    .line 137
    .line 138
    move-object v11, v2

    .line 139
    check-cast v11, La/jm8;

    .line 140
    .line 141
    sget-object v2, La/wne;->a:La/wne;

    .line 142
    .line 143
    iget-byte v12, v0, La/hm8;->j:B

    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const/4 v14, 0x4

    .line 147
    move-object v15, v11

    .line 148
    iget-wide v10, v0, La/hm8;->k:J

    .line 149
    .line 150
    if-eqz v12, :cond_a

    .line 151
    .line 152
    if-eq v12, v5, :cond_9

    .line 153
    .line 154
    if-eq v12, v6, :cond_8

    .line 155
    .line 156
    if-eq v12, v8, :cond_7

    .line 157
    .line 158
    if-eq v12, v14, :cond_6

    .line 159
    .line 160
    if-ne v12, v3, :cond_5

    .line 161
    .line 162
    iget-object v1, v0, La/hm8;->n:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v1, Ljava/lang/String;

    .line 165
    .line 166
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    move-object v7, v1

    .line 170
    move-object/from16 v1, p1

    .line 171
    .line 172
    goto/16 :goto_11

    .line 173
    .line 174
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const/4 v10, 0x0

    .line 178
    goto/16 :goto_14

    .line 179
    .line 180
    :cond_6
    iget-object v1, v0, La/hm8;->n:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v1, Ljava/lang/String;

    .line 183
    .line 184
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-wide v3, v10

    .line 188
    move-object v11, v1

    .line 189
    move-object/from16 v1, p1

    .line 190
    .line 191
    goto/16 :goto_f

    .line 192
    .line 193
    :cond_7
    iget-object v4, v0, La/hm8;->n:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v4, Ljava/lang/String;

    .line 196
    .line 197
    iget-object v5, v0, La/hm8;->m:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v5, La/a570;

    .line 200
    .line 201
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    move-wide/from16 v19, v10

    .line 205
    .line 206
    move-object v11, v4

    .line 207
    move-wide/from16 v3, v19

    .line 208
    .line 209
    move v6, v14

    .line 210
    goto/16 :goto_b

    .line 211
    .line 212
    :cond_8
    iget-object v4, v0, La/hm8;->l:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v4, La/lz60;

    .line 215
    .line 216
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v5, p1

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    move-object/from16 v4, p1

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    iget-object v4, v15, La/jm8;->z:La/lbu;

    .line 232
    .line 233
    iput-byte v5, v0, La/hm8;->j:B

    .line 234
    .line 235
    invoke-static {v4, v13, v0, v8}, La/lbu;->k(La/lbu;ILa/yje;I)Ljava/io/Serializable;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    if-ne v4, v2, :cond_b

    .line 240
    .line 241
    goto/16 :goto_10

    .line 242
    .line 243
    :cond_b
    :goto_4
    check-cast v4, Ljava/lang/Iterable;

    .line 244
    .line 245
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-eqz v5, :cond_d

    .line 254
    .line 255
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    move-object v12, v5

    .line 260
    check-cast v12, La/pbv;

    .line 261
    .line 262
    iget-wide v13, v12, La/pbv;->a:J

    .line 263
    .line 264
    cmp-long v12, v13, v10

    .line 265
    .line 266
    if-nez v12, :cond_c

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_c
    const/4 v13, 0x0

    .line 270
    const/4 v14, 0x4

    .line 271
    goto :goto_5

    .line 272
    :cond_d
    const/4 v5, 0x0

    .line 273
    :goto_6
    check-cast v5, La/pbv;

    .line 274
    .line 275
    if-eqz v5, :cond_e

    .line 276
    .line 277
    iget-object v4, v5, La/pbv;->n:La/hds;

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_e
    const/4 v4, 0x0

    .line 281
    :goto_7
    if-eqz v4, :cond_f

    .line 282
    .line 283
    check-cast v7, Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v4, v7}, La/hds;->a(Ljava/lang/String;)La/lz60;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    if-nez v4, :cond_10

    .line 290
    .line 291
    :cond_f
    sget-object v4, La/jz60;->a:La/jz60;

    .line 292
    .line 293
    :cond_10
    iget-object v5, v15, La/jm8;->A:La/ycu;

    .line 294
    .line 295
    iput-object v4, v0, La/hm8;->l:Ljava/lang/Object;

    .line 296
    .line 297
    iput-byte v6, v0, La/hm8;->j:B

    .line 298
    .line 299
    invoke-virtual {v5, v10, v11, v0}, La/ycu;->a(JLa/zje;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    if-ne v5, v2, :cond_11

    .line 304
    .line 305
    goto/16 :goto_10

    .line 306
    .line 307
    :cond_11
    :goto_8
    check-cast v5, La/a570;

    .line 308
    .line 309
    sget-object v6, La/a570;->Companion:La/t470;

    .line 310
    .line 311
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    instance-of v6, v5, La/z470;

    .line 318
    .line 319
    if-eqz v6, :cond_12

    .line 320
    .line 321
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    goto :goto_9

    .line 330
    :cond_12
    const-string v6, ""

    .line 331
    .line 332
    :goto_9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v15}, La/i3t0;->D()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    check-cast v7, La/kl8;

    .line 340
    .line 341
    iget-object v14, v7, La/kl8;->d:La/je8;

    .line 342
    .line 343
    invoke-virtual {v15}, La/i3t0;->D()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    check-cast v7, La/kl8;

    .line 348
    .line 349
    iget-object v7, v7, La/kl8;->c:La/w3t;

    .line 350
    .line 351
    iget-object v12, v1, La/csr;->a:La/bsr;

    .line 352
    .line 353
    iget-object v12, v12, La/bsr;->a:La/esr;

    .line 354
    .line 355
    invoke-virtual {v12}, La/esr;->b()Z

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    if-eqz v12, :cond_13

    .line 360
    .line 361
    sget-object v12, La/fc8;->a:La/fc8;

    .line 362
    .line 363
    move-object/from16 v18, v12

    .line 364
    .line 365
    goto :goto_a

    .line 366
    :cond_13
    const/16 v18, 0x0

    .line 367
    .line 368
    :goto_a
    iget-wide v12, v0, La/hm8;->k:J

    .line 369
    .line 370
    move-object/from16 v17, v4

    .line 371
    .line 372
    move-object/from16 v16, v6

    .line 373
    .line 374
    move-wide v3, v10

    .line 375
    move-object v11, v15

    .line 376
    const/4 v6, 0x4

    .line 377
    move-object v15, v7

    .line 378
    invoke-virtual/range {v11 .. v18}, La/jm8;->R(JLa/je8;La/w3t;Ljava/lang/String;La/lz60;La/fc8;)V

    .line 379
    .line 380
    .line 381
    move-object v15, v11

    .line 382
    move-object/from16 v11, v16

    .line 383
    .line 384
    iget-object v12, v15, La/jm8;->q:La/ls;

    .line 385
    .line 386
    const/4 v13, 0x0

    .line 387
    iput-object v13, v0, La/hm8;->l:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v5, v0, La/hm8;->m:Ljava/lang/Object;

    .line 390
    .line 391
    iput-object v11, v0, La/hm8;->n:Ljava/lang/Object;

    .line 392
    .line 393
    iput-byte v8, v0, La/hm8;->j:B

    .line 394
    .line 395
    invoke-virtual {v12, v3, v4, v0}, La/ls;->b(JLa/yje;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    if-ne v8, v2, :cond_14

    .line 400
    .line 401
    goto/16 :goto_10

    .line 402
    .line 403
    :cond_14
    :goto_b
    if-eqz v5, :cond_1b

    .line 404
    .line 405
    instance-of v8, v5, La/w470;

    .line 406
    .line 407
    if-eqz v8, :cond_16

    .line 408
    .line 409
    invoke-static {v6, v3, v4, v1}, La/jtv;->M0(IJLa/csr;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-eqz v0, :cond_1a

    .line 414
    .line 415
    iget-object v1, v15, La/jm8;->P:La/i1w0;

    .line 416
    .line 417
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 422
    .line 423
    if-eqz v3, :cond_15

    .line 424
    .line 425
    new-instance v3, La/e1w0;

    .line 426
    .line 427
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 428
    .line 429
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 430
    .line 431
    .line 432
    new-instance v0, La/c8d;

    .line 433
    .line 434
    sget-object v4, La/y7d;->a:La/v7d;

    .line 435
    .line 436
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    :goto_c
    const/4 v10, 0x0

    .line 443
    goto :goto_d

    .line 444
    :cond_15
    new-instance v3, La/w0w0;

    .line 445
    .line 446
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 447
    .line 448
    .line 449
    new-instance v0, La/c8d;

    .line 450
    .line 451
    sget-object v4, La/y7d;->a:La/v7d;

    .line 452
    .line 453
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    goto :goto_c

    .line 460
    :goto_d
    invoke-static {v1, v2, v10}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    :goto_e
    move-object v2, v0

    .line 465
    check-cast v2, La/paw;

    .line 466
    .line 467
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    if-eqz v3, :cond_1a

    .line 472
    .line 473
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    check-cast v2, La/oe50;

    .line 478
    .line 479
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 480
    .line 481
    .line 482
    goto :goto_e

    .line 483
    :cond_16
    instance-of v1, v5, La/z470;

    .line 484
    .line 485
    if-eqz v1, :cond_1b

    .line 486
    .line 487
    iget-object v1, v15, La/jm8;->r:La/p4u;

    .line 488
    .line 489
    const/4 v13, 0x0

    .line 490
    iput-object v13, v0, La/hm8;->l:Ljava/lang/Object;

    .line 491
    .line 492
    iput-object v13, v0, La/hm8;->m:Ljava/lang/Object;

    .line 493
    .line 494
    iput-object v11, v0, La/hm8;->n:Ljava/lang/Object;

    .line 495
    .line 496
    iput-byte v6, v0, La/hm8;->j:B

    .line 497
    .line 498
    invoke-virtual {v1, v0}, La/p4u;->e(La/zje;)Ljava/io/Serializable;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    if-ne v1, v2, :cond_17

    .line 503
    .line 504
    goto :goto_10

    .line 505
    :cond_17
    :goto_f
    check-cast v1, Ljava/util/List;

    .line 506
    .line 507
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    if-eqz v1, :cond_18

    .line 512
    .line 513
    sget v0, La/jm8;->V:I

    .line 514
    .line 515
    sget-object v0, La/el8;->a:La/el8;

    .line 516
    .line 517
    invoke-virtual {v15, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    goto :goto_13

    .line 521
    :cond_18
    iget-object v1, v15, La/jm8;->B:La/dcu;

    .line 522
    .line 523
    const/4 v13, 0x0

    .line 524
    iput-object v13, v0, La/hm8;->l:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v13, v0, La/hm8;->m:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v11, v0, La/hm8;->n:Ljava/lang/Object;

    .line 529
    .line 530
    const/4 v7, 0x5

    .line 531
    iput-byte v7, v0, La/hm8;->j:B

    .line 532
    .line 533
    invoke-virtual {v1, v3, v4, v0}, La/dcu;->a(JLa/zje;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    if-ne v1, v2, :cond_19

    .line 538
    .line 539
    :goto_10
    move-object v10, v2

    .line 540
    goto :goto_14

    .line 541
    :cond_19
    move-object v7, v11

    .line 542
    :goto_11
    check-cast v1, Ljava/lang/Boolean;

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 545
    .line 546
    .line 547
    move-result v6

    .line 548
    iget-object v1, v15, La/jm8;->P:La/i1w0;

    .line 549
    .line 550
    move-object v5, v9

    .line 551
    check-cast v5, La/csr;

    .line 552
    .line 553
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 554
    .line 555
    .line 556
    move-result-object v9

    .line 557
    iget-object v2, v15, La/jm8;->D:La/uxs0;

    .line 558
    .line 559
    const/4 v8, 0x4

    .line 560
    iget-wide v3, v0, La/hm8;->k:J

    .line 561
    .line 562
    invoke-static/range {v2 .. v8}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-virtual {v9, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 567
    .line 568
    .line 569
    iget-object v0, v9, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 570
    .line 571
    const/4 v10, 0x0

    .line 572
    invoke-static {v1, v0, v10}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    :goto_12
    move-object v2, v0

    .line 577
    check-cast v2, La/paw;

    .line 578
    .line 579
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    if-eqz v3, :cond_1a

    .line 584
    .line 585
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    check-cast v2, La/oe50;

    .line 590
    .line 591
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 592
    .line 593
    .line 594
    goto :goto_12

    .line 595
    :cond_1a
    :goto_13
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 596
    .line 597
    goto :goto_14

    .line 598
    :cond_1b
    const/4 v13, 0x0

    .line 599
    invoke-static {}, La/t9f;->b()V

    .line 600
    .line 601
    .line 602
    move-object v10, v13

    .line 603
    :goto_14
    return-object v10

    .line 604
    nop

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
