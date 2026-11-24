.class public final La/upf0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/vqf0;

.field public k:B

.field public final synthetic l:La/aqf0;


# direct methods
.method public synthetic constructor <init>(La/aqf0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/upf0;->i:B

    iput-object p1, p0, La/upf0;->l:La/aqf0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/upf0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/upf0;->l:La/aqf0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/upf0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/upf0;-><init>(La/aqf0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/upf0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/upf0;-><init>(La/aqf0;La/yje;B)V

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
    iget-byte v0, p0, La/upf0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/upf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/upf0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/upf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/upf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/upf0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/upf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/upf0;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v8, v5, La/upf0;->l:La/aqf0;

    .line 8
    .line 9
    const/4 v9, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v10, 0x2

    .line 12
    const/4 v3, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v8, La/aqf0;->j:La/fq;

    .line 17
    .line 18
    sget-object v4, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v6, v5, La/upf0;->k:B

    .line 21
    .line 22
    const/4 v7, 0x5

    .line 23
    const/4 v11, 0x4

    .line 24
    const/4 v12, 0x3

    .line 25
    if-eqz v6, :cond_5

    .line 26
    .line 27
    if-eq v6, v9, :cond_4

    .line 28
    .line 29
    if-eq v6, v10, :cond_3

    .line 30
    .line 31
    if-eq v6, v12, :cond_2

    .line 32
    .line 33
    if-eq v6, v11, :cond_1

    .line 34
    .line 35
    if-ne v6, v7, :cond_0

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :cond_1
    iget-object v0, v5, La/upf0;->j:La/vqf0;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_2
    iget-object v1, v5, La/upf0;->j:La/vqf0;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget-object v1, v5, La/upf0;->j:La/vqf0;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object/from16 v1, p1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, v8, La/aqf0;->b:La/fqf0;

    .line 76
    .line 77
    iput-byte v9, v5, La/upf0;->k:B

    .line 78
    .line 79
    invoke-virtual {v1, v5}, La/fqf0;->a(La/zje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-ne v1, v4, :cond_6

    .line 84
    .line 85
    goto/16 :goto_5

    .line 86
    .line 87
    :cond_6
    :goto_0
    check-cast v1, La/vqf0;

    .line 88
    .line 89
    iget-object v6, v1, La/vqf0;->b:La/wof0;

    .line 90
    .line 91
    if-eqz v6, :cond_d

    .line 92
    .line 93
    iget-object v7, v8, La/aqf0;->h:La/ecs;

    .line 94
    .line 95
    invoke-virtual {v7, v2}, La/ecs;->a(Z)V

    .line 96
    .line 97
    .line 98
    iget-object v7, v8, La/aqf0;->o:La/qni0;

    .line 99
    .line 100
    iget-wide v13, v6, La/wof0;->c:D

    .line 101
    .line 102
    invoke-virtual {v7, v13, v14}, La/qni0;->a(D)V

    .line 103
    .line 104
    .line 105
    new-instance v7, La/oy5;

    .line 106
    .line 107
    iget-wide v13, v6, La/wof0;->a:J

    .line 108
    .line 109
    invoke-direct {v7, v13, v14}, La/oy5;-><init>(J)V

    .line 110
    .line 111
    .line 112
    iput-object v1, v5, La/upf0;->j:La/vqf0;

    .line 113
    .line 114
    iput-byte v10, v5, La/upf0;->k:B

    .line 115
    .line 116
    invoke-virtual {v0, v7, v5}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    if-ne v6, v4, :cond_7

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_7
    :goto_1
    new-instance v6, La/iy5;

    .line 124
    .line 125
    iget-object v7, v1, La/vqf0;->b:La/wof0;

    .line 126
    .line 127
    iget-object v7, v7, La/wof0;->b:La/csr;

    .line 128
    .line 129
    invoke-direct {v6, v7}, La/iy5;-><init>(La/csr;)V

    .line 130
    .line 131
    .line 132
    iput-object v1, v5, La/upf0;->j:La/vqf0;

    .line 133
    .line 134
    iput-byte v12, v5, La/upf0;->k:B

    .line 135
    .line 136
    invoke-virtual {v0, v6, v5}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    if-ne v6, v4, :cond_8

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_8
    :goto_2
    new-instance v6, La/gvb0;

    .line 144
    .line 145
    const/16 v7, 0x19

    .line 146
    .line 147
    invoke-direct {v6, v8, v1, v7}, La/gvb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    iput-object v6, v8, La/aqf0;->B:Lkotlin/jvm/functions/Function0;

    .line 151
    .line 152
    new-instance v6, La/xy5;

    .line 153
    .line 154
    invoke-direct {v6, v9}, La/xy5;-><init>(Z)V

    .line 155
    .line 156
    .line 157
    iput-object v1, v5, La/upf0;->j:La/vqf0;

    .line 158
    .line 159
    iput-byte v11, v5, La/upf0;->k:B

    .line 160
    .line 161
    invoke-virtual {v0, v6, v5}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-ne v0, v4, :cond_9

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_9
    move-object v0, v1

    .line 169
    :goto_3
    iget-object v0, v0, La/vqf0;->b:La/wof0;

    .line 170
    .line 171
    iget-object v0, v0, La/wof0;->j:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_b

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    move-object v4, v1

    .line 188
    check-cast v4, La/mrf0;

    .line 189
    .line 190
    iget-object v4, v4, La/mrf0;->d:La/qrf0;

    .line 191
    .line 192
    sget-object v5, La/qrf0;->f:La/qrf0;

    .line 193
    .line 194
    if-ne v4, v5, :cond_a

    .line 195
    .line 196
    move-object v3, v1

    .line 197
    :cond_b
    if-eqz v3, :cond_c

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_c
    move v9, v2

    .line 201
    :goto_4
    iput-boolean v9, v8, La/aqf0;->A:Z

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_d
    invoke-virtual {v8, v1}, La/aqf0;->A(La/vqf0;)V

    .line 205
    .line 206
    .line 207
    new-instance v1, La/xy5;

    .line 208
    .line 209
    invoke-direct {v1, v2}, La/xy5;-><init>(Z)V

    .line 210
    .line 211
    .line 212
    iput-object v3, v5, La/upf0;->j:La/vqf0;

    .line 213
    .line 214
    iput-byte v7, v5, La/upf0;->k:B

    .line 215
    .line 216
    invoke-virtual {v0, v1, v5}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-ne v0, v4, :cond_e

    .line 221
    .line 222
    :goto_5
    move-object v3, v4

    .line 223
    goto :goto_7

    .line 224
    :cond_e
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    :goto_7
    return-object v3

    .line 227
    :pswitch_0
    sget-object v11, La/wne;->a:La/wne;

    .line 228
    .line 229
    iget-byte v0, v5, La/upf0;->k:B

    .line 230
    .line 231
    if-eqz v0, :cond_11

    .line 232
    .line 233
    if-eq v0, v9, :cond_10

    .line 234
    .line 235
    if-ne v0, v10, :cond_f

    .line 236
    .line 237
    iget-object v0, v5, La/upf0;->j:La/vqf0;

    .line 238
    .line 239
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_c

    .line 243
    .line 244
    :cond_f
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_d

    .line 248
    .line 249
    :cond_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v0, p1

    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iget-object v0, v8, La/aqf0;->y:La/vqf0;

    .line 259
    .line 260
    if-eqz v0, :cond_12

    .line 261
    .line 262
    iget-object v0, v0, La/vqf0;->b:La/wof0;

    .line 263
    .line 264
    if-eqz v0, :cond_12

    .line 265
    .line 266
    iget-boolean v0, v0, La/wof0;->h:Z

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_12
    move v0, v2

    .line 270
    :goto_8
    invoke-virtual {v8, v2, v0}, La/aqf0;->y(ZZ)V

    .line 271
    .line 272
    .line 273
    iput-boolean v2, v8, La/aqf0;->A:Z

    .line 274
    .line 275
    iget-object v0, v8, La/aqf0;->d:La/bsf0;

    .line 276
    .line 277
    iput-byte v9, v5, La/upf0;->k:B

    .line 278
    .line 279
    iget-object v1, v0, La/bsf0;->c:La/ztt;

    .line 280
    .line 281
    invoke-virtual {v1}, La/ztt;->a()La/csr;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    iget-object v3, v0, La/bsf0;->b:La/gmt;

    .line 286
    .line 287
    invoke-virtual {v3}, La/gmt;->a()La/ql5;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    if-eqz v3, :cond_16

    .line 292
    .line 293
    iget-object v4, v0, La/bsf0;->a:La/drf0;

    .line 294
    .line 295
    iget-object v2, v2, La/csr;->a:La/bsr;

    .line 296
    .line 297
    iget-object v2, v2, La/bsr;->a:La/esr;

    .line 298
    .line 299
    invoke-virtual {v2}, La/esr;->a()Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_13

    .line 304
    .line 305
    const-wide/16 v6, 0x0

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_13
    iget-object v0, v0, La/bsf0;->d:La/itt;

    .line 309
    .line 310
    invoke-virtual {v0}, La/itt;->a()D

    .line 311
    .line 312
    .line 313
    move-result-wide v6

    .line 314
    :goto_9
    iget-object v0, v3, La/ql5;->f:Ljava/lang/String;

    .line 315
    .line 316
    iget-wide v2, v3, La/ql5;->a:J

    .line 317
    .line 318
    invoke-virtual {v1}, La/ztt;->a()La/csr;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    move-wide v15, v6

    .line 323
    move-object v7, v0

    .line 324
    move-object v6, v1

    .line 325
    move-object v0, v4

    .line 326
    move-wide v3, v2

    .line 327
    move-wide v1, v15

    .line 328
    invoke-virtual/range {v0 .. v7}, La/drf0;->d(DJLa/zje;La/csr;Ljava/lang/String;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    if-ne v0, v11, :cond_14

    .line 333
    .line 334
    goto :goto_b

    .line 335
    :cond_14
    :goto_a
    check-cast v0, La/vqf0;

    .line 336
    .line 337
    iget-object v1, v8, La/aqf0;->j:La/fq;

    .line 338
    .line 339
    iput-object v0, v5, La/upf0;->j:La/vqf0;

    .line 340
    .line 341
    iput-byte v10, v5, La/upf0;->k:B

    .line 342
    .line 343
    sget-object v2, La/my5;->a:La/my5;

    .line 344
    .line 345
    invoke-virtual {v1, v2, v5}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    if-ne v1, v11, :cond_15

    .line 350
    .line 351
    :goto_b
    move-object v3, v11

    .line 352
    goto :goto_d

    .line 353
    :cond_15
    :goto_c
    invoke-virtual {v8, v0, v9}, La/aqf0;->x(La/vqf0;Z)V

    .line 354
    .line 355
    .line 356
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    :goto_d
    return-object v3

    .line 359
    :cond_16
    new-instance v0, La/ss3;

    .line 360
    .line 361
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 362
    .line 363
    .line 364
    throw v0

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
