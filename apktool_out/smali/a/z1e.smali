.class public final La/z1e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s1e;


# instance fields
.field public final a:La/gva0;

.field public final b:La/gva0;

.field public final c:La/usd;

.field public final d:Ljava/lang/ThreadLocal;

.field public volatile e:Z

.field public final f:J


# direct methods
.method public constructor <init>(La/xg0;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, La/usd;

    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object v0, p0, La/z1e;->c:La/usd;

    .line 59
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, La/z1e;->d:Ljava/lang/ThreadLocal;

    .line 60
    sget-object v0, La/wen;->b:La/uen;

    const/16 v0, 0x1e

    sget-object v1, La/bfn;->e:La/bfn;

    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    move-result-wide v0

    iput-wide v0, p0, La/z1e;->f:J

    .line 61
    new-instance v0, La/gva0;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, La/gva0;-><init>(ILkotlin/jvm/functions/Function1;)V

    .line 62
    iput-object v0, p0, La/z1e;->a:La/gva0;

    .line 63
    iput-object v0, p0, La/z1e;->b:La/gva0;

    return-void
.end method

.method public constructor <init>(La/xg0;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p2, La/usd;

    .line 5
    .line 6
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, La/z1e;->c:La/usd;

    .line 10
    .line 11
    new-instance p2, Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/lang/ThreadLocal;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, La/z1e;->d:Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    sget-object p2, La/wen;->b:La/uen;

    .line 19
    .line 20
    const/16 p2, 0x1e

    .line 21
    .line 22
    sget-object v0, La/bfn;->e:La/bfn;

    .line 23
    .line 24
    invoke-static {p2, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iput-wide v0, p0, La/z1e;->f:J

    .line 29
    .line 30
    new-instance p2, La/gva0;

    .line 31
    .line 32
    new-instance v0, La/hr;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/16 v2, 0x9

    .line 36
    .line 37
    invoke-direct {v0, p1, v1, v2}, La/hr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    invoke-direct {p2, v1, v0}, La/gva0;-><init>(ILkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, La/z1e;->a:La/gva0;

    .line 45
    .line 46
    new-instance p2, La/gva0;

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-direct {p2, v0, p1}, La/gva0;-><init>(ILkotlin/jvm/functions/Function1;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, La/z1e;->b:La/gva0;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/z1e;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La/z1e;->e:Z

    .line 7
    .line 8
    iget-object v0, p0, La/z1e;->a:La/gva0;

    .line 9
    .line 10
    invoke-virtual {v0}, La/gva0;->c()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/z1e;->b:La/gva0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/gva0;->c()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final m(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, La/w1e;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, La/w1e;

    .line 15
    .line 16
    iget v5, v4, La/w1e;->s:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/w1e;->s:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/w1e;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, La/w1e;-><init>(La/z1e;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, La/w1e;->q:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/w1e;->s:I

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    packed-switch v6, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    return-object v0

    .line 51
    :pswitch_0
    iget-object v0, v4, La/w1e;->j:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljava/lang/Throwable;

    .line 54
    .line 55
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_b

    .line 59
    .line 60
    :pswitch_1
    iget-object v0, v4, La/w1e;->j:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_2
    iget-object v1, v4, La/w1e;->l:La/mie0;

    .line 67
    .line 68
    iget-object v0, v4, La/w1e;->k:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v2, v0

    .line 71
    check-cast v2, La/mie0;

    .line 72
    .line 73
    iget-object v0, v4, La/w1e;->j:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v6, v0

    .line 76
    check-cast v6, La/gva0;

    .line 77
    .line 78
    :try_start_0
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    move-object v12, v1

    .line 82
    move-object v11, v2

    .line 83
    move-object v13, v6

    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :catchall_0
    move-exception v0

    .line 87
    move-object v12, v1

    .line 88
    move-object v11, v2

    .line 89
    move-object v13, v6

    .line 90
    goto/16 :goto_9

    .line 91
    .line 92
    :pswitch_3
    iget-boolean v1, v4, La/w1e;->i:Z

    .line 93
    .line 94
    iget-object v2, v4, La/w1e;->p:La/usd;

    .line 95
    .line 96
    iget-object v6, v4, La/w1e;->o:La/mie0;

    .line 97
    .line 98
    iget-object v8, v4, La/w1e;->n:Lkotlin/coroutines/CoroutineContext;

    .line 99
    .line 100
    iget-object v9, v4, La/w1e;->m:La/mie0;

    .line 101
    .line 102
    iget-object v11, v4, La/w1e;->l:La/mie0;

    .line 103
    .line 104
    iget-object v12, v4, La/w1e;->k:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v12, La/gva0;

    .line 107
    .line 108
    iget-object v13, v4, La/w1e;->j:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 111
    .line 112
    :try_start_1
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    .line 114
    .line 115
    move-object/from16 v16, v11

    .line 116
    .line 117
    move-object v11, v8

    .line 118
    move-object/from16 v8, v16

    .line 119
    .line 120
    goto/16 :goto_6

    .line 121
    .line 122
    :catchall_1
    move-exception v0

    .line 123
    :goto_1
    move-object v13, v12

    .line 124
    :goto_2
    move-object v12, v9

    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :pswitch_4
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object v3

    .line 131
    :pswitch_5
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-object v3

    .line 135
    :pswitch_6
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-boolean v3, v0, La/z1e;->e:Z

    .line 139
    .line 140
    if-nez v3, :cond_10

    .line 141
    .line 142
    iget-object v3, v0, La/z1e;->d:Ljava/lang/ThreadLocal;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, La/xva0;

    .line 149
    .line 150
    if-nez v3, :cond_2

    .line 151
    .line 152
    invoke-interface {v4}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    iget-object v6, v0, La/z1e;->c:La/usd;

    .line 157
    .line 158
    invoke-interface {v3, v6}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    check-cast v3, La/k1e;

    .line 163
    .line 164
    if-eqz v3, :cond_1

    .line 165
    .line 166
    iget-object v3, v3, La/k1e;->b:La/xva0;

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_1
    move-object v3, v10

    .line 170
    :cond_2
    :goto_3
    const/4 v6, 0x2

    .line 171
    if-eqz v3, :cond_8

    .line 172
    .line 173
    if-nez v1, :cond_4

    .line 174
    .line 175
    iget-boolean v1, v3, La/xva0;->c:Z

    .line 176
    .line 177
    if-nez v1, :cond_3

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_3
    const-string v0, "Cannot upgrade connection from reader to writer"

    .line 181
    .line 182
    invoke-static {v7, v0}, La/m2x;->J(ILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v10

    .line 186
    :cond_4
    :goto_4
    invoke-interface {v4}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    iget-object v8, v0, La/z1e;->c:La/usd;

    .line 191
    .line 192
    invoke-interface {v1, v8}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    if-nez v1, :cond_6

    .line 197
    .line 198
    new-instance v1, La/k1e;

    .line 199
    .line 200
    iget-object v6, v0, La/z1e;->c:La/usd;

    .line 201
    .line 202
    invoke-direct {v1, v6, v3}, La/k1e;-><init>(Lkotlin/coroutines/f;La/xva0;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, v0, La/z1e;->d:Ljava/lang/ThreadLocal;

    .line 206
    .line 207
    new-instance v6, La/fcq0;

    .line 208
    .line 209
    invoke-direct {v6, v3, v0}, La/fcq0;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v6}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-instance v1, La/jtb;

    .line 217
    .line 218
    const/16 v6, 0x10

    .line 219
    .line 220
    invoke-direct {v1, v2, v3, v10, v6}, La/jtb;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 221
    .line 222
    .line 223
    iput v7, v4, La/w1e;->s:I

    .line 224
    .line 225
    invoke-static {v0, v1, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-ne v0, v5, :cond_5

    .line 230
    .line 231
    goto/16 :goto_a

    .line 232
    .line 233
    :cond_5
    return-object v0

    .line 234
    :cond_6
    iput v6, v4, La/w1e;->s:I

    .line 235
    .line 236
    invoke-interface {v2, v3, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-ne v0, v5, :cond_7

    .line 241
    .line 242
    goto/16 :goto_a

    .line 243
    .line 244
    :cond_7
    return-object v0

    .line 245
    :cond_8
    if-eqz v1, :cond_9

    .line 246
    .line 247
    iget-object v3, v0, La/z1e;->a:La/gva0;

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_9
    iget-object v3, v0, La/z1e;->b:La/gva0;

    .line 251
    .line 252
    :goto_5
    new-instance v8, La/mie0;

    .line 253
    .line 254
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 255
    .line 256
    .line 257
    new-instance v9, La/mie0;

    .line 258
    .line 259
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 260
    .line 261
    .line 262
    :try_start_2
    invoke-interface {v4}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 263
    .line 264
    .line 265
    move-result-object v11

    .line 266
    iget-object v12, v0, La/z1e;->c:La/usd;

    .line 267
    .line 268
    iget-wide v13, v0, La/z1e;->f:J

    .line 269
    .line 270
    new-instance v15, La/lf2;

    .line 271
    .line 272
    invoke-direct {v15, v0, v1, v11, v6}, La/lf2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 273
    .line 274
    .line 275
    iput-object v2, v4, La/w1e;->j:Ljava/lang/Object;

    .line 276
    .line 277
    iput-object v3, v4, La/w1e;->k:Ljava/lang/Object;

    .line 278
    .line 279
    iput-object v8, v4, La/w1e;->l:La/mie0;

    .line 280
    .line 281
    iput-object v9, v4, La/w1e;->m:La/mie0;

    .line 282
    .line 283
    iput-object v11, v4, La/w1e;->n:Lkotlin/coroutines/CoroutineContext;

    .line 284
    .line 285
    iput-object v9, v4, La/w1e;->o:La/mie0;

    .line 286
    .line 287
    iput-object v12, v4, La/w1e;->p:La/usd;

    .line 288
    .line 289
    iput-boolean v1, v4, La/w1e;->i:Z

    .line 290
    .line 291
    const/4 v6, 0x3

    .line 292
    iput v6, v4, La/w1e;->s:I

    .line 293
    .line 294
    invoke-virtual {v3, v13, v14, v15, v4}, La/gva0;->b(JLa/lf2;La/zje;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 298
    if-ne v6, v5, :cond_a

    .line 299
    .line 300
    goto/16 :goto_a

    .line 301
    .line 302
    :cond_a
    move-object v13, v2

    .line 303
    move-object v2, v12

    .line 304
    move-object v12, v3

    .line 305
    move-object v3, v6

    .line 306
    move-object v6, v9

    .line 307
    :goto_6
    :try_start_3
    check-cast v3, La/f2e;

    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iput-object v11, v3, La/f2e;->c:Lkotlin/coroutines/CoroutineContext;

    .line 316
    .line 317
    new-instance v11, Ljava/lang/Throwable;

    .line 318
    .line 319
    invoke-direct {v11}, Ljava/lang/Throwable;-><init>()V

    .line 320
    .line 321
    .line 322
    iput-object v11, v3, La/f2e;->d:Ljava/lang/Throwable;

    .line 323
    .line 324
    iget-object v11, v0, La/z1e;->a:La/gva0;

    .line 325
    .line 326
    iget-object v14, v0, La/z1e;->b:La/gva0;

    .line 327
    .line 328
    const/4 v15, 0x0

    .line 329
    if-eq v11, v14, :cond_b

    .line 330
    .line 331
    if-eqz v1, :cond_b

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_b
    move v7, v15

    .line 335
    :goto_7
    new-instance v1, La/xva0;

    .line 336
    .line 337
    invoke-direct {v1, v2, v3, v7}, La/xva0;-><init>(La/usd;La/f2e;Z)V

    .line 338
    .line 339
    .line 340
    iput-object v1, v6, La/mie0;->a:Ljava/lang/Object;

    .line 341
    .line 342
    iget-object v1, v9, La/mie0;->a:Ljava/lang/Object;

    .line 343
    .line 344
    if-eqz v1, :cond_e

    .line 345
    .line 346
    check-cast v1, La/xva0;

    .line 347
    .line 348
    new-instance v2, La/k1e;

    .line 349
    .line 350
    iget-object v3, v0, La/z1e;->c:La/usd;

    .line 351
    .line 352
    invoke-direct {v2, v3, v1}, La/k1e;-><init>(Lkotlin/coroutines/f;La/xva0;)V

    .line 353
    .line 354
    .line 355
    iget-object v0, v0, La/z1e;->d:Ljava/lang/ThreadLocal;

    .line 356
    .line 357
    new-instance v3, La/fcq0;

    .line 358
    .line 359
    invoke-direct {v3, v1, v0}, La/fcq0;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    .line 360
    .line 361
    .line 362
    invoke-static {v2, v3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    new-instance v1, La/y1e;

    .line 367
    .line 368
    invoke-direct {v1, v13, v9, v10, v15}, La/y1e;-><init>(Lkotlin/jvm/functions/Function2;La/mie0;La/yje;B)V

    .line 369
    .line 370
    .line 371
    iput-object v12, v4, La/w1e;->j:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v8, v4, La/w1e;->k:Ljava/lang/Object;

    .line 374
    .line 375
    iput-object v9, v4, La/w1e;->l:La/mie0;

    .line 376
    .line 377
    iput-object v10, v4, La/w1e;->m:La/mie0;

    .line 378
    .line 379
    iput-object v10, v4, La/w1e;->n:Lkotlin/coroutines/CoroutineContext;

    .line 380
    .line 381
    iput-object v10, v4, La/w1e;->o:La/mie0;

    .line 382
    .line 383
    iput-object v10, v4, La/w1e;->p:La/usd;

    .line 384
    .line 385
    const/4 v2, 0x4

    .line 386
    iput v2, v4, La/w1e;->s:I

    .line 387
    .line 388
    invoke-static {v0, v1, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 392
    if-ne v3, v5, :cond_c

    .line 393
    .line 394
    goto :goto_a

    .line 395
    :cond_c
    move-object v11, v8

    .line 396
    move-object v13, v12

    .line 397
    move-object v12, v9

    .line 398
    :goto_8
    sget-object v0, La/z560;->b:La/z560;

    .line 399
    .line 400
    new-instance v8, La/wn2;

    .line 401
    .line 402
    const/16 v9, 0x9

    .line 403
    .line 404
    invoke-direct/range {v8 .. v13}, La/wn2;-><init>(BLa/yje;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    iput-object v3, v4, La/w1e;->j:Ljava/lang/Object;

    .line 408
    .line 409
    iput-object v10, v4, La/w1e;->k:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v10, v4, La/w1e;->l:La/mie0;

    .line 412
    .line 413
    const/4 v1, 0x5

    .line 414
    iput v1, v4, La/w1e;->s:I

    .line 415
    .line 416
    invoke-static {v0, v8, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    if-ne v0, v5, :cond_d

    .line 421
    .line 422
    goto :goto_a

    .line 423
    :cond_d
    return-object v3

    .line 424
    :catchall_2
    move-exception v0

    .line 425
    move-object v11, v8

    .line 426
    goto/16 :goto_1

    .line 427
    .line 428
    :cond_e
    :try_start_4
    const-string v0, "Required value was null."

    .line 429
    .line 430
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 431
    .line 432
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 436
    :catchall_3
    move-exception v0

    .line 437
    move-object v13, v3

    .line 438
    move-object v11, v8

    .line 439
    goto/16 :goto_2

    .line 440
    .line 441
    :goto_9
    :try_start_5
    iput-object v0, v11, La/mie0;->a:Ljava/lang/Object;

    .line 442
    .line 443
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 444
    :catchall_4
    move-exception v0

    .line 445
    sget-object v1, La/z560;->b:La/z560;

    .line 446
    .line 447
    new-instance v8, La/wn2;

    .line 448
    .line 449
    const/16 v9, 0x9

    .line 450
    .line 451
    invoke-direct/range {v8 .. v13}, La/wn2;-><init>(BLa/yje;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    iput-object v0, v4, La/w1e;->j:Ljava/lang/Object;

    .line 455
    .line 456
    iput-object v10, v4, La/w1e;->k:Ljava/lang/Object;

    .line 457
    .line 458
    iput-object v10, v4, La/w1e;->l:La/mie0;

    .line 459
    .line 460
    iput-object v10, v4, La/w1e;->m:La/mie0;

    .line 461
    .line 462
    iput-object v10, v4, La/w1e;->n:Lkotlin/coroutines/CoroutineContext;

    .line 463
    .line 464
    iput-object v10, v4, La/w1e;->o:La/mie0;

    .line 465
    .line 466
    iput-object v10, v4, La/w1e;->p:La/usd;

    .line 467
    .line 468
    const/4 v2, 0x6

    .line 469
    iput v2, v4, La/w1e;->s:I

    .line 470
    .line 471
    invoke-static {v1, v8, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    if-ne v1, v5, :cond_f

    .line 476
    .line 477
    :goto_a
    return-object v5

    .line 478
    :cond_f
    :goto_b
    throw v0

    .line 479
    :cond_10
    const/16 v0, 0x15

    .line 480
    .line 481
    const-string v1, "Connection pool is closed"

    .line 482
    .line 483
    invoke-static {v0, v1}, La/m2x;->J(ILjava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw v10

    .line 487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
