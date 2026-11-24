.class public final La/g3b0;
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

.field public final synthetic n:La/v3b0;


# direct methods
.method public synthetic constructor <init>(La/v3b0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g3b0;->i:B

    iput-object p1, p0, La/g3b0;->n:La/v3b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/g3b0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g3b0;->n:La/v3b0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/g3b0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/g3b0;-><init>(La/v3b0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/g3b0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/g3b0;-><init>(La/v3b0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g3b0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/g3b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g3b0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g3b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/g3b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/g3b0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/g3b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/g3b0;->i:B

    .line 2
    .line 3
    const-wide/16 v1, 0x3e8

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, p0, La/g3b0;->n:La/v3b0;

    .line 10
    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v8, 0x3

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v9, p0, La/g3b0;->m:B

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    if-eqz v9, :cond_3

    .line 22
    .line 23
    if-eq v9, v5, :cond_2

    .line 24
    .line 25
    if-eq v9, v7, :cond_1

    .line 26
    .line 27
    if-eq v9, v8, :cond_0

    .line 28
    .line 29
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    iget-object p0, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ljava/lang/Throwable;

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, La/vhc0;

    .line 46
    .line 47
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-wide v1, p0, La/g3b0;->k:J

    .line 52
    .line 53
    iget-wide v3, p0, La/g3b0;->j:J

    .line 54
    .line 55
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La/j3b0;

    .line 66
    .line 67
    invoke-direct {p1, v10}, La/j3b0;-><init>(B)V

    .line 68
    .line 69
    .line 70
    sget v3, La/v3b0;->W:I

    .line 71
    .line 72
    invoke-virtual {v6, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    :try_start_1
    iget-object p1, v6, La/v3b0;->p:La/hsj;

    .line 80
    .line 81
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    check-cast v9, La/u2b0;

    .line 86
    .line 87
    iget-boolean v9, v9, La/u2b0;->i:Z

    .line 88
    .line 89
    iput-wide v1, p0, La/g3b0;->j:J

    .line 90
    .line 91
    iput-wide v3, p0, La/g3b0;->k:J

    .line 92
    .line 93
    iput-byte v5, p0, La/g3b0;->m:B

    .line 94
    .line 95
    invoke-virtual {p1, v9, p0}, La/hsj;->q(ZLa/zje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    if-ne p1, v0, :cond_4

    .line 100
    .line 101
    goto/16 :goto_4

    .line 102
    .line 103
    :cond_4
    move-wide v12, v3

    .line 104
    move-wide v3, v1

    .line 105
    move-wide v1, v12

    .line 106
    :goto_0
    :try_start_2
    check-cast p1, La/vhc0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v8

    .line 112
    sub-long/2addr v8, v1

    .line 113
    cmp-long v11, v8, v3

    .line 114
    .line 115
    if-gez v11, :cond_6

    .line 116
    .line 117
    sub-long v8, v3, v8

    .line 118
    .line 119
    iput-object p1, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 120
    .line 121
    iput-wide v3, p0, La/g3b0;->j:J

    .line 122
    .line 123
    iput-wide v1, p0, La/g3b0;->k:J

    .line 124
    .line 125
    iput-byte v7, p0, La/g3b0;->m:B

    .line 126
    .line 127
    invoke-static {v8, v9, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-ne p0, v0, :cond_5

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    move-object p0, p1

    .line 135
    :goto_1
    move-object p1, p0

    .line 136
    :cond_6
    iget-object p0, p1, La/vhc0;->c:La/foc0;

    .line 137
    .line 138
    iget-boolean p0, p0, La/foc0;->g:Z

    .line 139
    .line 140
    if-nez p0, :cond_7

    .line 141
    .line 142
    iget-object p0, p1, La/vhc0;->a:La/kic0;

    .line 143
    .line 144
    iget-boolean p0, p0, La/kic0;->k:Z

    .line 145
    .line 146
    if-nez p0, :cond_7

    .line 147
    .line 148
    iget-object p0, p1, La/vhc0;->b:La/kic0;

    .line 149
    .line 150
    iget-boolean p0, p0, La/kic0;->k:Z

    .line 151
    .line 152
    if-nez p0, :cond_7

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    move v5, v10

    .line 156
    :goto_2
    new-instance p0, La/xh20;

    .line 157
    .line 158
    const/16 v0, 0xc

    .line 159
    .line 160
    invoke-direct {p0, v5, p1, v0}, La/xh20;-><init>(ZLjava/lang/Object;B)V

    .line 161
    .line 162
    .line 163
    sget p1, La/v3b0;->W:I

    .line 164
    .line 165
    invoke-virtual {v6, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :catchall_1
    move-exception p1

    .line 172
    move-wide v12, v3

    .line 173
    move-wide v3, v1

    .line 174
    move-wide v1, v12

    .line 175
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 176
    .line 177
    .line 178
    move-result-wide v5

    .line 179
    sub-long/2addr v5, v1

    .line 180
    cmp-long v7, v5, v3

    .line 181
    .line 182
    if-gez v7, :cond_9

    .line 183
    .line 184
    sub-long v5, v3, v5

    .line 185
    .line 186
    iput-object p1, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 187
    .line 188
    iput-wide v3, p0, La/g3b0;->j:J

    .line 189
    .line 190
    iput-wide v1, p0, La/g3b0;->k:J

    .line 191
    .line 192
    iput-byte v8, p0, La/g3b0;->m:B

    .line 193
    .line 194
    invoke-static {v5, v6, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    if-ne p0, v0, :cond_8

    .line 199
    .line 200
    :goto_4
    move-object v3, v0

    .line 201
    :goto_5
    return-object v3

    .line 202
    :cond_8
    move-object p0, p1

    .line 203
    :goto_6
    move-object p1, p0

    .line 204
    :cond_9
    throw p1

    .line 205
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 206
    .line 207
    iget-byte v9, p0, La/g3b0;->m:B

    .line 208
    .line 209
    const/4 v10, 0x6

    .line 210
    packed-switch v9, :pswitch_data_1

    .line 211
    .line 212
    .line 213
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_f

    .line 217
    .line 218
    :pswitch_1
    iget-object p0, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p0, Ljava/lang/Throwable;

    .line 221
    .line 222
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_10

    .line 226
    .line 227
    :pswitch_2
    iget-wide v1, p0, La/g3b0;->k:J

    .line 228
    .line 229
    iget-wide v3, p0, La/g3b0;->j:J

    .line 230
    .line 231
    :try_start_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 232
    .line 233
    .line 234
    goto/16 :goto_b

    .line 235
    .line 236
    :catchall_2
    move-exception p1

    .line 237
    goto/16 :goto_d

    .line 238
    .line 239
    :pswitch_3
    iget-object p0, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p0, Ljava/lang/Throwable;

    .line 242
    .line 243
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_a

    .line 247
    .line 248
    :pswitch_4
    iget-object p0, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p0, Ljava/util/List;

    .line 251
    .line 252
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :pswitch_5
    iget-wide v1, p0, La/g3b0;->k:J

    .line 257
    .line 258
    iget-wide v3, p0, La/g3b0;->j:J

    .line 259
    .line 260
    :try_start_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 261
    .line 262
    .line 263
    goto :goto_7

    .line 264
    :catchall_3
    move-exception p1

    .line 265
    goto :goto_9

    .line 266
    :pswitch_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    new-instance p1, La/jfa0;

    .line 270
    .line 271
    const/16 v3, 0x1d

    .line 272
    .line 273
    invoke-direct {p1, v3}, La/jfa0;-><init>(B)V

    .line 274
    .line 275
    .line 276
    sget v3, La/v3b0;->W:I

    .line 277
    .line 278
    invoke-virtual {v6, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    check-cast p1, La/u2b0;

    .line 286
    .line 287
    iget-boolean p1, p1, La/u2b0;->c:Z

    .line 288
    .line 289
    if-eqz p1, :cond_e

    .line 290
    .line 291
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 292
    .line 293
    .line 294
    move-result-wide v3

    .line 295
    :try_start_5
    iget-object p1, v6, La/v3b0;->G:La/hsj;

    .line 296
    .line 297
    sget-object v9, La/z7b;->d:La/z7b;

    .line 298
    .line 299
    filled-new-array {v9}, [La/z7b;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    iput-wide v1, p0, La/g3b0;->j:J

    .line 304
    .line 305
    iput-wide v3, p0, La/g3b0;->k:J

    .line 306
    .line 307
    iput-byte v5, p0, La/g3b0;->m:B

    .line 308
    .line 309
    invoke-virtual {p1, v9, p0}, La/hsj;->r([La/z7b;La/zje;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 313
    if-ne p1, v0, :cond_a

    .line 314
    .line 315
    goto/16 :goto_e

    .line 316
    .line 317
    :cond_a
    move-wide v12, v3

    .line 318
    move-wide v3, v1

    .line 319
    move-wide v1, v12

    .line 320
    :goto_7
    :try_start_6
    check-cast p1, La/a3b;

    .line 321
    .line 322
    iget-object p1, p1, La/a3b;->a:Ljava/util/ArrayList;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 323
    .line 324
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 325
    .line 326
    .line 327
    move-result-wide v8

    .line 328
    sub-long/2addr v8, v1

    .line 329
    cmp-long v5, v8, v3

    .line 330
    .line 331
    if-gez v5, :cond_10

    .line 332
    .line 333
    sub-long v8, v3, v8

    .line 334
    .line 335
    iput-object p1, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 336
    .line 337
    iput-wide v3, p0, La/g3b0;->j:J

    .line 338
    .line 339
    iput-wide v1, p0, La/g3b0;->k:J

    .line 340
    .line 341
    iput-byte v7, p0, La/g3b0;->m:B

    .line 342
    .line 343
    invoke-static {v8, v9, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    if-ne p0, v0, :cond_b

    .line 348
    .line 349
    goto/16 :goto_e

    .line 350
    .line 351
    :cond_b
    move-object p0, p1

    .line 352
    :goto_8
    move-object p1, p0

    .line 353
    goto :goto_c

    .line 354
    :catchall_4
    move-exception p1

    .line 355
    move-wide v12, v3

    .line 356
    move-wide v3, v1

    .line 357
    move-wide v1, v12

    .line 358
    :goto_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 359
    .line 360
    .line 361
    move-result-wide v5

    .line 362
    sub-long/2addr v5, v1

    .line 363
    cmp-long v7, v5, v3

    .line 364
    .line 365
    if-gez v7, :cond_d

    .line 366
    .line 367
    sub-long v5, v3, v5

    .line 368
    .line 369
    iput-object p1, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 370
    .line 371
    iput-wide v3, p0, La/g3b0;->j:J

    .line 372
    .line 373
    iput-wide v1, p0, La/g3b0;->k:J

    .line 374
    .line 375
    iput-byte v8, p0, La/g3b0;->m:B

    .line 376
    .line 377
    invoke-static {v5, v6, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    if-ne p0, v0, :cond_c

    .line 382
    .line 383
    goto/16 :goto_e

    .line 384
    .line 385
    :cond_c
    move-object p0, p1

    .line 386
    :goto_a
    move-object p1, p0

    .line 387
    :cond_d
    throw p1

    .line 388
    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 389
    .line 390
    .line 391
    move-result-wide v3

    .line 392
    :try_start_7
    iget-object p1, v6, La/v3b0;->A:La/abu;

    .line 393
    .line 394
    sget-object v5, La/z7b;->d:La/z7b;

    .line 395
    .line 396
    filled-new-array {v5}, [La/z7b;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    iput-wide v1, p0, La/g3b0;->j:J

    .line 401
    .line 402
    iput-wide v3, p0, La/g3b0;->k:J

    .line 403
    .line 404
    const/4 v7, 0x4

    .line 405
    iput-byte v7, p0, La/g3b0;->m:B

    .line 406
    .line 407
    invoke-virtual {p1, v5, p0}, La/abu;->s([La/z7b;La/zje;)Ljava/io/Serializable;

    .line 408
    .line 409
    .line 410
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 411
    if-ne p1, v0, :cond_f

    .line 412
    .line 413
    goto :goto_e

    .line 414
    :cond_f
    move-wide v12, v3

    .line 415
    move-wide v3, v1

    .line 416
    move-wide v1, v12

    .line 417
    :goto_b
    :try_start_8
    check-cast p1, Ljava/util/List;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 418
    .line 419
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 420
    .line 421
    .line 422
    move-result-wide v7

    .line 423
    sub-long/2addr v7, v1

    .line 424
    cmp-long v5, v7, v3

    .line 425
    .line 426
    if-gez v5, :cond_10

    .line 427
    .line 428
    sub-long v7, v3, v7

    .line 429
    .line 430
    iput-object p1, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 431
    .line 432
    iput-wide v3, p0, La/g3b0;->j:J

    .line 433
    .line 434
    iput-wide v1, p0, La/g3b0;->k:J

    .line 435
    .line 436
    const/4 v1, 0x5

    .line 437
    iput-byte v1, p0, La/g3b0;->m:B

    .line 438
    .line 439
    invoke-static {v7, v8, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    if-ne p0, v0, :cond_b

    .line 444
    .line 445
    goto :goto_e

    .line 446
    :cond_10
    :goto_c
    new-instance p0, La/kv80;

    .line 447
    .line 448
    invoke-direct {p0, p1, v10}, La/kv80;-><init>(Ljava/util/List;B)V

    .line 449
    .line 450
    .line 451
    sget p1, La/v3b0;->W:I

    .line 452
    .line 453
    invoke-virtual {v6, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 454
    .line 455
    .line 456
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    goto :goto_f

    .line 459
    :catchall_5
    move-exception p1

    .line 460
    move-wide v12, v3

    .line 461
    move-wide v3, v1

    .line 462
    move-wide v1, v12

    .line 463
    :goto_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 464
    .line 465
    .line 466
    move-result-wide v5

    .line 467
    sub-long/2addr v5, v1

    .line 468
    cmp-long v7, v5, v3

    .line 469
    .line 470
    if-gez v7, :cond_12

    .line 471
    .line 472
    sub-long v5, v3, v5

    .line 473
    .line 474
    iput-object p1, p0, La/g3b0;->l:Ljava/lang/Object;

    .line 475
    .line 476
    iput-wide v3, p0, La/g3b0;->j:J

    .line 477
    .line 478
    iput-wide v1, p0, La/g3b0;->k:J

    .line 479
    .line 480
    iput-byte v10, p0, La/g3b0;->m:B

    .line 481
    .line 482
    invoke-static {v5, v6, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    if-ne p0, v0, :cond_11

    .line 487
    .line 488
    :goto_e
    move-object v3, v0

    .line 489
    :goto_f
    return-object v3

    .line 490
    :cond_11
    move-object p0, p1

    .line 491
    :goto_10
    move-object p1, p0

    .line 492
    :cond_12
    throw p1

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
    .end packed-switch
.end method
