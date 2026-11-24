.class public final La/xw4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BJJLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 17
    iput-byte p1, p0, La/xw4;->i:B

    iput-object p7, p0, La/xw4;->m:Ljava/lang/Object;

    iput-object p8, p0, La/xw4;->n:Ljava/lang/Object;

    iput-wide p2, p0, La/xw4;->k:J

    iput-wide p4, p0, La/xw4;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/gr00;JJLjava/lang/String;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/xw4;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/xw4;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, La/xw4;->k:J

    .line 7
    .line 8
    iput-wide p4, p0, La/xw4;->l:J

    .line 9
    .line 10
    iput-object p6, p0, La/xw4;->n:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    iget-byte p1, p0, La/xw4;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/xw4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/xw4;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/xw4;

    .line 11
    .line 12
    move-object v9, v1

    .line 13
    check-cast v9, La/w5z;

    .line 14
    .line 15
    move-object v10, v0

    .line 16
    check-cast v10, Ljava/util/List;

    .line 17
    .line 18
    iget-wide v6, p0, La/xw4;->l:J

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    iget-wide v4, p0, La/xw4;->k:J

    .line 22
    .line 23
    move-object v8, p2

    .line 24
    invoke-direct/range {v2 .. v10}, La/xw4;-><init>(BJJLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :pswitch_0
    move-object v8, p2

    .line 29
    new-instance v3, La/xw4;

    .line 30
    .line 31
    move-object v10, v1

    .line 32
    check-cast v10, La/l7m0;

    .line 33
    .line 34
    move-object v11, v0

    .line 35
    check-cast v11, La/t33;

    .line 36
    .line 37
    move-object v9, v8

    .line 38
    iget-wide v7, p0, La/xw4;->l:J

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    iget-wide v5, p0, La/xw4;->k:J

    .line 42
    .line 43
    invoke-direct/range {v3 .. v11}, La/xw4;-><init>(BJJLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :pswitch_1
    move-object v8, p2

    .line 48
    new-instance v3, La/xw4;

    .line 49
    .line 50
    move-object v4, v1

    .line 51
    check-cast v4, La/gr00;

    .line 52
    .line 53
    move-object v9, v8

    .line 54
    iget-wide v7, p0, La/xw4;->l:J

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    iget-wide v5, p0, La/xw4;->k:J

    .line 59
    .line 60
    move-object v10, v9

    .line 61
    move-object v9, v0

    .line 62
    invoke-direct/range {v3 .. v10}, La/xw4;-><init>(La/gr00;JJLjava/lang/String;La/yje;)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xw4;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xw4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xw4;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xw4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xw4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xw4;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xw4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/xw4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/xw4;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/xw4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xw4;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/xw4;->n:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/xw4;->m:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, v0, La/xw4;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v5, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    check-cast v3, La/w5z;

    .line 39
    .line 40
    iget-object v4, v3, La/w5z;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, La/abu;

    .line 43
    .line 44
    iget-object v3, v3, La/w5z;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, La/btt0;

    .line 47
    .line 48
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v2, Ljava/util/List;

    .line 53
    .line 54
    new-instance v6, Ljava/util/ArrayList;

    .line 55
    .line 56
    const/16 v7, 0xa

    .line 57
    .line 58
    invoke-static {v2, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    check-cast v7, La/ru6;

    .line 80
    .line 81
    invoke-static {v7}, La/ro4;->i0(La/ru6;)La/edy;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance v2, Ljava/lang/Long;

    .line 90
    .line 91
    iget-wide v7, v0, La/xw4;->k:J

    .line 92
    .line 93
    invoke-direct {v2, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 94
    .line 95
    .line 96
    new-instance v7, Ljava/lang/Long;

    .line 97
    .line 98
    iget-wide v8, v0, La/xw4;->l:J

    .line 99
    .line 100
    invoke-direct {v7, v8, v9}, Ljava/lang/Long;-><init>(J)V

    .line 101
    .line 102
    .line 103
    new-instance v8, La/d40;

    .line 104
    .line 105
    invoke-direct {v8, v6, v2, v7}, La/d40;-><init>(Ljava/util/ArrayList;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 106
    .line 107
    .line 108
    iput-boolean v5, v0, La/xw4;->j:Z

    .line 109
    .line 110
    invoke-virtual {v4}, La/abu;->m()La/m520;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v2, v3, v8, v0}, La/m520;->b(Ljava/lang/String;La/d40;La/yje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-ne v0, v1, :cond_3

    .line 119
    .line 120
    move-object v0, v1

    .line 121
    :cond_3
    :goto_1
    return-object v0

    .line 122
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 123
    .line 124
    iget-boolean v7, v0, La/xw4;->j:Z

    .line 125
    .line 126
    if-eqz v7, :cond_5

    .line 127
    .line 128
    if-ne v7, v5, :cond_4

    .line 129
    .line 130
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    check-cast v3, La/l7m0;

    .line 142
    .line 143
    new-instance v4, La/eka;

    .line 144
    .line 145
    const/16 v7, 0xb

    .line 146
    .line 147
    invoke-direct {v4, v3, v7}, La/eka;-><init>(La/l7m0;B)V

    .line 148
    .line 149
    .line 150
    invoke-static {v6, v4}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    new-instance v6, La/z3d;

    .line 155
    .line 156
    move-object v7, v2

    .line 157
    check-cast v7, La/t33;

    .line 158
    .line 159
    iget-wide v8, v0, La/xw4;->k:J

    .line 160
    .line 161
    iget-wide v10, v0, La/xw4;->l:J

    .line 162
    .line 163
    invoke-direct/range {v6 .. v11}, La/z3d;-><init>(La/t33;JJ)V

    .line 164
    .line 165
    .line 166
    iput-boolean v5, v0, La/xw4;->j:Z

    .line 167
    .line 168
    invoke-virtual {v3, v6, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-ne v0, v1, :cond_6

    .line 173
    .line 174
    move-object v6, v1

    .line 175
    goto :goto_3

    .line 176
    :cond_6
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    :goto_3
    return-object v6

    .line 179
    :pswitch_1
    check-cast v3, La/gr00;

    .line 180
    .line 181
    iget-object v1, v3, La/gr00;->d:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v1, La/knf0;

    .line 184
    .line 185
    sget-object v7, La/wne;->a:La/wne;

    .line 186
    .line 187
    iget-boolean v8, v0, La/xw4;->j:Z

    .line 188
    .line 189
    if-eqz v8, :cond_8

    .line 190
    .line 191
    if-ne v8, v5, :cond_7

    .line 192
    .line 193
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v0, p1

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_9

    .line 203
    .line 204
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget-object v4, v3, La/gr00;->b:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v4, La/peg0;

    .line 210
    .line 211
    iget-object v3, v3, La/gr00;->e:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v3, La/btt0;

    .line 214
    .line 215
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    new-instance v8, La/nv4;

    .line 220
    .line 221
    invoke-virtual {v1}, La/knf0;->a()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    move-object v15, v2

    .line 230
    check-cast v15, Ljava/lang/String;

    .line 231
    .line 232
    iget-wide v9, v0, La/xw4;->k:J

    .line 233
    .line 234
    iget-wide v11, v0, La/xw4;->l:J

    .line 235
    .line 236
    invoke-direct/range {v8 .. v15}, La/nv4;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    iput-boolean v5, v0, La/xw4;->j:Z

    .line 240
    .line 241
    iget-object v1, v4, La/peg0;->b:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v1, La/zm;

    .line 244
    .line 245
    invoke-virtual {v1}, La/zm;->invoke()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    check-cast v1, La/sw4;

    .line 250
    .line 251
    invoke-interface {v1, v3, v8, v0}, La/sw4;->b(Ljava/lang/String;La/nv4;La/yje;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-ne v0, v7, :cond_9

    .line 256
    .line 257
    move-object v6, v7

    .line 258
    goto :goto_9

    .line 259
    :cond_9
    :goto_4
    check-cast v0, La/q16;

    .line 260
    .line 261
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, La/tv4;

    .line 266
    .line 267
    new-instance v1, La/iv4;

    .line 268
    .line 269
    iget-object v2, v0, La/tv4;->a:Ljava/lang/String;

    .line 270
    .line 271
    if-nez v2, :cond_a

    .line 272
    .line 273
    const-string v2, ""

    .line 274
    .line 275
    :cond_a
    iget-object v3, v0, La/tv4;->b:Ljava/lang/Long;

    .line 276
    .line 277
    const-wide/16 v7, 0x0

    .line 278
    .line 279
    if-eqz v3, :cond_b

    .line 280
    .line 281
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 282
    .line 283
    .line 284
    move-result-wide v3

    .line 285
    goto :goto_5

    .line 286
    :cond_b
    move-wide v3, v7

    .line 287
    :goto_5
    cmp-long v7, v3, v7

    .line 288
    .line 289
    if-nez v7, :cond_c

    .line 290
    .line 291
    sget-object v3, La/ix4;->a:La/ix4;

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_c
    const-wide/16 v7, -0x1

    .line 295
    .line 296
    cmp-long v3, v3, v7

    .line 297
    .line 298
    if-nez v3, :cond_d

    .line 299
    .line 300
    sget-object v3, La/ix4;->c:La/ix4;

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_d
    sget-object v3, La/ix4;->b:La/ix4;

    .line 304
    .line 305
    :goto_6
    iget-object v4, v0, La/tv4;->c:La/yv4;

    .line 306
    .line 307
    if-eqz v4, :cond_11

    .line 308
    .line 309
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-eqz v4, :cond_10

    .line 314
    .line 315
    if-eq v4, v5, :cond_f

    .line 316
    .line 317
    const/4 v5, 0x2

    .line 318
    if-ne v4, v5, :cond_e

    .line 319
    .line 320
    sget-object v4, La/vv4;->c:La/vv4;

    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 324
    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_f
    sget-object v4, La/vv4;->b:La/vv4;

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_10
    sget-object v4, La/vv4;->a:La/vv4;

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_11
    sget-object v4, La/vv4;->a:La/vv4;

    .line 334
    .line 335
    :goto_7
    iget-object v0, v0, La/tv4;->d:Ljava/lang/Integer;

    .line 336
    .line 337
    if-eqz v0, :cond_12

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    goto :goto_8

    .line 344
    :cond_12
    const/4 v0, 0x0

    .line 345
    :goto_8
    invoke-direct {v1, v2, v3, v4, v0}, La/iv4;-><init>(Ljava/lang/String;La/ix4;La/vv4;I)V

    .line 346
    .line 347
    .line 348
    move-object v6, v1

    .line 349
    :goto_9
    return-object v6

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
