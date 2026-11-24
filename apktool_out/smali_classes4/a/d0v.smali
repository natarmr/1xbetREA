.class public final La/d0v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:I

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/pwi;

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(La/pwi;ZZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d0v;->l:La/pwi;

    .line 2
    .line 3
    iput-boolean p2, p0, La/d0v;->m:Z

    .line 4
    .line 5
    iput-boolean p3, p0, La/d0v;->n:Z

    .line 6
    .line 7
    iput-boolean p4, p0, La/d0v;->o:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/d0v;

    .line 2
    .line 3
    iget-boolean v3, p0, La/d0v;->n:Z

    .line 4
    .line 5
    iget-boolean v4, p0, La/d0v;->o:Z

    .line 6
    .line 7
    iget-object v1, p0, La/d0v;->l:La/pwi;

    .line 8
    .line 9
    iget-boolean v2, p0, La/d0v;->m:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/d0v;-><init>(La/pwi;ZZZLa/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/d0v;->k:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/d0v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/d0v;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/d0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/d0v;->k:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, La/kmq;

    .line 7
    .line 8
    sget-object v3, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v1, La/d0v;->j:B

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x3

    .line 17
    iget-object v10, v1, La/d0v;->l:La/pwi;

    .line 18
    .line 19
    const/4 v15, 0x0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    if-eq v0, v7, :cond_3

    .line 23
    .line 24
    if-eq v0, v6, :cond_2

    .line 25
    .line 26
    if-eq v0, v8, :cond_1

    .line 27
    .line 28
    if-ne v0, v5, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_9

    .line 34
    .line 35
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v15

    .line 41
    :cond_1
    iget v9, v1, La/d0v;->i:I

    .line 42
    .line 43
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    move-object/from16 v0, p1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v0, p1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v10, La/pwi;->h:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, La/lbu;

    .line 68
    .line 69
    invoke-virtual {v0}, La/lbu;->j()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object v0, La/iun;->a:La/iun;

    .line 76
    .line 77
    iput-object v15, v1, La/d0v;->k:Ljava/lang/Object;

    .line 78
    .line 79
    iput-byte v7, v1, La/d0v;->j:B

    .line 80
    .line 81
    invoke-interface {v2, v0, v1}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-ne v0, v3, :cond_5

    .line 86
    .line 87
    goto/16 :goto_8

    .line 88
    .line 89
    :cond_5
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_6
    iget-object v0, v10, La/pwi;->i:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, La/ieu;

    .line 95
    .line 96
    iput-object v2, v1, La/d0v;->k:Ljava/lang/Object;

    .line 97
    .line 98
    iput-byte v6, v1, La/d0v;->j:B

    .line 99
    .line 100
    invoke-virtual {v0, v1}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-ne v0, v3, :cond_7

    .line 105
    .line 106
    goto/16 :goto_8

    .line 107
    .line 108
    :cond_7
    :goto_1
    check-cast v0, La/elt;

    .line 109
    .line 110
    iget v9, v0, La/elt;->e:I

    .line 111
    .line 112
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 113
    .line 114
    iget-object v0, v10, La/pwi;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La/rou;

    .line 117
    .line 118
    iput-object v2, v1, La/d0v;->k:Ljava/lang/Object;

    .line 119
    .line 120
    iput v9, v1, La/d0v;->i:I

    .line 121
    .line 122
    iput-byte v8, v1, La/d0v;->j:B

    .line 123
    .line 124
    invoke-virtual {v0, v4, v1}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v3, :cond_8

    .line 129
    .line 130
    goto/16 :goto_8

    .line 131
    .line 132
    :cond_8
    :goto_2
    check-cast v0, La/m2c0;

    .line 133
    .line 134
    iget-object v0, v0, La/m2c0;->c:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_9

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    goto :goto_3

    .line 147
    :cond_9
    move v0, v4

    .line 148
    :goto_3
    new-instance v11, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-direct {v11, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 151
    .line 152
    .line 153
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    .line 155
    :goto_4
    move v0, v9

    .line 156
    goto :goto_6

    .line 157
    :goto_5
    sget-object v11, La/j0g0;->b:La/e0g0;

    .line 158
    .line 159
    new-instance v11, La/g0g0;

    .line 160
    .line 161
    invoke-direct {v11, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :goto_6
    new-instance v9, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-direct {v9, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 168
    .line 169
    .line 170
    instance-of v12, v11, La/g0g0;

    .line 171
    .line 172
    if-eqz v12, :cond_a

    .line 173
    .line 174
    move-object v11, v9

    .line 175
    :cond_a
    check-cast v11, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    new-instance v9, La/hie0;

    .line 182
    .line 183
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    iget-boolean v12, v1, La/d0v;->m:Z

    .line 187
    .line 188
    iput-boolean v12, v9, La/hie0;->a:Z

    .line 189
    .line 190
    move-object v12, v9

    .line 191
    new-instance v9, La/zzu;

    .line 192
    .line 193
    const/4 v14, 0x0

    .line 194
    move-object v13, v12

    .line 195
    iget-boolean v12, v1, La/d0v;->n:Z

    .line 196
    .line 197
    move-object/from16 v16, v13

    .line 198
    .line 199
    iget-boolean v13, v1, La/d0v;->o:Z

    .line 200
    .line 201
    move-object/from16 v5, v16

    .line 202
    .line 203
    invoke-direct/range {v9 .. v14}, La/zzu;-><init>(La/pwi;IZZLa/yje;)V

    .line 204
    .line 205
    .line 206
    new-instance v11, La/vsg0;

    .line 207
    .line 208
    invoke-direct {v11, v9}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 209
    .line 210
    .line 211
    new-instance v9, La/qqu;

    .line 212
    .line 213
    const/4 v13, 0x6

    .line 214
    invoke-direct {v9, v11, v5, v13}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 215
    .line 216
    .line 217
    new-instance v11, La/lqu;

    .line 218
    .line 219
    const/16 v13, 0x9

    .line 220
    .line 221
    invoke-direct {v11, v5, v13}, La/lqu;-><init>(La/hie0;B)V

    .line 222
    .line 223
    .line 224
    new-instance v5, La/a0v;

    .line 225
    .line 226
    invoke-direct {v5, v10, v15, v4}, La/a0v;-><init>(La/pwi;La/yje;B)V

    .line 227
    .line 228
    .line 229
    new-instance v13, La/isu;

    .line 230
    .line 231
    invoke-direct {v13, v10, v12, v15, v6}, La/isu;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 232
    .line 233
    .line 234
    const/16 v23, 0x0

    .line 235
    .line 236
    const/16 v24, 0x28

    .line 237
    .line 238
    const-wide/16 v19, 0x3c

    .line 239
    .line 240
    move-object/from16 v21, v5

    .line 241
    .line 242
    move-object/from16 v17, v9

    .line 243
    .line 244
    move-object/from16 v18, v11

    .line 245
    .line 246
    move-object/from16 v22, v13

    .line 247
    .line 248
    invoke-static/range {v17 .. v24}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    new-instance v9, La/i89;

    .line 253
    .line 254
    const/16 v11, 0x16

    .line 255
    .line 256
    invoke-direct {v9, v5, v11}, La/i89;-><init>(La/gmq;B)V

    .line 257
    .line 258
    .line 259
    iget-object v5, v10, La/pwi;->c:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v5, La/n4u;

    .line 262
    .line 263
    iget-object v5, v5, La/n4u;->b:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v5, La/uii;

    .line 266
    .line 267
    iget-object v5, v5, La/uii;->a:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v5, La/phj;

    .line 270
    .line 271
    iget-boolean v12, v1, La/d0v;->n:Z

    .line 272
    .line 273
    if-eqz v12, :cond_b

    .line 274
    .line 275
    iget-object v5, v5, La/phj;->c:La/ir30;

    .line 276
    .line 277
    invoke-virtual {v5}, La/ir30;->c()La/p6d;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    goto :goto_7

    .line 282
    :cond_b
    iget-object v5, v5, La/phj;->d:La/ir30;

    .line 283
    .line 284
    invoke-virtual {v5}, La/ir30;->c()La/p6d;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    :goto_7
    new-instance v12, La/i89;

    .line 289
    .line 290
    invoke-direct {v12, v5, v11}, La/i89;-><init>(La/gmq;B)V

    .line 291
    .line 292
    .line 293
    new-instance v5, La/a0v;

    .line 294
    .line 295
    invoke-direct {v5, v10, v15, v7}, La/a0v;-><init>(La/pwi;La/yje;B)V

    .line 296
    .line 297
    .line 298
    new-instance v10, La/oz0;

    .line 299
    .line 300
    const/16 v11, 0x11

    .line 301
    .line 302
    invoke-direct {v10, v8, v15, v11}, La/oz0;-><init>(ILa/yje;B)V

    .line 303
    .line 304
    .line 305
    invoke-static {v12, v5, v10}, La/uvw;->O(La/gmq;Lkotlin/jvm/functions/Function1;La/xdr;)La/a1g;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    new-array v6, v6, [La/gmq;

    .line 310
    .line 311
    aput-object v9, v6, v4

    .line 312
    .line 313
    aput-object v5, v6, v7

    .line 314
    .line 315
    invoke-static {v6}, La/aoq;->b([La/gmq;)La/ltb;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    iput-object v15, v1, La/d0v;->k:Ljava/lang/Object;

    .line 320
    .line 321
    iput v0, v1, La/d0v;->i:I

    .line 322
    .line 323
    const/4 v5, 0x4

    .line 324
    iput-byte v5, v1, La/d0v;->j:B

    .line 325
    .line 326
    invoke-static {v2, v4, v1}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    if-ne v0, v3, :cond_c

    .line 331
    .line 332
    :goto_8
    return-object v3

    .line 333
    :cond_c
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object v0
.end method
