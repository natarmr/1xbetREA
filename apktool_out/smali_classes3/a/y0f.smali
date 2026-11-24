.class public final La/y0f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:J

.field public l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLa/pzu;ZLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/y0f;->i:B

    .line 17
    iput-wide p1, p0, La/y0f;->k:J

    iput-object p3, p0, La/y0f;->n:Ljava/lang/Object;

    iput-boolean p4, p0, La/y0f;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/g45;Ljava/lang/String;JILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/y0f;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/y0f;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/y0f;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, La/y0f;->k:J

    .line 9
    .line 10
    iput-byte p5, p0, La/y0f;->j:B

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(ZLa/v3b0;JLa/kic0;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/y0f;->i:B

    .line 18
    iput-boolean p1, p0, La/y0f;->l:Z

    iput-object p2, p0, La/y0f;->m:Ljava/lang/Object;

    iput-wide p3, p0, La/y0f;->k:J

    iput-object p5, p0, La/y0f;->n:Ljava/lang/Object;

    invoke-direct {p0, v0, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/y0f;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/y0f;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/y0f;

    .line 9
    .line 10
    iget-boolean v3, p0, La/y0f;->l:Z

    .line 11
    .line 12
    iget-object p1, p0, La/y0f;->m:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, La/v3b0;

    .line 16
    .line 17
    iget-wide v5, p0, La/y0f;->k:J

    .line 18
    .line 19
    move-object v7, v1

    .line 20
    check-cast v7, La/kic0;

    .line 21
    .line 22
    move-object v8, p2

    .line 23
    invoke-direct/range {v2 .. v8}, La/y0f;-><init>(ZLa/v3b0;JLa/kic0;La/yje;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    move-object v8, p2

    .line 28
    new-instance v3, La/y0f;

    .line 29
    .line 30
    move-object v6, v1

    .line 31
    check-cast v6, La/pzu;

    .line 32
    .line 33
    iget-boolean v7, p0, La/y0f;->l:Z

    .line 34
    .line 35
    iget-wide v4, p0, La/y0f;->k:J

    .line 36
    .line 37
    invoke-direct/range {v3 .. v8}, La/y0f;-><init>(JLa/pzu;ZLa/yje;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, v3, La/y0f;->m:Ljava/lang/Object;

    .line 41
    .line 42
    return-object v3

    .line 43
    :pswitch_1
    move-object v8, p2

    .line 44
    new-instance v3, La/y0f;

    .line 45
    .line 46
    iget-object p1, p0, La/y0f;->m:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v4, p1

    .line 49
    check-cast v4, La/g45;

    .line 50
    .line 51
    move-object v5, v1

    .line 52
    check-cast v5, Ljava/lang/String;

    .line 53
    .line 54
    iget-wide v6, p0, La/y0f;->k:J

    .line 55
    .line 56
    iget-byte p0, p0, La/y0f;->j:B

    .line 57
    .line 58
    move-object v9, v8

    .line 59
    move v8, p0

    .line 60
    invoke-direct/range {v3 .. v9}, La/y0f;-><init>(La/g45;Ljava/lang/String;JILa/yje;)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/y0f;->i:B

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
    invoke-virtual {p0, p1, p2}, La/y0f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/y0f;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/y0f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/y0f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/y0f;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/y0f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/y0f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/y0f;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/y0f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/y0f;->i:B

    .line 4
    .line 5
    iget-wide v1, v5, La/y0f;->k:J

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const-wide/16 v6, 0x0

    .line 10
    .line 11
    iget-object v8, v5, La/y0f;->n:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v10, 0x1

    .line 16
    const/4 v11, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v5, La/y0f;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/v3b0;

    .line 23
    .line 24
    iget-object v1, v0, La/v3b0;->I:La/eyg0;

    .line 25
    .line 26
    sget-object v12, La/wne;->a:La/wne;

    .line 27
    .line 28
    iget-byte v2, v5, La/y0f;->j:B

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    if-eq v2, v10, :cond_1

    .line 33
    .line 34
    if-ne v2, v4, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-boolean v2, v5, La/y0f;->l:Z

    .line 51
    .line 52
    const-string v9, "weekly_game"

    .line 53
    .line 54
    if-eqz v2, :cond_5

    .line 55
    .line 56
    iget-object v0, v0, La/v3b0;->K:La/nw20;

    .line 57
    .line 58
    new-instance v13, La/lu0;

    .line 59
    .line 60
    const-string v17, "popular_new_aggregator"

    .line 61
    .line 62
    invoke-static {v6, v7, v9}, La/hne;->r(JLjava/lang/String;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v18

    .line 66
    const-wide/16 v14, 0x0

    .line 67
    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    invoke-direct/range {v13 .. v18}, La/lu0;-><init>(JLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v13}, La/eyg0;->k(La/lu0;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-byte v10, v5, La/y0f;->j:B

    .line 78
    .line 79
    iget-object v2, v0, La/nw20;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, La/yr;

    .line 82
    .line 83
    iget-object v0, v0, La/nw20;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, La/uyn;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, La/uyn;->g(Ljava/lang/String;)La/lu0;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-object v0, v2, La/yr;->a:La/dn0;

    .line 92
    .line 93
    iget-wide v1, v5, La/y0f;->k:J

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-virtual/range {v0 .. v5}, La/dn0;->q(JILa/lu0;La/yje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-ne v0, v12, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    :goto_1
    if-ne v0, v12, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    :goto_2
    if-ne v0, v12, :cond_8

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_5
    iget-object v0, v0, La/v3b0;->J:La/c5k;

    .line 114
    .line 115
    check-cast v8, La/kic0;

    .line 116
    .line 117
    invoke-static {v8}, La/jeb;->Y(La/kic0;)La/mlr;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v13, La/lu0;

    .line 122
    .line 123
    const-string v17, "popular_new_aggregator"

    .line 124
    .line 125
    invoke-static {v6, v7, v9}, La/hne;->r(JLjava/lang/String;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v18

    .line 129
    const-wide/16 v14, 0x0

    .line 130
    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    invoke-direct/range {v13 .. v18}, La/lu0;-><init>(JLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v13}, La/eyg0;->k(La/lu0;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-byte v4, v5, La/y0f;->j:B

    .line 141
    .line 142
    iget-object v4, v0, La/c5k;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v4, La/do20;

    .line 145
    .line 146
    iget-object v0, v0, La/c5k;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, La/uyn;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, La/uyn;->g(Ljava/lang/String;)La/lu0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v1, v4, La/do20;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, La/dn0;

    .line 157
    .line 158
    invoke-virtual {v1, v2, v3, v0, v5}, La/dn0;->a(La/mlr;ILa/lu0;La/yje;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-ne v0, v12, :cond_6

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    :goto_3
    if-ne v0, v12, :cond_7

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    :goto_4
    if-ne v0, v12, :cond_8

    .line 173
    .line 174
    :goto_5
    move-object v11, v12

    .line 175
    goto :goto_7

    .line 176
    :cond_8
    :goto_6
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    :goto_7
    return-object v11

    .line 179
    :pswitch_0
    check-cast v8, La/pzu;

    .line 180
    .line 181
    iget-object v0, v5, La/y0f;->m:Ljava/lang/Object;

    .line 182
    .line 183
    move-object v6, v0

    .line 184
    check-cast v6, La/kmq;

    .line 185
    .line 186
    sget-object v7, La/wne;->a:La/wne;

    .line 187
    .line 188
    iget-byte v0, v5, La/y0f;->j:B

    .line 189
    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    if-eq v0, v10, :cond_a

    .line 193
    .line 194
    if-ne v0, v4, :cond_9

    .line 195
    .line 196
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    goto :goto_d

    .line 200
    :cond_9
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_e

    .line 204
    :cond_a
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    .line 206
    .line 207
    move-object/from16 v0, p1

    .line 208
    .line 209
    goto :goto_8

    .line 210
    :catchall_0
    move-exception v0

    .line 211
    goto :goto_9

    .line 212
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 216
    .line 217
    iget-object v0, v8, La/pzu;->f:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, La/reu;

    .line 220
    .line 221
    iput-object v6, v5, La/y0f;->m:Ljava/lang/Object;

    .line 222
    .line 223
    iput-byte v10, v5, La/y0f;->j:B

    .line 224
    .line 225
    iget-object v0, v0, La/reu;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, La/b3c0;

    .line 228
    .line 229
    invoke-virtual {v0, v3, v5}, La/b3c0;->a(ZLa/yje;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-ne v0, v7, :cond_c

    .line 234
    .line 235
    goto :goto_c

    .line 236
    :cond_c
    :goto_8
    check-cast v0, La/m2c0;

    .line 237
    .line 238
    iget-object v0, v0, La/m2c0;->c:Ljava/lang/String;

    .line 239
    .line 240
    sget-object v3, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 241
    .line 242
    goto :goto_a

    .line 243
    :goto_9
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 244
    .line 245
    new-instance v3, La/g0g0;

    .line 246
    .line 247
    invoke-direct {v3, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    move-object v0, v3

    .line 251
    :goto_a
    nop

    .line 252
    instance-of v3, v0, La/g0g0;

    .line 253
    .line 254
    if-eqz v3, :cond_d

    .line 255
    .line 256
    const-string v0, "0"

    .line 257
    .line 258
    :cond_d
    check-cast v0, Ljava/lang/String;

    .line 259
    .line 260
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    if-eqz v0, :cond_e

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    goto :goto_b

    .line 271
    :cond_e
    const/16 v0, 0xe1

    .line 272
    .line 273
    :goto_b
    new-instance v3, La/jcj;

    .line 274
    .line 275
    iget-boolean v9, v5, La/y0f;->l:Z

    .line 276
    .line 277
    invoke-direct {v3, v0, v11, v8, v9}, La/jcj;-><init>(ILa/yje;La/pzu;Z)V

    .line 278
    .line 279
    .line 280
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 281
    .line 282
    invoke-static {v1, v2, v0, v3}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    iput-object v11, v5, La/y0f;->m:Ljava/lang/Object;

    .line 287
    .line 288
    iput-byte v4, v5, La/y0f;->j:B

    .line 289
    .line 290
    invoke-static {v6, v0, v5}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    if-ne v0, v7, :cond_f

    .line 295
    .line 296
    :goto_c
    move-object v11, v7

    .line 297
    goto :goto_e

    .line 298
    :cond_f
    :goto_d
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    :goto_e
    return-object v11

    .line 301
    :pswitch_1
    iget-object v0, v5, La/y0f;->m:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, La/g45;

    .line 304
    .line 305
    iget-object v3, v0, La/g45;->h:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v3, La/knf0;

    .line 308
    .line 309
    sget-object v4, La/wne;->a:La/wne;

    .line 310
    .line 311
    iget-boolean v12, v5, La/y0f;->l:Z

    .line 312
    .line 313
    if-eqz v12, :cond_11

    .line 314
    .line 315
    if-ne v12, v10, :cond_10

    .line 316
    .line 317
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    move-object/from16 v0, p1

    .line 321
    .line 322
    goto :goto_f

    .line 323
    :cond_10
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    goto :goto_10

    .line 327
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iget-object v0, v0, La/g45;->d:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, La/ehf0;

    .line 333
    .line 334
    check-cast v8, Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    iget-byte v12, v5, La/y0f;->j:B

    .line 341
    .line 342
    invoke-virtual {v3}, La/knf0;->b()I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    iput-boolean v10, v5, La/y0f;->l:Z

    .line 347
    .line 348
    iget-object v0, v0, La/ehf0;->c:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, La/jwd;

    .line 351
    .line 352
    invoke-virtual {v0}, La/jwd;->invoke()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    check-cast v0, La/vre;

    .line 357
    .line 358
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 362
    .line 363
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 364
    .line 365
    .line 366
    const-string v13, "betsGuid"

    .line 367
    .line 368
    invoke-interface {v10, v13, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    cmp-long v6, v1, v6

    .line 372
    .line 373
    if-lez v6, :cond_12

    .line 374
    .line 375
    const-string v6, "userId"

    .line 376
    .line 377
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-interface {v10, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    :cond_12
    const-string v1, "lng"

    .line 385
    .line 386
    invoke-interface {v10, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    const-string v1, "cfView"

    .line 390
    .line 391
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-interface {v10, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    const-string v1, "country"

    .line 399
    .line 400
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-interface {v10, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    invoke-interface {v0, v10, v5}, La/vre;->g(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    if-ne v0, v4, :cond_13

    .line 412
    .line 413
    move-object v11, v4

    .line 414
    goto :goto_10

    .line 415
    :cond_13
    :goto_f
    check-cast v0, Ljava/util/List;

    .line 416
    .line 417
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, La/q16;

    .line 422
    .line 423
    if-eqz v0, :cond_14

    .line 424
    .line 425
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    check-cast v0, La/fm00;

    .line 430
    .line 431
    invoke-static {v0}, La/d7x;->M(La/fm00;)La/cm00;

    .line 432
    .line 433
    .line 434
    move-result-object v11

    .line 435
    goto :goto_10

    .line 436
    :cond_14
    invoke-static {v11}, La/jf4;->k(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    :goto_10
    return-object v11

    .line 440
    nop

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
