.class public final La/ws6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Z

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/diu0;


# direct methods
.method public synthetic constructor <init>(La/diu0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ws6;->i:B

    iput-object p1, p0, La/ws6;->m:La/diu0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ws6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ws6;->m:La/diu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/ql5;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    check-cast p3, La/yje;

    .line 17
    .line 18
    new-instance v0, La/ws6;

    .line 19
    .line 20
    check-cast p0, La/ltr0;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, p0, p3, v1}, La/ws6;-><init>(La/diu0;La/yje;B)V

    .line 24
    .line 25
    .line 26
    iput-object p1, v0, La/ws6;->l:Ljava/lang/Object;

    .line 27
    .line 28
    iput-boolean p2, v0, La/ws6;->k:Z

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/ws6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, La/kmq;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    check-cast p3, La/yje;

    .line 46
    .line 47
    new-instance v0, La/ws6;

    .line 48
    .line 49
    check-cast p0, La/fae;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {v0, p0, p3, v1}, La/ws6;-><init>(La/diu0;La/yje;B)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, La/ws6;->l:Ljava/lang/Object;

    .line 56
    .line 57
    iput-boolean p2, v0, La/ws6;->k:Z

    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    invoke-virtual {v0, p0}, La/ws6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_1
    check-cast p1, La/ql5;

    .line 67
    .line 68
    check-cast p2, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    check-cast p3, La/yje;

    .line 75
    .line 76
    new-instance v0, La/ws6;

    .line 77
    .line 78
    check-cast p0, La/dt6;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-direct {v0, p0, p3, v1}, La/ws6;-><init>(La/diu0;La/yje;B)V

    .line 82
    .line 83
    .line 84
    iput-object p1, v0, La/ws6;->l:Ljava/lang/Object;

    .line 85
    .line 86
    iput-boolean p2, v0, La/ws6;->k:Z

    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    invoke-virtual {v0, p0}, La/ws6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ws6;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/ws6;->m:La/diu0;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v9, v4

    .line 16
    check-cast v9, La/ltr0;

    .line 17
    .line 18
    iget-object v1, v9, La/i3t0;->f:La/oyg0;

    .line 19
    .line 20
    iget-object v4, v9, La/i3t0;->i:La/ocj;

    .line 21
    .line 22
    iget-object v7, v0, La/ws6;->l:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v15, v7

    .line 25
    check-cast v15, La/ql5;

    .line 26
    .line 27
    iget-boolean v7, v0, La/ws6;->k:Z

    .line 28
    .line 29
    sget-object v8, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget-boolean v10, v0, La/ws6;->j:Z

    .line 32
    .line 33
    if-eqz v10, :cond_1

    .line 34
    .line 35
    if-ne v10, v5, :cond_0

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    sget v3, La/ltr0;->Q:I

    .line 53
    .line 54
    new-instance v3, La/efr0;

    .line 55
    .line 56
    const/4 v10, 0x6

    .line 57
    invoke-direct {v3, v10}, La/efr0;-><init>(B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v9, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-wide v10, v15, La/ql5;->a:J

    .line 64
    .line 65
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, La/ftr0;

    .line 70
    .line 71
    iget-object v3, v3, La/ftr0;->e:La/rm5;

    .line 72
    .line 73
    iget-wide v12, v3, La/rm5;->a:J

    .line 74
    .line 75
    cmp-long v3, v10, v12

    .line 76
    .line 77
    if-eqz v3, :cond_5

    .line 78
    .line 79
    iget-object v3, v9, La/ltr0;->P:La/bby;

    .line 80
    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-interface {v3, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    iget-object v3, v4, La/ocj;->a:La/p7m0;

    .line 87
    .line 88
    :cond_4
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-object/from16 v16, v10

    .line 96
    .line 97
    check-cast v16, La/ftr0;

    .line 98
    .line 99
    const/16 v21, 0x0

    .line 100
    .line 101
    const/16 v22, 0xbf

    .line 102
    .line 103
    const/16 v17, 0x0

    .line 104
    .line 105
    const/16 v18, 0x0

    .line 106
    .line 107
    const/16 v19, 0x0

    .line 108
    .line 109
    const/16 v20, 0x1

    .line 110
    .line 111
    invoke-static/range {v16 .. v22}, La/ftr0;->a(La/ftr0;La/vsr0;La/rm5;La/pur0;ZLa/jur0;I)La/ftr0;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    invoke-virtual {v3, v10, v11}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_4

    .line 120
    .line 121
    :cond_5
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, La/ftr0;

    .line 126
    .line 127
    iget-boolean v3, v3, La/ftr0;->g:Z

    .line 128
    .line 129
    if-eqz v3, :cond_8

    .line 130
    .line 131
    new-instance v3, La/a8q0;

    .line 132
    .line 133
    const-wide/16 v10, 0x0

    .line 134
    .line 135
    const/4 v12, 0x7

    .line 136
    invoke-direct {v3, v6, v10, v11, v12}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 137
    .line 138
    .line 139
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 140
    .line 141
    :goto_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-object v11, v10

    .line 149
    check-cast v11, La/ftr0;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v12, v11, La/ftr0;->f:La/pur0;

    .line 155
    .line 156
    iget-object v13, v12, La/pur0;->a:La/rjr0;

    .line 157
    .line 158
    const/16 v24, 0x0

    .line 159
    .line 160
    const/16 v25, 0xfe

    .line 161
    .line 162
    const/16 v18, 0x0

    .line 163
    .line 164
    const/16 v19, 0x0

    .line 165
    .line 166
    const/16 v20, 0x0

    .line 167
    .line 168
    const/16 v21, 0x0

    .line 169
    .line 170
    const/16 v22, 0x0

    .line 171
    .line 172
    const/16 v23, 0x0

    .line 173
    .line 174
    move-object/from16 v17, v3

    .line 175
    .line 176
    move-object/from16 v16, v13

    .line 177
    .line 178
    invoke-static/range {v16 .. v25}, La/rjr0;->a(La/rjr0;La/a8q0;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZZI)La/rjr0;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    move-object/from16 v13, v17

    .line 183
    .line 184
    invoke-static {v12, v3, v6, v2}, La/pur0;->a(La/pur0;La/rjr0;Ljava/lang/String;I)La/pur0;

    .line 185
    .line 186
    .line 187
    move-result-object v19

    .line 188
    const/16 v22, 0xdf

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    const/16 v20, 0x0

    .line 193
    .line 194
    move-object/from16 v16, v11

    .line 195
    .line 196
    invoke-static/range {v16 .. v22}, La/ftr0;->a(La/ftr0;La/vsr0;La/rm5;La/pur0;ZLa/jur0;I)La/ftr0;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v4, v10, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_7

    .line 205
    .line 206
    iput-object v15, v0, La/ws6;->l:Ljava/lang/Object;

    .line 207
    .line 208
    iput-boolean v7, v0, La/ws6;->k:Z

    .line 209
    .line 210
    iput-boolean v5, v0, La/ws6;->j:Z

    .line 211
    .line 212
    invoke-virtual {v9, v15, v0}, La/ltr0;->P(La/ql5;La/zje;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-ne v0, v8, :cond_6

    .line 217
    .line 218
    move-object v6, v8

    .line 219
    goto :goto_3

    .line 220
    :cond_6
    :goto_1
    if-eqz v7, :cond_8

    .line 221
    .line 222
    sget v0, La/ltr0;->Q:I

    .line 223
    .line 224
    new-instance v7, La/mjr0;

    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const/16 v14, 0xf

    .line 228
    .line 229
    const/4 v8, 0x1

    .line 230
    const-class v10, La/ltr0;

    .line 231
    .line 232
    const-string v11, "handleError"

    .line 233
    .line 234
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 235
    .line 236
    invoke-direct/range {v7 .. v14}, La/mjr0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 237
    .line 238
    .line 239
    new-instance v0, La/am4;

    .line 240
    .line 241
    invoke-direct {v0, v9, v15, v6}, La/am4;-><init>(La/ltr0;La/ql5;La/yje;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v9, v6, v7, v0, v5}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iput-object v0, v9, La/ltr0;->P:La/bby;

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_7
    move-object v3, v13

    .line 252
    goto :goto_0

    .line 253
    :cond_8
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    :goto_3
    return-object v6

    .line 256
    :pswitch_0
    iget-object v1, v0, La/ws6;->l:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v1, La/kmq;

    .line 259
    .line 260
    iget-boolean v2, v0, La/ws6;->k:Z

    .line 261
    .line 262
    sget-object v7, La/wne;->a:La/wne;

    .line 263
    .line 264
    iget-boolean v8, v0, La/ws6;->j:Z

    .line 265
    .line 266
    if-eqz v8, :cond_a

    .line 267
    .line 268
    if-ne v8, v5, :cond_9

    .line 269
    .line 270
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    if-nez v2, :cond_b

    .line 282
    .line 283
    check-cast v4, La/fae;

    .line 284
    .line 285
    iget-object v3, v4, La/fae;->s:La/vpc;

    .line 286
    .line 287
    iget-object v3, v3, La/vpc;->a:La/g45;

    .line 288
    .line 289
    iget-object v4, v3, La/g45;->b:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v4, La/vae;

    .line 292
    .line 293
    iget-object v4, v4, La/vae;->g:La/qoj0;

    .line 294
    .line 295
    new-instance v8, La/w7e;

    .line 296
    .line 297
    invoke-direct {v8, v4, v3, v5}, La/w7e;-><init>(La/qoj0;La/g45;B)V

    .line 298
    .line 299
    .line 300
    iput-object v6, v0, La/ws6;->l:Ljava/lang/Object;

    .line 301
    .line 302
    iput-boolean v2, v0, La/ws6;->k:Z

    .line 303
    .line 304
    iput-boolean v5, v0, La/ws6;->j:Z

    .line 305
    .line 306
    invoke-static {v1, v8, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-ne v0, v7, :cond_b

    .line 311
    .line 312
    move-object v6, v7

    .line 313
    goto :goto_5

    .line 314
    :cond_b
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    :goto_5
    return-object v6

    .line 317
    :pswitch_1
    move-object v9, v4

    .line 318
    check-cast v9, La/dt6;

    .line 319
    .line 320
    iget-object v1, v9, La/i3t0;->f:La/oyg0;

    .line 321
    .line 322
    iget-object v4, v9, La/i3t0;->i:La/ocj;

    .line 323
    .line 324
    iget-object v15, v9, La/dt6;->V:La/mne;

    .line 325
    .line 326
    iget-object v7, v0, La/ws6;->l:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v7, La/ql5;

    .line 329
    .line 330
    iget-boolean v8, v0, La/ws6;->k:Z

    .line 331
    .line 332
    sget-object v10, La/wne;->a:La/wne;

    .line 333
    .line 334
    iget-boolean v11, v0, La/ws6;->j:Z

    .line 335
    .line 336
    if-eqz v11, :cond_d

    .line 337
    .line 338
    if-ne v11, v5, :cond_c

    .line 339
    .line 340
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_8

    .line 348
    .line 349
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    sget v3, La/dt6;->e0:I

    .line 353
    .line 354
    sget-object v3, La/db20;->a:La/db20;

    .line 355
    .line 356
    invoke-virtual {v9, v3}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    new-instance v3, La/os6;

    .line 360
    .line 361
    const/4 v11, 0x0

    .line 362
    invoke-direct {v3, v11}, La/os6;-><init>(B)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v9, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 366
    .line 367
    .line 368
    iput-object v7, v0, La/ws6;->l:Ljava/lang/Object;

    .line 369
    .line 370
    iput-boolean v8, v0, La/ws6;->k:Z

    .line 371
    .line 372
    iput-boolean v5, v0, La/ws6;->j:Z

    .line 373
    .line 374
    invoke-virtual {v9, v7, v0}, La/dt6;->Y(La/ql5;La/zje;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    if-ne v0, v10, :cond_e

    .line 379
    .line 380
    move-object v6, v10

    .line 381
    goto/16 :goto_8

    .line 382
    .line 383
    :cond_e
    :goto_6
    sget v0, La/dt6;->e0:I

    .line 384
    .line 385
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 386
    .line 387
    .line 388
    move-result-object v16

    .line 389
    iget-object v0, v15, La/mne;->a:La/rwj;

    .line 390
    .line 391
    sget-object v17, La/us6;->a:La/us6;

    .line 392
    .line 393
    new-instance v3, La/xw5;

    .line 394
    .line 395
    const/16 v10, 0xd

    .line 396
    .line 397
    invoke-direct {v3, v9, v7, v6, v10}, La/xw5;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 398
    .line 399
    .line 400
    const/16 v21, 0xa

    .line 401
    .line 402
    const/16 v18, 0x0

    .line 403
    .line 404
    move-object/from16 v19, v0

    .line 405
    .line 406
    move-object/from16 v20, v3

    .line 407
    .line 408
    invoke-static/range {v16 .. v21}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 409
    .line 410
    .line 411
    iget-object v0, v4, La/ocj;->a:La/p7m0;

    .line 412
    .line 413
    :cond_f
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    move-object/from16 v16, v3

    .line 421
    .line 422
    check-cast v16, La/c820;

    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    const/16 v27, 0x0

    .line 428
    .line 429
    const/16 v28, 0x1bff

    .line 430
    .line 431
    const/16 v17, 0x0

    .line 432
    .line 433
    const/16 v18, 0x0

    .line 434
    .line 435
    const/16 v19, 0x0

    .line 436
    .line 437
    const/16 v20, 0x0

    .line 438
    .line 439
    const/16 v21, 0x0

    .line 440
    .line 441
    const/16 v22, 0x0

    .line 442
    .line 443
    const/16 v23, 0x0

    .line 444
    .line 445
    const/16 v24, 0x0

    .line 446
    .line 447
    const/16 v25, 0x0

    .line 448
    .line 449
    const/16 v26, 0x1

    .line 450
    .line 451
    invoke-static/range {v16 .. v28}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 452
    .line 453
    .line 454
    move-result-object v10

    .line 455
    invoke-virtual {v0, v3, v10}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    if-eqz v3, :cond_f

    .line 460
    .line 461
    iget-object v0, v9, La/dt6;->Z:La/c4m0;

    .line 462
    .line 463
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 464
    .line 465
    .line 466
    iget-object v0, v9, La/dt6;->w:La/yfu;

    .line 467
    .line 468
    invoke-virtual {v0}, La/yfu;->d()La/vae0;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    new-instance v1, La/os6;

    .line 473
    .line 474
    invoke-direct {v1, v5}, La/os6;-><init>(B)V

    .line 475
    .line 476
    .line 477
    sget-object v3, La/i120;->f:La/eoh0;

    .line 478
    .line 479
    invoke-static {v2, v1}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    invoke-static {v0, v3, v1}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    new-instance v1, La/ex1;

    .line 487
    .line 488
    const/16 v2, 0xb

    .line 489
    .line 490
    invoke-direct {v1, v9, v7, v6, v2}, La/ex1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 491
    .line 492
    .line 493
    new-instance v2, La/fnq;

    .line 494
    .line 495
    const/4 v3, 0x4

    .line 496
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 497
    .line 498
    .line 499
    new-instance v7, La/vp3;

    .line 500
    .line 501
    const/4 v13, 0x4

    .line 502
    const/16 v14, 0x1a

    .line 503
    .line 504
    move v0, v8

    .line 505
    const/4 v8, 0x2

    .line 506
    const-class v10, La/dt6;

    .line 507
    .line 508
    const-string v11, "handleError"

    .line 509
    .line 510
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 511
    .line 512
    move v3, v0

    .line 513
    invoke-direct/range {v7 .. v14}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 514
    .line 515
    .line 516
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    iget-object v1, v15, La/mne;->b:La/dvj;

    .line 521
    .line 522
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-static {v2, v0, v7}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    iput-object v0, v9, La/dt6;->Z:La/c4m0;

    .line 531
    .line 532
    if-eqz v3, :cond_12

    .line 533
    .line 534
    iget-object v0, v4, La/ocj;->a:La/p7m0;

    .line 535
    .line 536
    :cond_10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    move-object v7, v1

    .line 544
    check-cast v7, La/c820;

    .line 545
    .line 546
    iget-object v8, v7, La/c820;->e:La/jfc0;

    .line 547
    .line 548
    if-eqz v8, :cond_11

    .line 549
    .line 550
    sget-object v2, La/wyc0;->a:La/wyc0;

    .line 551
    .line 552
    const/4 v12, 0x0

    .line 553
    const/16 v13, 0x1d

    .line 554
    .line 555
    const/4 v9, 0x0

    .line 556
    const/4 v10, 0x0

    .line 557
    const/4 v11, 0x0

    .line 558
    invoke-static/range {v8 .. v13}, La/jfc0;->a(La/jfc0;La/azc0;La/rlc0;ZZI)La/jfc0;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    move-object v12, v2

    .line 563
    goto :goto_7

    .line 564
    :cond_11
    move-object v12, v6

    .line 565
    :goto_7
    const/16 v18, 0x0

    .line 566
    .line 567
    const/16 v19, 0x1fef

    .line 568
    .line 569
    const/4 v8, 0x0

    .line 570
    const/4 v9, 0x0

    .line 571
    const/4 v10, 0x0

    .line 572
    const/4 v11, 0x0

    .line 573
    const/4 v13, 0x0

    .line 574
    const/4 v14, 0x0

    .line 575
    const/4 v15, 0x0

    .line 576
    const/16 v16, 0x0

    .line 577
    .line 578
    const/16 v17, 0x0

    .line 579
    .line 580
    invoke-static/range {v7 .. v19}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    if-eqz v1, :cond_10

    .line 589
    .line 590
    :cond_12
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 591
    .line 592
    :goto_8
    return-object v6

    .line 593
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
