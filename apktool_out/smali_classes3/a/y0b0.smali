.class public final La/y0b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:J

.field public k:J

.field public l:Ljava/lang/Object;

.field public m:B

.field public final synthetic n:La/f1b0;


# direct methods
.method public constructor <init>(JLa/f1b0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/y0b0;->i:B

    .line 3
    .line 4
    iput-wide p1, p0, La/y0b0;->k:J

    .line 5
    .line 6
    iput-object p3, p0, La/y0b0;->n:La/f1b0;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(La/f1b0;La/yje;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/y0b0;->i:B

    iput-object p1, p0, La/y0b0;->n:La/f1b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 4

    .line 1
    iget-byte v0, p0, La/y0b0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/y0b0;->n:La/f1b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/y0b0;

    .line 9
    .line 10
    iget-wide v2, p0, La/y0b0;->k:J

    .line 11
    .line 12
    invoke-direct {v0, v2, v3, v1, p2}, La/y0b0;-><init>(JLa/f1b0;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/y0b0;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance p0, La/y0b0;

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    invoke-direct {p0, v1, p2, p1}, La/y0b0;-><init>(La/f1b0;La/yje;B)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_1
    new-instance p0, La/y0b0;

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    invoke-direct {p0, v1, p2, p1}, La/y0b0;-><init>(La/f1b0;La/yje;B)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_2
    new-instance p0, La/y0b0;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-direct {p0, v1, p2, p1}, La/y0b0;-><init>(La/f1b0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
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
    iget-byte v0, p0, La/y0b0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/y0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/y0b0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/y0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/y0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/y0b0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/y0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/y0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/y0b0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/y0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/y0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/y0b0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/y0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/y0b0;->i:B

    .line 4
    .line 5
    iget-object v2, v1, La/y0b0;->n:La/f1b0;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x0

    .line 9
    const-wide/16 v5, 0x3e8

    .line 10
    .line 11
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x2

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/vne;

    .line 22
    .line 23
    sget-object v2, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-byte v3, v1, La/y0b0;->m:B

    .line 26
    .line 27
    iget-object v13, v1, La/y0b0;->n:La/f1b0;

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    if-eq v3, v8, :cond_1

    .line 32
    .line 33
    if-ne v3, v10, :cond_0

    .line 34
    .line 35
    iget-wide v3, v1, La/y0b0;->j:J

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-wide v3, v1, La/y0b0;->k:J

    .line 53
    .line 54
    iput-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 55
    .line 56
    iput-byte v8, v1, La/y0b0;->m:B

    .line 57
    .line 58
    invoke-static {v3, v4, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-ne v3, v2, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    :goto_0
    invoke-virtual {v13}, La/i3t0;->D()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, La/d0b0;

    .line 70
    .line 71
    iget-object v3, v3, La/d0b0;->f:La/c0b0;

    .line 72
    .line 73
    iget v3, v3, La/c0b0;->k:I

    .line 74
    .line 75
    int-to-long v3, v3

    .line 76
    mul-long/2addr v3, v5

    .line 77
    :goto_1
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_5

    .line 82
    .line 83
    iget-object v5, v13, La/f1b0;->x:La/mne;

    .line 84
    .line 85
    iget-object v5, v5, La/mne;->b:La/dvj;

    .line 86
    .line 87
    new-instance v15, La/wma0;

    .line 88
    .line 89
    const/16 v17, 0x0

    .line 90
    .line 91
    const/16 v18, 0x11

    .line 92
    .line 93
    const/4 v12, 0x1

    .line 94
    const-class v14, La/f1b0;

    .line 95
    .line 96
    move-object v11, v15

    .line 97
    const-string v15, "handleBasicThrowable"

    .line 98
    .line 99
    const-string v16, "handleBasicThrowable(Ljava/lang/Throwable;)V"

    .line 100
    .line 101
    invoke-direct/range {v11 .. v18}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 102
    .line 103
    .line 104
    new-instance v6, La/r0b0;

    .line 105
    .line 106
    invoke-direct {v6, v13, v9, v10}, La/r0b0;-><init>(La/f1b0;La/yje;B)V

    .line 107
    .line 108
    .line 109
    const/16 v19, 0xa

    .line 110
    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    move-object v14, v0

    .line 114
    move-object/from16 v17, v5

    .line 115
    .line 116
    move-object/from16 v18, v6

    .line 117
    .line 118
    move-object v15, v11

    .line 119
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iput-object v0, v13, La/f1b0;->r0:La/bby;

    .line 124
    .line 125
    iput-object v14, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 126
    .line 127
    iput-wide v3, v1, La/y0b0;->j:J

    .line 128
    .line 129
    iput-byte v10, v1, La/y0b0;->m:B

    .line 130
    .line 131
    invoke-static {v3, v4, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-ne v0, v2, :cond_4

    .line 136
    .line 137
    :goto_2
    move-object v9, v2

    .line 138
    goto :goto_3

    .line 139
    :cond_4
    move-object v0, v14

    .line 140
    goto :goto_1

    .line 141
    :cond_5
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    :goto_3
    return-object v9

    .line 144
    :pswitch_0
    sget-object v11, La/wne;->a:La/wne;

    .line 145
    .line 146
    iget-byte v0, v1, La/y0b0;->m:B

    .line 147
    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    if-eq v0, v8, :cond_8

    .line 151
    .line 152
    if-eq v0, v10, :cond_7

    .line 153
    .line 154
    if-eq v0, v3, :cond_6

    .line 155
    .line 156
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_8

    .line 160
    .line 161
    :cond_6
    iget-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Ljava/lang/Throwable;

    .line 164
    .line 165
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_9

    .line 169
    .line 170
    :cond_7
    iget-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/uhc0;

    .line 173
    .line 174
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_8
    iget-wide v5, v1, La/y0b0;->k:J

    .line 179
    .line 180
    iget-wide v7, v1, La/y0b0;->j:J

    .line 181
    .line 182
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    .line 185
    move-object/from16 v0, p1

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :catchall_0
    move-exception v0

    .line 189
    goto/16 :goto_6

    .line 190
    .line 191
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    sget v0, La/f1b0;->w0:I

    .line 195
    .line 196
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 197
    .line 198
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 199
    .line 200
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-object v9, v7

    .line 208
    check-cast v9, La/d0b0;

    .line 209
    .line 210
    iget-object v12, v9, La/d0b0;->d:La/b0b0;

    .line 211
    .line 212
    iget-object v12, v12, La/b0b0;->c:La/uhc0;

    .line 213
    .line 214
    invoke-static {v9, v8, v4, v12}, La/h8x;->D(La/d0b0;ZZLa/uhc0;)La/d0b0;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-virtual {v0, v7, v9}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-eqz v7, :cond_a

    .line 223
    .line 224
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 225
    .line 226
    .line 227
    move-result-wide v12

    .line 228
    :try_start_1
    iget-object v0, v2, La/f1b0;->I:La/lbu;

    .line 229
    .line 230
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    check-cast v7, La/d0b0;

    .line 235
    .line 236
    iget-object v7, v7, La/d0b0;->f:La/c0b0;

    .line 237
    .line 238
    iget-boolean v7, v7, La/c0b0;->f:Z

    .line 239
    .line 240
    iput-wide v5, v1, La/y0b0;->j:J

    .line 241
    .line 242
    iput-wide v12, v1, La/y0b0;->k:J

    .line 243
    .line 244
    iput-byte v8, v1, La/y0b0;->m:B

    .line 245
    .line 246
    invoke-virtual {v0, v7, v1}, La/lbu;->g(ZLa/zje;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 250
    if-ne v0, v11, :cond_b

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_b
    move-wide v7, v5

    .line 254
    move-wide v5, v12

    .line 255
    :goto_4
    :try_start_2
    check-cast v0, La/uhc0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 256
    .line 257
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 258
    .line 259
    .line 260
    move-result-wide v12

    .line 261
    sub-long/2addr v12, v5

    .line 262
    cmp-long v3, v12, v7

    .line 263
    .line 264
    if-gez v3, :cond_c

    .line 265
    .line 266
    sub-long v12, v7, v12

    .line 267
    .line 268
    iput-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 269
    .line 270
    iput-wide v7, v1, La/y0b0;->j:J

    .line 271
    .line 272
    iput-wide v5, v1, La/y0b0;->k:J

    .line 273
    .line 274
    iput-byte v10, v1, La/y0b0;->m:B

    .line 275
    .line 276
    invoke-static {v12, v13, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-ne v1, v11, :cond_c

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_c
    :goto_5
    sget v1, La/f1b0;->w0:I

    .line 284
    .line 285
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 286
    .line 287
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 288
    .line 289
    :cond_d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-object v3, v1

    .line 297
    check-cast v3, La/d0b0;

    .line 298
    .line 299
    invoke-static {v3, v4, v4, v0}, La/h8x;->D(La/d0b0;ZZLa/uhc0;)La/d0b0;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_d

    .line 308
    .line 309
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :catchall_1
    move-exception v0

    .line 313
    move-wide v7, v5

    .line 314
    move-wide v5, v12

    .line 315
    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 316
    .line 317
    .line 318
    move-result-wide v9

    .line 319
    sub-long/2addr v9, v5

    .line 320
    cmp-long v2, v9, v7

    .line 321
    .line 322
    if-gez v2, :cond_e

    .line 323
    .line 324
    sub-long v9, v7, v9

    .line 325
    .line 326
    iput-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 327
    .line 328
    iput-wide v7, v1, La/y0b0;->j:J

    .line 329
    .line 330
    iput-wide v5, v1, La/y0b0;->k:J

    .line 331
    .line 332
    iput-byte v3, v1, La/y0b0;->m:B

    .line 333
    .line 334
    invoke-static {v9, v10, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    if-ne v1, v11, :cond_e

    .line 339
    .line 340
    :goto_7
    move-object v9, v11

    .line 341
    :goto_8
    return-object v9

    .line 342
    :cond_e
    :goto_9
    throw v0

    .line 343
    :pswitch_1
    sget-object v11, La/wne;->a:La/wne;

    .line 344
    .line 345
    iget-byte v0, v1, La/y0b0;->m:B

    .line 346
    .line 347
    if-eqz v0, :cond_12

    .line 348
    .line 349
    if-eq v0, v8, :cond_11

    .line 350
    .line 351
    if-eq v0, v10, :cond_10

    .line 352
    .line 353
    if-eq v0, v3, :cond_f

    .line 354
    .line 355
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    goto/16 :goto_e

    .line 359
    .line 360
    :cond_f
    iget-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Ljava/lang/Throwable;

    .line 363
    .line 364
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_f

    .line 368
    .line 369
    :cond_10
    iget-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, Ljava/util/List;

    .line 372
    .line 373
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto :goto_b

    .line 377
    :cond_11
    iget-wide v5, v1, La/y0b0;->k:J

    .line 378
    .line 379
    iget-wide v7, v1, La/y0b0;->j:J

    .line 380
    .line 381
    :try_start_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 382
    .line 383
    .line 384
    move-object/from16 v0, p1

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :catchall_2
    move-exception v0

    .line 388
    goto/16 :goto_c

    .line 389
    .line 390
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    sget v0, La/f1b0;->w0:I

    .line 394
    .line 395
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 396
    .line 397
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 398
    .line 399
    :cond_13
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    move-object v9, v7

    .line 407
    check-cast v9, La/d0b0;

    .line 408
    .line 409
    invoke-static {v9, v8, v4}, La/h8x;->C(La/d0b0;ZZ)La/d0b0;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    invoke-virtual {v0, v7, v9}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    if-eqz v7, :cond_13

    .line 418
    .line 419
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 420
    .line 421
    .line 422
    move-result-wide v12

    .line 423
    :try_start_4
    iget-object v0, v2, La/f1b0;->f0:La/es;

    .line 424
    .line 425
    iput-wide v5, v1, La/y0b0;->j:J

    .line 426
    .line 427
    iput-wide v12, v1, La/y0b0;->k:J

    .line 428
    .line 429
    iput-byte v8, v1, La/y0b0;->m:B

    .line 430
    .line 431
    const/16 v7, 0x8

    .line 432
    .line 433
    invoke-virtual {v0, v7, v1}, La/es;->m(ILa/zje;)Ljava/io/Serializable;

    .line 434
    .line 435
    .line 436
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 437
    if-ne v0, v11, :cond_14

    .line 438
    .line 439
    goto :goto_d

    .line 440
    :cond_14
    move-wide v7, v5

    .line 441
    move-wide v5, v12

    .line 442
    :goto_a
    :try_start_5
    check-cast v0, Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 443
    .line 444
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 445
    .line 446
    .line 447
    move-result-wide v12

    .line 448
    sub-long/2addr v12, v5

    .line 449
    cmp-long v3, v12, v7

    .line 450
    .line 451
    if-gez v3, :cond_15

    .line 452
    .line 453
    sub-long v12, v7, v12

    .line 454
    .line 455
    iput-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 456
    .line 457
    iput-wide v7, v1, La/y0b0;->j:J

    .line 458
    .line 459
    iput-wide v5, v1, La/y0b0;->k:J

    .line 460
    .line 461
    iput-byte v10, v1, La/y0b0;->m:B

    .line 462
    .line 463
    invoke-static {v12, v13, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    if-ne v1, v11, :cond_15

    .line 468
    .line 469
    goto :goto_d

    .line 470
    :cond_15
    :goto_b
    sget v1, La/f1b0;->w0:I

    .line 471
    .line 472
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 473
    .line 474
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 475
    .line 476
    :cond_16
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    move-object v3, v1

    .line 484
    check-cast v3, La/d0b0;

    .line 485
    .line 486
    invoke-static {v3, v4, v4, v0}, La/h8x;->B(La/d0b0;ZZLjava/util/List;)La/d0b0;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-eqz v1, :cond_16

    .line 495
    .line 496
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    goto :goto_e

    .line 499
    :catchall_3
    move-exception v0

    .line 500
    move-wide v7, v5

    .line 501
    move-wide v5, v12

    .line 502
    :goto_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 503
    .line 504
    .line 505
    move-result-wide v9

    .line 506
    sub-long/2addr v9, v5

    .line 507
    cmp-long v2, v9, v7

    .line 508
    .line 509
    if-gez v2, :cond_17

    .line 510
    .line 511
    sub-long v9, v7, v9

    .line 512
    .line 513
    iput-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 514
    .line 515
    iput-wide v7, v1, La/y0b0;->j:J

    .line 516
    .line 517
    iput-wide v5, v1, La/y0b0;->k:J

    .line 518
    .line 519
    iput-byte v3, v1, La/y0b0;->m:B

    .line 520
    .line 521
    invoke-static {v9, v10, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    if-ne v1, v11, :cond_17

    .line 526
    .line 527
    :goto_d
    move-object v9, v11

    .line 528
    :goto_e
    return-object v9

    .line 529
    :cond_17
    :goto_f
    throw v0

    .line 530
    :pswitch_2
    sget-object v11, La/wne;->a:La/wne;

    .line 531
    .line 532
    iget-byte v0, v1, La/y0b0;->m:B

    .line 533
    .line 534
    if-eqz v0, :cond_1b

    .line 535
    .line 536
    if-eq v0, v8, :cond_1a

    .line 537
    .line 538
    if-eq v0, v10, :cond_19

    .line 539
    .line 540
    if-eq v0, v3, :cond_18

    .line 541
    .line 542
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_14

    .line 546
    .line 547
    :cond_18
    iget-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v0, Ljava/lang/Throwable;

    .line 550
    .line 551
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_15

    .line 555
    .line 556
    :cond_19
    iget-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v0, Ljava/util/List;

    .line 559
    .line 560
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    goto :goto_11

    .line 564
    :cond_1a
    iget-wide v5, v1, La/y0b0;->k:J

    .line 565
    .line 566
    iget-wide v7, v1, La/y0b0;->j:J

    .line 567
    .line 568
    :try_start_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 569
    .line 570
    .line 571
    move-object/from16 v0, p1

    .line 572
    .line 573
    goto :goto_10

    .line 574
    :catchall_4
    move-exception v0

    .line 575
    goto/16 :goto_12

    .line 576
    .line 577
    :cond_1b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    sget v0, La/f1b0;->w0:I

    .line 581
    .line 582
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 583
    .line 584
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 585
    .line 586
    :cond_1c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    move-object v9, v7

    .line 594
    check-cast v9, La/d0b0;

    .line 595
    .line 596
    iget-object v12, v9, La/d0b0;->c:La/yza0;

    .line 597
    .line 598
    iget-object v12, v12, La/yza0;->c:Ljava/util/List;

    .line 599
    .line 600
    invoke-static {v9, v8, v4, v12}, La/h8x;->A(La/d0b0;ZZLjava/util/List;)La/d0b0;

    .line 601
    .line 602
    .line 603
    move-result-object v9

    .line 604
    invoke-virtual {v0, v7, v9}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v7

    .line 608
    if-eqz v7, :cond_1c

    .line 609
    .line 610
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 611
    .line 612
    .line 613
    move-result-wide v12

    .line 614
    :try_start_7
    iget-object v0, v2, La/f1b0;->R:La/abu;

    .line 615
    .line 616
    sget-object v7, La/z7b;->d:La/z7b;

    .line 617
    .line 618
    filled-new-array {v7}, [La/z7b;

    .line 619
    .line 620
    .line 621
    move-result-object v7

    .line 622
    iput-wide v5, v1, La/y0b0;->j:J

    .line 623
    .line 624
    iput-wide v12, v1, La/y0b0;->k:J

    .line 625
    .line 626
    iput-byte v8, v1, La/y0b0;->m:B

    .line 627
    .line 628
    invoke-virtual {v0, v7, v1}, La/abu;->s([La/z7b;La/zje;)Ljava/io/Serializable;

    .line 629
    .line 630
    .line 631
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 632
    if-ne v0, v11, :cond_1d

    .line 633
    .line 634
    goto :goto_13

    .line 635
    :cond_1d
    move-wide v7, v5

    .line 636
    move-wide v5, v12

    .line 637
    :goto_10
    :try_start_8
    check-cast v0, Ljava/util/List;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 638
    .line 639
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 640
    .line 641
    .line 642
    move-result-wide v12

    .line 643
    sub-long/2addr v12, v5

    .line 644
    cmp-long v3, v12, v7

    .line 645
    .line 646
    if-gez v3, :cond_1e

    .line 647
    .line 648
    sub-long v12, v7, v12

    .line 649
    .line 650
    iput-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 651
    .line 652
    iput-wide v7, v1, La/y0b0;->j:J

    .line 653
    .line 654
    iput-wide v5, v1, La/y0b0;->k:J

    .line 655
    .line 656
    iput-byte v10, v1, La/y0b0;->m:B

    .line 657
    .line 658
    invoke-static {v12, v13, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    if-ne v1, v11, :cond_1e

    .line 663
    .line 664
    goto :goto_13

    .line 665
    :cond_1e
    :goto_11
    sget v1, La/f1b0;->w0:I

    .line 666
    .line 667
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 668
    .line 669
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 670
    .line 671
    :cond_1f
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    move-object v3, v1

    .line 679
    check-cast v3, La/d0b0;

    .line 680
    .line 681
    invoke-static {v3, v4, v4, v0}, La/h8x;->A(La/d0b0;ZZLjava/util/List;)La/d0b0;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    if-eqz v1, :cond_1f

    .line 690
    .line 691
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 692
    .line 693
    goto :goto_14

    .line 694
    :catchall_5
    move-exception v0

    .line 695
    move-wide v7, v5

    .line 696
    move-wide v5, v12

    .line 697
    :goto_12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 698
    .line 699
    .line 700
    move-result-wide v9

    .line 701
    sub-long/2addr v9, v5

    .line 702
    cmp-long v2, v9, v7

    .line 703
    .line 704
    if-gez v2, :cond_20

    .line 705
    .line 706
    sub-long v9, v7, v9

    .line 707
    .line 708
    iput-object v0, v1, La/y0b0;->l:Ljava/lang/Object;

    .line 709
    .line 710
    iput-wide v7, v1, La/y0b0;->j:J

    .line 711
    .line 712
    iput-wide v5, v1, La/y0b0;->k:J

    .line 713
    .line 714
    iput-byte v3, v1, La/y0b0;->m:B

    .line 715
    .line 716
    invoke-static {v9, v10, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    if-ne v1, v11, :cond_20

    .line 721
    .line 722
    :goto_13
    move-object v9, v11

    .line 723
    :goto_14
    return-object v9

    .line 724
    :cond_20
    :goto_15
    throw v0

    .line 725
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
