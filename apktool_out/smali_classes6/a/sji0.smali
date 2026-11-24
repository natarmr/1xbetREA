.class public final La/sji0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/uji0;La/pji0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/sji0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/sji0;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/sji0;->q:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/zyn0;La/bpn0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/sji0;->i:B

    .line 13
    iput-object p1, p0, La/sji0;->q:Ljava/lang/Object;

    iput-object p2, p0, La/sji0;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sji0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/sji0;->q:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/sji0;

    .line 9
    .line 10
    check-cast v1, La/zyn0;

    .line 11
    .line 12
    iget-object p0, p0, La/sji0;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/bpn0;

    .line 15
    .line 16
    invoke-direct {v0, v1, p0, p2}, La/sji0;-><init>(La/zyn0;La/bpn0;La/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/sji0;->p:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance p1, La/sji0;

    .line 23
    .line 24
    iget-object p0, p0, La/sji0;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/uji0;

    .line 27
    .line 28
    check-cast v1, La/pji0;

    .line 29
    .line 30
    invoke-direct {p1, p0, v1, p2}, La/sji0;-><init>(La/uji0;La/pji0;La/yje;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sji0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/sji0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sji0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sji0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/sji0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/sji0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/sji0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 40

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    iget-byte v0, v11, La/sji0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v11, La/sji0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v12, 0x1

    .line 10
    const/4 v13, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v11, La/sji0;->r:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v14, v0

    .line 17
    check-cast v14, La/bpn0;

    .line 18
    .line 19
    move-object v15, v3

    .line 20
    check-cast v15, La/zyn0;

    .line 21
    .line 22
    iget-object v3, v15, La/i3t0;->f:La/oyg0;

    .line 23
    .line 24
    iget-object v5, v15, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    iget-object v6, v15, La/zyn0;->h0:La/p7m0;

    .line 27
    .line 28
    iget-object v0, v11, La/sji0;->p:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/vne;

    .line 31
    .line 32
    sget-object v7, La/wne;->a:La/wne;

    .line 33
    .line 34
    iget-byte v8, v11, La/sji0;->j:B

    .line 35
    .line 36
    sget-object v9, La/hxn0;->a:La/hxn0;

    .line 37
    .line 38
    packed-switch v8, :pswitch_data_1

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_15

    .line 45
    .line 46
    :pswitch_0
    iget-object v0, v11, La/sji0;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, La/zyn0;

    .line 49
    .line 50
    iget-object v1, v11, La/sji0;->n:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v2, v11, La/sji0;->m:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, La/zyn0;

    .line 57
    .line 58
    check-cast v2, La/zh7;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v2, v1

    .line 64
    move-object/from16 v1, p1

    .line 65
    .line 66
    goto/16 :goto_14

    .line 67
    .line 68
    :pswitch_1
    iget-object v0, v11, La/sji0;->o:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/zyn0;

    .line 71
    .line 72
    check-cast v0, La/zh7;

    .line 73
    .line 74
    iget-object v0, v11, La/sji0;->n:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v14, v0

    .line 77
    check-cast v14, La/bpn0;

    .line 78
    .line 79
    iget-object v0, v11, La/sji0;->m:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, La/zyn0;

    .line 82
    .line 83
    iget-object v1, v11, La/sji0;->l:Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v2, v11, La/sji0;->k:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, La/kka;

    .line 88
    .line 89
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object v12, v7

    .line 93
    goto/16 :goto_11

    .line 94
    .line 95
    :pswitch_2
    iget-object v0, v11, La/sji0;->m:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, La/zyn0;

    .line 98
    .line 99
    check-cast v0, Ljava/lang/Throwable;

    .line 100
    .line 101
    iget-object v0, v11, La/sji0;->l:Ljava/lang/Object;

    .line 102
    .line 103
    iget-object v1, v11, La/sji0;->k:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, La/kka;

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object/from16 p1, v3

    .line 111
    .line 112
    move-object v13, v5

    .line 113
    move-object/from16 v18, v6

    .line 114
    .line 115
    move-object v12, v7

    .line 116
    move-object v3, v14

    .line 117
    goto/16 :goto_e

    .line 118
    .line 119
    :pswitch_3
    iget-object v0, v11, La/sji0;->l:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, La/vne;

    .line 122
    .line 123
    iget-object v0, v11, La/sji0;->k:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v1, v0

    .line 126
    check-cast v1, La/kka;

    .line 127
    .line 128
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    .line 131
    move-object/from16 v0, p1

    .line 132
    .line 133
    move-object/from16 p1, v3

    .line 134
    .line 135
    move-object v13, v5

    .line 136
    move-object/from16 v18, v6

    .line 137
    .line 138
    move-object v12, v7

    .line 139
    move-object/from16 v17, v14

    .line 140
    .line 141
    move-object v14, v9

    .line 142
    goto/16 :goto_6

    .line 143
    .line 144
    :catchall_0
    move-exception v0

    .line 145
    :goto_0
    move-object/from16 p1, v3

    .line 146
    .line 147
    move-object v13, v5

    .line 148
    move-object/from16 v18, v6

    .line 149
    .line 150
    move-object v12, v7

    .line 151
    :goto_1
    move-object/from16 v17, v14

    .line 152
    .line 153
    move-object v14, v9

    .line 154
    goto/16 :goto_c

    .line 155
    .line 156
    :pswitch_4
    iget-object v0, v11, La/sji0;->m:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, La/zyn0;

    .line 159
    .line 160
    check-cast v0, La/vne;

    .line 161
    .line 162
    iget-object v0, v11, La/sji0;->l:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, La/zyn0;

    .line 165
    .line 166
    iget-object v2, v11, La/sji0;->k:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v2, La/kka;

    .line 169
    .line 170
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 171
    .line 172
    .line 173
    move-object v4, v2

    .line 174
    move-object v10, v5

    .line 175
    move-object v2, v0

    .line 176
    move-object/from16 v0, p1

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :catchall_1
    move-exception v0

    .line 180
    move-object v1, v2

    .line 181
    goto :goto_0

    .line 182
    :pswitch_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v0, p1

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :pswitch_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object v2, v15, La/zyn0;->g0:La/fuj0;

    .line 192
    .line 193
    iput-object v0, v11, La/sji0;->p:Ljava/lang/Object;

    .line 194
    .line 195
    iput-byte v12, v11, La/sji0;->j:B

    .line 196
    .line 197
    invoke-virtual {v2, v11}, La/fuj0;->C(La/zje;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-ne v0, v7, :cond_0

    .line 202
    .line 203
    :goto_2
    move-object v12, v7

    .line 204
    goto/16 :goto_13

    .line 205
    .line 206
    :cond_0
    :goto_3
    move-object v2, v0

    .line 207
    check-cast v2, La/kka;

    .line 208
    .line 209
    if-nez v2, :cond_1

    .line 210
    .line 211
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    goto/16 :goto_15

    .line 214
    .line 215
    :cond_1
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 216
    .line 217
    iget-object v0, v15, La/zyn0;->R:La/nrt;

    .line 218
    .line 219
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    check-cast v8, La/jsn0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_d

    .line 224
    .line 225
    move-object v10, v5

    .line 226
    :try_start_3
    iget-wide v4, v8, La/jsn0;->b:J

    .line 227
    .line 228
    iput-object v13, v11, La/sji0;->p:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v2, v11, La/sji0;->k:Ljava/lang/Object;

    .line 231
    .line 232
    iput-object v15, v11, La/sji0;->l:Ljava/lang/Object;

    .line 233
    .line 234
    iput-object v13, v11, La/sji0;->m:Ljava/lang/Object;

    .line 235
    .line 236
    const/4 v8, 0x2

    .line 237
    iput-byte v8, v11, La/sji0;->j:B

    .line 238
    .line 239
    invoke-static {v0, v4, v5, v11}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 240
    .line 241
    .line 242
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_c

    .line 243
    if-ne v0, v7, :cond_2

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_2
    move-object v4, v2

    .line 247
    move-object v2, v15

    .line 248
    :goto_4
    :try_start_4
    check-cast v0, La/ql5;

    .line 249
    .line 250
    iget-wide v12, v0, La/ql5;->b:D

    .line 251
    .line 252
    iget-object v0, v2, La/zyn0;->h0:La/p7m0;

    .line 253
    .line 254
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    check-cast v5, La/jsn0;

    .line 259
    .line 260
    move-object/from16 v16, v2

    .line 261
    .line 262
    iget-wide v1, v5, La/jsn0;->a:D
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_a

    .line 263
    .line 264
    cmpg-double v1, v12, v1

    .line 265
    .line 266
    if-gez v1, :cond_3

    .line 267
    .line 268
    move-object/from16 v1, v16

    .line 269
    .line 270
    :try_start_5
    invoke-virtual {v1, v9}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    sget-object v0, La/mxn0;->a:La/mxn0;

    .line 274
    .line 275
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 279
    .line 280
    goto/16 :goto_15

    .line 281
    .line 282
    :catchall_2
    move-exception v0

    .line 283
    move-object/from16 p1, v3

    .line 284
    .line 285
    move-object v1, v4

    .line 286
    move-object/from16 v18, v6

    .line 287
    .line 288
    move-object v12, v7

    .line 289
    move-object v13, v10

    .line 290
    goto/16 :goto_1

    .line 291
    .line 292
    :cond_3
    move-object/from16 v1, v16

    .line 293
    .line 294
    :try_start_6
    iget-object v2, v1, La/zyn0;->p0:La/bby;

    .line 295
    .line 296
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 297
    .line 298
    .line 299
    sget-object v2, La/sxn0;->a:La/sxn0;

    .line 300
    .line 301
    invoke-virtual {v1, v2}, La/i3t0;->G(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_a

    .line 302
    .line 303
    .line 304
    :try_start_7
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 305
    .line 306
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 307
    .line 308
    :goto_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-object/from16 v17, v5

    .line 316
    .line 317
    check-cast v17, La/vxn0;

    .line 318
    .line 319
    const/16 v34, 0x0

    .line 320
    .line 321
    const v35, 0x1dfdf

    .line 322
    .line 323
    .line 324
    const/16 v18, 0x0

    .line 325
    .line 326
    const/16 v19, 0x0

    .line 327
    .line 328
    const/16 v20, 0x0

    .line 329
    .line 330
    const/16 v21, 0x0

    .line 331
    .line 332
    const/16 v22, 0x0

    .line 333
    .line 334
    const/16 v23, 0x0

    .line 335
    .line 336
    const/16 v24, 0x0

    .line 337
    .line 338
    const/16 v25, 0x0

    .line 339
    .line 340
    const/16 v26, 0x0

    .line 341
    .line 342
    const/16 v27, 0x0

    .line 343
    .line 344
    const/16 v28, 0x0

    .line 345
    .line 346
    const/16 v29, 0x0

    .line 347
    .line 348
    const/16 v30, 0x0

    .line 349
    .line 350
    const/16 v31, 0x1

    .line 351
    .line 352
    const/16 v32, 0x0

    .line 353
    .line 354
    const/16 v33, 0x0

    .line 355
    .line 356
    invoke-static/range {v17 .. v35}, La/vxn0;->a(La/vxn0;La/a4x;La/a4x;ZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/he;ZZZLa/bpn0;I)La/vxn0;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    invoke-virtual {v2, v5, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    .line 364
    if-eqz v5, :cond_5

    .line 365
    .line 366
    move-object v5, v0

    .line 367
    :try_start_8
    iget-object v0, v1, La/zyn0;->z:La/z220;

    .line 368
    .line 369
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    check-cast v2, La/jsn0;

    .line 374
    .line 375
    iget-wide v12, v2, La/jsn0;->b:J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    .line 376
    .line 377
    move-object v2, v3

    .line 378
    :try_start_9
    invoke-static {v4}, La/ny9;->b0(La/kka;)La/m97;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    check-cast v5, La/jsn0;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 387
    .line 388
    move-object/from16 v16, v9

    .line 389
    .line 390
    :try_start_a
    iget-wide v8, v5, La/jsn0;->a:D

    .line 391
    .line 392
    iget-object v5, v1, La/zyn0;->u:La/vyt;

    .line 393
    .line 394
    invoke-virtual {v5}, La/vyt;->a()La/ezc;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    iget-byte v5, v5, La/ezc;->a:B
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 399
    .line 400
    move-object/from16 v17, v7

    .line 401
    .line 402
    move v7, v5

    .line 403
    move-wide/from16 v38, v8

    .line 404
    .line 405
    move-object v9, v6

    .line 406
    move-wide/from16 v5, v38

    .line 407
    .line 408
    :try_start_b
    sget-object v8, La/yfa0;->INSTANCE:La/yfa0;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 409
    .line 410
    move-object/from16 v18, v9

    .line 411
    .line 412
    :try_start_c
    sget-object v9, La/gwe;->m:La/gwe;

    .line 413
    .line 414
    iget-object v1, v1, La/zyn0;->X:La/k7u;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 415
    .line 416
    :try_start_d
    iget-object v1, v1, La/k7u;->a:La/uzc;

    .line 417
    .line 418
    invoke-virtual {v1}, La/uzc;->b()La/jvn;

    .line 419
    .line 420
    .line 421
    move-result-object v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 422
    :try_start_e
    invoke-virtual {v1}, La/jvn;->getId()I

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    move/from16 v19, v1

    .line 427
    .line 428
    const/4 v1, 0x0

    .line 429
    iput-object v1, v11, La/sji0;->p:Ljava/lang/Object;

    .line 430
    .line 431
    iput-object v4, v11, La/sji0;->k:Ljava/lang/Object;

    .line 432
    .line 433
    iput-object v1, v11, La/sji0;->l:Ljava/lang/Object;

    .line 434
    .line 435
    iput-object v1, v11, La/sji0;->m:Ljava/lang/Object;

    .line 436
    .line 437
    const/4 v1, 0x3

    .line 438
    iput-byte v1, v11, La/sji0;->j:B
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 439
    .line 440
    move-object v1, v4

    .line 441
    const/4 v4, 0x0

    .line 442
    move-object/from16 p1, v2

    .line 443
    .line 444
    move-object/from16 v38, v16

    .line 445
    .line 446
    move-object/from16 v16, v1

    .line 447
    .line 448
    move-wide v1, v12

    .line 449
    move-object/from16 v12, v17

    .line 450
    .line 451
    move-object v13, v10

    .line 452
    move-object/from16 v17, v14

    .line 453
    .line 454
    move-object/from16 v14, v38

    .line 455
    .line 456
    move/from16 v10, v19

    .line 457
    .line 458
    :try_start_f
    invoke-virtual/range {v0 .. v11}, La/z220;->y(JLa/m97;ZDILa/zfa0;La/gwe;ILa/zje;)Ljava/io/Serializable;

    .line 459
    .line 460
    .line 461
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 462
    if-ne v0, v12, :cond_4

    .line 463
    .line 464
    goto/16 :goto_13

    .line 465
    .line 466
    :cond_4
    move-object/from16 v1, v16

    .line 467
    .line 468
    :goto_6
    :try_start_10
    check-cast v0, La/zh7;

    .line 469
    .line 470
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 471
    .line 472
    goto/16 :goto_d

    .line 473
    .line 474
    :catchall_3
    move-exception v0

    .line 475
    goto/16 :goto_c

    .line 476
    .line 477
    :catchall_4
    move-exception v0

    .line 478
    :goto_7
    move-object/from16 v1, v16

    .line 479
    .line 480
    goto/16 :goto_c

    .line 481
    .line 482
    :catchall_5
    move-exception v0

    .line 483
    move-object/from16 p1, v2

    .line 484
    .line 485
    :goto_8
    move-object v13, v10

    .line 486
    move-object/from16 v12, v17

    .line 487
    .line 488
    :goto_9
    move-object/from16 v17, v14

    .line 489
    .line 490
    move-object/from16 v14, v16

    .line 491
    .line 492
    move-object/from16 v16, v4

    .line 493
    .line 494
    goto :goto_7

    .line 495
    :catchall_6
    move-exception v0

    .line 496
    move-object/from16 p1, v2

    .line 497
    .line 498
    move-object v13, v10

    .line 499
    move-object/from16 v12, v17

    .line 500
    .line 501
    goto :goto_9

    .line 502
    :catchall_7
    move-exception v0

    .line 503
    move-object/from16 p1, v2

    .line 504
    .line 505
    move-object/from16 v18, v9

    .line 506
    .line 507
    goto :goto_8

    .line 508
    :catchall_8
    move-exception v0

    .line 509
    move-object/from16 p1, v2

    .line 510
    .line 511
    move-object/from16 v18, v6

    .line 512
    .line 513
    move-object v12, v7

    .line 514
    move-object v13, v10

    .line 515
    goto :goto_9

    .line 516
    :catchall_9
    move-exception v0

    .line 517
    move-object/from16 p1, v2

    .line 518
    .line 519
    :goto_a
    move-object/from16 v16, v4

    .line 520
    .line 521
    move-object/from16 v18, v6

    .line 522
    .line 523
    move-object v12, v7

    .line 524
    move-object v13, v10

    .line 525
    move-object/from16 v17, v14

    .line 526
    .line 527
    move-object v14, v9

    .line 528
    goto :goto_7

    .line 529
    :catchall_a
    move-exception v0

    .line 530
    move-object/from16 p1, v3

    .line 531
    .line 532
    goto :goto_a

    .line 533
    :cond_5
    move-object/from16 v17, v14

    .line 534
    .line 535
    goto/16 :goto_5

    .line 536
    .line 537
    :catchall_b
    move-exception v0

    .line 538
    move-object/from16 p1, v3

    .line 539
    .line 540
    goto :goto_a

    .line 541
    :catchall_c
    move-exception v0

    .line 542
    move-object/from16 p1, v3

    .line 543
    .line 544
    move-object/from16 v18, v6

    .line 545
    .line 546
    move-object v12, v7

    .line 547
    move-object v13, v10

    .line 548
    :goto_b
    move-object/from16 v17, v14

    .line 549
    .line 550
    move-object v14, v9

    .line 551
    move-object v1, v2

    .line 552
    goto :goto_c

    .line 553
    :catchall_d
    move-exception v0

    .line 554
    move-object/from16 p1, v3

    .line 555
    .line 556
    move-object v13, v5

    .line 557
    move-object/from16 v18, v6

    .line 558
    .line 559
    move-object v12, v7

    .line 560
    goto :goto_b

    .line 561
    :goto_c
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 562
    .line 563
    new-instance v2, La/g0g0;

    .line 564
    .line 565
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 566
    .line 567
    .line 568
    move-object v0, v2

    .line 569
    :goto_d
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    if-eqz v2, :cond_a

    .line 574
    .line 575
    instance-of v3, v2, La/zhi0;

    .line 576
    .line 577
    if-eqz v3, :cond_6

    .line 578
    .line 579
    move-object v3, v2

    .line 580
    check-cast v3, La/zhi0;

    .line 581
    .line 582
    iget-object v3, v3, La/zhi0;->c:La/kuw;

    .line 583
    .line 584
    sget-object v4, La/i2o;->H2:La/i2o;

    .line 585
    .line 586
    if-ne v3, v4, :cond_6

    .line 587
    .line 588
    sget v2, La/zyn0;->u0:I

    .line 589
    .line 590
    invoke-virtual {v15, v14}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    iget-object v2, v15, La/zyn0;->b0:La/duj;

    .line 594
    .line 595
    invoke-virtual {v2}, La/duj;->d()V

    .line 596
    .line 597
    .line 598
    goto :goto_f

    .line 599
    :cond_6
    instance-of v3, v2, Ljava/net/UnknownHostException;

    .line 600
    .line 601
    if-eqz v3, :cond_8

    .line 602
    .line 603
    sget v2, La/zyn0;->u0:I

    .line 604
    .line 605
    iget-object v3, v13, La/ocj;->a:La/p7m0;

    .line 606
    .line 607
    :cond_7
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    move-object/from16 v19, v2

    .line 615
    .line 616
    check-cast v19, La/vxn0;

    .line 617
    .line 618
    const/16 v36, 0x0

    .line 619
    .line 620
    const v37, 0x1ffcf

    .line 621
    .line 622
    .line 623
    const/16 v20, 0x0

    .line 624
    .line 625
    const/16 v21, 0x0

    .line 626
    .line 627
    const/16 v22, 0x0

    .line 628
    .line 629
    const/16 v23, 0x0

    .line 630
    .line 631
    const/16 v24, 0x0

    .line 632
    .line 633
    const/16 v25, 0x0

    .line 634
    .line 635
    const/16 v26, 0x0

    .line 636
    .line 637
    const/16 v27, 0x0

    .line 638
    .line 639
    const/16 v28, 0x0

    .line 640
    .line 641
    const/16 v29, 0x0

    .line 642
    .line 643
    const/16 v30, 0x0

    .line 644
    .line 645
    const/16 v31, 0x0

    .line 646
    .line 647
    const/16 v32, 0x0

    .line 648
    .line 649
    const/16 v33, 0x0

    .line 650
    .line 651
    const/16 v34, 0x0

    .line 652
    .line 653
    const/16 v35, 0x0

    .line 654
    .line 655
    invoke-static/range {v19 .. v37}, La/vxn0;->a(La/vxn0;La/a4x;La/a4x;ZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/he;ZZZLa/bpn0;I)La/vxn0;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    invoke-virtual {v3, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    if-eqz v2, :cond_7

    .line 664
    .line 665
    invoke-virtual {v15, v14}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    goto :goto_f

    .line 669
    :cond_8
    const/4 v4, 0x0

    .line 670
    iput-object v4, v11, La/sji0;->p:Ljava/lang/Object;

    .line 671
    .line 672
    iput-object v1, v11, La/sji0;->k:Ljava/lang/Object;

    .line 673
    .line 674
    iput-object v0, v11, La/sji0;->l:Ljava/lang/Object;

    .line 675
    .line 676
    iput-object v4, v11, La/sji0;->m:Ljava/lang/Object;

    .line 677
    .line 678
    const/4 v3, 0x4

    .line 679
    iput-byte v3, v11, La/sji0;->j:B

    .line 680
    .line 681
    sget v3, La/zyn0;->u0:I

    .line 682
    .line 683
    move-object/from16 v3, v17

    .line 684
    .line 685
    invoke-virtual {v15, v2, v1, v3, v11}, La/zyn0;->a0(Ljava/lang/Throwable;La/kka;La/bpn0;La/zje;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    if-ne v2, v12, :cond_9

    .line 690
    .line 691
    goto/16 :goto_13

    .line 692
    .line 693
    :cond_9
    :goto_e
    move-object v2, v1

    .line 694
    move-object v1, v0

    .line 695
    goto :goto_10

    .line 696
    :cond_a
    :goto_f
    move-object/from16 v3, v17

    .line 697
    .line 698
    goto :goto_e

    .line 699
    :goto_10
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 700
    .line 701
    instance-of v0, v1, La/g0g0;

    .line 702
    .line 703
    if-nez v0, :cond_10

    .line 704
    .line 705
    move-object v0, v1

    .line 706
    check-cast v0, La/zh7;

    .line 707
    .line 708
    iget-wide v4, v0, La/zh7;->a:D

    .line 709
    .line 710
    sget v6, La/zyn0;->u0:I

    .line 711
    .line 712
    iget-object v6, v13, La/ocj;->a:La/p7m0;

    .line 713
    .line 714
    :cond_b
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v7

    .line 718
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    move-object/from16 v19, v7

    .line 722
    .line 723
    check-cast v19, La/vxn0;

    .line 724
    .line 725
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    sget-object v8, La/pn40;->a:La/pn40;

    .line 729
    .line 730
    sget-object v8, La/p3u0;->c:La/p3u0;

    .line 731
    .line 732
    invoke-static {v4, v5, v8}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v29

    .line 736
    const/16 v36, 0x0

    .line 737
    .line 738
    const v37, 0x1fdff

    .line 739
    .line 740
    .line 741
    const/16 v20, 0x0

    .line 742
    .line 743
    const/16 v21, 0x0

    .line 744
    .line 745
    const/16 v22, 0x0

    .line 746
    .line 747
    const/16 v23, 0x0

    .line 748
    .line 749
    const/16 v24, 0x0

    .line 750
    .line 751
    const/16 v25, 0x0

    .line 752
    .line 753
    const/16 v26, 0x0

    .line 754
    .line 755
    const/16 v27, 0x0

    .line 756
    .line 757
    const/16 v28, 0x0

    .line 758
    .line 759
    const/16 v30, 0x0

    .line 760
    .line 761
    const/16 v31, 0x0

    .line 762
    .line 763
    const/16 v32, 0x0

    .line 764
    .line 765
    const/16 v33, 0x0

    .line 766
    .line 767
    const/16 v34, 0x0

    .line 768
    .line 769
    const/16 v35, 0x0

    .line 770
    .line 771
    invoke-static/range {v19 .. v37}, La/vxn0;->a(La/vxn0;La/a4x;La/a4x;ZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/he;ZZZLa/bpn0;I)La/vxn0;

    .line 772
    .line 773
    .line 774
    move-result-object v8

    .line 775
    invoke-virtual {v6, v7, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v7

    .line 779
    if-eqz v7, :cond_b

    .line 780
    .line 781
    iget-object v6, v15, La/zyn0;->Y:La/ilt0;

    .line 782
    .line 783
    invoke-virtual/range {v18 .. v18}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v7

    .line 787
    check-cast v7, La/jsn0;

    .line 788
    .line 789
    iget-wide v7, v7, La/jsn0;->b:J

    .line 790
    .line 791
    invoke-virtual {v6, v4, v5, v7, v8}, La/ilt0;->a(DJ)V

    .line 792
    .line 793
    .line 794
    const/4 v4, 0x0

    .line 795
    iput-object v4, v11, La/sji0;->p:Ljava/lang/Object;

    .line 796
    .line 797
    iput-object v2, v11, La/sji0;->k:Ljava/lang/Object;

    .line 798
    .line 799
    iput-object v1, v11, La/sji0;->l:Ljava/lang/Object;

    .line 800
    .line 801
    iput-object v15, v11, La/sji0;->m:Ljava/lang/Object;

    .line 802
    .line 803
    iput-object v3, v11, La/sji0;->n:Ljava/lang/Object;

    .line 804
    .line 805
    iput-object v4, v11, La/sji0;->o:Ljava/lang/Object;

    .line 806
    .line 807
    const/4 v4, 0x5

    .line 808
    iput-byte v4, v11, La/sji0;->j:B

    .line 809
    .line 810
    invoke-virtual {v15, v0, v11}, La/zyn0;->W(La/zh7;La/zje;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    if-ne v0, v12, :cond_c

    .line 815
    .line 816
    goto :goto_13

    .line 817
    :cond_c
    move-object v14, v3

    .line 818
    move-object v0, v15

    .line 819
    :goto_11
    sget v3, La/zyn0;->u0:I

    .line 820
    .line 821
    iget-object v3, v0, La/zyn0;->N:La/e41;

    .line 822
    .line 823
    iget-object v4, v0, La/zyn0;->p:La/s31;

    .line 824
    .line 825
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 826
    .line 827
    .line 828
    move-result v5

    .line 829
    if-eqz v5, :cond_e

    .line 830
    .line 831
    const/4 v6, 0x1

    .line 832
    if-ne v5, v6, :cond_d

    .line 833
    .line 834
    sget-object v5, La/aon0;->a:[La/aon0;

    .line 835
    .line 836
    const-string v5, "check"

    .line 837
    .line 838
    const/4 v7, 0x0

    .line 839
    invoke-virtual {v4, v7, v5}, La/s31;->G(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    invoke-static {v3, v5}, La/e41;->d(La/e41;Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    goto :goto_12

    .line 846
    :cond_d
    const/4 v7, 0x0

    .line 847
    invoke-static {}, La/t9f;->b()V

    .line 848
    .line 849
    .line 850
    move-object v13, v7

    .line 851
    goto :goto_15

    .line 852
    :cond_e
    const/4 v7, 0x0

    .line 853
    sget-object v5, La/aon0;->a:[La/aon0;

    .line 854
    .line 855
    const-string v5, "swipe_right"

    .line 856
    .line 857
    invoke-virtual {v4, v7, v5}, La/s31;->G(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    invoke-static {v3, v5}, La/e41;->d(La/e41;Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    :goto_12
    invoke-virtual {v0}, La/zyn0;->S()V

    .line 864
    .line 865
    .line 866
    iget-object v3, v0, La/zyn0;->c0:La/pmi0;

    .line 867
    .line 868
    invoke-static {v3}, La/pmi0;->i(La/pmi0;)V

    .line 869
    .line 870
    .line 871
    iget-object v2, v2, La/kka;->j:La/teo;

    .line 872
    .line 873
    iget-object v2, v2, La/teo;->g:Ljava/lang/String;

    .line 874
    .line 875
    iput-object v7, v11, La/sji0;->p:Ljava/lang/Object;

    .line 876
    .line 877
    iput-object v7, v11, La/sji0;->k:Ljava/lang/Object;

    .line 878
    .line 879
    iput-object v1, v11, La/sji0;->l:Ljava/lang/Object;

    .line 880
    .line 881
    iput-object v7, v11, La/sji0;->m:Ljava/lang/Object;

    .line 882
    .line 883
    iput-object v2, v11, La/sji0;->n:Ljava/lang/Object;

    .line 884
    .line 885
    iput-object v0, v11, La/sji0;->o:Ljava/lang/Object;

    .line 886
    .line 887
    const/4 v1, 0x6

    .line 888
    iput-byte v1, v11, La/sji0;->j:B

    .line 889
    .line 890
    invoke-virtual {v0, v11}, La/zyn0;->M(La/zje;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    if-ne v1, v12, :cond_f

    .line 895
    .line 896
    :goto_13
    move-object v13, v12

    .line 897
    goto :goto_15

    .line 898
    :cond_f
    :goto_14
    check-cast v1, Ljava/lang/String;

    .line 899
    .line 900
    new-instance v3, La/qxn0;

    .line 901
    .line 902
    invoke-direct {v3, v2, v1}, La/qxn0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 903
    .line 904
    .line 905
    sget v1, La/zyn0;->u0:I

    .line 906
    .line 907
    invoke-virtual {v0, v3}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 908
    .line 909
    .line 910
    :cond_10
    sget v0, La/zyn0;->u0:I

    .line 911
    .line 912
    sget-object v0, La/txn0;->a:La/txn0;

    .line 913
    .line 914
    invoke-virtual {v15, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 918
    .line 919
    :goto_15
    return-object v13

    .line 920
    :pswitch_7
    move-object v7, v13

    .line 921
    iget-object v0, v11, La/sji0;->m:Ljava/lang/Object;

    .line 922
    .line 923
    check-cast v0, La/uji0;

    .line 924
    .line 925
    sget-object v1, La/wne;->a:La/wne;

    .line 926
    .line 927
    iget-byte v4, v11, La/sji0;->j:B

    .line 928
    .line 929
    if-eqz v4, :cond_14

    .line 930
    .line 931
    const/4 v6, 0x1

    .line 932
    if-eq v4, v6, :cond_13

    .line 933
    .line 934
    const/4 v5, 0x2

    .line 935
    if-eq v4, v5, :cond_12

    .line 936
    .line 937
    const/4 v8, 0x3

    .line 938
    if-ne v4, v8, :cond_11

    .line 939
    .line 940
    iget-object v0, v11, La/sji0;->r:Ljava/lang/Object;

    .line 941
    .line 942
    check-cast v0, La/xmi0;

    .line 943
    .line 944
    iget-object v1, v11, La/sji0;->p:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v1, La/pji0;

    .line 947
    .line 948
    iget-object v2, v11, La/sji0;->o:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v2, La/nfq;

    .line 951
    .line 952
    iget-object v3, v11, La/sji0;->n:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v3, La/rji0;

    .line 955
    .line 956
    iget-object v4, v11, La/sji0;->l:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v4, La/uji0;

    .line 959
    .line 960
    iget-object v5, v11, La/sji0;->k:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v5, La/tix;

    .line 963
    .line 964
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 965
    .line 966
    .line 967
    move-object/from16 v7, p1

    .line 968
    .line 969
    move-object v6, v0

    .line 970
    move-object v0, v4

    .line 971
    goto :goto_19

    .line 972
    :cond_11
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    move-object v13, v7

    .line 976
    goto/16 :goto_1d

    .line 977
    .line 978
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 979
    .line 980
    .line 981
    move-object/from16 v2, p1

    .line 982
    .line 983
    goto :goto_17

    .line 984
    :cond_13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 985
    .line 986
    .line 987
    move-object/from16 v2, p1

    .line 988
    .line 989
    goto :goto_16

    .line 990
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    const/4 v6, 0x1

    .line 994
    iput-byte v6, v11, La/sji0;->j:B

    .line 995
    .line 996
    sget v2, La/uji0;->g:I

    .line 997
    .line 998
    invoke-virtual {v0, v11}, La/uji0;->a(La/zje;)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    if-ne v2, v1, :cond_15

    .line 1003
    .line 1004
    goto :goto_18

    .line 1005
    :cond_15
    :goto_16
    check-cast v2, Ljava/lang/Boolean;

    .line 1006
    .line 1007
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v2

    .line 1011
    if-eqz v2, :cond_1c

    .line 1012
    .line 1013
    iget-object v2, v0, La/uji0;->b:La/dgq;

    .line 1014
    .line 1015
    const/4 v5, 0x2

    .line 1016
    iput-byte v5, v11, La/sji0;->j:B

    .line 1017
    .line 1018
    sget-object v4, La/tix;->c:La/rqt;

    .line 1019
    .line 1020
    invoke-virtual {v4, v2, v11}, La/rqt;->a(La/dgq;La/zje;)Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    if-ne v2, v1, :cond_16

    .line 1025
    .line 1026
    goto :goto_18

    .line 1027
    :cond_16
    :goto_17
    move-object v5, v2

    .line 1028
    check-cast v5, La/tix;

    .line 1029
    .line 1030
    sget-object v2, La/rji0;->a:La/rji0;

    .line 1031
    .line 1032
    iget-object v4, v0, La/uji0;->a:La/nfq;

    .line 1033
    .line 1034
    check-cast v3, La/pji0;

    .line 1035
    .line 1036
    iget-object v6, v0, La/uji0;->c:La/xmi0;

    .line 1037
    .line 1038
    sget-object v7, La/nhq;->a:La/nhq;

    .line 1039
    .line 1040
    iput-object v5, v11, La/sji0;->k:Ljava/lang/Object;

    .line 1041
    .line 1042
    iput-object v0, v11, La/sji0;->l:Ljava/lang/Object;

    .line 1043
    .line 1044
    iput-object v2, v11, La/sji0;->n:Ljava/lang/Object;

    .line 1045
    .line 1046
    iput-object v4, v11, La/sji0;->o:Ljava/lang/Object;

    .line 1047
    .line 1048
    iput-object v3, v11, La/sji0;->p:Ljava/lang/Object;

    .line 1049
    .line 1050
    iput-object v6, v11, La/sji0;->r:Ljava/lang/Object;

    .line 1051
    .line 1052
    const/4 v8, 0x3

    .line 1053
    iput-byte v8, v11, La/sji0;->j:B

    .line 1054
    .line 1055
    invoke-virtual {v7, v11}, La/nhq;->b(La/zje;)Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v7

    .line 1059
    if-ne v7, v1, :cond_17

    .line 1060
    .line 1061
    :goto_18
    move-object v13, v1

    .line 1062
    goto/16 :goto_1d

    .line 1063
    .line 1064
    :cond_17
    move-object v1, v3

    .line 1065
    move-object v3, v2

    .line 1066
    move-object v2, v4

    .line 1067
    :goto_19
    check-cast v7, Ljava/util/Map;

    .line 1068
    .line 1069
    iget-object v15, v5, La/tix;->a:Ljava/lang/String;

    .line 1070
    .line 1071
    iget-object v4, v5, La/tix;->b:Ljava/lang/String;

    .line 1072
    .line 1073
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    new-instance v3, La/qji0;

    .line 1092
    .line 1093
    sget-object v5, La/uho;->b:La/uho;

    .line 1094
    .line 1095
    new-instance v8, La/xji0;

    .line 1096
    .line 1097
    iget-object v9, v1, La/pji0;->a:Ljava/lang/String;

    .line 1098
    .line 1099
    iget-object v10, v1, La/pji0;->b:Ljava/lang/String;

    .line 1100
    .line 1101
    iget v11, v1, La/pji0;->c:I

    .line 1102
    .line 1103
    iget-wide v12, v1, La/pji0;->d:J

    .line 1104
    .line 1105
    new-instance v14, La/uaj;

    .line 1106
    .line 1107
    sget-object v1, La/jki0;->b:La/jki0;

    .line 1108
    .line 1109
    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    check-cast v1, La/a8f;

    .line 1114
    .line 1115
    if-nez v1, :cond_18

    .line 1116
    .line 1117
    sget-object v1, La/taj;->b:La/taj;

    .line 1118
    .line 1119
    goto :goto_1a

    .line 1120
    :cond_18
    iget-object v1, v1, La/a8f;->a:La/qaj;

    .line 1121
    .line 1122
    invoke-virtual {v1}, La/qaj;->e()Z

    .line 1123
    .line 1124
    .line 1125
    move-result v1

    .line 1126
    if-eqz v1, :cond_19

    .line 1127
    .line 1128
    sget-object v1, La/taj;->c:La/taj;

    .line 1129
    .line 1130
    goto :goto_1a

    .line 1131
    :cond_19
    sget-object v1, La/taj;->d:La/taj;

    .line 1132
    .line 1133
    :goto_1a
    sget-object v5, La/jki0;->a:La/jki0;

    .line 1134
    .line 1135
    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v5

    .line 1139
    check-cast v5, La/a8f;

    .line 1140
    .line 1141
    if-nez v5, :cond_1a

    .line 1142
    .line 1143
    sget-object v5, La/taj;->b:La/taj;

    .line 1144
    .line 1145
    goto :goto_1b

    .line 1146
    :cond_1a
    iget-object v5, v5, La/a8f;->a:La/qaj;

    .line 1147
    .line 1148
    invoke-virtual {v5}, La/qaj;->e()Z

    .line 1149
    .line 1150
    .line 1151
    move-result v5

    .line 1152
    if-eqz v5, :cond_1b

    .line 1153
    .line 1154
    sget-object v5, La/taj;->c:La/taj;

    .line 1155
    .line 1156
    goto :goto_1b

    .line 1157
    :cond_1b
    sget-object v5, La/taj;->d:La/taj;

    .line 1158
    .line 1159
    :goto_1b
    invoke-virtual {v6}, La/xmi0;->a()D

    .line 1160
    .line 1161
    .line 1162
    move-result-wide v6

    .line 1163
    invoke-direct {v14, v1, v5, v6, v7}, La/uaj;-><init>(La/taj;La/taj;D)V

    .line 1164
    .line 1165
    .line 1166
    move-object/from16 v16, v4

    .line 1167
    .line 1168
    invoke-direct/range {v8 .. v16}, La/xji0;-><init>(Ljava/lang/String;Ljava/lang/String;IJLa/uaj;Ljava/lang/String;Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    invoke-static {v2}, La/rji0;->a(La/nfq;)La/bs3;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    invoke-direct {v3, v8, v1}, La/qji0;-><init>(La/xji0;La/bs3;)V

    .line 1176
    .line 1177
    .line 1178
    sget v1, La/uji0;->g:I

    .line 1179
    .line 1180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1181
    .line 1182
    .line 1183
    const-string v1, "FirebaseSessions"

    .line 1184
    .line 1185
    :try_start_11
    iget-object v0, v0, La/uji0;->d:La/oco;

    .line 1186
    .line 1187
    invoke-virtual {v0, v3}, La/oco;->a(La/qji0;)V

    .line 1188
    .line 1189
    .line 1190
    const-string v0, "Successfully logged Session Start event."

    .line 1191
    .line 1192
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_11
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_0

    .line 1193
    .line 1194
    .line 1195
    goto :goto_1c

    .line 1196
    :catch_0
    move-exception v0

    .line 1197
    const-string v2, "Error logging Session Start event to DataTransport: "

    .line 1198
    .line 1199
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1200
    .line 1201
    .line 1202
    :cond_1c
    :goto_1c
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1203
    .line 1204
    :goto_1d
    return-object v13

    .line 1205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
    .end packed-switch

    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    :pswitch_data_1
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
