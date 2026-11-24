.class public final La/uot;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:J

.field public n:La/kmq;

.field public final synthetic o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/yje;La/h6i;J)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/uot;->i:B

    .line 15
    iput-object p2, p0, La/uot;->o:Ljava/lang/Object;

    iput-wide p3, p0, La/uot;->m:J

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/yje;La/q5u;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/uot;->i:B

    .line 3
    .line 4
    iput-object p2, p0, La/uot;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p3, p0, La/uot;->m:J

    .line 7
    .line 8
    iput-object p5, p0, La/uot;->p:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/uot;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/uot;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v3, p3

    .line 11
    check-cast v3, La/yje;

    .line 12
    .line 13
    new-instance v2, La/uot;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, La/q5u;

    .line 17
    .line 18
    iget-object p3, p0, La/uot;->p:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v7, p3

    .line 21
    check-cast v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 22
    .line 23
    iget-wide v5, p0, La/uot;->m:J

    .line 24
    .line 25
    invoke-direct/range {v2 .. v7}, La/uot;-><init>(La/yje;La/q5u;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v2, La/uot;->k:La/kmq;

    .line 29
    .line 30
    iput-object p2, v2, La/uot;->l:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {v2, p0}, La/uot;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast p3, La/yje;

    .line 40
    .line 41
    new-instance v0, La/uot;

    .line 42
    .line 43
    check-cast v1, La/h6i;

    .line 44
    .line 45
    iget-wide v2, p0, La/uot;->m:J

    .line 46
    .line 47
    invoke-direct {v0, p3, v1, v2, v3}, La/uot;-><init>(La/yje;La/h6i;J)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/uot;->k:La/kmq;

    .line 51
    .line 52
    iput-object p2, v0, La/uot;->l:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, La/uot;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-byte v0, v8, La/uot;->i:B

    .line 4
    .line 5
    const/4 v9, 0x3

    .line 6
    iget-object v1, v8, La/uot;->o:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v10, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v5, v8, La/uot;->j:B

    .line 19
    .line 20
    if-eqz v5, :cond_2

    .line 21
    .line 22
    if-eq v5, v4, :cond_1

    .line 23
    .line 24
    if-ne v5, v3, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    iget-object v1, v8, La/uot;->n:La/kmq;

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object/from16 v6, p1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v8, La/uot;->k:La/kmq;

    .line 46
    .line 47
    iget-object v5, v8, La/uot;->l:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-object v13, v1

    .line 55
    check-cast v13, La/q5u;

    .line 56
    .line 57
    iget-object v1, v8, La/uot;->p:Ljava/lang/Object;

    .line 58
    .line 59
    move-object/from16 v16, v1

    .line 60
    .line 61
    check-cast v16, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 62
    .line 63
    iput-object v10, v8, La/uot;->k:La/kmq;

    .line 64
    .line 65
    iput-object v10, v8, La/uot;->l:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v2, v8, La/uot;->n:La/kmq;

    .line 68
    .line 69
    iput-byte v4, v8, La/uot;->j:B

    .line 70
    .line 71
    new-instance v1, La/atj;

    .line 72
    .line 73
    const/16 v5, 0xe

    .line 74
    .line 75
    invoke-direct {v1, v13, v10, v5}, La/atj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 76
    .line 77
    .line 78
    new-instance v5, La/vsg0;

    .line 79
    .line 80
    invoke-direct {v5, v1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 81
    .line 82
    .line 83
    new-instance v11, La/d5u;

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    iget-wide v14, v8, La/uot;->m:J

    .line 87
    .line 88
    invoke-direct/range {v11 .. v16}, La/d5u;-><init>(La/yje;La/q5u;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v11}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v5, La/rl2;

    .line 96
    .line 97
    const/16 v6, 0xc

    .line 98
    .line 99
    invoke-direct {v5, v9, v10, v6}, La/rl2;-><init>(ILa/yje;B)V

    .line 100
    .line 101
    .line 102
    new-instance v6, La/dnq;

    .line 103
    .line 104
    invoke-direct {v6, v1, v5, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 105
    .line 106
    .line 107
    if-ne v6, v0, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move-object v1, v2

    .line 111
    :goto_0
    check-cast v6, La/gmq;

    .line 112
    .line 113
    iput-object v10, v8, La/uot;->k:La/kmq;

    .line 114
    .line 115
    iput-object v10, v8, La/uot;->l:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v10, v8, La/uot;->n:La/kmq;

    .line 118
    .line 119
    iput-byte v3, v8, La/uot;->j:B

    .line 120
    .line 121
    invoke-static {v1, v6, v8}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-ne v1, v0, :cond_4

    .line 126
    .line 127
    :goto_1
    move-object v10, v0

    .line 128
    goto :goto_3

    .line 129
    :cond_4
    :goto_2
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    :goto_3
    return-object v10

    .line 132
    :pswitch_0
    move-object v11, v1

    .line 133
    check-cast v11, La/h6i;

    .line 134
    .line 135
    sget-object v12, La/wne;->a:La/wne;

    .line 136
    .line 137
    iget-byte v0, v8, La/uot;->j:B

    .line 138
    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    if-eq v0, v4, :cond_7

    .line 142
    .line 143
    if-eq v0, v3, :cond_6

    .line 144
    .line 145
    if-ne v0, v9, :cond_5

    .line 146
    .line 147
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_7

    .line 151
    .line 152
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_8

    .line 156
    .line 157
    :cond_6
    iget-object v0, v8, La/uot;->n:La/kmq;

    .line 158
    .line 159
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    move-object v13, v0

    .line 163
    move-object/from16 v0, p1

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_7
    iget-object v0, v8, La/uot;->p:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, La/krt0;

    .line 169
    .line 170
    iget-object v1, v8, La/uot;->n:La/kmq;

    .line 171
    .line 172
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v2, p1

    .line 176
    .line 177
    move-object v13, v1

    .line 178
    goto :goto_4

    .line 179
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object v0, v8, La/uot;->k:La/kmq;

    .line 183
    .line 184
    iget-object v1, v8, La/uot;->l:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, La/krt0;

    .line 187
    .line 188
    iget-object v2, v11, La/h6i;->n:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, La/j9u;

    .line 191
    .line 192
    iget-object v2, v2, La/j9u;->a:La/m0o0;

    .line 193
    .line 194
    iget-object v2, v2, La/m0o0;->b:La/abp;

    .line 195
    .line 196
    iget-object v2, v2, La/abp;->e:La/p7m0;

    .line 197
    .line 198
    iput-object v10, v8, La/uot;->k:La/kmq;

    .line 199
    .line 200
    iput-object v10, v8, La/uot;->l:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v0, v8, La/uot;->n:La/kmq;

    .line 203
    .line 204
    iput-object v1, v8, La/uot;->p:Ljava/lang/Object;

    .line 205
    .line 206
    iput-byte v4, v8, La/uot;->j:B

    .line 207
    .line 208
    invoke-static {v2, v8}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    if-ne v2, v12, :cond_9

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_9
    move-object v13, v0

    .line 216
    move-object v0, v1

    .line 217
    :goto_4
    move-object v7, v2

    .line 218
    check-cast v7, Ljava/lang/String;

    .line 219
    .line 220
    iget-object v1, v11, La/h6i;->a:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, La/dgu;

    .line 223
    .line 224
    move-object v4, v1

    .line 225
    iget-wide v1, v0, La/krt0;->a:J

    .line 226
    .line 227
    iget-boolean v5, v0, La/krt0;->c:Z

    .line 228
    .line 229
    iget-boolean v0, v0, La/krt0;->b:Z

    .line 230
    .line 231
    iput-object v10, v8, La/uot;->k:La/kmq;

    .line 232
    .line 233
    iput-object v10, v8, La/uot;->l:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v13, v8, La/uot;->n:La/kmq;

    .line 236
    .line 237
    iput-object v10, v8, La/uot;->p:Ljava/lang/Object;

    .line 238
    .line 239
    iput-byte v3, v8, La/uot;->j:B

    .line 240
    .line 241
    move v3, v5

    .line 242
    iget-wide v5, v8, La/uot;->m:J

    .line 243
    .line 244
    move-object/from16 v17, v4

    .line 245
    .line 246
    move v4, v0

    .line 247
    move-object/from16 v0, v17

    .line 248
    .line 249
    invoke-virtual/range {v0 .. v8}, La/dgu;->p(JZZJLjava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-ne v0, v12, :cond_a

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_a
    :goto_5
    check-cast v0, Lkotlin/Pair;

    .line 257
    .line 258
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v1, Ljava/util/List;

    .line 261
    .line 262
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Ljava/util/List;

    .line 265
    .line 266
    iget-object v2, v11, La/h6i;->k:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v2, La/v7i;

    .line 269
    .line 270
    invoke-virtual {v11}, La/h6i;->d()La/sff0;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    iget-boolean v3, v3, La/sff0;->J1:Z

    .line 275
    .line 276
    invoke-virtual {v11}, La/h6i;->d()La/sff0;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    iget-boolean v4, v4, La/sff0;->O1:Z

    .line 281
    .line 282
    invoke-virtual {v2, v0, v3, v4}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    new-instance v2, La/yot;

    .line 287
    .line 288
    const/4 v3, 0x0

    .line 289
    invoke-direct {v2, v0, v1, v3}, La/yot;-><init>(La/acu;Ljava/util/List;B)V

    .line 290
    .line 291
    .line 292
    iput-object v10, v8, La/uot;->k:La/kmq;

    .line 293
    .line 294
    iput-object v10, v8, La/uot;->l:Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v10, v8, La/uot;->n:La/kmq;

    .line 297
    .line 298
    iput-object v10, v8, La/uot;->p:Ljava/lang/Object;

    .line 299
    .line 300
    iput-byte v9, v8, La/uot;->j:B

    .line 301
    .line 302
    invoke-static {v13, v2, v8}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    if-ne v0, v12, :cond_b

    .line 307
    .line 308
    :goto_6
    move-object v10, v12

    .line 309
    goto :goto_8

    .line 310
    :cond_b
    :goto_7
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    :goto_8
    return-object v10

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
