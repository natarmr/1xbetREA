.class public final La/zvu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Z

.field public l:I

.field public m:B

.field public n:Ljava/util/List;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/a6u;ILjava/lang/Integer;La/jvn;ZZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/zvu;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/zvu;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, La/zvu;->l:I

    .line 7
    .line 8
    iput-object p3, p0, La/zvu;->p:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/zvu;->q:Ljava/lang/Object;

    .line 11
    .line 12
    iput-boolean p5, p0, La/zvu;->j:Z

    .line 13
    .line 14
    iput-boolean p6, p0, La/zvu;->k:Z

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/util/List;La/t33;La/t33;La/pz40;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/zvu;->i:B

    .line 21
    iput-object p1, p0, La/zvu;->n:Ljava/util/List;

    iput-object p2, p0, La/zvu;->o:Ljava/lang/Object;

    iput-object p3, p0, La/zvu;->p:Ljava/lang/Object;

    iput-object p4, p0, La/zvu;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    iget-byte p1, p0, La/zvu;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/zvu;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/zvu;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, La/zvu;->o:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v3, La/zvu;

    .line 13
    .line 14
    iget-object v4, p0, La/zvu;->n:Ljava/util/List;

    .line 15
    .line 16
    move-object v5, v2

    .line 17
    check-cast v5, La/t33;

    .line 18
    .line 19
    move-object v6, v1

    .line 20
    check-cast v6, La/t33;

    .line 21
    .line 22
    move-object v7, v0

    .line 23
    check-cast v7, La/pz40;

    .line 24
    .line 25
    move-object v8, p2

    .line 26
    invoke-direct/range {v3 .. v8}, La/zvu;-><init>(Ljava/util/List;La/t33;La/t33;La/pz40;La/yje;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_0
    move-object v8, p2

    .line 31
    new-instance v4, La/zvu;

    .line 32
    .line 33
    move-object v5, v2

    .line 34
    check-cast v5, La/a6u;

    .line 35
    .line 36
    iget v6, p0, La/zvu;->l:I

    .line 37
    .line 38
    move-object v7, v1

    .line 39
    check-cast v7, Ljava/lang/Integer;

    .line 40
    .line 41
    check-cast v0, La/jvn;

    .line 42
    .line 43
    iget-boolean v9, p0, La/zvu;->j:Z

    .line 44
    .line 45
    iget-boolean v10, p0, La/zvu;->k:Z

    .line 46
    .line 47
    move-object v11, v8

    .line 48
    move-object v8, v0

    .line 49
    invoke-direct/range {v4 .. v11}, La/zvu;-><init>(La/a6u;ILjava/lang/Integer;La/jvn;ZZLa/yje;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zvu;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zvu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zvu;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zvu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    check-cast p2, La/yje;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/zvu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/zvu;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/zvu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/zvu;->i:B

    .line 4
    .line 5
    iget-object v1, v5, La/zvu;->o:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v6, 0x3

    .line 12
    iget-object v7, v5, La/zvu;->q:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    iget-object v9, v5, La/zvu;->p:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v7, La/pz40;

    .line 22
    .line 23
    sget-object v11, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-byte v0, v5, La/zvu;->m:B

    .line 26
    .line 27
    const/high16 v12, 0x3f800000    # 1.0f

    .line 28
    .line 29
    const/4 v13, 0x4

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    if-eq v0, v3, :cond_2

    .line 33
    .line 34
    if-eq v0, v4, :cond_2

    .line 35
    .line 36
    if-eq v0, v6, :cond_1

    .line 37
    .line 38
    if-ne v0, v13, :cond_0

    .line 39
    .line 40
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_1
    iget v0, v5, La/zvu;->l:I

    .line 51
    .line 52
    iget-boolean v1, v5, La/zvu;->k:Z

    .line 53
    .line 54
    iget-boolean v2, v5, La/zvu;->j:Z

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :cond_2
    iget-boolean v0, v5, La/zvu;->k:Z

    .line 62
    .line 63
    iget-boolean v1, v5, La/zvu;->j:Z

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-interface {v7, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v5, La/zvu;->n:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    check-cast v1, La/t33;

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    new-instance v4, La/j940;

    .line 98
    .line 99
    invoke-direct {v4, v1, v0, v10}, La/j940;-><init>(La/t33;ZLa/yje;)V

    .line 100
    .line 101
    .line 102
    iput-boolean v0, v5, La/zvu;->j:Z

    .line 103
    .line 104
    iput-boolean v2, v5, La/zvu;->k:Z

    .line 105
    .line 106
    iput-byte v3, v5, La/zvu;->m:B

    .line 107
    .line 108
    invoke-static {v5, v4}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-ne v1, v11, :cond_4

    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :cond_4
    move v1, v0

    .line 117
    move v0, v2

    .line 118
    :goto_0
    move v2, v1

    .line 119
    move v1, v0

    .line 120
    goto :goto_1

    .line 121
    :cond_5
    new-instance v7, Ljava/lang/Float;

    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    invoke-direct {v7, v14}, Ljava/lang/Float;-><init>(F)V

    .line 125
    .line 126
    .line 127
    iput-boolean v0, v5, La/zvu;->j:Z

    .line 128
    .line 129
    iput-boolean v2, v5, La/zvu;->k:Z

    .line 130
    .line 131
    iput-byte v4, v5, La/zvu;->m:B

    .line 132
    .line 133
    invoke-virtual {v1, v5, v7}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-ne v1, v11, :cond_4

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :goto_1
    move-object v0, v9

    .line 141
    check-cast v0, La/t33;

    .line 142
    .line 143
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Ljava/lang/Number;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    cmpg-float v0, v0, v12

    .line 154
    .line 155
    if-gez v0, :cond_a

    .line 156
    .line 157
    if-eqz v1, :cond_7

    .line 158
    .line 159
    if-eqz v2, :cond_6

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    move v3, v8

    .line 163
    :cond_7
    :goto_2
    if-eqz v3, :cond_9

    .line 164
    .line 165
    sget-object v0, La/wen;->b:La/uen;

    .line 166
    .line 167
    const/16 v0, 0x258

    .line 168
    .line 169
    sget-object v4, La/bfn;->d:La/bfn;

    .line 170
    .line 171
    invoke-static {v0, v4}, La/ibc;->v0(ILa/bfn;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v14

    .line 175
    iput-boolean v2, v5, La/zvu;->j:Z

    .line 176
    .line 177
    iput-boolean v1, v5, La/zvu;->k:Z

    .line 178
    .line 179
    iput v3, v5, La/zvu;->l:I

    .line 180
    .line 181
    iput-byte v6, v5, La/zvu;->m:B

    .line 182
    .line 183
    invoke-static {v14, v15, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-ne v0, v11, :cond_8

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    move v0, v3

    .line 191
    :goto_3
    move v3, v0

    .line 192
    :cond_9
    move-object v0, v9

    .line 193
    check-cast v0, La/t33;

    .line 194
    .line 195
    new-instance v4, Ljava/lang/Float;

    .line 196
    .line 197
    invoke-direct {v4, v12}, Ljava/lang/Float;-><init>(F)V

    .line 198
    .line 199
    .line 200
    const/16 v6, 0xc8

    .line 201
    .line 202
    const/4 v7, 0x6

    .line 203
    invoke-static {v6, v8, v10, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    iput-boolean v2, v5, La/zvu;->j:Z

    .line 208
    .line 209
    iput-boolean v1, v5, La/zvu;->k:Z

    .line 210
    .line 211
    iput v3, v5, La/zvu;->l:I

    .line 212
    .line 213
    iput-byte v13, v5, La/zvu;->m:B

    .line 214
    .line 215
    const/4 v3, 0x0

    .line 216
    move-object v1, v4

    .line 217
    const/4 v4, 0x0

    .line 218
    move-object v2, v6

    .line 219
    const/16 v6, 0xc

    .line 220
    .line 221
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-ne v0, v11, :cond_a

    .line 226
    .line 227
    :goto_4
    move-object v10, v11

    .line 228
    goto :goto_6

    .line 229
    :cond_a
    :goto_5
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    :goto_6
    return-object v10

    .line 232
    :pswitch_0
    check-cast v1, La/a6u;

    .line 233
    .line 234
    iget-object v0, v1, La/a6u;->c:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, La/gst0;

    .line 237
    .line 238
    sget-object v11, La/wne;->a:La/wne;

    .line 239
    .line 240
    iget-byte v12, v5, La/zvu;->m:B

    .line 241
    .line 242
    if-eqz v12, :cond_f

    .line 243
    .line 244
    if-eq v12, v3, :cond_e

    .line 245
    .line 246
    if-eq v12, v4, :cond_c

    .line 247
    .line 248
    if-ne v12, v6, :cond_b

    .line 249
    .line 250
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    move-object/from16 v0, p1

    .line 254
    .line 255
    goto/16 :goto_b

    .line 256
    .line 257
    :cond_b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    move-object v0, v10

    .line 261
    goto/16 :goto_b

    .line 262
    .line 263
    :cond_c
    iget-object v2, v5, La/zvu;->n:Ljava/util/List;

    .line 264
    .line 265
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v3, p1

    .line 269
    .line 270
    :cond_d
    move-object/from16 v19, v2

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    move-object/from16 v2, p1

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    iget-object v2, v1, La/a6u;->e:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v2, La/zfo;

    .line 285
    .line 286
    iput-byte v3, v5, La/zvu;->m:B

    .line 287
    .line 288
    invoke-virtual {v2, v5}, La/zfo;->b(La/yje;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    if-ne v2, v11, :cond_10

    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_10
    :goto_7
    check-cast v2, Ljava/util/List;

    .line 296
    .line 297
    iget-object v3, v1, La/a6u;->f:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, La/edo;

    .line 300
    .line 301
    iput-object v2, v5, La/zvu;->n:Ljava/util/List;

    .line 302
    .line 303
    iput-byte v4, v5, La/zvu;->m:B

    .line 304
    .line 305
    invoke-virtual {v3, v5}, La/edo;->b(La/zje;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    if-ne v3, v11, :cond_d

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :goto_8
    move-object/from16 v20, v3

    .line 313
    .line 314
    check-cast v20, Ljava/util/List;

    .line 315
    .line 316
    iget-object v2, v1, La/a6u;->d:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v2, La/j1q0;

    .line 319
    .line 320
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 321
    .line 322
    invoke-virtual {v2}, La/m1q0;->j()Z

    .line 323
    .line 324
    .line 325
    move-result v21

    .line 326
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_11

    .line 331
    .line 332
    invoke-virtual {v0, v8}, La/gst0;->d(Z)Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    :cond_11
    move v14, v8

    .line 337
    if-eqz v2, :cond_12

    .line 338
    .line 339
    iget-object v0, v0, La/gst0;->a:La/rrt0;

    .line 340
    .line 341
    invoke-virtual {v0}, La/rrt0;->a()La/krt0;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    iget-wide v2, v0, La/krt0;->a:J

    .line 346
    .line 347
    new-instance v0, Ljava/lang/Long;

    .line 348
    .line 349
    invoke-direct {v0, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 350
    .line 351
    .line 352
    move-object/from16 v18, v0

    .line 353
    .line 354
    goto :goto_9

    .line 355
    :cond_12
    move-object/from16 v18, v10

    .line 356
    .line 357
    :goto_9
    iget-object v0, v1, La/a6u;->b:Ljava/lang/Object;

    .line 358
    .line 359
    move-object v13, v0

    .line 360
    check-cast v13, La/r2m0;

    .line 361
    .line 362
    iget v0, v5, La/zvu;->l:I

    .line 363
    .line 364
    move-object/from16 v16, v9

    .line 365
    .line 366
    check-cast v16, Ljava/lang/Integer;

    .line 367
    .line 368
    move-object v15, v7

    .line 369
    check-cast v15, La/jvn;

    .line 370
    .line 371
    iget-boolean v1, v5, La/zvu;->j:Z

    .line 372
    .line 373
    iget-boolean v2, v5, La/zvu;->k:Z

    .line 374
    .line 375
    iput-object v10, v5, La/zvu;->n:Ljava/util/List;

    .line 376
    .line 377
    iput-byte v6, v5, La/zvu;->m:B

    .line 378
    .line 379
    iget-object v3, v13, La/r2m0;->a:La/mne;

    .line 380
    .line 381
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 382
    .line 383
    new-instance v12, La/o2m0;

    .line 384
    .line 385
    const/16 v24, 0x0

    .line 386
    .line 387
    move/from16 v17, v0

    .line 388
    .line 389
    move/from16 v22, v1

    .line 390
    .line 391
    move/from16 v23, v2

    .line 392
    .line 393
    invoke-direct/range {v12 .. v24}, La/o2m0;-><init>(La/r2m0;ZLa/jvn;Ljava/lang/Integer;ILjava/lang/Long;Ljava/util/List;Ljava/util/List;ZZZLa/yje;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v3, v12, v5}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    if-ne v0, v11, :cond_13

    .line 401
    .line 402
    :goto_a
    move-object v0, v11

    .line 403
    :cond_13
    :goto_b
    return-object v0

    .line 404
    nop

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
