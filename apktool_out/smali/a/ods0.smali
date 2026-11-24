.class public final La/ods0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/pds0;La/sch0;La/mie0;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/ods0;->i:B

    .line 19
    iput-object p1, p0, La/ods0;->n:Ljava/lang/Object;

    iput-object p2, p0, La/ods0;->o:Ljava/lang/Object;

    iput-object p3, p0, La/ods0;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/t33;La/ppj0;La/pz40;La/agk0;La/agk0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/ods0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/ods0;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/ods0;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/ods0;->m:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/ods0;->n:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/ods0;->o:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ods0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ods0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/ods0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/ods0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, La/ods0;

    .line 13
    .line 14
    iget-object p1, p0, La/ods0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v5, p1

    .line 17
    check-cast v5, La/t33;

    .line 18
    .line 19
    move-object v6, v3

    .line 20
    check-cast v6, La/ppj0;

    .line 21
    .line 22
    iget-object p0, p0, La/ods0;->m:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v7, p0

    .line 25
    check-cast v7, La/pz40;

    .line 26
    .line 27
    move-object v8, v2

    .line 28
    check-cast v8, La/agk0;

    .line 29
    .line 30
    move-object v9, v1

    .line 31
    check-cast v9, La/agk0;

    .line 32
    .line 33
    move-object v10, p2

    .line 34
    invoke-direct/range {v4 .. v10}, La/ods0;-><init>(La/t33;La/ppj0;La/pz40;La/agk0;La/agk0;La/yje;)V

    .line 35
    .line 36
    .line 37
    return-object v4

    .line 38
    :pswitch_0
    move-object v10, p2

    .line 39
    new-instance p0, La/ods0;

    .line 40
    .line 41
    check-cast v2, La/pds0;

    .line 42
    .line 43
    check-cast v1, La/sch0;

    .line 44
    .line 45
    check-cast v3, La/mie0;

    .line 46
    .line 47
    invoke-direct {p0, v2, v1, v3, v10}, La/ods0;-><init>(La/pds0;La/sch0;La/mie0;La/yje;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, La/ods0;->m:Ljava/lang/Object;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ods0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ods0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ods0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ods0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/rch0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ods0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ods0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ods0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ods0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/ods0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/ods0;->n:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    iget-object v5, v0, La/ods0;->l:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v5, La/ppj0;

    .line 19
    .line 20
    iget-object v1, v0, La/ods0;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, La/t33;

    .line 23
    .line 24
    sget-object v8, La/wne;->a:La/wne;

    .line 25
    .line 26
    iget-boolean v9, v0, La/ods0;->j:Z

    .line 27
    .line 28
    if-eqz v9, :cond_1

    .line 29
    .line 30
    if-ne v9, v6, :cond_0

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v4, v0, La/ods0;->m:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, La/pz40;

    .line 48
    .line 49
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ljava/lang/Float;

    .line 54
    .line 55
    if-eqz v4, :cond_7

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    check-cast v9, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    iget-object v10, v5, La/ppj0;->d:La/agk0;

    .line 72
    .line 73
    invoke-virtual {v10}, La/agk0;->l()F

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    cmpg-float v9, v9, v10

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    if-gez v9, :cond_2

    .line 81
    .line 82
    move v9, v6

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    move v9, v10

    .line 85
    :goto_0
    iget-object v11, v5, La/ppj0;->d:La/agk0;

    .line 86
    .line 87
    invoke-virtual {v11, v4}, La/agk0;->m(F)V

    .line 88
    .line 89
    .line 90
    check-cast v3, La/agk0;

    .line 91
    .line 92
    invoke-virtual {v3, v4}, La/agk0;->m(F)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    const/4 v11, 0x0

    .line 106
    cmpg-float v3, v3, v11

    .line 107
    .line 108
    if-nez v3, :cond_3

    .line 109
    .line 110
    check-cast v2, La/agk0;

    .line 111
    .line 112
    invoke-virtual {v2}, La/agk0;->l()F

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    cmpl-float v2, v2, v11

    .line 117
    .line 118
    if-gtz v2, :cond_6

    .line 119
    .line 120
    :cond_3
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    cmpg-float v2, v2, v11

    .line 131
    .line 132
    if-nez v2, :cond_4

    .line 133
    .line 134
    new-instance v2, Ljava/lang/Float;

    .line 135
    .line 136
    invoke-direct {v2, v4}, Ljava/lang/Float;-><init>(F)V

    .line 137
    .line 138
    .line 139
    iput-boolean v6, v0, La/ods0;->j:Z

    .line 140
    .line 141
    invoke-virtual {v1, v0, v2}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-ne v0, v8, :cond_6

    .line 146
    .line 147
    move-object v7, v8

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    iget-object v0, v5, La/ppj0;->b:La/vne;

    .line 150
    .line 151
    const/4 v1, 0x3

    .line 152
    if-eqz v9, :cond_5

    .line 153
    .line 154
    new-instance v2, La/npj0;

    .line 155
    .line 156
    invoke-direct {v2, v5, v7, v6}, La/npj0;-><init>(La/ppj0;La/yje;B)V

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v7, v7, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_5
    new-instance v2, La/npj0;

    .line 164
    .line 165
    invoke-direct {v2, v5, v7, v10}, La/npj0;-><init>(La/ppj0;La/yje;B)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v7, v7, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 169
    .line 170
    .line 171
    :cond_6
    :goto_1
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_7
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    :goto_2
    return-object v7

    .line 177
    :pswitch_0
    check-cast v2, La/sch0;

    .line 178
    .line 179
    check-cast v5, La/mie0;

    .line 180
    .line 181
    check-cast v3, La/pds0;

    .line 182
    .line 183
    sget-object v1, La/wne;->a:La/wne;

    .line 184
    .line 185
    iget-boolean v8, v0, La/ods0;->j:Z

    .line 186
    .line 187
    if-eqz v8, :cond_9

    .line 188
    .line 189
    if-ne v8, v6, :cond_8

    .line 190
    .line 191
    iget-object v4, v0, La/ods0;->k:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v4, La/mie0;

    .line 194
    .line 195
    iget-object v8, v0, La/ods0;->m:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v8, La/rch0;

    .line 198
    .line 199
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    move-object v9, v8

    .line 203
    move-object v8, v4

    .line 204
    move-object/from16 v4, p1

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_5

    .line 211
    .line 212
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object v4, v0, La/ods0;->m:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v4, La/rch0;

    .line 218
    .line 219
    iget-object v8, v5, La/mie0;->a:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v8, La/mds0;

    .line 222
    .line 223
    iget-wide v8, v8, La/mds0;->a:J

    .line 224
    .line 225
    invoke-virtual {v2, v8, v9}, La/sch0;->f(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v8

    .line 229
    invoke-virtual {v2, v8, v9}, La/sch0;->j(J)F

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    iget-object v9, v3, La/d660;->a:La/sch0;

    .line 234
    .line 235
    invoke-virtual {v9, v8}, La/sch0;->e(F)F

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    invoke-virtual {v9, v8}, La/sch0;->i(F)J

    .line 240
    .line 241
    .line 242
    move-result-wide v10

    .line 243
    invoke-virtual {v4, v6, v10, v11}, La/rch0;->a(IJ)J

    .line 244
    .line 245
    .line 246
    move-result-wide v10

    .line 247
    invoke-virtual {v9, v10, v11}, La/sch0;->f(J)J

    .line 248
    .line 249
    .line 250
    move-result-wide v10

    .line 251
    invoke-virtual {v9, v10, v11}, La/sch0;->h(J)F

    .line 252
    .line 253
    .line 254
    move-object v8, v4

    .line 255
    :goto_3
    iget-object v4, v5, La/mie0;->a:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v4, La/mds0;

    .line 258
    .line 259
    iget-boolean v4, v4, La/mds0;->c:Z

    .line 260
    .line 261
    if-nez v4, :cond_c

    .line 262
    .line 263
    iget-object v4, v3, La/pds0;->f:La/q99;

    .line 264
    .line 265
    iput-object v8, v0, La/ods0;->m:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v5, v0, La/ods0;->k:Ljava/lang/Object;

    .line 268
    .line 269
    iput-boolean v6, v0, La/ods0;->j:Z

    .line 270
    .line 271
    new-instance v9, La/j940;

    .line 272
    .line 273
    const/16 v10, 0x17

    .line 274
    .line 275
    invoke-direct {v9, v4, v7, v10}, La/j940;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 276
    .line 277
    .line 278
    invoke-static {v0, v9}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    if-ne v4, v1, :cond_a

    .line 283
    .line 284
    move-object v7, v1

    .line 285
    goto/16 :goto_5

    .line 286
    .line 287
    :cond_a
    move-object v9, v8

    .line 288
    move-object v8, v5

    .line 289
    :goto_4
    iput-object v4, v8, La/mie0;->a:Ljava/lang/Object;

    .line 290
    .line 291
    iget-object v4, v5, La/mie0;->a:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v4, La/mds0;

    .line 294
    .line 295
    iget-object v8, v3, La/d660;->e:La/zri;

    .line 296
    .line 297
    iget-wide v10, v4, La/mds0;->b:J

    .line 298
    .line 299
    iget-wide v12, v4, La/mds0;->a:J

    .line 300
    .line 301
    iget-object v4, v8, La/zri;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v4, La/i6u0;

    .line 304
    .line 305
    const/16 p1, 0x20

    .line 306
    .line 307
    shr-long v14, v12, p1

    .line 308
    .line 309
    long-to-int v14, v14

    .line 310
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 311
    .line 312
    .line 313
    move-result v14

    .line 314
    invoke-virtual {v4, v14, v10, v11}, La/i6u0;->a(FJ)V

    .line 315
    .line 316
    .line 317
    iget-object v4, v8, La/zri;->c:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v4, La/i6u0;

    .line 320
    .line 321
    const-wide v14, 0xffffffffL

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    and-long/2addr v12, v14

    .line 327
    long-to-int v8, v12

    .line 328
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    invoke-virtual {v4, v8, v10, v11}, La/i6u0;->a(FJ)V

    .line 333
    .line 334
    .line 335
    iget-object v4, v3, La/pds0;->f:La/q99;

    .line 336
    .line 337
    invoke-static {v4}, La/pds0;->e(La/q99;)La/mds0;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    if-eqz v4, :cond_b

    .line 342
    .line 343
    iget-object v8, v3, La/d660;->e:La/zri;

    .line 344
    .line 345
    iget-wide v10, v4, La/mds0;->b:J

    .line 346
    .line 347
    iget-wide v12, v4, La/mds0;->a:J

    .line 348
    .line 349
    iget-object v7, v8, La/zri;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v7, La/i6u0;

    .line 352
    .line 353
    move-wide/from16 v16, v14

    .line 354
    .line 355
    shr-long v14, v12, p1

    .line 356
    .line 357
    long-to-int v14, v14

    .line 358
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 359
    .line 360
    .line 361
    move-result v14

    .line 362
    invoke-virtual {v7, v14, v10, v11}, La/i6u0;->a(FJ)V

    .line 363
    .line 364
    .line 365
    iget-object v7, v8, La/zri;->c:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v7, La/i6u0;

    .line 368
    .line 369
    and-long v12, v12, v16

    .line 370
    .line 371
    long-to-int v8, v12

    .line 372
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    invoke-virtual {v7, v8, v10, v11}, La/i6u0;->a(FJ)V

    .line 377
    .line 378
    .line 379
    iget-object v7, v5, La/mie0;->a:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v7, La/mds0;

    .line 382
    .line 383
    invoke-virtual {v7, v4}, La/mds0;->a(La/mds0;)La/mds0;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    iput-object v4, v5, La/mie0;->a:Ljava/lang/Object;

    .line 388
    .line 389
    :cond_b
    iget-object v4, v5, La/mie0;->a:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v4, La/mds0;

    .line 392
    .line 393
    iget-wide v7, v4, La/mds0;->a:J

    .line 394
    .line 395
    invoke-virtual {v2, v7, v8}, La/sch0;->f(J)J

    .line 396
    .line 397
    .line 398
    move-result-wide v7

    .line 399
    invoke-virtual {v2, v7, v8}, La/sch0;->j(J)F

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    iget-object v7, v3, La/d660;->a:La/sch0;

    .line 404
    .line 405
    invoke-virtual {v7, v4}, La/sch0;->e(F)F

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    invoke-virtual {v7, v4}, La/sch0;->i(F)J

    .line 410
    .line 411
    .line 412
    move-result-wide v10

    .line 413
    invoke-virtual {v9, v6, v10, v11}, La/rch0;->a(IJ)J

    .line 414
    .line 415
    .line 416
    move-result-wide v10

    .line 417
    invoke-virtual {v7, v10, v11}, La/sch0;->f(J)J

    .line 418
    .line 419
    .line 420
    move-result-wide v10

    .line 421
    invoke-virtual {v7, v10, v11}, La/sch0;->h(J)F

    .line 422
    .line 423
    .line 424
    move-object v8, v9

    .line 425
    const/4 v7, 0x0

    .line 426
    goto/16 :goto_3

    .line 427
    .line 428
    :cond_c
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    :goto_5
    return-object v7

    .line 431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
