.class public final La/zqn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/arn0;


# direct methods
.method public synthetic constructor <init>(La/arn0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zqn0;->i:B

    iput-object p1, p0, La/zqn0;->k:La/arn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/zqn0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zqn0;->k:La/arn0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/zqn0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/zqn0;-><init>(La/arn0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/zqn0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/zqn0;-><init>(La/arn0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/zqn0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/zqn0;-><init>(La/arn0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zqn0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zqn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zqn0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zqn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zqn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zqn0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zqn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/zqn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/zqn0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/zqn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/zqn0;->i:B

    .line 4
    .line 5
    const/16 v6, 0x17c

    .line 6
    .line 7
    sget-object v7, La/cqn0;->a:La/cqn0;

    .line 8
    .line 9
    const/4 v8, 0x3

    .line 10
    const/4 v9, 0x0

    .line 11
    const-string v10, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v11, v0, La/zqn0;->k:La/arn0;

    .line 14
    .line 15
    const/4 v12, 0x1

    .line 16
    const/4 v13, 0x2

    .line 17
    const-wide/16 v14, 0x1f4

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    iget-object v1, v11, La/arn0;->c:La/ctf0;

    .line 24
    .line 25
    iget-object v5, v11, La/arn0;->u:La/p7m0;

    .line 26
    .line 27
    iget-object v11, v11, La/arn0;->v:La/ol60;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget-byte v3, v0, La/zqn0;->j:B

    .line 32
    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    if-eq v3, v12, :cond_2

    .line 36
    .line 37
    if-eq v3, v13, :cond_1

    .line 38
    .line 39
    if-ne v3, v8, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v11, v7}, La/ol60;->f(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-byte v12, v0, La/zqn0;->j:B

    .line 62
    .line 63
    invoke-static {v14, v15, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-ne v3, v2, :cond_4

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    :goto_1
    new-instance v3, La/tqn0;

    .line 71
    .line 72
    new-array v7, v9, [Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v10, v1, La/ctf0;->b:La/lsm0;

    .line 75
    .line 76
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const v9, 0x7f13144b

    .line 81
    .line 82
    .line 83
    invoke-virtual {v10, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-direct {v3, v7}, La/tqn0;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v4, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    sget-object v3, La/hqn0;->a:La/hqn0;

    .line 97
    .line 98
    invoke-virtual {v11, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v3, La/bqn0;

    .line 102
    .line 103
    invoke-direct {v3, v12}, La/bqn0;-><init>(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iput-byte v13, v0, La/zqn0;->j:B

    .line 110
    .line 111
    invoke-static {v14, v15, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    if-ne v3, v2, :cond_5

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_5
    :goto_2
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    instance-of v3, v3, La/tqn0;

    .line 123
    .line 124
    if-eqz v3, :cond_7

    .line 125
    .line 126
    new-instance v3, La/lqn0;

    .line 127
    .line 128
    invoke-virtual {v1}, La/ctf0;->c()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-gt v4, v6, :cond_6

    .line 133
    .line 134
    const/16 v4, 0x4b

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    const/16 v4, 0x96

    .line 138
    .line 139
    :goto_3
    neg-int v4, v4

    .line 140
    invoke-direct {v3, v4}, La/lqn0;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v11, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iput-byte v8, v0, La/zqn0;->j:B

    .line 147
    .line 148
    const-wide/16 v3, 0xbb8

    .line 149
    .line 150
    invoke-static {v3, v4, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    if-ne v7, v2, :cond_5

    .line 155
    .line 156
    :goto_4
    move-object v4, v2

    .line 157
    goto :goto_5

    .line 158
    :cond_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    :goto_5
    return-object v4

    .line 161
    :pswitch_0
    iget-object v1, v11, La/arn0;->c:La/ctf0;

    .line 162
    .line 163
    iget-object v2, v11, La/arn0;->u:La/p7m0;

    .line 164
    .line 165
    sget-object v3, La/wne;->a:La/wne;

    .line 166
    .line 167
    iget-byte v5, v0, La/zqn0;->j:B

    .line 168
    .line 169
    if-eqz v5, :cond_a

    .line 170
    .line 171
    if-eq v5, v12, :cond_9

    .line 172
    .line 173
    if-ne v5, v13, :cond_8

    .line 174
    .line 175
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    const-wide/16 v4, 0xbb8

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_8
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    new-instance v5, La/sqn0;

    .line 193
    .line 194
    new-array v7, v9, [Ljava/lang/Object;

    .line 195
    .line 196
    iget-object v8, v1, La/ctf0;->b:La/lsm0;

    .line 197
    .line 198
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    const v9, 0x7f13144a

    .line 203
    .line 204
    .line 205
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-direct {v5, v7}, La/sqn0;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    iput-byte v12, v0, La/zqn0;->j:B

    .line 219
    .line 220
    invoke-static {v14, v15, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    if-ne v4, v3, :cond_b

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_b
    :goto_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    instance-of v4, v4, La/sqn0;

    .line 232
    .line 233
    if-eqz v4, :cond_d

    .line 234
    .line 235
    iget-object v4, v11, La/arn0;->v:La/ol60;

    .line 236
    .line 237
    new-instance v5, La/lqn0;

    .line 238
    .line 239
    invoke-virtual {v1}, La/ctf0;->c()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-gt v7, v6, :cond_c

    .line 244
    .line 245
    const/16 v7, 0x4b

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_c
    const/16 v7, 0x96

    .line 249
    .line 250
    :goto_7
    invoke-direct {v5, v7}, La/lqn0;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4, v5}, La/ol60;->f(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    iput-byte v13, v0, La/zqn0;->j:B

    .line 257
    .line 258
    const-wide/16 v4, 0xbb8

    .line 259
    .line 260
    invoke-static {v4, v5, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    if-ne v7, v3, :cond_b

    .line 265
    .line 266
    :goto_8
    move-object v4, v3

    .line 267
    goto :goto_9

    .line 268
    :cond_d
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    :goto_9
    return-object v4

    .line 271
    :pswitch_1
    iget-object v1, v11, La/arn0;->v:La/ol60;

    .line 272
    .line 273
    sget-object v2, La/wne;->a:La/wne;

    .line 274
    .line 275
    iget-byte v3, v0, La/zqn0;->j:B

    .line 276
    .line 277
    if-eqz v3, :cond_11

    .line 278
    .line 279
    if-eq v3, v12, :cond_10

    .line 280
    .line 281
    if-eq v3, v13, :cond_f

    .line 282
    .line 283
    if-ne v3, v8, :cond_e

    .line 284
    .line 285
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_11

    .line 289
    .line 290
    :cond_e
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_12

    .line 294
    .line 295
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_f

    .line 299
    .line 300
    :cond_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto :goto_a

    .line 304
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    sget-object v3, La/eqn0;->a:La/eqn0;

    .line 308
    .line 309
    invoke-virtual {v1, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v7}, La/ol60;->f(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iput-byte v12, v0, La/zqn0;->j:B

    .line 316
    .line 317
    invoke-static {v14, v15, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    if-ne v3, v2, :cond_12

    .line 322
    .line 323
    goto :goto_10

    .line 324
    :cond_12
    :goto_a
    iget-object v3, v11, La/arn0;->u:La/p7m0;

    .line 325
    .line 326
    new-instance v5, La/pqn0;

    .line 327
    .line 328
    iget-object v6, v11, La/arn0;->c:La/ctf0;

    .line 329
    .line 330
    new-array v7, v9, [Ljava/lang/Object;

    .line 331
    .line 332
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 333
    .line 334
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    const v9, 0x7f131459

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    iget-object v7, v11, La/arn0;->z:La/ksn0;

    .line 346
    .line 347
    if-eqz v7, :cond_13

    .line 348
    .line 349
    iget-object v9, v7, La/ksn0;->a:Ljava/lang/String;

    .line 350
    .line 351
    goto :goto_b

    .line 352
    :cond_13
    move-object v9, v4

    .line 353
    :goto_b
    const-string v10, ""

    .line 354
    .line 355
    if-nez v9, :cond_14

    .line 356
    .line 357
    move-object v9, v10

    .line 358
    :cond_14
    if-eqz v7, :cond_15

    .line 359
    .line 360
    iget-object v11, v7, La/ksn0;->c:Ljava/lang/String;

    .line 361
    .line 362
    goto :goto_c

    .line 363
    :cond_15
    move-object v11, v4

    .line 364
    :goto_c
    if-nez v11, :cond_16

    .line 365
    .line 366
    move-object v11, v10

    .line 367
    :cond_16
    if-eqz v7, :cond_17

    .line 368
    .line 369
    iget-object v7, v7, La/ksn0;->b:Ljava/lang/String;

    .line 370
    .line 371
    goto :goto_d

    .line 372
    :cond_17
    move-object v7, v4

    .line 373
    :goto_d
    if-nez v7, :cond_18

    .line 374
    .line 375
    goto :goto_e

    .line 376
    :cond_18
    move-object v10, v7

    .line 377
    :goto_e
    invoke-direct {v5, v6, v9, v11, v10}, La/pqn0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3, v4, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    sget-object v3, La/aqn0;->a:La/aqn0;

    .line 387
    .line 388
    invoke-virtual {v1, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    iput-byte v13, v0, La/zqn0;->j:B

    .line 392
    .line 393
    invoke-static {v14, v15, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    if-ne v3, v2, :cond_19

    .line 398
    .line 399
    goto :goto_10

    .line 400
    :cond_19
    :goto_f
    sget-object v3, La/gqn0;->a:La/gqn0;

    .line 401
    .line 402
    invoke-virtual {v1, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    iput-byte v8, v0, La/zqn0;->j:B

    .line 406
    .line 407
    invoke-static {v14, v15, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    if-ne v0, v2, :cond_1a

    .line 412
    .line 413
    :goto_10
    move-object v4, v2

    .line 414
    goto :goto_12

    .line 415
    :cond_1a
    :goto_11
    sget-object v0, La/fqn0;->a:La/fqn0;

    .line 416
    .line 417
    invoke-virtual {v1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 421
    .line 422
    :goto_12
    return-object v4

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
