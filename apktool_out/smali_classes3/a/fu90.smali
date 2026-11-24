.class public final La/fu90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/gu90;

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(La/gu90;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/fu90;->i:B

    iput-object p1, p0, La/fu90;->l:La/gu90;

    iput-wide p2, p0, La/fu90;->m:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/fu90;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/fu90;

    .line 7
    .line 8
    iget-wide v3, p0, La/fu90;->m:J

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v2, p0, La/fu90;->l:La/gu90;

    .line 12
    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, La/fu90;-><init>(La/gu90;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v1, La/fu90;->k:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    move-object v5, p2

    .line 21
    new-instance v2, La/fu90;

    .line 22
    .line 23
    move-object v6, v5

    .line 24
    iget-wide v4, p0, La/fu90;->m:J

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    iget-object v3, p0, La/fu90;->l:La/gu90;

    .line 28
    .line 29
    invoke-direct/range {v2 .. v7}, La/fu90;-><init>(La/gu90;JLa/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v2, La/fu90;->k:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v2

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fu90;->i:B

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
    invoke-virtual {p0, p1, p2}, La/fu90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fu90;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fu90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fu90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fu90;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fu90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fu90;->i:B

    .line 4
    .line 5
    const-string v2, "LAST_TIME_PING_KEY"

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, La/fu90;->l:La/gu90;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La/fu90;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v7, v1

    .line 19
    check-cast v7, La/vne;

    .line 20
    .line 21
    sget-object v1, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v8, v0, La/fu90;->j:Z

    .line 24
    .line 25
    iget-wide v11, v0, La/fu90;->m:J

    .line 26
    .line 27
    if-eqz v8, :cond_1

    .line 28
    .line 29
    if-ne v8, v4, :cond_0

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object v3, La/wen;->b:La/uen;

    .line 45
    .line 46
    iget-object v3, v5, La/gu90;->b:La/b8u;

    .line 47
    .line 48
    iget-object v3, v3, La/b8u;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, La/ali;

    .line 51
    .line 52
    iget-object v3, v3, La/ali;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, La/ulk;

    .line 55
    .line 56
    iget-object v3, v3, La/ulk;->a:La/vwb0;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const-wide/16 v8, 0x0

    .line 66
    .line 67
    invoke-interface {v3, v2, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    sget-object v6, La/bfn;->d:La/bfn;

    .line 72
    .line 73
    invoke-static {v2, v3, v6}, La/ibc;->w0(JLa/bfn;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v13

    .line 81
    invoke-static {v13, v14, v6}, La/ibc;->w0(JLa/bfn;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v13

    .line 85
    invoke-static {v13, v14, v11, v12}, La/wen;->k(JJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide v13

    .line 89
    invoke-static {v13, v14, v2, v3}, La/wen;->j(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    new-instance v6, La/wen;

    .line 94
    .line 95
    invoke-direct {v6, v2, v3}, La/wen;-><init>(J)V

    .line 96
    .line 97
    .line 98
    sget-object v2, La/wen;->b:La/uen;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v2, La/wen;

    .line 104
    .line 105
    invoke-direct {v2, v8, v9}, La/wen;-><init>(J)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v2}, La/wen;->compareTo(Ljava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-gez v3, :cond_2

    .line 113
    .line 114
    move-object v6, v2

    .line 115
    :cond_2
    iget-wide v2, v6, La/wen;->a:J

    .line 116
    .line 117
    sget-wide v13, La/gu90;->h:J

    .line 118
    .line 119
    invoke-static {v13, v14, v2, v3}, La/wen;->j(JJ)J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    new-instance v6, La/wen;

    .line 124
    .line 125
    invoke-direct {v6, v2, v3}, La/wen;-><init>(J)V

    .line 126
    .line 127
    .line 128
    new-instance v2, La/wen;

    .line 129
    .line 130
    invoke-direct {v2, v8, v9}, La/wen;-><init>(J)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v2}, La/wen;->compareTo(Ljava/lang/Object;)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-gez v3, :cond_3

    .line 138
    .line 139
    move-object v6, v2

    .line 140
    :cond_3
    iput-object v7, v0, La/fu90;->k:Ljava/lang/Object;

    .line 141
    .line 142
    iput-boolean v4, v0, La/fu90;->j:Z

    .line 143
    .line 144
    iget-wide v2, v6, La/wen;->a:J

    .line 145
    .line 146
    invoke-static {v2, v3, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    if-ne v2, v1, :cond_4

    .line 151
    .line 152
    move-object v6, v1

    .line 153
    goto :goto_1

    .line 154
    :cond_4
    :goto_0
    iget-object v1, v5, La/gu90;->e:La/mne;

    .line 155
    .line 156
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 157
    .line 158
    sget-wide v2, La/gu90;->h:J

    .line 159
    .line 160
    sget-object v4, La/wen;->b:La/uen;

    .line 161
    .line 162
    sget-object v4, La/bfn;->e:La/bfn;

    .line 163
    .line 164
    invoke-static {v2, v3, v4}, La/wen;->l(JLa/bfn;)J

    .line 165
    .line 166
    .line 167
    move-result-wide v5

    .line 168
    invoke-static {v2, v3, v4}, La/wen;->l(JLa/bfn;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    const-class v4, La/oqt0;

    .line 173
    .line 174
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v16

    .line 178
    new-instance v17, La/yi90;

    .line 179
    .line 180
    const/16 v23, 0x0

    .line 181
    .line 182
    const/16 v24, 0x8

    .line 183
    .line 184
    const/16 v18, 0x1

    .line 185
    .line 186
    iget-object v10, v0, La/fu90;->l:La/gu90;

    .line 187
    .line 188
    const-class v20, La/gu90;

    .line 189
    .line 190
    const-string v21, "handleError"

    .line 191
    .line 192
    const-string v22, "handleError(Ljava/lang/Throwable;)V"

    .line 193
    .line 194
    move-object/from16 v19, v10

    .line 195
    .line 196
    invoke-direct/range {v17 .. v24}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 197
    .line 198
    .line 199
    new-instance v18, La/fu90;

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const/4 v14, 0x0

    .line 203
    move-object/from16 v9, v18

    .line 204
    .line 205
    invoke-direct/range {v9 .. v14}, La/fu90;-><init>(La/gu90;JLa/yje;B)V

    .line 206
    .line 207
    .line 208
    const/16 v19, 0x14

    .line 209
    .line 210
    const-string v8, "PingExecutorImpl_sendPing"

    .line 211
    .line 212
    const-wide/16 v11, 0x0

    .line 213
    .line 214
    move-object v13, v1

    .line 215
    move-wide v14, v2

    .line 216
    move-wide v9, v5

    .line 217
    invoke-static/range {v7 .. v19}, La/sac;->d0(La/vne;Ljava/lang/String;JJLkotlin/coroutines/CoroutineContext;JLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 218
    .line 219
    .line 220
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    :goto_1
    return-object v6

    .line 223
    :pswitch_0
    iget-object v1, v0, La/fu90;->k:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, La/vne;

    .line 226
    .line 227
    sget-object v7, La/wne;->a:La/wne;

    .line 228
    .line 229
    iget-boolean v8, v0, La/fu90;->j:Z

    .line 230
    .line 231
    if-eqz v8, :cond_6

    .line 232
    .line 233
    if-ne v8, v4, :cond_5

    .line 234
    .line 235
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iget-object v3, v5, La/gu90;->d:La/iqt;

    .line 247
    .line 248
    iget-object v3, v3, La/iqt;->a:La/gst0;

    .line 249
    .line 250
    invoke-virtual {v3}, La/gst0;->a()Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-nez v3, :cond_7

    .line 255
    .line 256
    invoke-static {v1, v6}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 257
    .line 258
    .line 259
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_7
    iget-object v1, v5, La/gu90;->a:La/iw20;

    .line 263
    .line 264
    iput-object v6, v0, La/fu90;->k:Ljava/lang/Object;

    .line 265
    .line 266
    iput-boolean v4, v0, La/fu90;->j:Z

    .line 267
    .line 268
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v1, La/ali;

    .line 271
    .line 272
    iget-object v3, v1, La/ali;->b:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v3, La/mne;

    .line 275
    .line 276
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 277
    .line 278
    new-instance v4, La/hij;

    .line 279
    .line 280
    const/16 v8, 0x18

    .line 281
    .line 282
    invoke-direct {v4, v1, v6, v8}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 283
    .line 284
    .line 285
    invoke-static {v3, v4, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    if-ne v1, v7, :cond_8

    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    :goto_2
    if-ne v1, v7, :cond_9

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_9
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    :goto_3
    if-ne v1, v7, :cond_a

    .line 300
    .line 301
    move-object v6, v7

    .line 302
    goto :goto_5

    .line 303
    :cond_a
    :goto_4
    sget-object v1, La/wen;->b:La/uen;

    .line 304
    .line 305
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 306
    .line 307
    .line 308
    move-result-wide v3

    .line 309
    sget-object v1, La/bfn;->d:La/bfn;

    .line 310
    .line 311
    invoke-static {v3, v4, v1}, La/ibc;->w0(JLa/bfn;)J

    .line 312
    .line 313
    .line 314
    move-result-wide v3

    .line 315
    iget-wide v0, v0, La/fu90;->m:J

    .line 316
    .line 317
    invoke-static {v3, v4, v0, v1}, La/wen;->k(JJ)J

    .line 318
    .line 319
    .line 320
    move-result-wide v0

    .line 321
    iget-object v3, v5, La/gu90;->c:La/ugf0;

    .line 322
    .line 323
    invoke-static {v0, v1}, La/wen;->e(J)J

    .line 324
    .line 325
    .line 326
    move-result-wide v0

    .line 327
    iget-object v3, v3, La/ugf0;->a:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v3, La/ali;

    .line 330
    .line 331
    iget-object v3, v3, La/ali;->c:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v3, La/ulk;

    .line 334
    .line 335
    iget-object v3, v3, La/ulk;->a:La/vwb0;

    .line 336
    .line 337
    invoke-virtual {v3, v2, v0, v1}, La/vwb0;->g(Ljava/lang/String;J)V

    .line 338
    .line 339
    .line 340
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    :goto_5
    return-object v6

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
