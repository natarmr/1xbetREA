.class public final synthetic La/mr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/a570;La/yn2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/mr0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mr0;->d:Ljava/lang/Object;

    iput-object p2, p0, La/mr0;->e:Ljava/lang/Object;

    iput-object p3, p0, La/mr0;->b:Ljava/lang/Object;

    iput-object p4, p0, La/mr0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/mr0;->a:B

    iput-object p1, p0, La/mr0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/mr0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/mr0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/mr0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/mr0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    check-cast v2, La/fhj;

    .line 7
    .line 8
    iget-object v1, v0, La/mr0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;

    .line 11
    .line 12
    iget-object v3, v0, La/mr0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, La/wyu;

    .line 15
    .line 16
    iget-object v0, v0, La/mr0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/qzt;

    .line 19
    .line 20
    new-instance v9, La/l8e0;

    .line 21
    .line 22
    instance-of v4, v1, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    const-string v10, ""

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    move-object v6, v10

    .line 30
    :goto_0
    move v7, v4

    .line 31
    move-object v8, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    instance-of v6, v1, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;

    .line 34
    .line 35
    if-eqz v6, :cond_3

    .line 36
    .line 37
    move-object v6, v1

    .line 38
    check-cast v6, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;

    .line 39
    .line 40
    iget-object v6, v6, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;->a:Ljava/lang/String;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_1
    invoke-interface {v1}, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;->c()J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    invoke-virtual {v3}, La/wyu;->a()La/uaq0;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    check-cast v1, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;

    .line 54
    .line 55
    iget v1, v1, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$EventParamsStatistic;->b:I

    .line 56
    .line 57
    int-to-long v7, v1

    .line 58
    :goto_2
    move-object/from16 v16, v6

    .line 59
    .line 60
    move-object v6, v3

    .line 61
    move-object/from16 v3, v16

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_1
    instance-of v1, v1, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :goto_3
    invoke-virtual/range {v2 .. v8}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v0}, La/qzt;->a()La/eme;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v1, Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v2, La/h8e0;

    .line 85
    .line 86
    new-instance v3, La/y4e0;

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-direct {v3, v4, v10}, La/y4e0;-><init>(ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sget-object v4, La/iun;->a:La/iun;

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    move-object v5, v4

    .line 96
    move-object v6, v4

    .line 97
    invoke-direct/range {v2 .. v7}, La/h8e0;-><init>(La/y4e0;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/j6i0;)V

    .line 98
    .line 99
    .line 100
    const/4 v14, 0x0

    .line 101
    const/4 v15, 0x0

    .line 102
    const/4 v5, 0x1

    .line 103
    const/4 v6, 0x0

    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v13, 0x0

    .line 106
    move-object v10, v1

    .line 107
    move-object v11, v2

    .line 108
    move-object v4, v9

    .line 109
    move-object v9, v0

    .line 110
    invoke-direct/range {v4 .. v15}, La/l8e0;-><init>(ZZLa/zdm0;La/nc5;La/eme;Ljava/util/HashMap;La/h8e0;La/j6i0;IZZ)V

    .line 111
    .line 112
    .line 113
    return-object v4

    .line 114
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 115
    .line 116
    .line 117
    return-object v8

    .line 118
    :cond_3
    move-object v8, v5

    .line 119
    invoke-static {}, La/t9f;->b()V

    .line 120
    .line 121
    .line 122
    return-object v8
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 68

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mr0;->a:B

    .line 4
    .line 5
    const-string v4, "%.3f ms"

    .line 6
    .line 7
    const-string v5, "CXCP"

    .line 8
    .line 9
    const/4 v8, 0x7

    .line 10
    const/4 v9, 0x3

    .line 11
    const/4 v10, 0x2

    .line 12
    const/16 v11, 0xa

    .line 13
    .line 14
    const/4 v13, 0x0

    .line 15
    const/4 v14, 0x1

    .line 16
    iget-object v15, v0, La/mr0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iget-object v2, v0, La/mr0;->d:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v3, v0, La/mr0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    const-wide/16 v18, 0x0

    .line 28
    .line 29
    iget-object v6, v0, La/mr0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    packed-switch v1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    check-cast v6, La/pru;

    .line 35
    .line 36
    check-cast v3, La/bzt;

    .line 37
    .line 38
    check-cast v2, La/r9u;

    .line 39
    .line 40
    move-object/from16 v22, v15

    .line 41
    .line 42
    check-cast v22, La/ctf0;

    .line 43
    .line 44
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, v3, La/bzt;->a:La/fsd;

    .line 49
    .line 50
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget v1, v1, La/v8d;->r:I

    .line 55
    .line 56
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 57
    .line 58
    iget-object v0, v0, La/mum0;->y:La/v5l0;

    .line 59
    .line 60
    sget-object v27, La/xun;->a:La/xun;

    .line 61
    .line 62
    sget-object v3, La/ygp;->t:La/ygp;

    .line 63
    .line 64
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 70
    .line 71
    invoke-virtual {v2, v3}, La/m1q0;->d(La/ygp;)Z

    .line 72
    .line 73
    .line 74
    move-result v29

    .line 75
    new-instance v16, La/y3g0;

    .line 76
    .line 77
    const/16 v28, 0x0

    .line 78
    .line 79
    const/16 v30, 0x0

    .line 80
    .line 81
    const/16 v17, 0x0

    .line 82
    .line 83
    const-string v18, ""

    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    sget-object v20, La/cnf0;->a:La/cnf0;

    .line 88
    .line 89
    sget-object v21, La/qhh0;->a:La/qhh0;

    .line 90
    .line 91
    const/16 v24, 0x0

    .line 92
    .line 93
    const/16 v25, 0x0

    .line 94
    .line 95
    move-object/from16 v26, v0

    .line 96
    .line 97
    move/from16 v23, v1

    .line 98
    .line 99
    invoke-direct/range {v16 .. v30}, La/y3g0;-><init>(ZLjava/lang/String;ZLa/enf0;La/whh0;La/ctf0;ILjava/util/List;La/wcb;La/v5l0;Ljava/util/Set;ZZZ)V

    .line 100
    .line 101
    .line 102
    return-object v16

    .line 103
    :pswitch_0
    check-cast v6, La/gf50;

    .line 104
    .line 105
    check-cast v3, La/c2h0;

    .line 106
    .line 107
    check-cast v2, Ljava/util/List;

    .line 108
    .line 109
    check-cast v15, Ljava/util/List;

    .line 110
    .line 111
    iget-object v0, v6, La/gf50;->c:La/pz40;

    .line 112
    .line 113
    check-cast v0, La/hgk0;

    .line 114
    .line 115
    invoke-virtual {v0, v3}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v6, La/gf50;->b:La/pz40;

    .line 119
    .line 120
    check-cast v0, La/hgk0;

    .line 121
    .line 122
    invoke-virtual {v0, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v6, La/gf50;->d:La/pz40;

    .line 126
    .line 127
    check-cast v0, La/hgk0;

    .line 128
    .line 129
    invoke-virtual {v0, v15}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_1
    invoke-direct {v0}, La/mr0;->a()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0

    .line 140
    :pswitch_2
    check-cast v6, La/vrc0;

    .line 141
    .line 142
    check-cast v3, La/pru;

    .line 143
    .line 144
    check-cast v2, La/vzg0;

    .line 145
    .line 146
    move-object/from16 v16, v15

    .line 147
    .line 148
    check-cast v16, La/g2v;

    .line 149
    .line 150
    sget-object v0, La/src0;->a:La/xi70;

    .line 151
    .line 152
    invoke-interface {v6}, La/vrc0;->B()J

    .line 153
    .line 154
    .line 155
    move-result-wide v4

    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v4, v5}, La/xi70;->e(J)La/src0;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget-object v0, v0, La/sff0;->l:La/toc0;

    .line 168
    .line 169
    iget-boolean v13, v0, La/toc0;->x:Z

    .line 170
    .line 171
    const-string v0, "AMOUNT_KEY"

    .line 172
    .line 173
    invoke-virtual {v2, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Ljava/lang/Integer;

    .line 178
    .line 179
    if-eqz v0, :cond_0

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    :goto_0
    move v9, v0

    .line 186
    goto :goto_1

    .line 187
    :cond_0
    invoke-interface {v6}, La/vrc0;->h0()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    goto :goto_0

    .line 192
    :goto_1
    const-string v0, "GAME_COUNT_KEY"

    .line 193
    .line 194
    invoke-virtual {v2, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Ljava/lang/Integer;

    .line 199
    .line 200
    if-eqz v0, :cond_1

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    :cond_1
    move v10, v14

    .line 207
    sget-object v5, La/iun;->a:La/iun;

    .line 208
    .line 209
    sget-object v0, La/esr;->c:La/esr;

    .line 210
    .line 211
    invoke-interface {v6}, La/vrc0;->C()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    sget-object v17, La/pb10;->g:La/pb10;

    .line 216
    .line 217
    const-wide/16 v27, 0x0

    .line 218
    .line 219
    const/16 v29, 0x35e

    .line 220
    .line 221
    const/16 v18, 0x0

    .line 222
    .line 223
    const/16 v19, 0x0

    .line 224
    .line 225
    const/16 v20, 0x0

    .line 226
    .line 227
    const/16 v21, 0x0

    .line 228
    .line 229
    const v22, 0x7f130677

    .line 230
    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    const v24, 0x7f131690

    .line 235
    .line 236
    .line 237
    const-wide/16 v25, 0x0

    .line 238
    .line 239
    invoke-static/range {v16 .. v29}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    new-instance v1, La/zqc0;

    .line 244
    .line 245
    const-wide/16 v16, 0x0

    .line 246
    .line 247
    const/16 v19, 0x0

    .line 248
    .line 249
    const/4 v2, 0x1

    .line 250
    const/4 v3, 0x0

    .line 251
    const-string v8, ""

    .line 252
    .line 253
    const/4 v11, 0x0

    .line 254
    const-wide/16 v14, 0x0

    .line 255
    .line 256
    move-object/from16 v18, v0

    .line 257
    .line 258
    invoke-direct/range {v1 .. v19}, La/zqc0;-><init>(ZZLa/mdm;Ljava/util/List;La/vrc0;La/src0;Ljava/lang/String;IIILjava/lang/String;ZJDLa/esr;Z)V

    .line 259
    .line 260
    .line 261
    return-object v1

    .line 262
    :pswitch_3
    check-cast v6, La/pru;

    .line 263
    .line 264
    check-cast v3, La/vgc0;

    .line 265
    .line 266
    check-cast v2, La/vzg0;

    .line 267
    .line 268
    check-cast v15, La/ctf0;

    .line 269
    .line 270
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v0, v0, La/sff0;->l:La/toc0;

    .line 275
    .line 276
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 281
    .line 282
    iget-object v1, v1, La/mum0;->x:La/zvh0;

    .line 283
    .line 284
    iget-boolean v4, v0, La/toc0;->f:Z

    .line 285
    .line 286
    if-eqz v4, :cond_2

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_2
    sget-object v3, La/vgc0;->d:La/vgc0;

    .line 290
    .line 291
    :goto_2
    sget-object v5, La/vgc0;->f:La/c0o;

    .line 292
    .line 293
    new-instance v6, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-static {v5, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5}, La/b3;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-eqz v7, :cond_3

    .line 311
    .line 312
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    check-cast v7, La/vgc0;

    .line 317
    .line 318
    new-instance v8, La/yvh0;

    .line 319
    .line 320
    iget v7, v7, La/vgc0;->a:I

    .line 321
    .line 322
    new-array v11, v13, [Ljava/lang/Object;

    .line 323
    .line 324
    iget-object v12, v15, La/ctf0;->b:La/lsm0;

    .line 325
    .line 326
    invoke-static {v11, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v11

    .line 330
    invoke-virtual {v12, v7, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    sget-object v11, La/bwh0;->a:La/bwh0;

    .line 335
    .line 336
    invoke-direct {v8, v7, v11}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    goto :goto_3

    .line 343
    :cond_3
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 344
    .line 345
    .line 346
    move-result-object v27

    .line 347
    new-instance v21, La/kgc0;

    .line 348
    .line 349
    const-string v5, "KEY_CURRENT_TAB"

    .line 350
    .line 351
    invoke-virtual {v2, v5}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    check-cast v2, La/vgc0;

    .line 356
    .line 357
    if-nez v2, :cond_4

    .line 358
    .line 359
    move-object/from16 v22, v3

    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_4
    move-object/from16 v22, v2

    .line 363
    .line 364
    :goto_4
    if-eqz v4, :cond_5

    .line 365
    .line 366
    iget-boolean v2, v0, La/toc0;->g:Z

    .line 367
    .line 368
    if-eqz v2, :cond_5

    .line 369
    .line 370
    move/from16 v23, v14

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_5
    move/from16 v23, v13

    .line 374
    .line 375
    :goto_5
    if-eqz v4, :cond_7

    .line 376
    .line 377
    iget-boolean v0, v0, La/toc0;->j:Z

    .line 378
    .line 379
    if-nez v0, :cond_6

    .line 380
    .line 381
    goto :goto_6

    .line 382
    :cond_6
    move/from16 v24, v13

    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_7
    :goto_6
    move/from16 v24, v14

    .line 386
    .line 387
    :goto_7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-eqz v0, :cond_b

    .line 392
    .line 393
    if-eq v0, v14, :cond_a

    .line 394
    .line 395
    if-eq v0, v10, :cond_9

    .line 396
    .line 397
    if-ne v0, v9, :cond_8

    .line 398
    .line 399
    sget-object v0, La/bxh0;->a:La/bxh0;

    .line 400
    .line 401
    :goto_8
    move-object/from16 v26, v0

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 405
    .line 406
    .line 407
    const/4 v12, 0x0

    .line 408
    goto :goto_a

    .line 409
    :cond_9
    sget-object v0, La/cxh0;->a:La/cxh0;

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_a
    sget-object v0, La/zwh0;->a:La/zwh0;

    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_b
    sget-object v0, La/axh0;->a:La/axh0;

    .line 416
    .line 417
    goto :goto_8

    .line 418
    :goto_9
    new-array v0, v13, [Ljava/lang/Object;

    .line 419
    .line 420
    iget-object v1, v15, La/ctf0;->b:La/lsm0;

    .line 421
    .line 422
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    const v2, 0x7f131027

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v28

    .line 433
    new-array v0, v13, [Ljava/lang/Object;

    .line 434
    .line 435
    iget-object v1, v15, La/ctf0;->b:La/lsm0;

    .line 436
    .line 437
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    const v2, 0x7f130db4

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v29

    .line 448
    const-string v25, ""

    .line 449
    .line 450
    invoke-direct/range {v21 .. v29}, La/kgc0;-><init>(La/vgc0;ZZLjava/lang/String;La/dxh0;La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    move-object/from16 v12, v21

    .line 454
    .line 455
    :goto_a
    return-object v12

    .line 456
    :pswitch_4
    check-cast v6, La/vzg0;

    .line 457
    .line 458
    check-cast v3, La/ctf0;

    .line 459
    .line 460
    check-cast v2, La/pru;

    .line 461
    .line 462
    move-object/from16 v16, v15

    .line 463
    .line 464
    check-cast v16, La/g2v;

    .line 465
    .line 466
    const-string v0, "KEY_FILTER_STATE"

    .line 467
    .line 468
    invoke-virtual {v6, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    check-cast v0, La/ydc0;

    .line 473
    .line 474
    if-nez v0, :cond_c

    .line 475
    .line 476
    sget-object v0, La/ydc0;->c:La/ydc0;

    .line 477
    .line 478
    :cond_c
    sget-object v1, La/sec0;->E:Ljava/util/List;

    .line 479
    .line 480
    invoke-static {v0, v3}, La/ydx;->C(La/ydc0;La/ctf0;)La/a4x;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    iget-object v2, v2, La/sff0;->l:La/toc0;

    .line 489
    .line 490
    sget-object v4, La/iun;->a:La/iun;

    .line 491
    .line 492
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 493
    .line 494
    .line 495
    move-result-object v5

    .line 496
    sget-object v17, La/pb10;->g:La/pb10;

    .line 497
    .line 498
    const-wide/16 v27, 0x0

    .line 499
    .line 500
    const/16 v29, 0x25e

    .line 501
    .line 502
    const/16 v18, 0x0

    .line 503
    .line 504
    const/16 v19, 0x0

    .line 505
    .line 506
    const/16 v20, 0x0

    .line 507
    .line 508
    const/16 v21, 0x0

    .line 509
    .line 510
    const v22, 0x7f130677

    .line 511
    .line 512
    .line 513
    const/16 v23, 0x0

    .line 514
    .line 515
    const v24, 0x7f131690

    .line 516
    .line 517
    .line 518
    const-wide/16 v25, 0x2710

    .line 519
    .line 520
    invoke-static/range {v16 .. v29}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 521
    .line 522
    .line 523
    move-result-object v6

    .line 524
    sget-object v17, La/pb10;->r1:La/pb10;

    .line 525
    .line 526
    sget-object v18, La/pdm;->b:La/pdm;

    .line 527
    .line 528
    const/16 v29, 0x3d4

    .line 529
    .line 530
    const v20, 0x7f080834

    .line 531
    .line 532
    .line 533
    const v22, 0x7f130efd

    .line 534
    .line 535
    .line 536
    const/16 v24, 0x0

    .line 537
    .line 538
    const-wide/16 v25, 0x0

    .line 539
    .line 540
    invoke-static/range {v16 .. v29}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 541
    .line 542
    .line 543
    move-result-object v27

    .line 544
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 545
    .line 546
    .line 547
    move-result-object v29

    .line 548
    new-array v4, v13, [Ljava/lang/Object;

    .line 549
    .line 550
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 551
    .line 552
    invoke-static {v4, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    const v7, 0x7f131045

    .line 557
    .line 558
    .line 559
    invoke-virtual {v3, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v30

    .line 563
    iget-boolean v4, v2, La/toc0;->d:Z

    .line 564
    .line 565
    new-instance v33, La/kdc0;

    .line 566
    .line 567
    iget-boolean v7, v2, La/toc0;->u:Z

    .line 568
    .line 569
    iget-boolean v2, v2, La/toc0;->v:Z

    .line 570
    .line 571
    new-array v8, v13, [Ljava/lang/Object;

    .line 572
    .line 573
    invoke-static {v8, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v8

    .line 577
    const v9, 0x7f13101c

    .line 578
    .line 579
    .line 580
    invoke-virtual {v3, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v16

    .line 584
    new-array v8, v13, [Ljava/lang/Object;

    .line 585
    .line 586
    invoke-static {v8, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v8

    .line 590
    const v9, 0x7f13107e

    .line 591
    .line 592
    .line 593
    invoke-virtual {v3, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v17

    .line 597
    new-array v8, v13, [Ljava/lang/Object;

    .line 598
    .line 599
    invoke-static {v8, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v8

    .line 603
    const v9, 0x7f13101b

    .line 604
    .line 605
    .line 606
    invoke-virtual {v3, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v18

    .line 610
    const/4 v15, 0x0

    .line 611
    move/from16 v20, v2

    .line 612
    .line 613
    move/from16 v19, v7

    .line 614
    .line 615
    move-object/from16 v14, v33

    .line 616
    .line 617
    invoke-direct/range {v14 .. v21}, La/kdc0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 618
    .line 619
    .line 620
    new-instance v17, La/bec0;

    .line 621
    .line 622
    const/16 v31, 0x0

    .line 623
    .line 624
    const/16 v32, 0x0

    .line 625
    .line 626
    const/16 v21, 0x1

    .line 627
    .line 628
    const/16 v22, 0x0

    .line 629
    .line 630
    const/16 v24, 0x1

    .line 631
    .line 632
    const/16 v25, 0x0

    .line 633
    .line 634
    move-object/from16 v19, v0

    .line 635
    .line 636
    move-object/from16 v20, v1

    .line 637
    .line 638
    move/from16 v28, v4

    .line 639
    .line 640
    move-object/from16 v18, v5

    .line 641
    .line 642
    move-object/from16 v26, v6

    .line 643
    .line 644
    invoke-direct/range {v17 .. v33}, La/bec0;-><init>(La/a4x;La/ydc0;La/a4x;ZZZZZLa/mdm;La/mdm;ZLjava/util/List;Ljava/lang/String;ZZLa/kdc0;)V

    .line 645
    .line 646
    .line 647
    return-object v17

    .line 648
    :pswitch_5
    check-cast v6, La/hb90;

    .line 649
    .line 650
    check-cast v3, Landroid/webkit/WebView;

    .line 651
    .line 652
    check-cast v2, Landroid/webkit/WebResourceRequest;

    .line 653
    .line 654
    check-cast v15, Landroid/webkit/WebResourceError;

    .line 655
    .line 656
    invoke-static {v6, v3, v2, v15}, La/hb90;->d(La/hb90;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)Lkotlin/Unit;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    return-object v0

    .line 661
    :pswitch_6
    move-object v14, v6

    .line 662
    check-cast v14, La/g2v;

    .line 663
    .line 664
    check-cast v3, La/iqt;

    .line 665
    .line 666
    check-cast v2, La/ctf0;

    .line 667
    .line 668
    move-object v0, v15

    .line 669
    check-cast v0, La/vzg0;

    .line 670
    .line 671
    sget-object v15, La/pb10;->g:La/pb10;

    .line 672
    .line 673
    const-wide/16 v25, 0x0

    .line 674
    .line 675
    const/16 v27, 0x25e

    .line 676
    .line 677
    const/16 v16, 0x0

    .line 678
    .line 679
    const/16 v17, 0x0

    .line 680
    .line 681
    const/16 v18, 0x0

    .line 682
    .line 683
    const/16 v19, 0x0

    .line 684
    .line 685
    const v20, 0x7f130677

    .line 686
    .line 687
    .line 688
    const/16 v21, 0x0

    .line 689
    .line 690
    const v22, 0x7f131690

    .line 691
    .line 692
    .line 693
    const-wide/16 v23, 0x2710

    .line 694
    .line 695
    invoke-static/range {v14 .. v27}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 696
    .line 697
    .line 698
    move-result-object v39

    .line 699
    sget-object v16, La/pdm;->b:La/pdm;

    .line 700
    .line 701
    const/16 v27, 0x3c4

    .line 702
    .line 703
    const v18, 0x7f080827

    .line 704
    .line 705
    .line 706
    const v19, 0x7f130785

    .line 707
    .line 708
    .line 709
    const v20, 0x7f130784

    .line 710
    .line 711
    .line 712
    const/16 v22, 0x0

    .line 713
    .line 714
    const-wide/16 v23, 0x0

    .line 715
    .line 716
    invoke-static/range {v14 .. v27}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 717
    .line 718
    .line 719
    move-result-object v40

    .line 720
    const/16 v27, 0x3d4

    .line 721
    .line 722
    const/16 v19, 0x0

    .line 723
    .line 724
    const v20, 0x7f130677

    .line 725
    .line 726
    .line 727
    invoke-static/range {v14 .. v27}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 728
    .line 729
    .line 730
    move-result-object v42

    .line 731
    iget-object v1, v3, La/iqt;->a:La/gst0;

    .line 732
    .line 733
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 734
    .line 735
    .line 736
    move-result v32

    .line 737
    new-instance v3, La/rz50;

    .line 738
    .line 739
    new-instance v11, La/kz50;

    .line 740
    .line 741
    sget-object v1, La/iun;->a:La/iun;

    .line 742
    .line 743
    invoke-direct {v11, v1}, La/kz50;-><init>(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    sget-object v4, La/mz50;->a:La/mz50;

    .line 747
    .line 748
    move-object v5, v4

    .line 749
    move-object v6, v4

    .line 750
    move-object v7, v4

    .line 751
    move-object v8, v4

    .line 752
    move-object v9, v4

    .line 753
    move-object v10, v4

    .line 754
    invoke-direct/range {v3 .. v11}, La/rz50;-><init>(La/nz50;La/nz50;La/nz50;La/nz50;La/nz50;La/nz50;La/nz50;La/nz50;)V

    .line 755
    .line 756
    .line 757
    new-array v1, v13, [Ljava/lang/Object;

    .line 758
    .line 759
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 760
    .line 761
    invoke-static {v1, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    const v4, 0x7f13086b

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v29

    .line 772
    sget-object v37, La/k460;->e:La/c0o;

    .line 773
    .line 774
    const-string v1, "SELECTED_TRACK_COEF_KEY"

    .line 775
    .line 776
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    move-object/from16 v43, v1

    .line 781
    .line 782
    check-cast v43, La/s4i0;

    .line 783
    .line 784
    const-string v1, "REMOVING_TRACK_COEF_KEY"

    .line 785
    .line 786
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    move-object/from16 v44, v0

    .line 791
    .line 792
    check-cast v44, La/s4i0;

    .line 793
    .line 794
    new-instance v28, La/c260;

    .line 795
    .line 796
    const/16 v36, 0x0

    .line 797
    .line 798
    const/16 v41, 0x1

    .line 799
    .line 800
    const/16 v30, 0x0

    .line 801
    .line 802
    const/16 v31, 0x0

    .line 803
    .line 804
    const/16 v33, 0x1

    .line 805
    .line 806
    sget-object v34, La/hm5;->a:La/hm5;

    .line 807
    .line 808
    const/16 v35, 0x1

    .line 809
    .line 810
    move-object/from16 v38, v3

    .line 811
    .line 812
    invoke-direct/range {v28 .. v44}, La/c260;-><init>(Ljava/lang/String;La/oz50;ZZZLa/om5;ZZLjava/util/List;La/tz50;La/mdm;La/mdm;ZLa/mdm;La/s4i0;La/s4i0;)V

    .line 813
    .line 814
    .line 815
    return-object v28

    .line 816
    :pswitch_7
    check-cast v6, La/xpj0;

    .line 817
    .line 818
    check-cast v3, La/vne;

    .line 819
    .line 820
    check-cast v2, La/t33;

    .line 821
    .line 822
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 823
    .line 824
    invoke-virtual {v6}, La/xpj0;->c()La/ypj0;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    sget-object v1, La/ypj0;->b:La/ypj0;

    .line 829
    .line 830
    if-ne v0, v1, :cond_d

    .line 831
    .line 832
    iget-object v0, v6, La/xpj0;->e:La/qv2;

    .line 833
    .line 834
    invoke-virtual {v0}, La/qv2;->j()La/no20;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    sget-object v1, La/ypj0;->c:La/ypj0;

    .line 839
    .line 840
    iget-object v0, v0, La/no20;->a:Ljava/util/Map;

    .line 841
    .line 842
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v0

    .line 846
    if-eqz v0, :cond_d

    .line 847
    .line 848
    new-instance v0, La/my7;

    .line 849
    .line 850
    const/16 v1, 0x16

    .line 851
    .line 852
    const/4 v4, 0x0

    .line 853
    invoke-direct {v0, v2, v4, v1}, La/my7;-><init>(La/t33;La/yje;B)V

    .line 854
    .line 855
    .line 856
    invoke-static {v3, v4, v4, v0, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 857
    .line 858
    .line 859
    new-instance v0, La/xp8;

    .line 860
    .line 861
    invoke-direct {v0, v6, v4, v8}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 862
    .line 863
    .line 864
    invoke-static {v3, v4, v4, v0, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 865
    .line 866
    .line 867
    goto :goto_b

    .line 868
    :cond_d
    const/4 v4, 0x0

    .line 869
    new-instance v0, La/xp8;

    .line 870
    .line 871
    const/16 v1, 0x8

    .line 872
    .line 873
    invoke-direct {v0, v6, v4, v1}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 874
    .line 875
    .line 876
    invoke-static {v3, v4, v4, v0, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    new-instance v1, La/r3w;

    .line 881
    .line 882
    const/16 v2, 0xc

    .line 883
    .line 884
    invoke-direct {v1, v15, v2}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v0, v1}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 888
    .line 889
    .line 890
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 891
    .line 892
    return-object v0

    .line 893
    :pswitch_8
    check-cast v6, La/pru;

    .line 894
    .line 895
    check-cast v3, La/r9u;

    .line 896
    .line 897
    check-cast v2, La/ntu;

    .line 898
    .line 899
    check-cast v15, La/yiu;

    .line 900
    .line 901
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    sget-object v1, La/ygp;->c:La/ygp;

    .line 906
    .line 907
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 908
    .line 909
    .line 910
    iget-object v3, v3, La/r9u;->a:La/j1q0;

    .line 911
    .line 912
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 916
    .line 917
    invoke-virtual {v3, v1}, La/m1q0;->d(La/ygp;)Z

    .line 918
    .line 919
    .line 920
    move-result v20

    .line 921
    sget-object v21, La/iun;->a:La/iun;

    .line 922
    .line 923
    iget-object v1, v0, La/sff0;->a:La/gx7;

    .line 924
    .line 925
    iget-object v1, v1, La/gx7;->a:La/gm7;

    .line 926
    .line 927
    iget-boolean v1, v1, La/gm7;->n:Z

    .line 928
    .line 929
    iget-object v2, v2, La/ntu;->a:La/j1q0;

    .line 930
    .line 931
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 932
    .line 933
    invoke-virtual {v2}, La/m1q0;->j()Z

    .line 934
    .line 935
    .line 936
    move-result v22

    .line 937
    iget-boolean v2, v0, La/sff0;->J1:Z

    .line 938
    .line 939
    invoke-virtual {v15}, La/yiu;->a()Z

    .line 940
    .line 941
    .line 942
    move-result v4

    .line 943
    if-nez v4, :cond_f

    .line 944
    .line 945
    iget-boolean v0, v0, La/sff0;->O1:Z

    .line 946
    .line 947
    if-eqz v0, :cond_e

    .line 948
    .line 949
    goto :goto_c

    .line 950
    :cond_e
    move/from16 v27, v13

    .line 951
    .line 952
    goto :goto_d

    .line 953
    :cond_f
    :goto_c
    move/from16 v27, v14

    .line 954
    .line 955
    :goto_d
    sget-object v0, La/ygp;->x:La/ygp;

    .line 956
    .line 957
    invoke-virtual {v3, v0}, La/m1q0;->d(La/ygp;)Z

    .line 958
    .line 959
    .line 960
    move-result v28

    .line 961
    sget-object v25, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 962
    .line 963
    new-instance v16, La/lx30;

    .line 964
    .line 965
    const/16 v18, 0x0

    .line 966
    .line 967
    const/16 v19, 0x0

    .line 968
    .line 969
    const-string v17, ""

    .line 970
    .line 971
    move-object/from16 v24, v21

    .line 972
    .line 973
    move/from16 v23, v1

    .line 974
    .line 975
    move/from16 v26, v2

    .line 976
    .line 977
    invoke-direct/range {v16 .. v28}, La/lx30;-><init>(Ljava/lang/String;La/ql5;La/a5w;ZLjava/util/List;ZZLjava/util/List;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZZZ)V

    .line 978
    .line 979
    .line 980
    return-object v16

    .line 981
    :pswitch_9
    check-cast v6, La/pru;

    .line 982
    .line 983
    check-cast v3, La/vzg0;

    .line 984
    .line 985
    check-cast v2, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 986
    .line 987
    check-cast v15, La/cmt;

    .line 988
    .line 989
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    const-string v1, "KEY_CURRENT_CATEGORY_ID"

    .line 994
    .line 995
    invoke-virtual {v3, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    move-object/from16 v23, v1

    .line 1000
    .line 1001
    check-cast v23, Ljava/lang/Long;

    .line 1002
    .line 1003
    const-string v1, "KEY_CURRENT_SUB_GAME_ID"

    .line 1004
    .line 1005
    invoke-virtual {v3, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    check-cast v1, Ljava/lang/Long;

    .line 1010
    .line 1011
    if-nez v1, :cond_11

    .line 1012
    .line 1013
    iget-wide v3, v2, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->c:J

    .line 1014
    .line 1015
    cmp-long v1, v3, v18

    .line 1016
    .line 1017
    if-nez v1, :cond_10

    .line 1018
    .line 1019
    iget-wide v3, v2, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->a:J

    .line 1020
    .line 1021
    :cond_10
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v1

    .line 1025
    :cond_11
    move-object/from16 v25, v1

    .line 1026
    .line 1027
    iget-object v0, v0, La/sff0;->h1:La/udl0;

    .line 1028
    .line 1029
    new-instance v1, La/sf6;

    .line 1030
    .line 1031
    iget-object v2, v15, La/cmt;->b:Ljava/lang/Object;

    .line 1032
    .line 1033
    check-cast v2, La/yk50;

    .line 1034
    .line 1035
    iget-object v2, v2, La/yk50;->b:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v2, La/of6;

    .line 1038
    .line 1039
    iget-object v2, v2, La/of6;->a:La/q7d0;

    .line 1040
    .line 1041
    const-string v3, "KEY_MARKETS_CATEGORIES_BET_BUILDER_BADGE_CLICKED"

    .line 1042
    .line 1043
    invoke-virtual {v2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    invoke-interface {v2, v3, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v2

    .line 1051
    xor-int/2addr v2, v14

    .line 1052
    sget-object v3, La/nl6;->a:La/nl6;

    .line 1053
    .line 1054
    invoke-direct {v1, v3, v2}, La/sf6;-><init>(La/ol6;Z)V

    .line 1055
    .line 1056
    .line 1057
    new-instance v20, La/dz20;

    .line 1058
    .line 1059
    const-string v29, ""

    .line 1060
    .line 1061
    const/16 v32, 0x0

    .line 1062
    .line 1063
    const/16 v21, 0x0

    .line 1064
    .line 1065
    const/16 v22, 0x0

    .line 1066
    .line 1067
    const/16 v24, 0x0

    .line 1068
    .line 1069
    const/16 v26, 0x0

    .line 1070
    .line 1071
    const/16 v28, 0x0

    .line 1072
    .line 1073
    sget-object v30, La/nx7;->a:La/nx7;

    .line 1074
    .line 1075
    move-object/from16 v27, v0

    .line 1076
    .line 1077
    move-object/from16 v31, v1

    .line 1078
    .line 1079
    invoke-direct/range {v20 .. v32}, La/dz20;-><init>(Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;La/udl0;ZLjava/lang/String;La/px7;La/sf6;Z)V

    .line 1080
    .line 1081
    .line 1082
    return-object v20

    .line 1083
    :pswitch_a
    check-cast v6, La/cgk0;

    .line 1084
    .line 1085
    check-cast v3, La/cgk0;

    .line 1086
    .line 1087
    check-cast v2, La/cgk0;

    .line 1088
    .line 1089
    check-cast v15, La/cgk0;

    .line 1090
    .line 1091
    invoke-virtual {v6}, La/cgk0;->l()I

    .line 1092
    .line 1093
    .line 1094
    move-result v0

    .line 1095
    invoke-virtual {v3}, La/cgk0;->l()I

    .line 1096
    .line 1097
    .line 1098
    move-result v1

    .line 1099
    add-int/2addr v1, v0

    .line 1100
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 1101
    .line 1102
    .line 1103
    move-result v0

    .line 1104
    add-int/2addr v0, v1

    .line 1105
    invoke-virtual {v15}, La/cgk0;->l()I

    .line 1106
    .line 1107
    .line 1108
    move-result v1

    .line 1109
    add-int/2addr v1, v0

    .line 1110
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    return-object v0

    .line 1115
    :pswitch_b
    move-object v4, v6

    .line 1116
    check-cast v4, Ljava/lang/Float;

    .line 1117
    .line 1118
    move-object v0, v3

    .line 1119
    check-cast v0, La/x7x;

    .line 1120
    .line 1121
    move-object v5, v2

    .line 1122
    check-cast v5, Ljava/lang/Float;

    .line 1123
    .line 1124
    move-object v2, v15

    .line 1125
    check-cast v2, La/w7x;

    .line 1126
    .line 1127
    iget-object v1, v0, La/x7x;->a:Ljava/lang/Float;

    .line 1128
    .line 1129
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v1

    .line 1133
    if-eqz v1, :cond_12

    .line 1134
    .line 1135
    iget-object v1, v0, La/x7x;->b:Ljava/lang/Float;

    .line 1136
    .line 1137
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v1

    .line 1141
    if-nez v1, :cond_13

    .line 1142
    .line 1143
    :cond_12
    iput-object v4, v0, La/x7x;->a:Ljava/lang/Float;

    .line 1144
    .line 1145
    iput-object v5, v0, La/x7x;->b:Ljava/lang/Float;

    .line 1146
    .line 1147
    new-instance v1, La/wto0;

    .line 1148
    .line 1149
    const/4 v6, 0x0

    .line 1150
    sget-object v3, La/hp4;->j:La/lxs0;

    .line 1151
    .line 1152
    invoke-direct/range {v1 .. v6}, La/wto0;-><init>(La/j73;La/lxs0;Ljava/lang/Object;Ljava/lang/Object;La/t73;)V

    .line 1153
    .line 1154
    .line 1155
    iput-object v1, v0, La/x7x;->d:La/wto0;

    .line 1156
    .line 1157
    iget-object v1, v0, La/x7x;->h:La/z7x;

    .line 1158
    .line 1159
    iget-object v1, v1, La/z7x;->b:La/pz40;

    .line 1160
    .line 1161
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1162
    .line 1163
    check-cast v1, La/hgk0;

    .line 1164
    .line 1165
    invoke-virtual {v1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 1166
    .line 1167
    .line 1168
    iput-boolean v13, v0, La/x7x;->e:Z

    .line 1169
    .line 1170
    iput-boolean v14, v0, La/x7x;->f:Z

    .line 1171
    .line 1172
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1173
    .line 1174
    return-object v0

    .line 1175
    :pswitch_c
    check-cast v6, La/pru;

    .line 1176
    .line 1177
    check-cast v3, La/hnu;

    .line 1178
    .line 1179
    check-cast v2, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 1180
    .line 1181
    check-cast v15, La/f8w;

    .line 1182
    .line 1183
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 1188
    .line 1189
    iget-object v0, v0, La/gx7;->a:La/gm7;

    .line 1190
    .line 1191
    iget-boolean v1, v0, La/gm7;->m:Z

    .line 1192
    .line 1193
    if-nez v1, :cond_15

    .line 1194
    .line 1195
    iget-boolean v1, v0, La/gm7;->n:Z

    .line 1196
    .line 1197
    if-nez v1, :cond_15

    .line 1198
    .line 1199
    iget-boolean v0, v0, La/gm7;->q:Z

    .line 1200
    .line 1201
    if-eqz v0, :cond_14

    .line 1202
    .line 1203
    goto :goto_e

    .line 1204
    :cond_14
    move v0, v13

    .line 1205
    goto :goto_f

    .line 1206
    :cond_15
    :goto_e
    move v0, v14

    .line 1207
    :goto_f
    invoke-virtual {v3, v2, v15, v0}, La/hnu;->h(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;Z)Ljava/util/List;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1212
    .line 1213
    .line 1214
    move-result v1

    .line 1215
    if-eqz v1, :cond_17

    .line 1216
    .line 1217
    :cond_16
    move/from16 v21, v14

    .line 1218
    .line 1219
    goto :goto_10

    .line 1220
    :cond_17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v1

    .line 1224
    :cond_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1225
    .line 1226
    .line 1227
    move-result v3

    .line 1228
    if-eqz v3, :cond_16

    .line 1229
    .line 1230
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v3

    .line 1234
    check-cast v3, La/h0w;

    .line 1235
    .line 1236
    iget-boolean v3, v3, La/h0w;->b:Z

    .line 1237
    .line 1238
    if-nez v3, :cond_18

    .line 1239
    .line 1240
    move/from16 v21, v13

    .line 1241
    .line 1242
    :goto_10
    invoke-static {v0, v10}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v1

    .line 1246
    if-eqz v1, :cond_1a

    .line 1247
    .line 1248
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1249
    .line 1250
    .line 1251
    move-result v3

    .line 1252
    if-eqz v3, :cond_1a

    .line 1253
    .line 1254
    :cond_19
    move/from16 v22, v14

    .line 1255
    .line 1256
    goto :goto_11

    .line 1257
    :cond_1a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    :cond_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1262
    .line 1263
    .line 1264
    move-result v3

    .line 1265
    if-eqz v3, :cond_19

    .line 1266
    .line 1267
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v3

    .line 1271
    check-cast v3, La/h0w;

    .line 1272
    .line 1273
    iget-boolean v3, v3, La/h0w;->b:Z

    .line 1274
    .line 1275
    if-nez v3, :cond_1b

    .line 1276
    .line 1277
    move/from16 v22, v13

    .line 1278
    .line 1279
    :goto_11
    invoke-static {v10, v0}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v1

    .line 1283
    if-eqz v1, :cond_1d

    .line 1284
    .line 1285
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1286
    .line 1287
    .line 1288
    move-result v3

    .line 1289
    if-eqz v3, :cond_1d

    .line 1290
    .line 1291
    :cond_1c
    move/from16 v23, v14

    .line 1292
    .line 1293
    goto :goto_12

    .line 1294
    :cond_1d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    :cond_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1299
    .line 1300
    .line 1301
    move-result v3

    .line 1302
    if-eqz v3, :cond_1c

    .line 1303
    .line 1304
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v3

    .line 1308
    check-cast v3, La/h0w;

    .line 1309
    .line 1310
    iget-boolean v3, v3, La/h0w;->b:Z

    .line 1311
    .line 1312
    if-nez v3, :cond_1e

    .line 1313
    .line 1314
    move/from16 v23, v13

    .line 1315
    .line 1316
    :goto_12
    new-instance v16, La/unm0;

    .line 1317
    .line 1318
    const/16 v19, 0x1

    .line 1319
    .line 1320
    const/16 v20, 0x0

    .line 1321
    .line 1322
    move-object/from16 v18, v0

    .line 1323
    .line 1324
    move-object/from16 v17, v0

    .line 1325
    .line 1326
    move-object/from16 v24, v2

    .line 1327
    .line 1328
    invoke-direct/range {v16 .. v24}, La/unm0;-><init>(Ljava/util/List;Ljava/util/List;ZZZZZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 1329
    .line 1330
    .line 1331
    return-object v16

    .line 1332
    :pswitch_d
    check-cast v6, La/fet;

    .line 1333
    .line 1334
    check-cast v3, La/qpb;

    .line 1335
    .line 1336
    check-cast v2, La/p9k0;

    .line 1337
    .line 1338
    check-cast v15, La/mu40;

    .line 1339
    .line 1340
    iget-object v1, v6, La/fet;->M:La/vkd;

    .line 1341
    .line 1342
    iget-object v4, v1, La/vkd;->b:La/qpb;

    .line 1343
    .line 1344
    :try_start_0
    iput-object v3, v1, La/vkd;->b:La/qpb;

    .line 1345
    .line 1346
    iget-object v3, v6, La/fet;->G:La/p9k0;

    .line 1347
    .line 1348
    iget-object v5, v6, La/fet;->o:[I

    .line 1349
    .line 1350
    iget-object v7, v6, La/fet;->v:La/ey40;

    .line 1351
    .line 1352
    const/4 v0, 0x0

    .line 1353
    iput-object v0, v6, La/fet;->o:[I

    .line 1354
    .line 1355
    iput-object v0, v6, La/fet;->v:La/ey40;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1356
    .line 1357
    :try_start_1
    iput-object v2, v6, La/fet;->G:La/p9k0;

    .line 1358
    .line 1359
    iget-boolean v2, v1, La/vkd;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1360
    .line 1361
    :try_start_2
    iput-boolean v13, v1, La/vkd;->e:Z

    .line 1362
    .line 1363
    iget-object v0, v15, La/mu40;->a:La/ju40;

    .line 1364
    .line 1365
    iget-object v8, v15, La/mu40;->g:La/bh90;

    .line 1366
    .line 1367
    iget-object v9, v15, La/mu40;->b:Ljava/lang/Object;

    .line 1368
    .line 1369
    invoke-virtual {v6, v0, v8, v9, v14}, La/fet;->F(La/ju40;La/bh90;Ljava/lang/Object;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1370
    .line 1371
    .line 1372
    :try_start_3
    iput-boolean v2, v1, La/vkd;->e:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1373
    .line 1374
    :try_start_4
    iput-object v3, v6, La/fet;->G:La/p9k0;

    .line 1375
    .line 1376
    iput-object v5, v6, La/fet;->o:[I

    .line 1377
    .line 1378
    iput-object v7, v6, La/fet;->v:La/ey40;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1379
    .line 1380
    iput-object v4, v1, La/vkd;->b:La/qpb;

    .line 1381
    .line 1382
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1383
    .line 1384
    return-object v0

    .line 1385
    :catchall_0
    move-exception v0

    .line 1386
    goto :goto_14

    .line 1387
    :catchall_1
    move-exception v0

    .line 1388
    goto :goto_13

    .line 1389
    :catchall_2
    move-exception v0

    .line 1390
    :try_start_5
    iput-boolean v2, v1, La/vkd;->e:Z

    .line 1391
    .line 1392
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1393
    :goto_13
    :try_start_6
    iput-object v3, v6, La/fet;->G:La/p9k0;

    .line 1394
    .line 1395
    iput-object v5, v6, La/fet;->o:[I

    .line 1396
    .line 1397
    iput-object v7, v6, La/fet;->v:La/ey40;

    .line 1398
    .line 1399
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1400
    :goto_14
    iput-object v4, v1, La/vkd;->b:La/qpb;

    .line 1401
    .line 1402
    throw v0

    .line 1403
    :pswitch_e
    check-cast v6, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;

    .line 1404
    .line 1405
    check-cast v3, La/vzg0;

    .line 1406
    .line 1407
    check-cast v2, La/lbu;

    .line 1408
    .line 1409
    check-cast v15, La/r9u;

    .line 1410
    .line 1411
    iget-wide v0, v6, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;->c:J

    .line 1412
    .line 1413
    iget-boolean v4, v6, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;->b:Z

    .line 1414
    .line 1415
    iget-object v5, v6, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;->d:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1416
    .line 1417
    const-string v7, "KEY_GAME_ID"

    .line 1418
    .line 1419
    invoke-static {v0, v1, v7}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v7

    .line 1423
    const-string v8, "KEY_GAME_TYPE"

    .line 1424
    .line 1425
    invoke-static {v0, v1, v8}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v8

    .line 1429
    const-string v9, "KEY_CURRENT_NAVIGATION_TAB"

    .line 1430
    .line 1431
    invoke-virtual {v3, v9}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v9

    .line 1435
    check-cast v9, La/tf50;

    .line 1436
    .line 1437
    if-nez v9, :cond_22

    .line 1438
    .line 1439
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 1440
    .line 1441
    .line 1442
    move-result v9

    .line 1443
    if-eqz v9, :cond_21

    .line 1444
    .line 1445
    if-eq v9, v14, :cond_20

    .line 1446
    .line 1447
    if-ne v9, v10, :cond_1f

    .line 1448
    .line 1449
    const/4 v9, 0x0

    .line 1450
    goto :goto_16

    .line 1451
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 1452
    .line 1453
    .line 1454
    :goto_15
    const/4 v12, 0x0

    .line 1455
    goto/16 :goto_1a

    .line 1456
    .line 1457
    :cond_20
    sget-object v9, La/tf50;->b:La/tf50;

    .line 1458
    .line 1459
    goto :goto_16

    .line 1460
    :cond_21
    sget-object v9, La/tf50;->b:La/tf50;

    .line 1461
    .line 1462
    :cond_22
    :goto_16
    const-string v11, "KEY_BROADCASTING_TAB"

    .line 1463
    .line 1464
    invoke-virtual {v3, v11}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v11

    .line 1468
    check-cast v11, La/o49;

    .line 1469
    .line 1470
    if-nez v11, :cond_26

    .line 1471
    .line 1472
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 1473
    .line 1474
    .line 1475
    move-result v5

    .line 1476
    if-eqz v5, :cond_25

    .line 1477
    .line 1478
    if-eq v5, v14, :cond_24

    .line 1479
    .line 1480
    if-ne v5, v10, :cond_23

    .line 1481
    .line 1482
    const/16 v30, 0x0

    .line 1483
    .line 1484
    goto :goto_18

    .line 1485
    :cond_23
    invoke-static {}, La/t9f;->b()V

    .line 1486
    .line 1487
    .line 1488
    goto :goto_15

    .line 1489
    :cond_24
    sget-object v12, La/o49;->b:La/o49;

    .line 1490
    .line 1491
    :goto_17
    move-object/from16 v30, v12

    .line 1492
    .line 1493
    goto :goto_18

    .line 1494
    :cond_25
    sget-object v12, La/o49;->a:La/o49;

    .line 1495
    .line 1496
    goto :goto_17

    .line 1497
    :cond_26
    move-object/from16 v30, v11

    .line 1498
    .line 1499
    :goto_18
    invoke-virtual {v3, v7}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v5

    .line 1503
    check-cast v5, Ljava/lang/Long;

    .line 1504
    .line 1505
    if-eqz v5, :cond_27

    .line 1506
    .line 1507
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 1508
    .line 1509
    .line 1510
    move-result-wide v0

    .line 1511
    :cond_27
    move-wide/from16 v17, v0

    .line 1512
    .line 1513
    const-string v0, "KEY_LIVE"

    .line 1514
    .line 1515
    invoke-virtual {v3, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    check-cast v0, Ljava/lang/Boolean;

    .line 1520
    .line 1521
    if-eqz v0, :cond_28

    .line 1522
    .line 1523
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1524
    .line 1525
    .line 1526
    move-result v0

    .line 1527
    move/from16 v21, v0

    .line 1528
    .line 1529
    goto :goto_19

    .line 1530
    :cond_28
    move/from16 v21, v4

    .line 1531
    .line 1532
    :goto_19
    iget-wide v0, v6, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;->a:J

    .line 1533
    .line 1534
    invoke-virtual {v2}, La/lbu;->j()Z

    .line 1535
    .line 1536
    .line 1537
    move-result v28

    .line 1538
    iget-wide v5, v6, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;->e:J

    .line 1539
    .line 1540
    const-string v2, "KEY_CHAMP_ID"

    .line 1541
    .line 1542
    invoke-virtual {v3, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v2

    .line 1546
    move-object/from16 v26, v2

    .line 1547
    .line 1548
    check-cast v26, Ljava/lang/Long;

    .line 1549
    .line 1550
    const-string v2, "KEY_SHOW_SUB_GAMES"

    .line 1551
    .line 1552
    invoke-virtual {v3, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v2

    .line 1556
    check-cast v2, Ljava/lang/Boolean;

    .line 1557
    .line 1558
    if-eqz v2, :cond_29

    .line 1559
    .line 1560
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1561
    .line 1562
    .line 1563
    move-result v14

    .line 1564
    :cond_29
    move/from16 v54, v14

    .line 1565
    .line 1566
    sget-object v65, La/iun;->a:La/iun;

    .line 1567
    .line 1568
    invoke-virtual {v3, v8}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v2

    .line 1572
    check-cast v2, La/t3z;

    .line 1573
    .line 1574
    if-nez v2, :cond_2a

    .line 1575
    .line 1576
    sget-object v2, La/t3z;->a:La/rqt;

    .line 1577
    .line 1578
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1579
    .line 1580
    .line 1581
    invoke-static {v4, v13, v13}, La/rqt;->h(ZZZ)La/t3z;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v2

    .line 1585
    :cond_2a
    move-object/from16 v27, v2

    .line 1586
    .line 1587
    const-string v2, "KEY_CATEGORY_ID"

    .line 1588
    .line 1589
    invoke-virtual {v3, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v2

    .line 1593
    move-object/from16 v60, v2

    .line 1594
    .line 1595
    check-cast v60, Ljava/lang/Long;

    .line 1596
    .line 1597
    if-nez v9, :cond_2b

    .line 1598
    .line 1599
    sget-object v9, La/tf50;->a:La/tf50;

    .line 1600
    .line 1601
    :cond_2b
    move-object/from16 v29, v9

    .line 1602
    .line 1603
    new-instance v2, Ljava/util/ArrayList;

    .line 1604
    .line 1605
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1606
    .line 1607
    .line 1608
    sget-object v4, La/ch00;->b:La/ch00;

    .line 1609
    .line 1610
    const-string v7, "SHORT_STATISTIC"

    .line 1611
    .line 1612
    invoke-virtual {v3, v7}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v7

    .line 1616
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1617
    .line 1618
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v7

    .line 1622
    if-eqz v7, :cond_2c

    .line 1623
    .line 1624
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1625
    .line 1626
    .line 1627
    :cond_2c
    sget-object v4, La/ch00;->c:La/ch00;

    .line 1628
    .line 1629
    const-string v7, "LAST_GAMES"

    .line 1630
    .line 1631
    invoke-virtual {v3, v7}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v7

    .line 1635
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1636
    .line 1637
    .line 1638
    move-result v7

    .line 1639
    if-eqz v7, :cond_2d

    .line 1640
    .line 1641
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    :cond_2d
    sget-object v4, La/ch00;->d:La/ch00;

    .line 1645
    .line 1646
    const-string v7, "LAST_GAMES_OPP_ONE"

    .line 1647
    .line 1648
    invoke-virtual {v3, v7}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v7

    .line 1652
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1653
    .line 1654
    .line 1655
    move-result v7

    .line 1656
    if-eqz v7, :cond_2e

    .line 1657
    .line 1658
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1659
    .line 1660
    .line 1661
    :cond_2e
    sget-object v4, La/ch00;->e:La/ch00;

    .line 1662
    .line 1663
    const-string v7, "LAST_GAMES_OPP_TWO"

    .line 1664
    .line 1665
    invoke-virtual {v3, v7}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v3

    .line 1669
    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1670
    .line 1671
    .line 1672
    move-result v3

    .line 1673
    if-eqz v3, :cond_2f

    .line 1674
    .line 1675
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1676
    .line 1677
    .line 1678
    :cond_2f
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v31

    .line 1682
    sget-object v2, La/ygp;->t:La/ygp;

    .line 1683
    .line 1684
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1685
    .line 1686
    .line 1687
    iget-object v3, v15, La/r9u;->a:La/j1q0;

    .line 1688
    .line 1689
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1690
    .line 1691
    .line 1692
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 1693
    .line 1694
    invoke-virtual {v3, v2}, La/m1q0;->d(La/ygp;)Z

    .line 1695
    .line 1696
    .line 1697
    move-result v66

    .line 1698
    new-instance v16, La/njs;

    .line 1699
    .line 1700
    const/16 v63, 0x0

    .line 1701
    .line 1702
    const/16 v64, 0x0

    .line 1703
    .line 1704
    const-string v19, ""

    .line 1705
    .line 1706
    const/16 v20, 0x0

    .line 1707
    .line 1708
    const/16 v32, 0x0

    .line 1709
    .line 1710
    const/16 v33, 0x0

    .line 1711
    .line 1712
    const/16 v34, 0x0

    .line 1713
    .line 1714
    const/16 v35, 0x0

    .line 1715
    .line 1716
    const/16 v36, 0x0

    .line 1717
    .line 1718
    const/16 v37, 0x0

    .line 1719
    .line 1720
    const/16 v38, 0x0

    .line 1721
    .line 1722
    const/16 v39, 0x0

    .line 1723
    .line 1724
    const/16 v40, 0x0

    .line 1725
    .line 1726
    const/16 v41, 0x0

    .line 1727
    .line 1728
    const/16 v42, 0x0

    .line 1729
    .line 1730
    const/16 v43, 0x0

    .line 1731
    .line 1732
    const/16 v44, 0x0

    .line 1733
    .line 1734
    const/16 v45, 0x0

    .line 1735
    .line 1736
    const/16 v46, 0x0

    .line 1737
    .line 1738
    const/16 v47, 0x0

    .line 1739
    .line 1740
    const/16 v48, 0x0

    .line 1741
    .line 1742
    const/16 v49, 0x0

    .line 1743
    .line 1744
    const/16 v50, 0x0

    .line 1745
    .line 1746
    const/16 v51, 0x0

    .line 1747
    .line 1748
    const/16 v52, 0x0

    .line 1749
    .line 1750
    const/16 v53, 0x1

    .line 1751
    .line 1752
    const/16 v55, 0x0

    .line 1753
    .line 1754
    const/16 v56, 0x0

    .line 1755
    .line 1756
    const/16 v57, 0x0

    .line 1757
    .line 1758
    const/16 v58, 0x0

    .line 1759
    .line 1760
    const/16 v59, 0x0

    .line 1761
    .line 1762
    const/16 v61, 0x0

    .line 1763
    .line 1764
    const/16 v62, 0x0

    .line 1765
    .line 1766
    move-object/from16 v67, v65

    .line 1767
    .line 1768
    move-wide/from16 v22, v0

    .line 1769
    .line 1770
    move-wide/from16 v24, v5

    .line 1771
    .line 1772
    invoke-direct/range {v16 .. v67}, La/njs;-><init>(JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;ZLa/tf50;La/o49;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZZZZZZLa/fsr;La/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;)V

    .line 1773
    .line 1774
    .line 1775
    move-object/from16 v12, v16

    .line 1776
    .line 1777
    :goto_1a
    return-object v12

    .line 1778
    :pswitch_f
    check-cast v6, La/pru;

    .line 1779
    .line 1780
    check-cast v3, La/lbu;

    .line 1781
    .line 1782
    check-cast v2, La/luu;

    .line 1783
    .line 1784
    check-cast v15, La/r9u;

    .line 1785
    .line 1786
    new-instance v20, La/kxp;

    .line 1787
    .line 1788
    sget-object v0, La/zxp;->c:[La/zxp;

    .line 1789
    .line 1790
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v25

    .line 1794
    invoke-virtual {v3}, La/lbu;->j()Z

    .line 1795
    .line 1796
    .line 1797
    move-result v26

    .line 1798
    iget-object v0, v2, La/luu;->a:La/nok0;

    .line 1799
    .line 1800
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v27

    .line 1804
    sget-object v0, La/ygp;->t:La/ygp;

    .line 1805
    .line 1806
    iget-object v1, v15, La/r9u;->a:La/j1q0;

    .line 1807
    .line 1808
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1809
    .line 1810
    .line 1811
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 1812
    .line 1813
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 1814
    .line 1815
    .line 1816
    move-result v28

    .line 1817
    new-instance v0, La/ypl0;

    .line 1818
    .line 1819
    sget-object v1, La/lel0;->Companion:La/kel0;

    .line 1820
    .line 1821
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1822
    .line 1823
    .line 1824
    invoke-static {}, La/kel0;->a()La/lel0;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v1

    .line 1828
    const-string v2, ""

    .line 1829
    .line 1830
    move-wide/from16 v3, v18

    .line 1831
    .line 1832
    invoke-direct {v0, v3, v4, v2, v1}, La/ypl0;-><init>(JLjava/lang/String;La/lel0;)V

    .line 1833
    .line 1834
    .line 1835
    const/16 v21, 0x1

    .line 1836
    .line 1837
    const/16 v22, 0x0

    .line 1838
    .line 1839
    const-wide/16 v23, 0x1

    .line 1840
    .line 1841
    move-object/from16 v29, v0

    .line 1842
    .line 1843
    invoke-direct/range {v20 .. v29}, La/kxp;-><init>(ZLa/xwp;JLa/sff0;ZLjava/util/List;ZLa/ypl0;)V

    .line 1844
    .line 1845
    .line 1846
    return-object v20

    .line 1847
    :pswitch_10
    check-cast v6, La/pru;

    .line 1848
    .line 1849
    check-cast v3, La/lbu;

    .line 1850
    .line 1851
    check-cast v2, La/svu;

    .line 1852
    .line 1853
    check-cast v15, La/r9u;

    .line 1854
    .line 1855
    new-instance v16, La/z8o;

    .line 1856
    .line 1857
    sget-object v19, La/iun;->a:La/iun;

    .line 1858
    .line 1859
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v20

    .line 1863
    invoke-virtual {v3}, La/lbu;->j()Z

    .line 1864
    .line 1865
    .line 1866
    move-result v21

    .line 1867
    new-instance v0, La/d8o;

    .line 1868
    .line 1869
    sget-object v1, La/a9o;->a:[La/a9o;

    .line 1870
    .line 1871
    sget-object v1, La/lun;->a:La/lun;

    .line 1872
    .line 1873
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1874
    .line 1875
    .line 1876
    const-wide/16 v3, 0x1

    .line 1877
    .line 1878
    invoke-direct {v0, v3, v4, v1}, La/d8o;-><init>(JLjava/util/Map;)V

    .line 1879
    .line 1880
    .line 1881
    invoke-virtual {v2}, La/svu;->l()Z

    .line 1882
    .line 1883
    .line 1884
    move-result v23

    .line 1885
    sget-object v1, La/ygp;->t:La/ygp;

    .line 1886
    .line 1887
    iget-object v2, v15, La/r9u;->a:La/j1q0;

    .line 1888
    .line 1889
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1890
    .line 1891
    .line 1892
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 1893
    .line 1894
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 1895
    .line 1896
    .line 1897
    move-result v24

    .line 1898
    const/16 v17, 0x1

    .line 1899
    .line 1900
    const/16 v18, 0x0

    .line 1901
    .line 1902
    move-object/from16 v22, v0

    .line 1903
    .line 1904
    invoke-direct/range {v16 .. v24}, La/z8o;-><init>(ZLa/w7o;Ljava/util/List;La/sff0;ZLa/d8o;ZZ)V

    .line 1905
    .line 1906
    .line 1907
    return-object v16

    .line 1908
    :pswitch_11
    check-cast v6, La/ocl;

    .line 1909
    .line 1910
    check-cast v3, La/pru;

    .line 1911
    .line 1912
    check-cast v2, La/bzt;

    .line 1913
    .line 1914
    check-cast v15, La/r9u;

    .line 1915
    .line 1916
    iget-object v0, v6, La/ocl;->a:Ljava/lang/Object;

    .line 1917
    .line 1918
    check-cast v0, La/vqc;

    .line 1919
    .line 1920
    invoke-virtual {v0}, La/vqc;->d()La/v0f;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v0

    .line 1924
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v1

    .line 1928
    iget-object v1, v1, La/sff0;->a:La/gx7;

    .line 1929
    .line 1930
    iget-object v1, v1, La/gx7;->c:La/b3f;

    .line 1931
    .line 1932
    iget-object v3, v0, La/v0f;->b:La/q4f;

    .line 1933
    .line 1934
    iget-object v2, v2, La/bzt;->a:La/fsd;

    .line 1935
    .line 1936
    invoke-virtual {v2}, La/fsd;->a()La/v8d;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v2

    .line 1940
    iget v2, v2, La/v8d;->r:I

    .line 1941
    .line 1942
    sget-object v19, La/iun;->a:La/iun;

    .line 1943
    .line 1944
    iget-object v4, v1, La/b3f;->i:La/xte;

    .line 1945
    .line 1946
    iget-object v1, v1, La/b3f;->j:La/ate;

    .line 1947
    .line 1948
    iget-object v1, v1, La/ate;->a:Ljava/lang/String;

    .line 1949
    .line 1950
    invoke-static {v1}, La/vbc;->e0(Ljava/lang/String;)La/rse;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v22

    .line 1954
    new-instance v5, La/en7;

    .line 1955
    .line 1956
    const-wide/16 v9, 0x0

    .line 1957
    .line 1958
    const/4 v11, 0x0

    .line 1959
    const/4 v6, 0x0

    .line 1960
    const/4 v7, 0x0

    .line 1961
    const/4 v8, 0x0

    .line 1962
    invoke-direct/range {v5 .. v11}, La/en7;-><init>(IIIDZ)V

    .line 1963
    .line 1964
    .line 1965
    sget-object v1, La/ygp;->t:La/ygp;

    .line 1966
    .line 1967
    iget-object v6, v15, La/r9u;->a:La/j1q0;

    .line 1968
    .line 1969
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1970
    .line 1971
    .line 1972
    iget-object v6, v6, La/j1q0;->a:La/m1q0;

    .line 1973
    .line 1974
    invoke-virtual {v6, v1}, La/m1q0;->d(La/ygp;)Z

    .line 1975
    .line 1976
    .line 1977
    move-result v32

    .line 1978
    new-instance v16, La/inn;

    .line 1979
    .line 1980
    const-wide/16 v29, 0x0

    .line 1981
    .line 1982
    const/16 v31, 0x0

    .line 1983
    .line 1984
    const/16 v18, 0x0

    .line 1985
    .line 1986
    sget-object v23, La/yln;->a:La/yln;

    .line 1987
    .line 1988
    sget-object v25, La/lnn;->a:La/lnn;

    .line 1989
    .line 1990
    const/16 v26, 0x0

    .line 1991
    .line 1992
    const/16 v27, 0x0

    .line 1993
    .line 1994
    move-object/from16 v24, v0

    .line 1995
    .line 1996
    move/from16 v20, v2

    .line 1997
    .line 1998
    move-object/from16 v17, v3

    .line 1999
    .line 2000
    move-object/from16 v21, v4

    .line 2001
    .line 2002
    move-object/from16 v28, v5

    .line 2003
    .line 2004
    invoke-direct/range {v16 .. v32}, La/inn;-><init>(La/q4f;ZLjava/util/List;ILa/xte;La/rse;La/amn;La/v0f;La/nnn;ZZLa/en7;JZZ)V

    .line 2005
    .line 2006
    .line 2007
    return-object v16

    .line 2008
    :pswitch_12
    check-cast v6, La/ibu;

    .line 2009
    .line 2010
    check-cast v3, La/hbu;

    .line 2011
    .line 2012
    move-object/from16 v22, v2

    .line 2013
    .line 2014
    check-cast v22, La/wdn;

    .line 2015
    .line 2016
    check-cast v15, La/g7u;

    .line 2017
    .line 2018
    iget-object v0, v6, La/ibu;->a:La/ien;

    .line 2019
    .line 2020
    iget-object v0, v0, La/ien;->a:La/gen;

    .line 2021
    .line 2022
    iget-object v0, v0, La/gen;->b:La/qoj0;

    .line 2023
    .line 2024
    invoke-static {v0}, La/ebc;->k0(La/mz40;)La/hen;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v0

    .line 2028
    iget-object v0, v0, La/hen;->a:Ljava/util/List;

    .line 2029
    .line 2030
    iget-object v1, v3, La/hbu;->a:La/ien;

    .line 2031
    .line 2032
    iget-object v1, v1, La/ien;->a:La/gen;

    .line 2033
    .line 2034
    iget-object v1, v1, La/gen;->b:La/qoj0;

    .line 2035
    .line 2036
    invoke-static {v1}, La/ebc;->k0(La/mz40;)La/hen;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v1

    .line 2040
    iget-object v1, v1, La/hen;->b:Ljava/util/List;

    .line 2041
    .line 2042
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    .line 2043
    .line 2044
    .line 2045
    move-result v2

    .line 2046
    if-eqz v2, :cond_31

    .line 2047
    .line 2048
    if-ne v2, v14, :cond_30

    .line 2049
    .line 2050
    new-instance v2, Lkotlin/Pair;

    .line 2051
    .line 2052
    invoke-direct {v2, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2053
    .line 2054
    .line 2055
    goto :goto_1b

    .line 2056
    :cond_30
    invoke-static {}, La/t9f;->b()V

    .line 2057
    .line 2058
    .line 2059
    const/4 v12, 0x0

    .line 2060
    goto/16 :goto_1e

    .line 2061
    .line 2062
    :cond_31
    new-instance v2, Lkotlin/Pair;

    .line 2063
    .line 2064
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2065
    .line 2066
    .line 2067
    :goto_1b
    iget-object v0, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2068
    .line 2069
    check-cast v0, Ljava/util/List;

    .line 2070
    .line 2071
    iget-object v1, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2072
    .line 2073
    check-cast v1, Ljava/util/List;

    .line 2074
    .line 2075
    new-instance v2, Ljava/util/ArrayList;

    .line 2076
    .line 2077
    invoke-static {v0, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2078
    .line 2079
    .line 2080
    move-result v3

    .line 2081
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2082
    .line 2083
    .line 2084
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v0

    .line 2088
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2089
    .line 2090
    .line 2091
    move-result v3

    .line 2092
    if-eqz v3, :cond_32

    .line 2093
    .line 2094
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v3

    .line 2098
    check-cast v3, La/tdn;

    .line 2099
    .line 2100
    iget-wide v3, v3, La/tdn;->a:J

    .line 2101
    .line 2102
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v3

    .line 2106
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2107
    .line 2108
    .line 2109
    goto :goto_1c

    .line 2110
    :cond_32
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2111
    .line 2112
    .line 2113
    move-result-object v25

    .line 2114
    iget-object v0, v15, La/g7u;->a:La/ien;

    .line 2115
    .line 2116
    iget-object v0, v0, La/ien;->a:La/gen;

    .line 2117
    .line 2118
    iget-object v0, v0, La/gen;->a:La/p7m0;

    .line 2119
    .line 2120
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v0

    .line 2124
    check-cast v0, Ljava/util/List;

    .line 2125
    .line 2126
    if-nez v0, :cond_33

    .line 2127
    .line 2128
    sget-object v0, La/iun;->a:La/iun;

    .line 2129
    .line 2130
    :cond_33
    move-object/from16 v23, v0

    .line 2131
    .line 2132
    new-instance v0, Ljava/util/ArrayList;

    .line 2133
    .line 2134
    invoke-static {v1, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2135
    .line 2136
    .line 2137
    move-result v2

    .line 2138
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2139
    .line 2140
    .line 2141
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v1

    .line 2145
    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2146
    .line 2147
    .line 2148
    move-result v2

    .line 2149
    if-eqz v2, :cond_34

    .line 2150
    .line 2151
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v2

    .line 2155
    check-cast v2, La/tdn;

    .line 2156
    .line 2157
    iget-wide v2, v2, La/tdn;->a:J

    .line 2158
    .line 2159
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v2

    .line 2163
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2164
    .line 2165
    .line 2166
    goto :goto_1d

    .line 2167
    :cond_34
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v24

    .line 2171
    new-instance v21, La/ybn;

    .line 2172
    .line 2173
    const/16 v27, 0x0

    .line 2174
    .line 2175
    move-object/from16 v26, v25

    .line 2176
    .line 2177
    invoke-direct/range {v21 .. v27}, La/ybn;-><init>(La/wdn;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;La/l9s;)V

    .line 2178
    .line 2179
    .line 2180
    move-object/from16 v12, v21

    .line 2181
    .line 2182
    :goto_1e
    return-object v12

    .line 2183
    :pswitch_13
    check-cast v6, La/t33;

    .line 2184
    .line 2185
    check-cast v3, La/t33;

    .line 2186
    .line 2187
    check-cast v2, La/agk0;

    .line 2188
    .line 2189
    check-cast v15, La/agk0;

    .line 2190
    .line 2191
    invoke-virtual {v6}, La/t33;->d()Ljava/lang/Object;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v0

    .line 2195
    check-cast v0, Ljava/lang/Number;

    .line 2196
    .line 2197
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 2198
    .line 2199
    .line 2200
    move-result v0

    .line 2201
    invoke-virtual {v2, v0}, La/agk0;->m(F)V

    .line 2202
    .line 2203
    .line 2204
    invoke-virtual {v3}, La/t33;->d()Ljava/lang/Object;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v0

    .line 2208
    check-cast v0, Ljava/lang/Number;

    .line 2209
    .line 2210
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 2211
    .line 2212
    .line 2213
    move-result v0

    .line 2214
    invoke-virtual {v15, v0}, La/agk0;->m(F)V

    .line 2215
    .line 2216
    .line 2217
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2218
    .line 2219
    return-object v0

    .line 2220
    :pswitch_14
    check-cast v6, La/l7m0;

    .line 2221
    .line 2222
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 2223
    .line 2224
    check-cast v2, La/clz;

    .line 2225
    .line 2226
    check-cast v15, La/i3t0;

    .line 2227
    .line 2228
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2229
    .line 2230
    .line 2231
    move-result-object v0

    .line 2232
    check-cast v0, La/k7h;

    .line 2233
    .line 2234
    iget-wide v0, v0, La/k7h;->c:J

    .line 2235
    .line 2236
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v4

    .line 2240
    check-cast v4, La/k7h;

    .line 2241
    .line 2242
    iget-object v4, v4, La/k7h;->a:La/a4x;

    .line 2243
    .line 2244
    new-instance v5, Ljava/util/ArrayList;

    .line 2245
    .line 2246
    invoke-static {v4, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2247
    .line 2248
    .line 2249
    move-result v6

    .line 2250
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 2251
    .line 2252
    .line 2253
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v4

    .line 2257
    :goto_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2258
    .line 2259
    .line 2260
    move-result v6

    .line 2261
    if-eqz v6, :cond_35

    .line 2262
    .line 2263
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v6

    .line 2267
    check-cast v6, La/h7h;

    .line 2268
    .line 2269
    iget-wide v6, v6, La/h7h;->a:J

    .line 2270
    .line 2271
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v6

    .line 2275
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2276
    .line 2277
    .line 2278
    goto :goto_1f

    .line 2279
    :cond_35
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v3

    .line 2283
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2284
    .line 2285
    .line 2286
    new-instance v4, La/vi6;

    .line 2287
    .line 2288
    const/4 v5, 0x4

    .line 2289
    invoke-direct {v4, v15, v5}, La/vi6;-><init>(La/i3t0;B)V

    .line 2290
    .line 2291
    .line 2292
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2293
    .line 2294
    .line 2295
    sget-object v5, La/kxm0;->n2:La/m6m0;

    .line 2296
    .line 2297
    new-instance v6, Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;

    .line 2298
    .line 2299
    const-string v7, "SUB_GAME_SELECTED_KEY"

    .line 2300
    .line 2301
    invoke-direct {v6, v0, v1, v7}, Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;-><init>(JLjava/lang/String;)V

    .line 2302
    .line 2303
    .line 2304
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2305
    .line 2306
    .line 2307
    const-class v0, La/kxm0;

    .line 2308
    .line 2309
    sget-object v1, La/sre0;->a:La/tre0;

    .line 2310
    .line 2311
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v0

    .line 2315
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v0

    .line 2319
    invoke-virtual {v3, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2320
    .line 2321
    .line 2322
    move-result-object v1

    .line 2323
    if-eqz v1, :cond_36

    .line 2324
    .line 2325
    goto :goto_20

    .line 2326
    :cond_36
    new-instance v1, La/kxm0;

    .line 2327
    .line 2328
    invoke-direct {v1}, La/kxm0;-><init>()V

    .line 2329
    .line 2330
    .line 2331
    sget-object v5, La/kxm0;->o2:[La/iiy;

    .line 2332
    .line 2333
    aget-object v5, v5, v13

    .line 2334
    .line 2335
    iget-object v9, v1, La/kxm0;->l2:La/khf0;

    .line 2336
    .line 2337
    invoke-virtual {v9, v1, v5, v6}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 2338
    .line 2339
    .line 2340
    invoke-virtual {v1, v3, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2341
    .line 2342
    .line 2343
    :goto_20
    new-instance v0, La/b0l0;

    .line 2344
    .line 2345
    invoke-direct {v0, v4, v8}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 2346
    .line 2347
    .line 2348
    invoke-virtual {v3, v7, v2, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 2349
    .line 2350
    .line 2351
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2352
    .line 2353
    return-object v0

    .line 2354
    :pswitch_15
    check-cast v6, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;

    .line 2355
    .line 2356
    check-cast v3, La/dhf;

    .line 2357
    .line 2358
    check-cast v2, Ljava/util/Set;

    .line 2359
    .line 2360
    check-cast v15, Ljava/util/LinkedHashMap;

    .line 2361
    .line 2362
    sget v0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->j:I

    .line 2363
    .line 2364
    invoke-virtual {v6, v3, v2, v15}, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->f(La/dhf;Ljava/util/Set;Ljava/util/LinkedHashMap;)V

    .line 2365
    .line 2366
    .line 2367
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2368
    .line 2369
    return-object v0

    .line 2370
    :pswitch_16
    check-cast v6, La/fz9;

    .line 2371
    .line 2372
    check-cast v3, Landroid/content/Context;

    .line 2373
    .line 2374
    check-cast v2, La/q15;

    .line 2375
    .line 2376
    check-cast v15, La/zen;

    .line 2377
    .line 2378
    const-string v0, "Created CameraPipe in "

    .line 2379
    .line 2380
    const-string v1, "Create CameraPipe"

    .line 2381
    .line 2382
    :try_start_7
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2383
    .line 2384
    .line 2385
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 2386
    .line 2387
    .line 2388
    move-result-wide v7

    .line 2389
    new-instance v1, La/i1a;

    .line 2390
    .line 2391
    invoke-static {v3}, La/uje;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v3

    .line 2395
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2396
    .line 2397
    .line 2398
    new-instance v9, La/k1a;

    .line 2399
    .line 2400
    iget-object v2, v2, La/q15;->a:Ljava/util/concurrent/Executor;

    .line 2401
    .line 2402
    new-instance v10, La/rgi0;

    .line 2403
    .line 2404
    invoke-direct {v10, v2}, La/rgi0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 2405
    .line 2406
    .line 2407
    const/16 v2, 0x77

    .line 2408
    .line 2409
    invoke-direct {v9, v10, v2}, La/k1a;-><init>(La/rgi0;I)V

    .line 2410
    .line 2411
    .line 2412
    new-instance v2, La/h1a;

    .line 2413
    .line 2414
    iget-object v6, v6, La/fz9;->a:La/ehf0;

    .line 2415
    .line 2416
    iget-object v10, v6, La/ehf0;->b:Ljava/lang/Object;

    .line 2417
    .line 2418
    check-cast v10, La/x0a;

    .line 2419
    .line 2420
    iget-object v6, v6, La/ehf0;->c:Ljava/lang/Object;

    .line 2421
    .line 2422
    check-cast v6, La/chf0;

    .line 2423
    .line 2424
    invoke-direct {v2, v10, v6, v15}, La/h1a;-><init>(Landroid/hardware/camera2/CameraDevice$StateCallback;La/chf0;La/zen;)V

    .line 2425
    .line 2426
    .line 2427
    invoke-direct {v1, v3, v9, v2}, La/i1a;-><init>(Landroid/content/Context;La/k1a;La/h1a;)V

    .line 2428
    .line 2429
    .line 2430
    invoke-static {v1}, La/o1a;->a(La/i1a;)La/m1a;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v1

    .line 2434
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 2435
    .line 2436
    .line 2437
    move-result v2

    .line 2438
    if-eqz v2, :cond_37

    .line 2439
    .line 2440
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 2441
    .line 2442
    .line 2443
    move-result-wide v2

    .line 2444
    sub-long/2addr v2, v7

    .line 2445
    long-to-double v2, v2

    .line 2446
    div-double v2, v2, v16

    .line 2447
    .line 2448
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v2

    .line 2452
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 2453
    .line 2454
    .line 2455
    move-result-object v2

    .line 2456
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2457
    .line 2458
    .line 2459
    move-result-object v2

    .line 2460
    const/4 v3, 0x0

    .line 2461
    invoke-static {v3, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v2

    .line 2465
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v0

    .line 2469
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 2470
    .line 2471
    .line 2472
    :cond_37
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2473
    .line 2474
    .line 2475
    return-object v1

    .line 2476
    :catchall_3
    move-exception v0

    .line 2477
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2478
    .line 2479
    .line 2480
    throw v0

    .line 2481
    :pswitch_17
    check-cast v6, Landroid/content/Context;

    .line 2482
    .line 2483
    check-cast v3, La/q15;

    .line 2484
    .line 2485
    check-cast v2, La/ru;

    .line 2486
    .line 2487
    check-cast v15, La/ehf0;

    .line 2488
    .line 2489
    const-string v0, "CameraFactoryAdapter#appComponent"

    .line 2490
    .line 2491
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2492
    .line 2493
    .line 2494
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 2495
    .line 2496
    .line 2497
    move-result-wide v0

    .line 2498
    new-instance v7, La/esg0;

    .line 2499
    .line 2500
    iget-object v8, v2, La/ru;->a:Ljava/lang/Object;

    .line 2501
    .line 2502
    check-cast v8, La/n0o0;

    .line 2503
    .line 2504
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v8

    .line 2508
    check-cast v8, La/m1a;

    .line 2509
    .line 2510
    iget-object v9, v2, La/ru;->e:Ljava/lang/Object;

    .line 2511
    .line 2512
    check-cast v9, La/wy9;

    .line 2513
    .line 2514
    iget-object v2, v2, La/ru;->d:Ljava/lang/Object;

    .line 2515
    .line 2516
    check-cast v2, La/l4a;

    .line 2517
    .line 2518
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2519
    .line 2520
    .line 2521
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2522
    .line 2523
    .line 2524
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2525
    .line 2526
    .line 2527
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2528
    .line 2529
    .line 2530
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 2531
    .line 2532
    .line 2533
    iput-object v6, v7, La/esg0;->a:Ljava/lang/Object;

    .line 2534
    .line 2535
    iput-object v3, v7, La/esg0;->b:Ljava/lang/Object;

    .line 2536
    .line 2537
    iput-object v8, v7, La/esg0;->c:Ljava/lang/Object;

    .line 2538
    .line 2539
    iput-object v15, v7, La/esg0;->d:Ljava/lang/Object;

    .line 2540
    .line 2541
    iput-object v9, v7, La/esg0;->e:Ljava/lang/Object;

    .line 2542
    .line 2543
    iput-object v2, v7, La/esg0;->f:Ljava/lang/Object;

    .line 2544
    .line 2545
    new-instance v2, La/cbi;

    .line 2546
    .line 2547
    invoke-direct {v2, v7}, La/cbi;-><init>(La/esg0;)V

    .line 2548
    .line 2549
    .line 2550
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 2551
    .line 2552
    .line 2553
    move-result v3

    .line 2554
    if-eqz v3, :cond_38

    .line 2555
    .line 2556
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 2557
    .line 2558
    .line 2559
    move-result-wide v6

    .line 2560
    sub-long/2addr v6, v0

    .line 2561
    long-to-double v0, v6

    .line 2562
    div-double v0, v0, v16

    .line 2563
    .line 2564
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v0

    .line 2568
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2569
    .line 2570
    .line 2571
    move-result-object v0

    .line 2572
    invoke-static {v0, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2573
    .line 2574
    .line 2575
    move-result-object v0

    .line 2576
    const/4 v1, 0x0

    .line 2577
    invoke-static {v1, v4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2578
    .line 2579
    .line 2580
    move-result-object v0

    .line 2581
    const-string v1, "Created CameraFactoryAdapter in "

    .line 2582
    .line 2583
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2584
    .line 2585
    .line 2586
    move-result-object v0

    .line 2587
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2588
    .line 2589
    .line 2590
    :cond_38
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2591
    .line 2592
    .line 2593
    return-object v2

    .line 2594
    :pswitch_18
    check-cast v6, La/w6k;

    .line 2595
    .line 2596
    check-cast v3, La/vhv0;

    .line 2597
    .line 2598
    check-cast v2, La/vhv0;

    .line 2599
    .line 2600
    check-cast v15, La/vhv0;

    .line 2601
    .line 2602
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2603
    .line 2604
    .line 2605
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2606
    .line 2607
    .line 2608
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2609
    .line 2610
    .line 2611
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2612
    .line 2613
    .line 2614
    new-instance v16, La/t9o0;

    .line 2615
    .line 2616
    invoke-interface {v3, v6}, La/vhv0;->d(La/w6k;)I

    .line 2617
    .line 2618
    .line 2619
    move-result v0

    .line 2620
    invoke-interface {v6, v0}, La/w6k;->r0(I)F

    .line 2621
    .line 2622
    .line 2623
    move-result v17

    .line 2624
    invoke-interface {v2, v6}, La/vhv0;->b(La/w6k;)I

    .line 2625
    .line 2626
    .line 2627
    move-result v0

    .line 2628
    invoke-interface {v6, v0}, La/w6k;->r0(I)F

    .line 2629
    .line 2630
    .line 2631
    move-result v18

    .line 2632
    sget-object v0, La/k6z;->a:La/k6z;

    .line 2633
    .line 2634
    invoke-interface {v2, v6, v0}, La/vhv0;->a(La/w6k;La/k6z;)I

    .line 2635
    .line 2636
    .line 2637
    move-result v1

    .line 2638
    invoke-interface {v6, v1}, La/w6k;->r0(I)F

    .line 2639
    .line 2640
    .line 2641
    move-result v19

    .line 2642
    invoke-interface {v2, v6, v0}, La/vhv0;->c(La/w6k;La/k6z;)I

    .line 2643
    .line 2644
    .line 2645
    move-result v1

    .line 2646
    invoke-interface {v6, v1}, La/w6k;->r0(I)F

    .line 2647
    .line 2648
    .line 2649
    move-result v20

    .line 2650
    invoke-interface {v15, v6}, La/vhv0;->d(La/w6k;)I

    .line 2651
    .line 2652
    .line 2653
    move-result v1

    .line 2654
    invoke-interface {v6, v1}, La/w6k;->r0(I)F

    .line 2655
    .line 2656
    .line 2657
    move-result v21

    .line 2658
    invoke-interface {v15, v6}, La/vhv0;->b(La/w6k;)I

    .line 2659
    .line 2660
    .line 2661
    move-result v1

    .line 2662
    invoke-interface {v6, v1}, La/w6k;->r0(I)F

    .line 2663
    .line 2664
    .line 2665
    move-result v22

    .line 2666
    invoke-interface {v15, v6, v0}, La/vhv0;->a(La/w6k;La/k6z;)I

    .line 2667
    .line 2668
    .line 2669
    move-result v1

    .line 2670
    invoke-interface {v6, v1}, La/w6k;->r0(I)F

    .line 2671
    .line 2672
    .line 2673
    move-result v23

    .line 2674
    invoke-interface {v15, v6, v0}, La/vhv0;->c(La/w6k;La/k6z;)I

    .line 2675
    .line 2676
    .line 2677
    move-result v0

    .line 2678
    invoke-interface {v6, v0}, La/w6k;->r0(I)F

    .line 2679
    .line 2680
    .line 2681
    move-result v24

    .line 2682
    invoke-direct/range {v16 .. v24}, La/t9o0;-><init>(FFFFFFFF)V

    .line 2683
    .line 2684
    .line 2685
    return-object v16

    .line 2686
    :pswitch_19
    check-cast v6, La/xjk;

    .line 2687
    .line 2688
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 2689
    .line 2690
    check-cast v2, La/fjk;

    .line 2691
    .line 2692
    check-cast v15, La/k6z;

    .line 2693
    .line 2694
    invoke-virtual {v6, v3, v2, v15}, La/xjk;->f(Lkotlin/jvm/functions/Function0;La/fjk;La/k6z;)V

    .line 2695
    .line 2696
    .line 2697
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2698
    .line 2699
    return-object v0

    .line 2700
    :pswitch_1a
    const/4 v1, 0x0

    .line 2701
    check-cast v2, La/a570;

    .line 2702
    .line 2703
    move-object v9, v15

    .line 2704
    check-cast v9, La/yn2;

    .line 2705
    .line 2706
    check-cast v6, Ljava/lang/String;

    .line 2707
    .line 2708
    check-cast v3, Ljava/lang/String;

    .line 2709
    .line 2710
    instance-of v0, v2, La/w470;

    .line 2711
    .line 2712
    const/4 v4, 0x0

    .line 2713
    if-eqz v0, :cond_39

    .line 2714
    .line 2715
    check-cast v2, La/w470;

    .line 2716
    .line 2717
    iget-object v0, v2, La/w470;->a:La/s470;

    .line 2718
    .line 2719
    sget v1, La/yn2;->g0:I

    .line 2720
    .line 2721
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2722
    .line 2723
    .line 2724
    move-result-object v1

    .line 2725
    new-instance v7, La/bk2;

    .line 2726
    .line 2727
    const/4 v13, 0x0

    .line 2728
    const/4 v14, 0x6

    .line 2729
    const/4 v8, 0x1

    .line 2730
    const-class v10, La/yn2;

    .line 2731
    .line 2732
    const-string v11, "onDataLoadingError"

    .line 2733
    .line 2734
    const-string v12, "onDataLoadingError(Ljava/lang/Throwable;)V"

    .line 2735
    .line 2736
    invoke-direct/range {v7 .. v14}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2737
    .line 2738
    .line 2739
    move-object v2, v7

    .line 2740
    new-instance v7, La/ex1;

    .line 2741
    .line 2742
    const/4 v8, 0x3

    .line 2743
    move-object v12, v0

    .line 2744
    move-object v10, v6

    .line 2745
    move-object v11, v9

    .line 2746
    move-object v9, v4

    .line 2747
    invoke-direct/range {v7 .. v12}, La/ex1;-><init>(BLa/yje;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2748
    .line 2749
    .line 2750
    const/16 v15, 0xe

    .line 2751
    .line 2752
    const/4 v12, 0x0

    .line 2753
    const/4 v13, 0x0

    .line 2754
    move-object v10, v1

    .line 2755
    move-object v11, v2

    .line 2756
    move-object v14, v7

    .line 2757
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2758
    .line 2759
    .line 2760
    goto :goto_21

    .line 2761
    :cond_39
    move-object v0, v4

    .line 2762
    instance-of v4, v2, La/z470;

    .line 2763
    .line 2764
    if-eqz v4, :cond_3a

    .line 2765
    .line 2766
    check-cast v2, La/z470;

    .line 2767
    .line 2768
    sget v1, La/yn2;->g0:I

    .line 2769
    .line 2770
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2771
    .line 2772
    .line 2773
    move-result-object v1

    .line 2774
    iget-object v4, v9, La/yn2;->G:La/mne;

    .line 2775
    .line 2776
    iget-object v4, v4, La/mne;->b:La/dvj;

    .line 2777
    .line 2778
    new-instance v7, La/bk2;

    .line 2779
    .line 2780
    const/4 v13, 0x0

    .line 2781
    const/4 v14, 0x5

    .line 2782
    const/4 v8, 0x1

    .line 2783
    const-class v10, La/yn2;

    .line 2784
    .line 2785
    const-string v11, "handleException"

    .line 2786
    .line 2787
    const-string v12, "handleException(Ljava/lang/Throwable;)V"

    .line 2788
    .line 2789
    invoke-direct/range {v7 .. v14}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2790
    .line 2791
    .line 2792
    new-instance v14, La/xn2;

    .line 2793
    .line 2794
    invoke-direct {v14, v9, v2, v3, v0}, La/xn2;-><init>(La/yn2;La/z470;Ljava/lang/String;La/yje;)V

    .line 2795
    .line 2796
    .line 2797
    const/16 v15, 0xa

    .line 2798
    .line 2799
    const/4 v12, 0x0

    .line 2800
    move-object v10, v1

    .line 2801
    move-object v13, v4

    .line 2802
    move-object v11, v7

    .line 2803
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2804
    .line 2805
    .line 2806
    :goto_21
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2807
    .line 2808
    goto :goto_22

    .line 2809
    :cond_3a
    invoke-static {}, La/t9f;->b()V

    .line 2810
    .line 2811
    .line 2812
    move-object v12, v1

    .line 2813
    :goto_22
    return-object v12

    .line 2814
    :pswitch_1b
    check-cast v6, La/iqt;

    .line 2815
    .line 2816
    check-cast v3, La/dmt;

    .line 2817
    .line 2818
    check-cast v2, La/ctf0;

    .line 2819
    .line 2820
    check-cast v15, La/pru;

    .line 2821
    .line 2822
    iget-object v0, v6, La/iqt;->a:La/gst0;

    .line 2823
    .line 2824
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 2825
    .line 2826
    .line 2827
    move-result v21

    .line 2828
    invoke-virtual {v3}, La/dmt;->b()La/kg;

    .line 2829
    .line 2830
    .line 2831
    move-result-object v24

    .line 2832
    new-array v0, v13, [Ljava/lang/Object;

    .line 2833
    .line 2834
    iget-object v1, v2, La/ctf0;->b:La/lsm0;

    .line 2835
    .line 2836
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2837
    .line 2838
    .line 2839
    move-result-object v0

    .line 2840
    const v2, 0x7f131662

    .line 2841
    .line 2842
    .line 2843
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2844
    .line 2845
    .line 2846
    move-result-object v17

    .line 2847
    invoke-virtual {v15}, La/pru;->a()La/sff0;

    .line 2848
    .line 2849
    .line 2850
    move-result-object v0

    .line 2851
    iget-object v0, v0, La/sff0;->k:La/f3c0;

    .line 2852
    .line 2853
    iget-boolean v0, v0, La/f3c0;->h:Z

    .line 2854
    .line 2855
    new-instance v16, La/dz1;

    .line 2856
    .line 2857
    new-instance v1, La/vge;

    .line 2858
    .line 2859
    sget-object v2, La/lak0;->c:La/lak0;

    .line 2860
    .line 2861
    invoke-direct {v1, v2}, La/vge;-><init>(La/a4x;)V

    .line 2862
    .line 2863
    .line 2864
    const/16 v19, 0x0

    .line 2865
    .line 2866
    const/16 v20, 0x0

    .line 2867
    .line 2868
    const/16 v22, 0x0

    .line 2869
    .line 2870
    const/16 v23, 0x1

    .line 2871
    .line 2872
    const/16 v25, 0x0

    .line 2873
    .line 2874
    const/16 v26, 0x0

    .line 2875
    .line 2876
    const/16 v27, 0x0

    .line 2877
    .line 2878
    move/from16 v18, v0

    .line 2879
    .line 2880
    move-object/from16 v28, v1

    .line 2881
    .line 2882
    invoke-direct/range {v16 .. v28}, La/dz1;-><init>(Ljava/lang/String;ZZZZLa/ql5;ZLa/kg;La/myr0;Ljava/lang/Long;ZLa/bie;)V

    .line 2883
    .line 2884
    .line 2885
    return-object v16

    .line 2886
    :pswitch_1c
    check-cast v6, Ljava/lang/String;

    .line 2887
    .line 2888
    check-cast v3, Ljava/lang/String;

    .line 2889
    .line 2890
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 2891
    .line 2892
    check-cast v15, La/pz40;

    .line 2893
    .line 2894
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2895
    .line 2896
    .line 2897
    move-result v0

    .line 2898
    if-eqz v0, :cond_3b

    .line 2899
    .line 2900
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v0

    .line 2904
    check-cast v0, Ljava/lang/Boolean;

    .line 2905
    .line 2906
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2907
    .line 2908
    .line 2909
    move-result v0

    .line 2910
    if-eqz v0, :cond_3b

    .line 2911
    .line 2912
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2913
    .line 2914
    invoke-interface {v15, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2915
    .line 2916
    .line 2917
    goto :goto_23

    .line 2918
    :cond_3b
    sget-object v0, La/rp0;->a:La/rp0;

    .line 2919
    .line 2920
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2921
    .line 2922
    .line 2923
    :goto_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2924
    .line 2925
    return-object v0

    .line 2926
    nop

    .line 2927
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
