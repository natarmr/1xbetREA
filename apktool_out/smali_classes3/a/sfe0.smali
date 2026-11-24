.class public final La/sfe0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wfe0;

.field public final synthetic l:La/mlr;


# direct methods
.method public synthetic constructor <init>(La/wfe0;La/mlr;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/sfe0;->i:B

    iput-object p1, p0, La/sfe0;->k:La/wfe0;

    iput-object p2, p0, La/sfe0;->l:La/mlr;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/sfe0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/sfe0;->l:La/mlr;

    .line 4
    .line 5
    iget-object p0, p0, La/sfe0;->k:La/wfe0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/sfe0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/sfe0;-><init>(La/wfe0;La/mlr;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/sfe0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/sfe0;-><init>(La/wfe0;La/mlr;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sfe0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/sfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sfe0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/sfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/sfe0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/sfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/sfe0;->i:B

    .line 4
    .line 5
    const/16 v1, 0x13f7

    .line 6
    .line 7
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v3, v5, La/sfe0;->k:La/wfe0;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move v0, v1

    .line 17
    iget-object v1, v5, La/sfe0;->l:La/mlr;

    .line 18
    .line 19
    iget-wide v7, v1, La/mlr;->a:J

    .line 20
    .line 21
    sget-object v9, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v10, v5, La/sfe0;->j:Z

    .line 24
    .line 25
    if-eqz v10, :cond_1

    .line 26
    .line 27
    if-ne v10, v4, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object v2, La/wfe0;->L:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, La/nfe0;

    .line 49
    .line 50
    iget-object v2, v2, La/nfe0;->a:La/aie;

    .line 51
    .line 52
    instance-of v10, v2, La/uge;

    .line 53
    .line 54
    if-eqz v10, :cond_2

    .line 55
    .line 56
    check-cast v2, La/uge;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v2, v6

    .line 60
    :goto_0
    if-eqz v2, :cond_6

    .line 61
    .line 62
    iget-object v2, v2, La/uge;->a:Ljava/util/List;

    .line 63
    .line 64
    if-eqz v2, :cond_6

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/4 v10, 0x0

    .line 71
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    if-eqz v11, :cond_4

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    check-cast v11, La/mlr;

    .line 82
    .line 83
    iget-wide v11, v11, La/mlr;->a:J

    .line 84
    .line 85
    cmp-long v11, v11, v7

    .line 86
    .line 87
    if-nez v11, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    const/4 v10, -0x1

    .line 94
    :goto_2
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-ltz v10, :cond_5

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    move-object v2, v6

    .line 102
    :goto_3
    if-eqz v2, :cond_6

    .line 103
    .line 104
    invoke-static {v4, v2}, La/kng0;->e(ILjava/lang/Integer;)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    :cond_6
    move-object/from16 v16, v6

    .line 109
    .line 110
    iget-object v10, v3, La/wfe0;->y:La/ix0;

    .line 111
    .line 112
    long-to-int v11, v7

    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v12, 0x13f7

    .line 115
    .line 116
    const-string v14, "aggregator_recommended"

    .line 117
    .line 118
    move-object/from16 v13, v16

    .line 119
    .line 120
    invoke-virtual/range {v10 .. v15}, La/ix0;->a(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v10, v3, La/wfe0;->x:La/u58;

    .line 124
    .line 125
    iget-wide v11, v1, La/mlr;->a:J

    .line 126
    .line 127
    iget-object v2, v10, La/u58;->a:La/kt2;

    .line 128
    .line 129
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v18, 0x28

    .line 136
    .line 137
    const-string v13, "aggregator_recommended"

    .line 138
    .line 139
    invoke-static/range {v10 .. v18}, La/u58;->a(La/u58;JLjava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;I)La/jo20;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-string v6, "game_aggregator_call"

    .line 144
    .line 145
    invoke-interface {v2, v6, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 146
    .line 147
    .line 148
    iget-object v0, v3, La/wfe0;->q:La/pw70;

    .line 149
    .line 150
    invoke-virtual {v3, v1}, La/wfe0;->M(La/mlr;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iput-boolean v4, v5, La/sfe0;->j:Z

    .line 155
    .line 156
    const/16 v3, 0x13f7

    .line 157
    .line 158
    const/4 v4, 0x0

    .line 159
    const/4 v5, 0x0

    .line 160
    const/16 v7, 0x72

    .line 161
    .line 162
    move-object/from16 v6, p0

    .line 163
    .line 164
    invoke-static/range {v0 .. v7}, La/pw70;->b(La/pw70;La/mlr;Ljava/lang/String;IZZLa/yje;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-ne v0, v9, :cond_7

    .line 169
    .line 170
    move-object v6, v9

    .line 171
    goto :goto_5

    .line 172
    :cond_7
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_5
    return-object v6

    .line 175
    :pswitch_0
    move v0, v1

    .line 176
    iget-object v1, v5, La/sfe0;->l:La/mlr;

    .line 177
    .line 178
    iget-wide v7, v1, La/mlr;->a:J

    .line 179
    .line 180
    sget-object v9, La/wne;->a:La/wne;

    .line 181
    .line 182
    iget-boolean v10, v5, La/sfe0;->j:Z

    .line 183
    .line 184
    if-eqz v10, :cond_9

    .line 185
    .line 186
    if-ne v10, v4, :cond_8

    .line 187
    .line 188
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v2, v3, La/wfe0;->y:La/ix0;

    .line 200
    .line 201
    long-to-int v6, v7

    .line 202
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    check-cast v10, La/nfe0;

    .line 207
    .line 208
    iget-object v10, v10, La/nfe0;->h:Ljava/util/Set;

    .line 209
    .line 210
    new-instance v11, Ljava/lang/Long;

    .line 211
    .line 212
    invoke-direct {v11, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    xor-int/2addr v10, v4

    .line 220
    new-instance v11, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-direct {v11, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-static {v2, v6, v10, v11}, La/ix0;->i(La/ix0;IZLjava/lang/Integer;)V

    .line 226
    .line 227
    .line 228
    iget-object v12, v3, La/wfe0;->x:La/u58;

    .line 229
    .line 230
    iget-wide v13, v1, La/mlr;->a:J

    .line 231
    .line 232
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    check-cast v2, La/nfe0;

    .line 237
    .line 238
    iget-object v2, v2, La/nfe0;->h:Ljava/util/Set;

    .line 239
    .line 240
    new-instance v6, Ljava/lang/Long;

    .line 241
    .line 242
    invoke-direct {v6, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v2, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    xor-int/lit8 v15, v2, 0x1

    .line 250
    .line 251
    new-instance v2, Ljava/lang/Integer;

    .line 252
    .line 253
    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 254
    .line 255
    .line 256
    const/16 v18, 0x0

    .line 257
    .line 258
    const/16 v17, 0x0

    .line 259
    .line 260
    move-object/from16 v16, v2

    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, La/u58;->j(JZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, v3, La/wfe0;->B:La/xr;

    .line 266
    .line 267
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, La/nfe0;

    .line 272
    .line 273
    iget-object v2, v2, La/nfe0;->h:Ljava/util/Set;

    .line 274
    .line 275
    new-instance v6, Ljava/lang/Long;

    .line 276
    .line 277
    invoke-direct {v6, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v2, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    xor-int/2addr v2, v4

    .line 285
    invoke-virtual {v3, v1}, La/wfe0;->M(La/mlr;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    iput-boolean v4, v5, La/sfe0;->j:Z

    .line 290
    .line 291
    move-object v4, v3

    .line 292
    const/16 v3, 0x13f7

    .line 293
    .line 294
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    if-ne v0, v9, :cond_a

    .line 299
    .line 300
    move-object v6, v9

    .line 301
    goto :goto_7

    .line 302
    :cond_a
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    :goto_7
    return-object v6

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
