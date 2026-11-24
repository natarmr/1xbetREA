.class public final La/kl00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:J

.field public final synthetic n:I

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:Ljava/util/Set;

.field public final synthetic r:Z

.field public final synthetic s:J

.field public final synthetic t:Z

.field public final synthetic u:Ljava/lang/Integer;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/yje;JLjava/lang/Object;ILjava/util/List;Ljava/util/List;Ljava/util/Set;ZJZLjava/lang/Integer;B)V
    .locals 0

    .line 1
    iput-byte p14, p0, La/kl00;->i:B

    iput-wide p2, p0, La/kl00;->m:J

    iput-object p4, p0, La/kl00;->v:Ljava/lang/Object;

    iput p5, p0, La/kl00;->n:I

    iput-object p6, p0, La/kl00;->o:Ljava/util/List;

    iput-object p7, p0, La/kl00;->p:Ljava/util/List;

    iput-object p8, p0, La/kl00;->q:Ljava/util/Set;

    iput-boolean p9, p0, La/kl00;->r:Z

    iput-wide p10, p0, La/kl00;->s:J

    iput-boolean p12, p0, La/kl00;->t:Z

    iput-object p13, p0, La/kl00;->u:Ljava/lang/Integer;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/kl00;->i:B

    .line 6
    .line 7
    iget-object v3, v0, La/kl00;->v:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    check-cast v2, La/kmq;

    .line 15
    .line 16
    move-object/from16 v5, p3

    .line 17
    .line 18
    check-cast v5, La/yje;

    .line 19
    .line 20
    new-instance v4, La/kl00;

    .line 21
    .line 22
    move-object v8, v3

    .line 23
    check-cast v8, La/y3v;

    .line 24
    .line 25
    iget-object v3, v0, La/kl00;->u:Ljava/lang/Integer;

    .line 26
    .line 27
    const/16 v18, 0x1

    .line 28
    .line 29
    iget-wide v6, v0, La/kl00;->m:J

    .line 30
    .line 31
    iget v9, v0, La/kl00;->n:I

    .line 32
    .line 33
    iget-object v10, v0, La/kl00;->o:Ljava/util/List;

    .line 34
    .line 35
    iget-object v11, v0, La/kl00;->p:Ljava/util/List;

    .line 36
    .line 37
    iget-object v12, v0, La/kl00;->q:Ljava/util/Set;

    .line 38
    .line 39
    iget-boolean v13, v0, La/kl00;->r:Z

    .line 40
    .line 41
    iget-wide v14, v0, La/kl00;->s:J

    .line 42
    .line 43
    iget-boolean v0, v0, La/kl00;->t:Z

    .line 44
    .line 45
    move/from16 v16, v0

    .line 46
    .line 47
    move-object/from16 v17, v3

    .line 48
    .line 49
    invoke-direct/range {v4 .. v18}, La/kl00;-><init>(La/yje;JLjava/lang/Object;ILjava/util/List;Ljava/util/List;Ljava/util/Set;ZJZLjava/lang/Integer;B)V

    .line 50
    .line 51
    .line 52
    iput-object v2, v4, La/kl00;->k:La/kmq;

    .line 53
    .line 54
    iput-object v1, v4, La/kl00;->l:Ljava/lang/Object;

    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {v4, v0}, La/kl00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :pswitch_0
    move-object/from16 v2, p1

    .line 64
    .line 65
    check-cast v2, La/kmq;

    .line 66
    .line 67
    move-object/from16 v5, p3

    .line 68
    .line 69
    check-cast v5, La/yje;

    .line 70
    .line 71
    new-instance v4, La/kl00;

    .line 72
    .line 73
    move-object v8, v3

    .line 74
    check-cast v8, La/nvu;

    .line 75
    .line 76
    iget-object v3, v0, La/kl00;->u:Ljava/lang/Integer;

    .line 77
    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    iget-wide v6, v0, La/kl00;->m:J

    .line 81
    .line 82
    iget v9, v0, La/kl00;->n:I

    .line 83
    .line 84
    iget-object v10, v0, La/kl00;->o:Ljava/util/List;

    .line 85
    .line 86
    iget-object v11, v0, La/kl00;->p:Ljava/util/List;

    .line 87
    .line 88
    iget-object v12, v0, La/kl00;->q:Ljava/util/Set;

    .line 89
    .line 90
    iget-boolean v13, v0, La/kl00;->r:Z

    .line 91
    .line 92
    iget-wide v14, v0, La/kl00;->s:J

    .line 93
    .line 94
    iget-boolean v0, v0, La/kl00;->t:Z

    .line 95
    .line 96
    move/from16 v16, v0

    .line 97
    .line 98
    move-object/from16 v17, v3

    .line 99
    .line 100
    invoke-direct/range {v4 .. v18}, La/kl00;-><init>(La/yje;JLjava/lang/Object;ILjava/util/List;Ljava/util/List;Ljava/util/Set;ZJZLjava/lang/Integer;B)V

    .line 101
    .line 102
    .line 103
    iput-object v2, v4, La/kl00;->k:La/kmq;

    .line 104
    .line 105
    iput-object v1, v4, La/kl00;->l:Ljava/lang/Object;

    .line 106
    .line 107
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    invoke-virtual {v4, v0}, La/kl00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kl00;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/kl00;->v:Ljava/lang/Object;

    .line 6
    .line 7
    const-wide/16 v3, -0x1

    .line 8
    .line 9
    const/16 v5, 0xc

    .line 10
    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    iget-wide v8, v0, La/kl00;->m:J

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v1, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v11, v0, La/kl00;->j:Z

    .line 23
    .line 24
    if-eqz v11, :cond_1

    .line 25
    .line 26
    if-ne v11, v7, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v6, v0, La/kl00;->k:La/kmq;

    .line 42
    .line 43
    iget-object v11, v0, La/kl00;->l:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v11, La/z4q;

    .line 46
    .line 47
    iget-object v12, v11, La/z4q;->b:Lkotlin/Pair;

    .line 48
    .line 49
    iget-object v12, v12, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v12, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v12

    .line 57
    iget-object v14, v11, La/z4q;->a:La/ygq0;

    .line 58
    .line 59
    sget-object v15, La/ygq0;->p:La/ygq0;

    .line 60
    .line 61
    if-ne v14, v15, :cond_2

    .line 62
    .line 63
    cmp-long v14, v8, v12

    .line 64
    .line 65
    if-ltz v14, :cond_2

    .line 66
    .line 67
    new-instance v2, La/knb;

    .line 68
    .line 69
    sget-object v3, La/iun;->a:La/iun;

    .line 70
    .line 71
    invoke-direct {v2, v3, v3}, La/knb;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, La/eu4;

    .line 75
    .line 76
    invoke-direct {v3, v2, v5}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    iget-object v5, v11, La/z4q;->b:Lkotlin/Pair;

    .line 81
    .line 82
    iget-object v5, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v14

    .line 90
    cmp-long v5, v8, v14

    .line 91
    .line 92
    if-ltz v5, :cond_3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    move-wide v3, v14

    .line 96
    :goto_0
    iget-object v5, v11, La/z4q;->a:La/ygq0;

    .line 97
    .line 98
    new-instance v8, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-direct {v8, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 101
    .line 102
    .line 103
    new-instance v3, Ljava/lang/Long;

    .line 104
    .line 105
    invoke-direct {v3, v12, v13}, Ljava/lang/Long;-><init>(J)V

    .line 106
    .line 107
    .line 108
    new-instance v4, Lkotlin/Pair;

    .line 109
    .line 110
    invoke-direct {v4, v8, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object/from16 v16, v2

    .line 114
    .line 115
    check-cast v16, La/y3v;

    .line 116
    .line 117
    new-instance v14, La/fl00;

    .line 118
    .line 119
    const/16 v27, 0x0

    .line 120
    .line 121
    const/16 v28, 0x1

    .line 122
    .line 123
    iget-boolean v15, v0, La/kl00;->t:Z

    .line 124
    .line 125
    iget-object v2, v0, La/kl00;->o:Ljava/util/List;

    .line 126
    .line 127
    iget-object v3, v0, La/kl00;->q:Ljava/util/Set;

    .line 128
    .line 129
    iget v8, v0, La/kl00;->n:I

    .line 130
    .line 131
    iget-object v9, v0, La/kl00;->p:Ljava/util/List;

    .line 132
    .line 133
    iget-boolean v11, v0, La/kl00;->r:Z

    .line 134
    .line 135
    iget-wide v12, v0, La/kl00;->s:J

    .line 136
    .line 137
    iget-object v7, v0, La/kl00;->u:Ljava/lang/Integer;

    .line 138
    .line 139
    move-object/from16 v17, v2

    .line 140
    .line 141
    move-object/from16 v18, v3

    .line 142
    .line 143
    move-object/from16 v25, v4

    .line 144
    .line 145
    move-object/from16 v20, v5

    .line 146
    .line 147
    move-object/from16 v26, v7

    .line 148
    .line 149
    move/from16 v19, v8

    .line 150
    .line 151
    move-object/from16 v21, v9

    .line 152
    .line 153
    move/from16 v22, v11

    .line 154
    .line 155
    move-wide/from16 v23, v12

    .line 156
    .line 157
    invoke-direct/range {v14 .. v28}, La/fl00;-><init>(ZLjava/lang/Object;Ljava/util/List;Ljava/util/Set;ILa/ygq0;Ljava/util/List;ZJLkotlin/Pair;Ljava/lang/Integer;La/yje;B)V

    .line 158
    .line 159
    .line 160
    new-instance v3, La/vsg0;

    .line 161
    .line 162
    invoke-direct {v3, v14}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    :goto_1
    iput-object v10, v0, La/kl00;->k:La/kmq;

    .line 166
    .line 167
    iput-object v10, v0, La/kl00;->l:Ljava/lang/Object;

    .line 168
    .line 169
    const/4 v7, 0x1

    .line 170
    iput-boolean v7, v0, La/kl00;->j:Z

    .line 171
    .line 172
    invoke-static {v6, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v0, v1, :cond_4

    .line 177
    .line 178
    move-object v10, v1

    .line 179
    goto :goto_3

    .line 180
    :cond_4
    :goto_2
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    :goto_3
    return-object v10

    .line 183
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 184
    .line 185
    iget-boolean v11, v0, La/kl00;->j:Z

    .line 186
    .line 187
    if-eqz v11, :cond_6

    .line 188
    .line 189
    if-ne v11, v7, :cond_5

    .line 190
    .line 191
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_6

    .line 195
    .line 196
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_7

    .line 200
    .line 201
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object v6, v0, La/kl00;->k:La/kmq;

    .line 205
    .line 206
    iget-object v7, v0, La/kl00;->l:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v7, La/z4q;

    .line 209
    .line 210
    iget-object v11, v7, La/z4q;->b:Lkotlin/Pair;

    .line 211
    .line 212
    iget-object v11, v11, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v11, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 217
    .line 218
    .line 219
    move-result-wide v11

    .line 220
    iget-object v13, v7, La/z4q;->a:La/ygq0;

    .line 221
    .line 222
    sget-object v14, La/ygq0;->p:La/ygq0;

    .line 223
    .line 224
    if-ne v13, v14, :cond_7

    .line 225
    .line 226
    cmp-long v13, v8, v11

    .line 227
    .line 228
    if-ltz v13, :cond_7

    .line 229
    .line 230
    new-instance v2, La/knb;

    .line 231
    .line 232
    sget-object v3, La/iun;->a:La/iun;

    .line 233
    .line 234
    invoke-direct {v2, v3, v3}, La/knb;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 235
    .line 236
    .line 237
    new-instance v3, La/eu4;

    .line 238
    .line 239
    invoke-direct {v3, v2, v5}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 240
    .line 241
    .line 242
    move-object v2, v10

    .line 243
    goto :goto_5

    .line 244
    :cond_7
    iget-object v5, v7, La/z4q;->b:Lkotlin/Pair;

    .line 245
    .line 246
    iget-object v5, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v5, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 251
    .line 252
    .line 253
    move-result-wide v13

    .line 254
    cmp-long v5, v8, v13

    .line 255
    .line 256
    if-ltz v5, :cond_8

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_8
    move-wide v3, v13

    .line 260
    :goto_4
    iget-object v5, v7, La/z4q;->a:La/ygq0;

    .line 261
    .line 262
    new-instance v7, Ljava/lang/Long;

    .line 263
    .line 264
    invoke-direct {v7, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 265
    .line 266
    .line 267
    new-instance v3, Ljava/lang/Long;

    .line 268
    .line 269
    invoke-direct {v3, v11, v12}, Ljava/lang/Long;-><init>(J)V

    .line 270
    .line 271
    .line 272
    new-instance v4, Lkotlin/Pair;

    .line 273
    .line 274
    invoke-direct {v4, v7, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    move-object v15, v2

    .line 278
    check-cast v15, La/nvu;

    .line 279
    .line 280
    new-instance v13, La/fl00;

    .line 281
    .line 282
    const/16 v26, 0x0

    .line 283
    .line 284
    const/16 v27, 0x0

    .line 285
    .line 286
    iget-boolean v14, v0, La/kl00;->t:Z

    .line 287
    .line 288
    iget-object v2, v0, La/kl00;->o:Ljava/util/List;

    .line 289
    .line 290
    iget-object v3, v0, La/kl00;->q:Ljava/util/Set;

    .line 291
    .line 292
    iget v7, v0, La/kl00;->n:I

    .line 293
    .line 294
    iget-object v8, v0, La/kl00;->p:Ljava/util/List;

    .line 295
    .line 296
    iget-boolean v9, v0, La/kl00;->r:Z

    .line 297
    .line 298
    iget-wide v11, v0, La/kl00;->s:J

    .line 299
    .line 300
    iget-object v10, v0, La/kl00;->u:Ljava/lang/Integer;

    .line 301
    .line 302
    move-object/from16 v16, v2

    .line 303
    .line 304
    move-object/from16 v17, v3

    .line 305
    .line 306
    move-object/from16 v24, v4

    .line 307
    .line 308
    move-object/from16 v19, v5

    .line 309
    .line 310
    move/from16 v18, v7

    .line 311
    .line 312
    move-object/from16 v20, v8

    .line 313
    .line 314
    move/from16 v21, v9

    .line 315
    .line 316
    move-object/from16 v25, v10

    .line 317
    .line 318
    move-wide/from16 v22, v11

    .line 319
    .line 320
    invoke-direct/range {v13 .. v27}, La/fl00;-><init>(ZLjava/lang/Object;Ljava/util/List;Ljava/util/Set;ILa/ygq0;Ljava/util/List;ZJLkotlin/Pair;Ljava/lang/Integer;La/yje;B)V

    .line 321
    .line 322
    .line 323
    new-instance v3, La/vsg0;

    .line 324
    .line 325
    invoke-direct {v3, v13}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 326
    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    :goto_5
    iput-object v2, v0, La/kl00;->k:La/kmq;

    .line 330
    .line 331
    iput-object v2, v0, La/kl00;->l:Ljava/lang/Object;

    .line 332
    .line 333
    const/4 v7, 0x1

    .line 334
    iput-boolean v7, v0, La/kl00;->j:Z

    .line 335
    .line 336
    invoke-static {v6, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-ne v0, v1, :cond_9

    .line 341
    .line 342
    move-object v10, v1

    .line 343
    goto :goto_7

    .line 344
    :cond_9
    :goto_6
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    :goto_7
    return-object v10

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
