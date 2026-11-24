.class public final La/o550;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d650;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(La/d650;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/o550;->i:B

    iput-object p1, p0, La/o550;->k:La/d650;

    iput-wide p2, p0, La/o550;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/o550;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/o550;

    .line 7
    .line 8
    iget-wide v2, p0, La/o550;->l:J

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    iget-object v1, p0, La/o550;->k:La/d650;

    .line 12
    .line 13
    move-object v4, p2

    .line 14
    invoke-direct/range {v0 .. v5}, La/o550;-><init>(La/d650;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    move-object v5, p2

    .line 19
    new-instance v1, La/o550;

    .line 20
    .line 21
    iget-wide v3, p0, La/o550;->l:J

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    iget-object v2, p0, La/o550;->k:La/d650;

    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, La/o550;-><init>(La/d650;JLa/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_1
    move-object v5, p2

    .line 31
    new-instance v1, La/o550;

    .line 32
    .line 33
    iget-wide v3, p0, La/o550;->l:J

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    iget-object v2, p0, La/o550;->k:La/d650;

    .line 37
    .line 38
    invoke-direct/range {v1 .. v6}, La/o550;-><init>(La/d650;JLa/yje;B)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_2
    move-object v5, p2

    .line 43
    new-instance v1, La/o550;

    .line 44
    .line 45
    iget-wide v3, p0, La/o550;->l:J

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    iget-object v2, p0, La/o550;->k:La/d650;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v6}, La/o550;-><init>(La/d650;JLa/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/o550;->i:B

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
    invoke-virtual {p0, p1, p2}, La/o550;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/o550;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/o550;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/o550;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/o550;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/o550;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/o550;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/o550;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/o550;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/o550;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/o550;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/o550;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, La/o550;->i:B

    .line 4
    .line 5
    const-string v1, "my_aggregator_anonim"

    .line 6
    .line 7
    const-string v2, "my_aggregator"

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    iget-wide v7, v6, La/o550;->l:J

    .line 12
    .line 13
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    iget-object v10, v6, La/o550;->k:La/d650;

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget-object v12, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-boolean v0, v6, La/o550;->j:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    if-ne v0, v9, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v10, La/d650;->g1:La/p7m0;

    .line 44
    .line 45
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/Iterable;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object v13, v5

    .line 66
    check-cast v13, La/ef40;

    .line 67
    .line 68
    instance-of v13, v13, La/ze40;

    .line 69
    .line 70
    if-eqz v13, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v5, v11

    .line 74
    :goto_0
    check-cast v5, La/ef40;

    .line 75
    .line 76
    if-eqz v5, :cond_7

    .line 77
    .line 78
    instance-of v0, v5, La/ze40;

    .line 79
    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    check-cast v5, La/ze40;

    .line 83
    .line 84
    iget-object v0, v5, La/ze40;->a:La/vbj;

    .line 85
    .line 86
    instance-of v5, v0, La/qbj;

    .line 87
    .line 88
    if-eqz v5, :cond_7

    .line 89
    .line 90
    check-cast v0, La/qbj;

    .line 91
    .line 92
    iget-object v0, v0, La/qbj;->a:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ljava/lang/Iterable;

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_5

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    move-object v13, v5

    .line 111
    check-cast v13, La/mlr;

    .line 112
    .line 113
    iget-wide v13, v13, La/mlr;->a:J

    .line 114
    .line 115
    cmp-long v13, v13, v7

    .line 116
    .line 117
    if-nez v13, :cond_4

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    move-object v5, v11

    .line 121
    :goto_1
    check-cast v5, La/mlr;

    .line 122
    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    const-string v0, "top_game"

    .line 126
    .line 127
    invoke-virtual {v10, v5, v11, v0}, La/d650;->U(La/mlr;La/x4t;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, v10, La/d650;->F:La/pw70;

    .line 131
    .line 132
    iget-object v7, v10, La/d650;->r0:La/iqt;

    .line 133
    .line 134
    iget-object v7, v7, La/iqt;->a:La/gst0;

    .line 135
    .line 136
    invoke-virtual {v7}, La/gst0;->a()Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-eqz v7, :cond_6

    .line 141
    .line 142
    move-object v1, v2

    .line 143
    :cond_6
    const-string v2, "rec_unauth"

    .line 144
    .line 145
    invoke-static {v3, v4, v2}, La/hne;->r(JLjava/lang/String;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v10, v11, v2, v1}, La/d650;->Z(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iput-boolean v9, v6, La/o550;->j:Z

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    const/4 v4, 0x0

    .line 157
    move-object v1, v5

    .line 158
    const/4 v5, 0x0

    .line 159
    const/16 v7, 0x72

    .line 160
    .line 161
    invoke-static/range {v0 .. v7}, La/pw70;->b(La/pw70;La/mlr;Ljava/lang/String;IZZLa/yje;I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-ne v0, v12, :cond_7

    .line 166
    .line 167
    move-object v11, v12

    .line 168
    goto :goto_3

    .line 169
    :cond_7
    :goto_2
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    :goto_3
    return-object v11

    .line 172
    :pswitch_0
    sget-object v12, La/wne;->a:La/wne;

    .line 173
    .line 174
    iget-boolean v0, v6, La/o550;->j:Z

    .line 175
    .line 176
    if-eqz v0, :cond_9

    .line 177
    .line 178
    if-ne v0, v9, :cond_8

    .line 179
    .line 180
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_6

    .line 184
    .line 185
    :cond_8
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_7

    .line 189
    .line 190
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, v10, La/d650;->g1:La/p7m0;

    .line 194
    .line 195
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Ljava/lang/Iterable;

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_b

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    move-object v13, v5

    .line 216
    check-cast v13, La/ef40;

    .line 217
    .line 218
    instance-of v13, v13, La/re40;

    .line 219
    .line 220
    if-eqz v13, :cond_a

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_b
    move-object v5, v11

    .line 224
    :goto_4
    check-cast v5, La/ef40;

    .line 225
    .line 226
    if-eqz v5, :cond_f

    .line 227
    .line 228
    instance-of v0, v5, La/re40;

    .line 229
    .line 230
    if-eqz v0, :cond_f

    .line 231
    .line 232
    check-cast v5, La/re40;

    .line 233
    .line 234
    iget-object v0, v5, La/re40;->a:La/vbj;

    .line 235
    .line 236
    instance-of v5, v0, La/qbj;

    .line 237
    .line 238
    if-eqz v5, :cond_f

    .line 239
    .line 240
    check-cast v0, La/qbj;

    .line 241
    .line 242
    iget-object v0, v0, La/qbj;->a:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Ljava/lang/Iterable;

    .line 245
    .line 246
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_d

    .line 255
    .line 256
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    move-object v13, v5

    .line 261
    check-cast v13, La/mlr;

    .line 262
    .line 263
    iget-wide v13, v13, La/mlr;->a:J

    .line 264
    .line 265
    cmp-long v13, v13, v7

    .line 266
    .line 267
    if-nez v13, :cond_c

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_d
    move-object v5, v11

    .line 271
    :goto_5
    check-cast v5, La/mlr;

    .line 272
    .line 273
    if-eqz v5, :cond_f

    .line 274
    .line 275
    iget-object v13, v10, La/d650;->b0:La/ix0;

    .line 276
    .line 277
    iget-wide v7, v5, La/mlr;->a:J

    .line 278
    .line 279
    long-to-int v14, v7

    .line 280
    const-string v18, "slot_machine"

    .line 281
    .line 282
    const/4 v15, 0x0

    .line 283
    const/16 v16, 0x0

    .line 284
    .line 285
    const-string v17, "my_aggregator"

    .line 286
    .line 287
    invoke-virtual/range {v13 .. v18}, La/ix0;->a(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iget-object v0, v10, La/d650;->J:La/u58;

    .line 291
    .line 292
    iget-wide v7, v5, La/mlr;->a:J

    .line 293
    .line 294
    const/16 v25, 0x0

    .line 295
    .line 296
    const-string v26, "slot_machine"

    .line 297
    .line 298
    const-string v20, "my_aggregator"

    .line 299
    .line 300
    const-wide/16 v21, 0x0

    .line 301
    .line 302
    move-object/from16 v19, v0

    .line 303
    .line 304
    move-wide/from16 v23, v7

    .line 305
    .line 306
    invoke-virtual/range {v19 .. v26}, La/u58;->q(Ljava/lang/String;JJLjava/lang/Integer;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    iget-object v0, v10, La/d650;->F:La/pw70;

    .line 310
    .line 311
    new-instance v7, La/g3z;

    .line 312
    .line 313
    const-wide/16 v13, 0x338

    .line 314
    .line 315
    const-string v8, "category"

    .line 316
    .line 317
    invoke-direct {v7, v13, v14, v8}, La/g3z;-><init>(JLjava/lang/String;)V

    .line 318
    .line 319
    .line 320
    new-instance v8, La/g3z;

    .line 321
    .line 322
    const-string v13, "spin_games"

    .line 323
    .line 324
    invoke-direct {v8, v3, v4, v13}, La/g3z;-><init>(JLjava/lang/String;)V

    .line 325
    .line 326
    .line 327
    filled-new-array {v7, v8}, [La/g3z;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    iget-object v4, v10, La/d650;->r0:La/iqt;

    .line 336
    .line 337
    iget-object v4, v4, La/iqt;->a:La/gst0;

    .line 338
    .line 339
    invoke-virtual {v4}, La/gst0;->a()Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-eqz v4, :cond_e

    .line 344
    .line 345
    move-object v1, v2

    .line 346
    :cond_e
    invoke-virtual {v10, v11, v3, v1}, La/d650;->Z(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    iput-boolean v9, v6, La/o550;->j:Z

    .line 351
    .line 352
    const/4 v3, 0x0

    .line 353
    const/4 v4, 0x0

    .line 354
    move-object v1, v5

    .line 355
    const/4 v5, 0x0

    .line 356
    const/16 v7, 0x72

    .line 357
    .line 358
    invoke-static/range {v0 .. v7}, La/pw70;->b(La/pw70;La/mlr;Ljava/lang/String;IZZLa/yje;I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-ne v0, v12, :cond_f

    .line 363
    .line 364
    move-object v11, v12

    .line 365
    goto :goto_7

    .line 366
    :cond_f
    :goto_6
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    :goto_7
    return-object v11

    .line 369
    :pswitch_1
    sget-object v8, La/wne;->a:La/wne;

    .line 370
    .line 371
    iget-boolean v0, v6, La/o550;->j:Z

    .line 372
    .line 373
    if-eqz v0, :cond_11

    .line 374
    .line 375
    if-ne v0, v9, :cond_10

    .line 376
    .line 377
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_10
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    goto :goto_9

    .line 385
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    iget-object v0, v10, La/d650;->F:La/pw70;

    .line 389
    .line 390
    sget-object v32, La/iun;->a:La/iun;

    .line 391
    .line 392
    new-instance v12, La/mlr;

    .line 393
    .line 394
    const/16 v33, 0x0

    .line 395
    .line 396
    const v34, 0x20080

    .line 397
    .line 398
    .line 399
    const-wide/16 v13, 0x0

    .line 400
    .line 401
    const-wide/16 v15, 0x0

    .line 402
    .line 403
    const-wide/16 v17, 0x0

    .line 404
    .line 405
    const-wide/16 v19, 0x0

    .line 406
    .line 407
    const-string v21, ""

    .line 408
    .line 409
    const-string v22, ""

    .line 410
    .line 411
    const-string v23, ""

    .line 412
    .line 413
    const/16 v24, 0x0

    .line 414
    .line 415
    const/16 v25, 0x0

    .line 416
    .line 417
    const/16 v26, 0x0

    .line 418
    .line 419
    const/16 v27, 0x0

    .line 420
    .line 421
    const/16 v28, 0x0

    .line 422
    .line 423
    const/16 v29, 0x0

    .line 424
    .line 425
    const/16 v30, 0x0

    .line 426
    .line 427
    const/16 v31, 0x0

    .line 428
    .line 429
    invoke-direct/range {v12 .. v34}, La/mlr;-><init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;ZI)V

    .line 430
    .line 431
    .line 432
    const/16 v22, 0x0

    .line 433
    .line 434
    const v23, 0x3fffe

    .line 435
    .line 436
    .line 437
    iget-wide v13, v6, La/o550;->l:J

    .line 438
    .line 439
    const/16 v19, 0x0

    .line 440
    .line 441
    const/16 v20, 0x0

    .line 442
    .line 443
    const/16 v21, 0x0

    .line 444
    .line 445
    invoke-static/range {v12 .. v23}, La/mlr;->a(La/mlr;JJJLjava/lang/String;ZZZI)La/mlr;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    const-string v2, "deeplink"

    .line 450
    .line 451
    invoke-static {v3, v4, v2}, La/hne;->r(JLjava/lang/String;)Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-virtual {v10, v11, v2, v11}, La/d650;->Z(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    iput-boolean v9, v6, La/o550;->j:Z

    .line 460
    .line 461
    const/4 v3, 0x0

    .line 462
    const/4 v4, 0x0

    .line 463
    const/4 v5, 0x0

    .line 464
    const/16 v7, 0x72

    .line 465
    .line 466
    invoke-static/range {v0 .. v7}, La/pw70;->b(La/pw70;La/mlr;Ljava/lang/String;IZZLa/yje;I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    if-ne v0, v8, :cond_12

    .line 471
    .line 472
    move-object v11, v8

    .line 473
    goto :goto_9

    .line 474
    :cond_12
    :goto_8
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    :goto_9
    return-object v11

    .line 477
    :pswitch_2
    iget-object v0, v10, La/d650;->g1:La/p7m0;

    .line 478
    .line 479
    sget-object v1, La/wne;->a:La/wne;

    .line 480
    .line 481
    iget-boolean v2, v6, La/o550;->j:Z

    .line 482
    .line 483
    if-eqz v2, :cond_14

    .line 484
    .line 485
    if-ne v2, v9, :cond_13

    .line 486
    .line 487
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    move-object/from16 v2, p1

    .line 491
    .line 492
    goto :goto_a

    .line 493
    :cond_13
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_d

    .line 497
    .line 498
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    iget-object v12, v10, La/d650;->i0:La/cu;

    .line 502
    .line 503
    sget-object v15, La/iun;->a:La/iun;

    .line 504
    .line 505
    const/16 v17, 0x8

    .line 506
    .line 507
    iget-wide v13, v6, La/o550;->l:J

    .line 508
    .line 509
    move-object/from16 v16, v15

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v17}, La/cu;->i(JLjava/util/List;La/iun;I)La/a1g;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    iput-boolean v9, v6, La/o550;->j:Z

    .line 516
    .line 517
    invoke-static {v2, v6}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    if-ne v2, v1, :cond_15

    .line 522
    .line 523
    move-object v11, v1

    .line 524
    goto :goto_d

    .line 525
    :cond_15
    :goto_a
    check-cast v2, Ljava/util/List;

    .line 526
    .line 527
    if-nez v2, :cond_16

    .line 528
    .line 529
    sget-object v2, La/iun;->a:La/iun;

    .line 530
    .line 531
    :cond_16
    const/16 v1, 0x8

    .line 532
    .line 533
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    :cond_17
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    move-object v3, v2

    .line 542
    check-cast v3, Ljava/util/List;

    .line 543
    .line 544
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    check-cast v3, Ljava/lang/Iterable;

    .line 549
    .line 550
    new-instance v4, Ljava/util/ArrayList;

    .line 551
    .line 552
    const/16 v5, 0xa

    .line 553
    .line 554
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 555
    .line 556
    .line 557
    move-result v5

    .line 558
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 559
    .line 560
    .line 561
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v5

    .line 569
    if-eqz v5, :cond_1a

    .line 570
    .line 571
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    check-cast v5, La/ef40;

    .line 576
    .line 577
    instance-of v6, v5, La/qe40;

    .line 578
    .line 579
    if-eqz v6, :cond_19

    .line 580
    .line 581
    move-object v6, v5

    .line 582
    check-cast v6, La/qe40;

    .line 583
    .line 584
    iget-object v6, v6, La/qe40;->a:La/x4t;

    .line 585
    .line 586
    instance-of v9, v6, La/r4t;

    .line 587
    .line 588
    if-eqz v9, :cond_19

    .line 589
    .line 590
    move-object v9, v6

    .line 591
    check-cast v9, La/r4t;

    .line 592
    .line 593
    iget-wide v9, v9, La/r4t;->a:J

    .line 594
    .line 595
    cmp-long v9, v9, v7

    .line 596
    .line 597
    if-nez v9, :cond_19

    .line 598
    .line 599
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 600
    .line 601
    .line 602
    move-result v5

    .line 603
    if-nez v5, :cond_18

    .line 604
    .line 605
    new-instance v5, La/qbj;

    .line 606
    .line 607
    const/4 v9, 0x0

    .line 608
    invoke-direct {v5, v1, v9}, La/qbj;-><init>(Ljava/lang/Object;Z)V

    .line 609
    .line 610
    .line 611
    goto :goto_c

    .line 612
    :cond_18
    sget-object v5, La/nbj;->a:La/nbj;

    .line 613
    .line 614
    :goto_c
    new-instance v9, La/qe40;

    .line 615
    .line 616
    invoke-direct {v9, v6, v5}, La/qe40;-><init>(La/x4t;La/vbj;)V

    .line 617
    .line 618
    .line 619
    move-object v5, v9

    .line 620
    :cond_19
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    goto :goto_b

    .line 624
    :cond_1a
    invoke-virtual {v0, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result v2

    .line 628
    if-eqz v2, :cond_17

    .line 629
    .line 630
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    :goto_d
    return-object v11

    .line 633
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
