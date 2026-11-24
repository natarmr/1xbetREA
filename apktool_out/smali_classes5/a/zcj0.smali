.class public final La/zcj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:J

.field public k:B

.field public final synthetic l:La/odj0;

.field public final synthetic m:Z


# direct methods
.method public constructor <init>(La/odj0;JZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/zcj0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/zcj0;->l:La/odj0;

    .line 5
    .line 6
    iput-wide p2, p0, La/zcj0;->j:J

    .line 7
    .line 8
    iput-boolean p4, p0, La/zcj0;->m:Z

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(La/odj0;ZLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/zcj0;->i:B

    .line 15
    iput-object p1, p0, La/zcj0;->l:La/odj0;

    iput-boolean p2, p0, La/zcj0;->m:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/zcj0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/zcj0;

    .line 7
    .line 8
    iget-object v0, p0, La/zcj0;->l:La/odj0;

    .line 9
    .line 10
    iget-boolean p0, p0, La/zcj0;->m:Z

    .line 11
    .line 12
    invoke-direct {p1, v0, p0, p2}, La/zcj0;-><init>(La/odj0;ZLa/yje;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance v1, La/zcj0;

    .line 17
    .line 18
    iget-wide v3, p0, La/zcj0;->j:J

    .line 19
    .line 20
    iget-boolean v5, p0, La/zcj0;->m:Z

    .line 21
    .line 22
    iget-object v2, p0, La/zcj0;->l:La/odj0;

    .line 23
    .line 24
    move-object v6, p2

    .line 25
    invoke-direct/range {v1 .. v6}, La/zcj0;-><init>(La/odj0;JZLa/yje;)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zcj0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zcj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zcj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zcj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zcj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zcj0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zcj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zcj0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-boolean v3, v0, La/zcj0;->m:Z

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v7, v0, La/zcj0;->k:B

    .line 18
    .line 19
    const/16 v8, 0xd

    .line 20
    .line 21
    iget-object v9, v0, La/zcj0;->l:La/odj0;

    .line 22
    .line 23
    if-eqz v7, :cond_2

    .line 24
    .line 25
    if-eq v7, v6, :cond_1

    .line 26
    .line 27
    if-ne v7, v4, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    iget-wide v6, v0, La/zcj0;->j:J

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v2, p1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, v9, La/odj0;->i0:La/x1u;

    .line 52
    .line 53
    invoke-virtual {v2}, La/x1u;->a()J

    .line 54
    .line 55
    .line 56
    move-result-wide v10

    .line 57
    new-instance v2, La/zl60;

    .line 58
    .line 59
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    const/4 v12, 0x3

    .line 64
    invoke-direct {v2, v7, v12}, La/zl60;-><init>(Ljava/lang/String;B)V

    .line 65
    .line 66
    .line 67
    iget-object v7, v9, La/odj0;->B:La/cyh;

    .line 68
    .line 69
    invoke-virtual {v7, v2}, La/cyh;->a(La/v0;)La/p5a;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v7, La/idj0;

    .line 74
    .line 75
    invoke-direct {v7, v9, v5, v6}, La/idj0;-><init>(La/odj0;La/yje;B)V

    .line 76
    .line 77
    .line 78
    new-instance v12, La/fnq;

    .line 79
    .line 80
    const/4 v13, 0x4

    .line 81
    invoke-direct {v12, v2, v7, v13}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 82
    .line 83
    .line 84
    new-instance v2, La/nv;

    .line 85
    .line 86
    invoke-direct {v2, v12, v5, v8}, La/nv;-><init>(La/fnq;La/yje;B)V

    .line 87
    .line 88
    .line 89
    new-instance v7, La/vsg0;

    .line 90
    .line 91
    invoke-direct {v7, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    iput-wide v10, v0, La/zcj0;->j:J

    .line 95
    .line 96
    iput-byte v6, v0, La/zcj0;->k:B

    .line 97
    .line 98
    invoke-static {v7, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-ne v2, v1, :cond_3

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    move-wide v6, v10

    .line 106
    :goto_0
    check-cast v2, La/ynb0;

    .line 107
    .line 108
    iget-object v10, v9, La/odj0;->l0:La/nr00;

    .line 109
    .line 110
    iput-wide v6, v0, La/zcj0;->j:J

    .line 111
    .line 112
    iput-byte v4, v0, La/zcj0;->k:B

    .line 113
    .line 114
    iget-object v4, v10, La/nr00;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, La/z220;

    .line 117
    .line 118
    invoke-virtual {v4, v3, v0, v2}, La/z220;->O(ILa/zje;La/ynb0;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-ne v0, v1, :cond_4

    .line 123
    .line 124
    :goto_1
    move-object v5, v1

    .line 125
    goto/16 :goto_4

    .line 126
    .line 127
    :cond_4
    :goto_2
    check-cast v0, La/hkd0;

    .line 128
    .line 129
    sget v1, La/odj0;->V0:I

    .line 130
    .line 131
    iget-boolean v1, v0, La/hkd0;->d:Z

    .line 132
    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    iget-object v1, v9, La/odj0;->F:La/mne;

    .line 140
    .line 141
    iget-object v13, v1, La/mne;->c:La/vs10;

    .line 142
    .line 143
    new-instance v11, La/vcj0;

    .line 144
    .line 145
    invoke-direct {v11, v9, v8}, La/vcj0;-><init>(La/odj0;B)V

    .line 146
    .line 147
    .line 148
    new-instance v14, La/bai0;

    .line 149
    .line 150
    const/16 v1, 0xc

    .line 151
    .line 152
    invoke-direct {v14, v9, v0, v5, v1}, La/bai0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 153
    .line 154
    .line 155
    const/16 v15, 0xa

    .line 156
    .line 157
    const/4 v12, 0x0

    .line 158
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    iget v1, v0, La/hkd0;->c:I

    .line 163
    .line 164
    const/4 v2, -0x1

    .line 165
    if-eq v1, v2, :cond_6

    .line 166
    .line 167
    new-instance v1, La/swp0;

    .line 168
    .line 169
    iget-object v2, v0, La/hkd0;->b:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v4, v0, La/hkd0;->a:Ljava/lang/String;

    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    invoke-direct {v1, v2, v4, v5}, La/swp0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 175
    .line 176
    .line 177
    iget-object v2, v9, La/odj0;->z:La/i1w0;

    .line 178
    .line 179
    new-instance v4, La/zlb0;

    .line 180
    .line 181
    const/16 v5, 0x1d

    .line 182
    .line 183
    invoke-direct {v4, v9, v1, v0, v5}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v4}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    invoke-virtual {v9, v3}, La/odj0;->T(Z)V

    .line 191
    .line 192
    .line 193
    :goto_3
    iget-object v0, v9, La/odj0;->r:La/s31;

    .line 194
    .line 195
    invoke-virtual {v0, v3}, La/s31;->j(Z)V

    .line 196
    .line 197
    .line 198
    iget-object v0, v9, La/i3t0;->i:La/ocj;

    .line 199
    .line 200
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 201
    .line 202
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-object v2, v0

    .line 210
    check-cast v2, La/tcj0;

    .line 211
    .line 212
    const/16 v34, -0x1

    .line 213
    .line 214
    const v35, 0x1effff

    .line 215
    .line 216
    .line 217
    const/4 v3, 0x0

    .line 218
    const/4 v4, 0x0

    .line 219
    const/4 v5, 0x0

    .line 220
    const/4 v6, 0x0

    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v8, 0x0

    .line 223
    const/4 v9, 0x0

    .line 224
    const/4 v10, 0x0

    .line 225
    const/4 v11, 0x0

    .line 226
    const/4 v12, 0x0

    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v14, 0x0

    .line 229
    const/4 v15, 0x0

    .line 230
    const/16 v16, 0x0

    .line 231
    .line 232
    const/16 v17, 0x0

    .line 233
    .line 234
    const/16 v18, 0x0

    .line 235
    .line 236
    const/16 v19, 0x0

    .line 237
    .line 238
    const/16 v20, 0x0

    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    const/16 v22, 0x0

    .line 243
    .line 244
    const/16 v23, 0x0

    .line 245
    .line 246
    const/16 v24, 0x0

    .line 247
    .line 248
    const/16 v25, 0x0

    .line 249
    .line 250
    const/16 v26, 0x0

    .line 251
    .line 252
    const/16 v27, 0x0

    .line 253
    .line 254
    const/16 v28, 0x0

    .line 255
    .line 256
    const/16 v29, 0x0

    .line 257
    .line 258
    const/16 v30, 0x0

    .line 259
    .line 260
    const/16 v31, 0x1

    .line 261
    .line 262
    const/16 v32, 0x0

    .line 263
    .line 264
    const/16 v33, 0x0

    .line 265
    .line 266
    invoke-static/range {v2 .. v35}, La/tcj0;->a(La/tcj0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZLa/hh5;ZZIII)La/tcj0;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_7

    .line 275
    .line 276
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    :goto_4
    return-object v5

    .line 279
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 280
    .line 281
    iget-byte v7, v0, La/zcj0;->k:B

    .line 282
    .line 283
    iget-object v13, v0, La/zcj0;->l:La/odj0;

    .line 284
    .line 285
    if-eqz v7, :cond_a

    .line 286
    .line 287
    if-eq v7, v6, :cond_9

    .line 288
    .line 289
    if-ne v7, v4, :cond_8

    .line 290
    .line 291
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    move-object/from16 v2, p1

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    iget-object v2, v13, La/odj0;->o0:La/nrt;

    .line 309
    .line 310
    iget-wide v7, v0, La/zcj0;->j:J

    .line 311
    .line 312
    iput-byte v6, v0, La/zcj0;->k:B

    .line 313
    .line 314
    invoke-static {v2, v7, v8, v0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    if-ne v2, v1, :cond_b

    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_b
    :goto_5
    check-cast v2, La/ql5;

    .line 322
    .line 323
    iget-object v2, v2, La/ql5;->i:La/txs0;

    .line 324
    .line 325
    invoke-virtual {v2}, La/txs0;->a()Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-nez v2, :cond_c

    .line 330
    .line 331
    iget-object v2, v13, La/odj0;->F:La/mne;

    .line 332
    .line 333
    iget-object v2, v2, La/mne;->c:La/vs10;

    .line 334
    .line 335
    new-instance v8, La/wn10;

    .line 336
    .line 337
    iget-wide v10, v0, La/zcj0;->j:J

    .line 338
    .line 339
    const/4 v12, 0x0

    .line 340
    const/16 v9, 0x10

    .line 341
    .line 342
    iget-boolean v14, v0, La/zcj0;->m:Z

    .line 343
    .line 344
    invoke-direct/range {v8 .. v14}, La/wn10;-><init>(BJLa/yje;La/diu0;Z)V

    .line 345
    .line 346
    .line 347
    iput-byte v4, v0, La/zcj0;->k:B

    .line 348
    .line 349
    invoke-static {v2, v8, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    if-ne v0, v1, :cond_d

    .line 354
    .line 355
    :goto_6
    move-object v5, v1

    .line 356
    goto :goto_8

    .line 357
    :cond_c
    new-instance v0, La/cxi0;

    .line 358
    .line 359
    const/16 v1, 0xa

    .line 360
    .line 361
    invoke-direct {v0, v1, v3}, La/cxi0;-><init>(BZ)V

    .line 362
    .line 363
    .line 364
    sget v1, La/odj0;->V0:I

    .line 365
    .line 366
    invoke-virtual {v13, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 367
    .line 368
    .line 369
    sget-object v0, La/lcj0;->a:La/lcj0;

    .line 370
    .line 371
    invoke-virtual {v13, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    :cond_d
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    :goto_8
    return-object v5

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
