.class public final La/e3z;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Z

.field public final synthetic l:J

.field public final synthetic m:J

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JJLa/yje;La/are;La/ieu;Ljava/util/List;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/e3z;->i:B

    .line 23
    iput-object p7, p0, La/e3z;->o:Ljava/lang/Object;

    iput-wide p1, p0, La/e3z;->l:J

    iput-object p8, p0, La/e3z;->p:Ljava/lang/Object;

    iput-boolean p9, p0, La/e3z;->k:Z

    iput-wide p3, p0, La/e3z;->m:J

    iput-object p6, p0, La/e3z;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/f1b0;La/mlr;ZLjava/lang/Integer;JJLa/fza0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/e3z;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/e3z;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/e3z;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, La/e3z;->k:Z

    .line 9
    .line 10
    iput-object p4, p0, La/e3z;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iput-wide p5, p0, La/e3z;->l:J

    .line 13
    .line 14
    iput-wide p7, p0, La/e3z;->m:J

    .line 15
    .line 16
    iput-object p9, p0, La/e3z;->q:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e3z;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/e3z;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/e3z;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/e3z;->o:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v5, La/e3z;

    .line 15
    .line 16
    iget-object v1, v0, La/e3z;->n:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v1

    .line 19
    check-cast v6, La/f1b0;

    .line 20
    .line 21
    move-object v7, v4

    .line 22
    check-cast v7, La/mlr;

    .line 23
    .line 24
    move-object v9, v3

    .line 25
    check-cast v9, Ljava/lang/Integer;

    .line 26
    .line 27
    iget-wide v12, v0, La/e3z;->m:J

    .line 28
    .line 29
    move-object v14, v2

    .line 30
    check-cast v14, La/fza0;

    .line 31
    .line 32
    iget-boolean v8, v0, La/e3z;->k:Z

    .line 33
    .line 34
    iget-wide v10, v0, La/e3z;->l:J

    .line 35
    .line 36
    move-object/from16 v15, p2

    .line 37
    .line 38
    invoke-direct/range {v5 .. v15}, La/e3z;-><init>(La/f1b0;La/mlr;ZLjava/lang/Integer;JJLa/fza0;La/yje;)V

    .line 39
    .line 40
    .line 41
    return-object v5

    .line 42
    :pswitch_0
    new-instance v6, La/e3z;

    .line 43
    .line 44
    move-object v13, v4

    .line 45
    check-cast v13, La/ieu;

    .line 46
    .line 47
    move-object v14, v3

    .line 48
    check-cast v14, Ljava/util/List;

    .line 49
    .line 50
    iget-wide v9, v0, La/e3z;->m:J

    .line 51
    .line 52
    move-object v12, v2

    .line 53
    check-cast v12, La/are;

    .line 54
    .line 55
    iget-wide v7, v0, La/e3z;->l:J

    .line 56
    .line 57
    iget-boolean v15, v0, La/e3z;->k:Z

    .line 58
    .line 59
    move-object/from16 v11, p2

    .line 60
    .line 61
    invoke-direct/range {v6 .. v15}, La/e3z;-><init>(JJLa/yje;La/are;La/ieu;Ljava/util/List;Z)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v0, p1

    .line 65
    .line 66
    iput-object v0, v6, La/e3z;->n:Ljava/lang/Object;

    .line 67
    .line 68
    return-object v6

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/e3z;->i:B

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
    invoke-virtual {p0, p1, p2}, La/e3z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/e3z;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/e3z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/e3z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/e3z;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/e3z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 25

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/e3z;->i:B

    .line 4
    .line 5
    iget-object v1, v5, La/e3z;->o:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    iget-boolean v7, v5, La/e3z;->k:Z

    .line 11
    .line 12
    iget-object v3, v5, La/e3z;->p:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v4, v5, La/e3z;->q:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v14, v4

    .line 21
    check-cast v14, La/fza0;

    .line 22
    .line 23
    move-object v15, v3

    .line 24
    check-cast v15, Ljava/lang/Integer;

    .line 25
    .line 26
    iget-object v0, v5, La/e3z;->n:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v9, v0

    .line 29
    check-cast v9, La/f1b0;

    .line 30
    .line 31
    sget-object v0, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget-boolean v3, v5, La/e3z;->j:Z

    .line 34
    .line 35
    const/16 v16, 0x0

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    if-ne v3, v6, :cond_0

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v2, v0

    .line 54
    iget-object v0, v9, La/f1b0;->P:La/xr;

    .line 55
    .line 56
    check-cast v1, La/mlr;

    .line 57
    .line 58
    move-object v3, v2

    .line 59
    xor-int/lit8 v2, v7, 0x1

    .line 60
    .line 61
    if-eqz v15, :cond_2

    .line 62
    .line 63
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move/from16 v4, v16

    .line 69
    .line 70
    :goto_0
    iget-wide v10, v5, La/e3z;->l:J

    .line 71
    .line 72
    iget-wide v12, v5, La/e3z;->m:J

    .line 73
    .line 74
    invoke-virtual/range {v9 .. v14}, La/f1b0;->N(JJLa/fza0;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    iput-boolean v6, v5, La/e3z;->j:Z

    .line 79
    .line 80
    move-object/from16 v24, v10

    .line 81
    .line 82
    move-object v10, v3

    .line 83
    move v3, v4

    .line 84
    move-object/from16 v4, v24

    .line 85
    .line 86
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v10, :cond_3

    .line 91
    .line 92
    move-object v8, v10

    .line 93
    goto :goto_4

    .line 94
    :cond_3
    :goto_1
    xor-int/lit8 v20, v7, 0x1

    .line 95
    .line 96
    sget v0, La/f1b0;->w0:I

    .line 97
    .line 98
    if-eqz v15, :cond_4

    .line 99
    .line 100
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v16

    .line 104
    :cond_4
    sget-object v0, La/p0b0;->a:[I

    .line 105
    .line 106
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    aget v0, v0, v1

    .line 111
    .line 112
    if-eq v0, v6, :cond_6

    .line 113
    .line 114
    const/4 v1, 0x2

    .line 115
    if-eq v0, v1, :cond_5

    .line 116
    .line 117
    :goto_2
    move-object/from16 v21, v8

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    const-string v8, "live_aggregator_popular"

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    const-string v8, "slots_popular"

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :goto_3
    iget-object v0, v9, La/f1b0;->y:La/u58;

    .line 127
    .line 128
    move-object/from16 v23, v21

    .line 129
    .line 130
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v21

    .line 134
    const-string v22, "popular_new_aggregator"

    .line 135
    .line 136
    iget-wide v1, v5, La/e3z;->l:J

    .line 137
    .line 138
    move-object/from16 v17, v0

    .line 139
    .line 140
    move-wide/from16 v18, v1

    .line 141
    .line 142
    invoke-virtual/range {v17 .. v23}, La/u58;->j(JZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    move-wide/from16 v0, v18

    .line 146
    .line 147
    iget-object v2, v9, La/f1b0;->D:La/ix0;

    .line 148
    .line 149
    long-to-int v0, v0

    .line 150
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v19

    .line 154
    sget-object v1, La/y1p;->b:La/y1p;

    .line 155
    .line 156
    move/from16 v22, v20

    .line 157
    .line 158
    const-string v20, "popular_new_aggregator"

    .line 159
    .line 160
    move/from16 v18, v0

    .line 161
    .line 162
    move-object/from16 v17, v2

    .line 163
    .line 164
    move-object/from16 v21, v23

    .line 165
    .line 166
    invoke-virtual/range {v17 .. v22}, La/ix0;->h(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 167
    .line 168
    .line 169
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    :goto_4
    return-object v8

    .line 172
    :pswitch_0
    check-cast v1, La/ieu;

    .line 173
    .line 174
    iget-object v0, v5, La/e3z;->n:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, La/vne;

    .line 177
    .line 178
    sget-object v9, La/wne;->a:La/wne;

    .line 179
    .line 180
    iget-boolean v0, v5, La/e3z;->j:Z

    .line 181
    .line 182
    if-eqz v0, :cond_8

    .line 183
    .line 184
    if-ne v0, v6, :cond_7

    .line 185
    .line 186
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object/from16 v0, p1

    .line 190
    .line 191
    check-cast v0, La/j0g0;

    .line 192
    .line 193
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 204
    .line 205
    iget-object v0, v1, La/ieu;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, La/gst0;

    .line 208
    .line 209
    iget-object v0, v0, La/gst0;->a:La/rrt0;

    .line 210
    .line 211
    invoke-virtual {v0}, La/rrt0;->a()La/krt0;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v7, :cond_9

    .line 216
    .line 217
    iget-boolean v0, v0, La/krt0;->c:Z

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_9
    iget-boolean v0, v0, La/krt0;->b:Z

    .line 221
    .line 222
    :goto_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 223
    .line 224
    .line 225
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    goto :goto_6

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 229
    .line 230
    new-instance v2, La/g0g0;

    .line 231
    .line 232
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    move-object v0, v2

    .line 236
    :goto_6
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 237
    .line 238
    instance-of v7, v0, La/g0g0;

    .line 239
    .line 240
    if-eqz v7, :cond_a

    .line 241
    .line 242
    move-object v0, v2

    .line 243
    :cond_a
    check-cast v0, Ljava/lang/Boolean;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    iget-object v0, v1, La/ieu;->b:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, La/bl6;

    .line 252
    .line 253
    new-instance v10, La/yf6;

    .line 254
    .line 255
    move-object v13, v3

    .line 256
    check-cast v13, Ljava/util/List;

    .line 257
    .line 258
    iget-wide v1, v5, La/e3z;->m:J

    .line 259
    .line 260
    move-object/from16 v18, v4

    .line 261
    .line 262
    check-cast v18, La/are;

    .line 263
    .line 264
    iget-wide v11, v5, La/e3z;->l:J

    .line 265
    .line 266
    iget-boolean v14, v5, La/e3z;->k:Z

    .line 267
    .line 268
    move-wide/from16 v16, v1

    .line 269
    .line 270
    invoke-direct/range {v10 .. v18}, La/yf6;-><init>(JLjava/util/List;ZZJLa/are;)V

    .line 271
    .line 272
    .line 273
    iput-object v8, v5, La/e3z;->n:Ljava/lang/Object;

    .line 274
    .line 275
    iput-boolean v6, v5, La/e3z;->j:Z

    .line 276
    .line 277
    invoke-virtual {v0, v10, v5}, La/bl6;->b(La/yf6;La/zje;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    if-ne v0, v9, :cond_b

    .line 282
    .line 283
    move-object v8, v9

    .line 284
    goto :goto_8

    .line 285
    :cond_b
    :goto_7
    new-instance v8, La/j0g0;

    .line 286
    .line 287
    invoke-direct {v8, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :goto_8
    return-object v8

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
