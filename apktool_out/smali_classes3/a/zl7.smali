.class public final La/zl7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/fm7;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/fm7;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zl7;->i:B

    iput-object p1, p0, La/zl7;->k:La/fm7;

    iput-object p2, p0, La/zl7;->l:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/zl7;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/zl7;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/zl7;->k:La/fm7;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/zl7;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/zl7;-><init>(La/fm7;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/zl7;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/zl7;-><init>(La/fm7;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/zl7;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/zl7;-><init>(La/fm7;Ljava/lang/String;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zl7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zl7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zl7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/zl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/zl7;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/zl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 31

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/zl7;->i:B

    .line 4
    .line 5
    iget-object v7, v5, La/zl7;->k:La/fm7;

    .line 6
    .line 7
    iget-object v1, v5, La/zl7;->l:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v6, 0x2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v7, La/fm7;->u:La/ctf0;

    .line 18
    .line 19
    sget-object v8, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v9, v5, La/zl7;->j:B

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v4, :cond_1

    .line 26
    .line 27
    if-ne v9, v6, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object/from16 v2, p1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    goto :goto_0

    .line 44
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v7, La/fm7;->A:La/rrc;

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    iput-byte v4, v5, La/zl7;->j:B

    .line 54
    .line 55
    invoke-virtual {v2, v9, v10, v5}, La/rrc;->D(JLa/bnn0;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-ne v2, v8, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    iget-object v2, v7, La/fm7;->M:La/ocl;

    .line 63
    .line 64
    iput-byte v6, v5, La/zl7;->j:B

    .line 65
    .line 66
    invoke-virtual {v2}, La/ocl;->j()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-ne v2, v8, :cond_4

    .line 71
    .line 72
    :goto_1
    move-object v2, v8

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    :goto_2
    move-object/from16 v24, v2

    .line 75
    .line 76
    check-cast v24, Ljava/util/List;

    .line 77
    .line 78
    sget v2, La/fm7;->p0:I

    .line 79
    .line 80
    iget-object v2, v7, La/i3t0;->i:La/ocj;

    .line 81
    .line 82
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 83
    .line 84
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-object v8, v3

    .line 92
    check-cast v8, La/jk7;

    .line 93
    .line 94
    const/16 v29, 0x0

    .line 95
    .line 96
    const v30, 0x1fbffff

    .line 97
    .line 98
    .line 99
    const/4 v9, 0x0

    .line 100
    const/4 v10, 0x0

    .line 101
    const-wide/16 v11, 0x0

    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    const/4 v14, 0x0

    .line 105
    const/4 v15, 0x0

    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    const/16 v19, 0x0

    .line 113
    .line 114
    const/16 v20, 0x0

    .line 115
    .line 116
    const/16 v21, 0x0

    .line 117
    .line 118
    const/16 v22, 0x0

    .line 119
    .line 120
    const/16 v23, 0x0

    .line 121
    .line 122
    const/16 v25, 0x0

    .line 123
    .line 124
    const/16 v26, 0x0

    .line 125
    .line 126
    const/16 v27, 0x0

    .line 127
    .line 128
    const/16 v28, 0x0

    .line 129
    .line 130
    invoke-static/range {v8 .. v30}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v2, v3, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_5

    .line 139
    .line 140
    new-instance v2, La/gl7;

    .line 141
    .line 142
    const/4 v3, 0x0

    .line 143
    new-array v5, v3, [Ljava/lang/Object;

    .line 144
    .line 145
    iget-object v6, v0, La/ctf0;->b:La/lsm0;

    .line 146
    .line 147
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    const v5, 0x7f131080

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 163
    .line 164
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    const v4, 0x7f1309d9

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const v1, 0x7f080afc

    .line 176
    .line 177
    .line 178
    invoke-direct {v2, v1, v3, v0}, La/gl7;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    :goto_3
    return-object v2

    .line 187
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 188
    .line 189
    iget-byte v7, v5, La/zl7;->j:B

    .line 190
    .line 191
    iget-object v8, v5, La/zl7;->k:La/fm7;

    .line 192
    .line 193
    if-eqz v7, :cond_8

    .line 194
    .line 195
    if-eq v7, v4, :cond_7

    .line 196
    .line 197
    if-ne v7, v6, :cond_6

    .line 198
    .line 199
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    move-object/from16 v2, p1

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget-object v9, v8, La/fm7;->v:La/p37;

    .line 217
    .line 218
    const/4 v12, 0x0

    .line 219
    const/4 v13, 0x6

    .line 220
    sget-object v10, La/c1k;->a:La/c1k;

    .line 221
    .line 222
    const/4 v11, 0x0

    .line 223
    invoke-static/range {v8 .. v13}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 224
    .line 225
    .line 226
    iget-object v2, v8, La/fm7;->V:La/znt;

    .line 227
    .line 228
    iput-byte v4, v5, La/zl7;->j:B

    .line 229
    .line 230
    iget-object v2, v2, La/znt;->a:La/chf0;

    .line 231
    .line 232
    invoke-virtual {v2, v5}, La/chf0;->D(La/yje;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    if-ne v2, v0, :cond_9

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_9
    :goto_4
    check-cast v2, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 242
    .line 243
    .line 244
    move-result-wide v2

    .line 245
    const-wide/16 v9, 0x0

    .line 246
    .line 247
    cmp-long v2, v2, v9

    .line 248
    .line 249
    if-nez v2, :cond_a

    .line 250
    .line 251
    iput-byte v6, v5, La/zl7;->j:B

    .line 252
    .line 253
    sget v2, La/fm7;->p0:I

    .line 254
    .line 255
    invoke-virtual {v8, v1, v5}, La/fm7;->X(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    if-ne v1, v0, :cond_b

    .line 260
    .line 261
    :goto_5
    move-object v2, v0

    .line 262
    goto :goto_7

    .line 263
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v0, La/al7;

    .line 267
    .line 268
    invoke-direct {v0, v1}, La/al7;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    sget v1, La/fm7;->p0:I

    .line 272
    .line 273
    invoke-virtual {v8, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_b
    :goto_6
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    :goto_7
    return-object v2

    .line 279
    :pswitch_1
    sget-object v8, La/wne;->a:La/wne;

    .line 280
    .line 281
    iget-byte v0, v5, La/zl7;->j:B

    .line 282
    .line 283
    if-eqz v0, :cond_e

    .line 284
    .line 285
    if-eq v0, v4, :cond_d

    .line 286
    .line 287
    if-ne v0, v6, :cond_c

    .line 288
    .line 289
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    goto :goto_a

    .line 293
    :cond_c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    goto :goto_b

    .line 297
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    move-object/from16 v0, p1

    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iget-object v0, v7, La/fm7;->X:La/khf0;

    .line 307
    .line 308
    sget-object v1, La/bm5;->c:La/bm5;

    .line 309
    .line 310
    iput-byte v4, v5, La/zl7;->j:B

    .line 311
    .line 312
    invoke-static {v0, v1, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-ne v0, v8, :cond_f

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_f
    :goto_8
    check-cast v0, La/ql5;

    .line 320
    .line 321
    iget-object v1, v7, La/fm7;->Q:La/ot;

    .line 322
    .line 323
    sget-object v2, La/bm5;->c:La/bm5;

    .line 324
    .line 325
    invoke-virtual {v1, v2, v0}, La/ot;->a(La/bm5;La/ql5;)V

    .line 326
    .line 327
    .line 328
    iget-object v1, v7, La/fm7;->Z:La/chf0;

    .line 329
    .line 330
    iget-wide v3, v0, La/ql5;->a:J

    .line 331
    .line 332
    iput-byte v6, v5, La/zl7;->j:B

    .line 333
    .line 334
    iget-object v0, v1, La/chf0;->b:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v0, La/r7v;

    .line 337
    .line 338
    iget-object v1, v1, La/chf0;->c:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v1, La/x1u;

    .line 341
    .line 342
    invoke-virtual {v1}, La/x1u;->a()J

    .line 343
    .line 344
    .line 345
    move-result-wide v1

    .line 346
    iget-object v0, v0, La/r7v;->a:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v0, La/es;

    .line 349
    .line 350
    iget-object v6, v5, La/zl7;->l:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual/range {v0 .. v6}, La/es;->c(JJLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-ne v0, v8, :cond_10

    .line 357
    .line 358
    :goto_9
    move-object v2, v8

    .line 359
    goto :goto_b

    .line 360
    :cond_10
    :goto_a
    sget v0, La/fm7;->p0:I

    .line 361
    .line 362
    sget-object v0, La/sk7;->a:La/sk7;

    .line 363
    .line 364
    invoke-virtual {v7, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    :goto_b
    return-object v2

    .line 370
    nop

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
