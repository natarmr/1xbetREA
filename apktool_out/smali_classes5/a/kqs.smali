.class public final La/kqs;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:J

.field public k:B

.field public l:Z

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/g7c0;ZLjava/lang/String;Ljava/lang/String;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/kqs;->i:B

    .line 19
    iput-object p1, p0, La/kqs;->o:Ljava/lang/Object;

    iput-boolean p2, p0, La/kqs;->l:Z

    iput-object p3, p0, La/kqs;->p:Ljava/lang/Object;

    iput-object p4, p0, La/kqs;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/i2o;Lkotlin/jvm/functions/Function0;JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/kqs;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/kqs;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/kqs;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/kqs;->p:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/kqs;->q:Ljava/lang/Object;

    .line 11
    .line 12
    iput-wide p5, p0, La/kqs;->j:J

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    iget-byte v0, p0, La/kqs;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/kqs;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/kqs;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/kqs;->o:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, La/kqs;

    .line 13
    .line 14
    move-object v5, v3

    .line 15
    check-cast v5, La/g7c0;

    .line 16
    .line 17
    iget-boolean v6, p0, La/kqs;->l:Z

    .line 18
    .line 19
    move-object v7, v2

    .line 20
    check-cast v7, Ljava/lang/String;

    .line 21
    .line 22
    move-object v8, v1

    .line 23
    check-cast v8, Ljava/lang/String;

    .line 24
    .line 25
    move-object v9, p2

    .line 26
    invoke-direct/range {v4 .. v9}, La/kqs;-><init>(La/g7c0;ZLjava/lang/String;Ljava/lang/String;La/yje;)V

    .line 27
    .line 28
    .line 29
    return-object v4

    .line 30
    :pswitch_0
    move-object v9, p2

    .line 31
    new-instance v5, La/kqs;

    .line 32
    .line 33
    iget-object p2, p0, La/kqs;->n:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v6, p2

    .line 36
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    move-object v7, v3

    .line 39
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    move-object v8, v2

    .line 42
    check-cast v8, La/i2o;

    .line 43
    .line 44
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 45
    .line 46
    iget-wide v10, p0, La/kqs;->j:J

    .line 47
    .line 48
    move-object v12, v9

    .line 49
    move-object v9, v1

    .line 50
    invoke-direct/range {v5 .. v12}, La/kqs;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/i2o;Lkotlin/jvm/functions/Function0;JLa/yje;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v5, La/kqs;->m:Ljava/lang/Object;

    .line 54
    .line 55
    return-object v5

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kqs;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kqs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kqs;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kqs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/kqs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/kqs;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/kqs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 26

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/kqs;->i:B

    .line 4
    .line 5
    iget-object v6, v5, La/kqs;->q:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v7, 0x5

    .line 8
    const/4 v1, 0x4

    .line 9
    iget-object v2, v5, La/kqs;->p:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    const/4 v4, 0x2

    .line 13
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    iget-object v9, v5, La/kqs;->o:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    const/4 v11, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v9, La/g7c0;

    .line 23
    .line 24
    iget-object v12, v9, La/g7c0;->A:La/ol60;

    .line 25
    .line 26
    iget-object v0, v9, La/g7c0;->i:La/ctf0;

    .line 27
    .line 28
    sget-object v13, La/wne;->a:La/wne;

    .line 29
    .line 30
    iget-byte v14, v5, La/kqs;->k:B

    .line 31
    .line 32
    packed-switch v14, :pswitch_data_1

    .line 33
    .line 34
    .line 35
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_8

    .line 39
    .line 40
    :pswitch_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :pswitch_1
    iget-object v0, v5, La/kqs;->n:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, La/pa20;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :pswitch_2
    iget-wide v0, v5, La/kqs;->j:J

    .line 55
    .line 56
    iget-object v2, v5, La/kqs;->m:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, La/m97;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-wide v14, v0

    .line 64
    move-object/from16 v0, p1

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :pswitch_3
    iget-wide v3, v5, La/kqs;->j:J

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v0, p1

    .line 74
    .line 75
    move-wide v15, v3

    .line 76
    goto/16 :goto_2

    .line 77
    .line 78
    :pswitch_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object/from16 v0, p1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object/from16 v8, p1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v8, v9, La/g7c0;->s:La/m1e;

    .line 94
    .line 95
    invoke-interface {v8}, La/m1e;->b()La/gmq;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    iput-byte v10, v5, La/kqs;->k:B

    .line 100
    .line 101
    invoke-static {v8, v5}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    if-ne v8, v13, :cond_0

    .line 106
    .line 107
    goto/16 :goto_6

    .line 108
    .line 109
    :cond_0
    :goto_0
    check-cast v8, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-nez v8, :cond_1

    .line 116
    .line 117
    iget-object v1, v9, La/g7c0;->z:La/ol60;

    .line 118
    .line 119
    new-instance v2, La/m6c0;

    .line 120
    .line 121
    new-instance v3, La/xdk0;

    .line 122
    .line 123
    sget-object v4, La/pek0;->a:La/pek0;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    new-array v6, v5, [Ljava/lang/Object;

    .line 127
    .line 128
    const v7, 0x7f130e13

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v7, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    new-array v5, v5, [Ljava/lang/Object;

    .line 136
    .line 137
    const v7, 0x7f130e11

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v7, v5}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const/4 v9, 0x0

    .line 145
    const/16 v10, 0x78

    .line 146
    .line 147
    const/4 v7, 0x0

    .line 148
    const/4 v8, 0x0

    .line 149
    move-object v5, v6

    .line 150
    move-object v6, v0

    .line 151
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v2, v3}, La/m6c0;-><init>(La/xdk0;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    goto/16 :goto_8

    .line 163
    .line 164
    :cond_1
    sget-object v0, La/vq00;->a:La/vq00;

    .line 165
    .line 166
    invoke-virtual {v12, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object v0, v9, La/g7c0;->q:La/nou;

    .line 170
    .line 171
    iput-byte v4, v5, La/kqs;->k:B

    .line 172
    .line 173
    invoke-static {v0, v5}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-ne v0, v13, :cond_2

    .line 178
    .line 179
    goto/16 :goto_6

    .line 180
    .line 181
    :cond_2
    :goto_1
    check-cast v0, La/ql5;

    .line 182
    .line 183
    iget-wide v14, v0, La/ql5;->a:J

    .line 184
    .line 185
    iget-object v0, v9, La/g7c0;->p:La/f3c;

    .line 186
    .line 187
    iput-wide v14, v5, La/kqs;->j:J

    .line 188
    .line 189
    iput-byte v3, v5, La/kqs;->k:B

    .line 190
    .line 191
    invoke-virtual {v0, v5}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-ne v0, v13, :cond_3

    .line 196
    .line 197
    goto/16 :goto_6

    .line 198
    .line 199
    :cond_3
    move-wide v15, v14

    .line 200
    :goto_2
    move-object v8, v0

    .line 201
    check-cast v8, La/m97;

    .line 202
    .line 203
    iget-object v0, v9, La/g7c0;->d:La/g320;

    .line 204
    .line 205
    iget-object v14, v9, La/g7c0;->e:La/nhf0;

    .line 206
    .line 207
    iget-boolean v3, v5, La/kqs;->l:Z

    .line 208
    .line 209
    check-cast v2, Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v2}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v21

    .line 219
    iget-object v2, v9, La/g7c0;->r:La/ms2;

    .line 220
    .line 221
    invoke-static {v2}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iget-byte v2, v2, La/gwe;->a:B

    .line 226
    .line 227
    invoke-static {v8, v2}, La/xia0;->d0(La/m97;I)La/ru6;

    .line 228
    .line 229
    .line 230
    move-result-object v23

    .line 231
    const-wide/16 v24, 0x0

    .line 232
    .line 233
    const-wide/16 v17, 0x0

    .line 234
    .line 235
    const/16 v20, 0x0

    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    move/from16 v19, v3

    .line 240
    .line 241
    invoke-virtual/range {v14 .. v25}, La/nhf0;->u(JDZZLjava/lang/String;La/ex4;La/ru6;D)La/ouj0;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    move-wide v14, v15

    .line 246
    iget-object v3, v9, La/g7c0;->w:La/pru;

    .line 247
    .line 248
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    iget-object v3, v3, La/sff0;->I1:La/oxk0;

    .line 253
    .line 254
    iget-byte v4, v3, La/oxk0;->a:B

    .line 255
    .line 256
    iput-object v8, v5, La/kqs;->m:Ljava/lang/Object;

    .line 257
    .line 258
    iput-wide v14, v5, La/kqs;->j:J

    .line 259
    .line 260
    iput-byte v1, v5, La/kqs;->k:B

    .line 261
    .line 262
    move-object v1, v2

    .line 263
    const-wide/16 v2, 0x0

    .line 264
    .line 265
    invoke-virtual/range {v0 .. v5}, La/g320;->b(La/ouj0;JILa/yje;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-ne v0, v13, :cond_4

    .line 270
    .line 271
    goto/16 :goto_6

    .line 272
    .line 273
    :cond_4
    move-object v2, v8

    .line 274
    :goto_3
    move-object v8, v0

    .line 275
    check-cast v8, La/pa20;

    .line 276
    .line 277
    if-eqz v8, :cond_9

    .line 278
    .line 279
    instance-of v0, v8, La/na20;

    .line 280
    .line 281
    if-eqz v0, :cond_7

    .line 282
    .line 283
    iget-wide v0, v2, La/m97;->i:J

    .line 284
    .line 285
    move-object v3, v8

    .line 286
    check-cast v3, La/na20;

    .line 287
    .line 288
    iget-object v3, v3, La/na20;->b:La/i2o;

    .line 289
    .line 290
    move-wide/from16 v16, v0

    .line 291
    .line 292
    iget-wide v0, v2, La/m97;->f:J

    .line 293
    .line 294
    iput-object v11, v5, La/kqs;->m:Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v8, v5, La/kqs;->n:Ljava/lang/Object;

    .line 297
    .line 298
    iput-wide v14, v5, La/kqs;->j:J

    .line 299
    .line 300
    iput-byte v7, v5, La/kqs;->k:B

    .line 301
    .line 302
    iget-object v2, v9, La/g7c0;->t:La/x20;

    .line 303
    .line 304
    invoke-virtual {v3}, La/i2o;->getErrorCode()I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-virtual {v2, v4}, La/x20;->p(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3}, La/i2o;->getErrorCode()I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    move-object v6, v5

    .line 316
    move-wide v4, v0

    .line 317
    move v1, v2

    .line 318
    move-object v0, v9

    .line 319
    move-wide/from16 v2, v16

    .line 320
    .line 321
    invoke-virtual/range {v0 .. v6}, La/g7c0;->x(IJJLa/zje;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    if-ne v0, v13, :cond_5

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    :goto_4
    if-ne v0, v13, :cond_6

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_6
    move-object v0, v8

    .line 334
    :goto_5
    new-instance v1, La/zhi0;

    .line 335
    .line 336
    check-cast v0, La/na20;

    .line 337
    .line 338
    iget-object v2, v0, La/na20;->c:Ljava/lang/String;

    .line 339
    .line 340
    iget-object v0, v0, La/na20;->b:La/i2o;

    .line 341
    .line 342
    const/16 v3, 0xc

    .line 343
    .line 344
    invoke-direct {v1, v2, v0, v11, v3}, La/zhi0;-><init>(Ljava/lang/String;La/kuw;Ljava/lang/Integer;I)V

    .line 345
    .line 346
    .line 347
    throw v1

    .line 348
    :cond_7
    move-object v0, v9

    .line 349
    instance-of v1, v8, La/oa20;

    .line 350
    .line 351
    if-eqz v1, :cond_9

    .line 352
    .line 353
    check-cast v8, La/oa20;

    .line 354
    .line 355
    check-cast v6, Ljava/lang/String;

    .line 356
    .line 357
    iput-object v11, v5, La/kqs;->m:Ljava/lang/Object;

    .line 358
    .line 359
    iput-object v11, v5, La/kqs;->n:Ljava/lang/Object;

    .line 360
    .line 361
    iput-wide v14, v5, La/kqs;->j:J

    .line 362
    .line 363
    const/4 v1, 0x6

    .line 364
    iput-byte v1, v5, La/kqs;->k:B

    .line 365
    .line 366
    invoke-virtual {v0, v2, v8, v6, v5}, La/g7c0;->w(La/m97;La/oa20;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    if-ne v0, v13, :cond_8

    .line 371
    .line 372
    :goto_6
    move-object v11, v13

    .line 373
    goto :goto_8

    .line 374
    :cond_8
    :goto_7
    sget-object v0, La/uq00;->a:La/uq00;

    .line 375
    .line 376
    invoke-virtual {v12, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 383
    .line 384
    .line 385
    :goto_8
    return-object v11

    .line 386
    :pswitch_7
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 387
    .line 388
    iget-object v0, v5, La/kqs;->m:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, La/kmq;

    .line 391
    .line 392
    sget-object v12, La/wne;->a:La/wne;

    .line 393
    .line 394
    iget-byte v13, v5, La/kqs;->k:B

    .line 395
    .line 396
    if-eqz v13, :cond_d

    .line 397
    .line 398
    if-eq v13, v10, :cond_c

    .line 399
    .line 400
    if-eq v13, v4, :cond_b

    .line 401
    .line 402
    if-eq v13, v3, :cond_b

    .line 403
    .line 404
    if-eq v13, v1, :cond_b

    .line 405
    .line 406
    if-ne v13, v7, :cond_a

    .line 407
    .line 408
    iget-boolean v8, v5, La/kqs;->l:Z

    .line 409
    .line 410
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_a
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_d

    .line 418
    .line 419
    :cond_b
    iget-boolean v8, v5, La/kqs;->l:Z

    .line 420
    .line 421
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    goto/16 :goto_b

    .line 425
    .line 426
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    move-object/from16 v8, p1

    .line 430
    .line 431
    goto :goto_a

    .line 432
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    move v8, v10

    .line 436
    :cond_e
    :goto_9
    if-eqz v8, :cond_15

    .line 437
    .line 438
    iget-object v8, v5, La/kqs;->n:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 441
    .line 442
    iput-object v0, v5, La/kqs;->m:Ljava/lang/Object;

    .line 443
    .line 444
    iput-byte v10, v5, La/kqs;->k:B

    .line 445
    .line 446
    invoke-interface {v8, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    if-ne v8, v12, :cond_f

    .line 451
    .line 452
    goto/16 :goto_c

    .line 453
    .line 454
    :cond_f
    :goto_a
    check-cast v8, La/j0g0;

    .line 455
    .line 456
    iget-object v8, v8, La/j0g0;->a:Ljava/lang/Object;

    .line 457
    .line 458
    instance-of v11, v8, La/g0g0;

    .line 459
    .line 460
    xor-int/lit8 v13, v11, 0x1

    .line 461
    .line 462
    if-nez v11, :cond_11

    .line 463
    .line 464
    move-object v11, v9

    .line 465
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 466
    .line 467
    invoke-static {v8}, La/z1x;->P(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    invoke-interface {v11, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    iput-object v0, v5, La/kqs;->m:Ljava/lang/Object;

    .line 475
    .line 476
    iput-boolean v13, v5, La/kqs;->l:Z

    .line 477
    .line 478
    iput-byte v4, v5, La/kqs;->k:B

    .line 479
    .line 480
    invoke-interface {v0, v8, v5}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    if-ne v8, v12, :cond_10

    .line 485
    .line 486
    goto :goto_c

    .line 487
    :cond_10
    move v8, v13

    .line 488
    goto :goto_b

    .line 489
    :cond_11
    invoke-static {v8}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 490
    .line 491
    .line 492
    move-result-object v8

    .line 493
    instance-of v11, v8, La/zhi0;

    .line 494
    .line 495
    if-eqz v11, :cond_12

    .line 496
    .line 497
    move-object v11, v8

    .line 498
    check-cast v11, La/zhi0;

    .line 499
    .line 500
    iget-object v11, v11, La/zhi0;->c:La/kuw;

    .line 501
    .line 502
    move-object v14, v2

    .line 503
    check-cast v14, La/i2o;

    .line 504
    .line 505
    if-ne v11, v14, :cond_12

    .line 506
    .line 507
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    iput-object v0, v5, La/kqs;->m:Ljava/lang/Object;

    .line 512
    .line 513
    iput-boolean v13, v5, La/kqs;->l:Z

    .line 514
    .line 515
    iput-byte v3, v5, La/kqs;->k:B

    .line 516
    .line 517
    invoke-interface {v0, v8, v5}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    if-ne v8, v12, :cond_10

    .line 522
    .line 523
    goto :goto_c

    .line 524
    :cond_12
    instance-of v11, v8, La/ff5;

    .line 525
    .line 526
    if-eqz v11, :cond_13

    .line 527
    .line 528
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v8

    .line 532
    iput-object v0, v5, La/kqs;->m:Ljava/lang/Object;

    .line 533
    .line 534
    iput-boolean v13, v5, La/kqs;->l:Z

    .line 535
    .line 536
    iput-byte v1, v5, La/kqs;->k:B

    .line 537
    .line 538
    invoke-interface {v0, v8, v5}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v8

    .line 542
    if-ne v8, v12, :cond_10

    .line 543
    .line 544
    goto :goto_c

    .line 545
    :goto_b
    iget-wide v13, v5, La/kqs;->j:J

    .line 546
    .line 547
    invoke-static {v13, v14}, La/znq0;->f(J)J

    .line 548
    .line 549
    .line 550
    move-result-wide v13

    .line 551
    iput-object v0, v5, La/kqs;->m:Ljava/lang/Object;

    .line 552
    .line 553
    iput-boolean v8, v5, La/kqs;->l:Z

    .line 554
    .line 555
    iput-byte v7, v5, La/kqs;->k:B

    .line 556
    .line 557
    invoke-static {v13, v14, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v11

    .line 561
    if-ne v11, v12, :cond_e

    .line 562
    .line 563
    :goto_c
    move-object v11, v12

    .line 564
    goto :goto_d

    .line 565
    :cond_13
    if-nez v8, :cond_14

    .line 566
    .line 567
    new-instance v8, Ljava/lang/Throwable;

    .line 568
    .line 569
    const-string v0, "Result has no expected"

    .line 570
    .line 571
    invoke-direct {v8, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    :cond_14
    throw v8

    .line 575
    :cond_15
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 576
    .line 577
    :goto_d
    return-object v11

    .line 578
    nop

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
    .end packed-switch

    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
